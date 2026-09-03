package jh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class u extends Dialog {
    public final /* synthetic */ v B;
    public final int a;
    public final int b;
    public final Drawable c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final wh0 h;
    public final q n;
    public TLRPC.TL_chatInviteImporter r;
    public ValueAnimator s;
    public p9 v;
    public BitmapDrawable w;
    public float x;
    public final t y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, Activity activity, rl0 rl0Var, f6 f6Var, boolean z4) {
        super(activity, R.style.TransparentDialog2);
        this.B = vVar;
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
        int i10 = j6.G8;
        p2 p2Var = vVar.g;
        int v02 = j6.v0(i10, p2Var.getResourceProvider());
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        mutate.setCallback(tVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.a = rect.top;
        this.b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, f6Var);
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(v02);
        tVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        q qVar = new q(getContext());
        this.n = qVar;
        wh0 wh0Var = new wh0(activity, p2Var.getActionBar(), rl0Var, qVar);
        this.h = wh0Var;
        wh0Var.setCreateThumbFromParent(true);
        tVar.addView(wh0Var);
        qVar.setProfileGalleryView(wh0Var);
        tVar.addView(qVar);
        textView.setMaxLines(1);
        textView.setTextColor(j6.v0(j6.G6, p2Var.getResourceProvider()));
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        tVar.addView(textView);
        textView2.setTextColor(j6.v0(j6.y6, p2Var.getResourceProvider()));
        textView2.setTextSize(14.0f);
        tVar.addView(textView2);
        g1 g1Var = new g1(activity, true, false);
        int i11 = j6.E8;
        int v03 = j6.v0(i11, f6Var);
        int i12 = j6.F8;
        g1Var.c(v03, j6.v0(i12, f6Var));
        int i13 = j6.I5;
        g1Var.setSelectorColor(j6.v0(i13, f6Var));
        g1Var.g(LocaleController.getString(z4 ? R.string.AddToChannel : R.string.AddToGroup), R.drawable.msg_requests, null);
        final int i14 = 0;
        g1Var.setOnClickListener(new View.OnClickListener(this) { // from class: jh.p
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        u uVar = this.b;
                        v vVar2 = uVar.B;
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
                        v vVar3 = uVar2.B;
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        g1 g1Var2 = new g1(activity, false, false);
        g1Var2.c(j6.v0(i11, f6Var), j6.v0(i12, f6Var));
        g1Var2.setSelectorColor(j6.v0(i13, f6Var));
        g1Var2.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        final int i15 = 1;
        g1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: jh.p
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        u uVar = this.b;
                        v vVar2 = uVar.B;
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
                        v vVar3 = uVar2.B;
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
        g1 g1Var3 = new g1(activity, false, true);
        g1Var3.c(j6.v0(j6.q7, f6Var), j6.v0(j6.p7, f6Var));
        g1Var3.setSelectorColor(j6.v0(i13, f6Var));
        g1Var3.g(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        final int i16 = 2;
        g1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: jh.p
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        u uVar = this.b;
                        v vVar2 = uVar.B;
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
                        v vVar3 = uVar2.B;
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
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
    }

    public static /* synthetic */ void a(u uVar) {
        v vVar = uVar.B;
        if (uVar.r != null) {
            vVar.b = true;
            p2 p2Var = vVar.g;
            super.dismiss();
            p2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", uVar.r.user_id);
            p2Var.presentFragment(new zn(bundle));
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

    public final void e(boolean z4) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.v.getLocationOnScreen(iArr);
        wh0 wh0Var = this.h;
        final float width = (this.v.getWidth() * 1.0f) / wh0Var.getMeasuredWidth();
        final float width2 = (this.v.getWidth() / 2.0f) / width;
        int i10 = 0;
        float f10 = 1.0f - width;
        final float left = iArr[0] - (wh0Var.getLeft() + ((int) ((wh0Var.getMeasuredWidth() * f10) / 2.0f)));
        final float top = iArr[1] - (wh0Var.getTop() + ((int) ((d() * f10) / 2.0f)));
        final int i11 = (-this.f.getTop()) / 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z4 ? 0.0f : 1.0f, z4 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jh.o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                u uVar = u.this;
                uVar.x = floatValue;
                float f11 = width;
                float w10 = e2.c.w(1.0f, f11, floatValue, f11);
                t tVar = uVar.y;
                tVar.setScaleX(w10);
                tVar.setScaleY(w10);
                tVar.setTranslationX((1.0f - uVar.x) * left);
                tVar.setTranslationY((1.0f - uVar.x) * top);
                int i12 = (int) ((1.0f - uVar.x) * width2);
                uVar.h.N(i12, i12);
                float a2 = k7.n.a((uVar.x * 2.0f) - 1.0f, 0.0f, 1.0f);
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
        this.s.addListener(new r(this, z4, width, i10));
        this.s.setDuration(220L);
        this.s.setInterpolator(mr.f);
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
        p2 p2Var = this.B.g;
        ((LaunchActivity) p2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.k(-16777216, 76));
        Dialog visibleDialog = p2Var.getVisibleDialog();
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
        AndroidUtilities.runOnUIThread(new e3.h(this, 19), 80L);
    }
}
