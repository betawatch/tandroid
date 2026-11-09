package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class kb extends za {
    public final dh0 a;
    public TextView b;
    public int c;

    public kb(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        dh0 dh0Var = new dh0(context);
        this.a = dh0Var;
        dh0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(dh0Var, c8.ha.h(56.0f, 48.0f, 8388627));
        jb jbVar = new jb(0, context, null);
        jbVar.setDisablePaddingsOffset(true);
        this.b = jbVar;
        org.telegram.messenger.qs.i(jbVar);
        this.b.setSingleLine();
        this.b.setTypeface(Typeface.SANS_SERIF);
        this.b.setTextSize(1, 15.0f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        addView(this.b, c8.ha.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.s6.G(this.b, org.telegram.ui.ActionBar.l6.uj, g6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.l6.vj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.l6.tj));
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        dh0 dh0Var = this.a;
        dh0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            dh0Var.h(this.c, str);
        }
    }

    public final void d(int i7, String... strArr) {
        c(i7, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        dh0 dh0Var = this.a;
        dh0Var.setAutoRepeat(true);
        dh0Var.g(36, 36, document);
        for (String str : strArr) {
            dh0Var.h(this.c, str);
        }
    }

    @Override // org.telegram.ui.Components.gb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    @Override // org.telegram.ui.Components.gb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }

    public void setIconPaddingBottom(int i7) {
        this.a.setLayoutParams(c8.ha.i(56.0f, 48 - i7, 8388627, 0.0f, 0.0f, 0.0f, i7));
    }

    public void setTextColor(int i7) {
        this.c = i7;
        this.b.setTextColor(i7);
    }

    public kb(int i7, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, g6Var);
        setBackground(i7);
        setTextColor(i10);
    }
}
