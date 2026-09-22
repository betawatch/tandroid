package ai;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.y70;
import org.telegram.ui.nb0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class u0 implements ml0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        int i11 = this.a;
        int i12 = 5;
        boolean z10 = true;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                r3 r3Var = (r3) obj3;
                h1 h1Var = (h1) view;
                m1 m1Var = h1Var.K;
                y70 F = y70.F((ViewGroup) obj2, new d(), view);
                F.p(15, -1, LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(m1Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new a1.e(i12, (jc) obj, m1Var), false);
                F.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new a1.e(6, r3Var, h1Var), !m1Var.e);
                if (r3Var.M != UserConfig.getInstance(r3Var.N).getClientUserId() && !r3Var.f()) {
                    z10 = false;
                }
                F.l(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new a1.e(7, r3Var, m1Var), z10);
                F.Z();
                break;
            case 1:
                ci.g8.R((ci.g8) obj3, (Utilities.Callback) obj2, (org.telegram.ui.ActionBar.f6) obj, view, i10);
                break;
            case 2:
                ci.x8.P((ci.x8) obj3, (Context) obj2, (ci.d7) obj, view, i10);
                break;
            default:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                nb0 nb0Var = (nb0) tVar.X2.get(i10);
                if (nb0Var.e && !UserConfig.hasPremiumOnAccounts()) {
                    n2Var.showDialog(new rg.x0(n2Var, 10, true));
                    break;
                } else if (!w7.f6.a(nb0Var)) {
                    org.telegram.ui.Cells.p pVar = new org.telegram.ui.Cells.p(context);
                    pVar.a = i10;
                    tVar.Y2.w0(pVar);
                    w7.f6.b(nb0Var);
                    int i13 = org.telegram.ui.Cells.s.f;
                    sVar.b(true, true);
                    for (int i14 = 0; i14 < tVar.getChildCount(); i14++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i14);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, nb0Var);
                    break;
                }
                break;
        }
    }
}
