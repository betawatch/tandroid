// default package

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class aud extends c4 {
    public static final Parcelable.Creator<aud> CREATOR = new hud(0);
    public final Uri a;
    public final HashMap b;
    public final byte[] c;

    public aud(Uri uri, Bundle bundle, byte[] bArr) {
        this.a = uri;
        HashMap hashMap = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        xve.h(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            xve.h(parcelable);
            hashMap.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.b = hashMap;
        this.c = bArr;
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.c;
        sb.append(",dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        HashMap hashMap = this.b;
        sb.append(", numAssets=" + hashMap.size());
        sb.append(", uri=".concat(String.valueOf(this.a)));
        if (!isLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : hashMap.keySet()) {
            sb.append("\n    " + str + ": " + String.valueOf(hashMap.get(str)));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 2, this.a, i);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        xve.h(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.b.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((DataItemAssetParcelable) entry.getValue()));
        }
        bye.b(parcel, 4, bundle);
        bye.c(parcel, 5, this.c);
        bye.s(parcel, r);
    }
}
