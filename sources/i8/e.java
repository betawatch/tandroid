package i8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends y5.a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);
    public final f a;
    public final int b;
    public final int c;
    public final int d;

    public e(f fVar, int i9, int i10, int i11) {
        this.a = fVar;
        this.b = i9;
        this.c = i10;
        this.d = i11;
    }

    public final void b(h8.c cVar) {
        f fVar = this.a;
        int i9 = this.b;
        if (i9 == 1) {
            cVar.onChannelOpened(fVar);
            return;
        }
        int i10 = this.d;
        int i11 = this.c;
        if (i9 == 2) {
            cVar.onChannelClosed(fVar, i11, i10);
            return;
        }
        if (i9 == 3) {
            cVar.onInputClosed(fVar, i11, i10);
        } else {
            if (i9 == 4) {
                cVar.onOutputClosed(fVar, i11, i10);
                return;
            }
            Log.w("ChannelEventParcelable", "Unknown type: " + i9);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i9 = this.b;
        String num = i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? Integer.toString(i9) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i10 = this.c;
        String num2 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? Integer.toString(i10) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        StringBuilder q10 = j3.r0.q("ChannelEventParcelable[, channel=", valueOf, ", type=", num, ", closeReason=");
        q10.append(num2);
        q10.append(", appErrorCode=");
        q10.append(this.d);
        q10.append("]");
        return q10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.a, i9);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        p8.r(parcel, q10);
    }
}
