package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.pc;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class h2 implements nb {
    public final /* synthetic */ n2 a;

    public h2(n2 n2Var) {
        this.a = n2Var;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.nb
    public final int f(int i10) {
        if (this.a.isSupportEdgeToEdge()) {
            return AndroidUtilities.navigationBarHeight;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ boolean g(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ int h(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ void b(pc pcVar) {
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ void c(float f7) {
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ void d(pc pcVar) {
    }
}
