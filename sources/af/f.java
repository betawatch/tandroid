package af;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import h3.k0;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f implements ze.c, ze.b {
    public i d;
    public i e;
    public ye.e f;
    public View g;
    public h h;
    public View i;
    public final ye.d j;
    public float k;
    public boolean n;
    public float o;
    public int a = 0;
    public final Rect b = new Rect();
    public final Rect c = new Rect();
    public final RectF l = new RectF();
    public final Path m = new Path();

    public f(ye.d dVar) {
        this.j = dVar;
    }

    @Override // ze.c
    public final void a() {
        k0 k0Var;
        ye.d dVar = this.j;
        if (dVar == null || (k0Var = dVar.l) == null) {
            return;
        }
        k0Var.o(false);
    }

    @Override // ze.c
    public final void b() {
        this.n = false;
        h();
    }

    @Override // ze.c
    public final void c() {
        k0 k0Var;
        ye.d dVar = this.j;
        if (dVar == null || (k0Var = dVar.l) == null) {
            return;
        }
        k0Var.o(true);
    }

    @Override // ze.c
    public final void e() {
        this.n = true;
        g();
    }

    public final void g() {
        Rect rect = this.b;
        ye.d dVar = this.j;
        if (this.a != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.a);
            return;
        }
        rect.set(dVar.h.a);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + rect);
        int measuredWidth = ((LaunchActivity) dVar.a.d).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) dVar.a.d).getWindow().getDecorView().getMeasuredHeight();
        Bitmap c10 = dVar.g.c();
        final a aVar = dVar.g;
        Objects.requireNonNull(aVar);
        final int i10 = 0;
        this.d = new i(measuredWidth, measuredHeight, new Utilities.Callback() { // from class: af.d
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        aVar.b((Canvas) obj);
                        break;
                    default:
                        aVar.e((Canvas) obj);
                        break;
                }
            }
        });
        final a aVar2 = dVar.g;
        Objects.requireNonNull(aVar2);
        final int i11 = 1;
        this.e = new i(measuredWidth, measuredHeight, new Utilities.Callback() { // from class: af.d
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        aVar2.b((Canvas) obj);
                        break;
                    default:
                        aVar2.e((Canvas) obj);
                        break;
                }
            }
        });
        this.i = dVar.g.h();
        this.g = new View((LaunchActivity) dVar.a.d);
        ye.e eVar = new ye.e((LaunchActivity) dVar.a.d, this);
        this.f = eVar;
        eVar.addView(this.g);
        this.f.addView(this.i);
        View view = this.g;
        View view2 = dVar.k;
        h hVar = new h();
        hVar.a = view;
        hVar.b = view2;
        this.h = hVar;
        hVar.z(c10);
        dVar.a.b().addView(this.f);
        this.a = 1;
        this.f.invalidate();
        AndroidUtilities.doOnPreDraw(this.i, new bf.e(ApplicationLoader.applicationHandler, new b(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void h() {
        if (this.a != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.a);
            return;
        }
        this.h.z(this.j.g.a());
        this.a = 3;
        this.f.removeView(this.i);
        this.f.invalidate();
        this.i = null;
        AndroidUtilities.doOnPreDraw(this.f, new bf.e(ApplicationLoader.applicationHandler, new b(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    @Override // ze.c
    public final /* synthetic */ void d() {
    }

    @Override // ze.c
    public final /* synthetic */ void f() {
    }
}
