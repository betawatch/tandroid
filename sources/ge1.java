// default package

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ge1 extends FrameLayout implements tjb {
    public final EditTextBoldCursor a;
    public final TextView b;
    public final /* synthetic */ me1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge1(me1 me1Var, Activity activity) {
        super(activity);
        this.c = me1Var;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        this.a = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        zkb.D(editTextBoldCursor, bkb.G6, null);
        int i = bkb.F6;
        zkb.X(editTextBoldCursor, i, null);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        byte b = 5;
        editTextBoldCursor.setGravity((k96.a0 ? 5 : 3) | 48);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(k96.M0(2131743409, null));
        zkb.l(editTextBoldCursor, 30, i, null);
        editTextBoldCursor.setCursorSize(gl.L(19.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 4));
        String str = me1Var.r;
        long j = me1Var.y;
        editTextBoldCursor.setText(str);
        editTextBoldCursor.addTextChangedListener(new b7(this, b));
        if (j != 0) {
            editTextBoldCursor.setEnabled(false);
        }
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setMaxLines(1);
        textView.setLines(1);
        textView.setPadding(0, 0, 0, 0);
        textView.setSingleLine(true);
        textView.setText(me1Var.getMessagesController().N2 + "/");
        textView.setTextSize(1, 17.0f);
        zkb.X(textView, i, null);
        textView.setGravity((k96.a0 ? 5 : 3) | 48);
        textView.setTranslationY(-gl.L(3.0f));
        linearLayout.addView(textView, nme.q(-2, -2, 0.0f, 16, 21, 15, 0, 15));
        linearLayout.addView(editTextBoldCursor, nme.q(-2, -2, 1.0f, 16, 0, 15, 21, 15));
        addView(linearLayout, nme.e(-1, -1, 48));
        if (j != 0) {
            editTextBoldCursor.setAlpha(0.6f);
            textView.setAlpha(0.6f);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), TLObject.FLAG_30));
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.a.setCursorColor(bkb.w0(null, bkb.F6, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
