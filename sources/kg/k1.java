package kg;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ap;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.ur;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sw;
import org.telegram.ui.u91;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements org.telegram.ui.ActionBar.q1, sw {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k1(x0 x0Var, bi.o1 o1Var, int i7, u1 u1Var, TextView textView, z10 z10Var) {
        this.b = x0Var;
        this.c = o1Var;
        this.a = i7;
        this.d = u1Var;
        this.e = textView;
        this.f = z10Var;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean P(yw ywVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        x0 x0Var = (x0) this.b;
        bi.o1 o1Var = (bi.o1) this.c;
        u1 u1Var = (u1) this.d;
        TextView textView = (TextView) this.e;
        z10 z10Var = (z10) this.f;
        String obj = x0Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            org.telegram.messenger.g0.E3(x0Var);
            o1Var.a(Boolean.FALSE);
            return;
        }
        v1 f10 = v1.f(this.a);
        int i10 = u1Var == null ? -1 : u1Var.a;
        u1 d = f10.d(obj);
        if (d == null || d.a == i10) {
            z10Var.a(obj);
            t1Var.dismiss();
        } else {
            org.telegram.messenger.g0.E3(x0Var);
            textView.setText(hd.M0(2131752662, null));
            o1Var.a(Boolean.TRUE);
        }
    }

    @Override // org.telegram.ui.sw
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.b;
        final TLRPC.User user = (TLRPC.User) this.c;
        final String str = (String) this.d;
        final String str2 = (String) this.e;
        final yw ywVar2 = (yw) this.f;
        String str3 = LaunchActivity.C1;
        final long j3 = ((ur) arrayList.get(0)).a;
        final TLRPC.Chat M0 = np.s1(launchActivity.P).M0(Long.valueOf(-j3));
        final int i11 = this.a;
        if (M0 == null || (!M0.creator && ((tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M02 = hd.M0(2131754463, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M02;
            t1Var.U = org.telegram.messenger.g0.X2(hd.a0("AddMembersAlertNamesText", null, 2131754399, q10.p(user), M0 == null ? "" : M0.title));
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
            alertDialog$Builder.k(hd.M0(2131754463, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.d70
                @Override // org.telegram.ui.ActionBar.q1
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
                    String str4 = LaunchActivity.C1;
                    Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                    long j10 = -j3;
                    k10.putLong("chat_id", j10);
                    an anVar = new an(k10);
                    int i13 = i11;
                    org.telegram.messenger.ns.f(i13).k(org.telegram.messenger.ns.t, new Object[0]);
                    org.telegram.messenger.np.s1(i13).n(j10, user, str2, anVar, null);
                    ((ActionBarLayout) LaunchActivity.this.M()).V(anVar, true, false);
                }
            });
            alertDialog$Builder.p();
        } else {
            np.s1(i11).K(M0, user, new ap() { // from class: org.telegram.ui.c70
                @Override // org.telegram.messenger.ap
                public final void a(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    String str5 = LaunchActivity.C1;
                    org.telegram.messenger.g0.h3(new org.telegram.messenger.ei(LaunchActivity.this, str, tL_chatAdminRights2, z12, str2, i11, M0, ywVar2, user, j3, str4));
                }
            });
        }
        return true;
    }

    public /* synthetic */ k1(LaunchActivity launchActivity, int i7, TLRPC.User user, String str, String str2, yw ywVar) {
        this.b = launchActivity;
        this.a = i7;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = ywVar;
    }
}
