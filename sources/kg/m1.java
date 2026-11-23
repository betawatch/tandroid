package kg;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import bi.o2;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.sr;
import org.telegram.messenger.w10;
import org.telegram.messenger.zo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bx;
import org.telegram.ui.vw;
import org.telegram.ui.w91;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements org.telegram.ui.ActionBar.q1, vw {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m1(z0 z0Var, o2 o2Var, int i7, v1 v1Var, TextView textView, w10 w10Var) {
        this.b = z0Var;
        this.c = o2Var;
        this.a = i7;
        this.d = v1Var;
        this.e = textView;
        this.f = w10Var;
    }

    @Override // org.telegram.ui.vw
    public /* synthetic */ boolean F() {
        return false;
    }

    @Override // org.telegram.ui.vw
    public /* synthetic */ boolean O(bx bxVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        z0 z0Var = (z0) this.b;
        o2 o2Var = (o2) this.c;
        v1 v1Var = (v1) this.d;
        TextView textView = (TextView) this.e;
        w10 w10Var = (w10) this.f;
        String obj = z0Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            org.telegram.messenger.g0.D3(z0Var);
            o2Var.a(Boolean.FALSE);
            return;
        }
        w1 f10 = w1.f(this.a);
        int i10 = v1Var == null ? -1 : v1Var.a;
        v1 d = f10.d(obj);
        if (d == null || d.a == i10) {
            w10Var.a(obj);
            t1Var.dismiss();
        } else {
            org.telegram.messenger.g0.D3(z0Var);
            textView.setText(gd.N0(2131752650, null));
            o2Var.a(Boolean.TRUE);
        }
    }

    @Override // org.telegram.ui.vw
    public boolean z(bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.b;
        final TLRPC.User user = (TLRPC.User) this.c;
        final String str = (String) this.d;
        final String str2 = (String) this.e;
        final bx bxVar2 = (bx) this.f;
        String str3 = LaunchActivity.C1;
        final long j3 = ((sr) arrayList.get(0)).a;
        final TLRPC.Chat O0 = mp.u1(launchActivity.P).O0(Long.valueOf(-j3));
        final int i11 = this.a;
        if (O0 == null || (!O0.creator && ((tL_chatAdminRights = O0.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String N0 = gd.N0(2131754460, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.g0.W2(gd.a0("AddMembersAlertNamesText", null, 2131754396, n10.q(user), O0 == null ? "" : O0.title));
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
            alertDialog$Builder.k(gd.N0(2131754460, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.f70
                @Override // org.telegram.ui.ActionBar.q1
                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i12) {
                    String str4 = LaunchActivity.C1;
                    Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                    long j10 = -j3;
                    k10.putLong("chat_id", j10);
                    bn bnVar = new bn(k10);
                    int i13 = i11;
                    org.telegram.messenger.ks.f(i13).k(org.telegram.messenger.ks.t, new Object[0]);
                    org.telegram.messenger.mp.u1(i13).n(j10, user, str2, bnVar, null);
                    ((ActionBarLayout) LaunchActivity.this.M()).V(bnVar, true, false);
                }
            });
            alertDialog$Builder.p();
        } else {
            mp.u1(i11).K(O0, user, new zo() { // from class: org.telegram.ui.e70
                @Override // org.telegram.messenger.zo
                public final void a(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    String str5 = LaunchActivity.C1;
                    org.telegram.messenger.g0.g3(new bi.z4(LaunchActivity.this, str, tL_chatAdminRights2, z12, str2, i11, O0, bxVar2, user, j3, str4));
                }
            });
        }
        return true;
    }

    public /* synthetic */ m1(LaunchActivity launchActivity, int i7, TLRPC.User user, String str, String str2, bx bxVar) {
        this.b = launchActivity;
        this.a = i7;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = bxVar;
    }
}
