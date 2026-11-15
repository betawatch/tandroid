package org.telegram.ui;

import android.animation.ValueAnimator;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q21(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        int i7;
        int i10 = this.a;
        qm qmVar = null;
        boolean z10 = false;
        int i11 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((r21) obj3).k0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.r0();
                    v21 v21Var = sessionsActivity.a;
                    if (v21Var != null) {
                        v21Var.f();
                    }
                    sessionsActivity.p0(true);
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity2 = ((s21) obj3).a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.r0();
                    v21 v21Var2 = sessionsActivity2.a;
                    if (v21Var2 != null) {
                        v21Var2.f();
                        break;
                    }
                }
                break;
            case 2:
                u21 u21Var = (u21) obj3;
                j9 j9Var = (j9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    u21Var.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new b00(29, u21Var, j9Var));
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.e("Failed to pass qr code auth", e10);
                    org.telegram.messenger.g0.h3(new t21(u21Var, i11));
                    j9Var.run();
                    return;
                }
            case 3:
                w71 w71Var = (w71) obj3;
                String str = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                w71Var.y = 0;
                String str2 = w71Var.E;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error3 == null || (!"THEME_SLUG_INVALID".equals(tL_error3.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error3.text))) {
                        w71Var.f0(org.telegram.ui.ActionBar.j6.w6, org.telegram.messenger.hd.a0("SetUrlAvailable", null, 2131745508, str));
                        break;
                    } else {
                        w71Var.f0(org.telegram.ui.ActionBar.j6.p7, org.telegram.messenger.hd.M0(2131745506, null));
                        break;
                    }
                }
                break;
            case 4:
                w71.b0((w71) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                break;
            case 5:
                e81 e81Var = (e81) obj3;
                an anVar = (an) obj2;
                org.telegram.messenger.gj gjVar = e81Var.H;
                int i12 = ((TLRPC.TodoItem) obj).id;
                if (gjVar != null && (message = gjVar.k) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    org.telegram.messenger.gj.B0(message);
                    qmVar = new qm();
                    qmVar.a = gjVar;
                    qmVar.b = -1;
                    qmVar.c = -1;
                    qmVar.g = true;
                    qmVar.d = i12;
                    qmVar.f();
                }
                anVar.jc(gjVar, qmVar);
                e81Var.c(false);
                break;
            case 6:
                l81 l81Var = (l81) obj3;
                ArrayList arrayList = l81Var.h;
                arrayList.clear();
                ArrayList arrayList2 = l81Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                l81Var.d.f();
                if (l81Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    l81Var.E = ofFloat;
                    ofFloat.addUpdateListener(new ez0(l81Var, 11));
                    l81Var.E.setDuration(100L);
                    l81Var.E.start();
                } else {
                    l81Var.F = 1.0f;
                }
                org.telegram.messenger.g0.r(l81Var.J);
                if (l81Var.G.getVisibility() == 0) {
                    l81Var.G.animate().alpha(0.0f).setListener(new h81(l81Var, 2)).start();
                    break;
                }
                break;
            case 7:
                u91 u91Var = (u91) obj3;
                u91Var.s.d((ArrayList) obj2, u91Var.a);
                ((Runnable) obj).run();
                break;
            case 8:
                q91 q91Var = (q91) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = q91Var.g0;
                if (str3.equals(q91Var.e0)) {
                    int i13 = q91Var.n0;
                    q91Var.s0 = false;
                    q91Var.o0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i14 = 0; i14 < messages_messages.messages.size(); i14++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i14);
                            i7 = ((org.telegram.ui.ActionBar.e2) q91Var.w0).currentAccount;
                            org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(i7, message2, false, false);
                            gjVar2.K5(str3, true);
                            arrayList3.add(gjVar2);
                        }
                        q91Var.L();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        q91Var.p0 = z10;
                    } else {
                        q91Var.p0 = false;
                    }
                    if (q91Var.n0 == 0) {
                        q91Var.q0.e(q91Var.o0, true);
                    }
                    q91Var.r0.b(i13);
                    break;
                }
                break;
            default:
                ib1 ib1Var = (ib1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                jg.z1 z1Var = ib1Var.f;
                if (ib1Var.n) {
                    ib1Var.h = null;
                    ib1Var.d = arrayList4;
                    ib1Var.e = arrayList5;
                    z1Var.f(arrayList4, null);
                    if (ib1Var.n && !z1Var.e()) {
                        ib1Var.w.f.e(false, true);
                    }
                    ib1Var.f();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q21(w71 w71Var, String str, TLRPC.TL_error tL_error) {
        this.a = 3;
        this.d = w71Var;
        this.c = str;
        this.b = tL_error;
    }
}
