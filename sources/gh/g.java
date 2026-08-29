package gh;

import android.content.Context;
import android.view.TextureView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g extends TextureView {
    public final /* synthetic */ j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, Context context) {
        super(context);
        this.a = jVar;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        j jVar = this.a;
        setMeasuredDimension(jVar.g, jVar.h);
    }
}
