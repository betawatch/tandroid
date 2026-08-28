package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f40 extends FrameLayout {
    public View a;
    public TextView b;
    public pi0 c;
    public LinearLayout d;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
    }

    public void setGravity(int i9) {
        this.b.setGravity(i9);
    }

    public void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i9) {
        this.b.setTextColor(i9);
    }
}
