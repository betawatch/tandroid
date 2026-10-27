package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import fi.hb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.nd;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w1 extends aa0 {
    public final /* synthetic */ int L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override // org.telegram.ui.Components.aa0
    public int a() {
        switch (this.L) {
            case 4:
                return ((UndoView) this.M).a;
            default:
                return super.a();
        }
    }

    @Override // org.telegram.ui.Components.aa0
    public int c() {
        switch (this.L) {
            case 1:
                Integer num = ((i9) this.M).d;
                if (num == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.c();
    }

    @Override // org.telegram.ui.Components.aa0, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.L) {
            case 0:
                super.onDraw(canvas);
                ((y1) this.M).f();
                break;
            case 1:
                i9 i9Var = (i9) this.M;
                i9Var.b();
                super.onDraw(canvas);
                i9Var.a();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.TextView, java.lang.Object, org.telegram.ui.Cells.w1, org.telegram.ui.Components.aa0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Components.aa0, android.widget.TextView
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
                        charSequence.setSpan(new p10(org.telegram.ui.ActionBar.y6.p7, ((org.telegram.ui.sa) this.M).e.getResourceProvider()), 0, indexOf, 33);
                    }
                    r61[] r61VarArr = (r61[]) charSequence.getSpans(0, charSequence.length(), r61.class);
                    for (int i10 = 0; i10 < r61VarArr.length; i10++) {
                        charSequence.setSpan(new hb(this, 2), charSequence.getSpanStart(r61VarArr[i10]), charSequence.getSpanEnd(r61VarArr[i10]), 33);
                        charSequence.removeSpan(r61VarArr[i10]);
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
                        charSequence.setSpan(new p10(org.telegram.ui.ActionBar.y6.p7, ndVar.getResourceProvider()), 0, indexOf2, 33);
                    }
                    r61[] r61VarArr2 = (r61[]) charSequence.getSpans(0, charSequence.length(), r61.class);
                    EditTextBoldCursor editTextBoldCursor = ndVar.x;
                    String obj = (editTextBoldCursor == null || editTextBoldCursor.getText() == null) ? "" : ndVar.x.getText().toString();
                    for (int i11 = 0; i11 < r61VarArr2.length; i11++) {
                        charSequence.setSpan(new i(4, (Object) this, obj), charSequence.getSpanStart(r61VarArr2[i11]), charSequence.getSpanEnd(r61VarArr2[i11]), 33);
                        charSequence.removeSpan(r61VarArr2[i11]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(i9 i9Var, Context context, x90 x90Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, x90Var, u6Var);
        this.L = 1;
        this.M = i9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(UndoView undoView, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.L = 4;
        this.M = undoView;
    }
}
