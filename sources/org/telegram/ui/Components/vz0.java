package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class vz0 extends FrameLayout {
    public final ImageView a;
    public final tz0 b;
    public final /* synthetic */ ThemeEditorView.EditorAlert c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.c = editorAlert;
        View view = new View(context);
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(18.0f), -854795));
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
        sz0 sz0Var = new sz0();
        imageView2.setImageDrawable(sz0Var);
        sz0Var.f = org.telegram.messenger.g0.L(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, c8.ha.d(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
        imageView2.setOnClickListener(new la0(this, 17));
        tz0 tz0Var = new tz0(this, context);
        this.b = tz0Var;
        tz0Var.setTextSize(1, 16.0f);
        tz0Var.setHintTextColor(-6774617);
        tz0Var.setTextColor(-14540254);
        tz0Var.setBackgroundDrawable(null);
        tz0Var.setPadding(0, 0, 0, 0);
        tz0Var.setMaxLines(1);
        tz0Var.setLines(1);
        tz0Var.setSingleLine(true);
        tz0Var.setImeOptions(268435459);
        tz0Var.setHint(org.telegram.messenger.id.M0(2131745836, null));
        tz0Var.setCursorColor(-11491093);
        tz0Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        tz0Var.setCursorWidth(1.5f);
        addView(tz0Var, c8.ha.d(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
        tz0Var.addTextChangedListener(new uz0(this));
        tz0Var.setOnEditorActionListener(new s0(this, 10));
    }
}
