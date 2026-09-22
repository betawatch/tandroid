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
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.o01;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class n extends FrameLayout {
    public final org.telegram.ui.Components.u9 a;
    public final org.telegram.ui.ActionBar.j5 b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final org.telegram.ui.Components.f9 d;
    public final ImageView e;
    public TLRPC.Chat f;
    public boolean h;
    public final int n;
    public final np r;

    public n(Context context, View.OnClickListener onClickListener, boolean z10, int i10) {
        super(context);
        this.n = UserConfig.selectedAccount;
        this.d = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z11 = LocaleController.isRTL;
        addView(u9Var, w7.x5.d(48, 48.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i10 + 12, 6.0f, z11 ? i10 + 12 : 0.0f, 6.0f));
        if (z10) {
            np npVar = new np(context, 21, null);
            this.r = npVar;
            npVar.b(-1, org.telegram.ui.ActionBar.i6.d6, org.telegram.ui.ActionBar.i6.k7);
            npVar.setDrawUnchecked(false);
            npVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            addView(npVar, w7.x5.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 42, 32.0f, z12 ? i10 + 42 : 0.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.b = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        j5Var.setTextSize(17);
        j5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(j5Var, w7.x5.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 62 : i10 + 73, 9.5f, z13 ? i10 + 73 : 62, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var2;
        j5Var2.setTextSize(14);
        int i11 = org.telegram.ui.ActionBar.i6.y6;
        j5Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        j5Var2.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J6, false));
        j5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        addView(j5Var2, w7.x5.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 62 : i10 + 73, 32.5f, z14 ? i10 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.i6, false), 1, -1));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        boolean z15 = LocaleController.isRTL;
        addView(imageView, w7.x5.d(48, 48.0f, (z15 ? 3 : 5) | 48, z15 ? 7.0f : 0.0f, 6.0f, z15 ? 0.0f : 7.0f, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.n;
        String t10 = a4.a.t(sb2, MessagesController.getInstance(i10).linkPrefix, "/");
        this.f = chat;
        org.telegram.ui.Components.f9 f9Var = this.d;
        f9Var.k(i10, chat);
        this.b.l(chat.title, false);
        StringBuilder v = a4.a.v(t10);
        v.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(v.toString());
        spannableStringBuilder.setSpan(new m51("", (o01) null), t10.length(), spannableStringBuilder.length(), 33);
        this.c.l(spannableStringBuilder, false);
        this.a.e(chat, f9Var);
        this.h = z10;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f;
    }

    public ImageView getDeleteButton() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.j5 getNameTextView() {
        return this.b;
    }

    public org.telegram.ui.ActionBar.j5 getStatusTextView() {
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
