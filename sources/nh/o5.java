package nh;

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
import org.telegram.ui.Components.qc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ak0;
import org.telegram.ui.e60;
import org.telegram.ui.f50;
import org.telegram.ui.sf1;
import org.telegram.ui.ub;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o5(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
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
                r5.m((r5) this.c, (TLRPC.User) this.d, this.b, (org.telegram.ui.ActionBar.f6) this.e);
                break;
            case 1:
                ub.W((ub) this.c, this.b, (ArrayList) this.d, (Integer) this.e);
                break;
            case 2:
                int[] iArr = (int[]) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                ak0 ak0Var = (ak0) this.e;
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
                alertDialog$Builder.a.I0.run();
                ak0Var.run();
                break;
            case 3:
                e60 e60Var = (e60) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.e;
                int size = arrayList.size();
                int i11 = this.b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) e60Var.X0.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    e60Var.x1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    f50 f50Var = e60Var.c3;
                    if (f50Var == null) {
                        if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                            e60Var.d1(true);
                            break;
                        }
                    } else {
                        f50Var.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                ph.d dVar = (ph.d) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.e;
                if (!dVar.K) {
                    dVar.setLoading(true);
                    int i12 = this.b;
                    PasskeysController.create(context, i12, new lh.i0(dVar, context, g3Var, i12, 5));
                    break;
                }
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                String str = (String) this.e;
                ((org.telegram.ui.ActionBar.p1) atomicReference.get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.b == profileActivity.L3) {
                        qc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        qc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                sf1 sf1Var = (sf1) this.c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.e;
                MessagesController messagesController = sf1Var.getMessagesController();
                long j10 = -sf1Var.a;
                if (!messagesController.isDialogMuted(j10, tL_forumTopic.id)) {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.b);
                    break;
                } else {
                    sf1Var.getNotificationsController().muteDialog(j10, tL_forumTopic.id, false);
                    sf1Var.finishPreviewFragment();
                    if (qc.a(sf1Var)) {
                        qc.z(sf1Var, 4, 0, sf1Var.getResourceProvider()).j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ o5(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ o5(org.telegram.ui.ActionBar.p2 p2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.a = i11;
        this.c = p2Var;
        this.d = obj;
        this.e = serializable;
        this.b = i10;
    }
}
