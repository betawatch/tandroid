package nh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import h7.z5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.yk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class z extends yk0 {
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    public final void E(a0.h hVar) {
        ArrayList arrayList = this.c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(i10);
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

    @Override // f2.q0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        y yVar = (y) o1Var.a;
        String str = (String) this.c.get(i10);
        if (((Boolean) this.e.get(i10)).booleanValue()) {
            cq cqVar = new cq(R.drawable.mini_ephemeral_hidden_14, 0);
            cqVar.setColorKey(g6.A6);
            cqVar.setTopOffset(1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(cqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            yVar.a.setText(spannableStringBuilder);
        } else {
            yVar.a.setText(str);
        }
        yVar.b.setText((CharSequence) this.d.get(i10));
        yVar.c = str;
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        y yVar = new y(context);
        yVar.setOrientation(0);
        yVar.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        cg.q qVar = new cg.q(context, 4);
        yVar.b = qVar;
        NotificationCenter.listenEmojiLoading(qVar);
        qVar.setTextSize(1, 16.0f);
        int i11 = g6.G6;
        qVar.setTextColor(g6.w0(null, i11, false));
        qVar.setTag(Integer.valueOf(i11));
        qVar.setMaxLines(2);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        yVar.addView(qVar, z5.p(-1, -2, 1.0f, 16, 0, 0, AndroidUtilities.dp(8.0f), 0));
        TextView textView = new TextView(context);
        yVar.a = textView;
        textView.setTextSize(1, 14.0f);
        int i12 = g6.y6;
        textView.setTextColor(g6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        yVar.addView(textView, z5.o(-2, -2, 0.0f, 16));
        yVar.setLayoutParams(new f2.y0(-1, -2));
        return new lk0(yVar);
    }
}
