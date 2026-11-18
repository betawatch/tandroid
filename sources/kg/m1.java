package kg;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import bi.i2;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.sr;
import org.telegram.messenger.x10;
import org.telegram.messenger.zo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
import org.telegram.ui.ww;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements org.telegram.ui.ActionBar.r1, ww {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m1(a1 a1Var, i2 i2Var, int i7, v1 v1Var, TextView textView, x10 x10Var) {
        this.b = a1Var;
        this.c = i2Var;
        this.a = i7;
        this.d = v1Var;
        this.e = textView;
        this.f = x10Var;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean P(cx cxVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        a1 a1Var = (a1) this.b;
        i2 i2Var = (i2) this.c;
        v1 v1Var = (v1) this.d;
        TextView textView = (TextView) this.e;
        x10 x10Var = (x10) this.f;
        String obj = a1Var.getText().toString();
        if (obj.length() <= 0 || obj.length() > 32) {
            org.telegram.messenger.g0.D3(a1Var);
            i2Var.a(Boolean.FALSE);
            return;
        }
        w1 f10 = w1.f(this.a);
        int i10 = v1Var == null ? -1 : v1Var.a;
        v1 d = f10.d(obj);
        if (d == null || d.a == i10) {
            x10Var.a(obj);
            u1Var.dismiss();
        } else {
            org.telegram.messenger.g0.D3(a1Var);
            textView.setText(gd.M0(2131752651, null));
            i2Var.a(Boolean.TRUE);
        }
    }

    @Override // org.telegram.ui.ww
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final LaunchActivity launchActivity = (LaunchActivity) this.b;
        final TLRPC.User user = (TLRPC.User) this.c;
        final String str = (String) this.d;
        final String str2 = (String) this.e;
        final cx cxVar2 = (cx) this.f;
        String str3 = LaunchActivity.C1;
        final long j3 = ((sr) arrayList.get(0)).a;
        final TLRPC.Chat O0 = mp.u1(launchActivity.P).O0(Long.valueOf(-j3));
        final int i11 = this.a;
        if (O0 == null || (!O0.creator && ((tL_chatAdminRights = O0.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M0 = gd.M0(2131754461, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.g0.W2(gd.a0("AddMembersAlertNamesText", null, 2131754397, o10.q(user), O0 == null ? "" : O0.title));
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
            alertDialog$Builder.k(gd.M0(2131754461, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.g70
                @Override // org.telegram.ui.ActionBar.r1
                public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i12) {
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
            mp.u1(i11).K(O0, user, new zo() { // from class: org.telegram.ui.f70
                @Override // org.telegram.messenger.zo
                public final void a(boolean z12, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str4) {
                    String str5 = LaunchActivity.C1;
                    org.telegram.messenger.g0.g3(new bi.s4(LaunchActivity.this, str, tL_chatAdminRights2, z12, str2, i11, O0, cxVar2, user, j3, str4));
                }
            });
        }
        return true;
    }

    public /* synthetic */ m1(LaunchActivity launchActivity, int i7, TLRPC.User user, String str, String str2, cx cxVar) {
        this.b = launchActivity;
        this.a = i7;
        this.c = user;
        this.d = str;
        this.e = str2;
        this.f = cxVar;
    }
}
