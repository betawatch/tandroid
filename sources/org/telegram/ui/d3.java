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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d3 implements org.telegram.ui.Cells.x9, ij0, org.telegram.ui.Components.fz0 {
    public int B = -1;
    public int C = -1;
    public int D = -1;
    public org.telegram.ui.Components.q5 E;
    public ArrayList F;
    public Stack G;
    public AtomicReference H;
    public View I;
    public final n70 a;
    public View b;
    public boolean c;
    public StaticLayout d;
    public org.telegram.ui.Components.y80 e;
    public org.telegram.ui.Components.y80 f;
    public org.telegram.ui.Components.y80 h;
    public TL_iv.PageBlock n;
    public TL_iv.RichText r;
    public int s;
    public int v;
    public int w;
    public CharSequence x;
    public SpannableStringBuilder y;

    public d3(n70 n70Var) {
        this.a = n70Var;
    }

    public final int a() {
        int i10 = this.B;
        if (i10 != -1) {
            return i10;
        }
        this.B = this.d.getWidth();
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.B = Math.min(this.B, (int) this.d.getLineLeft(i11));
        }
        return this.B;
    }

    @Override // org.telegram.ui.Components.fz0
    public final void attach(View view) {
        this.I = view;
        StaticLayout staticLayout = this.d;
        if (staticLayout != null) {
            this.E = org.telegram.ui.Components.u5.update(0, view, false, this.E, staticLayout);
        }
    }

    public final int b() {
        int i10 = this.C;
        if (i10 != -1) {
            return i10;
        }
        this.C = 0;
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.C = Math.max(this.C, (int) this.d.getLineRight(i11));
        }
        return this.C;
    }

    public final int c() {
        int i10 = this.D;
        if (i10 != -1) {
            return i10;
        }
        this.D = 0;
        if (this.d.getLineCount() > 0) {
            this.D = Math.max(this.D, (int) this.d.getLineRight(r1.getLineCount() - 1));
        }
        return this.D;
    }

    @Override // org.telegram.ui.Components.fz0
    public final void detach(View view) {
        if (view == null) {
            view = this.I;
        }
        org.telegram.ui.Components.u5.release(view, this.E);
        this.I = null;
    }

    @Override // org.telegram.ui.Components.fz0
    public final void draw(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.c = true;
        this.b = view;
        n70 n70Var = this.a;
        float f10 = 0.0f;
        if (n70Var.B.isEmpty()) {
            this.h = null;
        } else {
            u3 u3Var = (u3) n70Var.B.get(n70Var.D);
            if (u3Var.c != this.n || ((obj = u3Var.b) != (richText = this.r) && (!(obj instanceof String) || richText != null))) {
                this.h = null;
            } else if (-1 != u3Var.a) {
                org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(0);
                this.h = y80Var;
                y80Var.n = false;
                y80Var.d(this.d, u3Var.a, 0.0f);
                this.h.o = 0;
                StaticLayout staticLayout = this.d;
                int i10 = u3Var.a;
                staticLayout.getSelectionPath(i10, n70Var.C.length() + i10, this.h);
                this.h.n = true;
            }
        }
        org.telegram.ui.Components.y80 y80Var2 = this.h;
        if (y80Var2 != null) {
            canvas.drawPath(y80Var2, l4.v1);
        }
        org.telegram.ui.Components.y80 y80Var3 = this.e;
        if (y80Var3 != null) {
            canvas.drawPath(y80Var3, l4.u1);
        }
        org.telegram.ui.Components.y80 y80Var4 = this.f;
        if (y80Var4 != null) {
            canvas.drawPath(y80Var4, l4.w1);
        }
        if (n70Var.c.g(canvas, this)) {
            view.invalidate();
        }
        if (n70Var.d == this && n70Var.b == null && n70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f10 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f10, 0.0f, f10 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), l4.t1);
        }
        ArrayList arrayList = this.F;
        if (arrayList == null || arrayList.isEmpty()) {
            this.d.draw(canvas);
        } else {
            ih.k.g(view, false, this.d.getPaint().getColor(), 0, this.H, 0, this.d, this.F, canvas, false);
        }
        this.c = false;
    }

    @Override // org.telegram.ui.Components.fz0
    public final /* synthetic */ int getEmojiOnlyCount() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.x9
    public final Layout getLayout() {
        return this.d;
    }

    @Override // org.telegram.ui.ij0
    public final View getParentView() {
        View view = this.I;
        return view != null ? view : this.b;
    }

    @Override // org.telegram.ui.Cells.x9
    public final CharSequence getPrefix() {
        return this.x;
    }

    @Override // org.telegram.ui.Cells.x9
    public final int getRow() {
        return this.w;
    }

    @Override // org.telegram.ui.Cells.x9
    public final /* synthetic */ Rect getSelectionBounds() {
        return null;
    }

    @Override // org.telegram.ui.Cells.x9
    public final CharSequence getText() {
        return this.d.getText();
    }

    @Override // org.telegram.ui.Cells.x9
    public final int getX() {
        return this.s;
    }

    @Override // org.telegram.ui.Cells.x9
    public final int getY() {
        return this.v;
    }

    @Override // org.telegram.ui.Components.fz0
    public final void setRow(int i10) {
        this.w = i10;
    }

    @Override // org.telegram.ui.Components.fz0
    public final void setX(int i10) {
        this.s = i10;
    }

    @Override // org.telegram.ui.Components.fz0
    public final void setY(int i10) {
        this.v = i10;
    }
}
