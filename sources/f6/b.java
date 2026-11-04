package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b8.hc;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR;
    public static final a0 H = new a0(false);
    public static final b0 I = new b0(0);
    public static final g6.a J;
    public final boolean E;
    public final a0 F;
    public b0 G;
    public final String a;
    public final ArrayList b;
    public final boolean c;
    public final e6.i d;
    public final boolean e;
    public final g6.a f;
    public final boolean h;
    public final double n;
    public final boolean r;
    public final boolean s;
    public final boolean w;
    public final List x;
    public final boolean y;

    static {
        new g6.f(g6.f.Z, g6.f.a0, 10000L, null, hc.a("smallIconDrawableResId"), hc.a("stopLiveStreamDrawableResId"), hc.a("pauseDrawableResId"), hc.a("playDrawableResId"), hc.a("skipNextDrawableResId"), hc.a("skipPrevDrawableResId"), hc.a("forwardDrawableResId"), hc.a("forward10DrawableResId"), hc.a("forward30DrawableResId"), hc.a("rewindDrawableResId"), hc.a("rewind10DrawableResId"), hc.a("rewind30DrawableResId"), hc.a("disconnectDrawableResId"), hc.a("notificationImageSizeDimenResId"), hc.a("castingToDeviceStringResId"), hc.a("stopLiveStreamStringResId"), hc.a("pauseStringResId"), hc.a("playStringResId"), hc.a("skipNextStringResId"), hc.a("skipPrevStringResId"), hc.a("forwardStringResId"), hc.a("forward10StringResId"), hc.a("forward30StringResId"), hc.a("rewindStringResId"), hc.a("rewind10StringResId"), hc.a("rewind30StringResId"), hc.a("disconnectStringResId"), null, false, false);
        J = new g6.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new c0(1);
    }

    public b(String str, ArrayList arrayList, boolean z10, e6.i iVar, boolean z11, g6.a aVar, boolean z12, double d, boolean z13, boolean z14, boolean z15, ArrayList arrayList2, boolean z16, boolean z17, a0 a0Var, b0 b0Var) {
        this.a = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.c = z10;
        this.d = iVar == null ? new e6.i() : iVar;
        this.e = z11;
        this.f = aVar;
        this.h = z12;
        this.n = d;
        this.r = z13;
        this.s = z14;
        this.w = z15;
        this.x = arrayList2;
        this.y = z16;
        this.E = z17;
        this.F = a0Var;
        this.G = b0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.a);
        j8.a.o(parcel, 3, DesugarCollections.unmodifiableList(this.b));
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        j8.a.l(parcel, 5, this.d, i3);
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        j8.a.l(parcel, 7, this.f, i3);
        j8.a.r(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        j8.a.r(parcel, 9, 8);
        parcel.writeDouble(this.n);
        j8.a.r(parcel, 10, 4);
        parcel.writeInt(this.r ? 1 : 0);
        j8.a.r(parcel, 11, 4);
        parcel.writeInt(this.s ? 1 : 0);
        j8.a.r(parcel, 12, 4);
        parcel.writeInt(this.w ? 1 : 0);
        j8.a.o(parcel, 13, DesugarCollections.unmodifiableList(this.x));
        j8.a.r(parcel, 14, 4);
        parcel.writeInt(this.y ? 1 : 0);
        j8.a.r(parcel, 15, 4);
        parcel.writeInt(0);
        j8.a.r(parcel, 16, 4);
        parcel.writeInt(this.E ? 1 : 0);
        j8.a.l(parcel, 17, this.F, i3);
        j8.a.l(parcel, 18, this.G, i3);
        j8.a.t(parcel, s6);
    }
}
