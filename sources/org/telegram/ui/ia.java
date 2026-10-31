package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ia extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final EditTextBoldCursor a;
    public final TextView b;
    public final /* synthetic */ oa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(oa oaVar, Activity activity) {
        super(activity);
        this.c = oaVar;
        LinearLayout linearLayout = new LinearLayout(getContext());
        int i10 = 0;
        linearLayout.setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        this.a = editTextBoldCursor;
        int i11 = 1;
        editTextBoldCursor.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor, org.telegram.ui.ActionBar.t6.H6, null);
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i12, null);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(org.telegram.messenger.cd.L0(2131743674, null));
        org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, i12, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(19.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new ha(this, i10));
        String str = oaVar.r;
        long j10 = oaVar.y;
        editTextBoldCursor.setText(str);
        editTextBoldCursor.addTextChangedListener(new n0(this, i11));
        if (j10 != 0) {
            editTextBoldCursor.setEnabled(false);
        }
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setMaxLines(1);
        textView.setLines(1);
        textView.setPadding(0, 0, 0, 0);
        textView.setSingleLine(true);
        textView.setText(oaVar.getMessagesController().U2 + "/");
        textView.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.a7.V(textView, i12, null);
        textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
        textView.setTranslationY(-org.telegram.messenger.i0.L(3.0f));
        linearLayout.addView(textView, w7.b6.q(-2, -2, 0.0f, 16, 21, 15, 0, 15));
        linearLayout.addView(editTextBoldCursor, w7.b6.q(-2, -2, 1.0f, 16, 0, 15, 21, 15));
        addView(linearLayout, w7.b6.e(-1, -1, 48));
        if (j10 != 0) {
            editTextBoldCursor.setAlpha(0.6f);
            textView.setAlpha(0.6f);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.a.setCursorColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
