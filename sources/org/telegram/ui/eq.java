package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class eq implements MessagesStorage.LongCallback, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.xl0, org.telegram.ui.Components.yl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hr b;

    public /* synthetic */ eq(hr hrVar, int i10) {
        this.a = i10;
        this.b = hrVar;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        hr hrVar = this.b;
        if (hrVar.getParentActivity() != null) {
            s4.g0 adapter = hrVar.c.getAdapter();
            dr drVar = hrVar.a;
            if (adapter == drVar) {
                return hrVar.h0(drVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.xl0
    public void d(float f7, float f10, int i10, View view) {
        hr.V(this.b, view, i10);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.u0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        hr.U(this.b, j10);
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
