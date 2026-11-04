package ei;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.bd;
import org.telegram.messenger.gt;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.fc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ch0;
import org.telegram.ui.kb;
import org.telegram.ui.lv;
import org.telegram.ui.m91;
import org.telegram.ui.rw;
import org.telegram.ui.x30;
import org.telegram.ui.z20;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t5(KeyEvent.Callback callback, Object obj, int i3, Object obj2, int i10) {
        this.a = i10;
        this.c = callback;
        this.d = obj;
        this.b = i3;
        this.e = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        int i10 = 0;
        int i11 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i3) {
            case 0:
                w5 w5Var = (w5) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                if (!((TLRPC.User) obj2).premium) {
                    w5Var.dismiss();
                    org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new vg.v0(Q, 14, false));
                        break;
                    }
                } else if (!w5Var.k1) {
                    z6 P1 = hp.s1(w5Var.a).P1();
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = P1.B;
                    if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(w5Var.a).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                        if (!w5Var.k1) {
                            new fc(w5Var.c, e6Var).t(org.telegram.messenger.g0.X2(bd.M0(2131744894, null)), null).k(true);
                            break;
                        } else {
                            w5Var.dismiss();
                            lv lvVar = w5Var.m1;
                            if (lvVar != null) {
                                lvVar.a(false);
                                break;
                            }
                        }
                    } else {
                        TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
                        tL_stories_activateStealthMode.future = true;
                        tL_stories_activateStealthMode.past = true;
                        TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
                        tL_storiesStealthMode2.flags |= 3;
                        tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(w5Var.a).getCurrentTime() + hp.s1(w5Var.a).h0;
                        tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(w5Var.a).getCurrentTime() + hp.s1(w5Var.a).g0;
                        P1.i0(tL_storiesStealthMode2);
                        ConnectionsManager.getInstance(w5Var.a).sendRequest(tL_stories_activateStealthMode, new u5(i10));
                        try {
                            w5Var.b.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        w5Var.dismiss();
                        if (i11 == 0) {
                            w5.I0();
                        }
                        lv lvVar2 = w5Var.m1;
                        if (lvVar2 != null) {
                            lvVar2.a(true);
                            break;
                        }
                    }
                } else {
                    w5Var.dismiss();
                    lv lvVar3 = w5Var.m1;
                    if (lvVar3 != null) {
                        lvVar3.a(false);
                        break;
                    }
                }
                break;
            case 1:
                kb.b0((kb) obj3, i11, (ArrayList) obj2, (Integer) obj);
                break;
            case 2:
                int[] iArr = (int[]) obj3;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj2;
                ch0 ch0Var = (ch0) obj;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = hp.s1(h10.t0).d7.edit();
                if (i11 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i11 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.a.O0.run();
                ch0Var.run();
                break;
            case 3:
                x30 x30Var = (x30) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) obj;
                if (i11 < arrayList.size()) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) x30Var.S2.d.f(zi.C1(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    x30Var.z1(groupCallParticipant, zi.C1(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    z20 z20Var = x30Var.X4;
                    if (z20Var == null) {
                        if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                            x30Var.f1(true);
                            break;
                        }
                    } else {
                        z20Var.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                gi.d dVar = (gi.d) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    int i12 = this.b;
                    gt.b(i12, context, new ci.o0(dVar, context, t2Var, i12, 8));
                    break;
                }
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                String str = (String) obj;
                RectF rectF = ProfileActivity.T6;
                ((org.telegram.ui.ActionBar.f1) ((AtomicReference) obj2).get()).dismiss();
                try {
                    org.telegram.messenger.g0.g(str);
                    if (i11 == profileActivity.O3) {
                        fc.a0(profileActivity).i(bd.M0(2131752761, null)).j();
                    } else {
                        fc.a0(profileActivity).i(bd.M0(2131752693, null)).j();
                    }
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 6:
                m91 m91Var = (m91) obj3;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj;
                hp messagesController = m91Var.getMessagesController();
                long j10 = -m91Var.a;
                if (!messagesController.r2(j10, tL_forumTopic.id, null)) {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(i11);
                    break;
                } else {
                    m91Var.getNotificationsController().G(j10, tL_forumTopic.id, false);
                    m91Var.finishPreviewFragment();
                    if (fc.a(m91Var)) {
                        fc.z(m91Var, 4, 0, m91Var.getResourceProvider()).j();
                        break;
                    }
                }
                break;
            default:
                gi.d dVar2 = (gi.d) obj3;
                org.telegram.ui.ActionBar.t2 t2Var2 = (org.telegram.ui.ActionBar.t2) obj2;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj;
                if (!dVar2.R) {
                    dVar2.setLoading(true);
                    org.telegram.ui.Wallet.i4 i4Var = new org.telegram.ui.Wallet.i4(dVar2, t2Var2, e6Var2, 0);
                    org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i11);
                    x10.m0(new rw(i11, i4Var, x10));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t5(Object obj, int i3, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ t5(org.telegram.ui.ActionBar.d2 d2Var, Object obj, Serializable serializable, int i3, int i10) {
        this.a = i10;
        this.c = d2Var;
        this.d = obj;
        this.e = serializable;
        this.b = i3;
    }
}
