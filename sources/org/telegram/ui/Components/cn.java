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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class cn extends li {
    public static final HashMap U = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public zm J;
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
    public org.telegram.ui.ActionBar.u6 n;
    public bi.r1 r;
    public s4.c0 s;
    public bn v;
    public UndoView w;
    public TextView x;
    public float y;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    @Override // org.telegram.ui.Components.li
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int dp;
        float f7;
        bi.r1 r1Var = this.r;
        this.S = true;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.R = (int) (i11 / 3.5f);
                dp = this.R - AndroidUtilities.dp(52.0f);
                this.R = dp;
                if (dp < 0) {
                    this.R = 0;
                }
                if (r1Var.getPaddingTop() == this.R || r1Var.getPaddingBottom() != this.e) {
                    r1Var.t1(r1Var.getPaddingLeft(), this.R, r1Var.getPaddingRight(), this.e);
                    invalidate();
                }
                TextView textView = this.x;
                if (!AndroidUtilities.isTablet()) {
                    Point point2 = AndroidUtilities.displaySize;
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
        dp = this.R - AndroidUtilities.dp(52.0f);
        this.R = dp;
        if (dp < 0) {
        }
        if (r1Var.getPaddingTop() == this.R) {
        }
        r1Var.t1(r1Var.getPaddingLeft(), this.R, r1Var.getPaddingRight(), this.e);
        invalidate();
        TextView textView2 = this.x;
        if (!AndroidUtilities.isTablet()) {
        }
        f7 = 20.0f;
        textView2.setTextSize(f7);
        this.S = false;
    }

    @Override // org.telegram.ui.Components.li
    public final void D(int i10) {
        ti tiVar = this.b;
        if (i10 > 1) {
            tiVar.d1.S(0);
        } else {
            tiVar.d1.t(0);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void G(li liVar) {
        bn bnVar = this.v;
        this.Q = true;
        if (liVar instanceof ChatAttachAlertPhotoLayout) {
            this.P = (ChatAttachAlertPhotoLayout) liVar;
            bnVar.c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
            bnVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            bnVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            bnVar.c();
            bnVar.requestLayout();
            this.s.h1(0, 0);
            this.r.post(new org.telegram.ui.kp(29, this, liVar));
            postDelayed(new pg(this, 27), 250L);
            bnVar.i(this.P, false);
        } else {
            J();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.x.animate().alpha(1.0f).setDuration(150L).setInterpolator(ds.f);
        this.O = interpolator;
        interpolator.start();
    }

    @Override // org.telegram.ui.Components.li
    public final void J() {
        this.r.y0(0);
    }

    public final void N() {
        ArrayList arrayList = this.v.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((an) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                zm zmVar = (zm) obj2;
                RectF d = zmVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                zmVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = zmVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    zmVar.v.recycle();
                }
                zmVar.v = createBitmap;
                zmVar.w = 0.0f;
                zmVar.O.z.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void a(CharSequence charSequence) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.a(charSequence);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable l4;
        int i10;
        org.telegram.ui.un unVar = this.b.r;
        boolean z10 = false;
        if (unVar != null && (l4 = unVar.l()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (AndroidUtilities.isTablet()) {
                i10 = 16;
            } else {
                Point point = AndroidUtilities.displaySize;
                i10 = point.x > point.y ? 6 : 12;
            }
            if (currentItemTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                currentItemTop -= AndroidUtilities.dp((1.0f - (currentItemTop / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) * i10);
            }
            int max = Math.max(0, currentItemTop);
            canvas.save();
            canvas.clipRect(0, max, getWidth(), getHeight());
            l4.setBounds(0, max, getWidth(), AndroidUtilities.displaySize.y + max);
            l4.draw(canvas);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        bi.r1 r1Var = this.r;
        if (r1Var.getChildCount() <= 0) {
            r1Var.setTopGlowOffset(r1Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = r1Var.getChildAt(0);
        wl0 wl0Var = (wl0) r1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || wl0Var == null || wl0Var.b() != 0) {
            top = dp;
        }
        r1Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.li
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.li
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = AndroidUtilities.displaySize;
        return point.y > point.x ? 0.8f : 0.45f;
    }

    @Override // org.telegram.ui.Components.li
    public int getSelectedItemsCount() {
        vm vmVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            an anVar = (an) arrayList2.get(i11);
            if (anVar != null && (vmVar = anVar.k) != null && (arrayList = vmVar.g) != null) {
                i10 = arrayList.size() + i10;
            }
        }
        return i10;
    }

    @Override // org.telegram.ui.Components.li
    public final int i() {
        return 1;
    }

    @Override // org.telegram.ui.Components.li
    public final boolean j() {
        this.b.h2(false);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        bn bnVar = this.v;
        super.onLayout(z10, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        boolean z11 = point.y > point.x;
        if (this.T != z11) {
            this.T = z11;
            int size = bnVar.b.size();
            for (int i14 = 0; i14 < size; i14++) {
                an anVar = (an) bnVar.b.get(i14);
                if (anVar.k.g.size() == 1) {
                    an.a(anVar, anVar.k, true);
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

    @Override // org.telegram.ui.Components.li
    public final void s() {
        MediaController.PhotoEntry photoEntry;
        this.J = null;
        UndoView undoView = this.w;
        if (undoView != null) {
            undoView.d(0, false);
        }
        ArrayList arrayList = this.v.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((an) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                zm zmVar = (zm) obj2;
                if (zmVar.e && (photoEntry = zmVar.b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void t() {
        ti tiVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.Q = false;
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.x.animate().alpha(0.0f).setDuration(150L).setInterpolator(ds.j);
        this.O = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (tiVar = this.b).j0) != null) {
            chatAttachAlertPhotoLayout.c1.setIcon(R.drawable.msg_view_file);
            tiVar.j0.c1.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            tiVar.j0.c1.setRightIcon(R.drawable.msg_arrowright);
        }
        this.v.i(this.P, true);
    }

    @Override // org.telegram.ui.Components.li
    public final void v(int i10) {
        try {
            this.b.j0.v(i10);
        } catch (Exception unused) {
        }
    }
}
