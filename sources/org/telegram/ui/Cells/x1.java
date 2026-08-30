package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.f51;
import org.telegram.ui.nd;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class x1 extends e90 {
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(Object obj, Context context, int i10) {
        super(context, null);
        this.I = i10;
        this.J = obj;
    }

    @Override // org.telegram.ui.Components.e90
    public int a() {
        switch (this.I) {
            case 4:
                return ((UndoView) this.J).a;
            default:
                return super.a();
        }
    }

    @Override // org.telegram.ui.Components.e90
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

    @Override // org.telegram.ui.Components.e90, android.widget.TextView, android.view.View
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
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.TextView, java.lang.Object, org.telegram.ui.Cells.x1, org.telegram.ui.Components.e90] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Components.e90, android.widget.TextView
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
                        charSequence.setSpan(new ForegroundColorSpan(((org.telegram.ui.oa) this.J).e.getThemedColor(org.telegram.ui.ActionBar.j6.p7)), 0, indexOf, 33);
                    }
                    f51[] f51VarArr = (f51[]) charSequence.getSpans(0, charSequence.length(), f51.class);
                    for (int i10 = 0; i10 < f51VarArr.length; i10++) {
                        charSequence.setSpan(new eg.l0(this, 2), charSequence.getSpanStart(f51VarArr[i10]), charSequence.getSpanEnd(f51VarArr[i10]), 33);
                        charSequence.removeSpan(f51VarArr[i10]);
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
                        charSequence.setSpan(new ForegroundColorSpan(ndVar.getThemedColor(org.telegram.ui.ActionBar.j6.p7)), 0, indexOf2, 33);
                    }
                    f51[] f51VarArr2 = (f51[]) charSequence.getSpans(0, charSequence.length(), f51.class);
                    EditTextBoldCursor editTextBoldCursor = ndVar.w;
                    String obj = (editTextBoldCursor == null || editTextBoldCursor.getText() == null) ? "" : ndVar.w.getText().toString();
                    for (int i11 = 0; i11 < f51VarArr2.length; i11++) {
                        charSequence.setSpan(new i(4, (Object) this, obj), charSequence.getSpanStart(f51VarArr2[i11]), charSequence.getSpanEnd(f51VarArr2[i11]), 33);
                        charSequence.removeSpan(f51VarArr2[i11]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(a9 a9Var, Context context, b90 b90Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, b90Var, f6Var);
        this.I = 1;
        this.J = a9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(UndoView undoView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.I = 4;
        this.J = undoView;
    }
}
