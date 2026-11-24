// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class ef8 extends FrameLayout {
    public final fm a;
    public final TextView b;
    public final yf2 c;
    public final /* synthetic */ gf8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef8(gf8 gf8Var, Context context) {
        super(context);
        this.d = gf8Var;
        zkb.h(bkb.h5, null, this);
        fm fmVar = new fm(getContext());
        this.a = fmVar;
        fmVar.setTextSize(1, 14.0f);
        fmVar.setTypeface(gl.o());
        int i = bkb.e7;
        zkb.X(fmVar, i, null);
        fmVar.setSingleLine(true);
        fmVar.setEllipsize(TextUtils.TruncateAt.END);
        fmVar.setGravity((k96.a0 ? 5 : 3) | 16);
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        zkb.X(textView, i, null);
        textView.setGravity((k96.a0 ? 5 : 3) | 16);
        yf2 yf2Var = new yf2(this, getContext(), r7);
        this.c = yf2Var;
        yf2Var.setTextSize(gl.L(14.0f));
        zkb.U(yf2Var, i, null);
        yf2Var.setGravity(k96.a0 ? 3 : 5);
        yf2Var.setOnClickListener(new fr7(this, (byte) 22));
        boolean z = k96.a0;
        addView(fmVar, nme.d(-2, -1.0f, (z ? 5 : 3) | 48, z ? 0 : 16, 0.0f, z ? 16 : 0, 0.0f));
        addView(textView, nme.d(-2, -1.0f, (k96.a0 ? 5 : 3) | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(yf2Var, nme.d(-2, -1.0f, (k96.a0 ? (byte) 3 : (byte) 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i, int i2, int i3, boolean z) {
        fm fmVar = this.a;
        if (arrayList != null) {
            kk7.i(fmVar);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            hq6.h(arrayList, str, spannableStringBuilder, -1);
            CharSequence m = vu3.m(spannableStringBuilder, fmVar.getPaint().getFontMetricsInt(), false, null, 0);
            k27.A5(m, arrayList, fmVar.getPaint().getFontMetricsInt(), false);
            fmVar.setText(m);
        } else {
            fmVar.setText(vu3.m(str, fmVar.getPaint().getFontMetricsInt(), false, null, 0));
        }
        String format = String.format("%d", Integer.valueOf(i));
        SpannableStringBuilder spannableStringBuilder2 = k96.a0 ? new SpannableStringBuilder(oo1.n(i, "% – ")) : new SpannableStringBuilder(tb4.n(i, " – ", "%"));
        spannableStringBuilder2.setSpan(new z3c(gl.o()), 3, format.length() + 3, 33);
        this.b.setText(spannableStringBuilder2);
        yf2 yf2Var = this.c;
        if (i3 == 0) {
            if (this.d.s1.quiz) {
                yf2Var.c(k96.G(i2, "Answer", new Object[0]), z, true);
                return;
            } else {
                yf2Var.c(k96.G(i2, "Vote", new Object[0]), z, true);
                return;
            }
        }
        if (i3 == 1) {
            yf2Var.c(k96.M0(2131746978, null), z, true);
        } else {
            yf2Var.c(k96.M0(2131746982, null), z, true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = k96.a0;
        TextView textView = this.b;
        fm fmVar = this.a;
        if (z2) {
            int left = fmVar.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
        } else {
            int right = fmVar.getRight();
            textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gl.L(32.0f), TLObject.FLAG_30);
        TextView textView = this.b;
        measureChildWithMargins(textView, i, 0, makeMeasureSpec, 0);
        yf2 yf2Var = this.c;
        measureChildWithMargins(yf2Var, i, 0, makeMeasureSpec, 0);
        measureChildWithMargins(this.a, i, gl.L(32.0f) + yf2Var.getMeasuredWidth() + textView.getMeasuredWidth(), makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(32.0f));
    }
}
