package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public abstract class xp extends z4.g {
    public wp w0;

    public xp(Context context) {
        super(context);
        b(new vp((ph0) this));
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
