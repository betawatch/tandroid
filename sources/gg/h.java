package gg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import ci.x5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.c3;
import org.telegram.ui.Components.v9;
import w7.y5;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        setBackgroundColor(j6.w0(null, j6.a7, false));
        x5 x5Var = new x5(context, 3);
        x5Var.c = new Path();
        Paint paint = new Paint(1);
        x5Var.b = paint;
        paint.setColor(j6.w0(null, j6.d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        x5Var.setWillNotDraw(false);
        x5Var.setOrientation(1);
        x5Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        v9 v9Var = new v9(context);
        this.b = v9Var;
        v9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.b3
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
        x5Var.addView(v9Var, y5.q(130, 130, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(j6.w0(null, j6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        x5Var.addView(textView, y5.t(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(j6.w0(null, j6.y6, false));
        x5Var.addView(textView2, y5.t(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{8.0f}, j6.Oh));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(j6.w0(null, j6.Sh, false));
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
        x5Var.addView(textView3, y5.t(-1, -2, 49, 0, 18, 0, 0));
        addView(x5Var, y5.n(-1, -2));
        set(null);
    }
}
