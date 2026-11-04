package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.view.View;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a3 implements org.telegram.ui.Cells.s9, lg0, org.telegram.ui.Components.dx0 {
    public SpannableStringBuilder E;
    public int F = -1;
    public int G = -1;
    public int H = -1;
    public org.telegram.ui.Components.l5 I;
    public ArrayList J;
    public Stack K;
    public AtomicReference L;
    public View M;
    public final i50 a;
    public View b;
    public boolean c;
    public StaticLayout d;
    public org.telegram.ui.Components.n70 e;
    public org.telegram.ui.Components.n70 f;
    public org.telegram.ui.Components.n70 h;
    public TL_iv.PageBlock n;
    public TL_iv.RichText r;
    public int s;
    public int w;
    public int x;
    public CharSequence y;

    public a3(i50 i50Var) {
        this.a = i50Var;
    }

    @Override // org.telegram.ui.Cells.s9
    public final Layout a() {
        return this.d;
    }

    @Override // org.telegram.ui.Components.dx0
    public final /* synthetic */ int b() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.s9
    public final /* synthetic */ Rect c() {
        return null;
    }

    @Override // org.telegram.ui.Components.dx0
    public final void d(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.c = true;
        this.b = view;
        i50 i50Var = this.a;
        float f10 = 0.0f;
        if (i50Var.F.isEmpty()) {
            this.h = null;
        } else {
            q3 q3Var = (q3) i50Var.F.get(i50Var.H);
            if (q3Var.c != this.n || ((obj = q3Var.b) != (richText = this.r) && (!(obj instanceof String) || richText != null))) {
                this.h = null;
            } else if (-1 != q3Var.a) {
                org.telegram.ui.Components.n70 n70Var = new org.telegram.ui.Components.n70(0);
                this.h = n70Var;
                n70Var.n = false;
                n70Var.d(this.d, q3Var.a, 0.0f);
                this.h.o = 0;
                StaticLayout staticLayout = this.d;
                int i3 = q3Var.a;
                staticLayout.getSelectionPath(i3, i50Var.G.length() + i3, this.h);
                this.h.n = true;
            }
        }
        org.telegram.ui.Components.n70 n70Var2 = this.h;
        if (n70Var2 != null) {
            canvas.drawPath(n70Var2, i4.A1);
        }
        org.telegram.ui.Components.n70 n70Var3 = this.e;
        if (n70Var3 != null) {
            canvas.drawPath(n70Var3, i4.z1);
        }
        org.telegram.ui.Components.n70 n70Var4 = this.f;
        if (n70Var4 != null) {
            canvas.drawPath(n70Var4, i4.B1);
        }
        if (i50Var.c.i(canvas, this)) {
            view.invalidate();
        }
        if (i50Var.d == this && i50Var.b == null && i50Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f10 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-org.telegram.messenger.g0.L(2.0f)) + f10, 0.0f, f10 + width + org.telegram.messenger.g0.L(2.0f), this.d.getHeight(), i4.y1);
        }
        ArrayList arrayList = this.J;
        if (arrayList == null || arrayList.isEmpty()) {
            this.d.draw(canvas);
        } else {
            yh.f.g(view, false, this.d.getPaint().getColor(), 0, this.L, 0, this.d, this.J, canvas, false);
        }
        this.c = false;
    }

    @Override // org.telegram.ui.lg0
    public final View e() {
        View view = this.M;
        return view != null ? view : this.b;
    }

    @Override // org.telegram.ui.Components.dx0
    public final void f(View view) {
        if (view == null) {
            view = this.M;
        }
        org.telegram.ui.Components.p5.release(view, this.I);
        this.M = null;
    }

    @Override // org.telegram.ui.Components.dx0
    public final void g(int i3) {
        this.x = i3;
    }

    @Override // org.telegram.ui.Cells.s9
    public final CharSequence getPrefix() {
        return this.y;
    }

    @Override // org.telegram.ui.Cells.s9
    public final int getRow() {
        return this.x;
    }

    @Override // org.telegram.ui.Cells.s9
    public final CharSequence getText() {
        return this.d.getText();
    }

    @Override // org.telegram.ui.Cells.s9
    public final int getX() {
        return this.s;
    }

    @Override // org.telegram.ui.Cells.s9
    public final int getY() {
        return this.w;
    }

    @Override // org.telegram.ui.Components.dx0
    public final void h(int i3) {
        this.w = i3;
    }

    @Override // org.telegram.ui.Components.dx0
    public final void i(View view) {
        this.M = view;
        StaticLayout staticLayout = this.d;
        if (staticLayout != null) {
            this.I = org.telegram.ui.Components.p5.update(0, view, false, this.I, staticLayout);
        }
    }

    @Override // org.telegram.ui.Components.dx0
    public final void j(int i3) {
        this.s = i3;
    }

    public final int k() {
        int i3 = this.F;
        if (i3 != -1) {
            return i3;
        }
        this.F = this.d.getWidth();
        for (int i10 = 0; i10 < this.d.getLineCount(); i10++) {
            this.F = Math.min(this.F, (int) this.d.getLineLeft(i10));
        }
        return this.F;
    }

    public final int l() {
        int i3 = this.G;
        if (i3 != -1) {
            return i3;
        }
        this.G = 0;
        for (int i10 = 0; i10 < this.d.getLineCount(); i10++) {
            this.G = Math.max(this.G, (int) this.d.getLineRight(i10));
        }
        return this.G;
    }

    public final int m() {
        int i3 = this.H;
        if (i3 != -1) {
            return i3;
        }
        this.H = 0;
        if (this.d.getLineCount() > 0) {
            this.H = Math.max(this.H, (int) this.d.getLineRight(r1.getLineCount() - 1));
        }
        return this.H;
    }
}
