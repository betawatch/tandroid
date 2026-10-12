package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class sy implements View.OnClickListener {
    public final /* synthetic */ vy a;

    public sy(vy vyVar) {
        this.a = vyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean[] zArr = new boolean[1];
        vy vyVar = this.a;
        wz wzVar = vyVar.F;
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(wzVar.getContext(), null);
        LinearLayout linearLayout = new LinearLayout(wzVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        ImageView imageView = new ImageView(wzVar.getContext());
        imageView.setImageResource(R.drawable.smiles_info);
        linearLayout.addView(imageView, w7.a6.t(-2, -2, 49, 0, 15, 0, 0));
        TextView textView = new TextView(wzVar.getContext());
        org.telegram.messenger.yh.j(15.0f, R.string.EmojiSuggestions, 1, textView);
        int i10 = org.telegram.ui.ActionBar.g6.n5;
        int i11 = wz.O2;
        textView.setTextColor(wzVar.A(i10));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, w7.a6.t(-2, -2, 51, 0, 24, 0, 0));
        TextView textView2 = new TextView(wzVar.getContext());
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(wzVar.A(org.telegram.ui.ActionBar.g6.j5));
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView2, w7.a6.t(-2, -2, 51, 0, 11, 0, 0));
        TextView textView3 = new TextView(wzVar.getContext());
        int i12 = R.string.EmojiSuggestionsUrl;
        Object obj = vyVar.w;
        if (obj == null) {
            obj = wzVar.W0;
        }
        textView3.setText(LocaleController.formatString("EmojiSuggestionsUrl", i12, obj));
        textView3.setTextSize(1, 15.0f);
        textView3.setTextColor(wzVar.A(org.telegram.ui.ActionBar.g6.k5));
        textView3.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.addView(textView3, w7.a6.t(-2, -2, 51, 0, 18, 0, 16));
        textView3.setOnClickListener(new ry(this, zArr, z2Var));
        z2Var.b(linearLayout);
        z2Var.a.show();
    }
}
