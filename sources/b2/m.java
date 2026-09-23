package b2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new o(parcel);
            case 1:
                return new n(parcel);
            default:
                return new e1(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new o[i10];
            case 1:
                return new n[i10];
            default:
                return new e1[i10];
        }
    }
}
