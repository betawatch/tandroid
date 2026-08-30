package ih;

import android.content.Context;
import android.view.TextureView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
