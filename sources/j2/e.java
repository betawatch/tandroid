package j2;

import android.media.AudioDeviceInfo;
import android.media.MediaDrmResetException;
import b2.k0;
import e2.m;
import e9.i0;
import m4.a0;
import m4.a1;
import m4.f1;
import m4.n;
import m4.q;
import m4.r;
import m4.z;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements m, d9.e, i5.g, z, a1, e2.h {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioDeviceInfo b(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static /* bridge */ /* synthetic */ boolean e(Object obj) {
        return obj instanceof MediaDrmResetException;
    }

    @Override // e2.h
    public void accept(Object obj) {
        f1 f1Var = (f1) obj;
        switch (this.a) {
            case 25:
                f1Var.e();
                break;
            case 26:
                f1Var.e0();
                break;
            case 27:
                f1Var.z0();
                break;
            default:
                f1Var.G0();
                break;
        }
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        return i0.z(Integer.valueOf(((v2.h) obj).a));
    }

    @Override // m4.z
    public void d(q qVar, int i10) {
        switch (this.a) {
            case 20:
                qVar.getClass();
                break;
            case 21:
                qVar.b(i10);
                break;
            default:
                qVar.getClass();
                break;
        }
    }

    @Override // m4.a1
    public Object h(a0 a0Var, r rVar, int i10) {
        switch (this.a) {
            case 23:
                a0Var.getClass();
                throw new ClassCastException();
            case 24:
                a0Var.getClass();
                throw new ClassCastException();
            default:
                return a0Var.n(rVar);
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
            default:
                bVar.getClass();
                break;
        }
    }

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.a = i10;
    }

    public /* synthetic */ e(a aVar, float f7) {
        this.a = 6;
    }

    public /* synthetic */ e(a aVar, int i10) {
        this.a = 4;
    }

    public /* synthetic */ e(a aVar, k0 k0Var, int i10) {
        this.a = 5;
    }

    public /* synthetic */ e(a aVar, boolean z10) {
        this.a = 2;
    }

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ e(String str, int i10, int i11, n nVar) {
        this.a = 24;
    }

    @Override // i5.g
    public void a(Exception exc) {
    }
}
