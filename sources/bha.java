// default package

import android.content.Context;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
