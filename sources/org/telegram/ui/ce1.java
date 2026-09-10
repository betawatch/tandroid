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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ce1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ce1(Object obj, Object obj2, Object obj3, int i10) {
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
        tn tnVar = null;
        boolean z10 = false;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                fe1 fe1Var = (fe1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                fe1Var.y = 0;
                String str2 = fe1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error == null || (!"THEME_SLUG_INVALID".equals(tL_error.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        fe1Var.a0(org.telegram.ui.ActionBar.j6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        break;
                    } else {
                        fe1Var.a0(org.telegram.ui.ActionBar.j6.p7, LocaleController.getString(R.string.SetUrlInUse));
                        break;
                    }
                }
                break;
            case 1:
                fe1.W((fe1) obj3, (TLRPC.TL_error) obj, (TL_account.updateTheme) obj2);
                break;
            case 2:
                pe1 pe1Var = (pe1) obj3;
                eo eoVar = (eo) obj2;
                MessageObject messageObject = pe1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    tnVar = new tn();
                    tnVar.a = messageObject;
                    tnVar.b = -1;
                    tnVar.c = -1;
                    tnVar.g = true;
                    tnVar.d = i12;
                    tnVar.e();
                }
                eoVar.Cb(messageObject, tnVar);
                pe1Var.c(false);
                break;
            case 3:
                xe1 xe1Var = (xe1) obj3;
                ArrayList arrayList = xe1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = xe1Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                xe1Var.d.l();
                if (xe1Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    xe1Var.y = ofFloat;
                    ofFloat.addUpdateListener(new f21(xe1Var, 15));
                    xe1Var.y.setDuration(100L);
                    xe1Var.y.start();
                } else {
                    xe1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(xe1Var.I);
                if (xe1Var.F.getVisibility() == 0) {
                    xe1Var.F.animate().alpha(0.0f).setListener(new te1(xe1Var, 2)).start();
                    break;
                }
                break;
            case 4:
                ig1 ig1Var = (ig1) obj3;
                ig1Var.s.deleteTopics(ig1Var.a, (ArrayList) obj2);
                ((Runnable) obj).run();
                break;
            case 5:
                eg1 eg1Var = (eg1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = eg1Var.d0;
                if (str3.equals(eg1Var.b0)) {
                    int i13 = eg1Var.k0;
                    eg1Var.p0 = false;
                    eg1Var.l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i14);
                            i10 = ((org.telegram.ui.ActionBar.p2) eg1Var.t0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, message2, false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        eg1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        eg1Var.m0 = z10;
                    } else {
                        eg1Var.m0 = false;
                    }
                    if (eg1Var.k0 == 0) {
                        eg1Var.n0.e(eg1Var.l0, true);
                    }
                    eg1Var.o0.b(i13);
                    break;
                }
                break;
            default:
                ci1 ci1Var = (ci1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                fg.d2 d2Var = ci1Var.f;
                if (ci1Var.n) {
                    ci1Var.h = null;
                    ci1Var.d = arrayList4;
                    ci1Var.e = arrayList5;
                    d2Var.f(arrayList4, null);
                    if (ci1Var.n && !d2Var.e()) {
                        ci1Var.v.f.e(false, true);
                    }
                    ci1Var.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ce1(fe1 fe1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        this.a = 1;
        this.b = fe1Var;
        this.c = tL_error;
        this.d = updatetheme;
    }
}
