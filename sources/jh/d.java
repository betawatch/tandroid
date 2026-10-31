package jh;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ef;
import org.telegram.messenger.i0;
import org.telegram.messenger.ic;
import org.telegram.messenger.pz;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d extends ih.f {
    public final ef b;
    public final pz c;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(pz pzVar) {
        ic icVar;
        ic icVar2;
        this.c = pzVar;
        ef efVar = pzVar.y;
        this.b = efVar;
        this.a.J0(i0.L(7.0f));
        ImageReceiver imageReceiver = this.a;
        imageReceiver.G0(0, 0, true);
        String str = efVar.g;
        int i10 = efVar.C;
        String str2 = efVar.I;
        if (str != null) {
            icVar = ic.g(str);
        } else {
            String str3 = efVar.c;
            if (str3 != null) {
                icVar = ic.g(str3);
            } else if (str2 == null) {
                imageReceiver.f();
                icVar = null;
            } else {
                if (!efVar.b || efVar.d()) {
                    ic g10 = ic.g("thumb://" + i10 + ":" + str2);
                    imageReceiver.G0(efVar.J, efVar.K, true);
                    icVar2 = g10;
                    if (icVar2 == null) {
                        imageReceiver.q0(icVar2, null, null, null, null, 0);
                        return;
                    } else {
                        imageReceiver.f();
                        return;
                    }
                }
                icVar = ic.g("vthumb://" + i10 + ":" + str2);
            }
        }
        icVar2 = icVar;
        if (icVar2 == null) {
        }
    }

    @Override // ih.f
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(0.0f, 0.0f, i10, i11);
        imageReceiver.h(canvas, null);
    }
}
