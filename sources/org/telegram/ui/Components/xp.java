package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class xp extends c5.l {
    public wp x0;

    public xp(Context context) {
        super(context);
        b(new vp((hg0) this));
    }

    @Override // c5.l
    @Deprecated
    public void setAdapter(c5.a aVar) {
        if (!(aVar instanceof wp)) {
            throw new IllegalArgumentException();
        }
        setAdapter((wp) aVar);
    }

    public void setAdapter(wp wpVar) {
        this.x0 = wpVar;
        super.setAdapter((c5.a) wpVar);
        if (wpVar != null) {
            x(wpVar.j(), false);
        }
    }
}
