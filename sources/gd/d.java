package gd;

import df.p;
import df.s;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class d extends h {
    public final /* synthetic */ int e;

    @Override // gd.h
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
                af.e eVar = iVar.i;
                af.e eVar2 = new af.e(f7, i10, eVar, iVar.h, true);
                if (eVar != null) {
                    eVar.d = true;
                }
                iVar.i = eVar2;
                return f7;
            default:
                int i11 = this.d;
                this.d = i11 + 1;
                s f10 = f("[");
                i iVar2 = this.a;
                af.e eVar3 = iVar2.i;
                af.e eVar4 = new af.e(f10, i11, eVar3, iVar2.h, false);
                if (eVar3 != null) {
                    eVar3.d = true;
                }
                iVar2.i = eVar4;
                return f10;
        }
    }

    @Override // gd.h
    public final char d() {
        switch (this.e) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
