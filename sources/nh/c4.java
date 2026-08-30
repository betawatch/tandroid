package nh;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class c4 {
    public e1 a;
    public h9 b;
    public SurfaceView c;
    public org.telegram.ui.o4 d;
    public TextureView e;
    public boolean f;
    public ArrayList g;

    public final void a() {
        ArrayList arrayList = this.g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
