package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class dw0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ mw0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ dw0(mw0 mw0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList) {
        this.b = mw0Var;
        this.c = z10;
        this.d = pollAnswer;
        this.e = n2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mw0 mw0Var = this.b;
                mw0Var.getClass();
                boolean z10 = this.c;
                org.telegram.ui.ActionBar.n2 n2Var = this.e;
                if (z10) {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f;
                    arrayList.remove(this.d);
                    n2Var.getSendMessagesHelper().sendVote(mw0Var.H, arrayList, null);
                } else {
                    n2Var.getSendMessagesHelper().sendVote(mw0Var.H, null, null);
                }
                mw0Var.c(true);
                break;
            default:
                mw0 mw0Var2 = this.b;
                mw0Var2.getClass();
                boolean z11 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = this.e;
                if (z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(mw0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = new ArrayList<>(1);
                    arrayList3.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(mw0Var2.H, arrayList3, null);
                }
                mw0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ dw0(mw0 mw0Var, boolean z10, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = mw0Var;
        this.c = z10;
        this.e = n2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
