// default package

import android.graphics.Typeface;
import android.provider.Settings;
import android.view.View;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class fyc implements cyc, byc, swc {
    public twc E;
    public View F;
    public int G;
    public int H;
    public final y74 a;
    public final a9c b = new a9c(0.0f);
    public final b9c c = new b9c();
    public final b9c d = new b9c();
    public final on e = new on(null);
    public final oh4 f;
    public final Runnable h;
    public boolean n;
    public vxc r;
    public byte s;
    public int w;
    public int x;
    public final eyc y;

    public fyc(Runnable runnable) {
        byte b = 0;
        dyc dycVar = new dyc(this, (byte) 0);
        oh4 oh4Var = new oh4();
        oh4Var.c = nv5.a;
        oh4Var.d = new tp5(oh4Var, (byte) 5);
        oh4Var.b = dycVar;
        Typeface typeface = gl.a;
        float f = 1.0f;
        try {
            f = Settings.Global.getFloat(a.b.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
        }
        oh4Var.a = (long) (f * 250.0f * 1.1f);
        this.f = oh4Var;
        this.s = (byte) 1;
        this.y = new eyc(this, b);
        this.h = runnable;
        this.a = new y74(0, new aec(this, runnable, (byte) 3), gb.w, 250L);
    }

    @Override // swc
    public final void P() {
        View view = this.F;
        if (view != null) {
            view.postOnAnimation(new eyc(this, (byte) 1));
        }
    }

    @Override // swc
    public final View R() {
        return this.F;
    }

    public final void a() {
        boolean z = this.a.h;
        boolean z2 = this.n;
        on onVar = this.e;
        if (!z2 && z) {
            this.n = true;
            onVar.d();
        }
        if (!this.n || z) {
            return;
        }
        this.n = false;
        onVar.e();
    }

    public final float c() {
        twc twcVar = this.E;
        b9c b9cVar = this.d;
        return (twcVar == null || this.H <= 0) ? b9cVar.d.a : Math.max(this.G, b9cVar.d.a);
    }

    public final float d() {
        twc twcVar = this.E;
        b9c b9cVar = this.c;
        return (twcVar == null || this.H <= 0) ? b9cVar.d.a : Math.max(this.G, b9cVar.d.a);
    }

    public final int e() {
        return (this.E == null || this.H <= 0) ? Math.max(f(527).d, this.w) : Math.max(this.G, Math.max(f(527).d, this.w));
    }

    public final io5 f(int i) {
        vxc vxcVar = this.r;
        return vxcVar != null ? vxcVar.a.f(i) : io5.e;
    }

    public final void g(int i) {
        if (this.w == i && this.s == 0) {
            return;
        }
        gl.r(this.y);
        this.x = Math.max(this.w, i);
        this.w = i;
        this.s = (byte) 0;
        j(this.r);
    }

    public final void h(int i) {
        if (i > 0) {
            g(i + gl.n);
        } else {
            i(true);
        }
    }

    public final void i(boolean z) {
        if (this.w != 0) {
            eyc eycVar = this.y;
            gl.r(eycVar);
            this.s = z ? (byte) 3 : (byte) 2;
            j(this.r);
            if (z) {
                gl.d3(eycVar, 1000L);
            }
        }
    }

    public final void j(vxc vxcVar) {
        k(vxcVar, this.r != null);
    }

    public final void k(vxc vxcVar, boolean z) {
        io5 io5Var;
        io5 io5Var2;
        int i;
        y74 y74Var;
        vxc b = b(vxcVar);
        this.r = b;
        if (b != null) {
            sxc sxcVar = b.a;
            io5Var = io5.a(sxcVar.f(647), sxcVar.g(647));
            io5Var2 = sxcVar.f(8);
        } else {
            io5Var = io5.e;
            io5Var2 = io5Var;
        }
        oh4 oh4Var = this.f;
        nv5 nv5Var = (nv5) oh4Var.c;
        boolean z2 = io5Var2.d > 0;
        nv5 nv5Var2 = !z ? z2 ? nv5.d : nv5.a : z2 ? nv5.c : nv5.b;
        if (nv5Var != nv5Var2) {
            oh4Var.a(nv5Var2, false);
        }
        byte b2 = this.s;
        if (b2 == 2) {
            this.w = 0;
        }
        if (b2 == 3 && io5Var2.d > 0) {
            this.w = 0;
        }
        io5 a = io5.a(io5Var2, io5.b(0, 0, 0, this.w));
        int i2 = a.c;
        int i3 = a.b;
        int i4 = a.a;
        int i5 = a.d;
        io5 a2 = io5.a(io5Var, a);
        int i6 = a2.d;
        int i7 = a2.c;
        int i8 = a2.b;
        int i9 = a2.a;
        Runnable runnable = this.h;
        y74 y74Var2 = this.a;
        b9c b9cVar = this.d;
        b9c b9cVar2 = this.c;
        a9c a9cVar = this.b;
        if (z) {
            if (a9cVar.b(i5 > 0 ? 1.0f : 0.0f)) {
                i = i7;
                y74Var = y74Var2;
            } else {
                y74Var = y74Var2;
                i = i7;
                if (!b9cVar2.b(i9, i8, i7, i6) && !b9cVar.b(i4, i3, i2, i5)) {
                    if (nv5Var != nv5Var2) {
                        runnable.run();
                    }
                }
            }
            y74Var.b();
            a9cVar.c(false);
            b9cVar2.c(false);
            b9cVar.c(false);
            a9cVar.c = i5 > 0 ? 1.0f : 0.0f;
            b9cVar2.e(i9, i8, i, i6);
            b9cVar.e(i4, i3, i2, i5);
            y74 y74Var3 = y74Var;
            y74Var3.c(0.0f);
            y74Var3.a(1.0f);
        } else {
            y74Var2.b();
            a9cVar.d(i5 > 0 ? 1.0f : 0.0f);
            b9cVar2.d(i9, i8, i7, i6);
            b9cVar.d(i4, i3, i2, i5);
            runnable.run();
        }
        a();
    }

    @Override // swc
    public final void o(vxc vxcVar) {
        vxc b = b(vxcVar);
        this.G = b != null ? b.a.f(8).d : 0;
        this.h.run();
    }

    @Override // swc
    public final void w() {
        this.H++;
    }

    public vxc b(vxc vxcVar) {
        return vxcVar;
    }
}
