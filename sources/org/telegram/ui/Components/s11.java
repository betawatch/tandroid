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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class s11 extends FrameLayout {
    public final ImageView a;
    public final q11 b;
    public final /* synthetic */ ThemeEditorView.EditorAlert c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), -854795));
        addView(view, k7.b6.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, k7.b6.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.a = imageView2;
        imageView2.setScaleType(scaleType);
        p11 p11Var = new p11();
        imageView2.setImageDrawable(p11Var);
        p11Var.f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, k7.b6.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new z70(this, 21));
        q11 q11Var = new q11(this, context);
        this.b = q11Var;
        q11Var.setTextSize(1, 16.0f);
        q11Var.setHintTextColor(-6774617);
        q11Var.setTextColor(-14540254);
        q11Var.setBackgroundDrawable(null);
        q11Var.setPadding(0, 0, 0, 0);
        q11Var.setMaxLines(1);
        q11Var.setLines(1);
        q11Var.setSingleLine(true);
        q11Var.setImeOptions(268435459);
        q11Var.setHint(LocaleController.getString(R.string.Search));
        q11Var.setCursorColor(-11491093);
        q11Var.setCursorSize(AndroidUtilities.dp(20.0f));
        q11Var.setCursorWidth(1.5f);
        addView(q11Var, k7.b6.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        q11Var.addTextChangedListener(new r11(this));
        q11Var.setOnEditorActionListener(new d1(this, 9));
    }
}
