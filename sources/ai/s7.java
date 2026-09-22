package ai;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.vc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eg1;
import org.telegram.ui.i50;
import org.telegram.ui.i60;
import org.telegram.ui.ik0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s7(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = callback;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                w7.m((w7) this.c, (TLRPC.User) this.d, this.b, (org.telegram.ui.ActionBar.e6) this.e);
                break;
            case 1:
                org.telegram.ui.ub.W((org.telegram.ui.ub) this.c, this.b, (ArrayList) this.d, (Integer) this.e);
                break;
            case 2:
                int[] iArr = (int[]) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                ik0 ik0Var = (ik0) this.e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i10 = this.b;
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.a.L0.run();
                ik0Var.run();
                break;
            case 3:
                i60 i60Var = (i60) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.e;
                int size = arrayList.size();
                int i11 = this.b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) i60Var.a1.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    i60Var.x1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    i50 i50Var = i60Var.f3;
                    if (i50Var == null) {
                        if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                            i60Var.d1(true);
                            break;
                        }
                    } else {
                        i50Var.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                ci.d dVar = (ci.d) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.e;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    int i12 = this.b;
                    PasskeysController.create(context, i12, new ei.h1(dVar, context, f3Var, i12, 6));
                    break;
                }
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                String str = (String) this.e;
                ((org.telegram.ui.ActionBar.n1) atomicReference.get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.b == profileActivity.O3) {
                        vc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        vc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                eg1 eg1Var = (eg1) this.c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.e;
                MessagesController messagesController = eg1Var.getMessagesController();
                long j3 = -eg1Var.a;
                if (!messagesController.isDialogMuted(j3, tL_forumTopic.id)) {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.b);
                    break;
                } else {
                    eg1Var.getNotificationsController().muteDialog(j3, tL_forumTopic.id, false);
                    eg1Var.finishPreviewFragment();
                    if (vc.a(eg1Var)) {
                        vc.z(eg1Var, 4, 0, eg1Var.getResourceProvider()).j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ s7(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ s7(org.telegram.ui.ActionBar.n2 n2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.a = i11;
        this.c = n2Var;
        this.d = obj;
        this.e = serializable;
        this.b = i10;
    }
}
