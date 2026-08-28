package mc;

import ie.p;
import ie.s;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends h {
    public final /* synthetic */ int e;

    @Override // mc.h
    public final p b() {
        switch (this.e) {
            case 0:
                int i9 = this.d + 1;
                this.d = i9;
                if (c() != '[') {
                    return null;
                }
                this.d++;
                s f10 = f("![");
                i iVar = this.a;
                fe.b bVar = iVar.i;
                fe.b bVar2 = new fe.b(f10, i9, bVar, iVar.h, true);
                if (bVar != null) {
                    bVar.d = true;
                }
                iVar.i = bVar2;
                return f10;
            default:
                int i10 = this.d;
                this.d = i10 + 1;
                s f11 = f("[");
                i iVar2 = this.a;
                fe.b bVar3 = iVar2.i;
                fe.b bVar4 = new fe.b(f11, i10, bVar3, iVar2.h, false);
                if (bVar3 != null) {
                    bVar3.d = true;
                }
                iVar2.i = bVar4;
                return f11;
        }
    }

    @Override // mc.h
    public final char d() {
        switch (this.e) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
