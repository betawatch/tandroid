package androidx.lifecycle;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        int i10 = z10 ? 1 : -1;
        z zVar = this.d;
        int i11 = zVar.c;
        zVar.c = i10 + i11;
        if (!zVar.d) {
            zVar.d = true;
            while (true) {
                try {
                    int i12 = zVar.c;
                    if (i11 == i12) {
                        break;
                    }
                    boolean z11 = i11 == 0 && i12 > 0;
                    boolean z12 = i11 > 0 && i12 == 0;
                    if (z11) {
                        zVar.f();
                    } else if (z12) {
                        zVar.g();
                    }
                    i11 = i12;
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
