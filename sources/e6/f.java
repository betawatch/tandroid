package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c7.r0;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.internal.cast.e0;
import com.google.android.gms.internal.cast.g0;
import com.google.android.gms.internal.cast.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR;
    public static final l0 Y;
    public static final int[] Z;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final o V;
    public final boolean W;
    public final boolean X;
    public final ArrayList a;
    public final int[] b;
    public final long c;
    public final String d;
    public final int e;
    public final int f;
    public final int h;
    public final int n;
    public final int r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    static {
        e0 e0Var = g0.b;
        Object[] objArr = {MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING};
        for (int i10 = 0; i10 < 2; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(i0.a.i(i10, "at index "));
            }
        }
        Y = g0.q(2, objArr);
        Z = new int[]{0, 1};
        CREATOR = new r0(29);
    }

    public f(List list, int[] iArr, long j10, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, IBinder iBinder, boolean z10, boolean z11) {
        o oVar;
        this.a = new ArrayList(list);
        this.b = Arrays.copyOf(iArr, iArr.length);
        this.c = j10;
        this.d = str;
        this.e = i10;
        this.f = i11;
        this.h = i12;
        this.n = i13;
        this.r = i14;
        this.s = i15;
        this.w = i16;
        this.x = i17;
        this.y = i18;
        this.D = i19;
        this.E = i20;
        this.F = i21;
        this.G = i22;
        this.H = i23;
        this.I = i24;
        this.J = i25;
        this.K = i26;
        this.L = i27;
        this.M = i28;
        this.N = i29;
        this.O = i30;
        this.P = i31;
        this.Q = i32;
        this.R = i33;
        this.S = i34;
        this.T = i35;
        this.U = i36;
        this.W = z10;
        this.X = z11;
        if (iBinder == null) {
            oVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            oVar = queryLocalInterface instanceof o ? (o) queryLocalInterface : new o(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", 1);
        }
        this.V = oVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.n(parcel, 2, this.a);
        int[] iArr = this.b;
        h0.g(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        h0.s(parcel, 4, 8);
        parcel.writeLong(this.c);
        h0.l(parcel, 5, this.d);
        h0.s(parcel, 6, 4);
        parcel.writeInt(this.e);
        h0.s(parcel, 7, 4);
        parcel.writeInt(this.f);
        h0.s(parcel, 8, 4);
        parcel.writeInt(this.h);
        h0.s(parcel, 9, 4);
        parcel.writeInt(this.n);
        h0.s(parcel, 10, 4);
        parcel.writeInt(this.r);
        h0.s(parcel, 11, 4);
        parcel.writeInt(this.s);
        h0.s(parcel, 12, 4);
        parcel.writeInt(this.w);
        h0.s(parcel, 13, 4);
        parcel.writeInt(this.x);
        h0.s(parcel, 14, 4);
        parcel.writeInt(this.y);
        h0.s(parcel, 15, 4);
        parcel.writeInt(this.D);
        h0.s(parcel, 16, 4);
        parcel.writeInt(this.E);
        h0.s(parcel, 17, 4);
        parcel.writeInt(this.F);
        h0.s(parcel, 18, 4);
        parcel.writeInt(this.G);
        h0.s(parcel, 19, 4);
        parcel.writeInt(this.H);
        h0.s(parcel, 20, 4);
        parcel.writeInt(this.I);
        h0.s(parcel, 21, 4);
        parcel.writeInt(this.J);
        h0.s(parcel, 22, 4);
        parcel.writeInt(this.K);
        h0.s(parcel, 23, 4);
        parcel.writeInt(this.L);
        h0.s(parcel, 24, 4);
        parcel.writeInt(this.M);
        h0.s(parcel, 25, 4);
        parcel.writeInt(this.N);
        h0.s(parcel, 26, 4);
        parcel.writeInt(this.O);
        h0.s(parcel, 27, 4);
        parcel.writeInt(this.P);
        h0.s(parcel, 28, 4);
        parcel.writeInt(this.Q);
        h0.s(parcel, 29, 4);
        parcel.writeInt(this.R);
        h0.s(parcel, 30, 4);
        parcel.writeInt(this.S);
        h0.s(parcel, 31, 4);
        parcel.writeInt(this.T);
        h0.s(parcel, 32, 4);
        parcel.writeInt(this.U);
        o oVar = this.V;
        h0.f(parcel, 33, oVar == null ? null : oVar.b);
        h0.s(parcel, 34, 4);
        parcel.writeInt(this.W ? 1 : 0);
        h0.s(parcel, 35, 4);
        parcel.writeInt(this.X ? 1 : 0);
        h0.r(parcel, q6);
    }
}
