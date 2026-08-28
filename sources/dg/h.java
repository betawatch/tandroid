package dg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import bg.u1;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h extends d {
    public final ImageView r;
    public g s;
    public TLRPC.Chat v;
    public boolean w;

    public h(Context context, b6 b6Var) {
        super(context, b6Var);
        this.d.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.r = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(f6.f0(f6.w0(null, f6.Vh, false), 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        imageView.setColorFilter(new PorterDuffColorFilter(f6.w0(null, f6.m6, false), PorterDuff.Mode.MULTIPLY));
        imageView.setContentDescription(LocaleController.getString(R.string.Delete));
        boolean z10 = LocaleController.isRTL;
        addView(imageView, e6.d(48, 50.0f, (z10 ? 3 : 5) | 17, z10 ? 3.0f : 0.0f, 0.0f, z10 ? 0.0f : 3.0f, 0.0f));
        this.d.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : 0.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 24.0f), 0);
    }

    @Override // dg.d
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i9, boolean z10, int i10) {
        String string;
        this.w = z10;
        this.v = chat;
        z8 z8Var = this.b;
        z8Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        o9 o9Var = this.c;
        o9Var.setRoundRadius(dp);
        o9Var.e(chat, z8Var);
        String str = chat.title;
        c cVar = this.d;
        cVar.k(Emoji.replaceEmoji(str, cVar.getPaint().getFontMetricsInt(), false));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (z10) {
            if (i10 >= 1) {
                string = LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", i10, new Object[0]);
            } else {
                string = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup);
            }
            setSubtitle(string);
        } else {
            setSubtitle(LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", i9, new Object[0]));
        }
        this.e.setTextColor(f6.v0(f6.r5, this.a));
        setDivider(true);
        ImageView imageView = this.r;
        if (z10) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new u1(4, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.v;
    }

    @Override // dg.d, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }

    public void setChatDeleteListener(g gVar) {
        this.s = gVar;
    }
}
