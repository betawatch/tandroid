package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class c01 extends gb1 {
    public final /* synthetic */ int c;

    public /* synthetic */ c01(int i10) {
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.gb1
    public final int F(j01 j01Var, int i10) {
        switch (this.c) {
            case 0:
                return TLObject.FLAG_31;
            case 1:
                return 0;
            case 2:
                return i10;
            case 3:
                return TLObject.FLAG_31;
            default:
                return TLObject.FLAG_31;
        }
    }

    @Override // org.telegram.ui.Components.gb1
    public h01 G() {
        switch (this.c) {
            case 3:
                return new d01();
            default:
                return super.G();
        }
    }

    @Override // org.telegram.ui.Components.gb1
    public final int H(j01 j01Var, int i10) {
        switch (this.c) {
            case 0:
                return TLObject.FLAG_31;
            case 1:
                return 0;
            case 2:
                return i10;
            case 3:
                return 0;
            default:
                return 0;
        }
    }

    @Override // org.telegram.ui.Components.gb1
    public int J(int i10, int i11) {
        switch (this.c) {
            case 4:
                return i11;
            default:
                return i10;
        }
    }
}
