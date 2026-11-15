package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                org.telegram.ui.Components.a80 a80Var = g4Var.b;
                z2 z2Var = g4Var.d;
                HashSet hashSet = g4.d1;
                g4Var.O(url, null, a80Var == null ? null : new j0(g4Var, z2Var, a80Var));
                break;
            default:
                m3Var.c.O(getURL(), null, null);
                break;
        }
    }
}
