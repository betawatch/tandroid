package d7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a0 implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    a0 EF5;
    public static final /* synthetic */ a0[] a = {new a0("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<a0> CREATOR = new r0(0);

    public static a0 a(String str) {
        for (a0 a0Var : values()) {
            a0Var.getClass();
            if (str.equals("public-key")) {
                return a0Var;
            }
        }
        throw new z(a1.g.p("PublicKeyCredentialType ", str, " not supported"));
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
