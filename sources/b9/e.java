package b9;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import c8.cc;
import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);
    public final f a;
    public final int b;
    public final int c;
    public final int d;

    public e(f fVar, int i7, int i10, int i11) {
        this.a = fVar;
        this.b = i7;
        this.c = i10;
        this.d = i11;
    }

    public final void b(a9.a aVar) {
        f fVar = this.a;
        int i7 = this.b;
        if (i7 == 1) {
            aVar.c(fVar);
            return;
        }
        if (i7 == 2) {
            aVar.a(fVar);
            return;
        }
        if (i7 == 3) {
            aVar.d(fVar);
        } else {
            if (i7 == 4) {
                aVar.b(fVar);
                return;
            }
            Log.w("ChannelEventParcelable", "Unknown type: " + i7);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i7 = this.b;
        String num = i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? Integer.toString(i7) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i10 = this.c;
        String num2 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? Integer.toString(i10) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        StringBuilder n10 = e2.n("ChannelEventParcelable[, channel=", valueOf, ", type=", num, ", closeReason=");
        n10.append(num2);
        n10.append(", appErrorCode=");
        n10.append(this.d);
        n10.append("]");
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.a, i7);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        cc.s(parcel, r10);
    }
}
