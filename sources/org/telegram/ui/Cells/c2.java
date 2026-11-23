package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.m80;
import org.telegram.ui.ad;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class c2 extends m80 {
    public final /* synthetic */ int M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(int i7, Context context, Object obj) {
        super(context, null);
        this.M = i7;
        this.N = obj;
    }

    @Override // org.telegram.ui.Components.m80
    public int a() {
        switch (this.M) {
            case 4:
                return ((UndoView) this.N).a;
            default:
                return super.a();
        }
    }

    @Override // org.telegram.ui.Components.m80
    public int c() {
        switch (this.M) {
            case 1:
                Integer num = ((a9) this.N).d;
                if (num == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.c();
    }

    @Override // org.telegram.ui.Components.m80, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.M) {
            case 0:
                super.onDraw(canvas);
                ((d2) this.N).f();
                break;
            case 1:
                a9 a9Var = (a9) this.N;
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
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.TextView, java.lang.Object, org.telegram.ui.Cells.c2, org.telegram.ui.Components.m80] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Components.m80, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.M) {
            case 0:
                super.setText(org.telegram.messenger.j6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            case 1:
            default:
                super.setText(charSequence, bufferType);
                break;
            case 2:
                if (charSequence != 0) {
                    charSequence = org.telegram.messenger.g0.W2(charSequence.toString());
                    int indexOf = charSequence.toString().indexOf(10);
                    if (indexOf >= 0) {
                        charSequence.replace(indexOf, indexOf + 1, " ");
                        charSequence.setSpan(new k00(org.telegram.ui.ActionBar.m6.p7, ((org.telegram.ui.ka) this.N).e.getResourceProvider()), 0, indexOf, 33);
                    }
                    l41[] l41VarArr = (l41[]) charSequence.getSpans(0, charSequence.length(), l41.class);
                    for (int i7 = 0; i7 < l41VarArr.length; i7++) {
                        charSequence.setSpan(new hi.ha(this, 2), charSequence.getSpanStart(l41VarArr[i7]), charSequence.getSpanEnd(l41VarArr[i7]), 33);
                        charSequence.removeSpan(l41VarArr[i7]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
            case 3:
                ad adVar = (ad) this.N;
                if (charSequence != 0) {
                    charSequence = org.telegram.messenger.g0.W2(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new k00(org.telegram.ui.ActionBar.m6.p7, adVar.getResourceProvider()), 0, indexOf2, 33);
                    }
                    l41[] l41VarArr2 = (l41[]) charSequence.getSpans(0, charSequence.length(), l41.class);
                    EditTextBoldCursor editTextBoldCursor = adVar.y;
                    String obj = (editTextBoldCursor == null || editTextBoldCursor.getText() == null) ? "" : adVar.y.getText().toString();
                    for (int i10 = 0; i10 < l41VarArr2.length; i10++) {
                        charSequence.setSpan(new h(4, (Object) this, obj), charSequence.getSpanStart(l41VarArr2[i10]), charSequence.getSpanEnd(l41VarArr2[i10]), 33);
                        charSequence.removeSpan(l41VarArr2[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(a9 a9Var, Context context, n2.o0 o0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, o0Var, h6Var);
        this.M = 1;
        this.N = a9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(UndoView undoView, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.M = 4;
        this.N = undoView;
    }
}
