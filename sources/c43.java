// default package

import android.database.DataSetObserver;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class c43 extends DataSetObserver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c43(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                kbb kbbVar = (kbb) obj;
                kbbVar.a = true;
                kbbVar.notifyDataSetChanged();
                break;
            case 1:
                o56 o56Var = (o56) obj;
                if (o56Var.P.isShowing()) {
                    o56Var.f();
                    break;
                }
                break;
            case 2:
                mo8 mo8Var = (mo8) obj;
                ProfileActivity profileActivity = mo8Var.n;
                int realCount = profileActivity.o0.getRealCount();
                if (profileActivity.B0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.F) {
                    profileActivity.B0 = (byte) 1;
                }
                mo8Var.a(false);
                mo8Var.b(1.0f);
                if (profileActivity.r0 != null) {
                    if (!profileActivity.T0.y()) {
                        mo8Var.c();
                        break;
                    } else {
                        gl.e3(new w88(mo8Var, (byte) 24), 500L);
                        break;
                    }
                }
                break;
            default:
                ((gec) obj).f();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                kbb kbbVar = (kbb) obj;
                kbbVar.a = false;
                kbbVar.notifyDataSetInvalidated();
                break;
            case 1:
                ((o56) obj).dismiss();
                break;
            case 2:
            default:
                super.onInvalidated();
                break;
            case 3:
                ((gec) obj).f();
                break;
        }
    }
}
