package g;

import ag.y1;
import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import h7.z5;
import m.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.ro;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                Message obtain = (view != fVar.i || (message = fVar.k) == null) ? null : Message.obtain(message);
                if (obtain != null) {
                    obtain.sendToTarget();
                }
                fVar.z.obtainMessage(1, fVar.b).sendToTarget();
                break;
            case 1:
                ((k.a) this.b).a();
                break;
            case 2:
                k3 k3Var = ((Toolbar) this.b).a0;
                l.n nVar = k3Var == null ? null : k3Var.b;
                if (nVar != null) {
                    nVar.collapseActionView();
                    break;
                }
                break;
            case 3:
                ap apVar = (ap) this.b;
                rn rnVar = apVar.v;
                gi giVar = new gi(rnVar.getParentActivity(), rnVar, false, false, false, rnVar.getResourceProvider());
                apVar.U = giVar;
                giVar.drawNavigationBar = true;
                giVar.L1(LocaleController.getString(R.string.ChooseBackground));
                gi giVar2 = apVar.U;
                giVar2.V1 = new ro(apVar);
                giVar2.J1(1, false);
                apVar.U.r1();
                apVar.U.f0.f0();
                apVar.U.show();
                apVar.V = new y1(apVar, apVar.getContext());
                j6 j6Var = new j6(apVar.getContext(), true, true, true);
                apVar.W = j6Var;
                j6Var.setTextSize(AndroidUtilities.dp(14.0f));
                apVar.W.setText(LocaleController.getString(R.string.SetColorAsBackground));
                apVar.W.setGravity(17);
                j6 j6Var2 = apVar.W;
                int i10 = g6.Oh;
                j6Var2.setTextColor(apVar.getThemedColor(i10));
                apVar.V.addView(apVar.W, z5.e(-1, -2, 17));
                y1 y1Var = apVar.V;
                int dp = AndroidUtilities.dp(0.0f);
                int themedColor = apVar.getThemedColor(g6.d6);
                int k10 = i0.b.k(apVar.getThemedColor(i10), 76);
                y1Var.setBackground(g6.i0(dp, dp, dp, dp, themedColor, k10, k10));
                apVar.V.setOnClickListener(new jo(apVar, 0));
                apVar.U.n1.addView(apVar.V, z5.e(-1, -2, 80));
                break;
            case 4:
                p60 p60Var = (p60) this.b;
                a30 a30Var = (a30) view;
                if (!a30Var.y) {
                    a30 a30Var2 = p60Var.f0;
                    if (a30Var2 != null) {
                        a30Var2.a();
                    }
                    p60Var.f0 = a30Var;
                    a30Var.b();
                    break;
                } else {
                    p60Var.f0 = null;
                    p60Var.b0.l(a30Var.getUid());
                    p60Var.Q.b(a30Var);
                    p60Var.a0(true);
                    AndroidUtilities.updateVisibleRows(p60Var.d);
                    break;
                }
            default:
                ((i80) this.b).e.callOnClick();
                break;
        }
    }
}
