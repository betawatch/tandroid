package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ga extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final EditTextBoldCursor a;
    public final TextView b;
    public final /* synthetic */ la c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(la laVar, Activity activity) {
        super(activity);
        this.c = laVar;
        LinearLayout linearLayout = new LinearLayout(getContext());
        int i7 = 0;
        linearLayout.setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        this.a = editTextBoldCursor;
        int i10 = 1;
        editTextBoldCursor.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.H6, null);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i11, null);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(org.telegram.messenger.hd.M0(2131743649, null));
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i11, null);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new fa(this, i7));
        String str = laVar.r;
        long j3 = laVar.y;
        editTextBoldCursor.setText(str);
        editTextBoldCursor.addTextChangedListener(new m0(this, i10));
        if (j3 != 0) {
            editTextBoldCursor.setEnabled(false);
        }
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setMaxLines(1);
        textView.setLines(1);
        textView.setPadding(0, 0, 0, 0);
        textView.setSingleLine(true);
        textView.setText(laVar.getMessagesController().U2 + "/");
        textView.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        textView.setTranslationY(-org.telegram.messenger.g0.L(3.0f));
        linearLayout.addView(textView, c8.ha.q(-2, -2, 0.0f, 16, 21, 15, 0, 15));
        linearLayout.addView(editTextBoldCursor, c8.ha.q(-2, -2, 1.0f, 16, 0, 15, 21, 15));
        addView(linearLayout, c8.ha.e(-1, -1, 48));
        if (j3 != 0) {
            editTextBoldCursor.setAlpha(0.6f);
            textView.setAlpha(0.6f);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            this.a.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
