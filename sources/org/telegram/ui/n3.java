package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                org.telegram.ui.Components.o90 o90Var = i4Var.b;
                b3 b3Var = i4Var.d;
                HashSet hashSet = i4.b1;
                i4Var.Q(url, null, o90Var == null ? null : new j0(i4Var, b3Var, o90Var));
                break;
            default:
                o3Var.c.Q(getURL(), null, null);
                break;
        }
    }
}
