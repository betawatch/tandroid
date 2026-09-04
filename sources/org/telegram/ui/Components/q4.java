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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class q4 extends ul0 {
    public final /* synthetic */ z2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(Context context, int i10, bi.b bVar, z2 z2Var) {
        super(1, context, bVar, true);
        this.d = z2Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        setCustomView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, w7.x5.x(-1, -2, 51));
        aj0 aj0Var = new aj0(context);
        aj0Var.f(R.raw.report_police, 120, 120, null);
        aj0Var.d();
        frameLayout.addView(aj0Var, w7.x5.d(160, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.wl.j(24.0f, 1, textView);
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
        TextView f7 = org.telegram.ui.Cells.p6.f(frameLayout, textView, w7.x5.d(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        f7.setTextSize(1, 14.0f);
        f7.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.r5));
        f7.setGravity(1);
        f7.setText(LocaleController.getString(R.string.ReportInfo));
        frameLayout.addView(f7, w7.x5.d(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor.setTextColor(getThemedColor(i11));
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
        editTextBoldCursor.setCursorColor(getThemedColor(i11));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new f1(this, 4));
        frameLayout.addView(editTextBoldCursor, w7.x5.d(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        tl0 tl0Var = new tl0(context);
        View view = new View(context);
        tl0Var.a = view;
        view.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.Oh));
        tl0Var.addView(view, w7.x5.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        tl0Var.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        textView2.setTextColor(bVar.G0(org.telegram.ui.ActionBar.j6.Sh));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        tl0Var.addView(textView2, w7.x5.e(-2, -2, 17));
        this.b = tl0Var;
        tl0Var.setBackground(null);
        tl0Var.setText(LocaleController.getString(R.string.ReportSend));
        w7.z5.a(tl0Var);
        view.setOnClickListener(new di.o4(this, i10, 12));
        frameLayout.addView(tl0Var, w7.x5.d(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.smoothKeyboardAnimationEnabled = true;
    }
}
