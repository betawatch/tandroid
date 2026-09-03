package oh;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class e4 {
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
