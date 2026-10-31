package oh;

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
import lg.s;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.b1;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p extends Dialog {
    public final o D;
    public final /* synthetic */ q E;
    public final int a;
    public final int b;
    public final Drawable c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final ug0 h;
    public final m n;
    public TLRPC.TL_chatInviteImporter r;
    public ValueAnimator s;
    public g9 w;
    public BitmapDrawable x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Activity activity, tk0 tk0Var, p6 p6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        this.E = qVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        o oVar = new o(this, getContext());
        this.D = oVar;
        final int i10 = 1;
        setCancelable(true);
        oVar.setVisibility(4);
        int i11 = t6.G8;
        k2 k2Var = qVar.g;
        t6.w0(i11, k2Var.getResourceProvider());
        a7.y(oVar, mutate, i11, k2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(oVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.a = rect.top;
        this.b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, p6Var);
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        a7.i(i11, actionBarPopupWindow$ActionBarPopupWindowLayout, k2Var.getResourceProvider());
        oVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        m mVar = new m(getContext());
        this.n = mVar;
        ug0 ug0Var = new ug0(activity, k2Var.getActionBar(), tk0Var, mVar);
        this.h = ug0Var;
        ug0Var.setCreateThumbFromParent(true);
        oVar.addView(ug0Var);
        mVar.setProfileGalleryView(ug0Var);
        oVar.addView(mVar);
        textView.setMaxLines(1);
        a7.V(textView, t6.G6, k2Var.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(i0.o());
        oVar.addView(textView);
        a7.V(textView2, t6.y6, k2Var.getResourceProvider());
        textView2.setTextSize(14.0f);
        oVar.addView(textView2);
        b1 b1Var = new b1(0, activity, p6Var, true, false);
        int i12 = t6.E8;
        int i13 = t6.F8;
        b1Var.c(i12, i13);
        int i14 = t6.I5;
        b1Var.h(1.0f, i14);
        b1Var.j(cd.L0(z10 ? 2131754378 : 2131754373, null), R.drawable.msg_requests, null);
        final int i15 = 0;
        b1Var.setOnClickListener(new View.OnClickListener(this) { // from class: oh.l
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        p pVar = this.b;
                        q qVar2 = pVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = pVar.r;
                        if (tL_chatInviteImporter != null) {
                            qVar2.d(tL_chatInviteImporter, true);
                        }
                        qVar2.s.e(false);
                        qVar2.r = null;
                        break;
                    case 1:
                        p.a(this.b);
                        break;
                    default:
                        p pVar2 = this.b;
                        q qVar3 = pVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = pVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            qVar3.d(tL_chatInviteImporter2, false);
                        }
                        qVar3.s.e(false);
                        qVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var);
        b1 b1Var2 = new b1(0, activity, p6Var, false, false);
        b1Var2.c(i12, i13);
        b1Var2.h(1.0f, i14);
        b1Var2.j(cd.L0(2131745618, null), R.drawable.msg_msgbubble3, null);
        b1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: oh.l
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        p pVar = this.b;
                        q qVar2 = pVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = pVar.r;
                        if (tL_chatInviteImporter != null) {
                            qVar2.d(tL_chatInviteImporter, true);
                        }
                        qVar2.s.e(false);
                        qVar2.r = null;
                        break;
                    case 1:
                        p.a(this.b);
                        break;
                    default:
                        p pVar2 = this.b;
                        q qVar3 = pVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = pVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            qVar3.d(tL_chatInviteImporter2, false);
                        }
                        qVar3.s.e(false);
                        qVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var2);
        b1 b1Var3 = new b1(0, activity, p6Var, false, true);
        b1Var3.c(t6.q7, t6.p7);
        b1Var3.h(1.0f, i14);
        b1Var3.j(cd.L0(2131751369, null), R.drawable.msg_remove, null);
        final int i16 = 2;
        b1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: oh.l
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        p pVar = this.b;
                        q qVar2 = pVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = pVar.r;
                        if (tL_chatInviteImporter != null) {
                            qVar2.d(tL_chatInviteImporter, true);
                        }
                        qVar2.s.e(false);
                        qVar2.r = null;
                        break;
                    case 1:
                        p.a(this.b);
                        break;
                    default:
                        p pVar2 = this.b;
                        q qVar3 = pVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = pVar2.r;
                        if (tL_chatInviteImporter2 != null) {
                            qVar3.d(tL_chatInviteImporter2, false);
                        }
                        qVar3.s.e(false);
                        qVar3.r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var3);
    }

    public static /* synthetic */ void a(p pVar) {
        q qVar = pVar.E;
        if (pVar.r != null) {
            qVar.b = true;
            k2 k2Var = qVar.g;
            super.dismiss();
            k2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", pVar.r.user_id);
            k2Var.presentFragment(new un(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + i0.L(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + i0.L(4.0f);
        }
        return this.f.getMeasuredHeight() + i0.L(12.0f) + measuredHeight;
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
        this.w.getLocationOnScreen(iArr);
        ug0 ug0Var = this.h;
        float width = (this.w.getWidth() * 1.0f) / ug0Var.getMeasuredWidth();
        float width2 = (this.w.getWidth() / 2.0f) / width;
        int i10 = 0;
        float f7 = 1.0f - width;
        float left = iArr[0] - (ug0Var.getLeft() + ((int) ((ug0Var.getMeasuredWidth() * f7) / 2.0f)));
        float top = iArr[1] - (ug0Var.getTop() + ((int) ((d() * f7) / 2.0f)));
        int i11 = (-this.f.getTop()) / 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new k(this, width, left, top, width2, i11, 0));
        this.s.addListener(new n(this, z10, width, i10));
        this.s.setDuration(220L);
        this.s.setInterpolator(gr.f);
        this.s.start();
    }

    public final void f() {
        BitmapDrawable bitmapDrawable = this.x;
        int alpha = bitmapDrawable != null ? bitmapDrawable.getAlpha() : zs.e4;
        Resources resources = getContext().getResources();
        o oVar = this.D;
        int measuredWidth = (int) (oVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (oVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        k2 k2Var = this.E.g;
        ((LaunchActivity) k2Var.getParentActivity()).M().getView().draw(canvas);
        canvas.drawColor(i0.b.o(-16777216, 76));
        Dialog visibleDialog = k2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / zs.K2));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.x = bitmapDrawable2;
        bitmapDrawable2.setAlpha(alpha);
        getWindow().setBackgroundDrawable(this.x);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.D, new ViewGroup.LayoutParams(-1, -1));
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
        i0.h3(new s(this, 13), 80L);
    }
}
