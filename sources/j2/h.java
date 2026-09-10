package j2;

import android.media.AudioDeviceInfo;
import android.media.MediaDrmResetException;
import e9.i0;
import java.util.List;
import m4.a0;
import m4.b0;
import m4.f1;
import m4.g1;
import m4.l1;
import m4.n;
import m4.q;
import m4.r;
import m4.r1;
import v7.o8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements d9.e, i5.g, a0, g1, f1 {
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioDeviceInfo c(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static /* bridge */ /* synthetic */ boolean f(Object obj) {
        return obj instanceof MediaDrmResetException;
    }

    @Override // m4.f1
    public void a(l1 l1Var, r rVar, List list) {
        switch (this.a) {
            case 21:
                l1Var.v0(list);
                break;
            default:
                l1Var.v0(list);
                break;
        }
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        return i0.z(Integer.valueOf(((v2.h) obj).a));
    }

    @Override // m4.a0
    public void d(q qVar, int i10) {
        switch (this.a) {
            case 13:
                qVar.getClass();
                break;
            case 14:
                qVar.b(i10);
                break;
            default:
                qVar.getClass();
                break;
        }
    }

    @Override // m4.g1
    public Object i(b0 b0Var, r rVar, int i10) {
        switch (this.a) {
            case 16:
                b0Var.getClass();
                throw new ClassCastException();
            case 17:
                b0Var.getClass();
                throw new ClassCastException();
            case 18:
                return b0Var.n(rVar);
            case 19:
                b0Var.getClass();
                throw new ClassCastException();
            case 20:
                na.d dVar = b0Var.e;
                b0Var.s(rVar);
                dVar.getClass();
                return o8.b(new r1(-6));
            case 21:
            case 22:
            default:
                na.d dVar2 = b0Var.e;
                b0Var.s(rVar);
                dVar2.getClass();
                return o8.b(new r1(-6));
            case 23:
                b0Var.getClass();
                throw new ClassCastException();
            case 24:
                b0Var.getClass();
                throw new ClassCastException();
            case 25:
                b0Var.getClass();
                throw new ClassCastException();
            case 26:
                b0Var.getClass();
                throw new ClassCastException();
        }
    }

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.a = i10;
    }

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ h(String str, int i10, int i11, n nVar, int i12) {
        this.a = i12;
    }

    @Override // i5.g
    public void b(Exception exc) {
    }
}
