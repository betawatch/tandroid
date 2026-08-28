package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f9 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final TextView a;
    public final TextView b;
    public final View c;
    public final org.telegram.ui.Components.pi0 d;

    public f9(i9 i9Var, Context context, org.telegram.ui.Components.e00 e00Var) {
        super(context);
        addView(e00Var, g7.e6.c(-1.0f, -1));
        this.c = e00Var;
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
        this.d = pi0Var;
        pi0Var.f(R.raw.utyan_call, 110, 110, null);
        pi0Var.setAutoRepeat(false);
        addView(pi0Var, g7.e6.d(110, 110.0f, 17, 52.0f, 17.0f, 52.0f, 60.0f));
        pi0Var.setOnClickListener(new a(this, 10));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        textView.setText(LocaleController.getString(R.string.MakeYourFirstCall));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        addView(textView, g7.e6.d(-1, -2.0f, 17, 17.0f, 40.0f, 17.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        String formatString = LocaleController.formatString(R.string.MakeYourFirstCallHint, Integer.valueOf(i9Var.getMessagesController().conferenceCallSizeLimit));
        if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
            formatString = formatString.replace('\n', ' ');
        }
        textView2.setText(formatString);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.c7, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, g7.e6.d(-1, -2.0f, 17, 17.0f, 80.0f, 17.0f, 0.0f));
        e00Var.setAlpha(0.0f);
        pi0Var.setAlpha(0.0f);
        textView.setAlpha(0.0f);
        textView2.setAlpha(0.0f);
        setOnTouchListener(new jh.d(4));
    }

    public final void a() {
        this.d.animate().alpha(0.0f).setDuration(150L).start();
        this.a.animate().alpha(0.0f).setDuration(150L).start();
        this.b.animate().alpha(0.0f).setDuration(150L).start();
        this.c.animate().alpha(1.0f).setDuration(150L).start();
    }

    public final void b() {
        org.telegram.ui.Components.pi0 pi0Var = this.d;
        pi0Var.animate().alpha(1.0f).setDuration(150L).start();
        this.a.animate().alpha(1.0f).setDuration(150L).start();
        this.b.animate().alpha(1.0f).setDuration(150L).start();
        this.c.animate().alpha(0.0f).setDuration(150L).start();
        pi0Var.d();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
