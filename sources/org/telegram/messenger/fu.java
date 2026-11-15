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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class fu extends ReplacementSpan {
    public final du a;
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
    public fu(iv ivVar, int i7, TL_iv.textButton textbutton, Boolean bool) {
        boolean z10;
        boolean z11;
        this.b = textbutton;
        TL_iv.RichText richText = textbutton.text;
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            if (!textconcat.texts.isEmpty()) {
                boolean z12 = textconcat.texts.get(0) instanceof TL_iv.textCustomEmoji;
                z11 = i5.c.h(1, textconcat.texts) instanceof TL_iv.textCustomEmoji;
                z10 = z12;
                TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
                boolean z13 = richButtonStyle == null && richButtonStyle.link;
                SpannableStringBuilder l10 = ivVar.l(textbutton.text, !z13 ? iv.R(512, 0) : iv.R(16, 13));
                TL_keyboard.InlineButtonType inlineButtonType = textbutton.type;
                du duVar = new du(ivVar, i7, l10, null, inlineButtonType, textbutton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, z10, z11, z13, true, bool, new as(this, 6));
                this.a = duVar;
                duVar.e = duVar.h();
            }
        }
        z10 = false;
        z11 = false;
        TL_keyboard.RichButtonStyle richButtonStyle2 = textbutton.style;
        if (richButtonStyle2 == null) {
        }
        SpannableStringBuilder l102 = ivVar.l(textbutton.text, !z13 ? iv.R(512, 0) : iv.R(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType2 = textbutton.type;
        du duVar2 = new du(ivVar, i7, l102, null, inlineButtonType2, textbutton.style, inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeDisabled, z10, z11, z13, true, bool, new as(this, 6));
        this.a = duVar2;
        duVar2.e = duVar2.h();
    }

    public final void a(View view) {
        this.h = view;
        this.a.a.i(view);
    }

    public final void b(View view) {
        this.h = null;
        this.a.a.f(view);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float f11;
        du duVar = this.a;
        int i14 = duVar.a.s;
        int i15 = (i14 <= 0 || this.f <= 0) ? 0 : 1;
        if (i15 == 0 && i14 > 0 && (charSequence instanceof Spanned)) {
            ev[] evVarArr = (ev[]) ((Spanned) charSequence).getSpans(i7, i10, ev.class);
            int length = evVarArr.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    break;
                }
                if ((evVarArr[i16].b & 15) == 14) {
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
        int round = Math.round(f10 + (duVar.s ? 0 : g0.L(1.0f)));
        int ceil = (int) Math.ceil((f11 - (duVar.c() / 2.0f)) + (i15 ^ 1));
        float f12 = round;
        float f13 = ceil;
        this.c.set(f12, f13, round + duVar.e, duVar.c() + ceil);
        canvas.translate(f12, f13);
        duVar.a(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10 = this.e && fontMetricsInt != null;
        int i11 = z10 ? fontMetricsInt.top : 0;
        int i12 = z10 ? fontMetricsInt.ascent : 0;
        int i13 = z10 ? fontMetricsInt.descent : 0;
        int i14 = z10 ? fontMetricsInt.bottom : 0;
        int i15 = z10 ? fontMetricsInt.leading : 0;
        int L = g0.L(8.0f);
        int L2 = g0.L(10.0f);
        du duVar = this.a;
        if (fontMetricsInt != null && duVar.s) {
            float f10 = this.d;
            int i16 = (int) (((-L2) - L) * f10);
            fontMetricsInt.top = i16;
            int i17 = (int) ((L2 - L) * f10);
            fontMetricsInt.bottom = i17;
            fontMetricsInt.ascent = i16;
            fontMetricsInt.descent = i17;
            fontMetricsInt.leading = 0;
        }
        if (z10) {
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
        return duVar.e + (duVar.s ? 0 : g0.L(1.0f) * 2);
    }
}
