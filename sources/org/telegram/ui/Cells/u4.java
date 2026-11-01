package org.telegram.ui.Cells;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class u4 extends FrameLayout {
    public TextView a;

    public void setCellHeight(int i10) {
        setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.i0.L(54.0f), i10));
    }

    public void setLetter(String str) {
        this.a.setText(str.toUpperCase());
    }

    public void setLetterProgress(float f7) {
        TextView textView = this.a;
        textView.setAlpha(f7);
        float f10 = (0.4f * f7) + 0.6f;
        textView.setScaleX(f10);
        textView.setScaleY(f10);
        textView.setTranslationX((1.0f - f7) * (-org.telegram.messenger.i0.L(10.0f)));
    }

    public void setLetterTextSize(float f7) {
        this.a.setTextSize(1, f7);
    }
}
