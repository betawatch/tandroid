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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dw7 extends FrameLayout implements tjb {
    public boolean a;
    public int b;
    public final int c;
    public final wjb d;
    public final FrameLayout e;
    public final be0 f;
    public final TextView h;
    public final TextView n;
    public final ImageView r;
    public boolean s;
    public String w;

    public dw7(int i, wjb wjbVar, Context context) {
        super(context);
        this.c = i;
        this.d = wjbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, nme.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        be0 be0Var = new be0(context);
        this.f = be0Var;
        be0Var.setImageResource(R.drawable.msg2_permissions);
        a();
        frameLayout.addView(be0Var, nme.e(36, 36, 17));
        TextView b = hve.b(context, 15.0f, bkb.F6, true, null);
        this.h = b;
        b.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b.setEllipsize(truncateAt);
        addView(b, nme.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i2 = bkb.x6;
        TextView b2 = hve.b(context, 13.0f, i2, false, null);
        this.n = b2;
        b2.setSingleLine();
        b2.setEllipsize(truncateAt);
        addView(b2, nme.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.r = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        zkb.s(imageView, i2, null, PorterDuff.Mode.SRC_IN);
        int i3 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i3, wjbVar), 1, -1);
        vkb M = zkb.M(i3);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M, wjbVar);
        addView(imageView, nme.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    public final void a() {
        this.b = bkb.p1(0.3f, bkb.v0(bkb.F6, this.d));
        this.a = true;
        this.f.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff.Mode.SRC_IN));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.s) {
            Paint U0 = bkb.U0("paintDivider", this.d);
            if (U0 == null) {
                U0 = bkb.j0;
            }
            canvas.drawRect(gl.L(k96.a0 ? 0.0f : 72.0f), getMeasuredHeight() - 1, getWidth() - gl.L(k96.a0 ? 72.0f : 0.0f), getMeasuredHeight(), U0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), TLObject.FLAG_30));
    }

    @Override // tjb
    public final void updateColors() {
        be0 be0Var;
        int p1;
        try {
            if (!this.a || (be0Var = this.f) == null || (p1 = bkb.p1(0.3f, bkb.v0(bkb.F6, this.d))) == this.b) {
                return;
            }
            this.b = p1;
            be0Var.setColorFilter(new PorterDuffColorFilter(p1, PorterDuff.Mode.SRC_IN));
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
