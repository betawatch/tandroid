package nh;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class c4 {
    public e1 a;
    public h9 b;
    public SurfaceView c;
    public org.telegram.ui.q4 d;
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
