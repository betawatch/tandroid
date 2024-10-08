package com.google.android.exoplayer2.text;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.BundleableUtil;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class CueEncoder {
    public byte[] encode(List list) {
        ArrayList<? extends Parcelable> bundleArrayList = BundleableUtil.toBundleArrayList(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", bundleArrayList);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
