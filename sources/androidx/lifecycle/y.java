package androidx.lifecycle;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class y {
    public final a0 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ z d;

    public y(z zVar, a0 a0Var) {
        this.d = zVar;
        this.a = a0Var;
    }

    public final void c(boolean z10) {
        if (z10 == this.b) {
            return;
        }
        this.b = z10;
        int i3 = z10 ? 1 : -1;
        z zVar = this.d;
        int i10 = zVar.c;
        zVar.c = i3 + i10;
        if (!zVar.d) {
            zVar.d = true;
            while (true) {
                try {
                    int i11 = zVar.c;
                    if (i10 == i11) {
                        break;
                    }
                    boolean z11 = i10 == 0 && i11 > 0;
                    boolean z12 = i10 > 0 && i11 == 0;
                    if (z11) {
                        zVar.f();
                    } else if (z12) {
                        zVar.g();
                    }
                    i10 = i11;
                } catch (Throwable th2) {
                    zVar.d = false;
                    throw th2;
                }
            }
            zVar.d = false;
        }
        if (this.b) {
            zVar.c(this);
        }
    }

    public boolean j(t tVar) {
        return false;
    }

    public abstract boolean k();

    public void g() {
    }
}
