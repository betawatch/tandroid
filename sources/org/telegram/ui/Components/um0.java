package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class um0 extends FrameLayout {
    public final View a;
    public final ImageView b;
    public final ImageView c;
    public final nh.b2 d;
    public final ig.f e;
    public final org.telegram.ui.ActionBar.c6 f;

    public um0(Context context, float f9, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f = c6Var;
        View view = new View(context);
        this.a = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.O5, c6Var)));
        addView(view, i7.f6.i(-1.0f, 36.0f, 8388659, f9, 11.0f, f9, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Q5, c6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, i7.f6.i(36.0f, 36.0f, 8388659, f9 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        nh.b2 b2Var = new nh.b2(3, this);
        this.d = b2Var;
        imageView2.setImageDrawable(b2Var);
        b2Var.f = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, i7.f6.i(36.0f, 36.0f, 8388661, f9, 11.0f, f9, 0.0f));
        imageView2.setOnClickListener(new u70(this, 12));
        ig.f fVar = new ig.f(this, context, 7);
        this.e = fVar;
        fVar.setTextSize(1, 16.0f);
        fVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.P5, c6Var));
        fVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.R5, c6Var));
        fVar.setBackgroundDrawable(null);
        fVar.setPadding(0, 0, 0, 0);
        fVar.setMaxLines(1);
        fVar.setLines(1);
        fVar.setSingleLine(true);
        fVar.setGravity(i7.f6.y() | 16);
        fVar.setImeOptions(268435459);
        fVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Mh, c6Var));
        fVar.setCursorSize(AndroidUtilities.dp(20.0f));
        fVar.setCursorWidth(1.5f);
        float f10 = f9 + 2.0f;
        addView(fVar, i7.f6.i(-1.0f, 40.0f, 8388659, f10 + 38.0f, 9.0f, f10 + 30.0f, 0.0f));
        fVar.addTextChangedListener(new bh.c(this, 12));
        fVar.setOnEditorActionListener(new f1(this, 5));
    }

    public abstract void a(String str);

    public zp getProgressDrawable() {
        return this.d;
    }

    public View getSearchBackground() {
        return this.a;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.e;
    }

    public void setHint(String str) {
        this.e.setHint(str);
    }
}
