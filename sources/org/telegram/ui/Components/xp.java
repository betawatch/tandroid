package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public abstract class xp extends z4.g {
    public wp w0;

    public xp(Context context) {
        super(context);
        b(new vp((zh0) this));
    }

    @Override // z4.g
    @Deprecated
    public void setAdapter(z4.a aVar) {
        if (!(aVar instanceof wp)) {
            throw new IllegalArgumentException();
        }
        setAdapter((wp) aVar);
    }

    public void setAdapter(wp wpVar) {
        this.w0 = wpVar;
        super.setAdapter((z4.a) wpVar);
        if (wpVar != null) {
            x(wpVar.j(), false);
        }
    }
}
