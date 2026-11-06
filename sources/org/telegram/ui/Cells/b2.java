package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xz;
import org.telegram.ui.bd;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class b2 extends w70 {
    public final /* synthetic */ int L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(int i7, Context context, Object obj) {
        super(context, null);
        this.L = i7;
        this.M = obj;
    }

    @Override // org.telegram.ui.Components.w70
    public int a() {
        switch (this.L) {
            case 4:
                return ((UndoView) this.M).a;
            default:
                return super.a();
        }
    }

    @Override // org.telegram.ui.Components.w70
    public int c() {
        switch (this.L) {
            case 1:
                Integer num = ((z8) this.M).d;
                if (num == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.c();
    }

    @Override // org.telegram.ui.Components.w70, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.L) {
            case 0:
                super.onDraw(canvas);
                ((c2) this.M).f();
                break;
            case 1:
                z8 z8Var = (z8) this.M;
                z8Var.b();
                super.onDraw(canvas);
                z8Var.a();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.TextView, java.lang.Object, org.telegram.ui.Cells.b2, org.telegram.ui.Components.w70] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Components.w70, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.L) {
            case 0:
                super.setText(org.telegram.messenger.i6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            case 1:
            default:
                super.setText(charSequence, bufferType);
                break;
            case 2:
                if (charSequence != 0) {
                    charSequence = org.telegram.messenger.g0.X2(charSequence.toString());
                    int indexOf = charSequence.toString().indexOf(10);
                    if (indexOf >= 0) {
                        charSequence.replace(indexOf, indexOf + 1, " ");
                        charSequence.setSpan(new xz(org.telegram.ui.ActionBar.k6.p7, ((org.telegram.ui.ka) this.M).e.getResourceProvider()), 0, indexOf, 33);
                    }
                    u31[] u31VarArr = (u31[]) charSequence.getSpans(0, charSequence.length(), u31.class);
                    for (int i7 = 0; i7 < u31VarArr.length; i7++) {
                        charSequence.setSpan(new fi.ka(this, 2), charSequence.getSpanStart(u31VarArr[i7]), charSequence.getSpanEnd(u31VarArr[i7]), 33);
                        charSequence.removeSpan(u31VarArr[i7]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
            case 3:
                bd bdVar = (bd) this.M;
                if (charSequence != 0) {
                    charSequence = org.telegram.messenger.g0.X2(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new xz(org.telegram.ui.ActionBar.k6.p7, bdVar.getResourceProvider()), 0, indexOf2, 33);
                    }
                    u31[] u31VarArr2 = (u31[]) charSequence.getSpans(0, charSequence.length(), u31.class);
                    EditTextBoldCursor editTextBoldCursor = bdVar.y;
                    String obj = (editTextBoldCursor == null || editTextBoldCursor.getText() == null) ? "" : bdVar.y.getText().toString();
                    for (int i10 = 0; i10 < u31VarArr2.length; i10++) {
                        charSequence.setSpan(new h(4, (Object) this, obj), charSequence.getSpanStart(u31VarArr2[i10]), charSequence.getSpanEnd(u31VarArr2[i10]), 33);
                        charSequence.removeSpan(u31VarArr2[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(z8 z8Var, Context context, n2.n0 n0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, n0Var, f6Var);
        this.L = 1;
        this.M = z8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(UndoView undoView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.L = 4;
        this.M = undoView;
    }
}
