package androidx.lifecycle;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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

    public final void c(boolean z9) {
        if (z9 == this.b) {
            return;
        }
        this.b = z9;
        int i7 = z9 ? 1 : -1;
        z zVar = this.d;
        int i10 = zVar.c;
        zVar.c = i7 + i10;
        if (!zVar.d) {
            zVar.d = true;
            while (true) {
                try {
                    int i11 = zVar.c;
                    if (i10 == i11) {
                        break;
                    }
                    boolean z10 = i10 == 0 && i11 > 0;
                    boolean z11 = i10 > 0 && i11 == 0;
                    if (z10) {
                        zVar.f();
                    } else if (z11) {
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
