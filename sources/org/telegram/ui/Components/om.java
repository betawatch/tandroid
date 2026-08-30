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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class om extends di {
    public static final HashMap R = new HashMap();
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public lm G;
    public boolean H;
    public ValueAnimator I;
    public float J;
    public Drawable K;
    public ViewPropertyAnimator L;
    public ChatAttachAlertPhotoLayout M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;
    public org.telegram.ui.ActionBar.f6 n;
    public lh.e1 r;
    public f2.i0 s;
    public nm v;
    public UndoView w;
    public TextView x;
    public float y;

    @Override // org.telegram.ui.Components.di
    public final void B(int i10) {
        li liVar = this.b;
        if (i10 > 1) {
            liVar.X0.K(0);
        } else {
            liVar.X0.r(0);
        }
    }

    @Override // org.telegram.ui.Components.di
    public final void D(di diVar) {
        nm nmVar = this.v;
        this.N = true;
        if (diVar instanceof ChatAttachAlertPhotoLayout) {
            this.M = (ChatAttachAlertPhotoLayout) diVar;
            nmVar.c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.M;
            nmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            nmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            nmVar.c();
            nmVar.requestLayout();
            this.s.h1(0, 0);
            this.r.post(new il(1, this, diVar));
            postDelayed(new fg(this, 25), 250L);
            nmVar.i(this.M, false);
        } else {
            F();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.L;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.x.animate().alpha(1.0f).setDuration(150L).setInterpolator(nr.f);
        this.L = interpolator;
        interpolator.start();
    }

    @Override // org.telegram.ui.Components.di
    public final void F() {
        this.r.x0(0);
    }

    public final void J() {
        ArrayList arrayList = this.v.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((mm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                lm lmVar = (lm) obj2;
                RectF d = lmVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                lmVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = lmVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    lmVar.v.recycle();
                }
                lmVar.v = createBitmap;
                lmVar.w = 0.0f;
                lmVar.O.z.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.Components.di
    public final void a(CharSequence charSequence) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.M;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.a(charSequence);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable d;
        int i10;
        org.telegram.ui.vn vnVar = this.b.r;
        boolean z4 = false;
        if (vnVar != null && (d = vnVar.d()) != null) {
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
            d.setBounds(0, max, getWidth(), AndroidUtilities.displaySize.y + max);
            d.draw(canvas);
            z4 = true;
        }
        super.dispatchDraw(canvas);
        if (z4) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.di
    public int getCurrentItemTop() {
        lh.e1 e1Var = this.r;
        if (e1Var.getChildCount() <= 0) {
            e1Var.setTopGlowOffset(e1Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = e1Var.getChildAt(0);
        el0 el0Var = (el0) e1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || el0Var == null || el0Var.b() != 0) {
            top = dp;
        }
        e1Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.di
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.di
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = AndroidUtilities.displaySize;
        return point.y > point.x ? 0.8f : 0.45f;
    }

    @Override // org.telegram.ui.Components.di
    public int getSelectedItemsCount() {
        gm gmVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            mm mmVar = (mm) arrayList2.get(i11);
            if (mmVar != null && (gmVar = mmVar.k) != null && (arrayList = gmVar.g) != null) {
                i10 = arrayList.size() + i10;
            }
        }
        return i10;
    }

    @Override // org.telegram.ui.Components.di
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.di
    public final boolean i() {
        this.b.Z1(false);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        nm nmVar = this.v;
        super.onLayout(z4, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        boolean z10 = point.y > point.x;
        if (this.Q != z10) {
            this.Q = z10;
            int size = nmVar.b.size();
            for (int i14 = 0; i14 < size; i14++) {
                mm mmVar = (mm) nmVar.b.get(i14);
                if (mmVar.k.g.size() == 1) {
                    mm.a(mmVar, mmVar.k, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.di
    public final void q() {
        MediaController.PhotoEntry photoEntry;
        this.G = null;
        UndoView undoView = this.w;
        if (undoView != null) {
            undoView.e(0, false);
        }
        ArrayList arrayList = this.v.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((mm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                lm lmVar = (lm) obj2;
                if (lmVar.e && (photoEntry = lmVar.b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.di
    public final void r() {
        li liVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.N = false;
        ViewPropertyAnimator viewPropertyAnimator = this.L;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.x.animate().alpha(0.0f).setDuration(150L).setInterpolator(nr.j);
        this.L = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (liVar = this.b).g0) != null) {
            chatAttachAlertPhotoLayout.Z0.setIcon(R.drawable.msg_view_file);
            liVar.g0.Z0.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            liVar.g0.Z0.setRightIcon(R.drawable.msg_arrowright);
        }
        this.v.i(this.M, true);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.P) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.di
    public final void t(int i10) {
        try {
            this.b.g0.t(i10);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    @Override // org.telegram.ui.Components.di
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int dp;
        float f10;
        lh.e1 e1Var = this.r;
        this.P = true;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.O = (int) (i11 / 3.5f);
                dp = this.O - AndroidUtilities.dp(52.0f);
                this.O = dp;
                if (dp < 0) {
                    this.O = 0;
                }
                if (e1Var.getPaddingTop() == this.O || e1Var.getPaddingBottom() != this.e) {
                    e1Var.o1(e1Var.getPaddingLeft(), this.O, e1Var.getPaddingRight(), this.e);
                    invalidate();
                }
                TextView textView = this.x;
                if (!AndroidUtilities.isTablet()) {
                    Point point2 = AndroidUtilities.displaySize;
                    if (point2.x > point2.y) {
                        f10 = 18.0f;
                        textView.setTextSize(f10);
                        this.P = false;
                    }
                }
                f10 = 20.0f;
                textView.setTextSize(f10);
                this.P = false;
            }
        }
        this.O = (i11 / 5) * 2;
        dp = this.O - AndroidUtilities.dp(52.0f);
        this.O = dp;
        if (dp < 0) {
        }
        if (e1Var.getPaddingTop() == this.O) {
        }
        e1Var.o1(e1Var.getPaddingLeft(), this.O, e1Var.getPaddingRight(), this.e);
        invalidate();
        TextView textView2 = this.x;
        if (!AndroidUtilities.isTablet()) {
        }
        f10 = 20.0f;
        textView2.setTextSize(f10);
        this.P = false;
    }
}
