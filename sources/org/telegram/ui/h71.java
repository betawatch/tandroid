package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h71 extends x71 {
    public final /* synthetic */ cn l2;
    public final /* synthetic */ boolean m2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h71(Object obj, cn cnVar, boolean z9) {
        super(obj, null, true);
        this.l2 = cnVar;
        this.m2 = z9;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        an anVar = this.l2.za;
        anVar.r(anVar.f, anVar.g, false, Boolean.valueOf(this.m2), false);
    }
}
