package ig;

import ag.o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class d extends FrameLayout {
    public final c6 a;
    public final ImageView b;
    public final TextView c;
    public Runnable d;
    public final h2 e;
    public final Paint f;

    public d(Context context, c6 c6Var) {
        super(context);
        this.f = new Paint(1);
        this.a = c6Var;
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.b.g(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        int i10 = g6.j5;
        textView.setTextColor(g6.v0(i10, c6Var));
        boolean z10 = LocaleController.isRTL;
        addView(textView, f6.d(-1, -2.0f, 23, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        h2 h2Var = new h2(false);
        this.e = h2Var;
        imageView.setImageDrawable(h2Var);
        h2Var.a(g6.v0(i10, c6Var));
        h2Var.b(g6.v0(i10, c6Var));
        h2Var.k = 220.0f;
        addView(imageView, f6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new o(this, 10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int v02 = g6.v0(g6.d7, this.a);
        Paint paint = this.f;
        paint.setColor(v02);
        canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
    }

    public int getHeaderHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getHeaderHeight(), TLObject.FLAG_30));
    }

    public void setBackImage(int i10) {
        this.b.setImageResource(i10);
    }

    public void setCloseImageVisible(boolean z10) {
        this.b.setVisibility(z10 ? 0 : 8);
        boolean z11 = LocaleController.isRTL;
        this.c.setLayoutParams(f6.d(-1, -2.0f, 23, (z11 || !z10) ? 22.0f : 53.0f, 0.0f, (z11 && z10) ? 53.0f : 22.0f, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.d = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
