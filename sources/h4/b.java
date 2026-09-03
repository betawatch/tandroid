package h4;

import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import h5.d0;
import j3.d1;
import j3.n0;
import l.d;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class b implements e4.b {
    public static final Parcelable.Creator<b> CREATOR = new o(5);
    public final String a;
    public final String b;

    public b(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // e4.b
    public final /* synthetic */ n0 b() {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // e4.b
    public final void c(d1 d1Var) {
        String str = this.a;
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c3 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c3 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c3 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c3 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c3 = 4;
                    break;
                }
                break;
        }
        String str2 = this.b;
        switch (c3) {
            case 0:
                d1Var.c = str2;
                break;
            case 1:
                d1Var.a = str2;
                break;
            case 2:
                d1Var.g = str2;
                break;
            case 3:
                d1Var.d = str2;
                break;
            case 4:
                d1Var.b = str2;
                break;
        }
    }

    @Override // e4.b
    public final /* synthetic */ byte[] d() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.b.equals(bVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + d.e(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = d0.a;
        this.a = readString;
        this.b = parcel.readString();
    }
}
