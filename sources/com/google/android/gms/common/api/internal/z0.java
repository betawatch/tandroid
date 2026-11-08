package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class z0 extends c1 {
    public final d b;

    public z0(int i7, d dVar) {
        super(i7);
        this.b = dVar;
    }

    @Override // com.google.android.gms.common.api.internal.c1
    public final void a(Status status) {
        try {
            this.b.o(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.c1
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.b.o(new Status(10, org.telegram.ui.Cells.f1.n(simpleName, ": ", localizedMessage, new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length())), null, null));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.c1
    public final void c(y0 y0Var, boolean z9) {
        Boolean valueOf = Boolean.valueOf(z9);
        Map map = (Map) y0Var.a;
        d dVar = this.b;
        map.put(dVar, valueOf);
        dVar.b(new g1(y0Var, dVar));
    }

    @Override // com.google.android.gms.common.api.internal.c1
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
