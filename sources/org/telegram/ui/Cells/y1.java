package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import ei.kb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.x90;
import org.telegram.ui.md;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class y1 extends x90 {
    public final /* synthetic */ int L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override // org.telegram.ui.Components.x90
    public int a() {
        switch (this.L) {
            case 4:
                return ((UndoView) this.M).a;
            default:
                return super.a();
        }
    }

    @Override // org.telegram.ui.Components.x90
    public int c() {
        switch (this.L) {
            case 1:
                Integer num = ((d9) this.M).d;
                if (num == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.c();
    }

    @Override // org.telegram.ui.Components.x90, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.L) {
            case 0:
                super.onDraw(canvas);
                ((a2) this.M).f();
                break;
            case 1:
                d9 d9Var = (d9) this.M;
                d9Var.b();
                super.onDraw(canvas);
                d9Var.a();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.TextView, java.lang.Object, org.telegram.ui.Cells.y1, org.telegram.ui.Components.x90] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Components.x90, android.widget.TextView
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
                        charSequence.setSpan(new ForegroundColorSpan(((org.telegram.ui.ra) this.M).e.getThemedColor(org.telegram.ui.ActionBar.h6.p7)), 0, indexOf, 33);
                    }
                    d61[] d61VarArr = (d61[]) charSequence.getSpans(0, charSequence.length(), d61.class);
                    for (int i10 = 0; i10 < d61VarArr.length; i10++) {
                        charSequence.setSpan(new kb(this, 2), charSequence.getSpanStart(d61VarArr[i10]), charSequence.getSpanEnd(d61VarArr[i10]), 33);
                        charSequence.removeSpan(d61VarArr[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
            case 3:
                md mdVar = (md) this.M;
                if (charSequence != 0) {
                    charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new ForegroundColorSpan(mdVar.getThemedColor(org.telegram.ui.ActionBar.h6.p7)), 0, indexOf2, 33);
                    }
                    d61[] d61VarArr2 = (d61[]) charSequence.getSpans(0, charSequence.length(), d61.class);
                    EditTextBoldCursor editTextBoldCursor = mdVar.w;
                    String obj = (editTextBoldCursor == null || editTextBoldCursor.getText() == null) ? "" : mdVar.w.getText().toString();
                    for (int i11 = 0; i11 < d61VarArr2.length; i11++) {
                        charSequence.setSpan(new i(4, (Object) this, obj), charSequence.getSpanStart(d61VarArr2[i11]), charSequence.getSpanEnd(d61VarArr2[i11]), 33);
                        charSequence.removeSpan(d61VarArr2[i11]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(d9 d9Var, Context context, u90 u90Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, u90Var, d6Var);
        this.L = 1;
        this.M = d9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(UndoView undoView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.L = 4;
        this.M = undoView;
    }
}
