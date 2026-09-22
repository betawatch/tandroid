package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                org.telegram.ui.Components.o90 o90Var = h4Var.b;
                a3 a3Var = h4Var.d;
                HashSet hashSet = h4.b1;
                h4Var.Q(url, null, o90Var == null ? null : new i0(h4Var, a3Var, o90Var));
                break;
            default:
                n3Var.c.Q(getURL(), null, null);
                break;
        }
    }
}
