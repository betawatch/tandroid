package ai;

import android.os.SystemClock;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.wc;
import org.telegram.ui.kr;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b1 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, boolean z10, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.d = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                f1 f1Var = (f1) this.c;
                int[] iArr = (int[]) this.d;
                TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken = (TLRPC.TL_exportedNoPaidMessagesToken) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i10 = f1Var.a;
                t1 t1Var = f1Var.b;
                if (f1Var.n == iArr[0] && !f1Var.E) {
                    f1Var.n = 0;
                    boolean z10 = this.b;
                    if (tL_exportedNoPaidMessagesToken != null) {
                        int i11 = f1Var.d;
                        if (i11 != 0) {
                            if (z10 == (i11 == 1)) {
                                if (tL_exportedNoPaidMessagesToken.expires == 0) {
                                    MessagesController.getMainSettings(i10).edit().putString("qrNoPaidToken", tL_exportedNoPaidMessagesToken.token).putString("qrNoPaidUrl", tL_exportedNoPaidMessagesToken.url).apply();
                                }
                                f1Var.f = tL_exportedNoPaidMessagesToken;
                                f1Var.h = SystemClock.elapsedRealtime();
                                t1Var.setFreeLink(f1Var.d(tL_exportedNoPaidMessagesToken));
                                break;
                            }
                        }
                    } else {
                        String str = tL_error != null ? tL_error.text : null;
                        FileLog.e("QrShare: exportNoPaidMessagesToken " + str);
                        TLRPC.TL_exportedNoPaidMessagesToken tL_exportedNoPaidMessagesToken2 = f1Var.f;
                        if (tL_exportedNoPaidMessagesToken2 != null) {
                            if ((tL_exportedNoPaidMessagesToken2.expires != 0) == z10) {
                                if (str != null) {
                                    t1Var.getClass();
                                    t1Var.d1(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                                    break;
                                }
                            }
                        }
                        f1Var.d = 0;
                        MessagesController.getMainSettings(i10).edit().putBoolean("qrNoPaidPermanent", false).apply();
                        if (!t1Var.v0) {
                            if (str != null) {
                                t1Var.d1(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                                break;
                            }
                        } else {
                            t1Var.U0(str != null ? LocaleController.getString(R.string.ErrorOccurred) : null);
                            break;
                        }
                    }
                }
                break;
            default:
                kr krVar = (kr) this.c;
                v8 v8Var = (v8) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates == null) {
                    krVar.getClass();
                    if (tL_error2 != null) {
                        v8Var.setChecked(this.b);
                        wc.b0(krVar).g0(tL_error2, false);
                        break;
                    }
                } else {
                    krVar.getMessagesController().lambda$processUpdates$379(updates, false);
                    break;
                }
                break;
        }
    }
}
