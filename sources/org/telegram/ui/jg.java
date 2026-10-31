package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ String c;

    public /* synthetic */ jg(un unVar, String str, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = str;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    un unVar = this.b;
                    String str = this.c;
                    if (booleanValue) {
                        unVar.getMessagesController().p(str, false);
                    }
                    unVar.getParentActivity();
                    gf.f.m(str);
                    break;
                }
                break;
            default:
                un unVar2 = this.b;
                unVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.c;
                    if (booleanValue2) {
                        unVar2.getMessagesController().p(str2, true);
                    }
                    gf.f.l(unVar2.getParentActivity(), str2, false, null);
                    break;
                }
                break;
        }
    }
}
