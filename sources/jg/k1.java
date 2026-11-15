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
import c8.ja;
import fi.d6;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.v8;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k1 extends FrameLayout {
    public final e6 a;
    public final v8 b;
    public final TextView[] c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f;

    public k1(Context context, e6 e6Var) {
        super(context);
        this.c = new TextView[2];
        this.d = new TextView[2];
        this.a = e6Var;
        setWillNotDraw(false);
        v8 v8Var = new v8(this, false);
        this.b = v8Var;
        v8Var.l = true;
        v8Var.p = org.telegram.messenger.g0.L(75.0f);
        v8Var.o = org.telegram.messenger.g0.L(48.0f);
        v8Var.x = true;
        v8Var.s = org.telegram.messenger.g0.L(22.0f);
        int i7 = 0;
        while (i7 < 2) {
            this.c[i7] = new TextView(context);
            q6.U(this.c[i7], j6.G6, e6Var);
            this.c[i7].setTypeface(org.telegram.messenger.g0.o());
            this.c[i7].setTextSize(1, 14.0f);
            int i10 = 8;
            this.c[i7].setVisibility(i7 == 0 ? 0 : 8);
            addView(this.c[i7], ja.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i7] = new TextView(context);
            q6.U(this.d[i7], j6.z6, e6Var);
            this.d[i7].setTextSize(1, 12.0f);
            TextView textView = this.d[i7];
            if (i7 == 0) {
                i10 = 0;
            }
            textView.setVisibility(i10);
            addView(this.d[i7], ja.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
            i7++;
        }
        ImageView e10 = i20.e(context, R.drawable.msg_arrowright);
        q6.s(e10, j6.P5, e6Var, PorterDuff.Mode.SRC_IN);
        addView(e10, ja.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(d6 d6Var) {
        String str;
        v8 v8Var;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = d6Var.i;
            str = d6Var.D;
            int size = arrayList.size();
            v8Var = this.b;
            if (i7 >= size || i10 >= 3) {
                break;
            }
            gj gjVar = (gj) d6Var.i.get(i7);
            long j3 = gjVar.l.dialogId;
            TextUtils.isEmpty(str);
            v8Var.j(i10, d6Var.c, gjVar.l);
            i10++;
            i7++;
        }
        v8Var.i(i10);
        v8Var.a(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[0].setText(hd.H(' ', "HashtagStoriesFound", d6Var.J));
        } else {
            textViewArr[0].setText(c(hd.K("HashtagStoriesFoundChannel", d6Var.J, ' ', r.b.k("@", str))));
        }
        this.d[0].setText(hd.a0(null, null, 2131749348, d6Var.C));
        return i10 > 0;
    }

    public final void b(int i7, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[1].setText(hd.H(' ', "HashtagMessagesFound", i7));
        } else {
            textViewArr[1].setText(c(hd.K("HashtagMessagesFoundChannel", i7, ' ', r.b.k("@", str2))));
        }
        this.d[1].setText(hd.a0(null, null, 2131749357, str));
    }

    public final SpannableStringBuilder c(String str) {
        int i7 = j6.Fi;
        e6 e6Var = this.a;
        SpannableStringBuilder Q2 = org.telegram.messenger.g0.Q2(str, i7, e6Var, null, false);
        try {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) Q2.getSpans(0, Q2.length(), CharacterStyle.class);
            for (int i10 = 0; i10 < characterStyleArr.length; i10++) {
                int spanStart = Q2.getSpanStart(characterStyleArr[i10]);
                int spanEnd = Q2.getSpanEnd(characterStyleArr[i10]);
                Q2.removeSpan(characterStyleArr[i10]);
                Q2.setSpan(new b00(j6.Fi, e6Var), spanStart, spanEnd, 0);
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
        Paint W0 = j6.W0("paintDivider", this.a);
        if (W0 == null) {
            W0 = j6.k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), W0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }
}
