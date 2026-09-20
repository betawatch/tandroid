package org.telegram.ui.Components;

import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class cz0 implements yc0, ad0 {
    public final /* synthetic */ ez0 a;

    @Override // org.telegram.ui.Components.yc0
    public String e(int i10) {
        return this.a.h[i10];
    }

    @Override // org.telegram.ui.Components.ad0
    public void q(cd0 cd0Var, int i10) {
        ez0 ez0Var = this.a;
        ez0Var.b();
        SharedConfig.updateChatListSwipeSetting(i10);
        ez0Var.invalidate();
        try {
            cd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
