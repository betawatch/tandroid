package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class s4 extends vm0 {
    public final /* synthetic */ b3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(Context context, int i10, bi.b bVar, b3 b3Var) {
        super(1, context, bVar, true);
        this.d = b3Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        setCustomView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, w7.a6.x(-1, -2, 51));
        bk0 bk0Var = new bk0(context);
        bk0Var.f(R.raw.report_police, 120, 120, null);
        bk0Var.d();
        frameLayout.addView(bk0Var, w7.a6.a(160.0f, 17.0f, 14.0f, 17.0f, 0.0f, 160, 49));
        TextView textView = new TextView(context);
        org.telegram.messenger.yh.k(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.j5));
        if (i10 == 0) {
            textView.setText(LocaleController.getString(R.string.ReportTitleSpam));
        } else if (i10 == 6) {
            textView.setText(LocaleController.getString(R.string.ReportTitleFake));
        } else if (i10 == 1) {
            textView.setText(LocaleController.getString(R.string.ReportTitleViolence));
        } else if (i10 == 2) {
            textView.setText(LocaleController.getString(R.string.ReportTitleChild));
        } else if (i10 == 5) {
            textView.setText(LocaleController.getString(R.string.ReportTitlePornography));
        } else if (i10 == 100) {
            textView.setText(LocaleController.getString(R.string.ReportChat));
        }
        TextView h = org.telegram.ui.Cells.d0.h(frameLayout, textView, w7.a6.a(-2.0f, 17.0f, 197.0f, 17.0f, 0.0f, -2, 49), context);
        h.setTextSize(1, 14.0f);
        h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.r5));
        h.setGravity(1);
        h.setText(LocaleController.getString(R.string.ReportInfo));
        frameLayout.addView(h, w7.a6.a(-2.0f, 30.0f, 235.0f, 30.0f, 44.0f, -2, 49));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.H6));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        editTextBoldCursor.setTextColor(getThemedColor(i11));
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setLineColors(getThemedColor(org.telegram.ui.ActionBar.g6.k6), getThemedColor(org.telegram.ui.ActionBar.g6.l6), getThemedColor(org.telegram.ui.ActionBar.g6.p7));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.ReportHint));
        editTextBoldCursor.setCursorColor(getThemedColor(i11));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new e1(this, 5));
        frameLayout.addView(editTextBoldCursor, w7.a6.a(36.0f, 17.0f, 305.0f, 17.0f, 0.0f, -1, 51));
        um0 um0Var = new um0(context);
        View view = new View(context);
        um0Var.a = view;
        view.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.Oh));
        um0Var.addView(view, w7.a6.a(-1.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 0));
        TextView textView2 = new TextView(context);
        um0Var.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        textView2.setTextColor(bVar.F0(org.telegram.ui.ActionBar.g6.Sh));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        um0Var.addView(textView2, w7.a6.e(-2, -2, 17));
        this.b = um0Var;
        um0Var.setBackground(null);
        um0Var.setText(LocaleController.getString(R.string.ReportSend));
        w7.c6.a(um0Var);
        view.setOnClickListener(new di.m4(this, i10, 12));
        frameLayout.addView(um0Var, w7.a6.a(50.0f, 0.0f, 357.0f, 0.0f, 0.0f, -1, 51));
        this.smoothKeyboardAnimationEnabled = true;
    }
}
