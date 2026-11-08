package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class f extends View implements a6 {
    public LinearGradient D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public dh.d a;
    public dh.d b;
    public int c;
    public int d;
    public ri.c e;
    public int f;
    public int h;
    public final Paint n;
    public LinearGradient r;
    public LinearGradient s;
    public f6 w;
    public final Paint x;
    public LinearGradient y;

    public f(Context context) {
        super(context);
        this.n = new Paint();
        this.x = new Paint();
    }

    public final void a() {
        this.a.setBounds(0, 0, getMeasuredWidth(), this.c);
        this.b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
        this.s = null;
        this.r = null;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.f));
    }

    public final LinearGradient b(boolean z9) {
        int i7 = this.h;
        int o4 = i0.a.o(i7, (Color.alpha(i7) * 2) / 3);
        int o10 = i0.a.o(this.h, 0);
        return z9 ? new LinearGradient(0.0f, 0.0f, 0.0f, this.c, new int[]{i7, o4, o10}, new float[]{0.0f, 0.82f, 1.0f}, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, getMeasuredHeight() - this.d, 0.0f, getMeasuredHeight(), new int[]{o10, o4, i7}, new float[]{0.0f, 0.18f, 1.0f}, Shader.TileMode.CLAMP);
    }

    public final void c(dh.c cVar, gh.e eVar) {
        fh.g c10 = cVar.c(this, null, false);
        c10.p(eVar);
        dh.d dVar = new dh.d(c10);
        this.a = dVar;
        dVar.b(-g0.L(30.0f), true);
        fh.g c11 = cVar.c(this, null, false);
        c11.p(eVar);
        dh.d dVar2 = new dh.d(c11);
        this.b = dVar2;
        dVar2.b(g0.L(30.0f), true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (k6.i1(this.w)) {
            int x02 = k6.x0(null, k6.Ca, false);
            int x03 = k6.x0(null, k6.Da, false);
            int measuredHeight = getMeasuredHeight();
            if (this.y == null || this.F != x02 || this.E != x03 || this.G != this.c || this.H != this.d || this.I != measuredHeight) {
                this.F = x02;
                this.E = x03;
                this.G = this.c;
                this.H = this.d;
                this.I = measuredHeight;
                int[] iArr = {x02, x03, i0.a.o(x03, 0)};
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.y = new LinearGradient(0.0f, 0.0f, 0.0f, Math.max(1, this.c), iArr, new float[]{0.0f, 0.557f, 1.0f}, tileMode);
                this.D = new LinearGradient(0.0f, measuredHeight, 0.0f, measuredHeight - Math.max(1, this.d), iArr, new float[]{0.0f, 0.557f, 1.0f}, tileMode);
            }
            int i7 = this.c;
            Paint paint = this.x;
            if (i7 > 0 && this.a.G > 0) {
                paint.setShader(this.y);
                paint.setAlpha(this.a.G);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.c, paint);
            }
            if (this.d > 0) {
                paint.setShader(this.D);
                paint.setAlpha(qs.e4);
                canvas2 = canvas;
                canvas2.drawRect(0.0f, measuredHeight - this.d, getMeasuredWidth(), measuredHeight, paint);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
            this.a.draw(canvas2);
            this.b.draw(canvas2);
        }
        if (Color.alpha(this.h) == 0) {
            return;
        }
        int i10 = this.c;
        Paint paint2 = this.n;
        if (i10 > 0 && this.a.G > 0) {
            if (this.r == null) {
                this.r = b(true);
            }
            paint2.setShader(this.r);
            paint2.setAlpha(this.a.G);
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.c, paint2);
        }
        if (this.d > 0) {
            if (this.s == null) {
                this.s = b(false);
            }
            paint2.setShader(this.s);
            paint2.setAlpha(qs.e4);
            canvas.drawRect(0.0f, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight(), paint2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        a();
    }

    public void setFadeHeightBottom(int i7) {
        this.b.b(i7, true);
    }

    public void setFadeHeightTop(int i7) {
        this.a.b(-i7, true);
    }

    public void setFadeTopAlpha(int i7) {
        dh.d dVar = this.a;
        if (dVar.G != i7) {
            dVar.G = i7;
            invalidate();
        }
    }

    public void setFadeZoneBottom(int i7) {
        if (this.d != i7) {
            this.d = i7;
            a();
            invalidate();
        }
    }

    public void setFadeZoneTop(int i7) {
        if (this.c != i7) {
            this.c = i7;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z9) {
        this.a.F = z9;
        this.b.F = z9;
    }

    public void setOverlayColor(int i7) {
        if (this.h != i7) {
            this.h = i7;
            this.s = null;
            this.r = null;
            invalidate();
        }
    }

    public void setResourcesProvider(f6 f6Var) {
        this.w = f6Var;
    }

    public void setup(dh.c cVar) {
        c(cVar, null);
    }

    public void setupColorKey(int i7) {
        this.f = i7;
        if (this.e == null) {
            ri.c cVar = new ri.c();
            this.e = cVar;
            cVar.a(k6.x0(null, i7, false));
            ri.c cVar2 = this.e;
            setup(new dh.c(cVar2, cVar2, cVar2));
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int i7;
        ri.c cVar = this.e;
        if (cVar == null || (i7 = this.f) == -1) {
            return;
        }
        cVar.a(k6.x0(null, i7, false));
        invalidate();
    }
}
