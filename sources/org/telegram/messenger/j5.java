package org.telegram.messenger;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j5 implements gs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
        switch (this.a) {
            case 0:
                fi.y3 y3Var = (fi.y3) this.b;
                if (i7 == 25) {
                    y3Var.d(false);
                    break;
                }
                break;
            default:
                rz rzVar = (rz) this.b;
                if (i7 == 256) {
                    g0.g3(new yr(rzVar, 15));
                    break;
                }
                break;
        }
    }
}
