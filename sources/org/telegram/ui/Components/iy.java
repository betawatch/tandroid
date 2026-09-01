package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class iy implements View.OnClickListener {
    public final /* synthetic */ ly a;

    public iy(ly lyVar) {
        this.a = lyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean[] zArr = new boolean[1];
        ly lyVar = this.a;
        mz mzVar = lyVar.C;
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(mzVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(mzVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(mzVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, k7.c6.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(mzVar.getContext());
        textView.setText(LocaleController.getString(R.string.EmojiSuggestions));
        textView.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.k6.n5;
        int i11 = mz.L2;
        textView.setTextColor(mzVar.A(i10));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, k7.c6.t(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(mzVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(mzVar.A(org.telegram.ui.ActionBar.k6.j5));
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView2, k7.c6.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(mzVar.getContext());
        int i12 = R.string.EmojiSuggestionsUrl;
        Object obj = lyVar.w;
        if (obj == null) {
            obj = mzVar.T0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i12, obj));
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(mzVar.A(org.telegram.ui.ActionBar.k6.k5));
        textView3.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView3, k7.c6.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new hy(this, zArr, c3Var));
        c3Var.b(linearLayout);
        c3Var.a.show();
    }
}
