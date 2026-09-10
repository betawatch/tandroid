package d6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c7.r0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import v7.y6;
import w7.e0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR;
    public static final a0 G = new a0(false);
    public static final b0 H = new b0(0);
    public static final e6.a I;
    public final a0 E;
    public b0 F;
    public final String a;
    public final ArrayList b;
    public final boolean c;
    public final c6.i d;
    public final boolean e;
    public final e6.a f;
    public final boolean h;
    public final double n;
    public final boolean r;
    public final boolean s;
    public final boolean v;
    public final List w;
    public final boolean x;
    public final boolean y;

    static {
        new e6.f(e6.f.Y, e6.f.Z, 10000L, null, y6.a("smallIconDrawableResId"), y6.a("stopLiveStreamDrawableResId"), y6.a("pauseDrawableResId"), y6.a("playDrawableResId"), y6.a("skipNextDrawableResId"), y6.a("skipPrevDrawableResId"), y6.a("forwardDrawableResId"), y6.a("forward10DrawableResId"), y6.a("forward30DrawableResId"), y6.a("rewindDrawableResId"), y6.a("rewind10DrawableResId"), y6.a("rewind30DrawableResId"), y6.a("disconnectDrawableResId"), y6.a("notificationImageSizeDimenResId"), y6.a("castingToDeviceStringResId"), y6.a("stopLiveStreamStringResId"), y6.a("pauseStringResId"), y6.a("playStringResId"), y6.a("skipNextStringResId"), y6.a("skipPrevStringResId"), y6.a("forwardStringResId"), y6.a("forward10StringResId"), y6.a("forward30StringResId"), y6.a("rewindStringResId"), y6.a("rewind10StringResId"), y6.a("rewind30StringResId"), y6.a("disconnectStringResId"), null, false, false);
        I = new e6.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new r0(28);
    }

    public b(String str, ArrayList arrayList, boolean z10, c6.i iVar, boolean z11, e6.a aVar, boolean z12, double d, boolean z13, boolean z14, boolean z15, ArrayList arrayList2, boolean z16, boolean z17, a0 a0Var, b0 b0Var) {
        this.a = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.c = z10;
        this.d = iVar == null ? new c6.i() : iVar;
        this.e = z11;
        this.f = aVar;
        this.h = z12;
        this.n = d;
        this.r = z13;
        this.s = z14;
        this.v = z15;
        this.w = arrayList2;
        this.x = z16;
        this.y = z17;
        this.E = a0Var;
        this.F = b0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.a);
        e0.n(parcel, 3, DesugarCollections.unmodifiableList(this.b));
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        e0.k(parcel, 5, this.d, i10);
        e0.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        e0.k(parcel, 7, this.f, i10);
        e0.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        e0.s(parcel, 9, 8);
        parcel.writeDouble(this.n);
        e0.s(parcel, 10, 4);
        parcel.writeInt(this.r ? 1 : 0);
        e0.s(parcel, 11, 4);
        parcel.writeInt(this.s ? 1 : 0);
        e0.s(parcel, 12, 4);
        parcel.writeInt(this.v ? 1 : 0);
        e0.n(parcel, 13, DesugarCollections.unmodifiableList(this.w));
        e0.s(parcel, 14, 4);
        parcel.writeInt(this.x ? 1 : 0);
        e0.s(parcel, 15, 4);
        parcel.writeInt(0);
        e0.s(parcel, 16, 4);
        parcel.writeInt(this.y ? 1 : 0);
        e0.k(parcel, 17, this.E, i10);
        e0.k(parcel, 18, this.F, i10);
        e0.r(parcel, q6);
    }
}
