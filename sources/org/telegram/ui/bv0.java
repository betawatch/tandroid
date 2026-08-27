package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bv0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ jv0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ bv0(jv0 jv0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList) {
        this.b = jv0Var;
        this.c = z10;
        this.d = pollAnswer;
        this.e = n2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jv0 jv0Var = this.b;
                jv0Var.getClass();
                boolean z10 = this.c;
                org.telegram.ui.ActionBar.n2 n2Var = this.e;
                if (z10) {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f;
                    arrayList.remove(this.d);
                    n2Var.getSendMessagesHelper().sendVote(jv0Var.D, arrayList, null);
                } else {
                    n2Var.getSendMessagesHelper().sendVote(jv0Var.D, null, null);
                }
                jv0Var.c(true);
                break;
            default:
                jv0 jv0Var2 = this.b;
                jv0Var2.getClass();
                boolean z11 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = this.e;
                if (z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(jv0Var2.D, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = new ArrayList<>(1);
                    arrayList3.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(jv0Var2.D, arrayList3, null);
                }
                jv0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ bv0(jv0 jv0Var, boolean z10, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = jv0Var;
        this.c = z10;
        this.e = n2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
