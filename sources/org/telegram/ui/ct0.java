package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ct0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ jt0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ ct0(jt0 jt0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.k2 k2Var, ArrayList arrayList) {
        this.b = jt0Var;
        this.c = z10;
        this.d = pollAnswer;
        this.e = k2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jt0 jt0Var = this.b;
                jt0Var.getClass();
                boolean z10 = this.c;
                org.telegram.ui.ActionBar.k2 k2Var = this.e;
                if (z10) {
                    ArrayList arrayList = this.f;
                    arrayList.remove(this.d);
                    k2Var.getSendMessagesHelper().w0(jt0Var.H, arrayList, null);
                } else {
                    k2Var.getSendMessagesHelper().w0(jt0Var.H, null, null);
                }
                jt0Var.c(true);
                break;
            default:
                jt0 jt0Var2 = this.b;
                jt0Var2.getClass();
                boolean z11 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.k2 k2Var2 = this.e;
                if (z11) {
                    ArrayList arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    k2Var2.getSendMessagesHelper().w0(jt0Var2.H, arrayList2, null);
                } else {
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(pollAnswer);
                    k2Var2.getSendMessagesHelper().w0(jt0Var2.H, arrayList3, null);
                }
                jt0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ ct0(jt0 jt0Var, boolean z10, org.telegram.ui.ActionBar.k2 k2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = jt0Var;
        this.c = z10;
        this.e = k2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
