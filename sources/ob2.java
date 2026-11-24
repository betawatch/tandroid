// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ob2 extends View implements tjb {
    public final f6c a;
    public final wjb b;
    public int c;
    public int d;
    public bb2 e;
    public float f;
    public int h;

    public ob2(Context context, wjb wjbVar) {
        super(context);
        this.b = wjbVar;
        f6c f6cVar = new f6c();
        this.a = f6cVar;
        f6cVar.setCallback(this);
        f6cVar.n = k96.M0(2131743588, null);
        f6cVar.o = k96.M0(2131743589, null);
        f6cVar.p = k96.M0(2131743587, null);
        f6cVar.j = new hq1(this, (byte) 21);
    }

    public final void a(Canvas canvas) {
        wjb wjbVar = this.b;
        if (wjbVar != null) {
            wjbVar.b(0.0f, this.f, getMeasuredWidth(), this.h);
        } else {
            bkb.q(0.0f, this.f, getMeasuredWidth(), this.h);
        }
        float L = gl.L(18.0f);
        float L2 = gl.L(6.0f);
        float L3 = gl.L(18.0f) + this.c;
        float L4 = gl.L(6.0f) + this.d;
        float L5 = gl.L(18.0f);
        float L6 = gl.L(18.0f);
        Paint d = wjbVar != null ? wjbVar.d("paintChatActionBackground") : null;
        if (d == null) {
            d = bkb.T0("paintChatActionBackground");
        }
        canvas.drawRoundRect(L, L2, L3, L4, L5, L6, d);
        if (wjbVar != null ? wjbVar.g() : bkb.b1()) {
            canvas.drawRoundRect(gl.L(18.0f), gl.L(6.0f), gl.L(18.0f) + this.c, gl.L(6.0f) + this.d, gl.L(18.0f), gl.L(18.0f), bkb.g2);
        }
    }

    public final void b(float f, int i) {
        this.f = f;
        this.h = i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int L = gl.L(18.0f);
        int L2 = gl.L(6.0f);
        int L3 = gl.L(18.0f) + this.c;
        int L4 = gl.L(6.0f) + this.d;
        f6c f6cVar = this.a;
        f6cVar.setBounds(L, L2, L3, L4);
        f6cVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = size - gl.L(36.0f);
        this.c = L;
        int a = this.a.a(L);
        this.d = a;
        setMeasuredDimension(size, gl.L(12.0f) + a);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.i.a(this, motionEvent);
    }

    public void setDelegate(bb2 bb2Var) {
        this.e = bb2Var;
    }

    @Override // tjb
    public final void updateColors() {
        this.a.b();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
