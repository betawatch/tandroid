package nc;

import je.p;
import je.s;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d extends h {
    public final /* synthetic */ int e;

    @Override // nc.h
    public final p b() {
        switch (this.e) {
            case 0:
                int i10 = this.d + 1;
                this.d = i10;
                if (c() != '[') {
                    return null;
                }
                this.d++;
                s f10 = f("![");
                i iVar = this.a;
                ge.b bVar = iVar.i;
                ge.b bVar2 = new ge.b(f10, i10, bVar, iVar.h, true);
                if (bVar != null) {
                    bVar.d = true;
                }
                iVar.i = bVar2;
                return f10;
            default:
                int i11 = this.d;
                this.d = i11 + 1;
                s f11 = f("[");
                i iVar2 = this.a;
                ge.b bVar3 = iVar2.i;
                ge.b bVar4 = new ge.b(f11, i11, bVar3, iVar2.h, false);
                if (bVar3 != null) {
                    bVar3.d = true;
                }
                iVar2.i = bVar4;
                return f11;
        }
    }

    @Override // nc.h
    public final char d() {
        switch (this.e) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
