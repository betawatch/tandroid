package org.telegram.ui.Stars;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SessionCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CompatDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.HorizontalRoundTabsLayout;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingSpan;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.TableView;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.TwoStepVerificationSetupActivity;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.BotWebViewSheet;

/* loaded from: classes5.dex */
public class StarGiftSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    private Adapter adapter;
    private final LinkSpanDrawable.LinksTextView afterTableTextView;
    private final LinkSpanDrawable.LinksTextView beforeTableTextView;
    private final FrameLayout bottomBulletinContainer;
    private final View bottomView;
    private Utilities.Callback2 boughtGift;
    private final ButtonWithCounterView button;
    private final FrameLayout buttonContainer;
    private final View buttonShadow;
    private final CheckBox2 checkbox;
    private final LinearLayout checkboxLayout;
    private final View checkboxSeparator;
    private final TextView checkboxTextView;
    private ContainerView container;
    private HintView2 currentHintView;
    private View currentHintViewTextView;
    private PageTransition currentPage;
    private final long dialogId;
    private FireworksOverlay fireworksOverlay;
    private boolean firstSet;
    private StarsController.IGiftsList giftsList;
    private final int[] heights;
    private final LinearLayout infoLayout;
    private boolean isLearnMore;
    private Float lastTop;
    private StarGiftSheet left;
    private ColoredImageSpan lockSpan;
    private MessageObject messageObject;
    private boolean messageObjectRepolled;
    private boolean messageObjectRepolling;
    private boolean myProfile;
    private Runnable onGiftUpdatedListener;
    private boolean onlyWearInfo;
    private View ownerTextView;
    private boolean resale;
    private StarGiftSheet right;
    private ArrayList sample_attributes;
    private TL_stars.SavedStarGift savedStarGift;
    private ShareAlert shareAlert;
    private boolean shownWearInfo;
    private String slug;
    private TL_stars.TL_starGiftUnique slugStarGift;
    private ValueAnimator switchingPagesAnimator;
    private final TableView tableView;
    private String title;
    private final TopView topView;
    private Boolean unsavedFromSavedStarGift;
    private final AffiliateProgramFragment.FeatureCell[] upgradeFeatureCells;
    private ColoredImageSpan upgradeIconSpan;
    private final LinearLayout upgradeLayout;
    private TLRPC.PaymentForm upgrade_form;
    private boolean userStarGiftRepolled;
    private boolean userStarGiftRepolling;
    private ViewPagerFixed viewPager;
    private final AffiliateProgramFragment.FeatureCell[] wearFeatureCells;
    private final LinearLayout wearLayout;
    private final TextView wearSubtitle;
    private final TextView wearTitle;

    class 1 extends ViewPagerFixed {
        1(Context context) {
            super(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$swapViews$0(boolean z) {
            TL_stars.SavedStarGift neighbourSavedGift = StarGiftSheet.this.getNeighbourSavedGift(z);
            if (neighbourSavedGift != null) {
                StarGiftSheet.this.firstSet = true;
                StarGiftSheet starGiftSheet = StarGiftSheet.this;
                starGiftSheet.set(neighbourSavedGift, starGiftSheet.giftsList);
            } else {
                TL_stars.TL_starGiftUnique neighbourSlugGift = StarGiftSheet.this.getNeighbourSlugGift(z);
                if (neighbourSlugGift != null) {
                    StarGiftSheet.this.firstSet = true;
                    StarGiftSheet starGiftSheet2 = StarGiftSheet.this;
                    starGiftSheet2.set(neighbourSlugGift.slug, neighbourSlugGift, starGiftSheet2.giftsList);
                }
            }
        }

        @Override // org.telegram.ui.Components.ViewPagerFixed
        protected boolean canScroll(MotionEvent motionEvent) {
            return StarGiftSheet.this.currentPage == null || StarGiftSheet.this.currentPage.is(0);
        }

        @Override // org.telegram.ui.Components.ViewPagerFixed
        protected void setTranslationX(View view, float f) {
            if (getMeasuredWidth() <= 0) {
                view.setTranslationX(f);
                return;
            }
            float clamp = Utilities.clamp(f / getMeasuredWidth(), 1.0f, -1.0f);
            view.setTranslationX(f + ((-clamp) * 2.0f * ((BottomSheet) StarGiftSheet.this).backgroundPaddingLeft));
            view.setPivotX(clamp <= 0.0f ? view.getMeasuredWidth() : 0.0f);
            view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
            view.setScaleX(1.0f - Math.abs(0.25f * clamp));
            view.setRotationY(clamp * 10.0f);
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
        @Override // org.telegram.ui.Components.ViewPagerFixed
        protected void swapViews() {
            super.swapViews();
            if (this.currentPosition != StarGiftSheet.this.hasNeighbour(false)) {
                final boolean z = this.currentPosition > StarGiftSheet.this.hasNeighbour(false);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.1.this.lambda$swapViews$0(z);
                    }
                });
            }
        }
    }

    private class Adapter extends RecyclerListView.SelectionAdapter {

        private class SpaceView extends View {
            private int height;

            public SpaceView(Context context) {
                super(context);
                this.height = 0;
            }

            @Override // android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.View
            protected void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.height, TLObject.FLAG_30));
            }

            public void setHeight(int i, int i2) {
                if (this.height != i) {
                    this.height = i;
                    requestLayout();
                }
            }
        }

        private Adapter() {
        }

        /* synthetic */ Adapter(StarGiftSheet starGiftSheet, 1 r2) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return StarGiftSheet.this.heights.length;
        }

        @Override // org.telegram.ui.Components.RecyclerListView.SelectionAdapter
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int length = (StarGiftSheet.this.heights.length - 1) - i;
            ((SpaceView) viewHolder.itemView).setHeight(StarGiftSheet.this.heights[length], length);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(new SpaceView(StarGiftSheet.this.getContext()));
        }

        public void setHeights(int i, int i2) {
            if (StarGiftSheet.this.heights[0] == i && StarGiftSheet.this.heights[1] == i2) {
                return;
            }
            StarGiftSheet.this.heights[0] = i;
            StarGiftSheet.this.heights[1] = i2;
            notifyDataSetChanged();
        }
    }

    private class ContainerView extends FrameLayout {
        private final Paint backgroundPaint;
        private float dimAlpha;
        private final Path path;
        private final RectF rect;

        public ContainerView(Context context) {
            super(context);
            this.rect = new RectF();
            this.backgroundPaint = new Paint(1);
            this.path = new Path();
            this.dimAlpha = 0.0f;
            setWillNotDraw(false);
            setClipChildren(false);
            setClipToPadding(false);
        }

        private void drawView(Canvas canvas, View view) {
            if (view == null || view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
                return;
            }
            if (view.getAlpha() < 1.0f) {
                canvas.saveLayerAlpha(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight(), (int) (((BottomSheetWithRecyclerListView) StarGiftSheet.this).actionBar.getAlpha() * 255.0f), 31);
            } else {
                canvas.save();
                canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + ((BottomSheetWithRecyclerListView) StarGiftSheet.this).actionBar.getMeasuredHeight());
            }
            canvas.translate(view.getX(), view.getY());
            view.draw(canvas);
            canvas.restore();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            StarGiftSheet.this.preDrawInternal(canvas, this);
            canvas.save();
            float pVar = top();
            float dp = AndroidUtilities.dp(12.0f);
            this.rect.set(((BottomSheet) StarGiftSheet.this).backgroundPaddingLeft, pVar, getWidth() - ((BottomSheet) StarGiftSheet.this).backgroundPaddingLeft, getHeight() + dp);
            this.backgroundPaint.setColor(StarGiftSheet.this.getThemedColor(Theme.key_dialogBackground));
            this.path.rewind();
            this.path.addRoundRect(this.rect, dp, dp, Path.Direction.CW);
            canvas.drawPath(this.path, this.backgroundPaint);
            canvas.clipPath(this.path);
            super.dispatchDraw(canvas);
            float f = this.dimAlpha;
            if (f != 0.0f) {
                canvas.drawColor(Theme.multAlpha(-16777216, f));
            }
            updateTranslations();
            canvas.restore();
            drawView(canvas, ((BottomSheetWithRecyclerListView) StarGiftSheet.this).actionBar);
            StarGiftSheet.this.postDrawInternal(canvas, this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= top() || !((BottomSheet) StarGiftSheet.this).containerView.isAttachedToWindow()) {
                return super.dispatchTouchEvent(motionEvent);
            }
            StarGiftSheet.this.lambda$new$0();
            return true;
        }

        @Override // android.view.ViewGroup
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == ((BottomSheetWithRecyclerListView) StarGiftSheet.this).actionBar) {
                return false;
            }
            return super.drawChild(canvas, view, j);
        }

        public float height() {
            return StarGiftSheet.this.topView.getRealHeight() + 0.0f + (StarGiftSheet.this.currentPage.at(0) * StarGiftSheet.this.infoLayout.getMeasuredHeight()) + (StarGiftSheet.this.currentPage.at(1) * StarGiftSheet.this.upgradeLayout.getMeasuredHeight()) + (StarGiftSheet.this.currentPage.at(2) * StarGiftSheet.this.wearLayout.getMeasuredHeight());
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (StarGiftSheet.this.adapter != null) {
                StarGiftSheet.this.adapter.setHeights(StarGiftSheet.this.topView.getFinalHeight(), StarGiftSheet.this.getBottomView().getMeasuredHeight());
            }
            StarGiftSheet.this.onSwitchedPage();
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            int i3;
            int makeMeasureSpec;
            int size = View.MeasureSpec.getSize(i2);
            ((BottomSheetWithRecyclerListView) StarGiftSheet.this).contentHeight = size;
            int size2 = View.MeasureSpec.getSize(i);
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                boolean z = childAt instanceof HintView2;
                int i5 = TLObject.FLAG_30;
                if (z) {
                    i3 = AndroidUtilities.dp(100.0f);
                } else if (childAt == ((BottomSheetWithRecyclerListView) StarGiftSheet.this).recyclerListView) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                    childAt.measure(i, makeMeasureSpec);
                } else {
                    i3 = 9999;
                    i5 = TLObject.FLAG_31;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i5);
                childAt.measure(i, makeMeasureSpec);
            }
            setMeasuredDimension(size2, size);
            if (StarGiftSheet.this.adapter != null) {
                StarGiftSheet.this.adapter.setHeights(StarGiftSheet.this.topView.getFinalHeight(), StarGiftSheet.this.getBottomView().getMeasuredHeight());
            }
        }

        @Override // android.view.View
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            FrameLayout frameLayout = StarGiftSheet.this.topBulletinContainer;
            if (frameLayout != null) {
                frameLayout.setTranslationY((getTranslationY() - height()) - AndroidUtilities.navigationBarHeight);
            }
        }

        public float top() {
            float max = Math.max(0.0f, getHeight() - height());
            int childCount = ((BottomSheetWithRecyclerListView) StarGiftSheet.this).recyclerListView.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = ((BottomSheetWithRecyclerListView) StarGiftSheet.this).recyclerListView.getChildAt(childCount);
                int childAdapterPosition = ((BottomSheetWithRecyclerListView) StarGiftSheet.this).recyclerListView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0) {
                    if (childAdapterPosition == 2) {
                        max = childAt.getTop() + childAt.getTranslationY() + childAt.getHeight();
                        break;
                    }
                    if (childAdapterPosition == 1) {
                        max = childAt.getY();
                        break;
                    }
                    if (childAdapterPosition == 0) {
                        max = childAt.getY() - StarGiftSheet.this.topView.getRealHeight();
                        break;
                    }
                }
                childCount--;
            }
            return (StarGiftSheet.this.lastTop == null || StarGiftSheet.this.currentPage == null || StarGiftSheet.this.currentPage.progress >= 1.0f) ? max : AndroidUtilities.lerp(StarGiftSheet.this.lastTop.floatValue(), max, StarGiftSheet.this.currentPage.progress);
        }

        public void updateTranslations() {
            float pVar = top();
            StarGiftSheet.this.topView.setTranslationY(pVar);
            StarGiftSheet.this.infoLayout.setTranslationY(StarGiftSheet.this.topView.getRealHeight() + pVar);
            StarGiftSheet.this.upgradeLayout.setTranslationY(StarGiftSheet.this.topView.getRealHeight() + pVar);
            StarGiftSheet.this.wearLayout.setTranslationY(pVar + StarGiftSheet.this.topView.getRealHeight());
            FrameLayout frameLayout = StarGiftSheet.this.topBulletinContainer;
            if (frameLayout != null) {
                frameLayout.setTranslationY((getTranslationY() - height()) - AndroidUtilities.navigationBarHeight);
            }
            AndroidUtilities.updateViewVisibilityAnimated(StarGiftSheet.this.buttonShadow, ((BottomSheetWithRecyclerListView) StarGiftSheet.this).recyclerListView.canScrollVertically(1));
        }
    }

    public static class GiftTransferTopView extends View {
        private final Paint arrowPaint;
        private final Path arrowPath;
        private final StarGiftDrawableIcon giftDrawable;
        private final ImageReceiver userImageReceiver;

        public GiftTransferTopView(Context context, TL_stars.StarGift starGift) {
            super(context);
            Path path = new Path();
            this.arrowPath = path;
            Paint paint = new Paint(1);
            this.arrowPaint = paint;
            StarGiftDrawableIcon starGiftDrawableIcon = new StarGiftDrawableIcon(this, starGift, 60, 0.27f);
            this.giftDrawable = starGiftDrawableIcon;
            starGiftDrawableIcon.setPatternsType(3);
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.userImageReceiver = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
            imageReceiver.setImageBitmap(SessionCell.createDrawable(60, "fragment"));
            paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText7));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.33f));
            path.rewind();
            path.moveTo(0.0f, -AndroidUtilities.dp(8.0f));
            path.lineTo(AndroidUtilities.dp(6.166f), 0.0f);
            path.lineTo(0.0f, AndroidUtilities.dp(8.0f));
        }

        public GiftTransferTopView(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
            super(context);
            Path path = new Path();
            this.arrowPath = path;
            Paint paint = new Paint(1);
            this.arrowPaint = paint;
            StarGiftDrawableIcon starGiftDrawableIcon = new StarGiftDrawableIcon(this, starGift, 60, 0.27f);
            this.giftDrawable = starGiftDrawableIcon;
            starGiftDrawableIcon.setPatternsType(3);
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(tLObject);
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.userImageReceiver = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
            imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
            paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText7));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            path.rewind();
            path.moveTo(0.0f, -AndroidUtilities.dp(8.0f));
            path.lineTo(AndroidUtilities.dp(6.166f), 0.0f);
            path.lineTo(0.0f, AndroidUtilities.dp(8.0f));
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.userImageReceiver.onAttachedToWindow();
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.userImageReceiver.onDetachedFromWindow();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
            int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
            this.giftDrawable.setBounds(width, height, AndroidUtilities.dp(60.0f) + width, AndroidUtilities.dp(60.0f) + height);
            this.giftDrawable.draw(canvas);
            canvas.save();
            canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
            canvas.drawPath(this.arrowPath, this.arrowPaint);
            canvas.restore();
            this.userImageReceiver.setImageCoords(width + AndroidUtilities.dp(96.0f), height, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
            this.userImageReceiver.draw(canvas);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30));
        }
    }

    private static class PageTransition {
        public int from;
        public float progress;
        public int to;

        public PageTransition(int i, int i2, float f) {
            this.from = i;
            this.to = i2;
        }

        public float at(int i) {
            int i2 = this.to;
            if (i2 == i && this.from == i) {
                return 1.0f;
            }
            if (i2 == i) {
                return this.progress;
            }
            if (this.from == i) {
                return 1.0f - this.progress;
            }
            return 0.0f;
        }

        public float at(int i, int i2) {
            if (contains(i) && contains(i2)) {
                return 1.0f;
            }
            return Math.max(at(i), at(i2));
        }

        public boolean contains(int i) {
            return this.from == i || this.to == i;
        }

        public boolean is(int i) {
            return this.to == i;
        }

        public void setProgress(float f) {
            this.progress = f;
        }

        public boolean to(int i) {
            return this.to == i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class PaymentFormState {
        public final AmountUtils$Amount amount;
        public final AmountUtils$Currency currency;
        public final TLRPC.TL_payments_paymentFormStarGift form;

        private PaymentFormState(AmountUtils$Currency amountUtils$Currency, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
            AmountUtils$Amount fromNano;
            this.currency = amountUtils$Currency;
            this.form = tL_payments_paymentFormStarGift;
            long formStarsPrice = StarsController.getFormStarsPrice(tL_payments_paymentFormStarGift);
            AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.STARS;
            if (amountUtils$Currency == amountUtils$Currency2) {
                fromNano = AmountUtils$Amount.fromDecimal(formStarsPrice, amountUtils$Currency2);
            } else {
                AmountUtils$Currency amountUtils$Currency3 = AmountUtils$Currency.TON;
                fromNano = amountUtils$Currency == amountUtils$Currency3 ? AmountUtils$Amount.fromNano(formStarsPrice, amountUtils$Currency3) : AmountUtils$Amount.fromNano(0L, amountUtils$Currency2);
            }
            this.amount = fromNano;
        }

        /* synthetic */ PaymentFormState(AmountUtils$Currency amountUtils$Currency, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, 1 r3) {
            this(amountUtils$Currency, tL_payments_paymentFormStarGift);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class ResaleBuyTransferAlert {
        private final AlertDialog alertDialog;
        private BalanceCloud balanceCloud;
        private final boolean canSwitchToTON;
        public final Context context;
        private final HorizontalRoundTabsLayout currencyTabsView;
        public final int currentAccount;
        public final long dialogId;
        private final HashMap forms;
        public final TL_stars.TL_starGiftUnique gift;
        private final String giftName;
        private Browser.Progress lastPositiveButtonProgress;
        private final HashSet loadingForms;
        private TextView positiveButton;
        private final Theme.ResourcesProvider resourcesProvider;
        private FrameLayout rootView;
        private AmountUtils$Currency selectedCurrency;
        private final TextView textInfoView;
        private HintView2 tonHint;

        /* JADX WARN: Multi-variable type inference failed */
        private ResaleBuyTransferAlert(final Context context, final Theme.ResourcesProvider resourcesProvider, TL_stars.TL_starGiftUnique tL_starGiftUnique, PaymentFormState paymentFormState, final int i, long j, String str, final Utilities.Callback2 callback2) {
            LinearLayout.LayoutParams createLinear;
            TextView textView;
            HashMap hashMap = new HashMap();
            this.forms = hashMap;
            this.loadingForms = new HashSet();
            this.context = context;
            this.gift = tL_starGiftUnique;
            this.dialogId = j;
            this.currentAccount = i;
            AmountUtils$Currency amountUtils$Currency = paymentFormState.currency;
            this.selectedCurrency = amountUtils$Currency;
            hashMap.put(amountUtils$Currency, paymentFormState);
            this.resourcesProvider = resourcesProvider;
            this.giftName = str;
            boolean z = tL_starGiftUnique.resale_ton_only;
            this.canSwitchToTON = !z;
            TLObject user = j >= 0 ? MessagesController.getInstance(i).getUser(Long.valueOf(j)) : MessagesController.getInstance(i).getChat(Long.valueOf(-j));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context) { // from class: org.telegram.ui.Stars.StarGiftSheet.ResaleBuyTransferAlert.1
                private final int[] c = new int[2];

                @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
                protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
                    super.onLayout(z2, i2, i3, i4, i5);
                    if (ResaleBuyTransferAlert.this.currencyTabsView == null || ResaleBuyTransferAlert.this.currencyTabsView.linearLayout.getChildCount() < 2 || ResaleBuyTransferAlert.this.tonHint == null || ResaleBuyTransferAlert.this.rootView == null) {
                        return;
                    }
                    ResaleBuyTransferAlert.this.rootView.getLocationInWindow(this.c);
                    float translationX = this.c[0] - ResaleBuyTransferAlert.this.rootView.getTranslationX();
                    float translationY = this.c[1] - ResaleBuyTransferAlert.this.rootView.getTranslationY();
                    View childAt = ResaleBuyTransferAlert.this.currencyTabsView.linearLayout.getChildAt(1);
                    childAt.getLocationInWindow(this.c);
                    float translationX2 = this.c[0] - childAt.getTranslationX();
                    ResaleBuyTransferAlert.this.tonHint.setTranslationY((((this.c[1] - childAt.getTranslationY()) - translationY) - ResaleBuyTransferAlert.this.tonHint.getMeasuredHeight()) - ResaleBuyTransferAlert.this.currencyTabsView.getMeasuredHeight());
                    ResaleBuyTransferAlert.this.tonHint.setJointPx(0.0f, ((translationX2 - translationX) + (childAt.getMeasuredWidth() / 2.0f)) - AndroidUtilities.dp(12.0f));
                }
            };
            frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f));
            if (z) {
                this.currencyTabsView = null;
                TextView textView2 = new TextView(context);
                textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.Gift2BuyPriceOnlyTON));
                textView2.setGravity(17);
                createLinear = LayoutHelper.createLinear(-2, -2, 17, 24, 4, 24, 4);
                textView = textView2;
            } else {
                HorizontalRoundTabsLayout horizontalRoundTabsLayout = new HorizontalRoundTabsLayout(context);
                this.currencyTabsView = horizontalRoundTabsLayout;
                ArrayList arrayList = new ArrayList();
                arrayList.add(LocaleController.getString(R.string.Gift2BuyInStars));
                arrayList.add(LocaleController.getString(R.string.Gift2BuyInTON));
                horizontalRoundTabsLayout.setTabs(arrayList, new MessagesStorage.IntCallback() { // from class: org.telegram.ui.Stars.StarGiftSheet$ResaleBuyTransferAlert$$ExternalSyntheticLambda0
                    @Override // org.telegram.messenger.MessagesStorage.IntCallback
                    public final void run(int i2) {
                        StarGiftSheet.ResaleBuyTransferAlert.this.lambda$new$0(i2);
                    }
                });
                createLinear = LayoutHelper.createLinear(-2, -2, 1, 18, 0, 18, 12);
                textView = horizontalRoundTabsLayout;
            }
            linearLayout.addView(textView, createLinear);
            linearLayout.addView(new GiftTransferTopView(context, tL_starGiftUnique, user), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
            TextView textView3 = new TextView(context);
            this.textInfoView = textView3;
            textView3.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            textView3.setTextSize(1, 16.0f);
            linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 4));
            this.alertDialog = new AlertDialog.Builder(context, resourcesProvider).setView(frameLayout).setPositiveButton("_", new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$ResaleBuyTransferAlert$$ExternalSyntheticLambda1
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i2) {
                    StarGiftSheet.ResaleBuyTransferAlert.this.lambda$new$1(i, context, resourcesProvider, callback2, alertDialog, i2);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
        }

        /* synthetic */ ResaleBuyTransferAlert(Context context, Theme.ResourcesProvider resourcesProvider, TL_stars.TL_starGiftUnique tL_starGiftUnique, PaymentFormState paymentFormState, int i, long j, String str, Utilities.Callback2 callback2, 1 r10) {
            this(context, resourcesProvider, tL_starGiftUnique, paymentFormState, i, j, str, callback2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(int i) {
            this.selectedCurrency = i == 0 ? AmountUtils$Currency.STARS : AmountUtils$Currency.TON;
            onUpdateCurrency(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(int i, Context context, Theme.ResourcesProvider resourcesProvider, Utilities.Callback2 callback2, AlertDialog alertDialog, int i2) {
            PaymentFormState paymentFormState = (PaymentFormState) this.forms.get(this.selectedCurrency);
            if (paymentFormState == null) {
                return;
            }
            StarsController starsController = StarsController.getInstance(i, this.selectedCurrency);
            AmountUtils$Amount of = starsController.balanceAvailable() ? AmountUtils$Amount.of(starsController.getBalance()) : null;
            if (of == null || paymentFormState.amount.asNano() <= of.asNano()) {
                Browser.Progress progress = this.lastPositiveButtonProgress;
                if (progress != null) {
                    progress.cancel();
                    this.lastPositiveButtonProgress = null;
                }
                callback2.run(paymentFormState, alertDialog.makeButtonLoading(i2));
                return;
            }
            AmountUtils$Currency amountUtils$Currency = this.selectedCurrency;
            if (amountUtils$Currency == AmountUtils$Currency.STARS) {
                new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, paymentFormState.amount.asDecimal(), 14, null, null).show();
            } else if (amountUtils$Currency == AmountUtils$Currency.TON) {
                new TONIntroActivity.StarsNeededSheet(context, resourcesProvider, paymentFormState.amount, true, null).show();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onUpdateCurrency$2(View view) {
            new StarsIntroActivity.StarsOptionsSheet(this.context, this.resourcesProvider).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onUpdateCurrency$3(View view) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onUpdateCurrency$4(AmountUtils$Currency amountUtils$Currency, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
            Browser.Progress progress = this.lastPositiveButtonProgress;
            if (progress != null && amountUtils$Currency == this.selectedCurrency) {
                progress.end();
            }
            this.loadingForms.remove(amountUtils$Currency);
            if (tL_payments_paymentFormStarGift != null) {
                this.forms.put(amountUtils$Currency, new PaymentFormState(amountUtils$Currency, tL_payments_paymentFormStarGift, null));
                onUpdateCurrency(true);
            }
        }

        private void onUpdateCurrency(boolean z) {
            HintView2 hintView2;
            final AmountUtils$Currency amountUtils$Currency = this.selectedCurrency;
            PaymentFormState paymentFormState = (PaymentFormState) this.forms.get(amountUtils$Currency);
            this.textInfoView.animate().alpha(paymentFormState != null ? 1.0f : 0.25f).start();
            this.textInfoView.setEnabled(paymentFormState != null);
            this.positiveButton.setEnabled(paymentFormState != null);
            this.balanceCloud.setCurrency(amountUtils$Currency, z);
            HorizontalRoundTabsLayout horizontalRoundTabsLayout = this.currencyTabsView;
            if (horizontalRoundTabsLayout != null) {
                horizontalRoundTabsLayout.setSelectedIndex(amountUtils$Currency == AmountUtils$Currency.TON ? 1 : 0, z);
            }
            AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
            if (amountUtils$Currency == amountUtils$Currency2 && (hintView2 = this.tonHint) != null && hintView2.shown()) {
                this.tonHint.hide();
            }
            BalanceCloud balanceCloud = this.balanceCloud;
            if (balanceCloud != null) {
                balanceCloud.setOnClickListener(amountUtils$Currency == AmountUtils$Currency.STARS ? new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$ResaleBuyTransferAlert$$ExternalSyntheticLambda2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarGiftSheet.ResaleBuyTransferAlert.this.lambda$onUpdateCurrency$2(view);
                    }
                } : new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$ResaleBuyTransferAlert$$ExternalSyntheticLambda3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarGiftSheet.ResaleBuyTransferAlert.lambda$onUpdateCurrency$3(view);
                    }
                });
            }
            Browser.Progress progress = this.lastPositiveButtonProgress;
            if (progress != null) {
                progress.cancel();
                this.lastPositiveButtonProgress = null;
            }
            if (paymentFormState == null) {
                Browser.Progress makeButtonLoading = this.alertDialog.makeButtonLoading(-1, false, false);
                this.lastPositiveButtonProgress = makeButtonLoading;
                makeButtonLoading.init();
                if (this.loadingForms.add(amountUtils$Currency)) {
                    StarsController.getInstance(this.currentAccount, amountUtils$Currency).getResellingGiftForm(this.gift, this.dialogId, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$ResaleBuyTransferAlert$$ExternalSyntheticLambda4
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            StarGiftSheet.ResaleBuyTransferAlert.this.lambda$onUpdateCurrency$4(amountUtils$Currency, (TLRPC.TL_payments_paymentFormStarGift) obj);
                        }
                    });
                    return;
                }
                return;
            }
            boolean z2 = this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (paymentFormState.currency == AmountUtils$Currency.STARS) {
                this.positiveButton.setText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("Gift2BuyDoPrice2", (int) paymentFormState.amount.asDecimal())));
                TextView textView = this.textInfoView;
                int asDecimal = (int) paymentFormState.amount.asDecimal();
                String str = this.giftName;
                textView.setText(AndroidUtilities.replaceTags(z2 ? LocaleController.formatPluralStringComma("Gift2BuyPriceSelfText", asDecimal, str) : LocaleController.formatPluralStringComma("Gift2BuyPriceText", asDecimal, str, DialogObject.getShortName(this.dialogId))));
            }
            if (paymentFormState.currency == amountUtils$Currency2) {
                this.positiveButton.setText(StarsIntroActivity.replaceStars(true, (CharSequence) LocaleController.formatString(R.string.Gift2BuyDoPrice2TON, paymentFormState.amount.asFormatString())));
                this.textInfoView.setText(AndroidUtilities.replaceTags(z2 ? LocaleController.formatString(R.string.Gift2BuyPriceSelfTextTON, paymentFormState.amount.asFormatString(), this.giftName) : LocaleController.formatString(R.string.Gift2BuyPriceTextTON, paymentFormState.amount.asFormatString(), this.giftName, DialogObject.getShortName(this.dialogId))));
            }
        }

        public void show() {
            this.alertDialog.setShowStarsBalance(true).show();
            this.positiveButton = (TextView) this.alertDialog.getButton(-1);
            this.balanceCloud = this.alertDialog.getStarsBalanceCloud();
            FrameLayout fullscreenContainerView = this.alertDialog.getFullscreenContainerView();
            this.rootView = fullscreenContainerView;
            if (fullscreenContainerView != null && this.canSwitchToTON) {
                HintView2 show = new HintView2(this.context, 3).setMultilineText(true).setTextAlign(Layout.Alignment.ALIGN_NORMAL).setDuration(5000L).setText(LocaleController.getString(R.string.Gift2BuyPricePayHintTON)).show();
                this.tonHint = show;
                show.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                this.rootView.addView(this.tonHint, LayoutHelper.createFrame(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
            }
            onUpdateCurrency(false);
        }
    }

    public static class StarGiftDrawableIcon extends CompatDrawable {
        private RadialGradient gradient;
        private final ImageReceiver imageReceiver;
        private final Matrix matrix;
        private final Path path;
        private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable pattern;
        private float patternsScale;
        private int patternsType;
        private final RectF rect;
        private int rounding;
        private final int sizeDp;

        public StarGiftDrawableIcon(View view, TL_stars.StarGift starGift, int i, float f) {
            super(view);
            this.path = new Path();
            this.rect = new RectF();
            this.matrix = new Matrix();
            this.rounding = AndroidUtilities.dp(16.0f);
            this.patternsType = 0;
            this.patternsScale = f;
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.imageReceiver = imageReceiver;
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, false, AndroidUtilities.dp(i > 180 ? 24.0f : 18.0f));
            this.pattern = swapAnimatedEmojiDrawable;
            this.sizeDp = i;
            if (starGift != null) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributePattern.class);
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                if (stargiftattributepattern != null) {
                    swapAnimatedEmojiDrawable.set(stargiftattributepattern.document, false);
                }
                if (stargiftattributebackdrop != null) {
                    this.gradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(i) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    swapAnimatedEmojiDrawable.setColor(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
                }
                if (stargiftattributemodel != null) {
                    StarsIntroActivity.setGiftImage(imageReceiver, stargiftattributemodel.document, (int) (i * 0.75f));
                }
            }
            this.paint.setShader(this.gradient);
            if (view.isAttachedToWindow()) {
                onAttachedToWindow();
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            this.rect.set(getBounds());
            canvas.save();
            this.path.rewind();
            Path path = this.path;
            RectF rectF = this.rect;
            float f = this.rounding;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.clipPath(this.path);
            if (this.gradient != null) {
                this.matrix.reset();
                this.matrix.postTranslate(this.rect.centerX(), this.rect.centerY());
                this.gradient.setLocalMatrix(this.matrix);
                this.paint.setShader(this.gradient);
            }
            canvas.drawPaint(this.paint);
            canvas.save();
            canvas.translate(this.rect.centerX(), this.rect.centerY());
            StarGiftPatterns.drawPattern(canvas, this.patternsType, this.pattern, this.rect.width(), this.rect.height(), 1.0f, this.patternsScale);
            canvas.restore();
            float min = Math.min(this.rect.width(), this.rect.height()) * 0.75f;
            float f2 = min / 2.0f;
            this.imageReceiver.setImageCoords(this.rect.centerX() - f2, this.rect.centerY() - f2, min, min);
            this.imageReceiver.draw(canvas);
            canvas.restore();
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(this.sizeDp);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(this.sizeDp);
        }

        @Override // org.telegram.ui.Components.CompatDrawable
        public void onAttachedToWindow() {
            this.pattern.attach();
            this.imageReceiver.onAttachedToWindow();
        }

        @Override // org.telegram.ui.Components.CompatDrawable
        public void onDetachedToWindow() {
            this.pattern.detach();
            this.imageReceiver.onDetachedFromWindow();
        }

        public StarGiftDrawableIcon setPatternsType(int i) {
            this.patternsType = i;
            return this;
        }

        public StarGiftDrawableIcon setRounding(int i) {
            this.rounding = i;
            return this;
        }
    }

    public static class TopView extends FrameLayout {
        private boolean attached;
        private BackupImageView avatarView;
        private final TL_stars.starGiftAttributeBackdrop[] backdrop;
        private BagRandomizer backdrops;
        private final RadialGradient[] backgroundGradient;
        private final Matrix[] backgroundMatrix;
        private final Paint[] backgroundPaint;
        public final Button[] buttons;
        private int buttonsBackgroundColor;
        private final LinearLayout buttonsLayout;
        private final Runnable checkToRotateRunnable;
        private final ImageView closeView;
        private final TextView collectionReleasedView;
        private int currentImageIndex;
        private PageTransition currentPage;
        private boolean hasLink;
        private boolean hasResellPrice;
        private final FrameLayout imageLayout;
        private final BackupImageView[] imageView;
        private final LinearLayout[] layout;
        private final FrameLayout.LayoutParams[] layoutLayoutParams;
        private BagRandomizer models;
        private View.OnClickListener onResellClick;
        private View.OnClickListener onShareClick;
        private View.OnClickListener onUpdatePriceClick;
        private final ImageView optionsView;
        private StarsReactionsSheet.Particles particles;
        private final RectF particlesBounds;
        private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] pattern;
        private BagRandomizer patterns;
        private LinearGradient profileBackgroundGradient;
        private final Matrix profileBackgroundMatrix;
        private Paint profileBackgroundPaint;
        private final LinkSpanDrawable.LinksTextView releasedView;
        private final TextView resellPriceView;
        private boolean resellPriceViewInProgress;
        private final Theme.ResourcesProvider resourcesProvider;
        private ValueAnimator rotationAnimator;
        private ArrayList sampleAttributes;
        private final LinkSpanDrawable.LinksTextView[] subtitleView;
        private final LinearLayout.LayoutParams[] subtitleViewLayoutParams;
        private ValueAnimator switchAnimator;
        private float switchScale;
        private final LinkSpanDrawable.LinksTextView[] titleView;
        private float toggleBackdrop;
        private int toggled;
        private FrameLayout userLayout;
        private float wearImageScale;
        private float wearImageTx;
        private float wearImageTy;
        private TLObject wearPreviewObject;

        public static class Button extends FrameLayout {
            public ImageView imageView;
            public TextView textView;

            public Button(Context context) {
                super(context);
                ImageView imageView = new ImageView(context);
                this.imageView = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(this.imageView, LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.textView = textView;
                textView.setTypeface(AndroidUtilities.bold());
                this.textView.setTextSize(1, 12.0f);
                this.textView.setTextColor(-1);
                this.textView.setGravity(17);
                addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
            }

            public void set(int i, CharSequence charSequence, boolean z) {
                if (z) {
                    AndroidUtilities.updateImageViewImageAnimated(this.imageView, i);
                } else {
                    this.imageView.setImageResource(i);
                }
                this.textView.setText(charSequence);
            }
        }

        public TopView(Context context, Theme.ResourcesProvider resourcesProvider, final Runnable runnable, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
            super(context);
            int i = 3;
            this.imageView = new BackupImageView[3];
            boolean z = false;
            this.currentImageIndex = 0;
            this.layout = new LinearLayout[3];
            this.layoutLayoutParams = new FrameLayout.LayoutParams[3];
            this.titleView = new LinkSpanDrawable.LinksTextView[3];
            this.subtitleView = new LinkSpanDrawable.LinksTextView[3];
            this.subtitleViewLayoutParams = new LinearLayout.LayoutParams[3];
            this.currentPage = new PageTransition(0, 0, 1.0f);
            this.backdrop = new TL_stars.starGiftAttributeBackdrop[3];
            this.checkToRotateRunnable = new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$TopView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.TopView.this.lambda$new$2();
                }
            };
            this.backgroundPaint = new Paint[3];
            this.backgroundGradient = new RadialGradient[3];
            this.backgroundMatrix = new Matrix[3];
            this.profileBackgroundMatrix = new Matrix();
            this.profileBackgroundPaint = new Paint(1);
            this.pattern = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[2];
            int i2 = 0;
            while (true) {
                Paint[] paintArr = this.backgroundPaint;
                if (i2 >= paintArr.length) {
                    break;
                }
                paintArr[i2] = new Paint(1);
                i2++;
            }
            int i3 = 0;
            while (true) {
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] swapAnimatedEmojiDrawableArr = this.pattern;
                if (i3 >= swapAnimatedEmojiDrawableArr.length) {
                    break;
                }
                swapAnimatedEmojiDrawableArr[i3] = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(28.0f));
                i3++;
            }
            this.switchScale = 1.0f;
            this.particlesBounds = new RectF();
            this.resourcesProvider = resourcesProvider;
            this.onShareClick = onClickListener4;
            this.onResellClick = onClickListener5;
            this.onUpdatePriceClick = onClickListener6;
            setWillNotDraw(false);
            this.imageLayout = new FrameLayout(context);
            int i4 = 0;
            while (i4 < 3) {
                this.imageView[i4] = new BackupImageView(context);
                this.imageView[i4].setLayerNum(6660);
                if (i4 > 0) {
                    this.imageView[i4].getImageReceiver().setCrossfadeDuration(1);
                }
                this.imageLayout.addView(this.imageView[i4], LayoutHelper.createFrame(-1, -1, 119));
                this.imageView[i4].setAlpha(i4 == this.currentImageIndex ? 1.0f : 0.0f);
                i4++;
            }
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.releasedView = linksTextView;
            linksTextView.setTextSize(1, 12.0f);
            linksTextView.setGravity(17);
            linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
            linksTextView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            TextView textView = new TextView(context);
            this.collectionReleasedView = textView;
            textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$TopView$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StarGiftSheet.TopView.this.lambda$new$0(view);
                }
            });
            ScaleStateListAnimator.apply(textView, 0.05f, 1.25f);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(17);
            textView.setLinkTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
            LinearLayout linearLayout = new LinearLayout(context);
            this.buttonsLayout = linearLayout;
            linearLayout.setOrientation(0);
            this.buttons = new Button[3];
            int i5 = 0;
            while (true) {
                Button[] buttonArr = this.buttons;
                if (i5 >= buttonArr.length) {
                    break;
                }
                buttonArr[i5] = new Button(context);
                if (i5 == 0) {
                    this.buttons[i5].set(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), z);
                    this.buttons[i5].setOnClickListener(onClickListener2);
                } else if (i5 == 1) {
                    this.buttons[i5].set(R.drawable.filled_crown_on, LocaleController.getString(R.string.Gift2ActionWear), z);
                    this.buttons[i5].setOnClickListener(onClickListener3);
                } else if (i5 == 2) {
                    this.buttons[i5].set(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), z);
                    this.buttons[i5].setOnClickListener(onClickListener4);
                }
                ScaleStateListAnimator.apply(this.buttons[i5], 0.075f, 1.5f);
                LinearLayout linearLayout2 = this.buttonsLayout;
                Button[] buttonArr2 = this.buttons;
                linearLayout2.addView(buttonArr2[i5], LayoutHelper.createLinear(0, 56, 1.0f, 119, 0, 0, i5 != buttonArr2.length - 1 ? 11 : 0, 0));
                i5++;
                z = false;
            }
            int i6 = 0;
            while (true) {
                float f = 9.0f;
                if (i6 >= i) {
                    addView(this.imageLayout, LayoutHelper.createFrame(NotificationCenter.audioRecordTooShort, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                    ImageView imageView = new ImageView(context);
                    this.closeView = imageView;
                    imageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(28.0f), 620756991));
                    imageView.setImageResource(R.drawable.msg_close);
                    ScaleStateListAnimator.apply(imageView);
                    addView(imageView, LayoutHelper.createFrame(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$TopView$$ExternalSyntheticLambda2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            runnable.run();
                        }
                    });
                    imageView.setVisibility(8);
                    TextView textView2 = new TextView(context);
                    this.resellPriceView = textView2;
                    textView2.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(-1);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setAlpha(0.0f);
                    textView2.setVisibility(8);
                    textView2.setGravity(17);
                    ScaleStateListAnimator.apply(textView2);
                    addView(textView2, LayoutHelper.createFrame(-2, 24.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
                    ImageView imageView2 = new ImageView(context);
                    this.optionsView = imageView2;
                    imageView2.setImageResource(R.drawable.media_more);
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    imageView2.setBackground(Theme.createSelectorDrawable(553648127, 1));
                    ScaleStateListAnimator.apply(imageView2);
                    addView(imageView2, LayoutHelper.createFrame(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
                    imageView2.setOnClickListener(onClickListener);
                    imageView2.setVisibility(8);
                    return;
                }
                this.layout[i6] = new LinearLayout(context);
                this.layout[i6].setOrientation(1);
                View view = this.layout[i6];
                FrameLayout.LayoutParams[] layoutParamsArr = this.layoutLayoutParams;
                ViewGroup.LayoutParams createFrame = LayoutHelper.createFrame(-1, -2.0f, 119, 16.0f, i6 == 2 ? 64.0f : 170.0f, 16.0f, 0.0f);
                layoutParamsArr[i6] = createFrame;
                addView(view, createFrame);
                if (i6 == 2) {
                    FrameLayout frameLayout = new FrameLayout(context);
                    this.userLayout = frameLayout;
                    this.layout[i6].addView(frameLayout, LayoutHelper.createLinear(-1, 104, 119));
                    BackupImageView backupImageView = new BackupImageView(context);
                    this.avatarView = backupImageView;
                    backupImageView.setRoundRadius(AndroidUtilities.dp(30.0f));
                    this.userLayout.addView(this.avatarView, LayoutHelper.createFrame(60, 60.0f, 19, 1.0f, 0.0f, 0.0f, 0.0f));
                    this.titleView[i6] = new LinkSpanDrawable.LinksTextView(context);
                    this.titleView[i6].setTextColor(-1);
                    this.titleView[i6].setTextSize(1, 20.0f);
                    this.titleView[i6].setTypeface(AndroidUtilities.bold());
                    this.titleView[i6].setSingleLine();
                    LinkSpanDrawable.LinksTextView linksTextView2 = this.titleView[i6];
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    linksTextView2.setEllipsize(truncateAt);
                    this.userLayout.addView(this.titleView[i6], LayoutHelper.createFrame(-1, -2.0f, 55, 81.0f, 30.33f, 40.0f, 0.0f));
                    this.subtitleView[i6] = new LinkSpanDrawable.LinksTextView(context);
                    this.subtitleView[i6].setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                    this.subtitleView[i6].setTextSize(1, 14.0f);
                    this.subtitleView[i6].setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
                    this.subtitleView[i6].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.subtitleView[i6].setDisablePaddingsOffsetY(true);
                    this.subtitleView[i6].setSingleLine();
                    this.titleView[i6].setEllipsize(truncateAt);
                    this.userLayout.addView(this.subtitleView[i6], LayoutHelper.createFrame(-1, -2.0f, 55, 81.0f, 57.0f, 4.0f, 0.0f));
                } else {
                    this.titleView[i6] = new LinkSpanDrawable.LinksTextView(context);
                    LinkSpanDrawable.LinksTextView linksTextView3 = this.titleView[i6];
                    int i7 = Theme.key_dialogTextBlack;
                    linksTextView3.setTextColor(Theme.getColor(i7, resourcesProvider));
                    this.titleView[i6].setTextSize(1, 20.0f);
                    this.titleView[i6].setTypeface(AndroidUtilities.bold());
                    this.titleView[i6].setGravity(17);
                    this.layout[i6].addView(this.titleView[i6], LayoutHelper.createLinear(-1, -2, 17, 24, 0, 24, 0));
                    if (i6 == 0) {
                        this.layout[i6].addView(this.releasedView, LayoutHelper.createLinear(-2, -2, 17, 0, 4, 0, 4));
                        this.layout[i6].addView(this.collectionReleasedView, LayoutHelper.createLinear(-2, 19.33f, 17, 0, 6, 0, 2));
                    }
                    this.subtitleView[i6] = new LinkSpanDrawable.LinksTextView(context);
                    this.subtitleView[i6].setTextColor(Theme.getColor(i7, resourcesProvider));
                    this.subtitleView[i6].setTextSize(1, 14.0f);
                    this.subtitleView[i6].setGravity(17);
                    this.subtitleView[i6].setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
                    this.subtitleView[i6].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.subtitleView[i6].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout3 = this.layout[i6];
                    LinkSpanDrawable.LinksTextView linksTextView4 = this.subtitleView[i6];
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.subtitleViewLayoutParams;
                    LinearLayout.LayoutParams createLinear = LayoutHelper.createLinear(-1, -2, 17, 24, 0, 24, 0);
                    layoutParamsArr2[i6] = createLinear;
                    linearLayout3.addView(linksTextView4, createLinear);
                    LinearLayout.LayoutParams layoutParams = this.subtitleViewLayoutParams[i6];
                    if (i6 == 1) {
                        f = 7.33f;
                    } else if (this.backdrop[0] != null) {
                        f = 5.66f;
                    }
                    layoutParams.topMargin = AndroidUtilities.dp(f);
                }
                if (i6 == 0) {
                    this.layout[i6].addView(this.buttonsLayout, LayoutHelper.createLinear(-1, -2, 7, 0, 15, 0, 0));
                }
                i6++;
                i = 3;
            }
        }

        private void animateSwitch() {
            ValueAnimator valueAnimator = this.switchAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.switchAnimator = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.switchAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$TopView$$ExternalSyntheticLambda4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    StarGiftSheet.TopView.this.lambda$animateSwitch$4(valueAnimator2);
                }
            });
            this.switchAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stars.StarGiftSheet.TopView.5
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    TopView.this.switchScale = 1.0f;
                    TopView.this.imageLayout.setScaleX(TopView.this.switchScale);
                    TopView.this.imageLayout.setScaleY(TopView.this.switchScale);
                    TopView.this.invalidate();
                }
            });
            this.switchAnimator.setDuration(320L);
            this.switchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.switchAnimator.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$animateSwitch$4(ValueAnimator valueAnimator) {
            float pow = (((float) Math.pow((r5 * 2.0f) - 2.0f, 2.0d)) * 0.075f * ((Float) valueAnimator.getAnimatedValue()).floatValue()) + 1.0f;
            this.switchScale = pow;
            this.imageLayout.setScaleX(pow);
            this.imageLayout.setScaleY(this.switchScale);
            invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view) {
            CharSequence text = this.collectionReleasedView.getText();
            if (text instanceof Spanned) {
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                if (clickableSpanArr.length > 0) {
                    clickableSpanArr[0].onClick(view);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$2() {
            if (this.imageView[2 - this.toggled].getImageReceiver().hasImageLoaded()) {
                rotateAttributes();
            } else {
                AndroidUtilities.cancelRunOnUIThread(this.checkToRotateRunnable);
                AndroidUtilities.runOnUIThread(this.checkToRotateRunnable, 150L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$rotateAttributes$3(ValueAnimator valueAnimator) {
            this.toggleBackdrop = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            onSwitchPage(this.currentPage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void preloadPattern(TL_stars.starGiftAttributePattern stargiftattributepattern) {
            if (stargiftattributepattern == null) {
                return;
            }
            AnimatedEmojiDrawable.make(UserConfig.selectedAccount, 7, stargiftattributepattern.document).preload();
        }

        private void rotateAttributes() {
            PageTransition pageTransition = this.currentPage;
            if (pageTransition != null && pageTransition.to == 1 && isAttachedToWindow()) {
                AndroidUtilities.cancelRunOnUIThread(this.checkToRotateRunnable);
                ValueAnimator valueAnimator = this.rotationAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.rotationAnimator = null;
                }
                int i = 1 - this.toggled;
                this.toggled = i;
                RLottieDrawable lottieAnimation = this.imageView[2 - i].getImageReceiver().getLottieAnimation();
                RLottieDrawable lottieAnimation2 = this.imageView[this.toggled + 1].getImageReceiver().getLottieAnimation();
                if (lottieAnimation2 != null && lottieAnimation != null) {
                    lottieAnimation2.setProgress(lottieAnimation.getProgress(), false);
                }
                this.models.next();
                int i2 = this.toggled + 1;
                TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.backdrops.next();
                stargiftattributebackdropArr[i2] = stargiftattributebackdrop;
                setBackdropPaint(i2, stargiftattributebackdrop);
                setPattern(1, (TL_stars.starGiftAttributePattern) this.patterns.next(), true);
                animateSwitch();
                float f = this.toggled;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f, f);
                this.rotationAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$TopView$$ExternalSyntheticLambda3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        StarGiftSheet.TopView.this.lambda$rotateAttributes$3(valueAnimator2);
                    }
                });
                this.rotationAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stars.StarGiftSheet.TopView.4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        TopView.this.toggleBackdrop = r3.toggled;
                        TopView topView = TopView.this;
                        topView.onSwitchPage(topView.currentPage);
                        StarsIntroActivity.setGiftImage(TopView.this.imageView[2 - TopView.this.toggled].getImageReceiver(), ((TL_stars.starGiftAttributeModel) TopView.this.models.getNext()).document, NotificationCenter.audioRecordTooShort);
                        TopView topView2 = TopView.this;
                        topView2.preloadPattern((TL_stars.starGiftAttributePattern) topView2.patterns.getNext());
                        AndroidUtilities.cancelRunOnUIThread(TopView.this.checkToRotateRunnable);
                        AndroidUtilities.runOnUIThread(TopView.this.checkToRotateRunnable, 2500L);
                    }
                });
                this.rotationAnimator.setDuration(320L);
                this.rotationAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.rotationAnimator.start();
            }
        }

        private void setBackdropPaint(int i, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
            if (stargiftattributebackdrop == null) {
                return;
            }
            RadialGradient[] radialGradientArr = this.backgroundGradient;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            radialGradientArr[i] = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            if (i == 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
                this.profileBackgroundGradient = linearGradient;
                this.profileBackgroundPaint.setShader(linearGradient);
            }
            Matrix[] matrixArr = this.backgroundMatrix;
            if (matrixArr[i] == null) {
                matrixArr[i] = new Matrix();
            }
            this.backgroundPaint[i].setShader(this.backgroundGradient[i]);
        }

        private void setPattern(int i, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z) {
            if (stargiftattributepattern == null) {
                return;
            }
            this.pattern[i].set(stargiftattributepattern.document, z);
        }

        private void updateWearImageTranslation() {
            this.wearImageScale = AndroidUtilities.dpf2(33.33f) / AndroidUtilities.dpf2(160.0f);
            this.wearImageTx = (((-this.imageLayout.getLeft()) + AndroidUtilities.dp(97.0f)) + Math.min(this.titleView[2].getPaint().measureText(this.titleView[2].getText().toString()) + AndroidUtilities.dp(12.0f), this.titleView[2].getWidth())) - (AndroidUtilities.dp(126.67f) / 2.0f);
            this.wearImageTy = ((-this.imageLayout.getTop()) + AndroidUtilities.dp(88.66f)) - (AndroidUtilities.dp(126.67f) / 2.0f);
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x0348  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0353  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x034a  */
        @Override // android.view.ViewGroup, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void dispatchDraw(Canvas canvas) {
            float width;
            Paint paint;
            int i;
            float realHeight = getRealHeight();
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
            float width2 = getWidth() / 2.0f;
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), this.currentPage.at(1)) + AndroidUtilities.dp(80.0f);
            float at = this.currentPage.at(0, 2);
            if (at > 0.0f && this.backdrop[0] != null) {
                if (this.profileBackgroundGradient == null || this.currentPage.at(2) < 1.0f) {
                    this.backgroundPaint[0].setAlpha((int) (at * 255.0f));
                    this.backgroundMatrix[0].reset();
                    this.backgroundMatrix[0].postTranslate(width2, lerp);
                    this.backgroundGradient[0].setLocalMatrix(this.backgroundMatrix[0]);
                    canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, this.backgroundPaint[0]);
                }
                if (this.profileBackgroundGradient != null && this.currentPage.at(2) > 0.0f) {
                    this.profileBackgroundPaint.setAlpha((int) (this.currentPage.at(2) * 255.0f));
                    this.profileBackgroundMatrix.reset();
                    this.profileBackgroundMatrix.postTranslate(0.0f, 0.0f);
                    this.profileBackgroundGradient.setLocalMatrix(this.profileBackgroundMatrix);
                    canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, this.profileBackgroundPaint);
                }
                int i2 = this.backdrop[0].pattern_color | (-16777216);
                if (this.currentPage.at(0) > 0.0f) {
                    canvas.save();
                    canvas.translate(width2, lerp);
                    this.pattern[0].setColor(Integer.valueOf(i2));
                    i = i2;
                    StarGiftPatterns.drawPattern(canvas, this.pattern[0], getWidth(), realHeight, this.currentPage.at(0), 1.0f);
                    canvas.restore();
                } else {
                    i = i2;
                }
                if (this.currentPage.at(2) > 0.0f) {
                    canvas.save();
                    this.pattern[0].setColor(Integer.valueOf(i));
                    StarGiftPatterns.drawProfilePattern(canvas, this.pattern[0], getWidth(), realHeight, this.currentPage.at(2), 1.0f);
                    canvas.restore();
                }
                int i3 = i;
                if (i3 != this.buttonsBackgroundColor) {
                    int i4 = this.backdrop[0].edge_color | (-16777216);
                    this.buttonsBackgroundColor = i3;
                    int blendARGB = ColorUtils.blendARGB(i4, i3, 0.25f);
                    for (Button button : this.buttons) {
                        button.setBackground(Theme.createRadSelectorDrawable(blendARGB, 285212671, 10, 10));
                    }
                    TextView textView = this.collectionReleasedView;
                    if (textView != null) {
                        textView.setTextColor(this.backdrop[0].text_color | (-16777216));
                        this.collectionReleasedView.setBackground(Theme.createRadSelectorDrawable(blendARGB, 285212671, 10, 10));
                    }
                }
                if (this.currentPage.at(2) > 0.0f) {
                    if (this.particles == null) {
                        this.particles = new StarsReactionsSheet.Particles(1, 12);
                    }
                    float x = this.imageLayout.getX() + (this.imageLayout.getMeasuredWidth() / 2.0f);
                    float measuredWidth = (this.imageLayout.getMeasuredWidth() * this.imageLayout.getScaleX()) / 2.0f;
                    float y = this.imageLayout.getY() + (this.imageLayout.getMeasuredHeight() / 2.0f);
                    float measuredHeight = (this.imageLayout.getMeasuredHeight() * this.imageLayout.getScaleY()) / 2.0f;
                    this.particlesBounds.set(x - measuredWidth, y - measuredHeight, x + measuredWidth, y + measuredHeight);
                    this.particles.setBounds(this.particlesBounds);
                    this.particles.process();
                    this.particles.draw(canvas, Theme.multAlpha(-1, this.currentPage.at(2)));
                    invalidate();
                }
            }
            if (this.currentPage.at(1) > 0.0f) {
                if (this.toggled == 0) {
                    if (this.toggleBackdrop > 0.0f && this.backdrop[2] != null) {
                        this.backgroundPaint[2].setAlpha((int) (this.currentPage.at(1) * 255.0f));
                        this.backgroundMatrix[2].reset();
                        this.backgroundMatrix[2].postTranslate(width2, lerp);
                        this.backgroundGradient[2].setLocalMatrix(this.backgroundMatrix[2]);
                        canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, this.backgroundPaint[2]);
                    }
                    if (this.toggleBackdrop < 1.0f && this.backdrop[1] != null) {
                        this.backgroundPaint[1].setAlpha((int) (this.currentPage.at(1) * 255.0f * (1.0f - this.toggleBackdrop)));
                        this.backgroundMatrix[1].reset();
                        this.backgroundMatrix[1].postTranslate(width2, lerp);
                        this.backgroundGradient[1].setLocalMatrix(this.backgroundMatrix[1]);
                        width = getWidth();
                        paint = this.backgroundPaint[1];
                        canvas.drawRect(0.0f, 0.0f, width, realHeight, paint);
                    }
                    canvas.save();
                    canvas.translate(width2, lerp);
                    TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                    int i5 = stargiftattributebackdrop != null ? 0 : stargiftattributebackdrop.pattern_color | (-16777216);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
                    this.pattern[1].setColor(Integer.valueOf(ColorUtils.blendARGB(i5, stargiftattributebackdrop2 != null ? stargiftattributebackdrop2.pattern_color | (-16777216) : 0, this.toggleBackdrop)));
                    StarGiftPatterns.drawPattern(canvas, this.pattern[1], getWidth(), getRealHeight(), this.currentPage.at(1), this.switchScale);
                    canvas.restore();
                } else {
                    if (this.toggleBackdrop < 1.0f && this.backdrop[1] != null) {
                        this.backgroundPaint[1].setAlpha((int) (this.currentPage.at(1) * 255.0f));
                        this.backgroundMatrix[1].reset();
                        this.backgroundMatrix[1].postTranslate(width2, lerp);
                        this.backgroundGradient[1].setLocalMatrix(this.backgroundMatrix[1]);
                        canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, this.backgroundPaint[1]);
                    }
                    if (this.toggleBackdrop > 0.0f && this.backdrop[2] != null) {
                        this.backgroundPaint[2].setAlpha((int) (this.currentPage.at(1) * 255.0f * this.toggleBackdrop));
                        this.backgroundMatrix[2].reset();
                        this.backgroundMatrix[2].postTranslate(width2, lerp);
                        this.backgroundGradient[2].setLocalMatrix(this.backgroundMatrix[2]);
                        width = getWidth();
                        paint = this.backgroundPaint[2];
                        canvas.drawRect(0.0f, 0.0f, width, realHeight, paint);
                    }
                    canvas.save();
                    canvas.translate(width2, lerp);
                    TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.backdrop;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr2[1];
                    if (stargiftattributebackdrop3 != null) {
                    }
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop22 = stargiftattributebackdropArr2[2];
                    this.pattern[1].setColor(Integer.valueOf(ColorUtils.blendARGB(i5, stargiftattributebackdrop22 != null ? stargiftattributebackdrop22.pattern_color | (-16777216) : 0, this.toggleBackdrop)));
                    StarGiftPatterns.drawPattern(canvas, this.pattern[1], getWidth(), getRealHeight(), this.currentPage.at(1), this.switchScale);
                    canvas.restore();
                }
            }
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        public int getFinalHeight() {
            int dp;
            LinearLayout linearLayout;
            if (this.currentPage.to(0)) {
                dp = AndroidUtilities.dp(this.backdrop[0] != null ? 24.0f : 10.0f) + AndroidUtilities.dp(160.0f);
                linearLayout = this.layout[0];
            } else if (this.currentPage.to(1)) {
                dp = AndroidUtilities.dp(this.backdrop[1] != null ? 24.0f : 10.0f) + AndroidUtilities.dp(160.0f);
                linearLayout = this.layout[1];
            } else {
                if (!this.currentPage.to(2)) {
                    return 0;
                }
                dp = AndroidUtilities.dp(64.0f);
                linearLayout = this.layout[2];
            }
            return dp + linearLayout.getMeasuredHeight();
        }

        public float getRealHeight() {
            return ((AndroidUtilities.dp(this.backdrop[0] != null ? 24.0f : 10.0f) + AndroidUtilities.dp(160.0f) + this.layout[0].getMeasuredHeight()) * this.currentPage.at(0)) + 0.0f + ((AndroidUtilities.dp(this.backdrop[1] != null ? 24.0f : 10.0f) + AndroidUtilities.dp(160.0f) + this.layout[1].getMeasuredHeight()) * this.currentPage.at(1)) + ((AndroidUtilities.dp(64.0f) + this.layout[2].getMeasuredHeight()) * this.currentPage.at(2));
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            this.attached = true;
            super.onAttachedToWindow();
            this.pattern[0].attach();
            this.pattern[1].attach();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            this.attached = false;
            super.onDetachedFromWindow();
            this.pattern[0].detach();
            this.pattern[1].detach();
            AndroidUtilities.cancelRunOnUIThread(this.checkToRotateRunnable);
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.currentPage.contains(2)) {
                updateWearImageTranslation();
                onSwitchPage(this.currentPage);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:69:0x01a0  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01ce A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01a4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onSwitchPage(PageTransition pageTransition) {
            int i;
            float f;
            boolean z;
            FrameLayout.LayoutParams layoutParams;
            this.currentPage = pageTransition;
            int i2 = 0;
            while (true) {
                LinearLayout[] linearLayoutArr = this.layout;
                if (i2 >= linearLayoutArr.length) {
                    break;
                }
                linearLayoutArr[i2].setAlpha(pageTransition.at(i2));
                i2++;
            }
            float f2 = 0.0f;
            this.closeView.setAlpha(Math.max(this.backdrop[0] != null ? pageTransition.at(2) : 0.0f, this.backdrop[1] != null ? pageTransition.at(1) : 0.0f));
            ImageView imageView = this.closeView;
            TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
            int i3 = 8;
            imageView.setVisibility(((stargiftattributebackdropArr[0] == null || pageTransition.to != 2) && (stargiftattributebackdropArr[1] == null || pageTransition.to != 1)) ? 8 : 0);
            this.optionsView.setAlpha(AndroidUtilities.lerp(false, this.backdrop[0] != null, pageTransition.at(0)));
            this.optionsView.setVisibility((this.backdrop[0] == null || pageTransition.to != 0) ? 8 : 0);
            if (!this.resellPriceViewInProgress) {
                this.resellPriceView.setAlpha(AndroidUtilities.lerp(false, this.hasResellPrice, pageTransition.at(0)));
                this.resellPriceView.setScaleX(AndroidUtilities.lerp(0.4f, this.hasResellPrice ? 1.0f : 0.4f, pageTransition.at(0)));
                this.resellPriceView.setScaleY(AndroidUtilities.lerp(0.4f, this.hasResellPrice ? 1.0f : 0.4f, pageTransition.at(0)));
                TextView textView = this.resellPriceView;
                if (this.hasResellPrice && pageTransition.to == 0) {
                    i3 = 0;
                }
                textView.setVisibility(i3);
            }
            int color = Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider);
            int i4 = 0;
            while (i4 < 2) {
                this.titleView[i4].setTextColor(this.backdrop[Math.min(1, i4)] == null ? color : -1);
                LinkSpanDrawable.LinksTextView linksTextView = this.subtitleView[i4];
                if (i4 == 0 || i4 == 2) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop[i4];
                    i = stargiftattributebackdrop == null ? color : (-16777216) | stargiftattributebackdrop.text_color;
                } else {
                    TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.backdrop;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr2[1];
                    int i5 = stargiftattributebackdrop2 == null ? color : stargiftattributebackdrop2.text_color | (-16777216);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr2[2];
                    i = ColorUtils.blendARGB(i5, stargiftattributebackdrop3 == null ? color : (-16777216) | stargiftattributebackdrop3.text_color, this.toggleBackdrop);
                }
                linksTextView.setTextColor(i);
                if (this.backdrop[i4] != null) {
                    f = 184.0f;
                    z = (AndroidUtilities.dp(184.0f) == this.layoutLayoutParams[i4].topMargin && this.layout[i4].getPaddingBottom() == AndroidUtilities.dp(18.0f)) ? false : true;
                    if (z) {
                        this.layout[i4].setPadding(0, 0, 0, AndroidUtilities.dp(18.0f));
                        layoutParams = this.layoutLayoutParams[i4];
                        layoutParams.topMargin = AndroidUtilities.dp(f);
                    }
                    this.subtitleViewLayoutParams[i4].topMargin = AndroidUtilities.dp(i4 != 1 ? 7.33f : this.backdrop[0] == null ? 9.0f : 5.66f);
                    if (!z) {
                        this.layout[i4].setLayoutParams(this.layoutLayoutParams[i4]);
                        this.subtitleView[i4].setLayoutParams(this.subtitleViewLayoutParams[i4]);
                    }
                    i4++;
                } else {
                    f = 170.0f;
                    z = (AndroidUtilities.dp(170.0f) == this.layoutLayoutParams[i4].topMargin && this.layout[i4].getPaddingBottom() == AndroidUtilities.dp(3.0f)) ? false : true;
                    if (z) {
                        this.layout[i4].setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                        layoutParams = this.layoutLayoutParams[i4];
                        layoutParams.topMargin = AndroidUtilities.dp(f);
                    }
                    this.subtitleViewLayoutParams[i4].topMargin = AndroidUtilities.dp(i4 != 1 ? 7.33f : this.backdrop[0] == null ? 9.0f : 5.66f);
                    if (!z) {
                    }
                    i4++;
                }
            }
            LinkSpanDrawable.LinksTextView linksTextView2 = this.subtitleView[2];
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = this.backdrop[0];
            if (stargiftattributebackdrop4 != null) {
                color = stargiftattributebackdrop4.text_color | (-16777216);
            }
            linksTextView2.setTextColor(color);
            this.imageView[0].setAlpha(this.currentPage.at(0, 2));
            this.imageView[1].setAlpha(pageTransition.at(1) * (1.0f - this.toggleBackdrop));
            this.imageView[2].setAlpha(pageTransition.at(1) * this.toggleBackdrop);
            this.imageLayout.setScaleX(AndroidUtilities.lerp(1.0f, this.wearImageScale, pageTransition.at(2)));
            this.imageLayout.setScaleY(AndroidUtilities.lerp(1.0f, this.wearImageScale, pageTransition.at(2)));
            this.imageLayout.setTranslationX(this.wearImageTx * pageTransition.at(2));
            this.imageLayout.setTranslationY((AndroidUtilities.dp(16.0f) * pageTransition.at(1)) + (this.wearImageTy * pageTransition.at(2)));
            LinearLayout linearLayout = this.layout[2];
            int i6 = pageTransition.from;
            if (i6 != 2 || pageTransition.to != 2) {
                if (i6 == 2) {
                    i6 = pageTransition.to;
                }
                f2 = (-(r0[i6].getMeasuredHeight() - this.layout[2].getMeasuredHeight())) * (1.0f - pageTransition.at(2));
            }
            linearLayout.setTranslationY(f2);
            invalidate();
        }

        public void prepareSwitchPage(PageTransition pageTransition) {
            int i = pageTransition.from;
            if (i != pageTransition.to) {
                RLottieDrawable lottieAnimation = this.imageView[i].getImageReceiver().getLottieAnimation();
                RLottieDrawable lottieAnimation2 = this.imageView[pageTransition.to].getImageReceiver().getLottieAnimation();
                if (lottieAnimation2 == null || lottieAnimation == null) {
                    return;
                }
                lottieAnimation2.setProgress(lottieAnimation.getProgress(), false);
            }
        }

        public void setGift(TL_stars.StarGift starGift, boolean z, boolean z2, boolean z3) {
            Button button;
            this.hasResellPrice = false;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                this.backdrop[0] = (TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
                setPattern(0, (TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
                this.subtitleView[0].setTextSize(1, 13.0f);
                this.buttonsLayout.setVisibility(z ? 0 : 8);
                if (z) {
                    this.buttons[1].set(z2 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(z2 ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), false);
                }
                if (starGift.resell_amount != null) {
                    this.hasResellPrice = true;
                    AmountUtils$Amount resellAmount = starGift.getResellAmount(starGift.resale_ton_only ? AmountUtils$Currency.TON : AmountUtils$Currency.STARS);
                    this.resellPriceView.setText(StarsIntroActivity.replaceStars(resellAmount.currency == AmountUtils$Currency.TON, "⭐️ " + ((Object) StarsIntroActivity.formatStarsAmount(resellAmount.toTl(), 1.0f, ','))));
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop[0];
                    this.resellPriceView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), ColorUtils.blendARGB(stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216), 0.25f)));
                    if (StarGiftSheet.isMine(UserConfig.selectedAccount, DialogObject.getPeerDialogId(starGift.owner_id))) {
                        this.resellPriceView.setOnClickListener(this.onUpdatePriceClick);
                        ScaleStateListAnimator.apply(this.resellPriceView);
                    } else {
                        this.resellPriceView.setOnClickListener(null);
                        ScaleStateListAnimator.reset(this.resellPriceView);
                    }
                }
                if (z) {
                    if (starGift.resell_amount != null) {
                        this.buttons[2].set(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), false);
                        button = this.buttons[2];
                    } else {
                        this.buttons[2].set(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), false);
                        button = this.buttons[2];
                    }
                    button.setOnClickListener(this.onResellClick);
                }
            } else {
                this.backdrop[0] = null;
                setPattern(0, null, false);
                this.subtitleView[0].setTextSize(1, 14.0f);
                this.buttonsLayout.setVisibility(8);
            }
            this.hasLink = z3;
            setBackdropPaint(0, this.backdrop[0]);
            StarsIntroActivity.setGiftImage(this.imageView[0].getImageReceiver(), starGift, NotificationCenter.audioRecordTooShort);
            onSwitchPage(this.currentPage);
        }

        public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
            this.sampleAttributes = arrayList;
            this.models = new BagRandomizer(StarsController.findAttributes(arrayList, TL_stars.starGiftAttributeModel.class));
            this.patterns = new BagRandomizer(StarsController.findAttributes(arrayList, TL_stars.starGiftAttributePattern.class));
            this.backdrops = new BagRandomizer(StarsController.findAttributes(arrayList, TL_stars.starGiftAttributeBackdrop.class));
            this.subtitleView[1].setTextSize(1, 14.0f);
            this.buttonsLayout.setVisibility(8);
            this.toggleBackdrop = 0.0f;
            this.toggled = 0;
            setPattern(1, (TL_stars.starGiftAttributePattern) this.patterns.next(), true);
            StarsIntroActivity.setGiftImage(this.imageView[1].getImageReceiver(), ((TL_stars.starGiftAttributeModel) this.models.next()).document, NotificationCenter.audioRecordTooShort);
            TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.backdrop;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.backdrops.next();
            stargiftattributebackdropArr[1] = stargiftattributebackdrop;
            setBackdropPaint(1, stargiftattributebackdrop);
            StarsIntroActivity.setGiftImage(this.imageView[2].getImageReceiver(), ((TL_stars.starGiftAttributeModel) this.models.getNext()).document, NotificationCenter.audioRecordTooShort);
            AndroidUtilities.cancelRunOnUIThread(this.checkToRotateRunnable);
            AndroidUtilities.runOnUIThread(this.checkToRotateRunnable, 2500L);
            invalidate();
        }

        public void setResellPrice(AmountUtils$Amount amountUtils$Amount) {
            ViewPropertyAnimator listener;
            AnimatorListenerAdapter animatorListenerAdapter;
            Button button;
            int i;
            int i2;
            boolean z = !amountUtils$Amount.isZero();
            this.hasResellPrice = z;
            if (z) {
                this.resellPriceView.setText(StarsIntroActivity.replaceStars(amountUtils$Amount.currency == AmountUtils$Currency.TON, "⭐️ " + ((Object) StarsIntroActivity.formatStarsAmount(amountUtils$Amount.toTl(), 1.0f, ','))));
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop[0];
                this.resellPriceView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), ColorUtils.blendARGB(stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216), 0.25f)));
                this.resellPriceView.setVisibility(0);
                this.resellPriceView.setScaleX(0.4f);
                this.resellPriceView.setScaleY(0.4f);
                this.resellPriceViewInProgress = true;
                listener = this.resellPriceView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stars.StarGiftSheet.TopView.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        TopView.this.resellPriceViewInProgress = false;
                    }
                };
            } else {
                listener = this.resellPriceView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stars.StarGiftSheet.TopView.3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        TopView.this.resellPriceView.setVisibility(8);
                    }
                });
                animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stars.StarGiftSheet.TopView.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        TopView.this.resellPriceViewInProgress = false;
                    }
                };
            }
            listener.setListener(animatorListenerAdapter).start();
            if (this.hasResellPrice) {
                button = this.buttons[2];
                i = R.drawable.filled_gift_sell_off;
                i2 = R.string.Gift2ActionUnlist;
            } else {
                button = this.buttons[2];
                i = R.drawable.filled_gift_sell_on;
                i2 = R.string.Gift2ActionResell;
            }
            button.set(i, LocaleController.getString(i2), true);
            this.buttons[2].setOnClickListener(this.onResellClick);
        }

        public void setText(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
            TextView textView;
            this.titleView[i].setText(charSequence);
            if (i == 0 && !TextUtils.isEmpty(charSequence3)) {
                this.collectionReleasedView.setText(charSequence3);
                this.collectionReleasedView.setVisibility(0);
                this.releasedView.setVisibility(8);
                textView = this.subtitleView[i];
            } else if (i != 0 || TextUtils.isEmpty(charSequence4)) {
                this.subtitleView[i].setText(charSequence2);
                this.subtitleView[i].setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
                this.releasedView.setVisibility(8);
                textView = this.collectionReleasedView;
            } else {
                this.releasedView.setText(charSequence4);
                this.releasedView.setVisibility(0);
                this.collectionReleasedView.setVisibility(8);
                textView = this.subtitleView[i];
            }
            textView.setVisibility(8);
        }

        public void setTransferAvailable(boolean z) {
            this.buttons[0].setVisibility(z ? 0 : 8);
        }

        public void setWearPreview(TLObject tLObject) {
            String lowerCase;
            String str;
            String str2;
            String str3;
            this.wearPreviewObject = tLObject;
            if (tLObject instanceof TLRPC.User) {
                str3 = UserObject.getUserName((TLRPC.User) tLObject);
                str2 = LocaleController.getString(R.string.Online);
            } else {
                if (!(tLObject instanceof TLRPC.Chat)) {
                    return;
                }
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                String str4 = chat == null ? "" : chat.title;
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                int i = chat.participants_count;
                if (isChannelAndNotMegaGroup) {
                    if (i > 1) {
                        str = "Subscribers";
                        lowerCase = LocaleController.formatPluralStringComma(str, i);
                        String str5 = str4;
                        str2 = lowerCase;
                        str3 = str5;
                    } else {
                        lowerCase = LocaleController.getString(R.string.DiscussChannel);
                        String str52 = str4;
                        str2 = lowerCase;
                        str3 = str52;
                    }
                } else if (i > 1) {
                    str = "Members";
                    lowerCase = LocaleController.formatPluralStringComma(str, i);
                    String str522 = str4;
                    str2 = lowerCase;
                    str3 = str522;
                } else {
                    lowerCase = LocaleController.getString(R.string.AccDescrGroup).toLowerCase();
                    String str5222 = str4;
                    str2 = lowerCase;
                    str3 = str5222;
                }
            }
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(tLObject);
            this.avatarView.setForUserOrChat(tLObject, avatarDrawable);
            this.titleView[2].setText(str3);
            this.subtitleView[2].setText(str2);
            updateWearImageTranslation();
            onSwitchPage(this.currentPage);
        }
    }

    public static class UpgradeIcon extends CompatDrawable {
        private final Path arrow;
        private final long start;
        private final Paint strokePaint;
        private final View view;

        public UpgradeIcon(View view, int i) {
            super(view);
            Paint paint = new Paint(1);
            this.strokePaint = paint;
            Path path = new Path();
            this.arrow = path;
            this.start = System.currentTimeMillis();
            this.view = view;
            this.paint.setColor(-1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setColor(i);
            path.rewind();
            path.moveTo(-AndroidUtilities.dpf2(2.91f), AndroidUtilities.dpf2(1.08f));
            path.lineTo(0.0f, -AndroidUtilities.dpf2(1.08f));
            path.lineTo(AndroidUtilities.dpf2(2.91f), AndroidUtilities.dpf2(1.08f));
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, this.paint);
            float currentTimeMillis = ((System.currentTimeMillis() - this.start) % 400) / 400.0f;
            this.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
            canvas.save();
            canvas.translate(getBounds().centerX(), getBounds().centerY() - (((AndroidUtilities.dpf2(2.16f) * 3.0f) + (AndroidUtilities.dpf2(1.166f) * 2.0f)) / 2.0f));
            int i = 0;
            while (i < 4) {
                float f = i == 0 ? 1.0f - currentTimeMillis : i == 3 ? currentTimeMillis : 1.0f;
                this.strokePaint.setAlpha((int) (255.0f * f));
                canvas.save();
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, f);
                canvas.scale(lerp, lerp);
                canvas.drawPath(this.arrow, this.strokePaint);
                canvas.restore();
                canvas.translate(0.0f, AndroidUtilities.dpf2(3.3260002f) * f);
                i++;
            }
            canvas.restore();
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(18.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(18.0f);
        }
    }

    public StarGiftSheet(final Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        super(context, null, false, false, false, resourcesProvider);
        this.heights = new int[2];
        this.title = "";
        this.currentPage = new PageTransition(0, 0, 1.0f);
        this.firstSet = true;
        this.currentAccount = i;
        this.dialogId = j;
        this.topPadding = 0.2f;
        this.containerView = new FrameLayout(context);
        this.container = new ContainerView(context);
        1 r4 = new 1(context);
        this.viewPager = r4;
        r4.setAdapter(new ViewPagerFixed.Adapter() { // from class: org.telegram.ui.Stars.StarGiftSheet.2
            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public void bindView(View view, int i2, int i3) {
                StarGiftSheet starGiftSheet;
                if (i3 == 0) {
                    StarGiftSheet.this.setupNeighbour(false);
                    if (StarGiftSheet.this.left == null) {
                        return;
                    } else {
                        starGiftSheet = StarGiftSheet.this.left;
                    }
                } else {
                    if (i3 != 2) {
                        return;
                    }
                    StarGiftSheet.this.setupNeighbour(true);
                    if (StarGiftSheet.this.right == null) {
                        return;
                    } else {
                        starGiftSheet = StarGiftSheet.this.right;
                    }
                }
                ContainerView containerView = starGiftSheet.container;
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(containerView);
                frameLayout.addView(containerView);
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public View createView(int i2) {
                StarGiftSheet starGiftSheet;
                if (i2 == 0) {
                    StarGiftSheet.this.setupNeighbour(false);
                    if (StarGiftSheet.this.left == null) {
                        return null;
                    }
                    starGiftSheet = StarGiftSheet.this.left;
                } else if (i2 == 1) {
                    starGiftSheet = StarGiftSheet.this;
                } else {
                    if (i2 != 2) {
                        return null;
                    }
                    StarGiftSheet.this.setupNeighbour(true);
                    if (StarGiftSheet.this.right == null) {
                        return null;
                    }
                    starGiftSheet = StarGiftSheet.this.right;
                }
                ContainerView containerView = starGiftSheet.container;
                AndroidUtilities.removeFromParent(containerView);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(containerView, LayoutHelper.createFrame(-1, -1, 119));
                return frameLayout;
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public int getItemCount() {
                return (StarGiftSheet.this.hasNeighbour(false) ? 1 : 0) + 1 + (StarGiftSheet.this.hasNeighbour(true) ? 1 : 0);
            }

            @Override // org.telegram.ui.Components.ViewPagerFixed.Adapter
            public int getItemViewType(int i2) {
                return (i2 - (StarGiftSheet.this.hasNeighbour(false) ? 1 : 0)) + 1;
            }
        });
        updateViewPager();
        View view = new View(context);
        this.bottomView = view;
        int i2 = Theme.key_dialogBackground;
        view.setBackgroundColor(getThemedColor(i2));
        this.containerView.addView(view, LayoutHelper.createFrame(-1, 50, 80));
        this.containerView.addView(this.viewPager, LayoutHelper.createFrame(-1, -1, 119));
        fixNavigationBar(getThemedColor(i2));
        AndroidUtilities.removeFromParent(this.recyclerListView);
        this.container.addView(this.recyclerListView, LayoutHelper.createFrame(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.infoLayout = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(this.backgroundPaddingLeft + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), this.backgroundPaddingLeft + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(68.0f));
        this.container.addView(linearLayout, LayoutHelper.createFrame(-1, -1, 55));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        this.beforeTableTextView = linksTextView;
        int i3 = Theme.key_dialogTextGray2;
        linksTextView.setTextColor(Theme.getColor(i3, resourcesProvider));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setGravity(17);
        linksTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i4 = Theme.key_chat_messageLinkIn;
        linksTextView.setLinkTextColor(Theme.getColor(i4, resourcesProvider));
        linksTextView.setDisablePaddingsOffsetY(true);
        linearLayout.addView(linksTextView, LayoutHelper.createLinear(-2, -2, 1, 5, -4, 5, 16));
        linksTextView.setVisibility(8);
        TableView tableView = new TableView(context, resourcesProvider);
        this.tableView = tableView;
        linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 12.0f));
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        this.afterTableTextView = linksTextView2;
        linksTextView2.setTextColor(Theme.getColor(i3, resourcesProvider));
        linksTextView2.setTextSize(1, 14.0f);
        linksTextView2.setGravity(17);
        linksTextView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linksTextView2.setLinkTextColor(Theme.getColor(i4, resourcesProvider));
        linksTextView2.setDisablePaddingsOffsetY(true);
        linksTextView2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        linearLayout.addView(linksTextView2, LayoutHelper.createLinear(-2, -2, 1, 5, 2, 5, 8));
        linksTextView2.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.upgradeLayout = linearLayout2;
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        this.container.addView(linearLayout2, LayoutHelper.createFrame(-1, -1, 55));
        AffiliateProgramFragment.FeatureCell[] featureCellArr = {r10, r6, r6};
        this.upgradeFeatureCells = featureCellArr;
        AffiliateProgramFragment.FeatureCell featureCell = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        int i5 = R.drawable.menu_feature_unique;
        featureCell.set(i5, LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.Gift2UpgradeFeature1Text));
        linearLayout2.addView(featureCellArr[0], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell2 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        featureCell2.set(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2UpgradeFeature2Title), LocaleController.getString(R.string.Gift2UpgradeFeature2Text));
        linearLayout2.addView(featureCellArr[1], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell3 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        featureCell3.set(R.drawable.menu_feature_tradable, LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.Gift2UpgradeFeature3Text));
        linearLayout2.addView(featureCellArr[2], LayoutHelper.createLinear(-1, -2));
        View view2 = new View(context);
        this.checkboxSeparator = view2;
        int i6 = Theme.key_divider;
        view2.setBackgroundColor(Theme.getColor(i6, resourcesProvider));
        linearLayout2.addView(view2, LayoutHelper.createLinear(-2, 1.0f / AndroidUtilities.density, 7, 17, -4, 17, 6));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.checkboxLayout = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 6, 6));
        CheckBox2 checkBox2 = new CheckBox2(context, 24, resourcesProvider);
        this.checkbox = checkBox2;
        checkBox2.setColor(Theme.key_radioBackgroundChecked, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
        checkBox2.setDrawUnchecked(true);
        checkBox2.setChecked(false, false);
        checkBox2.setDrawBackgroundAsArc(10);
        linearLayout3.addView(checkBox2, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.checkboxTextView = textView;
        int i7 = Theme.key_dialogTextBlack;
        textView.setTextColor(getThemedColor(i7));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout3.addView(textView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
        linearLayout2.addView(linearLayout3, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 4));
        ScaleStateListAnimator.apply(linearLayout3, 0.025f, 1.5f);
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.wearLayout = linearLayout4;
        linearLayout4.setOrientation(1);
        linearLayout4.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        this.container.addView(linearLayout4, LayoutHelper.createFrame(-1, -1, 55));
        TextView textView2 = new TextView(context);
        this.wearTitle = textView2;
        textView2.setTextColor(Theme.getColor(i7, resourcesProvider));
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        linearLayout4.addView(textView2, LayoutHelper.createLinear(-1, -2, 7, 20, 0, 20, 0));
        TextView textView3 = new TextView(context);
        this.wearSubtitle = textView3;
        textView3.setTextColor(Theme.getColor(i7, resourcesProvider));
        textView3.setTextSize(1, 14.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        linearLayout4.addView(textView3, LayoutHelper.createLinear(-1, -2, 7, 20, 6, 20, 24));
        AffiliateProgramFragment.FeatureCell[] featureCellArr2 = {r3, r3, r3};
        this.wearFeatureCells = featureCellArr2;
        AffiliateProgramFragment.FeatureCell featureCell4 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        featureCell4.set(i5, LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text));
        linearLayout4.addView(featureCellArr2[0], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell5 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        featureCell5.set(R.drawable.menu_feature_cover, LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text));
        linearLayout4.addView(featureCellArr2[1], LayoutHelper.createLinear(-1, -2));
        AffiliateProgramFragment.FeatureCell featureCell6 = new AffiliateProgramFragment.FeatureCell(context, resourcesProvider);
        featureCell6.set(R.drawable.menu_verification, LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text));
        linearLayout4.addView(featureCellArr2[2], LayoutHelper.createLinear(-1, -2));
        linearLayout.setAlpha(1.0f);
        linearLayout2.setAlpha(0.0f);
        linearLayout4.setAlpha(0.0f);
        TopView topView = new TopView(context, resourcesProvider, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.onBackPressed();
            }
        }, new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                StarGiftSheet.this.onMenuPressed(view3);
            }
        }, new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                StarGiftSheet.this.lambda$new$0(view3);
            }
        }, new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                StarGiftSheet.this.onWearPressed(view3);
            }
        }, new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                StarGiftSheet.this.onSharePressed(view3);
            }
        }, new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                StarGiftSheet.this.onResellPressed(view3);
            }
        }, new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                StarGiftSheet.this.onUpdatePriceClick(view3);
            }
        });
        this.topView = topView;
        int i8 = this.backgroundPaddingLeft;
        topView.setPadding(i8, 0, i8, 0);
        this.container.addView(topView, LayoutHelper.createFrame(-1, -2, 55));
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        this.reverseLayout = true;
        linearLayoutManager.setReverseLayout(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonContainer = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i2));
        View view3 = new View(context);
        this.buttonShadow = view3;
        view3.setBackgroundColor(getThemedColor(i6));
        view3.setAlpha(0.0f);
        frameLayout.addView(view3, LayoutHelper.createFrame(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        this.button = buttonWithCounterView;
        buttonWithCounterView.setText(LocaleController.getString(R.string.OK), false);
        buttonWithCounterView.setSubText(null, false);
        FrameLayout.LayoutParams createFrame = LayoutHelper.createFrame(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        createFrame.leftMargin = this.backgroundPaddingLeft + AndroidUtilities.dp(14.0f);
        createFrame.rightMargin = this.backgroundPaddingLeft + AndroidUtilities.dp(14.0f);
        frameLayout.addView(buttonWithCounterView, createFrame);
        this.container.addView(frameLayout, LayoutHelper.createFrame(-1, 72, 87));
        this.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: org.telegram.ui.Stars.StarGiftSheet.3
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i9, int i10) {
                StarGiftSheet.this.container.updateTranslations();
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                StarGiftSheet.this.lambda$new$1(view4);
            }
        });
        FireworksOverlay fireworksOverlay = new FireworksOverlay(context);
        this.fireworksOverlay = fireworksOverlay;
        this.container.addView(fireworksOverlay, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.bottomBulletinContainer = frameLayout2;
        frameLayout2.setPadding(this.backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0, this.backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0);
        this.container.addView(frameLayout2, LayoutHelper.createFrame(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        AndroidUtilities.removeFromParent(this.actionBar);
        this.container.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    private void addAttributeRow(final TL_stars.StarGiftAttribute starGiftAttribute) {
        int i;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            i = R.string.Gift2AttributeModel;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            i = R.string.Gift2AttributeBackdrop;
        } else if (!(starGiftAttribute instanceof TL_stars.starGiftAttributePattern)) {
            return;
        } else {
            i = R.string.Gift2AttributeSymbol;
        }
        final ButtonSpan.TextViewButtons[] textViewButtonsArr = new ButtonSpan.TextViewButtons[1];
        textViewButtonsArr[0] = (ButtonSpan.TextViewButtons) ((TableView.TableRowContent) this.tableView.addRow(LocaleController.getString(i), starGiftAttribute.name, AffiliateProgramFragment.percents(starGiftAttribute.rarity_permille), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda71
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$addAttributeRow$32(starGiftAttribute, textViewButtonsArr);
            }
        }).getChildAt(1)).getChildAt(0);
    }

    private boolean applyNewGiftFromUpdates(TLRPC.Updates updates) {
        TLRPC.TL_updateNewMessage tL_updateNewMessage;
        if (updates == null) {
            return false;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TLRPC.TL_updateNewMessage) {
            tL_updateNewMessage = (TLRPC.TL_updateNewMessage) update;
        } else {
            if (updates.updates != null) {
                for (int i = 0; i < updates.updates.size(); i++) {
                    TLRPC.Update update2 = updates.updates.get(i);
                    if (update2 instanceof TLRPC.TL_updateNewMessage) {
                        tL_updateNewMessage = (TLRPC.TL_updateNewMessage) update2;
                        break;
                    }
                }
            }
            tL_updateNewMessage = null;
        }
        if (tL_updateNewMessage == null) {
            return false;
        }
        this.savedStarGift = null;
        this.myProfile = false;
        MessageObject messageObject = new MessageObject(this.currentAccount, tL_updateNewMessage.message, false, false);
        messageObject.setType();
        set(messageObject);
        return true;
    }

    private boolean canConvert() {
        TLRPC.Peer peer;
        if (getInputStarGift() == null) {
            return false;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return false;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            return ((!(tL_messageActionStarGift.peer != null) && (!messageObject.isOutOwner() || ((this.messageObject.getDialogId() > UserConfig.getInstance(this.currentAccount).getClientUserId() ? 1 : (this.messageObject.getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.messageObject.messageOwner.date) > 0;
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift == null) {
            return false;
        }
        int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
        if (!isMineWithActions(this.currentAccount, this.dialogId)) {
            return false;
        }
        int i = this.savedStarGift.flags;
        return ((((this.dialogId > 0L ? 1 : (this.dialogId == 0L ? 0 : -1)) < 0 ? 2048 : 8) & i) == 0 || (i & 16) == 0 || (i & 2) == 0 || currentTime <= 0) ? false : true;
    }

    private boolean canSomeoneConvert() {
        TLRPC.Peer peer;
        if (getInputStarGift() == null) {
            return false;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject == null) {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift == null) {
                return false;
            }
            int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
            if (!isMineWithActions(this.currentAccount, this.dialogId)) {
                return false;
            }
            int i = this.savedStarGift.flags;
            return ((((this.dialogId > 0L ? 1 : (this.dialogId == 0L ? 0 : -1)) < 0 ? 2048 : 8) & i) == 0 || (i & 16) == 0 || (i & 2) == 0 || currentTime <= 0) ? false : true;
        }
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
            return false;
        }
        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
        boolean z = tL_messageActionStarGift.peer != null;
        messageObject.isOutOwner();
        this.messageObject.getDialogId();
        UserConfig.getInstance(this.currentAccount).getClientUserId();
        return (!z || ((peer = tL_messageActionStarGift.peer) != null && isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.messageObject.messageOwner.date) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void convert() {
        int i;
        long peerDialogId;
        long j;
        long j2;
        final long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        if (inputStarGift == null) {
            return;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            i = messageObject.messageOwner.date;
            boolean isOutOwner = messageObject.isOutOwner();
            MessageObject messageObject2 = this.messageObject;
            TLRPC.Message message = messageObject2.messageOwner;
            if (message == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            TLRPC.Peer peer = tL_messageActionStarGift.peer;
            j2 = peer != null ? DialogObject.getPeerDialogId(peer) : isOutOwner ? messageObject2.getDialogId() : clientUserId;
            TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
            peerDialogId = peer2 != null ? DialogObject.getPeerDialogId(peer2) : isOutOwner ? clientUserId : this.messageObject.getDialogId();
            j = tL_messageActionStarGift.convert_stars;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift == null) {
                return;
            }
            i = savedStarGift.date;
            peerDialogId = ((savedStarGift.flags & 2) == 0 || savedStarGift.name_hidden) ? 2666000L : DialogObject.getPeerDialogId(savedStarGift.from_id);
            j = this.savedStarGift.convert_stars;
            j2 = this.dialogId;
        }
        final long j3 = j;
        final long j4 = j2;
        new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.Gift2ConvertTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2ConvertText2", Math.max(1, (MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - i)) / 86400), (UserObject.isService(peerDialogId) || peerDialogId == UserObject.ANONYMOUS) ? LocaleController.getString(R.string.StarsTransactionHidden) : DialogObject.getShortName(peerDialogId), LocaleController.formatPluralStringComma("Gift2ConvertStars", (int) j3)))).setPositiveButton(LocaleController.getString(R.string.Gift2ConvertButton), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda53
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i2) {
                StarGiftSheet.this.lambda$convert$64(inputStarGift, j4, clientUserId, j3, alertDialog, i2);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
    }

    private void doUpgrade() {
        TL_stars.InputSavedStarGift inputStarGift;
        long j;
        if (this.button.isLoading() || (inputStarGift = getInputStarGift()) == null) {
            return;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            } else {
                j = ((TLRPC.TL_messageActionStarGift) messageAction).upgrade_stars;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift == null) {
                return;
            } else {
                j = savedStarGift.upgrade_stars;
            }
        }
        final long j2 = 0;
        if (j > 0 || this.upgrade_form != null) {
            this.button.setLoading(true);
            if (j > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = this.checkbox.isChecked();
                upgradestargift.stargift = inputStarGift;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(upgradestargift, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda112
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        StarGiftSheet.this.lambda$doUpgrade$81(tLObject, tL_error);
                    }
                });
                return;
            }
            final StarsController starsController = StarsController.getInstance(this.currentAccount);
            if (!starsController.balanceAvailable()) {
                starsController.getBalance(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda113
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$doUpgrade$82(starsController);
                    }
                });
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
            tL_inputInvoiceStarGiftUpgrade.keep_original_details = this.checkbox.isChecked();
            tL_inputInvoiceStarGiftUpgrade.stargift = inputStarGift;
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            TLRPC.PaymentForm paymentForm = this.upgrade_form;
            tL_payments_sendStarsForm.form_id = paymentForm.form_id;
            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            Iterator<TLRPC.TL_labeledPrice> it = paymentForm.invoice.prices.iterator();
            while (it.hasNext()) {
                j2 += it.next().amount;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda114
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarGiftSheet.this.lambda$doUpgrade$88(j2, tLObject, tL_error);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getBottomView() {
        return this.currentPage.to(1) ? this.upgradeLayout : this.currentPage.to(2) ? this.wearLayout : this.infoLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x006a, code lost:
    
        if (r0 != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long getDialogId() {
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TLRPC.Peer peer;
        MessageObject messageObject = this.messageObject;
        if (messageObject == null) {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                    return this.dialogId;
                }
                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            } else {
                tL_starGiftUnique = this.slugStarGift;
            }
            return DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return 0L;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
            return peer2 != null ? DialogObject.getPeerDialogId(peer2) : messageObject.isOutOwner() ? this.messageObject.getDialogId() : UserConfig.getInstance(this.currentAccount).getClientUserId();
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
            if ((starGift2 instanceof TL_stars.TL_starGiftUnique) && (peer = starGift2.owner_id) != null) {
                return DialogObject.getPeerDialogId(peer);
            }
            TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
            if (peer3 != null) {
                return DialogObject.getPeerDialogId(peer3);
            }
        }
        return 0L;
    }

    private BaseFragment getDummyFragment() {
        return new BaseFragment() { // from class: org.telegram.ui.Stars.StarGiftSheet.4
            @Override // org.telegram.ui.ActionBar.BaseFragment
            public Context getContext() {
                return StarGiftSheet.this.getContext();
            }

            @Override // org.telegram.ui.ActionBar.BaseFragment
            public int getCurrentAccount() {
                return this.currentAccount;
            }

            @Override // org.telegram.ui.ActionBar.BaseFragment
            public Activity getParentActivity() {
                for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            }

            @Override // org.telegram.ui.ActionBar.BaseFragment
            public Dialog showDialog(Dialog dialog) {
                dialog.show();
                return dialog;
            }
        };
    }

    public static String getGiftName(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return (!(starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(starGift.title)) ? LocaleController.getString(R.string.Gift2Gift) : starGift.title;
        }
        return ((TL_stars.TL_starGiftUnique) starGift).title + " #" + LocaleController.formatNumber(r3.num, ',');
    }

    private TL_stars.InputSavedStarGift getInputStarGift() {
        int i;
        TLRPC.Message message;
        TLRPC.Message message2;
        long j;
        TLRPC.Message message3;
        if (this.dialogId < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            MessageObject messageObject = this.messageObject;
            if (messageObject == null || (message3 = messageObject.messageOwner) == null) {
                TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
                if (savedStarGift == null) {
                    if (this.slugStarGift == null || TextUtils.isEmpty(this.slug)) {
                        return tL_inputSavedStarGiftChat;
                    }
                    TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = this.slug;
                    return tL_inputSavedStarGiftSlug;
                }
                if ((savedStarGift.flags & 2048) == 0) {
                    return null;
                }
                j = savedStarGift.saved_id;
            } else {
                TLRPC.MessageAction messageAction = message3.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    if ((tL_messageActionStarGift.flags & 4096) == 0) {
                        return null;
                    }
                    j = tL_messageActionStarGift.saved_id;
                } else {
                    if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        return null;
                    }
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    if ((tL_messageActionStarGiftUnique.flags & 128) == 0) {
                        return null;
                    }
                    j = tL_messageActionStarGiftUnique.saved_id;
                }
            }
            tL_inputSavedStarGiftChat.saved_id = j;
            return tL_inputSavedStarGiftChat;
        }
        MessageObject messageObject2 = this.messageObject;
        if (messageObject2 != null && (message2 = messageObject2.messageOwner) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(tL_messageActionStarGift2.peer);
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat3.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(tL_messageActionStarGiftUnique2.peer);
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        MessageObject messageObject3 = this.messageObject;
        if (messageObject3 != null) {
            i = messageObject3.getId();
        } else {
            TL_stars.SavedStarGift savedStarGift2 = this.savedStarGift;
            if (savedStarGift2 == null) {
                if (this.slugStarGift == null || TextUtils.isEmpty(this.slug)) {
                    return tL_inputSavedStarGiftUser;
                }
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug2.slug = this.slug;
                return tL_inputSavedStarGiftSlug2;
            }
            i = savedStarGift2.msg_id;
        }
        tL_inputSavedStarGiftUser.msg_id = i;
        return tL_inputSavedStarGiftUser;
    }

    private String getLink() {
        TL_stars.StarGift gift = getGift();
        if (!(gift instanceof TL_stars.TL_starGiftUnique) || gift.slug == null) {
            return null;
        }
        return MessagesController.getInstance(this.currentAccount).linkPrefix + "/nft/" + gift.slug;
    }

    private int getListPosition() {
        StarsController.IGiftsList iGiftsList = this.giftsList;
        if (iGiftsList == null) {
            return -1;
        }
        Object obj = this.savedStarGift;
        if (obj != null || (obj = this.slugStarGift) != null) {
            int indexOf = iGiftsList.indexOf(obj);
            if (indexOf >= 0) {
                return indexOf;
            }
            for (int i = 0; i < this.giftsList.getLoadedCount(); i++) {
                Object obj2 = this.giftsList.get(i);
                if (obj2 instanceof TL_stars.SavedStarGift) {
                    if (eq(this.savedStarGift, (TL_stars.SavedStarGift) obj2)) {
                        return i;
                    }
                } else if ((obj2 instanceof TL_stars.TL_starGiftUnique) && eq(this.slugStarGift, (TL_stars.TL_starGiftUnique) obj2)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TL_stars.SavedStarGift getNeighbourSavedGift(boolean z) {
        int listPosition = getListPosition();
        if (listPosition < 0) {
            return null;
        }
        int i = listPosition + (z ? 1 : -1);
        StarsController.IGiftsList iGiftsList = this.giftsList;
        Object obj = (iGiftsList == null || i < 0 || i >= iGiftsList.getLoadedCount()) ? null : this.giftsList.get(i);
        if (obj instanceof TL_stars.SavedStarGift) {
            return (TL_stars.SavedStarGift) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TL_stars.TL_starGiftUnique getNeighbourSlugGift(boolean z) {
        int listPosition = getListPosition();
        if (listPosition < 0) {
            return null;
        }
        int i = listPosition + (z ? 1 : -1);
        StarsController.IGiftsList iGiftsList = this.giftsList;
        Object obj = (iGiftsList == null || i < 0 || i >= iGiftsList.getLoadedCount()) ? null : this.giftsList.get(i);
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasNeighbour(boolean z) {
        return (getNeighbourSavedGift(z) == null && getNeighbourSlugGift(z) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initTONTransfer, reason: merged with bridge method [inline-methods] */
    public void lambda$openTransfer$89(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final TwoStepVerificationActivity twoStepVerificationActivity) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl = new TL_stars.getStarGiftWithdrawalUrl();
        TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        getstargiftwithdrawalurl.stargift = inputStarGift;
        if (inputStarGift == null) {
            return;
        }
        getstargiftwithdrawalurl.password = inputCheckPasswordSRP;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftwithdrawalurl, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda121
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$initTONTransfer$106(twoStepVerificationActivity, tLObject, tL_error);
            }
        });
    }

    public static boolean isMine(int i, long j) {
        return j >= 0 ? UserConfig.getInstance(i).getClientUserId() == j : ChatObject.canUserDoAction(MessagesController.getInstance(i).getChat(Long.valueOf(-j)), 5);
    }

    public static boolean isMineWithActions(int i, long j) {
        if (j >= 0) {
            return UserConfig.getInstance(i).getClientUserId() == j;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        return chat != null && chat.creator;
    }

    public static boolean isWorn(int i, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        long peerDialogId = DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
        if (peerDialogId == 0) {
            return false;
        }
        MessagesController messagesController = MessagesController.getInstance(i);
        if (peerDialogId > 0) {
            TLRPC.User user = messagesController.getUser(Long.valueOf(peerDialogId));
            if (user == null) {
                return false;
            }
            TLRPC.EmojiStatus emojiStatus = user.emoji_status;
            return (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_starGiftUnique.id;
        }
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerDialogId));
        if (chat == null) {
            return false;
        }
        TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
        return (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addAttributeRow$32(TL_stars.StarGiftAttribute starGiftAttribute, ButtonSpan.TextViewButtons[] textViewButtonsArr) {
        showHint(LocaleController.formatString(R.string.Gift2RarityHint, AffiliateProgramFragment.percents(starGiftAttribute.rarity_permille)), textViewButtonsArr[0], false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$convert$60(StarsIntroActivity starsIntroActivity, long j) {
        BulletinFactory.of(starsIntroActivity).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j)).show(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$convert$61(StatisticActivity statisticActivity, long j) {
        BulletinFactory.of(statisticActivity).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) j)).show(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convert$62(AlertDialog alertDialog, TLObject tLObject, long j, long j2, final long j3, TLRPC.TL_error tL_error) {
        alertDialog.dismissUnless(400L);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            getBulletinFactory().createErrorBulletin(tL_error != null ? LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text) : LocaleController.getString(R.string.UnknownError)).show(false);
            return;
        }
        lambda$new$0();
        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(j);
        if (j < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j);
            bundle.putBoolean("start_from_monetization", true);
            final StatisticActivity statisticActivity = new StatisticActivity(bundle);
            BotStarsController.getInstance(this.currentAccount).invalidateStarsBalance(j);
            BotStarsController.getInstance(this.currentAccount).invalidateTransactions(j, true);
            statisticActivity.whenFullyVisible(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda118
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.lambda$convert$61(StatisticActivity.this, j3);
                }
            });
            safeLastFragment.presentFragment(statisticActivity);
            return;
        }
        TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j2);
        if (userFull != null) {
            int max = Math.max(0, userFull.stargifts_count - 1);
            userFull.stargifts_count = max;
            if (max <= 0) {
                userFull.flags2 &= -257;
            }
        }
        StarsController.getInstance(this.currentAccount).invalidateBalance();
        StarsController.getInstance(this.currentAccount).invalidateTransactions(true);
        if (safeLastFragment instanceof StarsIntroActivity) {
            BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j3)).show(true);
            return;
        }
        final StarsIntroActivity starsIntroActivity = new StarsIntroActivity();
        starsIntroActivity.whenFullyVisible(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda117
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.lambda$convert$60(StarsIntroActivity.this, j3);
            }
        });
        safeLastFragment.presentFragment(starsIntroActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convert$63(final AlertDialog alertDialog, final long j, final long j2, final long j3, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda102
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$convert$62(alertDialog, tLObject, j, j2, j3, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convert$64(TL_stars.InputSavedStarGift inputSavedStarGift, final long j, final long j2, final long j3, AlertDialog alertDialog, int i) {
        final AlertDialog alertDialog2 = new AlertDialog(ApplicationLoader.applicationContext, 3);
        alertDialog2.showDelayed(500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(convertstargift, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda88
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$convert$63(alertDialog2, j, j2, j3, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$107(ChatActivity chatActivity, long j) {
        BulletinFactory.of(chatActivity).createSimpleBulletin(R.raw.forward, LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, getGiftName(), DialogObject.getShortName(j)))).ignoreDetach().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$108(Utilities.Callback callback, TLRPC.TL_error tL_error, TLObject tLObject, final long j, long j2) {
        if (callback != null) {
            callback.run(tL_error);
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            if (!(tLObject instanceof TLRPC.Updates)) {
                BulletinFactory.of(safeLastFragment).showForError(tL_error);
            } else if (j < 0 || j2 < 0) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.forward, LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, getGiftName(), DialogObject.getShortName(j)))).ignoreDetach().show();
            } else {
                final ChatActivity of = ChatActivity.of(j);
                of.whenFullyVisible(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda116
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$doTransfer$107(of, j);
                    }
                });
                safeLastFragment.presentFragment(of);
            }
        }
        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(j);
        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$109(final Utilities.Callback callback, final long j, final long j2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda101
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doTransfer$108(callback, tL_error, tLObject, j, j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$110(StarsController starsController, long j, Utilities.Callback callback) {
        if (starsController.balanceAvailable()) {
            doTransfer(j, callback);
        } else {
            getBulletinFactory().createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE")).ignoreDetach().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$111(ChatActivity chatActivity, long j) {
        BulletinFactory.of(chatActivity).createSimpleBulletin(R.raw.forward, LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, getGiftName(), DialogObject.getShortName(j)))).ignoreDetach().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$112(TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
        MessagesController.getInstance(this.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$113(boolean[] zArr, long j, Utilities.Callback callback) {
        zArr[0] = true;
        this.button.setLoading(false);
        doTransfer(j, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$114(DialogInterface dialogInterface) {
        this.button.setLoading(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$115(long j, final long j2, final Utilities.Callback callback) {
        final boolean[] zArr = {false};
        StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(getContext(), this.resourcesProvider, j, 11, null, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doTransfer$113(zArr, j2, callback);
            }
        });
        starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                StarGiftSheet.this.lambda$doTransfer$114(dialogInterface);
            }
        });
        starsNeededSheet.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$116(TLObject tLObject, final long j, long j2, final Utilities.Callback callback, TLRPC.TL_error tL_error, final long j3) {
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
                if (callback != null) {
                    callback.run(tL_error);
                }
                getBulletinFactory().showForError(tL_error);
                return;
            } else if (MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
                StarsController.getInstance(this.currentAccount).invalidateBalance(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda132
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$doTransfer$115(j3, j, callback);
                    }
                });
                return;
            } else {
                this.button.setLoading(false);
                StarsController.showNoSupportDialog(getContext(), this.resourcesProvider);
                return;
            }
        }
        final TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
        StarsController.getInstance(this.currentAccount).invalidateTransactions(false);
        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(j);
        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(j2);
        StarsController.getInstance(this.currentAccount).invalidateBalance();
        if (callback != null) {
            callback.run(null);
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            if (j < 0 || j2 < 0) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.forward, LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, getGiftName(), DialogObject.getShortName(j)))).ignoreDetach().show();
            } else {
                final ChatActivity of = ChatActivity.of(j);
                of.whenFullyVisible(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda130
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$doTransfer$111(of, j);
                    }
                });
                safeLastFragment.presentFragment(of);
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda131
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doTransfer$112(tL_payments_paymentResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$117(final long j, final long j2, final Utilities.Callback callback, final long j3, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda124
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doTransfer$116(tLObject, j, j2, callback, tL_error, j3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$118(TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, final long j, final long j2, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            if (callback != null) {
                callback.run(tL_error);
            }
            getBulletinFactory().makeForError(tL_error).ignoreDetach().show();
            return;
        }
        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(paymentForm.users, false);
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer;
        Iterator<TLRPC.TL_labeledPrice> it = paymentForm.invoice.prices.iterator();
        final long j3 = 0;
        while (it.hasNext()) {
            j3 += it.next().amount;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda122
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                StarGiftSheet.this.lambda$doTransfer$117(j, j2, callback, j3, tLObject2, tL_error2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doTransfer$119(final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, final long j, final long j2, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda106
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doTransfer$118(tLObject, tL_inputInvoiceStarGiftTransfer, j, j2, callback, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$79(TLObject tLObject) {
        MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$80(TLRPC.TL_error tL_error, final TLObject tLObject) {
        String str;
        if (tL_error != null || !(tLObject instanceof TLRPC.Updates)) {
            getBulletinFactory().showForError(tL_error);
            return;
        }
        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(getDialogId());
        if (!applyNewGiftFromUpdates((TLRPC.Updates) tLObject)) {
            lambda$new$0();
            return;
        }
        this.button.setLoading(false);
        this.fireworksOverlay.start(true);
        switchPage(0, true);
        if (getGift() != null) {
            str = getGift().title + " #" + LocaleController.formatNumber(getGift().num, ',');
        } else {
            str = "";
        }
        getBulletinFactory().createSimpleBulletin(R.raw.gift_upgrade, LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str))).setDuration(5000).ignoreDetach().show();
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda125
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doUpgrade$79(tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$81(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda123
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doUpgrade$80(tL_error, tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$82(StarsController starsController) {
        if (!starsController.balanceAvailable()) {
            getBulletinFactory().createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE")).ignoreDetach().show();
        } else {
            this.button.setLoading(false);
            doUpgrade();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$83(TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
        MessagesController.getInstance(this.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$84(boolean[] zArr) {
        zArr[0] = true;
        this.button.setLoading(false);
        doUpgrade();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$85(DialogInterface dialogInterface) {
        this.button.setLoading(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$86(long j) {
        final boolean[] zArr = {false};
        StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(getContext(), this.resourcesProvider, j, 10, null, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda135
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doUpgrade$84(zArr);
            }
        });
        starsNeededSheet.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda136
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                StarGiftSheet.this.lambda$doUpgrade$85(dialogInterface);
            }
        });
        starsNeededSheet.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$87(TLObject tLObject, TLRPC.TL_error tL_error, final long j) {
        String str;
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
                getBulletinFactory().showForError(tL_error);
                return;
            } else if (MessagesController.getInstance(this.currentAccount).starsPurchaseAvailable()) {
                StarsController.getInstance(this.currentAccount).invalidateBalance(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda127
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$doUpgrade$86(j);
                    }
                });
                return;
            } else {
                this.button.setLoading(false);
                StarsController.showNoSupportDialog(getContext(), this.resourcesProvider);
                return;
            }
        }
        final TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
        StarsController.getInstance(this.currentAccount).invalidateTransactions(false);
        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(getDialogId());
        StarsController.getInstance(this.currentAccount).invalidateBalance();
        if (!applyNewGiftFromUpdates(tL_payments_paymentResult.updates)) {
            lambda$new$0();
            return;
        }
        this.button.setLoading(false);
        this.fireworksOverlay.start(true);
        switchPage(0, true);
        if (getGift() != null) {
            str = getGift().title + " #" + LocaleController.formatNumber(getGift().num, ',');
        } else {
            str = "";
        }
        getBulletinFactory().createSimpleBulletin(R.raw.gift_upgrade, LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str))).setDuration(5000).ignoreDetach().show();
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda126
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doUpgrade$83(tL_payments_paymentResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doUpgrade$88(final long j, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda115
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$doUpgrade$87(tLObject, tL_error, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTONTransfer$102(AlertDialog alertDialog, int i) {
        presentFragment(new TwoStepVerificationSetupActivity(6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTONTransfer$103(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.setCurrentPasswordInfo(null, password);
            TwoStepVerificationActivity.initPasswordNewAlgo(password);
            lambda$openTransfer$89(twoStepVerificationActivity.getNewSrpPassword(), twoStepVerificationActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTONTransfer$104(final TwoStepVerificationActivity twoStepVerificationActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$initTONTransfer$103(tL_error, tLObject, twoStepVerificationActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTONTransfer$105(TLRPC.TL_error tL_error, final TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject) {
        int i;
        int i2;
        if (getContext() == null) {
            return;
        }
        if (tL_error == null) {
            twoStepVerificationActivity.needHideProgress();
            twoStepVerificationActivity.lambda$onBackPressed$355();
            if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                Browser.openUrlInSystemBrowser(getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda133
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        StarGiftSheet.this.lambda$initTONTransfer$104(twoStepVerificationActivity, tLObject2, tL_error2);
                    }
                }, 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.needHideProgress();
                twoStepVerificationActivity.lambda$onBackPressed$355();
            }
            BulletinFactory.showError(tL_error);
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.needHideProgress();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(LocaleController.getString(R.string.Gift2TransferToTONAlertTitle));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        builder.setView(linearLayout);
        TextView textView = new TextView(getContext());
        int i3 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i3));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(getContext());
        int i4 = R.drawable.list_circle;
        imageView.setImageResource(i4);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int color = Theme.getColor(i3);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(Theme.getColor(i3));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText1)));
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
            linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2));
            linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(i4);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i3), mode));
        TextView textView3 = new TextView(getContext());
        textView3.setTextColor(Theme.getColor(i3));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText2)));
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
            i = 5;
            linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2, 5));
        } else {
            i = 5;
            linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2));
            linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            builder.setPositiveButton(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda134
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i5) {
                    StarGiftSheet.this.lambda$initTONTransfer$102(alertDialog, i5);
                }
            });
            i2 = R.string.Cancel;
        } else {
            TextView textView4 = new TextView(getContext());
            textView4.setTextColor(Theme.getColor(i3));
            textView4.setTextSize(1, 16.0f);
            if (!LocaleController.isRTL) {
                i = 3;
            }
            textView4.setGravity(i | 48);
            textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
            linearLayout.addView(textView4, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
            i2 = R.string.OK;
        }
        builder.setNegativeButton(LocaleController.getString(i2), null);
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.showDialog(builder.create());
        } else {
            builder.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTONTransfer$106(final TwoStepVerificationActivity twoStepVerificationActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda129
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$initTONTransfer$105(tL_error, twoStepVerificationActivity, tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        openTransfer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view) {
        if (this.button.isLoading()) {
            return;
        }
        this.checkbox.setChecked(!r3.isChecked(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBuyPressed$120(Browser.Progress progress, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, Boolean bool, String str) {
        progress.end();
        if (bool.booleanValue()) {
            Utilities.Callback2 callback2 = this.boughtGift;
            if (callback2 != null) {
                callback2.run(tL_starGiftUnique, Long.valueOf(j));
            }
            lambda$new$0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBuyPressed$121(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j, PaymentFormState paymentFormState, final Browser.Progress progress) {
        progress.init();
        StarsController.getInstance(this.currentAccount, paymentFormState.currency).buyResellingGift(paymentFormState.form, tL_starGiftUnique, j, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda94
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                StarGiftSheet.this.lambda$onBuyPressed$120(progress, tL_starGiftUnique, j, (Boolean) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBuyPressed$122(AmountUtils$Currency amountUtils$Currency, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        this.button.setLoading(false);
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new ResaleBuyTransferAlert(getContext(), this.resourcesProvider, tL_starGiftUnique, new PaymentFormState(amountUtils$Currency, tL_payments_paymentFormStarGift, null), this.currentAccount, j, getGiftName(), new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda75
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                StarGiftSheet.this.lambda$onBuyPressed$121(tL_starGiftUnique, j, (StarGiftSheet.PaymentFormState) obj, (Browser.Progress) obj2);
            }
        }, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMenuPressed$2() {
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            StarsController.GiftsCollections profileGiftCollectionsList = StarsController.getInstance(this.currentAccount).getProfileGiftCollectionsList(this.dialogId, false);
            if (profileGiftCollectionsList != null) {
                TL_stars.SavedStarGift savedStarGift2 = this.savedStarGift;
                profileGiftCollectionsList.updateGiftsUnsaved(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = getInputStarGift();
            savestargift.unsave = this.savedStarGift.unsaved;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = this.savedStarGift;
        boolean z = !savedStarGift3.pinned_to_top;
        if (((StarsController.GiftsList) this.giftsList).togglePinned(savedStarGift3, z, false)) {
            new ProfileGiftsContainer.UnpinSheet(getContext(), this.dialogId, this.savedStarGift, this.resourcesProvider, new Utilities.Callback0Return() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda84
                @Override // org.telegram.messenger.Utilities.Callback0Return
                public final Object run() {
                    return StarGiftSheet.this.getBulletinFactory();
                }
            }).show();
        } else {
            BulletinFactory bulletinFactory = getBulletinFactory();
            (z ? bulletinFactory.createSimpleBulletin(R.raw.ic_pin, LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle)) : bulletinFactory.createSimpleBulletin(R.raw.ic_unpin, LocaleController.getString(R.string.Gift2Unpinned))).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMenuPressed$3() {
        onUpdatePriceClick(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMenuPressed$4(String str) {
        AndroidUtilities.addToClipboard(str);
        getBulletinFactory().createCopyLinkBulletin(false).ignoreDetach().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMenuPressed$5() {
        onSharePressed(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$18(Browser.Progress progress, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        progress.end();
        tL_starGiftUnique.flags &= -17;
        tL_starGiftUnique.resale_ton_only = false;
        tL_starGiftUnique.resell_amount = null;
        this.topView.setResellPrice(AmountUtils$Amount.fromNano(0L, AmountUtils$Currency.STARS));
        Runnable runnable = this.onGiftUpdatedListener;
        if (runnable != null) {
            runnable.run();
        }
        getBulletinFactory().createSimpleBulletin(R.raw.contact_check, LocaleController.formatString(R.string.Gift2ResaleDisable, getGiftName())).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$19(Browser.Progress progress, long j) {
        progress.end();
        showTimeoutAlert(getContext(), true, (int) j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$20(Browser.Progress progress, TLRPC.TL_error tL_error) {
        progress.end();
        getBulletinFactory().showForError(tL_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$21(final Browser.Progress progress, final TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda97
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$onResellPressed$18(progress, tL_starGiftUnique);
                }
            });
        } else if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            final long parseLong = Long.parseLong(tL_error.text.substring(26));
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda98
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$onResellPressed$19(progress, parseLong);
                }
            });
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda99
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$onResellPressed$20(progress, tL_error);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$22(final TL_stars.TL_starGiftUnique tL_starGiftUnique, AlertDialog alertDialog, int i) {
        final Browser.Progress makeButtonLoading = alertDialog.makeButtonLoading(-1);
        makeButtonLoading.init();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = getInputStarGift();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatestargiftprice, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda87
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$onResellPressed$21(makeButtonLoading, tL_starGiftUnique, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onResellPressed$23(AlertDialog alertDialog, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$24(TL_stars.TL_starGiftUnique tL_starGiftUnique, AmountUtils$Amount amountUtils$Amount, Runnable runnable) {
        tL_starGiftUnique.flags |= 16;
        AmountUtils$Currency amountUtils$Currency = amountUtils$Amount.currency;
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
        tL_starGiftUnique.resale_ton_only = amountUtils$Currency == amountUtils$Currency2;
        ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
        tL_starGiftUnique.resell_amount = arrayList;
        arrayList.add(amountUtils$Amount.convertTo(AmountUtils$Currency.STARS).toTl());
        tL_starGiftUnique.resell_amount.add(amountUtils$Amount.convertTo(amountUtils$Currency2).toTl());
        this.topView.setResellPrice(amountUtils$Amount);
        Runnable runnable2 = this.onGiftUpdatedListener;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (runnable != null) {
            runnable.run();
        }
        getBulletinFactory().createSimpleBulletin(R.raw.contact_check, LocaleController.formatString(R.string.Gift2ResaleEnable, getGiftName())).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$25(long j, Runnable runnable) {
        showTimeoutAlert(getContext(), true, (int) j);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$26(TLRPC.TL_error tL_error, Runnable runnable) {
        getBulletinFactory().showForError(tL_error);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$27(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final AmountUtils$Amount amountUtils$Amount, final Runnable runnable, TLObject tLObject, final TLRPC.TL_error tL_error) {
        Runnable runnable2;
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            runnable2 = new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda103
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$onResellPressed$24(tL_starGiftUnique, amountUtils$Amount, runnable);
                }
            };
        } else {
            if (tL_error == null || !tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda105
                        @Override // java.lang.Runnable
                        public final void run() {
                            StarGiftSheet.this.lambda$onResellPressed$26(tL_error, runnable);
                        }
                    });
                    return;
                }
                return;
            }
            final long parseLong = Long.parseLong(tL_error.text.substring(26));
            runnable2 = new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda104
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$onResellPressed$25(parseLong, runnable);
                }
            };
        }
        AndroidUtilities.runOnUIThread(runnable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResellPressed$28(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final AmountUtils$Amount amountUtils$Amount, final Runnable runnable) {
        TL_stars.StarsAmount tl = amountUtils$Amount.toTl();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = getInputStarGift();
        updatestargiftprice.resell_amount = tl;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatestargiftprice, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda83
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$onResellPressed$27(tL_starGiftUnique, amountUtils$Amount, runnable, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdatePriceClick$14(TL_stars.TL_starGiftUnique tL_starGiftUnique, AmountUtils$Amount amountUtils$Amount, Runnable runnable) {
        tL_starGiftUnique.flags |= 16;
        AmountUtils$Currency amountUtils$Currency = amountUtils$Amount.currency;
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
        tL_starGiftUnique.resale_ton_only = amountUtils$Currency == amountUtils$Currency2;
        ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
        tL_starGiftUnique.resell_amount = arrayList;
        arrayList.add(amountUtils$Amount.convertTo(AmountUtils$Currency.STARS).toTl());
        tL_starGiftUnique.resell_amount.add(amountUtils$Amount.convertTo(amountUtils$Currency2).toTl());
        this.topView.setResellPrice(amountUtils$Amount);
        Runnable runnable2 = this.onGiftUpdatedListener;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdatePriceClick$15(TLRPC.TL_error tL_error, Runnable runnable) {
        getBulletinFactory().showForError(tL_error);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdatePriceClick$16(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final AmountUtils$Amount amountUtils$Amount, final Runnable runnable, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda109
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$onUpdatePriceClick$14(tL_starGiftUnique, amountUtils$Amount, runnable);
                }
            });
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda110
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$onUpdatePriceClick$15(tL_error, runnable);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUpdatePriceClick$17(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final AmountUtils$Amount amountUtils$Amount, final Runnable runnable) {
        TL_stars.StarsAmount tl = amountUtils$Amount.toTl();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = getInputStarGift();
        updatestargiftprice.resell_amount = tl;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatestargiftprice, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda74
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$onUpdatePriceClick$16(tL_starGiftUnique, amountUtils$Amount, runnable, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onWearPressed$6(View view) {
        this.shownWearInfo = true;
        toggleWear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openAsLearnMore$58(View view) {
        lambda$new$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openAsLearnMore$59(String str, TL_stars.starGiftUpgradePreview stargiftupgradepreview) {
        if (stargiftupgradepreview == null) {
            return;
        }
        this.topView.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
        switchPage(1, false);
        this.topView.setText(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str), null, null);
        this.upgradeFeatureCells[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
        this.upgradeFeatureCells[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
        this.upgradeFeatureCells[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
        this.checkboxLayout.setVisibility(8);
        this.checkboxSeparator.setVisibility(8);
        this.button.setText(LocaleController.getString(R.string.OK), false);
        this.button.setSubText(null, false);
        this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda120
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarGiftSheet.this.lambda$openAsLearnMore$58(view);
            }
        });
        show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$100(int i, int i2, int i3, TL_stars.TL_starGiftUnique tL_starGiftUnique, final UserSelectorBottomSheet[] userSelectorBottomSheetArr, final Long l) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        AlertDialog.Builder negativeButton;
        if (l.longValue() == -99) {
            if (i < i2) {
                negativeButton = new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle)).setMessage(LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i3), new Object[0])).setPositiveButton(LocaleController.getString(R.string.OK), null);
            } else {
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                linearLayout.addView(new GiftTransferTopView(getContext(), tL_starGiftUnique), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
                TextView textView = new TextView(getContext());
                int i4 = Theme.key_dialogTextBlack;
                textView.setTextColor(Theme.getColor(i4, this.resourcesProvider));
                textView.setTextSize(1, 20.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
                linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 14));
                TextView textView2 = new TextView(getContext());
                textView2.setTextColor(Theme.getColor(i4, this.resourcesProvider));
                textView2.setTextSize(1, 16.0f);
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ExportTONFragmentText, getGiftName())));
                linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 48, 24, 0, 24, 4));
                negativeButton = new AlertDialog.Builder(getContext(), this.resourcesProvider).setView(linearLayout).setPositiveButton(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda79
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i5) {
                        StarGiftSheet.this.lambda$openTransfer$91(userSelectorBottomSheetArr, alertDialog, i5);
                    }
                }).setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            }
            negativeButton.show();
            return;
        }
        final Runnable runnable = new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda80
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$openTransfer$95(l, userSelectorBottomSheetArr);
            }
        };
        if (l.longValue() < 0) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-l.longValue());
            if (chatFull == null) {
                TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                tL_channels_getFullChannel.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(-l.longValue());
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getFullChannel, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda81
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        StarGiftSheet.this.lambda$openTransfer$97(runnable, tLObject, tL_error);
                    }
                });
                return;
            } else if (!chatFull.stargifts_available) {
                new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle)).setMessage(LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return;
            }
        } else if (l.longValue() >= 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l);
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(l.longValue());
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                BulletinFactory.of(userSelectorBottomSheetArr[0].container, this.resourcesProvider).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l.longValue())))).show();
                return;
            } else if (userFull == null && user != null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_getFullUser, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda82
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        StarGiftSheet.this.lambda$openTransfer$99(userSelectorBottomSheetArr, l, runnable, tLObject, tL_error);
                    }
                });
                return;
            }
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$90(UserSelectorBottomSheet[] userSelectorBottomSheetArr, Browser.Progress progress, TwoStepVerificationActivity twoStepVerificationActivity) {
        userSelectorBottomSheetArr[0].lambda$new$0();
        progress.end();
        presentFragment(twoStepVerificationActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$91(final UserSelectorBottomSheet[] userSelectorBottomSheetArr, AlertDialog alertDialog, int i) {
        final Browser.Progress makeButtonLoading = alertDialog.makeButtonLoading(i);
        final TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        twoStepVerificationActivity.setDelegate(2, new TwoStepVerificationActivity.TwoStepVerificationActivityDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda107
            @Override // org.telegram.ui.TwoStepVerificationActivity.TwoStepVerificationActivityDelegate
            public final void didEnterPassword(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
                StarGiftSheet.this.lambda$openTransfer$89(twoStepVerificationActivity, inputCheckPasswordSRP);
            }
        });
        twoStepVerificationActivity.setDelegateString(getGiftName());
        makeButtonLoading.init();
        twoStepVerificationActivity.preload(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda108
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$openTransfer$90(userSelectorBottomSheetArr, makeButtonLoading, twoStepVerificationActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$92(TLRPC.TL_error tL_error) {
        getBulletinFactory().showForError(tL_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$93(Browser.Progress progress, UserSelectorBottomSheet[] userSelectorBottomSheetArr, final TLRPC.TL_error tL_error) {
        progress.end();
        userSelectorBottomSheetArr[0].lambda$new$0();
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda128
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$openTransfer$92(tL_error);
                }
            });
        } else {
            lambda$new$0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$94(Long l, final UserSelectorBottomSheet[] userSelectorBottomSheetArr, final Browser.Progress progress) {
        progress.init();
        doTransfer(l.longValue(), new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda119
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                StarGiftSheet.this.lambda$openTransfer$93(progress, userSelectorBottomSheetArr, (TLRPC.TL_error) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$95(final Long l, final UserSelectorBottomSheet[] userSelectorBottomSheetArr) {
        openTransferAlert(l.longValue(), new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda92
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                StarGiftSheet.this.lambda$openTransfer$94(l, userSelectorBottomSheetArr, (Browser.Progress) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$96(TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_messages_chatFull)) {
            getBulletinFactory().makeForError(tL_error).ignoreDetach().show();
            return;
        }
        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_chatFull.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tL_messages_chatFull.chats, false);
        MessagesController.getInstance(this.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
        if (tL_messages_chatFull.full_chat.stargifts_available) {
            runnable.run();
        } else {
            new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle)).setMessage(LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$97(final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda111
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$openTransfer$96(tLObject, runnable, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$98(TLObject tLObject, UserSelectorBottomSheet[] userSelectorBottomSheetArr, Long l, Runnable runnable, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (!(tLObject instanceof TLRPC.TL_users_userFull)) {
            getBulletinFactory().makeForError(tL_error).ignoreDetach().show();
            return;
        }
        TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(tL_users_userFull.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tL_users_userFull.chats, false);
        TLRPC.UserFull userFull = tL_users_userFull.full_user;
        if (userFull == null || (disallowedGiftsSettings = userFull.disallowed_stargifts) == null || !disallowedGiftsSettings.disallow_unique_stargifts) {
            runnable.run();
        } else {
            BulletinFactory.of(userSelectorBottomSheetArr[0].container, this.resourcesProvider).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l.longValue())))).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openTransfer$99(final UserSelectorBottomSheet[] userSelectorBottomSheetArr, final Long l, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda93
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$openTransfer$98(tLObject, userSelectorBottomSheetArr, l, runnable, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openTransferAlert$101(Utilities.Callback callback, AlertDialog alertDialog, int i) {
        callback.run(alertDialog.makeButtonLoading(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openUpgrade$75(TL_stars.starGiftUpgradePreview stargiftupgradepreview) {
        if (stargiftupgradepreview == null) {
            return;
        }
        this.sample_attributes = stargiftupgradepreview.sample_attributes;
        openUpgradeAfter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openUpgrade$76(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            getBulletinFactory().makeForError(tL_error).ignoreDetach().show();
            return;
        }
        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(paymentForm.users, false);
        this.upgrade_form = paymentForm;
        openUpgradeAfter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openUpgrade$77(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda73
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$openUpgrade$76(tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openUpgradeAfter$78(View view) {
        doUpgrade();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releasedByText$35(String str) {
        lambda$new$0();
        Browser.openUrl(getContext(), "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releasedByUniqueText$36(String str) {
        lambda$new$0();
        Browser.openUrl(getContext(), "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$repollMessage$55(TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
        this.messageObjectRepolled = true;
        this.messageObjectRepolling = false;
        Boolean bool = this.unsavedFromSavedStarGift;
        if (bool != null && messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        set(messageObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$repollMessage$56(int i, final TLObject tLObject, TLRPC.TL_error tL_error) {
        final MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                TLRPC.Message message = messages_messages.messages.get(i2);
                if (message != null && message.id == i) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(this.currentAccount, message, false, false);
                        messageObject.setType();
                        break;
                    }
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda78
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$repollMessage$55(tLObject, messageObject);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$repollSavedStarGift$57(TL_stars.SavedStarGift savedStarGift) {
        TLRPC.Message message;
        this.userStarGiftRepolling = false;
        this.userStarGiftRepolled = true;
        if (savedStarGift != null) {
            this.unsavedFromSavedStarGift = Boolean.valueOf(savedStarGift.unsaved);
            MessageObject messageObject = this.messageObject;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                boolean z = tL_messageActionStarGiftUnique.saved;
                boolean z2 = !savedStarGift.unsaved;
                if (z == z2) {
                    return;
                } else {
                    tL_messageActionStarGiftUnique.saved = z2;
                }
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                boolean z3 = tL_messageActionStarGift.saved;
                boolean z4 = !savedStarGift.unsaved;
                if (z3 == z4) {
                    return;
                } else {
                    tL_messageActionStarGift.saved = z4;
                }
            }
            set(messageObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$repostStory$29(Long l) {
        TLRPC.Chat chat;
        String str = (l.longValue() >= 0 || (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-l.longValue()))) == null) ? "" : chat.title;
        getBulletinFactory().createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.GiftRepostedToProfile) : LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str))).ignoreDetach().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$repostStory$30(StoryRecorder storyRecorder, View view, Long l, Runnable runnable, Boolean bool, final Long l2) {
        boolean booleanValue = bool.booleanValue();
        StoryRecorder.SourceView sourceView = null;
        if (booleanValue) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda72
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$repostStory$29(l2);
                }
            });
            storyRecorder.replaceSourceView(null);
            ShareAlert shareAlert = this.shareAlert;
            if (shareAlert != null) {
                shareAlert.lambda$new$0();
                this.shareAlert = null;
            }
        } else {
            if ((view instanceof ShareDialogCell) && view.isAttachedToWindow()) {
                sourceView = StoryRecorder.SourceView.fromShareCell((ShareDialogCell) view);
            }
            storyRecorder.replaceSourceView(sourceView);
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$33(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$34(View view) {
        onBuyPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$37() {
        getBulletinFactory().createSimpleBulletin(R.raw.copy, LocaleController.getString(R.string.WalletAddressCopied)).show(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$39(View view) {
        onBuyPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$40(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$41() {
        new ExplainStarsSheet(getContext()).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$43(long j) {
        new GiftSheet(getContext(), this.currentAccount, j, new StarGiftSheet$$ExternalSyntheticLambda54(this)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$44(View view) {
        openUpgrade();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$45(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$46(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$47() {
        new ExplainStarsSheet(getContext()).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$49(long j) {
        new GiftSheet(getContext(), this.currentAccount, j, new StarGiftSheet$$ExternalSyntheticLambda54(this)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$51(long j) {
        new GiftSheet(getContext(), this.currentAccount, j, new StarGiftSheet$$ExternalSyntheticLambda54(this)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$52(View view) {
        openUpgrade();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$53(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$set$54(String str) {
        Browser.openUrlInSystemBrowser(getContext(), MessagesController.getInstance(this.currentAccount).tonBlockchainExplorerUrl + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupWearPage$7(View view) {
        this.shownWearInfo = true;
        toggleWear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$68(TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        this.slugStarGift = tL_starGiftUnique;
        set(tL_starGiftUnique, true, false);
        super.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$69(AlertDialog alertDialog) {
        alertDialog.dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UniqueGiftNotFound)).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$70(final AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            final TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda59
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$show$68(tL_payments_uniqueStarGift);
                    }
                });
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda60
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.lambda$show$69(AlertDialog.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$71(AlertDialog alertDialog, MessageObject messageObject) {
        alertDialog.dismiss();
        this.messageObjectRepolled = true;
        set(messageObject);
        super.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$72(AlertDialog alertDialog) {
        alertDialog.dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.MessageNotFound)).ignoreDetach().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$73(TLRPC.TL_messageActionStarGift tL_messageActionStarGift, final AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
        final MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
            for (int i = 0; i < messages_messages.messages.size(); i++) {
                TLRPC.Message message = messages_messages.messages.get(i);
                if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.id == tL_messageActionStarGift.upgrade_msg_id) {
                    messageObject = new MessageObject(this.currentAccount, message, false, false);
                    messageObject.setType();
                    break;
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda36
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$show$71(alertDialog, messageObject);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda37
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.lambda$show$72(AlertDialog.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$74(AlertDialog alertDialog, TL_stars.SavedStarGift savedStarGift) {
        alertDialog.dismiss();
        if (savedStarGift != null) {
            this.userStarGiftRepolled = true;
            set(savedStarGift, null);
            super.show();
        } else {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.MessageNotFound)).ignoreDetach().show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$switchPage$31(ValueAnimator valueAnimator) {
        this.currentPage.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        onSwitchedPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toggleShow$65(long j, BaseFragment baseFragment) {
        String str;
        Bundle bundle = new Bundle();
        if (j >= 0) {
            str = "user_id";
        } else {
            j = -j;
            str = "chat_id";
        }
        bundle.putLong(str, j);
        bundle.putBoolean("my_profile", true);
        bundle.putBoolean("open_gifts", true);
        baseFragment.presentFragment(new ProfileActivity(bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleShow$66(TLObject tLObject, TLRPC.Document document, boolean z, TLRPC.TL_error tL_error) {
        final BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                getBulletinFactory().createErrorBulletin(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text)).show(false);
                return;
            }
            return;
        }
        lambda$new$0();
        final long dialogId = getDialogId();
        StarsController.getInstance(this.currentAccount).invalidateProfileGifts(dialogId);
        if (dialogId >= 0) {
            BulletinFactory.of(safeLastFragment).createEmojiBulletin(document, LocaleController.getString(z ? R.string.Gift2MadePrivateTitle : R.string.Gift2MadePublicTitle), AndroidUtilities.replaceSingleTag(LocaleController.getString(z ? R.string.Gift2MadePrivate : R.string.Gift2MadePublic), safeLastFragment instanceof ProfileActivity ? null : new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda96
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.lambda$toggleShow$65(dialogId, safeLastFragment);
                }
            })).show(true);
        } else {
            BulletinFactory.of(safeLastFragment).createEmojiBulletin(document, LocaleController.getString(z ? R.string.Gift2ChannelMadePrivateTitle : R.string.Gift2ChannelMadePublicTitle), LocaleController.getString(z ? R.string.Gift2ChannelMadePrivate : R.string.Gift2ChannelMadePublic)).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleShow$67(final TLRPC.Document document, final boolean z, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda76
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$toggleShow$66(tLObject, document, z, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleWear$10(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.button.setLoading(false);
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(getDummyFragment(), getContext(), 26, this.currentAccount, this.resourcesProvider);
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(tL_premium_boostsStatus, true);
        limitReachedBottomSheet.setDialogId(j);
        final TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j));
        if (chat != null) {
            limitReachedBottomSheet.showStatisticButtonInLink(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda100
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$toggleWear$9(chat);
                }
            });
        }
        limitReachedBottomSheet.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleWear$11(final MessagesController messagesController, final long j, final TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < messagesController.channelEmojiStatusLevelMin) {
            messagesController.getBoostsController().userCanBoostChannel(j, tL_premium_boostsStatus, new Consumer() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda85
                @Override // com.google.android.exoplayer2.util.Consumer
                public final void accept(Object obj) {
                    StarGiftSheet.this.lambda$toggleWear$10(tL_premium_boostsStatus, j, messagesController, (ChannelBoostsController.CanApplyBoost) obj);
                }
            });
        } else {
            this.button.setLoading(false);
            toggleWear(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleWear$12(boolean z) {
        showHint(AndroidUtilities.replaceTags(LocaleController.formatString(z ? R.string.Gift2ActionWearDone : R.string.Gift2ActionWearOffDone, getGiftName())), this.ownerTextView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleWear$13(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleWear$8() {
        new PremiumFeatureBottomSheet(getDummyFragment(), 12, false).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleWear$9(TLRPC.Chat chat) {
        presentFragment(StatisticActivity.create(chat));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMenuPressed(View view) {
        final String link = getLink();
        ItemOptions makeOptions = ItemOptions.makeOptions(this.container, this.resourcesProvider, view);
        boolean z = (getUniqueGift() == null || !isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(getUniqueGift().owner_id)) || !(this.giftsList instanceof StarsController.GiftsList) || this.savedStarGift == null || getInputStarGift() == null) ? false : true;
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        makeOptions.addIf(z, (savedStarGift == null || !savedStarGift.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, LocaleController.getString((savedStarGift == null || !savedStarGift.pinned_to_top) ? R.string.Gift2Pin : R.string.Gift2Unpin), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$onMenuPressed$2();
            }
        }).addIf((getUniqueGift() == null || !isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(getUniqueGift().owner_id)) || getUniqueGift().resell_amount == null) ? false : true, R.drawable.menu_edit_price, LocaleController.getString(R.string.Gift2ChangePrice), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda39
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$onMenuPressed$3();
            }
        }).addIf(link != null, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda40
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$onMenuPressed$4(link);
            }
        }).addIf(link != null, R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda41
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$onMenuPressed$5();
            }
        }).addIf(canTransfer(), R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda42
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.openTransfer();
            }
        }).addIf(this.savedStarGift == null && getDialogId() != 0, R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda43
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.openInProfile();
            }
        }).setDrawScrim(false).setOnTopOfScrim().setDimAlpha(0).translate(0.0f, -AndroidUtilities.dp(2.0f)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSwitchedPage() {
        this.infoLayout.setAlpha(this.currentPage.at(0));
        this.upgradeLayout.setAlpha(this.currentPage.at(1));
        this.wearLayout.setAlpha(this.currentPage.at(2));
        this.topView.onSwitchPage(this.currentPage);
        this.container.updateTranslations();
        this.container.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onWearPressed(View view) {
        if (UserConfig.getInstance(this.currentAccount).isPremium() && (isWorn(this.currentAccount, getUniqueGift()) || this.shownWearInfo)) {
            toggleWear();
            return;
        }
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(uniqueGift.owner_id);
        this.wearTitle.setText(LocaleController.formatString(R.string.Gift2WearTitle, uniqueGift.title + " #" + LocaleController.formatNumber(uniqueGift.num, ',')));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.lockSpan == null) {
                this.lockSpan = new ColoredImageSpan(R.drawable.msg_mini_lock3);
            }
            spannableStringBuilder.setSpan(this.lockSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.button.setText(spannableStringBuilder, true);
        this.button.setSubText(null, true);
        this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StarGiftSheet.this.lambda$onWearPressed$6(view2);
            }
        });
        this.topView.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        switchPage(2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openInProfile() {
        long dialogId = getDialogId();
        if (dialogId == 0) {
            return;
        }
        lambda$set$50(dialogId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: openProfile, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$set$50(long j) {
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.currentHintView = null;
        }
        lambda$new$0();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null || UserObject.isService(j)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (j > 0) {
            bundle.putLong("user_id", j);
            if (j == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                bundle.putBoolean("my_profile", true);
            }
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putBoolean("open_gifts", true);
        safeLastFragment.presentFragment(new ProfileActivity(bundle));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void openTransferAlert(long j, long j2, final Utilities.Callback callback) {
        String str;
        TLRPC.Chat chat;
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        if (j >= 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            str = UserObject.getForcedFirstName(user);
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            if (chat2 == null) {
                str = "";
                chat = chat2;
            } else {
                str = chat2.title;
                chat = chat2;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new GiftTransferTopView(getContext(), uniqueGift, chat), LayoutHelper.createLinear(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        textView.setTextSize(1, 16.0f);
        textView.setText(AndroidUtilities.replaceTags(j2 > 0 ? LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j2, getGiftName(), DialogObject.getShortName(j)) : LocaleController.formatString(R.string.Gift2TransferText, getGiftName(), str)));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 48, 24, 4, 24, 4));
        new AlertDialog.Builder(getContext(), this.resourcesProvider).setView(linearLayout).setPositiveButton(j2 > 0 ? StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j2))) : LocaleController.getString(R.string.Gift2TransferDo), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda61
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i) {
                StarGiftSheet.lambda$openTransferAlert$101(Utilities.Callback.this, alertDialog, i);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create().setShowStarsBalance(true).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openUpgrade() {
        TL_stars.InputSavedStarGift inputStarGift;
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        long j2;
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.currentHintView = null;
        }
        if (this.switchingPagesAnimator == null && (inputStarGift = getInputStarGift()) != null) {
            MessageObject messageObject = this.messageObject;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                j = tL_messageActionStarGift.gift.id;
                j2 = tL_messageActionStarGift.upgrade_stars;
                z3 = tL_messageActionStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                z = (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? false : true;
                z2 = tL_messageActionStarGift.peer != null;
            } else {
                TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
                if (savedStarGift == null) {
                    return;
                }
                TL_stars.StarGift starGift = savedStarGift.gift;
                long j3 = starGift.id;
                long j4 = savedStarGift.upgrade_stars;
                boolean z4 = (starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                z = (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? false : true;
                z2 = this.dialogId < 0;
                z3 = z4;
                j = j3;
                j2 = j4;
            }
            if (z3) {
                this.checkboxTextView.setText(LocaleController.getString(z2 ? R.string.Gift2AddMyNameNameChannel : R.string.Gift2AddMyNameName));
            } else {
                this.checkboxTextView.setText(LocaleController.getString(z ? R.string.Gift2AddSenderNameComment : R.string.Gift2AddSenderName));
            }
            this.checkbox.setChecked(!z3 && j2 > 0, false);
            ArrayList arrayList = this.sample_attributes;
            if (arrayList != null && (j2 > 0 || this.upgrade_form != null)) {
                openUpgradeAfter();
                return;
            }
            if (arrayList == null) {
                StarsController.getInstance(this.currentAccount).getStarGiftPreview(j, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda55
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        StarGiftSheet.this.lambda$openUpgrade$75((TL_stars.starGiftUpgradePreview) obj);
                    }
                });
            }
            if (j2 > 0 || this.upgrade_form != null) {
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
            tL_inputInvoiceStarGiftUpgrade.keep_original_details = this.checkbox.isChecked();
            tL_inputInvoiceStarGiftUpgrade.stargift = inputStarGift;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider);
            if (makeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = makeThemeParams.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda56
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarGiftSheet.this.lambda$openUpgrade$77(tLObject, tL_error);
                }
            });
        }
    }

    private void openUpgradeAfter() {
        long j;
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            } else {
                j = ((TLRPC.TL_messageActionStarGift) messageAction).upgrade_stars;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift == null) {
                return;
            } else {
                j = savedStarGift.upgrade_stars;
            }
        }
        if (this.sample_attributes != null) {
            if (j > 0 || this.upgrade_form != null) {
                long j2 = 0;
                if (this.upgrade_form != null) {
                    for (int i = 0; i < this.upgrade_form.invoice.prices.size(); i++) {
                        j2 += this.upgrade_form.invoice.prices.get(i).amount;
                    }
                }
                this.topView.setPreviewingAttributes(this.sample_attributes);
                this.topView.setText(1, LocaleController.getString(R.string.Gift2UpgradeTitle), LocaleController.getString(R.string.Gift2UpgradeText), null, null);
                if (j2 > 0) {
                    this.button.setText(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j2))), true);
                } else {
                    this.button.setText(LocaleController.getString(R.string.Confirm), true);
                }
                this.button.setSubText(null, true);
                this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda77
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarGiftSheet.this.lambda$openUpgradeAfter$78(view);
                    }
                });
                switchPage(1, true);
            }
        }
    }

    private void presentFragment(BaseFragment baseFragment) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        safeLastFragment.showAsSheet(baseFragment, bottomSheetParams);
    }

    private CharSequence releasedByText(TLRPC.Peer peer) {
        if (peer == null) {
            return null;
        }
        final String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
        if (TextUtils.isEmpty(publicUsername)) {
            return null;
        }
        return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy, "@" + publicUsername), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda44
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$releasedByText$35(publicUsername);
            }
        });
    }

    private CharSequence releasedByText(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return releasedByText(starGift.released_by);
    }

    private CharSequence releasedByUniqueText(int i, TLRPC.Peer peer) {
        if (peer == null) {
            return null;
        }
        final String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
        if (TextUtils.isEmpty(publicUsername)) {
            return null;
        }
        return replaceSingleTagToLink(LocaleController.formatPluralStringComma("Gift2CollectionNumberBy", i, "@" + publicUsername), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda70
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$releasedByUniqueText$36(publicUsername);
            }
        });
    }

    public static SpannableStringBuilder replaceSingleTagToLink(String str, final Runnable runnable) {
        int i;
        int i2;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i2 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i = 0;
        } else {
            i = i2 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: org.telegram.ui.Stars.StarGiftSheet.8
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                    textPaint.setColor(-1);
                }
            }, indexOf, i + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    private void repollMessage() {
        MessageObject messageObject;
        if (this.messageObjectRepolling || this.messageObjectRepolled || (messageObject = this.messageObject) == null) {
            return;
        }
        this.messageObjectRepolling = true;
        final int id = messageObject.getId();
        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
        tL_messages_getMessages.id.add(Integer.valueOf(id));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda52
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$repollMessage$56(id, tLObject, tL_error);
            }
        });
    }

    private void repollSavedStarGift() {
        TL_stars.InputSavedStarGift inputStarGift;
        if (this.userStarGiftRepolling || this.userStarGiftRepolled || this.messageObject == null || (inputStarGift = getInputStarGift()) == null) {
            return;
        }
        this.userStarGiftRepolling = true;
        StarsController.getInstance(this.currentAccount).getUserStarGift(inputStarGift, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda57
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                StarGiftSheet.this.lambda$repollSavedStarGift$57((TL_stars.SavedStarGift) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void repostStory(final View view) {
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity == null) {
            return;
        }
        StoryRecorder.SourceView fromShareCell = view instanceof ShareDialogCell ? StoryRecorder.SourceView.fromShareCell((ShareDialogCell) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.messageObject;
        if (messageObject == null) {
            if (!(getGift() instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) getGift();
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.peer_id = MessagesController.getInstance(this.currentAccount).getPeer(clientUserId);
            tL_messageService.from_id = MessagesController.getInstance(this.currentAccount).getPeer(clientUserId);
            tL_messageService.date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
            tL_messageActionStarGiftUnique.gift = tL_starGiftUnique;
            tL_messageActionStarGiftUnique.upgrade = true;
            tL_messageService.action = tL_messageActionStarGiftUnique;
            messageObject = new MessageObject(this.currentAccount, tL_messageService, false, false);
            messageObject.setType();
        }
        arrayList.add(messageObject);
        final StoryRecorder storyRecorder = StoryRecorder.getInstance(launchActivity, this.currentAccount);
        storyRecorder.setOnPrepareCloseListener(new Utilities.Callback4() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda69
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                StarGiftSheet.this.lambda$repostStory$30(storyRecorder, view, (Long) obj, (Runnable) obj2, (Boolean) obj3, (Long) obj4);
            }
        });
        storyRecorder.openRepost(fromShareCell, StoryEntry.repostMessage(arrayList));
    }

    private void setButtonTextResale(TL_stars.StarGift starGift) {
        AmountUtils$Amount resellAmount = starGift.getResellAmount(AmountUtils$Currency.STARS);
        if (!starGift.resale_ton_only) {
            this.button.setText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.asDecimal())), !this.firstSet);
            this.button.setSubText(null, !this.firstSet);
        } else {
            this.button.setText(StarsIntroActivity.replaceStars(true, (CharSequence) LocaleController.formatString(R.string.ResellGiftBuyTON, starGift.getResellAmount(AmountUtils$Currency.TON).asFormatString())), !this.firstSet);
            this.button.setSubText(StarsIntroActivity.replaceStars(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.asDecimal())), !this.firstSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public void setupNeighbour(boolean z) {
        int listPosition = getListPosition();
        if (listPosition < 0) {
            return;
        }
        int i = listPosition + (z ? 1 : -1);
        StarsController.IGiftsList iGiftsList = this.giftsList;
        TL_stars.SavedStarGift savedStarGift = (iGiftsList == null || i < 0 || i >= iGiftsList.getLoadedCount()) ? 0 : this.giftsList.get(i);
        if (savedStarGift == 0) {
            return;
        }
        if ((z ? this.right : this.left) != null) {
            if (savedStarGift instanceof TL_stars.SavedStarGift) {
                if (eq((z ? this.right : this.left).savedStarGift, savedStarGift)) {
                    return;
                }
            }
            if (savedStarGift instanceof TL_stars.TL_starGiftUnique) {
                if (eq((z ? this.right : this.left).slugStarGift, (TL_stars.TL_starGiftUnique) savedStarGift)) {
                    return;
                }
            }
        }
        StarGiftSheet starGiftSheet = new StarGiftSheet(getContext(), this.currentAccount, this.dialogId, this.resourcesProvider);
        if (savedStarGift instanceof TL_stars.SavedStarGift) {
            starGiftSheet.set(savedStarGift, this.giftsList);
        } else if (savedStarGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) savedStarGift;
            starGiftSheet.set(tL_starGiftUnique.slug, tL_starGiftUnique, this.giftsList);
        }
        AndroidUtilities.removeFromParent(starGiftSheet.containerView);
        if (z) {
            this.right = starGiftSheet;
        } else {
            this.left = starGiftSheet;
        }
    }

    private void showTimeoutAlert(Context context, boolean z, int i) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(64.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(64, 64, 49, 0, 6, 0, 0));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setAnimation(R.raw.timer_3, 42, 42);
        frameLayout.addView(rLottieImageView, LayoutHelper.createLinear(64, 64, 17));
        rLottieImageView.playAnimation();
        TextView makeTextView = TextHelper.makeTextView(context, 20.0f, Theme.key_windowBackgroundWhiteBlackText, true);
        makeTextView.setGravity(17);
        makeTextView.setText(LocaleController.getString(z ? R.string.Gift2ResellTimeoutTitle : R.string.Gift2TransferTimeoutTitle));
        linearLayout.addView(makeTextView, LayoutHelper.createLinear(-1, -2, 48, 24, 14, 24, 0));
        TextView makeTextView2 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText8, false);
        makeTextView2.setGravity(17);
        makeTextView2.setText(LocaleController.formatString(z ? R.string.Gift2ResellTimeout : R.string.Gift2TransferTimeout, LocaleController.formatTTLString(Math.max(10, i))));
        linearLayout.addView(makeTextView2, LayoutHelper.createLinear(-1, -2, 48, 24, 6, 24, 6));
        new AlertDialog.Builder(context, this.resourcesProvider).setView(linearLayout).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
    }

    private void showTimeoutAlertAt(Context context, boolean z, int i) {
        showTimeoutAlert(context, z, i - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleShow() {
        final boolean z;
        TL_stars.StarGift starGift;
        StarsController.GiftsCollections profileGiftCollectionsList;
        TLRPC.Message message;
        if (this.button.isLoading()) {
            return;
        }
        TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift == null) {
                return;
            }
            z = !savedStarGift.unsaved;
            starGift = savedStarGift.gift;
        } else {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                z = tL_messageActionStarGift.saved;
                starGift = tL_messageActionStarGift.gift;
            } else {
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                z = tL_messageActionStarGiftUnique.saved;
                starGift = tL_messageActionStarGiftUnique.gift;
            }
        }
        final TLRPC.Document document = starGift.getDocument();
        this.button.setLoading(true);
        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
        savestargift.unsave = z;
        savestargift.stargift = inputStarGift;
        if (this.savedStarGift != null && (profileGiftCollectionsList = StarsController.getInstance(this.currentAccount).getProfileGiftCollectionsList(this.dialogId, false)) != null) {
            profileGiftCollectionsList.updateGiftsUnsaved(this.savedStarGift, savestargift.unsave);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(savestargift, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda58
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$toggleShow$67(document, z, tLObject, tL_error);
            }
        });
    }

    private void updateViewPager() {
        this.viewPager.setPosition(hasNeighbour(false) ? 1 : 0);
        this.viewPager.rebuild(false);
        if (this.giftsList == null || hasNeighbour(true) || this.giftsList.getLoadedCount() >= this.giftsList.getTotalCount()) {
            return;
        }
        this.giftsList.load();
    }

    public int canResellAt() {
        TLRPC.Message message;
        MessageObject messageObject = this.messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_resell_at;
            }
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift != null) {
            return savedStarGift.can_resell_at;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean canTransfer() {
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TL_stars.StarGift starGift;
        TLRPC.Message message;
        if (getInputStarGift() == null) {
            return false;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                if ((tL_messageActionStarGiftUnique.flags & 16) == 0) {
                    return false;
                }
                starGift = tL_messageActionStarGiftUnique.gift;
                if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                    return false;
                }
                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                return isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
            }
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift != null) {
            starGift = savedStarGift.gift;
        }
        tL_starGiftUnique = this.slugStarGift;
        if (tL_starGiftUnique == null) {
            return false;
        }
        return isMineWithActions(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
    }

    public int canTransferAt() {
        TLRPC.Message message;
        MessageObject messageObject = this.messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
            }
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift != null) {
            return savedStarGift.can_transfer_at;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        Adapter adapter = new Adapter(this, null);
        this.adapter = adapter;
        return adapter;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.starUserGiftsLoaded) {
            if (this.giftsList == ((StarsController.GiftsList) objArr[1])) {
                updateViewPager();
            }
        }
    }

    public void doTransfer(final long j, final Utilities.Callback callback) {
        TLRPC.Message message;
        final long peerDialogId;
        long j2;
        TL_stars.InputSavedStarGift inputStarGift = getInputStarGift();
        if (inputStarGift == null) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            MessageObject messageObject = this.messageObject;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            peerDialogId = DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.gift.owner_id);
            j2 = tL_messageActionStarGiftUnique.transfer_stars;
        } else {
            peerDialogId = this.dialogId;
            j2 = savedStarGift.transfer_stars;
        }
        if (j2 <= 0) {
            TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
            transferstargift.stargift = inputStarGift;
            transferstargift.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda89
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarGiftSheet.this.lambda$doTransfer$109(callback, j, peerDialogId, tLObject, tL_error);
                }
            });
            return;
        }
        final StarsController starsController = StarsController.getInstance(this.currentAccount);
        if (!starsController.balanceAvailable()) {
            starsController.getBalance(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda90
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$doTransfer$110(starsController, j, callback);
                }
            });
            return;
        }
        final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
        tL_inputInvoiceStarGiftTransfer.stargift = inputStarGift;
        tL_inputInvoiceStarGiftTransfer.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
        JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider);
        if (makeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = makeThemeParams.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda91
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StarGiftSheet.this.lambda$doTransfer$119(tL_inputInvoiceStarGiftTransfer, j, peerDialogId, callback, tLObject, tL_error);
            }
        });
    }

    public boolean eq(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift == savedStarGift2) {
            return true;
        }
        if (savedStarGift != null && savedStarGift2 != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            TL_stars.StarGift starGift2 = savedStarGift2.gift;
            if (starGift == starGift2) {
                return true;
            }
            return ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) ? starGift.id == starGift2.id : (starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.id == starGift2.id && savedStarGift.date == savedStarGift2.date;
        }
        return false;
    }

    public boolean eq(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique == tL_starGiftUnique2) {
            return true;
        }
        if (tL_starGiftUnique == null || tL_starGiftUnique2 == null) {
            return false;
        }
        return tL_starGiftUnique.id == tL_starGiftUnique2.id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug);
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected int getActionBarProgressHeight() {
        return AndroidUtilities.dp(12.0f);
    }

    public BulletinFactory getBulletinFactory() {
        return BulletinFactory.of(this.bottomBulletinContainer, this.resourcesProvider);
    }

    public TL_stars.StarGift getGift() {
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null) {
                return null;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                return ((TLRPC.TL_messageActionStarGift) messageAction).gift;
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.slugStarGift;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public String getGiftName() {
        TL_stars.StarGift gift = getGift();
        if (!(gift instanceof TL_stars.TL_starGiftUnique)) {
            return "";
        }
        return ((TL_stars.TL_starGiftUnique) gift).title + " #" + LocaleController.formatNumber(r0.num, ',');
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected CharSequence getTitle() {
        return this.title;
    }

    public TL_stars.TL_starGiftUnique getUniqueGift() {
        TL_stars.StarGift gift = getGift();
        if (gift instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) gift;
        }
        return null;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    public void onBackPressed() {
        if (this.onlyWearInfo || this.currentPage.to <= 0 || this.button.isLoading() || this.isLearnMore) {
            super.onBackPressed();
            return;
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject != null) {
            set(messageObject);
        } else {
            TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
            if (savedStarGift != null) {
                set(savedStarGift, this.giftsList);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.slugStarGift;
                if (tL_starGiftUnique != null) {
                    set(this.slug, tL_starGiftUnique, this.giftsList);
                }
            }
        }
        switchPage(0, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r0 != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBuyPressed() {
        long clientUserId;
        final TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (this.button.isLoading() || uniqueGift == null) {
            return;
        }
        this.button.setLoading(true);
        if (this.slugStarGift != null && this.resale) {
            clientUserId = this.dialogId;
        }
        clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        final long j = clientUserId;
        final AmountUtils$Currency amountUtils$Currency = uniqueGift.resale_ton_only ? AmountUtils$Currency.TON : AmountUtils$Currency.STARS;
        StarsController.getInstance(this.currentAccount, amountUtils$Currency).getResellingGiftForm(uniqueGift, j, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda35
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                StarGiftSheet.this.lambda$onBuyPressed$122(amountUtils$Currency, uniqueGift, j, (TLRPC.TL_payments_paymentFormStarGift) obj);
            }
        });
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    public void onResellPressed(View view) {
        final TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        if (uniqueGift.resell_amount != null) {
            new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.formatString(R.string.Gift2UnlistTitle, getGiftName())).setMessage(LocaleController.getString(R.string.Gift2UnlistText)).setPositiveButton(LocaleController.getString(R.string.Gift2ActionUnlist), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda45
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    StarGiftSheet.this.lambda$onResellPressed$22(uniqueGift, alertDialog, i);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda46
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    StarGiftSheet.lambda$onResellPressed$23(alertDialog, i);
                }
            }).show();
        } else if (canResellAt() > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            showTimeoutAlertAt(getContext(), true, canResellAt());
        } else {
            StarsIntroActivity.showGiftResellPriceSheet(getContext(), this.currentAccount, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda47
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    StarGiftSheet.this.lambda$onResellPressed$28(uniqueGift, (AmountUtils$Amount) obj, (Runnable) obj2);
                }
            }, this.resourcesProvider);
        }
    }

    public void onSharePressed(View view) {
        ShareAlert shareAlert = this.shareAlert;
        if (shareAlert != null && shareAlert.isShown()) {
            this.shareAlert.lambda$new$0();
        }
        String link = getLink();
        ChatActivity chatActivity = null;
        ArrayList arrayList = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        ShareAlert shareAlert2 = new ShareAlert(getContext(), chatActivity, arrayList, link, str, z, link, str2, z2, z3, true, null, this.resourcesProvider) { // from class: org.telegram.ui.Stars.StarGiftSheet.5
            {
                this.includeStoryFromMessage = true;
            }

            @Override // org.telegram.ui.Components.ShareAlert
            protected void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
                Bulletin createSimpleBulletin;
                if (z4) {
                    super.onSend(longSparseArray, i, tL_forumTopic, z4);
                    BulletinFactory bulletinFactory = StarGiftSheet.this.getBulletinFactory();
                    if (bulletinFactory != null) {
                        if (longSparseArray.size() == 1) {
                            long keyAt = longSparseArray.keyAt(0);
                            if (keyAt == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                createSimpleBulletin = bulletinFactory.createSimpleBulletin(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedToSavedMessages, new Object[0])), 5000);
                            } else if (keyAt < 0) {
                                createSimpleBulletin = bulletinFactory.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedTo, tL_forumTopic != null ? tL_forumTopic.title : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-keyAt)).title)), 5000);
                            } else {
                                createSimpleBulletin = bulletinFactory.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(keyAt)).first_name)), 5000);
                            }
                        } else {
                            createSimpleBulletin = bulletinFactory.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatPluralString("LinkSharedToManyChats", longSparseArray.size(), Integer.valueOf(longSparseArray.size()))));
                        }
                        createSimpleBulletin.hideAfterBottomSheet(false).ignoreDetach().show();
                        try {
                            this.container.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                }
            }

            @Override // org.telegram.ui.Components.ShareAlert
            protected void onShareStory(View view2) {
                StarGiftSheet.this.repostStory(view2);
            }
        };
        this.shareAlert = shareAlert2;
        shareAlert2.setDelegate(new ShareAlert.ShareAlertDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet.6
            @Override // org.telegram.ui.Components.ShareAlert.ShareAlertDelegate
            public boolean didCopy() {
                StarGiftSheet.this.getBulletinFactory().createCopyLinkBulletin(false).ignoreDetach().show();
                return true;
            }

            @Override // org.telegram.ui.Components.ShareAlert.ShareAlertDelegate
            public /* synthetic */ void didShare() {
                ShareAlert.ShareAlertDelegate.-CC.$default$didShare(this);
            }
        });
        this.shareAlert.show();
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected void onSwipeStarts() {
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.currentHintView = null;
        }
    }

    public void onUpdatePriceClick(View view) {
        final TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        StarsIntroActivity.showGiftResellPriceSheet(getContext(), this.currentAccount, uniqueGift, null, new Utilities.Callback2() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda62
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                StarGiftSheet.this.lambda$onUpdatePriceClick$17(uniqueGift, (AmountUtils$Amount) obj, (Runnable) obj2);
            }
        }, this.resourcesProvider);
    }

    public void openAsLearnMore(long j, final String str) {
        this.isLearnMore = true;
        StarsController.getInstance(this.currentAccount).getStarGiftPreview(j, new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda95
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                StarGiftSheet.this.lambda$openAsLearnMore$59(str, (TL_stars.starGiftUpgradePreview) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void openTransfer() {
        TLRPC.Message message;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i;
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.currentHintView = null;
        }
        if (canTransferAt() > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            showTimeoutAlertAt(getContext(), false, canTransferAt());
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift = savedStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                i = savedStarGift.can_export_at;
                final int i2 = i;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                final int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                Context context = getContext();
                int i3 = this.currentAccount;
                final UserSelectorBottomSheet[] userSelectorBottomSheetArr = {new UserSelectorBottomSheet(context, i3, 0L, BirthdayController.getInstance(i3).getState(), 3, true, this.resourcesProvider)};
                userSelectorBottomSheetArr[0].setTitle(LocaleController.getString(R.string.Gift2TransferShort));
                final int max = currentTime <= i2 ? 0 : Math.max(1, Math.round(Math.max(0, i2 - currentTime) / 86400.0f));
                userSelectorBottomSheetArr[0].addTONOption(max);
                userSelectorBottomSheetArr[0].setOnUserSelector(new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda63
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        StarGiftSheet.this.lambda$openTransfer$100(currentTime, i2, max, tL_starGiftUnique2, userSelectorBottomSheetArr, (Long) obj);
                    }
                });
                userSelectorBottomSheetArr[0].show();
            }
        }
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                i = tL_messageActionStarGiftUnique.can_export_at;
                final int i22 = i;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique;
                final int currentTime2 = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                Context context2 = getContext();
                int i32 = this.currentAccount;
                final UserSelectorBottomSheet[] userSelectorBottomSheetArr2 = {new UserSelectorBottomSheet(context2, i32, 0L, BirthdayController.getInstance(i32).getState(), 3, true, this.resourcesProvider)};
                userSelectorBottomSheetArr2[0].setTitle(LocaleController.getString(R.string.Gift2TransferShort));
                if (currentTime2 <= i22) {
                }
                userSelectorBottomSheetArr2[0].addTONOption(max);
                userSelectorBottomSheetArr2[0].setOnUserSelector(new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda63
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        StarGiftSheet.this.lambda$openTransfer$100(currentTime2, i22, max, tL_starGiftUnique22, userSelectorBottomSheetArr2, (Long) obj);
                    }
                });
                userSelectorBottomSheetArr2[0].show();
            }
        }
    }

    public void openTransferAlert(long j, Utilities.Callback callback) {
        TLRPC.Message message;
        long j2;
        TL_stars.SavedStarGift savedStarGift = this.savedStarGift;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            MessageObject messageObject = this.messageObject;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            } else {
                j2 = tL_messageActionStarGiftUnique.transfer_stars;
            }
        } else {
            j2 = savedStarGift.transfer_stars;
        }
        openTransferAlert(j, j2, callback);
    }

    public StarGiftSheet set(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, StarsController.IGiftsList iGiftsList) {
        this.slug = str;
        this.slugStarGift = tL_starGiftUnique;
        this.giftsList = iGiftsList;
        this.resale = (tL_starGiftUnique.resell_amount == null || isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) ? false : true;
        this.topView.setTransferAvailable(false);
        set(tL_starGiftUnique, true, false);
        this.beforeTableTextView.setVisibility(8);
        String str2 = tL_starGiftUnique.owner_address;
        final String str3 = tL_starGiftUnique.gift_address;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            this.afterTableTextView.setVisibility(8);
        } else {
            this.afterTableTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda24
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$set$33(str3);
                }
            }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            this.afterTableTextView.setVisibility(0);
        }
        if (this.resale) {
            setButtonTextResale(tL_starGiftUnique);
            this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda25
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StarGiftSheet.this.lambda$set$34(view);
                }
            });
        }
        if (this.firstSet) {
            switchPage(0, false);
            this.layoutManager.scrollToPosition(0);
            this.firstSet = false;
        }
        updateViewPager();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x06ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StarGiftSheet set(MessageObject messageObject) {
        boolean isOutOwner;
        TL_stars.StarGift starGift;
        TLRPC.Peer peer;
        boolean z;
        boolean z2;
        TLRPC.Peer peer2;
        long j;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        boolean z3;
        boolean z4;
        long j2;
        boolean z5;
        boolean z6;
        long j3;
        boolean z7;
        boolean z8;
        TopView topView;
        String string;
        TopView topView2;
        String str;
        CharSequence formatString;
        CharSequence charSequence;
        TopView topView3;
        String str2;
        String string2;
        char c;
        CharSequence charSequence2;
        String string3;
        CharSequence releasedByText;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence3;
        int i;
        TopView topView4;
        final long peerDialogId;
        boolean z9;
        final long j4;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        String str3;
        boolean z13;
        String string4;
        String string5;
        LinkSpanDrawable.LinksTextView linksTextView;
        int i2;
        LinkSpanDrawable.LinksTextView linksTextView2;
        String string6;
        Runnable starGiftSheet$$ExternalSyntheticLambda23;
        boolean z14;
        if (messageObject != null && messageObject.messageOwner != null) {
            this.myProfile = false;
            this.savedStarGift = null;
            this.messageObject = messageObject;
            this.giftsList = null;
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            boolean z15 = messageObject.getDialogId() == clientUserId;
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (((z14 = messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) && (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift))) {
                isOutOwner = messageObject.isOutOwner();
                if (z15) {
                    isOutOwner = false;
                }
                TLRPC.Message message = messageObject.messageOwner;
                int i3 = message.date;
                TLRPC.MessageAction messageAction2 = message.action;
                if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                    z5 = tL_messageActionStarGift.converted;
                    z = tL_messageActionStarGift.saved;
                    boolean z16 = tL_messageActionStarGift.refunded;
                    boolean z17 = tL_messageActionStarGift.name_hidden;
                    TL_stars.StarGift starGift2 = tL_messageActionStarGift.gift;
                    boolean z18 = tL_messageActionStarGift.can_upgrade;
                    j2 = tL_messageActionStarGift.convert_stars;
                    z2 = z16;
                    long j5 = tL_messageActionStarGift.upgrade_stars;
                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageActionStarGift.message;
                    boolean z19 = tL_messageActionStarGift.upgraded;
                    peer2 = tL_messageActionStarGift.from_id;
                    peer = tL_messageActionStarGift.peer;
                    j = clientUserId;
                    z6 = z19;
                    tL_textWithEntities = tL_textWithEntities3;
                    j3 = j5;
                    z3 = z17;
                    starGift = starGift2;
                    z4 = z18;
                } else {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                    boolean z20 = tL_messageActionStarGiftUnique.saved;
                    boolean z21 = tL_messageActionStarGiftUnique.refunded;
                    starGift = tL_messageActionStarGiftUnique.gift;
                    TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.from_id;
                    peer = tL_messageActionStarGiftUnique.peer;
                    z = z20;
                    z2 = z21;
                    peer2 = peer3;
                    j = clientUserId;
                    tL_textWithEntities = null;
                    z3 = false;
                    z4 = false;
                    j2 = 0;
                    z5 = false;
                    z6 = true;
                    j3 = 0;
                }
                String shortName = DialogObject.getShortName(this.dialogId);
                TLRPC.Peer peer4 = peer2;
                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities;
                boolean isBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId)));
                boolean z22 = peer != null && DialogObject.getPeerDialogId(peer) < 0;
                z7 = z3;
                this.topView.setTransferAvailable(true);
                TLRPC.Peer peer5 = peer;
                this.topView.setGift(starGift, false, isWorn(this.currentAccount, getUniqueGift()), getLink() != null);
                if (z15) {
                    TopView topView5 = this.topView;
                    String string7 = LocaleController.getString(R.string.Gift2TitleSaved);
                    this.title = string7;
                    if (z2) {
                        z8 = z15;
                        spannableStringBuilder = null;
                    } else if (z4) {
                        z8 = z15;
                        spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                    } else {
                        if (j2 > 0) {
                            z8 = z15;
                            string4 = LocaleController.formatPluralStringComma(z5 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j2);
                        } else {
                            z8 = z15;
                            string4 = LocaleController.getString(R.string.Gift2SelfInfo);
                        }
                        spannableStringBuilder = AndroidUtilities.replaceTags(string4);
                    }
                    releasedByText = releasedByText(starGift);
                    charSequence3 = null;
                    i = 0;
                    topView4 = topView5;
                    string3 = string7;
                } else {
                    z8 = z15;
                    if (!z22 || this.myProfile) {
                        if ((isOutOwner || z4) && j3 > 0) {
                            topView = this.topView;
                            string = LocaleController.getString(isOutOwner ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                            this.title = string;
                            if (!z2) {
                                if (isOutOwner) {
                                    topView2 = topView;
                                    str = string;
                                    formatString = LocaleController.formatString(R.string.Gift2InfoFreeUpgrade, shortName);
                                    charSequence = "";
                                    topView3 = topView2;
                                    str2 = str;
                                } else {
                                    formatString = LocaleController.getString(R.string.Gift2InfoInFreeUpgrade);
                                    charSequence = "";
                                    topView3 = topView;
                                    str2 = string;
                                }
                            }
                            charSequence = "";
                            topView3 = topView;
                            str2 = string;
                            formatString = null;
                        } else {
                            topView = this.topView;
                            string = LocaleController.getString(isOutOwner ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                            this.title = string;
                            if (!z2) {
                                if (isBot || !canSomeoneConvert()) {
                                    charSequence = "";
                                    topView2 = topView;
                                    str = string;
                                    if (isOutOwner) {
                                        string2 = LocaleController.formatString((!z4 || j3 <= 0) ? R.string.Gift2Info2OutExpired : R.string.Gift2Info2OutUpgrade, shortName);
                                    } else {
                                        string2 = LocaleController.getString(!z ? z22 ? R.string.Gift2Info2ChannelKeep : R.string.Gift2Info2BotKeep : z22 ? R.string.Gift2Info2ChannelRemove : R.string.Gift2Info2BotRemove);
                                    }
                                } else if (isOutOwner) {
                                    if (!z4 || j3 <= 0) {
                                        topView2 = topView;
                                        str = string;
                                        if (!z || z5) {
                                            charSequence = "";
                                            string2 = LocaleController.formatPluralStringComma(z5 ? "Gift2InfoOutConverted" : "Gift2InfoOut", (int) j2, shortName);
                                        } else {
                                            string2 = LocaleController.formatString(R.string.Gift2InfoOutPinned, shortName);
                                        }
                                    } else {
                                        topView2 = topView;
                                        str = string;
                                        string2 = LocaleController.formatString(R.string.Gift2Info2OutUpgrade, shortName);
                                    }
                                    charSequence = "";
                                } else {
                                    charSequence = "";
                                    topView2 = topView;
                                    str = string;
                                    string2 = LocaleController.formatPluralStringComma(z5 ? z22 ? "Gift2InfoChannelConverted" : "Gift2InfoConverted" : z22 ? "Gift2Info3Channel" : "Gift2Info3", (int) j2);
                                }
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(string2);
                                if (isBot || !canConvert()) {
                                    c = 1;
                                    charSequence2 = charSequence;
                                } else {
                                    c = 1;
                                    charSequence2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda26
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            StarGiftSheet.this.lambda$set$47();
                                        }
                                    }), true);
                                }
                                CharSequence[] charSequenceArr = new CharSequence[3];
                                charSequenceArr[0] = replaceTags;
                                charSequenceArr[c] = " ";
                                charSequenceArr[2] = charSequence2;
                                formatString = TextUtils.concat(charSequenceArr);
                                topView3 = topView2;
                                str2 = str;
                            }
                            charSequence = "";
                            topView3 = topView;
                            str2 = string;
                            formatString = null;
                        }
                        topView3.setText(0, str2, formatString, null, releasedByText(starGift));
                        this.tableView.clear();
                        peerDialogId = peer4 == null ? DialogObject.getPeerDialogId(peer4) : isOutOwner ? j : this.dialogId;
                        if (peer5 == null) {
                            z9 = z5;
                            j4 = DialogObject.getPeerDialogId(peer5);
                        } else {
                            z9 = z5;
                            j4 = isOutOwner ? this.dialogId : j;
                        }
                        z10 = z;
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                        if (peerDialogId == j || z22) {
                            z11 = z9;
                            z12 = z4;
                            this.tableView.addRowUser(LocaleController.getString(R.string.Gift2From), this.currentAccount, peerDialogId, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda27
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StarGiftSheet.this.lambda$set$48(peerDialogId);
                                }
                            }, (peerDialogId != j || peerDialogId == UserObject.ANONYMOUS || UserObject.isDeleted(user) || isBot || z22) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), !z22 ? null : new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda28
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StarGiftSheet.this.lambda$set$49(peerDialogId);
                                }
                            });
                        } else {
                            z12 = z4;
                            z11 = z9;
                        }
                        if (j4 == j || z22) {
                            this.tableView.addRowUser(LocaleController.getString(R.string.Gift2To), this.currentAccount, j4, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda29
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StarGiftSheet.this.lambda$set$50(j4);
                                }
                            }, null, !z22 ? null : new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda30
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StarGiftSheet.this.lambda$set$51(j4);
                                }
                            });
                        }
                        this.tableView.addRowDateTime(LocaleController.getString(R.string.StarsTransactionDate), i3);
                        if (starGift.stars > 0) {
                            this.tableView.addRow(LocaleController.getString(R.string.Gift2Value), StarsIntroActivity.replaceStarsWithPlain(TextUtils.concat("⭐️ " + LocaleController.formatNumber(starGift.stars + j3, ','), " ", (!canConvert() || z2) ? charSequence : ButtonSpan.make(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) j2), new StarGiftSheet$$ExternalSyntheticLambda18(this), this.resourcesProvider)), 0.8f));
                        }
                        if (starGift.limited && !z2) {
                            StarsIntroActivity.addAvailabilityRow(this.tableView, this.currentAccount, starGift, this.resourcesProvider);
                        }
                        if (!isOutOwner && !z2) {
                            if (this.messageObjectRepolled && !z6) {
                                TextView textView = (TextView) ((TableView.TableRowContent) this.tableView.addRow(LocaleController.getString(R.string.Gift2Status), charSequence).getChildAt(1)).getChildAt(0);
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                                LoadingSpan loadingSpan = new LoadingSpan(textView, AndroidUtilities.dp(90.0f), 0, this.resourcesProvider);
                                int i4 = Theme.key_windowBackgroundWhiteBlackText;
                                loadingSpan.setColors(Theme.multAlpha(Theme.getColor(i4, this.resourcesProvider), 0.21f), Theme.multAlpha(Theme.getColor(i4, this.resourcesProvider), 0.08f));
                                spannableStringBuilder2.setSpan(loadingSpan, 0, 1, 33);
                                textView.setText(spannableStringBuilder2, TextView.BufferType.SPANNABLE);
                                repollMessage();
                            } else if (z12) {
                                this.tableView.addRow(LocaleController.getString(R.string.Gift2Status), LocaleController.getString(R.string.Gift2StatusNonUnique));
                            } else {
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2StatusNonUnique));
                                spannableStringBuilder3.append((CharSequence) " ");
                                spannableStringBuilder3.append(ButtonSpan.make(LocaleController.getString(R.string.Gift2StatusUpgrade), new StarGiftSheet$$ExternalSyntheticLambda19(this), this.resourcesProvider));
                                this.tableView.addRow(LocaleController.getString(R.string.Gift2Status), spannableStringBuilder3);
                            }
                        }
                        tL_textWithEntities2 = tL_textWithEntities4;
                        if (tL_textWithEntities4 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z2) {
                            this.tableView.addFullRow(tL_textWithEntities2.text, tL_textWithEntities2.entities);
                        }
                        if (isOutOwner && z12 && !z2) {
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(j3 > 0 ? R.string.Gift2UpgradeButtonFree : R.string.Gift2UpgradeButtonGift));
                            spannableStringBuilder4.append((CharSequence) " ^");
                            if (this.upgradeIconSpan == null) {
                                this.upgradeIconSpan = new ColoredImageSpan(new UpgradeIcon(this.button, Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
                            }
                            spannableStringBuilder4.setSpan(this.upgradeIconSpan, spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                            this.button.setText(spannableStringBuilder4, !this.firstSet);
                            this.button.setSubText(null, !this.firstSet);
                            this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda31
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    StarGiftSheet.this.lambda$set$52(view);
                                }
                            });
                            str3 = null;
                        } else {
                            this.button.setText(LocaleController.getString(R.string.OK), !this.firstSet);
                            str3 = null;
                            this.button.setSubText(null, !this.firstSet);
                            this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda32
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    StarGiftSheet.this.lambda$set$53(view);
                                }
                            });
                        }
                        z13 = z2;
                    } else {
                        TopView topView6 = this.topView;
                        string3 = LocaleController.getString(R.string.Gift2TitleProfile);
                        releasedByText = releasedByText(starGift);
                        spannableStringBuilder = null;
                        charSequence3 = null;
                        i = 0;
                        topView4 = topView6;
                    }
                }
                topView4.setText(i, string3, spannableStringBuilder, charSequence3, releasedByText);
                charSequence = "";
                this.tableView.clear();
                if (peer4 == null) {
                }
                if (peer5 == null) {
                }
                z10 = z;
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                if (peerDialogId == j) {
                }
                z11 = z9;
                z12 = z4;
                this.tableView.addRowUser(LocaleController.getString(R.string.Gift2From), this.currentAccount, peerDialogId, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda27
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$48(peerDialogId);
                    }
                }, (peerDialogId != j || peerDialogId == UserObject.ANONYMOUS || UserObject.isDeleted(user2) || isBot || z22) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), !z22 ? null : new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda28
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$49(peerDialogId);
                    }
                });
                if (j4 == j) {
                }
                this.tableView.addRowUser(LocaleController.getString(R.string.Gift2To), this.currentAccount, j4, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda29
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$50(j4);
                    }
                }, null, !z22 ? null : new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda30
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$51(j4);
                    }
                });
                this.tableView.addRowDateTime(LocaleController.getString(R.string.StarsTransactionDate), i3);
                if (starGift.stars > 0) {
                }
                if (starGift.limited) {
                    StarsIntroActivity.addAvailabilityRow(this.tableView, this.currentAccount, starGift, this.resourcesProvider);
                }
                if (!isOutOwner) {
                    if (this.messageObjectRepolled) {
                    }
                    if (z12) {
                    }
                }
                tL_textWithEntities2 = tL_textWithEntities4;
                if (tL_textWithEntities4 != null) {
                    this.tableView.addFullRow(tL_textWithEntities2.text, tL_textWithEntities2.entities);
                }
                if (isOutOwner) {
                }
                this.button.setText(LocaleController.getString(R.string.OK), !this.firstSet);
                str3 = null;
                this.button.setSubText(null, !this.firstSet);
                this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda32
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarGiftSheet.this.lambda$set$53(view);
                    }
                });
                z13 = z2;
            } else {
                if (!z14) {
                    return this;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                if (!(tL_messageActionStarGiftUnique2.gift instanceof TL_stars.TL_starGiftUnique)) {
                    return this;
                }
                this.topView.setTransferAvailable(true);
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique2.gift;
                boolean z23 = (tL_messageActionStarGiftUnique2.flags & 16) != 0;
                z13 = tL_messageActionStarGiftUnique2.refunded;
                set(tL_starGiftUnique, z23, z13);
                boolean z24 = tL_messageActionStarGiftUnique2.saved;
                starGift = tL_messageActionStarGiftUnique2.gift;
                isOutOwner = (tL_messageActionStarGiftUnique2.upgrade ^ true) == messageObject.isOutOwner();
                if (messageObject.getDialogId() == clientUserId) {
                    isOutOwner = false;
                }
                repollSavedStarGift();
                z10 = z24;
                tL_textWithEntities2 = null;
                str3 = null;
                z8 = z15;
                z7 = false;
                z11 = false;
            }
            String str4 = starGift == null ? str3 : starGift.owner_address;
            final String str5 = starGift == null ? str3 : starGift.gift_address;
            if (z13) {
                this.beforeTableTextView.setVisibility(0);
                this.beforeTableTextView.setText(LocaleController.getString(R.string.Gift2Refunded));
                linksTextView = this.beforeTableTextView;
                i2 = Theme.key_text_RedBold;
            } else if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && z7 && !z8) {
                this.beforeTableTextView.setVisibility(0);
                LinkSpanDrawable.LinksTextView linksTextView3 = this.beforeTableTextView;
                if (isOutOwner) {
                    string5 = LocaleController.formatString((tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? R.string.Gift2OutSenderHidden2 : R.string.Gift2OutSenderMessageHidden2, DialogObject.getShortName(messageObject.getDialogId()));
                } else {
                    string5 = LocaleController.getString((tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2);
                }
                linksTextView3.setText(string5);
                linksTextView = this.beforeTableTextView;
                i2 = Theme.key_dialogTextGray2;
            } else {
                this.beforeTableTextView.setVisibility(8);
                if (TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
                    this.afterTableTextView.setVisibility(0);
                    linksTextView2 = this.afterTableTextView;
                    string6 = LocaleController.getString(R.string.Gift2InBlockchain);
                    starGiftSheet$$ExternalSyntheticLambda23 = new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda33
                        @Override // java.lang.Runnable
                        public final void run() {
                            StarGiftSheet.this.lambda$set$54(str5);
                        }
                    };
                } else if (!z11 || z13 || starGift == null || !isMine(this.currentAccount, getDialogId())) {
                    this.afterTableTextView.setVisibility(8);
                    if (this.firstSet) {
                        switchPage(0, false);
                        this.layoutManager.scrollToPosition(0);
                        this.firstSet = false;
                    }
                    this.actionBar.setTitle(getTitle());
                    updateViewPager();
                } else {
                    this.afterTableTextView.setVisibility(0);
                    if (getDialogId() >= 0) {
                        linksTextView2 = this.afterTableTextView;
                        string6 = LocaleController.getString(z10 ? R.string.Gift2ProfileVisible3 : R.string.Gift2ProfileInvisible3);
                        starGiftSheet$$ExternalSyntheticLambda23 = new StarGiftSheet$$ExternalSyntheticLambda23(this);
                    } else {
                        linksTextView2 = this.afterTableTextView;
                        string6 = LocaleController.getString(z10 ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3);
                        starGiftSheet$$ExternalSyntheticLambda23 = new StarGiftSheet$$ExternalSyntheticLambda23(this);
                    }
                }
                linksTextView2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string6, starGiftSheet$$ExternalSyntheticLambda23), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                if (this.firstSet) {
                }
                this.actionBar.setTitle(getTitle());
                updateViewPager();
            }
            linksTextView.setTextColor(Theme.getColor(i2, this.resourcesProvider));
            if (TextUtils.isEmpty(str4)) {
            }
            if (z11) {
            }
            this.afterTableTextView.setVisibility(8);
            if (this.firstSet) {
            }
            this.actionBar.setTitle(getTitle());
            updateViewPager();
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0322 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x035c A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v63, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v65 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StarGiftSheet set(TL_stars.SavedStarGift savedStarGift, StarsController.IGiftsList iGiftsList) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        String str;
        TopView topView;
        CharSequence string;
        String str2;
        TopView topView2;
        String formatString;
        char c;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence concat;
        CharSequence releasedByText;
        CharSequence charSequence3;
        CharSequence charSequence4;
        int i;
        TL_stars.StarGift starGift;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        String str3;
        final String str4;
        String str5;
        int i2;
        String formatPluralStringComma;
        LinkSpanDrawable.LinksTextView linksTextView;
        int i3;
        ?? r2;
        String string2;
        StarGiftSheet$$ExternalSyntheticLambda23 starGiftSheet$$ExternalSyntheticLambda23;
        if (savedStarGift == null) {
            return this;
        }
        this.myProfile = isMine(this.currentAccount, this.dialogId);
        this.savedStarGift = savedStarGift;
        this.giftsList = iGiftsList;
        this.messageObject = null;
        String shortName = DialogObject.getShortName(this.dialogId);
        final long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
        boolean isBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)));
        int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if ((savedStarGift.flags & 2) == 0) {
            peerDialogId = UserObject.ANONYMOUS;
        }
        long j = this.dialogId;
        boolean z = j < 0;
        TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
        boolean z2 = savedStarGift.refunded;
        TL_stars.StarGift starGift2 = savedStarGift.gift;
        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
            String str6 = starGift2.owner_address;
            str4 = starGift2.gift_address;
            this.topView.setTransferAvailable(true);
            set((TL_stars.TL_starGiftUnique) savedStarGift.gift, (savedStarGift.flags & 256) != 0, z2);
            str5 = str6;
            tL_textWithEntities = tL_textWithEntities3;
        } else {
            boolean z3 = this.myProfile && clientUserId == peerDialogId && j >= 0;
            this.topView.setTransferAvailable(true);
            tL_textWithEntities = tL_textWithEntities3;
            this.topView.setGift(savedStarGift.gift, false, isWorn(this.currentAccount, getUniqueGift()), getLink() != null);
            this.tableView.clear();
            if (z3) {
                topView = this.topView;
                str = LocaleController.getString(R.string.Gift2TitleSaved);
                this.title = str;
                if (!z2) {
                    if (savedStarGift.can_upgrade) {
                        i2 = R.string.Gift2SelfInfoUpgrade;
                    } else {
                        long j2 = savedStarGift.convert_stars;
                        if (j2 > 0) {
                            formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2SelfInfoConvert", (int) j2);
                            string = AndroidUtilities.replaceTags(formatPluralStringComma);
                            topView2 = topView;
                            str2 = str;
                            charSequence3 = string;
                        } else {
                            i2 = R.string.Gift2SelfInfo;
                        }
                    }
                    formatPluralStringComma = LocaleController.getString(i2);
                    string = AndroidUtilities.replaceTags(formatPluralStringComma);
                    topView2 = topView;
                    str2 = str;
                    charSequence3 = string;
                }
                topView2 = topView;
                str2 = str;
                charSequence3 = null;
            } else if (!z || this.myProfile) {
                boolean z4 = this.myProfile;
                if ((!z4 || savedStarGift.can_upgrade) && savedStarGift.upgrade_stars > 0) {
                    TopView topView3 = this.topView;
                    String string3 = LocaleController.getString(z4 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                    this.title = string3;
                    if (!z2 && this.myProfile) {
                        string = LocaleController.getString(R.string.Gift2InfoInFreeUpgrade);
                        str2 = string3;
                        topView2 = topView3;
                        charSequence3 = string;
                    } else {
                        str = string3;
                        topView = topView3;
                        topView2 = topView;
                        str2 = str;
                        charSequence3 = null;
                    }
                } else {
                    TopView topView4 = this.topView;
                    String string4 = LocaleController.getString((clientUserId != peerDialogId || z) ? z4 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile : R.string.Gift2TitleSaved);
                    this.title = string4;
                    if (z2) {
                        charSequence = "";
                        concat = null;
                    } else {
                        if (isBot || !canConvert()) {
                            if (this.myProfile) {
                                formatString = LocaleController.getString(savedStarGift.unsaved ? z ? R.string.Gift2Info2ChannelKeep : R.string.Gift2Info2BotKeep : z ? R.string.Gift2Info2ChannelRemove : R.string.Gift2Info2BotRemove);
                            } else {
                                formatString = LocaleController.formatString((!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? R.string.Gift2Info2OutExpired : R.string.Gift2Info2OutUpgrade, shortName);
                            }
                        } else if (this.myProfile) {
                            formatString = LocaleController.formatPluralStringComma(currentTime <= 0 ? z ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired" : z ? "Gift2Info3Channel" : "Gift2Info3", (int) savedStarGift.convert_stars);
                        } else {
                            formatString = LocaleController.formatPluralStringComma("Gift2Info2Out", (int) savedStarGift.convert_stars, shortName);
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                        if (isBot || !canConvert()) {
                            c = 1;
                            charSequence = "";
                            charSequence2 = charSequence;
                        } else {
                            c = 1;
                            charSequence2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda15
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StarGiftSheet.this.lambda$set$41();
                                }
                            }), true);
                            charSequence = "";
                        }
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        charSequenceArr[0] = replaceTags;
                        charSequenceArr[c] = " ";
                        charSequenceArr[2] = charSequence2;
                        concat = TextUtils.concat(charSequenceArr);
                    }
                    topView4.setText(0, string4, concat, null, releasedByText(savedStarGift.gift));
                    if (clientUserId == peerDialogId || z) {
                        this.tableView.addRowUser(LocaleController.getString(R.string.Gift2From), this.currentAccount, peerDialogId, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda16
                            @Override // java.lang.Runnable
                            public final void run() {
                                StarGiftSheet.this.lambda$set$42(peerDialogId);
                            }
                        }, (peerDialogId != clientUserId || peerDialogId == UserObject.ANONYMOUS || isBot || UserObject.isDeleted(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId))) || z) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda17
                            @Override // java.lang.Runnable
                            public final void run() {
                                StarGiftSheet.this.lambda$set$43(peerDialogId);
                            }
                        });
                    }
                    this.tableView.addRow(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(savedStarGift.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(savedStarGift.date * 1000))));
                    this.tableView.addRow(LocaleController.getString(R.string.Gift2Value), StarsIntroActivity.replaceStarsWithPlain(TextUtils.concat("⭐️ " + LocaleController.formatNumber(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ','), " ", (canConvert() || z2) ? charSequence : ButtonSpan.make(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new StarGiftSheet$$ExternalSyntheticLambda18(this), this.resourcesProvider)), 0.8f));
                    starGift = savedStarGift.gift;
                    if (starGift.limited && !z2) {
                        StarsIntroActivity.addAvailabilityRow(this.tableView, this.currentAccount, starGift, this.resourcesProvider);
                    }
                    if (!z2 && savedStarGift.can_upgrade) {
                        this.tableView.addRow(LocaleController.getString(R.string.Gift2Status), LocaleController.getString(R.string.Gift2StatusNonUnique), LocaleController.getString(R.string.Gift2StatusUpgrade), new StarGiftSheet$$ExternalSyntheticLambda19(this));
                    }
                    tL_textWithEntities2 = savedStarGift.message;
                    if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z2) {
                        TableView tableView = this.tableView;
                        TLRPC.TL_textWithEntities tL_textWithEntities4 = savedStarGift.message;
                        tableView.addFullRow(tL_textWithEntities4.text, tL_textWithEntities4.entities);
                    }
                    if (this.myProfile || !savedStarGift.can_upgrade) {
                        this.button.setText(LocaleController.getString(R.string.OK), !this.firstSet);
                        str3 = null;
                        this.button.setSubText(null, !this.firstSet);
                        this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda21
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                StarGiftSheet.this.lambda$set$45(view);
                            }
                        });
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(savedStarGift.upgrade_stars > 0 ? R.string.Gift2UpgradeButtonFree : R.string.Gift2UpgradeButtonGift));
                        spannableStringBuilder.append((CharSequence) " ^");
                        if (this.upgradeIconSpan == null) {
                            this.upgradeIconSpan = new ColoredImageSpan(new UpgradeIcon(this.button, Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider)));
                        }
                        spannableStringBuilder.setSpan(this.upgradeIconSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        this.button.setText(spannableStringBuilder, !this.firstSet);
                        this.button.setSubText(null, !this.firstSet);
                        this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda20
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                StarGiftSheet.this.lambda$set$44(view);
                            }
                        });
                        str3 = null;
                    }
                    str4 = str3;
                    str5 = str4;
                }
            } else {
                TopView topView5 = this.topView;
                String string5 = LocaleController.getString(R.string.Gift2TitleProfile);
                this.title = string5;
                releasedByText = releasedByText(savedStarGift.gift.released_by);
                charSequence3 = null;
                charSequence4 = null;
                i = 0;
                topView2 = topView5;
                str2 = string5;
                topView2.setText(i, str2, charSequence3, charSequence4, releasedByText);
                charSequence = "";
                if (clientUserId == peerDialogId) {
                }
                this.tableView.addRowUser(LocaleController.getString(R.string.Gift2From), this.currentAccount, peerDialogId, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda16
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$42(peerDialogId);
                    }
                }, (peerDialogId != clientUserId || peerDialogId == UserObject.ANONYMOUS || isBot || UserObject.isDeleted(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId))) || z) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda17
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$43(peerDialogId);
                    }
                });
                this.tableView.addRow(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(savedStarGift.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(savedStarGift.date * 1000))));
                this.tableView.addRow(LocaleController.getString(R.string.Gift2Value), StarsIntroActivity.replaceStarsWithPlain(TextUtils.concat("⭐️ " + LocaleController.formatNumber(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ','), " ", (canConvert() || z2) ? charSequence : ButtonSpan.make(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new StarGiftSheet$$ExternalSyntheticLambda18(this), this.resourcesProvider)), 0.8f));
                starGift = savedStarGift.gift;
                if (starGift.limited) {
                    StarsIntroActivity.addAvailabilityRow(this.tableView, this.currentAccount, starGift, this.resourcesProvider);
                }
                if (!z2) {
                    this.tableView.addRow(LocaleController.getString(R.string.Gift2Status), LocaleController.getString(R.string.Gift2StatusNonUnique), LocaleController.getString(R.string.Gift2StatusUpgrade), new StarGiftSheet$$ExternalSyntheticLambda19(this));
                }
                tL_textWithEntities2 = savedStarGift.message;
                if (tL_textWithEntities2 != null) {
                    TableView tableView2 = this.tableView;
                    TLRPC.TL_textWithEntities tL_textWithEntities42 = savedStarGift.message;
                    tableView2.addFullRow(tL_textWithEntities42.text, tL_textWithEntities42.entities);
                }
                if (this.myProfile) {
                }
                this.button.setText(LocaleController.getString(R.string.OK), !this.firstSet);
                str3 = null;
                this.button.setSubText(null, !this.firstSet);
                this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda21
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StarGiftSheet.this.lambda$set$45(view);
                    }
                });
                str4 = str3;
                str5 = str4;
            }
            releasedByText = releasedByText(savedStarGift.gift);
            charSequence4 = null;
            i = 0;
            topView2.setText(i, str2, charSequence3, charSequence4, releasedByText);
            charSequence = "";
            if (clientUserId == peerDialogId) {
            }
            this.tableView.addRowUser(LocaleController.getString(R.string.Gift2From), this.currentAccount, peerDialogId, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$set$42(peerDialogId);
                }
            }, (peerDialogId != clientUserId || peerDialogId == UserObject.ANONYMOUS || isBot || UserObject.isDeleted(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId))) || z) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    StarGiftSheet.this.lambda$set$43(peerDialogId);
                }
            });
            this.tableView.addRow(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(savedStarGift.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(savedStarGift.date * 1000))));
            this.tableView.addRow(LocaleController.getString(R.string.Gift2Value), StarsIntroActivity.replaceStarsWithPlain(TextUtils.concat("⭐️ " + LocaleController.formatNumber(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ','), " ", (canConvert() || z2) ? charSequence : ButtonSpan.make(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new StarGiftSheet$$ExternalSyntheticLambda18(this), this.resourcesProvider)), 0.8f));
            starGift = savedStarGift.gift;
            if (starGift.limited) {
            }
            if (!z2) {
            }
            tL_textWithEntities2 = savedStarGift.message;
            if (tL_textWithEntities2 != null) {
            }
            if (this.myProfile) {
            }
            this.button.setText(LocaleController.getString(R.string.OK), !this.firstSet);
            str3 = null;
            this.button.setSubText(null, !this.firstSet);
            this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda21
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StarGiftSheet.this.lambda$set$45(view);
                }
            });
            str4 = str3;
            str5 = str4;
        }
        if (savedStarGift.refunded) {
            this.beforeTableTextView.setVisibility(0);
            this.beforeTableTextView.setText(LocaleController.getString(R.string.Gift2Refunded));
            linksTextView = this.beforeTableTextView;
            i3 = Theme.key_text_RedBold;
        } else {
            if (!TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str4) || !this.myProfile || !(savedStarGift.gift instanceof TL_stars.TL_starGift) || !savedStarGift.name_hidden) {
                this.beforeTableTextView.setVisibility(8);
                if (TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str4)) {
                    this.afterTableTextView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda22
                        @Override // java.lang.Runnable
                        public final void run() {
                            StarGiftSheet.this.lambda$set$46(str4);
                        }
                    }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                } else {
                    if (this.myProfile || !isMine(this.currentAccount, this.dialogId)) {
                        r2 = 0;
                        this.afterTableTextView.setVisibility(8);
                        if (this.firstSet) {
                            switchPage(r2, r2);
                            this.layoutManager.scrollToPosition(r2);
                            this.firstSet = r2;
                        }
                        this.actionBar.setTitle(getTitle());
                        updateViewPager();
                        return this;
                    }
                    long j3 = this.dialogId;
                    LinkSpanDrawable.LinksTextView linksTextView2 = this.afterTableTextView;
                    boolean z5 = savedStarGift.unsaved;
                    if (j3 >= 0) {
                        string2 = LocaleController.getString(!z5 ? R.string.Gift2ProfileVisible3 : R.string.Gift2ProfileInvisible3);
                        starGiftSheet$$ExternalSyntheticLambda23 = new StarGiftSheet$$ExternalSyntheticLambda23(this);
                    } else {
                        string2 = LocaleController.getString(!z5 ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3);
                        starGiftSheet$$ExternalSyntheticLambda23 = new StarGiftSheet$$ExternalSyntheticLambda23(this);
                    }
                    linksTextView2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string2, starGiftSheet$$ExternalSyntheticLambda23), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                }
                r2 = 0;
                this.afterTableTextView.setVisibility(0);
                if (this.firstSet) {
                }
                this.actionBar.setTitle(getTitle());
                updateViewPager();
                return this;
            }
            this.beforeTableTextView.setVisibility(0);
            this.beforeTableTextView.setText(LocaleController.getString((tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2));
            linksTextView = this.beforeTableTextView;
            i3 = Theme.key_dialogTextGray2;
        }
        linksTextView.setTextColor(Theme.getColor(i3, this.resourcesProvider));
        if (TextUtils.isEmpty(str5)) {
        }
        if (this.myProfile) {
        }
        r2 = 0;
        this.afterTableTextView.setVisibility(8);
        if (this.firstSet) {
        }
        this.actionBar.setTitle(getTitle());
        updateViewPager();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void set(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z, boolean z2) {
        SpannableString spannableString;
        TL_stars.starGiftAttributeOriginalDetails stargiftattributeoriginaldetails;
        ButtonWithCounterView buttonWithCounterView;
        View.OnClickListener onClickListener;
        SpannableString spannableString2;
        Spannable spannable;
        TableView tableView;
        CharSequence formatSpannable;
        TableView tableView2;
        CharSequence formatSpannable2;
        TableView.TableRowFullContent addFullRow;
        TableView tableView3;
        String string;
        StringBuilder sb;
        final long peerDialogId = DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
        this.title = tL_starGiftUnique.title + " #" + LocaleController.formatNumber(tL_starGiftUnique.num, ',');
        this.topView.setGift(tL_starGiftUnique, isMineWithActions(this.currentAccount, peerDialogId), isWorn(this.currentAccount, getUniqueGift()), getLink() != null);
        this.topView.setText(0, tL_starGiftUnique.title, tL_starGiftUnique.released_by == null ? LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num) : null, releasedByUniqueText(tL_starGiftUnique.num, tL_starGiftUnique.released_by), null);
        this.ownerTextView = null;
        this.tableView.clear();
        if (!z2) {
            if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                this.tableView.addWalletAddressRow(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_address, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda48
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$37();
                    }
                });
            } else if (peerDialogId == 0 && tL_starGiftUnique.owner_name != null) {
                this.tableView.addRow(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_name);
            } else if (peerDialogId != 0) {
                spannableString = null;
                this.ownerTextView = ((TableView.TableRowContent) this.tableView.addRowUserWithEmojiStatus(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, peerDialogId, new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda49
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarGiftSheet.this.lambda$set$38(peerDialogId);
                    }
                }).getChildAt(1)).getChildAt(0);
                addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                if (!z2) {
                    if (this.messageObject == null) {
                        tableView3 = this.tableView;
                        string = LocaleController.getString(R.string.Gift2Quantity);
                        sb = new StringBuilder();
                    } else if (this.messageObjectRepolled) {
                        tableView3 = this.tableView;
                        string = LocaleController.getString(R.string.Gift2Quantity);
                        sb = new StringBuilder();
                    } else {
                        TextView textView = (TextView) ((TableView.TableRowContent) this.tableView.addRow(LocaleController.getString(R.string.Gift2Quantity), "").getChildAt(1)).getChildAt(0);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        LoadingSpan loadingSpan = new LoadingSpan(textView, AndroidUtilities.dp(90.0f), 0, this.resourcesProvider);
                        int i = Theme.key_windowBackgroundWhiteBlackText;
                        loadingSpan.setColors(Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.21f), Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.08f));
                        spannableStringBuilder.setSpan(loadingSpan, 0, 1, 33);
                        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
                        repollMessage();
                    }
                    sb.append(LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued));
                    sb.append(LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total));
                    tableView3.addRow(string, sb.toString());
                }
                stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                if (stargiftattributeoriginaldetails != null) {
                    if ((stargiftattributeoriginaldetails.flags & 1) != 0) {
                        final long peerDialogId2 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.sender_id);
                        spannableString2 = new SpannableString(DialogObject.getName(peerDialogId2));
                        spannableString2.setSpan(new ClickableSpan() { // from class: org.telegram.ui.Stars.StarGiftSheet.9
                            @Override // android.text.style.ClickableSpan
                            public void onClick(View view) {
                                StarGiftSheet.this.lambda$set$50(peerDialogId2);
                            }

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public void updateDrawState(TextPaint textPaint) {
                                textPaint.setColor(textPaint.linkColor);
                            }
                        }, 0, spannableString2.length(), 33);
                    } else {
                        spannableString2 = spannableString;
                    }
                    final long peerDialogId3 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.recipient_id);
                    SpannableString spannableString3 = new SpannableString(DialogObject.getName(peerDialogId3));
                    spannableString3.setSpan(new ClickableSpan() { // from class: org.telegram.ui.Stars.StarGiftSheet.10
                        @Override // android.text.style.ClickableSpan
                        public void onClick(View view) {
                            StarGiftSheet.this.lambda$set$50(peerDialogId3);
                        }

                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public void updateDrawState(TextPaint textPaint) {
                            textPaint.setColor(textPaint.linkColor);
                        }
                    }, 0, spannableString3.length(), 33);
                    if (stargiftattributeoriginaldetails.message != null) {
                        TextPaint textPaint = new TextPaint(1);
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                        MessageObject.addEntitiesToText(spannableStringBuilder2, stargiftattributeoriginaldetails.message.entities, false, false, false, false);
                        spannable = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder2, textPaint.getFontMetricsInt(), false), stargiftattributeoriginaldetails.message.entities, textPaint.getFontMetricsInt());
                    } else {
                        spannable = spannableString;
                    }
                    String replaceAll = LocaleController.getInstance().getFormatterYear().format(stargiftattributeoriginaldetails.date * 1000).replaceAll("\\.", "/");
                    if (stargiftattributeoriginaldetails.sender_id != stargiftattributeoriginaldetails.recipient_id) {
                        if (spannableString2 != null) {
                            if (spannable == null) {
                                addFullRow = this.tableView.addFullRow(LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetails, spannableString2, spannableString3, replaceAll));
                            } else {
                                tableView = this.tableView;
                                formatSpannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsComment, spannableString2, spannableString3, replaceAll, spannable);
                            }
                        } else if (spannable == null) {
                            tableView2 = this.tableView;
                            formatSpannable2 = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsNoSender, spannableString3, replaceAll);
                            addFullRow = tableView2.addFullRow(formatSpannable2);
                        } else {
                            tableView = this.tableView;
                            formatSpannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsNoSenderComment, spannableString3, replaceAll, spannable);
                        }
                        addFullRow = tableView.addFullRow(formatSpannable);
                    } else if (spannable == null) {
                        tableView2 = this.tableView;
                        formatSpannable2 = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsSelf, spannableString2, replaceAll);
                        addFullRow = tableView2.addFullRow(formatSpannable2);
                    } else {
                        tableView = this.tableView;
                        formatSpannable = LocaleController.formatSpannable(R.string.Gift2AttributeOriginalDetailsSelfComment, spannableString2, replaceAll, spannable);
                        addFullRow = tableView.addFullRow(formatSpannable);
                    }
                    addFullRow.setFilled(true);
                    SpoilersTextView spoilersTextView = (SpoilersTextView) addFullRow.getChildAt(0);
                    spoilersTextView.setTextSize(1, 12.0f);
                    spoilersTextView.setGravity(17);
                }
                if (!isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id)) || tL_starGiftUnique.resell_amount == null) {
                    this.button.setText(LocaleController.getString(R.string.OK), !this.firstSet);
                    this.button.setSubText(spannableString, !this.firstSet);
                    buttonWithCounterView = this.button;
                    onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda51
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            StarGiftSheet.this.lambda$set$40(view);
                        }
                    };
                } else {
                    setButtonTextResale(tL_starGiftUnique);
                    buttonWithCounterView = this.button;
                    onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda50
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            StarGiftSheet.this.lambda$set$39(view);
                        }
                    };
                }
                buttonWithCounterView.setOnClickListener(onClickListener);
                this.actionBar.setTitle(getTitle());
            }
        }
        spannableString = null;
        addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
        addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        addAttributeRow(StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        if (!z2) {
        }
        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) StarsController.findAttribute(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails != null) {
        }
        if (isMine(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
        }
        this.button.setText(LocaleController.getString(R.string.OK), !this.firstSet);
        this.button.setSubText(spannableString, !this.firstSet);
        buttonWithCounterView = this.button;
        onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda51
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarGiftSheet.this.lambda$set$40(view);
            }
        };
        buttonWithCounterView.setOnClickListener(onClickListener);
        this.actionBar.setTitle(getTitle());
    }

    public StarGiftSheet setOnBoughtGift(Utilities.Callback2 callback2) {
        this.boughtGift = callback2;
        return this;
    }

    public StarGiftSheet setOnGiftUpdatedListener(Runnable runnable) {
        this.onGiftUpdatedListener = runnable;
        return this;
    }

    public StarGiftSheet setupWearPage() {
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return this;
        }
        long peerDialogId = DialogObject.getPeerDialogId(uniqueGift.owner_id);
        this.wearTitle.setText(LocaleController.formatString(R.string.Gift2WearTitle, uniqueGift.title + " #" + LocaleController.formatNumber(uniqueGift.num, ',')));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.lockSpan == null) {
                this.lockSpan = new ColoredImageSpan(R.drawable.msg_mini_lock3);
            }
            spannableStringBuilder.setSpan(this.lockSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.button.setText(spannableStringBuilder, true);
        this.button.setSubText(null, true);
        this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarGiftSheet.this.lambda$setupWearPage$7(view);
            }
        });
        this.topView.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        switchPage(2, false);
        this.onlyWearInfo = true;
        return this;
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected boolean shouldDrawBackground() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet, android.app.Dialog
    public void show() {
        MessageObject messageObject;
        TLRPC.Message message;
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
            return;
        }
        if (this.slug != null && this.slugStarGift == null) {
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
            alertDialog.showDelayed(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.slug;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda3
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    StarGiftSheet.this.lambda$show$70(alertDialog, tLObject, tL_error);
                }
            });
        } else if (this.savedStarGift == null && (messageObject = this.messageObject) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                final TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        final AlertDialog alertDialog2 = new AlertDialog(getContext(), 3);
                        alertDialog2.showDelayed(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new RequestDelegate() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda4
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                StarGiftSheet.this.lambda$show$73(tL_messageActionStarGift, alertDialog2, tLObject, tL_error);
                            }
                        });
                        return;
                    }
                    if (getInputStarGift() != null) {
                        final AlertDialog alertDialog3 = new AlertDialog(getContext(), 3);
                        alertDialog3.showDelayed(500L);
                        StarsController.getInstance(this.currentAccount).getUserStarGift(getInputStarGift(), new Utilities.Callback() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda5
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj) {
                                StarGiftSheet.this.lambda$show$74(alertDialog3, (TL_stars.SavedStarGift) obj);
                            }
                        });
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public void showHint(CharSequence charSequence, View view, boolean z) {
        Layout layout;
        float paddingLeft;
        HintView2 hintView2 = this.currentHintView;
        if ((hintView2 != null && hintView2.shown() && this.currentHintViewTextView == view) || view == null) {
            return;
        }
        if (!z) {
            if (view instanceof TextView) {
                layout = ((TextView) view).getLayout();
            } else if (!(view instanceof SimpleTextView)) {
                return;
            } else {
                layout = ((SimpleTextView) view).getLayout();
            }
            if (layout == null) {
                return;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return;
            }
            Spanned spanned = (Spanned) text;
            ButtonSpan[] buttonSpanArr = (ButtonSpan[]) spanned.getSpans(0, spanned.length(), ButtonSpan.class);
            if (buttonSpanArr == null || buttonSpanArr.length <= 0) {
                return;
            }
            paddingLeft = view.getPaddingLeft() + layout.getPrimaryHorizontal(spanned.getSpanStart(buttonSpanArr[buttonSpanArr.length - 1])) + (r5.getSize() / 2.0f);
        } else {
            if (!(view instanceof SimpleTextView)) {
                return;
            }
            SimpleTextView simpleTextView = (SimpleTextView) view;
            paddingLeft = simpleTextView.getRightDrawableX() + (simpleTextView.getRightDrawableWidth() / 2.0f);
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        this.container.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        HintView2 hintView22 = this.currentHintView;
        if (hintView22 != null) {
            hintView22.hide();
            this.currentHintView = null;
        }
        final HintView2 hintView23 = new HintView2(getContext(), 3);
        hintView23.setMultilineText(!z);
        hintView23.setText(charSequence);
        hintView23.setJointPx(0.0f, (iArr[0] + paddingLeft) - (AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft));
        hintView23.setTranslationY(((iArr[1] - AndroidUtilities.dp(100.0f)) - (view.getHeight() / 2.0f)) + AndroidUtilities.dp((z ? 18 : 0) + 4.33f));
        hintView23.setDuration(3000L);
        hintView23.setPadding(AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0);
        hintView23.setOnHiddenListener(new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda86
            @Override // java.lang.Runnable
            public final void run() {
                AndroidUtilities.removeFromParent(HintView2.this);
            }
        });
        hintView23.show();
        this.container.addView(hintView23, LayoutHelper.createFrame(-1, 100.0f));
        this.currentHintView = hintView23;
        this.currentHintViewTextView = view;
    }

    public void switchPage(int i, boolean z) {
        switchPage(i, z, null);
    }

    public void switchPage(final int i, boolean z, final Runnable runnable) {
        ValueAnimator valueAnimator = this.switchingPagesAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.switchingPagesAnimator = null;
        }
        if (i != 1) {
            AndroidUtilities.cancelRunOnUIThread(this.topView.checkToRotateRunnable);
        }
        if (!this.firstSet) {
            this.lastTop = Float.valueOf(this.container.top());
        }
        PageTransition pageTransition = this.currentPage;
        this.currentPage = new PageTransition(pageTransition == null ? 0 : pageTransition.to, i, 0.0f);
        this.adapter.setHeights(this.topView.getFinalHeight(), getBottomView().getMeasuredHeight());
        if (z) {
            this.infoLayout.setVisibility(this.currentPage.contains(0) ? 0 : 8);
            this.upgradeLayout.setVisibility(this.currentPage.contains(1) ? 0 : 8);
            this.wearLayout.setVisibility(this.currentPage.contains(2) ? 0 : 8);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.switchingPagesAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda14
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    StarGiftSheet.this.lambda$switchPage$31(valueAnimator2);
                }
            });
            this.switchingPagesAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stars.StarGiftSheet.7
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    StarGiftSheet.this.onSwitchedPage();
                    StarGiftSheet.this.infoLayout.setVisibility(i == 0 ? 0 : 8);
                    StarGiftSheet.this.upgradeLayout.setVisibility(i == 1 ? 0 : 8);
                    StarGiftSheet.this.wearLayout.setVisibility(i == 2 ? 0 : 8);
                    StarGiftSheet.this.switchingPagesAnimator = null;
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            });
            this.switchingPagesAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.switchingPagesAnimator.setDuration(320L);
            this.switchingPagesAnimator.start();
            this.topView.prepareSwitchPage(this.currentPage);
        } else {
            this.currentPage.setProgress(1.0f);
            onSwitchedPage();
            this.infoLayout.setVisibility(i == 0 ? 0 : 8);
            this.upgradeLayout.setVisibility(i == 1 ? 0 : 8);
            this.wearLayout.setVisibility(i != 2 ? 8 : 0);
            if (runnable != null) {
                runnable.run();
            }
        }
        HintView2 hintView2 = this.currentHintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.currentHintView = null;
        }
    }

    public void toggleWear() {
        toggleWear(false);
    }

    public void toggleWear(boolean z) {
        TL_stars.TL_starGiftUnique uniqueGift = getUniqueGift();
        if (uniqueGift == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", 3).apply();
        final boolean z2 = !isWorn(this.currentAccount, getUniqueGift());
        if (isWorn(this.currentAccount, getUniqueGift())) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(getDialogId(), new TLRPC.TL_emojiStatusEmpty(), null);
        } else {
            final long dialogId = getDialogId();
            if (dialogId >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    getBulletinFactory().createSimpleBulletinDetail(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda65
                        @Override // java.lang.Runnable
                        public final void run() {
                            StarGiftSheet.this.lambda$toggleWear$8();
                        }
                    })).ignoreDetach().show();
                    return;
                }
            } else if (!z) {
                final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                this.button.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(dialogId, new Consumer() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda66
                    @Override // com.google.android.exoplayer2.util.Consumer
                    public final void accept(Object obj) {
                        StarGiftSheet.this.lambda$toggleWear$11(messagesController, dialogId, (TL_stories.TL_premium_boostsStatus) obj);
                    }
                });
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = uniqueGift.id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(getDialogId(), tL_inputEmojiStatusCollectible, uniqueGift);
        }
        this.topView.buttons[1].set(z2 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(z2 ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), true);
        if (this.onlyWearInfo) {
            lambda$new$0();
            return;
        }
        Runnable runnable = new Runnable() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda67
            @Override // java.lang.Runnable
            public final void run() {
                StarGiftSheet.this.lambda$toggleWear$12(z2);
            }
        };
        if (this.currentPage.is(0)) {
            runnable.run();
        } else {
            switchPage(0, true, runnable);
        }
        this.button.setText(LocaleController.getString(R.string.OK), !this.firstSet);
        this.button.setSubText(null, !this.firstSet);
        this.button.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda68
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StarGiftSheet.this.lambda$toggleWear$13(view);
            }
        });
    }
}
