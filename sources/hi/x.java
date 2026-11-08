package hi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.md;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class x extends oj0 {
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final void E(a0.h hVar) {
        ArrayList arrayList = this.c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        for (int i7 = 0; i7 < hVar.m(); i7++) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(i7);
            for (int i10 = 0; i10 < botInfo.commands.size(); i10++) {
                TLRPC.BotCommand botCommand = botInfo.commands.get(i10);
                if (botCommand != null && botCommand.command != null) {
                    arrayList.add("/" + botCommand.command);
                    arrayList2.add(botCommand.description);
                    arrayList3.add(Boolean.valueOf(botCommand.ephemeral));
                }
            }
        }
        f();
    }

    @Override // v4.g0
    public final int b() {
        return this.c.size();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        w wVar = (w) d1Var.a;
        String str = (String) this.c.get(i7);
        if (((Boolean) this.e.get(i7)).booleanValue()) {
            wp wpVar = new wp(R.drawable.mini_ephemeral_hidden_14, 0);
            wpVar.a(k6.A6);
            wpVar.n = 1;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            wVar.a.setText(spannableStringBuilder);
        } else {
            wVar.a.setText(str);
        }
        wVar.b.setText((CharSequence) this.d.get(i7));
        wVar.c = str;
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = viewGroup.getContext();
        w wVar = new w(context);
        wVar.setOrientation(0);
        wVar.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        md mdVar = new md(context, 3);
        wVar.b = mdVar;
        qs.i(mdVar);
        mdVar.setTextSize(1, 16.0f);
        int i10 = k6.G6;
        r6.V(mdVar, i10, null);
        mdVar.setTag(Integer.valueOf(i10));
        mdVar.setMaxLines(2);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        wVar.addView(mdVar, ha.q(-1, -2, 1.0f, 16, 0, 0, org.telegram.messenger.g0.L(8.0f), 0));
        TextView textView = new TextView(context);
        wVar.a = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = k6.y6;
        r6.V(textView, i11, null);
        textView.setTag(Integer.valueOf(i11));
        wVar.addView(textView, ha.p(-2, -2, 0.0f, 16));
        wVar.setLayoutParams(new v4.o0(-1, -2));
        return new xi0(wVar);
    }
}
