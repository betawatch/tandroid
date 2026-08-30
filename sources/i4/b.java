package i4;

import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import h5.d0;
import j3.d1;
import j3.n0;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b implements e4.b {
    public static final Parcelable.Creator<b> CREATOR = new o(6);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public b(int i10, String str, String str2, String str3, boolean z4, int i11) {
        h5.a.f(i11 == -1 || i11 > 0);
        this.a = i10;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z4;
        this.f = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b a(Map map) {
        boolean z4;
        int i10;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z10;
        List list5;
        int i11;
        int i12;
        List list6 = (List) map.get("icy-br");
        boolean z11 = true;
        int i13 = -1;
        if (list6 != null) {
            String str4 = (String) list6.get(0);
            try {
                i12 = Integer.parseInt(str4) * MediaDataController.MAX_STYLE_RUNS_COUNT;
                if (i12 > 0) {
                    z4 = true;
                } else {
                    try {
                        h5.a.K("IcyHeaders", "Invalid bitrate: " + str4);
                        z4 = false;
                        i12 = -1;
                    } catch (NumberFormatException unused) {
                        android.support.v4.media.a.w("Invalid bitrate header: ", str4, "IcyHeaders");
                        i10 = i12;
                        z4 = false;
                        list = (List) map.get("icy-genre");
                        if (list == null) {
                        }
                        list2 = (List) map.get("icy-name");
                        if (list2 == null) {
                        }
                        list3 = (List) map.get("icy-url");
                        if (list3 == null) {
                        }
                        list4 = (List) map.get("icy-pub");
                        if (list4 == null) {
                        }
                        list5 = (List) map.get("icy-metaint");
                        if (list5 == null) {
                        }
                        if (z4) {
                        }
                    }
                }
                i10 = i12;
            } catch (NumberFormatException unused2) {
                i12 = -1;
            }
        } else {
            z4 = false;
            i10 = -1;
        }
        list = (List) map.get("icy-genre");
        if (list == null) {
            str = (String) list.get(0);
            z4 = true;
        } else {
            str = null;
        }
        list2 = (List) map.get("icy-name");
        if (list2 == null) {
            str2 = (String) list2.get(0);
            z4 = true;
        } else {
            str2 = null;
        }
        list3 = (List) map.get("icy-url");
        if (list3 == null) {
            str3 = (String) list3.get(0);
            z4 = true;
        } else {
            str3 = null;
        }
        list4 = (List) map.get("icy-pub");
        if (list4 == null) {
            z10 = ((String) list4.get(0)).equals("1");
            z4 = true;
        } else {
            z10 = false;
        }
        list5 = (List) map.get("icy-metaint");
        if (list5 == null) {
            String str5 = (String) list5.get(0);
            try {
                int parseInt = Integer.parseInt(str5);
                if (parseInt > 0) {
                    i13 = parseInt;
                } else {
                    try {
                        h5.a.K("IcyHeaders", "Invalid metadata interval: " + str5);
                        z11 = z4;
                    } catch (NumberFormatException unused3) {
                        i13 = parseInt;
                        android.support.v4.media.a.w("Invalid metadata interval: ", str5, "IcyHeaders");
                        i11 = i13;
                        if (z4) {
                        }
                    }
                }
                z4 = z11;
            } catch (NumberFormatException unused4) {
            }
            i11 = i13;
        } else {
            i11 = -1;
        }
        if (z4) {
            return new b(i10, str, str2, str3, z10, i11);
        }
        return null;
    }

    @Override // e4.b
    public final /* synthetic */ n0 b() {
        return null;
    }

    @Override // e4.b
    public final void c(d1 d1Var) {
        String str = this.c;
        if (str != null) {
            d1Var.E = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            d1Var.C = str2;
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a == bVar.a && d0.a(this.b, bVar.b) && d0.a(this.c, bVar.c) && d0.a(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (527 + this.a) * 31;
        String str = this.b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.a + ", metadataInterval=" + this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        int i11 = d0.a;
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
    }

    public b(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        int i10 = d0.a;
        this.e = parcel.readInt() != 0;
        this.f = parcel.readInt();
    }
}
