package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd implements org.telegram.messenger.t10 {
    public final /* synthetic */ ChatActivityEnterView a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ ji.h c;
    public final /* synthetic */ String d;

    public /* synthetic */ hd(ChatActivityEnterView chatActivityEnterView, boolean[] zArr, ji.h hVar, String str) {
        this.a = chatActivityEnterView;
        this.b = zArr;
        this.c = hVar;
        this.d = str;
    }

    @Override // org.telegram.messenger.t10
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
        long A2 = chatActivityEnterView.A2(this.d, new org.telegram.messenger.camera.i(chatActivityEnterView, bool, num, num2, 22));
        chatActivityEnterView.e6 = num.intValue() == 0;
        org.telegram.messenger.g0.r(tdVar);
        org.telegram.messenger.g0.h3(tdVar, A2 + 500);
    }
}
