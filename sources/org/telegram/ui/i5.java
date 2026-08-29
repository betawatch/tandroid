package org.telegram.ui;

import android.widget.TextView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i5 implements org.telegram.ui.Components.zn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ j5 c;

    public /* synthetic */ i5(j5 j5Var, TextView textView, int i10) {
        this.a = i10;
        this.c = j5Var;
        this.b = textView;
    }

    @Override // org.telegram.ui.Components.zn0
    public final void W(float f9, boolean z10) {
        switch (this.a) {
            case 0:
                j5.c = f9;
                this.b.setText("Saturation " + (f9 * 5.0f));
                org.telegram.ui.Components.hv0 hv0Var = this.c.b;
                hv0Var.N();
                hv0Var.M();
                break;
            default:
                this.b.setText("Alpha " + j5.e);
                j5.e = f9;
                this.c.b.M();
                break;
        }
    }

    @Override // org.telegram.ui.Components.zn0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.zn0
    public final /* synthetic */ int k0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.zn0
    public final void v() {
        int i10 = this.a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
