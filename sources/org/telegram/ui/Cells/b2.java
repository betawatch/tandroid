package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.x41;
import org.telegram.ui.kd;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b2 extends p80 {
    public final /* synthetic */ int L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override // org.telegram.ui.Components.p80
    public int a() {
        switch (this.L) {
            case 4:
                return ((UndoView) this.M).a;
            default:
                return super.a();
        }
    }

    @Override // org.telegram.ui.Components.p80
    public int c() {
        switch (this.L) {
            case 1:
                Integer num = ((b9) this.M).d;
                if (num == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.c();
    }

    @Override // org.telegram.ui.Components.p80, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.L) {
            case 0:
                super.onDraw(canvas);
                ((c2) this.M).f();
                break;
            case 1:
                b9 b9Var = (b9) this.M;
                b9Var.b();
                super.onDraw(canvas);
                b9Var.a();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.TextView, java.lang.Object, org.telegram.ui.Cells.b2, org.telegram.ui.Components.p80] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Components.p80, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.L) {
            case 0:
                super.setText(org.telegram.messenger.k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            case 1:
            default:
                super.setText(charSequence, bufferType);
                break;
            case 2:
                if (charSequence != 0) {
                    charSequence = org.telegram.messenger.i0.W2(charSequence.toString());
                    int indexOf = charSequence.toString().indexOf(10);
                    if (indexOf >= 0) {
                        charSequence.replace(indexOf, indexOf + 1, " ");
                        charSequence.setSpan(new l00(org.telegram.ui.ActionBar.t6.p7, ((org.telegram.ui.na) this.M).e.getResourceProvider()), 0, indexOf, 33);
                    }
                    x41[] x41VarArr = (x41[]) charSequence.getSpans(0, charSequence.length(), x41.class);
                    for (int i10 = 0; i10 < x41VarArr.length; i10++) {
                        charSequence.setSpan(new dh.a(this, 3), charSequence.getSpanStart(x41VarArr[i10]), charSequence.getSpanEnd(x41VarArr[i10]), 33);
                        charSequence.removeSpan(x41VarArr[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
            case 3:
                kd kdVar = (kd) this.M;
                if (charSequence != 0) {
                    charSequence = org.telegram.messenger.i0.W2(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new l00(org.telegram.ui.ActionBar.t6.p7, kdVar.getResourceProvider()), 0, indexOf2, 33);
                    }
                    x41[] x41VarArr2 = (x41[]) charSequence.getSpans(0, charSequence.length(), x41.class);
                    EditTextBoldCursor editTextBoldCursor = kdVar.y;
                    String obj = (editTextBoldCursor == null || editTextBoldCursor.getText() == null) ? "" : kdVar.y.getText().toString();
                    for (int i11 = 0; i11 < x41VarArr2.length; i11++) {
                        charSequence.setSpan(new h(4, (Object) this, obj), charSequence.getSpanStart(x41VarArr2[i11]), charSequence.getSpanEnd(x41VarArr2[i11]), 33);
                        charSequence.removeSpan(x41VarArr2[i11]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(b9 b9Var, Context context, ji.a aVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, aVar, p6Var);
        this.L = 1;
        this.M = b9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(UndoView undoView, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.L = 4;
        this.M = undoView;
    }
}
