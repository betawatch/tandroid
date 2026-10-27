package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i50 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public final TextView[] b;
    public final TextView c;
    public final j90 d;
    public final org.telegram.ui.wn e;
    public final bk0 f;
    public final h50 h;
    public boolean n;
    public final yj0 r;
    public final TextView[] s;
    public final String v;

    public i50(Context context, String str, org.telegram.ui.wn wnVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, false);
        this.b = new TextView[2];
        this.s = new TextView[2];
        cp cpVar = new cp(this, 26);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.e = wnVar;
        this.v = str;
        FrameLayout frameLayout = new FrameLayout(context);
        setCustomView(frameLayout);
        TextView textView = new TextView(context);
        org.telegram.messenger.wh.j(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.V(textView, i10, u6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, kb1.h(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        yj0 yj0Var = new yj0(R.raw.import_finish, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), false, null);
        this.r = yj0Var;
        yj0Var.J(true);
        bk0 bk0Var = new bk0(context);
        this.f = bk0Var;
        bk0Var.setAutoRepeat(true);
        bk0Var.f(R.raw.import_loop, 120, 120, null);
        bk0Var.d();
        frameLayout.addView(bk0Var, kb1.h(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        bk0Var.getAnimatedDrawable().S(178, cpVar);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.messenger.wh.j(24.0f, 1, textView2);
        org.telegram.ui.ActionBar.f7.V(textView2, i10, u6Var);
        frameLayout.addView(textView2, kb1.h(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        j90 j90Var = new j90(getContext());
        this.d = j90Var;
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        j90Var.setProgressColor(getThemedColor(i11));
        j90Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.y6.G5));
        frameLayout.addView(j90Var, kb1.h(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        h50 h50Var = new h50(context);
        View view = new View(context);
        h50Var.a = view;
        int dp = AndroidUtilities.dp(4.0f);
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        int i12 = org.telegram.ui.ActionBar.y6.Qh;
        int w03 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
        Drawable j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, w02, w03, w03);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i12);
        view.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(view, j02, N, N2, u6Var);
        h50Var.addView(view, kb1.h(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        h50Var.d = linearLayout;
        linearLayout.setOrientation(0);
        h50Var.addView(linearLayout, kb1.i(-2, -2, 17));
        bk0 bk0Var2 = new bk0(context);
        h50Var.c = bk0Var2;
        int dp2 = AndroidUtilities.dp(20.0f);
        int i13 = org.telegram.ui.ActionBar.y6.Sh;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp2, org.telegram.ui.ActionBar.y6.w0(i13, u6Var));
        org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i13);
        bk0Var2.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(bk0Var2, K, N3, null, u6Var);
        bk0Var2.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.f7.t(bk0Var2, i11, u6Var, PorterDuff.Mode.MULTIPLY);
        bk0Var2.f(R.raw.import_check, 26, 26, null);
        bk0Var2.setScaleX(0.8f);
        bk0Var2.setScaleY(0.8f);
        linearLayout.addView(bk0Var2, kb1.u(20, 20, 16));
        TextView textView3 = new TextView(context);
        h50Var.b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        org.telegram.messenger.t.r(textView3, i13, u6Var, 1, 14.0f);
        linearLayout.addView(textView3, kb1.x(-2, -2, 16, 10, 0, 0, 0));
        this.h = h50Var;
        h50Var.setBackground(null);
        h50Var.setText(LocaleController.getString(R.string.ImportDone));
        h50Var.setVisibility(4);
        view.setOnClickListener(new f0(this, 26));
        view.setPivotY(AndroidUtilities.dp(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView(h50Var, kb1.h(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i14 = 0; i14 < 2; i14++) {
            this.b[i14] = new TextView(context);
            this.b[i14].setTextSize(1, 16.0f);
            this.b[i14].setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.f7.V(this.b[i14], org.telegram.ui.ActionBar.y6.j5, u6Var);
            frameLayout.addView(this.b[i14], kb1.h(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.s[i14] = new TextView(context);
            this.s[i14].setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.f7.V(this.s[i14], org.telegram.ui.ActionBar.y6.r5, u6Var);
            this.s[i14].setGravity(1);
            frameLayout.addView(this.s[i14], kb1.h(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            if (i14 == 0) {
                this.s[i14].setText(LocaleController.getString(R.string.ImportImportingInfo));
            } else {
                this.s[i14].setAlpha(0.0f);
                this.s[i14].setTranslationY(AndroidUtilities.dp(10.0f));
                this.b[i14].setAlpha(0.0f);
                this.b[i14].setTranslationY(AndroidUtilities.dp(10.0f));
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
            this.e.getNotificationCenter().addWeakObserver(this, NotificationCenter.historyImportProgressChanged);
            return;
        }
        textView.setText(LocaleController.getString(R.string.ImportStickersImportingTitle));
        SendMessagesHelper.ImportingStickers importingStickers = SendMessagesHelper.getInstance(this.currentAccount).getImportingStickers(str);
        this.c.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
        this.d.a(importingStickers.uploadProgress / 100.0f, false);
        this.b[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
        this.s[1].setText(LocaleController.getString(R.string.ImportStickersDoneInfo));
        this.b[1].setText(LocaleController.getString(R.string.ImportStickersDoneTitle));
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.stickersImportProgressChanged);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.historyImportProgressChanged;
        j90 j90Var = this.d;
        TextView[] textViewArr = this.b;
        TextView textView = this.c;
        bk0 bk0Var = this.f;
        if (i10 == i12) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            org.telegram.ui.wn wnVar = this.e;
            SendMessagesHelper.ImportingHistory importingHistory = wnVar.getSendMessagesHelper().getImportingHistory(wnVar.a());
            if (importingHistory == null) {
                m();
                return;
            }
            if (!this.n && ((180 - bk0Var.getAnimatedDrawable().a0) * 16.6d) + 3000.0d >= importingHistory.timeUntilFinish) {
                bk0Var.setAutoRepeat(false);
                this.n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingHistory.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingHistory.getUploadedCount()), AndroidUtilities.formatFileSize(importingHistory.getTotalCount())));
            j90Var.a(importingHistory.uploadProgress / 100.0f, true);
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
            if (!this.n && ((180 - bk0Var.getAnimatedDrawable().a0) * 16.6d) + 3000.0d >= importingStickers.timeUntilFinish) {
                bk0Var.setAutoRepeat(false);
                this.n = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(importingStickers.uploadProgress)));
            textViewArr[0].setText(LocaleController.formatString("ImportCount", R.string.ImportCount, AndroidUtilities.formatFileSize(importingStickers.getUploadedCount()), AndroidUtilities.formatFileSize(importingStickers.getTotalCount())));
            j90Var.a(importingStickers.uploadProgress / 100.0f, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        org.telegram.ui.wn wnVar = this.e;
        if (wnVar != null) {
            wnVar.getNotificationCenter().removeObserver(this, NotificationCenter.historyImportProgressChanged);
        } else {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersImportProgressChanged);
        }
    }

    public final void m() {
        this.n = true;
        this.f.setAutoRepeat(false);
        h50 h50Var = this.h;
        h50Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(ds.g);
        Property property = View.ALPHA;
        TextView textView = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr = this.s;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property2, -AndroidUtilities.dp(10.0f));
        TextView[] textViewArr2 = this.b;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property2, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.d, (Property<j90, Float>) property, 0.0f), ObjectAnimator.ofFloat(h50Var.d, (Property<LinearLayout, Float>) property2, AndroidUtilities.dp(8.0f), 0.0f));
        h50Var.a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        h50Var.c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        h50Var.c.d();
        animatorSet.start();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            j90 j90Var = this.d;
            if (j90Var != null) {
                j90Var.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.y6.Oh));
                j90Var.setBackColor(getThemedColor(org.telegram.ui.ActionBar.y6.G5));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
