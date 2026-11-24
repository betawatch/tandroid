// default package

import android.database.DataSetObserver;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n53 extends DataSetObserver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n53(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                mdb mdbVar = (mdb) obj;
                mdbVar.a = true;
                mdbVar.notifyDataSetChanged();
                break;
            case 1:
                o76 o76Var = (o76) obj;
                if (o76Var.P.isShowing()) {
                    o76Var.f();
                    break;
                }
                break;
            case 2:
                nq8 nq8Var = (nq8) obj;
                ProfileActivity profileActivity = nq8Var.n;
                int realCount = profileActivity.o0.getRealCount();
                if (profileActivity.B0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.F) {
                    profileActivity.B0 = (byte) 1;
                }
                nq8Var.a(false);
                nq8Var.b(1.0f);
                if (profileActivity.r0 != null) {
                    if (!profileActivity.T0.y()) {
                        nq8Var.c();
                        break;
                    } else {
                        gm.d3(new pp8(nq8Var, (byte) 2), 500L);
                        break;
                    }
                }
                break;
            default:
                ((ggc) obj).f();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                mdb mdbVar = (mdb) obj;
                mdbVar.a = false;
                mdbVar.notifyDataSetInvalidated();
                break;
            case 1:
                ((o76) obj).dismiss();
                break;
            case 2:
            default:
                super.onInvalidated();
                break;
            case 3:
                ((ggc) obj).f();
                break;
        }
    }
}
