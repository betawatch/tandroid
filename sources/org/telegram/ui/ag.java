package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag implements or0, ww {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ag(bn bnVar, boolean z10, org.telegram.messenger.fj fjVar, int i7) {
        this.c = bnVar;
        this.a = z10;
        this.d = fjVar;
        this.b = i7;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean P(cx cxVar) {
        return false;
    }

    @Override // org.telegram.ui.or0
    public void a(TLRPC.MessageMedia messageMedia) {
        int i7;
        bn bnVar = (bn) this.c;
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.d;
        if (!this.a) {
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.MessageMedia messageMedia2 = fjVar.k.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            fjVar.k.media = messageMedia;
            bnVar.getSendMessagesHelper().t(fjVar, null, null, null, null, null, null, null, false, false, null);
            return;
        }
        TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
        tL_messages_appendTodoList.peer = bnVar.getMessagesController().l1(org.telegram.messenger.fj.B0(fjVar.k));
        tL_messages_appendTodoList.msg_id = fjVar.e1();
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                i7 = this.b;
                if (i10 >= i7) {
                    break;
                }
                i11 = Math.max(i11, tL_messageMediaToDo.todo.list.get(i10).id);
                i10++;
            }
            while (i7 < tL_messageMediaToDo.todo.list.size()) {
                TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i7);
                if (todoItem.id <= i11) {
                    todoItem.id = i11 + 1;
                }
                tL_messages_appendTodoList.list.add(todoItem);
                i11 = Math.max(i11, todoItem.id);
                i7++;
            }
            TLRPC.MessageMedia messageMedia3 = fjVar.k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        fjVar.k.media = messageMedia;
        bnVar.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
    }

    @Override // org.telegram.ui.ww
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        String str = (String) this.d;
        String str2 = LaunchActivity.C1;
        long j3 = ((org.telegram.messenger.sr) arrayList.get(0)).a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.a);
        if (org.telegram.messenger.n5.C(j3)) {
            bundle.putInt("enc_id", (int) (4294967295L & j3));
        } else if (org.telegram.messenger.n5.E(j3)) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        int i11 = this.b;
        if (!org.telegram.messenger.mp.u1(i11).E(bundle, cxVar, null, null)) {
            return true;
        }
        org.telegram.messenger.ks.f(i11).k(org.telegram.messenger.ks.t, new Object[0]);
        org.telegram.messenger.ri.d0(i11).V1(j3, 0, str, null, null, null, null, 0L, false, false, null);
        ((ActionBarLayout) launchActivity.M()).V(new bn(bundle), true, false);
        return true;
    }

    public /* synthetic */ ag(LaunchActivity launchActivity, boolean z10, int i7, String str) {
        this.c = launchActivity;
        this.a = z10;
        this.b = i7;
        this.d = str;
    }
}
