package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public abstract class wp extends z4.g {
    public vp w0;

    public wp(Context context) {
        super(context);
        b(new up((yh0) this));
    }

    @Override // z4.g
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (!(aVar instanceof vp)) {
            throw new IllegalArgumentException();
        }
        setAdapter((vp) aVar);
    }

    public void setAdapter(vp vpVar) {
        this.w0 = vpVar;
        super.setAdapter((z4.a) vpVar);
        if (vpVar != null) {
            x(vpVar.j(), false);
        }
    }
}
