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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class iu extends ReplacementSpan {
    public final gu a;
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
    public iu(kv kvVar, int i7, TL_iv.textButton textbutton, Boolean bool) {
        boolean z9;
        boolean z10;
        this.b = textbutton;
        TL_iv.RichText richText = textbutton.text;
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            if (!textconcat.texts.isEmpty()) {
                boolean z11 = textconcat.texts.get(0) instanceof TL_iv.textCustomEmoji;
                z10 = jg.g.i(1, textconcat.texts) instanceof TL_iv.textCustomEmoji;
                z9 = z11;
                TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
                boolean z12 = richButtonStyle == null && richButtonStyle.link;
                SpannableStringBuilder l10 = kvVar.l(textbutton.text, !z12 ? kv.R(512, 0) : kv.R(16, 13));
                TL_keyboard.InlineButtonType inlineButtonType = textbutton.type;
                gu guVar = new gu(kvVar, i7, l10, null, inlineButtonType, textbutton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, z9, z10, z12, true, bool, new ds(this, 6));
                this.a = guVar;
                guVar.e = guVar.h();
            }
        }
        z9 = false;
        z10 = false;
        TL_keyboard.RichButtonStyle richButtonStyle2 = textbutton.style;
        if (richButtonStyle2 == null) {
        }
        SpannableStringBuilder l102 = kvVar.l(textbutton.text, !z12 ? kv.R(512, 0) : kv.R(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType2 = textbutton.type;
        gu guVar2 = new gu(kvVar, i7, l102, null, inlineButtonType2, textbutton.style, inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeDisabled, z9, z10, z12, true, bool, new ds(this, 6));
        this.a = guVar2;
        guVar2.e = guVar2.h();
    }

    public final void a(View view) {
        this.h = view;
        this.a.a.i(view);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float f11;
        gu guVar = this.a;
        int i14 = guVar.a.s;
        int i15 = (i14 <= 0 || this.f <= 0) ? 0 : 1;
        if (i15 == 0 && i14 > 0 && (charSequence instanceof Spanned)) {
            gv[] gvVarArr = (gv[]) ((Spanned) charSequence).getSpans(i7, i10, gv.class);
            int length = gvVarArr.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    break;
                }
                if ((gvVarArr[i16].b & 15) == 14) {
                    i15 = 1;
                    break;
                }
                i16++;
            }
        }
        if (i15 != 0) {
            f11 = (i11 + i13) / 2.0f;
        } else {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            f11 = ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f) + i12;
        }
        canvas.save();
        int round = Math.round(f10 + (guVar.s ? 0 : g0.L(1.0f)));
        int ceil = (int) Math.ceil((f11 - (guVar.c() / 2.0f)) + (i15 ^ 1));
        float f12 = round;
        float f13 = ceil;
        this.c.set(f12, f13, round + guVar.e, guVar.c() + ceil);
        canvas.translate(f12, f13);
        guVar.a(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        boolean z9 = this.e && fontMetricsInt != null;
        int i11 = z9 ? fontMetricsInt.top : 0;
        int i12 = z9 ? fontMetricsInt.ascent : 0;
        int i13 = z9 ? fontMetricsInt.descent : 0;
        int i14 = z9 ? fontMetricsInt.bottom : 0;
        int i15 = z9 ? fontMetricsInt.leading : 0;
        int L = g0.L(8.0f);
        int L2 = g0.L(10.0f);
        gu guVar = this.a;
        if (fontMetricsInt != null && guVar.s) {
            float f10 = this.d;
            int i16 = (int) (((-L2) - L) * f10);
            fontMetricsInt.top = i16;
            int i17 = (int) ((L2 - L) * f10);
            fontMetricsInt.bottom = i17;
            fontMetricsInt.ascent = i16;
            fontMetricsInt.descent = i17;
            fontMetricsInt.leading = 0;
        }
        if (z9) {
            fontMetricsInt.top = i11;
            fontMetricsInt.ascent = i12;
            fontMetricsInt.descent = i13;
            fontMetricsInt.bottom = i14;
            fontMetricsInt.leading = i15;
            int i18 = this.f;
            int i19 = i13 - i12;
            if (i18 > i19) {
                int i20 = i18 - i19;
                int i21 = (i20 + 1) / 2;
                int i22 = i12 - i21;
                fontMetricsInt.ascent = i22;
                fontMetricsInt.descent = i13 + (i20 - i21);
                fontMetricsInt.top = Math.min(i11, i22);
                fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
            }
        }
        return guVar.e + (guVar.s ? 0 : g0.L(1.0f) * 2);
    }
}
