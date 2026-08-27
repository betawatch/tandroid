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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f3 implements org.telegram.ui.Cells.u9, ej0, org.telegram.ui.Components.ly0 {
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public org.telegram.ui.Components.p5 D;
    public ArrayList E;
    public Stack F;
    public AtomicReference G;
    public View H;
    public final d70 a;
    public View b;
    public boolean c;
    public StaticLayout d;
    public org.telegram.ui.Components.j80 e;
    public org.telegram.ui.Components.j80 f;
    public org.telegram.ui.Components.j80 h;
    public TL_iv.PageBlock n;
    public TL_iv.RichText r;
    public int s;
    public int v;
    public int w;
    public CharSequence x;
    public SpannableStringBuilder y;

    public f3(d70 d70Var) {
        this.a = d70Var;
    }

    public final int a() {
        int i10 = this.A;
        if (i10 != -1) {
            return i10;
        }
        this.A = this.d.getWidth();
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.A = Math.min(this.A, (int) this.d.getLineLeft(i11));
        }
        return this.A;
    }

    @Override // org.telegram.ui.Components.ly0
    public final void attach(View view) {
        this.H = view;
        StaticLayout staticLayout = this.d;
        if (staticLayout != null) {
            this.D = org.telegram.ui.Components.t5.update(0, view, false, this.D, staticLayout);
        }
    }

    public final int b() {
        int i10 = this.B;
        if (i10 != -1) {
            return i10;
        }
        this.B = 0;
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.B = Math.max(this.B, (int) this.d.getLineRight(i11));
        }
        return this.B;
    }

    public final int c() {
        int i10 = this.C;
        if (i10 != -1) {
            return i10;
        }
        this.C = 0;
        if (this.d.getLineCount() > 0) {
            this.C = Math.max(this.C, (int) this.d.getLineRight(r1.getLineCount() - 1));
        }
        return this.C;
    }

    @Override // org.telegram.ui.Components.ly0
    public final void detach(View view) {
        if (view == null) {
            view = this.H;
        }
        org.telegram.ui.Components.t5.release(view, this.D);
        this.H = null;
    }

    @Override // org.telegram.ui.Components.ly0
    public final void draw(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.c = true;
        this.b = view;
        d70 d70Var = this.a;
        float f10 = 0.0f;
        if (d70Var.A.isEmpty()) {
            this.h = null;
        } else {
            v3 v3Var = (v3) d70Var.A.get(d70Var.C);
            if (v3Var.c != this.n || ((obj = v3Var.b) != (richText = this.r) && (!(obj instanceof String) || richText != null))) {
                this.h = null;
            } else if (-1 != v3Var.a) {
                org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(0);
                this.h = j80Var;
                j80Var.n = false;
                j80Var.d(this.d, v3Var.a, 0.0f);
                this.h.o = 0;
                StaticLayout staticLayout = this.d;
                int i10 = v3Var.a;
                staticLayout.getSelectionPath(i10, d70Var.B.length() + i10, this.h);
                this.h.n = true;
            }
        }
        org.telegram.ui.Components.j80 j80Var2 = this.h;
        if (j80Var2 != null) {
            canvas.drawPath(j80Var2, m4.u1);
        }
        org.telegram.ui.Components.j80 j80Var3 = this.e;
        if (j80Var3 != null) {
            canvas.drawPath(j80Var3, m4.t1);
        }
        org.telegram.ui.Components.j80 j80Var4 = this.f;
        if (j80Var4 != null) {
            canvas.drawPath(j80Var4, m4.v1);
        }
        if (d70Var.c.g(canvas, this)) {
            view.invalidate();
        }
        if (d70Var.d == this && d70Var.b == null && d70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f10 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f10, 0.0f, f10 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), m4.s1);
        }
        ArrayList arrayList = this.E;
        if (arrayList == null || arrayList.isEmpty()) {
            this.d.draw(canvas);
        } else {
            eh.k.g(view, false, this.d.getPaint().getColor(), 0, this.G, 0, this.d, this.E, canvas, false);
        }
        this.c = false;
    }

    @Override // org.telegram.ui.Components.ly0
    public final /* synthetic */ int getEmojiOnlyCount() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.u9
    public final Layout getLayout() {
        return this.d;
    }

    @Override // org.telegram.ui.ej0
    public final View getParentView() {
        View view = this.H;
        return view != null ? view : this.b;
    }

    @Override // org.telegram.ui.Cells.u9
    public final CharSequence getPrefix() {
        return this.x;
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getRow() {
        return this.w;
    }

    @Override // org.telegram.ui.Cells.u9
    public final /* synthetic */ Rect getSelectionBounds() {
        return null;
    }

    @Override // org.telegram.ui.Cells.u9
    public final CharSequence getText() {
        return this.d.getText();
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getX() {
        return this.s;
    }

    @Override // org.telegram.ui.Cells.u9
    public final int getY() {
        return this.v;
    }

    @Override // org.telegram.ui.Components.ly0
    public final void setRow(int i10) {
        this.w = i10;
    }

    @Override // org.telegram.ui.Components.ly0
    public final void setX(int i10) {
        this.s = i10;
    }

    @Override // org.telegram.ui.Components.ly0
    public final void setY(int i10) {
        this.v = i10;
    }
}
