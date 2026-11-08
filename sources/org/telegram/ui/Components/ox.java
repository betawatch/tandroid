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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ox extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final ImageView a;
    public final TextView b;
    public final RadialProgressView c;
    public boolean d;
    public final /* synthetic */ hy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox(hy hyVar, Context context) {
        super(context);
        this.e = hyVar;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.a;
        ImageView imageView = new ImageView(getContext());
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i7 = org.telegram.ui.ActionBar.k6.Af;
        org.telegram.ui.ActionBar.f6 f6Var = hyVar.Z1;
        org.telegram.ui.ActionBar.r6.t(imageView, i7, f6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ha.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setText(org.telegram.messenger.id.M0(2131748208, null));
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i7, f6Var);
        addView(textView, c8.ha.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, f6Var);
        this.c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(hyVar.z(org.telegram.ui.ActionBar.k6.h6));
        addView(radialProgressView, c8.ha.e(-2, -2, 17));
    }

    public final void a(boolean z9) {
        if (this.d != z9) {
            this.d = z9;
            this.a.setVisibility(z9 ? 8 : 0);
            this.b.setVisibility(z9 ? 8 : 0);
            this.c.setVisibility(z9 ? 0 : 8);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(!this.d ? (int) (org.telegram.messenger.camera.q.y(8.0f, r0 - r4.b1, 3) * 1.7f) : this.e.h0.getMeasuredHeight() - org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            this.c.setProgressColor(this.e.z(org.telegram.ui.ActionBar.k6.h6));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
