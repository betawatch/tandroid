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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gd1(Object obj, Object obj2, Object obj3, int i10) {
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
        nn nnVar = null;
        boolean z4 = false;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                jd1 jd1Var = (jd1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                jd1Var.y = 0;
                String str2 = jd1Var.B;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error == null || (!"THEME_SLUG_INVALID".equals(tL_error.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        jd1Var.a0(org.telegram.ui.ActionBar.k6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        break;
                    } else {
                        jd1Var.a0(org.telegram.ui.ActionBar.k6.p7, LocaleController.getString(R.string.SetUrlInUse));
                        break;
                    }
                }
                break;
            case 1:
                jd1.W((jd1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                break;
            case 2:
                ud1 ud1Var = (ud1) obj3;
                xn xnVar = (xn) obj2;
                MessageObject messageObject = ud1Var.D;
                int i12 = ((TLRPC.TodoItem) obj).id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    nnVar = new nn();
                    nnVar.a = messageObject;
                    nnVar.b = -1;
                    nnVar.c = -1;
                    nnVar.g = true;
                    nnVar.d = i12;
                    nnVar.e();
                }
                xnVar.Cb(messageObject, nnVar);
                ud1Var.c(false);
                break;
            case 3:
                be1 be1Var = (be1) obj3;
                ArrayList arrayList = be1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = be1Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                be1Var.d.l();
                if (be1Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    be1Var.y = ofFloat;
                    ofFloat.addUpdateListener(new j11(be1Var, 15));
                    be1Var.y.setDuration(100L);
                    be1Var.y.start();
                } else {
                    be1Var.B = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(be1Var.F);
                if (be1Var.C.getVisibility() == 0) {
                    be1Var.C.animate().alpha(0.0f).setListener(new xd1(be1Var, 2)).start();
                    break;
                }
                break;
            case 4:
                mf1 mf1Var = (mf1) obj3;
                mf1Var.s.deleteTopics(mf1Var.a, (ArrayList) obj2);
                ((Runnable) obj).run();
                break;
            case 5:
                if1 if1Var = (if1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = if1Var.a0;
                if (str3.equals(if1Var.V)) {
                    int i13 = if1Var.h0;
                    if1Var.m0 = false;
                    if1Var.i0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i14);
                            i10 = ((org.telegram.ui.ActionBar.p2) if1Var.q0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, message2, false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        if1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z4 = true;
                        }
                        if1Var.j0 = z4;
                    } else {
                        if1Var.j0 = false;
                    }
                    if (if1Var.h0 == 0) {
                        if1Var.k0.e(if1Var.i0, true);
                    }
                    if1Var.l0.b(i13);
                    break;
                }
                break;
            default:
                fh1 fh1Var = (fh1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                uf.k1 k1Var = fh1Var.f;
                if (fh1Var.n) {
                    fh1Var.h = null;
                    fh1Var.d = arrayList4;
                    fh1Var.e = arrayList5;
                    k1Var.f(arrayList4, null);
                    if (fh1Var.n && !k1Var.e()) {
                        fh1Var.v.f.e(false, true);
                    }
                    fh1Var.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ gd1(jd1 jd1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.a = 1;
        this.b = jd1Var;
        this.c = tL_error;
        this.d = updatetheme;
    }
}
