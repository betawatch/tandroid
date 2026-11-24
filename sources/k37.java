// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class k37 extends View implements tjb {
    public final gn a;
    public final wjb b;
    public final g37 c;
    public boolean d;
    public boolean e;
    public final String f;
    public final String h;
    public final int n;

    public k37(Context context, int i, String str, int i2, String str2, wjb wjbVar) {
        super(context);
        this.d = true;
        this.f = str;
        this.h = str2;
        this.b = wjbVar;
        int i3 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i3, wjbVar), 2, -1);
        vkb M = zkb.M(i3);
        setBackground(f0);
        zkb.j(this, f0, null, M, wjbVar);
        gn gnVar = new gn(true, true, true);
        this.a = gnVar;
        gnVar.n(0.35f, 300L, s33.h);
        gnVar.w(gl.L(16.0f));
        gnVar.u(bkb.v0(bkb.D8, wjbVar));
        gnVar.setCallback(this);
        gnVar.q(!k96.a0);
        if (k96.a0) {
            gnVar.b = 5;
        }
        float L = gl.L(77.0f);
        TextPaint textPaint = gnVar.a;
        int max = (int) (Math.max(textPaint.measureText(str), textPaint.measureText(str2)) + L);
        this.n = max;
        gnVar.N = max;
        g37 g37Var = new g37((byte) 0);
        oy8 oy8Var = new oy8(i, gl.L(24.0f), gl.L(24.0f));
        g37Var.c = oy8Var;
        oy8Var.M(this);
        oy8Var.E(true);
        oy8Var.h = true;
        oy8Var.F(0);
        oy8 oy8Var2 = new oy8(i2, gl.L(24.0f), gl.L(24.0f));
        g37Var.d = oy8Var2;
        oy8Var2.M(this);
        oy8Var2.E(true);
        oy8Var2.h = true;
        oy8Var2.F(0);
        g37Var.e = oy8Var;
        this.c = g37Var;
        zkb.x(this, g37Var, bkb.E8, wjbVar, PorterDuff.Mode.SRC_IN);
    }

    public final void a(boolean z, boolean z2) {
        if (this.d || z != this.e) {
            this.e = z;
            String str = z ? this.f : this.h;
            boolean z3 = z2 && !k96.a0;
            gn gnVar = this.a;
            gnVar.t(str, z3, true);
            g37 g37Var = this.c;
            oy8 oy8Var = (oy8) g37Var.d;
            oy8 oy8Var2 = (oy8) g37Var.c;
            g37Var.b = z;
            if (z2) {
                g37Var.e = z ? oy8Var2 : oy8Var;
                oy8Var2.H(0);
                oy8Var.H(0);
                ((oy8) g37Var.e).start();
            } else {
                if (z) {
                    oy8Var = oy8Var2;
                }
                g37Var.e = oy8Var;
                oy8Var.H(oy8Var.e[0] - 1);
            }
            this.d = false;
            setContentDescription(gnVar.i);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.D8));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z = k96.a0;
        gn gnVar = this.a;
        g37 g37Var = this.c;
        if (z) {
            g37Var.setBounds(getMeasuredWidth() - gl.L(41.0f), ug8.D(24.0f, getMeasuredHeight(), 2), getMeasuredWidth() - gl.L(17.0f), (gl.L(24.0f) + getMeasuredHeight()) / 2);
            gnVar.setBounds(0, 0, getMeasuredWidth() - gl.L(59.0f), getMeasuredHeight());
        } else {
            g37Var.setBounds(gl.L(17.0f), ug8.D(24.0f, getMeasuredHeight(), 2), gl.L(41.0f), (gl.L(24.0f) + getMeasuredHeight()) / 2);
            gnVar.setBounds(gl.L(59.0f), 0, getMeasuredWidth(), getMeasuredHeight());
        }
        gnVar.draw(canvas);
        g37Var.draw(canvas);
    }

    public boolean getState() {
        return this.e;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.n;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(mode == 1073741824 ? Math.max(View.MeasureSpec.getSize(i), i3) : Math.min(View.MeasureSpec.getSize(i), i3), mode), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getVisibility() != 0 || getAlpha() < 0.5f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // tjb
    public final void updateColors() {
        try {
            gn gnVar = this.a;
            if (gnVar != null) {
                gnVar.u(bkb.v0(bkb.D8, this.b));
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
