package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.s01;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class n extends FrameLayout {
    public final org.telegram.ui.Components.p9 a;
    public final org.telegram.ui.ActionBar.k5 b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final org.telegram.ui.Components.z8 d;
    public final ImageView e;
    public TLRPC.Chat f;
    public boolean h;
    public final int n;
    public final lp r;

    public n(Context context, View.OnClickListener onClickListener, boolean z4, int i10) {
        super(context);
        this.n = UserConfig.selectedAccount;
        this.d = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z10 = LocaleController.isRTL;
        addView(p9Var, k7.b6.d(48, 48.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : i10 + 12, 6.0f, z10 ? i10 + 12 : 0.0f, 6.0f));
        if (z4) {
            lp lpVar = new lp(context, 21, null);
            this.r = lpVar;
            lpVar.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
            lpVar.setDrawUnchecked(false);
            lpVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            addView(lpVar, k7.b6.d(24, 24.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i10 + 42, 32.0f, z11 ? i10 + 42 : 0.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        k5Var.setTextSize(17);
        k5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(k5Var, k7.b6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 62 : i10 + 73, 9.5f, z12 ? i10 + 73 : 62, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var2;
        k5Var2.setTextSize(14);
        int i11 = org.telegram.ui.ActionBar.j6.y6;
        k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        k5Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
        k5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(k5Var2, k7.b6.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 62 : i10 + 73, 32.5f, z13 ? i10 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 1, -1));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        boolean z14 = LocaleController.isRTL;
        addView(imageView, k7.b6.d(48, 48.0f, (z14 ? 3 : 5) | 48, z14 ? 7.0f : 0.0f, 6.0f, z14 ? 0.0f : 7.0f, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z4) {
        StringBuilder sb = new StringBuilder();
        int i10 = this.n;
        String r10 = android.support.v4.media.a.r(sb, MessagesController.getInstance(i10).linkPrefix, "/");
        this.f = chat;
        org.telegram.ui.Components.z8 z8Var = this.d;
        z8Var.k(i10, chat);
        this.b.l(chat.title, false);
        StringBuilder l10 = e2.c.l(r10);
        l10.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l10.toString());
        spannableStringBuilder.setSpan(new m51("", (s01) null), r10.length(), spannableStringBuilder.length(), 33);
        this.c.l(spannableStringBuilder, false);
        this.a.e(chat, z8Var);
        this.h = z4;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f;
    }

    public ImageView getDeleteButton() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.k5 getNameTextView() {
        return this.b;
    }

    public org.telegram.ui.ActionBar.k5 getStatusTextView() {
        return this.c;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.h ? 12 : 0) + 60), TLObject.FLAG_30));
    }
}
