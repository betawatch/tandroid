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
import c8.ha;
import di.l6;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.x8;
import org.telegram.ui.Components.xz;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l1 extends FrameLayout {
    public final h6 a;
    public final x8 b;
    public final TextView[] c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f;

    public l1(Context context, h6 h6Var) {
        super(context);
        this.c = new TextView[2];
        this.d = new TextView[2];
        this.a = h6Var;
        setWillNotDraw(false);
        x8 x8Var = new x8(this, false);
        this.b = x8Var;
        x8Var.l = true;
        x8Var.p = org.telegram.messenger.g0.L(75.0f);
        x8Var.o = org.telegram.messenger.g0.L(48.0f);
        x8Var.x = true;
        x8Var.s = org.telegram.messenger.g0.L(22.0f);
        int i7 = 0;
        while (i7 < 2) {
            this.c[i7] = new TextView(context);
            t6.U(this.c[i7], m6.G6, h6Var);
            this.c[i7].setTypeface(org.telegram.messenger.g0.o());
            this.c[i7].setTextSize(1, 14.0f);
            int i10 = 8;
            this.c[i7].setVisibility(i7 == 0 ? 0 : 8);
            addView(this.c[i7], ha.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i7] = new TextView(context);
            t6.U(this.d[i7], m6.z6, h6Var);
            this.d[i7].setTextSize(1, 12.0f);
            TextView textView = this.d[i7];
            if (i7 == 0) {
                i10 = 0;
            }
            textView.setVisibility(i10);
            addView(this.d[i7], ha.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
            i7++;
        }
        ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.msg_arrowright);
        t6.s(e10, m6.P5, h6Var, PorterDuff.Mode.SRC_IN);
        addView(e10, ha.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(l6 l6Var) {
        String str;
        x8 x8Var;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = l6Var.i;
            str = l6Var.D;
            int size = arrayList.size();
            x8Var = this.b;
            if (i7 >= size || i10 >= 3) {
                break;
            }
            ij ijVar = (ij) l6Var.i.get(i7);
            long j3 = ijVar.l.dialogId;
            TextUtils.isEmpty(str);
            x8Var.j(i10, l6Var.c, ijVar.l);
            i10++;
            i7++;
        }
        x8Var.i(i10);
        x8Var.a(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[0].setText(id.H(' ', "HashtagStoriesFound", l6Var.J));
        } else {
            textViewArr[0].setText(c(id.K("HashtagStoriesFoundChannel", l6Var.J, ' ', rf.b.i("@", str))));
        }
        this.d[0].setText(id.a0(null, null, 2131749348, l6Var.C));
        return i10 > 0;
    }

    public final void b(int i7, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[1].setText(id.H(' ', "HashtagMessagesFound", i7));
        } else {
            textViewArr[1].setText(c(id.K("HashtagMessagesFoundChannel", i7, ' ', rf.b.i("@", str2))));
        }
        this.d[1].setText(id.a0(null, null, 2131749357, str));
    }

    public final SpannableStringBuilder c(String str) {
        int i7 = m6.Ci;
        h6 h6Var = this.a;
        SpannableStringBuilder Q2 = org.telegram.messenger.g0.Q2(str, i7, h6Var, null, false);
        try {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) Q2.getSpans(0, Q2.length(), CharacterStyle.class);
            for (int i10 = 0; i10 < characterStyleArr.length; i10++) {
                int spanStart = Q2.getSpanStart(characterStyleArr[i10]);
                int spanEnd = Q2.getSpanEnd(characterStyleArr[i10]);
                Q2.removeSpan(characterStyleArr[i10]);
                Q2.setSpan(new xz(m6.Ci, h6Var), spanStart, spanEnd, 0);
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
