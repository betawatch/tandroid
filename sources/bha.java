// default package

import android.content.Context;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
