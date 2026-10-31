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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bv0 implements q50, org.telegram.ui.Components.mv0, org.telegram.ui.ActionBar.u1, org.telegram.messenger.zr, r0.m, org.telegram.ui.Components.gg0, org.telegram.ui.Components.ik0, fe.e, org.telegram.messenger.j9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ bv0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        RectF rectF = ProfileActivity.R6;
        int i10 = j1Var.a.f(519).d;
        ProfileActivity profileActivity = this.b;
        profileActivity.H6 = i10;
        FrameLayout frameLayout = profileActivity.s5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.H6 + profileActivity.G6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.s5.setLayoutParams(marginLayoutParams);
            }
        }
        if (profileActivity.N != null) {
            profileActivity.G3();
            org.telegram.ui.Components.vq0 vq0Var = profileActivity.N.a0;
            if (vq0Var != null) {
                vq0Var.setButtonOffset(profileActivity.H6 + profileActivity.G6);
            }
        }
        return r0.j1.b;
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        ProfileActivity profileActivity = this.b;
        hy0 hy0Var = profileActivity.e;
        if (hy0Var.x || hy0Var.w.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.z0);
        String L0 = org.telegram.messenger.cd.L0(2131752056, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131752061, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752099, null), new bv0(profileActivity, 10));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        profileActivity.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView == null) {
            return true;
        }
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
        return true;
    }

    @Override // org.telegram.ui.q50
    public void g(int i10, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        RectF rectF = ProfileActivity.R6;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.b;
        TLRPC.ChatFull chatFull = profileActivity.t2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.t2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.t2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().o(profileActivity.D2, profileActivity, arrayList, i10, new f3(arrayList2, 5), new f3(profileActivity, 6), new qd0(profileActivity, arrayList2, hashSet, 26));
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i11) {
            case 2:
                RectF rectF = ProfileActivity.R6;
                profileActivity.getMessagesController().w(profileActivity.d1);
                if (org.telegram.ui.Components.cc.a(profileActivity)) {
                    org.telegram.ui.Components.cc.d(profileActivity, true).j();
                    break;
                }
                break;
            case 9:
                RectF rectF2 = ProfileActivity.R6;
                profileActivity.getClass();
                org.telegram.messenger.tz.l = null;
                org.telegram.messenger.tz.m = null;
                org.telegram.messenger.tz.y();
                profileActivity.getConnectionsManager().switchBackend(true);
                break;
            default:
                hy0 hy0Var = profileActivity.e;
                hy0Var.w.clear();
                org.telegram.messenger.vp.d1().edit().remove("settingsSearchRecent2").commit();
                hy0Var.f();
                break;
        }
    }

    @Override // org.telegram.messenger.zr
    public void i(boolean z10) {
        ProfileActivity profileActivity = this.b;
        profileActivity.I1 = 0;
        org.telegram.messenger.zs notificationCenter = profileActivity.getNotificationCenter();
        int i10 = org.telegram.messenger.zs.t;
        notificationCenter.n(profileActivity, i10);
        profileActivity.getNotificationCenter().k(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.zs.K2, Long.valueOf(-profileActivity.D2.id), null, profileActivity.D2, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.j9
    public boolean run() {
        ProfileActivity profileActivity = this.b;
        return profileActivity.C2 != null || profileActivity.t4();
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        RectF rectF = ProfileActivity.R6;
        this.b.o5();
    }

    @Override // org.telegram.ui.q50
    public /* synthetic */ void e(TLRPC.User user) {
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
    }
}
