package org.telegram.ui;

import android.animation.ValueAnimator;
import android.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k41(Object obj, Object obj2, Object obj3, int i10) {
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
        int i12 = 11;
        kn knVar = null;
        boolean z10 = false;
        int i13 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i11) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity = ((l41) obj3).j0;
                if (tL_error == null) {
                    sessionsActivity.d.remove(tL_authorization);
                    sessionsActivity.e.remove(tL_authorization);
                    sessionsActivity.q0();
                    p41 p41Var = sessionsActivity.a;
                    if (p41Var != null) {
                        p41Var.f();
                    }
                    sessionsActivity.o0(true);
                    break;
                }
                break;
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization2 = (TLRPC.TL_authorization) obj;
                SessionsActivity sessionsActivity2 = ((m41) obj3).a;
                if (tL_error2 == null) {
                    sessionsActivity2.d.remove(tL_authorization2);
                    sessionsActivity2.e.remove(tL_authorization2);
                    sessionsActivity2.q0();
                    p41 p41Var2 = sessionsActivity2.a;
                    if (p41Var2 != null) {
                        p41Var2.f();
                        break;
                    }
                }
                break;
            case 2:
                o41 o41Var = (o41) obj3;
                k9 k9Var = (k9) obj;
                try {
                    byte[] decode = Base64.decode(((String) obj2).substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                    TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                    tL_auth_acceptLoginToken.token = decode;
                    o41Var.c.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new ul0(i12, o41Var, k9Var));
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.e("Failed to pass qr code auth", e);
                    org.telegram.messenger.i0.g3(new n41(o41Var, i13));
                    k9Var.run();
                    return;
                }
            case 3:
                p91 p91Var = (p91) obj3;
                String str = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                p91Var.y = 0;
                String str2 = p91Var.D;
                if (str2 != null && str2.equals(str)) {
                    if (tL_error3 == null || (!"THEME_SLUG_INVALID".equals(tL_error3.text) && !"THEME_SLUG_OCCUPIED".equals(tL_error3.text))) {
                        p91Var.e0(org.telegram.ui.ActionBar.t6.w6, org.telegram.messenger.cd.a0("SetUrlAvailable", null, 2131745525, str));
                        break;
                    } else {
                        p91Var.e0(org.telegram.ui.ActionBar.t6.p7, org.telegram.messenger.cd.L0(2131745523, null));
                        break;
                    }
                }
                break;
            case 4:
                p91.a0((p91) obj3, (TLRPC.TL_error) obj2, (TL_account.updateTheme) obj);
                break;
            case 5:
                x91 x91Var = (x91) obj3;
                un unVar = (un) obj2;
                org.telegram.messenger.jj jjVar = x91Var.G;
                int i14 = ((TLRPC.TodoItem) obj).id;
                if (jjVar != null && (message = jjVar.k) != null && (message.media instanceof TLRPC.TL_messageMediaToDo)) {
                    org.telegram.messenger.jj.B0(message);
                    knVar = new kn();
                    knVar.a = jjVar;
                    knVar.b = -1;
                    knVar.c = -1;
                    knVar.g = true;
                    knVar.d = i14;
                    knVar.f();
                }
                unVar.Vb(jjVar, knVar);
                x91Var.c(false);
                break;
            case 6:
                ea1 ea1Var = (ea1) obj3;
                ArrayList arrayList = ea1Var.h;
                arrayList.clear();
                ArrayList arrayList2 = ea1Var.f;
                arrayList2.clear();
                arrayList.addAll((ArrayList) obj2);
                arrayList2.addAll(((TLRPC.TL_messages_inactiveChats) obj).chats);
                ea1Var.d.f();
                if (ea1Var.a.getMeasuredHeight() > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ea1Var.D = ofFloat;
                    ofFloat.addUpdateListener(new u01(ea1Var, 11));
                    ea1Var.D.setDuration(100L);
                    ea1Var.D.start();
                } else {
                    ea1Var.E = 1.0f;
                }
                org.telegram.messenger.i0.r(ea1Var.I);
                if (ea1Var.F.getVisibility() == 0) {
                    ea1Var.F.animate().alpha(0.0f).setListener(new aa1(ea1Var, 2)).start();
                    break;
                }
                break;
            case 7:
                pb1 pb1Var = (pb1) obj3;
                pb1Var.s.d((ArrayList) obj2, pb1Var.a);
                ((Runnable) obj).run();
                break;
            case 8:
                lb1 lb1Var = (lb1) obj3;
                String str3 = (String) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = lb1Var.f0;
                if (str3.equals(lb1Var.d0)) {
                    int i15 = lb1Var.m0;
                    lb1Var.r0 = false;
                    lb1Var.n0 = false;
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i16 = 0; i16 < messages_messages.messages.size(); i16++) {
                            TLRPC.Message message2 = messages_messages.messages.get(i16);
                            i10 = ((org.telegram.ui.ActionBar.k2) lb1Var.v0).currentAccount;
                            org.telegram.messenger.jj jjVar2 = new org.telegram.messenger.jj(i10, message2, false, false);
                            jjVar2.J5(str3, true);
                            arrayList3.add(jjVar2);
                        }
                        lb1Var.N();
                        if (arrayList3.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                            z10 = true;
                        }
                        lb1Var.o0 = z10;
                    } else {
                        lb1Var.o0 = false;
                    }
                    if (lb1Var.m0 == 0) {
                        lb1Var.p0.e(lb1Var.n0, true);
                    }
                    lb1Var.q0.b(i15);
                    break;
                }
                break;
            default:
                fd1 fd1Var = (fd1) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                zf.m1 m1Var = fd1Var.f;
                if (fd1Var.n) {
                    fd1Var.h = null;
                    fd1Var.d = arrayList4;
                    fd1Var.e = arrayList5;
                    m1Var.f(arrayList4, null);
                    if (fd1Var.n && !m1Var.e()) {
                        fd1Var.w.f.e(false, true);
                    }
                    fd1Var.f();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ k41(p91 p91Var, String str, TLRPC.TL_error tL_error) {
        this.a = 3;
        this.d = p91Var;
        this.c = str;
        this.b = tL_error;
    }
}
