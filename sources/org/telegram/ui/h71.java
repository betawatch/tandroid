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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h71(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.a;
        in inVar = null;
        int i12 = 1;
        boolean z10 = false;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((i71) obj3).a;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.m0();
                    l71 l71Var = sessionsActivity.a;
                    if (l71Var != null) {
                        l71Var.l();
                        break;
                    }
                }
                break;
            case 1:
                k71 k71Var = (k71) obj3;
                n9 n9Var = (n9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    k71Var.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new a50(28, k71Var, n9Var));
                    break;
                } catch (Exception e) {
                    FileLog.e("Failed to pass qr code auth", e);
                    AndroidUtilities.runOnUIThread(new j71(k71Var, i12));
                    n9Var.run();
                    return;
                }
            case 2:
                uc1 uc1Var = (uc1) obj3;
                String str = (String) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                uc1Var.x = 0;
                String str2 = uc1Var.y;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error2 == null || (!"THEME_SLUG_INVALID".equals(tL_error2.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error2.text))) {
                        uc1Var.a0(org.telegram.ui.ActionBar.k6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        break;
                    } else {
                        uc1Var.a0(org.telegram.ui.ActionBar.k6.p7, LocaleController.getString(R.string.SetUrlInUse));
                        break;
                    }
                }
                break;
            case 3:
                uc1.W((uc1) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                break;
            case 4:
                ed1 ed1Var = (ed1) obj3;
                sn snVar = (sn) obj2;
                MessageObject messageObject = ed1Var.G;
                int i13 = ((TLRPC.TodoItem) obj).id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    inVar = new in();
                    inVar.a = messageObject;
                    inVar.b = -1;
                    inVar.c = -1;
                    inVar.g = true;
                    inVar.d = i13;
                    inVar.f();
                }
                snVar.Ib(messageObject, inVar);
                ed1Var.c(false);
                break;
            case 5:
                md1 md1Var = (md1) obj3;
                ArrayList arrayList = md1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = md1Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                md1Var.d.l();
                if (md1Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    md1Var.y = ofFloat;
                    ofFloat.addUpdateListener(new g11(md1Var, 13));
                    md1Var.y.setDuration(100L);
                    md1Var.y.start();
                } else {
                    md1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(md1Var.I);
                if (md1Var.F.getVisibility() == 0) {
                    md1Var.F.animate().alpha(0.0f).setListener(new id1(md1Var, 2)).start();
                    break;
                }
                break;
            case 6:
                ye1 ye1Var = (ye1) obj3;
                ye1Var.s.deleteTopics(ye1Var.a, (ArrayList) obj2);
                ((Runnable) obj).run();
                break;
            case 7:
                te1 te1Var = (te1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = te1Var.d0;
                if (str3.equals(te1Var.b0)) {
                    int i14 = te1Var.k0;
                    te1Var.p0 = false;
                    te1Var.l0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i15 = 0; i15 < messages_messages.messages.size(); i15++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i15);
                            i10 = ((org.telegram.ui.ActionBar.o2) te1Var.t0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, message2, false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        te1Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        te1Var.m0 = z10;
                    } else {
                        te1Var.m0 = false;
                    }
                    if (te1Var.k0 == 0) {
                        te1Var.n0.e(te1Var.l0, true);
                    }
                    te1Var.o0.b(i14);
                    break;
                }
                break;
            default:
                qg1 qg1Var = (qg1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                hg.a2 a2Var = qg1Var.f;
                if (qg1Var.n) {
                    qg1Var.h = null;
                    qg1Var.d = arrayList4;
                    qg1Var.e = arrayList5;
                    a2Var.f(arrayList4, null);
                    if (qg1Var.n && !a2Var.e()) {
                        qg1Var.v.f.e(false, true);
                    }
                    qg1Var.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h71(uc1 uc1Var, String str, TLRPC.TL_error tL_error) {
        this.a = 2;
        this.b = uc1Var;
        this.d = str;
        this.c = tL_error;
    }
}
