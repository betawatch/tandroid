// default package

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class c21 extends q11 {
    public final e29 a;
    public TextView b;
    public int c;

    public c21(Context context, vnb vnbVar) {
        super(context, vnbVar);
        e29 e29Var = new e29(context);
        this.a = e29Var;
        e29Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(e29Var, tre.h(56.0f, 48.0f, 8388627));
        b21 b21Var = new b21(context, null, (byte) 0);
        b21Var.setDisablePaddingsOffset(true);
        this.b = b21Var;
        jn7.i(b21Var);
        this.b.setSingleLine();
        this.b.setTypeface(Typeface.SANS_SERIF);
        this.b.setTextSize(1, 15.0f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.b.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        addView(this.b, tre.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        yob.G(this.b, aob.xj, vnbVar);
        setTextColor(getThemedColor(aob.yj));
        setBackground(getThemedColor(aob.wj));
    }

    public final void g(int i, int i2, int i3, String... strArr) {
        e29 e29Var = this.a;
        e29Var.f(i, i2, i3, null);
        for (String str : strArr) {
            e29Var.h(this.c, str);
        }
    }

    @Override // z11
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    public final void h(int i, String... strArr) {
        g(i, 32, 32, strArr);
    }

    public final void i(TLRPC.Document document, String... strArr) {
        e29 e29Var = this.a;
        e29Var.setAutoRepeat(true);
        e29Var.g(36, 36, document);
        for (String str : strArr) {
            e29Var.h(this.c, str);
        }
    }

    @Override // z11
    public final void onShow() {
        super.onShow();
        this.a.d();
    }

    public void setIconPaddingBottom(int i) {
        this.a.setLayoutParams(tre.i(56.0f, 48 - i, 8388627, 0.0f, 0.0f, 0.0f, i));
    }

    public void setTextColor(int i) {
        this.c = i;
        this.b.setTextColor(i);
    }

    public c21(int i, int i2, vnb vnbVar, Context context) {
        this(context, vnbVar);
        setBackground(i);
        setTextColor(i2);
    }
}
