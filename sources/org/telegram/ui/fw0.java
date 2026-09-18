package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fw0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ow0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ fw0(ow0 ow0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList) {
        this.b = ow0Var;
        this.c = z10;
        this.d = pollAnswer;
        this.e = o2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ow0 ow0Var = this.b;
                ow0Var.getClass();
                boolean z10 = this.c;
                org.telegram.ui.ActionBar.o2 o2Var = this.e;
                if (z10) {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f;
                    arrayList.remove(this.d);
                    o2Var.getSendMessagesHelper().sendVote(ow0Var.H, arrayList, null);
                } else {
                    o2Var.getSendMessagesHelper().sendVote(ow0Var.H, null, null);
                }
                ow0Var.c(true);
                break;
            default:
                ow0 ow0Var2 = this.b;
                ow0Var2.getClass();
                boolean z11 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = this.e;
                if (z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    o2Var2.getSendMessagesHelper().sendVote(ow0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = new ArrayList<>(1);
                    arrayList3.add(pollAnswer);
                    o2Var2.getSendMessagesHelper().sendVote(ow0Var2.H, arrayList3, null);
                }
                ow0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ fw0(ow0 ow0Var, boolean z10, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = ow0Var;
        this.c = z10;
        this.e = o2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
