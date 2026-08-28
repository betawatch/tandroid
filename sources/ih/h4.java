package ih;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class h4 {
    public f1 a;
    public l9 b;
    public SurfaceView c;
    public c5.c d;
    public TextureView e;
    public boolean f;
    public ArrayList g;

    public final void a() {
        ArrayList arrayList = this.g;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((View) arrayList.get(i9)).invalidate();
        }
    }
}
