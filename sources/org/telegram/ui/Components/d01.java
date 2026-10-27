package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d01 extends kb1 {
    public final /* synthetic */ int c;

    public /* synthetic */ d01(int i10) {
        this.c = i10;
    }

    @Override // org.telegram.ui.Components.kb1
    public final int F(k01 k01Var, int i10) {
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

    @Override // org.telegram.ui.Components.kb1
    public i01 G() {
        switch (this.c) {
            case 3:
                return new e01();
            default:
                return super.G();
        }
    }

    @Override // org.telegram.ui.Components.kb1
    public final int H(k01 k01Var, int i10) {
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

    @Override // org.telegram.ui.Components.kb1
    public int J(int i10, int i11) {
        switch (this.c) {
            case 4:
                return i11;
            default:
                return i10;
        }
    }
}
