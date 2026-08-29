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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lm extends fi {
    public static final HashMap Q = new HashMap();
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public im F;
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
    public jh.e1 r;
    public f2.j0 s;
    public km v;
    public UndoView w;
    public TextView x;
    public float y;

    @Override // org.telegram.ui.Components.fi
    public final void B(int i10) {
        ni niVar = this.b;
        if (i10 > 1) {
            niVar.W0.K(0);
        } else {
            niVar.W0.r(0);
        }
    }

    @Override // org.telegram.ui.Components.fi
    public final void D(fi fiVar) {
        km kmVar = this.v;
        this.M = true;
        if (fiVar instanceof ChatAttachAlertPhotoLayout) {
            this.L = (ChatAttachAlertPhotoLayout) fiVar;
            kmVar.c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.L;
            kmVar.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            kmVar.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            kmVar.c();
            kmVar.requestLayout();
            this.s.h1(0, 0);
            this.r.post(new z2(22, this, fiVar));
            postDelayed(new ig(this, 25), 250L);
            kmVar.i(this.L, false);
        } else {
            F();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.K;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.x.animate().alpha(1.0f).setDuration(150L).setInterpolator(jr.f);
        this.K = interpolator;
        interpolator.start();
    }

    @Override // org.telegram.ui.Components.fi
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
            ArrayList arrayList2 = ((jm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                im imVar = (im) obj2;
                RectF d = imVar.d();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(d.width())), Math.max(1, Math.round(d.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-d.left, -d.top);
                imVar.c(canvas, false);
                canvas.restore();
                Bitmap bitmap = imVar.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    imVar.v.recycle();
                }
                imVar.v = createBitmap;
                imVar.w = 0.0f;
                imVar.O.z.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.Components.fi
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
        org.telegram.ui.rn rnVar = this.b.r;
        boolean z10 = false;
        if (rnVar != null && (d = rnVar.d()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (AndroidUtilities.isTablet()) {
                i10 = 16;
            } else {
                Point point = AndroidUtilities.displaySize;
                i10 = point.x > point.y ? 6 : 12;
            }
            if (currentItemTop < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                currentItemTop -= AndroidUtilities.dp((1.0f - (currentItemTop / org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) * i10);
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

    @Override // org.telegram.ui.Components.fi
    public int getCurrentItemTop() {
        jh.e1 e1Var = this.r;
        if (e1Var.getChildCount() <= 0) {
            e1Var.setTopGlowOffset(e1Var.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = e1Var.getChildAt(0);
        vk0 vk0Var = (vk0) e1Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(8.0f);
        if (top < AndroidUtilities.dp(8.0f) || vk0Var == null || vk0Var.b() != 0) {
            top = dp;
        }
        e1Var.setTopGlowOffset(top);
        return top;
    }

    @Override // org.telegram.ui.Components.fi
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.fi
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = AndroidUtilities.displaySize;
        return point.y > point.x ? 0.8f : 0.45f;
    }

    @Override // org.telegram.ui.Components.fi
    public int getSelectedItemsCount() {
        em emVar;
        ArrayList arrayList;
        ArrayList arrayList2 = this.v.b;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jm jmVar = (jm) arrayList2.get(i11);
            if (jmVar != null && (emVar = jmVar.k) != null && (arrayList = emVar.g) != null) {
                i10 = arrayList.size() + i10;
            }
        }
        return i10;
    }

    @Override // org.telegram.ui.Components.fi
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.fi
    public final boolean i() {
        this.b.Z1(false);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        km kmVar = this.v;
        super.onLayout(z10, i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        boolean z11 = point.y > point.x;
        if (this.P != z11) {
            this.P = z11;
            int size = kmVar.b.size();
            for (int i14 = 0; i14 < size; i14++) {
                jm jmVar = (jm) kmVar.b.get(i14);
                if (jmVar.k.g.size() == 1) {
                    jm.a(jmVar, jmVar.k, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.fi
    public final void q() {
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
            ArrayList arrayList2 = ((jm) obj).h;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                im imVar = (im) obj2;
                if (imVar.e && (photoEntry = imVar.b) != null) {
                    photoEntry.isChatPreviewSpoilerRevealed = false;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.fi
    public final void r() {
        ni niVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.M = false;
        ViewPropertyAnimator viewPropertyAnimator = this.K;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.x.animate().alpha(0.0f).setDuration(150L).setInterpolator(jr.j);
        this.K = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (niVar = this.b).f0) != null) {
            chatAttachAlertPhotoLayout.Y0.setIcon(R.drawable.msg_view_file);
            niVar.f0.Y0.setText(LocaleController.getString(R.string.AttachMediaPreviewButton));
            niVar.f0.Y0.setRightIcon(R.drawable.msg_arrowright);
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

    @Override // org.telegram.ui.Components.fi
    public final void t(int i10) {
        try {
            this.b.f0.t(i10);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    @Override // org.telegram.ui.Components.fi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int dp;
        float f9;
        jh.e1 e1Var = this.r;
        this.O = true;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.N = (int) (i11 / 3.5f);
                dp = this.N - AndroidUtilities.dp(52.0f);
                this.N = dp;
                if (dp < 0) {
                    this.N = 0;
                }
                if (e1Var.getPaddingTop() == this.N || e1Var.getPaddingBottom() != this.e) {
                    e1Var.o1(e1Var.getPaddingLeft(), this.N, e1Var.getPaddingRight(), this.e);
                    invalidate();
                }
                TextView textView = this.x;
                if (!AndroidUtilities.isTablet()) {
                    Point point2 = AndroidUtilities.displaySize;
                    if (point2.x > point2.y) {
                        f9 = 18.0f;
                        textView.setTextSize(f9);
                        this.O = false;
                    }
                }
                f9 = 20.0f;
                textView.setTextSize(f9);
                this.O = false;
            }
        }
        this.N = (i11 / 5) * 2;
        dp = this.N - AndroidUtilities.dp(52.0f);
        this.N = dp;
        if (dp < 0) {
        }
        if (e1Var.getPaddingTop() == this.N) {
        }
        e1Var.o1(e1Var.getPaddingLeft(), this.N, e1Var.getPaddingRight(), this.e);
        invalidate();
        TextView textView2 = this.x;
        if (!AndroidUtilities.isTablet()) {
        }
        f9 = 20.0f;
        textView2.setTextSize(f9);
        this.O = false;
    }
}
