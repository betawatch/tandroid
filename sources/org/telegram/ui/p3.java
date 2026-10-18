package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class p3 extends URLSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ q3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p3(q3 q3Var, String str, int i10) {
        super(str);
        this.a = i10;
        this.b = q3Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10 = this.a;
        q3 q3Var = this.b;
        switch (i10) {
            case 0:
                l4 l4Var = q3Var.c;
                String url = getURL();
                org.telegram.ui.Components.y90 y90Var = l4Var.b;
                d3 d3Var = l4Var.d;
                HashSet hashSet = l4.b1;
                l4Var.Q(url, null, y90Var == null ? null : new l0(l4Var, d3Var, y90Var));
                break;
            default:
                q3Var.c.Q(getURL(), null, null);
                break;
        }
    }
}
