package hg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.x9;
import org.telegram.ui.d10;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class i1 extends LinearLayout {
    public final f6 a;
    public final x9 b;
    public final i9 c;
    public final TextView d;
    public final TextView e;

    public i1(Context context, f6 f6Var, boolean z10) {
        super(context);
        this.c = new i9((f6) null);
        this.a = f6Var;
        setOrientation(0);
        x9 x9Var = new x9(context);
        this.b = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(x9Var, x5.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, x5.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = j6.G6;
        textView.setTextColor(j6.v0(i10, f6Var));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, x5.n(-1, -2), context);
        this.e = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(z10 ? j6.l1(0.5f, j6.v0(i10, f6Var)) : j6.v0(j6.z6, f6Var));
        linearLayout.addView(h, x5.n(-1, -2));
    }

    public final void a(int i10, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.e;
        TextView textView2 = this.d;
        x9 x9Var = this.b;
        if (i10 == 0) {
            oq oqVar = new oq(j6.b0(AndroidUtilities.dp(28.0f), j6.v0(j6.Oh, this.a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            oqVar.s = AndroidUtilities.dp(-0.66f);
            oqVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            oqVar.e = dp;
            oqVar.f = dp2;
            x9Var.setImageDrawable(oqVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        i9 i9Var = this.c;
        i9Var.q(chat);
        x9Var.e(chat, i9Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder g10 = w.f.g(str, "@");
        g10.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, g10.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        d10 d10Var = new d10(8);
        d10Var.f = j6.w0(null, j6.Lj, false);
        spannableStringBuilder.setSpan(d10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }
}
