// default package

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class lk8 extends FrameLayout implements wu7 {
    public final vnb a;
    public final ArrayList b;
    public final kk8 c;
    public final kk8 d;
    public final kk8 e;
    public final boolean f;

    public lk8(Context context, vnb vnbVar) {
        super(context);
        this.b = new ArrayList();
        this.a = vnbVar;
        for (g26 g26Var : g26.values()) {
            if (g26Var.e) {
                this.b.add(g26Var);
            }
            if (this.b.size() == 3) {
                break;
            }
        }
        if (this.b.size() < 3) {
            cc4.g(new IllegalArgumentException("There should be at least 3 premium icons!"), true);
            this.f = true;
        } else {
            this.c = a(context, 0);
            this.d = a(context, 1);
            this.e = a(context, 2);
            setClipChildren(false);
        }
    }

    public final kk8 a(Context context, int i) {
        g26 g26Var = (g26) this.b.get(i);
        kk8 kk8Var = new kk8(context);
        dva dvaVar = new dva(20);
        kk8Var.e = dvaVar;
        Paint paint = new Paint(1);
        kk8Var.f = paint;
        dvaVar.r = (byte) 12;
        dvaVar.s = (byte) 8;
        dvaVar.t = (byte) 6;
        if (i == 1) {
            dvaVar.N = 1001;
        }
        if (i == 0) {
            dvaVar.N = 1002;
        }
        dvaVar.O = this.a;
        dvaVar.P = aob.Qk;
        dvaVar.c();
        paint.setColor(-1);
        kk8Var.setLayoutParams(tre.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        kk8Var.setForeground(g26Var.c);
        kk8Var.setBackgroundResource(g26Var.b);
        kk8Var.setPadding(hl.L(8.0f));
        kk8Var.setBackgroundOuterPadding(hl.L(32.0f));
        addView(kk8Var);
        return kk8Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int L = hl.L(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams.height = L;
        layoutParams.width = L;
        float f = L;
        layoutParams.bottomMargin = (int) ((min * 0.1f) + f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.height = L;
        layoutParams2.width = L;
        int i3 = (int) (f * 0.95f);
        layoutParams2.rightMargin = i3;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams3.height = L;
        layoutParams3.width = L;
        layoutParams3.leftMargin = i3;
    }

    @Override // wu7
    public void setOffset(float f) {
        if (this.f) {
            return;
        }
        float abs = Math.abs(f / getMeasuredWidth());
        float interpolation = k43.i.getInterpolation(abs);
        int right = getRight();
        kk8 kk8Var = this.e;
        kk8Var.setTranslationX(((kk8Var.getWidth() * 1.5f) + (right - kk8Var.getRight()) + hl.L(32.0f)) * interpolation);
        kk8Var.setTranslationY(hl.L(16.0f) * interpolation);
        float i = Utilities.i(hl.R1(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        kk8Var.setScaleX(i);
        kk8Var.setScaleY(i);
        int top = getTop();
        kk8 kk8Var2 = this.c;
        kk8Var2.setTranslationY((((top - kk8Var2.getTop()) - (kk8Var2.getHeight() * 1.8f)) - hl.L(32.0f)) * abs);
        kk8Var2.setTranslationX(hl.L(16.0f) * abs);
        float i2 = Utilities.i(hl.R1(1.0f, 1.8f, abs), 1.0f, 0.0f);
        kk8Var2.setScaleX(i2);
        kk8Var2.setScaleY(i2);
        float interpolation2 = k43.g.getInterpolation(abs);
        int left = getLeft();
        kk8 kk8Var3 = this.d;
        kk8Var3.setTranslationX((((left - kk8Var3.getLeft()) - (kk8Var3.getWidth() * 2.5f)) + hl.L(32.0f)) * interpolation2);
        kk8Var3.setTranslationY(((kk8Var3.getHeight() * 2.5f) + (getBottom() - kk8Var3.getBottom()) + hl.L(32.0f)) * interpolation2);
        float i3 = Utilities.i(hl.R1(1.0f, 2.5f, abs), 1.0f, 0.0f);
        kk8Var3.setScaleX(i3);
        kk8Var3.setScaleY(i3);
        float f2 = abs < 0.4f ? abs / 0.4f : 1.0f;
        kk8Var.h = f2;
        kk8Var2.h = f2;
        kk8Var3.h = f2;
    }
}
