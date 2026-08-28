package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q3 extends URLSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(r3 r3Var, String str, int i9) {
        super(str);
        this.a = i9;
        this.b = r3Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i9 = this.a;
        r3 r3Var = this.b;
        switch (i9) {
            case 0:
                l4 l4Var = r3Var.c;
                String url = getURL();
                org.telegram.ui.Components.m80 m80Var = l4Var.b;
                e3 e3Var = l4Var.d;
                HashSet hashSet = l4.X0;
                l4Var.Q(url, null, m80Var == null ? null : new l0(l4Var, e3Var, m80Var));
                break;
            default:
                r3Var.c.Q(getURL(), null, null);
                break;
        }
    }
}
