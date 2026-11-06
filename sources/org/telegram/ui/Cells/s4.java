package org.telegram.ui.Cells;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
