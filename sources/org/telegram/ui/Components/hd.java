package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd implements org.telegram.messenger.s10 {
    public final /* synthetic */ ChatActivityEnterView a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ ji.f c;
    public final /* synthetic */ String d;

    public /* synthetic */ hd(ChatActivityEnterView chatActivityEnterView, boolean[] zArr, ji.f fVar, String str) {
        this.a = chatActivityEnterView;
        this.b = zArr;
        this.c = fVar;
        this.d = str;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj3;
        ChatActivityEnterView chatActivityEnterView = this.a;
        td tdVar = chatActivityEnterView.d6;
        boolean[] zArr = this.b;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        chatActivityEnterView.N0 = System.currentTimeMillis();
        this.c.run();
        long x22 = chatActivityEnterView.x2(this.d, new org.telegram.messenger.camera.i(chatActivityEnterView, bool, num, num2, 22));
        chatActivityEnterView.c6 = num.intValue() == 0;
        org.telegram.messenger.g0.r(tdVar);
        org.telegram.messenger.g0.h3(tdVar, x22 + 500);
    }
}
