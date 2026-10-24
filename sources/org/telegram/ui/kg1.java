package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class kg1 extends org.telegram.ui.Components.l61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.l61.setup(new kg1());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.b71 b71Var, org.telegram.ui.Components.j71 j71Var) {
        lg1 lg1Var = (lg1) view;
        int i10 = m61Var.k;
        CharSequence charSequence = m61Var.l;
        CharSequence charSequence2 = m61Var.m;
        boolean z11 = m61Var.q;
        boolean z12 = m61Var.r;
        int i11 = m61Var.z;
        TextView textView = lg1Var.e;
        ImageView imageView = lg1Var.f;
        lg1Var.h = z11;
        lg1Var.n = z12;
        lg1Var.b.setImageResource(i10);
        if (i11 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i11);
        } else {
            imageView.setVisibility(8);
        }
        lg1Var.d.setText(charSequence);
        textView.setText(charSequence2);
        textView.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        int dp = AndroidUtilities.dp(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
        lg1Var.c.setPadding(0, dp, 0, dp);
        lg1Var.updateColors();
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new lg1(context, g6Var);
    }
}
