package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class na extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final EditTextBoldCursor a;
    public final TextView b;
    public final /* synthetic */ ta c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(ta taVar, Activity activity) {
        super(activity);
        this.c = taVar;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        this.a = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.f7.E(editTextBoldCursor, org.telegram.ui.ActionBar.y6.H6, null);
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i10, null);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.UsernameLinkPlaceholder));
        org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 30, i10, null);
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(19.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new la(this, 0));
        String str = taVar.r;
        long j10 = taVar.x;
        editTextBoldCursor.setText(str);
        editTextBoldCursor.addTextChangedListener(new ma(this));
        if (j10 != 0) {
            editTextBoldCursor.setEnabled(false);
        }
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setMaxLines(1);
        textView.setLines(1);
        textView.setPadding(0, 0, 0, 0);
        textView.setSingleLine(true);
        textView.setText(taVar.getMessagesController().linkPrefix + "/");
        textView.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.f7.V(textView, i10, null);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setTranslationY(-AndroidUtilities.dp(3.0f));
        linearLayout.addView(textView, org.telegram.ui.Components.kb1.t(-2, -2, 0.0f, 16, 21, 15, 0, 15));
        linearLayout.addView(editTextBoldCursor, org.telegram.ui.Components.kb1.t(-2, -2, 1.0f, 16, 0, 15, 21, 15));
        addView(linearLayout, org.telegram.ui.Components.kb1.i(-1, -1, 48));
        if (j10 != 0) {
            editTextBoldCursor.setAlpha(0.6f);
            textView.setAlpha(0.6f);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            this.a.setCursorColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
