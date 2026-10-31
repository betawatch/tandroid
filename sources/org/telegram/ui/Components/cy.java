package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cy extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final ImageView a;
    public final TextView b;
    public final RadialProgressView c;
    public boolean d;
    public final /* synthetic */ vy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(vy vyVar, Context context) {
        super(context);
        this.e = vyVar;
        org.telegram.ui.ActionBar.z6 z6Var = org.telegram.ui.ActionBar.a7.a;
        ImageView imageView = new ImageView(getContext());
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i10 = org.telegram.ui.ActionBar.t6.Af;
        org.telegram.ui.ActionBar.p6 p6Var = vyVar.Z1;
        org.telegram.ui.ActionBar.a7.t(imageView, i10, p6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, w7.b6.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setText(org.telegram.messenger.cd.L0(2131748224, null));
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        addView(textView, w7.b6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, p6Var);
        this.c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(vyVar.A(org.telegram.ui.ActionBar.t6.h6));
        addView(radialProgressView, w7.b6.e(-2, -2, 17));
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            this.a.setVisibility(z10 ? 8 : 0);
            this.b.setVisibility(z10 ? 8 : 0);
            this.c.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(!this.d ? (int) (org.telegram.messenger.z20.y(8.0f, r0 - r4.b1, 3) * 1.7f) : this.e.h0.getMeasuredHeight() - org.telegram.messenger.i0.L(80.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.c.setProgressColor(this.e.A(org.telegram.ui.ActionBar.t6.h6));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
