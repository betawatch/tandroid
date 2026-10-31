package li;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.cd;
import org.telegram.messenger.qz;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import rh.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ m0(int i10, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, vh.d dVar, boolean z10, boolean z11, z2[] z2VarArr) {
        this.e = dVar;
        this.f = z2VarArr;
        this.d = i10;
        this.b = z10;
        this.h = starsSubscription;
        this.c = z11;
        this.n = tLObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [long] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ?? r42;
        File file;
        File file2;
        int i10;
        File file3 = null;
        switch (this.a) {
            case 0:
                x0 x0Var = (x0) this.e;
                z zVar = (z) this.f;
                boolean z10 = this.b;
                File file4 = (File) this.h;
                boolean z11 = this.c;
                int i11 = this.d;
                t0 t0Var = (t0) this.n;
                x0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    try {
                        try {
                            zVar.g();
                            p pVar = x0Var.m;
                            ?? sb2 = new StringBuilder("preview output finalized: size=");
                            x0 x0Var2 = x0Var;
                            try {
                                sb2.append(zVar.a.length());
                                sb2.append(", replace=");
                                sb2.append(z10);
                                sb2.append(", elapsedMs=");
                                r42 = x0.f(nanoTime);
                                sb2.append(r42);
                                pVar.b(sb2.toString());
                                x0Var2.g();
                                try {
                                    if (z10) {
                                        synchronized (zVar) {
                                            try {
                                                i10 = zVar.s;
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
                                        x0Var = x0Var2;
                                        x0Var.t(file4, i10, x0Var.J, x0Var.K, z11, i11);
                                        file2 = file4;
                                    } else {
                                        r42 = file4;
                                        File file5 = zVar.a;
                                        long j10 = x0Var2.N;
                                        if (j10 <= 0) {
                                            j10 = x0Var2.H;
                                        }
                                        ExecutorService executorService = x0Var2.k;
                                        x0Var2 = x0Var2;
                                        try {
                                        } catch (Exception e) {
                                            e = e;
                                            x0Var = x0Var2;
                                            x0Var.i.post(new h0(x0Var, e, 0));
                                            if (r42 != 0) {
                                                w7.q.c(r42);
                                            }
                                            if (z10) {
                                                return;
                                            }
                                            file = zVar.a;
                                            w7.q.c(file);
                                            return;
                                        }
                                        try {
                                            x0Var = x0Var2;
                                            executorService.execute(new j0(x0Var2, t0Var, file5, j10, true));
                                            file2 = r42;
                                        } catch (Exception e7) {
                                            e = e7;
                                            x0Var = x0Var2;
                                            x0Var.i.post(new h0(x0Var, e, 0));
                                            if (r42 != 0) {
                                            }
                                            if (z10) {
                                            }
                                        }
                                    }
                                    x0Var.U = null;
                                    if (file2 != null) {
                                        w7.q.c(file2);
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                r42 = file4;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            r42 = file4;
                        }
                        if (z10) {
                            file = zVar.a;
                            w7.q.c(file);
                            return;
                        }
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        file3 = file4;
                        if (file3 != null) {
                            w7.q.c(file3);
                        }
                        if (z10) {
                            w7.q.c(zVar.a);
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            case 1:
                qz qzVar = (qz) this.e;
                boolean z12 = this.b;
                TLRPC.Message message = (TLRPC.Message) this.f;
                ArrayList arrayList = (ArrayList) this.h;
                boolean z13 = this.c;
                ArrayList arrayList2 = (ArrayList) this.n;
                int i12 = this.d;
                qzVar.getClass();
                qzVar.getMessagesController().b0(arrayList, null, null, message.dialog_id, false, z13 ? 1 : 0, false, 0L, null, 0, !z13 && z12, (!z12 || message == null) ? 0 : message.id);
                qzVar.getMessagesController().i5(z12 ? 1 : 0, message.dialog_id, arrayList2);
                qzVar.getMediaDataController().w0(message.dialog_id);
                qzVar.d0(i12);
                qzVar.i0(i12, z13);
                return;
            default:
                vh.d dVar = (vh.d) this.e;
                z2[] z2VarArr = (z2[]) this.f;
                int i13 = this.d;
                boolean z14 = this.b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z15 = this.c;
                TLObject tLObject = (TLObject) this.n;
                dVar.setLoading(false);
                z2 z2Var = z2VarArr[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                }
                e6.y(i13, false).R();
                k2 T = LaunchActivity.T();
                if (T != null) {
                    cc.a0(T).V(Collections.singletonList(tLObject), cd.L0(2131745015, null), org.telegram.messenger.i0.W2((!z14 || TextUtils.isEmpty(starsSubscription.title)) ? (!z15 || TextUtils.isEmpty(starsSubscription.title)) ? cd.a0(null, null, 2131745014, cd.u(starsSubscription.until_date, false)) : cd.a0(null, null, 2131745017, cd.u(starsSubscription.until_date, false), starsSubscription.title) : cd.a0(null, null, 2131745018, cd.u(starsSubscription.until_date, false), starsSubscription.title)), null).k(false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ m0(x0 x0Var, z zVar, boolean z10, File file, boolean z11, int i10, t0 t0Var) {
        this.e = x0Var;
        this.f = zVar;
        this.b = z10;
        this.h = file;
        this.c = z11;
        this.d = i10;
        this.n = t0Var;
    }

    public /* synthetic */ m0(qz qzVar, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = qzVar;
        this.b = z10;
        this.f = message;
        this.h = arrayList;
        this.c = z11;
        this.n = arrayList2;
        this.d = i10;
    }
}
