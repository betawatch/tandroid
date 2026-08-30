package org.telegram.ui;

import android.widget.TextView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
    public final void B() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void Y(float f10, boolean z4) {
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

    @Override // org.telegram.ui.Components.jo0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.jo0
    public final /* synthetic */ int j0() {
        switch (this.a) {
        }
        return 0;
    }

    private final void a() {
    }

    private final void b() {
    }
}
