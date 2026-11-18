package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.q9;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class f3 extends FrameLayout {
    public final int a;
    public final i6 b;
    public final q9 c;
    public final View d;
    public final View e;
    public final ImageView f;
    public final TextView h;
    public final TextView n;
    public final ImageView r;
    public boolean s;

    public f3(int i7, Context context, i6 i6Var) {
        super(context);
        this.a = i7;
        this.b = i6Var;
        q9 q9Var = new q9(context);
        this.c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        addView(q9Var, ma.d(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        int L = org.telegram.messenger.g0.L(11.0f);
        int i10 = n6.d6;
        Drawable L2 = n6.L(L, n6.w0(i10, i6Var));
        q6 M = u6.M(i10);
        view.setBackground(L2);
        u6.j(view, L2, M, null, i6Var);
        addView(view, ma.d(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.e = view2;
        int L3 = org.telegram.messenger.g0.L(9.665f);
        int i11 = n6.lk;
        Drawable L4 = n6.L(L3, n6.w0(i11, i6Var));
        q6 M2 = u6.M(i11);
        view2.setBackground(L4);
        u6.j(view2, L4, M2, null, i6Var);
        addView(view2, ma.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        addView(imageView, ma.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ma.d(-1, -2.0f, 55, 66.0f, 8.66f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        u6.U(textView, n6.G6, i6Var);
        ks.i(textView);
        TextView f10 = n10.f(linearLayout, textView, ma.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.n = f10;
        f10.setMaxLines(1);
        f10.setSingleLine(true);
        f10.setEllipsize(truncateAt);
        f10.setTextSize(1, 14.0f);
        u6.U(f10, n6.z6, i6Var);
        linearLayout.addView(f10, ma.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.r = imageView2;
        u6.s(imageView2, n6.M6, i6Var, PorterDuff.Mode.SRC_IN);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, ma.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.s) {
            canvas.drawRect(org.telegram.messenger.g0.L(72.0f), getHeight() - 1, getWidth(), getHeight(), n6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), TLObject.FLAG_30));
    }
}
