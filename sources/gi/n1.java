package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.RadioButton;
import w7.d6;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class n1 extends FrameLayout {
    public final String a;
    public final RadioButton b;
    public final boolean c;

    public n1(o1 o1Var, boolean z10, Context context) {
        super(context);
        this.a = o1Var.a;
        RadioButton radioButton = new RadioButton(context);
        this.b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(h6.x0(null, h6.D5, false), h6.x0(null, h6.E5, false));
        addView(radioButton, z5.a(22.0f, 20.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        TextView b10 = d6.b(context, 16.0f, h6.G6, true, null);
        b10.setText(o1Var.c);
        addView(b10, z5.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = d6.b(context, 14.0f, h6.y6, false, null);
        b11.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(o1Var.d / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(o1Var.d / 1000)))));
        addView(b11, z5.t(-1, -2, 7, 62, 32, 8, 0));
        this.c = z10;
        setWillNotDraw(!z10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c) {
            canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, h6.k0);
        }
    }
}
