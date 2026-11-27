// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class mhd extends c4 {
    public static final Parcelable.Creator<mhd> CREATOR = new ced((byte) 24);
    public final fjd a;
    public final int b;
    public final int c;
    public final int d;

    public mhd(fjd fjdVar, int i, int i2, int i3) {
        this.a = fjdVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void b(og1 og1Var) {
        fjd fjdVar = this.a;
        int i = this.b;
        if (i == 1) {
            og1Var.a(fjdVar);
            return;
        }
        if (i == 2) {
            og1Var.b(fjdVar);
            return;
        }
        if (i == 3) {
            og1Var.c(fjdVar);
        } else {
            if (i == 4) {
                og1Var.d(fjdVar);
                return;
            }
            Log.w("ChannelEventParcelable", "Unknown type: " + i);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String num = i != 1 ? i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i2 = this.c;
        String num2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        StringBuilder l = xnb.l("ChannelEventParcelable[, channel=", valueOf, ", type=", num, ", closeReason=");
        l.append(num2);
        l.append(", appErrorCode=");
        l.append(this.d);
        l.append("]");
        return l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 2, this.a, i);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        bye.s(parcel, r);
    }
}
