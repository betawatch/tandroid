package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class jw0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ sw0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ jw0(sw0 sw0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList) {
        this.b = sw0Var;
        this.c = z10;
        this.d = pollAnswer;
        this.e = m2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sw0 sw0Var = this.b;
                sw0Var.getClass();
                boolean z10 = this.c;
                org.telegram.ui.ActionBar.m2 m2Var = this.e;
                if (z10) {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f;
                    arrayList.remove(this.d);
                    m2Var.getSendMessagesHelper().sendVote(sw0Var.H, arrayList, null);
                } else {
                    m2Var.getSendMessagesHelper().sendVote(sw0Var.H, null, null);
                }
                sw0Var.c(true);
                break;
            default:
                sw0 sw0Var2 = this.b;
                sw0Var2.getClass();
                boolean z11 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = this.e;
                if (z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    m2Var2.getSendMessagesHelper().sendVote(sw0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = new ArrayList<>(1);
                    arrayList3.add(pollAnswer);
                    m2Var2.getSendMessagesHelper().sendVote(sw0Var2.H, arrayList3, null);
                }
                sw0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ jw0(sw0 sw0Var, boolean z10, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = sw0Var;
        this.c = z10;
        this.e = m2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
