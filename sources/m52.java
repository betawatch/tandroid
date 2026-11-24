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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class m52 extends p02 {
    public static final HashMap V = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public j52 K;
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
    public wjb n;
    public fu r;
    public t26 s;
    public l52 w;
    public UndoView x;
    public TextView y;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    @Override // p02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i, int i2) {
        int i3;
        int L;
        float f;
        fu fuVar = this.r;
        this.T = true;
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        if (!gl.O1()) {
            Point point = gl.q;
            if (point.x > point.y) {
                i3 = (int) (i2 / 3.5f);
                this.S = i3;
                L = i3 - gl.L(52.0f);
                this.S = L;
                if (L < 0) {
                    this.S = 0;
                }
                if (fuVar.getPaddingTop() == this.S || fuVar.getPaddingBottom() != this.e) {
                    fuVar.q1(fuVar.getPaddingLeft(), this.S, fuVar.getPaddingRight(), this.e);
                    invalidate();
                }
                TextView textView = this.y;
                if (!gl.O1()) {
                    Point point2 = gl.q;
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
        L = i3 - gl.L(52.0f);
        this.S = L;
        if (L < 0) {
        }
        if (fuVar.getPaddingTop() == this.S) {
        }
        fuVar.q1(fuVar.getPaddingLeft(), this.S, fuVar.getPaddingRight(), this.e);
        invalidate();
        TextView textView2 = this.y;
        if (!gl.O1()) {
        }
        f = 20.0f;
        textView2.setTextSize(f);
        this.T = false;
    }

    @Override // p02
    public final void E(int i) {
        x02 x02Var = this.b;
        if (i > 1) {
            x02Var.X2.S(0);
        } else {
            x02Var.X2.u(0);
        }
    }

    @Override // p02
    public final void I(p02 p02Var) {
        l52 l52Var = this.w;
        this.R = true;
        if (p02Var instanceof ChatAttachAlertPhotoLayout) {
            this.Q = (ChatAttachAlertPhotoLayout) p02Var;
            l52Var.c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.Q;
            l52Var.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            l52Var.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            l52Var.c();
            l52Var.requestLayout();
            this.s.g1(0, 0);
            this.r.post(new kx1(this, p02Var, (byte) 21));
            postDelayed(new hq1(this, (byte) 18), 250L);
            l52Var.i(this.Q, false);
        } else {
            K();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(1.0f).setDuration(150L).setInterpolator(s33.f);
        this.P = interpolator;
        interpolator.start();
    }

    @Override // p02
    public final void K() {
        this.r.z0(0);
    }

    @Override // p02
    public final boolean N() {
        return true;
    }

    public final void P() {
        ArrayList arrayList = this.w.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((k52) obj).h;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                j52 j52Var = (j52) obj2;
                RectF b = j52Var.b();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(b.width())), Math.max(1, Math.round(b.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-b.left, -b.top);
                j52Var.a(canvas, false);
                canvas.restore();
                Bitmap bitmap = j52Var.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    j52Var.v.recycle();
                }
                j52Var.v = createBitmap;
                j52Var.w = 0.0f;
                j52Var.O.z.invalidate();
            }
        }
    }

    @Override // p02
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
        ku1 ku1Var = this.b.s1;
        boolean z = false;
        if (ku1Var != null && (l = ku1Var.l()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (gl.O1()) {
                i = 16;
            } else {
                Point point = gl.q;
                i = point.x > point.y ? 6 : 12;
            }
            if (currentItemTop < a.getCurrentActionBarHeight()) {
                currentItemTop -= gl.L((1.0f - (currentItemTop / a.getCurrentActionBarHeight())) * i);
            }
            int max = Math.max(0, currentItemTop);
            canvas.save();
            canvas.clipRect(0, max, getWidth(), getHeight());
            l.setBounds(0, max, getWidth(), gl.q.y + max);
            l.draw(canvas);
            z = true;
        }
        super.dispatchDraw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    @Override // p02
    public int getCurrentItemTop() {
        fu fuVar = this.r;
        if (fuVar.getChildCount() <= 0) {
            fuVar.setTopGlowOffset(fuVar.getPaddingTop());
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = fuVar.getChildAt(0);
        y29 y29Var = (y29) fuVar.G(childAt);
        int top = childAt.getTop();
        int L = gl.L(8.0f);
        if (top < gl.L(8.0f) || y29Var == null || y29Var.b() != 0) {
            top = L;
        }
        fuVar.setTopGlowOffset(top);
        return top;
    }

    @Override // p02
    public int getFirstOffset() {
        return gl.L(56.0f) + getListTopPadding();
    }

    @Override // p02
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = gl.q;
        return point.y > point.x ? 0.8f : 0.45f;
    }

    @Override // p02
    public int getSelectedItemsCount() {
        g52 g52Var;
        ArrayList arrayList;
        ArrayList arrayList2 = this.w.b;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            k52 k52Var = (k52) arrayList2.get(i2);
            if (k52Var != null && (g52Var = k52Var.k) != null && (arrayList = (ArrayList) g52Var.f) != null) {
                i = arrayList.size() + i;
            }
        }
        return i;
    }

    @Override // p02
    public final int j() {
        return 1;
    }

    @Override // p02
    public final boolean k() {
        this.b.J1(false);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        l52 l52Var = this.w;
        super.onLayout(z, i, i2, i3, i4);
        Point point = gl.q;
        boolean z2 = point.y > point.x;
        if (this.U != z2) {
            this.U = z2;
            int size = l52Var.b.size();
            for (int i5 = 0; i5 < size; i5++) {
                k52 k52Var = (k52) l52Var.b.get(i5);
                if (((ArrayList) k52Var.k.f).size() == 1) {
                    k52Var.b(k52Var.k, true);
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

    @Override // p02
    public final void u() {
        jm6 jm6Var;
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
            ArrayList arrayList2 = ((k52) obj).h;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                j52 j52Var = (j52) obj2;
                if (j52Var.e && (jm6Var = j52Var.b) != null) {
                    jm6Var.R = false;
                }
            }
        }
    }

    @Override // p02
    public final void v() {
        x02 x02Var;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.R = false;
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(s33.j);
        this.P = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (x02Var = this.b).d2) != null) {
            chatAttachAlertPhotoLayout.d1.setIcon(R.drawable.msg_view_file);
            x02Var.d2.d1.setText(k96.M0(2131753954, null));
            x02Var.d2.d1.setRightIcon(R.drawable.msg_arrowright);
        }
        this.w.i(this.Q, true);
    }

    @Override // p02
    public final void x(int i) {
        try {
            this.b.d2.x(i);
        } catch (Exception unused) {
        }
    }
}
