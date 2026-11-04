package lg;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.pr;
import org.telegram.messenger.u10;
import org.telegram.messenger.uo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m91;
import org.telegram.ui.nw;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements org.telegram.ui.ActionBar.p1, nw {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k1(y0 y0Var, ai.v1 v1Var, int i3, t1 t1Var, TextView textView, u10 u10Var) {
        this.b = y0Var;
        this.c = v1Var;
        this.a = i3;
        this.d = t1Var;
        this.e = textView;
        this.f = u10Var;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean N(uw uwVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        y0 y0Var = (y0) this.b;
        ai.v1 v1Var = (ai.v1) this.c;
        t1 t1Var = (t1) this.d;
        TextView textView = (TextView) this.e;
        u10 u10Var = (u10) this.f;
        String obj = y0Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            org.telegram.messenger.g0.F3(y0Var);
            v1Var.a(Boolean.FALSE);
            return;
        }
        u1 f10 = u1.f(this.a);
        int i10 = t1Var == null ? -1 : t1Var.a;
        t1 d = f10.d(obj);
        if (d == null || d.a == i10) {
            u10Var.a(obj);
            s1Var.dismiss();
        } else {
            org.telegram.messenger.g0.F3(y0Var);
            textView.setText(bd.M0(2131752662, null));
            v1Var.a(Boolean.TRUE);
        }
    }

    @Override // org.telegram.ui.nw
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.b;
        final TLRPC.User user = (TLRPC.User) this.c;
        final String str = (String) this.d;
        final String str2 = (String) this.e;
        final uw uwVar2 = (uw) this.f;
        String str3 = LaunchActivity.E1;
        final long j10 = ((pr) arrayList.get(0)).a;
        final TLRPC.Chat M0 = hp.s1(launchActivity.P).M0(Long.valueOf(-j10));
        final int i11 = this.a;
        if (M0 == null || (!M0.creator && ((tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M02 = bd.M0(2131754463, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M02;
            s1Var.U = org.telegram.messenger.g0.X2(bd.a0("AddMembersAlertNamesText", null, 2131754399, l10.p(user), M0 == null ? "" : M0.title));
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
            alertDialog$Builder.k(bd.M0(2131754463, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.z60
                @Override // org.telegram.ui.ActionBar.p1
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i12) {
                    String str4 = LaunchActivity.E1;
                    Bundle k10 = a1.g.k("scrollToTopOnResume", true);
                    long j11 = -j10;
                    k10.putLong("chat_id", j11);
                    wm wmVar = new wm(k10);
                    int i13 = i11;
                    org.telegram.messenger.hs.f(i13).k(org.telegram.messenger.hs.t, new Object[0]);
                    org.telegram.messenger.hp.s1(i13).n(j11, user, str2, wmVar, null);
                    ((ActionBarLayout) LaunchActivity.this.M()).V(wmVar, true, false);
                }
            });
            alertDialog$Builder.p();
        } else {
            hp.s1(i11).K(M0, user, new uo() { // from class: org.telegram.ui.y60
                @Override // org.telegram.messenger.uo
                public final void a(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    String str5 = LaunchActivity.E1;
                    org.telegram.messenger.g0.h3(new org.telegram.messenger.xh(LaunchActivity.this, str, tL_chatAdminRights2, z12, str2, i11, M0, uwVar2, user, j10, str4));
                }
            });
        }
        return true;
    }

    public /* synthetic */ k1(LaunchActivity launchActivity, int i3, TLRPC.User user, String str, String str2, uw uwVar) {
        this.b = launchActivity;
        this.a = i3;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = uwVar;
    }
}
