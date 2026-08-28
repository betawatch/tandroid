package of;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import g7.e6;
import kh.n5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Components.o9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h extends b3 {
    public final /* synthetic */ m f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context) {
        super(context);
        this.f = mVar;
        this.a = UserConfig.selectedAccount;
        final int i9 = 1;
        setOrientation(1);
        final int i10 = 0;
        setBackgroundColor(f6.w0(null, f6.a7, false));
        n5 n5Var = new n5(context, 3);
        n5Var.c = new Path();
        Paint paint = new Paint(1);
        n5Var.b = paint;
        paint.setColor(f6.w0(null, f6.d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        n5Var.setWillNotDraw(false);
        n5Var.setOrientation(1);
        n5Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        o9 o9Var = new o9(context);
        this.b = o9Var;
        o9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.a3
            public final /* synthetic */ of.h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.b.getImageReceiver().startAnimation();
                        break;
                    default:
                        this.b.f.K();
                        break;
                }
            }
        });
        a();
        n5Var.addView(o9Var, e6.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(f6.w0(null, f6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        n5Var.addView(textView, e6.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(f6.w0(null, f6.y6, false));
        n5Var.addView(textView2, e6.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(v5.f(new float[]{8.0f}, f6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(f6.w0(null, f6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.a3
            public final /* synthetic */ of.h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        this.b.b.getImageReceiver().startAnimation();
                        break;
                    default:
                        this.b.f.K();
                        break;
                }
            }
        });
        n5Var.addView(textView3, e6.t(-1, -2, 49, 0, 18, 0, 0));
        addView(n5Var, e6.n(-1, -2));
        set(null);
    }
}
