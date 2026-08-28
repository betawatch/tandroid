package ih;

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
import org.telegram.ui.Components.oc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o40;
import org.telegram.ui.o50;
import org.telegram.ui.pb;
import org.telegram.ui.tj0;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p5(KeyEvent.Callback callback, Object obj, int i9, Object obj2, int i10) {
        this.a = i10;
        this.c = callback;
        this.d = obj;
        this.b = i9;
        this.e = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                s5.m((s5) this.c, (TLRPC.User) this.d, this.b, (org.telegram.ui.ActionBar.b6) this.e);
                break;
            case 1:
                pb.V((pb) this.c, this.b, (ArrayList) this.d, (Integer) this.e);
                break;
            case 2:
                int[] iArr = (int[]) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                tj0 tj0Var = (tj0) this.e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i9 = this.b;
                if (i9 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i9 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.a.H0.run();
                tj0Var.run();
                break;
            case 3:
                o50 o50Var = (o50) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.e;
                int size = arrayList.size();
                int i10 = this.b;
                if (i10 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) o50Var.W0.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    o50Var.x1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i10)).intValue());
                    o40 o40Var = o50Var.b3;
                    if (o40Var == null) {
                        if (((Integer) arrayList.get(i10)).intValue() != 9 && ((Integer) arrayList.get(i10)).intValue() != 10 && ((Integer) arrayList.get(i10)).intValue() != 11) {
                            o50Var.d1(true);
                            break;
                        }
                    } else {
                        o40Var.dismiss();
                        break;
                    }
                }
                break;
            case 4:
                kh.d dVar = (kh.d) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.e;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    int i11 = this.b;
                    PasskeysController.create(context, i11, new gh.j0(dVar, context, f3Var, i11, 7));
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
                        oc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        oc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                we1 we1Var = (we1) this.c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.e;
                MessagesController messagesController = we1Var.getMessagesController();
                long j10 = -we1Var.a;
                if (!messagesController.isDialogMuted(j10, tL_forumTopic.id)) {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.b);
                    break;
                } else {
                    we1Var.getNotificationsController().muteDialog(j10, tL_forumTopic.id, false);
                    we1Var.finishPreviewFragment();
                    if (oc.a(we1Var)) {
                        oc.z(we1Var, 4, 0, we1Var.getResourceProvider()).j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ p5(Object obj, int i9, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ p5(org.telegram.ui.ActionBar.o2 o2Var, Object obj, Serializable serializable, int i9, int i10) {
        this.a = i10;
        this.c = o2Var;
        this.d = obj;
        this.e = serializable;
        this.b = i9;
    }
}
