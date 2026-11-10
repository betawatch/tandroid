package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ps implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ps(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.u10
    public final Object run() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.b).w());
            case 1:
                return ((i30) this.b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((ys) this.b).w());
        }
    }
}
