package org.telegram.ui;

import android.widget.TextView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class k5 implements org.telegram.ui.Components.jo0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ l5 c;

    public /* synthetic */ k5(l5 l5Var, TextView textView, int i10) {
        this.a = i10;
        this.c = l5Var;
        this.b = textView;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void A() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void X(float f10, boolean z4) {
        switch (this.a) {
            case 0:
                l5.c = f10;
                this.b.setText("Saturation " + (f10 * 5.0f));
                org.telegram.ui.Components.pv0 pv0Var = this.c.b;
                pv0Var.N();
                pv0Var.M();
                break;
            default:
                this.b.setText("Alpha " + l5.e);
                l5.e = f10;
                this.c.b.M();
                break;
        }
    }

    @Override // org.telegram.ui.Components.jo0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.jo0
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
