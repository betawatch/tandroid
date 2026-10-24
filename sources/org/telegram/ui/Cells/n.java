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
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class n extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.w9 a;
    public final org.telegram.ui.ActionBar.n5 b;
    public final org.telegram.ui.ActionBar.n5 c;
    public final org.telegram.ui.Components.h9 d;
    public final ImageView e;
    public TLRPC.Chat f;
    public boolean h;
    public final int n;
    public final xp r;
    public int s;

    public n(Context context, View.OnClickListener onClickListener, boolean z10, int i10) {
        super(context);
        this.n = UserConfig.selectedAccount;
        this.d = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z11 = LocaleController.isRTL;
        addView(w9Var, w7.z5.d(48, 48.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i10 + 12, 6.0f, z11 ? i10 + 12 : 0.0f, 6.0f));
        if (z10) {
            xp xpVar = new xp(context, 21, null);
            this.r = xpVar;
            xpVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
            xpVar.setDrawUnchecked(false);
            xpVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            addView(xpVar, w7.z5.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 42, 32.0f, z12 ? i10 + 42 : 0.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.b = n5Var;
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.G6, null);
        n5Var.setTextSize(17);
        n5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(n5Var, w7.z5.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 62 : i10 + 73, 9.5f, z13 ? i10 + 73 : 62, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.c = n5Var2;
        n5Var2.setTextSize(14);
        int i11 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.Z(n5Var2, i11, null);
        n5Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
        n5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        addView(n5Var2, w7.z5.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 62 : i10 + 73, 32.5f, z14 ? i10 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        int i12 = org.telegram.ui.ActionBar.k6.i6;
        y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, null);
        org.telegram.ui.ActionBar.r6.t(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
        boolean z15 = LocaleController.isRTL;
        addView(imageView, w7.z5.d(48, 48.0f, (z15 ? 3 : 5) | 48, z15 ? 7.0f : 0.0f, 6.0f, z15 ? 0.0f : 7.0f, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.n;
        String s10 = a1.g.s(sb2, MessagesController.getInstance(i10).linkPrefix, "/");
        this.f = chat;
        org.telegram.ui.Components.h9 h9Var = this.d;
        h9Var.k(i10, chat);
        this.b.l(chat.title, false);
        StringBuilder u10 = a1.g.u(s10);
        u10.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(u10.toString());
        spannableStringBuilder.setSpan(new q61("", (q11) null), s10.length(), spannableStringBuilder.length(), 33);
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

    public org.telegram.ui.ActionBar.n5 getNameTextView() {
        return this.b;
    }

    public org.telegram.ui.ActionBar.n5 getStatusTextView() {
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                int[] iArr = org.telegram.ui.ActionBar.k6.p8;
                if (i10 >= iArr.length) {
                    break;
                }
                i11 = (i11 * 31) + org.telegram.ui.ActionBar.k6.x0(null, iArr[i10], false);
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
        org.telegram.ui.ActionBar.n5 n5Var = this.c;
        if (n5Var != null) {
            n5Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
