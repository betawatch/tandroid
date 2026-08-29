package bg;

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
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c4 extends Dialog {
    public ValueAnimator A;
    public boolean B;
    public h1 C;
    public nh.b0 D;
    public final int a;
    public final x2 b;
    public final y3 c;
    public final z3 d;
    public final ImageView e;
    public final a4 f;
    public final Rect h;
    public Bitmap n;
    public BitmapShader r;
    public Paint s;
    public Matrix v;
    public final qb0 w;
    public final qb0 x;
    public float y;

    public c4(Context context, final int i10) {
        super(context, R.style.TransparentDialog);
        lh.b bVar = new lh.b();
        this.h = new Rect();
        this.B = false;
        this.a = i10;
        x2 x2Var = new x2(this, context, 2);
        this.b = x2Var;
        x2Var.setOnClickListener(new ag.o(this, 3));
        y3 y3Var = new y3(context, 0);
        this.c = y3Var;
        y3Var.setOrientation(1);
        x2Var.addView(y3Var, f6.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        z3 z3Var = new z3(this, context, 0);
        z3Var.setWillNotDraw(false);
        y3Var.addView(z3Var, f6.p(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        z3Var.addView(frameLayout, f6.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StoryLinkPreviewTitle));
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = th.h(frameLayout, textView, f6.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        h.setText(LocaleController.getString(R.string.StoryLinkPreviewSubtitle));
        h.setTextColor(-8421505);
        h.setTextSize(1, 14.0f);
        frameLayout.addView(h, f6.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        z3 z3Var2 = new z3(this, context, 1);
        this.d = z3Var2;
        z3Var.addView(z3Var2, f6.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        z3Var2.addView(imageView, f6.e(-1, -1, 119));
        a4 a4Var = new a4(this, context, AndroidUtilities.density);
        this.f = a4Var;
        z3Var2.addView(a4Var, f6.e(-2, -2, 17));
        j70 F = j70.F(x2Var, bVar, x2Var);
        qb0 qb0Var = new qb0(getContext(), R.raw.position_below, LocaleController.getString(R.string.StoryLinkCaptionAbove), R.raw.position_above, LocaleController.getString(R.string.StoryLinkCaptionBelow), bVar);
        this.w = qb0Var;
        final int i11 = 0;
        qb0Var.setOnClickListener(new View.OnClickListener(this) { // from class: bg.x3
            public final /* synthetic */ c4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        c4 c4Var = this.b;
                        h1 h1Var = c4Var.C;
                        boolean z10 = h1Var.f;
                        h1Var.f = !z10;
                        c4Var.w.a(z10, true);
                        c4Var.f.b(i10, c4Var.C, true);
                        break;
                    default:
                        c4 c4Var2 = this.b;
                        h1 h1Var2 = c4Var2.C;
                        boolean z11 = h1Var2.e;
                        h1Var2.e = !z11;
                        c4Var2.x.a(z11, true);
                        c4Var2.f.b(i10, c4Var2.C, true);
                        break;
                }
            }
        });
        F.q(qb0Var);
        qb0 qb0Var2 = new qb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), bVar);
        this.x = qb0Var2;
        final int i12 = 1;
        qb0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: bg.x3
            public final /* synthetic */ c4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        c4 c4Var = this.b;
                        h1 h1Var = c4Var.C;
                        boolean z10 = h1Var.f;
                        h1Var.f = !z10;
                        c4Var.w.a(z10, true);
                        c4Var.f.b(i10, c4Var.C, true);
                        break;
                    default:
                        c4 c4Var2 = this.b;
                        h1 h1Var2 = c4Var2.C;
                        boolean z11 = h1Var2.e;
                        h1Var2.e = !z11;
                        c4Var2.x.a(z11, true);
                        c4Var2.f.b(i10, c4Var2.C, true);
                        break;
                }
            }
        });
        F.q(qb0Var2);
        F.k();
        F.c(R.drawable.msg_select, LocaleController.getString(R.string.ApplyChanges), new w3(this, 2), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DoNotLinkPreview), new w3(this, 3), true);
        y3Var.addView(F.A, f6.o(-2, -2, 0.0f, 85));
        x2Var.setFitsSystemWindows(true);
        x2Var.setOnApplyWindowInsetsListener(new b4(this));
    }

    public final void b(boolean z10, w3 w3Var) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.A = ofFloat;
        ofFloat.addUpdateListener(new q1(this, 5));
        this.A.addListener(new androidx.fragment.app.g(this, z10, w3Var, 1));
        this.A.setInterpolator(jr.h);
        this.A.setDuration(z10 ? 420L : 320L);
        this.A.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.B) {
            return;
        }
        nh.b0 b0Var = this.D;
        if (b0Var != null) {
            b0Var.run(this.C);
            this.D = null;
        }
        this.B = true;
        b(false, new w3(this, 1));
        this.b.invalidate();
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.B;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        x2 x2Var = this.b;
        setContentView(x2Var, layoutParams);
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
        x2Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(x2Var, !g6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            AndroidUtilities.makeGlobalBlurBitmap(new ag.i0(this, 3), 14.0f);
            b(true, null);
        }
    }
}
