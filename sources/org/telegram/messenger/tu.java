package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class tu extends ReplacementSpan {
    public final ru a;
    public final TL_iv.textButton b;
    public final RectF c = new RectF();
    public float d;
    public boolean e;
    public int f;
    public View h;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tu(vv vvVar, int i10, TL_iv.textButton textbutton, Boolean bool) {
        boolean z10;
        boolean z11;
        this.b = textbutton;
        TL_iv.RichText richText = textbutton.text;
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            if (!textconcat.texts.isEmpty()) {
                boolean z12 = textconcat.texts.get(0) instanceof TL_iv.textCustomEmoji;
                z11 = i0.a.g(1, textconcat.texts) instanceof TL_iv.textCustomEmoji;
                z10 = z12;
                TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
                boolean z13 = richButtonStyle == null && richButtonStyle.link;
                SpannableStringBuilder l4 = vvVar.l(textbutton.text, !z13 ? vv.R(512, 0) : vv.R(16, 13));
                TL_keyboard.InlineButtonType inlineButtonType = textbutton.type;
                ru ruVar = new ru(vvVar, i10, l4, null, inlineButtonType, textbutton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, z10, z11, z13, true, bool, new ms(this, 7));
                this.a = ruVar;
                ruVar.e = ruVar.h();
            }
        }
        z10 = false;
        z11 = false;
        TL_keyboard.RichButtonStyle richButtonStyle2 = textbutton.style;
        if (richButtonStyle2 == null) {
        }
        SpannableStringBuilder l42 = vvVar.l(textbutton.text, !z13 ? vv.R(512, 0) : vv.R(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType2 = textbutton.type;
        ru ruVar2 = new ru(vvVar, i10, l42, null, inlineButtonType2, textbutton.style, inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeDisabled, z10, z11, z13, true, bool, new ms(this, 7));
        this.a = ruVar2;
        ruVar2.e = ruVar2.h();
    }

    public final void a(View view) {
        this.h = view;
        this.a.a.i(view);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        float f10;
        ru ruVar = this.a;
        int i15 = ruVar.a.s;
        int i16 = (i15 <= 0 || this.f <= 0) ? 0 : 1;
        if (i16 == 0 && i15 > 0 && (charSequence instanceof Spanned)) {
            rv[] rvVarArr = (rv[]) ((Spanned) charSequence).getSpans(i10, i11, rv.class);
            int length = rvVarArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                if ((rvVarArr[i17].b & 15) == 14) {
                    i16 = 1;
                    break;
                }
                i17++;
            }
        }
        if (i16 != 0) {
            f10 = (i12 + i14) / 2.0f;
        } else {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            f10 = ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f) + i13;
        }
        canvas.save();
        int round = Math.round(f7 + (ruVar.s ? 0 : i0.L(1.0f)));
        int ceil = (int) Math.ceil((f10 - (ruVar.c() / 2.0f)) + (i16 ^ 1));
        float f11 = round;
        float f12 = ceil;
        this.c.set(f11, f12, round + ruVar.e, ruVar.c() + ceil);
        canvas.translate(f11, f12);
        ruVar.a(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10 = this.e && fontMetricsInt != null;
        int i12 = z10 ? fontMetricsInt.top : 0;
        int i13 = z10 ? fontMetricsInt.ascent : 0;
        int i14 = z10 ? fontMetricsInt.descent : 0;
        int i15 = z10 ? fontMetricsInt.bottom : 0;
        int i16 = z10 ? fontMetricsInt.leading : 0;
        int L = i0.L(8.0f);
        int L2 = i0.L(10.0f);
        ru ruVar = this.a;
        if (fontMetricsInt != null && ruVar.s) {
            float f7 = this.d;
            int i17 = (int) (((-L2) - L) * f7);
            fontMetricsInt.top = i17;
            int i18 = (int) ((L2 - L) * f7);
            fontMetricsInt.bottom = i18;
            fontMetricsInt.ascent = i17;
            fontMetricsInt.descent = i18;
            fontMetricsInt.leading = 0;
        }
        if (z10) {
            fontMetricsInt.top = i12;
            fontMetricsInt.ascent = i13;
            fontMetricsInt.descent = i14;
            fontMetricsInt.bottom = i15;
            fontMetricsInt.leading = i16;
            int i19 = this.f;
            int i20 = i14 - i13;
            if (i19 > i20) {
                int i21 = i19 - i20;
                int i22 = (i21 + 1) / 2;
                int i23 = i13 - i22;
                fontMetricsInt.ascent = i23;
                fontMetricsInt.descent = i14 + (i21 - i22);
                fontMetricsInt.top = Math.min(i12, i23);
                fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
            }
        }
        return ruVar.e + (ruVar.s ? 0 : i0.L(1.0f) * 2);
    }
}
