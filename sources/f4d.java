// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class f4d {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pr2 b;

    public f4d(pr2 pr2Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                Objects.requireNonNull(pr2Var);
                this.b = pr2Var;
                break;
            default:
                Objects.requireNonNull(pr2Var);
                this.b = pr2Var;
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
        byte b = this.a;
        pr2 pr2Var = this.b;
        switch (b) {
            case 0:
                wm9 wm9Var = (wm9) pr2Var.a;
                su suVar = (su) wm9Var.b;
                mye myeVar = (mye) wm9Var.c;
                try {
                    Bundle bundle = new Bundle();
                    Parcel R = myeVar.R();
                    tid.b(R, bundle);
                    myeVar.V(R, 2);
                    pjd.b(bundle, null);
                    Parcel Q = myeVar.Q(myeVar.R(), 8);
                    xk5 T = eq7.T(Q.readStrongBinder());
                    Q.recycle();
                    wm9Var.d = (View) eq7.U(T);
                    suVar.removeAllViews();
                    suVar.addView((View) wm9Var.d);
                    break;
                } catch (RemoteException e) {
                    i2d.h(e);
                    return;
                }
            default:
                wm9 wm9Var2 = (wm9) pr2Var.a;
                wm9Var2.getClass();
                try {
                    mye myeVar2 = (mye) wm9Var2.c;
                    myeVar2.V(myeVar2.R(), 3);
                    break;
                } catch (RemoteException e2) {
                    i2d.h(e2);
                }
        }
    }
}
