package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class j9 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final TextView a;
    public final TextView b;
    public final View c;
    public final org.telegram.ui.Components.bk0 d;

    public j9(m9 m9Var, Context context, org.telegram.ui.Components.b10 b10Var) {
        super(context);
        addView(b10Var, w7.z5.c(-1.0f, -1));
        this.c = b10Var;
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
        this.d = bk0Var;
        bk0Var.f(R.raw.utyan_call, 110, 110, null);
        bk0Var.setAutoRepeat(false);
        addView(bk0Var, w7.z5.d(110, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
        bk0Var.setOnClickListener(new a(this, 10));
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, null);
        textView.setText(LocaleController.getString(R.string.MakeYourFirstCall));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        addView(textView, w7.z5.d(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        String formatString = LocaleController.formatString(R.string.MakeYourFirstCallHint, Integer.valueOf(m9Var.getMessagesController().conferenceCallSizeLimit));
        if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
            formatString = formatString.replace('\n', ' ');
        }
        textView2.setText(formatString);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.c7, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, w7.z5.d(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
        b10Var.setAlpha(0.0f);
        bk0Var.setAlpha(0.0f);
        textView.setAlpha(0.0f);
        textView2.setAlpha(0.0f);
        setOnTouchListener(new di.d(4));
    }

    public final void a() {
        this.d.animate().alpha(0.0f).setDuration(150L).start();
        this.a.animate().alpha(0.0f).setDuration(150L).start();
        this.b.animate().alpha(0.0f).setDuration(150L).start();
        this.c.animate().alpha(1.0f).setDuration(150L).start();
    }

    public final void b() {
        org.telegram.ui.Components.bk0 bk0Var = this.d;
        bk0Var.animate().alpha(1.0f).setDuration(150L).start();
        this.a.animate().alpha(1.0f).setDuration(150L).start();
        this.b.animate().alpha(1.0f).setDuration(150L).start();
        this.c.animate().alpha(0.0f).setDuration(150L).start();
        bk0Var.d();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
