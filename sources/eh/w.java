package eh;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w extends Dialog {
    public final /* synthetic */ x A;
    public final int a;
    public final int b;
    public final Drawable c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final ah0 h;
    public final s n;
    public TLRPC.TL_chatInviteImporter r;
    public ValueAnimator s;
    public o9 v;
    public BitmapDrawable w;
    public float x;
    public final v y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Activity activity, wk0 wk0Var, b6 b6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        this.A = xVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        v vVar = new v(this, getContext());
        this.y = vVar;
        setCancelable(true);
        vVar.setVisibility(4);
        int i9 = f6.G8;
        o2 o2Var = xVar.g;
        int v02 = f6.v0(i9, o2Var.getResourceProvider());
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        mutate.setCallback(vVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.a = rect.top;
        this.b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, b6Var);
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(v02);
        vVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        s sVar = new s(getContext());
        this.n = sVar;
        ah0 ah0Var = new ah0(activity, o2Var.getActionBar(), wk0Var, sVar);
        this.h = ah0Var;
        ah0Var.setCreateThumbFromParent(true);
        vVar.addView(ah0Var);
        sVar.setProfileGalleryView(ah0Var);
        vVar.addView(sVar);
        textView.setMaxLines(1);
        textView.setTextColor(f6.v0(f6.G6, o2Var.getResourceProvider()));
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        vVar.addView(textView);
        textView2.setTextColor(f6.v0(f6.y6, o2Var.getResourceProvider()));
        textView2.setTextSize(14.0f);
        vVar.addView(textView2);
        g1 g1Var = new g1(activity, true, false);
        int i10 = f6.E8;
        int v03 = f6.v0(i10, b6Var);
        int i11 = f6.F8;
        g1Var.c(v03, f6.v0(i11, b6Var));
        int i12 = f6.I5;
        g1Var.setSelectorColor(f6.v0(i12, b6Var));
        g1Var.g(LocaleController.getString(z10 ? R.string.AddToChannel : R.string.AddToGroup), R.drawable.msg_requests, null);
        final int i13 = 0;
        g1Var.setOnClickListener(new View.OnClickListener(this) { // from class: eh.r
            public final /* synthetic */ w b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        w wVar = this.b;
                        x xVar2 = wVar.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = wVar.r;
                        if (tL_chatInviteImporter != null) {
                            xVar2.d(tL_chatInviteImporter, true);
                        }
                        xVar2.s.e(false);
                        xVar2.r = null;
                        break;
                    case 1:
                        w.a(this.b);
                        break;
                    default:
                        w wVar2 = this.b;
                        x xVar3 = wVar2.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = wVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            xVar3.d(tL_chatInviteImporter2, false);
                        }
                        xVar3.s.e(false);
                        xVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        g1 g1Var2 = new g1(activity, false, false);
        g1Var2.c(f6.v0(i10, b6Var), f6.v0(i11, b6Var));
        g1Var2.setSelectorColor(f6.v0(i12, b6Var));
        g1Var2.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        final int i14 = 1;
        g1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: eh.r
            public final /* synthetic */ w b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        w wVar = this.b;
                        x xVar2 = wVar.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = wVar.r;
                        if (tL_chatInviteImporter != null) {
                            xVar2.d(tL_chatInviteImporter, true);
                        }
                        xVar2.s.e(false);
                        xVar2.r = null;
                        break;
                    case 1:
                        w.a(this.b);
                        break;
                    default:
                        w wVar2 = this.b;
                        x xVar3 = wVar2.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = wVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            xVar3.d(tL_chatInviteImporter2, false);
                        }
                        xVar3.s.e(false);
                        xVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
        g1 g1Var3 = new g1(activity, false, true);
        g1Var3.c(f6.v0(f6.q7, b6Var), f6.v0(f6.p7, b6Var));
        g1Var3.setSelectorColor(f6.v0(i12, b6Var));
        g1Var3.g(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        final int i15 = 2;
        g1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: eh.r
            public final /* synthetic */ w b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        w wVar = this.b;
                        x xVar2 = wVar.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = wVar.r;
                        if (tL_chatInviteImporter != null) {
                            xVar2.d(tL_chatInviteImporter, true);
                        }
                        xVar2.s.e(false);
                        xVar2.r = null;
                        break;
                    case 1:
                        w.a(this.b);
                        break;
                    default:
                        w wVar2 = this.b;
                        x xVar3 = wVar2.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = wVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            xVar3.d(tL_chatInviteImporter2, false);
                        }
                        xVar3.s.e(false);
                        xVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
    }

    public static /* synthetic */ void a(w wVar) {
        x xVar = wVar.A;
        if (wVar.r != null) {
            xVar.b = true;
            o2 o2Var = xVar.g;
            super.dismiss();
            o2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", wVar.r.user_id);
            o2Var.presentFragment(new qn(bundle));
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
        ah0 ah0Var = this.h;
        final float width = (this.v.getWidth() * 1.0f) / ah0Var.getMeasuredWidth();
        final float width2 = (this.v.getWidth() / 2.0f) / width;
        int i9 = 0;
        float f10 = 1.0f - width;
        final float left = iArr[0] - (ah0Var.getLeft() + ((int) ((ah0Var.getMeasuredWidth() * f10) / 2.0f)));
        final float top = iArr[1] - (ah0Var.getTop() + ((int) ((d() * f10) / 2.0f)));
        final int i10 = (-this.f.getTop()) / 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eh.q
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                w wVar = w.this;
                wVar.x = floatValue;
                float f11 = width;
                float z11 = e2.c.z(1.0f, f11, floatValue, f11);
                v vVar = wVar.y;
                vVar.setScaleX(z11);
                vVar.setScaleY(z11);
                vVar.setTranslationX((1.0f - wVar.x) * left);
                vVar.setTranslationY((1.0f - wVar.x) * top);
                int i11 = (int) ((1.0f - wVar.x) * width2);
                wVar.h.N(i11, i11);
                float a2 = g7.n.a((wVar.x * 2.0f) - 1.0f, 0.0f, 1.0f);
                wVar.c.setAlpha((int) (a2 * 255.0f));
                wVar.d.setAlpha(a2);
                wVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = wVar.f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - wVar.x) * i10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = wVar.w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (wVar.x * 255.0f));
                }
                wVar.n.setAlpha(a2);
            }
        });
        this.s.addListener(new t(this, z10, width, i9));
        this.s.setDuration(220L);
        this.s.setInterpolator(gr.f);
        this.s.start();
    }

    public final void f() {
        BitmapDrawable bitmapDrawable = this.w;
        int alpha = bitmapDrawable != null ? bitmapDrawable.getAlpha() : 255;
        Resources resources = getContext().getResources();
        v vVar = this.y;
        int measuredWidth = (int) (vVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (vVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        o2 o2Var = this.A.g;
        ((LaunchActivity) o2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.k(-16777216, 76));
        Dialog visibleDialog = o2Var.getVisibleDialog();
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
        int i9 = attributes.flags & (-3);
        attributes.flags = i9;
        attributes.gravity = 51;
        int i10 = Build.VERSION.SDK_INT;
        attributes.flags = i9 | (-2147417856);
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        getWindow().setAttributes(attributes);
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new af.e(this, 23), 80L);
    }
}
