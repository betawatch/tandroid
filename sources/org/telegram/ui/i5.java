package org.telegram.ui;

import android.widget.TextView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i5 implements org.telegram.ui.Components.pn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ j5 c;

    public /* synthetic */ i5(j5 j5Var, TextView textView, int i10) {
        this.a = i10;
        this.c = j5Var;
        this.b = textView;
    }

    @Override // org.telegram.ui.Components.pn0
    public final void P(float f10, boolean z10) {
        switch (this.a) {
            case 0:
                j5.c = f10;
                this.b.setText("Saturation " + (f10 * 5.0f));
                org.telegram.ui.Components.zu0 zu0Var = this.c.b;
                zu0Var.N();
                zu0Var.M();
                break;
            default:
                this.b.setText("Alpha " + j5.e);
                j5.e = f10;
                this.c.b.M();
                break;
        }
    }

    @Override // org.telegram.ui.Components.pn0
    public final /* synthetic */ int a0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.pn0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.pn0
    public final void r() {
        int i10 = this.a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
