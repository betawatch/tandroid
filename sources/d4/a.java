package d4;

import android.os.Parcel;
import android.os.Parcelable;
import b4.b;
import f5.d0;
import j3.g1;
import j3.s0;
import j3.t0;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a implements b {
    public static final Parcelable.Creator<a> CREATOR;
    public static final t0 h;
    public static final t0 n;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        s0 s0Var = new s0();
        s0Var.o = "application/id3";
        h = new t0(s0Var);
        s0 s0Var2 = new s0();
        s0Var2.o = "application/x-scte35";
        n = new t0(s0Var2);
        CREATOR = new w.a(27);
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j10;
        this.d = j11;
        this.e = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.c == aVar.c && this.d == aVar.d && d0.a(this.a, aVar.a) && d0.a(this.b, aVar.b) && Arrays.equals(this.e, aVar.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // b4.b
    public final byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.e;
        }
        return null;
    }

    @Override // b4.b
    public final t0 getWrappedMetadataFormat() {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return n;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return h;
            default:
                return null;
        }
    }

    public final int hashCode() {
        if (this.f == 0) {
            String str = this.a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.c;
            int i10 = (hashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.d;
            this.f = Arrays.hashCode(this.e) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.e);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = d0.a;
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.createByteArray();
    }

    @Override // b4.b
    public final /* synthetic */ void populateMediaMetadata(g1 g1Var) {
    }
}
