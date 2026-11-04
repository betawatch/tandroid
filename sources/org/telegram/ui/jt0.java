package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jt0 implements m40, org.telegram.ui.Components.ju0, org.telegram.ui.ActionBar.p1, org.telegram.messenger.ir, r0.m, org.telegram.ui.Components.ff0, org.telegram.ui.Components.hj0, qe.b, org.telegram.messenger.d9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ jt0(ProfileActivity profileActivity, int i3) {
        this.a = i3;
        this.b = profileActivity;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        RectF rectF = ProfileActivity.T6;
        int i3 = k1Var.a.f(519).d;
        ProfileActivity profileActivity = this.b;
        profileActivity.J6 = i3;
        FrameLayout frameLayout = profileActivity.t5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i10 = profileActivity.J6 + profileActivity.I6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                marginLayoutParams.bottomMargin = i10;
                profileActivity.t5.setLayoutParams(marginLayoutParams);
            }
        }
        if (profileActivity.O != null) {
            profileActivity.H3();
            org.telegram.ui.Components.vp0 vp0Var = profileActivity.O.b0;
            if (vp0Var != null) {
                vp0Var.setButtonOffset(profileActivity.J6 + profileActivity.I6);
            }
        }
        return r0.k1.b;
    }

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        RectF rectF = ProfileActivity.T6;
        this.b.p5();
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        ProfileActivity profileActivity = this.b;
        lw0 lw0Var = profileActivity.e;
        if (lw0Var.x || lw0Var.w.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
        String M0 = org.telegram.messenger.bd.M0(2131752056, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131752061, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752099, null), new jt0(profileActivity, 10));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        profileActivity.showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView == null) {
            return true;
        }
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 2:
                RectF rectF = ProfileActivity.T6;
                profileActivity.getMessagesController().w(profileActivity.e1);
                if (org.telegram.ui.Components.fc.a(profileActivity)) {
                    org.telegram.ui.Components.fc.d(profileActivity, true).j();
                    break;
                }
                break;
            case 9:
                RectF rectF2 = ProfileActivity.T6;
                profileActivity.getClass();
                org.telegram.messenger.az.l = null;
                org.telegram.messenger.az.m = null;
                org.telegram.messenger.az.y();
                profileActivity.getConnectionsManager().switchBackend(true);
                break;
            default:
                lw0 lw0Var = profileActivity.e;
                lw0Var.w.clear();
                org.telegram.messenger.hp.e1().edit().remove("settingsSearchRecent2").commit();
                lw0Var.f();
                break;
        }
    }

    @Override // org.telegram.ui.m40
    public void h(int i3, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        RectF rectF = ProfileActivity.T6;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.b;
        TLRPC.ChatFull chatFull = profileActivity.u2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i10 = 0; i10 < profileActivity.u2.participants.participants.size(); i10++) {
                hashSet.add(Long.valueOf(profileActivity.u2.participants.participants.get(i10).user_id));
            }
        }
        profileActivity.getMessagesController().o(profileActivity.E2, profileActivity, arrayList, i3, new g3(arrayList2, 5), new g3(profileActivity, 6), new hc0(profileActivity, arrayList2, hashSet, 27));
    }

    @Override // org.telegram.messenger.ir
    public void o(boolean z10) {
        ProfileActivity profileActivity = this.b;
        profileActivity.J1 = 0;
        org.telegram.messenger.hs notificationCenter = profileActivity.getNotificationCenter();
        int i3 = org.telegram.messenger.hs.t;
        notificationCenter.n(profileActivity, i3);
        profileActivity.getNotificationCenter().k(i3, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.hs.K2, Long.valueOf(-profileActivity.E2.id), null, profileActivity.E2, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.d9
    public boolean run() {
        ProfileActivity profileActivity = this.b;
        return profileActivity.D2 != null || profileActivity.u4();
    }

    @Override // org.telegram.ui.m40
    public /* synthetic */ void e(TLRPC.User user) {
    }

    @Override // qe.b
    public /* synthetic */ void F(float f10, int i3) {
    }
}
