package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class az implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ lz b;

    public /* synthetic */ az(lz lzVar, int i9) {
        this.a = i9;
        this.b = lzVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 0;
                final lz lzVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.zy
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                lz lzVar2 = lzVar;
                                lzVar2.B = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.l0.p(R.string.FilterInviteNameEdited, org.telegram.ui.Components.oc.a0(lzVar2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                lz.T(lzVar, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final lz lzVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.zy
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                lz lzVar22 = lzVar2;
                                lzVar22.B = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.l0.p(R.string.FilterInviteNameEdited, org.telegram.ui.Components.oc.a0(lzVar22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                lz.T(lzVar2, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
