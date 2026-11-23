package ah;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.na;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.x1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class e extends FrameLayout implements c6 {
    public int a;
    public final i6 b;
    public final ImageView c;
    public final TextView d;
    public Runnable e;
    public final x1 f;
    public final Paint h;

    public e(Context context, i6 i6Var) {
        super(context);
        this.h = new Paint(1);
        this.b = i6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        m10.p(textView, 1, 20.0f);
        textView.setGravity(gd.a0 ? 5 : 3);
        int i7 = n6.j5;
        u6.U(textView, i7, i6Var);
        boolean z10 = gd.a0;
        addView(textView, na.d(-1, -2.0f, 23, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        x1 x1Var = new x1(false);
        this.f = x1Var;
        imageView.setImageDrawable(x1Var);
        int w02 = n6.w0(i7, i6Var);
        this.a = w02;
        x1Var.a(w02);
        x1Var.b(n6.w0(i7, i6Var));
        x1Var.k = 220.0f;
        addView(imageView, na.d(24, 24.0f, (gd.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new d(this, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int w02 = n6.w0(n6.d7, this.b);
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

    public void setCloseImageVisible(boolean z10) {
        this.c.setVisibility(z10 ? 0 : 8);
        boolean z11 = gd.a0;
        this.d.setLayoutParams(na.d(-1, -2.0f, 23, (z11 || !z10) ? 22.0f : 53.0f, 0.0f, (z11 && z10) ? 53.0f : 22.0f, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.e = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        x1 x1Var = this.f;
        if (x1Var == null) {
            return;
        }
        try {
            int w02 = n6.w0(n6.j5, this.b);
            if (w02 != this.a) {
                this.a = w02;
                x1Var.a(w02);
                x1Var.b(w02);
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
