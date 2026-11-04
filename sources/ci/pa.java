package ci;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.bd;
import org.telegram.messenger.yy;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ pa(int i3, gi.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.t2[] t2VarArr) {
        this.e = dVar;
        this.f = t2VarArr;
        this.d = i3;
        this.b = z10;
        this.h = starsSubscription;
        this.c = z11;
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
        boolean z10;
        String a02;
        ?? r42;
        File file;
        File file2;
        int i3;
        switch (this.a) {
            case 0:
                gi.d dVar = (gi.d) this.e;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) this.f;
                int i10 = this.d;
                boolean z11 = this.b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z12 = this.c;
                TLObject tLObject = (TLObject) this.n;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.t2 t2Var = t2VarArr[0];
                if (t2Var != null) {
                    t2Var.dismiss();
                }
                e9.y(i10, false).R();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    if (z11 && !TextUtils.isEmpty(starsSubscription.title)) {
                        a02 = bd.a0(null, null, 2131745010, bd.u(starsSubscription.until_date, false), starsSubscription.title);
                        z10 = false;
                    } else if (!z12 || TextUtils.isEmpty(starsSubscription.title)) {
                        z10 = false;
                        a02 = bd.a0(null, null, 2131745006, bd.u(starsSubscription.until_date, false));
                    } else {
                        z10 = false;
                        a02 = bd.a0(null, null, 2131745009, bd.u(starsSubscription.until_date, false), starsSubscription.title);
                    }
                    org.telegram.ui.Components.fc.a0(T).V(Collections.singletonList(tLObject), bd.M0(2131745007, null), org.telegram.messenger.g0.X2(a02), null).k(z10);
                    return;
                }
                return;
            case 1:
                yy yyVar = (yy) this.e;
                boolean z13 = this.b;
                TLRPC.Message message = (TLRPC.Message) this.f;
                ArrayList arrayList = (ArrayList) this.h;
                boolean z14 = this.c;
                ArrayList arrayList2 = (ArrayList) this.n;
                int i11 = this.d;
                yyVar.getClass();
                yyVar.getMessagesController().b0(arrayList, null, null, message.dialog_id, false, z14 ? 1 : 0, false, 0L, null, 0, !z14 && z13, (!z13 || message == null) ? 0 : message.id);
                yyVar.getMessagesController().l5(z13 ? 1 : 0, message.dialog_id, arrayList2);
                yyVar.getMediaDataController().w0(message.dialog_id);
                yyVar.d0(i11);
                yyVar.i0(i11, z14);
                return;
            default:
                wi.t0 t0Var = (wi.t0) this.e;
                wi.w wVar = (wi.w) this.f;
                boolean z15 = this.b;
                File file3 = (File) this.h;
                boolean z16 = this.c;
                int i12 = this.d;
                wi.p0 p0Var = (wi.p0) this.n;
                t0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    try {
                        try {
                            wVar.g();
                            wi.n nVar = t0Var.m;
                            ?? sb2 = new StringBuilder("preview output finalized: size=");
                            wi.t0 t0Var2 = t0Var;
                            try {
                                sb2.append(wVar.a.length());
                                sb2.append(", replace=");
                                sb2.append(z15);
                                sb2.append(", elapsedMs=");
                                r42 = wi.t0.f(nanoTime);
                                sb2.append(r42);
                                nVar.b(sb2.toString());
                                t0Var2.g();
                                try {
                                    if (z15) {
                                        synchronized (wVar) {
                                            try {
                                                i3 = wVar.s;
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
                                        t0Var.t(file3, i3, t0Var.J, t0Var.K, z16, i12);
                                        file2 = file3;
                                    } else {
                                        r42 = file3;
                                        File file4 = wVar.a;
                                        long j10 = t0Var2.N;
                                        if (j10 <= 0) {
                                            j10 = t0Var2.H;
                                        }
                                        ExecutorService executorService = t0Var2.k;
                                        t0Var2 = t0Var2;
                                        try {
                                        } catch (Exception e10) {
                                            e = e10;
                                            t0Var = t0Var2;
                                            t0Var.i.post(new wi.d0(t0Var, e, 0));
                                            if (r42 != 0) {
                                                x7.u5.c(r42);
                                            }
                                            if (z15) {
                                                return;
                                            }
                                            file = wVar.a;
                                            x7.u5.c(file);
                                            return;
                                        }
                                        try {
                                            t0Var = t0Var2;
                                            executorService.execute(new wi.f0(t0Var2, p0Var, file4, j10, true));
                                            file2 = r42;
                                        } catch (Exception e11) {
                                            e = e11;
                                            t0Var = t0Var2;
                                            t0Var.i.post(new wi.d0(t0Var, e, 0));
                                            if (r42 != 0) {
                                            }
                                            if (z15) {
                                            }
                                        }
                                    }
                                    t0Var.U = null;
                                    if (file2 != null) {
                                        x7.u5.c(file2);
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
                                x7.u5.c(file3);
                            }
                            if (z15) {
                                x7.u5.c(wVar.a);
                            }
                            throw th;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        r42 = file3;
                    }
                    if (z15) {
                        file = wVar.a;
                        x7.u5.c(file);
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    th = th5;
                }
        }
    }

    public /* synthetic */ pa(yy yyVar, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i3) {
        this.e = yyVar;
        this.b = z10;
        this.f = message;
        this.h = arrayList;
        this.c = z11;
        this.n = arrayList2;
        this.d = i3;
    }

    public /* synthetic */ pa(wi.t0 t0Var, wi.w wVar, boolean z10, File file, boolean z11, int i3, wi.p0 p0Var) {
        this.e = t0Var;
        this.f = wVar;
        this.b = z10;
        this.h = file;
        this.c = z11;
        this.d = i3;
        this.n = p0Var;
    }
}
