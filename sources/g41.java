// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g41 implements Parcelable {
    public static final Parcelable.Creator<g41> CREATOR = new f41(0);
    public final Bundle a;

    public g41(Object obj) {
        ArrayMap arrayMap = u41.a;
        String i = u41.i(obj.getClass());
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", "Bundling ".concat(i));
        }
        this.a = u41.o(obj, i, new s41(null, "", new ArrayDeque()));
    }

    public final Object a() {
        ArrayMap arrayMap = u41.a;
        boolean isLoggable = Log.isLoggable("CarApp.Bun", 3);
        Bundle bundle = this.a;
        if (isLoggable) {
            String str = (String) u41.b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
            if (str == null) {
                str = "unknown";
            }
            Log.d("CarApp.Bun", "Unbundling ".concat(str));
        }
        return u41.f(bundle, new s41(null, "", new ArrayDeque()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public g41(Bundle bundle) {
        this.a = bundle;
    }
}
