package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o50;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;

    public /* synthetic */ k0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9, boolean z10, int i10) {
        this.a = i10;
        this.d = notificationCenterDelegate;
        this.b = i9;
        this.c = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((VoIPService) this.d).lambda$startGroupCall$29(this.b, this.c, tLObject, tL_error);
                break;
            default:
                o50 o50Var = (o50) this.d;
                AndroidUtilities.runOnUIThread(new j0(this.b, 6, o50Var, tLObject, this.c));
                break;
        }
    }
}
