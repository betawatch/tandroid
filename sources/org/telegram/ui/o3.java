package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                j4 j4Var = p3Var.c;
                String url = getURL();
                org.telegram.ui.Components.n90 n90Var = j4Var.b;
                c3 c3Var = j4Var.d;
                HashSet hashSet = j4.b1;
                j4Var.Q(url, null, n90Var == null ? null : new j0(j4Var, c3Var, n90Var));
                break;
            default:
                p3Var.c.Q(getURL(), null, null);
                break;
        }
    }
}
