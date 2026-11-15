package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class im extends ci {
    public static final HashMap V = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public fm K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public Drawable O;
    public ViewPropertyAnimator P;
    public ChatAttachAlertPhotoLayout Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public org.telegram.ui.ActionBar.e6 n;
    public di.c1 r;
    public v4.b0 s;
    public hm w;
    public UndoView x;
    public TextView y;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int L;
        float f10;
        di.c1 c1Var = this.r;
        this.T = true;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                this.S = (int) (i10 / 3.5f);
                L = this.S - org.telegram.messenger.g0.L(52.0f);
                this.S = L;
                if (L < 0) {
                    this.S = 0;
                }
                if (c1Var.getPaddingTop() == this.S || c1Var.getPaddingBottom() != this.e) {
                    c1Var.q1(c1Var.getPaddingLeft(), this.S, c1Var.getPaddingRight(), this.e);
                    invalidate();
                }
                TextView textView = this.y;
                if (!org.telegram.messenger.g0.Q1()) {
                    Point point2 = org.telegram.messenger.g0.q;
                    if (point2.x > point2.y) {
                        f10 = 18.0f;
                        textView.setTextSize(f10);
                        this.T = false;
                    }
                }
                f10 = 20.0f;
                textView.setTextSize(f10);
                this.T = false;
            }
        }
        this.S = (i10 / 5) * 2;
        L = this.S - org.telegram.messenger.g0.L(52.0f);
        this.S = L;
        if (L < 0) {
        }
        if (c1Var.getPaddingTop() == this.S) {
        }
        c1Var.q1(c1Var.getPaddingLeft(), this.S, c1Var.getPaddingRight(), this.e);
        invalidate();
        TextView textView2 = this.y;
        if (!org.telegram.messenger.g0.Q1()) {
        }
        f10 = 20.0f;
        textView2.setTextSize(f10);
        this.T = false;
    }

    @Override // org.telegram.ui.Components.ci
    public final void D(int i7) {
        ki kiVar = this.b;
        if (i7 > 1) {
            kiVar.Y2.T(0);
        } else {
            kiVar.Y2.u(0);
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void I(ci ciVar) {
        hm hmVar = this.w;
        this.R = true;
        if (ciVar instanceof ChatAttachAlertPhotoLayout) {
            this.Q = (ChatAttachAlertPhotoLayout) ciVar;
            hmVar.c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.Q;
            hmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            hmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            hmVar.c();
            hmVar.requestLayout();
            this.s.h1(0, 0);
            this.r.post(new od(20, this, ciVar));
            postDelayed(new dg(this, 28), 250L);
            hmVar.i(this.Q, false);
        } else {
            K();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(1.0f).setDuration(150L).setInterpolator(er.f);
        this.P = interpolator;
        interpolator.start();
    }

    @Override // org.telegram.ui.Components.ci
    public final void K() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean N() {
        return true;
    }

    public final void P() {
        ArrayList arrayList = this.w.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((gm) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                fm fmVar = (fm) obj2;
                RectF d = fmVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                fmVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = fmVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    fmVar.v.recycle();
                }
                fmVar.v = createBitmap;
                fmVar.w = 0.0f;
                fmVar.O.z.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void a(CharSequence charSequence) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.Q;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.a(charSequence);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable m10;
        int i7;
        org.telegram.ui.ym ymVar = this.b.t1;
        boolean z10 = false;
        if (ymVar != null && (m10 = ymVar.m()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (org.telegram.messenger.g0.Q1()) {
                i7 = 16;
            } else {
                Point point = org.telegram.messenger.g0.q;
                i7 = point.x > point.y ? 6 : 12;
            }
            if (currentItemTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                currentItemTop -= org.telegram.messenger.g0.L((1.0f - (currentItemTop / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) * i7);
            }
            int max = Math.max(0, currentItemTop);
            canvas.save();
            canvas.clipRect(0, max, getWidth(), getHeight());
            m10.setBounds(0, max, getWidth(), org.telegram.messenger.g0.q.y + max);
            m10.draw(canvas);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        di.c1 c1Var = this.r;
        if (c1Var.getChildCount() <= 0) {
            c1Var.setTopGlowOffset(c1Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = c1Var.getChildAt(0);
        cj0 cj0Var = (cj0) c1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(8.0f);
        if (top < org.telegram.messenger.g0.L(8.0f) || cj0Var == null || cj0Var.b() != 0) {
            top = L;
        }
        c1Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = org.telegram.messenger.g0.q;
        return point.y > point.x ? 0.8f : 0.45f;
    }

    @Override // org.telegram.ui.Components.ci
    public int getSelectedItemsCount() {
        cm cmVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.w.b;
        int size = arrayList2.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            gm gmVar = (gm) arrayList2.get(i10);
            if (gmVar != null && (cmVar = gmVar.k) != null && (arrayList = (ArrayList) cmVar.f) != null) {
                i7 = arrayList.size() + i7;
            }
        }
        return i7;
    }

    @Override // org.telegram.ui.Components.ci
    public final int j() {
        return 1;
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean k() {
        this.b.O1(false);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        hm hmVar = this.w;
        super.onLayout(z10, i7, i10, i11, i12);
        Point point = org.telegram.messenger.g0.q;
        boolean z11 = point.y > point.x;
        if (this.U != z11) {
            this.U = z11;
            int size = hmVar.b.size();
            for (int i13 = 0; i13 < size; i13++) {
                gm gmVar = (gm) hmVar.b.get(i13);
                if (((ArrayList) gmVar.k.f).size() == 1) {
                    gm.a(gmVar, gmVar.k, true);
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.T) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ci
    public final void t() {
        org.telegram.messenger.ff ffVar;
        this.K = null;
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, false);
        }
        ArrayList arrayList = this.w.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((gm) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                fm fmVar = (fm) obj2;
                if (fmVar.e && (ffVar = fmVar.b) != null) {
                    ffVar.R = false;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void u() {
        ki kiVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.R = false;
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(er.j);
        this.P = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (kiVar = this.b).e2) != null) {
            chatAttachAlertPhotoLayout.d1.setIcon(R.drawable.msg_view_file);
            kiVar.e2.d1.setText(org.telegram.messenger.hd.M0(2131753957, null));
            kiVar.e2.d1.setRightIcon(R.drawable.msg_arrowright);
        }
        this.w.i(this.Q, true);
    }

    @Override // org.telegram.ui.Components.ci
    public final void w(int i7) {
        try {
            this.b.e2.w(i7);
        } catch (Exception unused) {
        }
    }
}
