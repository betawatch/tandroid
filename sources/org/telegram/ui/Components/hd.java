package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd implements org.telegram.messenger.r10 {
    public final /* synthetic */ ChatActivityEnterView a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ ji.i c;
    public final /* synthetic */ String d;

    public /* synthetic */ hd(ChatActivityEnterView chatActivityEnterView, boolean[] zArr, ji.i iVar, String str) {
        this.a = chatActivityEnterView;
        this.b = zArr;
        this.c = iVar;
        this.d = str;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj3;
        ChatActivityEnterView chatActivityEnterView = this.a;
        td tdVar = chatActivityEnterView.f6;
        boolean[] zArr = this.b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        chatActivityEnterView.N0 = System.currentTimeMillis();
        this.c.run();
        long D2 = chatActivityEnterView.D2(this.d, new oi.h(chatActivityEnterView, bool, num, num2, 23));
        chatActivityEnterView.e6 = num.intValue() == 0;
        org.telegram.messenger.g0.r(tdVar);
        org.telegram.messenger.g0.h3(tdVar, D2 + 500);
    }
}
