package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ky implements View.OnClickListener {
    public final /* synthetic */ ny a;

    public ky(ny nyVar) {
        this.a = nyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean[] zArr = new boolean[1];
        ny nyVar = this.a;
        nz nzVar = nyVar.F;
        org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(nzVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(nzVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(nzVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, w7.z5.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(nzVar.getContext());
        textView.setText(LocaleController.getString(R.string.EmojiSuggestions));
        textView.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.i6.n5;
        int i11 = nz.M2;
        textView.setTextColor(nzVar.z(i10));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, w7.z5.t(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(nzVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(nzVar.z(org.telegram.ui.ActionBar.i6.j5));
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(nzVar.getContext());
        int i12 = R.string.EmojiSuggestionsUrl;
        Object obj = nyVar.w;
        if (obj == null) {
            obj = nzVar.W0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i12, obj));
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(nzVar.z(org.telegram.ui.ActionBar.i6.k5));
        textView3.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView3, w7.z5.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new jy(this, zArr, a3Var));
        a3Var.b(linearLayout);
        a3Var.a.show();
    }
}
