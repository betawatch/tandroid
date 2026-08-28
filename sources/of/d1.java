package of;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.l00;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d1 extends LinearLayout {
    public final b6 a;
    public final o9 b;
    public final z8 c;
    public final TextView d;
    public final TextView e;

    public d1(Context context, b6 b6Var, boolean z10) {
        super(context);
        this.c = new z8((b6) null);
        this.a = b6Var;
        setOrientation(0);
        o9 o9Var = new o9(context);
        this.b = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(o9Var, e6.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, e6.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i9 = f6.G6;
        textView.setTextColor(f6.v0(i9, b6Var));
        TextView h = j3.r0.h(linearLayout, textView, e6.n(-1, -2), context);
        this.e = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(z10 ? f6.l1(0.5f, f6.v0(i9, b6Var)) : f6.v0(f6.z6, b6Var));
        linearLayout.addView(h, e6.n(-1, -2));
    }

    public final void a(int i9, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.e;
        TextView textView2 = this.d;
        o9 o9Var = this.b;
        if (i9 == 0) {
            fq fqVar = new fq(f6.b0(AndroidUtilities.dp(28.0f), f6.v0(f6.Oh, this.a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            fqVar.s = AndroidUtilities.dp(-0.66f);
            fqVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            fqVar.e = dp;
            fqVar.f = dp2;
            o9Var.setImageDrawable(fqVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        z8 z8Var = this.c;
        z8Var.q(chat);
        o9Var.e(chat, z8Var);
        int i10 = R.string.HashtagSuggestion2Title;
        StringBuilder e10 = ta.b.e(str, "@");
        e10.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i10, e10.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        l00 l00Var = new l00(8);
        l00Var.f = f6.w0(null, f6.Lj, false);
        spannableStringBuilder.setSpan(l00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
    }
}
