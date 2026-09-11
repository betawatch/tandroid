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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class b3 implements org.telegram.ui.Cells.ba, uj0, org.telegram.ui.Components.bz0 {
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.v5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final v70 a;
    public View b;
    public boolean c;
    public StaticLayout d;
    public org.telegram.ui.Components.x80 e;
    public org.telegram.ui.Components.x80 f;
    public org.telegram.ui.Components.x80 h;
    public TL_iv.PageBlock n;
    public TL_iv.RichText r;
    public int s;
    public int v;
    public int w;
    public CharSequence x;
    public SpannableStringBuilder y;

    public b3(v70 v70Var) {
        this.a = v70Var;
    }

    public final int a() {
        int i10 = this.E;
        if (i10 != -1) {
            return i10;
        }
        this.E = this.d.getWidth();
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.E = Math.min(this.E, (int) this.d.getLineLeft(i11));
        }
        return this.E;
    }

    @Override // org.telegram.ui.Components.bz0
    public final void attach(View view) {
        this.L = view;
        StaticLayout staticLayout = this.d;
        if (staticLayout != null) {
            this.H = org.telegram.ui.Components.z5.update(0, view, false, this.H, staticLayout);
        }
    }

    public final int b() {
        int i10 = this.F;
        if (i10 != -1) {
            return i10;
        }
        this.F = 0;
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.F = Math.max(this.F, (int) this.d.getLineRight(i11));
        }
        return this.F;
    }

    public final int c() {
        int i10 = this.G;
        if (i10 != -1) {
            return i10;
        }
        this.G = 0;
        if (this.d.getLineCount() > 0) {
            this.G = Math.max(this.G, (int) this.d.getLineRight(r1.getLineCount() - 1));
        }
        return this.G;
    }

    @Override // org.telegram.ui.Components.bz0
    public final void detach(View view) {
        if (view == null) {
            view = this.L;
        }
        org.telegram.ui.Components.z5.release(view, this.H);
        this.L = null;
    }

    @Override // org.telegram.ui.Components.bz0
    public final void draw(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.c = true;
        this.b = view;
        v70 v70Var = this.a;
        float f7 = 0.0f;
        if (v70Var.E.isEmpty()) {
            this.h = null;
        } else {
            r3 r3Var = (r3) v70Var.E.get(v70Var.G);
            if (r3Var.c != this.n || ((obj = r3Var.b) != (richText = this.r) && (!(obj instanceof String) || richText != null))) {
                this.h = null;
            } else if (-1 != r3Var.a) {
                org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(0);
                this.h = x80Var;
                x80Var.n = false;
                x80Var.d(this.d, r3Var.a, 0.0f);
                this.h.o = 0;
                StaticLayout staticLayout = this.d;
                int i10 = r3Var.a;
                staticLayout.getSelectionPath(i10, v70Var.F.length() + i10, this.h);
                this.h.n = true;
            }
        }
        org.telegram.ui.Components.x80 x80Var2 = this.h;
        if (x80Var2 != null) {
            canvas.drawPath(x80Var2, i4.y1);
        }
        org.telegram.ui.Components.x80 x80Var3 = this.e;
        if (x80Var3 != null) {
            canvas.drawPath(x80Var3, i4.x1);
        }
        org.telegram.ui.Components.x80 x80Var4 = this.f;
        if (x80Var4 != null) {
            canvas.drawPath(x80Var4, i4.z1);
        }
        if (v70Var.c.g(canvas, this)) {
            view.invalidate();
        }
        if (v70Var.d == this && v70Var.b == null && v70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f7, 0.0f, f7 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), i4.w1);
        }
        ArrayList arrayList = this.I;
        if (arrayList == null || arrayList.isEmpty()) {
            this.d.draw(canvas);
        } else {
            wh.h.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        }
        this.c = false;
    }

    @Override // org.telegram.ui.Components.bz0
    public final /* synthetic */ int getEmojiOnlyCount() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.ba
    public final Layout getLayout() {
        return this.d;
    }

    @Override // org.telegram.ui.uj0
    public final View getParentView() {
        View view = this.L;
        return view != null ? view : this.b;
    }

    @Override // org.telegram.ui.Cells.ba
    public final CharSequence getPrefix() {
        return this.x;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int getRow() {
        return this.w;
    }

    @Override // org.telegram.ui.Cells.ba
    public final /* synthetic */ Rect getSelectionBounds() {
        return null;
    }

    @Override // org.telegram.ui.Cells.ba
    public final CharSequence getText() {
        return this.d.getText();
    }

    @Override // org.telegram.ui.Cells.ba
    public final int getX() {
        return this.s;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int getY() {
        return this.v;
    }

    @Override // org.telegram.ui.Components.bz0
    public final void setRow(int i10) {
        this.w = i10;
    }

    @Override // org.telegram.ui.Components.bz0
    public final void setX(int i10) {
        this.s = i10;
    }

    @Override // org.telegram.ui.Components.bz0
    public final void setY(int i10) {
        this.v = i10;
    }
}
