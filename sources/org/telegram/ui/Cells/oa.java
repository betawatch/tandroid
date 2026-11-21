package org.telegram.ui.Cells;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.f10;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class oa extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final /* synthetic */ int n = 0;
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final na d;
    public final na e;
    public int f;
    public int h;

    public oa(Activity activity) {
        super(activity);
        setClickable(true);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.a = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        this.b = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(gd.N0(2131743648, null));
        linearLayout.addView(textView, c8.ma.q(-1, -2, 0.0f, 55, 28, 8, 28, 0));
        TextView textView2 = new TextView(activity);
        this.c = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setLineSpacing(org.telegram.messenger.g0.N(2.0f), 1.0f);
        linearLayout.addView(textView2, c8.ma.q(-1, -2, 0.0f, 55, 28, 2, 28, 0));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.addView(new Space(activity), c8.ma.p(-2, 1, 17.0f, 1));
        na naVar = new na(activity);
        this.d = naVar;
        naVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f));
        naVar.setTypeface(org.telegram.messenger.g0.o());
        naVar.setTextSize(1, 14.22f);
        naVar.setText(gd.N0(2131743667, null));
        linearLayout2.addView(naVar, c8.ma.o(-2, 30));
        linearLayout2.addView(new Space(activity), c8.ma.p(-2, 1, 17.0f, 1));
        na naVar2 = new na(activity);
        this.e = naVar2;
        naVar2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f));
        naVar2.setTypeface(org.telegram.messenger.g0.o());
        naVar2.setTextSize(1, 14.22f);
        naVar2.setText(gd.N0(2131743657, null));
        linearLayout2.addView(naVar2, c8.ma.o(-2, 30));
        linearLayout2.addView(new Space(activity), c8.ma.p(-2, 1, 17.0f, 1));
        linearLayout.addView(linearLayout2, c8.ma.k(28.0f, 4.0f, 28.0f, 8.0f, -1, -2));
        addView(linearLayout, c8.ma.e(-1, -1, ks.E1));
        updateColors();
    }

    public static String a(f10 f10Var) {
        if (f10Var == null) {
            return "";
        }
        String str = f10Var.f;
        String str2 = "" + f10Var.e;
        if (!TextUtils.isEmpty(str) && !str2.isEmpty()) {
            str2 = str2.concat(", ");
        }
        return p5.c.v(str2, str);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        if (size <= 0) {
            size = org.telegram.messenger.g0.q.x;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.y, TLObject.FLAG_31);
        LinearLayout linearLayout = this.a;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight() + 1, TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        TextView textView;
        na naVar;
        na naVar2;
        TextView textView2 = this.b;
        if (textView2 == null || (textView = this.c) == null || (naVar = this.d) == null || (naVar2 = this.e) == null) {
            return;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        textView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.y6, false));
        int i7 = org.telegram.ui.ActionBar.m6.I6;
        naVar.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        int r12 = org.telegram.ui.ActionBar.m6.r1(org.telegram.ui.ActionBar.m6.I.q() ? 0.3f : 0.15f, org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        if (naVar.getBackground() == null) {
            naVar.setBackground(org.telegram.ui.ActionBar.m6.h0(r12, 7, org.telegram.messenger.g0.L(8.0f)));
        } else if (r12 != this.f) {
            org.telegram.ui.ActionBar.m6.H1(naVar.getBackground(), r12, true);
        }
        int i10 = org.telegram.ui.ActionBar.m6.q7;
        naVar2.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        int r13 = org.telegram.ui.ActionBar.m6.r1(org.telegram.ui.ActionBar.m6.I.q() ? 0.3f : 0.15f, org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        if (naVar2.getBackground() == null) {
            naVar2.setBackground(org.telegram.ui.ActionBar.m6.h0(r13, 7, org.telegram.messenger.g0.L(8.0f)));
        } else if (r13 != this.h) {
            org.telegram.ui.ActionBar.m6.H1(naVar2.getBackground(), r13, true);
        }
        this.f = r12;
        this.h = r13;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
