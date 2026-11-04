package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.ActionBar.z5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class d extends FrameLayout implements z5 {
    public int a;
    public final e6 b;
    public final ImageView c;
    public final TextView d;
    public Runnable e;
    public final w1 f;
    public final Paint h;

    public d(Context context, e6 e6Var) {
        super(context);
        this.h = new Paint(1);
        this.b = e6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        q.m(textView, 1, 20.0f);
        textView.setGravity(bd.a0 ? 5 : 3);
        int i3 = k6.j5;
        r6.V(textView, i3, e6Var);
        boolean z10 = bd.a0;
        addView(textView, mf.d(-1, -2.0f, 23, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        w1 w1Var = new w1(false);
        this.f = w1Var;
        imageView.setImageDrawable(w1Var);
        int w02 = k6.w0(i3, e6Var);
        this.a = w02;
        w1Var.a(w02);
        w1Var.b(k6.w0(i3, e6Var));
        w1Var.k = 220.0f;
        addView(imageView, mf.d(24, 24.0f, (bd.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new ai.b(this, 4));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int w02 = k6.w0(k6.d7, this.b);
        Paint paint = this.h;
        paint.setColor(w02);
        canvas.drawRect(0.0f, getHeight() - g0.f1(), getWidth(), getHeight(), paint);
    }

    public int getHeaderHeight() {
        return g0.L(56.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getHeaderHeight(), TLObject.FLAG_30));
    }

    public void setBackImage(int i3) {
        this.c.setImageResource(i3);
    }

    public void setCloseImageVisible(boolean z10) {
        this.c.setVisibility(z10 ? 0 : 8);
        boolean z11 = bd.a0;
        this.d.setLayoutParams(mf.d(-1, -2.0f, 23, (z11 || !z10) ? 22.0f : 53.0f, 0.0f, (z11 && z10) ? 53.0f : 22.0f, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.e = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        w1 w1Var = this.f;
        if (w1Var == null) {
            return;
        }
        try {
            int w02 = k6.w0(k6.j5, this.b);
            if (w02 != this.a) {
                this.a = w02;
                w1Var.a(w02);
                w1Var.b(w02);
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
