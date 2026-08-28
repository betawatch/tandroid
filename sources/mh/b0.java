package mh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import g7.e6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class b0 extends vk0 {
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    public final void E(a0.h hVar) {
        ArrayList arrayList = this.c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        for (int i9 = 0; i9 < hVar.m(); i9++) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(i9);
            for (int i10 = 0; i10 < botInfo.commands.size(); i10++) {
                TLRPC.BotCommand botCommand = botInfo.commands.get(i10);
                if (botCommand != null && botCommand.command != null) {
                    arrayList.add("/" + botCommand.command);
                    arrayList2.add(botCommand.description);
                    arrayList3.add(Boolean.valueOf(botCommand.ephemeral));
                }
            }
        }
        l();
    }

    @Override // f2.r0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        a0 a0Var = (a0) q1Var.a;
        String str = (String) this.c.get(i9);
        if (((Boolean) this.e.get(i9)).booleanValue()) {
            eq eqVar = new eq(R.drawable.mini_ephemeral_hidden_14, 0);
            eqVar.setColorKey(f6.A6);
            eqVar.setTopOffset(1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            a0Var.a.setText(spannableStringBuilder);
        } else {
            a0Var.a.setText(str);
        }
        a0Var.b.setText((CharSequence) this.d.get(i9));
        a0Var.c = str;
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = viewGroup.getContext();
        a0 a0Var = new a0(context);
        a0Var.setOrientation(0);
        a0Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        bg.t tVar = new bg.t(context, 4);
        a0Var.b = tVar;
        NotificationCenter.listenEmojiLoading(tVar);
        tVar.setTextSize(1, 16.0f);
        int i10 = f6.G6;
        tVar.setTextColor(f6.w0(null, i10, false));
        tVar.setTag(Integer.valueOf(i10));
        tVar.setMaxLines(2);
        tVar.setEllipsize(TextUtils.TruncateAt.END);
        a0Var.addView(tVar, e6.p(-1, -2, 1.0f, 16, 0, 0, AndroidUtilities.dp(8.0f), 0));
        TextView textView = new TextView(context);
        a0Var.a = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = f6.y6;
        textView.setTextColor(f6.w0(null, i11, false));
        textView.setTag(Integer.valueOf(i11));
        a0Var.addView(textView, e6.o(-2, -2, 0.0f, 16));
        a0Var.setLayoutParams(new f2.a1(-1, -2));
        return new ik0(a0Var);
    }
}
