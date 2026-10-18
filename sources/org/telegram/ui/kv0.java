package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ sv0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ kv0(sv0 sv0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList) {
        this.b = sv0Var;
        this.c = z10;
        this.d = pollAnswer;
        this.e = n2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sv0 sv0Var = this.b;
                sv0Var.getClass();
                boolean z10 = this.c;
                org.telegram.ui.ActionBar.n2 n2Var = this.e;
                if (z10) {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f;
                    arrayList.remove(this.d);
                    n2Var.getSendMessagesHelper().sendVote(sv0Var.H, arrayList, null);
                } else {
                    n2Var.getSendMessagesHelper().sendVote(sv0Var.H, null, null);
                }
                sv0Var.c(true);
                break;
            default:
                sv0 sv0Var2 = this.b;
                sv0Var2.getClass();
                boolean z11 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = this.e;
                if (z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(sv0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = new ArrayList<>(1);
                    arrayList3.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(sv0Var2.H, arrayList3, null);
                }
                sv0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ kv0(sv0 sv0Var, boolean z10, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = sv0Var;
        this.c = z10;
        this.e = n2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
