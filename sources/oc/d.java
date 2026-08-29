package oc;

import le.p;
import le.s;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends h {
    public final /* synthetic */ int e;

    @Override // oc.h
    public final p b() {
        switch (this.e) {
            case 0:
                int i10 = this.d + 1;
                this.d = i10;
                if (c() != '[') {
                    return null;
                }
                this.d++;
                s f9 = f("![");
                j jVar = this.a;
                ie.b bVar = jVar.i;
                ie.b bVar2 = new ie.b(f9, i10, bVar, jVar.h, true);
                if (bVar != null) {
                    bVar.d = true;
                }
                jVar.i = bVar2;
                return f9;
            default:
                int i11 = this.d;
                this.d = i11 + 1;
                s f10 = f("[");
                j jVar2 = this.a;
                ie.b bVar3 = jVar2.i;
                ie.b bVar4 = new ie.b(f10, i11, bVar3, jVar2.h, false);
                if (bVar3 != null) {
                    bVar3.d = true;
                }
                jVar2.i = bVar4;
                return f10;
        }
    }

    @Override // oc.h
    public final char d() {
        switch (this.e) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
