package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                zh.i0 i0Var = (zh.i0) this.c;
                int[] iArr = (int[]) this.d;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i10 = i0Var.a;
                zh.t0 t0Var = i0Var.b;
                if (i0Var.n == iArr[0] && !i0Var.E) {
                    i0Var.n = 0;
                    boolean z10 = this.b;
                    if (tL_exportedNoPaidMessagesToken != null) {
                        int i11 = i0Var.d;
                        if (i11 != 0) {
                            if (z10 == (i11 == 1)) {
                                if (tL_exportedNoPaidMessagesToken.expires == 0) {
                                    MessagesController.getMainSettings(i10).edit().putString("qrNoPaidToken", tL_exportedNoPaidMessagesToken.token).putString("qrNoPaidUrl", tL_exportedNoPaidMessagesToken.url).apply();
                                }
                                i0Var.f = tL_exportedNoPaidMessagesToken;
                                i0Var.h = SystemClock.elapsedRealtime();
                                t0Var.setFreeLink(i0Var.c(tL_exportedNoPaidMessagesToken));
                                break;
                            }
                        }
                    } else {
                        String str = tL_error2 != null ? tL_error2.text : null;
                        FileLog.e("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = i0Var.f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if ((tL_exportedNoPaidMessagesToken2.expires != 0) == z10) {
                                if (str != null) {
                                    t0Var.getClass();
                                    t0Var.c1(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                                    break;
                                }
                            }
                        }
                        i0Var.d = 0;
                        MessagesController.getMainSettings(i10).edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (!t0Var.v0) {
                            if (str != null) {
                                t0Var.c1(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                                break;
                            }
                        } else {
                            t0Var.T0(str != null ? LocaleController.getString(R.string.ErrorOccurred) : null);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
