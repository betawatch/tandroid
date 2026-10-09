package h8;

import ae.x;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.widget.FrameLayout;
import n6.l;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
            aVar.n(fVar);
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
            gVar.R0(gVar.N0(), 5);
        } catch (RemoteException e7) {
            throw new x(e7);
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
                Parcel N0 = gVar.N0();
                s7.b.b(N0, bundle2);
                gVar.R0(N0, 10);
                i8.d.c(bundle2, bundle);
            } catch (RemoteException e7) {
                throw new x(e7);
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
                gVar.R0(gVar.N0(), 11);
            } catch (RemoteException e7) {
                throw new x(e7);
            }
        }
    }

    public void onLowMemory() {
        aa.a aVar = this.zza.a;
        if (aVar != null) {
            try {
                i8.g gVar = (i8.g) aVar.c;
                gVar.R0(gVar.N0(), 6);
            } catch (RemoteException e7) {
                throw new x(e7);
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
            gVar.R0(gVar.N0(), 4);
        } catch (RemoteException e7) {
            throw new x(e7);
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
            Parcel N0 = gVar.N0();
            s7.b.b(N0, bundle3);
            Parcel M0 = gVar.M0(N0, 7);
            if (M0.readInt() != 0) {
                bundle3.readFromParcel(M0);
            }
            M0.recycle();
            i8.d.c(bundle3, bundle);
        } catch (RemoteException e7) {
            throw new x(e7);
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
            gVar.R0(gVar.N0(), 13);
        } catch (RemoteException e7) {
            throw new x(e7);
        }
    }
}
