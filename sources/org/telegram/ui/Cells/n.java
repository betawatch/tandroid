package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.y11;
import org.telegram.ui.Components.zp;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class n extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Components.y9 a;
    public final org.telegram.ui.ActionBar.b6 b;
    public final org.telegram.ui.ActionBar.b6 c;
    public final org.telegram.ui.Components.j9 d;
    public final ImageView e;
    public TLRPC.Chat f;
    public boolean h;
    public final int n;
    public final zp r;
    public int s;

    public n(Context context, View.OnClickListener onClickListener, boolean z10, int i10) {
        super(context);
        this.n = UserConfig.selectedAccount;
        this.d = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z11 = LocaleController.isRTL;
        addView(y9Var, gb1.h(48, 48.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i10 + 12, 6.0f, z11 ? i10 + 12 : 0.0f, 6.0f));
        if (z10) {
            zp zpVar = new zp(context, 21, null);
            this.r = zpVar;
            zpVar.b(-1, org.telegram.ui.ActionBar.y6.d6, org.telegram.ui.ActionBar.y6.k7);
            zpVar.setDrawUnchecked(false);
            zpVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            addView(zpVar, gb1.h(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 42, 32.0f, z12 ? i10 + 42 : 0.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.b = b6Var;
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, null);
        b6Var.setTextSize(17);
        b6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(b6Var, gb1.h(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 62 : i10 + 73, 9.5f, z13 ? i10 + 73 : 62, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(context);
        this.c = b6Var2;
        b6Var2.setTextSize(14);
        int i11 = org.telegram.ui.ActionBar.y6.y6;
        org.telegram.ui.ActionBar.f7.Y(b6Var2, i11, null);
        b6Var2.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.J6, false));
        b6Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        addView(b6Var2, gb1.h(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 62 : i10 + 73, 32.5f, z14 ? i10 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        int i12 = org.telegram.ui.ActionBar.y6.i6;
        y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, null);
        org.telegram.ui.ActionBar.f7.t(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
        boolean z15 = LocaleController.isRTL;
        addView(imageView, gb1.h(48, 48.0f, (z15 ? 3 : 5) | 48, z15 ? 7.0f : 0.0f, 6.0f, z15 ? 0.0f : 7.0f, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.n;
        String s10 = a1.g.s(sb2, MessagesController.getInstance(i10).linkPrefix, "/");
        this.f = chat;
        org.telegram.ui.Components.j9 j9Var = this.d;
        j9Var.k(i10, chat);
        this.b.l(chat.title, false);
        StringBuilder u10 = a1.g.u(s10);
        u10.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(u10.toString());
        spannableStringBuilder.setSpan(new x61("", (y11) null), s10.length(), spannableStringBuilder.length(), 33);
        this.c.l(spannableStringBuilder, false);
        this.a.f(chat, j9Var);
        this.h = z10;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f;
    }

    public ImageView getDeleteButton() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.b6 getNameTextView() {
        return this.b;
    }

    public org.telegram.ui.ActionBar.b6 getStatusTextView() {
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                int[] iArr = org.telegram.ui.ActionBar.y6.p8;
                if (i10 >= iArr.length) {
                    break;
                }
                i11 = (i11 * 31) + org.telegram.ui.ActionBar.y6.x0(null, iArr[i10], false);
                i10++;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i11 != this.s) {
            this.s = i11;
            TLRPC.Chat chat = this.f;
            if (chat != null) {
                this.d.k(this.n, chat);
                this.a.invalidate();
            }
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        if (b6Var != null) {
            b6Var.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.J6, false));
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
