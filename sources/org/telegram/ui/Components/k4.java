package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class k4 extends ck0 {
    public final /* synthetic */ ai.v0 k1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(Context context, int i7, di.b bVar, ai.v0 v0Var) {
        super(1, context, bVar, true);
        this.k1 = v0Var;
        this.v0 = false;
        this.u0 = false;
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        this.N = scrollView;
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, c8.ha.x(-1, -2, 51));
        dh0 dh0Var = new dh0(context);
        dh0Var.f(R.raw.report_police, 120, 120, null);
        dh0Var.d();
        frameLayout.addView(dh0Var, c8.ha.d(org.telegram.messenger.qs.q2, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 24.0f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.j5, bVar);
        if (i7 == 0) {
            textView.setText(org.telegram.messenger.id.M0(2131746191, null));
        } else if (i7 == 6) {
            textView.setText(org.telegram.messenger.id.M0(2131746193, null));
        } else if (i7 == 1) {
            textView.setText(org.telegram.messenger.id.M0(2131746190, null));
        } else if (i7 == 2) {
            textView.setText(org.telegram.messenger.id.M0(2131746194, null));
        } else if (i7 == 5) {
            textView.setText(org.telegram.messenger.id.M0(2131746192, null));
        } else if (i7 == 100) {
            textView.setText(org.telegram.messenger.id.M0(2131746230, null));
        }
        TextView i10 = org.telegram.ui.Cells.f1.i(frameLayout, textView, c8.ha.d(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        i10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(i10, org.telegram.ui.ActionBar.l6.r5, bVar);
        org.telegram.messenger.k5.m(i10, 1, null, 2131746217);
        frameLayout.addView(i10, c8.ha.d(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.j1 = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.s6.D(editTextBoldCursor, org.telegram.ui.ActionBar.l6.H6, bVar);
        int i11 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.U(editTextBoldCursor, i11, bVar);
        editTextBoldCursor.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.s6.F(editTextBoldCursor, org.telegram.ui.ActionBar.l6.k6, org.telegram.ui.ActionBar.l6.l6, org.telegram.ui.ActionBar.l6.p7, bVar);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(org.telegram.messenger.id.M0(2131746218, null));
        org.telegram.ui.ActionBar.s6.l(editTextBoldCursor, 30, i11, bVar);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new t0(this, 5));
        frameLayout.addView(editTextBoldCursor, c8.ha.d(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        bk0 bk0Var = new bk0(context);
        View view = new View(context);
        bk0Var.a = view;
        view.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.l6.Ci, 8.0f));
        bk0Var.addView(view, c8.ha.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        bk0Var.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.Gi, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        bk0Var.addView(textView2, c8.ha.e(-2, -2, 17));
        this.i1 = bk0Var;
        bk0Var.setBackground(null);
        bk0Var.setText(org.telegram.messenger.id.M0(2131746208, null));
        c8.ka.a(bk0Var);
        view.setOnClickListener(new ai.v(this, i7, 16));
        frameLayout.addView(bk0Var, c8.ha.d(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.P0 = true;
    }
}
