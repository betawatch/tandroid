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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g40 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final TextView[] b;
    public final TextView c;
    public final v70 d;
    public final org.telegram.ui.qn e;
    public final pi0 f;
    public final f40 h;
    public boolean n;
    public final mi0 r;
    public final TextView[] s;
    public final String v;

    public g40(Context context, String str, org.telegram.ui.qn qnVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false, false);
        this.b = new TextView[2];
        this.s = new TextView[2];
        np npVar = new np(this, 23);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.e = qnVar;
        this.v = str;
        FrameLayout frameLayout = new FrameLayout(context);
        setCustomView(frameLayout);
        TextView textView = new TextView(context);
        org.telegram.messenger.ll.k(20.0f, 1, textView);
        int i9 = org.telegram.ui.ActionBar.f6.j5;
        textView.setTextColor(getThemedColor(i9));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        mi0 mi0Var = new mi0(R.raw.import_finish, "" + R.raw.import_finish, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), false, null);
        this.r = mi0Var;
        mi0Var.H(true);
        pi0 pi0Var = new pi0(context);
        this.f = pi0Var;
        pi0Var.setAutoRepeat(true);
        pi0Var.f(R.raw.import_loop, 120, 120, null);
        pi0Var.d();
        frameLayout.addView(pi0Var, g7.e6.d(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        pi0Var.getAnimatedDrawable().P(178, npVar);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 24.0f);
        textView2.setTextColor(getThemedColor(i9));
        frameLayout.addView(textView2, g7.e6.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        v70 v70Var = new v70(getContext());
        this.d = v70Var;
        int i10 = org.telegram.ui.ActionBar.f6.Oh;
        v70Var.setProgressColor(getThemedColor(i10));
        v70Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.f6.G5));
        frameLayout.addView(v70Var, g7.e6.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        f40 f40Var = new f40(context);
        View view = new View(context);
        f40Var.a = view;
        int dp = AndroidUtilities.dp(4.0f);
        int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Qh, b6Var);
        view.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, v02, v03, v03));
        f40Var.addView(view, g7.e6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        f40Var.d = linearLayout;
        linearLayout.setOrientation(0);
        f40Var.addView(linearLayout, g7.e6.e(-2, -2, 17));
        pi0 pi0Var2 = new pi0(context);
        f40Var.c = pi0Var2;
        int dp2 = AndroidUtilities.dp(20.0f);
        int i11 = org.telegram.ui.ActionBar.f6.Sh;
        pi0Var2.setBackground(org.telegram.ui.ActionBar.f6.K(dp2, org.telegram.ui.ActionBar.f6.v0(i11, b6Var)));
        pi0Var2.setScaleType(ImageView.ScaleType.CENTER);
        pi0Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), PorterDuff.Mode.MULTIPLY));
        pi0Var2.f(R.raw.import_check, 26, 26, null);
        pi0Var2.setScaleX(0.8f);
        pi0Var2.setScaleY(0.8f);
        linearLayout.addView(pi0Var2, g7.e6.q(20, 20, 16));
        TextView textView3 = new TextView(context);
        f40Var.b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        j3.r0.u(14.0f, 1, textView3);
        linearLayout.addView(textView3, g7.e6.t(-2, -2, 16, 10, 0, 0, 0));
        this.h = f40Var;
        f40Var.setBackground(null);
        f40Var.setText(LocaleController.getString(R.string.ImportDone));
        f40Var.setVisibility(4);
        view.setOnClickListener(new f0(this, 27));
        view.setPivotY(AndroidUtilities.dp(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView(f40Var, g7.e6.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i12 = 0; i12 < 2; i12++) {
            this.b[i12] = new TextView(context);
            this.b[i12].setTextSize(1, 16.0f);
            this.b[i12].setTypeface(AndroidUtilities.bold());
            this.b[i12].setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.j5));
            frameLayout.addView(this.b[i12], g7.e6.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.s[i12] = new TextView(context);
            this.s[i12].setTextSize(1, 14.0f);
            this.s[i12].setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.r5));
            this.s[i12].setGravity(1);
            frameLayout.addView(this.s[i12], g7.e6.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i12 == 0) {
                this.s[i12].setText(LocaleController.getString(R.string.ImportImportingInfo));
            } else {
                this.s[i12].setAlpha(0.0f);
                this.s[i12].setTranslationY(AndroidUtilities.dp(10.0f));
                this.b[i12].setAlpha(0.0f);
                this.b[i12].setTranslationY(AndroidUtilities.dp(10.0f));
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.historyImportProgressChanged;
        v70 v70Var = this.d;
        TextView[] textViewArr = this.b;
        TextView textView = this.c;
        pi0 pi0Var = this.f;
        if (i9 == i11) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.qn qnVar = this.e;
            SendMessagesHelper.ImportingHistory importingHistory = qnVar.getSendMessagesHelper().getImportingHistory(qnVar.a());
            if (importingHistory == null) {
                m();
                return;
            }
            if (!this.n && ((180 - pi0Var.getAnimatedDrawable().X) * 16.6d) + 3000.0d >= importingHistory.timeUntilFinish) {
                pi0Var.setAutoRepeat(false);
                this.n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            v70Var.a(importingHistory.uploadProgress / 100.0f, true);
            return;
        }
        if (i9 == NotificationCenter.stickersImportProgressChanged) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(this.v);
            if (importingStickers == null) {
                m();
                return;
            }
            if (!this.n && ((180 - pi0Var.getAnimatedDrawable().X) * 16.6d) + 3000.0d >= importingStickers.timeUntilFinish) {
                pi0Var.setAutoRepeat(false);
                this.n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
            v70Var.a(importingStickers.uploadProgress / 100.0f, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.qn qnVar = this.e;
        if (qnVar != null) {
            qnVar.getNotificationCenter().removeObserver(this, NotificationCenter.historyImportProgressChanged);
        } else {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    public final void m() {
        this.n = true;
        this.f.setAutoRepeat(false);
        f40 f40Var = this.h;
        f40Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(gr.g);
        Property property = View.ALPHA;
        TextView textView = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr = this.s;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr2 = this.b;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property2, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<v70, Float>) property, 0.0f), ObjectAnimator.ofFloat(f40Var.d, (Property<LinearLayout, Float>) property2, AndroidUtilities.dp(8.0f), 0.0f));
        f40Var.a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        f40Var.c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        f40Var.c.d();
        animatorSet.start();
    }
}
