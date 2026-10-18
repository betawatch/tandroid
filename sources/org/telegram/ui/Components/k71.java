package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class k71 extends ImageReceiver {
    public final /* synthetic */ l71 a;

    public k71(l71 l71Var) {
        this.a = l71Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.x5
    public final void invalidate() {
        this.a.invalidate();
    }
}
