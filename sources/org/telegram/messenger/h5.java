package org.telegram.messenger;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class h5 implements ls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.a) {
            case 0:
                di.i4 i4Var = (di.i4) this.b;
                if (i7 == 25) {
                    i4Var.d(false);
                    break;
                }
                break;
            default:
                wz wzVar = (wz) this.b;
                if (i7 == 253) {
                    g0.h3(new ds(wzVar, 15));
                    break;
                }
                break;
        }
    }
}
