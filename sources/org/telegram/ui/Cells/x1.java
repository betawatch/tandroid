package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import kh.lb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.l80;
import org.telegram.ui.id;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x1 extends l80 {
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(Object obj, Context context, int i9) {
        super(context, null);
        this.H = i9;
        this.I = obj;
    }

    @Override // org.telegram.ui.Components.l80
    public int a() {
        switch (this.H) {
            case 4:
                return ((UndoView) this.I).a;
            default:
                return super.a();
        }
    }

    @Override // org.telegram.ui.Components.l80
    public int c() {
        switch (this.H) {
            case 1:
                Integer num = ((b9) this.I).d;
                if (num == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.c();
    }

    @Override // org.telegram.ui.Components.l80, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                super.onDraw(canvas);
                ((z1) this.I).f();
                break;
            case 1:
                b9 b9Var = (b9) this.I;
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
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.TextView, java.lang.Object, org.telegram.ui.Cells.x1, org.telegram.ui.Components.l80] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Components.l80, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.H) {
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
                        charSequence.setSpan(new ForegroundColorSpan(((org.telegram.ui.la) this.I).e.getThemedColor(org.telegram.ui.ActionBar.f6.p7)), 0, indexOf, 33);
                    }
                    i41[] i41VarArr = (i41[]) charSequence.getSpans(0, charSequence.length(), i41.class);
                    for (int i9 = 0; i9 < i41VarArr.length; i9++) {
                        charSequence.setSpan(new lb(this, 1), charSequence.getSpanStart(i41VarArr[i9]), charSequence.getSpanEnd(i41VarArr[i9]), 33);
                        charSequence.removeSpan(i41VarArr[i9]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
            case 3:
                id idVar = (id) this.I;
                if (charSequence != 0) {
                    charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new ForegroundColorSpan(idVar.getThemedColor(org.telegram.ui.ActionBar.f6.p7)), 0, indexOf2, 33);
                    }
                    i41[] i41VarArr2 = (i41[]) charSequence.getSpans(0, charSequence.length(), i41.class);
                    EditTextBoldCursor editTextBoldCursor = idVar.w;
                    String obj = (editTextBoldCursor == null || editTextBoldCursor.getText() == null) ? "" : idVar.w.getText().toString();
                    for (int i10 = 0; i10 < i41VarArr2.length; i10++) {
                        charSequence.setSpan(new i(4, (Object) this, obj), charSequence.getSpanStart(i41VarArr2[i10]), charSequence.getSpanEnd(i41VarArr2[i10]), 33);
                        charSequence.removeSpan(i41VarArr2[i10]);
                    }
                }
                super.setText(charSequence, bufferType);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(b9 b9Var, Context context, i80 i80Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i80Var, b6Var);
        this.H = 1;
        this.I = b9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(UndoView undoView, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.H = 4;
        this.I = undoView;
    }
}
