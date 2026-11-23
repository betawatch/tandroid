package b5;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import gd.h;
import gd.i;
import gd.j;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class a {
    public static d a(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(a.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).a;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static gd.c b(rd.a aVar) {
        gd.d[] dVarArr = gd.d.a;
        j jVar = j.a;
        h hVar = new h();
        hVar.a = aVar;
        hVar.b = jVar;
        return hVar;
    }

    public static i c(rd.a initializer) {
        kotlin.jvm.internal.j.e(initializer, "initializer");
        return new i(initializer);
    }
}
