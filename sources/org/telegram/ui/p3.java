package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                k4 k4Var = q3Var.c;
                String url = getURL();
                org.telegram.ui.Components.ea0 ea0Var = k4Var.b;
                d3 d3Var = k4Var.d;
                HashSet hashSet = k4.b1;
                k4Var.Q(url, null, ea0Var == null ? null : new k0(k4Var, d3Var, ea0Var));
                break;
            default:
                q3Var.c.Q(getURL(), null, null);
                break;
        }
    }
}
