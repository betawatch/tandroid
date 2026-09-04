package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.RadioButton;
import w7.b6;
import w7.x5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class r1 extends FrameLayout {
    public final String a;
    public final RadioButton b;
    public final boolean c;

    public r1(s1 s1Var, boolean z10, Context context) {
        super(context);
        this.a = s1Var.a;
        RadioButton radioButton = new RadioButton(context);
        this.b = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(j6.w0(null, j6.D5, false), j6.w0(null, j6.E5, false));
        addView(radioButton, x5.d(22, 22.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        TextView b10 = b6.b(context, 16.0f, j6.G6, true, null);
        b10.setText(s1Var.c);
        addView(b10, x5.t(-1, -2, 7, 62, 9, 8, 0));
        TextView b11 = b6.b(context, 14.0f, j6.y6, false, null);
        b11.setText(LocaleController.formatString(R.string.BotRestoreStorageCreatedAt, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.formatSmallDateChat(s1Var.d / 1000), LocaleController.getInstance().getFormatterDay().format(new Date(s1Var.d / 1000)))));
        addView(b11, x5.t(-1, -2, 7, 62, 32, 8, 0));
        this.c = z10;
        setWillNotDraw(!z10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c) {
            canvas.drawLine(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, j6.k0);
        }
    }
}
