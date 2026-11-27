// default package

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ay8 implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    ay8 EF5;
    public static final /* synthetic */ ay8[] a = {new ay8("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<ay8> CREATOR = new ced((byte) 1);

    public static ay8 a(String str) {
        for (ay8 ay8Var : values()) {
            ay8Var.getClass();
            if (str.equals("public-key")) {
                return ay8Var;
            }
        }
        throw new zx8(qd4.y("PublicKeyCredentialType ", str, " not supported"));
    }

    public static ay8 valueOf(String str) {
        return (ay8) Enum.valueOf(ay8.class, str);
    }

    public static ay8[] values() {
        return (ay8[]) a.clone();
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
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("public-key");
    }
}
