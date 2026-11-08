package ah;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.y1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class e extends FrameLayout implements a6 {
    public int a;
    public final f6 b;
    public final ImageView c;
    public final TextView d;
    public Runnable e;
    public final y1 f;
    public final Paint h;

    public e(Context context, f6 f6Var) {
        super(context);
        this.h = new Paint(1);
        this.b = f6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        textView.setGravity(id.a0 ? 5 : 3);
        int i7 = k6.j5;
        r6.V(textView, i7, f6Var);
        boolean z9 = id.a0;
        addView(textView, ha.d(-1, -2.0f, 23, z9 ? 16.0f : 53.0f, 0.0f, z9 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        y1 y1Var = new y1(false);
        this.f = y1Var;
        imageView.setImageDrawable(y1Var);
        int w02 = k6.w0(i7, f6Var);
        this.a = w02;
        y1Var.a(w02);
        y1Var.b(k6.w0(i7, f6Var));
        y1Var.k = 220.0f;
        addView(imageView, ha.d(24, 24.0f, (id.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new d(this, 0));
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getHeaderHeight(), TLObject.FLAG_30));
    }

    public void setBackImage(int i7) {
        this.c.setImageResource(i7);
    }

    public void setCloseImageVisible(boolean z9) {
        this.c.setVisibility(z9 ? 0 : 8);
        boolean z10 = id.a0;
        this.d.setLayoutParams(ha.d(-1, -2.0f, 23, (z10 || !z9) ? 22.0f : 53.0f, 0.0f, (z10 && z9) ? 53.0f : 22.0f, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.e = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        y1 y1Var = this.f;
        if (y1Var == null) {
            return;
        }
        try {
            int w02 = k6.w0(k6.j5, this.b);
            if (w02 != this.a) {
                this.a = w02;
                y1Var.a(w02);
                y1Var.b(w02);
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
