package org.telegram.ui;

import android.animation.ValueAnimator;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h71(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.a;
        in inVar = null;
        boolean z10 = false;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i11) {
            case 0:
                i71 i71Var = (i71) obj3;
                n9 n9Var = (n9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    i71Var.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new z40(28, i71Var, n9Var));
                    break;
                } catch (Exception e) {
                    FileLog.e("Failed to pass qr code auth", e);
                    AndroidUtilities.runOnUIThread(new g71(i71Var, 1));
                    n9Var.run();
                    return;
                }
            case 1:
                qc1 qc1Var = (qc1) obj3;
                String str = (String) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                qc1Var.y = 0;
                String str2 = qc1Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error == null || (!"THEME_SLUG_INVALID".equals(tL_error.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error.text))) {
                        qc1Var.a0(org.telegram.ui.ActionBar.h6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        break;
                    } else {
                        qc1Var.a0(org.telegram.ui.ActionBar.h6.p7, LocaleController.getString(R.string.SetUrlInUse));
                        break;
                    }
                }
                break;
            case 2:
                qc1.W((qc1) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                break;
            case 3:
                ad1 ad1Var = (ad1) obj3;
                sn snVar = (sn) obj2;
                MessageObject messageObject = ad1Var.G;
                int i12 = ((TLRPC.TodoItem) obj).id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    inVar = new in();
                    inVar.a = messageObject;
                    inVar.b = -1;
                    inVar.c = -1;
                    inVar.g = true;
                    inVar.d = i12;
                    inVar.f();
                }
                snVar.Gb(messageObject, inVar);
                ad1Var.c(false);
                break;
            case 4:
                id1 id1Var = (id1) obj3;
                ArrayList arrayList = id1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = id1Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                id1Var.d.l();
                if (id1Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    id1Var.y = ofFloat;
                    ofFloat.addUpdateListener(new e11(id1Var, 13));
                    id1Var.y.setDuration(100L);
                    id1Var.y.start();
                } else {
                    id1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(id1Var.I);
                if (id1Var.F.getVisibility() == 0) {
                    id1Var.F.animate().alpha(0.0f).setListener(new ed1(id1Var, 2)).start();
                    break;
                }
                break;
            case 5:
                te1 te1Var = (te1) obj3;
                te1Var.s.deleteTopics(te1Var.a, (ArrayList) obj2);
                ((Runnable) obj).run();
                break;
            case 6:
                pe1 pe1Var = (pe1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = pe1Var.d0;
                if (str3.equals(pe1Var.b0)) {
                    int i13 = pe1Var.k0;
                    pe1Var.p0 = false;
                    pe1Var.l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i14);
                            i10 = ((org.telegram.ui.ActionBar.n2) pe1Var.t0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, message2, false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        pe1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        pe1Var.m0 = z10;
                    } else {
                        pe1Var.m0 = false;
                    }
                    if (pe1Var.k0 == 0) {
                        pe1Var.n0.e(pe1Var.l0, true);
                    }
                    pe1Var.o0.b(i13);
                    break;
                }
                break;
            default:
                mg1 mg1Var = (mg1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                hg.a2 a2Var = mg1Var.f;
                if (mg1Var.n) {
                    mg1Var.h = null;
                    mg1Var.d = arrayList4;
                    mg1Var.e = arrayList5;
                    a2Var.f(arrayList4, null);
                    if (mg1Var.n && !a2Var.e()) {
                        mg1Var.v.f.e(false, true);
                    }
                    mg1Var.l();
                    break;
                }
                break;
        }
    }
}
