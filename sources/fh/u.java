package fh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u extends Dialog {
    public final /* synthetic */ v A;
    public final int a;
    public final int b;
    public final Drawable c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final ch0 h;
    public final q n;
    public TLRPC.TL_chatInviteImporter r;
    public ValueAnimator s;
    public n9 v;
    public BitmapDrawable w;
    public float x;
    public final t y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, Activity activity, zk0 zk0Var, c6 c6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        this.A = vVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        t tVar = new t(this, getContext());
        this.y = tVar;
        setCancelable(true);
        tVar.setVisibility(4);
        int i10 = g6.G8;
        n2 n2Var = vVar.g;
        int v02 = g6.v0(i10, n2Var.getResourceProvider());
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        mutate.setCallback(tVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.a = rect.top;
        this.b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, c6Var);
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(v02);
        tVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        q qVar = new q(getContext());
        this.n = qVar;
        ch0 ch0Var = new ch0(activity, n2Var.getActionBar(), zk0Var, qVar);
        this.h = ch0Var;
        ch0Var.setCreateThumbFromParent(true);
        tVar.addView(ch0Var);
        qVar.setProfileGalleryView(ch0Var);
        tVar.addView(qVar);
        textView.setMaxLines(1);
        textView.setTextColor(g6.v0(g6.G6, n2Var.getResourceProvider()));
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        tVar.addView(textView);
        textView2.setTextColor(g6.v0(g6.y6, n2Var.getResourceProvider()));
        textView2.setTextSize(14.0f);
        tVar.addView(textView2);
        f1 f1Var = new f1(activity, true, false);
        int i11 = g6.E8;
        int v03 = g6.v0(i11, c6Var);
        int i12 = g6.F8;
        f1Var.c(v03, g6.v0(i12, c6Var));
        int i13 = g6.I5;
        f1Var.setSelectorColor(g6.v0(i13, c6Var));
        f1Var.g(LocaleController.getString(z10 ? R.string.AddToChannel : R.string.AddToGroup), R.drawable.msg_requests, null);
        final int i14 = 0;
        f1Var.setOnClickListener(new View.OnClickListener(this) { // from class: fh.p
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        u uVar = this.b;
                        v vVar2 = uVar.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = uVar.r;
                        if (tL_chatInviteImporter != null) {
                            vVar2.d(tL_chatInviteImporter, true);
                        }
                        vVar2.s.e(false);
                        vVar2.r = null;
                        break;
                    case 1:
                        u.a(this.b);
                        break;
                    default:
                        u uVar2 = this.b;
                        v vVar3 = uVar2.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = uVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            vVar3.d(tL_chatInviteImporter2, false);
                        }
                        vVar3.s.e(false);
                        vVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
        f1 f1Var2 = new f1(activity, false, false);
        f1Var2.c(g6.v0(i11, c6Var), g6.v0(i12, c6Var));
        f1Var2.setSelectorColor(g6.v0(i13, c6Var));
        f1Var2.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        final int i15 = 1;
        f1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: fh.p
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        u uVar = this.b;
                        v vVar2 = uVar.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = uVar.r;
                        if (tL_chatInviteImporter != null) {
                            vVar2.d(tL_chatInviteImporter, true);
                        }
                        vVar2.s.e(false);
                        vVar2.r = null;
                        break;
                    case 1:
                        u.a(this.b);
                        break;
                    default:
                        u uVar2 = this.b;
                        v vVar3 = uVar2.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = uVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            vVar3.d(tL_chatInviteImporter2, false);
                        }
                        vVar3.s.e(false);
                        vVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
        f1 f1Var3 = new f1(activity, false, true);
        f1Var3.c(g6.v0(g6.q7, c6Var), g6.v0(g6.p7, c6Var));
        f1Var3.setSelectorColor(g6.v0(i13, c6Var));
        f1Var3.g(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        final int i16 = 2;
        f1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: fh.p
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        u uVar = this.b;
                        v vVar2 = uVar.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = uVar.r;
                        if (tL_chatInviteImporter != null) {
                            vVar2.d(tL_chatInviteImporter, true);
                        }
                        vVar2.s.e(false);
                        vVar2.r = null;
                        break;
                    case 1:
                        u.a(this.b);
                        break;
                    default:
                        u uVar2 = this.b;
                        v vVar3 = uVar2.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = uVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            vVar3.d(tL_chatInviteImporter2, false);
                        }
                        vVar3.s.e(false);
                        vVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var3);
    }

    public static /* synthetic */ void a(u uVar) {
        v vVar = uVar.A;
        if (uVar.r != null) {
            vVar.b = true;
            n2 n2Var = vVar.g;
            super.dismiss();
            n2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", uVar.r.user_id);
            n2Var.presentFragment(new rn(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        }
        return this.f.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + measuredHeight;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.v.getLocationOnScreen(iArr);
        ch0 ch0Var = this.h;
        final float width = (this.v.getWidth() * 1.0f) / ch0Var.getMeasuredWidth();
        final float width2 = (this.v.getWidth() / 2.0f) / width;
        int i10 = 0;
        float f10 = 1.0f - width;
        final float left = iArr[0] - (ch0Var.getLeft() + ((int) ((ch0Var.getMeasuredWidth() * f10) / 2.0f)));
        final float top = iArr[1] - (ch0Var.getTop() + ((int) ((d() * f10) / 2.0f)));
        final int i11 = (-this.f.getTop()) / 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fh.o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                u uVar = u.this;
                uVar.x = floatValue;
                float f11 = width;
                float z11 = com.google.android.recaptcha.internal.a.z(1.0f, f11, floatValue, f11);
                t tVar = uVar.y;
                tVar.setScaleX(z11);
                tVar.setScaleY(z11);
                tVar.setTranslationX((1.0f - uVar.x) * left);
                tVar.setTranslationY((1.0f - uVar.x) * top);
                int i12 = (int) ((1.0f - uVar.x) * width2);
                uVar.h.N(i12, i12);
                float a2 = h7.n.a((uVar.x * 2.0f) - 1.0f, 0.0f, 1.0f);
                uVar.c.setAlpha((int) (a2 * 255.0f));
                uVar.d.setAlpha(a2);
                uVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = uVar.f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - uVar.x) * i11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = uVar.w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (uVar.x * 255.0f));
                }
                uVar.n.setAlpha(a2);
            }
        });
        this.s.addListener(new r(this, z10, width, i10));
        this.s.setDuration(220L);
        this.s.setInterpolator(er.f);
        this.s.start();
    }

    public final void f() {
        BitmapDrawable bitmapDrawable = this.w;
        int alpha = bitmapDrawable != null ? bitmapDrawable.getAlpha() : 255;
        Resources resources = getContext().getResources();
        t tVar = this.y;
        int measuredWidth = (int) (tVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (tVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        n2 n2Var = this.A.g;
        ((LaunchActivity) n2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.b.k(-16777216, 76));
        Dialog visibleDialog = n2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.w = bitmapDrawable2;
        bitmapDrawable2.setAlpha(alpha);
        getWindow().setBackgroundDrawable(this.w);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.y, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.flags = i10;
        attributes.gravity = 51;
        int i11 = Build.VERSION.SDK_INT;
        attributes.flags = i10 | (-2147417856);
        if (i11 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        getWindow().setAttributes(attributes);
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new f2.r(this, 1), 80L);
    }
}
