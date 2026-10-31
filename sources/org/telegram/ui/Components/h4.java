package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h4 extends fl0 {
    public final /* synthetic */ s2 k1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(Context context, int i10, th.b bVar, s2 s2Var) {
        super(1, context, bVar, true);
        this.k1 = s2Var;
        this.v0 = false;
        this.u0 = false;
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        this.N = scrollView;
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, w7.b6.x(-1, -2, 51));
        ei0 ei0Var = new ei0(context);
        ei0Var.f(R.raw.report_police, 120, 120, null);
        ei0Var.d();
        frameLayout.addView(ei0Var, w7.b6.d(org.telegram.messenger.zs.q2, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.z20.n(textView, 1, 24.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, bVar);
        if (i10 == 0) {
            textView.setText(org.telegram.messenger.cd.L0(2131746208, null));
        } else if (i10 == 6) {
            textView.setText(org.telegram.messenger.cd.L0(2131746210, null));
        } else if (i10 == 1) {
            textView.setText(org.telegram.messenger.cd.L0(2131746207, null));
        } else if (i10 == 2) {
            textView.setText(org.telegram.messenger.cd.L0(2131746211, null));
        } else if (i10 == 5) {
            textView.setText(org.telegram.messenger.cd.L0(2131746209, null));
        } else if (i10 == 100) {
            textView.setText(org.telegram.messenger.cd.L0(2131746247, null));
        }
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView, w7.b6.d(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        l4.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(l4, org.telegram.ui.ActionBar.t6.r5, bVar);
        org.telegram.messenger.m5.l(l4, 1, null, 2131746234);
        frameLayout.addView(l4, w7.b6.d(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.j1 = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor, org.telegram.ui.ActionBar.t6.H6, bVar);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i11, bVar);
        editTextBoldCursor.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.a7.G(editTextBoldCursor, org.telegram.ui.ActionBar.t6.k6, org.telegram.ui.ActionBar.t6.l6, org.telegram.ui.ActionBar.t6.p7, bVar);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(org.telegram.messenger.cd.L0(2131746235, null));
        org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, i11, bVar);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new t0(this, 5));
        frameLayout.addView(editTextBoldCursor, w7.b6.d(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        el0 el0Var = new el0(context);
        View view = new View(context);
        el0Var.a = view;
        view.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 8.0f));
        el0Var.addView(view, w7.b6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        el0Var.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Gi, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        el0Var.addView(textView2, w7.b6.e(-2, -2, 17));
        this.i1 = el0Var;
        el0Var.setBackground(null);
        el0Var.setText(org.telegram.messenger.cd.L0(2131746225, null));
        w7.e6.a(el0Var);
        view.setOnClickListener(new bh.f(this, i10, 11));
        frameLayout.addView(el0Var, w7.b6.d(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.P0 = true;
    }
}
