package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ct implements org.telegram.messenger.i20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ct(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.i20
    public final Object run() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.b).w());
            case 1:
                return ((a40) this.b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((mt) this.b).w());
        }
    }
}
