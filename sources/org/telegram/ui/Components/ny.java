package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ny implements View.OnClickListener {
    public final /* synthetic */ sy a;

    public ny(sy syVar) {
        this.a = syVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean[] zArr = new boolean[1];
        sy syVar = this.a;
        sz szVar = syVar.F;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(szVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(szVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(szVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, gb1.x(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(szVar.getContext());
        org.telegram.ui.d3.o(R.string.EmojiSuggestions, textView, 1, 15.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.n5, szVar.Z1);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, gb1.x(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(szVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.j5, szVar.Z1);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView2, gb1.x(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(szVar.getContext());
        int i10 = R.string.EmojiSuggestionsUrl;
        Object obj = syVar.w;
        if (obj == null) {
            obj = szVar.W0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i10, obj));
        textView3.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.k5, szVar.Z1);
        textView3.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView3, gb1.x(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new my(this, zArr, e3Var));
        e3Var.b(linearLayout);
        e3Var.a.show();
    }
}
