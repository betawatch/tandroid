package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.s41;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class n extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.q9 a;
    public final org.telegram.ui.ActionBar.m5 b;
    public final org.telegram.ui.ActionBar.m5 c;
    public final org.telegram.ui.Components.b9 d;
    public final ImageView e;
    public TLRPC.Chat f;
    public boolean h;
    public final int n;
    public final op r;
    public int s;

    public n(Context context, View.OnClickListener onClickListener, boolean z10, int i7) {
        super(context);
        this.n = k10.t0;
        this.d = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z11 = hd.a0;
        addView(q9Var, c8.ma.d(48, 48.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i7 + 12, 6.0f, z11 ? i7 + 12 : 0.0f, 6.0f));
        if (z10) {
            op opVar = new op(21, context, null);
            this.r = opVar;
            opVar.b(-1, org.telegram.ui.ActionBar.m6.d6, org.telegram.ui.ActionBar.m6.k7);
            opVar.setDrawUnchecked(false);
            opVar.setDrawBackgroundAsArc(3);
            boolean z12 = hd.a0;
            addView(opVar, c8.ma.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i7 + 42, 32.0f, z12 ? i7 + 42 : 0.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.b = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, null);
        m5Var.setTextSize(17);
        m5Var.setGravity((hd.a0 ? 5 : 3) | 48);
        boolean z13 = hd.a0;
        addView(m5Var, c8.ma.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 62 : i7 + 73, 9.5f, z13 ? i7 + 73 : 62, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.c = m5Var2;
        m5Var2.setTextSize(14);
        int i10 = org.telegram.ui.ActionBar.m6.y6;
        org.telegram.ui.ActionBar.t6.X(m5Var2, i10, null);
        m5Var2.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.J6, false));
        m5Var2.setGravity((hd.a0 ? 5 : 3) | 48);
        boolean z14 = hd.a0;
        addView(m5Var2, c8.ma.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 62 : i7 + 73, 32.5f, z14 ? i7 + 73 : 62, 6.0f));
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
        boolean z15 = hd.a0;
        addView(imageView, c8.ma.d(48, 48.0f, (z15 ? 3 : 5) | 48, z15 ? 7.0f : 0.0f, 6.0f, z15 ? 0.0f : 7.0f, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z10) {
        String s5 = a8.p0.s(new StringBuilder(), np.u1(this.n).X2, "/");
        this.f = chat;
        org.telegram.ui.Components.b9 b9Var = this.d;
        b9Var.q(chat);
        this.b.l(chat.title, false);
        StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(s5);
        m10.append(org.telegram.messenger.v3.K(chat, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10.toString());
        spannableStringBuilder.setSpan(new s41("", (fz0) null), s5.length(), spannableStringBuilder.length(), 33);
        this.c.l(spannableStringBuilder, false);
        this.a.f(chat, b9Var);
        this.h = z10;
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

    @Override // org.telegram.ui.ActionBar.b6
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

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
