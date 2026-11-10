package org.telegram.ui.Cells;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class s4 extends FrameLayout {
    public TextView a;

    public void setCellHeight(int i7) {
        setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(54.0f), i7));
    }

    public void setLetter(String str) {
        this.a.setText(str.toUpperCase());
    }

    public void setLetterProgress(float f10) {
        TextView textView = this.a;
        textView.setAlpha(f10);
        float f11 = (0.4f * f10) + 0.6f;
        textView.setScaleX(f11);
        textView.setScaleY(f11);
        textView.setTranslationX((1.0f - f10) * (-org.telegram.messenger.g0.L(10.0f)));
    }

    public void setLetterTextSize(float f10) {
        this.a.setTextSize(1, f10);
    }
}
