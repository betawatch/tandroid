package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m3 extends URLSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3(n3 n3Var, String str, int i10) {
        super(str);
        this.a = i10;
        this.b = n3Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10 = this.a;
        n3 n3Var = this.b;
        switch (i10) {
            case 0:
                h4 h4Var = n3Var.c;
                String url = getURL();
                org.telegram.ui.Components.q80 q80Var = h4Var.b;
                z2 z2Var = h4Var.d;
                HashSet hashSet = h4.c1;
                h4Var.O(url, null, q80Var == null ? null : new k0(h4Var, z2Var, q80Var));
                break;
            default:
                n3Var.c.O(getURL(), null, null);
                break;
        }
    }
}
