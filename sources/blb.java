// default package

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewSwitcher;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class blb extends ViewSwitcher {
    public final void a(CharSequence charSequence, boolean z, boolean z2) {
        if (z2 || !TextUtils.equals(charSequence, getCurrentView().getText())) {
            if (!z) {
                getCurrentView().setText(charSequence);
            } else {
                getNextView().setText(charSequence);
                showNext();
            }
        }
    }

    @Override // android.widget.ViewSwitcher, android.widget.ViewAnimator, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof TextView) {
            super.addView(view, i, layoutParams);
        } else {
            i98.g();
        }
    }

    @Override // android.widget.ViewAnimator
    public TextView getCurrentView() {
        return (TextView) super.getCurrentView();
    }

    @Override // android.widget.ViewSwitcher
    public TextView getNextView() {
        return (TextView) super.getNextView();
    }

    public void setText(CharSequence charSequence) {
        a(charSequence, true, false);
    }
}
