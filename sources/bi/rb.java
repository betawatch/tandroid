package bi;

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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class rb implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ rb(int i10, fi.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.k3[] k3VarArr) {
        this.e = dVar;
        this.f = k3VarArr;
        this.d = i10;
        this.b = z10;
        this.h = starsSubscription;
        this.c = z11;
        this.n = tLObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v19, types: [long] */
    /* JADX WARN: Type inference failed for: r2v20 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        String formatString;
        ?? r22;
        File file;
        File file2;
        int i10;
        switch (this.a) {
            case 0:
                fi.d dVar = (fi.d) this.e;
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) this.f;
                int i11 = this.d;
                boolean z11 = this.b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z12 = this.c;
                TLObject tLObject = (TLObject) this.n;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.k3 k3Var = k3VarArr[0];
                if (k3Var != null) {
                    k3Var.dismiss();
                }
                ca.y(i11, false).S();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
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
                    org.telegram.ui.Components.wc.b0(U).W(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags(formatString), null).k(z10);
                    return;
                }
                return;
            case 1:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$98(this.b, (TLRPC.Message) this.f, (ArrayList) this.h, this.c, (ArrayList) this.n, this.d);
                return;
            default:
                vi.u0 u0Var = (vi.u0) this.e;
                vi.w wVar = (vi.w) this.f;
                boolean z13 = this.b;
                File file3 = (File) this.h;
                boolean z14 = this.c;
                int i12 = this.d;
                vi.q0 q0Var = (vi.q0) this.n;
                u0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    try {
                        wVar.g();
                        vi.n nVar = u0Var.m;
                        ?? sb2 = new StringBuilder("preview output finalized: size=");
                        sb2.append(wVar.a.length());
                        sb2.append(", replace=");
                        sb2.append(z13);
                        sb2.append(", elapsedMs=");
                        r22 = vi.u0.f(nanoTime);
                        sb2.append(r22);
                        nVar.b(sb2.toString());
                        u0Var.g();
                        try {
                            if (z13) {
                                synchronized (wVar) {
                                    try {
                                        i10 = wVar.s;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        while (true) {
                                            try {
                                                throw th;
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        }
                                    }
                                }
                                u0Var.t(file3, i10, u0Var.J, u0Var.K, z14, i12);
                                file2 = file3;
                            } else {
                                r22 = file3;
                                File file4 = wVar.a;
                                long j10 = u0Var.N;
                                if (j10 <= 0) {
                                    j10 = u0Var.H;
                                }
                                ExecutorService executorService = u0Var.k;
                                try {
                                    vi.g0 g0Var = new vi.g0(u0Var, q0Var, file4, j10, true);
                                    u0Var = u0Var;
                                    executorService.execute(g0Var);
                                    file2 = r22;
                                } catch (Exception e) {
                                    e = e;
                                    u0Var = u0Var;
                                    u0Var.i.post(new vi.e0(u0Var, e, 0));
                                    if (r22 != 0) {
                                        w7.x.c(r22);
                                    }
                                    if (z13) {
                                        file = wVar.a;
                                        w7.x.c(file);
                                        return;
                                    }
                                    return;
                                }
                            }
                            u0Var.U = null;
                            if (file2 != null) {
                                w7.x.c(file2);
                            }
                        } catch (Exception e10) {
                            e = e10;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (file3 != null) {
                            w7.x.c(file3);
                        }
                        if (z13) {
                            w7.x.c(wVar.a);
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    r22 = file3;
                } catch (Throwable th5) {
                    th = th5;
                    if (file3 != null) {
                    }
                    if (z13) {
                    }
                    throw th;
                }
                if (z13) {
                    file = wVar.a;
                    w7.x.c(file);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ rb(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.b = z10;
        this.f = message;
        this.h = arrayList;
        this.c = z11;
        this.n = arrayList2;
        this.d = i10;
    }

    public /* synthetic */ rb(vi.u0 u0Var, vi.w wVar, boolean z10, File file, boolean z11, int i10, vi.q0 q0Var) {
        this.e = u0Var;
        this.f = wVar;
        this.b = z10;
        this.h = file;
        this.c = z11;
        this.d = i10;
        this.n = q0Var;
    }
}
