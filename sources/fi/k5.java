package fi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.View;
import c8.ma;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.kt;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.rf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f40;
import org.telegram.ui.h30;
import org.telegram.ui.lb;
import org.telegram.ui.mh0;
import org.telegram.ui.sv;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                if (!((TLRPC.User) obj2).premium) {
                    n5Var.dismiss();
                    org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new ug.y0(Q, 14, false));
                        break;
                    }
                } else if (!n5Var.n1) {
                    p6 R1 = np.u1(n5Var.a).R1();
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = R1.B;
                    if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(n5Var.a).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                        if (!n5Var.n1) {
                            new lc(n5Var.c, h6Var).t(org.telegram.messenger.g0.W2(hd.N0(2131744641, null)), null).k(true);
                            break;
                        } else {
                            n5Var.dismiss();
                            sv svVar = n5Var.p1;
                            if (svVar != null) {
                                svVar.a(false);
                                break;
                            }
                        }
                    } else {
                        TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
                        tL_stories_activateStealthMode.future = true;
                        tL_stories_activateStealthMode.past = true;
                        TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
                        tL_storiesStealthMode2.flags |= 3;
                        tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(n5Var.a).getCurrentTime() + np.u1(n5Var.a).h0;
                        tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(n5Var.a).getCurrentTime() + np.u1(n5Var.a).g0;
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
                        sv svVar2 = n5Var.p1;
                        if (svVar2 != null) {
                            svVar2.a(true);
                            break;
                        }
                    }
                } else {
                    n5Var.dismiss();
                    sv svVar3 = n5Var.p1;
                    if (svVar3 != null) {
                        svVar3.a(false);
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
                mh0 mh0Var = (mh0) obj;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = np.u1(k10.t0).g7.edit();
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.a.M0.run();
                mh0Var.run();
                break;
            case 3:
                rf rfVar = (rf) obj3;
                final ji.k kVar = (ji.k) obj2;
                ArrayList arrayList = kVar.b;
                bi.b1 b1Var = (bi.b1) obj;
                rfVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                final int i13 = 0;
                while (i13 < arrayList.size()) {
                    Context context = rfVar.a.getContext();
                    CharSequence charSequence = (CharSequence) arrayList.get(i13);
                    boolean z10 = i13 == kVar.c;
                    nr nrVar = ai.p0.I0;
                    arrayList2.add(new ai.m0(context, charSequence, null, this.b, z10));
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
                rf rfVar2 = (rf) obj3;
                final ji.k kVar2 = (ji.k) obj2;
                ArrayList arrayList4 = kVar2.b;
                pe0 pe0Var = (pe0) obj;
                rfVar2.getClass();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                final int i14 = 0;
                while (i14 < arrayList4.size()) {
                    Context context2 = rfVar2.a.getContext();
                    CharSequence charSequence2 = (CharSequence) arrayList4.get(i14);
                    boolean z11 = i14 == kVar2.c;
                    nr nrVar2 = ai.p0.I0;
                    arrayList5.add(new ai.m0(context2, charSequence2, null, this.b, z11));
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
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = pe0Var.s;
                Context context3 = pe0Var.a;
                org.telegram.ui.ActionBar.h6 h6Var2 = pe0Var.r;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, context3, h6Var2);
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_arrow_back, hd.N0(2131753753, null), false, pe0Var.r).setOnClickListener(new j70(pe0Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(new org.telegram.ui.ActionBar.d1(context3, h6Var2), ma.o(-1, 8));
                while (i11 < arrayList5.size()) {
                    View view2 = (View) arrayList5.get(i11);
                    Runnable runnable = (Runnable) arrayList6.get(i11);
                    view2.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var2)), 2, -1));
                    view2.setMinimumWidth(org.telegram.messenger.g0.L(220.0f));
                    view2.setOnClickListener(new ne0(pe0Var, runnable, 1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(view2, ma.o(-1, 44));
                    i11++;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(actionBarPopupWindow$ActionBarPopupWindowLayout.b(actionBarPopupWindow$ActionBarPopupWindowLayout2));
                break;
            case 5:
                f40 f40Var = (f40) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) obj;
                if (i10 < arrayList7.size()) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) f40Var.V2.d.f(gj.B1(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    f40Var.D1(groupCallParticipant, gj.B1(groupCallParticipant.peer), ((Integer) arrayList7.get(i10)).intValue());
                    h30 h30Var = f40Var.e5;
                    if (h30Var == null) {
                        if (((Integer) arrayList7.get(i10)).intValue() != 9 && ((Integer) arrayList7.get(i10)).intValue() != 10 && ((Integer) arrayList7.get(i10)).intValue() != 11) {
                            f40Var.g1(true);
                            break;
                        }
                    } else {
                        h30Var.dismiss();
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
                    kt.b(i15, context4, new di.j0(eVar, context4, w2Var, i15, 8));
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
                        lc.b0(profileActivity).i(hd.N0(2131752749, null)).j();
                    } else {
                        lc.b0(profileActivity).i(hd.N0(2131752681, null)).j();
                    }
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                y91 y91Var = (y91) obj3;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj;
                np messagesController = y91Var.getMessagesController();
                long j3 = -y91Var.a;
                if (!messagesController.u2(j3, tL_forumTopic.id, null)) {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(i10);
                    break;
                } else {
                    y91Var.getNotificationsController().G(j3, tL_forumTopic.id, false);
                    y91Var.finishPreviewFragment();
                    if (lc.a(y91Var)) {
                        lc.z(y91Var, 4, 0, y91Var.getResourceProvider()).j();
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
