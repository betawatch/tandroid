package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewSwitcher;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class wy0 extends ViewSwitcher {
    public final void a(CharSequence charSequence, boolean z9, boolean z10) {
        if (z10 || !TextUtils.equals(charSequence, getCurrentView().getText())) {
            if (!z9) {
                getCurrentView().setText(charSequence);
            } else {
                getNextView().setText(charSequence);
                showNext();
            }
        }
    }

    @Override // android.widget.ViewSwitcher, android.widget.ViewAnimator, android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof TextView)) {
            throw new IllegalArgumentException();
        }
        super.addView(view, i7, layoutParams);
    }

    public void setText(CharSequence charSequence) {
        a(charSequence, true, false);
    }

    @Override // android.widget.ViewAnimator
    public TextView getCurrentView() {
        return (TextView) super.getCurrentView();
    }

    @Override // android.widget.ViewSwitcher
    public TextView getNextView() {
        return (TextView) super.getNextView();
    }
}
