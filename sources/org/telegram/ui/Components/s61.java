package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s61 extends ImageReceiver {
    public final /* synthetic */ t61 a;

    public s61(t61 t61Var) {
        this.a = t61Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.r5
    public final void invalidate() {
        this.a.invalidate();
    }
}
