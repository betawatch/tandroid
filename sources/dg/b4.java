package dg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.u5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class b4 extends j {
    public final z3 n0;
    public cg.f2 o0;
    public int p0;
    public int q0;
    public int r0;
    public cg.t0 s0;
    public int t0;
    public int u0;
    public Runnable v0;
    public boolean w0;
    public String x0;

    public b4(Context context, PointF pointF, int i10, CharSequence charSequence, cg.f2 f2Var, int i11) {
        super(context, pointF);
        this.s0 = cg.t0.e;
        this.q0 = i10;
        z3 z3Var = new z3(this, context);
        this.n0 = z3Var;
        NotificationCenter.listenEmojiLoading(z3Var);
        z3Var.setGravity(19);
        z3Var.setBackgroundColor(0);
        z3Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        z3Var.setClickable(false);
        z3Var.setEnabled(false);
        z3Var.setCursorColor(-1);
        z3Var.setTextSize(0, this.q0);
        z3Var.setCursorSize(AndroidUtilities.dp(this.q0 * 0.4f));
        z3Var.setText(charSequence);
        s();
        z3Var.setTextColor(f2Var.a);
        z3Var.setTypeface(null, 1);
        z3Var.setHorizontallyScrolling(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            z3Var.setImeOptions(285212672);
        } else {
            z3Var.setImeOptions(TLObject.FLAG_28);
        }
        z3Var.setFocusableInTouchMode(true);
        z3Var.setInputType(16384);
        z3Var.setSingleLine(false);
        addView(z3Var, b6.e(-2, -2, 51));
        if (i12 >= 29) {
            z3Var.setBreakStrategy(0);
        } else if (i12 >= 23) {
            z3Var.setBreakStrategy(0);
        }
        setSwatch(f2Var);
        setType(i11);
        k();
        z3Var.addTextChangedListener(new a4(this));
    }

    @Override // dg.j
    public final i a() {
        return new h1(this, getContext());
    }

    public int getAlign() {
        return this.r0;
    }

    public int getBaseFontSize() {
        return this.q0;
    }

    public b getEditText() {
        return this.n0;
    }

    public View getFocusedView() {
        return this.n0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.n0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.n0.getTextSize();
    }

    @Override // dg.j
    public sk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new sk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float c3 = org.telegram.ui.b.c(dp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        z3 z3Var = this.n0;
        return new sk0(c3, (positionY - (((dp2 - z3Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((dp * scaleX) + c3) - c3, (dp2 - z3Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override // dg.j
    public float getStickyPaddingBottom() {
        RectF rectF = this.n0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override // dg.j
    public float getStickyPaddingLeft() {
        RectF rectF = this.n0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override // dg.j
    public float getStickyPaddingRight() {
        RectF rectF = this.n0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override // dg.j
    public float getStickyPaddingTop() {
        RectF rectF = this.n0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public cg.f2 getSwatch() {
        return this.o0;
    }

    public CharSequence getText() {
        return this.n0.getText();
    }

    public int getTextSize() {
        return (int) this.n0.getTextSize();
    }

    public int getType() {
        return this.p0;
    }

    public cg.t0 getTypeface() {
        return this.s0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public final void q() {
        z3 z3Var = this.n0;
        z3Var.setEnabled(true);
        z3Var.setClickable(true);
        z3Var.requestFocus();
        z3Var.setSelection(z3Var.getText().length());
        AndroidUtilities.runOnUIThread(new ag.d(this, 24), 300L);
    }

    public final void r() {
        z3 z3Var = this.n0;
        z3Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i10 = this.o0.a;
        int i11 = this.p0;
        if (i11 == 0) {
            z3Var.setFrameColor(i10);
            i10 = AndroidUtilities.computePerceivedBrightness(this.o0.a) >= 0.721f ? -16777216 : -1;
        } else if (i11 == 1) {
            z3Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i10) >= 0.25f ? -1728053248 : -1711276033);
        } else if (i11 == 2) {
            z3Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i10) >= 0.25f ? -16777216 : -1);
        } else {
            z3Var.setFrameColor(0);
        }
        z3Var.setTextColor(i10);
        z3Var.setCursorColor(i10);
        z3Var.setHandlesColor(i10);
        z3Var.setHighlightColor(j6.l1(0.4f, i10));
    }

    public final void s() {
        z3 z3Var = this.n0;
        if (z3Var.getText().length() > 0) {
            z3Var.setHint((CharSequence) null);
        } else {
            z3Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            z3Var.setHintTextColor(1627389951);
        }
    }

    public void setAlign(int i10) {
        this.r0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.q0 = i10;
        float f10 = i10;
        z3 z3Var = this.n0;
        z3Var.setTextSize(0, f10);
        z3Var.setCursorSize(AndroidUtilities.dp(f10 * 0.4f));
        if (z3Var.getText() != null) {
            Editable text = z3Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i11 = 0; i11 < emojiSpanArr.length; i11++) {
                emojiSpanArr[i11].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i11].scale = 0.85f;
            }
            for (u5 u5Var : (u5[]) text.getSpans(0, text.length(), u5.class)) {
                u5Var.replaceFontMetrics(getFontMetricsInt());
            }
            z3Var.invalidateForce();
        }
    }

    public void setMaxWidth(int i10) {
        this.n0.setMaxWidth(i10);
    }

    public void setSwatch(cg.f2 f2Var) {
        this.o0 = new cg.f2(f2Var.b, f2Var.c, f2Var.a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.n0.setText(charSequence);
        s();
    }

    public void setType(int i10) {
        this.p0 = i10;
        r();
    }

    public void setTypeface(cg.t0 t0Var) {
        this.s0 = t0Var;
        if (t0Var != null) {
            this.n0.setTypeface(t0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = cg.t0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            cg.t0 t0Var = (cg.t0) it.next();
            if (t0Var.a.equals(str)) {
                setTypeface(t0Var);
                str = null;
                break;
            }
        }
        this.x0 = str;
        m();
    }

    public b4(Context context, b4 b4Var, PointF pointF) {
        this(context, pointF, b4Var.q0, b4Var.getText(), b4Var.getSwatch(), b4Var.p0);
        setRotation(b4Var.getRotation());
        setScale(b4Var.getScale());
        setTypeface(b4Var.getTypeface());
        setAlign(b4Var.getAlign());
        int align = getAlign();
        int i10 = 2;
        this.n0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i10 = 4;
        } else if (align2 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i10 = 3;
        }
        this.n0.setTextAlignment(i10);
    }
}
