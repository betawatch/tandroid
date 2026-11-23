package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import hi.cb;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k41;
import org.telegram.ui.ad;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c2 extends j80 {
    public final /* synthetic */ int M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(int i7, Context context, Object obj) {
        super(context, null);
        this.M = i7;
        this.N = obj;
    }

    @Override // org.telegram.ui.Components.j80
    public int a() {
        switch (this.M) {
            case 4:
                return ((UndoView) this.N).a;
            default:
                return super.a();
        }
    }

    @Override // org.telegram.ui.Components.j80
    public int c() {
        switch (this.M) {
            case 1:
                Integer num = ((z8) this.N).d;
                if (num == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.c();
    }

    @Override // org.telegram.ui.Components.j80, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.M) {
            case 0:
                super.onDraw(canvas);
                ((d2) this.N).f();
                break;
            case 1:
                z8 z8Var = (z8) this.N;
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
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.TextView, java.lang.Object, org.telegram.ui.Cells.c2, org.telegram.ui.Components.j80] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Components.j80, android.widget.TextView
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
                        charSequence.setSpan(new i00(org.telegram.ui.ActionBar.n6.p7, ((org.telegram.ui.ka) this.N).e.getResourceProvider()), 0, indexOf, 33);
                    }
                    k41[] k41VarArr = (k41[]) charSequence.getSpans(0, charSequence.length(), k41.class);
                    for (int i7 = 0; i7 < k41VarArr.length; i7++) {
                        charSequence.setSpan(new cb(this, 2), charSequence.getSpanStart(k41VarArr[i7]), charSequence.getSpanEnd(k41VarArr[i7]), 33);
                        charSequence.removeSpan(k41VarArr[i7]);
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
                        charSequence.setSpan(new i00(org.telegram.ui.ActionBar.n6.p7, adVar.getResourceProvider()), 0, indexOf2, 33);
                    }
                    k41[] k41VarArr2 = (k41[]) charSequence.getSpans(0, charSequence.length(), k41.class);
                    EditTextBoldCursor editTextBoldCursor = adVar.y;
                    String obj = (editTextBoldCursor == null || editTextBoldCursor.getText() == null) ? "" : adVar.y.getText().toString();
                    for (int i10 = 0; i10 < k41VarArr2.length; i10++) {
                        charSequence.setSpan(new h(4, (Object) this, obj), charSequence.getSpanStart(k41VarArr2[i10]), charSequence.getSpanEnd(k41VarArr2[i10]), 33);
                        charSequence.removeSpan(k41VarArr2[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(z8 z8Var, Context context, n2.p0 p0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, p0Var, i6Var);
        this.M = 1;
        this.N = z8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(UndoView undoView, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.M = 4;
        this.N = undoView;
    }
}
