package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.i2;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class d extends FrameLayout {
    public final f6 a;
    public final ImageView b;
    public final TextView c;
    public Runnable d;
    public final i2 e;
    public final Paint f;

    public d(Context context, f6 f6Var) {
        super(context);
        this.f = new Paint(1);
        this.a = f6Var;
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.b.g(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        int i10 = j6.j5;
        textView.setTextColor(j6.v0(i10, f6Var));
        boolean z4 = LocaleController.isRTL;
        addView(textView, b6.d(-1, -2.0f, 23, z4 ? 16.0f : 53.0f, 0.0f, z4 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        i2 i2Var = new i2(false);
        this.e = i2Var;
        imageView.setImageDrawable(i2Var);
        i2Var.a(j6.v0(i10, f6Var));
        i2Var.b(j6.v0(i10, f6Var));
        i2Var.k = 220.0f;
        addView(imageView, b6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new androidx.mediarouter.app.c(this, 10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int v02 = j6.v0(j6.d7, this.a);
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

    public void setCloseImageVisible(boolean z4) {
        this.b.setVisibility(z4 ? 0 : 8);
        boolean z10 = LocaleController.isRTL;
        this.c.setLayoutParams(b6.d(-1, -2.0f, 23, (z10 || !z4) ? 22.0f : 53.0f, 0.0f, (z10 && z4) ? 53.0f : 22.0f, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.d = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
