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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class PollVotesAlert$UserCell extends LinearLayout implements snb {
    public ArrayList E;
    public final /* synthetic */ ui8 F;
    public final de0 a;
    public final ema b;
    public final TextView c;
    public final TextView d;
    public final rb0 e;
    public final c2b f;
    public TLRPC.User h;
    public TLRPC.Chat n;
    public CharSequence r;
    public boolean s;
    public int w;
    public boolean x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollVotesAlert$UserCell(ui8 ui8Var, Context context) {
        super(context);
        this.F = ui8Var;
        this.y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        this.e = new rb0((vnb) null);
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(18.0f));
        addView(de0Var, tre.t(34, 34, 16, 0, 0, 11, 0));
        ema emaVar = new ema(context);
        this.b = emaVar;
        int i = aob.j5;
        yob.W(emaVar, i, null);
        emaVar.setTypeface(hl.o());
        emaVar.setTextSize(16);
        emaVar.setGravity((ob6.a0 ? 5 : 3) | 16);
        addView(emaVar, tre.q(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        yob.X(textView, aob.r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, tre.q(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        yob.X(textView2, i, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, tre.q(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f = new c2b(20, emaVar);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.z9));
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
        ui8 ui8Var = this.F;
        RectF rectF = ui8Var.G1;
        Paint paint = ui8Var.A1;
        if (this.x || this.y != 0.0f) {
            paint.setAlpha((int) (this.y * 255.0f));
            de0 de0Var = this.a;
            canvas.drawCircle((de0Var.getMeasuredWidth() / 2) + de0Var.getLeft(), (de0Var.getMeasuredHeight() / 2) + de0Var.getTop(), de0Var.getMeasuredWidth() / 2, paint);
            if (this.w % 2 == 0) {
                L = hl.L(65.0f);
                L2 = hl.L(48.0f);
            } else {
                L = hl.L(65.0f);
                L2 = hl.L(60.0f);
            }
            if (ob6.a0) {
                L = (getMeasuredWidth() - L) - L2;
            }
            rectF.set(L, r6 - hl.L(4.0f), L + L2, hl.L(4.0f) + r6);
            canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint);
            if (this.w % 2 == 0) {
                L3 = hl.L(119.0f);
                L4 = hl.L(60.0f);
            } else {
                L3 = hl.L(131.0f);
                L4 = hl.L(80.0f);
            }
            if (ob6.a0) {
                L3 = (getMeasuredWidth() - L3) - L4;
            }
            rectF.set(L3, r6 - hl.L(4.0f), L3 + L4, hl.L(4.0f) + r6);
            canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint);
        }
        if (this.s) {
            canvas.drawLine(ob6.a0 ? 0.0f : hl.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(64.0f) : 0), getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f) + (this.s ? 1 : 0), TLObject.FLAG_30));
    }

    public void setPlaceholderAlpha(float f) {
        this.y = f;
        invalidate();
    }

    @Override // snb
    public final void updateColors() {
        c2b c2bVar = this.f;
        if (c2bVar != null) {
            try {
                ul ulVar = c2bVar.a;
                if (!(ulVar != null) || ulVar.G == null) {
                    return;
                }
                int i = aob.z9;
                ui8 ui8Var = this.F;
                qm qmVar = ui8.L1;
                ulVar.k(Integer.valueOf(aob.v0(i, ui8Var.J0)));
                ema emaVar = this.b;
                if (emaVar != null) {
                    emaVar.invalidate();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }
}
