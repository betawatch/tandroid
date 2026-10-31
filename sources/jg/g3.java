package jg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import org.telegram.messenger.cd;
import org.telegram.messenger.h6;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.oj0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g3 extends j {
    public String A0;
    public final e3 q0;
    public ig.q1 r0;
    public int s0;
    public int t0;
    public int u0;
    public ig.h0 v0;
    public int w0;
    public int x0;
    public Runnable y0;
    public boolean z0;

    public g3(Context context, PointF pointF, int i10, CharSequence charSequence, ig.q1 q1Var, int i11) {
        super(context, pointF);
        this.v0 = ig.h0.e;
        this.t0 = i10;
        e3 e3Var = new e3(this, context);
        this.q0 = e3Var;
        zs.i(e3Var);
        e3Var.setGravity(19);
        e3Var.setBackgroundColor(0);
        e3Var.setPadding(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f));
        e3Var.setClickable(false);
        e3Var.setEnabled(false);
        e3Var.setCursorColor(-1);
        e3Var.setTextSize(0, this.t0);
        e3Var.setCursorSize(org.telegram.messenger.i0.L(this.t0 * 0.4f));
        e3Var.setText(charSequence);
        s();
        e3Var.setTextColor(q1Var.a);
        e3Var.setTypeface(null, 1);
        e3Var.setHorizontallyScrolling(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            e3Var.setImeOptions(285212672);
        } else {
            e3Var.setImeOptions(TLObject.FLAG_28);
        }
        e3Var.setFocusableInTouchMode(true);
        e3Var.setInputType(TLObject.FLAG_14);
        e3Var.setSingleLine(false);
        addView(e3Var, b6.e(-2, -2, 51));
        if (i12 >= 29) {
            e3Var.setBreakStrategy(0);
        } else {
            e3Var.setBreakStrategy(0);
        }
        setSwatch(q1Var);
        setType(i11);
        k();
        e3Var.addTextChangedListener(new f3(0, this));
    }

    @Override // jg.j
    public final i a() {
        return new u0(this, getContext());
    }

    public int getAlign() {
        return this.u0;
    }

    public int getBaseFontSize() {
        return this.t0;
    }

    public b getEditText() {
        return this.q0;
    }

    public View getFocusedView() {
        return this.q0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.q0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.q0.getTextSize();
    }

    @Override // jg.j
    public oj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new oj0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.i0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.i0.L(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float x10 = z20.x(L, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        e3 e3Var = this.q0;
        return new oj0(x10, (positionY - (((L2 - e3Var.getExtendedPaddingTop()) - org.telegram.messenger.i0.N(4.0f)) / 2.0f)) * scaleX, ((L * scaleX) + x10) - x10, (L2 - e3Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override // jg.j
    public float getStickyPaddingBottom() {
        RectF rectF = this.q0.Q1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override // jg.j
    public float getStickyPaddingLeft() {
        RectF rectF = this.q0.Q1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override // jg.j
    public float getStickyPaddingRight() {
        RectF rectF = this.q0.Q1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override // jg.j
    public float getStickyPaddingTop() {
        RectF rectF = this.q0.Q1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public ig.q1 getSwatch() {
        return this.r0;
    }

    public CharSequence getText() {
        return this.q0.getText();
    }

    public int getTextSize() {
        return (int) this.q0.getTextSize();
    }

    public int getType() {
        return this.s0;
    }

    public ig.h0 getTypeface() {
        return this.v0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public final void q() {
        e3 e3Var = this.q0;
        e3Var.setEnabled(true);
        e3Var.setClickable(true);
        e3Var.requestFocus();
        e3Var.setSelection(e3Var.getText().length());
        org.telegram.messenger.i0.h3(new gg.c(this, 17), 300L);
    }

    public final void r() {
        e3 e3Var = this.q0;
        e3Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i10 = this.r0.a;
        int i11 = this.s0;
        if (i11 == 0) {
            e3Var.setFrameColor(i10);
            i10 = org.telegram.messenger.i0.B(this.r0.a) >= 0.721f ? -16777216 : -1;
        } else if (i11 == 1) {
            e3Var.setFrameColor(org.telegram.messenger.i0.B(i10) >= 0.25f ? -1728053248 : -1711276033);
        } else if (i11 == 2) {
            e3Var.setFrameColor(org.telegram.messenger.i0.B(i10) >= 0.25f ? -16777216 : -1);
        } else {
            e3Var.setFrameColor(0);
        }
        e3Var.setTextColor(i10);
        e3Var.setCursorColor(i10);
        e3Var.setHandlesColor(i10);
        e3Var.setHighlightColor(t6.r1(0.4f, i10));
    }

    public final void s() {
        e3 e3Var = this.q0;
        if (e3Var.getText().length() > 0) {
            e3Var.setHint((CharSequence) null);
        } else {
            e3Var.setHint(cd.L0(2131744218, null));
            e3Var.setHintTextColor(1627389951);
        }
    }

    public void setAlign(int i10) {
        this.u0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.t0 = i10;
        float f7 = i10;
        e3 e3Var = this.q0;
        e3Var.setTextSize(0, f7);
        e3Var.setCursorSize(org.telegram.messenger.i0.L(f7 * 0.4f));
        if (e3Var.getText() != null) {
            Editable text = e3Var.getText();
            h6[] h6VarArr = (h6[]) text.getSpans(0, text.length(), h6.class);
            for (int i11 = 0; i11 < h6VarArr.length; i11++) {
                h6 h6Var = h6VarArr[i11];
                Paint.FontMetricsInt fontMetricsInt = getFontMetricsInt();
                h6Var.a = fontMetricsInt;
                if (fontMetricsInt != null) {
                    int abs = Math.abs(h6Var.a.ascent) + Math.abs(fontMetricsInt.descent);
                    h6Var.c = abs;
                    if (abs == 0) {
                        h6Var.c = org.telegram.messenger.i0.L(20.0f);
                    }
                }
                h6VarArr[i11].b = 0.85f;
            }
            for (o5 o5Var : (o5[]) text.getSpans(0, text.length(), o5.class)) {
                o5Var.replaceFontMetrics(getFontMetricsInt());
            }
            e3Var.q();
        }
    }

    public void setMaxWidth(int i10) {
        this.q0.setMaxWidth(i10);
    }

    public void setSwatch(ig.q1 q1Var) {
        this.r0 = new ig.q1(q1Var.b, q1Var.c, q1Var.a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.q0.setText(charSequence);
        s();
    }

    public void setType(int i10) {
        this.s0 = i10;
        r();
    }

    public void setTypeface(ig.h0 h0Var) {
        this.v0 = h0Var;
        if (h0Var != null) {
            this.q0.setTypeface(h0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = ig.h0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ig.h0 h0Var = (ig.h0) it.next();
            if (h0Var.a.equals(str)) {
                setTypeface(h0Var);
                str = null;
                break;
            }
        }
        this.A0 = str;
        m();
    }

    public g3(Context context, g3 g3Var, PointF pointF) {
        this(context, pointF, g3Var.t0, g3Var.getText(), g3Var.getSwatch(), g3Var.s0);
        setRotation(g3Var.getRotation());
        setScale(g3Var.getScale());
        setTypeface(g3Var.getTypeface());
        setAlign(g3Var.getAlign());
        int align = getAlign();
        int i10 = 2;
        this.q0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i10 = 4;
        } else if (align2 == 2 ? !cd.X : cd.X) {
            i10 = 3;
        }
        this.q0.setTextAlignment(i10);
    }
}
