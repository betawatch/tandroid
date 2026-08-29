package bg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import i7.f6;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f4 extends k {
    public final d4 m0;
    public ag.k2 n0;
    public int o0;
    public int p0;
    public int q0;
    public ag.u0 r0;
    public int s0;
    public int t0;
    public Runnable u0;
    public boolean v0;
    public String w0;

    public f4(Context context, PointF pointF, int i10, CharSequence charSequence, ag.k2 k2Var, int i11) {
        super(context, pointF);
        this.r0 = ag.u0.e;
        this.p0 = i10;
        d4 d4Var = new d4(this, context);
        this.m0 = d4Var;
        NotificationCenter.listenEmojiLoading(d4Var);
        d4Var.setGravity(19);
        d4Var.setBackgroundColor(0);
        d4Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        d4Var.setClickable(false);
        d4Var.setEnabled(false);
        d4Var.setCursorColor(-1);
        d4Var.setTextSize(0, this.p0);
        d4Var.setCursorSize(AndroidUtilities.dp(this.p0 * 0.4f));
        d4Var.setText(charSequence);
        s();
        d4Var.setTextColor(k2Var.a);
        d4Var.setTypeface(null, 1);
        d4Var.setHorizontallyScrolling(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            d4Var.setImeOptions(285212672);
        } else {
            d4Var.setImeOptions(TLObject.FLAG_28);
        }
        d4Var.setFocusableInTouchMode(true);
        d4Var.setInputType(16384);
        d4Var.setSingleLine(false);
        addView(d4Var, f6.e(-2, -2, 51));
        if (i12 >= 29) {
            d4Var.setBreakStrategy(0);
        } else if (i12 >= 23) {
            d4Var.setBreakStrategy(0);
        }
        setSwatch(k2Var);
        setType(i11);
        k();
        d4Var.addTextChangedListener(new e4(this));
    }

    @Override // bg.k
    public final j a() {
        return new j1(this, getContext());
    }

    public int getAlign() {
        return this.q0;
    }

    public int getBaseFontSize() {
        return this.p0;
    }

    public b getEditText() {
        return this.m0;
    }

    public View getFocusedView() {
        return this.m0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.m0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.m0.getTextSize();
    }

    @Override // bg.k
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new hk0();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float c3 = org.telegram.ui.b.c(dp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        d4 d4Var = this.m0;
        return new hk0(c3, (positionY - (((dp2 - d4Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((dp * scaleX) + c3) - c3, (dp2 - d4Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override // bg.k
    public float getStickyPaddingBottom() {
        RectF rectF = this.m0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override // bg.k
    public float getStickyPaddingLeft() {
        RectF rectF = this.m0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override // bg.k
    public float getStickyPaddingRight() {
        RectF rectF = this.m0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override // bg.k
    public float getStickyPaddingTop() {
        RectF rectF = this.m0.w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public ag.k2 getSwatch() {
        return this.n0;
    }

    public CharSequence getText() {
        return this.m0.getText();
    }

    public int getTextSize() {
        return (int) this.m0.getTextSize();
    }

    public int getType() {
        return this.o0;
    }

    public ag.u0 getTypeface() {
        return this.r0;
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
        d4 d4Var = this.m0;
        d4Var.setEnabled(true);
        d4Var.setClickable(true);
        d4Var.requestFocus();
        d4Var.setSelection(d4Var.getText().length());
        AndroidUtilities.runOnUIThread(new a4.g(this, 16), 300L);
    }

    public final void r() {
        d4 d4Var = this.m0;
        d4Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i10 = this.n0.a;
        int i11 = this.o0;
        if (i11 == 0) {
            d4Var.setFrameColor(i10);
            i10 = AndroidUtilities.computePerceivedBrightness(this.n0.a) >= 0.721f ? -16777216 : -1;
        } else if (i11 == 1) {
            d4Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i10) >= 0.25f ? -1728053248 : -1711276033);
        } else if (i11 == 2) {
            d4Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i10) >= 0.25f ? -16777216 : -1);
        } else {
            d4Var.setFrameColor(0);
        }
        d4Var.setTextColor(i10);
        d4Var.setCursorColor(i10);
        d4Var.setHandlesColor(i10);
        d4Var.setHighlightColor(g6.l1(0.4f, i10));
    }

    public final void s() {
        d4 d4Var = this.m0;
        if (d4Var.getText().length() > 0) {
            d4Var.setHint((CharSequence) null);
        } else {
            d4Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            d4Var.setHintTextColor(1627389951);
        }
    }

    public void setAlign(int i10) {
        this.q0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.p0 = i10;
        float f9 = i10;
        d4 d4Var = this.m0;
        d4Var.setTextSize(0, f9);
        d4Var.setCursorSize(AndroidUtilities.dp(f9 * 0.4f));
        if (d4Var.getText() != null) {
            Editable text = d4Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i11 = 0; i11 < emojiSpanArr.length; i11++) {
                emojiSpanArr[i11].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i11].scale = 0.85f;
            }
            for (y5 y5Var : (y5[]) text.getSpans(0, text.length(), y5.class)) {
                y5Var.replaceFontMetrics(getFontMetricsInt());
            }
            d4Var.invalidateForce();
        }
    }

    public void setMaxWidth(int i10) {
        this.m0.setMaxWidth(i10);
    }

    public void setSwatch(ag.k2 k2Var) {
        this.n0 = new ag.k2(k2Var.b, k2Var.c, k2Var.a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.m0.setText(charSequence);
        s();
    }

    public void setType(int i10) {
        this.o0 = i10;
        r();
    }

    public void setTypeface(ag.u0 u0Var) {
        this.r0 = u0Var;
        if (u0Var != null) {
            this.m0.setTypeface(u0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = ag.u0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ag.u0 u0Var = (ag.u0) it.next();
            if (u0Var.a.equals(str)) {
                setTypeface(u0Var);
                str = null;
                break;
            }
        }
        this.w0 = str;
        m();
    }

    public f4(Context context, f4 f4Var, PointF pointF) {
        this(context, pointF, f4Var.p0, f4Var.getText(), f4Var.getSwatch(), f4Var.o0);
        setRotation(f4Var.getRotation());
        setScale(f4Var.getScale());
        setTypeface(f4Var.getTypeface());
        setAlign(f4Var.getAlign());
        int align = getAlign();
        int i10 = 2;
        this.m0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i10 = 4;
        } else if (align2 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i10 = 3;
        }
        this.m0.setTextAlignment(i10);
    }
}
