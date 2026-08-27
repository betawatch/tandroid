package h3;

import android.os.Bundle;
import hh.i5;
import org.telegram.ui.zf1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class q2 implements f, org.telegram.ui.ActionBar.a2, d5.k, d5.l {
    public final /* synthetic */ int a;

    public /* synthetic */ q2(int i10) {
        this.a = i10;
    }

    @Override // h3.f
    public g a(Bundle bundle) {
        switch (this.a) {
            case 0:
                Bundle bundle2 = bundle.getBundle(r2.G);
                f1 f1Var = bundle2 != null ? (f1) f1.x.a(bundle2) : f1.h;
                long j10 = bundle.getLong(r2.H, -9223372036854775807L);
                long j11 = bundle.getLong(r2.I, -9223372036854775807L);
                long j12 = bundle.getLong(r2.J, -9223372036854775807L);
                boolean z10 = bundle.getBoolean(r2.K, false);
                boolean z11 = bundle.getBoolean(r2.L, false);
                Bundle bundle3 = bundle.getBundle(r2.M);
                b1 b1Var = bundle3 != null ? (b1) b1.w.a(bundle3) : null;
                boolean z12 = bundle.getBoolean(r2.N, false);
                long j13 = bundle.getLong(r2.O, 0L);
                long j14 = bundle.getLong(r2.P, -9223372036854775807L);
                int i10 = bundle.getInt(r2.Q, 0);
                int i11 = bundle.getInt(r2.R, 0);
                long j15 = bundle.getLong(r2.S, 0L);
                r2 r2Var = new r2();
                r2Var.b(r2.E, f1Var, null, j10, j11, j12, z10, z11, b1Var, j13, j14, i10, i11, j15);
                r2Var.w = z12;
                return r2Var;
            default:
                ia.l lVar = j4.i1.n;
                Bundle bundle4 = bundle.getBundle(t2.f);
                bundle4.getClass();
                j4.i1 i1Var = (j4.i1) lVar.a(bundle4);
                int[] intArray = bundle.getIntArray(t2.h);
                int i12 = i1Var.a;
                int[] iArr = new int[i12];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle.getBooleanArray(t2.n);
                boolean[] zArr = new boolean[i12];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new t2(i1Var, bundle.getBoolean(t2.r, false), intArray, booleanArray);
        }
    }

    @Override // d5.l
    public void e(Object obj, d5.g gVar) {
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                i5.d2(new zf1(6, null));
                break;
            default:
                int i11 = i5.m1;
                break;
        }
    }

    @Override // d5.k
    public void invoke(Object obj) {
        i3.b bVar = (i3.b) obj;
        switch (this.a) {
            case 8:
                bVar.getClass();
                break;
            case 9:
                bVar.getClass();
                break;
            case 10:
                bVar.getClass();
                break;
            case 11:
                bVar.getClass();
                break;
            case 12:
                bVar.getClass();
                break;
            case 13:
                bVar.getClass();
                break;
            case 14:
                bVar.getClass();
                break;
            case 15:
                bVar.getClass();
                break;
            case 16:
                bVar.getClass();
                break;
            case 17:
                bVar.getClass();
                break;
            case 18:
                bVar.getClass();
                break;
            case 19:
                bVar.getClass();
                break;
            case 20:
                bVar.getClass();
                break;
            case 21:
                bVar.getClass();
                break;
            case 22:
                bVar.getClass();
                break;
            case 23:
                bVar.getClass();
                break;
            case 24:
                bVar.getClass();
                break;
            case 25:
                bVar.getClass();
                break;
            case 26:
            default:
                bVar.getClass();
                break;
            case 27:
                bVar.getClass();
                break;
            case 28:
                bVar.getClass();
                break;
        }
    }

    public /* synthetic */ q2(i5 i5Var) {
        this.a = 2;
    }

    public /* synthetic */ q2(i3.a aVar, int i10, int i11) {
        this.a = 18;
    }

    public /* synthetic */ q2(i3.a aVar, int i10, int i11, byte b10) {
        this.a = i11;
    }

    public /* synthetic */ q2(i3.a aVar, f1 f1Var, int i10) {
        this.a = 19;
    }

    public /* synthetic */ q2(i3.a aVar, Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ q2(i3.a aVar, Object obj, Object obj2, int i10) {
        this.a = i10;
    }

    public /* synthetic */ q2(i3.a aVar, boolean z10) {
        this.a = 10;
    }

    public /* synthetic */ q2(i3.a aVar, boolean z10, int i10, int i11) {
        this.a = i11;
    }
}
