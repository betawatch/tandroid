package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.tz;
import org.telegram.ui.ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b2 extends s70 {
    public final /* synthetic */ int M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(int i3, Context context, Object obj) {
        super(context, null);
        this.M = i3;
        this.N = obj;
    }

    @Override // org.telegram.ui.Components.s70
    public int a() {
        switch (this.M) {
            case 4:
                return ((UndoView) this.N).a;
            default:
                return super.a();
        }
    }

    @Override // org.telegram.ui.Components.s70
    public int c() {
        switch (this.M) {
            case 1:
                Integer num = ((y8) this.N).d;
                if (num == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.c();
    }

    @Override // org.telegram.ui.Components.s70, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.M) {
            case 0:
                super.onDraw(canvas);
                ((c2) this.N).f();
                break;
            case 1:
                y8 y8Var = (y8) this.N;
                y8Var.b();
                super.onDraw(canvas);
                y8Var.a();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.TextView, java.lang.Object, org.telegram.ui.Cells.b2, org.telegram.ui.Components.s70] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Components.s70, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.M) {
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
                        charSequence.setSpan(new tz(org.telegram.ui.ActionBar.k6.p7, ((org.telegram.ui.ja) this.N).e.getResourceProvider()), 0, indexOf, 33);
                    }
                    o31[] o31VarArr = (o31[]) charSequence.getSpans(0, charSequence.length(), o31.class);
                    for (int i3 = 0; i3 < o31VarArr.length; i3++) {
                        charSequence.setSpan(new gi.ka(this, 2), charSequence.getSpanStart(o31VarArr[i3]), charSequence.getSpanEnd(o31VarArr[i3]), 33);
                        charSequence.removeSpan(o31VarArr[i3]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
            case 3:
                ad adVar = (ad) this.N;
                if (charSequence != 0) {
                    charSequence = org.telegram.messenger.g0.X2(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new tz(org.telegram.ui.ActionBar.k6.p7, adVar.getResourceProvider()), 0, indexOf2, 33);
                    }
                    o31[] o31VarArr2 = (o31[]) charSequence.getSpans(0, charSequence.length(), o31.class);
                    EditTextBoldCursor editTextBoldCursor = adVar.y;
                    String obj = (editTextBoldCursor == null || editTextBoldCursor.getText() == null) ? "" : adVar.y.getText().toString();
                    for (int i10 = 0; i10 < o31VarArr2.length; i10++) {
                        charSequence.setSpan(new h(4, (Object) this, obj), charSequence.getSpanStart(o31VarArr2[i10]), charSequence.getSpanEnd(o31VarArr2[i10]), 33);
                        charSequence.removeSpan(o31VarArr2[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(y8 y8Var, Context context, m2.p0 p0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, p0Var, e6Var);
        this.M = 1;
        this.N = y8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(UndoView undoView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.M = 4;
        this.N = undoView;
    }
}
