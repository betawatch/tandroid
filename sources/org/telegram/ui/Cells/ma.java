package org.telegram.ui.Cells;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.z10;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ma extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final /* synthetic */ int n = 0;
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final la d;
    public final la e;
    public int f;
    public int h;

    public ma(Activity activity) {
        super(activity);
        setClickable(true);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.a = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        this.b = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(cd.L0(2131743916, null));
        linearLayout.addView(textView, w7.b6.q(-1, -2, 0.0f, 55, 28, 8, 28, 0));
        TextView textView2 = new TextView(activity);
        this.c = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setLineSpacing(org.telegram.messenger.i0.N(2.0f), 1.0f);
        linearLayout.addView(textView2, w7.b6.q(-1, -2, 0.0f, 55, 28, 2, 28, 0));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.addView(new Space(activity), w7.b6.p(-2, 1, 17.0f, 1));
        la laVar = new la(activity);
        this.d = laVar;
        laVar.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(7.0f));
        laVar.setTypeface(org.telegram.messenger.i0.o());
        laVar.setTextSize(1, 14.22f);
        laVar.setText(cd.L0(2131743935, null));
        linearLayout2.addView(laVar, w7.b6.o(-2, 30));
        linearLayout2.addView(new Space(activity), w7.b6.p(-2, 1, 17.0f, 1));
        la laVar2 = new la(activity);
        this.e = laVar2;
        laVar2.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(7.0f));
        laVar2.setTypeface(org.telegram.messenger.i0.o());
        laVar2.setTextSize(1, 14.22f);
        laVar2.setText(cd.L0(2131743925, null));
        linearLayout2.addView(laVar2, w7.b6.o(-2, 30));
        linearLayout2.addView(new Space(activity), w7.b6.p(-2, 1, 17.0f, 1));
        linearLayout.addView(linearLayout2, w7.b6.k(28.0f, 4.0f, 28.0f, 8.0f, -1, -2));
        addView(linearLayout, w7.b6.e(-1, -1, zs.E1));
        updateColors();
    }

    public static String a(z10 z10Var) {
        if (z10Var == null) {
            return "";
        }
        String str = z10Var.f;
        String str2 = "" + z10Var.e;
        if (!TextUtils.isEmpty(str) && !str2.isEmpty()) {
            str2 = str2.concat(", ");
        }
        return sc.e.A(str2, str);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (size <= 0) {
            size = org.telegram.messenger.i0.q.x;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.q.y, TLObject.FLAG_31);
        LinearLayout linearLayout = this.a;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight() + 1, TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        TextView textView;
        la laVar;
        la laVar2;
        TextView textView2 = this.b;
        if (textView2 == null || (textView = this.c) == null || (laVar = this.d) == null || (laVar2 = this.e) == null) {
            return;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false));
        int i10 = org.telegram.ui.ActionBar.t6.I6;
        laVar.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        int r12 = org.telegram.ui.ActionBar.t6.r1(org.telegram.ui.ActionBar.t6.I.q() ? 0.3f : 0.15f, org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        if (laVar.getBackground() == null) {
            laVar.setBackground(org.telegram.ui.ActionBar.t6.h0(r12, 7, org.telegram.messenger.i0.L(8.0f)));
        } else if (r12 != this.f) {
            org.telegram.ui.ActionBar.t6.H1(laVar.getBackground(), r12, true);
        }
        int i11 = org.telegram.ui.ActionBar.t6.q7;
        laVar2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        int r13 = org.telegram.ui.ActionBar.t6.r1(org.telegram.ui.ActionBar.t6.I.q() ? 0.3f : 0.15f, org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        if (laVar2.getBackground() == null) {
            laVar2.setBackground(org.telegram.ui.ActionBar.t6.h0(r13, 7, org.telegram.messenger.i0.L(8.0f)));
        } else if (r13 != this.h) {
            org.telegram.ui.ActionBar.t6.H1(laVar2.getBackground(), r13, true);
        }
        this.f = r12;
        this.h = r13;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
