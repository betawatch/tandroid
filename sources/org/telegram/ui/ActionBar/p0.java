package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.i9;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class p0 extends FrameLayout implements te.b, z5 {
    public int E;
    public int F;
    public fq G;
    public int H;
    public int I;
    public ColorFilter J;
    public int K;
    public final te.a a;
    public fq b;
    public final i9 c;
    public final ImageView d;
    public final TextView e;
    public jg.o0 f;
    public final kg.j1 h;
    public final e6 n;
    public boolean r;
    public boolean s;
    public int w;
    public int x;
    public fq y;

    public p0(Context context, e6 e6Var) {
        super(context);
        this.a = new te.a(0, this, er.h, 380L, false);
        this.h = new kg.j1(this, 29);
        this.n = e6Var;
        i9 i9Var = new i9(context);
        this.c = i9Var;
        addView(i9Var, ja.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, ja.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, ja.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.x = org.telegram.messenger.g0.L(28.0f);
        updateColors();
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
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
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i7, i7, j6.n0(this.w));
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
            str = hd.M0(o0Var.b, null);
        }
        this.e.setText(str);
        fq N = j6.N(org.telegram.messenger.g0.L(32.0f), o0Var.a);
        this.b = N;
        int i7 = j6.Fi;
        e6 e6Var = this.n;
        j6.B1(N, j6.w0(i7, e6Var), false);
        fq fqVar = this.b;
        int i10 = j6.Ji;
        j6.B1(fqVar, j6.w0(i10, e6Var), true);
        int i11 = o0Var.d;
        i9 i9Var = this.c;
        if (i11 != 4) {
            if (i11 != 7) {
                i9Var.setImageDrawable(this.b);
                return;
            }
            fq N2 = j6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_archive);
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            N2.e = L;
            N2.f = L2;
            j6.B1(N2, j6.w0(i7, e6Var), false);
            j6.B1(N2, j6.w0(i10, e6Var), true);
            i9Var.setImageDrawable(N2);
            this.y = N2;
            this.E = j6.w0(i7, e6Var);
            this.F = j6.w0(i10, e6Var);
            return;
        }
        TLObject tLObject = o0Var.f;
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.s = org.telegram.messenger.t3.Y(chat);
                ImageReceiver imageReceiver = i9Var.getImageReceiver();
                int L3 = org.telegram.messenger.g0.L(this.s ? 10.0f : 16.0f);
                this.x = L3;
                imageReceiver.J0(L3);
                i9Var.getImageReceiver().i0(chat, this.b, null);
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (m10.i(m10.t0).f().id != user.id) {
            i9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(16.0f));
            i9Var.getImageReceiver().i0(user, this.b, null);
            return;
        }
        fq N3 = j6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_saved);
        int L4 = org.telegram.messenger.g0.L(16.0f);
        int L5 = org.telegram.messenger.g0.L(16.0f);
        N3.e = L4;
        N3.f = L5;
        j6.B1(N3, j6.w0(i7, e6Var), false);
        j6.B1(N3, j6.w0(i10, e6Var), true);
        i9Var.setImageDrawable(N3);
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
        kg.j1 j1Var = this.h;
        org.telegram.messenger.g0.r(j1Var);
        aVar.a(z10, true);
        if (z10) {
            org.telegram.messenger.g0.i3(j1Var, 2000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        float f10 = this.a.e;
        boolean z10 = this.r;
        e6 e6Var = this.n;
        int r12 = z10 ? j6.r1(0.075f, j6.w0(j6.G6, e6Var)) : j6.w0(j6.Ti, e6Var);
        int i7 = j6.Fi;
        int w02 = j6.w0(i7, e6Var);
        int w03 = j6.w0(j6.G6, e6Var);
        int i10 = j6.Ji;
        int w04 = j6.w0(i10, e6Var);
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
        int w05 = j6.w0(i7, e6Var);
        int w06 = j6.w0(i10, e6Var);
        fq fqVar = this.b;
        if (fqVar != null && (fqVar != this.G || w05 != this.H || w06 != this.I)) {
            j6.B1(fqVar, w05, false);
            j6.B1(this.b, w06, true);
            this.G = this.b;
            this.H = w05;
            this.I = w06;
        }
        float f12 = 1.0f - f10;
        i9 i9Var = this.c;
        i9Var.setAlpha(f12);
        jg.o0 o0Var = this.f;
        if (o0Var != null && o0Var.d == 7) {
            fq fqVar2 = this.y;
            if (fqVar2 == null) {
                setData(o0Var);
            } else if (w05 != this.E || w06 != this.F) {
                j6.B1(fqVar2, w05, false);
                j6.B1(this.y, w06, true);
                this.E = w05;
                this.F = w06;
                i9Var.invalidate();
            }
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }
}
