package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class np extends z4.g {
    public mp w0;

    public np(Context context) {
        super(context);
        b(new lp((vg0) this));
    }

    @Override // z4.g
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (!(aVar instanceof mp)) {
            throw new IllegalArgumentException();
        }
        setAdapter((mp) aVar);
    }

    public void setAdapter(mp mpVar) {
        this.w0 = mpVar;
        super.setAdapter((z4.a) mpVar);
        if (mpVar != null) {
            x(mpVar.j(), false);
        }
    }
}
