package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg implements or0, qw {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dg(an anVar, boolean z9, org.telegram.messenger.ij ijVar, int i7) {
        this.c = anVar;
        this.a = z9;
        this.d = ijVar;
        this.b = i7;
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean N(ww wwVar) {
        return false;
    }

    @Override // org.telegram.ui.or0
    public void a(TLRPC.MessageMedia messageMedia) {
        int i7;
        an anVar = (an) this.c;
        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.d;
        if (!this.a) {
            if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.MessageMedia messageMedia2 = ijVar.k.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                    ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
                }
            }
            ijVar.k.media = messageMedia;
            anVar.getSendMessagesHelper().t(ijVar, null, null, null, null, null, null, null, false, false, null);
            return;
        }
        TLRPC.TL_messages_appendTodoList tL_messages_appendTodoList = new TLRPC.TL_messages_appendTodoList();
        tL_messages_appendTodoList.peer = anVar.getMessagesController().j1(org.telegram.messenger.ij.B0(ijVar.k));
        tL_messages_appendTodoList.msg_id = ijVar.f1();
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
            TLRPC.MessageMedia messageMedia3 = ijVar.k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                tL_messageMediaToDo.completions = ((TLRPC.TL_messageMediaToDo) messageMedia3).completions;
            }
        }
        ijVar.k.media = messageMedia;
        anVar.getConnectionsManager().sendRequest(tL_messages_appendTodoList, null);
    }

    @Override // org.telegram.ui.qw
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, w91 w91Var) {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        String str = (String) this.d;
        String str2 = LaunchActivity.B1;
        long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", this.a);
        if (org.telegram.messenger.m5.C(j3)) {
            bundle.putInt("enc_id", (int) (4294967295L & j3));
        } else if (org.telegram.messenger.m5.E(j3)) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        int i11 = this.b;
        if (!org.telegram.messenger.qp.s1(i11).E(bundle, wwVar, null, null)) {
            return true;
        }
        org.telegram.messenger.qs.f(i11).k(org.telegram.messenger.qs.t, new Object[0]);
        org.telegram.messenger.ui.b0(i11).Q1(j3, 0, str, null, null, null, null, 0L, false, false, null);
        ((ActionBarLayout) launchActivity.M()).V(new an(bundle), true, false);
        return true;
    }

    public /* synthetic */ dg(LaunchActivity launchActivity, boolean z9, int i7, String str) {
        this.c = launchActivity;
        this.a = z9;
        this.b = i7;
        this.d = str;
    }
}
