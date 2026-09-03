package jg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class h extends d {
    public final ImageView r;
    public g s;
    public TLRPC.Chat v;
    public boolean w;

    public h(Context context, g6 g6Var) {
        super(context, g6Var);
        this.d.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.r = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(k6.f0(k6.w0(null, k6.Vh, false), 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        imageView.setColorFilter(new PorterDuffColorFilter(k6.w0(null, k6.m6, false), PorterDuff.Mode.MULTIPLY));
        imageView.setContentDescription(LocaleController.getString(R.string.Delete));
        boolean z4 = LocaleController.isRTL;
        addView(imageView, c6.d(48, 50.0f, (z4 ? 3 : 5) | 17, z4 ? 3.0f : 0.0f, 0.0f, z4 ? 0.0f : 3.0f, 0.0f));
        this.d.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : 0.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 24.0f), 0);
    }

    @Override // jg.d
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i10, boolean z4, int i11) {
        String string;
        this.w = z4;
        this.v = chat;
        z8 z8Var = this.b;
        z8Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        p9 p9Var = this.c;
        p9Var.setRoundRadius(dp);
        p9Var.e(chat, z8Var);
        String str = chat.title;
        c cVar = this.d;
        cVar.k(Emoji.replaceEmoji(str, cVar.getPaint().getFontMetricsInt(), false));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (z4) {
            if (i11 >= 1) {
                string = LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", i11, new Object[0]);
            } else {
                string = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup);
            }
            setSubtitle(string);
        } else {
            setSubtitle(LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", i10, new Object[0]));
        }
        this.e.setTextColor(k6.v0(k6.r5, this.a));
        setDivider(true);
        ImageView imageView = this.r;
        if (z4) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new dg.n(8, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.v;
    }

    @Override // jg.d, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }

    public void setChatDeleteListener(g gVar) {
        this.s = gVar;
    }
}
