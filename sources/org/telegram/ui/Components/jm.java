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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jm extends uh {
    public static final HashMap U = new HashMap();
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public gm J;
    public boolean K;
    public ValueAnimator L;
    public float M;
    public Drawable N;
    public ViewPropertyAnimator O;
    public ChatAttachAlertPhotoLayout P;
    public boolean Q;
    public int R;
    public boolean S;
    public boolean T;
    public org.telegram.ui.ActionBar.p6 n;
    public ag.b1 r;
    public s4.a0 s;
    public im w;
    public UndoView x;
    public TextView y;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    @Override // org.telegram.ui.Components.uh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int L;
        float f7;
        ag.b1 b1Var = this.r;
        this.S = true;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (!org.telegram.messenger.i0.Q1()) {
            Point point = org.telegram.messenger.i0.q;
            if (point.x > point.y) {
                this.R = (int) (i11 / 3.5f);
                L = this.R - org.telegram.messenger.i0.L(52.0f);
                this.R = L;
                if (L < 0) {
                    this.R = 0;
                }
                if (b1Var.getPaddingTop() == this.R || b1Var.getPaddingBottom() != this.e) {
                    b1Var.q1(b1Var.getPaddingLeft(), this.R, b1Var.getPaddingRight(), this.e);
                    invalidate();
                }
                TextView textView = this.y;
                if (!org.telegram.messenger.i0.Q1()) {
                    Point point2 = org.telegram.messenger.i0.q;
                    if (point2.x > point2.y) {
                        f7 = 18.0f;
                        textView.setTextSize(f7);
                        this.S = false;
                    }
                }
                f7 = 20.0f;
                textView.setTextSize(f7);
                this.S = false;
            }
        }
        this.R = (i11 / 5) * 2;
        L = this.R - org.telegram.messenger.i0.L(52.0f);
        this.R = L;
        if (L < 0) {
        }
        if (b1Var.getPaddingTop() == this.R) {
        }
        b1Var.q1(b1Var.getPaddingLeft(), this.R, b1Var.getPaddingRight(), this.e);
        invalidate();
        TextView textView2 = this.y;
        if (!org.telegram.messenger.i0.Q1()) {
        }
        f7 = 20.0f;
        textView2.setTextSize(f7);
        this.S = false;
    }

    @Override // org.telegram.ui.Components.uh
    public final void D(int i10) {
        bi biVar = this.b;
        if (i10 > 1) {
            biVar.U2.S(0);
        } else {
            biVar.U2.t(0);
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void G(uh uhVar) {
        im imVar = this.w;
        this.Q = true;
        if (uhVar instanceof ChatAttachAlertPhotoLayout) {
            this.P = (ChatAttachAlertPhotoLayout) uhVar;
            imVar.c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
            imVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            imVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            imVar.c();
            imVar.requestLayout();
            this.s.h1(0, 0);
            this.r.post(new cd(20, this, uhVar));
            postDelayed(new tf(this, 27), 250L);
            imVar.i(this.P, false);
        } else {
            I();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(1.0f).setDuration(150L).setInterpolator(gr.f);
        this.O = interpolator;
        interpolator.start();
    }

    @Override // org.telegram.ui.Components.uh
    public final void I() {
        this.r.y0(0);
    }

    public final void N() {
        ArrayList arrayList = this.w.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((hm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                gm gmVar = (gm) obj2;
                RectF d = gmVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                gmVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = gmVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    gmVar.v.recycle();
                }
                gmVar.v = createBitmap;
                gmVar.w = 0.0f;
                gmVar.O.z.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void a(CharSequence charSequence) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.a(charSequence);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable m10;
        int i10;
        org.telegram.ui.sn snVar = this.b.p1;
        boolean z10 = false;
        if (snVar != null && (m10 = snVar.m()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (org.telegram.messenger.i0.Q1()) {
                i10 = 16;
            } else {
                Point point = org.telegram.messenger.i0.q;
                i10 = point.x > point.y ? 6 : 12;
            }
            if (currentItemTop < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                currentItemTop -= org.telegram.messenger.i0.L((1.0f - (currentItemTop / org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) * i10);
            }
            int max = Math.max(0, currentItemTop);
            canvas.save();
            canvas.clipRect(0, max, getWidth(), getHeight());
            m10.setBounds(0, max, getWidth(), org.telegram.messenger.i0.q.y + max);
            m10.draw(canvas);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.uh
    public int getCurrentItemTop() {
        ag.b1 b1Var = this.r;
        if (b1Var.getChildCount() <= 0) {
            b1Var.setTopGlowOffset(b1Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = b1Var.getChildAt(0);
        ck0 ck0Var = (ck0) b1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.i0.L(8.0f);
        if (top < org.telegram.messenger.i0.L(8.0f) || ck0Var == null || ck0Var.b() != 0) {
            top = L;
        }
        b1Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.uh
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = org.telegram.messenger.i0.q;
        return point.y > point.x ? 0.8f : 0.45f;
    }

    @Override // org.telegram.ui.Components.uh
    public int getSelectedItemsCount() {
        dm dmVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.w.b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            hm hmVar = (hm) arrayList2.get(i11);
            if (hmVar != null && (dmVar = hmVar.k) != null && (arrayList = (ArrayList) dmVar.f) != null) {
                i10 = arrayList.size() + i10;
            }
        }
        return i10;
    }

    @Override // org.telegram.ui.Components.uh
    public final int i() {
        return 1;
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean j() {
        this.b.N1(false);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        im imVar = this.w;
        super.onLayout(z10, i10, i11, i12, i13);
        Point point = org.telegram.messenger.i0.q;
        boolean z11 = point.y > point.x;
        if (this.T != z11) {
            this.T = z11;
            int size = imVar.b.size();
            for (int i14 = 0; i14 < size; i14++) {
                hm hmVar = (hm) imVar.b.get(i14);
                if (((ArrayList) hmVar.k.f).size() == 1) {
                    hm.a(hmVar, hmVar.k, true);
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.S) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.uh
    public final void s() {
        org.telegram.messenger.ef efVar;
        this.J = null;
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, false);
        }
        ArrayList arrayList = this.w.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((hm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                gm gmVar = (gm) obj2;
                if (gmVar.e && (efVar = gmVar.b) != null) {
                    efVar.R = false;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void t() {
        bi biVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.Q = false;
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(gr.j);
        this.O = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (biVar = this.b).a2) != null) {
            chatAttachAlertPhotoLayout.c1.setIcon(R.drawable.msg_view_file);
            biVar.a2.c1.setText(org.telegram.messenger.cd.L0(2131753957, null));
            biVar.a2.c1.setRightIcon(R.drawable.msg_arrowright);
        }
        this.w.i(this.P, true);
    }

    @Override // org.telegram.ui.Components.uh
    public final void w(int i10) {
        try {
            this.b.a2.w(i10);
        } catch (Exception unused) {
        }
    }
}
