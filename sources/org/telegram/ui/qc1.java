package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qc1(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        int i9;
        int i10 = this.a;
        gn gnVar = null;
        boolean z10 = false;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                tc1 tc1Var = (tc1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                tc1Var.y = 0;
                String str2 = tc1Var.A;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error == null || (!"THEME_SLUG_INVALID".equals(tL_error.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        tc1Var.Z(org.telegram.ui.ActionBar.f6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        break;
                    } else {
                        tc1Var.Z(org.telegram.ui.ActionBar.f6.p7, LocaleController.getString(R.string.SetUrlInUse));
                        break;
                    }
                }
                break;
            case 1:
                tc1.V((tc1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                break;
            case 2:
                dd1 dd1Var = (dd1) obj3;
                qn qnVar = (qn) obj2;
                MessageObject messageObject = dd1Var.C;
                int i11 = ((TLRPC.TodoItem) obj).id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    gnVar = new gn();
                    gnVar.a = messageObject;
                    gnVar.b = -1;
                    gnVar.c = -1;
                    gnVar.g = true;
                    gnVar.d = i11;
                    gnVar.e();
                }
                qnVar.Cb(messageObject, gnVar);
                dd1Var.c(false);
                break;
            case 3:
                kd1 kd1Var = (kd1) obj3;
                ArrayList arrayList = kd1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = kd1Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                kd1Var.d.l();
                if (kd1Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    kd1Var.y = ofFloat;
                    ofFloat.addUpdateListener(new v01(kd1Var, 15));
                    kd1Var.y.setDuration(100L);
                    kd1Var.y.start();
                } else {
                    kd1Var.A = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(kd1Var.E);
                if (kd1Var.B.getVisibility() == 0) {
                    kd1Var.B.animate().alpha(0.0f).setListener(new gd1(kd1Var, 2)).start();
                    break;
                }
                break;
            case 4:
                we1 we1Var = (we1) obj3;
                we1Var.s.deleteTopics(we1Var.a, (ArrayList) obj2);
                ((Runnable) obj).run();
                break;
            case 5:
                re1 re1Var = (re1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = re1Var.W;
                if (str3.equals(re1Var.U)) {
                    int i12 = re1Var.g0;
                    re1Var.l0 = false;
                    re1Var.h0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i13);
                            i9 = ((org.telegram.ui.ActionBar.o2) re1Var.p0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i9, message2, false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        re1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        re1Var.i0 = z10;
                    } else {
                        re1Var.i0 = false;
                    }
                    if (re1Var.g0 == 0) {
                        re1Var.j0.e(re1Var.h0, true);
                    }
                    re1Var.k0.b(i12);
                    break;
                }
                break;
            default:
                pg1 pg1Var = (pg1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                of.v1 v1Var = pg1Var.f;
                if (pg1Var.n) {
                    pg1Var.h = null;
                    pg1Var.d = arrayList4;
                    pg1Var.e = arrayList5;
                    v1Var.f(arrayList4, null);
                    if (pg1Var.n && !v1Var.e()) {
                        pg1Var.v.f.e(false, true);
                    }
                    pg1Var.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qc1(tc1 tc1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.a = 1;
        this.b = tc1Var;
        this.c = tL_error;
        this.d = updatetheme;
    }
}
