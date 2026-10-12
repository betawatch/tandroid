package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.RadioButton;
import w7.a6;
import w7.e6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class q1 extends FrameLayout {
    public final String a;
    public final RadioButton b;
    public final boolean c;

    public q1(r1 r1Var, boolean z10, Context context) {
        super(context);
        this.a = r1Var.a;
        RadioButton radioButton = new RadioButton(context);
        this.b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(g6.x0(null, g6.D5, false), g6.x0(null, g6.E5, false));
        addView(radioButton, a6.a(22.0f, 20.0f, 0.0f, 0.0f, 0.0f, 22, 19));
        TextView b10 = e6.b(context, 16.0f, g6.G6, true, null);
        b10.setText(r1Var.c);
        addView(b10, a6.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = e6.b(context, 14.0f, g6.y6, false, null);
        b11.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(r1Var.d / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(r1Var.d / 1000)))));
        addView(b11, a6.t(-1, -2, 7, 62, 32, 8, 0));
        this.c = z10;
        setWillNotDraw(!z10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c) {
            canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, g6.k0);
        }
    }
}
