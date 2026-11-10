package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.k9 a;
    public final org.telegram.ui.ActionBar.m5 b;
    public final org.telegram.ui.ActionBar.m5 c;
    public final org.telegram.ui.Components.v8 d;
    public final ImageView e;
    public TLRPC.Chat f;
    public boolean h;
    public final int n;
    public final wo r;
    public int s;

    public n(Context context, View.OnClickListener onClickListener, boolean z9, int i7) {
        super(context);
        this.n = p10.s0;
        this.d = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z10 = id.a0;
        addView(k9Var, c8.ha.d(48, 48.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : i7 + 12, 6.0f, z10 ? i7 + 12 : 0.0f, 6.0f));
        if (z9) {
            wo woVar = new wo(21, context, null);
            this.r = woVar;
            woVar.b(-1, org.telegram.ui.ActionBar.m6.d6, org.telegram.ui.ActionBar.m6.k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            boolean z11 = id.a0;
            addView(woVar, c8.ha.d(24, 24.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i7 + 42, 32.0f, z11 ? i7 + 42 : 0.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.b = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, null);
        m5Var.setTextSize(17);
        m5Var.setGravity((id.a0 ? 5 : 3) | 48);
        boolean z12 = id.a0;
        addView(m5Var, c8.ha.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 62 : i7 + 73, 9.5f, z12 ? i7 + 73 : 62, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.c = m5Var2;
        m5Var2.setTextSize(14);
        int i10 = org.telegram.ui.ActionBar.m6.y6;
        org.telegram.ui.ActionBar.t6.X(m5Var2, i10, null);
        m5Var2.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.J6, false));
        m5Var2.setGravity((id.a0 ? 5 : 3) | 48);
        boolean z13 = id.a0;
        addView(m5Var2, c8.ha.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 62 : i7 + 73, 32.5f, z13 ? i7 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        int i11 = org.telegram.ui.ActionBar.m6.i6;
        y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, null);
        org.telegram.ui.ActionBar.t6.s(imageView, i10, null, PorterDuff.Mode.MULTIPLY);
        boolean z14 = id.a0;
        addView(imageView, c8.ha.d(48, 48.0f, (z14 ? 3 : 5) | 48, z14 ? 7.0f : 0.0f, 6.0f, z14 ? 0.0f : 7.0f, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z9) {
        String s5 = a8.p0.s(new StringBuilder(), qp.s1(this.n).U2, "/");
        this.f = chat;
        org.telegram.ui.Components.v8 v8Var = this.d;
        v8Var.q(chat);
        this.b.l(chat.title, false);
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(s5);
        m10.append(org.telegram.messenger.t3.K(chat, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10.toString());
        spannableStringBuilder.setSpan(new b41("", (uy0) null), s5.length(), spannableStringBuilder.length(), 33);
        this.c.l(spannableStringBuilder, false);
        this.a.e(chat, v8Var);
        this.h = z9;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f;
    }

    public ImageView getDeleteButton() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.m5 getNameTextView() {
        return this.b;
    }

    public org.telegram.ui.ActionBar.m5 getStatusTextView() {
        return this.c;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L((this.h ? 12 : 0) + 60), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            try {
                int[] iArr = org.telegram.ui.ActionBar.m6.p8;
                if (i7 >= iArr.length) {
                    break;
                }
                i10 = (i10 * 31) + org.telegram.ui.ActionBar.m6.x0(null, iArr[i7], false);
                i7++;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (i10 != this.s) {
            this.s = i10;
            TLRPC.Chat chat = this.f;
            if (chat != null) {
                this.d.q(chat);
                this.a.invalidate();
            }
        }
        org.telegram.ui.ActionBar.m5 m5Var = this.c;
        if (m5Var != null) {
            m5Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.J6, false));
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
