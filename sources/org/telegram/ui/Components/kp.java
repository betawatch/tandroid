package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class kp extends FrameLayout {
    public final View a;
    public final TextView b;

    public kp(Context context) {
        super(context);
        View view = new View(context);
        this.a = view;
        int L = org.telegram.messenger.g0.L(4.0f);
        int i7 = org.telegram.ui.ActionBar.k6.Ci;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i7);
        int i10 = org.telegram.ui.ActionBar.k6.Ei;
        int v03 = org.telegram.ui.ActionBar.k6.v0(i10);
        Drawable k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, v02, v03, v03);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i10);
        view.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(view, k02, N, N2, null);
        addView(view, c8.ha.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.Gi, null, 1, 14.0f);
        addView(textView, c8.ha.e(-2, -2, 17));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30));
    }

    public void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
