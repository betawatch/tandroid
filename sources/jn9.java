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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jn9 implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ jn9(int i, b61 b61Var, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z, boolean z2, my0[] my0VarArr) {
        this.e = b61Var;
        this.f = my0VarArr;
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
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, un9] */
    /* JADX WARN: Type inference failed for: r5v2, types: [un9] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        File file;
        un9 un9Var;
        File file2;
        int i;
        switch (this.a) {
            case 0:
                ?? r5 = (un9) this.e;
                om9 om9Var = (om9) this.f;
                boolean z = this.b;
                File file3 = (File) this.h;
                ?? r12 = this.c;
                int i2 = this.d;
                qn9 qn9Var = (qn9) this.n;
                r5.getClass();
                long nanoTime = System.nanoTime();
                try {
                    try {
                        om9Var.g();
                        r5.m.b("preview output finalized: size=" + om9Var.a.length() + ", replace=" + z + ", elapsedMs=" + un9.f(nanoTime));
                        r5.g();
                        try {
                            if (z) {
                                synchronized (om9Var) {
                                    try {
                                        i = om9Var.s;
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
                                un9Var = r5;
                            } else {
                                r12 = file3;
                                File file4 = om9Var.a;
                                long j = r5.O;
                                if (j <= 0) {
                                    j = r5.I;
                                }
                                ExecutorService executorService = r5.k;
                                try {
                                    gn9 gn9Var = new gn9((un9) r5, qn9Var, file4, j, true);
                                    un9Var = r5;
                                    executorService.execute(gn9Var);
                                    file2 = r12;
                                } catch (Exception e) {
                                    e = e;
                                    r5 = r5;
                                    r5.i.post(new en9(r5, e, (byte) 0));
                                    if (r12 != 0) {
                                        fve.c(r12);
                                    }
                                    if (z) {
                                        file = om9Var.a;
                                        fve.c(file);
                                        return;
                                    }
                                    return;
                                }
                            }
                            un9Var.V = null;
                            if (file2 != null) {
                                fve.c(file2);
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (r12 != 0) {
                            fve.c(r12);
                        }
                        if (z) {
                            fve.c(om9Var.a);
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
                    file = om9Var.a;
                    fve.c(file);
                    return;
                }
                return;
            case 1:
                a6a a6aVar = (a6a) this.e;
                boolean z2 = this.b;
                TLRPC.Message message = (TLRPC.Message) this.f;
                ArrayList arrayList = (ArrayList) this.h;
                boolean z3 = this.c;
                ArrayList arrayList2 = (ArrayList) this.n;
                int i3 = this.d;
                a6aVar.getMessagesController().X(arrayList, null, null, message.dialog_id, false, z3 ? 1 : 0, false, 0L, null, 0, !z3 && z2, (!z2 || message == null) ? 0 : message.id);
                a6aVar.getMessagesController().t5(z2 ? 1 : 0, message.dialog_id, arrayList2);
                a6aVar.getMediaDataController().x0(message.dialog_id);
                a6aVar.c0(i3);
                a6aVar.h0(i3, z3);
                return;
            default:
                b61 b61Var = (b61) this.e;
                my0[] my0VarArr = (my0[]) this.f;
                int i4 = this.d;
                boolean z4 = this.b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z5 = this.c;
                TLObject tLObject = (TLObject) this.n;
                b61Var.setLoading(false);
                my0 my0Var = my0VarArr[0];
                if (my0Var != null) {
                    my0Var.dismiss();
                }
                jva.v(i4, false).O();
                d S = LaunchActivity.S();
                if (S != null) {
                    c41.b0(S).V(Collections.singletonList(tLObject), jb6.M0(2131744686, null), gm.S2((!z4 || TextUtils.isEmpty(starsSubscription.title)) ? (!z5 || TextUtils.isEmpty(starsSubscription.title)) ? jb6.a0(null, null, 2131744685, jb6.u(starsSubscription.until_date, false)) : jb6.a0(null, null, 2131744688, jb6.u(starsSubscription.until_date, false), starsSubscription.title) : jb6.a0(null, null, 2131744689, jb6.u(starsSubscription.until_date, false), starsSubscription.title)), null).k(false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ jn9(un9 un9Var, om9 om9Var, boolean z, File file, boolean z2, int i, qn9 qn9Var) {
        this.e = un9Var;
        this.f = om9Var;
        this.b = z;
        this.h = file;
        this.c = z2;
        this.d = i;
        this.n = qn9Var;
    }

    public /* synthetic */ jn9(a6a a6aVar, boolean z, TLRPC.Message message, ArrayList arrayList, boolean z2, ArrayList arrayList2, int i) {
        this.e = a6aVar;
        this.b = z;
        this.f = message;
        this.h = arrayList;
        this.c = z2;
        this.n = arrayList2;
        this.d = i;
    }
}
