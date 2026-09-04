package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class hy implements View.OnClickListener {
    public final /* synthetic */ ky a;

    public hy(ky kyVar) {
        this.a = kyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean[] zArr = new boolean[1];
        ky kyVar = this.a;
        kz kzVar = kyVar.F;
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(kzVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(kzVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(kzVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, w7.x5.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(kzVar.getContext());
        textView.setText(LocaleController.getString(R.string.EmojiSuggestions));
        textView.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.j6.n5;
        int i11 = kz.O2;
        textView.setTextColor(kzVar.A(i10));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, w7.x5.t(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(kzVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(kzVar.A(org.telegram.ui.ActionBar.j6.j5));
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(kzVar.getContext());
        int i12 = R.string.EmojiSuggestionsUrl;
        Object obj = kyVar.w;
        if (obj == null) {
            obj = kzVar.W0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i12, obj));
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(kzVar.A(org.telegram.ui.ActionBar.j6.k5));
        textView3.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView3, w7.x5.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new gy(this, zArr, a3Var));
        a3Var.b(linearLayout);
        a3Var.a.show();
    }
}
