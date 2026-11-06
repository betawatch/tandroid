package l6;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new j7.b(26);
    public final boolean a;
    public final long b;
    public final long c;

    public b(long j3, long j10, boolean z9) {
        this.a = z9;
        this.b = j3;
        this.c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb2.append(this.a);
        sb2.append(",collectForDebugStartTimeMillis: ");
        sb2.append(this.b);
        sb2.append(",collectForDebugExpiryTimeMillis: ");
        return p0.r(sb2, this.c, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        wb.q(parcel, 2, 8);
        parcel.writeLong(this.c);
        wb.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        wb.s(parcel, r10);
    }
}
