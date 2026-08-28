package dh;

import android.content.Context;
import android.view.TextureView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h extends TextureView {
    public final /* synthetic */ k a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, Context context) {
        super(context);
        this.a = kVar;
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        k kVar = this.a;
        setMeasuredDimension(kVar.g, kVar.h);
    }
}
