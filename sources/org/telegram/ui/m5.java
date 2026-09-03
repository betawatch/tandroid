package org.telegram.ui;

import android.widget.TextView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m5 implements org.telegram.ui.Components.io0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ n5 c;

    public /* synthetic */ m5(n5 n5Var, TextView textView, int i10) {
        this.a = i10;
        this.c = n5Var;
        this.b = textView;
    }

    @Override // org.telegram.ui.Components.io0
    public final void B() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.io0
    public final void Y(float f10, boolean z4) {
        switch (this.a) {
            case 0:
                n5.c = f10;
                this.b.setText("Saturation " + (f10 * 5.0f));
                org.telegram.ui.Components.qv0 qv0Var = this.c.b;
                qv0Var.N();
                qv0Var.M();
                break;
            default:
                this.b.setText("Alpha " + n5.e);
                n5.e = f10;
                this.c.b.M();
                break;
        }
    }

    @Override // org.telegram.ui.Components.io0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.io0
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
