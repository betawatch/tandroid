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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class f71 extends Dialog {
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
    public final /* synthetic */ j71 P;
    public final s61 a;
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
    public f71(j71 j71Var, Context context, Runnable runnable, View view, s61 s61Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        boolean z10;
        ImageLocation forDocument;
        String str;
        ColorFilter colorFilter;
        this.P = j71Var;
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
        this.a = s61Var;
        this.f = runnable;
        this.h = view;
        final y51 y51Var = (y51) this;
        j0 j0Var = new j0(y51Var, context, 23);
        this.s = j0Var;
        setContentView(j0Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new t50(y51Var, context, 9), w7.x5.t(160, 160, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, context, f6Var);
        this.v = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.x5.t(-2, -2, 17, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.v0.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil1Hour), false, f6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.c71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        y51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        y51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        y51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        y51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i11 = 1;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil2Hours), false, f6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.c71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        y51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        y51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        y51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        y51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i12 = 2;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil8Hours), false, f6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.c71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        y51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        y51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        y51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        y51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        final int i13 = 3;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil2Days), false, f6Var).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.c71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        y51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        break;
                    case 1:
                        y51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        break;
                    case 2:
                        y51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        break;
                    default:
                        y51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntilOther), false, f6Var).setOnClickListener(new wy0(2, y51Var, context));
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
            j0Var.setOnApplyWindowInsetsListener(new x41(y51Var, 1 == true ? 1 : 0));
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
        if (s61Var != null) {
            s61Var.b = z10;
        }
        f();
        ImageReceiver imageReceiver = new ImageReceiver();
        this.b = imageReceiver;
        imageReceiver.setParentView(j0Var);
        imageReceiver.setLayerNum(7);
        TLRPC.Document document = s61Var.d;
        if (document == null) {
            Drawable drawable = s61Var.E;
            if (drawable instanceof org.telegram.ui.Components.q5) {
                document = ((org.telegram.ui.Components.q5) drawable).e;
            }
        }
        if (document != null) {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.m6, 0.2f);
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
            if ((s61Var.E instanceof org.telegram.ui.Components.q5) && (MessageObject.isTextColorEmoji(document2) || ((org.telegram.ui.Components.q5) s61Var.E).c())) {
                if (!MessageObject.isTextColorEmoji(document2)) {
                    org.telegram.ui.Components.q5 q5Var = (org.telegram.ui.Components.q5) s61Var.E;
                    SparseArray sparseArray = org.telegram.ui.Components.q5.q;
                    if (q5Var == null || !q5Var.l()) {
                        colorFilter = org.telegram.ui.ActionBar.j6.n0(f6Var);
                        imageReceiver.setColorFilter(colorFilter);
                    }
                }
                colorFilter = j71Var.k1;
                imageReceiver.setColorFilter(colorFilter);
            }
        }
        s61Var.getLocationOnScreen(iArr);
        rect.left = s61Var.getPaddingLeft() + iArr[0];
        rect.top = s61Var.getPaddingTop() + iArr[1];
        rect.right = (s61Var.getWidth() + iArr[0]) - s61Var.getPaddingRight();
        rect.bottom = (s61Var.getHeight() + iArr[1]) - s61Var.getPaddingBottom();
        AndroidUtilities.lerp(rect, rect2, this.I, rect3);
        view.getLocationOnScreen(iArr);
        this.y = iArr[0];
        int i14 = iArr[1];
        this.E = i14;
        this.F = view.getHeight() + i14;
    }

    public static void a(f71 f71Var, Integer num) {
        Runnable runnable;
        y51 y51Var = (y51) f71Var;
        if (num != null && (runnable = y51Var.S.e.T1) != null) {
            runnable.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ WindowInsets b(y51 y51Var, View view, WindowInsets windowInsets) {
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
        ofFloat.addUpdateListener(new b21(this, 10));
        this.N.addListener(new e50(9, this, z10));
        if (z10) {
            this.N.setDuration(360L);
            this.N.setInterpolator(org.telegram.ui.Components.pr.h);
        } else {
            this.N.setDuration(240L);
            this.N.setInterpolator(org.telegram.ui.Components.pr.g);
        }
        this.N.start();
    }

    public final void d(final boolean z10, b71 b71Var, final b71 b71Var2, final boolean z11) {
        s61 s61Var = this.a;
        if (s61Var == null) {
            if (b71Var != null) {
                b71Var.run();
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
            s61Var.b = true;
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, z10 ? 1.0f : 0.0f);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.d71
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Runnable runnable;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                f71 f71Var = f71.this;
                f71Var.I = floatValue;
                AndroidUtilities.lerp(f71Var.c, f71Var.d, floatValue, f71Var.e);
                f71Var.s.invalidate();
                boolean z12 = z10;
                if (!z12) {
                    f71Var.v.setAlpha(f71Var.I);
                }
                if (f71Var.I < 0.025f && !z12) {
                    if (z11) {
                        f71Var.a.b = false;
                        f71Var.P.h0.invalidate();
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
                }
                if (f71Var.I >= 0.5f || z12 || (runnable = b71Var2) == null) {
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
        this.K.addListener(new e71(this, z10, b71Var2, zArr, z11, b71Var));
        this.K.setDuration(420L);
        this.K.setInterpolator(org.telegram.ui.Components.pr.h);
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
            z51 z51Var = ((y51) this).S;
            j71 j71Var = z51Var.e;
            if (j71Var.n1 != null && z51Var.d != null) {
                rect.set(j71Var.o1);
                z10 = true;
                this.x = z10;
                int[] iArr = this.G;
                if (z10) {
                    s61 s61Var = this.a;
                    s61Var.getLocationOnScreen(iArr);
                    rect.left = s61Var.getPaddingLeft() + iArr[0];
                    rect.top = s61Var.getPaddingTop() + iArr[1];
                    rect.right = (s61Var.getWidth() + iArr[0]) - s61Var.getPaddingRight();
                    rect.bottom = (s61Var.getHeight() + iArr[1]) - s61Var.getPaddingBottom();
                } else {
                    this.h.getLocationOnScreen(iArr);
                    rect.offset(iArr[0], iArr[1]);
                }
                if (num != null && (runnable = this.f) != null) {
                    runnable.run();
                }
                d(false, new b71(this, num, 0), new b71(this, num, 1), !z10);
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
        d(false, new b71(this, num, 0), new b71(this, num, 1), !z10);
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
        canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
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
