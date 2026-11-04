package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf implements org.telegram.messenger.n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ String c;

    public /* synthetic */ nf(wm wmVar, String str, int i3) {
        this.a = i3;
        this.b = wmVar;
        this.c = str;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    wm wmVar = this.b;
                    String str = this.c;
                    if (booleanValue) {
                        wmVar.getMessagesController().p(str, false);
                    }
                    wmVar.getParentActivity();
                    sf.c.o(str);
                    break;
                }
                break;
            default:
                wm wmVar2 = this.b;
                wmVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.c;
                    if (booleanValue2) {
                        wmVar2.getMessagesController().p(str2, true);
                    }
                    sf.c.n(wmVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
