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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ee1(Object obj, Object obj2, Object obj3, int i10) {
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
        un unVar = null;
        boolean z10 = false;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                he1 he1Var = (he1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                he1Var.y = 0;
                String str2 = he1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error == null || (!"THEME_SLUG_INVALID".equals(tL_error.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        he1Var.a0(org.telegram.ui.ActionBar.g6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        break;
                    } else {
                        he1Var.a0(org.telegram.ui.ActionBar.g6.p7, LocaleController.getString(R.string.SetUrlInUse));
                        break;
                    }
                }
                break;
            case 1:
                he1.W((he1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                break;
            case 2:
                se1 se1Var = (se1) obj3;
                fo foVar = (fo) obj2;
                MessageObject messageObject = se1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    unVar = new un();
                    unVar.a = messageObject;
                    unVar.b = -1;
                    unVar.c = -1;
                    unVar.g = true;
                    unVar.d = i12;
                    unVar.e();
                }
                foVar.Gb(messageObject, unVar);
                se1Var.c(false);
                break;
            case 3:
                af1 af1Var = (af1) obj3;
                ArrayList arrayList = af1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = af1Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                af1Var.d.l();
                if (af1Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    af1Var.y = ofFloat;
                    ofFloat.addUpdateListener(new f21(af1Var, 15));
                    af1Var.y.setDuration(100L);
                    af1Var.y.start();
                } else {
                    af1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(af1Var.I);
                if (af1Var.F.getVisibility() == 0) {
                    af1Var.F.animate().alpha(0.0f).setListener(new we1(af1Var, 2)).start();
                    break;
                }
                break;
            case 4:
                lg1 lg1Var = (lg1) obj3;
                lg1Var.s.deleteTopics(lg1Var.a, (ArrayList) obj2);
                ((Runnable) obj).run();
                break;
            case 5:
                hg1 hg1Var = (hg1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = hg1Var.d0;
                if (str3.equals(hg1Var.b0)) {
                    int i13 = hg1Var.k0;
                    hg1Var.p0 = false;
                    hg1Var.l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i14);
                            i10 = ((org.telegram.ui.ActionBar.m2) hg1Var.t0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, message2, false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        hg1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        hg1Var.m0 = z10;
                    } else {
                        hg1Var.m0 = false;
                    }
                    if (hg1Var.k0 == 0) {
                        hg1Var.n0.e(hg1Var.l0, true);
                    }
                    hg1Var.o0.b(i13);
                    break;
                }
                break;
            default:
                ei1 ei1Var = (ei1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                hg.a2 a2Var = ei1Var.f;
                if (ei1Var.n) {
                    ei1Var.h = null;
                    ei1Var.d = arrayList4;
                    ei1Var.e = arrayList5;
                    a2Var.f(arrayList4, null);
                    if (ei1Var.n && !a2Var.e()) {
                        ei1Var.v.f.e(false, true);
                    }
                    ei1Var.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ee1(he1 he1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.a = 1;
        this.b = he1Var;
        this.c = tL_error;
        this.d = updatetheme;
    }
}
