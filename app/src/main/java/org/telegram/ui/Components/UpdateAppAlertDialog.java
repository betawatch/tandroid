package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC$TL_help_appUpdate;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
/* loaded from: classes3.dex */
public class UpdateAppAlertDialog extends BottomSheet {
    private int accountNum;
    private boolean animationInProgress;
    private TLRPC$TL_help_appUpdate appUpdate;
    private LinearLayout linearLayout;
    private int[] location = new int[2];
    private int scrollOffsetY;
    private NestedScrollView scrollView;
    private View shadow;
    private AnimatorSet shadowAnimation;
    private Drawable shadowDrawable;

    @Override // org.telegram.ui.ActionBar.BottomSheet
    protected boolean canDismissWithSwipe() {
        return false;
    }

    /* loaded from: classes3.dex */
    public class BottomSheetCell extends FrameLayout {
        private View background;
        private boolean hasBackground;
        private TextView[] textView = new TextView[2];

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BottomSheetCell(Context context, boolean z) {
            super(context);
            UpdateAppAlertDialog.this = r13;
            this.hasBackground = !z;
            setBackground(null);
            View view = new View(context);
            this.background = view;
            if (this.hasBackground) {
                view.setBackground(Theme.AdaptiveRipple.filledRect("featuredStickers_addButton", 4.0f));
            }
            addView(this.background, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, z ? 0.0f : 16.0f, 16.0f, 16.0f));
            for (int i = 0; i < 2; i++) {
                this.textView[i] = new TextView(context);
                this.textView[i].setLines(1);
                this.textView[i].setSingleLine(true);
                this.textView[i].setGravity(1);
                this.textView[i].setEllipsize(TextUtils.TruncateAt.END);
                this.textView[i].setGravity(17);
                if (this.hasBackground) {
                    this.textView[i].setTextColor(Theme.getColor("featuredStickers_buttonText"));
                    this.textView[i].setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                } else {
                    this.textView[i].setTextColor(Theme.getColor("featuredStickers_addButton"));
                }
                this.textView[i].setTextSize(1, 14.0f);
                this.textView[i].setPadding(0, 0, 0, this.hasBackground ? 0 : AndroidUtilities.dp(13.0f));
                addView(this.textView[i], LayoutHelper.createFrame(-2, -2, 17));
                if (i == 1) {
                    this.textView[i].setAlpha(0.0f);
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.hasBackground ? 80.0f : 50.0f), 1073741824));
        }

        public void setText(CharSequence charSequence, boolean z) {
            if (!z) {
                this.textView[0].setText(charSequence);
                return;
            }
            this.textView[1].setText(charSequence);
            UpdateAppAlertDialog.this.animationInProgress = true;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(180L);
            animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.textView[0], View.ALPHA, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.textView[0], View.TRANSLATION_Y, 0.0f, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(this.textView[1], View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.textView[1], View.TRANSLATION_Y, AndroidUtilities.dp(10.0f), 0.0f));
            animatorSet.addListener(new AnonymousClass1());
            animatorSet.start();
        }

        /* renamed from: org.telegram.ui.Components.UpdateAppAlertDialog$BottomSheetCell$1 */
        /* loaded from: classes3.dex */
        public class AnonymousClass1 extends AnimatorListenerAdapter {
            AnonymousClass1() {
                BottomSheetCell.this = r1;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                UpdateAppAlertDialog.this.animationInProgress = false;
                TextView textView = BottomSheetCell.this.textView[0];
                BottomSheetCell.this.textView[0] = BottomSheetCell.this.textView[1];
                BottomSheetCell.this.textView[1] = textView;
            }
        }
    }

    public UpdateAppAlertDialog(Context context, TLRPC$TL_help_appUpdate tLRPC$TL_help_appUpdate, int i) {
        super(context, false);
        this.appUpdate = tLRPC$TL_help_appUpdate;
        this.accountNum = i;
        setCanceledOnTouchOutside(false);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        Drawable mutate = context.getResources().getDrawable(2131166143).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor("dialogBackground"), PorterDuff.Mode.MULTIPLY));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context);
        anonymousClass1.setWillNotDraw(false);
        this.containerView = anonymousClass1;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
        this.scrollView = anonymousClass2;
        anonymousClass2.setFillViewport(true);
        this.scrollView.setWillNotDraw(false);
        this.scrollView.setClipToPadding(false);
        this.scrollView.setVerticalScrollBarEnabled(false);
        anonymousClass1.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 130.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.scrollView.addView(this.linearLayout, LayoutHelper.createScroll(-1, -2, 51));
        if (this.appUpdate.sticker != null) {
            BackupImageView backupImageView = new BackupImageView(context);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(this.appUpdate.sticker.thumbs, "windowBackgroundGray", 1.0f);
            ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.appUpdate.sticker.thumbs, 90), this.appUpdate.sticker);
            if (svgThumb != null) {
                backupImageView.setImage(ImageLocation.getForDocument(this.appUpdate.sticker), "250_250", svgThumb, 0, "update");
            } else {
                backupImageView.setImage(ImageLocation.getForDocument(this.appUpdate.sticker), "250_250", forDocument, (String) null, 0, "update");
            }
            this.linearLayout.addView(backupImageView, LayoutHelper.createLinear(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(Theme.getColor("dialogTextBlack"));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(LocaleController.getString("AppUpdate", 2131624386));
        this.linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 49, 23, 16, 23, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(Theme.getColor("dialogTextGray3"));
        textView2.setTextSize(1, 14.0f);
        textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        textView2.setLinkTextColor(Theme.getColor("dialogTextLink"));
        TLRPC$TL_help_appUpdate tLRPC$TL_help_appUpdate2 = this.appUpdate;
        textView2.setText(LocaleController.formatString("AppUpdateVersionAndSize", 2131624392, tLRPC$TL_help_appUpdate2.version, AndroidUtilities.formatFileSize(tLRPC$TL_help_appUpdate2.document.size)));
        textView2.setGravity(49);
        this.linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 49, 23, 0, 23, 5));
        TextView textView3 = new TextView(getContext());
        textView3.setTextColor(Theme.getColor("dialogTextBlack"));
        textView3.setTextSize(1, 14.0f);
        textView3.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        textView3.setLinkTextColor(Theme.getColor("dialogTextLink"));
        if (TextUtils.isEmpty(this.appUpdate.text)) {
            textView3.setText(AndroidUtilities.replaceTags(LocaleController.getString("AppUpdateChangelogEmpty", 2131624387)));
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.appUpdate.text);
            MessageObject.addEntitiesToText(spannableStringBuilder, tLRPC$TL_help_appUpdate.entities, false, false, false, false);
            textView3.setText(spannableStringBuilder);
        }
        textView3.setGravity(51);
        this.linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 51, 23, 15, 23, 0));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams.bottomMargin = AndroidUtilities.dp(130.0f);
        View view = new View(context);
        this.shadow = view;
        view.setBackgroundColor(Theme.getColor("dialogShadowLine"));
        this.shadow.setAlpha(0.0f);
        this.shadow.setTag(1);
        anonymousClass1.addView(this.shadow, layoutParams);
        BottomSheetCell bottomSheetCell = new BottomSheetCell(context, false);
        bottomSheetCell.setText(LocaleController.formatString("AppUpdateDownloadNow", 2131624388, new Object[0]), false);
        bottomSheetCell.background.setOnClickListener(new UpdateAppAlertDialog$$ExternalSyntheticLambda0(this));
        anonymousClass1.addView(bottomSheetCell, LayoutHelper.createFrame(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 50.0f));
        BottomSheetCell bottomSheetCell2 = new BottomSheetCell(context, true);
        bottomSheetCell2.setText(LocaleController.getString("AppUpdateRemindMeLater", 2131624391), false);
        bottomSheetCell2.background.setOnClickListener(new UpdateAppAlertDialog$$ExternalSyntheticLambda1(this));
        anonymousClass1.addView(bottomSheetCell2, LayoutHelper.createFrame(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    /* renamed from: org.telegram.ui.Components.UpdateAppAlertDialog$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends FrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context) {
            super(context);
            UpdateAppAlertDialog.this = r1;
        }

        @Override // android.view.View
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            UpdateAppAlertDialog.this.updateLayout();
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && UpdateAppAlertDialog.this.scrollOffsetY != 0 && motionEvent.getY() < UpdateAppAlertDialog.this.scrollOffsetY) {
                UpdateAppAlertDialog.this.dismiss();
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return !UpdateAppAlertDialog.this.isDismissed() && super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            UpdateAppAlertDialog.this.shadowDrawable.setBounds(0, (int) ((UpdateAppAlertDialog.this.scrollOffsetY - ((BottomSheet) UpdateAppAlertDialog.this).backgroundPaddingTop) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
            UpdateAppAlertDialog.this.shadowDrawable.draw(canvas);
        }
    }

    /* renamed from: org.telegram.ui.Components.UpdateAppAlertDialog$2 */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 extends NestedScrollView {
        private boolean ignoreLayout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context) {
            super(context);
            UpdateAppAlertDialog.this = r1;
        }

        @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i2);
            measureChildWithMargins(UpdateAppAlertDialog.this.linearLayout, i, 0, i2, 0);
            int measuredHeight = UpdateAppAlertDialog.this.linearLayout.getMeasuredHeight();
            int i3 = (size / 5) * 2;
            if (measuredHeight - (size - i3) < AndroidUtilities.dp(90.0f) || measuredHeight < (size / 2) + AndroidUtilities.dp(90.0f)) {
                i3 = size - measuredHeight;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            if (getPaddingTop() != i3) {
                this.ignoreLayout = true;
                setPadding(0, i3, 0, 0);
                this.ignoreLayout = false;
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }

        @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            UpdateAppAlertDialog.this.updateLayout();
        }

        @Override // androidx.core.widget.NestedScrollView, android.view.View, android.view.ViewParent
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        @Override // androidx.core.widget.NestedScrollView, android.view.View
        public void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            UpdateAppAlertDialog.this.updateLayout();
        }
    }

    public /* synthetic */ void lambda$new$0(View view) {
        FileLoader.getInstance(this.accountNum).loadFile(this.appUpdate.document, "update", 1, 1);
        dismiss();
    }

    public /* synthetic */ void lambda$new$1(View view) {
        dismiss();
    }

    private void runShadowAnimation(int i, boolean z) {
        if ((!z || this.shadow.getTag() == null) && (z || this.shadow.getTag() != null)) {
            return;
        }
        this.shadow.setTag(z ? null : 1);
        if (z) {
            this.shadow.setVisibility(0);
        }
        AnimatorSet animatorSet = this.shadowAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.shadowAnimation = animatorSet2;
        Animator[] animatorArr = new Animator[1];
        View view = this.shadow;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        fArr[0] = z ? 1.0f : 0.0f;
        animatorArr[0] = ObjectAnimator.ofFloat(view, property, fArr);
        animatorSet2.playTogether(animatorArr);
        this.shadowAnimation.setDuration(150L);
        this.shadowAnimation.addListener(new AnonymousClass3(z));
        this.shadowAnimation.start();
    }

    /* renamed from: org.telegram.ui.Components.UpdateAppAlertDialog$3 */
    /* loaded from: classes3.dex */
    public class AnonymousClass3 extends AnimatorListenerAdapter {
        final /* synthetic */ boolean val$show;

        AnonymousClass3(boolean z) {
            UpdateAppAlertDialog.this = r1;
            this.val$show = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (UpdateAppAlertDialog.this.shadowAnimation == null || !UpdateAppAlertDialog.this.shadowAnimation.equals(animator)) {
                return;
            }
            if (!this.val$show) {
                UpdateAppAlertDialog.this.shadow.setVisibility(4);
            }
            UpdateAppAlertDialog.this.shadowAnimation = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (UpdateAppAlertDialog.this.shadowAnimation == null || !UpdateAppAlertDialog.this.shadowAnimation.equals(animator)) {
                return;
            }
            UpdateAppAlertDialog.this.shadowAnimation = null;
        }
    }

    public void updateLayout() {
        this.linearLayout.getChildAt(0).getLocationInWindow(this.location);
        int max = Math.max(this.location[1] - AndroidUtilities.dp(24.0f), 0);
        if (this.location[1] + this.linearLayout.getMeasuredHeight() <= (this.container.getMeasuredHeight() - AndroidUtilities.dp(113.0f)) + this.containerView.getTranslationY()) {
            runShadowAnimation(0, false);
        } else {
            runShadowAnimation(0, true);
        }
        if (this.scrollOffsetY != max) {
            this.scrollOffsetY = max;
            this.scrollView.invalidate();
        }
    }
}
