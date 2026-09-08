package fi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.vk0;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class b0 extends kl0 {
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(a0.i iVar) {
        ArrayList arrayList = this.c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) iVar.n(i10);
            for (int i11 = 0; i11 < botInfo.commands.size(); i11++) {
                TLRPC.BotCommand botCommand = botInfo.commands.get(i11);
                if (botCommand != null && botCommand.command != null) {
                    arrayList.add("/" + botCommand.command);
                    arrayList2.add(botCommand.description);
                    arrayList3.add(Boolean.valueOf(botCommand.ephemeral));
                }
            }
        }
        l();
    }

    @Override // s4.h0
    public final int h() {
        return this.c.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        a0 a0Var = (a0) c1Var.a;
        String str = (String) this.c.get(i10);
        if (((Boolean) this.e.get(i10)).booleanValue()) {
            nq nqVar = new nq(R.drawable.mini_ephemeral_hidden_14, 0);
            nqVar.setColorKey(j6.A6);
            nqVar.setTopOffset(1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(nqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            a0Var.a.setText(spannableStringBuilder);
        } else {
            a0Var.a.setText(str);
        }
        a0Var.b.setText((CharSequence) this.d.get(i10));
        a0Var.c = str;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        a0 a0Var = new a0(context);
        a0Var.setOrientation(0);
        a0Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        bi.c4 c4Var = new bi.c4(context, 2);
        a0Var.b = c4Var;
        NotificationCenter.listenEmojiLoading(c4Var);
        c4Var.setTextSize(1, 16.0f);
        int i11 = j6.G6;
        c4Var.setTextColor(j6.w0(null, i11, false));
        c4Var.setTag(Integer.valueOf(i11));
        c4Var.setMaxLines(2);
        c4Var.setEllipsize(TextUtils.TruncateAt.END);
        a0Var.addView(c4Var, x5.p(-1, -2, 1.0f, 16, 0, 0, AndroidUtilities.dp(8.0f), 0));
        TextView textView = new TextView(context);
        a0Var.a = textView;
        textView.setTextSize(1, 14.0f);
        int i12 = j6.y6;
        textView.setTextColor(j6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        a0Var.addView(textView, x5.o(-2, -2, 0.0f, 16));
        a0Var.setLayoutParams(new s4.p0(-1, -2));
        return new vk0(a0Var);
    }
}
