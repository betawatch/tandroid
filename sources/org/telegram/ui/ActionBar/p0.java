package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.q9;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class p0 extends FrameLayout implements te.b, b6 {
    public int E;
    public int F;
    public oq G;
    public int H;
    public int I;
    public ColorFilter J;
    public int K;
    public final te.a a;
    public oq b;
    public final q9 c;
    public final ImageView d;
    public final TextView e;
    public jg.o0 f;
    public final oi.c2 h;
    public final h6 n;
    public boolean r;
    public boolean s;
    public int w;
    public int x;
    public oq y;

    public p0(Context context, h6 h6Var) {
        super(context);
        this.a = new te.a(0, this, nr.h, 380L, false);
        this.h = new oi.c2(this, 3);
        this.n = h6Var;
        q9 q9Var = new q9(context);
        this.c = q9Var;
        addView(q9Var, ma.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, ma.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, ma.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.x = org.telegram.messenger.g0.L(28.0f);
        updateColors();
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            updateColors();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i7 = this.x;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i7, i7, m6.n0(this.w));
        super.dispatchDraw(canvas);
    }

    public jg.o0 getFilter() {
        return this.f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        if (this.s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(135.0f), TLObject.FLAG_31), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }

    public void setData(jg.o0 o0Var) {
        this.f = o0Var;
        this.s = false;
        String str = o0Var.c;
        if (str == null) {
            str = hd.N0(o0Var.b, null);
        }
        this.e.setText(str);
        oq N = m6.N(org.telegram.messenger.g0.L(32.0f), o0Var.a);
        this.b = N;
        int i7 = m6.Fi;
        h6 h6Var = this.n;
        m6.B1(N, m6.w0(i7, h6Var), false);
        oq oqVar = this.b;
        int i10 = m6.Ji;
        m6.B1(oqVar, m6.w0(i10, h6Var), true);
        int i11 = o0Var.d;
        q9 q9Var = this.c;
        if (i11 != 4) {
            if (i11 != 7) {
                q9Var.setImageDrawable(this.b);
                return;
            }
            oq N2 = m6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_archive);
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            N2.e = L;
            N2.f = L2;
            m6.B1(N2, m6.w0(i7, h6Var), false);
            m6.B1(N2, m6.w0(i10, h6Var), true);
            q9Var.setImageDrawable(N2);
            this.y = N2;
            this.E = m6.w0(i7, h6Var);
            this.F = m6.w0(i10, h6Var);
            return;
        }
        TLObject tLObject = o0Var.f;
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.s = org.telegram.messenger.v3.Y(chat);
                ImageReceiver imageReceiver = q9Var.getImageReceiver();
                int L3 = org.telegram.messenger.g0.L(this.s ? 10.0f : 16.0f);
                this.x = L3;
                imageReceiver.J0(L3);
                q9Var.getImageReceiver().i0(chat, this.b, null);
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (k10.i(k10.t0).f().id != user.id) {
            q9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(16.0f));
            q9Var.getImageReceiver().i0(user, this.b, null);
            return;
        }
        oq N3 = m6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_saved);
        int L4 = org.telegram.messenger.g0.L(16.0f);
        int L5 = org.telegram.messenger.g0.L(16.0f);
        N3.e = L4;
        N3.f = L5;
        m6.B1(N3, m6.w0(i7, h6Var), false);
        m6.B1(N3, m6.w0(i10, h6Var), true);
        q9Var.setImageDrawable(N3);
    }

    public void setExpanded(boolean z10) {
        TextView textView = this.e;
        if (z10) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            setSelectedForDelete(false);
        }
    }

    public void setSelectedForDelete(boolean z10) {
        te.a aVar = this.a;
        if (aVar.f == z10) {
            return;
        }
        oi.c2 c2Var = this.h;
        org.telegram.messenger.g0.r(c2Var);
        aVar.a(z10, true);
        if (z10) {
            org.telegram.messenger.g0.h3(c2Var, 2000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        float f10 = this.a.e;
        boolean z10 = this.r;
        h6 h6Var = this.n;
        int r12 = z10 ? m6.r1(0.075f, m6.w0(m6.G6, h6Var)) : m6.w0(m6.Ti, h6Var);
        int i7 = m6.Fi;
        int w02 = m6.w0(i7, h6Var);
        int w03 = m6.w0(m6.G6, h6Var);
        int i10 = m6.Ji;
        int w04 = m6.w0(i10, h6Var);
        this.w = i0.a.f(f10, r12, w02);
        this.e.setTextColor(i0.a.f(f10, w03, w04));
        ImageView imageView = this.d;
        if (imageView.getColorFilter() != this.J || this.K != w04) {
            imageView.setColorFilter(w04);
            this.J = imageView.getColorFilter();
            this.K = w04;
        }
        imageView.setAlpha(f10);
        float f11 = 0.82f * f10;
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        int w05 = m6.w0(i7, h6Var);
        int w06 = m6.w0(i10, h6Var);
        oq oqVar = this.b;
        if (oqVar != null && (oqVar != this.G || w05 != this.H || w06 != this.I)) {
            m6.B1(oqVar, w05, false);
            m6.B1(this.b, w06, true);
            this.G = this.b;
            this.H = w05;
            this.I = w06;
        }
        float f12 = 1.0f - f10;
        q9 q9Var = this.c;
        q9Var.setAlpha(f12);
        jg.o0 o0Var = this.f;
        if (o0Var != null && o0Var.d == 7) {
            oq oqVar2 = this.y;
            if (oqVar2 == null) {
                setData(o0Var);
            } else if (w05 != this.E || w06 != this.F) {
                m6.B1(oqVar2, w05, false);
                m6.B1(this.y, w06, true);
                this.E = w05;
                this.F = w06;
                q9Var.invalidate();
            }
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
