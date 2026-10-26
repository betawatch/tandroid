package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class c81 extends ImageReceiver {
    public final /* synthetic */ d81 a;

    public c81(d81 d81Var) {
        this.a = d81Var;
    }

    @Override // org.telegram.messenger.ImageReceiver, org.telegram.ui.Components.z5
    public final void invalidate() {
        this.a.invalidate();
    }
}
