package oh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.bb0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements il0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        int i11 = this.a;
        boolean z4 = true;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                h2 h2Var = (h2) obj3;
                o0 o0Var = (o0) view;
                t0 t0Var = o0Var.H;
                q70 F = q70.F((ViewGroup) obj2, new b(), view);
                F.p(15, -1, LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(t0Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new mh.m2(25, (i9) obj, t0Var), false);
                F.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new mh.m2(26, h2Var, o0Var), !t0Var.e);
                if (h2Var.J != UserConfig.getInstance(h2Var.K).getClientUserId() && !h2Var.f()) {
                    z4 = false;
                }
                F.l(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new mh.m2(27, h2Var, t0Var), z4);
                F.Z();
                break;
            case 1:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                bb0 bb0Var = (bb0) tVar.U2.get(i10);
                if (bb0Var.e && !UserConfig.hasPremiumOnAccounts()) {
                    p2Var.showDialog(new fg.n1(p2Var, 10, true));
                    break;
                } else if (!k7.j6.a(bb0Var)) {
                    org.telegram.ui.Cells.p pVar = new org.telegram.ui.Cells.p(context);
                    pVar.a = i10;
                    tVar.V2.w0(pVar);
                    k7.j6.b(bb0Var);
                    int i12 = org.telegram.ui.Cells.s.f;
                    sVar.b(true, true);
                    for (int i13 = 0; i13 < tVar.getChildCount(); i13++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i13);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, bb0Var);
                    break;
                }
                break;
            case 2:
                qh.i6.Q((qh.i6) obj3, (Utilities.Callback) obj2, (org.telegram.ui.ActionBar.g6) obj, view, i10);
                break;
            default:
                qh.a7.P((qh.a7) obj3, (Context) obj2, (qh.i5) obj, view, i10);
                break;
        }
    }
}
