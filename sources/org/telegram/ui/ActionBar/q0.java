package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class q0 extends FrameLayout implements te.b, b6 {
    public int D;
    public int E;
    public xp F;
    public int G;
    public int H;
    public ColorFilter I;
    public int J;
    public final te.a a;
    public xp b;
    public final l9 c;
    public final ImageView d;
    public final TextView e;
    public jg.o0 f;
    public final l2.a0 h;
    public final g6 n;
    public boolean r;
    public boolean s;
    public int w;
    public int x;
    public xp y;

    public q0(Context context, g6 g6Var) {
        super(context);
        this.a = new te.a(0, this, xq.h, 380L, false);
        this.h = new l2.a0(this, 16);
        this.n = g6Var;
        l9 l9Var = new l9(context);
        this.c = l9Var;
        addView(l9Var, ha.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, ha.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, ha.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.x = org.telegram.messenger.g0.L(28.0f);
        updateColors();
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
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
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i7, i7, l6.n0(this.w));
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
            str = id.M0(o0Var.b, null);
        }
        this.e.setText(str);
        xp N = l6.N(org.telegram.messenger.g0.L(32.0f), o0Var.a);
        this.b = N;
        int i7 = l6.Ci;
        g6 g6Var = this.n;
        l6.B1(N, l6.w0(i7, g6Var), false);
        xp xpVar = this.b;
        int i10 = l6.Gi;
        l6.B1(xpVar, l6.w0(i10, g6Var), true);
        int i11 = o0Var.d;
        l9 l9Var = this.c;
        if (i11 != 4) {
            if (i11 != 7) {
                l9Var.setImageDrawable(this.b);
                return;
            }
            xp N2 = l6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_archive);
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            N2.e = L;
            N2.f = L2;
            l6.B1(N2, l6.w0(i7, g6Var), false);
            l6.B1(N2, l6.w0(i10, g6Var), true);
            l9Var.setImageDrawable(N2);
            this.y = N2;
            this.D = l6.w0(i7, g6Var);
            this.E = l6.w0(i10, g6Var);
            return;
        }
        TLObject tLObject = o0Var.f;
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.s = org.telegram.messenger.t3.Y(chat);
                ImageReceiver imageReceiver = l9Var.getImageReceiver();
                int L3 = org.telegram.messenger.g0.L(this.s ? 10.0f : 16.0f);
                this.x = L3;
                imageReceiver.J0(L3);
                l9Var.getImageReceiver().i0(chat, this.b, null);
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (p10.i(p10.s0).f().id != user.id) {
            l9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(16.0f));
            l9Var.getImageReceiver().i0(user, this.b, null);
            return;
        }
        xp N3 = l6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_saved);
        int L4 = org.telegram.messenger.g0.L(16.0f);
        int L5 = org.telegram.messenger.g0.L(16.0f);
        N3.e = L4;
        N3.f = L5;
        l6.B1(N3, l6.w0(i7, g6Var), false);
        l6.B1(N3, l6.w0(i10, g6Var), true);
        l9Var.setImageDrawable(N3);
    }

    public void setExpanded(boolean z9) {
        TextView textView = this.e;
        if (z9) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            setSelectedForDelete(false);
        }
    }

    public void setSelectedForDelete(boolean z9) {
        te.a aVar = this.a;
        if (aVar.f == z9) {
            return;
        }
        l2.a0 a0Var = this.h;
        org.telegram.messenger.g0.r(a0Var);
        aVar.a(z9, true);
        if (z9) {
            org.telegram.messenger.g0.i3(a0Var, 2000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        float f10 = this.a.e;
        boolean z9 = this.r;
        g6 g6Var = this.n;
        int r12 = z9 ? l6.r1(0.075f, l6.w0(l6.G6, g6Var)) : l6.w0(l6.Qi, g6Var);
        int i7 = l6.Ci;
        int w02 = l6.w0(i7, g6Var);
        int w03 = l6.w0(l6.G6, g6Var);
        int i10 = l6.Gi;
        int w04 = l6.w0(i10, g6Var);
        this.w = i0.a.f(f10, r12, w02);
        this.e.setTextColor(i0.a.f(f10, w03, w04));
        ImageView imageView = this.d;
        if (imageView.getColorFilter() != this.I || this.J != w04) {
            imageView.setColorFilter(w04);
            this.I = imageView.getColorFilter();
            this.J = w04;
        }
        imageView.setAlpha(f10);
        float f11 = 0.82f * f10;
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        int w05 = l6.w0(i7, g6Var);
        int w06 = l6.w0(i10, g6Var);
        xp xpVar = this.b;
        if (xpVar != null && (xpVar != this.F || w05 != this.G || w06 != this.H)) {
            l6.B1(xpVar, w05, false);
            l6.B1(this.b, w06, true);
            this.F = this.b;
            this.G = w05;
            this.H = w06;
        }
        float f12 = 1.0f - f10;
        l9 l9Var = this.c;
        l9Var.setAlpha(f12);
        jg.o0 o0Var = this.f;
        if (o0Var != null && o0Var.d == 7) {
            xp xpVar2 = this.y;
            if (xpVar2 == null) {
                setData(o0Var);
            } else if (w05 != this.D || w06 != this.E) {
                l6.B1(xpVar2, w05, false);
                l6.B1(this.y, w06, true);
                this.D = w05;
                this.E = w06;
                l9Var.invalidate();
            }
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
