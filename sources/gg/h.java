package gg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import ci.w5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.c3;
import org.telegram.ui.Components.w9;
import w7.y5;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class h extends c3 {
    public final /* synthetic */ m f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context) {
        super(context);
        this.f = mVar;
        this.a = UserConfig.selectedAccount;
        final int i10 = 1;
        setOrientation(1);
        final int i11 = 0;
        setBackgroundColor(h6.w0(null, h6.a7, false));
        w5 w5Var = new w5(context, 3);
        w5Var.c = new Path();
        Paint paint = new Paint(1);
        w5Var.b = paint;
        paint.setColor(h6.w0(null, h6.d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        w5Var.setWillNotDraw(false);
        w5Var.setOrientation(1);
        w5Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        w9 w9Var = new w9(context);
        this.b = w9Var;
        w9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.b3
            public final /* synthetic */ gg.h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
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
        w5Var.addView(w9Var, y5.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(h6.w0(null, h6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        w5Var.addView(textView, y5.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(h6.w0(null, h6.y6, false));
        w5Var.addView(textView2, y5.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, h6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(h6.w0(null, h6.Sh, false));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.b3
            public final /* synthetic */ gg.h b;

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
        w5Var.addView(textView3, y5.t(-1, -2, 49, 0, 18, 0, 0));
        addView(w5Var, y5.n(-1, -2));
        set(null);
    }
}
