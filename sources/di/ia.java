package di;

import android.text.TextUtils;
import c8.oe;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.gd;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ia implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ia(int i7, hi.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.x2[] x2VarArr) {
        this.e = dVar;
        this.f = x2VarArr;
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
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) this.f;
                int i10 = this.d;
                boolean z11 = this.b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z12 = this.c;
                TLObject tLObject = (TLObject) this.n;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.x2 x2Var = x2VarArr[0];
                if (x2Var != null) {
                    x2Var.dismiss();
                }
                x8.y(i10, false).Q();
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    if (z11 && !TextUtils.isEmpty(starsSubscription.title)) {
                        a02 = gd.a0(null, null, 2131744765, gd.u(starsSubscription.until_date, false), starsSubscription.title);
                        z10 = false;
                    } else if (!z12 || TextUtils.isEmpty(starsSubscription.title)) {
                        z10 = false;
                        a02 = gd.a0(null, null, 2131744761, gd.u(starsSubscription.until_date, false));
                    } else {
                        z10 = false;
                        a02 = gd.a0(null, null, 2131744764, gd.u(starsSubscription.until_date, false), starsSubscription.title);
                    }
                    org.telegram.ui.Components.lc.b0(T).V(Collections.singletonList(tLObject), gd.M0(2131744762, null), org.telegram.messenger.g0.W2(a02), null).k(z10);
                    return;
                }
                return;
            case 1:
                zy zyVar = (zy) this.e;
                boolean z13 = this.b;
                TLRPC.Message message = (TLRPC.Message) this.f;
                ArrayList arrayList = (ArrayList) this.h;
                boolean z14 = this.c;
                ArrayList arrayList2 = (ArrayList) this.n;
                int i11 = this.d;
                zyVar.getClass();
                zyVar.getMessagesController().b0(arrayList, null, null, message.dialog_id, false, z14 ? 1 : 0, false, 0L, null, 0, !z14 && z13, (!z13 || message == null) ? 0 : message.id);
                zyVar.getMessagesController().x5(z13 ? 1 : 0, message.dialog_id, arrayList2);
                zyVar.getMediaDataController().y0(message.dialog_id);
                zyVar.d0(i11);
                zyVar.i0(i11, z14);
                return;
            default:
                zi.u0 u0Var = (zi.u0) this.e;
                zi.x xVar = (zi.x) this.f;
                boolean z15 = this.b;
                File file3 = (File) this.h;
                boolean z16 = this.c;
                int i12 = this.d;
                zi.q0 q0Var = (zi.q0) this.n;
                u0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    try {
                        try {
                            xVar.g();
                            zi.o oVar = u0Var.m;
                            ?? sb2 = new StringBuilder("preview output finalized: size=");
                            zi.u0 u0Var2 = u0Var;
                            try {
                                sb2.append(xVar.a.length());
                                sb2.append(", replace=");
                                sb2.append(z15);
                                sb2.append(", elapsedMs=");
                                r42 = zi.u0.f(nanoTime);
                                sb2.append(r42);
                                oVar.b(sb2.toString());
                                u0Var2.g();
                                try {
                                    if (z15) {
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
                                        u0Var = u0Var2;
                                        u0Var.u(file3, i7, u0Var.K, u0Var.L, z16, i12);
                                        file2 = file3;
                                    } else {
                                        r42 = file3;
                                        File file4 = xVar.a;
                                        long j3 = u0Var2.O;
                                        if (j3 <= 0) {
                                            j3 = u0Var2.I;
                                        }
                                        ExecutorService executorService = u0Var2.k;
                                        u0Var2 = u0Var2;
                                        try {
                                        } catch (Exception e10) {
                                            e = e10;
                                            u0Var = u0Var2;
                                            u0Var.i.post(new zi.e0(u0Var, e, 0));
                                            if (r42 != 0) {
                                                oe.c(r42);
                                            }
                                            if (z15) {
                                                return;
                                            }
                                            file = xVar.a;
                                            oe.c(file);
                                            return;
                                        }
                                        try {
                                            u0Var = u0Var2;
                                            executorService.execute(new zi.g0(u0Var2, q0Var, file4, j3, true));
                                            file2 = r42;
                                        } catch (Exception e11) {
                                            e = e11;
                                            u0Var = u0Var2;
                                            u0Var.i.post(new zi.e0(u0Var, e, 0));
                                            if (r42 != 0) {
                                            }
                                            if (z15) {
                                            }
                                        }
                                    }
                                    u0Var.V = null;
                                    if (file2 != null) {
                                        oe.c(file2);
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
                                oe.c(file3);
                            }
                            if (z15) {
                                oe.c(xVar.a);
                            }
                            throw th;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        r42 = file3;
                    }
                    if (z15) {
                        file = xVar.a;
                        oe.c(file);
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    th = th5;
                }
        }
    }

    public /* synthetic */ ia(zy zyVar, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i7) {
        this.e = zyVar;
        this.b = z10;
        this.f = message;
        this.h = arrayList;
        this.c = z11;
        this.n = arrayList2;
        this.d = i7;
    }

    public /* synthetic */ ia(zi.u0 u0Var, zi.x xVar, boolean z10, File file, boolean z11, int i7, zi.q0 q0Var) {
        this.e = u0Var;
        this.f = xVar;
        this.b = z10;
        this.h = file;
        this.c = z11;
        this.d = i7;
        this.n = q0Var;
    }
}
