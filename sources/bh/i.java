package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.i0;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i extends View implements k6 {
    public LinearGradient D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public tg.c a;
    public tg.c b;
    public int c;
    public int d;
    public hi.c e;
    public int f;
    public int h;
    public final Paint n;
    public LinearGradient r;
    public LinearGradient s;
    public p6 w;
    public final Paint x;
    public LinearGradient y;

    public i(Context context) {
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

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.f));
    }

    public final LinearGradient b(boolean z10) {
        int i10 = this.h;
        int o10 = i0.b.o(i10, (Color.alpha(i10) * 2) / 3);
        int o11 = i0.b.o(this.h, 0);
        return z10 ? new LinearGradient(0.0f, 0.0f, 0.0f, this.c, new int[]{i10, o10, o11}, new float[]{0.0f, 0.82f, 1.0f}, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, getMeasuredHeight() - this.d, 0.0f, getMeasuredHeight(), new int[]{o11, o10, i10}, new float[]{0.0f, 0.18f, 1.0f}, Shader.TileMode.CLAMP);
    }

    public final void c(tg.b bVar, wg.d dVar) {
        vg.f c10 = bVar.c(this, null, false);
        c10.o(dVar);
        tg.c cVar = new tg.c(c10);
        this.a = cVar;
        cVar.b(-i0.L(30.0f), true);
        vg.f c11 = bVar.c(this, null, false);
        c11.o(dVar);
        tg.c cVar2 = new tg.c(c11);
        this.b = cVar2;
        cVar2.b(i0.L(30.0f), true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (t6.i1(this.w)) {
            int x02 = t6.x0(null, t6.Ca, false);
            int x03 = t6.x0(null, t6.Da, false);
            int measuredHeight = getMeasuredHeight();
            if (this.y == null || this.F != x02 || this.E != x03 || this.G != this.c || this.H != this.d || this.I != measuredHeight) {
                this.F = x02;
                this.E = x03;
                this.G = this.c;
                this.H = this.d;
                this.I = measuredHeight;
                int[] iArr = {x02, x03, i0.b.o(x03, 0)};
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.y = new LinearGradient(0.0f, 0.0f, 0.0f, Math.max(1, this.c), iArr, new float[]{0.0f, 0.557f, 1.0f}, tileMode);
                this.D = new LinearGradient(0.0f, measuredHeight, 0.0f, measuredHeight - Math.max(1, this.d), iArr, new float[]{0.0f, 0.557f, 1.0f}, tileMode);
            }
            int i10 = this.c;
            Paint paint = this.x;
            if (i10 > 0 && this.a.G > 0) {
                paint.setShader(this.y);
                paint.setAlpha(this.a.G);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.c, paint);
            }
            if (this.d > 0) {
                paint.setShader(this.D);
                paint.setAlpha(zs.e4);
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
        int i11 = this.c;
        Paint paint2 = this.n;
        if (i11 > 0 && this.a.G > 0) {
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
            paint2.setAlpha(zs.e4);
            canvas.drawRect(0.0f, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight(), paint2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        tg.c cVar = this.a;
        if (cVar.G != i10) {
            cVar.G = i10;
            invalidate();
        }
    }

    public void setFadeZoneBottom(int i10) {
        if (this.d != i10) {
            this.d = i10;
            a();
            invalidate();
        }
    }

    public void setFadeZoneTop(int i10) {
        if (this.c != i10) {
            this.c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.a.F = z10;
        this.b.F = z10;
    }

    public void setOverlayColor(int i10) {
        if (this.h != i10) {
            this.h = i10;
            this.s = null;
            this.r = null;
            invalidate();
        }
    }

    public void setResourcesProvider(p6 p6Var) {
        this.w = p6Var;
    }

    public void setup(tg.b bVar) {
        c(bVar, null);
    }

    public void setupColorKey(int i10) {
        this.f = i10;
        if (this.e == null) {
            hi.c cVar = new hi.c();
            this.e = cVar;
            cVar.a(t6.x0(null, i10, false));
            setup(new tg.b(this.e));
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10;
        hi.c cVar = this.e;
        if (cVar == null || (i10 = this.f) == -1) {
            return;
        }
        cVar.a(t6.x0(null, i10, false));
        invalidate();
    }
}
