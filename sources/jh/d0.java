package jh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.ta0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements pk0 {
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

    @Override // org.telegram.ui.Components.pk0
    public final void a(int i10, View view) {
        int i11 = this.a;
        boolean z10 = true;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                g2 g2Var = (g2) obj3;
                n0 n0Var = (n0) view;
                s0 s0Var = n0Var.G;
                b70 F = b70.F((ViewGroup) obj2, new b(), view);
                F.p(15, -1, LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(s0Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new hh.m5(16, (i9) obj, s0Var), false);
                F.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new hh.m5(17, g2Var, n0Var), !s0Var.e);
                if (g2Var.I != UserConfig.getInstance(g2Var.J).getClientUserId() && !g2Var.f()) {
                    z10 = false;
                }
                F.l(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new hh.m5(18, g2Var, s0Var), z10);
                F.Z();
                break;
            case 1:
                lh.r7.Q((lh.r7) obj3, (Utilities.Callback) obj2, (org.telegram.ui.ActionBar.c6) obj, view, i10);
                break;
            case 2:
                lh.j8.P((lh.j8) obj3, (Context) obj2, (lh.q6) obj, view, i10);
                break;
            default:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                ta0 ta0Var = (ta0) tVar.T2.get(i10);
                if (ta0Var.e && !UserConfig.hasPremiumOnAccounts()) {
                    n2Var.showDialog(new ag.g2(n2Var, 10, true));
                    break;
                } else if (!h7.g6.a(ta0Var)) {
                    org.telegram.ui.Cells.p pVar = new org.telegram.ui.Cells.p(context);
                    pVar.a = i10;
                    tVar.U2.w0(pVar);
                    h7.g6.b(ta0Var);
                    int i12 = org.telegram.ui.Cells.s.f;
                    sVar.b(true, true);
                    for (int i13 = 0; i13 < tVar.getChildCount(); i13++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i13);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, ta0Var);
                    break;
                }
                break;
        }
    }
}
