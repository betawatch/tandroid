package fi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.View;
import c8.na;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.jt;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.qf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e40;
import org.telegram.ui.g30;
import org.telegram.ui.kh0;
import org.telegram.ui.lb;
import org.telegram.ui.rv;
import org.telegram.ui.w91;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class k5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k5(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        int i10 = this.b;
        final int i11 = 0;
        final int i12 = 1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i7) {
            case 0:
                n5 n5Var = (n5) obj3;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                if (!((TLRPC.User) obj2).premium) {
                    n5Var.dismiss();
                    org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new ug.y0(Q, 14, false));
                        break;
                    }
                } else if (!n5Var.n1) {
                    p6 R1 = mp.u1(n5Var.a).R1();
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = R1.B;
                    if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(n5Var.a).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                        if (!n5Var.n1) {
                            new kc(n5Var.c, i6Var).t(org.telegram.messenger.g0.W2(gd.N0(2131744643, null)), null).k(true);
                            break;
                        } else {
                            n5Var.dismiss();
                            rv rvVar = n5Var.p1;
                            if (rvVar != null) {
                                rvVar.a(false);
                                break;
                            }
                        }
                    } else {
                        TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
                        tL_stories_activateStealthMode.future = true;
                        tL_stories_activateStealthMode.past = true;
                        TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
                        tL_storiesStealthMode2.flags |= 3;
                        tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(n5Var.a).getCurrentTime() + mp.u1(n5Var.a).h0;
                        tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(n5Var.a).getCurrentTime() + mp.u1(n5Var.a).g0;
                        R1.i0(tL_storiesStealthMode2);
                        ConnectionsManager.getInstance(n5Var.a).sendRequest(tL_stories_activateStealthMode, new l5(i11));
                        try {
                            n5Var.b.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        n5Var.dismiss();
                        if (i10 == 0) {
                            n5.J0();
                        }
                        rv rvVar2 = n5Var.p1;
                        if (rvVar2 != null) {
                            rvVar2.a(true);
                            break;
                        }
                    }
                } else {
                    n5Var.dismiss();
                    rv rvVar3 = n5Var.p1;
                    if (rvVar3 != null) {
                        rvVar3.a(false);
                        break;
                    }
                }
                break;
            case 1:
                lb.b0((lb) obj3, i10, (ArrayList) obj2, (Integer) obj);
                break;
            case 2:
                int[] iArr = (int[]) obj3;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj2;
                kh0 kh0Var = (kh0) obj;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = mp.u1(i10.t0).g7.edit();
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.a.M0.run();
                kh0Var.run();
                break;
            case 3:
                qf qfVar = (qf) obj3;
                final ji.k kVar = (ji.k) obj2;
                ArrayList arrayList = kVar.b;
                bi.b1 b1Var = (bi.b1) obj;
                qfVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                final int i13 = 0;
                while (i13 < arrayList.size()) {
                    Context context = qfVar.a.getContext();
                    CharSequence charSequence = (CharSequence) arrayList.get(i13);
                    boolean z10 = i13 == kVar.c;
                    kr krVar = ai.l0.I0;
                    arrayList2.add(new ai.i0(context, charSequence, null, this.b, z10));
                    arrayList3.add(new Runnable() { // from class: org.telegram.ui.Components.pf
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    kVar.d.a(Integer.valueOf(i13));
                                    break;
                                default:
                                    kVar.d.a(Integer.valueOf(i13));
                                    break;
                            }
                        }
                    });
                    i13++;
                }
                b1Var.g(arrayList2, arrayList3);
                break;
            case 4:
                qf qfVar2 = (qf) obj3;
                final ji.k kVar2 = (ji.k) obj2;
                ArrayList arrayList4 = kVar2.b;
                oe0 oe0Var = (oe0) obj;
                qfVar2.getClass();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                final int i14 = 0;
                while (i14 < arrayList4.size()) {
                    Context context2 = qfVar2.a.getContext();
                    CharSequence charSequence2 = (CharSequence) arrayList4.get(i14);
                    boolean z11 = i14 == kVar2.c;
                    kr krVar2 = ai.l0.I0;
                    arrayList5.add(new ai.i0(context2, charSequence2, null, this.b, z11));
                    arrayList6.add(new Runnable() { // from class: org.telegram.ui.Components.pf
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    kVar2.d.a(Integer.valueOf(i14));
                                    break;
                                default:
                                    kVar2.d.a(Integer.valueOf(i14));
                                    break;
                            }
                        }
                    });
                    i14++;
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = oe0Var.s;
                Context context3 = oe0Var.a;
                org.telegram.ui.ActionBar.i6 i6Var2 = oe0Var.r;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, context3, i6Var2);
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, gd.N0(2131753753, null), false, oe0Var.r).setOnClickListener(new g70(oe0Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(new org.telegram.ui.ActionBar.d1(context3, i6Var2), na.o(-1, 8));
                while (i11 < arrayList5.size()) {
                    View view2 = (View) arrayList5.get(i11);
                    Runnable runnable = (Runnable) arrayList6.get(i11);
                    view2.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, i6Var2)), 2, -1));
                    view2.setMinimumWidth(org.telegram.messenger.g0.L(220.0f));
                    view2.setOnClickListener(new me0(oe0Var, runnable, 1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(view2, na.o(-1, 44));
                    i11++;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(actionBarPopupWindow$ActionBarPopupWindowLayout.b(actionBarPopupWindow$ActionBarPopupWindowLayout2));
                break;
            case 5:
                e40 e40Var = (e40) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) obj;
                if (i10 < arrayList7.size()) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) e40Var.V2.d.f(fj.B1(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    e40Var.D1(groupCallParticipant, fj.B1(groupCallParticipant.peer), ((Integer) arrayList7.get(i10)).intValue());
                    g30 g30Var = e40Var.e5;
                    if (g30Var == null) {
                        if (((Integer) arrayList7.get(i10)).intValue() != 9 && ((Integer) arrayList7.get(i10)).intValue() != 10 && ((Integer) arrayList7.get(i10)).intValue() != 11) {
                            e40Var.g1(true);
                            break;
                        }
                    } else {
                        g30Var.dismiss();
                        break;
                    }
                }
                break;
            case 6:
                hi.e eVar = (hi.e) obj3;
                Context context4 = (Context) obj2;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj;
                if (!eVar.R) {
                    eVar.setLoading(true);
                    int i15 = this.b;
                    jt.b(i15, context4, new di.j0(eVar, context4, w2Var, i15, 8));
                    break;
                }
                break;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                String str = (String) obj;
                RectF rectF = ProfileActivity.Z6;
                ((org.telegram.ui.ActionBar.g1) ((AtomicReference) obj2).get()).dismiss();
                try {
                    org.telegram.messenger.g0.g(str);
                    if (i10 == profileActivity.P3) {
                        kc.b0(profileActivity).i(gd.N0(2131752749, null)).j();
                    } else {
                        kc.b0(profileActivity).i(gd.N0(2131752681, null)).j();
                    }
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                w91 w91Var = (w91) obj3;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj;
                mp messagesController = w91Var.getMessagesController();
                long j3 = -w91Var.a;
                if (!messagesController.u2(j3, tL_forumTopic.id, null)) {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(i10);
                    break;
                } else {
                    w91Var.getNotificationsController().G(j3, tL_forumTopic.id, false);
                    w91Var.finishPreviewFragment();
                    if (kc.a(w91Var)) {
                        kc.z(w91Var, 4, 0, w91Var.getResourceProvider()).j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ k5(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
        this.e = obj3;
    }

    public /* synthetic */ k5(org.telegram.ui.ActionBar.g2 g2Var, Object obj, Serializable serializable, int i7, int i10) {
        this.a = i10;
        this.c = g2Var;
        this.d = obj;
        this.e = serializable;
        this.b = i7;
    }
}
