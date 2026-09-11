package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class n0 implements Parcelable {
    public static final Parcelable.Creator<n0> CREATOR = new w.a(14);
    public final boolean E;
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

    public n0(r rVar) {
        this.a = rVar.getClass().getName();
        this.b = rVar.e;
        this.c = rVar.y;
        this.d = rVar.F;
        this.e = rVar.N;
        this.f = rVar.O;
        this.h = rVar.P;
        this.n = rVar.S;
        this.r = rVar.w;
        this.s = rVar.R;
        this.v = rVar.Q;
        this.w = rVar.c0.ordinal();
        this.x = rVar.n;
        this.y = rVar.r;
        this.E = rVar.X;
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
        int i10 = this.f;
        if (i10 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i10));
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
        if (this.v) {
            sb2.append(" hidden");
        }
        String str2 = this.x;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.y);
        }
        if (this.E) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
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
        parcel.writeInt(this.E ? 1 : 0);
    }

    public n0(Parcel parcel) {
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
        this.E = parcel.readInt() != 0;
    }
}
