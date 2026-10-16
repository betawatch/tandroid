package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class bj implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ bj(int i10, di.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.e = dVar;
        this.f = e3VarArr;
        this.d = i10;
        this.b = z10;
        this.h = starsSubscription;
        this.c = z11;
        this.n = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        File file2;
        switch (this.a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$98(this.b, (TLRPC.Message) this.f, (ArrayList) this.h, this.c, (ArrayList) this.n, this.d);
                return;
            case 1:
                ri.r0 r0Var = (ri.r0) this.e;
                ri.v vVar = (ri.v) this.f;
                boolean z10 = this.b;
                File file3 = (File) this.h;
                boolean z11 = this.c;
                int i10 = this.d;
                ri.n0 n0Var = (ri.n0) this.n;
                r0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    vVar.g();
                    r0Var.m.b("preview output finalized: size=" + vVar.a.length() + ", replace=" + z10 + ", elapsedMs=" + ri.r0.f(nanoTime));
                    r0Var.g();
                    if (z10) {
                        r0Var.s(file3, r0Var.G, r0Var.H, z11, i10);
                        file = file3;
                    } else {
                        file = file3;
                        try {
                            try {
                                File file4 = vVar.a;
                                long j10 = r0Var.K;
                                if (j10 <= 0) {
                                    j10 = r0Var.E;
                                }
                                ExecutorService executorService = r0Var.k;
                                try {
                                    ri.e0 e0Var = new ri.e0(r0Var, n0Var, file4, j10, true);
                                    r0Var = r0Var;
                                    executorService.execute(e0Var);
                                } catch (Exception e) {
                                    e = e;
                                    r0Var = r0Var;
                                    r0Var.i.post(new ri.c0(r0Var, e, 0));
                                    if (file != null) {
                                        w7.m7.c(file);
                                    }
                                    if (z10) {
                                        file2 = vVar.a;
                                        w7.m7.c(file2);
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (file != null) {
                                    w7.m7.c(file);
                                }
                                if (z10) {
                                    w7.m7.c(vVar.a);
                                }
                                throw th;
                            }
                        } catch (Exception e7) {
                            e = e7;
                        }
                    }
                    r0Var.R = null;
                    if (file != null) {
                        w7.m7.c(file);
                    }
                } catch (Exception e10) {
                    e = e10;
                    file = file3;
                } catch (Throwable th3) {
                    th = th3;
                    file = file3;
                }
                if (z10) {
                    file2 = vVar.a;
                    w7.m7.c(file2);
                    return;
                }
                return;
            default:
                di.d dVar = (di.d) this.e;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.f;
                int i11 = this.d;
                boolean z12 = this.b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z13 = this.c;
                TLObject tLObject = (TLObject) this.n;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                zh.n5.y(i11, false).S();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.Components.zc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags((!z12 || TextUtils.isEmpty(starsSubscription.title)) ? (!z13 || TextUtils.isEmpty(starsSubscription.title)) ? LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date)) : LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title) : LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title)), null).k(false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ bj(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.b = z10;
        this.f = message;
        this.h = arrayList;
        this.c = z11;
        this.n = arrayList2;
        this.d = i10;
    }

    public /* synthetic */ bj(ri.r0 r0Var, ri.v vVar, boolean z10, File file, boolean z11, int i10, ri.n0 n0Var) {
        this.e = r0Var;
        this.f = vVar;
        this.b = z10;
        this.h = file;
        this.c = z11;
        this.d = i10;
        this.n = n0Var;
    }
}
