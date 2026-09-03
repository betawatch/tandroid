package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.ic;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class j2 implements fb {
    public final /* synthetic */ p2 a;

    public j2(p2 p2Var) {
        this.a = p2Var;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.fb
    public final int f(int i10) {
        if (this.a.isSupportEdgeToEdge()) {
            return AndroidUtilities.navigationBarHeight;
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean g(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ int h(int i10) {
        return 0;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ void b(ic icVar) {
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ void c(float f10) {
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ void d(ic icVar) {
    }
}
