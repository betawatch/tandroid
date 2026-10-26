package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.am0, org.telegram.ui.Components.bm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kr b;

    public /* synthetic */ jq(kr krVar, int i10) {
        this.a = i10;
        this.b = krVar;
    }

    @Override // org.telegram.ui.Components.bm0
    public boolean c(int i10, View view) {
        kr krVar = this.b;
        if (krVar.getParentActivity() != null) {
            s4.h0 adapter = krVar.c.getAdapter();
            gr grVar = krVar.a;
            if (adapter == grVar) {
                return krVar.i0(grVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.am0
    public void e(float f7, float f10, int i10, View view) {
        kr.W(this.b, view, i10);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.v0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        kr.V(this.b, j10);
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
