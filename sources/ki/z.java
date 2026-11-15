package ki;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import c8.ja;
import di.ub;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class z extends tj0 {
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
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

    @Override // v4.h0
    public final int b() {
        return this.c.size();
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        y yVar = (y) e1Var.a;
        String str = (String) this.c.get(i7);
        if (((Boolean) this.e.get(i7)).booleanValue()) {
            eq eqVar = new eq(R.drawable.mini_ephemeral_hidden_14, 0);
            eqVar.a(j6.A6);
            eqVar.n = 1;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            yVar.a.setText(spannableStringBuilder);
        } else {
            yVar.a.setText(str);
        }
        yVar.b.setText((CharSequence) this.d.get(i7));
        yVar.c = str;
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        Context context = viewGroup.getContext();
        y yVar = new y(context);
        yVar.setOrientation(0);
        yVar.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        ub ubVar = new ub(context, 4);
        yVar.b = ubVar;
        ns.i(ubVar);
        ubVar.setTextSize(1, 16.0f);
        int i10 = j6.G6;
        q6.U(ubVar, i10, null);
        ubVar.setTag(Integer.valueOf(i10));
        ubVar.setMaxLines(2);
        ubVar.setEllipsize(TextUtils.TruncateAt.END);
        yVar.addView(ubVar, ja.q(-1, -2, 1.0f, 16, 0, 0, org.telegram.messenger.g0.L(8.0f), 0));
        TextView textView = new TextView(context);
        yVar.a = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = j6.y6;
        q6.U(textView, i11, null);
        textView.setTag(Integer.valueOf(i11));
        yVar.addView(textView, ja.p(-2, -2, 0.0f, 16));
        yVar.setLayoutParams(new v4.p0(-1, -2));
        return new cj0(yVar);
    }
}
