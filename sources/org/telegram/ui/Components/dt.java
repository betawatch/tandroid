package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class dt implements org.telegram.messenger.p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dt(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.p10
    public final Object run() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.b).w());
            case 1:
                return ((t30) this.b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((mt) this.b).w());
        }
    }
}
