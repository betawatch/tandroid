package bd;

import gf.p;
import gf.s;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends h {
    public final /* synthetic */ int e;

    @Override // bd.h
    public final p b() {
        switch (this.e) {
            case 0:
                int i3 = this.d + 1;
                this.d = i3;
                if (c() != '[') {
                    return null;
                }
                this.d++;
                s f10 = f("![");
                j jVar = this.a;
                df.d dVar = jVar.i;
                df.d dVar2 = new df.d(f10, i3, dVar, jVar.h, true);
                if (dVar != null) {
                    dVar.d = true;
                }
                jVar.i = dVar2;
                return f10;
            default:
                int i10 = this.d;
                this.d = i10 + 1;
                s f11 = f("[");
                j jVar2 = this.a;
                df.d dVar3 = jVar2.i;
                df.d dVar4 = new df.d(f11, i10, dVar3, jVar2.h, false);
                if (dVar3 != null) {
                    dVar3.d = true;
                }
                jVar2.i = dVar4;
                return f11;
        }
    }

    @Override // bd.h
    public final char d() {
        switch (this.e) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
