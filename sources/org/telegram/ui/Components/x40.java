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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class x40 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final TextView[] b;
    public final TextView c;
    public final n80 d;
    public final org.telegram.ui.xn e;
    public final bj0 f;
    public final w40 h;
    public boolean n;
    public final yi0 r;
    public final TextView[] s;
    public final String v;

    public x40(Context context, String str, org.telegram.ui.xn xnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        this.b = new TextView[2];
        this.s = new TextView[2];
        yp ypVar = new yp(this, 23);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.e = xnVar;
        this.v = str;
        FrameLayout frameLayout = new FrameLayout(context);
        setCustomView(frameLayout);
        TextView textView = new TextView(context);
        org.telegram.messenger.ul.k(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.h6.j5;
        textView.setTextColor(getThemedColor(i10));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        yi0 yi0Var = new yi0(R.raw.import_finish, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), false, null);
        this.r = yi0Var;
        yi0Var.J(true);
        bj0 bj0Var = new bj0(context);
        this.f = bj0Var;
        bj0Var.setAutoRepeat(true);
        bj0Var.f(R.raw.import_loop, 120, 120, null);
        bj0Var.d();
        frameLayout.addView(bj0Var, w7.x5.d(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        bj0Var.getAnimatedDrawable().S(178, ypVar);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 24.0f);
        textView2.setTextColor(getThemedColor(i10));
        frameLayout.addView(textView2, w7.x5.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        n80 n80Var = new n80(getContext());
        this.d = n80Var;
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        n80Var.setProgressColor(getThemedColor(i11));
        n80Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.h6.G5));
        frameLayout.addView(n80Var, w7.x5.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        w40 w40Var = new w40(context);
        View view = new View(context);
        w40Var.a = view;
        int dp = AndroidUtilities.dp(4.0f);
        int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Qh, d6Var);
        view.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, v02, v03, v03));
        w40Var.addView(view, w7.x5.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        w40Var.d = linearLayout;
        linearLayout.setOrientation(0);
        w40Var.addView(linearLayout, w7.x5.e(-2, -2, 17));
        bj0 bj0Var2 = new bj0(context);
        w40Var.c = bj0Var2;
        int dp2 = AndroidUtilities.dp(20.0f);
        int i12 = org.telegram.ui.ActionBar.h6.Sh;
        bj0Var2.setBackground(org.telegram.ui.ActionBar.h6.K(dp2, org.telegram.ui.ActionBar.h6.v0(i12, d6Var)));
        bj0Var2.setScaleType(ImageView.ScaleType.CENTER);
        bj0Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i11, d6Var), PorterDuff.Mode.MULTIPLY));
        bj0Var2.f(R.raw.import_check, 26, 26, null);
        bj0Var2.setScaleX(0.8f);
        bj0Var2.setScaleY(0.8f);
        linearLayout.addView(bj0Var2, w7.x5.q(20, 20, 16));
        TextView textView3 = new TextView(context);
        w40Var.b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView3);
        linearLayout.addView(textView3, w7.x5.t(-2, -2, 16, 10, 0, 0, 0));
        this.h = w40Var;
        w40Var.setBackground(null);
        w40Var.setText(LocaleController.getString(R.string.ImportDone));
        w40Var.setVisibility(4);
        view.setOnClickListener(new f0(this, 27));
        view.setPivotY(AndroidUtilities.dp(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView(w40Var, w7.x5.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i13 = 0; i13 < 2; i13++) {
            this.b[i13] = new TextView(context);
            this.b[i13].setTextSize(1, 16.0f);
            this.b[i13].setTypeface(AndroidUtilities.bold());
            this.b[i13].setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.j5));
            frameLayout.addView(this.b[i13], w7.x5.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.s[i13] = new TextView(context);
            this.s[i13].setTextSize(1, 14.0f);
            this.s[i13].setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.r5));
            this.s[i13].setGravity(1);
            frameLayout.addView(this.s[i13], w7.x5.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
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
        n80 n80Var = this.d;
        TextView[] textViewArr = this.b;
        TextView textView = this.c;
        bj0 bj0Var = this.f;
        if (i10 == i12) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.xn xnVar = this.e;
            SendMessagesHelper.ImportingHistory importingHistory = xnVar.getSendMessagesHelper().getImportingHistory(xnVar.a());
            if (importingHistory == null) {
                m();
                return;
            }
            if (!this.n && ((180 - bj0Var.getAnimatedDrawable().a0) * 16.6d) + 3000.0d >= importingHistory.timeUntilFinish) {
                bj0Var.setAutoRepeat(false);
                this.n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            n80Var.a(importingHistory.uploadProgress / 100.0f, true);
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
            if (!this.n && ((180 - bj0Var.getAnimatedDrawable().a0) * 16.6d) + 3000.0d >= importingStickers.timeUntilFinish) {
                bj0Var.setAutoRepeat(false);
                this.n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
            n80Var.a(importingStickers.uploadProgress / 100.0f, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.xn xnVar = this.e;
        if (xnVar != null) {
            xnVar.getNotificationCenter().removeObserver(this, NotificationCenter.historyImportProgressChanged);
        } else {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    public final void m() {
        this.n = true;
        this.f.setAutoRepeat(false);
        w40 w40Var = this.h;
        w40Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(rr.g);
        Property property = View.ALPHA;
        TextView textView = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr = this.s;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr2 = this.b;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property2, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<n80, Float>) property, 0.0f), ObjectAnimator.ofFloat(w40Var.d, (Property<LinearLayout, Float>) property2, AndroidUtilities.dp(8.0f), 0.0f));
        w40Var.a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        w40Var.c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        w40Var.c.d();
        animatorSet.start();
    }
}
