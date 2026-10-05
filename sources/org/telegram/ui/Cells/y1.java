package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import ci.zb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.q90;
import org.telegram.ui.nd;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class y1 extends q90 {
    public final /* synthetic */ int L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override // org.telegram.ui.Components.q90
    public int a() {
        switch (this.L) {
            case 4:
                return ((UndoView) this.M).a;
            default:
                return super.a();
        }
    }

    @Override // org.telegram.ui.Components.q90
    public int c() {
        switch (this.L) {
            case 1:
                Integer num = ((e9) this.M).d;
                if (num == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.c();
    }

    @Override // org.telegram.ui.Components.q90, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.L) {
            case 0:
                super.onDraw(canvas);
                ((a2) this.M).f();
                break;
            case 1:
                e9 e9Var = (e9) this.M;
                e9Var.b();
                super.onDraw(canvas);
                e9Var.a();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.TextView, java.lang.Object, org.telegram.ui.Cells.y1, org.telegram.ui.Components.q90] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Components.q90, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.L) {
            case 0:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                break;
            case 1:
            default:
                super.setText(charSequence, bufferType);
                break;
            case 2:
                if (charSequence != 0) {
                    charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                    int indexOf = charSequence.toString().indexOf(10);
                    if (indexOf >= 0) {
                        charSequence.replace(indexOf, indexOf + 1, " ");
                        charSequence.setSpan(new ForegroundColorSpan(((org.telegram.ui.ra) this.M).e.getThemedColor(org.telegram.ui.ActionBar.i6.p7)), 0, indexOf, 33);
                    }
                    e61[] e61VarArr = (e61[]) charSequence.getSpans(0, charSequence.length(), e61.class);
                    for (int i10 = 0; i10 < e61VarArr.length; i10++) {
                        charSequence.setSpan(new zb(this, 2), charSequence.getSpanStart(e61VarArr[i10]), charSequence.getSpanEnd(e61VarArr[i10]), 33);
                        charSequence.removeSpan(e61VarArr[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
            case 3:
                nd ndVar = (nd) this.M;
                if (charSequence != 0) {
                    charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new ForegroundColorSpan(ndVar.getThemedColor(org.telegram.ui.ActionBar.i6.p7)), 0, indexOf2, 33);
                    }
                    e61[] e61VarArr2 = (e61[]) charSequence.getSpans(0, charSequence.length(), e61.class);
                    EditTextBoldCursor editTextBoldCursor = ndVar.w;
                    String obj = (editTextBoldCursor == null || editTextBoldCursor.getText() == null) ? "" : ndVar.w.getText().toString();
                    for (int i11 = 0; i11 < e61VarArr2.length; i11++) {
                        charSequence.setSpan(new i(4, (Object) this, obj), charSequence.getSpanStart(e61VarArr2[i11]), charSequence.getSpanEnd(e61VarArr2[i11]), 33);
                        charSequence.removeSpan(e61VarArr2[i11]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(e9 e9Var, Context context, n90 n90Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n90Var, d6Var);
        this.L = 1;
        this.M = e9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(UndoView undoView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.L = 4;
        this.M = undoView;
    }
}
