package eg;

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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class w3 extends Dialog {
    public ValueAnimator B;
    public boolean C;
    public d1 D;
    public org.telegram.ui.web.d1 E;
    public final int a;
    public final s2 b;
    public final s3 c;
    public final t3 d;
    public final ImageView e;
    public final u3 f;
    public final Rect h;
    public Bitmap n;
    public BitmapShader r;
    public Paint s;
    public Matrix v;
    public final xb0 w;
    public final xb0 x;
    public float y;

    public w3(Context context, final int i10) {
        super(context, R.style.TransparentDialog);
        oh.b bVar = new oh.b();
        this.h = new Rect();
        this.C = false;
        this.a = i10;
        s2 s2Var = new s2(this, context, 2);
        this.b = s2Var;
        s2Var.setOnClickListener(new androidx.mediarouter.app.c(this, 3));
        s3 s3Var = new s3(context, 0);
        this.c = s3Var;
        s3Var.setOrientation(1);
        s2Var.addView(s3Var, c6.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        t3 t3Var = new t3(this, context, 0);
        t3Var.setWillNotDraw(false);
        s3Var.addView(t3Var, c6.p(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        t3Var.addView(frameLayout, c6.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StoryLinkPreviewTitle));
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = yh.h(frameLayout, textView, c6.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        h.setText(LocaleController.getString(R.string.StoryLinkPreviewSubtitle));
        h.setTextColor(-8421505);
        h.setTextSize(1, 14.0f);
        frameLayout.addView(h, c6.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        t3 t3Var2 = new t3(this, context, 1);
        this.d = t3Var2;
        t3Var.addView(t3Var2, c6.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        t3Var2.addView(imageView, c6.e(-1, -1, 119));
        u3 u3Var = new u3(this, context, AndroidUtilities.density);
        this.f = u3Var;
        t3Var2.addView(u3Var, c6.e(-2, -2, 17));
        q70 F = q70.F(s2Var, bVar, s2Var);
        xb0 xb0Var = new xb0(getContext(), R.raw.position_below, LocaleController.getString(R.string.StoryLinkCaptionAbove), R.raw.position_above, LocaleController.getString(R.string.StoryLinkCaptionBelow), bVar);
        this.w = xb0Var;
        final int i11 = 0;
        xb0Var.setOnClickListener(new View.OnClickListener(this) { // from class: eg.r3
            public final /* synthetic */ w3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        w3 w3Var = this.b;
                        d1 d1Var = w3Var.D;
                        boolean z4 = d1Var.f;
                        d1Var.f = !z4;
                        w3Var.w.a(z4, true);
                        w3Var.f.b(i10, w3Var.D, true);
                        break;
                    default:
                        w3 w3Var2 = this.b;
                        d1 d1Var2 = w3Var2.D;
                        boolean z10 = d1Var2.e;
                        d1Var2.e = !z10;
                        w3Var2.x.a(z10, true);
                        w3Var2.f.b(i10, w3Var2.D, true);
                        break;
                }
            }
        });
        F.q(xb0Var);
        xb0 xb0Var2 = new xb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), bVar);
        this.x = xb0Var2;
        final int i12 = 1;
        xb0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: eg.r3
            public final /* synthetic */ w3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        w3 w3Var = this.b;
                        d1 d1Var = w3Var.D;
                        boolean z4 = d1Var.f;
                        d1Var.f = !z4;
                        w3Var.w.a(z4, true);
                        w3Var.f.b(i10, w3Var.D, true);
                        break;
                    default:
                        w3 w3Var2 = this.b;
                        d1 d1Var2 = w3Var2.D;
                        boolean z10 = d1Var2.e;
                        d1Var2.e = !z10;
                        w3Var2.x.a(z10, true);
                        w3Var2.f.b(i10, w3Var2.D, true);
                        break;
                }
            }
        });
        F.q(xb0Var2);
        F.k();
        F.c(R.drawable.msg_select, LocaleController.getString(R.string.ApplyChanges), new q3(this, 2), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DoNotLinkPreview), new q3(this, 3), true);
        s3Var.addView(F.A, c6.o(-2, -2, 0.0f, 85));
        s2Var.setFitsSystemWindows(true);
        s2Var.setOnApplyWindowInsetsListener(new v3(this));
    }

    public final void b(boolean z4, q3 q3Var) {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z4 ? 1.0f : 0.0f);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new m1(this, 5));
        this.B.addListener(new androidx.fragment.app.g(this, z4, q3Var, 1));
        this.B.setInterpolator(pr.h);
        this.B.setDuration(z4 ? 420L : 320L);
        this.B.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.C) {
            return;
        }
        org.telegram.ui.web.d1 d1Var = this.E;
        if (d1Var != null) {
            d1Var.run(this.D);
            this.E = null;
        }
        this.C = true;
        b(false, new q3(this, 1));
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
        s2 s2Var = this.b;
        setContentView(s2Var, layoutParams);
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
        s2Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(s2Var, !k6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            AndroidUtilities.makeGlobalBlurBitmap(new dg.h0(this, 3), 14.0f);
            b(true, null);
        }
    }
}
