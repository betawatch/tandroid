package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class q11 extends FrameLayout {
    public final ImageView a;
    public final o11 b;
    public final /* synthetic */ ThemeEditorView.EditorAlert c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, w7.x5.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.a = imageView2;
        imageView2.setScaleType(scaleType);
        n11 n11Var = new n11();
        imageView2.setImageDrawable(n11Var);
        n11Var.f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.x5.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new x70(this, 21));
        o11 o11Var = new o11(this, context);
        this.b = o11Var;
        o11Var.setTextSize(1, 16.0f);
        o11Var.setHintTextColor(-6774617);
        o11Var.setTextColor(-14540254);
        o11Var.setBackgroundDrawable(null);
        o11Var.setPadding(0, 0, 0, 0);
        o11Var.setMaxLines(1);
        o11Var.setLines(1);
        o11Var.setSingleLine(true);
        o11Var.setImeOptions(268435459);
        o11Var.setHint(LocaleController.getString(R.string.Search));
        o11Var.setCursorColor(-11491093);
        o11Var.setCursorSize(AndroidUtilities.dp(20.0f));
        o11Var.setCursorWidth(1.5f);
        addView(o11Var, w7.x5.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        o11Var.addTextChangedListener(new p11(this));
        o11Var.setOnEditorActionListener(new e1(this, 9));
    }
}
