package ki;

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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import yh.u5;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ g0(int i10, ci.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, f3[] f3VarArr) {
        this.e = dVar;
        this.f = f3VarArr;
        this.d = i10;
        this.b = z10;
        this.h = starsSubscription;
        this.c = z11;
        this.n = tLObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0176  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        File file;
        File file2;
        File file3 = null;
        switch (this.a) {
            case 0:
                s0 s0Var = (s0) this.e;
                t tVar = (t) this.f;
                boolean z10 = this.b;
                File file4 = (File) this.h;
                boolean z11 = this.c;
                int i10 = this.d;
                o0 o0Var = (o0) this.n;
                s0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    try {
                        tVar.g();
                        s0Var.m.b("preview output finalized: size=" + tVar.a.length() + ", replace=" + z10 + ", elapsedMs=" + s0.f(nanoTime));
                        s0Var.g();
                        if (z10) {
                            s0Var.s(file4, s0Var.G, s0Var.H, z11, i10);
                            file = file4;
                        } else {
                            file = file4;
                            try {
                                File file5 = tVar.a;
                                long j3 = s0Var.K;
                                if (j3 <= 0) {
                                    j3 = s0Var.E;
                                }
                                ExecutorService executorService = s0Var.k;
                                try {
                                    f0 f0Var = new f0(s0Var, o0Var, file5, j3, true);
                                    s0Var = s0Var;
                                    executorService.execute(f0Var);
                                } catch (Exception e7) {
                                    e = e7;
                                    s0Var = s0Var;
                                    s0Var.i.post(new c0(s0Var, e, 0));
                                    if (file != null) {
                                        w7.k.c(file);
                                    }
                                    if (z10) {
                                        file2 = tVar.a;
                                        w7.k.c(file2);
                                        return;
                                    }
                                    return;
                                }
                            } catch (Exception e10) {
                                e = e10;
                            }
                        }
                        s0Var.R = null;
                        if (file != null) {
                            w7.k.c(file);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (file3 != null) {
                            w7.k.c(file3);
                        }
                        if (z10) {
                            w7.k.c(tVar.a);
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    file = file4;
                } catch (Throwable th3) {
                    th = th3;
                    file3 = file4;
                    if (file3 != null) {
                    }
                    if (z10) {
                    }
                    throw th;
                }
                if (z10) {
                    file2 = tVar.a;
                    w7.k.c(file2);
                    return;
                }
                return;
            case 1:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$95(this.b, (TLRPC.Message) this.f, (ArrayList) this.h, this.c, (ArrayList) this.n, this.d);
                return;
            default:
                ci.d dVar = (ci.d) this.e;
                f3[] f3VarArr = (f3[]) this.f;
                int i11 = this.d;
                boolean z12 = this.b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z13 = this.c;
                TLObject tLObject = (TLObject) this.n;
                dVar.setLoading(false);
                f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                u5.y(i11, false).S();
                n2 U = LaunchActivity.U();
                if (U != null) {
                    yc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags((!z12 || TextUtils.isEmpty(starsSubscription.title)) ? (!z13 || TextUtils.isEmpty(starsSubscription.title)) ? LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date)) : LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title) : LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title)), null).k(false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g0(s0 s0Var, t tVar, boolean z10, File file, boolean z11, int i10, o0 o0Var) {
        this.e = s0Var;
        this.f = tVar;
        this.b = z10;
        this.h = file;
        this.c = z11;
        this.d = i10;
        this.n = o0Var;
    }

    public /* synthetic */ g0(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.b = z10;
        this.f = message;
        this.h = arrayList;
        this.c = z11;
        this.n = arrayList2;
        this.d = i10;
    }
}
