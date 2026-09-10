package h8;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.widget.FrameLayout;
import n6.l;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class d extends FrameLayout {
    private final j zza;

    public d(Context context) {
        super(context);
        this.zza = new j(this, context);
        setClickable(true);
    }

    public void getMapAsync(f fVar) {
        l.e("getMapAsync() must be called on the main thread");
        l.i(fVar, "callback must not be null.");
        j jVar = this.zza;
        aa.a aVar = jVar.a;
        if (aVar != null) {
            aVar.p(fVar);
        } else {
            jVar.h.add(fVar);
        }
    }

    public void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            j jVar = this.zza;
            jVar.getClass();
            jVar.c(bundle, new x6.c(jVar, bundle));
            if (this.zza.a == null) {
                j.a(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        j jVar = this.zza;
        aa.a aVar = jVar.a;
        if (aVar == null) {
            jVar.b(1);
            return;
        }
        try {
            i8.g gVar = (i8.g) aVar.c;
            gVar.S0(gVar.O0(), 5);
        } catch (RemoteException e) {
            throw new androidx.car.app.j(e);
        }
    }

    public void onEnterAmbient(Bundle bundle) {
        l.e("onEnterAmbient() must be called on the main thread");
        aa.a aVar = this.zza.a;
        if (aVar != null) {
            aVar.getClass();
            try {
                Bundle bundle2 = new Bundle();
                i8.d.c(bundle, bundle2);
                i8.g gVar = (i8.g) aVar.c;
                Parcel O0 = gVar.O0();
                s7.b.b(O0, bundle2);
                gVar.S0(O0, 10);
                i8.d.c(bundle2, bundle);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }
    }

    public void onExitAmbient() {
        l.e("onExitAmbient() must be called on the main thread");
        aa.a aVar = this.zza.a;
        if (aVar != null) {
            aVar.getClass();
            try {
                i8.g gVar = (i8.g) aVar.c;
                gVar.S0(gVar.O0(), 11);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }
    }

    public void onLowMemory() {
        aa.a aVar = this.zza.a;
        if (aVar != null) {
            try {
                i8.g gVar = (i8.g) aVar.c;
                gVar.S0(gVar.O0(), 6);
            } catch (RemoteException e) {
                throw new androidx.car.app.j(e);
            }
        }
    }

    public void onPause() {
        j jVar = this.zza;
        aa.a aVar = jVar.a;
        if (aVar == null) {
            jVar.b(5);
            return;
        }
        try {
            i8.g gVar = (i8.g) aVar.c;
            gVar.S0(gVar.O0(), 4);
        } catch (RemoteException e) {
            throw new androidx.car.app.j(e);
        }
    }

    public void onResume() {
        j jVar = this.zza;
        jVar.getClass();
        jVar.c(null, new x6.d(jVar, 1));
    }

    public void onSaveInstanceState(Bundle bundle) {
        j jVar = this.zza;
        aa.a aVar = jVar.a;
        if (aVar == null) {
            Bundle bundle2 = jVar.b;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
                return;
            }
            return;
        }
        try {
            Bundle bundle3 = new Bundle();
            i8.d.c(bundle, bundle3);
            i8.g gVar = (i8.g) aVar.c;
            Parcel O0 = gVar.O0();
            s7.b.b(O0, bundle3);
            Parcel N0 = gVar.N0(O0, 7);
            if (N0.readInt() != 0) {
                bundle3.readFromParcel(N0);
            }
            N0.recycle();
            i8.d.c(bundle3, bundle);
        } catch (RemoteException e) {
            throw new androidx.car.app.j(e);
        }
    }

    public void onStart() {
        j jVar = this.zza;
        jVar.getClass();
        jVar.c(null, new x6.d(jVar, 0));
    }

    public void onStop() {
        j jVar = this.zza;
        aa.a aVar = jVar.a;
        if (aVar == null) {
            jVar.b(4);
            return;
        }
        try {
            i8.g gVar = (i8.g) aVar.c;
            gVar.S0(gVar.O0(), 13);
        } catch (RemoteException e) {
            throw new androidx.car.app.j(e);
        }
    }
}
