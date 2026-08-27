package jh;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class d4 {
    public d1 a;
    public h9 b;
    public SurfaceView c;
    public c5.c d;
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
