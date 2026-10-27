package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dc1 extends vc1 {
    public final /* synthetic */ wn l2;
    public final /* synthetic */ boolean m2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc1(Object obj, wn wnVar, boolean z10) {
        super(obj, null, true);
        this.l2 = wnVar;
        this.m2 = z10;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        un unVar = this.l2.ua;
        unVar.q(unVar.f, unVar.g, false, Boolean.valueOf(this.m2), false);
    }
}
