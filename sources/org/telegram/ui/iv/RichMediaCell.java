package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

/* loaded from: classes3.dex */
public class RichMediaCell extends FrameLayout implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    private final Paint backgroundPaint;
    private final View clickView;
    private BlockRow currentRow;
    private Delegate delegate;
    private final ImageReceiver imageReceiver;
    private final Drawable placeholderIcon;
    private final RadialProgress2 radialProgress;
    private final Theme.ResourcesProvider resourcesProvider;
    private final Paint selectionPaint;
    private Layout stubLayout;
    private final TextPaint stubPaint;

    public interface Delegate {
        TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper();

        void onMediaPick(BlockRow blockRow);
    }

    public RichMediaCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.backgroundPaint = new Paint(1);
        this.selectionPaint = new Paint(1);
        TextPaint textPaint = new TextPaint();
        this.stubPaint = textPaint;
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        textPaint.setTextSize(1.0f);
        this.imageReceiver = new ImageReceiver(this);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, resourcesProvider);
        this.radialProgress = radialProgress2;
        radialProgress2.setProgressColor(-1);
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        radialProgress2.setIcon(3, false, false);
        this.placeholderIcon = getContext().getResources().getDrawable(R.drawable.msg_filled_data_photos).mutate();
        setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(4.0f));
        View view = new View(context);
        this.clickView = view;
        view.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichMediaCell$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RichMediaCell.this.lambda$new$0(view2);
            }
        });
        addView(view, LayoutHelper.createFrame(-1, -1, 119));
        updateColors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        MediaUploadState mediaUploadState;
        Delegate delegate;
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || (mediaUploadState = blockRow.media) == null || mediaUploadState.state != 0 || (delegate = this.delegate) == null) {
            return;
        }
        delegate.onMediaPick(blockRow);
    }

    public void bind(BlockRow blockRow, Delegate delegate) {
        this.currentRow = blockRow;
        this.delegate = delegate;
        if (blockRow != null && blockRow.media == null) {
            blockRow.media = new MediaUploadState();
        }
        applyMediaToImageReceiver();
        requestLayout();
        invalidate();
    }

    public BlockRow getRow() {
        return this.currentRow;
    }

    private void applyMediaToImageReceiver() {
        MediaUploadState mediaUploadState;
        TLRPC.Photo photo;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        TLRPC.Document document;
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || (mediaUploadState = blockRow.media) == null) {
            this.imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x);
        sb.append("_");
        sb.append(AndroidUtilities.dp(200.0f));
        String sb2 = sb.toString();
        BitmapDrawable bitmapDrawable = mediaUploadState.localThumbBitmap != null ? new BitmapDrawable(getResources(), mediaUploadState.localThumbBitmap) : null;
        if (mediaUploadState.isVideo) {
            String str = mediaUploadState.localPath;
            ImageLocation forVideoPath = str != null ? ImageLocation.getForVideoPath(str) : null;
            if (!mediaUploadState.isReady() || (document = mediaUploadState.document) == null) {
                imageLocation = null;
                imageLocation2 = null;
            } else {
                TLRPC.PhotoSize pickNonStrippedClosest = pickNonStrippedClosest(document.thumbs, AndroidUtilities.getPhotoSize());
                TLRPC.PhotoSize pickStripped = pickStripped(mediaUploadState.document.thumbs);
                imageLocation = ImageLocation.getForDocument(pickNonStrippedClosest, mediaUploadState.document);
                imageLocation2 = ImageLocation.getForDocument(pickStripped, mediaUploadState.document);
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("RichMediaCell.applyMedia VIDEO mediaLoc=");
            sb3.append(forVideoPath != null);
            sb3.append(" imageLoc=");
            sb3.append(imageLocation != null);
            sb3.append(" thumbLoc=");
            sb3.append(imageLocation2 != null);
            sb3.append(" localBitmap=");
            sb3.append(bitmapDrawable != null);
            sb3.append(" path=");
            sb3.append(mediaUploadState.localPath);
            Log.d("RICHED", sb3.toString());
            this.imageReceiver.setImage(forVideoPath, ImageLoader.AUTOPLAY_FILTER, imageLocation, sb2, imageLocation2, sb2, bitmapDrawable, 0L, null, mediaUploadState.document, 0);
            return;
        }
        if (mediaUploadState.isReady() && (photo = mediaUploadState.photo) != null) {
            this.imageReceiver.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize()), mediaUploadState.photo), sb2, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(mediaUploadState.photo.sizes, 100), mediaUploadState.photo), sb2, null, 0L, null, mediaUploadState.photo, 0);
            return;
        }
        if (mediaUploadState.localPath != null) {
            Log.d("RICHED", "RichMediaCell.applyMedia PHOTO preview path=" + mediaUploadState.localPath);
            this.imageReceiver.setImage(ImageLocation.getForPath(mediaUploadState.localPath), sb2, null, null, null, 0);
            return;
        }
        this.imageReceiver.setImageBitmap((Drawable) null);
    }

    private static TLRPC.PhotoSize pickNonStrippedClosest(ArrayList arrayList, int i) {
        int abs;
        TLRPC.PhotoSize photoSize = null;
        if (arrayList == null) {
            return null;
        }
        int i2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) arrayList.get(i3);
            if (!(photoSize2 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize2 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize2.w, photoSize2.h) - i)) < i2) {
                photoSize = photoSize2;
                i2 = abs;
            }
        }
        return photoSize;
    }

    private static TLRPC.PhotoSize pickStripped(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof TLRPC.TL_photoStrippedSize) {
                return (TLRPC.PhotoSize) arrayList.get(i);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
        applyMediaToImageReceiver();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageReceiver.onDetachedFromWindow();
    }

    @Override // org.telegram.ui.ActionBar.Theme.Colorable
    public void updateColors() {
        this.backgroundPaint.setColor(Theme.getColor(Theme.key_chat_inFileBackground, this.resourcesProvider));
        this.selectionPaint.setColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, this.resourcesProvider));
        this.placeholderIcon.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), 0.5f), PorterDuff.Mode.SRC_IN));
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        MediaUploadState mediaUploadState;
        int size = View.MeasureSpec.getSize(i);
        int dp = AndroidUtilities.dp(200.0f);
        BlockRow blockRow = this.currentRow;
        if (blockRow != null && (mediaUploadState = blockRow.media) != null && mediaUploadState.width > 0 && mediaUploadState.height > 0) {
            long dp2 = size - AndroidUtilities.dp(32.0f);
            MediaUploadState mediaUploadState2 = this.currentRow.media;
            dp = Math.max(Math.min((int) ((dp2 * mediaUploadState2.height) / mediaUploadState2.width), AndroidUtilities.dp(420.0f)), AndroidUtilities.dp(120.0f)) + getPaddingTop() + getPaddingBottom();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.imageReceiver.setImageCoords(0.0f, getPaddingTop(), i5, (i6 - getPaddingTop()) - getPaddingBottom());
        int dp = AndroidUtilities.dp(48.0f);
        this.radialProgress.setProgressRect((i5 - dp) / 2, (i6 - dp) / 2, (i5 + dp) / 2, (i6 + dp) / 2);
        applyMediaToImageReceiver();
    }

    private boolean isCellSelected() {
        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
        int childAdapterPosition;
        Delegate delegate = this.delegate;
        return delegate != null && (selectionHelper = delegate.getSelectionHelper()) != null && selectionHelper.isInSelectionMode() && (getParent() instanceof RecyclerView) && (childAdapterPosition = ((RecyclerView) getParent()).getChildAdapterPosition(this)) >= 0 && childAdapterPosition >= selectionHelper.getStartCell() && childAdapterPosition <= selectionHelper.getEndCell();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        BlockRow blockRow = this.currentRow;
        MediaUploadState mediaUploadState = blockRow != null ? blockRow.media : null;
        if (mediaUploadState == null || (mediaUploadState.localPath == null && !mediaUploadState.isReady())) {
            canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.backgroundPaint);
            int dp = AndroidUtilities.dp(48.0f);
            int measuredWidth = (getMeasuredWidth() - dp) / 2;
            int i = (measuredHeight - dp) / 2;
            this.placeholderIcon.setBounds(measuredWidth, i, measuredWidth + dp, dp + i);
            this.placeholderIcon.draw(canvas);
        } else {
            this.imageReceiver.draw(canvas);
        }
        if (mediaUploadState != null && mediaUploadState.isPending()) {
            this.radialProgress.setProgress(mediaUploadState.progress, true);
            this.radialProgress.draw(canvas);
        }
        if (isCellSelected()) {
            canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.selectionPaint);
        }
    }

    @Override // org.telegram.ui.Cells.TextSelectionHelper.ArticleSelectableView
    public void fillTextLayoutBlocks(ArrayList arrayList) {
        if (this.stubLayout == null) {
            this.stubLayout = new StaticLayout("•", this.stubPaint, Math.max(1, getMeasuredWidth()), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        final Layout layout = this.stubLayout;
        arrayList.add(new TextSelectionHelper.TextLayoutBlock() { // from class: org.telegram.ui.iv.RichMediaCell.1
            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public /* synthetic */ CharSequence getPrefix() {
                return TextSelectionHelper.TextLayoutBlock.-CC.$default$getPrefix(this);
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public int getRow() {
                return 0;
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public int getX() {
                return 0;
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public int getY() {
                return 0;
            }

            @Override // org.telegram.ui.Cells.TextSelectionHelper.TextLayoutBlock
            public Layout getLayout() {
                return layout;
            }
        });
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.stubLayout = null;
    }

    public static final class Factory extends UItem.UItemFactory {
        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public boolean isClickable() {
            return false;
        }

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public RichMediaCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new RichMediaCell(context, resourcesProvider);
        }

        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichMediaCell) view).bind((BlockRow) uItem.object, (Delegate) uItem.object2);
        }

        public static UItem of(BlockRow blockRow, Delegate delegate) {
            UItem ofFactory = UItem.ofFactory(Factory.class);
            ofFactory.object = blockRow;
            ofFactory.object2 = delegate;
            return ofFactory;
        }
    }
}
