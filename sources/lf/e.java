package lf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.cast.o;
import i2.i0;
import j$.util.Objects;
import jf.g;
import org.telegram.messenger.f8;
import org.telegram.messenger.q20;
import org.telegram.messenger.w0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e implements kf.b {
    public f d;
    public f e;
    public g f;
    public View g;
    public bh.d h;
    public View i;
    public final jf.f j;
    public float k;
    public boolean n;
    public float o;
    public int a = 0;
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final RectF l = new RectF();
    public final Path m = new Path();

    public e(jf.f fVar) {
        this.j = fVar;
    }

    @Override // kf.b
    public final void a() {
        i0 i0Var;
        jf.f fVar = this.j;
        if (fVar == null || (i0Var = fVar.l) == null) {
            return;
        }
        i0Var.e();
    }

    @Override // kf.b
    public final void b() {
        this.n = false;
        h();
    }

    @Override // kf.b
    public final void c() {
        i0 i0Var;
        jf.f fVar = this.j;
        if (fVar == null || (i0Var = fVar.l) == null) {
            return;
        }
        i0Var.j();
    }

    @Override // kf.b
    public final void e() {
        this.n = true;
        g();
    }

    public final void g() {
        Rect rect = this.b;
        jf.f fVar = this.j;
        if (this.a != 0) {
            f8.d("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.a);
            return;
        }
        rect.set((Rect) fVar.h.a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) fVar.a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) fVar.a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap m10 = fVar.g.m();
        final a aVar = fVar.g;
        Objects.requireNonNull(aVar);
        final int i10 = 0;
        this.d = new f(measuredWidth, measuredHeight, new q20() { // from class: lf.d
            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        aVar.l((Canvas) obj);
                        break;
                    default:
                        aVar.n((Canvas) obj);
                        break;
                }
            }
        });
        final a aVar2 = fVar.g;
        Objects.requireNonNull(aVar2);
        final int i11 = 1;
        this.e = new f(measuredWidth, measuredHeight, new q20() { // from class: lf.d
            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        aVar2.l((Canvas) obj);
                        break;
                    default:
                        aVar2.n((Canvas) obj);
                        break;
                }
            }
        });
        this.i = fVar.g.r();
        this.g = new View((LaunchActivity) fVar.a.d);
        g gVar = new g((LaunchActivity) fVar.a.d, this);
        this.f = gVar;
        gVar.addView(this.g);
        this.f.addView(this.i);
        View view = this.g;
        View view2 = fVar.k;
        bh.d dVar = new bh.d();
        dVar.a = view;
        dVar.b = view2;
        this.h = dVar;
        dVar.K(m10);
        fVar.a.p().addView(this.f);
        this.a = 1;
        this.f.invalidate();
        org.telegram.messenger.i0.K(this.i, new o(w0.d, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.a != 2) {
            f8.d("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.a);
            return;
        }
        this.h.K(this.j.g.i());
        this.a = 3;
        this.f.removeView(this.i);
        this.f.invalidate();
        this.i = null;
        org.telegram.messenger.i0.K(this.f, new o(w0.d, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override // kf.b
    public final /* synthetic */ void d() {
    }

    @Override // kf.b
    public final /* synthetic */ void f() {
    }
}
