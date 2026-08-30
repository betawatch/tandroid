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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class l4 extends cm0 {
    public final /* synthetic */ kh.t d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(Context context, int i10, nh.b bVar, kh.t tVar) {
        super(context, bVar, true, false);
        this.d = tVar;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        setCustomView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, k7.b6.x(-1, -2, 51));
        jj0 jj0Var = new jj0(context);
        jj0Var.f(R.raw.report_police, 120, 120, null);
        jj0Var.d();
        frameLayout.addView(jj0Var, k7.b6.d(160, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.b.g(24.0f, 1, textView);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.j5));
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
        TextView i11 = org.telegram.ui.yh.i(frameLayout, textView, k7.b6.d(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        i11.setTextSize(1, 14.0f);
        i11.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.r5));
        i11.setGravity(1);
        i11.setText(LocaleController.getString(R.string.ReportInfo));
        frameLayout.addView(i11, k7.b6.d(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor.setTextColor(getThemedColor(i12));
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setLineColors(getThemedColor(org.telegram.ui.ActionBar.j6.k6), getThemedColor(org.telegram.ui.ActionBar.j6.l6), getThemedColor(org.telegram.ui.ActionBar.j6.p7));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.ReportHint));
        editTextBoldCursor.setCursorColor(getThemedColor(i12));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new d1(this, 4));
        frameLayout.addView(editTextBoldCursor, k7.b6.d(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        bm0 bm0Var = new bm0(context);
        View view = new View(context);
        bm0Var.a = view;
        view.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.Oh));
        bm0Var.addView(view, k7.b6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        bm0Var.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        textView2.setTextColor(bVar.x0(org.telegram.ui.ActionBar.j6.Sh));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        bm0Var.addView(textView2, k7.b6.e(-2, -2, 17));
        this.b = bm0Var;
        bm0Var.setBackground(null);
        bm0Var.setText(LocaleController.getString(R.string.ReportSend));
        k7.d6.a(bm0Var);
        view.setOnClickListener(new lh.y0(this, i10, 9));
        frameLayout.addView(bm0Var, k7.b6.d(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.smoothKeyboardAnimationEnabled = true;
    }
}
