package dg;

import android.view.View;
import gg.o;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements d5.d {
    public final /* synthetic */ boolean a;

    public /* synthetic */ f(boolean z10) {
        this.a = z10;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        View view = (View) obj;
        if (view instanceof o) {
            ((o) view).g(this.a, true);
        }
    }
}
