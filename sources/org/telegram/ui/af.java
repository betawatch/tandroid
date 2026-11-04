package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class af implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;

    public /* synthetic */ af(wm wmVar, int i3) {
        this.a = i3;
        this.b = wmVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        org.telegram.messenger.zi ziVar;
        org.telegram.messenger.zi ziVar2;
        switch (this.a) {
            case 0:
                wm wmVar = this.b;
                org.telegram.messenger.zi ziVar3 = wmVar.u5;
                if (ziVar3 == null) {
                    return false;
                }
                if (org.telegram.messenger.g0.g(ziVar3.R0)) {
                    new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(wmVar.getParentActivity()), wmVar.ya).k(false).j();
                }
                return true;
            case 1:
                return wm.D0(this.b);
            default:
                wm wmVar2 = this.b;
                int i3 = wmVar2.Pb;
                if (i3 == 1 && (ziVar2 = wmVar2.G5) != null) {
                    wmVar2.l(ziVar2.f1(), 0, true, 0, true, 0);
                    return true;
                }
                if (wmVar2.w5 == null || i3 != 2 || (ziVar = wmVar2.E5) == null) {
                    return false;
                }
                wmVar2.l(ziVar.f1(), 0, true, 0, true, 0);
                return true;
        }
    }
}
