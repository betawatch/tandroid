// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class m3e extends c4 {
    public static final Parcelable.Creator<m3e> CREATOR = new g3e((byte) 12);
    public final gfe a;
    public final gfe b;

    public m3e(gfe gfeVar, gfe gfeVar2) {
        this.a = gfeVar;
        this.b = gfeVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m3e)) {
            return false;
        }
        m3e m3eVar = (m3e) obj;
        return vue.a(this.a, m3eVar.a) && vue.a(this.b, m3eVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        gfe gfeVar = this.a;
        bye.c(parcel, 1, gfeVar == null ? null : gfeVar.p());
        gfe gfeVar2 = this.b;
        bye.c(parcel, 2, gfeVar2 != null ? gfeVar2.p() : null);
        bye.s(parcel, r);
    }
}
