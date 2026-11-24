// default package

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
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n6b extends Dialog {
    public float E;
    public ValueAnimator F;
    public boolean G;
    public c66 H;
    public eg9 I;
    public final int a;
    public final ne6 b;
    public final t1 c;
    public final ec0 d;
    public final ImageView e;
    public final l6b f;
    public final Rect h;
    public Bitmap n;
    public BitmapShader r;
    public Paint s;
    public Matrix w;
    public final k57 x;
    public final k57 y;

    /* JADX WARN: Multi-variable type inference failed */
    public n6b(Context context, final int i) {
        super(context, R.style.TransparentDialog);
        r63 r63Var = new r63();
        this.h = new Rect();
        this.G = false;
        this.a = i;
        ne6 ne6Var = new ne6((byte) 28, context, this);
        this.b = ne6Var;
        ne6Var.setOnClickListener(new oha(this, (byte) 15));
        t1 t1Var = new t1((byte) 11, context, false);
        this.c = t1Var;
        final byte b = 1;
        t1Var.setOrientation(1);
        ne6Var.addView(t1Var, qoe.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        ec0 ec0Var = new ec0(this, context, (byte) 10);
        ec0Var.setWillNotDraw(false);
        t1Var.addView(ec0Var, qoe.q(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        ec0Var.addView(frameLayout, qoe.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(2131744319, null));
        textView.setTextColor(-1);
        ts2.s(textView, 1, 18.0f);
        TextView l = wi8.l(frameLayout, textView, qoe.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        l.setText(jb6.M0(2131744320, null));
        l.setTextColor(-8421505);
        l.setTextSize(1, 14.0f);
        frameLayout.addView(l, qoe.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        ec0 ec0Var2 = new ec0(this, context, (byte) 11);
        this.d = ec0Var2;
        ec0Var.addView(ec0Var2, qoe.d(-1, -1.0f, nm7.D1, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ec0Var2.addView(imageView, qoe.e(-1, -1, nm7.D1));
        l6b l6bVar = new l6b(this, context, gm.p);
        this.f = l6bVar;
        ec0Var2.addView(l6bVar, qoe.e(-2, -2, 17));
        bu5 G = bu5.G(ne6Var, r63Var, ne6Var);
        k57 k57Var = new k57(getContext(), R.raw.position_below, jb6.M0(2131744330, null), R.raw.position_above, jb6.M0(2131744329, null), r63Var);
        this.x = k57Var;
        final Object[] objArr = 0 == true ? 1 : 0;
        k57Var.setOnClickListener(new View.OnClickListener(this) { // from class: k6b
            public final /* synthetic */ n6b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = objArr;
                int i2 = i;
                n6b n6bVar = this.b;
                switch (b2) {
                    case 0:
                        c66 c66Var = n6bVar.H;
                        boolean z = c66Var.f;
                        c66Var.f = !z;
                        n6bVar.x.a(z, true);
                        n6bVar.f.b(i2, n6bVar.H, true);
                        break;
                    default:
                        c66 c66Var2 = n6bVar.H;
                        boolean z2 = c66Var2.e;
                        c66Var2.e = !z2;
                        n6bVar.y.a(z2, true);
                        n6bVar.f.b(i2, n6bVar.H, true);
                        break;
                }
            }
        });
        G.p(k57Var);
        k57 k57Var2 = new k57(context, R.raw.media_shrink, jb6.M0(2131748656, null), R.raw.media_enlarge, jb6.M0(2131748655, null), r63Var);
        this.y = k57Var2;
        k57Var2.setOnClickListener(new View.OnClickListener(this) { // from class: k6b
            public final /* synthetic */ n6b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                int i2 = i;
                n6b n6bVar = this.b;
                switch (b2) {
                    case 0:
                        c66 c66Var = n6bVar.H;
                        boolean z = c66Var.f;
                        c66Var.f = !z;
                        n6bVar.x.a(z, true);
                        n6bVar.f.b(i2, n6bVar.H, true);
                        break;
                    default:
                        c66 c66Var2 = n6bVar.H;
                        boolean z2 = c66Var2.e;
                        c66Var2.e = !z2;
                        n6bVar.y.a(z2, true);
                        n6bVar.f.b(i2, n6bVar.H, true);
                        break;
                }
            }
        });
        G.p(k57Var2);
        G.j();
        G.b(R.drawable.msg_select, jb6.M0(2131754183, null), new j6b(this, (byte) 2), false);
        G.b(R.drawable.msg_delete, jb6.M0(2131751298, null), new j6b(this, (byte) 3), true);
        t1Var.addView(G.A, qoe.p(-2, -2, 0.0f, 85));
        ne6Var.setFitsSystemWindows(true);
        ne6Var.setOnApplyWindowInsetsListener(new m6b(this));
    }

    public final void a(boolean z, j6b j6bVar) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z ? 1.0f : 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new rha(this, (byte) 17));
        this.F.addListener(new qx((Object) this, z, (Object) j6bVar, (byte) 13));
        this.F.setInterpolator(d53.h);
        this.F.setDuration(z ? 420L : 320L);
        this.F.start();
    }

    public final /* synthetic */ void b() {
        super.dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.G) {
            return;
        }
        eg9 eg9Var = this.I;
        if (eg9Var != null) {
            eg9Var.a(this.H);
            this.I = null;
        }
        this.G = true;
        a(false, new j6b(this, (byte) 1));
        this.b.invalidate();
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.G;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ne6 ne6Var = this.b;
        setContentView(ne6Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = nm7.D1;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i | (-1945959040);
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        ne6Var.setSystemUiVisibility(256);
        gm.j3(ne6Var, !cmb.I.o());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (gm.K1(getContext())) {
            super.show();
            gm.j2(new eg9(this, (byte) 15), 14.0f);
            a(true, null);
        }
    }
}
