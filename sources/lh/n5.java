package lh;

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
import org.telegram.ui.Components.tc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ob;
import org.telegram.ui.qj0;
import org.telegram.ui.r40;
import org.telegram.ui.r50;
import org.telegram.ui.ze1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n5(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
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
                q5.m((q5) this.c, (TLRPC.User) this.d, this.b, (org.telegram.ui.ActionBar.c6) this.e);
                break;
            case 1:
                ob.W((ob) this.c, this.b, (ArrayList) this.d, (Integer) this.e);
                break;
            case 2:
                int[] iArr = (int[]) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                qj0 qj0Var = (qj0) this.e;
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
                alertDialog$Builder.a.H0.run();
                qj0Var.run();
                break;
            case 3:
                r50 r50Var = (r50) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.e;
                int size = arrayList.size();
                int i11 = this.b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) r50Var.W0.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    r50Var.x1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    r40 r40Var = r50Var.b3;
                    if (r40Var == null) {
                        if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                            r50Var.d1(true);
                            break;
                        }
                    } else {
                        r40Var.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                nh.d dVar = (nh.d) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.e;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    int i12 = this.b;
                    PasskeysController.create(context, i12, new jh.i0(dVar, context, f3Var, i12, 5));
                    break;
                }
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                String str = (String) this.e;
                ((org.telegram.ui.ActionBar.o1) atomicReference.get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.b == profileActivity.K3) {
                        tc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        tc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                ze1 ze1Var = (ze1) this.c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.e;
                MessagesController messagesController = ze1Var.getMessagesController();
                long j10 = -ze1Var.a;
                if (!messagesController.isDialogMuted(j10, tL_forumTopic.id)) {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.b);
                    break;
                } else {
                    ze1Var.getNotificationsController().muteDialog(j10, tL_forumTopic.id, false);
                    ze1Var.finishPreviewFragment();
                    if (tc.a(ze1Var)) {
                        tc.z(ze1Var, 4, 0, ze1Var.getResourceProvider()).j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ n5(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ n5(org.telegram.ui.ActionBar.o2 o2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.a = i11;
        this.c = o2Var;
        this.d = obj;
        this.e = serializable;
        this.b = i10;
    }
}
