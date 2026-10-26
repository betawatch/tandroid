package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ xv0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ pv0(xv0 xv0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.r2 r2Var, ArrayList arrayList) {
        this.b = xv0Var;
        this.c = z10;
        this.d = pollAnswer;
        this.e = r2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xv0 xv0Var = this.b;
                xv0Var.getClass();
                boolean z10 = this.c;
                org.telegram.ui.ActionBar.r2 r2Var = this.e;
                if (z10) {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f;
                    arrayList.remove(this.d);
                    r2Var.getSendMessagesHelper().sendVote(xv0Var.H, arrayList, null);
                } else {
                    r2Var.getSendMessagesHelper().sendVote(xv0Var.H, null, null);
                }
                xv0Var.c(true);
                break;
            default:
                xv0 xv0Var2 = this.b;
                xv0Var2.getClass();
                boolean z11 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.r2 r2Var2 = this.e;
                if (z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    r2Var2.getSendMessagesHelper().sendVote(xv0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = new ArrayList<>(1);
                    arrayList3.add(pollAnswer);
                    r2Var2.getSendMessagesHelper().sendVote(xv0Var2.H, arrayList3, null);
                }
                xv0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ pv0(xv0 xv0Var, boolean z10, org.telegram.ui.ActionBar.r2 r2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = xv0Var;
        this.c = z10;
        this.e = r2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
