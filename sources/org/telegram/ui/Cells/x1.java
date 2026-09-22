package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import ci.dc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.z80;
import org.telegram.ui.ld;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class x1 extends c90 {
    public final /* synthetic */ int L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override // org.telegram.ui.Components.c90
    public int a() {
        switch (this.L) {
            case 4:
                return ((UndoView) this.M).a;
            default:
                return super.a();
        }
    }

    @Override // org.telegram.ui.Components.c90
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

    @Override // org.telegram.ui.Components.c90, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.L) {
            case 0:
                super.onDraw(canvas);
                ((z1) this.M).f();
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
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.TextView, java.lang.Object, org.telegram.ui.Cells.x1, org.telegram.ui.Components.c90] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Components.c90, android.widget.TextView
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
                        charSequence.setSpan(new ForegroundColorSpan(((org.telegram.ui.pa) this.M).e.getThemedColor(org.telegram.ui.ActionBar.i6.p7)), 0, indexOf, 33);
                    }
                    f51[] f51VarArr = (f51[]) charSequence.getSpans(0, charSequence.length(), f51.class);
                    for (int i10 = 0; i10 < f51VarArr.length; i10++) {
                        charSequence.setSpan(new dc(this, 2), charSequence.getSpanStart(f51VarArr[i10]), charSequence.getSpanEnd(f51VarArr[i10]), 33);
                        charSequence.removeSpan(f51VarArr[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
            case 3:
                ld ldVar = (ld) this.M;
                if (charSequence != 0) {
                    charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new ForegroundColorSpan(ldVar.getThemedColor(org.telegram.ui.ActionBar.i6.p7)), 0, indexOf2, 33);
                    }
                    f51[] f51VarArr2 = (f51[]) charSequence.getSpans(0, charSequence.length(), f51.class);
                    EditTextBoldCursor editTextBoldCursor = ldVar.w;
                    String obj = (editTextBoldCursor == null || editTextBoldCursor.getText() == null) ? "" : ldVar.w.getText().toString();
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
    public x1(e9 e9Var, Context context, z80 z80Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, z80Var, e6Var);
        this.L = 1;
        this.M = e9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(UndoView undoView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.L = 4;
        this.M = undoView;
    }
}
