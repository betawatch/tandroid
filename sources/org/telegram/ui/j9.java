package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class j9 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final TextView a;
    public final TextView b;
    public final View c;
    public final org.telegram.ui.Components.xj0 d;

    public j9(m9 m9Var, Context context, org.telegram.ui.Components.b10 b10Var) {
        super(context);
        addView(b10Var, w7.z5.d(-1.0f, -1));
        this.c = b10Var;
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(context);
        this.d = xj0Var;
        xj0Var.f(R.raw.utyan_call, 110, 110, null);
        xj0Var.setAutoRepeat(false);
        addView(xj0Var, w7.z5.a(110.0f, 52.0f, 17.0f, 52.0f, 60.0f, 110, 17));
        xj0Var.setOnClickListener(new a(this, 10));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        textView.setText(LocaleController.getString(R.string.MakeYourFirstCall));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        addView(textView, w7.z5.a(-2.0f, 17.0f, 40.0f, 17.0f, 0.0f, -1, 17));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        String formatString = LocaleController.formatString(R.string.MakeYourFirstCallHint, Integer.valueOf(m9Var.getMessagesController().conferenceCallSizeLimit));
        if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
            formatString = formatString.replace('\n', ' ');
        }
        textView2.setText(formatString);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.c7, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, w7.z5.a(-2.0f, 17.0f, 80.0f, 17.0f, 0.0f, -1, 17));
        b10Var.setAlpha(0.0f);
        xj0Var.setAlpha(0.0f);
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
        org.telegram.ui.Components.xj0 xj0Var = this.d;
        xj0Var.animate().alpha(1.0f).setDuration(150L).start();
        this.a.animate().alpha(1.0f).setDuration(150L).start();
        this.b.animate().alpha(1.0f).setDuration(150L).start();
        this.c.animate().alpha(0.0f).setDuration(150L).start();
        xj0Var.d();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
