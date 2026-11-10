package di;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.pt;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f40;
import org.telegram.ui.h30;
import org.telegram.ui.jh0;
import org.telegram.ui.mb;
import org.telegram.ui.rv;
import org.telegram.ui.z91;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u5(KeyEvent.Callback callback, Object obj, int i7, Object obj2, int i10) {
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
                x5 x5Var = (x5) obj3;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                if (!((TLRPC.User) obj2).premium) {
                    x5Var.dismiss();
                    org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new ug.w0(Q, 14, false));
                        break;
                    }
                } else if (!x5Var.m1) {
                    z6 P1 = qp.s1(x5Var.a).P1();
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = P1.B;
                    if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(x5Var.a).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                        if (!x5Var.m1) {
                            new gc(x5Var.c, h6Var).t(org.telegram.messenger.g0.X2(id.M0(2131744884, null)), null).k(true);
                            break;
                        } else {
                            x5Var.dismiss();
                            rv rvVar = x5Var.o1;
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
                        tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(x5Var.a).getCurrentTime() + qp.s1(x5Var.a).g0;
                        tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(x5Var.a).getCurrentTime() + qp.s1(x5Var.a).f0;
                        P1.i0(tL_storiesStealthMode2);
                        ConnectionsManager.getInstance(x5Var.a).sendRequest(tL_stories_activateStealthMode, new v5(i10));
                        try {
                            x5Var.b.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        x5Var.dismiss();
                        if (i11 == 0) {
                            x5.I0();
                        }
                        rv rvVar2 = x5Var.o1;
                        if (rvVar2 != null) {
                            rvVar2.a(true);
                            break;
                        }
                    }
                } else {
                    x5Var.dismiss();
                    rv rvVar3 = x5Var.o1;
                    if (rvVar3 != null) {
                        rvVar3.a(false);
                        break;
                    }
                }
                break;
            case 1:
                mb.b0((mb) obj3, i11, (ArrayList) obj2, (Integer) obj);
                break;
            case 2:
                int[] iArr = (int[]) obj3;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj2;
                jh0 jh0Var = (jh0) obj;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = qp.s1(p10.s0).d7.edit();
                if (i11 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i11 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.a.L0.run();
                jh0Var.run();
                break;
            case 3:
                f40 f40Var = (f40) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) obj;
                if (i11 < arrayList.size()) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) f40Var.U2.d.f(ij.B1(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    f40Var.C1(groupCallParticipant, ij.B1(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    h30 h30Var = f40Var.Z4;
                    if (h30Var == null) {
                        if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                            f40Var.f1(true);
                            break;
                        }
                    } else {
                        h30Var.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                fi.d dVar = (fi.d) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    int i12 = this.b;
                    pt.b(i12, context, new bi.v0(dVar, context, w2Var, i12, 8));
                    break;
                }
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                String str = (String) obj;
                RectF rectF = ProfileActivity.V6;
                ((org.telegram.ui.ActionBar.g1) ((AtomicReference) obj2).get()).dismiss();
                try {
                    org.telegram.messenger.g0.g(str);
                    if (i11 == profileActivity.N3) {
                        gc.a0(profileActivity).i(id.M0(2131752761, null)).j();
                    } else {
                        gc.a0(profileActivity).i(id.M0(2131752693, null)).j();
                    }
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                z91 z91Var = (z91) obj3;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj;
                qp messagesController = z91Var.getMessagesController();
                long j3 = -z91Var.a;
                if (!messagesController.r2(j3, tL_forumTopic.id, null)) {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(i11);
                    break;
                } else {
                    z91Var.getNotificationsController().G(j3, tL_forumTopic.id, false);
                    z91Var.finishPreviewFragment();
                    if (gc.a(z91Var)) {
                        gc.z(z91Var, 4, 0, z91Var.getResourceProvider()).j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ u5(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ u5(org.telegram.ui.ActionBar.f2 f2Var, Object obj, Serializable serializable, int i7, int i10) {
        this.a = i10;
        this.c = f2Var;
        this.d = obj;
        this.e = serializable;
        this.b = i7;
    }
}
