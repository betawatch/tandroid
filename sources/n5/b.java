package n5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import h7.r8;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR;
    public static final o5.a E;
    public final b0 A;
    public c0 B;
    public final String a;
    public final ArrayList b;
    public final boolean c;
    public final m5.i d;
    public final boolean e;
    public final o5.a f;
    public final boolean h;
    public final double n;
    public final boolean r;
    public final boolean s;
    public final boolean v;
    public final List w;
    public final boolean x;
    public final boolean y;
    public static final b0 C = new b0(false);
    public static final c0 D = new c0(0);

    static {
        new o5.f(o5.f.U, o5.f.V, 10000L, null, h7.c0.a("smallIconDrawableResId"), h7.c0.a("stopLiveStreamDrawableResId"), h7.c0.a("pauseDrawableResId"), h7.c0.a("playDrawableResId"), h7.c0.a("skipNextDrawableResId"), h7.c0.a("skipPrevDrawableResId"), h7.c0.a("forwardDrawableResId"), h7.c0.a("forward10DrawableResId"), h7.c0.a("forward30DrawableResId"), h7.c0.a("rewindDrawableResId"), h7.c0.a("rewind10DrawableResId"), h7.c0.a("rewind30DrawableResId"), h7.c0.a("disconnectDrawableResId"), h7.c0.a("notificationImageSizeDimenResId"), h7.c0.a("castingToDeviceStringResId"), h7.c0.a("stopLiveStreamStringResId"), h7.c0.a("pauseStringResId"), h7.c0.a("playStringResId"), h7.c0.a("skipNextStringResId"), h7.c0.a("skipPrevStringResId"), h7.c0.a("forwardStringResId"), h7.c0.a("forward10StringResId"), h7.c0.a("forward30StringResId"), h7.c0.a("rewindStringResId"), h7.c0.a("rewind10StringResId"), h7.c0.a("rewind30StringResId"), h7.c0.a("disconnectStringResId"), null, false, false);
        E = new o5.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new h5.h(26);
    }

    public b(String str, ArrayList arrayList, boolean z10, m5.i iVar, boolean z11, o5.a aVar, boolean z12, double d, boolean z13, boolean z14, boolean z15, ArrayList arrayList2, boolean z16, boolean z17, b0 b0Var, c0 c0Var) {
        this.a = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.c = z10;
        this.d = iVar == null ? new m5.i() : iVar;
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
        this.A = b0Var;
        this.B = c0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.a);
        r8.n(parcel, 3, DesugarCollections.unmodifiableList(this.b));
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        r8.k(parcel, 5, this.d, i10);
        r8.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        r8.k(parcel, 7, this.f, i10);
        r8.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        r8.s(parcel, 9, 8);
        parcel.writeDouble(this.n);
        r8.s(parcel, 10, 4);
        parcel.writeInt(this.r ? 1 : 0);
        r8.s(parcel, 11, 4);
        parcel.writeInt(this.s ? 1 : 0);
        r8.s(parcel, 12, 4);
        parcel.writeInt(this.v ? 1 : 0);
        r8.n(parcel, 13, DesugarCollections.unmodifiableList(this.w));
        r8.s(parcel, 14, 4);
        parcel.writeInt(this.x ? 1 : 0);
        r8.s(parcel, 15, 4);
        parcel.writeInt(0);
        r8.s(parcel, 16, 4);
        parcel.writeInt(this.y ? 1 : 0);
        r8.k(parcel, 17, this.A, i10);
        r8.k(parcel, 18, this.B, i10);
        r8.r(parcel, q6);
    }
}
