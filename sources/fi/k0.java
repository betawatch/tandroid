package fi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class k0 extends CharacterStyle {
    public final float a = 0.75f;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (this.a * textPaint.getAlpha()));
    }
}
