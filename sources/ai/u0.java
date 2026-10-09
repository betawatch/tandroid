package ai;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.jb0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u0 implements em0 {
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

    @Override // org.telegram.ui.Components.em0
    public final void d(int i10, View view) {
        int i11 = this.a;
        int i12 = 5;
        boolean z10 = true;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                s3 s3Var = (s3) obj3;
                h1 h1Var = (h1) view;
                m1 m1Var = h1Var.K;
                p80 F = p80.F((ViewGroup) obj2, new d(), view);
                F.p(15, -1, LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(m1Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new a1.f(i12, (kc) obj, m1Var), false);
                F.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new a1.f(6, s3Var, h1Var), !m1Var.e);
                if (s3Var.M != UserConfig.getInstance(s3Var.N).getClientUserId() && !s3Var.f()) {
                    z10 = false;
                }
                F.l(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new a1.f(7, s3Var, m1Var), z10);
                F.Z();
                break;
            case 1:
                ci.d8.R((ci.d8) obj3, (Utilities.Callback) obj2, (org.telegram.ui.ActionBar.e6) obj, view, i10);
                break;
            case 2:
                ci.u8.Q((ci.u8) obj3, (Context) obj2, (ci.b7) obj, view, i10);
                break;
            default:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                jb0 jb0Var = (jb0) tVar.V2.get(i10);
                if (jb0Var.e && !UserConfig.hasPremiumOnAccounts()) {
                    n2Var.showDialog(new rg.y0(n2Var, 10, true));
                    break;
                } else if (!w7.e6.a(jb0Var)) {
                    org.telegram.ui.Cells.p pVar = new org.telegram.ui.Cells.p(context);
                    pVar.a = i10;
                    tVar.W2.w0(pVar);
                    w7.e6.b(jb0Var);
                    int i13 = org.telegram.ui.Cells.s.f;
                    sVar.b(true, true);
                    for (int i14 = 0; i14 < tVar.getChildCount(); i14++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i14);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, jb0Var);
                    break;
                }
                break;
        }
    }
}
