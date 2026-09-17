package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
                i4 i4Var = o3Var.c;
                String url = getURL();
                org.telegram.ui.Components.e90 e90Var = i4Var.b;
                b3 b3Var = i4Var.d;
                HashSet hashSet = i4.b1;
                i4Var.Q(url, null, e90Var == null ? null : new i0(i4Var, b3Var, e90Var));
                break;
            default:
                o3Var.c.Q(getURL(), null, null);
                break;
        }
    }
}
