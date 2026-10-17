package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iq implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Object d;

    public /* synthetic */ iq(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.d = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                jr jrVar = (jr) this.c;
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates == null) {
                    jrVar.getClass();
                    if (tL_error != null) {
                        q8Var.setChecked(this.b);
                        org.telegram.ui.Components.xc.a0(jrVar).f0(tL_error, false);
                        break;
                    }
                } else {
                    jrVar.getMessagesController().lambda$processUpdates$377(updates, false);
                    break;
                }
                break;
            default:
                zh.p0 p0Var = (zh.p0) this.c;
                int[] iArr = (int[]) this.d;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i10 = p0Var.a;
                zh.b1 b1Var = p0Var.b;
                if (p0Var.n == iArr[0] && !p0Var.E) {
                    p0Var.n = 0;
                    boolean z10 = this.b;
                    if (tL_exportedNoPaidMessagesToken != null) {
                        int i11 = p0Var.d;
                        if (i11 != 0) {
                            if (z10 == (i11 == 1)) {
                                if (tL_exportedNoPaidMessagesToken.expires == 0) {
                                    MessagesController.getMainSettings(i10).edit().putString("qrNoPaidToken", tL_exportedNoPaidMessagesToken.token).putString("qrNoPaidUrl", tL_exportedNoPaidMessagesToken.url).apply();
                                }
                                p0Var.f = tL_exportedNoPaidMessagesToken;
                                p0Var.h = SystemClock.elapsedRealtime();
                                b1Var.setFreeLink(p0Var.c(tL_exportedNoPaidMessagesToken));
                                break;
                            }
                        }
                    } else {
                        String str = tL_error2 != null ? tL_error2.text : null;
                        FileLog.e("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = p0Var.f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if ((tL_exportedNoPaidMessagesToken2.expires != 0) == z10) {
                                if (str != null) {
                                    b1Var.getClass();
                                    b1Var.W0(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                                    break;
                                }
                            }
                        }
                        p0Var.d = 0;
                        MessagesController.getMainSettings(i10).edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (!b1Var.v0) {
                            if (str != null) {
                                b1Var.W0(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                                break;
                            }
                        } else {
                            b1Var.N0(str != null ? LocaleController.getString(R.string.ErrorOccurred) : null);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
