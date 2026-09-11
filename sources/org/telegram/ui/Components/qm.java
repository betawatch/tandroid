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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class qm extends ni {
    public static final HashMap U = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public nm J;
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
    public bi.o0 r;
    public s4.c0 s;
    public pm v;
    public UndoView w;
    public TextView x;
    public float y;

    @Override // org.telegram.ui.Components.ni
    public final void B(int i10) {
        vi viVar = this.b;
        if (i10 > 1) {
            viVar.a1.K(0);
        } else {
            viVar.a1.r(0);
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final void D(ni niVar) {
        pm pmVar = this.v;
        this.Q = true;
        if (niVar instanceof ChatAttachAlertPhotoLayout) {
            this.P = (ChatAttachAlertPhotoLayout) niVar;
            pmVar.c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
            pmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            pmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            pmVar.c();
            pmVar.requestLayout();
            this.s.h1(0, 0);
            this.r.post(new uc(19, this, niVar));
            postDelayed(new pg(this, 25), 250L);
            pmVar.i(this.P, false);
        } else {
            G();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.x.animate().alpha(1.0f).setDuration(150L).setInterpolator(pr.f);
        this.O = interpolator;
        interpolator.start();
    }

    @Override // org.telegram.ui.Components.ni
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

    @Override // org.telegram.ui.Components.ni
    public final void a(CharSequence charSequence) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.P;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.a(charSequence);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable d;
        int i10;
        org.telegram.ui.ao aoVar = this.b.r;
        boolean z10 = false;
        if (aoVar != null && (d = aoVar.d()) != null) {
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

    @Override // org.telegram.ui.Components.ni
    public int getCurrentItemTop() {
        bi.o0 o0Var = this.r;
        if (o0Var.getChildCount() <= 0) {
            o0Var.setTopGlowOffset(o0Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = o0Var.getChildAt(0);
        vk0 vk0Var = (vk0) o0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || vk0Var == null || vk0Var.b() != 0) {
            top = dp;
        }
        o0Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.ni
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ni
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = AndroidUtilities.displaySize;
        return point.y > point.x ? 0.8f : 0.45f;
    }

    @Override // org.telegram.ui.Components.ni
    public int getSelectedItemsCount() {
        jm jmVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            om omVar = (om) arrayList2.get(i11);
            if (omVar != null && (jmVar = omVar.k) != null && (arrayList = jmVar.g) != null) {
                i10 = arrayList.size() + i10;
            }
        }
        return i10;
    }

    @Override // org.telegram.ui.Components.ni
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean i() {
        this.b.Z1(false);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        pm pmVar = this.v;
        super.onLayout(z10, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        boolean z11 = point.y > point.x;
        if (this.T != z11) {
            this.T = z11;
            int size = pmVar.b.size();
            for (int i14 = 0; i14 < size; i14++) {
                om omVar = (om) pmVar.b.get(i14);
                if (omVar.k.g.size() == 1) {
                    om.a(omVar, omVar.k, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final void q() {
        MediaController.PhotoEntry photoEntry;
        this.J = null;
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

    @Override // org.telegram.ui.Components.ni
    public final void r() {
        vi viVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.Q = false;
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.x.animate().alpha(0.0f).setDuration(150L).setInterpolator(pr.j);
        this.O = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (viVar = this.b).j0) != null) {
            chatAttachAlertPhotoLayout.c1.setIcon(R.drawable.msg_view_file);
            viVar.j0.c1.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            viVar.j0.c1.setRightIcon(R.drawable.msg_arrowright);
        }
        this.v.i(this.P, true);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.S) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ni
    public final void t(int i10) {
        try {
            this.b.j0.t(i10);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    @Override // org.telegram.ui.Components.ni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int dp;
        float f7;
        bi.o0 o0Var = this.r;
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
                if (o0Var.getPaddingTop() == this.R || o0Var.getPaddingBottom() != this.e) {
                    o0Var.n1(o0Var.getPaddingLeft(), this.R, o0Var.getPaddingRight(), this.e);
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
        if (o0Var.getPaddingTop() == this.R) {
        }
        o0Var.n1(o0Var.getPaddingLeft(), this.R, o0Var.getPaddingRight(), this.e);
        invalidate();
        TextView textView2 = this.x;
        if (!AndroidUtilities.isTablet()) {
        }
        f7 = 20.0f;
        textView2.setTextSize(f7);
        this.S = false;
    }
}
