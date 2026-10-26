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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                fi.d dVar = (fi.d) this.e;
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) this.f;
                int i10 = this.d;
                boolean z11 = this.b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z12 = this.c;
                TLObject tLObject = (TLObject) this.n;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.k3 k3Var = k3VarArr[0];
                if (k3Var != null) {
                    k3Var.dismiss();
                }
                ca.y(i10, false).S();
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
                vi.s0 s0Var = (vi.s0) this.e;
                vi.v vVar = (vi.v) this.f;
                boolean z13 = this.b;
                File file3 = (File) this.h;
                boolean z14 = this.c;
                int i11 = this.d;
                vi.o0 o0Var = (vi.o0) this.n;
                s0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    vVar.g();
                    s0Var.m.b("preview output finalized: size=" + vVar.a.length() + ", replace=" + z13 + ", elapsedMs=" + vi.s0.f(nanoTime));
                    s0Var.g();
                    if (z13) {
                        s0Var.s(file3, s0Var.G, s0Var.H, z14, i11);
                        file = file3;
                    } else {
                        file = file3;
                        try {
                            try {
                                File file4 = vVar.a;
                                long j10 = s0Var.K;
                                if (j10 <= 0) {
                                    j10 = s0Var.E;
                                }
                                ExecutorService executorService = s0Var.k;
                                try {
                                    vi.f0 f0Var = new vi.f0(s0Var, o0Var, file4, j10, true);
                                    s0Var = s0Var;
                                    executorService.execute(f0Var);
                                } catch (Exception e) {
                                    e = e;
                                    s0Var = s0Var;
                                    s0Var.i.post(new vi.d0(s0Var, e, 0));
                                    if (file != null) {
                                        w7.x.c(file);
                                    }
                                    if (z13) {
                                        file2 = vVar.a;
                                        w7.x.c(file2);
                                        return;
                                    }
                                    return;
                                }
                            } catch (Exception e10) {
                                e = e10;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (file != null) {
                                w7.x.c(file);
                            }
                            if (z13) {
                                w7.x.c(vVar.a);
                            }
                            throw th;
                        }
                    }
                    s0Var.R = null;
                    if (file != null) {
                        w7.x.c(file);
                    }
                } catch (Exception e11) {
                    e = e11;
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
                    file2 = vVar.a;
                    w7.x.c(file2);
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

    public /* synthetic */ rb(vi.s0 s0Var, vi.v vVar, boolean z10, File file, boolean z11, int i10, vi.o0 o0Var) {
        this.e = s0Var;
        this.f = vVar;
        this.b = z10;
        this.h = file;
        this.c = z11;
        this.d = i10;
        this.n = o0Var;
    }
}
