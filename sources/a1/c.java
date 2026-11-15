package a1;

import a3.n;
import a3.p;
import a8.b8;
import a8.r7;
import ab.m0;
import ab.o0;
import ai.h1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import bi.e0;
import bi.f1;
import bi.s2;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import db.r;
import db.t;
import db.u;
import di.e6;
import di.mb;
import di.n5;
import di.s;
import di.s0;
import di.v8;
import e2.m1;
import h2.j;
import h9.f0;
import h9.i0;
import h9.s1;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import k2.i;
import org.telegram.messenger.d1;
import org.telegram.messenger.g0;
import org.telegram.messenger.s10;
import org.telegram.messenger.x10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.Wallet.t1;
import org.telegram.ui.il0;
import r0.k1;
import r0.m;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnSuccessListener, p, Continuation, OnCompleteListener, h1, bg.p, q1, m, org.telegram.messenger.q1, j, i, q, x10, r4, te.b, il0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // te.b
    public void G(int i7, float f10, float f11, te.c cVar) {
        View view = ((e6) this.b).b;
        if (view instanceof t0) {
            ((t0) view).W();
        } else {
            view.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        s0 s0Var = (s0) this.b;
        if (z10) {
            long j3 = i7;
            if (s0Var.D1 != j3) {
                s0Var.D1 = j3;
                s0Var.t1.setText(s0.K0(j3));
            }
            s0Var.J0(true);
        }
    }

    @Override // r0.m
    public k1 M0(View view, k1 k1Var) {
        ((f1) this.b).r1.j(k1Var);
        return k1.b;
    }

    @Override // org.telegram.messenger.q1
    public void a(f5.f fVar, List list) {
        int i7;
        s2 s2Var = (s2) this.b;
        ArrayList arrayList = s2Var.i2;
        Iterator it = list.iterator();
        long j3 = 0;
        while (true) {
            i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            f5.m mVar = (f5.m) it.next();
            int size = arrayList.size();
            while (true) {
                if (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ug.j jVar = (ug.j) obj;
                    if (jVar.h() != null && jVar.h().equals(mVar.c)) {
                        jVar.h = mVar;
                        if (jVar.f() > j3) {
                            j3 = jVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            ((ug.j) obj2).g = j3;
        }
        g0.h3(new a3.f(s2Var, 20));
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        db.q qVar = (db.q) this.b;
        db.p clientImpl = (db.p) obj;
        kotlin.jvm.internal.j.e(clientImpl, "clientImpl");
        u uVar = new u((TaskCompletionSource) obj2);
        t tVar = (t) clientImpl.n();
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new h(-1, -1, 0, true), false);
        gVar.c = false;
        r rVar = (r) tVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.firebase.pnv.internal.IFpnvService");
        int i7 = db.e.a;
        obtain.writeStrongBinder(uVar);
        obtain.writeInt(1);
        qVar.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        gVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            rVar.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // ai.h1
    public void b(long j3, long j10) {
        long[] jArr = (long[]) this.b;
        ExecutorService executorService = DictationLid.a;
        long[] jArr2 = (long[]) DictationAsr.h.get("tinylid.bin");
        if (jArr2 != null) {
            jArr2[0] = j3;
            if (j10 > 0) {
                jArr2[1] = j10;
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - jArr[0] > 100) {
            jArr[0] = elapsedRealtime;
            DictationAsr.o();
        }
    }

    @Override // k2.i
    public void c(k2.j jVar) {
        d4.j jVar2 = (d4.j) this.b;
        d4.i iVar = (d4.i) jVar;
        iVar.clear();
        jVar2.b.add(iVar);
    }

    @Override // org.telegram.ui.il0
    public void e(int i7) {
        switch (this.a) {
            case 28:
                s10 s10Var = (s10) this.b;
                if (i7 != 1) {
                    if (i7 != 3) {
                        s10Var.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    s10Var.a(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                t1 t1Var = (t1) this.b;
                if (i7 != 1) {
                    if (i7 != 3) {
                        t1Var.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    t1Var.a(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    @Override // a3.p
    public s1 f(int i7, m1 m1Var, int[] iArr) {
        n nVar = (n) this.b;
        f0 p10 = i0.p();
        for (int i10 = 0; i10 < m1Var.a; i10++) {
            p10.c(new a3.j(i7, m1Var, i10, nVar, iArr[i10]));
        }
        return p10.f();
    }

    @Override // bg.p
    public void g(long j3) {
        switch (this.a) {
            case 11:
                ((bi.f) this.b).a(j3, true);
                break;
            default:
                ((n5) this.b).h();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 12:
                ((e0) this.b).run();
                break;
            default:
                ((z10) this.b).a(t1Var.h(i7, true, true));
                break;
        }
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7;
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.a) {
            case 22:
                s sVar = (s) this.b;
                b41 b41Var = (b41) obj;
                di.t tVar = sVar.r;
                if (!(b41Var.G instanceof TL_stars.StarsTransaction)) {
                    if (sVar.h) {
                        sVar.h = false;
                        sVar.a();
                        break;
                    }
                } else {
                    Context context = sVar.getContext();
                    long j3 = tVar.b;
                    i7 = ((e2) tVar).currentAccount;
                    TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) b41Var.G;
                    e6Var = ((e2) tVar).resourceProvider;
                    mb.k1(context, true, j3, i7, starsTransaction, e6Var);
                    break;
                }
                break;
            default:
                v8.b((v8) this.b, (ArrayList) obj, (Integer) obj2, (Long) number, (ArrayList) serializable, (ArrayList) serializable2);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 5:
                m0.b((Intent) this.b);
                break;
            case 6:
                ((o0) this.b).b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.b).cancel(false);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                ((f) this.b).invoke(obj);
                break;
            case 15:
                ((ae.d) this.b).invoke(obj);
                break;
            default:
                ((ae.d) this.b).invoke(obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Exception exception;
        Task forException;
        String message;
        switch (this.a) {
            case 2:
                ((CountDownLatch) this.b).countDown();
                return null;
            case 3:
                r7 r7Var = (r7) this.b;
                r7Var.getClass();
                if (task.isSuccessful() || (exception = task.getException()) == null || TextUtils.isEmpty(exception.getMessage()) || !exception.getMessage().contains("FID_ALREADY_USED:")) {
                    return task;
                }
                Log.w("FirebaseMessaging", "FID_ALREADY_USED Detected. Retrying with FID cache clearing!");
                ((va.c) ((va.d) r7Var.d)).c.c().delete();
                return r7Var.F();
            case 4:
                ((b8) this.b).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            case 9:
                return (Task) ((aa.n) this.b).call();
            default:
                db.n this$0 = (db.n) this.b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(task, "task");
                d1 d1Var = db.n.b;
                if (task.isSuccessful()) {
                    d1Var.a("Successfully completed the operation", new Object[0]);
                    Task forResult = Tasks.forResult(db.m.b.invoke(task.getResult()));
                    kotlin.jvm.internal.j.d(forResult, "{\n      logger.d(\"Succes…ccess(task.result))\n    }");
                    return forResult;
                }
                Log.e(d1Var.b, d1Var.b("Failed to fetch the Verification Support Info: " + task.getException(), new Object[0]));
                Exception exception2 = task.getException();
                if (exception2 == null || (message = exception2.getMessage()) == null || !xd.d.e(message, "test_number_token is invalid")) {
                    forException = Tasks.forException(new db.b(exception2 instanceof com.google.android.gms.common.api.f ? ((com.google.android.gms.common.api.f) exception2).getStatus().a : 55501, "Failed to fetch the Verification Support Info"));
                } else {
                    d1Var.a("Backend rejected the test number token.", new Object[0]);
                    forException = Tasks.forException(new db.b(55507, "Invalid test number ID(s) - might be empty, expired or duplicated."));
                }
                kotlin.jvm.internal.j.d(forException, "{\n      logger.e(\"$onFai…reMessage))\n      }\n    }");
                return forException;
        }
    }

    @Override // h2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 16:
                c4.h hVar = (c4.h) this.b;
                c4.a aVar = (c4.a) obj;
                c4.g gVar = new c4.g(aVar.b, w7.s.k0(aVar.a, aVar.c));
                hVar.c.add(gVar);
                long j3 = hVar.j;
                if (j3 == -9223372036854775807L || aVar.d >= j3) {
                    hVar.g(gVar);
                    break;
                }
                break;
            default:
                ((f0) this.b).c((c4.a) obj);
                break;
        }
    }

    @Override // te.b
    public /* synthetic */ void E(float f10, int i7) {
    }
}
