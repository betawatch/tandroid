package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class d8 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final Paint a;
    public final Paint b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final org.telegram.ui.ActionBar.i6 f;

    public d8(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.f = i6Var;
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.q7, i6Var));
        paint2.setColor(-1);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.c = textView;
        i5.c.r(14.0f, 1, 2131744433, textView, null);
        textView.setTextColor(-1);
        addView(textView, ma.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 8.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.n6.r1(0.5f, -1));
        textView2.setVisibility(8);
        textView2.setTranslationY(org.telegram.messenger.g0.L(9.0f));
        addView(textView2, ma.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        int L = org.telegram.messenger.g0.L(16.0f);
        textView3.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 536870911, 956301311, 956301311));
        textView3.setTypeface(org.telegram.messenger.g0.o());
        n10.l(14.0f, 2131743706, 1, textView3, null);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        addView(textView3, ma.d(-2, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float L = org.telegram.messenger.g0.L(23.0f);
        float height = getHeight() / 2.0f;
        canvas.drawCircle(L, height, org.telegram.messenger.g0.L(10.0f), this.a);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(L - org.telegram.messenger.g0.L(1.0f), height - org.telegram.messenger.g0.N(4.6f), org.telegram.messenger.g0.L(1.0f) + L, org.telegram.messenger.g0.N(1.6f) + height);
        float L2 = org.telegram.messenger.g0.L(3.0f);
        float L3 = org.telegram.messenger.g0.L(3.0f);
        Paint paint = this.b;
        canvas.drawRoundRect(rectF, L2, L3, paint);
        rectF.set(L - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.N(2.6f) + height, L + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.N(4.6f) + height);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint);
    }

    public void set(TLRPC.TL_error tL_error) {
        TextView textView = this.c;
        TextView textView2 = this.d;
        if (tL_error == null || TextUtils.isEmpty(tL_error.text)) {
            textView.setTranslationY(0.0f);
            textView2.setVisibility(8);
        } else {
            textView.setTranslationY(-org.telegram.messenger.g0.N(5.33f));
            textView2.setText(tL_error.text);
            textView2.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            this.a.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.q7, this.f));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
