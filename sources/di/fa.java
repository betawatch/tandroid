package di;

import android.text.TextUtils;
import c8.le;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.ez;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class fa implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ fa(int i7, hi.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.u2[] u2VarArr) {
        this.e = dVar;
        this.f = u2VarArr;
        this.d = i7;
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
        int i7;
        switch (this.a) {
            case 0:
                hi.d dVar = (hi.d) this.e;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) this.f;
                int i10 = this.d;
                boolean z11 = this.b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z12 = this.c;
                TLObject tLObject = (TLObject) this.n;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.u2 u2Var = u2VarArr[0];
                if (u2Var != null) {
                    u2Var.dismiss();
                }
                v8.y(i10, false).R();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    if (z11 && !TextUtils.isEmpty(starsSubscription.title)) {
                        a02 = hd.a0(null, null, 2131745000, hd.u(starsSubscription.until_date, false), starsSubscription.title);
                        z10 = false;
                    } else if (!z12 || TextUtils.isEmpty(starsSubscription.title)) {
                        z10 = false;
                        a02 = hd.a0(null, null, 2131744996, hd.u(starsSubscription.until_date, false));
                    } else {
                        z10 = false;
                        a02 = hd.a0(null, null, 2131744999, hd.u(starsSubscription.until_date, false), starsSubscription.title);
                    }
                    org.telegram.ui.Components.cc.a0(T).V(Collections.singletonList(tLObject), hd.M0(2131744997, null), org.telegram.messenger.g0.X2(a02), null).k(z10);
                    return;
                }
                return;
            case 1:
                ez ezVar = (ez) this.e;
                boolean z13 = this.b;
                TLRPC.Message message = (TLRPC.Message) this.f;
                ArrayList arrayList = (ArrayList) this.h;
                boolean z14 = this.c;
                ArrayList arrayList2 = (ArrayList) this.n;
                int i11 = this.d;
                ezVar.getClass();
                ezVar.getMessagesController().b0(arrayList, null, null, message.dialog_id, false, z14 ? 1 : 0, false, 0L, null, 0, !z14 && z13, (!z13 || message == null) ? 0 : message.id);
                ezVar.getMessagesController().m5(z13 ? 1 : 0, message.dialog_id, arrayList2);
                ezVar.getMediaDataController().w0(message.dialog_id);
                ezVar.d0(i11);
                ezVar.i0(i11, z14);
                return;
            default:
                zi.v0 v0Var = (zi.v0) this.e;
                zi.y yVar = (zi.y) this.f;
                boolean z15 = this.b;
                File file3 = (File) this.h;
                boolean z16 = this.c;
                int i12 = this.d;
                zi.r0 r0Var = (zi.r0) this.n;
                v0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    try {
                        try {
                            yVar.g();
                            zi.p pVar = v0Var.m;
                            ?? sb2 = new StringBuilder("preview output finalized: size=");
                            zi.v0 v0Var2 = v0Var;
                            try {
                                sb2.append(yVar.a.length());
                                sb2.append(", replace=");
                                sb2.append(z15);
                                sb2.append(", elapsedMs=");
                                r42 = zi.v0.f(nanoTime);
                                sb2.append(r42);
                                pVar.b(sb2.toString());
                                v0Var2.g();
                                try {
                                    if (z15) {
                                        synchronized (yVar) {
                                            try {
                                                i7 = yVar.s;
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
                                        v0Var = v0Var2;
                                        v0Var.u(file3, i7, v0Var.K, v0Var.L, z16, i12);
                                        file2 = file3;
                                    } else {
                                        r42 = file3;
                                        File file4 = yVar.a;
                                        long j3 = v0Var2.O;
                                        if (j3 <= 0) {
                                            j3 = v0Var2.I;
                                        }
                                        ExecutorService executorService = v0Var2.k;
                                        v0Var2 = v0Var2;
                                        try {
                                        } catch (Exception e10) {
                                            e = e10;
                                            v0Var = v0Var2;
                                            v0Var.i.post(new zi.f0(v0Var, e, 0));
                                            if (r42 != 0) {
                                                le.c(r42);
                                            }
                                            if (z15) {
                                                return;
                                            }
                                            file = yVar.a;
                                            le.c(file);
                                            return;
                                        }
                                        try {
                                            v0Var = v0Var2;
                                            executorService.execute(new zi.h0(v0Var2, r0Var, file4, j3, true));
                                            file2 = r42;
                                        } catch (Exception e11) {
                                            e = e11;
                                            v0Var = v0Var2;
                                            v0Var.i.post(new zi.f0(v0Var, e, 0));
                                            if (r42 != 0) {
                                            }
                                            if (z15) {
                                            }
                                        }
                                    }
                                    v0Var.V = null;
                                    if (file2 != null) {
                                        le.c(file2);
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
                                le.c(file3);
                            }
                            if (z15) {
                                le.c(yVar.a);
                            }
                            throw th;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        r42 = file3;
                    }
                    if (z15) {
                        file = yVar.a;
                        le.c(file);
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    th = th5;
                }
        }
    }

    public /* synthetic */ fa(ez ezVar, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i7) {
        this.e = ezVar;
        this.b = z10;
        this.f = message;
        this.h = arrayList;
        this.c = z11;
        this.n = arrayList2;
        this.d = i7;
    }

    public /* synthetic */ fa(zi.v0 v0Var, zi.y yVar, boolean z10, File file, boolean z11, int i7, zi.r0 r0Var) {
        this.e = v0Var;
        this.f = yVar;
        this.b = z10;
        this.h = file;
        this.c = z11;
        this.d = i7;
        this.n = r0Var;
    }
}
