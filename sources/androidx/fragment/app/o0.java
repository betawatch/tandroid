package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class o0 implements Parcelable {
    public static final Parcelable.Creator<o0> CREATOR = new w.a(18);
    public final boolean B;
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
    public final boolean v;
    public final int w;
    public final String x;
    public final int y;

    public o0(s sVar) {
        this.a = sVar.getClass().getName();
        this.b = sVar.e;
        this.c = sVar.y;
        this.d = sVar.C;
        this.e = sVar.K;
        this.f = sVar.L;
        this.h = sVar.M;
        this.n = sVar.P;
        this.r = sVar.w;
        this.s = sVar.O;
        this.v = sVar.N;
        this.w = sVar.Z.ordinal();
        this.x = sVar.n;
        this.y = sVar.r;
        this.B = sVar.U;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.d) {
            sb.append(" dynamicContainer");
        }
        int i10 = this.f;
        if (i10 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i10));
        }
        String str = this.h;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.n) {
            sb.append(" retainInstance");
        }
        if (this.r) {
            sb.append(" removing");
        }
        if (this.s) {
            sb.append(" detached");
        }
        if (this.v) {
            sb.append(" hidden");
        }
        String str2 = this.x;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.y);
        }
        if (this.B) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
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
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w);
        parcel.writeString(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.B ? 1 : 0);
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
        this.v = parcel.readInt() != 0;
        this.w = parcel.readInt();
        this.x = parcel.readString();
        this.y = parcel.readInt();
        this.B = parcel.readInt() != 0;
    }
}
