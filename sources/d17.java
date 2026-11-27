// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class d17 extends Dialog {
    public final c17 E;
    public final /* synthetic */ e17 F;
    public final int a;
    public final int b;
    public final Drawable c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final et8 h;
    public final a17 n;
    public TLRPC.TL_chatInviteImporter r;
    public ValueAnimator s;
    public de0 w;
    public BitmapDrawable x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d17(e17 e17Var, Activity activity, d79 d79Var, vnb vnbVar, boolean z) {
        super(activity, R.style.TransparentDialog2);
        this.F = e17Var;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        c17 c17Var = new c17(this, getContext());
        this.E = c17Var;
        final byte b = 1;
        setCancelable(true);
        c17Var.setVisibility(4);
        int i = aob.G8;
        e eVar = e17Var.g;
        aob.v0(i, eVar.getResourceProvider());
        yob.x(c17Var, mutate, i, eVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(c17Var);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.a = rect.top;
        this.b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, vnbVar);
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        yob.h(i, eVar.getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
        c17Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        a17 a17Var = new a17(getContext());
        this.n = a17Var;
        et8 et8Var = new et8(activity, eVar.getActionBar(), d79Var, a17Var);
        this.h = et8Var;
        et8Var.setCreateThumbFromParent(true);
        c17Var.addView(et8Var);
        a17Var.setProfileGalleryView(et8Var);
        c17Var.addView(a17Var);
        textView.setMaxLines(1);
        yob.X(textView, aob.G6, eVar.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(hl.o());
        c17Var.addView(textView);
        yob.X(textView2, aob.y6, eVar.getResourceProvider());
        textView2.setTextSize(14.0f);
        c17Var.addView(textView2);
        b8 b8Var = new b8(0, vnbVar, activity, true, false);
        int i2 = aob.E8;
        int i3 = aob.F8;
        b8Var.c(i2, i3);
        int i4 = aob.I5;
        b8Var.h(1.0f, i4);
        b8Var.j(ob6.M0(z ? 2131754371 : 2131754366, null), R.drawable.msg_requests, null);
        final byte b2 = 0;
        b8Var.setOnClickListener(new View.OnClickListener(this) { // from class: z07
            public final /* synthetic */ d17 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                d17 d17Var = this.b;
                switch (b3) {
                    case 0:
                        e17 e17Var2 = d17Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = d17Var.r;
                        if (tL_chatInviteImporter != null) {
                            e17Var2.d(tL_chatInviteImporter, true);
                        }
                        e17Var2.s.e(false);
                        e17Var2.r = null;
                        break;
                    case 1:
                        d17Var.d();
                        break;
                    default:
                        e17 e17Var3 = d17Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = d17Var.r;
                        if (tL_chatInviteImporter2 != null) {
                            e17Var3.d(tL_chatInviteImporter2, false);
                        }
                        e17Var3.s.e(false);
                        e17Var3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var);
        b8 b8Var2 = new b8(0, vnbVar, activity, false, false);
        b8Var2.c(i2, i3);
        b8Var2.h(1.0f, i4);
        b8Var2.j(ob6.M0(2131745329, null), R.drawable.msg_msgbubble3, null);
        b8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: z07
            public final /* synthetic */ d17 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                d17 d17Var = this.b;
                switch (b3) {
                    case 0:
                        e17 e17Var2 = d17Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = d17Var.r;
                        if (tL_chatInviteImporter != null) {
                            e17Var2.d(tL_chatInviteImporter, true);
                        }
                        e17Var2.s.e(false);
                        e17Var2.r = null;
                        break;
                    case 1:
                        d17Var.d();
                        break;
                    default:
                        e17 e17Var3 = d17Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = d17Var.r;
                        if (tL_chatInviteImporter2 != null) {
                            e17Var3.d(tL_chatInviteImporter2, false);
                        }
                        e17Var3.s.e(false);
                        e17Var3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var2);
        b8 b8Var3 = new b8(0, vnbVar, activity, false, true);
        b8Var3.c(aob.q7, aob.p7);
        b8Var3.h(1.0f, i4);
        b8Var3.j(ob6.M0(2131751333, null), R.drawable.msg_remove, null);
        final byte b3 = 2;
        b8Var3.setOnClickListener(new View.OnClickListener(this) { // from class: z07
            public final /* synthetic */ d17 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                d17 d17Var = this.b;
                switch (b32) {
                    case 0:
                        e17 e17Var2 = d17Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = d17Var.r;
                        if (tL_chatInviteImporter != null) {
                            e17Var2.d(tL_chatInviteImporter, true);
                        }
                        e17Var2.s.e(false);
                        e17Var2.r = null;
                        break;
                    case 1:
                        d17Var.d();
                        break;
                    default:
                        e17 e17Var3 = d17Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = d17Var.r;
                        if (tL_chatInviteImporter2 != null) {
                            e17Var3.d(tL_chatInviteImporter2, false);
                        }
                        e17Var3.s.e(false);
                        e17Var3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var3);
    }

    public final int c() {
        int measuredHeight = this.d.getMeasuredHeight() + hl.L(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + hl.L(4.0f);
        }
        return this.f.getMeasuredHeight() + hl.L(12.0f) + measuredHeight;
    }

    public final /* synthetic */ void d() {
        e17 e17Var = this.F;
        e eVar = e17Var.g;
        if (this.r != null) {
            e17Var.b = true;
            super.dismiss();
            eVar.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.r.user_id);
            eVar.presentFragment(new zu1(bundle));
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.w.getLocationOnScreen(iArr);
        float f = 1.0f;
        et8 et8Var = this.h;
        float width = (this.w.getWidth() * 1.0f) / et8Var.getMeasuredWidth();
        float width2 = (this.w.getWidth() / 2.0f) / width;
        byte b = 0;
        float f2 = 1.0f - width;
        float left = iArr[0] - (et8Var.getLeft() + ((int) ((et8Var.getMeasuredWidth() * f2) / 2.0f)));
        float top = iArr[1] - (et8Var.getTop() + ((int) ((c() * f2) / 2.0f)));
        int i = (-this.f.getTop()) / 2;
        float f3 = 0.0f;
        if (!z) {
            f3 = 1.0f;
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new y07(this, width, left, top, width2, i, (byte) 0));
        this.s.addListener(new b17(this, z, width, b));
        this.s.setDuration(220L);
        this.s.setInterpolator(k43.f);
        this.s.start();
    }

    public final void f() {
        BitmapDrawable bitmapDrawable = this.x;
        int alpha = bitmapDrawable != null ? bitmapDrawable.getAlpha() : jn7.d4;
        Resources resources = getContext().getResources();
        c17 c17Var = this.E;
        int measuredWidth = (int) (c17Var.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (c17Var.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        e eVar = this.F.g;
        ((LaunchActivity) eVar.getParentActivity()).N().getView().draw(canvas);
        canvas.drawColor(vm2.o(-16777216, 76));
        Dialog visibleDialog = eVar.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / jn7.J2));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.x = bitmapDrawable2;
        bitmapDrawable2.setAlpha(alpha);
        getWindow().setBackgroundDrawable(this.x);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.E, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.gravity = 51;
        attributes.flags = i | (-2147417856);
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        getWindow().setAttributes(attributes);
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        hl.d3(new z96(this, (byte) 21), 80L);
    }
}
