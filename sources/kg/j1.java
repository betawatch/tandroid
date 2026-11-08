package kg;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import di.s2;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.dp;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.xr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qw;
import org.telegram.ui.w91;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements org.telegram.ui.ActionBar.r1, qw {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j1(x0 x0Var, s2 s2Var, int i7, s1 s1Var, TextView textView, c20 c20Var) {
        this.b = x0Var;
        this.c = s2Var;
        this.a = i7;
        this.d = s1Var;
        this.e = textView;
        this.f = c20Var;
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean N(ww wwVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        x0 x0Var = (x0) this.b;
        s2 s2Var = (s2) this.c;
        s1 s1Var = (s1) this.d;
        TextView textView = (TextView) this.e;
        c20 c20Var = (c20) this.f;
        String obj = x0Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            org.telegram.messenger.g0.F3(x0Var);
            s2Var.a(Boolean.FALSE);
            return;
        }
        t1 f10 = t1.f(this.a);
        int i10 = s1Var == null ? -1 : s1Var.a;
        s1 d = f10.d(obj);
        if (d == null || d.a == i10) {
            c20Var.a(obj);
            u1Var.dismiss();
        } else {
            org.telegram.messenger.g0.F3(x0Var);
            textView.setText(id.M0(2131752662, null));
            s2Var.a(Boolean.TRUE);
        }
    }

    @Override // org.telegram.ui.qw
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, w91 w91Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.b;
        final TLRPC.User user = (TLRPC.User) this.c;
        final String str = (String) this.d;
        final String str2 = (String) this.e;
        final ww wwVar2 = (ww) this.f;
        String str3 = LaunchActivity.B1;
        final long j3 = ((xr) arrayList.get(0)).a;
        final TLRPC.Chat M0 = qp.s1(launchActivity.O).M0(Long.valueOf(-j3));
        final int i11 = this.a;
        if (M0 == null || (!M0.creator && ((tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M02 = id.M0(2131754463, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M02;
            u1Var.T = org.telegram.messenger.g0.X2(id.a0("AddMembersAlertNamesText", null, 2131754399, t10.p(user), M0 == null ? "" : M0.title));
            alertDialog$Builder.h(id.M0(2131752589, null), null);
            alertDialog$Builder.k(id.M0(2131754463, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.f70
                @Override // org.telegram.ui.ActionBar.r1
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
                    String str4 = LaunchActivity.B1;
                    Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                    long j10 = -j3;
                    k10.putLong("chat_id", j10);
                    an anVar = new an(k10);
                    int i13 = i11;
                    org.telegram.messenger.qs.f(i13).k(org.telegram.messenger.qs.t, new Object[0]);
                    org.telegram.messenger.qp.s1(i13).n(j10, user, str2, anVar, null);
                    ((ActionBarLayout) LaunchActivity.this.M()).V(anVar, true, false);
                }
            });
            alertDialog$Builder.p();
        } else {
            qp.s1(i11).K(M0, user, new dp() { // from class: org.telegram.ui.e70
                @Override // org.telegram.messenger.dp
                public final void a(boolean z11, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    String str5 = LaunchActivity.B1;
                    org.telegram.messenger.g0.h3(new org.telegram.messenger.gi(LaunchActivity.this, str, tL_chatAdminRights2, z11, str2, i11, M0, wwVar2, user, j3, str4));
                }
            });
        }
        return true;
    }

    public /* synthetic */ j1(LaunchActivity launchActivity, int i7, TLRPC.User user, String str, String str2, ww wwVar) {
        this.b = launchActivity;
        this.a = i7;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = wwVar;
    }
}
