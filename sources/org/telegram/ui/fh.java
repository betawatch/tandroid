package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ fh(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                fo foVar = this.b;
                if (foVar.getParentActivity() != null && foVar.fragmentView != null && i10 > 0) {
                    org.telegram.ui.Components.zc.a0(foVar).m(org.telegram.ui.Components.yc.r, i10, 0, 0, foVar.ea).j();
                    break;
                }
                break;
            case 1:
                fo foVar2 = this.b;
                if (i10 != 0) {
                    foVar2.j(i10, 0, false, 0, true, 0);
                    break;
                } else {
                    foVar2.m6 = false;
                    foVar2.M9();
                    break;
                }
            default:
                fo foVar3 = this.b;
                if (i10 != 0) {
                    foVar3.finishFragment();
                    break;
                } else {
                    foVar3.Uc(true);
                    break;
                }
        }
    }
}
