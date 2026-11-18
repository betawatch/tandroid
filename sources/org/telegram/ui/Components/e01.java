package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class e01 extends FrameLayout {
    public final ImageView a;
    public final c01 b;
    public final /* synthetic */ ThemeEditorView.EditorAlert c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(18.0f), -854795));
        addView(view, c8.ma.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, c8.ma.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.a = imageView2;
        imageView2.setScaleType(scaleType);
        b01 b01Var = new b01();
        imageView2.setImageDrawable(b01Var);
        b01Var.f = org.telegram.messenger.g0.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, c8.ma.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new h70(this, 18));
        c01 c01Var = new c01(this, context);
        this.b = c01Var;
        c01Var.setTextSize(1, 16.0f);
        c01Var.setHintTextColor(-6774617);
        c01Var.setTextColor(-14540254);
        c01Var.setBackgroundDrawable(null);
        c01Var.setPadding(0, 0, 0, 0);
        c01Var.setMaxLines(1);
        c01Var.setLines(1);
        c01Var.setSingleLine(true);
        c01Var.setImeOptions(268435459);
        c01Var.setHint(org.telegram.messenger.gd.M0(2131745641, null));
        c01Var.setCursorColor(-11491093);
        c01Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        c01Var.setCursorWidth(1.5f);
        addView(c01Var, c8.ma.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        c01Var.addTextChangedListener(new d01(this));
        c01Var.setOnEditorActionListener(new g(this, 11));
    }
}
