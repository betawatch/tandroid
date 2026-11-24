// default package

import android.content.Context;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kfa extends ScrollSlidingTextTabStrip {
    public final /* synthetic */ nha q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfa(nha nhaVar, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.q0 = nhaVar;
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip
    public final int e(int i) {
        return this.q0.c1(i);
    }
}
