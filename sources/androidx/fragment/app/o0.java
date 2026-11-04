package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o0 implements Parcelable {
    public static final Parcelable.Creator<o0> CREATOR = new w.a(12);
    public final int E;
    public final boolean F;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final String h;
    public final boolean n;
    public final boolean r;
    public final boolean s;
    public final boolean w;
    public final int x;
    public final String y;

    public o0(s sVar) {
        this.a = sVar.getClass().getName();
        this.b = sVar.e;
        this.c = sVar.E;
        this.d = sVar.G;
        this.e = sVar.O;
        this.f = sVar.P;
        this.h = sVar.Q;
        this.n = sVar.T;
        this.r = sVar.x;
        this.s = sVar.S;
        this.w = sVar.R;
        this.x = sVar.d0.ordinal();
        this.y = sVar.n;
        this.E = sVar.r;
        this.F = sVar.Y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.a);
        sb2.append(" (");
        sb2.append(this.b);
        sb2.append(")}:");
        if (this.c) {
            sb2.append(" fromLayout");
        }
        if (this.d) {
            sb2.append(" dynamicContainer");
        }
        int i3 = this.f;
        if (i3 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i3));
        }
        String str = this.h;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.n) {
            sb2.append(" retainInstance");
        }
        if (this.r) {
            sb2.append(" removing");
        }
        if (this.s) {
            sb2.append(" detached");
        }
        if (this.w) {
            sb2.append(" hidden");
        }
        String str2 = this.y;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.E);
        }
        if (this.F) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.h);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F ? 1 : 0);
    }

    public o0(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt() != 0;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.h = parcel.readString();
        this.n = parcel.readInt() != 0;
        this.r = parcel.readInt() != 0;
        this.s = parcel.readInt() != 0;
        this.w = parcel.readInt() != 0;
        this.x = parcel.readInt();
        this.y = parcel.readString();
        this.E = parcel.readInt();
        this.F = parcel.readInt() != 0;
    }
}
