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
import m.q3;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class c {
    public final /* synthetic */ int a;
    public final /* synthetic */ q3 b;

    public c(q3 q3Var, int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                Objects.requireNonNull(q3Var);
                this.b = q3Var;
                break;
            default:
                Objects.requireNonNull(q3Var);
                this.b = q3Var;
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
                    Parcel P0 = fVar.P0();
                    v7.b.b(P0, bundle);
                    fVar.T0(P0, 2);
                    l8.c.b(bundle, null);
                    Parcel O0 = fVar.O0(fVar.P0(), 8);
                    a M0 = b.M0(O0.readStrongBinder());
                    O0.recycle();
                    mVar.d = (View) b.N0(M0);
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
                    fVar2.T0(fVar2.P0(), 3);
                    return;
                } catch (RemoteException e11) {
                    throw new j(e11);
                }
        }
    }
}
