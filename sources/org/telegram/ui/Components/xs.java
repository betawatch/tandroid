package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class xs implements org.telegram.messenger.r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xs(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.r10
    public final Object run() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.b).w());
            case 1:
                return ((l30) this.b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((ft) this.b).w());
        }
    }
}
