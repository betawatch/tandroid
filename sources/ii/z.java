package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import b8.mf;
import ci.ec;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z extends sj0 {
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    public final void E(a0.h hVar) {
        ArrayList arrayList = this.c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        for (int i3 = 0; i3 < hVar.m(); i3++) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(i3);
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

    @Override // u4.h0
    public final int b() {
        return this.c.size();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        y yVar = (y) d1Var.a;
        String str = (String) this.c.get(i3);
        if (((Boolean) this.e.get(i3)).booleanValue()) {
            wp wpVar = new wp(R.drawable.mini_ephemeral_hidden_14, 0);
            wpVar.a(k6.A6);
            wpVar.n = 1;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            yVar.a.setText(spannableStringBuilder);
        } else {
            yVar.a.setText(str);
        }
        yVar.b.setText((CharSequence) this.d.get(i3));
        yVar.c = str;
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        Context context = viewGroup.getContext();
        y yVar = new y(context);
        yVar.setOrientation(0);
        yVar.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        ec ecVar = new ec(context, 3);
        yVar.b = ecVar;
        hs.i(ecVar);
        ecVar.setTextSize(1, 16.0f);
        int i10 = k6.G6;
        r6.V(ecVar, i10, null);
        ecVar.setTag(Integer.valueOf(i10));
        ecVar.setMaxLines(2);
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        yVar.addView(ecVar, mf.q(-1, -2, 1.0f, 16, 0, 0, org.telegram.messenger.g0.L(8.0f), 0));
        TextView textView = new TextView(context);
        yVar.a = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = k6.y6;
        r6.V(textView, i11, null);
        textView.setTag(Integer.valueOf(i11));
        yVar.addView(textView, mf.p(-2, -2, 0.0f, 16));
        yVar.setLayoutParams(new u4.p0(-1, -2));
        return new bj0(yVar);
    }
}
