package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class nb extends db {
    public final qh0 a;
    public TextView b;
    public int c;

    public nb(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        qh0 qh0Var = new qh0(context);
        this.a = qh0Var;
        qh0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(qh0Var, c8.na.h(56.0f, 48.0f, 8388627));
        bi.w2 w2Var = new bi.w2(3, context, null);
        w2Var.setDisablePaddingsOffset(true);
        this.b = w2Var;
        org.telegram.messenger.ks.i(w2Var);
        this.b.setSingleLine();
        this.b.setTypeface(Typeface.SANS_SERIF);
        this.b.setTextSize(1, 15.0f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        addView(this.b, c8.na.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.u6.G(this.b, org.telegram.ui.ActionBar.n6.xj, i6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.yj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        qh0 qh0Var = this.a;
        qh0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            qh0Var.h(this.c, str);
        }
    }

    public final void d(int i7, String... strArr) {
        c(i7, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        qh0 qh0Var = this.a;
        qh0Var.setAutoRepeat(true);
        qh0Var.g(36, 36, document);
        for (String str : strArr) {
            qh0Var.h(this.c, str);
        }
    }

    @Override // org.telegram.ui.Components.kb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    @Override // org.telegram.ui.Components.kb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }

    public void setIconPaddingBottom(int i7) {
        this.a.setLayoutParams(c8.na.i(56.0f, 48 - i7, 8388627, 0.0f, 0.0f, 0.0f, i7));
    }

    public void setTextColor(int i7) {
        this.c = i7;
        this.b.setTextColor(i7);
    }

    public nb(int i7, int i10, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this(context, i6Var);
        setBackground(i7);
        setTextColor(i10);
    }
}
