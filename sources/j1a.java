// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class j1a extends Dialog {
    public final int E;
    public final int F;
    public final int G;
    public final int[] H;
    public boolean I;
    public float J;
    public boolean K;
    public ValueAnimator L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public boolean P;
    public final /* synthetic */ n1a Q;
    public final w0a a;
    public final ImageReceiver b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public final c1a f;
    public final View h;
    public Bitmap n;
    public Paint r;
    public final d26 s;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout w;
    public nx0 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1a(n1a n1aVar, Context context, c1a c1aVar, View view, w0a w0aVar, vnb vnbVar) {
        super(context);
        boolean z;
        jn5 b;
        String str;
        ColorFilter colorFilter;
        this.Q = n1aVar;
        Rect rect = new Rect();
        this.c = rect;
        Rect rect2 = new Rect();
        this.d = rect2;
        Rect rect3 = new Rect();
        this.e = rect3;
        int[] iArr = new int[2];
        this.H = iArr;
        this.I = false;
        this.P = false;
        this.a = w0aVar;
        this.f = c1aVar;
        this.h = view;
        final c0a c0aVar = (c0a) this;
        d26 d26Var = new d26((byte) 21, context, c0aVar);
        this.s = d26Var;
        setContentView(d26Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new nf9((byte) 3, context, c0aVar), tre.t(jn7.p2, jn7.p2, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, vnbVar, context);
        this.w = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, tre.t(-2, -2, 17, 0, 0, 0, 0));
        final byte b2 = 0;
        s7.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, ob6.M0(2131745260, null), false, vnbVar).setOnClickListener(new View.OnClickListener() { // from class: e1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b2;
                c0a c0aVar2 = c0aVar;
                switch (b3) {
                    case 0:
                        c0aVar2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        c0aVar2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        c0aVar2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        c0aVar2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final byte b3 = 1;
        s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, ob6.M0(2131745258, null), false, vnbVar).setOnClickListener(new View.OnClickListener() { // from class: e1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b3;
                c0a c0aVar2 = c0aVar;
                switch (b32) {
                    case 0:
                        c0aVar2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        c0aVar2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        c0aVar2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        c0aVar2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final byte b4 = 2;
        s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, ob6.M0(2131745257, null), false, vnbVar).setOnClickListener(new View.OnClickListener() { // from class: e1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b4;
                c0a c0aVar2 = c0aVar;
                switch (b32) {
                    case 0:
                        c0aVar2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        c0aVar2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        c0aVar2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        c0aVar2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final byte b5 = 3;
        s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, ob6.M0(2131745259, null), false, vnbVar).setOnClickListener(new View.OnClickListener() { // from class: e1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b32 = b5;
                c0a c0aVar2 = c0aVar;
                switch (b32) {
                    case 0:
                        c0aVar2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        c0aVar2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        c0aVar2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        c0aVar2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        s7.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, ob6.M0(2131745255, null), false, vnbVar).setOnClickListener(new jy8(c0aVar, context, (byte) 6));
        d26Var.addView(linearLayout, tre.e(-2, -2, 17));
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.flags = (attributes.flags & (-3)) | (-2147286784);
            d26Var.setOnApplyWindowInsetsListener(new us(c0aVar));
            attributes.flags |= 1024;
            z = true;
            d26Var.setFitsSystemWindows(true);
            d26Var.setSystemUiVisibility(1284);
            attributes.height = -1;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        } else {
            z = true;
        }
        w0aVar.b = z;
        f();
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        imageReceiver.p0(d26Var);
        imageReceiver.m0(7);
        TLRPC.Document document = w0aVar.d;
        if (document == null) {
            Drawable drawable = w0aVar.F;
            if (drawable instanceof wl) {
                document = ((wl) drawable).e;
            }
        }
        if (document != null) {
            ggb d = lp3.d(document.thumbs, aob.m6, 0.2f, false);
            TLRPC.PhotoSize w = xb4.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b = jn5.b(document);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                str = "160_160_g";
            } else {
                if (d != null && r47.K2(document, false)) {
                    d.e = 512;
                    d.f = 512;
                }
                b = jn5.b(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.Y(b, str, jn5.c(w, document), "160_160", null, null, d, document.size, null, document2, 1);
            if ((w0aVar.F instanceof wl) && (r47.B4(document2) || ((wl) w0aVar.F).c())) {
                if (!r47.B4(document2)) {
                    wl wlVar = (wl) w0aVar.F;
                    SparseArray sparseArray = wl.r;
                    if (wlVar == null || !wlVar.k()) {
                        colorFilter = aob.n0(vnbVar);
                        imageReceiver.p1 = colorFilter;
                    }
                }
                colorFilter = n1aVar.l1;
                imageReceiver.p1 = colorFilter;
            }
        }
        w0aVar.getLocationOnScreen(iArr);
        rect.left = w0aVar.getPaddingLeft() + iArr[0];
        rect.top = w0aVar.getPaddingTop() + iArr[1];
        rect.right = (w0aVar.getWidth() + iArr[0]) - w0aVar.getPaddingRight();
        rect.bottom = (w0aVar.getHeight() + iArr[1]) - w0aVar.getPaddingBottom();
        hl.V1(rect, rect2, this.J, rect3);
        view.getLocationOnScreen(iArr);
        this.E = iArr[0];
        int i = iArr[1];
        this.F = i;
        this.G = view.getHeight() + i;
    }

    public static /* synthetic */ WindowInsets e(View view, WindowInsets windowInsets) {
        view.requestLayout();
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            if (this.N == z) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.N = z;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M, z ? 1.0f : 0.0f);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new b49(this, (byte) 20));
        this.O.addListener(new i1a((byte) 0, this, z));
        ValueAnimator valueAnimator2 = this.O;
        if (z) {
            valueAnimator2.setDuration(360L);
            this.O.setInterpolator(k43.h);
        } else {
            valueAnimator2.setDuration(240L);
            this.O.setInterpolator(k43.g);
        }
        this.O.start();
    }

    public final void b(final boolean z, g1a g1aVar, final g1a g1aVar2, final boolean z2) {
        w0a w0aVar = this.a;
        if (w0aVar == null) {
            if (g1aVar != null) {
                g1aVar.run();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            if (this.K == z) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.K = z;
        if (z) {
            w0aVar.b = true;
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, z ? 1.0f : 0.0f);
        this.L = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f1a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                g1a g1aVar3;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                j1a j1aVar = j1a.this;
                j1aVar.J = floatValue;
                hl.V1(j1aVar.c, j1aVar.d, floatValue, j1aVar.e);
                j1aVar.s.invalidate();
                boolean z3 = z;
                if (!z3) {
                    j1aVar.w.setAlpha(j1aVar.J);
                }
                if (j1aVar.J < 0.025f && !z3) {
                    if (z2) {
                        j1aVar.a.b = false;
                        j1aVar.Q.i0.invalidate();
                    }
                    jn7.e().k(jn7.k1, 4);
                }
                if (j1aVar.J >= 0.5f || z3 || (g1aVar3 = g1aVar2) == null) {
                    return;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                g1aVar3.run();
            }
        });
        this.L.addListener(new h1a(this, z, g1aVar2, zArr, z2, g1aVar));
        this.L.setDuration(420L);
        this.L.setInterpolator(k43.h);
        this.L.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Integer num) {
        boolean z;
        c1a c1aVar;
        if (this.I) {
            return;
        }
        byte b = 1;
        this.I = true;
        byte b2 = 0;
        Rect rect = this.c;
        if (num != null) {
            d0a d0aVar = ((c0a) this).T;
            n1a n1aVar = d0aVar.e;
            if (n1aVar.p1 != null && d0aVar.d != null) {
                rect.set(n1aVar.q1);
                z = true;
                this.y = z;
                int[] iArr = this.H;
                if (z) {
                    w0a w0aVar = this.a;
                    w0aVar.getLocationOnScreen(iArr);
                    rect.left = w0aVar.getPaddingLeft() + iArr[0];
                    rect.top = w0aVar.getPaddingTop() + iArr[1];
                    rect.right = (w0aVar.getWidth() + iArr[0]) - w0aVar.getPaddingRight();
                    rect.bottom = (w0aVar.getHeight() + iArr[1]) - w0aVar.getPaddingBottom();
                } else {
                    this.h.getLocationOnScreen(iArr);
                    rect.offset(iArr[0], iArr[1]);
                }
                if (num != null && (c1aVar = this.f) != null) {
                    c1aVar.run();
                }
                b(false, new g1a(this, num, b2), new g1a(this, num, b), !z);
                a(false);
            }
        }
        z = false;
        this.y = z;
        int[] iArr2 = this.H;
        if (z) {
        }
        if (num != null) {
            c1aVar.run();
        }
        b(false, new g1a(this, num, b2), new g1a(this, num, b), !z);
        a(false);
    }

    public final void d(Integer num) {
        c1a c1aVar;
        c0a c0aVar = (c0a) this;
        if (num != null && (c1aVar = c0aVar.T.e.V1) != null) {
            c1aVar.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.P) {
            return;
        }
        c(null);
        this.P = true;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (dispatchTouchEvent || motionEvent.getAction() != 0) {
            return dispatchTouchEvent;
        }
        dismiss();
        return false;
    }

    public final void f() {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity == null) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        int measuredWidth = (int) (decorView.getMeasuredWidth() / 12.0f);
        int measuredHeight = (int) (decorView.getMeasuredHeight() / 12.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.083333336f, 0.083333336f);
        canvas.drawColor(aob.w0(null, aob.d6, false));
        decorView.draw(canvas);
        if (activity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) activity;
            if (launchActivity.N().getLastFragment().getVisibleDialog() != null) {
                launchActivity.N().getLastFragment().getVisibleDialog().getWindow().getDecorView().draw(canvas);
            }
        }
        View view = this.h;
        if (view != null) {
            view.getLocationOnScreen(this.H);
            canvas.save();
            canvas.translate(r2[0], r2[1]);
            view.draw(canvas);
            canvas.restore();
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(10, Math.max(measuredWidth, measuredHeight) / jn7.J2));
        this.r = new Paint(1);
        this.n = createBitmap;
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        jn7.e().k(jn7.j1, 4);
        b(true, null, null, true);
        a(true);
    }
}
