package ed;

import kf.p;
import kf.s;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class d extends h {
    public final /* synthetic */ int e;

    @Override // ed.h
    public final p b() {
        switch (this.e) {
            case 0:
                int i7 = this.d + 1;
                this.d = i7;
                if (c() != '[') {
                    return null;
                }
                this.d++;
                s f10 = f("![");
                i iVar = this.a;
                gf.d dVar = iVar.i;
                gf.d dVar2 = new gf.d(f10, i7, dVar, iVar.h, true);
                if (dVar != null) {
                    dVar.d = true;
                }
                iVar.i = dVar2;
                return f10;
            default:
                int i10 = this.d;
                this.d = i10 + 1;
                s f11 = f("[");
                i iVar2 = this.a;
                gf.d dVar3 = iVar2.i;
                gf.d dVar4 = new gf.d(f11, i10, dVar3, iVar2.h, false);
                if (dVar3 != null) {
                    dVar3.d = true;
                }
                iVar2.i = dVar4;
                return f11;
        }
    }

    @Override // ed.h
    public final char d() {
        switch (this.e) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
