package j2;

import android.media.AudioDeviceInfo;
import android.media.MediaDrmResetException;
import b2.k0;
import e2.m;
import e9.i0;
import m4.a0;
import m4.e1;
import m4.n;
import m4.q;
import m4.r;
import m4.z;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements m, d9.e, i5.g, z, e1 {
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

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        return i0.z(Integer.valueOf(((v2.h) obj).a));
    }

    @Override // m4.z
    public void c(q qVar, int i10) {
        switch (this.a) {
            case 23:
                qVar.getClass();
                break;
            case 24:
                qVar.b(i10);
                break;
            default:
                qVar.getClass();
                break;
        }
    }

    @Override // m4.e1
    public Object i(a0 a0Var, r rVar, int i10) {
        switch (this.a) {
            case 26:
                a0Var.getClass();
                throw new ClassCastException();
            case 27:
                a0Var.getClass();
                throw new ClassCastException();
            case 28:
                return a0Var.n(rVar);
            default:
                a0Var.getClass();
                throw new ClassCastException();
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
        this.a = 27;
    }

    @Override // i5.g
    public void a(Exception exc) {
    }
}
