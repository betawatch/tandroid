// default package

import android.content.Context;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class bha extends ScrollSlidingTextTabStrip {
    public final /* synthetic */ eja q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bha(eja ejaVar, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.q0 = ejaVar;
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip
    public final int e(int i) {
        return this.q0.c1(i);
    }
}
