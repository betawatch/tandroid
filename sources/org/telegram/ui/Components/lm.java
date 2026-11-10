package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lm implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.c20 b;

    public /* synthetic */ lm(org.telegram.messenger.c20 c20Var, int i7) {
        this.a = i7;
        this.b = c20Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.a(new th.e((String) obj));
                break;
            default:
                int[] iArr = (int[]) obj;
                boolean z9 = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z9 = true;
                }
                this.b.a(Boolean.valueOf(z9));
                break;
        }
    }
}
