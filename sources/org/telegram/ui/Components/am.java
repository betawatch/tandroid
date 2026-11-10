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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class am extends uh {
    public static final HashMap U = new HashMap();
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public xl J;
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
    public org.telegram.ui.ActionBar.h6 n;
    public bi.q1 r;
    public v4.b0 s;
    public zl w;
    public UndoView x;
    public TextView y;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    @Override // org.telegram.ui.Components.uh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i7, int i10) {
        int L;
        float f10;
        bi.q1 q1Var = this.r;
        this.S = true;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
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

    @Override // org.telegram.ui.Components.uh
    public final void D(int i7) {
        ci ciVar = this.b;
        if (i7 > 1) {
            ciVar.X2.S(0);
        } else {
            ciVar.X2.t(0);
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void H(uh uhVar) {
        zl zlVar = this.w;
        this.Q = true;
        if (uhVar instanceof ChatAttachAlertPhotoLayout) {
            this.P = (ChatAttachAlertPhotoLayout) uhVar;
            zlVar.c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
            zlVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            zlVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            zlVar.c();
            zlVar.requestLayout();
            this.s.h1(0, 0);
            this.r.post(new org.telegram.ui.fq(27, this, uhVar));
            postDelayed(new wf(this, 26), 250L);
            zlVar.i(this.P, false);
        } else {
            J();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(1.0f).setDuration(150L).setInterpolator(wq.f);
        this.O = interpolator;
        interpolator.start();
    }

    @Override // org.telegram.ui.Components.uh
    public final void J() {
        this.r.y0(0);
    }

    @Override // org.telegram.ui.Components.uh
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
        int i7;
        org.telegram.ui.an anVar = this.b.s1;
        boolean z9 = false;
        if (anVar != null && (m10 = anVar.m()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (org.telegram.messenger.g0.Q1()) {
                i7 = 16;
            } else {
                Point point = org.telegram.messenger.g0.q;
                i7 = point.x > point.y ? 6 : 12;
            }
            if (currentItemTop < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                currentItemTop -= org.telegram.messenger.g0.L((1.0f - (currentItemTop / org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) * i7);
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

    @Override // org.telegram.ui.Components.uh
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

    @Override // org.telegram.ui.Components.uh
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.uh
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = org.telegram.messenger.g0.q;
        return point.y > point.x ? 0.8f : 0.45f;
    }

    @Override // org.telegram.ui.Components.uh
    public int getSelectedItemsCount() {
        ul ulVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.w.b;
        int size = arrayList2.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            yl ylVar = (yl) arrayList2.get(i10);
            if (ylVar != null && (ulVar = ylVar.k) != null && (arrayList = (ArrayList) ulVar.f) != null) {
                i7 = arrayList.size() + i7;
            }
        }
        return i7;
    }

    @Override // org.telegram.ui.Components.uh
    public final int j() {
        return 1;
    }

    @Override // org.telegram.ui.Components.uh
    public final boolean k() {
        this.b.O1(false);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        zl zlVar = this.w;
        super.onLayout(z9, i7, i10, i11, i12);
        Point point = org.telegram.messenger.g0.q;
        boolean z10 = point.y > point.x;
        if (this.T != z10) {
            this.T = z10;
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
        if (this.S) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.uh
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
            ArrayList arrayList2 = ((yl) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                xl xlVar = (xl) obj2;
                if (xlVar.e && (gfVar = xlVar.b) != null) {
                    gfVar.R = false;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.uh
    public final void u() {
        ci ciVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.Q = false;
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(wq.j);
        this.O = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (ciVar = this.b).d2) != null) {
            chatAttachAlertPhotoLayout.c1.setIcon(R.drawable.msg_view_file);
            ciVar.d2.c1.setText(org.telegram.messenger.id.M0(2131753957, null));
            ciVar.d2.c1.setRightIcon(R.drawable.msg_arrowright);
        }
        this.w.i(this.P, true);
    }

    @Override // org.telegram.ui.Components.uh
    public final void w(int i7) {
        try {
            this.b.d2.w(i7);
        } catch (Exception unused) {
        }
    }
}
