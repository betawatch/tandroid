package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a1 extends d1 {
    public final d b;

    public a1(int i3, d dVar) {
        super(i3);
        this.b = dVar;
    }

    @Override // com.google.android.gms.common.api.internal.d1
    public final void a(Status status) {
        try {
            this.b.o(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.d1
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.b.o(new Status(10, org.telegram.ui.Cells.f1.r(simpleName, ": ", localizedMessage, new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length())), null, null));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.d1
    public final void c(z0 z0Var, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        Map map = (Map) z0Var.a;
        d dVar = this.b;
        map.put(dVar, valueOf);
        dVar.b(new h1(z0Var, dVar));
    }

    @Override // com.google.android.gms.common.api.internal.d1
    public final void d(j0 j0Var) {
        try {
            d dVar = this.b;
            com.google.android.gms.common.api.c cVar = j0Var.b;
            dVar.getClass();
            try {
                dVar.n(cVar);
            } catch (DeadObjectException e10) {
                dVar.o(new Status(8, e10.getLocalizedMessage(), null, null));
                throw e10;
            } catch (RemoteException e11) {
                dVar.o(new Status(8, e11.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e12) {
            b(e12);
        }
    }
}
