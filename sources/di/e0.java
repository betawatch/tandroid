package di;

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
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.uq;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class e0 extends ul0 {
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;

    @Override // org.telegram.ui.Components.ul0
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
        d0 d0Var = (d0) c1Var.a;
        String str = (String) this.c.get(i10);
        if (((Boolean) this.e.get(i10)).booleanValue()) {
            uq uqVar = new uq(R.drawable.mini_ephemeral_hidden_14, 0);
            uqVar.setColorKey(j6.A6);
            uqVar.setTopOffset(1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(uqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            d0Var.a.setText(spannableStringBuilder);
        } else {
            d0Var.a.setText(str);
        }
        d0Var.b.setText((CharSequence) this.d.get(i10));
        d0Var.c = str;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        d0 d0Var = new d0(context);
        d0Var.setOrientation(0);
        d0Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        h hVar = new h(context, 1);
        d0Var.b = hVar;
        NotificationCenter.listenEmojiLoading(hVar);
        hVar.setTextSize(1, 16.0f);
        int i11 = j6.G6;
        hVar.setTextColor(j6.w0(null, i11, false));
        hVar.setTag(Integer.valueOf(i11));
        hVar.setMaxLines(2);
        hVar.setEllipsize(TextUtils.TruncateAt.END);
        d0Var.addView(hVar, a6.p(-1, -2, 1.0f, 16, 0, 0, AndroidUtilities.dp(8.0f), 0));
        TextView textView = new TextView(context);
        d0Var.a = textView;
        textView.setTextSize(1, 14.0f);
        int i12 = j6.y6;
        textView.setTextColor(j6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        d0Var.addView(textView, a6.o(-2, -2, 0.0f, 16));
        d0Var.setLayoutParams(new s4.p0(-1, -2));
        return new fl0(d0Var);
    }
}
