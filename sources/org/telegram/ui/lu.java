package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class lu extends org.telegram.ui.Cells.d5 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.e9 f;
    public final /* synthetic */ org.telegram.ui.Cells.w8[] h;
    public final /* synthetic */ AnimatorSet[] n;
    public final /* synthetic */ DataAutoDownloadActivity r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu(DataAutoDownloadActivity dataAutoDownloadActivity, Activity activity, int i10, org.telegram.ui.Cells.e9 e9Var, org.telegram.ui.Cells.w8[] w8VarArr, AnimatorSet[] animatorSetArr) {
        super(activity);
        this.r = dataAutoDownloadActivity;
        this.e = i10;
        this.f = e9Var;
        this.h = w8VarArr;
        this.n = animatorSetArr;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.a = textView;
        org.telegram.messenger.yh.t(textView, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.j5, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        addView(textView, w7.a6.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        org.telegram.messenger.yh.t(textView2, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.n5, false), 1, 16.0f, 1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, w7.a6.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
        org.telegram.ui.Cells.k0 k0Var = new org.telegram.ui.Cells.k0(activity);
        this.c = k0Var;
        k0Var.setReportChanges(true);
        k0Var.setDelegate(new org.telegram.ui.Cells.c5(this));
        k0Var.setImportantForAccessibility(2);
        addView(k0Var, w7.a6.a(38.0f, 6.0f, 36.0f, 6.0f, 0.0f, -1, 51));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(k0Var.getSeekBarAccessibilityDelegate());
    }
}
