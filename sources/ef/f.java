package ef;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import c2.p;
import c5.j;
import j$.util.Objects;
import j3.f0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f implements df.c, df.b {
    public h d;
    public h e;
    public cf.g f;
    public View g;
    public j h;
    public View i;
    public final cf.f j;
    public float k;
    public boolean n;
    public float o;
    public int a = 0;
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final RectF l = new RectF();
    public final Path m = new Path();

    public f(cf.f fVar) {
        this.j = fVar;
    }

    @Override // df.c
    public final void a() {
        f0 f0Var;
        cf.f fVar = this.j;
        if (fVar == null || (f0Var = fVar.l) == null) {
            return;
        }
        f0Var.p(false);
    }

    @Override // df.c
    public final void b() {
        this.n = false;
        h();
    }

    @Override // df.c
    public final void c() {
        f0 f0Var;
        cf.f fVar = this.j;
        if (fVar == null || (f0Var = fVar.l) == null) {
            return;
        }
        f0Var.p(true);
    }

    @Override // df.c
    public final void e() {
        this.n = true;
        g();
    }

    public final void g() {
        Rect rect = this.b;
        cf.f fVar = this.j;
        if (this.a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.a);
            return;
        }
        rect.set(fVar.h.a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) fVar.a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) fVar.a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap d = fVar.g.d();
        final a aVar = fVar.g;
        Objects.requireNonNull(aVar);
        final int i10 = 0;
        this.d = new h(measuredWidth, measuredHeight, new Utilities.Callback() { // from class: ef.d
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        aVar.c((Canvas) obj);
                        break;
                    default:
                        aVar.f((Canvas) obj);
                        break;
                }
            }
        });
        final a aVar2 = fVar.g;
        Objects.requireNonNull(aVar2);
        final int i11 = 1;
        this.e = new h(measuredWidth, measuredHeight, new Utilities.Callback() { // from class: ef.d
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        aVar2.c((Canvas) obj);
                        break;
                    default:
                        aVar2.f((Canvas) obj);
                        break;
                }
            }
        });
        this.i = fVar.g.h();
        this.g = new View((LaunchActivity) fVar.a.d);
        cf.g gVar = new cf.g((LaunchActivity) fVar.a.d, this);
        this.f = gVar;
        gVar.addView(this.g);
        this.f.addView(this.i);
        View view = this.g;
        View view2 = fVar.k;
        j jVar = new j();
        jVar.a = view;
        jVar.b = view2;
        this.h = jVar;
        jVar.y(d);
        fVar.a.b().addView(this.f);
        this.a = 1;
        this.f.invalidate();
        AndroidUtilities.doOnPreDraw(this.i, new p(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.a);
            return;
        }
        this.h.y(this.j.g.b());
        this.a = 3;
        this.f.removeView(this.i);
        this.f.invalidate();
        this.i = null;
        AndroidUtilities.doOnPreDraw(this.f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override // df.c
    public final /* synthetic */ void d() {
    }

    @Override // df.c
    public final /* synthetic */ void f() {
    }
}
