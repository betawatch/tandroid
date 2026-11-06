package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qs implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qs(Object obj, int i7) {
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
