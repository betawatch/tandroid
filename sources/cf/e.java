package cf;

import a5.j;
import af.h;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import c2.p;
import j$.util.Objects;
import j3.k0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e implements bf.c, bf.b {
    public g d;
    public g e;
    public h f;
    public View g;
    public j h;
    public View i;
    public final af.g j;
    public float k;
    public boolean n;
    public float o;
    public int a = 0;
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final RectF l = new RectF();
    public final Path m = new Path();

    public e(af.g gVar) {
        this.j = gVar;
    }

    @Override // bf.c
    public final void a() {
        k0 k0Var;
        af.g gVar = this.j;
        if (gVar == null || (k0Var = gVar.l) == null) {
            return;
        }
        k0Var.o(false);
    }

    @Override // bf.c
    public final void b() {
        this.n = false;
        h();
    }

    @Override // bf.c
    public final void c() {
        k0 k0Var;
        af.g gVar = this.j;
        if (gVar == null || (k0Var = gVar.l) == null) {
            return;
        }
        k0Var.o(true);
    }

    @Override // bf.c
    public final void e() {
        this.n = true;
        g();
    }

    public final void g() {
        Rect rect = this.b;
        af.g gVar = this.j;
        if (this.a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.a);
            return;
        }
        rect.set(gVar.h.a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) gVar.a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) gVar.a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap d = gVar.g.d();
        final a aVar = gVar.g;
        Objects.requireNonNull(aVar);
        final int i10 = 0;
        this.d = new g(measuredWidth, measuredHeight, new Utilities.Callback() { // from class: cf.d
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
        final a aVar2 = gVar.g;
        Objects.requireNonNull(aVar2);
        final int i11 = 1;
        this.e = new g(measuredWidth, measuredHeight, new Utilities.Callback() { // from class: cf.d
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
        this.i = gVar.g.h();
        this.g = new View((LaunchActivity) gVar.a.d);
        h hVar = new h((LaunchActivity) gVar.a.d, this);
        this.f = hVar;
        hVar.addView(this.g);
        this.f.addView(this.i);
        View view = this.g;
        View view2 = gVar.k;
        j jVar = new j();
        jVar.a = view;
        jVar.b = view2;
        this.h = jVar;
        jVar.s(d);
        gVar.a.b().addView(this.f);
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
        this.h.s(this.j.g.b());
        this.a = 3;
        this.f.removeView(this.i);
        this.f.invalidate();
        this.i = null;
        AndroidUtilities.doOnPreDraw(this.f, new p(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override // bf.c
    public final /* synthetic */ void d() {
    }

    @Override // bf.c
    public final /* synthetic */ void f() {
    }
}
