package ai;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class xb implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ xb(int i10, ei.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.e = dVar;
        this.f = h3VarArr;
        this.d = i10;
        this.b = z10;
        this.h = starsSubscription;
        this.c = z11;
        this.n = tLObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        String formatString;
        File file;
        File file2;
        switch (this.a) {
            case 0:
                ei.d dVar = (ei.d) this.e;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.f;
                int i10 = this.d;
                boolean z11 = this.b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z12 = this.c;
                TLObject tLObject = (TLObject) this.n;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.h3 h3Var = h3VarArr[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                }
                ha.y(i10, false).S();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    if (z11 && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                        z10 = false;
                    } else if (!z12 || TextUtils.isEmpty(starsSubscription.title)) {
                        z10 = false;
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date));
                    } else {
                        z10 = false;
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    }
                    org.telegram.ui.Components.xc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags(formatString), null).k(z10);
                    return;
                }
                return;
            case 1:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$98(this.b, (TLRPC.Message) this.f, (ArrayList) this.h, this.c, (ArrayList) this.n, this.d);
                return;
            default:
                si.u0 u0Var = (si.u0) this.e;
                si.w wVar = (si.w) this.f;
                boolean z13 = this.b;
                File file3 = (File) this.h;
                boolean z14 = this.c;
                int i11 = this.d;
                si.q0 q0Var = (si.q0) this.n;
                u0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    wVar.g();
                    u0Var.m.b("preview output finalized: size=" + wVar.a.length() + ", replace=" + z13 + ", elapsedMs=" + si.u0.f(nanoTime));
                    u0Var.g();
                    if (z13) {
                        u0Var.s(file3, u0Var.G, u0Var.H, z14, i11);
                        file = file3;
                    } else {
                        file = file3;
                        try {
                            try {
                                File file4 = wVar.a;
                                long j10 = u0Var.K;
                                if (j10 <= 0) {
                                    j10 = u0Var.E;
                                }
                                ExecutorService executorService = u0Var.k;
                                try {
                                    si.g0 g0Var = new si.g0(u0Var, q0Var, file4, j10, true);
                                    u0Var = u0Var;
                                    executorService.execute(g0Var);
                                } catch (Exception e) {
                                    e = e;
                                    u0Var = u0Var;
                                    u0Var.i.post(new si.e0(u0Var, e, 0));
                                    if (file != null) {
                                        w7.m7.c(file);
                                    }
                                    if (z13) {
                                        file2 = wVar.a;
                                        w7.m7.c(file2);
                                        return;
                                    }
                                    return;
                                }
                            } catch (Exception e7) {
                                e = e7;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (file != null) {
                                w7.m7.c(file);
                            }
                            if (z13) {
                                w7.m7.c(wVar.a);
                            }
                            throw th;
                        }
                    }
                    u0Var.R = null;
                    if (file != null) {
                        w7.m7.c(file);
                    }
                } catch (Exception e10) {
                    e = e10;
                    file = file3;
                } catch (Throwable th3) {
                    th = th3;
                    file = file3;
                    if (file != null) {
                    }
                    if (z13) {
                    }
                    throw th;
                }
                if (z13) {
                    file2 = wVar.a;
                    w7.m7.c(file2);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ xb(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.b = z10;
        this.f = message;
        this.h = arrayList;
        this.c = z11;
        this.n = arrayList2;
        this.d = i10;
    }

    public /* synthetic */ xb(si.u0 u0Var, si.w wVar, boolean z10, File file, boolean z11, int i10, si.q0 q0Var) {
        this.e = u0Var;
        this.f = wVar;
        this.b = z10;
        this.h = file;
        this.c = z11;
        this.d = i10;
        this.n = q0Var;
    }
}
