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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e3 implements org.telegram.ui.Cells.y9, cj0, org.telegram.ui.Components.jy0 {
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public org.telegram.ui.Components.p5 D;
    public ArrayList E;
    public Stack F;
    public AtomicReference G;
    public View H;
    public final a70 a;
    public View b;
    public boolean c;
    public StaticLayout d;
    public org.telegram.ui.Components.f80 e;
    public org.telegram.ui.Components.f80 f;
    public org.telegram.ui.Components.f80 h;
    public TL_iv.PageBlock n;
    public TL_iv.RichText r;
    public int s;
    public int v;
    public int w;
    public CharSequence x;
    public SpannableStringBuilder y;

    public e3(a70 a70Var) {
        this.a = a70Var;
    }

    public final int a() {
        int i9 = this.A;
        if (i9 != -1) {
            return i9;
        }
        this.A = this.d.getWidth();
        for (int i10 = 0; i10 < this.d.getLineCount(); i10++) {
            this.A = Math.min(this.A, (int) this.d.getLineLeft(i10));
        }
        return this.A;
    }

    @Override // org.telegram.ui.Components.jy0
    public final void attach(View view) {
        this.H = view;
        StaticLayout staticLayout = this.d;
        if (staticLayout != null) {
            this.D = org.telegram.ui.Components.t5.update(0, view, false, this.D, staticLayout);
        }
    }

    public final int b() {
        int i9 = this.B;
        if (i9 != -1) {
            return i9;
        }
        this.B = 0;
        for (int i10 = 0; i10 < this.d.getLineCount(); i10++) {
            this.B = Math.max(this.B, (int) this.d.getLineRight(i10));
        }
        return this.B;
    }

    public final int c() {
        int i9 = this.C;
        if (i9 != -1) {
            return i9;
        }
        this.C = 0;
        if (this.d.getLineCount() > 0) {
            this.C = Math.max(this.C, (int) this.d.getLineRight(r1.getLineCount() - 1));
        }
        return this.C;
    }

    @Override // org.telegram.ui.Components.jy0
    public final void detach(View view) {
        if (view == null) {
            view = this.H;
        }
        org.telegram.ui.Components.t5.release(view, this.D);
        this.H = null;
    }

    @Override // org.telegram.ui.Components.jy0
    public final void draw(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.c = true;
        this.b = view;
        a70 a70Var = this.a;
        float f10 = 0.0f;
        if (a70Var.A.isEmpty()) {
            this.h = null;
        } else {
            u3 u3Var = (u3) a70Var.A.get(a70Var.C);
            if (u3Var.c != this.n || ((obj = u3Var.b) != (richText = this.r) && (!(obj instanceof String) || richText != null))) {
                this.h = null;
            } else if (-1 != u3Var.a) {
                org.telegram.ui.Components.f80 f80Var = new org.telegram.ui.Components.f80(0);
                this.h = f80Var;
                f80Var.n = false;
                f80Var.d(this.d, u3Var.a, 0.0f);
                this.h.o = 0;
                StaticLayout staticLayout = this.d;
                int i9 = u3Var.a;
                staticLayout.getSelectionPath(i9, a70Var.B.length() + i9, this.h);
                this.h.n = true;
            }
        }
        org.telegram.ui.Components.f80 f80Var2 = this.h;
        if (f80Var2 != null) {
            canvas.drawPath(f80Var2, l4.u1);
        }
        org.telegram.ui.Components.f80 f80Var3 = this.e;
        if (f80Var3 != null) {
            canvas.drawPath(f80Var3, l4.t1);
        }
        org.telegram.ui.Components.f80 f80Var4 = this.f;
        if (f80Var4 != null) {
            canvas.drawPath(f80Var4, l4.v1);
        }
        if (a70Var.c.g(canvas, this)) {
            view.invalidate();
        }
        if (a70Var.d == this && a70Var.b == null && a70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f10 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f10, 0.0f, f10 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), l4.s1);
        }
        ArrayList arrayList = this.E;
        if (arrayList == null || arrayList.isEmpty()) {
            this.d.draw(canvas);
        } else {
            dh.l.g(view, false, this.d.getPaint().getColor(), 0, this.G, 0, this.d, this.E, canvas, false);
        }
        this.c = false;
    }

    @Override // org.telegram.ui.Components.jy0
    public final /* synthetic */ int getEmojiOnlyCount() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.y9
    public final Layout getLayout() {
        return this.d;
    }

    @Override // org.telegram.ui.cj0
    public final View getParentView() {
        View view = this.H;
        return view != null ? view : this.b;
    }

    @Override // org.telegram.ui.Cells.y9
    public final CharSequence getPrefix() {
        return this.x;
    }

    @Override // org.telegram.ui.Cells.y9
    public final int getRow() {
        return this.w;
    }

    @Override // org.telegram.ui.Cells.y9
    public final /* synthetic */ Rect getSelectionBounds() {
        return null;
    }

    @Override // org.telegram.ui.Cells.y9
    public final CharSequence getText() {
        return this.d.getText();
    }

    @Override // org.telegram.ui.Cells.y9
    public final int getX() {
        return this.s;
    }

    @Override // org.telegram.ui.Cells.y9
    public final int getY() {
        return this.v;
    }

    @Override // org.telegram.ui.Components.jy0
    public final void setRow(int i9) {
        this.w = i9;
    }

    @Override // org.telegram.ui.Components.jy0
    public final void setX(int i9) {
        this.s = i9;
    }

    @Override // org.telegram.ui.Components.jy0
    public final void setY(int i9) {
        this.v = i9;
    }
}
