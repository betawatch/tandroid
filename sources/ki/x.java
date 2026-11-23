package ki;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import c8.ma;
import di.xb;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.nq;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class x extends dk0 {
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
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

    @Override // v4.i0
    public final int b() {
        return this.c.size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        w wVar = (w) f1Var.a;
        String str = (String) this.c.get(i7);
        if (((Boolean) this.e.get(i7)).booleanValue()) {
            nq nqVar = new nq(R.drawable.mini_ephemeral_hidden_14, 0);
            nqVar.a(m6.A6);
            nqVar.n = 1;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(nqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            wVar.a.setText(spannableStringBuilder);
        } else {
            wVar.a.setText(str);
        }
        wVar.b.setText((CharSequence) this.d.get(i7));
        wVar.c = str;
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = viewGroup.getContext();
        w wVar = new w(context);
        wVar.setOrientation(0);
        wVar.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        xb xbVar = new xb(context, 4);
        wVar.b = xbVar;
        ls.i(xbVar);
        xbVar.setTextSize(1, 16.0f);
        int i10 = m6.G6;
        t6.U(xbVar, i10, null);
        xbVar.setTag(Integer.valueOf(i10));
        xbVar.setMaxLines(2);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        wVar.addView(xbVar, ma.q(-1, -2, 1.0f, 16, 0, 0, org.telegram.messenger.g0.L(8.0f), 0));
        TextView textView = new TextView(context);
        wVar.a = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = m6.y6;
        t6.U(textView, i11, null);
        textView.setTag(Integer.valueOf(i11));
        wVar.addView(textView, ma.p(-2, -2, 0.0f, 16));
        wVar.setLayoutParams(new v4.q0(-1, -2));
        return new mj0(wVar);
    }
}
