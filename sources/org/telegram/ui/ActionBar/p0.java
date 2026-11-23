package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.na;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class p0 extends FrameLayout implements te.b, c6 {
    public int E;
    public int F;
    public lq G;
    public int H;
    public int I;
    public ColorFilter J;
    public int K;
    public final te.a a;
    public lq b;
    public final p9 c;
    public final ImageView d;
    public final TextView e;
    public jg.o0 f;
    public final oi.c2 h;
    public final i6 n;
    public boolean r;
    public boolean s;
    public int w;
    public int x;
    public lq y;

    public p0(Context context, i6 i6Var) {
        super(context);
        this.a = new te.a(0, this, kr.h, 380L, false);
        this.h = new oi.c2(this, 3);
        this.n = i6Var;
        p9 p9Var = new p9(context);
        this.c = p9Var;
        addView(p9Var, na.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, na.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, na.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.x = org.telegram.messenger.g0.L(28.0f);
        updateColors();
    }

    @Override // te.b
    public final void K(int i7, float f10, float f11, te.c cVar) {
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
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i7, i7, n6.n0(this.w));
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
            str = gd.N0(o0Var.b, null);
        }
        this.e.setText(str);
        lq N = n6.N(org.telegram.messenger.g0.L(32.0f), o0Var.a);
        this.b = N;
        int i7 = n6.Fi;
        i6 i6Var = this.n;
        n6.B1(N, n6.w0(i7, i6Var), false);
        lq lqVar = this.b;
        int i10 = n6.Ji;
        n6.B1(lqVar, n6.w0(i10, i6Var), true);
        int i11 = o0Var.d;
        p9 p9Var = this.c;
        if (i11 != 4) {
            if (i11 != 7) {
                p9Var.setImageDrawable(this.b);
                return;
            }
            lq N2 = n6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_archive);
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            N2.e = L;
            N2.f = L2;
            n6.B1(N2, n6.w0(i7, i6Var), false);
            n6.B1(N2, n6.w0(i10, i6Var), true);
            p9Var.setImageDrawable(N2);
            this.y = N2;
            this.E = n6.w0(i7, i6Var);
            this.F = n6.w0(i10, i6Var);
            return;
        }
        TLObject tLObject = o0Var.f;
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.s = org.telegram.messenger.v3.Y(chat);
                ImageReceiver imageReceiver = p9Var.getImageReceiver();
                int L3 = org.telegram.messenger.g0.L(this.s ? 10.0f : 16.0f);
                this.x = L3;
                imageReceiver.K0(L3);
                p9Var.getImageReceiver().j0(chat, this.b, null);
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (i10.i(i10.t0).f().id != user.id) {
            p9Var.getImageReceiver().K0(org.telegram.messenger.g0.L(16.0f));
            p9Var.getImageReceiver().j0(user, this.b, null);
            return;
        }
        lq N3 = n6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_saved);
        int L4 = org.telegram.messenger.g0.L(16.0f);
        int L5 = org.telegram.messenger.g0.L(16.0f);
        N3.e = L4;
        N3.f = L5;
        n6.B1(N3, n6.w0(i7, i6Var), false);
        n6.B1(N3, n6.w0(i10, i6Var), true);
        p9Var.setImageDrawable(N3);
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        float f10 = this.a.e;
        boolean z10 = this.r;
        i6 i6Var = this.n;
        int r12 = z10 ? n6.r1(0.075f, n6.w0(n6.G6, i6Var)) : n6.w0(n6.Ti, i6Var);
        int i7 = n6.Fi;
        int w02 = n6.w0(i7, i6Var);
        int w03 = n6.w0(n6.G6, i6Var);
        int i10 = n6.Ji;
        int w04 = n6.w0(i10, i6Var);
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
        int w05 = n6.w0(i7, i6Var);
        int w06 = n6.w0(i10, i6Var);
        lq lqVar = this.b;
        if (lqVar != null && (lqVar != this.G || w05 != this.H || w06 != this.I)) {
            n6.B1(lqVar, w05, false);
            n6.B1(this.b, w06, true);
            this.G = this.b;
            this.H = w05;
            this.I = w06;
        }
        float f12 = 1.0f - f10;
        p9 p9Var = this.c;
        p9Var.setAlpha(f12);
        jg.o0 o0Var = this.f;
        if (o0Var != null && o0Var.d == 7) {
            lq lqVar2 = this.y;
            if (lqVar2 == null) {
                setData(o0Var);
            } else if (w05 != this.E || w06 != this.F) {
                n6.B1(lqVar2, w05, false);
                n6.B1(this.y, w06, true);
                this.E = w05;
                this.F = w06;
                p9Var.invalidate();
            }
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // te.b
    public final /* synthetic */ void G(float f10, int i7) {
    }
}
