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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class sx extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final ImageView a;
    public final TextView b;
    public final RadialProgressView c;
    public boolean d;
    public final /* synthetic */ ly e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx(ly lyVar, Context context) {
        super(context);
        this.e = lyVar;
        org.telegram.ui.ActionBar.p6 p6Var = org.telegram.ui.ActionBar.q6.a;
        ImageView imageView = new ImageView(getContext());
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i7 = org.telegram.ui.ActionBar.j6.Df;
        org.telegram.ui.ActionBar.e6 e6Var = lyVar.a2;
        org.telegram.ui.ActionBar.q6.s(imageView, i7, e6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ja.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setText(org.telegram.messenger.hd.M0(2131748207, null));
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(textView, i7, e6Var);
        addView(textView, c8.ja.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, e6Var);
        this.c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(lyVar.z(org.telegram.ui.ActionBar.j6.h6));
        addView(radialProgressView, c8.ja.e(-2, -2, 17));
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(!this.d ? (int) (org.telegram.messenger.i20.y(8.0f, r0 - r4.c1, 3) * 1.7f) : this.e.i0.getMeasuredHeight() - org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.c.setProgressColor(this.e.z(org.telegram.ui.ActionBar.j6.h6));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
