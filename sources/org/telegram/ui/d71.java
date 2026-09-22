package org.telegram.ui;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class d71 extends Dialog {
    public final int E;
    public final int F;
    public final int[] G;
    public boolean H;
    public float I;
    public boolean J;
    public ValueAnimator K;
    public float L;
    public boolean M;
    public ValueAnimator N;
    public boolean O;
    public final /* synthetic */ h71 P;
    public final q61 a;
    public final ImageReceiver b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public final Runnable f;
    public final View h;
    public Bitmap n;
    public Paint r;
    public final j0 s;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout v;
    public org.telegram.ui.ActionBar.f3 w;
    public boolean x;
    public final int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d71(h71 h71Var, Context context, Runnable runnable, View view, q61 q61Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z10;
        ImageLocation forDocument;
        String str;
        ColorFilter colorFilter;
        this.P = h71Var;
        Rect rect = new Rect();
        this.c = rect;
        Rect rect2 = new Rect();
        this.d = rect2;
        Rect rect3 = new Rect();
        this.e = rect3;
        int[] iArr = new int[2];
        this.G = iArr;
        final int i10 = 0;
        this.H = false;
        this.O = false;
        this.a = q61Var;
        this.f = runnable;
        this.h = view;
        final w51 w51Var = (w51) this;
        j0 j0Var = new j0(w51Var, context, 23);
        this.s = j0Var;
        setContentView(j0Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new s50(w51Var, context, 9), w7.x5.t(160, 160, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, context, e6Var);
        this.v = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.x5.t(-2, -2, 17, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.v0.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil1Hour), false, e6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.a71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        w51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        w51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        w51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        w51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i11 = 1;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil2Hours), false, e6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.a71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        w51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        w51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        w51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        w51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i12 = 2;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil8Hours), false, e6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.a71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        w51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        w51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        w51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        w51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i13 = 3;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil2Days), false, e6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.a71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        w51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        w51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        w51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        w51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntilOther), false, e6Var).setOnClickListener(new wy0(2, w51Var, context));
        j0Var.addView(linearLayout, w7.x5.e(-2, -2, 17));
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.flags = (attributes.flags & (-3)) | (-2147286784);
            z10 = true;
            j0Var.setOnApplyWindowInsetsListener(new v41(w51Var, 1 == true ? 1 : 0));
            attributes.flags |= 1024;
            j0Var.setFitsSystemWindows(true);
            j0Var.setSystemUiVisibility(1284);
            attributes.height = -1;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        } else {
            z10 = true;
        }
        if (q61Var != null) {
            q61Var.b = z10;
        }
        f();
        ImageReceiver imageReceiver = new ImageReceiver();
        this.b = imageReceiver;
        imageReceiver.setParentView(j0Var);
        imageReceiver.setLayerNum(7);
        TLRPC.Document document = q61Var.d;
        if (document == null) {
            Drawable drawable = q61Var.E;
            if (drawable instanceof org.telegram.ui.Components.o5) {
                document = ((org.telegram.ui.Components.o5) drawable).e;
            }
        }
        if (document != null) {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.i6.m6, 0.2f);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if ("video/webm".equals(document.mime_type)) {
                forDocument = ImageLocation.getForDocument(document);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                str = "160_160_g";
            } else {
                if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                forDocument = ImageLocation.getForDocument(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.setImage(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", null, null, svgThumb, document.size, null, document2, 1);
            if ((q61Var.E instanceof org.telegram.ui.Components.o5) && (MessageObject.isTextColorEmoji(document2) || ((org.telegram.ui.Components.o5) q61Var.E).c())) {
                if (!MessageObject.isTextColorEmoji(document2)) {
                    org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) q61Var.E;
                    SparseArray sparseArray = org.telegram.ui.Components.o5.q;
                    if (o5Var == null || !o5Var.l()) {
                        colorFilter = org.telegram.ui.ActionBar.i6.n0(e6Var);
                        imageReceiver.setColorFilter(colorFilter);
                    }
                }
                colorFilter = h71Var.k1;
                imageReceiver.setColorFilter(colorFilter);
            }
        }
        q61Var.getLocationOnScreen(iArr);
        rect.left = q61Var.getPaddingLeft() + iArr[0];
        rect.top = q61Var.getPaddingTop() + iArr[1];
        rect.right = (q61Var.getWidth() + iArr[0]) - q61Var.getPaddingRight();
        rect.bottom = (q61Var.getHeight() + iArr[1]) - q61Var.getPaddingBottom();
        AndroidUtilities.lerp(rect, rect2, this.I, rect3);
        view.getLocationOnScreen(iArr);
        this.y = iArr[0];
        int i14 = iArr[1];
        this.E = i14;
        this.F = view.getHeight() + i14;
    }

    public static void a(d71 d71Var, Integer num) {
        Runnable runnable;
        w51 w51Var = (w51) d71Var;
        if (num != null && (runnable = w51Var.S.e.T1) != null) {
            runnable.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ WindowInsets b(w51 w51Var, View view, WindowInsets windowInsets) {
        view.requestLayout();
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public final void c(boolean z10) {
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            if (this.M == z10) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.M = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L, z10 ? 1.0f : 0.0f);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new a21(this, 10));
        this.N.addListener(new h70(8, this, z10));
        if (z10) {
            this.N.setDuration(360L);
            this.N.setInterpolator(org.telegram.ui.Components.qr.h);
        } else {
            this.N.setDuration(240L);
            this.N.setInterpolator(org.telegram.ui.Components.qr.g);
        }
        this.N.start();
    }

    public final void d(final boolean z10, z61 z61Var, final z61 z61Var2, final boolean z11) {
        q61 q61Var = this.a;
        if (q61Var == null) {
            if (z61Var != null) {
                z61Var.run();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            if (this.J == z10) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.J = z10;
        if (z10) {
            q61Var.b = true;
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, z10 ? 1.0f : 0.0f);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.b71
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Runnable runnable;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                d71 d71Var = d71.this;
                d71Var.I = floatValue;
                AndroidUtilities.lerp(d71Var.c, d71Var.d, floatValue, d71Var.e);
                d71Var.s.invalidate();
                boolean z12 = z10;
                if (!z12) {
                    d71Var.v.setAlpha(d71Var.I);
                }
                if (d71Var.I < 0.025f && !z12) {
                    if (z11) {
                        d71Var.a.b = false;
                        d71Var.P.h0.invalidate();
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
                }
                if (d71Var.I >= 0.5f || z12 || (runnable = z61Var2) == null) {
                    return;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                runnable.run();
            }
        });
        this.K.addListener(new c71(this, z10, z61Var2, zArr, z11, z61Var));
        this.K.setDuration(420L);
        this.K.setInterpolator(org.telegram.ui.Components.qr.h);
        this.K.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.O) {
            return;
        }
        e(null);
        this.O = true;
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Integer num) {
        boolean z10;
        Runnable runnable;
        if (this.H) {
            return;
        }
        this.H = true;
        Rect rect = this.c;
        if (num != null) {
            x51 x51Var = ((w51) this).S;
            h71 h71Var = x51Var.e;
            if (h71Var.n1 != null && x51Var.d != null) {
                rect.set(h71Var.o1);
                z10 = true;
                this.x = z10;
                int[] iArr = this.G;
                if (z10) {
                    q61 q61Var = this.a;
                    q61Var.getLocationOnScreen(iArr);
                    rect.left = q61Var.getPaddingLeft() + iArr[0];
                    rect.top = q61Var.getPaddingTop() + iArr[1];
                    rect.right = (q61Var.getWidth() + iArr[0]) - q61Var.getPaddingRight();
                    rect.bottom = (q61Var.getHeight() + iArr[1]) - q61Var.getPaddingBottom();
                } else {
                    this.h.getLocationOnScreen(iArr);
                    rect.offset(iArr[0], iArr[1]);
                }
                if (num != null && (runnable = this.f) != null) {
                    runnable.run();
                }
                d(false, new z61(this, num, 0), new z61(this, num, 1), !z10);
                c(false);
            }
        }
        z10 = false;
        this.x = z10;
        int[] iArr2 = this.G;
        if (z10) {
        }
        if (num != null) {
            runnable.run();
        }
        d(false, new z61(this, num, 0), new z61(this, num, 1), !z10);
        c(false);
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
        canvas.drawColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
        decorView.draw(canvas);
        if (activity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) activity;
            if (launchActivity.O().getLastFragment().getVisibleDialog() != null) {
                launchActivity.O().getLastFragment().getVisibleDialog().getWindow().getDecorView().draw(canvas);
            }
        }
        View view = this.h;
        if (view != null) {
            view.getLocationOnScreen(this.G);
            canvas.save();
            canvas.translate(r2[0], r2[1]);
            view.draw(canvas);
            canvas.restore();
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(10, Math.max(measuredWidth, measuredHeight) / 180));
        this.r = new Paint(1);
        this.n = createBitmap;
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        d(true, null, null, true);
        c(true);
    }
}
