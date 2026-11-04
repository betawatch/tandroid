package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class h5 implements cs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h5(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object[] objArr) {
        switch (this.a) {
            case 0:
                ei.i4 i4Var = (ei.i4) this.b;
                if (i3 == 25) {
                    i4Var.d(false);
                    break;
                }
                break;
            default:
                oz ozVar = (oz) this.b;
                if (i3 == 253) {
                    g0.h3(new vs(ozVar, 15));
                    break;
                }
                break;
        }
    }
}
