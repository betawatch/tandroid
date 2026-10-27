package org.telegram.ui.Cells;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v4 extends FrameLayout {
    public TextView a;

    public void setCellHeight(int i10) {
        setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(54.0f), i10));
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
        textView.setTranslationX((1.0f - f7) * (-AndroidUtilities.dp(10.0f)));
    }

    public void setLetterTextSize(float f7) {
        this.a.setTextSize(1, f7);
    }
}
