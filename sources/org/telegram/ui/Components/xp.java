package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
