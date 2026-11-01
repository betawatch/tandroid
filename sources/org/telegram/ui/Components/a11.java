package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a11 extends FrameLayout {
    public final ImageView a;
    public final y01 b;
    public final /* synthetic */ ThemeEditorView.EditorAlert c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(18.0f), -854795));
        addView(view, w7.b6.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.b6.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.a = imageView2;
        imageView2.setScaleType(scaleType);
        x01 x01Var = new x01();
        imageView2.setImageDrawable(x01Var);
        x01Var.f = org.telegram.messenger.i0.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, w7.b6.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new db0(this, 18));
        y01 y01Var = new y01(this, context);
        this.b = y01Var;
        y01Var.setTextSize(1, 16.0f);
        y01Var.setHintTextColor(-6774617);
        y01Var.setTextColor(-14540254);
        y01Var.setBackgroundDrawable(null);
        y01Var.setPadding(0, 0, 0, 0);
        y01Var.setMaxLines(1);
        y01Var.setLines(1);
        y01Var.setSingleLine(true);
        y01Var.setImeOptions(268435459);
        y01Var.setHint(org.telegram.messenger.dd.L0(2131745853, null));
        y01Var.setCursorColor(-11491093);
        y01Var.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        y01Var.setCursorWidth(1.5f);
        addView(y01Var, w7.b6.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        y01Var.addTextChangedListener(new z01(this));
        y01Var.setOnEditorActionListener(new t0(this, 10));
    }
}
