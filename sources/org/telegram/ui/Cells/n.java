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
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.op;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class n extends FrameLayout {
    public final org.telegram.ui.Components.w9 a;
    public final org.telegram.ui.ActionBar.i5 b;
    public final org.telegram.ui.ActionBar.i5 c;
    public final org.telegram.ui.Components.h9 d;
    public final ImageView e;
    public TLRPC.Chat f;
    public boolean h;
    public final int n;
    public final op r;

    public n(Context context, View.OnClickListener onClickListener, boolean z10, int i10) {
        super(context);
        this.n = UserConfig.selectedAccount;
        this.d = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z11 = LocaleController.isRTL;
        addView(w9Var, w7.x5.d(48, 48.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i10 + 12, 6.0f, z11 ? i10 + 12 : 0.0f, 6.0f));
        if (z10) {
            op opVar = new op(context, 21, null);
            this.r = opVar;
            opVar.b(-1, org.telegram.ui.ActionBar.h6.d6, org.telegram.ui.ActionBar.h6.k7);
            opVar.setDrawUnchecked(false);
            opVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            addView(opVar, w7.x5.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 42, 32.0f, z12 ? i10 + 42 : 0.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.b = i5Var;
        i5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        i5Var.setTextSize(17);
        i5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(i5Var, w7.x5.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 62 : i10 + 73, 9.5f, z13 ? i10 + 73 : 62, 0.0f));
        org.telegram.ui.ActionBar.i5 i5Var2 = new org.telegram.ui.ActionBar.i5(context);
        this.c = i5Var2;
        i5Var2.setTextSize(14);
        int i11 = org.telegram.ui.ActionBar.h6.y6;
        i5Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        i5Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.J6, false));
        i5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        addView(i5Var2, w7.x5.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 62 : i10 + 73, 32.5f, z14 ? i10 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.i6, false), 1, -1));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        boolean z15 = LocaleController.isRTL;
        addView(imageView, w7.x5.d(48, 48.0f, (z15 ? 3 : 5) | 48, z15 ? 7.0f : 0.0f, 6.0f, z15 ? 0.0f : 7.0f, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.n;
        String t10 = a4.a.t(sb2, MessagesController.getInstance(i10).linkPrefix, "/");
        this.f = chat;
        org.telegram.ui.Components.h9 h9Var = this.d;
        h9Var.k(i10, chat);
        this.b.l(chat.title, false);
        StringBuilder v = a4.a.v(t10);
        v.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(v.toString());
        spannableStringBuilder.setSpan(new l51("", (n01) null), t10.length(), spannableStringBuilder.length(), 33);
        this.c.l(spannableStringBuilder, false);
        this.a.e(chat, h9Var);
        this.h = z10;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f;
    }

    public ImageView getDeleteButton() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.i5 getNameTextView() {
        return this.b;
    }

    public org.telegram.ui.ActionBar.i5 getStatusTextView() {
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
