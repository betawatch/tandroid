package org.telegram.ui;

import android.widget.TextView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h5 implements org.telegram.ui.Components.on0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ i5 c;

    public /* synthetic */ h5(i5 i5Var, TextView textView, int i9) {
        this.a = i9;
        this.c = i5Var;
        this.b = textView;
    }

    @Override // org.telegram.ui.Components.on0
    public final void Q(float f10, boolean z10) {
        switch (this.a) {
            case 0:
                i5.c = f10;
                this.b.setText("Saturation " + (f10 * 5.0f));
                org.telegram.ui.Components.xu0 xu0Var = this.c.b;
                xu0Var.N();
                xu0Var.M();
                break;
            default:
                this.b.setText("Alpha " + i5.e);
                i5.e = f10;
                this.c.b.M();
                break;
        }
    }

    @Override // org.telegram.ui.Components.on0
    public final /* synthetic */ int c0() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.on0
    public final /* synthetic */ CharSequence getContentDescription() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.on0
    public final void n() {
        int i9 = this.a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
