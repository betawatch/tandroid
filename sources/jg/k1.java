package jg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ma;
import fi.b6;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.k00;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class k1 extends FrameLayout {
    public final h6 a;
    public final d9 b;
    public final TextView[] c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f;

    public k1(Context context, h6 h6Var) {
        super(context);
        this.c = new TextView[2];
        this.d = new TextView[2];
        this.a = h6Var;
        setWillNotDraw(false);
        d9 d9Var = new d9(this, false);
        this.b = d9Var;
        d9Var.l = true;
        d9Var.p = org.telegram.messenger.g0.L(75.0f);
        d9Var.o = org.telegram.messenger.g0.L(48.0f);
        d9Var.x = true;
        d9Var.s = org.telegram.messenger.g0.L(22.0f);
        int i7 = 0;
        while (i7 < 2) {
            this.c[i7] = new TextView(context);
            t6.U(this.c[i7], m6.G6, h6Var);
            this.c[i7].setTypeface(org.telegram.messenger.g0.o());
            this.c[i7].setTextSize(1, 14.0f);
            int i10 = 8;
            this.c[i7].setVisibility(i7 == 0 ? 0 : 8);
            addView(this.c[i7], ma.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i7] = new TextView(context);
            t6.U(this.d[i7], m6.z6, h6Var);
            this.d[i7].setTextSize(1, 12.0f);
            TextView textView = this.d[i7];
            if (i7 == 0) {
                i10 = 0;
            }
            textView.setVisibility(i10);
            addView(this.d[i7], ma.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
            i7++;
        }
        ImageView e10 = n10.e(context, R.drawable.msg_arrowright);
        t6.s(e10, m6.P5, h6Var, PorterDuff.Mode.SRC_IN);
        addView(e10, ma.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(b6 b6Var) {
        String str;
        d9 d9Var;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = b6Var.i;
            str = b6Var.D;
            int size = arrayList.size();
            d9Var = this.b;
            if (i7 >= size || i10 >= 3) {
                break;
            }
            fj fjVar = (fj) b6Var.i.get(i7);
            long j3 = fjVar.l.dialogId;
            TextUtils.isEmpty(str);
            d9Var.j(i10, b6Var.c, fjVar.l);
            i10++;
            i7++;
        }
        d9Var.i(i10);
        d9Var.a(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[0].setText(gd.H(' ', "HashtagStoriesFound", b6Var.J));
        } else {
            textViewArr[0].setText(c(gd.K("HashtagStoriesFoundChannel", b6Var.J, ' ', p5.c.k("@", str))));
        }
        this.d[0].setText(gd.a0(null, null, 2131749155, b6Var.C));
        return i10 > 0;
    }

    public final void b(int i7, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[1].setText(gd.H(' ', "HashtagMessagesFound", i7));
        } else {
            textViewArr[1].setText(c(gd.K("HashtagMessagesFoundChannel", i7, ' ', p5.c.k("@", str2))));
        }
        this.d[1].setText(gd.a0(null, null, 2131749164, str));
    }

    public final SpannableStringBuilder c(String str) {
        int i7 = m6.Fi;
        h6 h6Var = this.a;
        SpannableStringBuilder Q2 = org.telegram.messenger.g0.Q2(str, i7, h6Var, null, false);
        try {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) Q2.getSpans(0, Q2.length(), CharacterStyle.class);
            for (int i10 = 0; i10 < characterStyleArr.length; i10++) {
                int spanStart = Q2.getSpanStart(characterStyleArr[i10]);
                int spanEnd = Q2.getSpanEnd(characterStyleArr[i10]);
                Q2.removeSpan(characterStyleArr[i10]);
                Q2.setSpan(new k00(m6.Fi, h6Var), spanStart, spanEnd, 0);
            }
            return Q2;
        } catch (Exception e10) {
            a8.g(e10, true);
            return Q2;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.e) * 255.0f), 31);
        } else {
            canvas.save();
        }
        canvas.translate(org.telegram.messenger.g0.W1(this.e, 0, -org.telegram.messenger.g0.L(62.0f)), 0.0f);
        this.b.g(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint W0 = m6.W0("paintDivider", this.a);
        if (W0 == null) {
            W0 = m6.k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), W0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }
}
