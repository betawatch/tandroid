package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f01 extends FrameLayout {
    public final ImageView a;
    public final d01 b;
    public final /* synthetic */ ThemeEditorView.EditorAlert c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(18.0f), -854795));
        addView(view, c8.na.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, c8.na.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.a = imageView2;
        imageView2.setScaleType(scaleType);
        c01 c01Var = new c01();
        imageView2.setImageDrawable(c01Var);
        c01Var.f = org.telegram.messenger.g0.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, c8.na.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new g70(this, 19));
        d01 d01Var = new d01(this, context);
        this.b = d01Var;
        d01Var.setTextSize(1, 16.0f);
        d01Var.setHintTextColor(-6774617);
        d01Var.setTextColor(-14540254);
        d01Var.setBackgroundDrawable(null);
        d01Var.setPadding(0, 0, 0, 0);
        d01Var.setMaxLines(1);
        d01Var.setLines(1);
        d01Var.setSingleLine(true);
        d01Var.setImeOptions(268435459);
        d01Var.setHint(org.telegram.messenger.gd.N0(2131745640, null));
        d01Var.setCursorColor(-11491093);
        d01Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        d01Var.setCursorWidth(1.5f);
        addView(d01Var, c8.na.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        d01Var.addTextChangedListener(new e01(this));
        d01Var.setOnEditorActionListener(new g(this, 11));
    }
}
