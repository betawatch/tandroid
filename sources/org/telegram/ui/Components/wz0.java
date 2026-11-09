package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class wz0 extends FrameLayout {
    public final ImageView a;
    public final uz0 b;
    public final /* synthetic */ ThemeEditorView.EditorAlert c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(18.0f), -854795));
        addView(view, c8.ha.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, c8.ha.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.a = imageView2;
        imageView2.setScaleType(scaleType);
        tz0 tz0Var = new tz0();
        imageView2.setImageDrawable(tz0Var);
        tz0Var.f = org.telegram.messenger.g0.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, c8.ha.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new ma0(this, 17));
        uz0 uz0Var = new uz0(this, context);
        this.b = uz0Var;
        uz0Var.setTextSize(1, 16.0f);
        uz0Var.setHintTextColor(-6774617);
        uz0Var.setTextColor(-14540254);
        uz0Var.setBackgroundDrawable(null);
        uz0Var.setPadding(0, 0, 0, 0);
        uz0Var.setMaxLines(1);
        uz0Var.setLines(1);
        uz0Var.setSingleLine(true);
        uz0Var.setImeOptions(268435459);
        uz0Var.setHint(org.telegram.messenger.id.M0(2131745836, null));
        uz0Var.setCursorColor(-11491093);
        uz0Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        uz0Var.setCursorWidth(1.5f);
        addView(uz0Var, c8.ha.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        uz0Var.addTextChangedListener(new vz0(this));
        uz0Var.setOnEditorActionListener(new t0(this, 10));
    }
}
