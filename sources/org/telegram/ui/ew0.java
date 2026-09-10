package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ow0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ ew0(ow0 ow0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList) {
        this.b = ow0Var;
        this.c = z10;
        this.d = pollAnswer;
        this.e = p2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ow0 ow0Var = this.b;
                ow0Var.getClass();
                boolean z10 = this.c;
                org.telegram.ui.ActionBar.p2 p2Var = this.e;
                if (z10) {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f;
                    arrayList.remove(this.d);
                    p2Var.getSendMessagesHelper().sendVote(ow0Var.H, arrayList, null);
                } else {
                    p2Var.getSendMessagesHelper().sendVote(ow0Var.H, null, null);
                }
                ow0Var.c(true);
                break;
            default:
                ow0 ow0Var2 = this.b;
                ow0Var2.getClass();
                boolean z11 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = this.e;
                if (z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    p2Var2.getSendMessagesHelper().sendVote(ow0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = new ArrayList<>(1);
                    arrayList3.add(pollAnswer);
                    p2Var2.getSendMessagesHelper().sendVote(ow0Var2.H, arrayList3, null);
                }
                ow0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ ew0(ow0 ow0Var, boolean z10, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = ow0Var;
        this.c = z10;
        this.e = p2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
