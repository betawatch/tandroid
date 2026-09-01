package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lv0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ tv0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ lv0(tv0 tv0Var, boolean z4, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList) {
        this.b = tv0Var;
        this.c = z4;
        this.d = pollAnswer;
        this.e = p2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tv0 tv0Var = this.b;
                tv0Var.getClass();
                boolean z4 = this.c;
                org.telegram.ui.ActionBar.p2 p2Var = this.e;
                if (z4) {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f;
                    arrayList.remove(this.d);
                    p2Var.getSendMessagesHelper().sendVote(tv0Var.E, arrayList, null);
                } else {
                    p2Var.getSendMessagesHelper().sendVote(tv0Var.E, null, null);
                }
                tv0Var.c(true);
                break;
            default:
                tv0 tv0Var2 = this.b;
                tv0Var2.getClass();
                boolean z10 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = this.e;
                if (z10) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    p2Var2.getSendMessagesHelper().sendVote(tv0Var2.E, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = new ArrayList<>(1);
                    arrayList3.add(pollAnswer);
                    p2Var2.getSendMessagesHelper().sendVote(tv0Var2.E, arrayList3, null);
                }
                tv0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ lv0(tv0 tv0Var, boolean z4, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = tv0Var;
        this.c = z4;
        this.e = p2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
