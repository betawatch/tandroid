package c7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class a0 implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    a0 EF5;
    public static final /* synthetic */ a0[] a = {new a0("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<a0> CREATOR = new w.a(29);

    public static a0 a(String str) {
        for (a0 a0Var : values()) {
            a0Var.getClass();
            if (str.equals("public-key")) {
                return a0Var;
            }
        }
        throw new z(a4.a.p("PublicKeyCredentialType ", str, " not supported"));
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString("public-key");
    }
}
