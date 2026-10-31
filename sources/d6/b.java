package d6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c7.r0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import v7.c7;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR;
    public static final a0 G = new a0(false);
    public static final b0 H = new b0(0);
    public static final e6.a I;
    public final boolean D;
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
    public final boolean w;
    public final List x;
    public final boolean y;

    static {
        new e6.f(e6.f.Y, e6.f.Z, 10000L, null, c7.a("smallIconDrawableResId"), c7.a("stopLiveStreamDrawableResId"), c7.a("pauseDrawableResId"), c7.a("playDrawableResId"), c7.a("skipNextDrawableResId"), c7.a("skipPrevDrawableResId"), c7.a("forwardDrawableResId"), c7.a("forward10DrawableResId"), c7.a("forward30DrawableResId"), c7.a("rewindDrawableResId"), c7.a("rewind10DrawableResId"), c7.a("rewind30DrawableResId"), c7.a("disconnectDrawableResId"), c7.a("notificationImageSizeDimenResId"), c7.a("castingToDeviceStringResId"), c7.a("stopLiveStreamStringResId"), c7.a("pauseStringResId"), c7.a("playStringResId"), c7.a("skipNextStringResId"), c7.a("skipPrevStringResId"), c7.a("forwardStringResId"), c7.a("forward10StringResId"), c7.a("forward30StringResId"), c7.a("rewindStringResId"), c7.a("rewind10StringResId"), c7.a("rewind30StringResId"), c7.a("disconnectStringResId"), null, false, false);
        I = new e6.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new r0(27);
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
        this.w = z15;
        this.x = arrayList2;
        this.y = z16;
        this.D = z17;
        this.E = a0Var;
        this.F = b0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.a);
        h0.n(parcel, 3, DesugarCollections.unmodifiableList(this.b));
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        h0.k(parcel, 5, this.d, i10);
        h0.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        h0.k(parcel, 7, this.f, i10);
        h0.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        h0.s(parcel, 9, 8);
        parcel.writeDouble(this.n);
        h0.s(parcel, 10, 4);
        parcel.writeInt(this.r ? 1 : 0);
        h0.s(parcel, 11, 4);
        parcel.writeInt(this.s ? 1 : 0);
        h0.s(parcel, 12, 4);
        parcel.writeInt(this.w ? 1 : 0);
        h0.n(parcel, 13, DesugarCollections.unmodifiableList(this.x));
        h0.s(parcel, 14, 4);
        parcel.writeInt(this.y ? 1 : 0);
        h0.s(parcel, 15, 4);
        parcel.writeInt(0);
        h0.s(parcel, 16, 4);
        parcel.writeInt(this.D ? 1 : 0);
        h0.k(parcel, 17, this.E, i10);
        h0.k(parcel, 18, this.F, i10);
        h0.r(parcel, q6);
    }
}
