// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class e91 extends FrameLayout {
    public final int a;
    public final jc0 b;
    public final ImageView c;
    public final bv8 d;
    public final og2 e;
    public Drawable f;
    public Drawable h;

    public e91(Context context, int i) {
        super(context);
        this.a = i;
        bv8 bv8Var = new bv8(context, null);
        this.d = bv8Var;
        bv8Var.O0 = true;
        bv8Var.G0 = true;
        bv8Var.setPadding(ob6.a0 ? hl.L(32.0f) : 0, 0, ob6.a0 ? 0 : hl.L(32.0f), 0);
        int L = hl.L(ob6.a0 ? 2.0f : -2.0f);
        int i2 = -hl.L(7.0f);
        bv8Var.c0 = L;
        bv8Var.d0 = i2;
        addView(bv8Var, tre.c(-1.0f, -1));
        jc0 jc0Var = new jc0(context, false);
        this.b = jc0Var;
        jc0Var.setAvatarsTextSize(hl.L(18.0f));
        jc0Var.setStepFactor(0.4f);
        jc0Var.setSize(hl.L(29.0f));
        jc0Var.setCentered(true);
        jc0Var.setVisibility(8);
        addView(jc0Var, tre.d(72, -1.0f, ob6.a0 ? 5 : 3, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        yob.s(imageView, aob.Zl, null, PorterDuff.Mode.SRC_IN);
        int i3 = aob.i6;
        hf0 f0 = aob.f0(aob.w0(null, i3, false), 1, -1);
        uob M = yob.M(i3);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(ob6.M0(2131752615, null));
        addView(imageView, tre.d(48, 48.0f, (ob6.a0 ? 3 : 5) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        og2 og2Var = new og2(21, null, context);
        this.e = og2Var;
        CheckBoxBase checkBoxBase = og2Var.getCheckBoxBase();
        int w0 = aob.w0(null, aob.Yl, false);
        if (checkBoxBase.x != w0) {
            checkBoxBase.x = w0;
            checkBoxBase.b();
        }
        og2Var.b(-1, aob.d6, aob.k7);
        og2Var.setDrawUnchecked(false);
        og2Var.setDrawBackgroundAsArc(3);
        addView(og2Var, tre.d(24, 24.0f, (ob6.a0 ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
