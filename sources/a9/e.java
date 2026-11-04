package a9;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends q6.a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);
    public final f a;
    public final int b;
    public final int c;
    public final int d;

    public e(f fVar, int i3, int i10, int i11) {
        this.a = fVar;
        this.b = i3;
        this.c = i10;
        this.d = i11;
    }

    public final void b(z8.a aVar) {
        f fVar = this.a;
        int i3 = this.b;
        if (i3 == 1) {
            aVar.a(fVar);
            return;
        }
        if (i3 == 2) {
            aVar.b(fVar);
            return;
        }
        if (i3 == 3) {
            aVar.d(fVar);
        } else {
            if (i3 == 4) {
                aVar.c(fVar);
                return;
            }
            Log.w("ChannelEventParcelable", "Unknown type: " + i3);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i3 = this.b;
        String num = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? Integer.toString(i3) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i10 = this.c;
        String num2 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? Integer.toString(i10) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("ChannelEventParcelable[, channel=", valueOf, ", type=", num, ", closeReason=");
        n4.append(num2);
        n4.append(", appErrorCode=");
        n4.append(this.d);
        n4.append("]");
        return n4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.a, i3);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.b);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.c);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.d);
        j8.a.t(parcel, s6);
    }
}
