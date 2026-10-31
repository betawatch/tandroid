package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class eb extends ta {
    public final ei0 a;
    public TextView b;
    public int c;

    public eb(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        ei0 ei0Var = new ei0(context);
        this.a = ei0Var;
        ei0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ei0Var, w7.b6.h(56.0f, 48.0f, 8388627));
        kg.t1 t1Var = new kg.t1(1, context, null);
        t1Var.setDisablePaddingsOffset(true);
        this.b = t1Var;
        org.telegram.messenger.zs.i(t1Var);
        this.b.setSingleLine();
        this.b.setTypeface(Typeface.SANS_SERIF);
        this.b.setTextSize(1, 15.0f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.b.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        addView(this.b, w7.b6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.a7.H(this.b, org.telegram.ui.ActionBar.t6.uj, p6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.vj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.t6.tj));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        ei0 ei0Var = this.a;
        ei0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            ei0Var.h(this.c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        ei0 ei0Var = this.a;
        ei0Var.setAutoRepeat(true);
        ei0Var.g(36, 36, document);
        for (String str : strArr) {
            ei0Var.h(this.c, str);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    @Override // org.telegram.ui.Components.bb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.a.setLayoutParams(w7.b6.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.c = i10;
        this.b.setTextColor(i10);
    }

    public eb(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(context, p6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}
