package org.telegram.ui.Cells;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.e10;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class pa extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static final /* synthetic */ int n = 0;
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final oa d;
    public final oa e;
    public int f;
    public int h;

    public pa(Activity activity) {
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
        textView.setText(gd.N0(2131743644, null));
        linearLayout.addView(textView, c8.na.q(-1, -2, 0.0f, 55, 28, 8, 28, 0));
        TextView textView2 = new TextView(activity);
        this.c = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setLineSpacing(org.telegram.messenger.g0.N(2.0f), 1.0f);
        linearLayout.addView(textView2, c8.na.q(-1, -2, 0.0f, 55, 28, 2, 28, 0));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.addView(new Space(activity), c8.na.p(-2, 1, 17.0f, 1));
        oa oaVar = new oa(activity);
        this.d = oaVar;
        oaVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f));
        oaVar.setTypeface(org.telegram.messenger.g0.o());
        oaVar.setTextSize(1, 14.22f);
        oaVar.setText(gd.N0(2131743663, null));
        linearLayout2.addView(oaVar, c8.na.o(-2, 30));
        linearLayout2.addView(new Space(activity), c8.na.p(-2, 1, 17.0f, 1));
        oa oaVar2 = new oa(activity);
        this.e = oaVar2;
        oaVar2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f));
        oaVar2.setTypeface(org.telegram.messenger.g0.o());
        oaVar2.setTextSize(1, 14.22f);
        oaVar2.setText(gd.N0(2131743653, null));
        linearLayout2.addView(oaVar2, c8.na.o(-2, 30));
        linearLayout2.addView(new Space(activity), c8.na.p(-2, 1, 17.0f, 1));
        linearLayout.addView(linearLayout2, c8.na.k(28.0f, 4.0f, 28.0f, 8.0f, -1, -2));
        addView(linearLayout, c8.na.e(-1, -1, ks.E1));
        updateColors();
    }

    public static String a(e10 e10Var) {
        if (e10Var == null) {
            return "";
        }
        String str = e10Var.f;
        String str2 = "" + e10Var.e;
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        TextView textView;
        oa oaVar;
        oa oaVar2;
        TextView textView2 = this.b;
        if (textView2 == null || (textView = this.c) == null || (oaVar = this.d) == null || (oaVar2 = this.e) == null) {
            return;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false));
        int i7 = org.telegram.ui.ActionBar.n6.I6;
        oaVar.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        int r12 = org.telegram.ui.ActionBar.n6.r1(org.telegram.ui.ActionBar.n6.I.q() ? 0.3f : 0.15f, org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        if (oaVar.getBackground() == null) {
            oaVar.setBackground(org.telegram.ui.ActionBar.n6.h0(r12, 7, org.telegram.messenger.g0.L(8.0f)));
        } else if (r12 != this.f) {
            org.telegram.ui.ActionBar.n6.H1(oaVar.getBackground(), r12, true);
        }
        int i10 = org.telegram.ui.ActionBar.n6.q7;
        oaVar2.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        int r13 = org.telegram.ui.ActionBar.n6.r1(org.telegram.ui.ActionBar.n6.I.q() ? 0.3f : 0.15f, org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        if (oaVar2.getBackground() == null) {
            oaVar2.setBackground(org.telegram.ui.ActionBar.n6.h0(r13, 7, org.telegram.messenger.g0.L(8.0f)));
        } else if (r13 != this.h) {
            org.telegram.ui.ActionBar.n6.H1(oaVar2.getBackground(), r13, true);
        }
        this.f = r12;
        this.h = r13;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
