package fi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.mt;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c40;
import org.telegram.ui.e30;
import org.telegram.ui.ih0;
import org.telegram.ui.lb;
import org.telegram.ui.pv;
import org.telegram.ui.u91;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class l5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l5(KeyEvent.Callback callback, Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = callback;
        this.d = obj;
        this.b = i7;
        this.e = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        int i10 = 0;
        int i11 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i7) {
            case 0:
                o5 o5Var = (o5) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                if (!((TLRPC.User) obj2).premium) {
                    o5Var.dismiss();
                    org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new ug.x0(Q, 14, false));
                        break;
                    }
                } else if (!o5Var.n1) {
                    s6 P1 = np.s1(o5Var.a).P1();
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = P1.B;
                    if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(o5Var.a).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                        if (!o5Var.n1) {
                            new cc(o5Var.c, e6Var).t(org.telegram.messenger.g0.X2(hd.M0(2131744884, null)), null).k(true);
                            break;
                        } else {
                            o5Var.dismiss();
                            pv pvVar = o5Var.p1;
                            if (pvVar != null) {
                                pvVar.a(false);
                                break;
                            }
                        }
                    } else {
                        TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
                        tL_stories_activateStealthMode.future = true;
                        tL_stories_activateStealthMode.past = true;
                        TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
                        tL_storiesStealthMode2.flags |= 3;
                        tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(o5Var.a).getCurrentTime() + np.s1(o5Var.a).h0;
                        tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(o5Var.a).getCurrentTime() + np.s1(o5Var.a).g0;
                        P1.i0(tL_storiesStealthMode2);
                        ConnectionsManager.getInstance(o5Var.a).sendRequest(tL_stories_activateStealthMode, new m5(i10));
                        try {
                            o5Var.b.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        o5Var.dismiss();
                        if (i11 == 0) {
                            o5.I0();
                        }
                        pv pvVar2 = o5Var.p1;
                        if (pvVar2 != null) {
                            pvVar2.a(true);
                            break;
                        }
                    }
                } else {
                    o5Var.dismiss();
                    pv pvVar3 = o5Var.p1;
                    if (pvVar3 != null) {
                        pvVar3.a(false);
                        break;
                    }
                }
                break;
            case 1:
                lb.b0((lb) obj3, i11, (ArrayList) obj2, (Integer) obj);
                break;
            case 2:
                int[] iArr = (int[]) obj3;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj2;
                ih0 ih0Var = (ih0) obj;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = np.s1(m10.t0).e7.edit();
                if (i11 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i11 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.a.M0.run();
                ih0Var.run();
                break;
            case 3:
                c40 c40Var = (c40) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) obj;
                if (i11 < arrayList.size()) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) c40Var.V2.d.f(gj.B1(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    c40Var.C1(groupCallParticipant, gj.B1(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    e30 e30Var = c40Var.e5;
                    if (e30Var == null) {
                        if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                            c40Var.f1(true);
                            break;
                        }
                    } else {
                        e30Var.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                hi.d dVar = (hi.d) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    int i12 = this.b;
                    mt.b(i12, context, new di.k0(dVar, context, u2Var, i12, 8));
                    break;
                }
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                String str = (String) obj;
                RectF rectF = ProfileActivity.X6;
                ((org.telegram.ui.ActionBar.g1) ((AtomicReference) obj2).get()).dismiss();
                try {
                    org.telegram.messenger.g0.g(str);
                    if (i11 == profileActivity.P3) {
                        cc.a0(profileActivity).i(hd.M0(2131752761, null)).j();
                    } else {
                        cc.a0(profileActivity).i(hd.M0(2131752693, null)).j();
                    }
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                u91 u91Var = (u91) obj3;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj;
                np messagesController = u91Var.getMessagesController();
                long j3 = -u91Var.a;
                if (!messagesController.r2(j3, tL_forumTopic.id, null)) {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(i11);
                    break;
                } else {
                    u91Var.getNotificationsController().G(j3, tL_forumTopic.id, false);
                    u91Var.finishPreviewFragment();
                    if (cc.a(u91Var)) {
                        cc.z(u91Var, 4, 0, u91Var.getResourceProvider()).j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ l5(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ l5(org.telegram.ui.ActionBar.e2 e2Var, Object obj, Serializable serializable, int i7, int i10) {
        this.a = i10;
        this.c = e2Var;
        this.d = obj;
        this.e = serializable;
        this.b = i7;
    }
}
