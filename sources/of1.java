// default package

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class of1 extends FrameLayout implements vlb {
    public final EditTextBoldCursor a;
    public final TextView b;
    public final /* synthetic */ uf1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of1(uf1 uf1Var, Activity activity) {
        super(activity);
        this.c = uf1Var;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        this.a = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        anb.D(editTextBoldCursor, cmb.G6, null);
        int i = cmb.F6;
        anb.X(editTextBoldCursor, i, null);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        byte b = 5;
        editTextBoldCursor.setGravity((jb6.a0 ? 5 : 3) | 48);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(jb6.M0(2131743335, null));
        anb.l(editTextBoldCursor, 30, i, null);
        editTextBoldCursor.setCursorSize(gm.L(19.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new j(this, b));
        String str = uf1Var.r;
        long j = uf1Var.y;
        editTextBoldCursor.setText(str);
        editTextBoldCursor.addTextChangedListener(new b7(this, (byte) 6));
        if (j != 0) {
            editTextBoldCursor.setEnabled(false);
        }
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setMaxLines(1);
        textView.setLines(1);
        textView.setPadding(0, 0, 0, 0);
        textView.setSingleLine(true);
        textView.setText(uf1Var.getMessagesController().N2 + "/");
        textView.setTextSize(1, 17.0f);
        anb.X(textView, i, null);
        textView.setGravity((jb6.a0 ? 5 : 3) | 48);
        textView.setTranslationY(-gm.L(3.0f));
        linearLayout.addView(textView, qoe.q(-2, -2, 0.0f, 16, 21, 15, 0, 15));
        linearLayout.addView(editTextBoldCursor, qoe.q(-2, -2, 1.0f, 16, 0, 15, 21, 15));
        addView(linearLayout, qoe.e(-1, -1, 48));
        if (j != 0) {
            editTextBoldCursor.setAlpha(0.6f);
            textView.setAlpha(0.6f);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), TLObject.FLAG_30));
    }

    @Override // vlb
    public final void updateColors() {
        try {
            this.a.setCursorColor(cmb.w0(null, cmb.F6, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
