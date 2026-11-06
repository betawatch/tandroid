package bi;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.gz;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ sb(int i7, fi.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z9, boolean z10, org.telegram.ui.ActionBar.v2[] v2VarArr) {
        this.e = dVar;
        this.f = v2VarArr;
        this.d = i7;
        this.b = z9;
        this.h = starsSubscription;
        this.c = z10;
        this.n = tLObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v20, types: [long] */
    /* JADX WARN: Type inference failed for: r4v21 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z9;
        String a02;
        ?? r42;
        File file;
        File file2;
        int i7;
        switch (this.a) {
            case 0:
                fi.d dVar = (fi.d) this.e;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) this.f;
                int i10 = this.d;
                boolean z10 = this.b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z11 = this.c;
                TLObject tLObject = (TLObject) this.n;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.v2 v2Var = v2VarArr[0];
                if (v2Var != null) {
                    v2Var.dismiss();
                }
                ea.y(i10, false).R();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    if (z10 && !TextUtils.isEmpty(starsSubscription.title)) {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131745001, org.telegram.messenger.hd.u(starsSubscription.until_date, false), starsSubscription.title);
                        z9 = false;
                    } else if (!z11 || TextUtils.isEmpty(starsSubscription.title)) {
                        z9 = false;
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131744997, org.telegram.messenger.hd.u(starsSubscription.until_date, false));
                    } else {
                        z9 = false;
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131745000, org.telegram.messenger.hd.u(starsSubscription.until_date, false), starsSubscription.title);
                    }
                    org.telegram.ui.Components.hc.a0(T).V(Collections.singletonList(tLObject), org.telegram.messenger.hd.M0(2131744998, null), org.telegram.messenger.g0.X2(a02), null).k(z9);
                    return;
                }
                return;
            case 1:
                gz gzVar = (gz) this.e;
                boolean z12 = this.b;
                TLRPC.Message message = (TLRPC.Message) this.f;
                ArrayList arrayList = (ArrayList) this.h;
                boolean z13 = this.c;
                ArrayList arrayList2 = (ArrayList) this.n;
                int i11 = this.d;
                gzVar.getClass();
                gzVar.getMessagesController().b0(arrayList, null, null, message.dialog_id, false, z13 ? 1 : 0, false, 0L, null, 0, !z13 && z12, (!z12 || message == null) ? 0 : message.id);
                gzVar.getMessagesController().l5(z12 ? 1 : 0, message.dialog_id, arrayList2);
                gzVar.getMediaDataController().w0(message.dialog_id);
                gzVar.d0(i11);
                gzVar.i0(i11, z13);
                return;
            default:
                wi.t0 t0Var = (wi.t0) this.e;
                wi.x xVar = (wi.x) this.f;
                boolean z14 = this.b;
                File file3 = (File) this.h;
                boolean z15 = this.c;
                int i12 = this.d;
                wi.p0 p0Var = (wi.p0) this.n;
                t0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    try {
                        try {
                            xVar.g();
                            wi.n nVar = t0Var.m;
                            ?? sb2 = new StringBuilder("preview output finalized: size=");
                            wi.t0 t0Var2 = t0Var;
                            try {
                                sb2.append(xVar.a.length());
                                sb2.append(", replace=");
                                sb2.append(z14);
                                sb2.append(", elapsedMs=");
                                r42 = wi.t0.f(nanoTime);
                                sb2.append(r42);
                                nVar.b(sb2.toString());
                                t0Var2.g();
                                try {
                                    if (z14) {
                                        synchronized (xVar) {
                                            try {
                                                i7 = xVar.s;
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
                                        t0Var = t0Var2;
                                        t0Var.t(file3, i7, t0Var.J, t0Var.K, z15, i12);
                                        file2 = file3;
                                    } else {
                                        r42 = file3;
                                        File file4 = xVar.a;
                                        long j3 = t0Var2.N;
                                        if (j3 <= 0) {
                                            j3 = t0Var2.H;
                                        }
                                        ExecutorService executorService = t0Var2.k;
                                        t0Var2 = t0Var2;
                                        try {
                                        } catch (Exception e10) {
                                            e = e10;
                                            t0Var = t0Var2;
                                            t0Var.i.post(new wi.e0(t0Var, e, 0));
                                            if (r42 != 0) {
                                                c8.jd.c(r42);
                                            }
                                            if (z14) {
                                                return;
                                            }
                                            file = xVar.a;
                                            c8.jd.c(file);
                                            return;
                                        }
                                        try {
                                            t0Var = t0Var2;
                                            executorService.execute(new wi.g0(t0Var2, p0Var, file4, j3, true));
                                            file2 = r42;
                                        } catch (Exception e11) {
                                            e = e11;
                                            t0Var = t0Var2;
                                            t0Var.i.post(new wi.e0(t0Var, e, 0));
                                            if (r42 != 0) {
                                            }
                                            if (z14) {
                                            }
                                        }
                                    }
                                    t0Var.U = null;
                                    if (file2 != null) {
                                        c8.jd.c(file2);
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                }
                            } catch (Exception e13) {
                                e = e13;
                                r42 = file3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            if (file3 != null) {
                                c8.jd.c(file3);
                            }
                            if (z14) {
                                c8.jd.c(xVar.a);
                            }
                            throw th;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        r42 = file3;
                    }
                    if (z14) {
                        file = xVar.a;
                        c8.jd.c(file);
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    th = th5;
                }
        }
    }

    public /* synthetic */ sb(gz gzVar, boolean z9, TLRPC.Message message, ArrayList arrayList, boolean z10, ArrayList arrayList2, int i7) {
        this.e = gzVar;
        this.b = z9;
        this.f = message;
        this.h = arrayList;
        this.c = z10;
        this.n = arrayList2;
        this.d = i7;
    }

    public /* synthetic */ sb(wi.t0 t0Var, wi.x xVar, boolean z9, File file, boolean z10, int i7, wi.p0 p0Var) {
        this.e = t0Var;
        this.f = xVar;
        this.b = z9;
        this.h = file;
        this.c = z10;
        this.d = i7;
        this.n = p0Var;
    }
}
