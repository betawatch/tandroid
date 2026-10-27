package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class u1 extends FrameLayout {
    public final String a;
    public final RadioButton b;
    public final boolean c;

    public u1(v1 v1Var, boolean z10, Context context) {
        super(context);
        this.a = v1Var.a;
        RadioButton radioButton = new RadioButton(context);
        this.b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        f7.P(radioButton, y6.D5, y6.E5, null);
        addView(radioButton, kb1.h(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView L = kb1.L(context, 16.0f, y6.G6, true, null);
        L.setText(v1Var.c);
        addView(L, kb1.x(-1, -2, 7, 62, 9, 8, 0));
        TextView L2 = kb1.L(context, 14.0f, y6.y6, false, null);
        L2.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(v1Var.d / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(v1Var.d / 1000)))));
        addView(L2, kb1.x(-1, -2, 7, 62, 32, 8, 0));
        this.c = z10;
        setWillNotDraw(!z10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c) {
            canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, y6.k0);
        }
    }
}
