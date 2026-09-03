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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ld1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.a;
        pn pnVar = null;
        boolean z4 = false;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                od1 od1Var = (od1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                od1Var.y = 0;
                String str2 = od1Var.B;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error == null || (!"THEME_SLUG_INVALID".equals(tL_error.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        od1Var.a0(org.telegram.ui.ActionBar.j6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        break;
                    } else {
                        od1Var.a0(org.telegram.ui.ActionBar.j6.p7, LocaleController.getString(R.string.SetUrlInUse));
                        break;
                    }
                }
                break;
            case 1:
                od1.W((od1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                break;
            case 2:
                yd1 yd1Var = (yd1) obj3;
                zn znVar = (zn) obj2;
                MessageObject messageObject = yd1Var.D;
                int i12 = ((TLRPC.TodoItem) obj).id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    pnVar = new pn();
                    pnVar.a = messageObject;
                    pnVar.b = -1;
                    pnVar.c = -1;
                    pnVar.g = true;
                    pnVar.d = i12;
                    pnVar.e();
                }
                znVar.Cb(messageObject, pnVar);
                yd1Var.c(false);
                break;
            case 3:
                ge1 ge1Var = (ge1) obj3;
                ArrayList arrayList = ge1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = ge1Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                ge1Var.d.l();
                if (ge1Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ge1Var.y = ofFloat;
                    ofFloat.addUpdateListener(new o11(ge1Var, 15));
                    ge1Var.y.setDuration(100L);
                    ge1Var.y.start();
                } else {
                    ge1Var.B = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(ge1Var.F);
                if (ge1Var.C.getVisibility() == 0) {
                    ge1Var.C.animate().alpha(0.0f).setListener(new ce1(ge1Var, 2)).start();
                    break;
                }
                break;
            case 4:
                sf1 sf1Var = (sf1) obj3;
                sf1Var.s.deleteTopics(sf1Var.a, (ArrayList) obj2);
                ((Runnable) obj).run();
                break;
            case 5:
                of1 of1Var = (of1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = of1Var.a0;
                if (str3.equals(of1Var.V)) {
                    int i13 = of1Var.h0;
                    of1Var.m0 = false;
                    of1Var.i0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i14);
                            i10 = ((org.telegram.ui.ActionBar.p2) of1Var.q0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, message2, false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        of1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z4 = true;
                        }
                        of1Var.j0 = z4;
                    } else {
                        of1Var.j0 = false;
                    }
                    if (of1Var.h0 == 0) {
                        of1Var.k0.e(of1Var.i0, true);
                    }
                    of1Var.l0.b(i13);
                    break;
                }
                break;
            default:
                lh1 lh1Var = (lh1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                tf.j1 j1Var = lh1Var.f;
                if (lh1Var.n) {
                    lh1Var.h = null;
                    lh1Var.d = arrayList4;
                    lh1Var.e = arrayList5;
                    j1Var.f(arrayList4, null);
                    if (lh1Var.n && !j1Var.e()) {
                        lh1Var.v.f.e(false, true);
                    }
                    lh1Var.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ld1(od1 od1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.a = 1;
        this.b = od1Var;
        this.c = tL_error;
        this.d = updatetheme;
    }
}
