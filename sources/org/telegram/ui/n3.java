package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class n3 extends URLSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3(o3 o3Var, String str, int i10) {
        super(str);
        this.a = i10;
        this.b = o3Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10 = this.a;
        o3 o3Var = this.b;
        switch (i10) {
            case 0:
                j4 j4Var = o3Var.c;
                String url = getURL();
                org.telegram.ui.Components.ba0 ba0Var = j4Var.b;
                a3 a3Var = j4Var.d;
                HashSet hashSet = j4.c1;
                j4Var.Q(url, null, ba0Var == null ? null : new j0(j4Var, a3Var, ba0Var));
                break;
            default:
                o3Var.c.Q(getURL(), null, null);
                break;
        }
    }
}
