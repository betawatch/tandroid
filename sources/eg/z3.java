package eg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class z3 extends j {
    public final x3 n0;
    public dg.e2 o0;
    public int p0;
    public int q0;
    public int r0;
    public dg.s0 s0;
    public int t0;
    public int u0;
    public Runnable v0;
    public boolean w0;
    public String x0;

    public z3(Context context, PointF pointF, int i10, CharSequence charSequence, dg.e2 e2Var, int i11) {
        super(context, pointF);
        this.s0 = dg.s0.e;
        this.q0 = i10;
        x3 x3Var = new x3(this, context);
        this.n0 = x3Var;
        NotificationCenter.listenEmojiLoading(x3Var);
        x3Var.setGravity(19);
        x3Var.setBackgroundColor(0);
        x3Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        x3Var.setClickable(false);
        x3Var.setEnabled(false);
        x3Var.setCursorColor(-1);
        x3Var.setTextSize(0, this.q0);
        x3Var.setCursorSize(AndroidUtilities.dp(this.q0 * 0.4f));
        x3Var.setText(charSequence);
        s();
        x3Var.setTextColor(e2Var.a);
        x3Var.setTypeface(null, 1);
        x3Var.setHorizontallyScrolling(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            x3Var.setImeOptions(285212672);
        } else {
            x3Var.setImeOptions(TLObject.FLAG_28);
        }
        x3Var.setFocusableInTouchMode(true);
        x3Var.setInputType(16384);
        x3Var.setSingleLine(false);
        addView(x3Var, c6.e(-2, -2, 51));
        if (i12 >= 29) {
            x3Var.setBreakStrategy(0);
        } else if (i12 >= 23) {
            x3Var.setBreakStrategy(0);
        }
        setSwatch(e2Var);
        setType(i11);
        k();
        x3Var.addTextChangedListener(new y3(this));
    }

    @Override // eg.j
    public final i a() {
        return new f1(this, getContext());
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

    @Override // eg.j
    public tk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new tk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float c3 = org.telegram.ui.b.c(dp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        x3 x3Var = this.n0;
        return new tk0(c3, (positionY - (((dp2 - x3Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((dp * scaleX) + c3) - c3, (dp2 - x3Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override // eg.j
    public float getStickyPaddingBottom() {
        RectF rectF = this.n0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override // eg.j
    public float getStickyPaddingLeft() {
        RectF rectF = this.n0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override // eg.j
    public float getStickyPaddingRight() {
        RectF rectF = this.n0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override // eg.j
    public float getStickyPaddingTop() {
        RectF rectF = this.n0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public dg.e2 getSwatch() {
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

    public dg.s0 getTypeface() {
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
        x3 x3Var = this.n0;
        x3Var.setEnabled(true);
        x3Var.setClickable(true);
        x3Var.requestFocus();
        x3Var.setSelection(x3Var.getText().length());
        AndroidUtilities.runOnUIThread(new ag.e(this, 27), 300L);
    }

    public final void r() {
        x3 x3Var = this.n0;
        x3Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i10 = this.o0.a;
        int i11 = this.p0;
        if (i11 == 0) {
            x3Var.setFrameColor(i10);
            i10 = AndroidUtilities.computePerceivedBrightness(this.o0.a) >= 0.721f ? -16777216 : -1;
        } else if (i11 == 1) {
            x3Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i10) >= 0.25f ? -1728053248 : -1711276033);
        } else if (i11 == 2) {
            x3Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i10) >= 0.25f ? -16777216 : -1);
        } else {
            x3Var.setFrameColor(0);
        }
        x3Var.setTextColor(i10);
        x3Var.setCursorColor(i10);
        x3Var.setHandlesColor(i10);
        x3Var.setHighlightColor(k6.l1(0.4f, i10));
    }

    public final void s() {
        x3 x3Var = this.n0;
        if (x3Var.getText().length() > 0) {
            x3Var.setHint((CharSequence) null);
        } else {
            x3Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            x3Var.setHintTextColor(1627389951);
        }
    }

    public void setAlign(int i10) {
        this.r0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.q0 = i10;
        float f10 = i10;
        x3 x3Var = this.n0;
        x3Var.setTextSize(0, f10);
        x3Var.setCursorSize(AndroidUtilities.dp(f10 * 0.4f));
        if (x3Var.getText() != null) {
            Editable text = x3Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i11 = 0; i11 < emojiSpanArr.length; i11++) {
                emojiSpanArr[i11].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i11].scale = 0.85f;
            }
            for (u5 u5Var : (u5[]) text.getSpans(0, text.length(), u5.class)) {
                u5Var.replaceFontMetrics(getFontMetricsInt());
            }
            x3Var.invalidateForce();
        }
    }

    public void setMaxWidth(int i10) {
        this.n0.setMaxWidth(i10);
    }

    public void setSwatch(dg.e2 e2Var) {
        this.o0 = new dg.e2(e2Var.b, e2Var.c, e2Var.a);
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

    public void setTypeface(dg.s0 s0Var) {
        this.s0 = s0Var;
        if (s0Var != null) {
            this.n0.setTypeface(s0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = dg.s0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dg.s0 s0Var = (dg.s0) it.next();
            if (s0Var.a.equals(str)) {
                setTypeface(s0Var);
                str = null;
                break;
            }
        }
        this.x0 = str;
        m();
    }

    public z3(Context context, z3 z3Var, PointF pointF) {
        this(context, pointF, z3Var.q0, z3Var.getText(), z3Var.getSwatch(), z3Var.p0);
        setRotation(z3Var.getRotation());
        setScale(z3Var.getScale());
        setTypeface(z3Var.getTypeface());
        setAlign(z3Var.getAlign());
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
