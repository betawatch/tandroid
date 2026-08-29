package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u40 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final TextView[] b;
    public final TextView c;
    public final i80 d;
    public final org.telegram.ui.tn e;
    public final aj0 f;
    public final t40 h;
    public boolean n;
    public final xi0 r;
    public final TextView[] s;
    public final String v;

    public u40(Context context, String str, org.telegram.ui.tn tnVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        this.b = new TextView[2];
        this.s = new TextView[2];
        rp rpVar = new rp(this, 23);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.e = tnVar;
        this.v = str;
        FrameLayout frameLayout = new FrameLayout(context);
        setCustomView(frameLayout);
        TextView textView = new TextView(context);
        org.telegram.ui.b.g(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.g6.j5;
        textView.setTextColor(getThemedColor(i10));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        xi0 xi0Var = new xi0(R.raw.import_finish, "" + R.raw.import_finish, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), false, null);
        this.r = xi0Var;
        xi0Var.H(true);
        aj0 aj0Var = new aj0(context);
        this.f = aj0Var;
        aj0Var.setAutoRepeat(true);
        aj0Var.f(R.raw.import_loop, 120, 120, null);
        aj0Var.d();
        frameLayout.addView(aj0Var, i7.f6.d(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        aj0Var.getAnimatedDrawable().P(178, rpVar);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 24.0f);
        textView2.setTextColor(getThemedColor(i10));
        frameLayout.addView(textView2, i7.f6.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        i80 i80Var = new i80(getContext());
        this.d = i80Var;
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        i80Var.setProgressColor(getThemedColor(i11));
        i80Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.g6.G5));
        frameLayout.addView(i80Var, i7.f6.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        t40 t40Var = new t40(context);
        View view = new View(context);
        t40Var.a = view;
        int dp = AndroidUtilities.dp(4.0f);
        int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qh, c6Var);
        view.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v02, v03, v03));
        t40Var.addView(view, i7.f6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        t40Var.d = linearLayout;
        linearLayout.setOrientation(0);
        t40Var.addView(linearLayout, i7.f6.e(-2, -2, 17));
        aj0 aj0Var2 = new aj0(context);
        t40Var.c = aj0Var2;
        int dp2 = AndroidUtilities.dp(20.0f);
        int i12 = org.telegram.ui.ActionBar.g6.Sh;
        aj0Var2.setBackground(org.telegram.ui.ActionBar.g6.K(dp2, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)));
        aj0Var2.setScaleType(ImageView.ScaleType.CENTER);
        aj0Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
        aj0Var2.f(R.raw.import_check, 26, 26, null);
        aj0Var2.setScaleX(0.8f);
        aj0Var2.setScaleY(0.8f);
        linearLayout.addView(aj0Var2, i7.f6.q(20, 20, 16));
        TextView textView3 = new TextView(context);
        t40Var.b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        org.telegram.ui.th.n(14.0f, 1, textView3);
        linearLayout.addView(textView3, i7.f6.t(-2, -2, 16, 10, 0, 0, 0));
        this.h = t40Var;
        t40Var.setBackground(null);
        t40Var.setText(LocaleController.getString(R.string.ImportDone));
        t40Var.setVisibility(4);
        view.setOnClickListener(new h0(this, 27));
        view.setPivotY(AndroidUtilities.dp(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView(t40Var, i7.f6.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i13 = 0; i13 < 2; i13++) {
            this.b[i13] = new TextView(context);
            this.b[i13].setTextSize(1, 16.0f);
            this.b[i13].setTypeface(AndroidUtilities.bold());
            this.b[i13].setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.j5));
            frameLayout.addView(this.b[i13], i7.f6.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.s[i13] = new TextView(context);
            this.s[i13].setTextSize(1, 14.0f);
            this.s[i13].setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.r5));
            this.s[i13].setGravity(1);
            frameLayout.addView(this.s[i13], i7.f6.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i13 == 0) {
                this.s[i13].setText(LocaleController.getString(R.string.ImportImportingInfo));
            } else {
                this.s[i13].setAlpha(0.0f);
                this.s[i13].setTranslationY(AndroidUtilities.dp(10.0f));
                this.b[i13].setAlpha(0.0f);
                this.b[i13].setTranslationY(AndroidUtilities.dp(10.0f));
            }
        }
        if (this.e != null) {
            textView.setText(LocaleController.getString(R.string.ImportImportingTitle));
            SendMessagesHelper.ImportingHistory importingHistory = this.e.getSendMessagesHelper().getImportingHistory(this.e.a());
            this.c.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            this.d.a(importingHistory.uploadProgress / 100.0f, false);
            this.b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            this.s[1].setText(LocaleController.getString(R.string.ImportDoneInfo));
            this.b[1].setText(LocaleController.getString(R.string.ImportDoneTitle));
            this.e.getNotificationCenter().addObserver(this, NotificationCenter.historyImportProgressChanged);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersImportingTitle));
        SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(str);
        this.c.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
        this.d.a(importingStickers.uploadProgress / 100.0f, false);
        this.b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
        this.s[1].setText(LocaleController.getString(R.string.ImportStickersDoneInfo));
        this.b[1].setText(LocaleController.getString(R.string.ImportStickersDoneTitle));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersImportProgressChanged);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.historyImportProgressChanged;
        i80 i80Var = this.d;
        TextView[] textViewArr = this.b;
        TextView textView = this.c;
        aj0 aj0Var = this.f;
        if (i10 == i12) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.tn tnVar = this.e;
            SendMessagesHelper.ImportingHistory importingHistory = tnVar.getSendMessagesHelper().getImportingHistory(tnVar.a());
            if (importingHistory == null) {
                m();
                return;
            }
            if (!this.n && ((180 - aj0Var.getAnimatedDrawable().X) * 16.6d) + 3000.0d >= importingHistory.timeUntilFinish) {
                aj0Var.setAutoRepeat(false);
                this.n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            i80Var.a(importingHistory.uploadProgress / 100.0f, true);
            return;
        }
        if (i10 == NotificationCenter.stickersImportProgressChanged) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(this.v);
            if (importingStickers == null) {
                m();
                return;
            }
            if (!this.n && ((180 - aj0Var.getAnimatedDrawable().X) * 16.6d) + 3000.0d >= importingStickers.timeUntilFinish) {
                aj0Var.setAutoRepeat(false);
                this.n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
            i80Var.a(importingStickers.uploadProgress / 100.0f, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.tn tnVar = this.e;
        if (tnVar != null) {
            tnVar.getNotificationCenter().removeObserver(this, NotificationCenter.historyImportProgressChanged);
        } else {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    public final void m() {
        this.n = true;
        this.f.setAutoRepeat(false);
        t40 t40Var = this.h;
        t40Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(jr.g);
        Property property = View.ALPHA;
        TextView textView = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr = this.s;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr2 = this.b;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property2, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<i80, Float>) property, 0.0f), ObjectAnimator.ofFloat(t40Var.d, (Property<LinearLayout, Float>) property2, AndroidUtilities.dp(8.0f), 0.0f));
        t40Var.a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        t40Var.c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        t40Var.c.d();
        animatorSet.start();
    }
}
