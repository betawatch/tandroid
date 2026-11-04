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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class am extends th {
    public static final HashMap V = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public xl K;
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
    public ci.j1 r;
    public u4.b0 s;
    public zl w;
    public UndoView x;
    public TextView y;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    @Override // org.telegram.ui.Components.th
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i3, int i10) {
        int L;
        float f10;
        ci.j1 j1Var = this.r;
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
                if (j1Var.getPaddingTop() == this.S || j1Var.getPaddingBottom() != this.e) {
                    j1Var.q1(j1Var.getPaddingLeft(), this.S, j1Var.getPaddingRight(), this.e);
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
        if (j1Var.getPaddingTop() == this.S) {
        }
        j1Var.q1(j1Var.getPaddingLeft(), this.S, j1Var.getPaddingRight(), this.e);
        invalidate();
        TextView textView2 = this.y;
        if (!org.telegram.messenger.g0.Q1()) {
        }
        f10 = 20.0f;
        textView2.setTextSize(f10);
        this.T = false;
    }

    @Override // org.telegram.ui.Components.th
    public final void D(int i3) {
        bi biVar = this.b;
        if (i3 > 1) {
            biVar.V2.S(0);
        } else {
            biVar.V2.t(0);
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void H(th thVar) {
        zl zlVar = this.w;
        this.R = true;
        if (thVar instanceof ChatAttachAlertPhotoLayout) {
            this.Q = (ChatAttachAlertPhotoLayout) thVar;
            zlVar.c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.Q;
            zlVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            zlVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            zlVar.c();
            zlVar.requestLayout();
            this.s.h1(0, 0);
            this.r.post(new cl(1, this, thVar));
            postDelayed(new vf(this, 26), 250L);
            zlVar.i(this.Q, false);
        } else {
            J();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(1.0f).setDuration(150L).setInterpolator(xq.f);
        this.P = interpolator;
        interpolator.start();
    }

    @Override // org.telegram.ui.Components.th
    public final void J() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.th
    public final boolean M() {
        return true;
    }

    public final void O() {
        ArrayList arrayList = this.w.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ArrayList arrayList2 = ((yl) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                xl xlVar = (xl) obj2;
                RectF d = xlVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                xlVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = xlVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    xlVar.v.recycle();
                }
                xlVar.v = createBitmap;
                xlVar.w = 0.0f;
                xlVar.O.z.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void a(CharSequence charSequence) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.Q;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.a(charSequence);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable m10;
        int i3;
        org.telegram.ui.um umVar = this.b.q1;
        boolean z10 = false;
        if (umVar != null && (m10 = umVar.m()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (org.telegram.messenger.g0.Q1()) {
                i3 = 16;
            } else {
                Point point = org.telegram.messenger.g0.q;
                i3 = point.x > point.y ? 6 : 12;
            }
            if (currentItemTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                currentItemTop -= org.telegram.messenger.g0.L((1.0f - (currentItemTop / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) * i3);
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

    @Override // org.telegram.ui.Components.th
    public int getCurrentItemTop() {
        ci.j1 j1Var = this.r;
        if (j1Var.getChildCount() <= 0) {
            j1Var.setTopGlowOffset(j1Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = j1Var.getChildAt(0);
        bj0 bj0Var = (bj0) j1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(8.0f);
        if (top < org.telegram.messenger.g0.L(8.0f) || bj0Var == null || bj0Var.b() != 0) {
            top = L;
        }
        j1Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.th
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.th
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = org.telegram.messenger.g0.q;
        return point.y > point.x ? 0.8f : 0.45f;
    }

    @Override // org.telegram.ui.Components.th
    public int getSelectedItemsCount() {
        ul ulVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.w.b;
        int size = arrayList2.size();
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            yl ylVar = (yl) arrayList2.get(i10);
            if (ylVar != null && (ulVar = ylVar.k) != null && (arrayList = (ArrayList) ulVar.f) != null) {
                i3 = arrayList.size() + i3;
            }
        }
        return i3;
    }

    @Override // org.telegram.ui.Components.th
    public final int j() {
        return 1;
    }

    @Override // org.telegram.ui.Components.th
    public final boolean k() {
        this.b.O1(false);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        zl zlVar = this.w;
        super.onLayout(z10, i3, i10, i11, i12);
        Point point = org.telegram.messenger.g0.q;
        boolean z11 = point.y > point.x;
        if (this.U != z11) {
            this.U = z11;
            int size = zlVar.b.size();
            for (int i13 = 0; i13 < size; i13++) {
                yl ylVar = (yl) zlVar.b.get(i13);
                if (((ArrayList) ylVar.k.f).size() == 1) {
                    yl.a(ylVar, ylVar.k, true);
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

    @Override // org.telegram.ui.Components.th
    public final void t() {
        org.telegram.messenger.ye yeVar;
        this.K = null;
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, false);
        }
        ArrayList arrayList = this.w.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ArrayList arrayList2 = ((yl) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                xl xlVar = (xl) obj2;
                if (xlVar.e && (yeVar = xlVar.b) != null) {
                    yeVar.R = false;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.th
    public final void u() {
        bi biVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.R = false;
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(xq.j);
        this.P = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (biVar = this.b).b2) != null) {
            chatAttachAlertPhotoLayout.d1.setIcon(R.drawable.msg_view_file);
            biVar.b2.d1.setText(org.telegram.messenger.bd.M0(2131753957, null));
            biVar.b2.d1.setRightIcon(R.drawable.msg_arrowright);
        }
        this.w.i(this.Q, true);
    }

    @Override // org.telegram.ui.Components.th
    public final void w(int i3) {
        try {
            this.b.b2.w(i3);
        } catch (Exception unused) {
        }
    }
}
