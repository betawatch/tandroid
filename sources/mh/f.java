package mh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f extends View implements z5 {
    public LinearGradient E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public eh.d a;
    public eh.d b;
    public int c;
    public int d;
    public si.c e;
    public int f;
    public int h;
    public final Paint n;
    public LinearGradient r;
    public LinearGradient s;
    public e6 w;
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.f));
    }

    public final LinearGradient b(boolean z10) {
        int i3 = this.h;
        int o10 = i0.a.o(i3, (Color.alpha(i3) * 2) / 3);
        int o11 = i0.a.o(this.h, 0);
        return z10 ? new LinearGradient(0.0f, 0.0f, 0.0f, this.c, new int[]{i3, o10, o11}, new float[]{0.0f, 0.82f, 1.0f}, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, getMeasuredHeight() - this.d, 0.0f, getMeasuredHeight(), new int[]{o11, o10, i3}, new float[]{0.0f, 0.18f, 1.0f}, Shader.TileMode.CLAMP);
    }

    public final void c(eh.c cVar, hh.e eVar) {
        gh.g c2 = cVar.c(this, null, false);
        c2.p(eVar);
        eh.d dVar = new eh.d(c2);
        this.a = dVar;
        dVar.b(-g0.L(30.0f), true);
        gh.g c10 = cVar.c(this, null, false);
        c10.p(eVar);
        eh.d dVar2 = new eh.d(c10);
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
            if (this.y == null || this.G != x02 || this.F != x03 || this.H != this.c || this.I != this.d || this.J != measuredHeight) {
                this.G = x02;
                this.F = x03;
                this.H = this.c;
                this.I = this.d;
                this.J = measuredHeight;
                int[] iArr = {x02, x03, i0.a.o(x03, 0)};
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.y = new LinearGradient(0.0f, 0.0f, 0.0f, Math.max(1, this.c), iArr, new float[]{0.0f, 0.557f, 1.0f}, tileMode);
                this.E = new LinearGradient(0.0f, measuredHeight, 0.0f, measuredHeight - Math.max(1, this.d), iArr, new float[]{0.0f, 0.557f, 1.0f}, tileMode);
            }
            int i3 = this.c;
            Paint paint = this.x;
            if (i3 > 0 && this.a.H > 0) {
                paint.setShader(this.y);
                paint.setAlpha(this.a.H);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.c, paint);
            }
            if (this.d > 0) {
                paint.setShader(this.E);
                paint.setAlpha(hs.e4);
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
        if (i10 > 0 && this.a.H > 0) {
            if (this.r == null) {
                this.r = b(true);
            }
            paint2.setShader(this.r);
            paint2.setAlpha(this.a.H);
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.c, paint2);
        }
        if (this.d > 0) {
            if (this.s == null) {
                this.s = b(false);
            }
            paint2.setShader(this.s);
            paint2.setAlpha(hs.e4);
            canvas.drawRect(0.0f, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight(), paint2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        a();
    }

    public void setFadeHeightBottom(int i3) {
        this.b.b(i3, true);
    }

    public void setFadeHeightTop(int i3) {
        this.a.b(-i3, true);
    }

    public void setFadeTopAlpha(int i3) {
        eh.d dVar = this.a;
        if (dVar.H != i3) {
            dVar.H = i3;
            invalidate();
        }
    }

    public void setFadeZoneBottom(int i3) {
        if (this.d != i3) {
            this.d = i3;
            a();
            invalidate();
        }
    }

    public void setFadeZoneTop(int i3) {
        if (this.c != i3) {
            this.c = i3;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.a.G = z10;
        this.b.G = z10;
    }

    public void setOverlayColor(int i3) {
        if (this.h != i3) {
            this.h = i3;
            this.s = null;
            this.r = null;
            invalidate();
        }
    }

    public void setResourcesProvider(e6 e6Var) {
        this.w = e6Var;
    }

    public void setup(eh.c cVar) {
        c(cVar, null);
    }

    public void setupColorKey(int i3) {
        this.f = i3;
        if (this.e == null) {
            si.c cVar = new si.c();
            this.e = cVar;
            cVar.a(k6.x0(null, i3, false));
            si.c cVar2 = this.e;
            setup(new eh.c(cVar2, cVar2, cVar2));
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i3;
        si.c cVar = this.e;
        if (cVar == null || (i3 = this.f) == -1) {
            return;
        }
        cVar.a(k6.x0(null, i3, false));
        invalidate();
    }
}
