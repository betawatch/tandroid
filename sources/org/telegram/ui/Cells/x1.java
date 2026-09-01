package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.g90;
import org.telegram.ui.nd;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class x1 extends g90 {
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(Object obj, Context context, int i10) {
        super(context, null);
        this.I = i10;
        this.J = obj;
    }

    @Override // org.telegram.ui.Components.g90
    public int a() {
        switch (this.I) {
            case 4:
                return ((UndoView) this.J).a;
            default:
                return super.a();
        }
    }

    @Override // org.telegram.ui.Components.g90
    public int c() {
        switch (this.I) {
            case 1:
                Integer num = ((a9) this.J).d;
                if (num == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.c();
    }

    @Override // org.telegram.ui.Components.g90, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.I) {
            case 0:
                super.onDraw(canvas);
                ((z1) this.J).f();
                break;
            case 1:
                a9 a9Var = (a9) this.J;
                a9Var.b();
                super.onDraw(canvas);
                a9Var.a();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.TextView, java.lang.Object, org.telegram.ui.Cells.x1, org.telegram.ui.Components.g90] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Components.g90, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.I) {
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
                        charSequence.setSpan(new ForegroundColorSpan(((org.telegram.ui.oa) this.J).e.getThemedColor(org.telegram.ui.ActionBar.k6.p7)), 0, indexOf, 33);
                    }
                    g51[] g51VarArr = (g51[]) charSequence.getSpans(0, charSequence.length(), g51.class);
                    for (int i10 = 0; i10 < g51VarArr.length; i10++) {
                        charSequence.setSpan(new fg.l0(this, 2), charSequence.getSpanStart(g51VarArr[i10]), charSequence.getSpanEnd(g51VarArr[i10]), 33);
                        charSequence.removeSpan(g51VarArr[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
            case 3:
                nd ndVar = (nd) this.J;
                if (charSequence != 0) {
                    charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new ForegroundColorSpan(ndVar.getThemedColor(org.telegram.ui.ActionBar.k6.p7)), 0, indexOf2, 33);
                    }
                    g51[] g51VarArr2 = (g51[]) charSequence.getSpans(0, charSequence.length(), g51.class);
                    EditTextBoldCursor editTextBoldCursor = ndVar.w;
                    String obj = (editTextBoldCursor == null || editTextBoldCursor.getText() == null) ? "" : ndVar.w.getText().toString();
                    for (int i11 = 0; i11 < g51VarArr2.length; i11++) {
                        charSequence.setSpan(new i(4, (Object) this, obj), charSequence.getSpanStart(g51VarArr2[i11]), charSequence.getSpanEnd(g51VarArr2[i11]), 33);
                        charSequence.removeSpan(g51VarArr2[i11]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(a9 a9Var, Context context, d90 d90Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, d90Var, g6Var);
        this.I = 1;
        this.J = a9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(UndoView undoView, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.I = 4;
        this.J = undoView;
    }
}
