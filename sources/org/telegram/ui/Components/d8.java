package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d8 extends g8 {
    public final /* synthetic */ Context E;
    public final /* synthetic */ KeyEvent.Callback F;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d8(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.y = i10;
        this.F = callback;
        this.E = context2;
    }

    @Override // org.telegram.ui.Components.g8
    public final TextView a() {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        switch (this.y) {
            case 0:
                pa0 pa0Var = new pa0(this.E);
                int i10 = org.telegram.ui.ActionBar.y6.Oi;
                u6Var = ((org.telegram.ui.ActionBar.k3) ((m8) this.F)).resourcesProvider;
                org.telegram.ui.ActionBar.f7.V(pa0Var, i10, u6Var);
                pa0Var.setTextSize(1, 17.0f);
                pa0Var.setTypeface(AndroidUtilities.bold());
                pa0Var.setEllipsize(TextUtils.TruncateAt.END);
                pa0Var.setSingleLine(true);
                return pa0Var;
            case 1:
                pa0 pa0Var2 = new pa0(this.E);
                int i11 = org.telegram.ui.ActionBar.y6.Si;
                m8 m8Var = (m8) this.F;
                u6Var2 = ((org.telegram.ui.ActionBar.k3) m8Var).resourcesProvider;
                org.telegram.ui.ActionBar.f7.V(pa0Var2, i11, u6Var2);
                pa0Var2.setTextSize(1, 13.0f);
                pa0Var2.setEllipsize(TextUtils.TruncateAt.END);
                pa0Var2.setSingleLine(true);
                pa0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                int i12 = org.telegram.ui.ActionBar.y6.i6;
                org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(m8Var.getThemedColor(i12), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
                u6Var3 = ((org.telegram.ui.ActionBar.k3) m8Var).resourcesProvider;
                pa0Var2.setBackground(Z);
                org.telegram.ui.ActionBar.f7.k(pa0Var2, Z, null, N, u6Var3);
                pa0Var2.setOnClickListener(new org.telegram.ui.ActionBar.u1(28, this, pa0Var2));
                return pa0Var2;
            default:
                pa0 pa0Var3 = new pa0(this.E);
                org.telegram.ui.ActionBar.f7.V(pa0Var3, org.telegram.ui.ActionBar.y6.Si, ((mp0) this.F).N);
                pa0Var3.setTextSize(1, 12.0f);
                pa0Var3.setEllipsize(TextUtils.TruncateAt.END);
                pa0Var3.setSingleLine(true);
                pa0Var3.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return pa0Var3;
        }
    }
}
