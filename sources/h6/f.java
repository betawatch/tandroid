package h6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.internal.cast.d0;
import com.google.android.gms.internal.cast.f0;
import com.google.android.gms.internal.cast.j0;
import f7.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR;
    public static final j0 Z;
    public static final int[] a0;
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
    public final int V;
    public final p W;
    public final boolean X;
    public final boolean Y;
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
        d0 d0Var = f0.b;
        Object[] objArr = {MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING};
        for (int i7 = 0; i7 < 2; i7++) {
            if (objArr[i7] == null) {
                throw new NullPointerException(i5.c.i(i7, "at index "));
            }
        }
        Z = f0.m(2, objArr);
        a0 = new int[]{0, 1};
        CREATOR = new t0(18);
    }

    public f(List list, int[] iArr, long j3, String str, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, IBinder iBinder, boolean z10, boolean z11) {
        p pVar;
        this.a = new ArrayList(list);
        this.b = Arrays.copyOf(iArr, iArr.length);
        this.c = j3;
        this.d = str;
        this.e = i7;
        this.f = i10;
        this.h = i11;
        this.n = i12;
        this.r = i13;
        this.s = i14;
        this.w = i15;
        this.x = i16;
        this.y = i17;
        this.E = i18;
        this.F = i19;
        this.G = i20;
        this.H = i21;
        this.I = i22;
        this.J = i23;
        this.K = i24;
        this.L = i25;
        this.M = i26;
        this.N = i27;
        this.O = i28;
        this.P = i29;
        this.Q = i30;
        this.R = i31;
        this.S = i32;
        this.T = i33;
        this.U = i34;
        this.V = i35;
        this.X = z10;
        this.Y = z11;
        if (iBinder == null) {
            pVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            pVar = queryLocalInterface instanceof p ? (p) queryLocalInterface : new p(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", 2);
        }
        this.W = pVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.n(parcel, 2, this.a);
        int[] iArr = this.b;
        yb.g(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        yb.q(parcel, 4, 8);
        parcel.writeLong(this.c);
        yb.l(parcel, 5, this.d);
        yb.q(parcel, 6, 4);
        parcel.writeInt(this.e);
        yb.q(parcel, 7, 4);
        parcel.writeInt(this.f);
        yb.q(parcel, 8, 4);
        parcel.writeInt(this.h);
        yb.q(parcel, 9, 4);
        parcel.writeInt(this.n);
        yb.q(parcel, 10, 4);
        parcel.writeInt(this.r);
        yb.q(parcel, 11, 4);
        parcel.writeInt(this.s);
        yb.q(parcel, 12, 4);
        parcel.writeInt(this.w);
        yb.q(parcel, 13, 4);
        parcel.writeInt(this.x);
        yb.q(parcel, 14, 4);
        parcel.writeInt(this.y);
        yb.q(parcel, 15, 4);
        parcel.writeInt(this.E);
        yb.q(parcel, 16, 4);
        parcel.writeInt(this.F);
        yb.q(parcel, 17, 4);
        parcel.writeInt(this.G);
        yb.q(parcel, 18, 4);
        parcel.writeInt(this.H);
        yb.q(parcel, 19, 4);
        parcel.writeInt(this.I);
        yb.q(parcel, 20, 4);
        parcel.writeInt(this.J);
        yb.q(parcel, 21, 4);
        parcel.writeInt(this.K);
        yb.q(parcel, 22, 4);
        parcel.writeInt(this.L);
        yb.q(parcel, 23, 4);
        parcel.writeInt(this.M);
        yb.q(parcel, 24, 4);
        parcel.writeInt(this.N);
        yb.q(parcel, 25, 4);
        parcel.writeInt(this.O);
        yb.q(parcel, 26, 4);
        parcel.writeInt(this.P);
        yb.q(parcel, 27, 4);
        parcel.writeInt(this.Q);
        yb.q(parcel, 28, 4);
        parcel.writeInt(this.R);
        yb.q(parcel, 29, 4);
        parcel.writeInt(this.S);
        yb.q(parcel, 30, 4);
        parcel.writeInt(this.T);
        yb.q(parcel, 31, 4);
        parcel.writeInt(this.U);
        yb.q(parcel, 32, 4);
        parcel.writeInt(this.V);
        p pVar = this.W;
        yb.f(parcel, 33, pVar == null ? null : pVar.b);
        yb.q(parcel, 34, 4);
        parcel.writeInt(this.X ? 1 : 0);
        yb.q(parcel, 35, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        yb.s(parcel, r10);
    }
}
