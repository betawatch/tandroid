package jh;

import android.content.Context;
import android.view.TextureView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
