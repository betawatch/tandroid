package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class r4 extends qk0 {
    public final /* synthetic */ bi.z o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(Context context, int i7, fi.b bVar, bi.z zVar) {
        super(1, context, bVar, true);
        this.o1 = zVar;
        this.w0 = false;
        this.v0 = false;
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        this.O = scrollView;
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, c8.ma.x(-1, -2, 51));
        rh0 rh0Var = new rh0(context);
        rh0Var.f(R.raw.report_police, 120, 120, null);
        rh0Var.d();
        frameLayout.addView(rh0Var, c8.ma.d(org.telegram.messenger.ks.q2, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.n10.p(textView, 1, 24.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, bVar);
        if (i7 == 0) {
            textView.setText(org.telegram.messenger.gd.N0(2131745995, null));
        } else if (i7 == 6) {
            textView.setText(org.telegram.messenger.gd.N0(2131745997, null));
        } else if (i7 == 1) {
            textView.setText(org.telegram.messenger.gd.N0(2131745994, null));
        } else if (i7 == 2) {
            textView.setText(org.telegram.messenger.gd.N0(2131745998, null));
        } else if (i7 == 5) {
            textView.setText(org.telegram.messenger.gd.N0(2131745996, null));
        } else if (i7 == 100) {
            textView.setText(org.telegram.messenger.gd.N0(2131746034, null));
        }
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, c8.ma.d(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        m10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(m10, org.telegram.ui.ActionBar.m6.r5, bVar);
        org.telegram.messenger.f3.k(m10, 1, null, 2131746021);
        frameLayout.addView(m10, c8.ma.d(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.n1 = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.t6.D(editTextBoldCursor, org.telegram.ui.ActionBar.m6.H6, bVar);
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i10, bVar);
        editTextBoldCursor.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.t6.F(editTextBoldCursor, org.telegram.ui.ActionBar.m6.k6, org.telegram.ui.ActionBar.m6.l6, org.telegram.ui.ActionBar.m6.p7, bVar);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(org.telegram.messenger.gd.N0(2131746022, null));
        org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 30, i10, bVar);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new h(this, 6));
        frameLayout.addView(editTextBoldCursor, c8.ma.d(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        pk0 pk0Var = new pk0(context);
        View view = new View(context);
        pk0Var.a = view;
        view.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 8.0f));
        pk0Var.addView(view, c8.ma.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        pk0Var.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Ji, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        pk0Var.addView(textView2, c8.ma.e(-2, -2, 17));
        this.m1 = pk0Var;
        pk0Var.setBackground(null);
        pk0Var.setText(org.telegram.messenger.gd.N0(2131746012, null));
        c8.ra.a(pk0Var);
        view.setOnClickListener(new ci.q(this, i7, 18));
        frameLayout.addView(pk0Var, c8.ma.d(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.Q0 = true;
    }
}
