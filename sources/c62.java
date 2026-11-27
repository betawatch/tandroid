// default package

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class c62 extends f12 {
    public static final HashMap V = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public z52 K;
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
    public vnb n;
    public gu r;
    public x46 s;
    public b62 w;
    public UndoView x;
    public TextView y;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    @Override // f12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i, int i2) {
        int i3;
        int L;
        float f;
        gu guVar = this.r;
        this.T = true;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        if (!hl.O1()) {
            Point point = hl.q;
            if (point.x > point.y) {
                i3 = (int) (i2 / 3.5f);
                this.S = i3;
                L = i3 - hl.L(52.0f);
                this.S = L;
                if (L < 0) {
                    this.S = 0;
                }
                if (guVar.getPaddingTop() == this.S || guVar.getPaddingBottom() != this.e) {
                    guVar.r1(guVar.getPaddingLeft(), this.S, guVar.getPaddingRight(), this.e);
                    invalidate();
                }
                TextView textView = this.y;
                if (!hl.O1()) {
                    Point point2 = hl.q;
                    if (point2.x > point2.y) {
                        f = 18.0f;
                        textView.setTextSize(f);
                        this.T = false;
                    }
                }
                f = 20.0f;
                textView.setTextSize(f);
                this.T = false;
            }
        }
        i3 = (i2 / 5) << 1;
        this.S = i3;
        L = i3 - hl.L(52.0f);
        this.S = L;
        if (L < 0) {
        }
        if (guVar.getPaddingTop() == this.S) {
        }
        guVar.r1(guVar.getPaddingLeft(), this.S, guVar.getPaddingRight(), this.e);
        invalidate();
        TextView textView2 = this.y;
        if (!hl.O1()) {
        }
        f = 20.0f;
        textView2.setTextSize(f);
        this.T = false;
    }

    @Override // f12
    public final void E(int i) {
        n12 n12Var = this.b;
        if (i > 1) {
            n12Var.X2.S(0);
        } else {
            n12Var.X2.u(0);
        }
    }

    @Override // f12
    public final void H(f12 f12Var) {
        b62 b62Var = this.w;
        this.R = true;
        if (f12Var instanceof ChatAttachAlertPhotoLayout) {
            this.Q = (ChatAttachAlertPhotoLayout) f12Var;
            b62Var.c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.Q;
            b62Var.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            b62Var.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            b62Var.c();
            b62Var.requestLayout();
            this.s.g1(0, 0);
            this.r.post(new dy1(this, f12Var, (byte) 21));
            postDelayed(new go1(this, (byte) 24), 250L);
            b62Var.i(this.Q, false);
        } else {
            J();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(1.0f).setDuration(150L).setInterpolator(k43.f);
        this.P = interpolator;
        interpolator.start();
    }

    @Override // f12
    public final void J() {
        this.r.A0(0);
    }

    @Override // f12
    public final boolean M() {
        return true;
    }

    public final void O() {
        ArrayList arrayList = this.w.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((a62) obj).h;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                z52 z52Var = (z52) obj2;
                RectF b = z52Var.b();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(b.width())), Math.max(1, Math.round(b.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-b.left, -b.top);
                z52Var.a(canvas, false);
                canvas.restore();
                Bitmap bitmap = z52Var.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    z52Var.v.recycle();
                }
                z52Var.v = createBitmap;
                z52Var.w = 0.0f;
                z52Var.O.z.invalidate();
            }
        }
    }

    @Override // f12
    public final void a(Editable editable) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.Q;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.a(editable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable l;
        int i;
        xu1 xu1Var = this.b.s1;
        boolean z = false;
        if (xu1Var != null && (l = xu1Var.l()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (hl.O1()) {
                i = 16;
            } else {
                Point point = hl.q;
                i = point.x > point.y ? 6 : 12;
            }
            if (currentItemTop < a.getCurrentActionBarHeight()) {
                currentItemTop -= hl.L((1.0f - (currentItemTop / a.getCurrentActionBarHeight())) * i);
            }
            int max = Math.max(0, currentItemTop);
            canvas.save();
            canvas.clipRect(0, max, getWidth(), getHeight());
            l.setBounds(0, max, getWidth(), hl.q.y + max);
            l.draw(canvas);
            z = true;
        }
        super.dispatchDraw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    @Override // f12
    public int getCurrentItemTop() {
        gu guVar = this.r;
        if (guVar.getChildCount() <= 0) {
            guVar.setTopGlowOffset(guVar.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = guVar.getChildAt(0);
        n69 n69Var = (n69) guVar.H(childAt);
        int top = childAt.getTop();
        int L = hl.L(8.0f);
        if (top < hl.L(8.0f) || n69Var == null || n69Var.b() != 0) {
            top = L;
        }
        guVar.setTopGlowOffset(top);
        return top;
    }

    @Override // f12
    public int getFirstOffset() {
        return hl.L(56.0f) + getListTopPadding();
    }

    @Override // f12
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = hl.q;
        return point.y > point.x ? 0.8f : 0.45f;
    }

    @Override // f12
    public int getSelectedItemsCount() {
        w52 w52Var;
        ArrayList arrayList;
        ArrayList arrayList2 = this.w.b;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            a62 a62Var = (a62) arrayList2.get(i2);
            if (a62Var != null && (w52Var = a62Var.k) != null && (arrayList = (ArrayList) w52Var.f) != null) {
                i = arrayList.size() + i;
            }
        }
        return i;
    }

    @Override // f12
    public final int j() {
        return 1;
    }

    @Override // f12
    public final boolean k() {
        this.b.K1(false);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        b62 b62Var = this.w;
        super.onLayout(z, i, i2, i3, i4);
        Point point = hl.q;
        boolean z2 = point.y > point.x;
        if (this.U != z2) {
            this.U = z2;
            int size = b62Var.b.size();
            for (int i5 = 0; i5 < size; i5++) {
                a62 a62Var = (a62) b62Var.b.get(i5);
                if (((ArrayList) a62Var.k.f).size() == 1) {
                    a62Var.b(a62Var.k, true);
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

    @Override // f12
    public final void u() {
        no6 no6Var;
        this.K = null;
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, false);
        }
        ArrayList arrayList = this.w.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((a62) obj).h;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                z52 z52Var = (z52) obj2;
                if (z52Var.e && (no6Var = z52Var.b) != null) {
                    no6Var.R = false;
                }
            }
        }
    }

    @Override // f12
    public final void v() {
        n12 n12Var;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.R = false;
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(k43.j);
        this.P = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (n12Var = this.b).d2) != null) {
            chatAttachAlertPhotoLayout.d1.setIcon(R.drawable.msg_view_file);
            n12Var.d2.d1.setText(ob6.M0(2131753950, null));
            n12Var.d2.d1.setRightIcon(R.drawable.msg_arrowright);
        }
        this.w.i(this.Q, true);
    }

    @Override // f12
    public final void x(int i) {
        try {
            this.b.d2.x(i);
        } catch (Exception unused) {
        }
    }
}
