package di;

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
import org.telegram.ui.Components.wc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cf1;
import org.telegram.ui.fk0;
import org.telegram.ui.fx;
import org.telegram.ui.wb;
import org.telegram.ui.x40;
import org.telegram.ui.x50;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c6(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = callback;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                f6.m((f6) obj3, (TLRPC.User) obj2, i11, (org.telegram.ui.ActionBar.u6) obj);
                break;
            case 1:
                wb.X((wb) obj3, i11, (ArrayList) obj2, (Integer) obj);
                break;
            case 2:
                int[] iArr = (int[]) obj3;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj2;
                fk0 fk0Var = (fk0) obj;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                if (i11 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i11 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.a.N0.run();
                fk0Var.run();
                break;
            case 3:
                x50 x50Var = (x50) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) obj;
                if (i11 < arrayList.size()) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) x50Var.a1.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    x50Var.x1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    x40 x40Var = x50Var.f3;
                    if (x40Var == null) {
                        if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                            x50Var.d1(true);
                            break;
                        }
                    } else {
                        x40Var.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                fi.d dVar = (fi.d) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    int i12 = this.b;
                    PasskeysController.create(context, i12, new bi.v0(dVar, context, k3Var, i12, 9));
                    break;
                }
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                String str = (String) obj;
                int i13 = ProfileActivity.R6;
                ((org.telegram.ui.ActionBar.o1) ((AtomicReference) obj2).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (i11 == profileActivity.O3) {
                        wc.b0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        wc.b0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 6:
                cf1 cf1Var = (cf1) obj3;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj;
                MessagesController messagesController = cf1Var.getMessagesController();
                long j10 = -cf1Var.a;
                if (!messagesController.isDialogMuted(j10, tL_forumTopic.id)) {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(i11);
                    break;
                } else {
                    cf1Var.getNotificationsController().muteDialog(j10, tL_forumTopic.id, false);
                    cf1Var.finishPreviewFragment();
                    if (wc.a(cf1Var)) {
                        wc.z(cf1Var, 4, 0, cf1Var.getResourceProvider()).j();
                        break;
                    }
                }
                break;
            default:
                fi.d dVar2 = (fi.d) obj3;
                org.telegram.ui.ActionBar.k3 k3Var2 = (org.telegram.ui.ActionBar.k3) obj2;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    org.telegram.ui.Wallet.t3 t3Var = new org.telegram.ui.Wallet.t3(dVar2, k3Var2, u6Var, 0);
                    org.telegram.ui.Wallet.l0 x9 = org.telegram.ui.Wallet.l0.x(i11);
                    x9.m0(new fx(i11, t3Var, x9));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c6(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ c6(org.telegram.ui.ActionBar.r2 r2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.a = i11;
        this.c = r2Var;
        this.d = obj;
        this.e = serializable;
        this.b = i10;
    }
}
