package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ga extends FrameLayout {
    public final EditTextBoldCursor a;
    public final TextView b;
    public final /* synthetic */ ma c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(ma maVar, Activity activity) {
        super(activity);
        this.c = maVar;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        this.a = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.UsernameLinkPlaceholder));
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(19.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new ea(this, 0));
        String str = maVar.r;
        long j10 = maVar.x;
        editTextBoldCursor.setText(str);
        editTextBoldCursor.addTextChangedListener(new fa(this));
        if (j10 != 0) {
            editTextBoldCursor.setEnabled(false);
        }
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setMaxLines(1);
        textView.setLines(1);
        textView.setPadding(0, 0, 0, 0);
        textView.setSingleLine(true);
        textView.setText(maVar.getMessagesController().linkPrefix + "/");
        textView.setTextSize(1, 17.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setTranslationY(-AndroidUtilities.dp(3.0f));
        linearLayout.addView(textView, g7.e6.p(-2, -2, 0.0f, 16, 21, 15, 0, 15));
        linearLayout.addView(editTextBoldCursor, g7.e6.p(-2, -2, 1.0f, 16, 0, 15, 21, 15));
        addView(linearLayout, g7.e6.e(-1, -1, 48));
        if (j10 != 0) {
            editTextBoldCursor.setAlpha(0.6f);
            textView.setAlpha(0.6f);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }
}
