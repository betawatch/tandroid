package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class gy implements View.OnClickListener {
    public final /* synthetic */ jy a;

    public gy(jy jyVar) {
        this.a = jyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean[] zArr = new boolean[1];
        jy jyVar = this.a;
        kz kzVar = jyVar.C;
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(kzVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(kzVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(kzVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, k7.b6.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(kzVar.getContext());
        textView.setText(LocaleController.getString(R.string.EmojiSuggestions));
        textView.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.j6.n5;
        int i11 = kz.L2;
        textView.setTextColor(kzVar.A(i10));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, k7.b6.t(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(kzVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(kzVar.A(org.telegram.ui.ActionBar.j6.j5));
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView2, k7.b6.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(kzVar.getContext());
        int i12 = R.string.EmojiSuggestionsUrl;
        Object obj = jyVar.w;
        if (obj == null) {
            obj = kzVar.T0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i12, obj));
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(kzVar.A(org.telegram.ui.ActionBar.j6.k5));
        textView3.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView3, k7.b6.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new fy(this, zArr, b3Var));
        b3Var.b(linearLayout);
        b3Var.a.show();
    }
}
