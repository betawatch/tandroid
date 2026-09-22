package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.u9;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class b4 extends FrameLayout {
    public final int a;
    public final e6 b;
    public final u9 c;
    public final View d;
    public final View e;
    public final ImageView f;
    public final TextView h;
    public final TextView n;
    public final ImageView r;
    public boolean s;

    public b4(Context context, int i10, e6 e6Var) {
        super(context);
        this.a = i10;
        this.b = e6Var;
        u9 u9Var = new u9(context);
        this.c = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(u9Var, x5.d(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackground(i6.K(AndroidUtilities.dp(11.0f), i6.v0(i6.d6, e6Var)));
        addView(view, x5.d(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.e = view2;
        view2.setBackground(i6.K(AndroidUtilities.dp(9.665f), i6.v0(i6.uj, e6Var)));
        addView(view2, x5.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        addView(imageView, x5.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, x5.d(-1, -2.0f, 55, 66.0f, 8.66f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(i6.v0(i6.G6, e6Var));
        NotificationCenter.listenEmojiLoading(textView);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, x5.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.n = h;
        h.setMaxLines(1);
        h.setSingleLine(true);
        h.setEllipsize(truncateAt);
        h.setTextSize(1, 14.0f);
        h.setTextColor(i6.v0(i6.z6, e6Var));
        linearLayout.addView(h, x5.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.r = imageView2;
        imageView2.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.M6, e6Var), PorterDuff.Mode.SRC_IN));
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, x5.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth(), getHeight(), i6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), TLObject.FLAG_30));
    }
}
