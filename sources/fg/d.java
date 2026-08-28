package fg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class d extends FrameLayout {
    public final b6 a;
    public final ImageView b;
    public final TextView c;
    public Runnable d;
    public final h2 e;
    public final Paint f;

    public d(Context context, b6 b6Var) {
        super(context);
        this.f = new Paint(1);
        this.a = b6Var;
        TextView textView = new TextView(context);
        this.c = textView;
        ll.k(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        int i9 = f6.j5;
        textView.setTextColor(f6.v0(i9, b6Var));
        boolean z10 = LocaleController.isRTL;
        addView(textView, e6.d(-1, -2.0f, 23, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        h2 h2Var = new h2(false);
        this.e = h2Var;
        imageView.setImageDrawable(h2Var);
        h2Var.a(f6.v0(i9, b6Var));
        h2Var.b(f6.v0(i9, b6Var));
        h2Var.k = 220.0f;
        addView(imageView, e6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new androidx.mediarouter.app.c(this, 4));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int v02 = f6.v0(f6.d7, this.a);
        Paint paint = this.f;
        paint.setColor(v02);
        canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
    }

    public int getHeaderHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getHeaderHeight(), TLObject.FLAG_30));
    }

    public void setBackImage(int i9) {
        this.b.setImageResource(i9);
    }

    public void setCloseImageVisible(boolean z10) {
        this.b.setVisibility(z10 ? 0 : 8);
        boolean z11 = LocaleController.isRTL;
        this.c.setLayoutParams(e6.d(-1, -2.0f, 23, (z11 || !z10) ? 22.0f : 53.0f, 0.0f, (z11 && z10) ? 53.0f : 22.0f, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.d = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
