package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ir0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ pr0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ ir0(pr0 pr0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.d2 d2Var, ArrayList arrayList) {
        this.b = pr0Var;
        this.c = z10;
        this.d = pollAnswer;
        this.e = d2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pr0 pr0Var = this.b;
                pr0Var.getClass();
                boolean z10 = this.c;
                org.telegram.ui.ActionBar.d2 d2Var = this.e;
                if (z10) {
                    ArrayList arrayList = this.f;
                    arrayList.remove(this.d);
                    d2Var.getSendMessagesHelper().w0(pr0Var.I, arrayList, null);
                } else {
                    d2Var.getSendMessagesHelper().w0(pr0Var.I, null, null);
                }
                pr0Var.c(true);
                break;
            default:
                pr0 pr0Var2 = this.b;
                pr0Var2.getClass();
                boolean z11 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.d2 d2Var2 = this.e;
                if (z11) {
                    ArrayList arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    d2Var2.getSendMessagesHelper().w0(pr0Var2.I, arrayList2, null);
                } else {
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(pollAnswer);
                    d2Var2.getSendMessagesHelper().w0(pr0Var2.I, arrayList3, null);
                }
                pr0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ ir0(pr0 pr0Var, boolean z10, org.telegram.ui.ActionBar.d2 d2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = pr0Var;
        this.c = z10;
        this.e = d2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
