package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class l3 extends URLSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3(m3 m3Var, String str, int i7) {
        super(str);
        this.a = i7;
        this.b = m3Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i7 = this.a;
        m3 m3Var = this.b;
        switch (i7) {
            case 0:
                g4 g4Var = m3Var.c;
                String url = getURL();
                org.telegram.ui.Components.y70 y70Var = g4Var.b;
                z2 z2Var = g4Var.d;
                HashSet hashSet = g4.c1;
                g4Var.O(url, null, y70Var == null ? null : new j0(g4Var, z2Var, y70Var));
                break;
            default:
                m3Var.c.O(getURL(), null, null);
                break;
        }
    }
}
