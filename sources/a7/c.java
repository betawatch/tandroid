package a7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.j;
import h6.m;
import j$.util.Objects;
import l8.f;
import m.o3;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class c {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;

    public c(o3 o3Var, int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                Objects.requireNonNull(o3Var);
                this.b = o3Var;
                break;
            default:
                Objects.requireNonNull(o3Var);
                this.b = o3Var;
                break;
        }
    }

    public final int a() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 5;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                m mVar = (m) this.b.b;
                ViewGroup viewGroup = (ViewGroup) mVar.b;
                f fVar = (f) mVar.c;
                try {
                    Bundle bundle = new Bundle();
                    Parcel p12 = fVar.p1();
                    v7.b.b(p12, bundle);
                    fVar.t1(p12, 2);
                    l8.c.b(bundle, null);
                    Parcel o12 = fVar.o1(fVar.p1(), 8);
                    a m12 = b.m1(o12.readStrongBinder());
                    o12.recycle();
                    mVar.d = (View) b.n1(m12);
                    viewGroup.removeAllViews();
                    viewGroup.addView((View) mVar.d);
                    return;
                } catch (RemoteException e10) {
                    throw new j(e10);
                }
            default:
                m mVar2 = (m) this.b.b;
                mVar2.getClass();
                try {
                    f fVar2 = (f) mVar2.c;
                    fVar2.t1(fVar2.p1(), 3);
                    return;
                } catch (RemoteException e11) {
                    throw new j(e11);
                }
        }
    }
}
