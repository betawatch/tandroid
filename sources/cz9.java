// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class cz9 extends FrameLayout implements tjb {
    public int a;
    public final wjb b;
    public final ImageView c;
    public final TextView d;
    public Runnable e;
    public final ed0 f;
    public final Paint h;

    public cz9(Context context, wjb wjbVar) {
        super(context);
        this.h = new Paint(1);
        this.b = wjbVar;
        TextView textView = new TextView(context);
        this.d = textView;
        ug8.v(textView, 1, 20.0f);
        textView.setGravity(k96.a0 ? 5 : 3);
        int i = bkb.i5;
        zkb.X(textView, i, wjbVar);
        boolean z = k96.a0;
        addView(textView, nme.d(-1, -2.0f, 23, z ? 16.0f : 53.0f, 0.0f, z ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ed0 ed0Var = new ed0(false);
        this.f = ed0Var;
        imageView.setImageDrawable(ed0Var);
        int v0 = bkb.v0(i, wjbVar);
        this.a = v0;
        ed0Var.a(v0);
        ed0Var.b(bkb.v0(i, wjbVar));
        ed0Var.k = 220.0f;
        addView(imageView, nme.d(24, 24.0f, (k96.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new ik8(this, (byte) 21));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int v0 = bkb.v0(bkb.c7, this.b);
        Paint paint = this.h;
        paint.setColor(v0);
        canvas.drawRect(0.0f, getHeight() - gl.e1(), getWidth(), getHeight(), paint);
    }

    public int getHeaderHeight() {
        return gl.L(56.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getHeaderHeight(), TLObject.FLAG_30));
    }

    public void setBackImage(int i) {
        this.c.setImageResource(i);
    }

    public void setCloseImageVisible(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
        boolean z2 = k96.a0;
        this.d.setLayoutParams(nme.d(-1, -2.0f, 23, (z2 || !z) ? 22.0f : 53.0f, 0.0f, (z2 && z) ? 53.0f : 22.0f, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.e = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    @Override // tjb
    public final void updateColors() {
        ed0 ed0Var = this.f;
        if (ed0Var != null) {
            try {
                int v0 = bkb.v0(bkb.i5, this.b);
                if (v0 != this.a) {
                    this.a = v0;
                    ed0Var.a(v0);
                    ed0Var.b(v0);
                    ImageView imageView = this.c;
                    if (imageView != null) {
                        imageView.invalidate();
                    }
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
