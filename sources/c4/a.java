package c4;

import android.os.Parcel;
import android.os.Parcelable;
import c.c;
import d5.f0;
import h3.g1;
import h3.t0;
import j3.r0;
import z3.b;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class a implements b {
    public static final Parcelable.Creator<a> CREATOR = new c(2);
    public final String a;
    public final String b;

    public a(String str, String str2) {
        this.a = str;
        this.b = str2;
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
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && this.b.equals(aVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // z3.b
    public final /* synthetic */ byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override // z3.b
    public final /* synthetic */ t0 getWrappedMetadataFormat() {
        return null;
    }

    public final int hashCode() {
        return this.b.hashCode() + r0.f(527, 31, this.a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // z3.b
    public final void populateMediaMetadata(g1 g1Var) {
        String str = this.a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        String str2 = this.b;
        switch (c10) {
            case 0:
                g1Var.c = str2;
                break;
            case 1:
                g1Var.a = str2;
                break;
            case 2:
                g1Var.g = str2;
                break;
            case 3:
                g1Var.d = str2;
                break;
            case 4:
                g1Var.b = str2;
                break;
        }
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i9 = f0.a;
        this.a = readString;
        this.b = parcel.readString();
    }
}
