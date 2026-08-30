package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class q3 extends URLSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(r3 r3Var, String str, int i10) {
        super(str);
        this.a = i10;
        this.b = r3Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10 = this.a;
        r3 r3Var = this.b;
        switch (i10) {
            case 0:
                l4 l4Var = r3Var.c;
                String url = getURL();
                org.telegram.ui.Components.f90 f90Var = l4Var.b;
                d3 d3Var = l4Var.d;
                HashSet hashSet = l4.Y0;
                l4Var.Q(url, null, f90Var == null ? null : new k0(l4Var, d3Var, f90Var));
                break;
            default:
                r3Var.c.Q(getURL(), null, null);
                break;
        }
    }
}
