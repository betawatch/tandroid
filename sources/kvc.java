// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kvc extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final ylb a;
    public final p99 b;
    public final RectF c;
    public final RectF d;
    public final Path e;

    public kvc(Context context, ylb ylbVar) {
        super(context);
        p99 p99Var = new p99(this);
        this.b = p99Var;
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        setWillNotDraw(false);
        this.a = ylbVar;
        int v0 = cmb.v0(cmb.Yl, ylbVar);
        p99Var.B = v0;
        p99Var.A = v0;
        p99Var.z = v0;
        p99Var.x = cmb.p1(0.1f, v0);
        p99Var.j = false;
        p99Var.i = false;
        p99Var.k();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.c;
        rectF.set(0.0f, 0.0f, width, height);
        p99 p99Var = this.b;
        float[] fArr = p99Var.e;
        float L = gm.L(10.0f);
        fArr[7] = L;
        fArr[6] = L;
        fArr[1] = L;
        fArr[0] = L;
        float[] fArr2 = p99Var.e;
        float L2 = gm.L(10.0f);
        fArr2[5] = L2;
        fArr2[4] = L2;
        fArr2[3] = L2;
        fArr2[2] = L2;
        Path path = this.e;
        path.rewind();
        path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        this.b.e(canvas, rectF, 1.0f, false, false);
        float L3 = gm.L(3.0f);
        float height2 = getHeight();
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, L3, height2);
        p99Var.f(canvas, rectF2, 1.0f);
        canvas.restore();
    }

    public void setWebPage(TLRPC.WebPage webPage) {
        removeAllViews();
        boolean z = webPage.photo != null;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        String str = webPage.site_name;
        ylb ylbVar = this.a;
        if (str != null) {
            TextView textView = new TextView(getContext());
            textView.setTypeface(gm.o());
            textView.setText(webPage.site_name);
            textView.setTextSize(1, 14.0f);
            anb.X(textView, cmb.Yl, ylbVar);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.title != null) {
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(gm.o());
            textView2.setText(webPage.title);
            textView2.setTextSize(1, 14.0f);
            anb.X(textView2, cmb.i5, ylbVar);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        }
        if (webPage.description != null) {
            TextView textView3 = new TextView(getContext());
            textView3.setText(webPage.description);
            textView3.setTextSize(1, 13.0f);
            anb.X(textView3, cmb.i5, ylbVar);
            textView3.setMaxLines(4);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView3, qoe.o(-1, -2));
        }
        addView(linearLayout, qoe.d(-1, -2.0f, 51, 0.0f, 0.0f, z ? 56.0f : 0.0f, 0.0f));
        if (z) {
            bf0 bf0Var = new bf0(getContext());
            bf0Var.setRoundRadius(gm.L(6.0f));
            int L = gm.L(6.0f);
            int i = cmb.i5;
            ShapeDrawable b0 = cmb.b0(L, cmb.p1(0.08f, cmb.v0(i, ylbVar)));
            wmb K = anb.K(0.08f, i);
            bf0Var.setBackground(b0);
            anb.j(bf0Var, b0, K, null, ylbVar);
            addView(bf0Var, qoe.d(48, 48.0f, 53, 0.0f, 5.0f, 0.0f, 1.0f));
            TLRPC.PhotoSize w = bc4.w(webPage.photo.sizes, 40, false, null, false);
            bf0Var.g(1, 0L, gn5.f(bc4.w(webPage.photo.sizes, gm.L(36.0f), false, w, true), webPage.photo), gn5.f(w, webPage.photo), webPage, "48_48", "48_48_b", null);
        }
        setPadding(gm.L(10.0f), gm.L(2.0f), gm.L(7.0f), gm.L(6.0f));
    }
}
