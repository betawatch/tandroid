package ed;

import bf.p;
import bf.s;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class d extends h {
    public final /* synthetic */ int e;

    @Override // ed.h
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
                f6.f fVar = iVar.i;
                f6.f fVar2 = new f6.f(f7, i10, fVar, iVar.h, true);
                if (fVar != null) {
                    fVar.d = true;
                }
                iVar.i = fVar2;
                return f7;
            default:
                int i11 = this.d;
                this.d = i11 + 1;
                s f10 = f("[");
                i iVar2 = this.a;
                f6.f fVar3 = iVar2.i;
                f6.f fVar4 = new f6.f(f10, i11, fVar3, iVar2.h, false);
                if (fVar3 != null) {
                    fVar3.d = true;
                }
                iVar2.i = fVar4;
                return f10;
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
