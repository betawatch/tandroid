package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iw0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ rw0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ iw0(rw0 rw0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList) {
        this.b = rw0Var;
        this.c = z10;
        this.d = pollAnswer;
        this.e = m2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rw0 rw0Var = this.b;
                rw0Var.getClass();
                boolean z10 = this.c;
                org.telegram.ui.ActionBar.m2 m2Var = this.e;
                if (z10) {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f;
                    arrayList.remove(this.d);
                    m2Var.getSendMessagesHelper().sendVote(rw0Var.H, arrayList, null);
                } else {
                    m2Var.getSendMessagesHelper().sendVote(rw0Var.H, null, null);
                }
                rw0Var.c(true);
                break;
            default:
                rw0 rw0Var2 = this.b;
                rw0Var2.getClass();
                boolean z11 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = this.e;
                if (z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    m2Var2.getSendMessagesHelper().sendVote(rw0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = new ArrayList<>(1);
                    arrayList3.add(pollAnswer);
                    m2Var2.getSendMessagesHelper().sendVote(rw0Var2.H, arrayList3, null);
                }
                rw0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ iw0(rw0 rw0Var, boolean z10, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = rw0Var;
        this.c = z10;
        this.e = m2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
