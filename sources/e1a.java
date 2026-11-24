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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class e1a extends FrameLayout implements vlb {
    public int a;
    public final ylb b;
    public final ImageView c;
    public final TextView d;
    public Runnable e;
    public final ee0 f;
    public final Paint h;

    public e1a(Context context, ylb ylbVar) {
        super(context);
        this.h = new Paint(1);
        this.b = ylbVar;
        TextView textView = new TextView(context);
        this.d = textView;
        wi8.v(textView, 1, 20.0f);
        textView.setGravity(jb6.a0 ? 5 : 3);
        int i = cmb.i5;
        anb.X(textView, i, ylbVar);
        boolean z = jb6.a0;
        addView(textView, qoe.d(-1, -2.0f, 23, z ? 16.0f : 53.0f, 0.0f, z ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ee0 ee0Var = new ee0(false);
        this.f = ee0Var;
        imageView.setImageDrawable(ee0Var);
        int v0 = cmb.v0(i, ylbVar);
        this.a = v0;
        ee0Var.a(v0);
        ee0Var.b(cmb.v0(i, ylbVar));
        ee0Var.k = 220.0f;
        addView(imageView, qoe.d(24, 24.0f, (jb6.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new wk8(this, (byte) 24));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int v0 = cmb.v0(cmb.c7, this.b);
        Paint paint = this.h;
        paint.setColor(v0);
        canvas.drawRect(0.0f, getHeight() - gm.e1(), getWidth(), getHeight(), paint);
    }

    public int getHeaderHeight() {
        return gm.L(56.0f);
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
        boolean z2 = jb6.a0;
        this.d.setLayoutParams(qoe.d(-1, -2.0f, 23, (z2 || !z) ? 22.0f : 53.0f, 0.0f, (z2 && z) ? 53.0f : 22.0f, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.e = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    @Override // vlb
    public final void updateColors() {
        ee0 ee0Var = this.f;
        if (ee0Var != null) {
            try {
                int v0 = cmb.v0(cmb.i5, this.b);
                if (v0 != this.a) {
                    this.a = v0;
                    ee0Var.a(v0);
                    ee0Var.b(v0);
                    ImageView imageView = this.c;
                    if (imageView != null) {
                        imageView.invalidate();
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
