package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class kg1 extends org.telegram.ui.Components.s61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.s61.setup(new kg1());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, org.telegram.ui.Components.t61 t61Var, boolean z10, org.telegram.ui.Components.j71 j71Var, org.telegram.ui.Components.r71 r71Var) {
        lg1 lg1Var = (lg1) view;
        int i10 = t61Var.k;
        CharSequence charSequence = t61Var.l;
        CharSequence charSequence2 = t61Var.m;
        boolean z11 = t61Var.q;
        boolean z12 = t61Var.r;
        int i11 = t61Var.z;
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

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new lg1(context, u6Var);
    }
}
