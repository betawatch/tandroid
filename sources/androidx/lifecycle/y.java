package androidx.lifecycle;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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

    public final void c(boolean z4) {
        if (z4 == this.b) {
            return;
        }
        this.b = z4;
        int i10 = z4 ? 1 : -1;
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
                    boolean z10 = i11 == 0 && i12 > 0;
                    boolean z11 = i11 > 0 && i12 == 0;
                    if (z10) {
                        zVar.f();
                    } else if (z11) {
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
