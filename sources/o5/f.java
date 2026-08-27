package o5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.internal.cast.e0;
import com.google.android.gms.internal.cast.g0;
import com.google.android.gms.internal.cast.l0;
import h7.r8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n6.w0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends z5.a {
    public static final Parcelable.Creator<f> CREATOR;
    public static final l0 U;
    public static final int[] V;
    public final int A;
    public final int B;
    public final int C;
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
    public final o R;
    public final boolean S;
    public final boolean T;
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
    public final int v;
    public final int w;
    public final int x;
    public final int y;

    static {
        e0 e0Var = g0.b;
        Object[] objArr = {MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING};
        for (int i10 = 0; i10 < 2; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(i0.a.k(i10, "at index "));
            }
        }
        U = g0.r(2, objArr);
        V = new int[]{0, 1};
        CREATOR = new w0(7);
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
        this.v = i16;
        this.w = i17;
        this.x = i18;
        this.y = i19;
        this.A = i20;
        this.B = i21;
        this.C = i22;
        this.D = i23;
        this.E = i24;
        this.F = i25;
        this.G = i26;
        this.H = i27;
        this.I = i28;
        this.J = i29;
        this.K = i30;
        this.L = i31;
        this.M = i32;
        this.N = i33;
        this.O = i34;
        this.P = i35;
        this.Q = i36;
        this.S = z10;
        this.T = z11;
        if (iBinder == null) {
            oVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            oVar = queryLocalInterface instanceof o ? (o) queryLocalInterface : new o(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", 1);
        }
        this.R = oVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.n(parcel, 2, this.a);
        int[] iArr = this.b;
        r8.g(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        r8.s(parcel, 4, 8);
        parcel.writeLong(this.c);
        r8.l(parcel, 5, this.d);
        r8.s(parcel, 6, 4);
        parcel.writeInt(this.e);
        r8.s(parcel, 7, 4);
        parcel.writeInt(this.f);
        r8.s(parcel, 8, 4);
        parcel.writeInt(this.h);
        r8.s(parcel, 9, 4);
        parcel.writeInt(this.n);
        r8.s(parcel, 10, 4);
        parcel.writeInt(this.r);
        r8.s(parcel, 11, 4);
        parcel.writeInt(this.s);
        r8.s(parcel, 12, 4);
        parcel.writeInt(this.v);
        r8.s(parcel, 13, 4);
        parcel.writeInt(this.w);
        r8.s(parcel, 14, 4);
        parcel.writeInt(this.x);
        r8.s(parcel, 15, 4);
        parcel.writeInt(this.y);
        r8.s(parcel, 16, 4);
        parcel.writeInt(this.A);
        r8.s(parcel, 17, 4);
        parcel.writeInt(this.B);
        r8.s(parcel, 18, 4);
        parcel.writeInt(this.C);
        r8.s(parcel, 19, 4);
        parcel.writeInt(this.D);
        r8.s(parcel, 20, 4);
        parcel.writeInt(this.E);
        r8.s(parcel, 21, 4);
        parcel.writeInt(this.F);
        r8.s(parcel, 22, 4);
        parcel.writeInt(this.G);
        r8.s(parcel, 23, 4);
        parcel.writeInt(this.H);
        r8.s(parcel, 24, 4);
        parcel.writeInt(this.I);
        r8.s(parcel, 25, 4);
        parcel.writeInt(this.J);
        r8.s(parcel, 26, 4);
        parcel.writeInt(this.K);
        r8.s(parcel, 27, 4);
        parcel.writeInt(this.L);
        r8.s(parcel, 28, 4);
        parcel.writeInt(this.M);
        r8.s(parcel, 29, 4);
        parcel.writeInt(this.N);
        r8.s(parcel, 30, 4);
        parcel.writeInt(this.O);
        r8.s(parcel, 31, 4);
        parcel.writeInt(this.P);
        r8.s(parcel, 32, 4);
        parcel.writeInt(this.Q);
        o oVar = this.R;
        r8.f(parcel, 33, oVar == null ? null : oVar.b);
        r8.s(parcel, 34, 4);
        parcel.writeInt(this.S ? 1 : 0);
        r8.s(parcel, 35, 4);
        parcel.writeInt(this.T ? 1 : 0);
        r8.r(parcel, q6);
    }
}
