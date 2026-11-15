package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc implements org.telegram.messenger.u10 {
    public final /* synthetic */ ChatActivityEnterView a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ ji.f c;
    public final /* synthetic */ String d;

    public /* synthetic */ yc(ChatActivityEnterView chatActivityEnterView, boolean[] zArr, ji.f fVar, String str) {
        this.a = chatActivityEnterView;
        this.b = zArr;
        this.c = fVar;
        this.d = str;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj3;
        ChatActivityEnterView chatActivityEnterView = this.a;
        uc ucVar = chatActivityEnterView.X5;
        boolean[] zArr = this.b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        chatActivityEnterView.N0 = System.currentTimeMillis();
        this.c.run();
        long n22 = chatActivityEnterView.n2(this.d, new org.telegram.ui.ActionBar.m5(chatActivityEnterView, bool, num, num2, 18));
        chatActivityEnterView.W5 = num.intValue() == 0;
        org.telegram.messenger.g0.r(ucVar);
        org.telegram.messenger.g0.i3(ucVar, n22 + 500);
    }
}
