// default package

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ke1 extends l46 {
    public final /* synthetic */ byte M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ke1(byte b, Context context, Object obj) {
        super(context, null);
        this.M = b;
        this.N = obj;
    }

    @Override // l46
    public final int a() {
        switch (this.M) {
            case 4:
                return ((UndoView) this.N).a;
            default:
                return super.a();
        }
    }

    @Override // l46
    public final int c() {
        switch (this.M) {
            case 3:
                Integer num = ((mhb) this.N).d;
                if (num == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.c();
    }

    @Override // l46, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.M;
        Object obj = this.N;
        switch (b) {
            case 2:
                super.onDraw(canvas);
                ((ag2) obj).f();
                break;
            case 3:
                mhb mhbVar = (mhb) obj;
                mhbVar.b();
                super.onDraw(canvas);
                mhbVar.a();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.widget.TextView, java.lang.Object, ke1, l46] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.text.SpannableStringBuilder] */
    @Override // l46, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        byte b = this.M;
        Object obj = this.N;
        int i = 0;
        switch (b) {
            case 0:
                if (charSequence != 0) {
                    charSequence = gl.T2(charSequence.toString());
                    int indexOf = charSequence.toString().indexOf(10);
                    if (indexOf >= 0) {
                        charSequence.replace(indexOf, indexOf + 1, " ");
                        charSequence.setSpan(new cm4(bkb.o7, ((le1) obj).e.getResourceProvider()), 0, indexOf, 33);
                    }
                    z3c[] z3cVarArr = (z3c[]) charSequence.getSpans(0, charSequence.length(), z3c.class);
                    while (i < z3cVarArr.length) {
                        charSequence.setSpan(new r21(this, (byte) 1), charSequence.getSpanStart(z3cVarArr[i]), charSequence.getSpanEnd(z3cVarArr[i]), 33);
                        charSequence.removeSpan(z3cVarArr[i]);
                        i++;
                    }
                }
                super.setText(charSequence, bufferType);
                break;
            case 1:
                yh1 yh1Var = (yh1) obj;
                if (charSequence != 0) {
                    charSequence = gl.T2(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new cm4(bkb.o7, yh1Var.getResourceProvider()), 0, indexOf2, 33);
                    }
                    z3c[] z3cVarArr2 = (z3c[]) charSequence.getSpans(0, charSequence.length(), z3c.class);
                    EditTextBoldCursor editTextBoldCursor = yh1Var.y;
                    String obj2 = (editTextBoldCursor == null || editTextBoldCursor.getText() == null) ? "" : yh1Var.y.getText().toString();
                    while (i < z3cVarArr2.length) {
                        charSequence.setSpan(new q1((Object) this, (Object) obj2, (byte) 2), charSequence.getSpanStart(z3cVarArr2[i]), charSequence.getSpanEnd(z3cVarArr2[i]), 33);
                        charSequence.removeSpan(z3cVarArr2[i]);
                        i++;
                    }
                }
                super.setText(charSequence, bufferType);
                break;
            case 2:
                super.setText(vu3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            default:
                super.setText(charSequence, bufferType);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke1(mhb mhbVar, Context context, i46 i46Var, wjb wjbVar) {
        super(context, i46Var, wjbVar);
        this.M = (byte) 3;
        this.N = mhbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke1(UndoView undoView, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.M = (byte) 4;
        this.N = undoView;
    }
}
