package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class dt0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ kt0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ dt0(kt0 kt0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.k2 k2Var, ArrayList arrayList) {
        this.b = kt0Var;
        this.c = z10;
        this.d = pollAnswer;
        this.e = k2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kt0 kt0Var = this.b;
                kt0Var.getClass();
                boolean z10 = this.c;
                org.telegram.ui.ActionBar.k2 k2Var = this.e;
                if (z10) {
                    ArrayList arrayList = this.f;
                    arrayList.remove(this.d);
                    k2Var.getSendMessagesHelper().w0(kt0Var.H, arrayList, null);
                } else {
                    k2Var.getSendMessagesHelper().w0(kt0Var.H, null, null);
                }
                kt0Var.c(true);
                break;
            default:
                kt0 kt0Var2 = this.b;
                kt0Var2.getClass();
                boolean z11 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.k2 k2Var2 = this.e;
                if (z11) {
                    ArrayList arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    k2Var2.getSendMessagesHelper().w0(kt0Var2.H, arrayList2, null);
                } else {
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(pollAnswer);
                    k2Var2.getSendMessagesHelper().w0(kt0Var2.H, arrayList3, null);
                }
                kt0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ dt0(kt0 kt0Var, boolean z10, org.telegram.ui.ActionBar.k2 k2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = kt0Var;
        this.c = z10;
        this.e = k2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
