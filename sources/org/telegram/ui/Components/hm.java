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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hm extends ci {
    public static final HashMap Q = new HashMap();
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public em F;
    public boolean G;
    public ValueAnimator H;
    public float I;
    public Drawable J;
    public ViewPropertyAnimator K;
    public ChatAttachAlertPhotoLayout L;
    public boolean M;
    public int N;
    public boolean O;
    public boolean P;
    public org.telegram.ui.ActionBar.b6 n;
    public gh.f1 r;
    public f2.m0 s;
    public gm v;
    public UndoView w;
    public TextView x;
    public float y;

    @Override // org.telegram.ui.Components.ci
    public final void A(int i9) {
        ki kiVar = this.b;
        if (i9 > 1) {
            kiVar.W0.K(0);
        } else {
            kiVar.W0.r(0);
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void D(ci ciVar) {
        gm gmVar = this.v;
        this.M = true;
        if (ciVar instanceof ChatAttachAlertPhotoLayout) {
            this.L = (ChatAttachAlertPhotoLayout) ciVar;
            gmVar.c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.L;
            gmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            gmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            gmVar.c();
            gmVar.requestLayout();
            this.s.h1(0, 0);
            this.r.post(new org.telegram.ui.wq(25, this, ciVar));
            postDelayed(new fg(this, 25), 250L);
            gmVar.i(this.L, false);
        } else {
            F();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.K;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.x.animate().alpha(1.0f).setDuration(150L).setInterpolator(gr.f);
        this.K = interpolator;
        interpolator.start();
    }

    @Override // org.telegram.ui.Components.ci
    public final void F() {
        this.r.x0(0);
    }

    public final void J() {
        ArrayList arrayList = this.v.b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ArrayList arrayList2 = ((fm) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                em emVar = (em) obj2;
                RectF d = emVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                emVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = emVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    emVar.v.recycle();
                }
                emVar.v = createBitmap;
                emVar.w = 0.0f;
                emVar.O.z.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void a(CharSequence charSequence) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.L;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.a(charSequence);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable d;
        int i9;
        org.telegram.ui.on onVar = this.b.r;
        boolean z10 = false;
        if (onVar != null && (d = onVar.d()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (AndroidUtilities.isTablet()) {
                i9 = 16;
            } else {
                Point point = AndroidUtilities.displaySize;
                i9 = point.x > point.y ? 6 : 12;
            }
            if (currentItemTop < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                currentItemTop -= AndroidUtilities.dp((1.0f - (currentItemTop / org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) * i9);
            }
            int max = Math.max(0, currentItemTop);
            canvas.save();
            canvas.clipRect(0, max, getWidth(), getHeight());
            d.setBounds(0, max, getWidth(), AndroidUtilities.displaySize.y + max);
            d.draw(canvas);
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        gh.f1 f1Var = this.r;
        if (f1Var.getChildCount() <= 0) {
            f1Var.setTopGlowOffset(f1Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = f1Var.getChildAt(0);
        ik0 ik0Var = (ik0) f1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || ik0Var == null || ik0Var.b() != 0) {
            top = dp;
        }
        f1Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = AndroidUtilities.displaySize;
        return point.y > point.x ? 0.8f : 0.45f;
    }

    @Override // org.telegram.ui.Components.ci
    public int getSelectedItemsCount() {
        am amVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.b;
        int size = arrayList2.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            fm fmVar = (fm) arrayList2.get(i10);
            if (fmVar != null && (amVar = fmVar.k) != null && (arrayList = amVar.g) != null) {
                i9 = arrayList.size() + i9;
            }
        }
        return i9;
    }

    @Override // org.telegram.ui.Components.ci
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean i() {
        this.b.Z1(false);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        gm gmVar = this.v;
        super.onLayout(z10, i9, i10, i11, i12);
        Point point = AndroidUtilities.displaySize;
        boolean z11 = point.y > point.x;
        if (this.P != z11) {
            this.P = z11;
            int size = gmVar.b.size();
            for (int i13 = 0; i13 < size; i13++) {
                fm fmVar = (fm) gmVar.b.get(i13);
                if (fmVar.k.g.size() == 1) {
                    fm.a(fmVar, fmVar.k, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void q() {
        MediaController.PhotoEntry photoEntry;
        this.F = null;
        UndoView undoView = this.w;
        if (undoView != null) {
            undoView.e(0, false);
        }
        ArrayList arrayList = this.v.b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ArrayList arrayList2 = ((fm) obj).h;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                em emVar = (em) obj2;
                if (emVar.e && (photoEntry = emVar.b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void r() {
        ki kiVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.M = false;
        ViewPropertyAnimator viewPropertyAnimator = this.K;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.x.animate().alpha(0.0f).setDuration(150L).setInterpolator(gr.j);
        this.K = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (kiVar = this.b).f0) != null) {
            chatAttachAlertPhotoLayout.Y0.setIcon(R.drawable.msg_view_file);
            kiVar.f0.Y0.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            kiVar.f0.Y0.setRightIcon(R.drawable.msg_arrowright);
        }
        this.v.i(this.L, true);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.O) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ci
    public final void t(int i9) {
        try {
            this.b.f0.t(i9);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i9, int i10) {
        int dp;
        float f10;
        gh.f1 f1Var = this.r;
        this.O = true;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.N = (int) (i10 / 3.5f);
                dp = this.N - AndroidUtilities.dp(52.0f);
                this.N = dp;
                if (dp < 0) {
                    this.N = 0;
                }
                if (f1Var.getPaddingTop() == this.N || f1Var.getPaddingBottom() != this.e) {
                    f1Var.o1(f1Var.getPaddingLeft(), this.N, f1Var.getPaddingRight(), this.e);
                    invalidate();
                }
                TextView textView = this.x;
                if (!AndroidUtilities.isTablet()) {
                    Point point2 = AndroidUtilities.displaySize;
                    if (point2.x > point2.y) {
                        f10 = 18.0f;
                        textView.setTextSize(f10);
                        this.O = false;
                    }
                }
                f10 = 20.0f;
                textView.setTextSize(f10);
                this.O = false;
            }
        }
        this.N = (i10 / 5) * 2;
        dp = this.N - AndroidUtilities.dp(52.0f);
        this.N = dp;
        if (dp < 0) {
        }
        if (f1Var.getPaddingTop() == this.N) {
        }
        f1Var.o1(f1Var.getPaddingLeft(), this.N, f1Var.getPaddingRight(), this.e);
        invalidate();
        TextView textView2 = this.x;
        if (!AndroidUtilities.isTablet()) {
        }
        f10 = 20.0f;
        textView2.setTextSize(f10);
        this.O = false;
    }
}
