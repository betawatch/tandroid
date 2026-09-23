package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class oz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ zz b;

    public /* synthetic */ oz(zz zzVar, int i10) {
        this.a = i10;
        this.b = zzVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final zz zzVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.nz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                zz zzVar2 = zzVar;
                                zzVar2.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.z0.o(R.string.FilterInviteNameEdited, org.telegram.ui.Components.xc.a0(zzVar2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                zz.U(zzVar, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final zz zzVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.nz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                zz zzVar22 = zzVar2;
                                zzVar22.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.z0.o(R.string.FilterInviteNameEdited, org.telegram.ui.Components.xc.a0(zzVar22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                zz.U(zzVar2, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
