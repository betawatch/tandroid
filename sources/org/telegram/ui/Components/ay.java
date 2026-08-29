package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ay implements View.OnClickListener {
    public final /* synthetic */ ey a;

    public ay(ey eyVar) {
        this.a = eyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean[] zArr = new boolean[1];
        ey eyVar = this.a;
        fz fzVar = eyVar.B;
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(fzVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(fzVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(fzVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, i7.f6.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(fzVar.getContext());
        textView.setText(LocaleController.getString(R.string.EmojiSuggestions));
        textView.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.g6.n5;
        int i11 = fz.K2;
        textView.setTextColor(fzVar.A(i10));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, i7.f6.t(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(fzVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(fzVar.A(org.telegram.ui.ActionBar.g6.j5));
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView2, i7.f6.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(fzVar.getContext());
        int i12 = R.string.EmojiSuggestionsUrl;
        Object obj = eyVar.w;
        if (obj == null) {
            obj = fzVar.S0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i12, obj));
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(fzVar.A(org.telegram.ui.ActionBar.g6.k5));
        textView3.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView3, i7.f6.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new zx(this, zArr, a3Var));
        a3Var.b(linearLayout);
        a3Var.a.show();
    }
}
