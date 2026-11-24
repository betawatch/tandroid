// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hd2 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xd2 b;

    public /* synthetic */ hd2(xd2 xd2Var, byte b) {
        this.a = b;
        this.b = xd2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        byte b2 = 1;
        xd2 xd2Var = this.b;
        switch (b) {
            case 0:
                x02 x02Var = xd2Var.R1;
                p02 p02Var = x02Var.v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x02Var.d2;
                hn hnVar = xd2Var.T1;
                if (p02Var != chatAttachAlertPhotoLayout) {
                    hnVar.setText(k96.M0(2131745345, null));
                    x02 x02Var2 = xd2Var.R1;
                    x02Var2.A1(x02Var2.d2);
                    break;
                } else {
                    hnVar.setText(k96.M0(2131752126, null));
                    x02 x02Var3 = xd2Var.R1;
                    if (x02Var3.l2 == null) {
                        Context context = x02Var3.getContext();
                        wjb wjbVar = x02Var3.J0;
                        v12 v12Var = new v12(x02Var3, wjbVar, context);
                        v12Var.r = gl.L(80.0f);
                        v12Var.x = (byte) 3;
                        fu fuVar = new fu(v12Var, context, wjbVar, (byte) 7);
                        v12Var.n = fuVar;
                        dy0 dy0Var = new dy0(v12Var, context);
                        v12Var.w = dy0Var;
                        fuVar.setAdapter(dy0Var);
                        fuVar.setClipToPadding(false);
                        fuVar.setItemAnimator(null);
                        fuVar.setLayoutAnimation(null);
                        fuVar.setVerticalScrollBarEnabled(false);
                        zkb.l(fuVar, 21, bkb.z5, wjbVar);
                        v12Var.addView(fuVar, nme.c(-1.0f, -1));
                        fuVar.setOnScrollListener(new y(v12Var, (byte) 17));
                        ar0 ar0Var = new ar0(v12Var, v12Var.r, b2);
                        v12Var.s = ar0Var;
                        ar0Var.O = new nq1(v12Var, b2);
                        fuVar.setLayoutManager(ar0Var);
                        x02Var3.l2 = v12Var;
                        v12Var.setDelegate(new gw(x02Var3, (byte) 4));
                    }
                    x02Var3.A1(x02Var3.l2);
                    v12 v12Var2 = xd2Var.R1.l2;
                    boolean z = xd2Var.G1;
                    dy0 dy0Var2 = v12Var2.w;
                    ((ArrayList) dy0Var2.e).clear();
                    WallpapersListActivity.z0((ArrayList) dy0Var2.e, z);
                    dy0Var2.f();
                    break;
                }
            case 1:
                if (!xd2Var.J0()) {
                    xd2Var.dismiss();
                    break;
                } else {
                    xd2Var.N0(true);
                    xd2Var.U0(true);
                    break;
                }
            case 2:
                if (xd2Var.M1 == null) {
                    xd2Var.P0(!xd2Var.G1);
                    break;
                }
                break;
            default:
                xd2Var.E0(false);
                break;
        }
    }
}
