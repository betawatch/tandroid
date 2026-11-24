// default package

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jl9 implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ jl9(int i, u41 u41Var, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z, boolean z2, fx0[] fx0VarArr) {
        this.e = u41Var;
        this.f = fx0VarArr;
        this.d = i;
        this.b = z;
        this.h = starsSubscription;
        this.c = z2;
        this.n = tLObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b9  */
    /* JADX WARN: Type inference failed for: r12v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, ul9] */
    /* JADX WARN: Type inference failed for: r5v2, types: [ul9] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        File file;
        ul9 ul9Var;
        File file2;
        int i;
        switch (this.a) {
            case 0:
                ?? r5 = (ul9) this.e;
                nk9 nk9Var = (nk9) this.f;
                boolean z = this.b;
                File file3 = (File) this.h;
                ?? r12 = this.c;
                int i2 = this.d;
                ql9 ql9Var = (ql9) this.n;
                r5.getClass();
                long nanoTime = System.nanoTime();
                try {
                    try {
                        nk9Var.g();
                        r5.m.b("preview output finalized: size=" + nk9Var.a.length() + ", replace=" + z + ", elapsedMs=" + ul9.f(nanoTime));
                        r5.g();
                        try {
                            if (z) {
                                synchronized (nk9Var) {
                                    try {
                                        i = nk9Var.s;
                                    } catch (Throwable th) {
                                        th = th;
                                        while (true) {
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        }
                                    }
                                }
                                r5.u(file3, i, r5.K, r5.L, r12, i2);
                                file2 = file3;
                                ul9Var = r5;
                            } else {
                                r12 = file3;
                                File file4 = nk9Var.a;
                                long j = r5.O;
                                if (j <= 0) {
                                    j = r5.I;
                                }
                                ExecutorService executorService = r5.k;
                                try {
                                    gl9 gl9Var = new gl9((ul9) r5, ql9Var, file4, j, true);
                                    ul9Var = r5;
                                    executorService.execute(gl9Var);
                                    file2 = r12;
                                } catch (Exception e) {
                                    e = e;
                                    r5 = r5;
                                    r5.i.post(new el9(r5, e, (byte) 0));
                                    if (r12 != 0) {
                                        cte.c(r12);
                                    }
                                    if (z) {
                                        file = nk9Var.a;
                                        cte.c(file);
                                        return;
                                    }
                                    return;
                                }
                            }
                            ul9Var.V = null;
                            if (file2 != null) {
                                cte.c(file2);
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (r12 != 0) {
                            cte.c(r12);
                        }
                        if (z) {
                            cte.c(nk9Var.a);
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    r12 = file3;
                } catch (Throwable th4) {
                    th = th4;
                    r12 = file3;
                    if (r12 != 0) {
                    }
                    if (z) {
                    }
                    throw th;
                }
                if (z) {
                    file = nk9Var.a;
                    cte.c(file);
                    return;
                }
                return;
            case 1:
                z3a z3aVar = (z3a) this.e;
                boolean z2 = this.b;
                TLRPC.Message message = (TLRPC.Message) this.f;
                ArrayList arrayList = (ArrayList) this.h;
                boolean z3 = this.c;
                ArrayList arrayList2 = (ArrayList) this.n;
                int i3 = this.d;
                z3aVar.getMessagesController().X(arrayList, null, null, message.dialog_id, false, z3 ? 1 : 0, false, 0L, null, 0, !z3 && z2, (!z2 || message == null) ? 0 : message.id);
                z3aVar.getMessagesController().q5(z2 ? 1 : 0, message.dialog_id, arrayList2);
                z3aVar.getMediaDataController().x0(message.dialog_id);
                z3aVar.c0(i3);
                z3aVar.h0(i3, z3);
                return;
            default:
                u41 u41Var = (u41) this.e;
                fx0[] fx0VarArr = (fx0[]) this.f;
                int i4 = this.d;
                boolean z4 = this.b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z5 = this.c;
                TLObject tLObject = (TLObject) this.n;
                u41Var.setLoading(false);
                fx0 fx0Var = fx0VarArr[0];
                if (fx0Var != null) {
                    fx0Var.dismiss();
                }
                gta.v(i4, false).O();
                d S = LaunchActivity.S();
                if (S != null) {
                    u21.b0(S).V(Collections.singletonList(tLObject), k96.M0(2131744760, null), gl.T2((!z4 || TextUtils.isEmpty(starsSubscription.title)) ? (!z5 || TextUtils.isEmpty(starsSubscription.title)) ? k96.a0(null, null, 2131744759, k96.u(starsSubscription.until_date, false)) : k96.a0(null, null, 2131744762, k96.u(starsSubscription.until_date, false), starsSubscription.title) : k96.a0(null, null, 2131744763, k96.u(starsSubscription.until_date, false), starsSubscription.title)), null).k(false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ jl9(ul9 ul9Var, nk9 nk9Var, boolean z, File file, boolean z2, int i, ql9 ql9Var) {
        this.e = ul9Var;
        this.f = nk9Var;
        this.b = z;
        this.h = file;
        this.c = z2;
        this.d = i;
        this.n = ql9Var;
    }

    public /* synthetic */ jl9(z3a z3aVar, boolean z, TLRPC.Message message, ArrayList arrayList, boolean z2, ArrayList arrayList2, int i) {
        this.e = z3aVar;
        this.b = z;
        this.f = message;
        this.h = arrayList;
        this.c = z2;
        this.n = arrayList2;
        this.d = i;
    }
}
