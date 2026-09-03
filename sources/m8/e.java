package m8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import j7.g5;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);
    public final f a;
    public final int b;
    public final int c;
    public final int d;

    public e(f fVar, int i10, int i11, int i12) {
        this.a = fVar;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public final void e(l8.c cVar) {
        f fVar = this.a;
        int i10 = this.b;
        if (i10 == 1) {
            cVar.onChannelOpened(fVar);
            return;
        }
        int i11 = this.d;
        int i12 = this.c;
        if (i10 == 2) {
            cVar.onChannelClosed(fVar, i12, i11);
            return;
        }
        if (i10 == 3) {
            cVar.onInputClosed(fVar, i12, i11);
        } else {
            if (i10 == 4) {
                cVar.onOutputClosed(fVar, i12, i11);
                return;
            }
            Log.w("ChannelEventParcelable", "Unknown type: " + i10);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i10 = this.b;
        String num = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Integer.toString(i10) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i11 = this.c;
        String num2 = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? Integer.toString(i11) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        StringBuilder m9 = yh.m("ChannelEventParcelable[, channel=", valueOf, ", type=", num, ", closeReason=");
        m9.append(num2);
        m9.append(", appErrorCode=");
        m9.append(this.d);
        m9.append("]");
        return m9.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.a, i10);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        g5.r(parcel, q10);
    }
}
