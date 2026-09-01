package org.telegram.ui;

import android.widget.TextView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class k5 implements org.telegram.ui.Components.ko0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ l5 c;

    public /* synthetic */ k5(l5 l5Var, TextView textView, int i10) {
        this.a = i10;
        this.c = l5Var;
        this.b = textView;
    }

    @Override // org.telegram.ui.Components.ko0
    public final void A() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ko0
    public final void X(float f10, boolean z4) {
        switch (this.a) {
            case 0:
                l5.c = f10;
                this.b.setText("Saturation " + (f10 * 5.0f));
                org.telegram.ui.Components.qv0 qv0Var = this.c.b;
                qv0Var.N();
                qv0Var.M();
                break;
            default:
                this.b.setText("Alpha " + l5.e);
                l5.e = f10;
                this.c.b.M();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ko0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.ko0
    public final /* synthetic */ int m0() {
        switch (this.a) {
        }
        return 0;
    }

    private final void a() {
    }

    private final void b() {
    }
}
