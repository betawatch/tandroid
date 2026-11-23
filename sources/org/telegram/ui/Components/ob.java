package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class ob extends eb {
    public final rh0 a;
    public TextView b;
    public int c;

    public ob(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        rh0 rh0Var = new rh0(context);
        this.a = rh0Var;
        rh0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(rh0Var, c8.ma.h(56.0f, 48.0f, 8388627));
        bi.u2 u2Var = new bi.u2(3, context, null);
        u2Var.setDisablePaddingsOffset(true);
        this.b = u2Var;
        org.telegram.messenger.ls.i(u2Var);
        this.b.setSingleLine();
        this.b.setTypeface(Typeface.SANS_SERIF);
        this.b.setTextSize(1, 15.0f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        addView(this.b, c8.ma.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.t6.G(this.b, org.telegram.ui.ActionBar.m6.xj, h6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.yj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.m6.wj));
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        rh0 rh0Var = this.a;
        rh0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            rh0Var.h(this.c, str);
        }
    }

    public final void d(int i7, String... strArr) {
        c(i7, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        rh0 rh0Var = this.a;
        rh0Var.setAutoRepeat(true);
        rh0Var.g(36, 36, document);
        for (String str : strArr) {
            rh0Var.h(this.c, str);
        }
    }

    @Override // org.telegram.ui.Components.lb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    @Override // org.telegram.ui.Components.lb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }

    public void setIconPaddingBottom(int i7) {
        this.a.setLayoutParams(c8.ma.i(56.0f, 48 - i7, 8388627, 0.0f, 0.0f, 0.0f, i7));
    }

    public void setTextColor(int i7) {
        this.c = i7;
        this.b.setTextColor(i7);
    }

    public ob(int i7, int i10, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, h6Var);
        setBackground(i7);
        setTextColor(i10);
    }
}
