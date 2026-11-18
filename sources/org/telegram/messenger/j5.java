package org.telegram.messenger;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class j5 implements fs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.fs
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
                qz qzVar = (qz) this.b;
                if (i7 == 256) {
                    g0.g3(new xr(qzVar, 15));
                    break;
                }
                break;
        }
    }
}
