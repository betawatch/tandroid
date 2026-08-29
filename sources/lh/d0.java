package lh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.sa0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements zk0 {
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

    @Override // org.telegram.ui.Components.zk0
    public final void c(int i10, View view) {
        int i11 = this.a;
        boolean z10 = true;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                f2 f2Var = (f2) obj3;
                n0 n0Var = (n0) view;
                s0 s0Var = n0Var.G;
                j70 F = j70.F((ViewGroup) obj2, new b(), view);
                F.p(15, -1, LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(s0Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new jh.w2(23, (i9) obj, s0Var), false);
                F.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new jh.w2(24, f2Var, n0Var), !s0Var.e);
                if (f2Var.I != UserConfig.getInstance(f2Var.J).getClientUserId() && !f2Var.f()) {
                    z10 = false;
                }
                F.l(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new jh.w2(25, f2Var, s0Var), z10);
                F.Z();
                break;
            case 1:
                nh.g7.Q((nh.g7) obj3, (Utilities.Callback) obj2, (org.telegram.ui.ActionBar.c6) obj, view, i10);
                break;
            case 2:
                nh.y7.P((nh.y7) obj3, (Context) obj2, (nh.f6) obj, view, i10);
                break;
            default:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                sa0 sa0Var = (sa0) tVar.T2.get(i10);
                if (sa0Var.e && !UserConfig.hasPremiumOnAccounts()) {
                    o2Var.showDialog(new cg.p1(o2Var, 10, true));
                    break;
                } else if (!i7.m6.a(sa0Var)) {
                    org.telegram.ui.Cells.p pVar = new org.telegram.ui.Cells.p(context);
                    pVar.a = i10;
                    tVar.U2.w0(pVar);
                    i7.m6.b(sa0Var);
                    int i12 = org.telegram.ui.Cells.s.f;
                    sVar.b(true, true);
                    for (int i13 = 0; i13 < tVar.getChildCount(); i13++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i13);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, sa0Var);
                    break;
                }
                break;
        }
    }
}
