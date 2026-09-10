package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class oy implements View.OnClickListener {
    public final /* synthetic */ ry a;

    public oy(ry ryVar) {
        this.a = ryVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean[] zArr = new boolean[1];
        ry ryVar = this.a;
        rz rzVar = ryVar.F;
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(rzVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(rzVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(rzVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, w7.a6.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(rzVar.getContext());
        textView.setText(LocaleController.getString(R.string.EmojiSuggestions));
        textView.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.j6.n5;
        int i11 = rz.O2;
        textView.setTextColor(rzVar.z(i10));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, w7.a6.t(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(rzVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(rzVar.z(org.telegram.ui.ActionBar.j6.j5));
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView2, w7.a6.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(rzVar.getContext());
        int i12 = R.string.EmojiSuggestionsUrl;
        Object obj = ryVar.w;
        if (obj == null) {
            obj = rzVar.W0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i12, obj));
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(rzVar.z(org.telegram.ui.ActionBar.j6.k5));
        textView3.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView3, w7.a6.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new ny(this, zArr, c3Var));
        c3Var.b(linearLayout);
        c3Var.a.show();
    }
}
