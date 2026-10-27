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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class s4 extends zm0 {
    public final /* synthetic */ ai.c1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(Context context, int i10, di.b bVar, ai.c1 c1Var) {
        super(1, context, bVar, true);
        this.d = c1Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        setCustomView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        scrollView.addView(frameLayout, kb1.B(-1, -2, 51));
        bk0 bk0Var = new bk0(context);
        bk0Var.f(R.raw.report_police, 120, 120, null);
        bk0Var.d();
        frameLayout.addView(bk0Var, kb1.h(160, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.messenger.wh.j(24.0f, 1, textView);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, bVar);
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
        TextView k10 = org.telegram.ui.d3.k(frameLayout, textView, kb1.h(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f), context);
        k10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(k10, org.telegram.ui.ActionBar.y6.r5, bVar);
        k10.setGravity(1);
        k10.setText(LocaleController.getString(R.string.ReportInfo));
        frameLayout.addView(k10, kb1.h(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.f7.E(editTextBoldCursor, org.telegram.ui.ActionBar.y6.H6, bVar);
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i11, bVar);
        editTextBoldCursor.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.f7.G(editTextBoldCursor, org.telegram.ui.ActionBar.y6.k6, org.telegram.ui.ActionBar.y6.l6, org.telegram.ui.ActionBar.y6.p7, bVar);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.ReportHint));
        org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 30, i11, bVar);
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new d1(this, 5));
        frameLayout.addView(editTextBoldCursor, kb1.h(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        ym0 ym0Var = new ym0(context);
        View view = new View(context);
        ym0Var.a = view;
        view.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{8.0f}, org.telegram.ui.ActionBar.y6.Oh));
        ym0Var.addView(view, kb1.h(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        ym0Var.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.Sh, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        ym0Var.addView(textView2, kb1.i(-2, -2, 17));
        this.b = ym0Var;
        ym0Var.setBackground(null);
        ym0Var.setText(LocaleController.getString(R.string.ReportSend));
        kb1.b(ym0Var);
        view.setOnClickListener(new ai.w(this, i10, 17));
        frameLayout.addView(ym0Var, kb1.h(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.smoothKeyboardAnimationEnabled = true;
    }
}
