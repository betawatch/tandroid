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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class pm extends ki {
    public static final HashMap V = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public mm K;
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
    public org.telegram.ui.ActionBar.i6 n;
    public di.b1 r;
    public v4.c0 s;
    public om w;
    public UndoView x;
    public TextView y;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    @Override // org.telegram.ui.Components.ki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int L;
        float f10;
        di.b1 b1Var = this.r;
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
                if (b1Var.getPaddingTop() == this.S || b1Var.getPaddingBottom() != this.e) {
                    b1Var.q1(b1Var.getPaddingLeft(), this.S, b1Var.getPaddingRight(), this.e);
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
        if (b1Var.getPaddingTop() == this.S) {
        }
        b1Var.q1(b1Var.getPaddingLeft(), this.S, b1Var.getPaddingRight(), this.e);
        invalidate();
        TextView textView2 = this.y;
        if (!org.telegram.messenger.g0.Q1()) {
        }
        f10 = 20.0f;
        textView2.setTextSize(f10);
        this.T = false;
    }

    @Override // org.telegram.ui.Components.ki
    public final void E(int i7) {
        si siVar = this.b;
        if (i7 > 1) {
            siVar.Y2.T(0);
        } else {
            siVar.Y2.u(0);
        }
    }

    @Override // org.telegram.ui.Components.ki
    public final void I(ki kiVar) {
        om omVar = this.w;
        this.R = true;
        if (kiVar instanceof ChatAttachAlertPhotoLayout) {
            this.Q = (ChatAttachAlertPhotoLayout) kiVar;
            omVar.c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.Q;
            omVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            omVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            omVar.c();
            omVar.requestLayout();
            this.s.h1(0, 0);
            this.r.post(new mg(16, this, kiVar));
            postDelayed(new lg(this, 28), 250L);
            omVar.i(this.Q, false);
        } else {
            K();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(1.0f).setDuration(150L).setInterpolator(lr.f);
        this.P = interpolator;
        interpolator.start();
    }

    @Override // org.telegram.ui.Components.ki
    public final void K() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.ki
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
            ArrayList arrayList2 = ((nm) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                mm mmVar = (mm) obj2;
                RectF d = mmVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                mmVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = mmVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    mmVar.v.recycle();
                }
                mmVar.v = createBitmap;
                mmVar.w = 0.0f;
                mmVar.O.z.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.Components.ki
    public final void a(CharSequence charSequence) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.Q;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.a(charSequence);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable c10;
        int i7;
        org.telegram.ui.zm zmVar = this.b.t1;
        boolean z10 = false;
        if (zmVar != null && (c10 = zmVar.c()) != null) {
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
            c10.setBounds(0, max, getWidth(), org.telegram.messenger.g0.q.y + max);
            c10.draw(canvas);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.ki
    public int getCurrentItemTop() {
        di.b1 b1Var = this.r;
        if (b1Var.getChildCount() <= 0) {
            b1Var.setTopGlowOffset(b1Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = b1Var.getChildAt(0);
        kj0 kj0Var = (kj0) b1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(8.0f);
        if (top < org.telegram.messenger.g0.L(8.0f) || kj0Var == null || kj0Var.b() != 0) {
            top = L;
        }
        b1Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.ki
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ki
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = org.telegram.messenger.g0.q;
        return point.y > point.x ? 0.8f : 0.45f;
    }

    @Override // org.telegram.ui.Components.ki
    public int getSelectedItemsCount() {
        jm jmVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.w.b;
        int size = arrayList2.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            nm nmVar = (nm) arrayList2.get(i10);
            if (nmVar != null && (jmVar = nmVar.k) != null && (arrayList = (ArrayList) jmVar.f) != null) {
                i7 = arrayList.size() + i7;
            }
        }
        return i7;
    }

    @Override // org.telegram.ui.Components.ki
    public final int j() {
        return 1;
    }

    @Override // org.telegram.ui.Components.ki
    public final boolean k() {
        this.b.P1(false);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        om omVar = this.w;
        super.onLayout(z10, i7, i10, i11, i12);
        Point point = org.telegram.messenger.g0.q;
        boolean z11 = point.y > point.x;
        if (this.U != z11) {
            this.U = z11;
            int size = omVar.b.size();
            for (int i13 = 0; i13 < size; i13++) {
                nm nmVar = (nm) omVar.b.get(i13);
                if (((ArrayList) nmVar.k.f).size() == 1) {
                    nm.a(nmVar, nmVar.k, true);
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

    @Override // org.telegram.ui.Components.ki
    public final void t() {
        org.telegram.messenger.ef efVar;
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
            ArrayList arrayList2 = ((nm) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                mm mmVar = (mm) obj2;
                if (mmVar.e && (efVar = mmVar.b) != null) {
                    efVar.R = false;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ki
    public final void u() {
        si siVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.R = false;
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(lr.j);
        this.P = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (siVar = this.b).e2) != null) {
            chatAttachAlertPhotoLayout.d1.setIcon(R.drawable.msg_view_file);
            siVar.e2.d1.setText(org.telegram.messenger.gd.M0(2131753955, null));
            siVar.e2.d1.setRightIcon(R.drawable.msg_arrowright);
        }
        this.w.i(this.Q, true);
    }

    @Override // org.telegram.ui.Components.ki
    public final void w(int i7) {
        try {
            this.b.e2.w(i7);
        } catch (Exception unused) {
        }
    }
}
