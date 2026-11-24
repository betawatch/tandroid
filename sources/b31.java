// default package

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class b31 extends p21 {
    public final s09 a;
    public TextView b;
    public int c;

    public b31(Context context, ylb ylbVar) {
        super(context, ylbVar);
        s09 s09Var = new s09(context);
        this.a = s09Var;
        s09Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(s09Var, qoe.h(56.0f, 48.0f, 8388627));
        a31 a31Var = new a31(context, null, (byte) 0);
        a31Var.setDisablePaddingsOffset(true);
        this.b = a31Var;
        nm7.i(a31Var);
        this.b.setSingleLine();
        this.b.setTypeface(Typeface.SANS_SERIF);
        this.b.setTextSize(1, 15.0f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.b.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        addView(this.b, qoe.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        anb.G(this.b, cmb.wj, ylbVar);
        setTextColor(getThemedColor(cmb.xj));
        setBackground(getThemedColor(cmb.vj));
    }

    public final void c(int i, int i2, int i3, String... strArr) {
        s09 s09Var = this.a;
        s09Var.f(i, i2, i3, null);
        for (String str : strArr) {
            s09Var.h(this.c, str);
        }
    }

    public final void d(int i, String... strArr) {
        c(i, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        s09 s09Var = this.a;
        s09Var.setAutoRepeat(true);
        s09Var.g(36, 36, document);
        for (String str : strArr) {
            s09Var.h(this.c, str);
        }
    }

    @Override // y21
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    @Override // y21
    public final void onShow() {
        super.onShow();
        this.a.d();
    }

    public void setIconPaddingBottom(int i) {
        this.a.setLayoutParams(qoe.i(56.0f, 48 - i, 8388627, 0.0f, 0.0f, 0.0f, i));
    }

    public void setTextColor(int i) {
        this.c = i;
        this.b.setTextColor(i);
    }

    public b31(int i, int i2, ylb ylbVar, Context context) {
        this(context, ylbVar);
        setBackground(i);
        setTextColor(i2);
    }
}
