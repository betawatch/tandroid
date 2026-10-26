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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h71(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        int i10;
        int i11 = this.a;
        kn knVar = null;
        int i12 = 1;
        boolean z10 = false;
        z10 = false;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((i71) obj3).j0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.n0();
                    n71 n71Var = sessionsActivity.a;
                    if (n71Var != null) {
                        n71Var.l();
                    }
                    sessionsActivity.l0(true);
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity2 = ((j71) obj3).a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.n0();
                    n71 n71Var2 = sessionsActivity2.a;
                    if (n71Var2 != null) {
                        n71Var2.l();
                        break;
                    }
                }
                break;
            case 2:
                m71 m71Var = (m71) obj3;
                p9 p9Var = (p9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    m71Var.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new l71(z10 ? 1 : 0, m71Var, p9Var));
                    break;
                } catch (Exception e) {
                    FileLog.e("Failed to pass qr code auth", e);
                    AndroidUtilities.runOnUIThread(new k71(m71Var, i12));
                    p9Var.run();
                    return;
                }
            case 3:
                xc1 xc1Var = (xc1) obj3;
                String str = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                xc1Var.x = 0;
                String str2 = xc1Var.y;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error3 == null || (!"THEME_SLUG_INVALID".equals(tL_error3.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error3.text))) {
                        xc1Var.b0(org.telegram.ui.ActionBar.y6.w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                        break;
                    } else {
                        xc1Var.b0(org.telegram.ui.ActionBar.y6.p7, LocaleController.getString(R.string.SetUrlInUse));
                        break;
                    }
                }
                break;
            case 4:
                xc1.X((xc1) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                break;
            case 5:
                id1 id1Var = (id1) obj3;
                un unVar = (un) obj2;
                MessageObject messageObject = id1Var.G;
                int i13 = ((TLRPC.TodoItem) obj).id;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    messageObject.getDialogId();
                    knVar = new kn();
                    knVar.a = messageObject;
                    knVar.b = -1;
                    knVar.c = -1;
                    knVar.g = true;
                    knVar.d = i13;
                    knVar.f();
                }
                unVar.Ob(messageObject, knVar);
                id1Var.c(false);
                break;
            case 6:
                pd1 pd1Var = (pd1) obj3;
                ArrayList arrayList = pd1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = pd1Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                pd1Var.d.l();
                if (pd1Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    pd1Var.y = ofFloat;
                    ofFloat.addUpdateListener(new v11(pd1Var, 12));
                    pd1Var.y.setDuration(100L);
                    pd1Var.y.start();
                } else {
                    pd1Var.E = 1.0f;
                }
                AndroidUtilities.cancelRunOnUIThread(pd1Var.I);
                if (pd1Var.F.getVisibility() == 0) {
                    pd1Var.F.animate().alpha(0.0f).setListener(new ld1(pd1Var, 2)).start();
                    break;
                }
                break;
            case 7:
                af1 af1Var = (af1) obj3;
                af1Var.s.deleteTopics(af1Var.a, (ArrayList) obj2);
                ((Runnable) obj).run();
                break;
            case 8:
                we1 we1Var = (we1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = we1Var.f0;
                if (str3.equals(we1Var.d0)) {
                    int i14 = we1Var.m0;
                    we1Var.r0 = false;
                    we1Var.n0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i15 = 0; i15 < messages_messages.messages.size(); i15++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i15);
                            i10 = ((org.telegram.ui.ActionBar.r2) we1Var.v0).currentAccount;
                            MessageObject messageObject2 = new MessageObject(i10, message2, false, false);
                            messageObject2.setQuery(str3);
                            arrayList3.add(messageObject2);
                        }
                        we1Var.N();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        we1Var.o0 = z10;
                    } else {
                        we1Var.o0 = false;
                    }
                    if (we1Var.m0 == 0) {
                        we1Var.p0.e(we1Var.n0, true);
                    }
                    we1Var.q0.b(i14);
                    break;
                }
                break;
            default:
                qg1 qg1Var = (qg1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                ig.a2 a2Var = qg1Var.f;
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

    public /* synthetic */ h71(xc1 xc1Var, String str, TLRPC.TL_error tL_error) {
        this.a = 3;
        this.d = xc1Var;
        this.c = str;
        this.b = tL_error;
    }
}
