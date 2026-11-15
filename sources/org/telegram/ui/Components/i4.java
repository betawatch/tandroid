package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class i4 extends gk0 {
    public final /* synthetic */ bi.z o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(Context context, int i7, fi.b bVar, bi.z zVar) {
        super(1, context, bVar, true);
        this.o1 = zVar;
        this.w0 = false;
        this.v0 = false;
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        this.O = scrollView;
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, c8.ja.x(-1, -2, 51));
        fh0 fh0Var = new fh0(context);
        fh0Var.f(R.raw.report_police, 120, 120, null);
        fh0Var.d();
        frameLayout.addView(fh0Var, c8.ja.d(org.telegram.messenger.ns.q2, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.i20.o(textView, 1, 24.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, bVar);
        if (i7 == 0) {
            textView.setText(org.telegram.messenger.hd.M0(2131746191, null));
        } else if (i7 == 6) {
            textView.setText(org.telegram.messenger.hd.M0(2131746193, null));
        } else if (i7 == 1) {
            textView.setText(org.telegram.messenger.hd.M0(2131746190, null));
        } else if (i7 == 2) {
            textView.setText(org.telegram.messenger.hd.M0(2131746194, null));
        } else if (i7 == 5) {
            textView.setText(org.telegram.messenger.hd.M0(2131746192, null));
        } else if (i7 == 100) {
            textView.setText(org.telegram.messenger.hd.M0(2131746230, null));
        }
        TextView k10 = org.telegram.ui.Cells.y0.k(frameLayout, textView, c8.ja.d(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        k10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(k10, org.telegram.ui.ActionBar.j6.r5, bVar);
        org.telegram.messenger.k5.l(k10, 1, null, 2131746217);
        frameLayout.addView(k10, c8.ja.d(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.n1 = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.q6.D(editTextBoldCursor, org.telegram.ui.ActionBar.j6.H6, bVar);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, i10, bVar);
        editTextBoldCursor.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.q6.F(editTextBoldCursor, org.telegram.ui.ActionBar.j6.k6, org.telegram.ui.ActionBar.j6.l6, org.telegram.ui.ActionBar.j6.p7, bVar);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(org.telegram.messenger.hd.M0(2131746218, null));
        org.telegram.ui.ActionBar.q6.l(editTextBoldCursor, 30, i10, bVar);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new q0(this, 5));
        frameLayout.addView(editTextBoldCursor, c8.ja.d(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        fk0 fk0Var = new fk0(context);
        View view = new View(context);
        fk0Var.a = view;
        view.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 8.0f));
        fk0Var.addView(view, c8.ja.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        fk0Var.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.Ji, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        fk0Var.addView(textView2, c8.ja.e(-2, -2, 17));
        this.m1 = fk0Var;
        fk0Var.setBackground(null);
        fk0Var.setText(org.telegram.messenger.hd.M0(2131746208, null));
        c8.na.a(fk0Var);
        view.setOnClickListener(new ci.q(this, i7, 16));
        frameLayout.addView(fk0Var, c8.ja.d(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.Q0 = true;
    }
}
