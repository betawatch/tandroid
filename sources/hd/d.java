package hd;

import ef.p;
import ef.s;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class d extends h {
    public final /* synthetic */ int e;

    @Override // hd.h
    public final p b() {
        switch (this.e) {
            case 0:
                int i10 = this.d + 1;
                this.d = i10;
                if (c() != '[') {
                    return null;
                }
                this.d++;
                s f7 = f("![");
                i iVar = this.a;
                bf.d dVar = iVar.i;
                bf.d dVar2 = new bf.d(f7, i10, dVar, iVar.h, true);
                if (dVar != null) {
                    dVar.d = true;
                }
                iVar.i = dVar2;
                return f7;
            default:
                int i11 = this.d;
                this.d = i11 + 1;
                s f10 = f("[");
                i iVar2 = this.a;
                bf.d dVar3 = iVar2.i;
                bf.d dVar4 = new bf.d(f10, i11, dVar3, iVar2.h, false);
                if (dVar3 != null) {
                    dVar3.d = true;
                }
                iVar2.i = dVar4;
                return f10;
        }
    }

    @Override // hd.h
    public final char d() {
        switch (this.e) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
