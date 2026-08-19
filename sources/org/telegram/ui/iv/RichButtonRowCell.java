package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.iv.RichButtonRowCell;
import org.telegram.ui.iv.RichEditor;

/* loaded from: classes3.dex */
public class RichButtonRowCell extends RichBlockCell implements Theme.Colorable {
    private final RichEditor.Button addButton;
    private final ArrayList buttonViews;
    private final LinearLayout buttonsLayout;
    private final int currentAccount;
    private Delegate delegate;
    private final TextView emptyAddButton;
    private final Theme.ResourcesProvider resourcesProvider;
    private final HorizontalScrollView scrollView;

    public interface Delegate {
        void onAddButton(BlockRow blockRow, View view);

        void onCycleButtonStyle(BlockRow blockRow, int i);

        void onEditButton(BlockRow blockRow, int i, View view);
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return Theme.Colorable.-CC.$default$getColorKeys(this);
    }

    public RichButtonRowCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.buttonViews = new ArrayList();
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        setBlockPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.scrollView = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.buttonsLayout = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, LayoutHelper.createFrame(-1, -1, 23));
        RichEditor.Button roundRadius = new RichEditor.Button(context, R.drawable.msg_add, resourcesProvider).setRoundRadius(19);
        this.addButton = roundRadius;
        roundRadius.setSelected(true);
        roundRadius.setContentDescription(LocaleController.getString(R.string.Add));
        roundRadius.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichButtonRowCell$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RichButtonRowCell.$r8$lambda$sweDzUk5wK9QxbZ-kD2jEfSKnmk(RichButtonRowCell.this, view);
            }
        });
        addView(roundRadius, LayoutHelper.createFrame(38, 38, 21));
        TextView textView = new TextView(context);
        this.emptyAddButton = textView;
        textView.setText(LocaleController.getString(R.string.RichEditorAddButton));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(7.0f));
        textView.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.iv.RichButtonRowCell$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RichButtonRowCell.$r8$lambda$yqOYnXk5V_ceV8BUTZkkcNPBCL8(RichButtonRowCell.this, view);
            }
        });
        addView(textView, LayoutHelper.createFrame(-2, 38, 17));
        updateAddButtonColors();
    }

    public static /* synthetic */ void $r8$lambda$sweDzUk5wK9QxbZ-kD2jEfSKnmk(RichButtonRowCell richButtonRowCell, View view) {
        BlockRow blockRow;
        Delegate delegate = richButtonRowCell.delegate;
        if (delegate == null || (blockRow = richButtonRowCell.currentRow) == null) {
            return;
        }
        delegate.onAddButton(blockRow, view);
    }

    public static /* synthetic */ void $r8$lambda$yqOYnXk5V_ceV8BUTZkkcNPBCL8(RichButtonRowCell richButtonRowCell, View view) {
        BlockRow blockRow;
        Delegate delegate = richButtonRowCell.delegate;
        if (delegate == null || (blockRow = richButtonRowCell.currentRow) == null) {
            return;
        }
        delegate.onAddButton(blockRow, view);
    }

    public void bind(BlockRow blockRow, Delegate delegate) {
        this.currentRow = blockRow;
        this.delegate = delegate;
        bindBlockInset(blockRow);
        rebuildButtons();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void rebuildButtons() {
        TL_iv.pageBlockButtonRow pageblockbuttonrow;
        int size;
        int i;
        ArrayList<TL_keyboard.PageButton> arrayList;
        this.buttonsLayout.removeAllViews();
        this.buttonViews.clear();
        BlockRow blockRow = this.currentRow;
        if (blockRow != null) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                size = (pageblockbuttonrow != null || (arrayList = pageblockbuttonrow.buttons) == null) ? 0 : arrayList.size();
                i = 0;
                while (i < size) {
                    ButtonView buttonView = new ButtonView(getContext(), pageblockbuttonrow.buttons.get(i), i);
                    this.buttonViews.add(buttonView);
                    this.buttonsLayout.addView(buttonView, LayoutHelper.createLinear(-2, -1, 16, i == 0 ? 0 : 7, 0, 0, 0));
                    i++;
                }
                boolean z = size >= 8;
                this.scrollView.setVisibility(size <= 0 ? 0 : 8);
                this.emptyAddButton.setVisibility(size != 0 ? 0 : 8);
                this.addButton.setVisibility((size > 0 || !z) ? 8 : 0);
                requestLayout();
            }
        }
        pageblockbuttonrow = null;
        if (pageblockbuttonrow != null) {
        }
        i = 0;
        while (i < size) {
        }
        if (size >= 8) {
        }
        this.scrollView.setVisibility(size <= 0 ? 0 : 8);
        this.emptyAddButton.setVisibility(size != 0 ? 0 : 8);
        this.addButton.setVisibility((size > 0 || !z) ? 8 : 0);
        requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.Theme.Colorable
    public void updateColors() {
        this.addButton.updateColors();
        updateAddButtonColors();
        rebuildButtons();
    }

    private void updateAddButtonColors() {
        int color = Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider);
        int blendOver = Theme.blendOver(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider), Theme.multAlpha(color, 0.1f));
        this.emptyAddButton.setTextColor(color);
        this.emptyAddButton.setBackground(Theme.createRadSelectorDrawable(blendOver, Theme.multAlpha(color, 0.16f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_add).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        this.emptyAddButton.setCompoundDrawablesRelativeWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int dp;
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.buttonViews.size();
        int dp2 = (size2 <= 0 || size2 >= 8) ? 0 : AndroidUtilities.dp(45.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.scrollView.getLayoutParams();
        if (layoutParams.rightMargin != dp2) {
            layoutParams.rightMargin = dp2;
            this.scrollView.setLayoutParams(layoutParams);
        }
        if (size2 > 0) {
            layoutButtonWidths(Math.max(0, ((size - getPaddingLeft()) - getPaddingRight()) - dp2));
        }
        if (size2 > 0) {
            dp = ((ButtonView) this.buttonViews.get(0)).getContentHeight();
        } else {
            dp = AndroidUtilities.dp(SharedConfig.fontSize + 18) + AndroidUtilities.dp(8.0f);
        }
        int paddingTop = getPaddingTop() + dp + getPaddingBottom();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingTop, TLObject.FLAG_30));
        setMeasuredDimension(size, paddingTop);
    }

    private void layoutButtonWidths(int i) {
        int size = this.buttonViews.size();
        if (size == 0) {
            return;
        }
        int max = Math.max(0, i - (AndroidUtilities.dp(7.0f) * (size - 1)));
        int[] iArr = new int[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int preferredWidth = ((ButtonView) this.buttonViews.get(i3)).getPreferredWidth();
            iArr[i3] = preferredWidth;
            i2 += preferredWidth;
        }
        if (i2 <= max) {
            stretchWidths(iArr, max);
        } else {
            squeezeWidths(iArr, max, i2);
        }
        for (int i4 = 0; i4 < size; i4++) {
            ((ButtonView) this.buttonViews.get(i4)).setButtonWidth(iArr[i4]);
        }
    }

    private void stretchWidths(int[] iArr, int i) {
        int i2;
        boolean[] zArr = new boolean[iArr.length];
        int length = iArr.length;
        boolean z = true;
        while (true) {
            boolean z2 = false;
            if (!z || length <= 0) {
                break;
            }
            int i3 = i / length;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                if (!zArr[i4] && (i2 = iArr[i4]) > i3) {
                    zArr[i4] = true;
                    i -= i2;
                    length--;
                    z2 = true;
                }
            }
            z = z2;
        }
        if (length <= 0) {
            return;
        }
        int i5 = i / length;
        int i6 = i - (length * i5);
        for (int i7 = 0; i7 < iArr.length; i7++) {
            if (!zArr[i7]) {
                int i8 = i6 - 1;
                iArr[i7] = (i6 > 0 ? 1 : 0) + i5;
                i6 = i8;
            }
        }
    }

    private void squeezeWidths(int[] iArr, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            i4 += iArr[i5] - ((ButtonView) this.buttonViews.get(i5)).getMinWidth();
        }
        if (i4 <= 0) {
            while (i3 < iArr.length) {
                iArr[i3] = ((ButtonView) this.buttonViews.get(i3)).getMinWidth();
                i3++;
            }
            return;
        }
        int min = Math.min(i2 - i, i4);
        int i6 = 0;
        while (i3 < iArr.length) {
            int minWidth = iArr[i3] - ((ButtonView) this.buttonViews.get(i3)).getMinWidth();
            int min2 = Math.min(i3 == iArr.length + (-1) ? min - i6 : (int) ((min * minWidth) / i4), minWidth);
            iArr[i3] = iArr[i3] - min2;
            i6 += min2;
            i3++;
        }
    }

    public boolean isPressOnButton(float f, float f2) {
        getLocationOnScreen(new int[2]);
        float f3 = r0[0] + f;
        float f4 = r0[1] + f2;
        if (isPointInside(this.addButton, f3, f4) || isPointInside(this.emptyAddButton, f3, f4)) {
            return true;
        }
        ArrayList arrayList = this.buttonViews;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (isPointInside((ButtonView) obj, f3, f4)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPointInside(View view, float f, float f2) {
        if (view.getVisibility() != 0) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (f >= iArr[0] && f <= r2 + view.getWidth()) {
            if (f2 >= iArr[1] && f2 <= r0 + view.getHeight()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ButtonView extends View {
        private final RichMessageLayout.RichButton button;
        private final int index;
        private final Runnable longPressRunnable;
        private boolean longPressed;
        private boolean pressed;

        ButtonView(Context context, TL_keyboard.PageButton pageButton, final int i) {
            super(context);
            this.index = i;
            RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(RichButtonRowCell.this.currentAccount, Math.max(AndroidUtilities.dp(240.0f), AndroidUtilities.displaySize.x - AndroidUtilities.dp(32.0f)), RichButtonRowCell.this.resourcesProvider, pageButton, new Runnable() { // from class: org.telegram.ui.iv.RichButtonRowCell$ButtonView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RichButtonRowCell.ButtonView.this.invalidate();
                }
            });
            this.button = createEditorPageButton;
            this.longPressRunnable = new Runnable() { // from class: org.telegram.ui.iv.RichButtonRowCell$ButtonView$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    RichButtonRowCell.ButtonView.$r8$lambda$b7cj_jUEwaI9wsHrlDuwlez8f4w(RichButtonRowCell.ButtonView.this, i);
                }
            };
            createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
            setContentDescription(RichTextStyle.plainOf(pageButton.text));
            setClickable(true);
            setLongClickable(true);
        }

        public static /* synthetic */ void $r8$lambda$b7cj_jUEwaI9wsHrlDuwlez8f4w(ButtonView buttonView, int i) {
            if (!buttonView.pressed || RichButtonRowCell.this.delegate == null || RichButtonRowCell.this.currentRow == null) {
                return;
            }
            buttonView.longPressed = true;
            buttonView.button.setPressed(false);
            try {
                buttonView.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            RichButtonRowCell.this.delegate.onEditButton(RichButtonRowCell.this.currentRow, i, buttonView);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(this.button.width, getContentHeight());
        }

        int getContentHeight() {
            return this.button.getHeight() + AndroidUtilities.dp(8.0f);
        }

        int getPreferredWidth() {
            return Math.max(AndroidUtilities.dp(34.0f), this.button.getPreferredWidth());
        }

        int getMinWidth() {
            return Math.max(AndroidUtilities.dp(34.0f), this.button.getMinWidth());
        }

        void setButtonWidth(int i) {
            this.button.width = Math.max(AndroidUtilities.dp(34.0f), i);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
            if (layoutParams != null) {
                int i2 = layoutParams.width;
                int i3 = this.button.width;
                if (i2 != i3) {
                    layoutParams.width = i3;
                    setLayoutParams(layoutParams);
                }
            }
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.save();
            canvas.translate(0.0f, (getHeight() - this.button.getHeight()) / 2.0f);
            this.button.draw(canvas);
            canvas.restore();
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.pressed = true;
                this.longPressed = false;
                this.button.setPressed(true);
                AndroidUtilities.runOnUIThread(this.longPressRunnable, ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (actionMasked == 1) {
                boolean z = this.pressed && !this.longPressed;
                this.pressed = false;
                this.button.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
                if (z && RichButtonRowCell.this.delegate != null) {
                    RichButtonRowCell richButtonRowCell = RichButtonRowCell.this;
                    if (richButtonRowCell.currentRow != null) {
                        richButtonRowCell.delegate.onCycleButtonStyle(RichButtonRowCell.this.currentRow, this.index);
                    }
                }
                return true;
            }
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    this.pressed = false;
                    this.button.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
                    return true;
                }
                return super.onTouchEvent(motionEvent);
            }
            if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                this.pressed = false;
                this.button.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
            }
            return true;
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.button.attach(this);
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
            this.button.detach(this);
            super.onDetachedFromWindow();
        }
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
        public RichButtonRowCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            RichButtonRowCell richButtonRowCell = new RichButtonRowCell(context, i, resourcesProvider);
            richButtonRowCell.setBackground(new RichEditor.DraggingDrawable(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            return richButtonRowCell;
        }

        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichButtonRowCell) view).bind((BlockRow) uItem.object, (Delegate) uItem.object2);
        }

        public static UItem of(BlockRow blockRow, Delegate delegate) {
            UItem ofFactory = UItem.ofFactory(Factory.class);
            ofFactory.object = blockRow;
            ofFactory.object2 = delegate;
            return ofFactory;
        }
    }
}
