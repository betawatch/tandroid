package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zy extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final ImageView a;
    public final TextView b;
    public final RadialProgressView c;
    public boolean d;
    public final /* synthetic */ sz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy(sz szVar, Context context) {
        super(context);
        this.e = szVar;
        org.telegram.ui.ActionBar.e7 e7Var = org.telegram.ui.ActionBar.f7.a;
        ImageView imageView = new ImageView(getContext());
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i10 = org.telegram.ui.ActionBar.y6.Le;
        org.telegram.ui.ActionBar.u6 u6Var = szVar.Z1;
        org.telegram.ui.ActionBar.f7.t(imageView, i10, u6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, kb1.h(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.b = textView;
        org.telegram.ui.d3.o(R.string.NoGIFsFound, textView, 1, 16.0f);
        org.telegram.ui.ActionBar.f7.V(textView, i10, u6Var);
        addView(textView, kb1.h(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, u6Var);
        this.c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(szVar.A(org.telegram.ui.ActionBar.y6.h6));
        addView(radialProgressView, kb1.i(-2, -2, 17));
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
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(!this.d ? (int) (org.telegram.messenger.wh.B(8.0f, r0 - r4.b1, 3) * 1.7f) : this.e.h0.getMeasuredHeight() - AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            this.c.setProgressColor(this.e.A(org.telegram.ui.ActionBar.y6.h6));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
