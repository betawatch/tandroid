package dg;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class y3 extends Dialog {
    public ValueAnimator B;
    public boolean C;
    public f1 D;
    public org.telegram.ui.web.y0 E;
    public final int a;
    public final u2 b;
    public final u3 c;
    public final v3 d;
    public final ImageView e;
    public final w3 f;
    public final Rect h;
    public Bitmap n;
    public BitmapShader r;
    public Paint s;
    public Matrix v;
    public final vb0 w;
    public final vb0 x;
    public float y;

    public y3(Context context, final int i10) {
        super(context, R.style.TransparentDialog);
        nh.b bVar = new nh.b();
        this.h = new Rect();
        this.C = false;
        this.a = i10;
        u2 u2Var = new u2(this, context, 2);
        this.b = u2Var;
        u2Var.setOnClickListener(new androidx.mediarouter.app.c(this, 3));
        u3 u3Var = new u3(context, 0);
        this.c = u3Var;
        u3Var.setOrientation(1);
        u2Var.addView(u3Var, b6.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        v3 v3Var = new v3(this, context, 0);
        v3Var.setWillNotDraw(false);
        u3Var.addView(v3Var, b6.p(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        v3Var.addView(frameLayout, b6.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StoryLinkPreviewTitle));
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView i11 = yh.i(frameLayout, textView, b6.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        i11.setText(LocaleController.getString(R.string.StoryLinkPreviewSubtitle));
        i11.setTextColor(-8421505);
        i11.setTextSize(1, 14.0f);
        frameLayout.addView(i11, b6.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        v3 v3Var2 = new v3(this, context, 1);
        this.d = v3Var2;
        v3Var.addView(v3Var2, b6.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        v3Var2.addView(imageView, b6.e(-1, -1, 119));
        w3 w3Var = new w3(this, context, AndroidUtilities.density);
        this.f = w3Var;
        v3Var2.addView(w3Var, b6.e(-2, -2, 17));
        o70 F = o70.F(u2Var, bVar, u2Var);
        vb0 vb0Var = new vb0(getContext(), R.raw.position_below, LocaleController.getString(R.string.StoryLinkCaptionAbove), R.raw.position_above, LocaleController.getString(R.string.StoryLinkCaptionBelow), bVar);
        this.w = vb0Var;
        final int i12 = 0;
        vb0Var.setOnClickListener(new View.OnClickListener(this) { // from class: dg.t3
            public final /* synthetic */ y3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        y3 y3Var = this.b;
                        f1 f1Var = y3Var.D;
                        boolean z4 = f1Var.f;
                        f1Var.f = !z4;
                        y3Var.w.a(z4, true);
                        y3Var.f.b(i10, y3Var.D, true);
                        break;
                    default:
                        y3 y3Var2 = this.b;
                        f1 f1Var2 = y3Var2.D;
                        boolean z10 = f1Var2.e;
                        f1Var2.e = !z10;
                        y3Var2.x.a(z10, true);
                        y3Var2.f.b(i10, y3Var2.D, true);
                        break;
                }
            }
        });
        F.q(vb0Var);
        vb0 vb0Var2 = new vb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), bVar);
        this.x = vb0Var2;
        final int i13 = 1;
        vb0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: dg.t3
            public final /* synthetic */ y3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        y3 y3Var = this.b;
                        f1 f1Var = y3Var.D;
                        boolean z4 = f1Var.f;
                        f1Var.f = !z4;
                        y3Var.w.a(z4, true);
                        y3Var.f.b(i10, y3Var.D, true);
                        break;
                    default:
                        y3 y3Var2 = this.b;
                        f1 f1Var2 = y3Var2.D;
                        boolean z10 = f1Var2.e;
                        f1Var2.e = !z10;
                        y3Var2.x.a(z10, true);
                        y3Var2.f.b(i10, y3Var2.D, true);
                        break;
                }
            }
        });
        F.q(vb0Var2);
        F.k();
        F.c(R.drawable.msg_select, LocaleController.getString(R.string.ApplyChanges), new s3(this, 2), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DoNotLinkPreview), new s3(this, 3), true);
        u3Var.addView(F.A, b6.o(-2, -2, 0.0f, 85));
        u2Var.setFitsSystemWindows(true);
        u2Var.setOnApplyWindowInsetsListener(new x3(this));
    }

    public final void b(boolean z4, s3 s3Var) {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z4 ? 1.0f : 0.0f);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new o1(this, 5));
        this.B.addListener(new androidx.fragment.app.g(this, z4, s3Var, 1));
        this.B.setInterpolator(nr.h);
        this.B.setDuration(z4 ? 420L : 320L);
        this.B.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.C) {
            return;
        }
        org.telegram.ui.web.y0 y0Var = this.E;
        if (y0Var != null) {
            y0Var.run(this.D);
            this.E = null;
        }
        this.C = true;
        b(false, new s3(this, 1));
        this.b.invalidate();
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.C;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        u2 u2Var = this.b;
        setContentView(u2Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = 131072 | i10;
        int i11 = Build.VERSION.SDK_INT;
        attributes.flags = i10 | (-1945959040);
        if (i11 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        u2Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(u2Var, !j6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            AndroidUtilities.makeGlobalBlurBitmap(new cg.h0(this, 3), 14.0f);
            b(true, null);
        }
    }
}
