package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.yz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.g9 a;
    public final org.telegram.ui.ActionBar.u5 b;
    public final org.telegram.ui.ActionBar.u5 c;
    public final org.telegram.ui.Components.r8 d;
    public final ImageView e;
    public TLRPC.Chat f;
    public boolean h;
    public final int n;
    public final ep r;
    public int s;

    public m(Context context, View.OnClickListener onClickListener, boolean z10, int i10) {
        super(context);
        this.n = d20.s0;
        this.d = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(24.0f));
        boolean z11 = cd.X;
        addView(g9Var, w7.b6.d(48, 48.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i10 + 12, 6.0f, z11 ? i10 + 12 : 0.0f, 6.0f));
        if (z10) {
            ep epVar = new ep(21, context, null);
            this.r = epVar;
            epVar.b(-1, org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.k7);
            epVar.setDrawUnchecked(false);
            epVar.setDrawBackgroundAsArc(3);
            boolean z12 = cd.X;
            addView(epVar, w7.b6.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 42, 32.0f, z12 ? i10 + 42 : 0.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.b = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, null);
        u5Var.setTextSize(17);
        u5Var.setGravity((cd.X ? 5 : 3) | 48);
        boolean z13 = cd.X;
        addView(u5Var, w7.b6.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 62 : i10 + 73, 9.5f, z13 ? i10 + 73 : 62, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.c = u5Var2;
        u5Var2.setTextSize(14);
        int i11 = org.telegram.ui.ActionBar.t6.y6;
        org.telegram.ui.ActionBar.a7.Y(u5Var2, i11, null);
        u5Var2.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J6, false));
        u5Var2.setGravity((cd.X ? 5 : 3) | 48);
        boolean z14 = cd.X;
        addView(u5Var2, w7.b6.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 62 : i10 + 73, 32.5f, z14 ? i10 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        int i12 = org.telegram.ui.ActionBar.t6.i6;
        y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, null);
        org.telegram.ui.ActionBar.a7.t(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
        boolean z15 = cd.X;
        addView(imageView, w7.b6.d(48, 48.0f, (z15 ? 3 : 5) | 48, z15 ? 7.0f : 0.0f, 6.0f, z15 ? 0.0f : 7.0f, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z10) {
        String r10 = a1.g.r(new StringBuilder(), vp.r1(this.n).U2, "/");
        this.f = chat;
        org.telegram.ui.Components.r8 r8Var = this.d;
        r8Var.q(chat);
        this.b.l(chat.title, false);
        StringBuilder t10 = a1.g.t(r10);
        t10.append(org.telegram.messenger.w3.K(chat, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t10.toString());
        spannableStringBuilder.setSpan(new e51("", (yz0) null), r10.length(), spannableStringBuilder.length(), 33);
        this.c.l(spannableStringBuilder, false);
        this.a.e(chat, r8Var);
        this.h = z10;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f;
    }

    public ImageView getDeleteButton() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.u5 getNameTextView() {
        return this.b;
    }

    public org.telegram.ui.ActionBar.u5 getStatusTextView() {
        return this.c;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L((this.h ? 12 : 0) + 60), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                int[] iArr = org.telegram.ui.ActionBar.t6.p8;
                if (i10 >= iArr.length) {
                    break;
                }
                i11 = (i11 * 31) + org.telegram.ui.ActionBar.t6.x0(null, iArr[i10], false);
                i10++;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        if (i11 != this.s) {
            this.s = i11;
            TLRPC.Chat chat = this.f;
            if (chat != null) {
                this.d.q(chat);
                this.a.invalidate();
            }
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.c;
        if (u5Var != null) {
            u5Var.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J6, false));
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
