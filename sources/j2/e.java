package j2;

import android.media.AudioDeviceInfo;
import android.media.MediaDrmResetException;
import b2.k0;
import e2.m;
import e9.i0;
import java.util.List;
import m4.a0;
import m4.e1;
import m4.f1;
import m4.k1;
import m4.n;
import m4.q;
import m4.q1;
import m4.r;
import m4.z;
import v7.l8;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements m, d9.e, i5.g, z, f1, e1 {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioDeviceInfo b(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static /* bridge */ /* synthetic */ boolean f(Object obj) {
        return obj instanceof MediaDrmResetException;
    }

    @Override // m4.e1
    public void a(k1 k1Var, r rVar, List list) {
        k1Var.v0(list);
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        return i0.z(Integer.valueOf(((v2.h) obj).a));
    }

    @Override // m4.z
    public void d(q qVar, int i10) {
        switch (this.a) {
            case 21:
                qVar.getClass();
                break;
            case 22:
                qVar.b(i10);
                break;
            default:
                qVar.getClass();
                break;
        }
    }

    @Override // m4.f1
    public Object h(a0 a0Var, r rVar, int i10) {
        switch (this.a) {
            case 24:
                a0Var.getClass();
                throw new ClassCastException();
            case 25:
                a0Var.getClass();
                throw new ClassCastException();
            case 26:
                return a0Var.n(rVar);
            case 27:
                a0Var.getClass();
                throw new ClassCastException();
            default:
                na.d dVar = a0Var.e;
                a0Var.s(rVar);
                dVar.getClass();
                return l8.b(new q1(-6));
        }
    }

    @Override // e2.m
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.a) {
            case 0:
                bVar.getClass();
                break;
            case 1:
                bVar.getClass();
                break;
            case 2:
                bVar.getClass();
                break;
            case 3:
                bVar.getClass();
                break;
            case 4:
                bVar.getClass();
                break;
            case 5:
                bVar.getClass();
                break;
            case 6:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.a = i10;
    }

    public /* synthetic */ e(a aVar, float f7) {
        this.a = 7;
    }

    public /* synthetic */ e(a aVar, int i10) {
        this.a = 5;
    }

    public /* synthetic */ e(a aVar, k0 k0Var, int i10) {
        this.a = 6;
    }

    public /* synthetic */ e(a aVar, boolean z10) {
        this.a = 3;
    }

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ e(String str, int i10, int i11, n nVar) {
        this.a = 25;
    }

    @Override // i5.g
    public void c(Exception exc) {
    }
}
