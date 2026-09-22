package gg;

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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.u9;
import org.telegram.ui.d10;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class i1 extends LinearLayout {
    public final e6 a;
    public final u9 b;
    public final f9 c;
    public final TextView d;
    public final TextView e;

    public i1(Context context, e6 e6Var, boolean z10) {
        super(context);
        this.c = new f9((e6) null);
        this.a = e6Var;
        setOrientation(0);
        u9 u9Var = new u9(context);
        this.b = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(u9Var, x5.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, x5.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = i6.G6;
        textView.setTextColor(i6.v0(i10, e6Var));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, x5.n(-1, -2), context);
        this.e = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(z10 ? i6.l1(0.5f, i6.v0(i10, e6Var)) : i6.v0(i6.z6, e6Var));
        linearLayout.addView(h, x5.n(-1, -2));
    }

    public final void a(int i10, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.e;
        TextView textView2 = this.d;
        u9 u9Var = this.b;
        if (i10 == 0) {
            pq pqVar = new pq(i6.b0(AndroidUtilities.dp(28.0f), i6.v0(i6.Oh, this.a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            pqVar.s = AndroidUtilities.dp(-0.66f);
            pqVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            pqVar.e = dp;
            pqVar.f = dp2;
            u9Var.setImageDrawable(pqVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        f9 f9Var = this.c;
        f9Var.q(chat);
        u9Var.e(chat, f9Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder h = w.c.h(str, "@");
        h.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, h.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        d10 d10Var = new d10(8);
        d10Var.f = i6.w0(null, i6.Lj, false);
        spannableStringBuilder.setSpan(d10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }
}
