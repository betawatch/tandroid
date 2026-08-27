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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class em extends yh {
    public static final HashMap Q = new HashMap();
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public bm F;
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
    public org.telegram.ui.ActionBar.c6 n;
    public hh.f1 r;
    public f2.k0 s;
    public dm v;
    public UndoView w;
    public TextView x;
    public float y;

    @Override // org.telegram.ui.Components.yh
    public final void C(int i10) {
        gi giVar = this.b;
        if (i10 > 1) {
            giVar.W0.K(0);
        } else {
            giVar.W0.r(0);
        }
    }

    @Override // org.telegram.ui.Components.yh
    public final void E(yh yhVar) {
        dm dmVar = this.v;
        this.M = true;
        if (yhVar instanceof ChatAttachAlertPhotoLayout) {
            this.L = (ChatAttachAlertPhotoLayout) yhVar;
            dmVar.c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.L;
            dmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            dmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            dmVar.c();
            dmVar.requestLayout();
            this.s.h1(0, 0);
            this.r.post(new org.telegram.ui.yq(25, this, yhVar));
            postDelayed(new bg(this, 25), 250L);
            dmVar.i(this.L, false);
        } else {
            G();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.K;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.x.animate().alpha(1.0f).setDuration(150L).setInterpolator(er.f);
        this.K = interpolator;
        interpolator.start();
    }

    @Override // org.telegram.ui.Components.yh
    public final void G() {
        this.r.x0(0);
    }

    public final void K() {
        ArrayList arrayList = this.v.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((cm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                bm bmVar = (bm) obj2;
                RectF d = bmVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                bmVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = bmVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    bmVar.v.recycle();
                }
                bmVar.v = createBitmap;
                bmVar.w = 0.0f;
                bmVar.O.z.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.Components.yh
    public final void a(CharSequence charSequence) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.L;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.a(charSequence);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable d;
        int i10;
        org.telegram.ui.pn pnVar = this.b.r;
        boolean z10 = false;
        if (pnVar != null && (d = pnVar.d()) != null) {
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
            z10 = true;
        }
        super.dispatchDraw(canvas);
        if (z10) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.yh
    public int getCurrentItemTop() {
        hh.f1 f1Var = this.r;
        if (f1Var.getChildCount() <= 0) {
            f1Var.setTopGlowOffset(f1Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = f1Var.getChildAt(0);
        lk0 lk0Var = (lk0) f1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || lk0Var == null || lk0Var.b() != 0) {
            top = dp;
        }
        f1Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.yh
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.yh
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = AndroidUtilities.displaySize;
        return point.y > point.x ? 0.8f : 0.45f;
    }

    @Override // org.telegram.ui.Components.yh
    public int getSelectedItemsCount() {
        wl wlVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            cm cmVar = (cm) arrayList2.get(i11);
            if (cmVar != null && (wlVar = cmVar.k) != null && (arrayList = wlVar.g) != null) {
                i10 = arrayList.size() + i10;
            }
        }
        return i10;
    }

    @Override // org.telegram.ui.Components.yh
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.yh
    public final boolean i() {
        this.b.Z1(false);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        dm dmVar = this.v;
        super.onLayout(z10, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        boolean z11 = point.y > point.x;
        if (this.P != z11) {
            this.P = z11;
            int size = dmVar.b.size();
            for (int i14 = 0; i14 < size; i14++) {
                cm cmVar = (cm) dmVar.b.get(i14);
                if (cmVar.k.g.size() == 1) {
                    cm.a(cmVar, cmVar.k, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.yh
    public final void r() {
        MediaController.PhotoEntry photoEntry;
        this.F = null;
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
            ArrayList arrayList2 = ((cm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                bm bmVar = (bm) obj2;
                if (bmVar.e && (photoEntry = bmVar.b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.O) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.yh
    public final void s() {
        gi giVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.M = false;
        ViewPropertyAnimator viewPropertyAnimator = this.K;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.x.animate().alpha(0.0f).setDuration(150L).setInterpolator(er.j);
        this.K = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (giVar = this.b).f0) != null) {
            chatAttachAlertPhotoLayout.Y0.setIcon(R.drawable.msg_view_file);
            giVar.f0.Y0.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            giVar.f0.Y0.setRightIcon(R.drawable.msg_arrowright);
        }
        this.v.i(this.L, true);
    }

    @Override // org.telegram.ui.Components.yh
    public final void u(int i10) {
        try {
            this.b.f0.u(i10);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    @Override // org.telegram.ui.Components.yh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(int i10, int i11) {
        int dp;
        float f10;
        hh.f1 f1Var = this.r;
        this.O = true;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.N = (int) (i11 / 3.5f);
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
        this.N = (i11 / 5) * 2;
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
