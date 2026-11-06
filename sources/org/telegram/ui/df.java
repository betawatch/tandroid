package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class df implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ df(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.ij ijVar2;
        switch (this.a) {
            case 0:
                an anVar = this.b;
                org.telegram.messenger.ij ijVar3 = anVar.t5;
                if (ijVar3 == null) {
                    return false;
                }
                if (org.telegram.messenger.g0.g(ijVar3.R0)) {
                    new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(anVar.getParentActivity()), anVar.xa).k(false).j();
                }
                return true;
            case 1:
                return an.D0(this.b);
            default:
                an anVar2 = this.b;
                int i7 = anVar2.Ob;
                if (i7 == 1 && (ijVar2 = anVar2.F5) != null) {
                    anVar2.l(ijVar2.f1(), 0, true, 0, true, 0);
                    return true;
                }
                if (anVar2.v5 == null || i7 != 2 || (ijVar = anVar2.D5) == null) {
                    return false;
                }
                anVar2.l(ijVar.f1(), 0, true, 0, true, 0);
                return true;
        }
    }
}
