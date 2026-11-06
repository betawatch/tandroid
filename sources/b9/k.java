package b9;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import c8.xb;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class k extends r6.a {
    public static final Parcelable.Creator<k> CREATOR = new c(8);
    public final Uri a;
    public final HashMap b;
    public final byte[] c;

    public k(Uri uri, Bundle bundle, byte[] bArr) {
        this.a = uri;
        HashMap hashMap = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        q6.m.g(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            q6.m.g(parcelable);
            hashMap.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.b = hashMap;
        this.c = bArr;
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb2 = new StringBuilder("DataItemParcelable[@");
        sb2.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.c;
        sb2.append(",dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        HashMap hashMap = this.b;
        sb2.append(", numAssets=" + hashMap.size());
        sb2.append(", uri=".concat(String.valueOf(this.a)));
        if (!isLoggable) {
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append("]\n  assets: ");
        for (String str : hashMap.keySet()) {
            sb2.append("\n    " + str + ": " + String.valueOf(hashMap.get(str)));
        }
        sb2.append("\n  ]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.a, i7);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        q6.m.g(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.b.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((DataItemAssetParcelable) entry.getValue()));
        }
        xb.b(parcel, 4, bundle);
        xb.c(parcel, 5, this.c);
        xb.s(parcel, r10);
    }
}
