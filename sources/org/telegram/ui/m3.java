package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m3 extends URLSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3(n3 n3Var, String str, int i3) {
        super(str);
        this.a = i3;
        this.b = n3Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i3 = this.a;
        n3 n3Var = this.b;
        switch (i3) {
            case 0:
                i4 i4Var = n3Var.c;
                String url = getURL();
                org.telegram.ui.Components.t70 t70Var = i4Var.b;
                a3 a3Var = i4Var.d;
                HashSet hashSet = i4.d1;
                i4Var.O(url, null, t70Var == null ? null : new k0(i4Var, a3Var, t70Var));
                break;
            default:
                n3Var.c.O(getURL(), null, null);
                break;
        }
    }
}
