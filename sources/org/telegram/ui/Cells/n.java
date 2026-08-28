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
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.vz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n extends FrameLayout {
    public final org.telegram.ui.Components.o9 a;
    public final org.telegram.ui.ActionBar.h5 b;
    public final org.telegram.ui.ActionBar.h5 c;
    public final org.telegram.ui.Components.z8 d;
    public final ImageView e;
    public TLRPC.Chat f;
    public boolean h;
    public final int n;
    public final dp r;

    public n(Context context, View.OnClickListener onClickListener, boolean z10, int i9) {
        super(context);
        this.n = UserConfig.selectedAccount;
        this.d = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z11 = LocaleController.isRTL;
        addView(o9Var, g7.e6.d(48, 48.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i9 + 12, 6.0f, z11 ? i9 + 12 : 0.0f, 6.0f));
        if (z10) {
            dp dpVar = new dp(context, 21, null);
            this.r = dpVar;
            dpVar.b(-1, org.telegram.ui.ActionBar.f6.d6, org.telegram.ui.ActionBar.f6.k7);
            dpVar.setDrawUnchecked(false);
            dpVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            addView(dpVar, g7.e6.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i9 + 42, 32.0f, z12 ? i9 + 42 : 0.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        h5Var.setTextSize(17);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(h5Var, g7.e6.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 62 : i9 + 73, 9.5f, z13 ? i9 + 73 : 62, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.c = h5Var2;
        h5Var2.setTextSize(14);
        int i10 = org.telegram.ui.ActionBar.f6.y6;
        h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        h5Var2.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
        h5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        addView(h5Var2, g7.e6.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 62 : i9 + 73, 32.5f, z14 ? i9 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 1, -1));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        boolean z15 = LocaleController.isRTL;
        addView(imageView, g7.e6.d(48, 48.0f, (z15 ? 3 : 5) | 48, z15 ? 7.0f : 0.0f, 6.0f, z15 ? 0.0f : 7.0f, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        int i9 = this.n;
        String r10 = aa.d.r(sb2, MessagesController.getInstance(i9).linkPrefix, "/");
        this.f = chat;
        org.telegram.ui.Components.z8 z8Var = this.d;
        z8Var.k(i9, chat);
        this.b.l(chat.title, false);
        StringBuilder n10 = e2.c.n(r10);
        n10.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(n10.toString());
        spannableStringBuilder.setSpan(new p41("", (vz0) null), r10.length(), spannableStringBuilder.length(), 33);
        this.c.l(spannableStringBuilder, false);
        this.a.e(chat, z8Var);
        this.h = z10;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f;
    }

    public ImageView getDeleteButton() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.h5 getNameTextView() {
        return this.b;
    }

    public org.telegram.ui.ActionBar.h5 getStatusTextView() {
        return this.c;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.h ? 12 : 0) + 60), TLObject.FLAG_30));
    }
}
