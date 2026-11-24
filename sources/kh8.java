// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class kh8 extends FrameLayout {
    public final jia a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public boolean e;
    public fi8 f;
    public tl h;
    public Drawable n;

    public kh8(Context context, wjb wjbVar) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        jia jiaVar = new jia(context);
        this.a = jiaVar;
        jiaVar.setTypeface(gl.o());
        jiaVar.setTextSize(15);
        zkb.W(jiaVar, bkb.F6, wjbVar);
        linearLayout.addView(jiaVar, nme.o(-1, -2));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        zkb.X(textView, bkb.x6, wjbVar);
        textView.setLineSpacing(gl.L(2.0f), 1.0f);
        linearLayout.addView(textView, nme.q(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, nme.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, nme.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        zkb.s(imageView2, bkb.L6, wjbVar, PorterDuff.Mode.SRC_ATOP);
        addView(imageView2, nme.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(fi8 fi8Var, boolean z) {
        boolean p = y6c.h(y6c.t0).p();
        ImageView imageView = this.d;
        if (p && fi8Var.a == 12 && fi8Var.b == R.drawable.filled_premium_status2) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new tl(gl.L(24.0f), 13, this, false);
                if (isAttachedToWindow()) {
                    this.h.a();
                }
            }
            Long i = l7c.i(y6c.h(y6c.t0).f());
            b(i == null ? 0L : i.longValue(), false);
        } else {
            imageView.setVisibility(0);
            tl tlVar = this.h;
            if (tlVar != null) {
                tlVar.b();
                this.h = null;
            }
        }
        this.f = fi8Var;
        this.a.l(fi8Var.c, false);
        this.b.setText(fi8Var.d);
        this.c.setImageResource(fi8Var.b);
        this.e = z;
    }

    public final void b(long j, boolean z) {
        if (this.h == null) {
            this.h = new tl(gl.L(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j != 0) {
            this.h.j(j, z);
            return;
        }
        if (this.n == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_prolfilestar).mutate();
            this.n = mutate;
            zkb.x(this, mutate, bkb.u6, null, PorterDuff.Mode.SRC_IN);
        }
        this.h.g(this.n, z);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.s) - gl.L(21.0f), (getHeight() - this.h.s) / 2, getWidth() - gl.L(21.0f), (getHeight() + this.h.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(bkb.w0(null, bkb.u6, false)));
            this.h.draw(canvas);
        }
        if (this.e) {
            canvas.drawRect(gl.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), bkb.j0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        tl tlVar = this.h;
        if (tlVar != null) {
            tlVar.a();
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        tl tlVar = this.h;
        if (tlVar != null) {
            tlVar.b();
        }
        super.onDetachedFromWindow();
    }
}
