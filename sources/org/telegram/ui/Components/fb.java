package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class fb extends va {
    public final fh0 a;
    public TextView b;
    public int c;

    public fb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        fh0 fh0Var = new fh0(context);
        this.a = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(fh0Var, c8.ja.h(56.0f, 48.0f, 8388627));
        bi.w1 w1Var = new bi.w1(3, context, null);
        w1Var.setDisablePaddingsOffset(true);
        this.b = w1Var;
        org.telegram.messenger.ns.i(w1Var);
        this.b.setSingleLine();
        this.b.setTypeface(Typeface.SANS_SERIF);
        this.b.setTextSize(1, 15.0f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        addView(this.b, c8.ja.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.q6.G(this.b, org.telegram.ui.ActionBar.j6.xj, e6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.yj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.wj));
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        fh0 fh0Var = this.a;
        fh0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            fh0Var.h(this.c, str);
        }
    }

    public final void d(int i7, String... strArr) {
        c(i7, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        fh0 fh0Var = this.a;
        fh0Var.setAutoRepeat(true);
        fh0Var.g(36, 36, document);
        for (String str : strArr) {
            fh0Var.h(this.c, str);
        }
    }

    @Override // org.telegram.ui.Components.cb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    @Override // org.telegram.ui.Components.cb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }

    public void setIconPaddingBottom(int i7) {
        this.a.setLayoutParams(c8.ja.i(56.0f, 48 - i7, 8388627, 0.0f, 0.0f, 0.0f, i7));
    }

    public void setTextColor(int i7) {
        this.c = i7;
        this.b.setTextColor(i7);
    }

    public fb(int i7, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, e6Var);
        setBackground(i7);
        setTextColor(i10);
    }
}
