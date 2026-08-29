package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewSwitcher;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class j01 extends ViewSwitcher {
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
