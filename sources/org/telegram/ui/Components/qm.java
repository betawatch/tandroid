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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class qm extends ei {
    public static final HashMap R = new HashMap();
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public nm G;
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
    public org.telegram.ui.ActionBar.g6 n;
    public mh.d1 r;
    public f2.j0 s;
    public pm v;
    public UndoView w;
    public TextView x;
    public float y;

    @Override // org.telegram.ui.Components.ei
    public final void B(int i10) {
        mi miVar = this.b;
        if (i10 > 1) {
            miVar.X0.K(0);
        } else {
            miVar.X0.r(0);
        }
    }

    @Override // org.telegram.ui.Components.ei
    public final void D(ei eiVar) {
        pm pmVar = this.v;
        this.N = true;
        if (eiVar instanceof ChatAttachAlertPhotoLayout) {
            this.M = (ChatAttachAlertPhotoLayout) eiVar;
            pmVar.c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.M;
            pmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            pmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            pmVar.c();
            pmVar.requestLayout();
            this.s.h1(0, 0);
            this.r.post(new gm(0, this, eiVar));
            postDelayed(new fg(this, 25), 250L);
            pmVar.i(this.M, false);
        } else {
            F();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.L;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.x.animate().alpha(1.0f).setDuration(150L).setInterpolator(pr.f);
        this.L = interpolator;
        interpolator.start();
    }

    @Override // org.telegram.ui.Components.ei
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
            ArrayList arrayList2 = ((om) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                nm nmVar = (nm) obj2;
                RectF d = nmVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                nmVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = nmVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    nmVar.v.recycle();
                }
                nmVar.v = createBitmap;
                nmVar.w = 0.0f;
                nmVar.O.z.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.Components.ei
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

    @Override // org.telegram.ui.Components.ei
    public int getCurrentItemTop() {
        mh.d1 d1Var = this.r;
        if (d1Var.getChildCount() <= 0) {
            d1Var.setTopGlowOffset(d1Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = d1Var.getChildAt(0);
        fl0 fl0Var = (fl0) d1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || fl0Var == null || fl0Var.b() != 0) {
            top = dp;
        }
        d1Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.ei
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ei
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = AndroidUtilities.displaySize;
        return point.y > point.x ? 0.8f : 0.45f;
    }

    @Override // org.telegram.ui.Components.ei
    public int getSelectedItemsCount() {
        im imVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            om omVar = (om) arrayList2.get(i11);
            if (omVar != null && (imVar = omVar.k) != null && (arrayList = imVar.g) != null) {
                i10 = arrayList.size() + i10;
            }
        }
        return i10;
    }

    @Override // org.telegram.ui.Components.ei
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean i() {
        this.b.Z1(false);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        pm pmVar = this.v;
        super.onLayout(z4, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        boolean z10 = point.y > point.x;
        if (this.Q != z10) {
            this.Q = z10;
            int size = pmVar.b.size();
            for (int i14 = 0; i14 < size; i14++) {
                om omVar = (om) pmVar.b.get(i14);
                if (omVar.k.g.size() == 1) {
                    om.a(omVar, omVar.k, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ei
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
            ArrayList arrayList2 = ((om) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                nm nmVar = (nm) obj2;
                if (nmVar.e && (photoEntry = nmVar.b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ei
    public final void r() {
        mi miVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.N = false;
        ViewPropertyAnimator viewPropertyAnimator = this.L;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.x.animate().alpha(0.0f).setDuration(150L).setInterpolator(pr.j);
        this.L = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (miVar = this.b).g0) != null) {
            chatAttachAlertPhotoLayout.Z0.setIcon(R.drawable.msg_view_file);
            miVar.g0.Z0.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            miVar.g0.Z0.setRightIcon(R.drawable.msg_arrowright);
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

    @Override // org.telegram.ui.Components.ei
    public final void t(int i10) {
        try {
            this.b.g0.t(i10);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    @Override // org.telegram.ui.Components.ei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int dp;
        float f10;
        mh.d1 d1Var = this.r;
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
                if (d1Var.getPaddingTop() == this.O || d1Var.getPaddingBottom() != this.e) {
                    d1Var.o1(d1Var.getPaddingLeft(), this.O, d1Var.getPaddingRight(), this.e);
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
        if (d1Var.getPaddingTop() == this.O) {
        }
        d1Var.o1(d1Var.getPaddingLeft(), this.O, d1Var.getPaddingRight(), this.e);
        invalidate();
        TextView textView2 = this.x;
        if (!AndroidUtilities.isTablet()) {
        }
        f10 = 20.0f;
        textView2.setTextSize(f10);
        this.P = false;
    }
}
