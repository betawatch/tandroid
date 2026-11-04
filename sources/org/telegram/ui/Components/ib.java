package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class ib extends ya {
    public final fh0 a;
    public TextView b;
    public int c;

    public ib(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        fh0 fh0Var = new fh0(context);
        this.a = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(fh0Var, b8.mf.h(56.0f, 48.0f, 8388627));
        ai.e2 e2Var = new ai.e2(3, context, null);
        e2Var.setDisablePaddingsOffset(true);
        this.b = e2Var;
        org.telegram.messenger.hs.i(e2Var);
        this.b.setSingleLine();
        this.b.setTypeface(Typeface.SANS_SERIF);
        this.b.setTextSize(1, 15.0f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        addView(this.b, b8.mf.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.r6.H(this.b, org.telegram.ui.ActionBar.k6.uj, e6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.vj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
    }

    public final void c(int i3, int i10, int i11, String... strArr) {
        fh0 fh0Var = this.a;
        fh0Var.f(i3, i10, i11, null);
        for (String str : strArr) {
            fh0Var.h(this.c, str);
        }
    }

    public final void d(int i3, String... strArr) {
        c(i3, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        fh0 fh0Var = this.a;
        fh0Var.setAutoRepeat(true);
        fh0Var.g(36, 36, document);
        for (String str : strArr) {
            fh0Var.h(this.c, str);
        }
    }

    @Override // org.telegram.ui.Components.fb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    @Override // org.telegram.ui.Components.fb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }

    public void setIconPaddingBottom(int i3) {
        this.a.setLayoutParams(b8.mf.i(56.0f, 48 - i3, 8388627, 0.0f, 0.0f, 0.0f, i3));
    }

    public void setTextColor(int i3) {
        this.c = i3;
        this.b.setTextColor(i3);
    }

    public ib(int i3, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, e6Var);
        setBackground(i3);
        setTextColor(i10);
    }
}
