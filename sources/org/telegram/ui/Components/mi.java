package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class mi extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final TextView b;
    public final TextView c;

    public mi(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = f6Var;
        setPadding(0, org.telegram.messenger.g0.L(42.0f), 0, org.telegram.messenger.g0.L(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.r(-1, -2, 17));
        l9 l9Var = new l9(context);
        l9Var.setImageDrawable(new zg0(R.raw.utyan_empty, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        linearLayout.addView(l9Var, c8.ha.t(120, 120, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 17, 32, 12, 32, 8), context);
        this.c = f10;
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        linearLayout.addView(f10, c8.ha.t(-1, -2, 17, 32, 0, 32, 0));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        this.b.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, f6Var));
    }
}
