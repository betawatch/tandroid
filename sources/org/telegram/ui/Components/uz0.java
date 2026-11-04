package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uz0 extends FrameLayout {
    public final ImageView a;
    public final sz0 b;
    public final /* synthetic */ ThemeEditorView.EditorAlert c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(18.0f), -854795));
        addView(view, b8.mf.d(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(-6182737, PorterDuff.Mode.MULTIPLY));
        addView(imageView, b8.mf.d(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.a = imageView2;
        imageView2.setScaleType(scaleType);
        rz0 rz0Var = new rz0();
        imageView2.setImageDrawable(rz0Var);
        rz0Var.f = org.telegram.messenger.g0.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, b8.mf.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new ga0(this, 18));
        sz0 sz0Var = new sz0(this, context);
        this.b = sz0Var;
        sz0Var.setTextSize(1, 16.0f);
        sz0Var.setHintTextColor(-6774617);
        sz0Var.setTextColor(-14540254);
        sz0Var.setBackgroundDrawable(null);
        sz0Var.setPadding(0, 0, 0, 0);
        sz0Var.setMaxLines(1);
        sz0Var.setLines(1);
        sz0Var.setSingleLine(true);
        sz0Var.setImeOptions(268435459);
        sz0Var.setHint(org.telegram.messenger.bd.M0(2131745846, null));
        sz0Var.setCursorColor(-11491093);
        sz0Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        sz0Var.setCursorWidth(1.5f);
        addView(sz0Var, b8.mf.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        sz0Var.addTextChangedListener(new tz0(this));
        sz0Var.setOnEditorActionListener(new s0(this, 10));
    }
}
