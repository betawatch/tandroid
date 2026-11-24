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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class PollVotesAlert$UserCell extends LinearLayout implements tjb {
    public ArrayList E;
    public final /* synthetic */ gf8 F;
    public final be0 a;
    public final jia b;
    public final TextView c;
    public final TextView d;
    public final pb0 e;
    public final aya f;
    public TLRPC.User h;
    public TLRPC.Chat n;
    public CharSequence r;
    public boolean s;
    public int w;
    public boolean x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollVotesAlert$UserCell(gf8 gf8Var, Context context) {
        super(context);
        this.F = gf8Var;
        this.y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        this.e = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(18.0f));
        addView(be0Var, nme.t(34, 34, 16, 0, 0, 11, 0));
        jia jiaVar = new jia(context);
        this.b = jiaVar;
        int i = bkb.i5;
        zkb.W(jiaVar, i, null);
        jiaVar.setTypeface(gl.o());
        jiaVar.setTextSize(16);
        jiaVar.setGravity((k96.a0 ? 5 : 3) | 16);
        addView(jiaVar, nme.q(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        zkb.X(textView, bkb.q5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, nme.q(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        zkb.X(textView2, i, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, nme.q(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f = new aya(20, jiaVar);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.y9));
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
        gf8 gf8Var = this.F;
        RectF rectF = gf8Var.G1;
        Paint paint = gf8Var.A1;
        if (this.x || this.y != 0.0f) {
            paint.setAlpha((int) (this.y * 255.0f));
            be0 be0Var = this.a;
            canvas.drawCircle((be0Var.getMeasuredWidth() / 2) + be0Var.getLeft(), (be0Var.getMeasuredHeight() / 2) + be0Var.getTop(), be0Var.getMeasuredWidth() / 2, paint);
            if (this.w % 2 == 0) {
                L = gl.L(65.0f);
                L2 = gl.L(48.0f);
            } else {
                L = gl.L(65.0f);
                L2 = gl.L(60.0f);
            }
            if (k96.a0) {
                L = (getMeasuredWidth() - L) - L2;
            }
            rectF.set(L, r6 - gl.L(4.0f), L + L2, gl.L(4.0f) + r6);
            canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint);
            if (this.w % 2 == 0) {
                L3 = gl.L(119.0f);
                L4 = gl.L(60.0f);
            } else {
                L3 = gl.L(131.0f);
                L4 = gl.L(80.0f);
            }
            if (k96.a0) {
                L3 = (getMeasuredWidth() - L3) - L4;
            }
            rectF.set(L3, r6 - gl.L(4.0f), L3 + L4, gl.L(4.0f) + r6);
            canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint);
        }
        if (this.s) {
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(64.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f) + (this.s ? 1 : 0), TLObject.FLAG_30));
    }

    public void setPlaceholderAlpha(float f) {
        this.y = f;
        invalidate();
    }

    @Override // tjb
    public final void updateColors() {
        aya ayaVar = this.f;
        if (ayaVar != null) {
            try {
                tl tlVar = ayaVar.a;
                if (!(tlVar != null) || tlVar.G == null) {
                    return;
                }
                int i = bkb.y9;
                gf8 gf8Var = this.F;
                pm pmVar = gf8.L1;
                tlVar.k(Integer.valueOf(bkb.v0(i, gf8Var.J0)));
                jia jiaVar = this.b;
                if (jiaVar != null) {
                    jiaVar.invalidate();
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }
}
