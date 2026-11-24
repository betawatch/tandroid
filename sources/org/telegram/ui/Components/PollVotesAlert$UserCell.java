package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class PollVotesAlert$UserCell extends LinearLayout implements vlb {
    public ArrayList E;
    public final /* synthetic */ ih8 F;
    public final bf0 a;
    public final lka b;
    public final TextView c;
    public final TextView d;
    public final pc0 e;
    public final d0b f;
    public TLRPC.User h;
    public TLRPC.Chat n;
    public CharSequence r;
    public boolean s;
    public int w;
    public boolean x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollVotesAlert$UserCell(ih8 ih8Var, Context context) {
        super(context);
        this.F = ih8Var;
        this.y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        this.e = new pc0((ylb) null);
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(18.0f));
        addView(bf0Var, qoe.t(34, 34, 16, 0, 0, 11, 0));
        lka lkaVar = new lka(context);
        this.b = lkaVar;
        int i = cmb.i5;
        anb.W(lkaVar, i, null);
        lkaVar.setTypeface(gm.o());
        lkaVar.setTextSize(16);
        lkaVar.setGravity((jb6.a0 ? 5 : 3) | 16);
        addView(lkaVar, qoe.q(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        anb.X(textView, cmb.q5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, qoe.q(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        anb.X(textView2, i, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, qoe.q(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f = new d0b(20, lkaVar);
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.y9));
    }

    public float getPlaceholderAlpha() {
        return this.y;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f.a.b();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        int L;
        int L2;
        int L3;
        int L4;
        ih8 ih8Var = this.F;
        RectF rectF = ih8Var.G1;
        Paint paint = ih8Var.A1;
        if (this.x || this.y != 0.0f) {
            paint.setAlpha((int) (this.y * 255.0f));
            bf0 bf0Var = this.a;
            canvas.drawCircle((bf0Var.getMeasuredWidth() / 2) + bf0Var.getLeft(), (bf0Var.getMeasuredHeight() / 2) + bf0Var.getTop(), bf0Var.getMeasuredWidth() / 2, paint);
            if (this.w % 2 == 0) {
                L = gm.L(65.0f);
                L2 = gm.L(48.0f);
            } else {
                L = gm.L(65.0f);
                L2 = gm.L(60.0f);
            }
            if (jb6.a0) {
                L = (getMeasuredWidth() - L) - L2;
            }
            rectF.set(L, r6 - gm.L(4.0f), L + L2, gm.L(4.0f) + r6);
            canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint);
            if (this.w % 2 == 0) {
                L3 = gm.L(119.0f);
                L4 = gm.L(60.0f);
            } else {
                L3 = gm.L(131.0f);
                L4 = gm.L(80.0f);
            }
            if (jb6.a0) {
                L3 = (getMeasuredWidth() - L3) - L4;
            }
            rectF.set(L3, r6 - gm.L(4.0f), L3 + L4, gm.L(4.0f) + r6);
            canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint);
        }
        if (this.s) {
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(64.0f) : 0), getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f) + (this.s ? 1 : 0), TLObject.FLAG_30));
    }

    public void setPlaceholderAlpha(float f) {
        this.y = f;
        invalidate();
    }

    @Override // vlb
    public final void updateColors() {
        d0b d0bVar = this.f;
        if (d0bVar != null) {
            try {
                tm tmVar = d0bVar.a;
                if (!(tmVar != null) || tmVar.G == null) {
                    return;
                }
                int i = cmb.y9;
                ih8 ih8Var = this.F;
                pn pnVar = ih8.L1;
                tmVar.k(Integer.valueOf(cmb.v0(i, ih8Var.J0)));
                lka lkaVar = this.b;
                if (lkaVar != null) {
                    lkaVar.invalidate();
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}
