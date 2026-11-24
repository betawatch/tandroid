// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class gh8 extends FrameLayout {
    public final fn a;
    public final TextView b;
    public final mh2 c;
    public final /* synthetic */ ih8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh8(ih8 ih8Var, Context context) {
        super(context);
        this.d = ih8Var;
        anb.h(cmb.h5, null, this);
        fn fnVar = new fn(getContext());
        this.a = fnVar;
        fnVar.setTextSize(1, 14.0f);
        fnVar.setTypeface(gm.o());
        int i = cmb.e7;
        anb.X(fnVar, i, null);
        fnVar.setSingleLine(true);
        fnVar.setEllipsize(TextUtils.TruncateAt.END);
        fnVar.setGravity((jb6.a0 ? 5 : 3) | 16);
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        anb.X(textView, i, null);
        textView.setGravity((jb6.a0 ? 5 : 3) | 16);
        mh2 mh2Var = new mh2(this, getContext(), r7);
        this.c = mh2Var;
        mh2Var.setTextSize(gm.L(14.0f));
        anb.U(mh2Var, i, null);
        mh2Var.setGravity(jb6.a0 ? 3 : 5);
        mh2Var.setOnClickListener(new m67(this, (byte) 25));
        boolean z = jb6.a0;
        addView(fnVar, qoe.d(-2, -1.0f, (z ? 5 : 3) | 48, z ? 0 : 16, 0.0f, z ? 16 : 0, 0.0f));
        addView(textView, qoe.d(-2, -1.0f, (jb6.a0 ? 5 : 3) | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(mh2Var, qoe.d(-2, -1.0f, (jb6.a0 ? (byte) 3 : (byte) 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i, int i2, int i3, boolean z) {
        fn fnVar = this.a;
        if (arrayList != null) {
            nm7.i(fnVar);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            hs6.h(arrayList, str, spannableStringBuilder, -1);
            CharSequence m = gw3.m(spannableStringBuilder, fnVar.getPaint().getFontMetricsInt(), false, null, 0);
            k47.A5(m, arrayList, fnVar.getPaint().getFontMetricsInt(), false);
            fnVar.setText(m);
        } else {
            fnVar.setText(gw3.m(str, fnVar.getPaint().getFontMetricsInt(), false, null, 0));
        }
        String format = String.format("%d", Integer.valueOf(i));
        SpannableStringBuilder spannableStringBuilder2 = jb6.a0 ? new SpannableStringBuilder(aq1.n(i, "% – ")) : new SpannableStringBuilder(td4.o(i, " – ", "%"));
        spannableStringBuilder2.setSpan(new z5c(gm.o()), 3, format.length() + 3, 33);
        this.b.setText(spannableStringBuilder2);
        mh2 mh2Var = this.c;
        if (i3 == 0) {
            if (this.d.s1.quiz) {
                mh2Var.c(jb6.G(i2, "Answer", new Object[0]), z, true);
                return;
            } else {
                mh2Var.c(jb6.G(i2, "Vote", new Object[0]), z, true);
                return;
            }
        }
        if (i3 == 1) {
            mh2Var.c(jb6.M0(2131746904, null), z, true);
        } else {
            mh2Var.c(jb6.M0(2131746908, null), z, true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = jb6.a0;
        TextView textView = this.b;
        fn fnVar = this.a;
        if (z2) {
            int left = fnVar.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
        } else {
            int right = fnVar.getRight();
            textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), TLObject.FLAG_30);
        TextView textView = this.b;
        measureChildWithMargins(textView, i, 0, makeMeasureSpec, 0);
        mh2 mh2Var = this.c;
        measureChildWithMargins(mh2Var, i, 0, makeMeasureSpec, 0);
        measureChildWithMargins(this.a, i, gm.L(32.0f) + mh2Var.getMeasuredWidth() + textView.getMeasuredWidth(), makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(32.0f));
    }
}
