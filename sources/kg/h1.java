package kg;

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
import b8.mf;
import ei.l6;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.w8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h1 extends FrameLayout {
    public final e6 a;
    public final w8 b;
    public final TextView[] c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f;

    public h1(Context context, e6 e6Var) {
        super(context);
        this.c = new TextView[2];
        this.d = new TextView[2];
        this.a = e6Var;
        setWillNotDraw(false);
        w8 w8Var = new w8(this, false);
        this.b = w8Var;
        w8Var.l = true;
        w8Var.p = org.telegram.messenger.g0.L(75.0f);
        w8Var.o = org.telegram.messenger.g0.L(48.0f);
        w8Var.x = true;
        w8Var.s = org.telegram.messenger.g0.L(22.0f);
        int i3 = 0;
        while (i3 < 2) {
            this.c[i3] = new TextView(context);
            r6.V(this.c[i3], k6.G6, e6Var);
            this.c[i3].setTypeface(org.telegram.messenger.g0.o());
            this.c[i3].setTextSize(1, 14.0f);
            int i10 = 8;
            this.c[i3].setVisibility(i3 == 0 ? 0 : 8);
            addView(this.c[i3], mf.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i3] = new TextView(context);
            r6.V(this.d[i3], k6.z6, e6Var);
            this.d[i3].setTextSize(1, 12.0f);
            TextView textView = this.d[i3];
            if (i3 == 0) {
                i10 = 0;
            }
            textView.setVisibility(i10);
            addView(this.d[i3], mf.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
            i3++;
        }
        ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.msg_arrowright);
        r6.t(e10, k6.P5, e6Var, PorterDuff.Mode.SRC_IN);
        addView(e10, mf.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(l6 l6Var) {
        String str;
        w8 w8Var;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = l6Var.i;
            str = l6Var.D;
            int size = arrayList.size();
            w8Var = this.b;
            if (i3 >= size || i10 >= 3) {
                break;
            }
            zi ziVar = (zi) l6Var.i.get(i3);
            long j10 = ziVar.l.dialogId;
            TextUtils.isEmpty(str);
            w8Var.j(i10, l6Var.c, ziVar.l);
            i10++;
            i3++;
        }
        w8Var.i(i10);
        w8Var.a(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[0].setText(bd.H(' ', "HashtagStoriesFound", l6Var.J));
        } else {
            textViewArr[0].setText(c(bd.K("HashtagStoriesFoundChannel", l6Var.J, ' ', t4.c.f("@", str))));
        }
        this.d[0].setText(bd.a0(null, null, 2131749356, l6Var.C));
        return i10 > 0;
    }

    public final void b(int i3, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[1].setText(bd.H(' ', "HashtagMessagesFound", i3));
        } else {
            textViewArr[1].setText(c(bd.K("HashtagMessagesFoundChannel", i3, ' ', t4.c.f("@", str2))));
        }
        this.d[1].setText(bd.a0(null, null, 2131749365, str));
    }

    public final SpannableStringBuilder c(String str) {
        int i3 = k6.Ci;
        e6 e6Var = this.a;
        SpannableStringBuilder Q2 = org.telegram.messenger.g0.Q2(str, i3, e6Var, null, false);
        try {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) Q2.getSpans(0, Q2.length(), CharacterStyle.class);
            for (int i10 = 0; i10 < characterStyleArr.length; i10++) {
                int spanStart = Q2.getSpanStart(characterStyleArr[i10]);
                int spanEnd = Q2.getSpanEnd(characterStyleArr[i10]);
                Q2.removeSpan(characterStyleArr[i10]);
                Q2.setSpan(new tz(k6.Ci, e6Var), spanStart, spanEnd, 0);
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
        Paint W0 = k6.W0("paintDivider", this.a);
        if (W0 == null) {
            W0 = k6.k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), W0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }
}
