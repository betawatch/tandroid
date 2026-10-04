package ei;

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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.yl0;
import w7.z5;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class c0 extends yl0 {
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;

    @Override // org.telegram.ui.Components.yl0
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
        b0 b0Var = (b0) c1Var.a;
        String str = (String) this.c.get(i10);
        if (((Boolean) this.e.get(i10)).booleanValue()) {
            rq rqVar = new rq(R.drawable.mini_ephemeral_hidden_14, 0);
            rqVar.setColorKey(i6.A6);
            rqVar.setTopOffset(1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(rqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            b0Var.a.setText(spannableStringBuilder);
        } else {
            b0Var.a.setText(str);
        }
        b0Var.b.setText((CharSequence) this.d.get(i10));
        b0Var.c = str;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        b0 b0Var = new b0(context);
        b0Var.setOrientation(0);
        b0Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        ai.p4 p4Var = new ai.p4(context, 2);
        b0Var.b = p4Var;
        NotificationCenter.listenEmojiLoading(p4Var);
        p4Var.setTextSize(1, 16.0f);
        int i11 = i6.G6;
        p4Var.setTextColor(i6.w0(null, i11, false));
        p4Var.setTag(Integer.valueOf(i11));
        p4Var.setMaxLines(2);
        p4Var.setEllipsize(TextUtils.TruncateAt.END);
        b0Var.addView(p4Var, z5.p(-1, -2, 1.0f, 16, 0, 0, AndroidUtilities.dp(8.0f), 0));
        TextView textView = new TextView(context);
        b0Var.a = textView;
        textView.setTextSize(1, 14.0f);
        int i12 = i6.y6;
        textView.setTextColor(i6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        b0Var.addView(textView, z5.o(-2, -2, 0.0f, 16));
        b0Var.setLayoutParams(new s4.p0(-1, -2));
        return new il0(b0Var);
    }
}
