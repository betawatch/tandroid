package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pm implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ int c;

    public /* synthetic */ pm(qn qnVar, int i10, int i11) {
        this.a = i11;
        this.b = qnVar;
        this.c = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.e0(this.c, (dh.h) obj);
                break;
            default:
                qn qnVar = this.b;
                qnVar.getClass();
                qnVar.e0(this.c, new eh.e((String) obj));
                break;
        }
    }
}
