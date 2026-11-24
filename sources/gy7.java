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
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gy7 extends FrameLayout implements vlb {
    public boolean a;
    public int b;
    public final int c;
    public final ylb d;
    public final FrameLayout e;
    public final bf0 f;
    public final TextView h;
    public final TextView n;
    public final ImageView r;
    public boolean s;
    public String w;

    public gy7(int i, ylb ylbVar, Context context) {
        super(context);
        this.c = i;
        this.d = ylbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, qoe.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        bf0 bf0Var = new bf0(context);
        this.f = bf0Var;
        bf0Var.setImageResource(R.drawable.msg2_permissions);
        a();
        frameLayout.addView(bf0Var, qoe.e(36, 36, 17));
        TextView b = jxe.b(context, 15.0f, cmb.F6, true, null);
        this.h = b;
        b.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b.setEllipsize(truncateAt);
        addView(b, qoe.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i2 = cmb.x6;
        TextView b2 = jxe.b(context, 13.0f, i2, false, null);
        this.n = b2;
        b2.setSingleLine();
        b2.setEllipsize(truncateAt);
        addView(b2, qoe.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.r = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        anb.s(imageView, i2, null, PorterDuff.Mode.SRC_IN);
        int i3 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i3, ylbVar), 1, -1);
        wmb M = anb.M(i3);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M, ylbVar);
        addView(imageView, qoe.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    public final void a() {
        this.b = cmb.p1(0.3f, cmb.v0(cmb.F6, this.d));
        this.a = true;
        this.f.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff.Mode.SRC_IN));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.s) {
            Paint U0 = cmb.U0("paintDivider", this.d);
            if (U0 == null) {
                U0 = cmb.j0;
            }
            canvas.drawRect(gm.L(jb6.a0 ? 0.0f : 72.0f), getMeasuredHeight() - 1, getWidth() - gm.L(jb6.a0 ? 72.0f : 0.0f), getMeasuredHeight(), U0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), TLObject.FLAG_30));
    }

    @Override // vlb
    public final void updateColors() {
        bf0 bf0Var;
        int p1;
        try {
            if (!this.a || (bf0Var = this.f) == null || (p1 = cmb.p1(0.3f, cmb.v0(cmb.F6, this.d))) == this.b) {
                return;
            }
            this.b = p1;
            bf0Var.setColorFilter(new PorterDuffColorFilter(p1, PorterDuff.Mode.SRC_IN));
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
