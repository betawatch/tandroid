package bi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.lb0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class b9 implements jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b9(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void d(int i10, View view) {
        int i11 = this.a;
        int i12 = 5;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                i9.R((i9) obj3, (Utilities.Callback) obj2, (org.telegram.ui.ActionBar.f6) obj, view, i10);
                break;
            case 1:
                aa.P((aa) obj3, (Context) obj2, (e8) obj, view, i10);
                break;
            case 2:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                lb0 lb0Var = (lb0) tVar.X2.get(i10);
                if (lb0Var.e && !UserConfig.hasPremiumOnAccounts()) {
                    p2Var.showDialog(new qg.a1(p2Var, 10, true));
                    break;
                } else if (!w7.h6.a(lb0Var)) {
                    org.telegram.ui.Cells.p pVar = new org.telegram.ui.Cells.p(context);
                    pVar.a = i10;
                    tVar.Y2.w0(pVar);
                    w7.h6.b(lb0Var);
                    int i13 = org.telegram.ui.Cells.s.f;
                    sVar.b(true, true);
                    for (int i14 = 0; i14 < tVar.getChildCount(); i14++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i14);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, lb0Var);
                    break;
                }
                break;
            default:
                zh.o1 o1Var = (zh.o1) obj3;
                zh.f0 f0Var = (zh.f0) view;
                zh.k0 k0Var = f0Var.K;
                w70 F = w70.F((ViewGroup) obj2, new zh.b(), view);
                F.p(15, -1, LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(k0Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new yg.q(4, (zh.u7) obj, k0Var), false);
                F.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new yg.q(i12, o1Var, f0Var), !k0Var.e);
                F.l(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new yg.q(6, o1Var, k0Var), o1Var.M == UserConfig.getInstance(o1Var.N).getClientUserId() || o1Var.f());
                F.Z();
                break;
        }
    }
}
