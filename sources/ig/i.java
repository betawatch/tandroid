package ig;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.TextView;
import fi.l5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class i extends z2 {
    public final /* synthetic */ n f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, Context context) {
        super(context);
        this.f = nVar;
        this.a = UserConfig.selectedAccount;
        final int i10 = 1;
        setOrientation(1);
        f7.i(y6.a7, this, null);
        l5 l5Var = new l5(context, 3);
        l5Var.c = new Path();
        Paint paint = new Paint(1);
        l5Var.b = paint;
        final int i11 = 0;
        paint.setColor(y6.x0(null, y6.d6, false));
        paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
        l5Var.setWillNotDraw(false);
        l5Var.setOrientation(1);
        l5Var.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        y9 y9Var = new y9(context);
        this.b = y9Var;
        y9Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.y2
            public final /* synthetic */ ig.i b;

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
                        this.b.f.L();
                        break;
                }
            }
        });
        a();
        l5Var.addView(y9Var, gb1.u(130, 130, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        f7.V(textView, y6.G6, null);
        textView.setTypeface(AndroidUtilities.bold());
        l5Var.addView(textView, gb1.x(-1, -2, 49, 0, 6, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        f7.V(textView2, y6.y6, null);
        l5Var.addView(textView2, gb1.x(-1, -2, 49, 0, 7, 0, 0));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(17);
        textView3.setBackground(o6.f(new float[]{8.0f}, y6.Oh));
        textView3.setTextSize(1, 14.0f);
        f7.V(textView3, y6.Sh, null);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Cells.y2
            public final /* synthetic */ ig.i b;

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
                        this.b.f.L();
                        break;
                }
            }
        });
        l5Var.addView(textView3, gb1.x(-1, -2, 49, 0, 18, 0, 0));
        addView(l5Var, gb1.r(-1, -2));
        set(null);
    }
}
