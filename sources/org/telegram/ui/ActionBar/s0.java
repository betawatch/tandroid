package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class s0 extends FrameLayout implements fe.e, k6 {
    public int D;
    public int E;
    public eq F;
    public int G;
    public int H;
    public ColorFilter I;
    public int J;
    public final fe.b a;
    public eq b;
    public final g9 c;
    public final ImageView d;
    public final TextView e;
    public zf.e0 f;
    public final lg.s h;
    public final p6 n;
    public boolean r;
    public boolean s;
    public int w;
    public int x;
    public eq y;

    public s0(Context context, p6 p6Var) {
        super(context);
        this.a = new fe.b(0, this, gr.h, 380L, false);
        this.h = new lg.s(this, 16);
        this.n = p6Var;
        g9 g9Var = new g9(context);
        this.c = g9Var;
        addView(g9Var, w7.b6.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, w7.b6.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.b6.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.x = org.telegram.messenger.i0.L(28.0f);
        updateColors();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.x;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, t6.n0(this.w));
        super.dispatchDraw(canvas);
    }

    public zf.e0 getFilter() {
        return this.f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(135.0f), TLObject.FLAG_31), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setData(zf.e0 e0Var) {
        this.f = e0Var;
        this.s = false;
        String str = e0Var.c;
        if (str == null) {
            str = cd.L0(e0Var.b, null);
        }
        this.e.setText(str);
        eq N = t6.N(org.telegram.messenger.i0.L(32.0f), e0Var.a);
        this.b = N;
        int i10 = t6.Ci;
        p6 p6Var = this.n;
        t6.B1(N, t6.w0(i10, p6Var), false);
        eq eqVar = this.b;
        int i11 = t6.Gi;
        t6.B1(eqVar, t6.w0(i11, p6Var), true);
        int i12 = e0Var.d;
        g9 g9Var = this.c;
        if (i12 != 4) {
            if (i12 != 7) {
                g9Var.setImageDrawable(this.b);
                return;
            }
            eq N2 = t6.N(org.telegram.messenger.i0.L(32.0f), R.drawable.chats_archive);
            int L = org.telegram.messenger.i0.L(16.0f);
            int L2 = org.telegram.messenger.i0.L(16.0f);
            N2.e = L;
            N2.f = L2;
            t6.B1(N2, t6.w0(i10, p6Var), false);
            t6.B1(N2, t6.w0(i11, p6Var), true);
            g9Var.setImageDrawable(N2);
            this.y = N2;
            this.D = t6.w0(i10, p6Var);
            this.E = t6.w0(i11, p6Var);
            return;
        }
        TLObject tLObject = e0Var.f;
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.s = org.telegram.messenger.w3.Y(chat);
                ImageReceiver imageReceiver = g9Var.getImageReceiver();
                int L3 = org.telegram.messenger.i0.L(this.s ? 10.0f : 16.0f);
                this.x = L3;
                imageReceiver.J0(L3);
                g9Var.getImageReceiver().i0(chat, this.b, null);
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (d20.i(d20.s0).f().id != user.id) {
            g9Var.getImageReceiver().J0(org.telegram.messenger.i0.L(16.0f));
            g9Var.getImageReceiver().i0(user, this.b, null);
            return;
        }
        eq N3 = t6.N(org.telegram.messenger.i0.L(32.0f), R.drawable.chats_saved);
        int L4 = org.telegram.messenger.i0.L(16.0f);
        int L5 = org.telegram.messenger.i0.L(16.0f);
        N3.e = L4;
        N3.f = L5;
        t6.B1(N3, t6.w0(i10, p6Var), false);
        t6.B1(N3, t6.w0(i11, p6Var), true);
        g9Var.setImageDrawable(N3);
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
        fe.b bVar = this.a;
        if (bVar.f == z10) {
            return;
        }
        lg.s sVar = this.h;
        org.telegram.messenger.i0.r(sVar);
        bVar.a(z10, true);
        if (z10) {
            org.telegram.messenger.i0.h3(sVar, 2000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        float f7 = this.a.e;
        boolean z10 = this.r;
        p6 p6Var = this.n;
        int r12 = z10 ? t6.r1(0.075f, t6.w0(t6.G6, p6Var)) : t6.w0(t6.Qi, p6Var);
        int i10 = t6.Ci;
        int w02 = t6.w0(i10, p6Var);
        int w03 = t6.w0(t6.G6, p6Var);
        int i11 = t6.Gi;
        int w04 = t6.w0(i11, p6Var);
        this.w = i0.b.f(f7, r12, w02);
        this.e.setTextColor(i0.b.f(f7, w03, w04));
        ImageView imageView = this.d;
        if (imageView.getColorFilter() != this.I || this.J != w04) {
            imageView.setColorFilter(w04);
            this.I = imageView.getColorFilter();
            this.J = w04;
        }
        imageView.setAlpha(f7);
        float f10 = 0.82f * f7;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        int w05 = t6.w0(i10, p6Var);
        int w06 = t6.w0(i11, p6Var);
        eq eqVar = this.b;
        if (eqVar != null && (eqVar != this.F || w05 != this.G || w06 != this.H)) {
            t6.B1(eqVar, w05, false);
            t6.B1(this.b, w06, true);
            this.F = this.b;
            this.G = w05;
            this.H = w06;
        }
        float f11 = 1.0f - f7;
        g9 g9Var = this.c;
        g9Var.setAlpha(f11);
        zf.e0 e0Var = this.f;
        if (e0Var != null && e0Var.d == 7) {
            eq eqVar2 = this.y;
            if (eqVar2 == null) {
                setData(e0Var);
            } else if (w05 != this.D || w06 != this.E) {
                t6.B1(eqVar2, w05, false);
                t6.B1(this.y, w06, true);
                this.D = w05;
                this.E = w06;
                g9Var.invalidate();
            }
        }
        invalidate();
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            updateColors();
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
