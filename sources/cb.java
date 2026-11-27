// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class cb extends FrameLayout implements snb {
    public final vnb a;
    public final de0 b;
    public final LinearLayout c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final ImageView n;
    public final za r;
    public int s;
    public final Paint w;
    public boolean x;

    public cb(Context context, vnb vnbVar) {
        super(context);
        this.w = new Paint(1);
        this.a = vnbVar;
        iye.b(this, 0.03f, 1.25f);
        de0 de0Var = new de0(context);
        this.b = de0Var;
        de0Var.setRoundRadius(hl.L(6.0f));
        addView(de0Var, tre.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, tre.r(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, tre.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = tre.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, tre.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, tre.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        za zaVar = new za(this, getContext(), vnbVar, (byte) 0);
        this.r = zaVar;
        zaVar.b(-1, aob.d6, aob.k7);
        zaVar.setDrawUnchecked(false);
        zaVar.setDrawBackgroundAsArc(3);
        addView(zaVar, tre.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.d6));
        hashSet.add(Integer.valueOf(aob.G6));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.x) {
            canvas.drawRect(hl.L(59.0f), getHeight() - Math.max(hl.L(0.66f), 1), getWidth(), getHeight(), this.w);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), TLObject.FLAG_30));
    }

    public void setChecked(boolean z) {
        this.r.a(z, true);
    }

    @Override // snb
    public final void updateColors() {
        int i = aob.d6;
        vnb vnbVar = this.a;
        int v0 = aob.v0(i, vnbVar);
        int v02 = aob.v0(aob.G6, vnbVar);
        this.s = v02;
        this.e.setTextColor(v02);
        this.f.setTextColor(aob.v(v0, aob.p1(0.55f, v02)));
        this.h.setTextColor(aob.p1(0.55f, v02));
        this.n.setColorFilter(new PorterDuffColorFilter(aob.p1(0.6f, v02), PorterDuff.Mode.SRC_IN));
        this.w.setColor(aob.p1(0.1f, v02));
        this.b.invalidate();
    }
}
