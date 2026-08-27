package c7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Continuation, com.google.android.gms.common.api.internal.s {
    public static final /* synthetic */ b a = new b();
    public static final /* synthetic */ b b = new b();
    public static final /* synthetic */ b c = new b();

    public void a(l lVar, com.google.android.gms.common.api.internal.n nVar, boolean z10, TaskCompletionSource taskCompletionSource) {
        v5.c cVar;
        synchronized (lVar.R) {
            try {
                j jVar = (j) lVar.R.remove(nVar);
                if (jVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                com.google.android.gms.common.api.internal.p e9 = jVar.b.e();
                e9.b = null;
                e9.c = null;
                if (z10) {
                    v5.c[] l10 = lVar.l();
                    if (l10 != null) {
                        int length = l10.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                cVar = null;
                                break;
                            }
                            cVar = l10[i10];
                            if ("location_updates_with_callback".equals(cVar.a)) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        if (cVar != null && cVar.b() >= 1) {
                            b0 b0Var = (b0) lVar.u();
                            m mVar = new m(2, null, jVar, null, null, null);
                            f fVar = new f(Boolean.TRUE, taskCompletionSource);
                            Parcel M0 = b0Var.M0();
                            e.c(M0, mVar);
                            e.d(M0, fVar);
                            b0Var.Q0(M0, 89);
                        }
                    }
                    b0 b0Var2 = (b0) lVar.u();
                    p pVar = new p(2, null, null, jVar, null, new h(taskCompletionSource), null);
                    Parcel M02 = b0Var2.M0();
                    e.c(M02, pVar);
                    b0Var2.Q0(M02, 59);
                } else {
                    taskCompletionSource.setResult(Boolean.TRUE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        v5.c cVar;
        l lVar = (l) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        r7.b bVar = new r7.b(Long.MAX_VALUE, 0, false, null, null);
        v5.c[] l10 = lVar.l();
        if (l10 != null) {
            int length = l10.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    cVar = null;
                    break;
                }
                cVar = l10[i10];
                if ("get_last_location_with_request".equals(cVar.a)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (cVar != null && cVar.b() >= 1) {
                b0 b0Var = (b0) lVar.u();
                g gVar = new g(0, taskCompletionSource);
                Parcel M0 = b0Var.M0();
                e.c(M0, bVar);
                e.d(M0, gVar);
                b0Var.Q0(M0, 82);
                return;
            }
        }
        b0 b0Var2 = (b0) lVar.u();
        Parcel M02 = b0Var2.M0();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                b0Var2.b.transact(7, M02, obtain, 0);
                obtain.readException();
                M02.recycle();
                Location location = (Location) e.a(obtain, Location.CREATOR);
                obtain.recycle();
                taskCompletionSource.setResult(location);
            } catch (RuntimeException e9) {
                obtain.recycle();
                throw e9;
            }
        } catch (Throwable th) {
            M02.recycle();
            throw th;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return null;
    }
}
