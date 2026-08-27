package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ oz b;

    public /* synthetic */ dz(oz ozVar, int i10) {
        this.a = i10;
        this.b = ozVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final oz ozVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                oz ozVar2 = ozVar;
                                ozVar2.B = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.y1.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.mc.a0(ozVar2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                oz.U(ozVar, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final oz ozVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cz
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                oz ozVar22 = ozVar2;
                                ozVar22.B = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.y1.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.mc.a0(ozVar22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                oz.U(ozVar2, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
