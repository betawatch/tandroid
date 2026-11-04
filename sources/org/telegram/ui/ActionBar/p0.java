package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class p0 extends FrameLayout implements qe.b, z5 {
    public int E;
    public int F;
    public xp G;
    public int H;
    public int I;
    public ColorFilter J;
    public int K;
    public final qe.a a;
    public xp b;
    public final k9 c;
    public final ImageView d;
    public final TextView e;
    public kg.l0 f;
    public final lg.n h;
    public final e6 n;
    public boolean r;
    public boolean s;
    public int w;
    public int x;
    public xp y;

    public p0(Context context, e6 e6Var) {
        super(context);
        this.a = new qe.a(0, this, xq.h, 380L, false);
        this.h = new lg.n(this, 20);
        this.n = e6Var;
        k9 k9Var = new k9(context);
        this.c = k9Var;
        addView(k9Var, mf.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, mf.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, mf.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.x = org.telegram.messenger.g0.L(28.0f);
        updateColors();
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            updateColors();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i3 = this.x;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i3, i3, k6.n0(this.w));
        super.dispatchDraw(canvas);
    }

    public kg.l0 getFilter() {
        return this.f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        if (this.s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(135.0f), TLObject.FLAG_31), i10);
        } else {
            super.onMeasure(i3, i10);
        }
    }

    public void setData(kg.l0 l0Var) {
        this.f = l0Var;
        this.s = false;
        String str = l0Var.c;
        if (str == null) {
            str = bd.M0(l0Var.b, null);
        }
        this.e.setText(str);
        xp N = k6.N(org.telegram.messenger.g0.L(32.0f), l0Var.a);
        this.b = N;
        int i3 = k6.Ci;
        e6 e6Var = this.n;
        k6.B1(N, k6.w0(i3, e6Var), false);
        xp xpVar = this.b;
        int i10 = k6.Gi;
        k6.B1(xpVar, k6.w0(i10, e6Var), true);
        int i11 = l0Var.d;
        k9 k9Var = this.c;
        if (i11 != 4) {
            if (i11 != 7) {
                k9Var.setImageDrawable(this.b);
                return;
            }
            xp N2 = k6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_archive);
            int L = org.telegram.messenger.g0.L(16.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            N2.e = L;
            N2.f = L2;
            k6.B1(N2, k6.w0(i3, e6Var), false);
            k6.B1(N2, k6.w0(i10, e6Var), true);
            k9Var.setImageDrawable(N2);
            this.y = N2;
            this.E = k6.w0(i3, e6Var);
            this.F = k6.w0(i10, e6Var);
            return;
        }
        TLObject tLObject = l0Var.f;
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.s = org.telegram.messenger.t3.Y(chat);
                ImageReceiver imageReceiver = k9Var.getImageReceiver();
                int L3 = org.telegram.messenger.g0.L(this.s ? 10.0f : 16.0f);
                this.x = L3;
                imageReceiver.J0(L3);
                k9Var.getImageReceiver().i0(chat, this.b, null);
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (h10.i(h10.t0).f().id != user.id) {
            k9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(16.0f));
            k9Var.getImageReceiver().i0(user, this.b, null);
            return;
        }
        xp N3 = k6.N(org.telegram.messenger.g0.L(32.0f), R.drawable.chats_saved);
        int L4 = org.telegram.messenger.g0.L(16.0f);
        int L5 = org.telegram.messenger.g0.L(16.0f);
        N3.e = L4;
        N3.f = L5;
        k6.B1(N3, k6.w0(i3, e6Var), false);
        k6.B1(N3, k6.w0(i10, e6Var), true);
        k9Var.setImageDrawable(N3);
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
        qe.a aVar = this.a;
        if (aVar.f == z10) {
            return;
        }
        lg.n nVar = this.h;
        org.telegram.messenger.g0.r(nVar);
        aVar.a(z10, true);
        if (z10) {
            org.telegram.messenger.g0.i3(nVar, 2000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        float f10 = this.a.e;
        boolean z10 = this.r;
        e6 e6Var = this.n;
        int r12 = z10 ? k6.r1(0.075f, k6.w0(k6.G6, e6Var)) : k6.w0(k6.Qi, e6Var);
        int i3 = k6.Ci;
        int w02 = k6.w0(i3, e6Var);
        int w03 = k6.w0(k6.G6, e6Var);
        int i10 = k6.Gi;
        int w04 = k6.w0(i10, e6Var);
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
        int w05 = k6.w0(i3, e6Var);
        int w06 = k6.w0(i10, e6Var);
        xp xpVar = this.b;
        if (xpVar != null && (xpVar != this.G || w05 != this.H || w06 != this.I)) {
            k6.B1(xpVar, w05, false);
            k6.B1(this.b, w06, true);
            this.G = this.b;
            this.H = w05;
            this.I = w06;
        }
        float f12 = 1.0f - f10;
        k9 k9Var = this.c;
        k9Var.setAlpha(f12);
        kg.l0 l0Var = this.f;
        if (l0Var != null && l0Var.d == 7) {
            xp xpVar2 = this.y;
            if (xpVar2 == null) {
                setData(l0Var);
            } else if (w05 != this.E || w06 != this.F) {
                k6.B1(xpVar2, w05, false);
                k6.B1(this.y, w06, true);
                this.E = w05;
                this.F = w06;
                k9Var.invalidate();
            }
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}
