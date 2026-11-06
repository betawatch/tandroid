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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class bm extends vh {
    public static final HashMap U = new HashMap();
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public yl J;
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
    public org.telegram.ui.ActionBar.f6 n;
    public bi.q1 r;
    public v4.b0 s;
    public am w;
    public UndoView x;
    public TextView y;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    @Override // org.telegram.ui.Components.vh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int L;
        float f10;
        bi.q1 q1Var = this.r;
        this.S = true;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                this.R = (int) (i10 / 3.5f);
                L = this.R - org.telegram.messenger.g0.L(52.0f);
                this.R = L;
                if (L < 0) {
                    this.R = 0;
                }
                if (q1Var.getPaddingTop() == this.R || q1Var.getPaddingBottom() != this.e) {
                    q1Var.q1(q1Var.getPaddingLeft(), this.R, q1Var.getPaddingRight(), this.e);
                    invalidate();
                }
                TextView textView = this.y;
                if (!org.telegram.messenger.g0.Q1()) {
                    Point point2 = org.telegram.messenger.g0.q;
                    if (point2.x > point2.y) {
                        f10 = 18.0f;
                        textView.setTextSize(f10);
                        this.S = false;
                    }
                }
                f10 = 20.0f;
                textView.setTextSize(f10);
                this.S = false;
            }
        }
        this.R = (i10 / 5) * 2;
        L = this.R - org.telegram.messenger.g0.L(52.0f);
        this.R = L;
        if (L < 0) {
        }
        if (q1Var.getPaddingTop() == this.R) {
        }
        q1Var.q1(q1Var.getPaddingLeft(), this.R, q1Var.getPaddingRight(), this.e);
        invalidate();
        TextView textView2 = this.y;
        if (!org.telegram.messenger.g0.Q1()) {
        }
        f10 = 20.0f;
        textView2.setTextSize(f10);
        this.S = false;
    }

    @Override // org.telegram.ui.Components.vh
    public final void D(int i7) {
        di diVar = this.b;
        if (i7 > 1) {
            diVar.U2.S(0);
        } else {
            diVar.U2.t(0);
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void H(vh vhVar) {
        am amVar = this.w;
        this.Q = true;
        if (vhVar instanceof ChatAttachAlertPhotoLayout) {
            this.P = (ChatAttachAlertPhotoLayout) vhVar;
            amVar.c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
            amVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            amVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            amVar.c();
            amVar.requestLayout();
            this.s.h1(0, 0);
            this.r.post(new f(26, this, vhVar));
            postDelayed(new xf(this, 26), 250L);
            amVar.i(this.P, false);
        } else {
            J();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(1.0f).setDuration(150L).setInterpolator(xq.f);
        this.O = interpolator;
        interpolator.start();
    }

    @Override // org.telegram.ui.Components.vh
    public final void J() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean M() {
        return true;
    }

    public final void O() {
        ArrayList arrayList = this.w.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((zl) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                yl ylVar = (yl) obj2;
                RectF d = ylVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                ylVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = ylVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    ylVar.v.recycle();
                }
                ylVar.v = createBitmap;
                ylVar.w = 0.0f;
                ylVar.O.z.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void a(CharSequence charSequence) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.a(charSequence);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable m10;
        int i7;
        org.telegram.ui.ym ymVar = this.b.p1;
        boolean z9 = false;
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
            z9 = true;
        }
        super.dispatchDraw(canvas);
        if (z9) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.vh
    public int getCurrentItemTop() {
        bi.q1 q1Var = this.r;
        if (q1Var.getChildCount() <= 0) {
            q1Var.setTopGlowOffset(q1Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = q1Var.getChildAt(0);
        xi0 xi0Var = (xi0) q1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(8.0f);
        if (top < org.telegram.messenger.g0.L(8.0f) || xi0Var == null || xi0Var.b() != 0) {
            top = L;
        }
        q1Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.vh
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.vh
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = org.telegram.messenger.g0.q;
        return point.y > point.x ? 0.8f : 0.45f;
    }

    @Override // org.telegram.ui.Components.vh
    public int getSelectedItemsCount() {
        vl vlVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.w.b;
        int size = arrayList2.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            zl zlVar = (zl) arrayList2.get(i10);
            if (zlVar != null && (vlVar = zlVar.k) != null && (arrayList = (ArrayList) vlVar.f) != null) {
                i7 = arrayList.size() + i7;
            }
        }
        return i7;
    }

    @Override // org.telegram.ui.Components.vh
    public final int j() {
        return 1;
    }

    @Override // org.telegram.ui.Components.vh
    public final boolean k() {
        this.b.O1(false);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        am amVar = this.w;
        super.onLayout(z9, i7, i10, i11, i12);
        Point point = org.telegram.messenger.g0.q;
        boolean z10 = point.y > point.x;
        if (this.T != z10) {
            this.T = z10;
            int size = amVar.b.size();
            for (int i13 = 0; i13 < size; i13++) {
                zl zlVar = (zl) amVar.b.get(i13);
                if (((ArrayList) zlVar.k.f).size() == 1) {
                    zl.a(zlVar, zlVar.k, true);
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

    @Override // org.telegram.ui.Components.vh
    public final void t() {
        org.telegram.messenger.gf gfVar;
        this.J = null;
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
            ArrayList arrayList2 = ((zl) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                yl ylVar = (yl) obj2;
                if (ylVar.e && (gfVar = ylVar.b) != null) {
                    gfVar.R = false;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void u() {
        di diVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.Q = false;
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(xq.j);
        this.O = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (diVar = this.b).a2) != null) {
            chatAttachAlertPhotoLayout.c1.setIcon(R.drawable.msg_view_file);
            diVar.a2.c1.setText(org.telegram.messenger.hd.M0(2131753957, null));
            diVar.a2.c1.setRightIcon(R.drawable.msg_arrowright);
        }
        this.w.i(this.P, true);
    }

    @Override // org.telegram.ui.Components.vh
    public final void w(int i7) {
        try {
            this.b.a2.w(i7);
        } catch (Exception unused) {
        }
    }
}
