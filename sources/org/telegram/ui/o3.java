package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class o3 extends URLSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(p3 p3Var, String str, int i10) {
        super(str);
        this.a = i10;
        this.b = p3Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10 = this.a;
        p3 p3Var = this.b;
        switch (i10) {
            case 0:
                k4 k4Var = p3Var.c;
                String url = getURL();
                org.telegram.ui.Components.z90 z90Var = k4Var.b;
                c3 c3Var = k4Var.d;
                HashSet hashSet = k4.c1;
                k4Var.Q(url, null, z90Var == null ? null : new k0(k4Var, c3Var, z90Var));
                break;
            default:
                p3Var.c.Q(getURL(), null, null);
                break;
        }
    }
}
