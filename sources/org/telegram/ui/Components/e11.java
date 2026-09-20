package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewSwitcher;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public class e11 extends ViewSwitcher {
    public final void a(CharSequence charSequence, boolean z10, boolean z11) {
        if (z11 || !TextUtils.equals(charSequence, getCurrentView().getText())) {
            if (!z10) {
                getCurrentView().setText(charSequence);
            } else {
                getNextView().setText(charSequence);
                showNext();
            }
        }
    }

    @Override // android.widget.ViewSwitcher, android.widget.ViewAnimator, android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof TextView)) {
            throw new IllegalArgumentException();
        }
        super.addView(view, i10, layoutParams);
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
