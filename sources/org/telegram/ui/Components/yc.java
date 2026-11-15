package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        long n22 = chatActivityEnterView.n2(this.d, new org.telegram.ui.ActionBar.l5(chatActivityEnterView, bool, num, num2, 19));
        chatActivityEnterView.W5 = num.intValue() == 0;
        org.telegram.messenger.g0.r(ucVar);
        org.telegram.messenger.g0.i3(ucVar, n22 + 500);
    }
}
