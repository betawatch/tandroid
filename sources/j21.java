// default package

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class j21 extends h11 {
    public final ry8 a;
    public final l46 b;
    public final l46 c;
    public final LinearLayout d;
    public final int e;

    public j21(Context context, wjb wjbVar) {
        super(context, wjbVar);
        int i = bkb.xj;
        this.e = getThemedColor(i);
        setBackground(getThemedColor(bkb.vj));
        ry8 ry8Var = new ry8(context);
        this.a = ry8Var;
        ry8Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ry8Var, nme.h(56.0f, 48.0f, 8388627));
        getThemedColor(i);
        int i2 = bkb.wj;
        getThemedColor(i2);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        l46 l46Var = new l46(context, null);
        this.b = l46Var;
        l46Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
        zkb.X(l46Var, i, wjbVar);
        l46Var.setTextSize(1, 14.0f);
        l46Var.setTypeface(gl.o());
        linearLayout.addView(l46Var);
        l46 l46Var2 = new l46(context, null);
        this.c = l46Var2;
        l46Var2.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
        zkb.X(l46Var2, i, wjbVar);
        zkb.G(l46Var2, i2, wjbVar);
        l46Var2.setTypeface(Typeface.SANS_SERIF);
        l46Var2.setTextSize(1, 13.0f);
        linearLayout.addView(l46Var2);
    }

    public final void c(int i, int i2, int i3, String... strArr) {
        ry8 ry8Var = this.a;
        ry8Var.f(i, i2, i3, null);
        for (String str : strArr) {
            ry8Var.h(this.e, str);
        }
    }

    @Override // q11
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }

    @Override // q11
    public final void onShow() {
        super.onShow();
        this.a.d();
    }
}
