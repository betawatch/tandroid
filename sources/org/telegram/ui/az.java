package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class az implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ lz b;

    public /* synthetic */ az(lz lzVar, int i10) {
        this.a = i10;
        this.b = lzVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final lz lzVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yy
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                lz lzVar2 = lzVar;
                                lzVar2.E = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.t.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.wc.b0(lzVar2), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                lz.V(lzVar, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final lz lzVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yy
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                lz lzVar22 = lzVar2;
                                lzVar22.E = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.t.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.wc.b0(lzVar22), R.raw.contact_check, 36);
                                    break;
                                }
                                break;
                            default:
                                lz.V(lzVar2, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
