package n5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import g7.i0;
import g7.p8;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import m6.r0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends y5.a {
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
        new o5.f(o5.f.U, o5.f.V, 10000L, null, i0.a("smallIconDrawableResId"), i0.a("stopLiveStreamDrawableResId"), i0.a("pauseDrawableResId"), i0.a("playDrawableResId"), i0.a("skipNextDrawableResId"), i0.a("skipPrevDrawableResId"), i0.a("forwardDrawableResId"), i0.a("forward10DrawableResId"), i0.a("forward30DrawableResId"), i0.a("rewindDrawableResId"), i0.a("rewind10DrawableResId"), i0.a("rewind30DrawableResId"), i0.a("disconnectDrawableResId"), i0.a("notificationImageSizeDimenResId"), i0.a("castingToDeviceStringResId"), i0.a("stopLiveStreamStringResId"), i0.a("pauseStringResId"), i0.a("playStringResId"), i0.a("skipNextStringResId"), i0.a("skipPrevStringResId"), i0.a("forwardStringResId"), i0.a("forward10StringResId"), i0.a("forward30StringResId"), i0.a("rewindStringResId"), i0.a("rewind10StringResId"), i0.a("rewind30StringResId"), i0.a("disconnectStringResId"), null, false, false);
        E = new o5.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new r0(27);
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.n(parcel, 3, DesugarCollections.unmodifiableList(this.b));
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        p8.k(parcel, 5, this.d, i9);
        p8.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        p8.k(parcel, 7, this.f, i9);
        p8.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        p8.s(parcel, 9, 8);
        parcel.writeDouble(this.n);
        p8.s(parcel, 10, 4);
        parcel.writeInt(this.r ? 1 : 0);
        p8.s(parcel, 11, 4);
        parcel.writeInt(this.s ? 1 : 0);
        p8.s(parcel, 12, 4);
        parcel.writeInt(this.v ? 1 : 0);
        p8.n(parcel, 13, DesugarCollections.unmodifiableList(this.w));
        p8.s(parcel, 14, 4);
        parcel.writeInt(this.x ? 1 : 0);
        p8.s(parcel, 15, 4);
        parcel.writeInt(0);
        p8.s(parcel, 16, 4);
        parcel.writeInt(this.y ? 1 : 0);
        p8.k(parcel, 17, this.A, i9);
        p8.k(parcel, 18, this.B, i9);
        p8.r(parcel, q10);
    }
}
