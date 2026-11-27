// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.l;
import org.telegram.ui.Components.q;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class nt1 extends wma {
    public int g0;
    public int h0;
    public int i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public final ArrayList l0;
    public final ArrayList m0;
    public Paint n0;
    public int o0;
    public final lt1 p0;
    public final lt1 q0;
    public final RectF r0;
    public float s0;
    public float t0;
    public long u0;
    public boolean v0;
    public ColorDrawable w0;
    public final /* synthetic */ zu1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v2, types: [lt1] */
    /* JADX WARN: Type inference failed for: r2v5, types: [lt1] */
    public nt1(zu1 zu1Var, Context context, wk5 wk5Var) {
        super(context, wk5Var);
        this.x0 = zu1Var;
        final byte b = 0;
        this.g0 = 0;
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.l0 = new ArrayList();
        this.m0 = new ArrayList();
        this.p0 = new yi5(this) { // from class: lt1
            public final /* synthetic */ nt1 b;

            {
                this.b = this;
            }

            @Override // yi5
            public final void a(qeb qebVar, RectF rectF) {
                byte b2 = b;
                qebVar.b = true;
            }

            @Override // yi5
            public final void g(Canvas canvas, RectF rectF) {
                switch (b) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        zu1 zu1Var2 = this.b.x0;
                        if (zu1Var2.A0.a1() && zu1Var2.A0.getOverScrollMode() != 2) {
                            zu1Var2.A0.g(canvas, rectF);
                            break;
                        } else {
                            zu1Var2.A0.A1(canvas, rectF);
                            int i = 0;
                            while (true) {
                                int childCount = zu1Var2.A0.getChildCount();
                                wq1 wq1Var = zu1Var2.A0;
                                if (i >= childCount) {
                                    wq1Var.B1(canvas, rectF);
                                    break;
                                } else {
                                    View childAt = wq1Var.getChildAt(i);
                                    if (!zu1Var2.Ya(childAt, rectF)) {
                                        if (childAt instanceof wb2) {
                                            canvas.save();
                                            canvas.translate(childAt.getX(), childAt.getY());
                                            wb2 wb2Var = (wb2) childAt;
                                            if (wb2Var.L0()) {
                                                canvas.save();
                                                canvas.translate(0.0f, wb2Var.W);
                                                wb2Var.M0(canvas, true, false);
                                                canvas.restore();
                                            }
                                            canvas.restore();
                                            zu1Var2.A0.drawChild(canvas, childAt, uptimeMillis);
                                            if (wb2Var.l2()) {
                                                canvas.save();
                                                canvas.translate(wb2Var.getX(), wb2Var.getY());
                                                wb2Var.i1(canvas);
                                                canvas.restore();
                                            }
                                        } else {
                                            boolean z = childAt instanceof dl1;
                                            wq1 wq1Var2 = zu1Var2.A0;
                                            if (z) {
                                                wq1Var2.drawChild(canvas, childAt, uptimeMillis);
                                                canvas.save();
                                                canvas.translate(childAt.getX(), childAt.getY());
                                                ((dl1) childAt).K(canvas);
                                                canvas.restore();
                                            } else {
                                                wq1Var2.drawChild(canvas, childAt, uptimeMillis);
                                            }
                                        }
                                    }
                                    i++;
                                }
                            }
                        }
                        break;
                    default:
                        nt1 nt1Var = this.b;
                        zu1 zu1Var3 = nt1Var.x0;
                        RectF rectF2 = nt1Var.r0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, nt1Var.getWidth(), nt1Var.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f = zu1Var3.ud.e;
                            int i2 = (int) ((1.0f - f) * 255.0f);
                            int i3 = (int) (255.0f * f);
                            if (f > 0.0f) {
                                canvas.drawRect(rectF2, aob.l0(aob.p1(f * 0.85f, zu1Var3.getThemedColor(aob.d6))));
                            }
                            uk0.b(nt1Var.p0, canvas, rectF, zu1Var3.A0, nt1Var, i2);
                            gu guVar = zu1Var3.a4;
                            if (guVar != null) {
                                uk0.b(guVar, canvas, rectF, guVar, nt1Var, i3);
                            }
                            ir1 ir1Var = zu1Var3.F1;
                            if (ir1Var != null && ir1Var.getVisibility() == 0) {
                                int childCount2 = zu1Var3.F1.getChildCount();
                                for (int i4 = 0; i4 < childCount2; i4++) {
                                    View childAt2 = zu1Var3.F1.getChildAt(i4);
                                    if ((childAt2 instanceof hv1) && childAt2.getVisibility() == 0) {
                                        nt1 nt1Var2 = ((hv1) childAt2).a.m1;
                                        uk0.a(nt1Var2.q0, canvas, rectF, nt1Var2, nt1Var);
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.q0 = new yi5(this) { // from class: lt1
            public final /* synthetic */ nt1 b;

            {
                this.b = this;
            }

            @Override // yi5
            public final void a(qeb qebVar, RectF rectF) {
                byte b22 = b2;
                qebVar.b = true;
            }

            @Override // yi5
            public final void g(Canvas canvas, RectF rectF) {
                switch (b2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        zu1 zu1Var2 = this.b.x0;
                        if (zu1Var2.A0.a1() && zu1Var2.A0.getOverScrollMode() != 2) {
                            zu1Var2.A0.g(canvas, rectF);
                            break;
                        } else {
                            zu1Var2.A0.A1(canvas, rectF);
                            int i = 0;
                            while (true) {
                                int childCount = zu1Var2.A0.getChildCount();
                                wq1 wq1Var = zu1Var2.A0;
                                if (i >= childCount) {
                                    wq1Var.B1(canvas, rectF);
                                    break;
                                } else {
                                    View childAt = wq1Var.getChildAt(i);
                                    if (!zu1Var2.Ya(childAt, rectF)) {
                                        if (childAt instanceof wb2) {
                                            canvas.save();
                                            canvas.translate(childAt.getX(), childAt.getY());
                                            wb2 wb2Var = (wb2) childAt;
                                            if (wb2Var.L0()) {
                                                canvas.save();
                                                canvas.translate(0.0f, wb2Var.W);
                                                wb2Var.M0(canvas, true, false);
                                                canvas.restore();
                                            }
                                            canvas.restore();
                                            zu1Var2.A0.drawChild(canvas, childAt, uptimeMillis);
                                            if (wb2Var.l2()) {
                                                canvas.save();
                                                canvas.translate(wb2Var.getX(), wb2Var.getY());
                                                wb2Var.i1(canvas);
                                                canvas.restore();
                                            }
                                        } else {
                                            boolean z = childAt instanceof dl1;
                                            wq1 wq1Var2 = zu1Var2.A0;
                                            if (z) {
                                                wq1Var2.drawChild(canvas, childAt, uptimeMillis);
                                                canvas.save();
                                                canvas.translate(childAt.getX(), childAt.getY());
                                                ((dl1) childAt).K(canvas);
                                                canvas.restore();
                                            } else {
                                                wq1Var2.drawChild(canvas, childAt, uptimeMillis);
                                            }
                                        }
                                    }
                                    i++;
                                }
                            }
                        }
                        break;
                    default:
                        nt1 nt1Var = this.b;
                        zu1 zu1Var3 = nt1Var.x0;
                        RectF rectF2 = nt1Var.r0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, nt1Var.getWidth(), nt1Var.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f = zu1Var3.ud.e;
                            int i2 = (int) ((1.0f - f) * 255.0f);
                            int i3 = (int) (255.0f * f);
                            if (f > 0.0f) {
                                canvas.drawRect(rectF2, aob.l0(aob.p1(f * 0.85f, zu1Var3.getThemedColor(aob.d6))));
                            }
                            uk0.b(nt1Var.p0, canvas, rectF, zu1Var3.A0, nt1Var, i2);
                            gu guVar = zu1Var3.a4;
                            if (guVar != null) {
                                uk0.b(guVar, canvas, rectF, guVar, nt1Var, i3);
                            }
                            ir1 ir1Var = zu1Var3.F1;
                            if (ir1Var != null && ir1Var.getVisibility() == 0) {
                                int childCount2 = zu1Var3.F1.getChildCount();
                                for (int i4 = 0; i4 < childCount2; i4++) {
                                    View childAt2 = zu1Var3.F1.getChildAt(i4);
                                    if ((childAt2 instanceof hv1) && childAt2.getVisibility() == 0) {
                                        nt1 nt1Var2 = ((hv1) childAt2).a.m1;
                                        uk0.a(nt1Var2.q0, canvas, rectF, nt1Var2, nt1Var);
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.r0 = new RectF();
        this.I = new mt1(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f) {
        a aVar;
        zu1 zu1Var = this.x0;
        zu1Var.m1.setTranslationY(f);
        aVar = ((e) zu1Var).actionBar;
        aVar.setTranslationY(0.0f);
        gs1 gs1Var = zu1Var.Mb;
        if (gs1Var != null) {
            gs1Var.setTranslationY(zu1Var.D1 != null ? r2.getCurrentHeight() : 0);
        }
        kg5 kg5Var = zu1Var.L1;
        if (kg5Var != null) {
            kg5Var.setTranslationY(0.0f);
        }
        kg5 kg5Var2 = zu1Var.K1;
        if (kg5Var2 != null) {
            kg5Var2.setTranslationY(0.0f);
        }
        zu1Var.f1.setTranslationY(0.0f);
        zu1Var.R.setTranslationY(0.0f);
        zu1Var.T9 = 0.0f;
        zu1Var.U9 = 0.0f;
        zu1Var.m1.setBackgroundTranslation(0);
        q qVar = zu1Var.q3;
        if (qVar != null) {
            qVar.y0 = 0.0f;
            qVar.w.setTranslationY(qVar.z0 + 0.0f);
        }
        a81 a81Var = zu1Var.N2;
        if (a81Var != null) {
            wk0 wk0Var = (wk0) a81Var.b;
            wk0Var.u = 0.0f;
            wk0Var.d.invalidate();
        }
        zu1Var.setFragmentPanTranslationOffset(0);
        zu1Var.O7();
    }

    @Override // wma
    public final boolean O() {
        return false;
    }

    @Override // wma
    public final boolean P() {
        return false;
    }

    @Override // wma
    public final int Q() {
        f41 f41Var = this.x0.Y1;
        if (f41Var == null || !f41Var.isShowing()) {
            return super.Q();
        }
        this.f = 0;
        return 0;
    }

    @Override // wma
    public final void T(Drawable drawable) {
        zu1 zu1Var = this.x0;
        bvc bvcVar = zu1Var.Y;
        if (drawable instanceof ih7) {
            ((ih7) drawable).o();
        }
        mz4 c = bvcVar.c(drawable);
        float B = hl.B(bvcVar.b(c));
        float B2 = hl.B(bvcVar.a(c));
        zu1Var.sc = B <= 0.721f;
        zu1Var.tc = B2 <= 0.9f;
        zu1Var.N.a = c;
        rz4 rz4Var = zu1Var.J;
        if (rz4Var != null) {
            Iterator it = rz4Var.w.iterator();
            while (it.hasNext()) {
                hl0 hl0Var = ((jl0) it.next()).h0;
                if (hl0Var != null) {
                    hl0Var.h = true;
                }
            }
        }
        rz4 rz4Var2 = zu1Var.K;
        if (rz4Var2 != null) {
            Iterator it2 = rz4Var2.w.iterator();
            while (it2.hasNext()) {
                hl0 hl0Var2 = ((jl0) it2.next()).h0;
                if (hl0Var2 != null) {
                    hl0Var2.h = true;
                }
            }
        }
        jz1 jz1Var = zu1Var.Z;
        if (jz1Var != null) {
            jz1Var.setOverlayColor(zu1Var.U7() ? zu1Var.getThemedColor(aob.va) : 0);
            zu1Var.Z.invalidate();
        }
        z92 z92Var = zu1Var.U;
        if (z92Var != null) {
            z92Var.invalidate();
        }
        zu1Var.m1.invalidate();
        Iterator it3 = zu1Var.F.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        zu1Var.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f, wb2 wb2Var, int i) {
        int save = canvas.save();
        zu1 zu1Var = this.x0;
        float x = wb2Var.getX() + zu1Var.A0.getLeft();
        float y = wb2Var.getY() + zu1Var.A0.getY() + wb2Var.getPaddingTop();
        float alpha = wb2Var.a() ? wb2Var.getAlpha() : 1.0f;
        canvas.clipRect(zu1Var.A0.getLeft(), f, zu1Var.A0.getRight(), ((((zu1Var.A0.getY() + zu1Var.A0.getMeasuredHeight()) - zu1Var.Ya) - zu1Var.w.e()) - zu1Var.od) - hl.L(9.0f));
        canvas.translate(x, y);
        wb2Var.setInvalidatesParent(true);
        if (i == 0) {
            wb2Var.A1(alpha, canvas, true);
        } else if (i == 1) {
            wb2Var.h1(canvas, alpha);
        } else if (i == 2) {
            wb2Var.Q0(alpha, canvas, wb2Var.getCurrentPosition() != null && (wb2Var.getCurrentPosition().l & 1) == 0);
        } else if (i == 3) {
            boolean z = wb2Var.getCurrentPosition() != null && (wb2Var.getCurrentPosition().l & 1) == 0;
            wb2Var.V0(canvas, alpha);
            if (!z) {
                wb2Var.q1(canvas, alpha, null);
            }
        } else if (i == 4 && ((wb2Var.getCurrentPosition() == null || (wb2Var.getCurrentPosition().l & 1) != 0) && zu1Var.c9 != null)) {
            float f2 = (zu1Var.X8 * zu1Var.a9) / 0.2f;
            canvas.save();
            wb2Var.u1(canvas, zu1Var.c9, f2, zu1Var.Y8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x, y);
            wb2Var.v1(this, canvas, zu1Var.d9, zu1Var.c9, f2);
            canvas.restore();
        }
        wb2Var.setInvalidatesParent(false);
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0081, code lost:
    
        if (r11 != r0.d1) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00a4, code lost:
    
        if (r11 != r0.A0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r11 != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r11 == r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z(Canvas canvas, View view, long j) {
        a81 a81Var;
        a aVar;
        r47 r47Var;
        boolean z;
        boolean z2;
        qr1 qr1Var;
        r47 r47Var2;
        q qVar;
        a aVar2;
        a aVar3;
        zu1 zu1Var = this.x0;
        boolean z3 = false;
        if ((zu1Var.Z8 == null && ((ArrayList) zu1Var.ja.c).size() <= 0) || (view != zu1Var.y1 && view != zu1Var.m3 && view != zu1Var.n3 && view != zu1Var.J9 && view != zu1Var.ua && view != zu1Var.t2 && view != null && view != zu1Var.N3 && view != zu1Var.O3)) {
            if ((view != zu1Var.N3 || !PhotoViewer.q0().V0()) && (!zu1Var.pa || view != zu1Var.A0)) {
                if (zu1Var.Ha) {
                    aVar3 = ((e) zu1Var).actionBar;
                }
                if (view != zu1Var.q3) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (a81Var = zu1Var.N2) != null && a81Var.a() && zu1Var.N2.getTag() != null) {
                            aVar = ((e) zu1Var).actionBar;
                            if (view != aVar) {
                            }
                        }
                        r47Var = MediaController.z().v0;
                        if (r47Var == null) {
                        }
                        z = false;
                        z2 = false;
                        if (view == zu1Var.J8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        aVar2 = ((e) zu1Var).actionBar;
                    } else {
                        if (view != zu1Var.A0) {
                            if (view != zu1Var.U) {
                            }
                        }
                        r47Var = MediaController.z().v0;
                        if (r47Var == null && r47Var.T == 0) {
                            z = r47Var.g4();
                            if (z || r47.K4(r47Var.k)) {
                                z2 = true;
                                if (view == zu1Var.J8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-zu1Var.ka) - (zu1Var.ra != 0.0f ? (zu1Var.A0.getMeasuredHeight() - zu1Var.ka) * zu1Var.ra : 0.0f));
                                    if (r47Var != null && r47Var.D == 5) {
                                        if (aob.k3 != null && zu1Var.L8.d) {
                                            int x = ((int) view.getX()) - hl.L(3.0f);
                                            int y = ((int) view.getY()) - hl.L(2.0f);
                                            canvas.save();
                                            canvas.scale(zu1Var.J8.getScaleX(), zu1Var.J8.getScaleY(), view.getX(), view.getY());
                                            aob.k3.setAlpha(jn7.d4);
                                            aob.k3.setBounds(x, y, hl.L(6.0f) + hl.b3(zu1Var.f8(), zu1Var.U7()) + x, hl.L(6.0f) + hl.b3(zu1Var.f8(), zu1Var.U7()) + y);
                                            aob.k3.draw(canvas);
                                            canvas.restore();
                                        }
                                        z3 = super.drawChild(canvas, view, j);
                                    } else if (view.getTag() == null) {
                                        float translationY = view.getTranslationY();
                                        view.setTranslationY(-hl.L(1000.0f));
                                        z3 = super.drawChild(canvas, view, j);
                                        view.setTranslationY(translationY);
                                    }
                                    canvas.restore();
                                    return z3;
                                }
                                if (view == zu1Var.U && (qVar = zu1Var.q3) != null && qVar.getVisibility() == 0) {
                                    super.drawChild(canvas, zu1Var.q3, j);
                                }
                                z3 = super.drawChild(canvas, view, j);
                                if (z2 && view == zu1Var.A0 && r47Var.D != 5 && (qr1Var = zu1Var.J8) != null && qr1Var.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-zu1Var.ka) - (zu1Var.ra != 0.0f ? (zu1Var.A0.getMeasuredHeight() - zu1Var.ka) * zu1Var.ra : 0.0f)) + zu1Var.la);
                                    super.drawChild(canvas, zu1Var.J8, j);
                                    if (zu1Var.K8 != null) {
                                        canvas.save();
                                        canvas.translate(zu1Var.K8.getX(), zu1Var.A0.getY() + zu1Var.K8.getTop());
                                        wb2 wb2Var = zu1Var.K8;
                                        if (z) {
                                            wb2Var.t1(canvas);
                                            invalidate();
                                            zu1Var.K8.invalidate();
                                        } else {
                                            wb2Var.j1(canvas);
                                            wb2 wb2Var2 = zu1Var.K8;
                                            if (!wb2Var2.S9 && ((r47Var2 = wb2Var2.Q5) == null || r47Var2.D != 27)) {
                                                wb2Var2.A1(wb2Var2.getAlpha(), canvas, true);
                                            }
                                        }
                                        canvas.restore();
                                    }
                                    canvas.restore();
                                }
                            }
                        } else {
                            z = false;
                        }
                        z2 = false;
                        if (view == zu1Var.J8) {
                        }
                    }
                }
            }
            return true;
        }
        return z3;
    }

    public final boolean a0(View view) {
        if (view == this.M) {
            return true;
        }
        zu1 zu1Var = this.x0;
        return view == zu1Var.N2 || view == zu1Var.F1 || view == zu1Var.J9 || view == zu1Var.Z || view == zu1Var.Z3 || view == zu1Var.n0 || (view instanceof ula);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        l lVar;
        zu1 zu1Var = this.x0;
        nr1 nr1Var = zu1Var.a0;
        if (nr1Var == null || view != nr1Var.n0) {
            super.addView(view, i, layoutParams);
        } else {
            jz1 jz1Var = zu1Var.Z;
            int indexOfChild = jz1Var != null ? indexOfChild(jz1Var) : -1;
            if (indexOfChild >= 0) {
                i = indexOfChild;
            }
            super.addView(view, i, layoutParams);
        }
        nr1 nr1Var2 = zu1Var.a0;
        if (nr1Var2 != null && view == nr1Var2.n0) {
            ap0 ap0Var = (ap0) view;
            ap0Var.setBackgroundDrawable(zu1Var.L.c(ap0Var.c, zu1Var.E, false));
        }
        nr1 nr1Var3 = zu1Var.a0;
        if (nr1Var3 == null || view != (lVar = nr1Var3.D2)) {
            return;
        }
        lVar.setBlurredBackgroundFactory(zu1Var.L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:292:0x06aa, code lost:
    
        if (r0.getTransitionParams().x0 != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x06ef, code lost:
    
        if ((r6 & 1) != 0) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x06b7, code lost:
    
        if (r6.c != 0) goto L242;
     */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x06fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0801 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x054c  */
    @Override // wma, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        float f;
        float f2;
        Canvas canvas3;
        nt1 nt1Var;
        float f3;
        int i2;
        int i3;
        a aVar;
        a aVar2;
        a aVar3;
        a aVar4;
        a aVar5;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        float f4;
        ArrayList arrayList4;
        float f5;
        dl1 dl1Var;
        m47 m47Var;
        wb2 wb2Var;
        j47 j47Var;
        m47 m47Var2;
        int i4;
        View view;
        int i5;
        ArrayList arrayList5;
        wb2 wb2Var2;
        ArrayList arrayList6;
        rq1 rq1Var;
        boolean z;
        float f6;
        float f7;
        boolean z2;
        fr1 fr1Var;
        float f8;
        float f9;
        nr1 nr1Var;
        float f10;
        float f11;
        Canvas canvas4;
        float f12;
        float f13;
        float f14;
        float f15;
        View view2;
        j47 j47Var2;
        Integer num;
        float f16;
        nt1 nt1Var2;
        x49 x49Var;
        dl1 dl1Var2;
        float f17;
        vnb vnbVar;
        float f18;
        dl1 dl1Var3;
        float f19;
        float f20;
        View view3;
        Canvas canvas5;
        qx1 qx1Var;
        wb2 wb2Var3;
        boolean z3;
        int i6;
        a aVar6;
        float f21;
        a aVar7;
        int i7;
        a aVar8;
        a aVar9;
        boolean z4;
        a aVar10;
        yq1 yq1Var;
        nt1 nt1Var3 = this;
        zu1 zu1Var = nt1Var3.x0;
        rq1 rq1Var2 = zu1Var.w;
        ArrayList arrayList7 = zu1Var.F6;
        zu1Var.a0.X2();
        zu1Var.Rc();
        if (zu1Var.Oa || ((yq1Var = zu1Var.B0) != null && yq1Var.k())) {
            zu1Var.Oa = false;
            zu1Var.cd();
        }
        zu1Var.vd(false, false);
        zu1Var.ed();
        kg5 kg5Var = zu1Var.v2;
        if (kg5Var != null && kg5Var.W) {
            kg5Var.y();
        }
        kg5 kg5Var2 = zu1Var.x2;
        if (kg5Var2 != null && kg5Var2.W) {
            kg5Var2.y();
        }
        float f22 = 0.2f;
        float f23 = 2.0f;
        if (zu1Var.Ha) {
            aVar10 = ((e) zu1Var).actionBar;
            canvas2 = canvas;
            i = canvas2.saveLayerAlpha(0.0f, aVar10.getBottom(), nt1Var3.getMeasuredWidth(), nt1Var3.getMeasuredHeight(), (int) (zu1Var.Ia * 255.0f), 31);
            float f24 = (zu1Var.Ia * 0.2f) + 0.8f;
            canvas2.scale(f24, f24, nt1Var3.getMeasuredWidth() / 2.0f, nt1Var3.getMeasuredHeight() / 2.0f);
        } else {
            canvas2 = canvas;
            i = -1;
        }
        int i8 = i;
        super.dispatchDraw(canvas);
        int size = arrayList7.size();
        int i9 = 0;
        while (true) {
            f = 1.0f;
            f2 = 0.0f;
            if (i9 >= size) {
                break;
            }
            wb2 wb2Var4 = (wb2) arrayList7.get(i9);
            n47 n47Var = wb2Var4.getMessageObject().N1;
            if (n47Var != null) {
                canvas2.save();
                aVar7 = ((e) zu1Var).actionBar;
                if (aVar7.getVisibility() == 0) {
                    aVar8 = ((e) zu1Var).actionBar;
                    int translationY = (int) aVar8.getTranslationY();
                    aVar9 = ((e) zu1Var).actionBar;
                    int measuredHeight = aVar9.getMeasuredHeight() + translationY;
                    zr1 zr1Var = zu1Var.D1;
                    int currentHeight = measuredHeight + (zr1Var != null ? zr1Var.getCurrentHeight() : 0);
                    kr1 kr1Var = zu1Var.E1;
                    int currentHeight2 = currentHeight + (kr1Var != null ? kr1Var.getCurrentHeight() : 0);
                    z4 = ((e) zu1Var).inPreviewMode;
                    i7 = currentHeight2 + (z4 ? hl.m : 0);
                } else {
                    i7 = 0;
                }
                f21 = f23;
                canvas2.clipRect(0.0f, i7 + zu1Var.Q9, nt1Var3.getWidth(), nt1Var3.getHeight());
                ImageReceiver photoImage = wb2Var4.getPhotoImage();
                wb2Var4.getLocationInWindow(hl.R);
                int topViewEnterProgress = (int) ((zu1Var.a0.getTopViewEnterProgress() * hl.L(48.0f)) + ((int) qu6.B(1.0f, n47Var.g, wb2Var4.getTranslationY(), r8[1])));
                boolean z5 = n47Var.h;
                float f25 = n47Var.e;
                float f26 = n47Var.b;
                float f27 = topViewEnterProgress;
                if (z5) {
                    canvas2.translate(f25, hl.R1(f26, f27, n47Var.g));
                } else {
                    canvas2.translate(f25, hl.R1(f26, photoImage.s() + f27, n47Var.g));
                }
                float f28 = n47Var.d;
                canvas2.scale(f28, f28);
                if (!n47Var.h) {
                    canvas2.translate(-photoImage.r(), -photoImage.s());
                }
                wb2Var4.setTimeAlpha(n47Var.f);
                wb2Var4.draw(canvas2);
                canvas2.restore();
            } else {
                f21 = f23;
            }
            i9++;
            f23 = f21;
        }
        float f29 = f23;
        if (zu1Var.c9 == null || zu1Var.Z8 == null) {
            if (zu1Var.T8 != null) {
                zu1Var.U8.reset();
                float measuredWidth = nt1Var3.getMeasuredWidth() / zu1Var.R8.getWidth();
                zu1Var.U8.postScale(measuredWidth, measuredWidth);
                zu1Var.S8.setLocalMatrix(zu1Var.U8);
                zu1Var.T8.setAlpha((int) (zu1Var.b9 * 255.0f));
                if (zu1Var.T8.getAlpha() > 0) {
                    canvas2.drawRect(0.0f, 0.0f, nt1Var3.getMeasuredWidth(), nt1Var3.getMeasuredHeight(), zu1Var.T8);
                }
            } else {
                zu1Var.V8.setAlpha((int) (zu1Var.X8 * 255.0f * (zu1Var.Z8 != null ? zu1Var.a9 : 1.0f)));
                if (zu1Var.V8.getAlpha() > 0) {
                    canvas.drawRect(0.0f, 0.0f, nt1Var3.getMeasuredWidth(), nt1Var3.getMeasuredHeight(), zu1Var.V8);
                }
            }
        }
        if (zu1Var.c9 != null && zu1Var.e9) {
            nt1Var3.invalidate();
        }
        View view4 = zu1Var.Z8;
        if (view4 != null) {
            if (view4 == zu1Var.y1) {
                float f30 = zu1Var.a9;
                if (f30 < 1.0f) {
                    zu1Var.V8.setAlpha((int) ((1.0f - f30) * zu1Var.X8 * 255.0f));
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, nt1Var3.getMeasuredWidth(), nt1Var3.getMeasuredHeight(), zu1Var.V8);
                } else {
                    canvas3 = canvas;
                }
                nt1Var = nt1Var3;
                f5 = 1.0f;
                f3 = 0.0f;
                i2 = 0;
                i3 = 1;
            } else if (view4 instanceof ImageView) {
                int save = canvas.save();
                if (zu1Var.a9 < 1.0f) {
                    canvas3 = canvas;
                    i6 = 1;
                    canvas3.saveLayerAlpha(zu1Var.Z8.getLeft(), zu1Var.Z8.getTop(), zu1Var.Z8.getRight(), zu1Var.Z8.getBottom(), (int) (zu1Var.a9 * 255.0f), 31);
                } else {
                    canvas3 = canvas;
                    i6 = 1;
                }
                canvas3.translate(zu1Var.Z8.getLeft(), zu1Var.Z8.getTop());
                View view5 = zu1Var.Z8;
                aVar6 = ((e) zu1Var).actionBar;
                if (view5 == aVar6.getBackButton()) {
                    canvas3.translate(zu1Var.Z8.getX() - zu1Var.Z8.getLeft(), 0.0f);
                    float measuredWidth2 = zu1Var.Z8.getMeasuredWidth() / f29;
                    float measuredHeight2 = zu1Var.Z8.getMeasuredHeight() / f29;
                    canvas3.drawCircle(measuredWidth2, measuredHeight2, Math.max(measuredWidth2, measuredHeight2) * 0.7f, zu1Var.W8);
                }
                zu1Var.Z8.draw(canvas3);
                canvas3.restoreToCount(save);
                float f31 = zu1Var.a9;
                if (f31 < 1.0f) {
                    zu1Var.V8.setAlpha((int) ((1.0f - f31) * zu1Var.X8 * 255.0f));
                    canvas3.drawRect(0.0f, 0.0f, nt1Var3.getMeasuredWidth(), nt1Var3.getMeasuredHeight(), zu1Var.V8);
                }
                nt1Var = nt1Var3;
                i3 = i6;
                f5 = 1.0f;
                f3 = 0.0f;
                i2 = 0;
            } else {
                canvas3 = canvas;
                float y = ((zu1Var.A0.getY() + zu1Var.P9) - zu1Var.R9) - hl.L(4.0f);
                View view6 = zu1Var.Z8;
                m47 currentMessagesGroup = view6 instanceof wb2 ? ((wb2) view6).getCurrentMessagesGroup() : null;
                int childCount = zu1Var.A0.getChildCount();
                int i10 = 0;
                boolean z6 = false;
                while (true) {
                    arrayList = nt1Var3.l0;
                    float f32 = f22;
                    arrayList2 = nt1Var3.k0;
                    arrayList3 = nt1Var3.j0;
                    f4 = f2;
                    arrayList4 = nt1Var3.m0;
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = zu1Var.A0.getChildAt(i10);
                    if (childAt instanceof wb2) {
                        wb2Var = (wb2) childAt;
                        m47Var = wb2Var.getCurrentMessagesGroup();
                        j47Var = wb2Var.getCurrentPosition();
                        dl1Var = null;
                    } else {
                        dl1Var = childAt instanceof dl1 ? (dl1) childAt : null;
                        m47Var = null;
                        wb2Var = null;
                        j47Var = null;
                    }
                    float f33 = y;
                    if ((childAt == zu1Var.Z8 || (currentMessagesGroup != null && currentMessagesGroup == m47Var)) && childAt.getAlpha() != f4) {
                        if (z6 || wb2Var == null || currentMessagesGroup == null) {
                            m47Var2 = currentMessagesGroup;
                            i4 = childCount;
                            view = childAt;
                            i5 = i10;
                            arrayList5 = arrayList;
                            wb2Var2 = wb2Var;
                            arrayList6 = arrayList4;
                            rq1Var = rq1Var2;
                            z = true;
                            f6 = 1.0f;
                            f7 = 9.0f;
                        } else {
                            ArrayList arrayList8 = currentMessagesGroup.d;
                            f7 = 9.0f;
                            l47 l47Var = currentMessagesGroup.m;
                            m47Var2 = currentMessagesGroup;
                            wb2 wb2Var5 = l47Var.m;
                            i4 = childCount;
                            if (wb2Var5 != null) {
                                float U1 = wb2Var5.U1(true);
                                float f34 = l47Var.a + U1 + l47Var.e;
                                float f35 = l47Var.b + l47Var.f;
                                float f36 = l47Var.c + U1 + l47Var.g;
                                float f37 = f35;
                                float f38 = l47Var.d + l47Var.h;
                                if (!l47Var.j) {
                                    f37 = l47Var.m.getTranslationY() + f37;
                                    f38 = l47Var.m.getTranslationY() + f38;
                                }
                                float L = f37 < (zu1Var.P9 - ((float) zu1Var.R9)) - ((float) hl.L(20.0f)) ? (zu1Var.P9 - zu1Var.R9) - hl.L(20.0f) : f37;
                                view = childAt;
                                float L2 = f38 > ((float) (hl.L(20.0f) + zu1Var.A0.getMeasuredHeight())) ? hl.L(20.0f) + zu1Var.A0.getMeasuredHeight() : f38;
                                i5 = i10;
                                int size2 = arrayList8.size();
                                arrayList5 = arrayList;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= size2) {
                                        wb2Var3 = wb2Var;
                                        z3 = true;
                                        break;
                                    }
                                    int i12 = size2;
                                    r47 r47Var = (r47) arrayList8.get(i11);
                                    int i13 = i11;
                                    if (zu1Var.o6[r47.B0(r47Var.k) == zu1Var.l6 ? (char) 0 : (char) 1].indexOfKey(r47Var.e1()) < 0) {
                                        wb2Var3 = wb2Var;
                                        z3 = false;
                                        break;
                                    } else {
                                        i11 = i13 + 1;
                                        size2 = i12;
                                    }
                                }
                                canvas3.save();
                                float measuredHeight3 = ((getMeasuredHeight() - rq1Var2.e()) - zu1Var.od) - hl.L(9.0f);
                                fr1 fr1Var2 = zu1Var.X1;
                                float d = measuredHeight3 - (fr1Var2 != null ? fr1Var2.d() : f4);
                                fr1 fr1Var3 = zu1Var.X1;
                                canvas3.clipRect(f4, f33 + (fr1Var3 != null ? fr1Var3.e() : f4), getMeasuredWidth(), d);
                                canvas3.translate(f4, zu1Var.A0.getY());
                                boolean z7 = l47Var.k;
                                boolean z8 = l47Var.l;
                                arrayList6 = arrayList4;
                                rq1Var = rq1Var2;
                                wb2Var2 = wb2Var3;
                                z = true;
                                f6 = 1.0f;
                                l47Var.m.K0(canvas, (int) f34, (int) L, (int) f36, (int) L2, z7, z8, z3, 0);
                                canvas.restore();
                                z2 = true;
                                if (wb2Var2 != null && wb2Var2.getPhotoImage().F()) {
                                    invalidate();
                                }
                                float left = zu1Var.A0.getLeft();
                                float right = zu1Var.A0.getRight();
                                float measuredHeight4 = (((getMeasuredHeight() - rq1Var.e()) - zu1Var.od) - zu1Var.u7(h1c.c)) - hl.L(f7);
                                fr1Var = zu1Var.X1;
                                if (fr1Var == null) {
                                    float max = Math.max(0.0f, fr1Var.e());
                                    f9 = Math.max(0.0f, zu1Var.X1.d());
                                    f8 = max;
                                } else {
                                    f8 = 0.0f;
                                    f9 = 0.0f;
                                }
                                nr1Var = zu1Var.a0;
                                if (nr1Var != null && (qx1Var = nr1Var.n0) != null) {
                                    f9 = Math.max(f9, !qx1Var.f ? 0.0f : Math.max(0.0f, qx1Var.getMeasuredHeight() - (qx1Var.c.getTranslationY() + qx1Var.e)));
                                }
                                float f39 = f33 + f8;
                                float f40 = measuredHeight4 - f9;
                                if (wb2Var2 != null || !wb2Var2.getTransitionParams().x0) {
                                    left = Math.max(left, view.getX() + zu1Var.A0.getLeft());
                                    f39 = Math.max(f39, view.getY() + zu1Var.A0.getY());
                                    right = Math.min(right, view.getX() + zu1Var.A0.getLeft() + view.getMeasuredWidth());
                                    f40 = Math.min(f40, view.getY() + zu1Var.A0.getY() + view.getMeasuredHeight());
                                }
                                f10 = f40;
                                f11 = f39;
                                float f41 = right;
                                float max2 = Math.max(left, zu1Var.o7());
                                if (f11 >= f10) {
                                    if (view.getAlpha() != f6) {
                                        canvas4 = canvas;
                                        canvas4.saveLayerAlpha(max2, f11, f41, f10, (int) (view.getAlpha() * 255.0f), 31);
                                        f12 = f11;
                                        f13 = f10;
                                        f14 = max2;
                                        f15 = f41;
                                    } else {
                                        canvas4 = canvas;
                                        f12 = f11;
                                        f13 = f10;
                                        f14 = max2;
                                        f15 = f41;
                                        canvas4.save();
                                    }
                                    if (wb2Var2 != null) {
                                        wb2Var2.setInvalidatesParent(z);
                                        wb2Var2.setScrimReaction(zu1Var.c9);
                                    } else if (dl1Var != null) {
                                        dl1Var.setInvalidatesParent(z);
                                        dl1Var.setScrimReaction(zu1Var.c9);
                                    }
                                    canvas4.clipRect(f14, f12, f15, f13);
                                    canvas4.translate(view.getX() + zu1Var.A0.getLeft(), view.getY() + zu1Var.A0.getY());
                                    if (wb2Var2 != null && m47Var2 == null && wb2Var2.L0()) {
                                        canvas4.save();
                                        canvas4.translate(0.0f, wb2Var2.getPaddingTop());
                                        wb2Var2.M0(canvas4, z, false);
                                        canvas4.restore();
                                    }
                                    if (wb2Var2 != null && m47Var2 == null) {
                                        wb2Var2.b1(canvas4, zu1Var.b9);
                                    }
                                    view2 = view;
                                    view2.draw(canvas4);
                                    if (wb2Var2 != null && wb2Var2.l2()) {
                                        canvas4.save();
                                        canvas4.translate(0.0f, wb2Var2.getPaddingTop());
                                        wb2Var2.i1(canvas4);
                                        canvas4.restore();
                                    }
                                    if (dl1Var != null) {
                                        dl1Var.K(canvas4);
                                    }
                                    canvas4.restore();
                                    if (wb2Var2 != null) {
                                        wb2Var2.setInvalidatesParent(false);
                                        wb2Var2.setScrimReaction(null);
                                    } else if (dl1Var != null) {
                                        dl1Var.setInvalidatesParent(false);
                                        dl1Var.setScrimReaction(null);
                                    }
                                } else {
                                    canvas4 = canvas;
                                    f12 = f11;
                                    f13 = f10;
                                    f14 = max2;
                                    f15 = f41;
                                    view2 = view;
                                }
                                j47Var2 = j47Var;
                                if (j47Var2 != null) {
                                    if (wb2Var2 != null) {
                                    }
                                    num = zu1Var.c9;
                                    if (num == null && wb2Var2 != null && m47Var2 == null) {
                                        if (zu1Var.T8 != null) {
                                            zu1Var.U8.reset();
                                            float measuredWidth3 = getMeasuredWidth() / zu1Var.R8.getWidth();
                                            zu1Var.U8.postScale(measuredWidth3, measuredWidth3);
                                            zu1Var.S8.setLocalMatrix(zu1Var.U8);
                                            zu1Var.T8.setAlpha((int) (zu1Var.b9 * 255.0f));
                                            f19 = f15;
                                            f20 = f14;
                                            view3 = view2;
                                            f16 = 0.0f;
                                            canvas4.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), zu1Var.T8);
                                        } else {
                                            f19 = f15;
                                            f20 = f14;
                                            view3 = view2;
                                            f16 = 0.0f;
                                            zu1Var.V8.setAlpha((int) (zu1Var.X8 * 255.0f * zu1Var.a9));
                                            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), zu1Var.V8);
                                        }
                                        if (f11 < f10) {
                                            float f42 = (zu1Var.X8 * zu1Var.a9) / f32;
                                            float alpha = view3.getAlpha() * zu1Var.a9;
                                            if (alpha < f6) {
                                                int i14 = (int) (alpha * 255.0f);
                                                float f43 = f12;
                                                canvas5 = canvas;
                                                canvas5.saveLayerAlpha(f20, f43, f19, f13, i14, 31);
                                                f12 = f43;
                                            } else {
                                                canvas5 = canvas;
                                                canvas5.save();
                                            }
                                            canvas5.clipRect(f20, f12, f19, f13);
                                            canvas5.translate(view3.getX() + zu1Var.A0.getLeft(), view3.getY() + zu1Var.A0.getY() + view3.getPaddingTop());
                                            wb2Var2.u1(canvas5, zu1Var.c9, f42, zu1Var.Y8);
                                            canvas5.restore();
                                            canvas5.save();
                                            canvas5.translate(view3.getX() + zu1Var.A0.getLeft(), view3.getY() + zu1Var.A0.getY() + view3.getPaddingTop());
                                            wb2Var2.v1(this, canvas5, zu1Var.d9, zu1Var.c9, f42);
                                            nt1Var2 = this;
                                            canvas.restore();
                                        } else {
                                            nt1Var2 = this;
                                        }
                                    } else {
                                        f16 = 0.0f;
                                        nt1Var2 = this;
                                        float f44 = f15;
                                        float f45 = f14;
                                        View view7 = view2;
                                        if (num != null && dl1Var != null) {
                                            vnb vnbVar2 = dl1Var.h1;
                                            x49 x49Var2 = dl1Var.F0;
                                            if (zu1Var.T8 == null) {
                                                zu1Var.U8.reset();
                                                float measuredWidth4 = nt1Var2.getMeasuredWidth() / zu1Var.R8.getWidth();
                                                zu1Var.U8.postScale(measuredWidth4, measuredWidth4);
                                                zu1Var.S8.setLocalMatrix(zu1Var.U8);
                                                zu1Var.T8.setAlpha((int) (zu1Var.b9 * 255.0f));
                                                dl1Var2 = dl1Var;
                                                x49Var = x49Var2;
                                                canvas.drawRect(0.0f, 0.0f, nt1Var2.getMeasuredWidth(), nt1Var2.getMeasuredHeight(), zu1Var.T8);
                                            } else {
                                                x49Var = x49Var2;
                                                dl1Var2 = dl1Var;
                                                zu1Var.V8.setAlpha((int) (zu1Var.X8 * 255.0f * zu1Var.a9));
                                                canvas.drawRect(0.0f, 0.0f, nt1Var2.getMeasuredWidth(), nt1Var2.getMeasuredHeight(), zu1Var.V8);
                                            }
                                            if (f11 < f10) {
                                                float f46 = (zu1Var.X8 * zu1Var.a9) / f32;
                                                float alpha2 = view7.getAlpha() * zu1Var.a9;
                                                if (alpha2 < f6) {
                                                    float f47 = f12;
                                                    float f48 = f13;
                                                    vnbVar = vnbVar2;
                                                    canvas.saveLayerAlpha(f45, f47, f44, f48, (int) (alpha2 * 255.0f), 31);
                                                    f18 = f48;
                                                    f17 = f47;
                                                    canvas3 = canvas;
                                                } else {
                                                    canvas3 = canvas;
                                                    f17 = f12;
                                                    vnbVar = vnbVar2;
                                                    f18 = f13;
                                                    canvas3.save();
                                                }
                                                canvas3.clipRect(f45, f17, f44, f18);
                                                canvas3.translate(view7.getX() + zu1Var.A0.getLeft(), view7.getY() + zu1Var.A0.getY() + view7.getPaddingTop());
                                                Integer num2 = zu1Var.c9;
                                                boolean z9 = zu1Var.Y8;
                                                x49Var.getClass();
                                                if (vnbVar != null) {
                                                    dl1Var3 = dl1Var2;
                                                    vnbVar.b(dl1Var3.v0, dl1Var3.u0 + hl.L(4.0f), dl1Var2.getMeasuredWidth(), dl1Var3.w0);
                                                } else {
                                                    dl1Var3 = dl1Var2;
                                                    aob.q(dl1Var3.v0, dl1Var3.u0 + hl.L(4.0f), dl1Var3.getMeasuredWidth(), dl1Var3.w0);
                                                }
                                                x49 x49Var3 = x49Var;
                                                x49Var3.A = f46;
                                                x49Var3.B = z9;
                                                x49Var3.d(canvas3, dl1Var3.x2.c, num2);
                                                canvas3.restore();
                                                canvas3.save();
                                                canvas3.translate(view7.getX() + zu1Var.A0.getLeft(), view7.getY() + zu1Var.A0.getY() + view7.getPaddingTop());
                                                int i15 = zu1Var.d9;
                                                Integer num3 = zu1Var.c9;
                                                x49Var3.getClass();
                                                if (vnbVar != null) {
                                                    vnbVar.b(dl1Var3.v0, dl1Var3.u0 + hl.L(4.0f), dl1Var3.getMeasuredWidth(), dl1Var3.w0);
                                                } else {
                                                    aob.q(dl1Var3.v0, dl1Var3.u0 + hl.L(4.0f), dl1Var3.getMeasuredWidth(), dl1Var3.w0);
                                                }
                                                x49Var3.A = f46;
                                                x49Var3.f(nt1Var2, canvas3, i15, num3);
                                                canvas3.restore();
                                                z6 = z2;
                                            }
                                        }
                                    }
                                    canvas3 = canvas;
                                    z6 = z2;
                                } else if (!j47Var2.h) {
                                    if (j47Var2.a == 0) {
                                    }
                                    if (j47Var2 != null || (j47Var2.l & wb2Var2.G()) != 0) {
                                        arrayList5.add(wb2Var2);
                                    }
                                    if (j47Var2 != null) {
                                        int i16 = j47Var2.l;
                                        if ((i16 & 8) != 0) {
                                        }
                                        num = zu1Var.c9;
                                        if (num == null) {
                                        }
                                        f16 = 0.0f;
                                        nt1Var2 = this;
                                        float f442 = f15;
                                        float f452 = f14;
                                        View view72 = view2;
                                        if (num != null) {
                                            vnb vnbVar22 = dl1Var.h1;
                                            x49 x49Var22 = dl1Var.F0;
                                            if (zu1Var.T8 == null) {
                                            }
                                            if (f11 < f10) {
                                            }
                                        }
                                        canvas3 = canvas;
                                        z6 = z2;
                                    }
                                    arrayList6.add(wb2Var2);
                                    num = zu1Var.c9;
                                    if (num == null) {
                                    }
                                    f16 = 0.0f;
                                    nt1Var2 = this;
                                    float f4422 = f15;
                                    float f4522 = f14;
                                    View view722 = view2;
                                    if (num != null) {
                                    }
                                    canvas3 = canvas;
                                    z6 = z2;
                                }
                                if (j47Var2 != null || j47Var2.h) {
                                    arrayList3.add(wb2Var2);
                                }
                                if (j47Var2 != null || (j47Var2.a == 0 && j47Var2.c == 0 && wb2Var2.k2())) {
                                    arrayList2.add(wb2Var2);
                                }
                                if (j47Var2 != null) {
                                }
                                arrayList5.add(wb2Var2);
                                if (j47Var2 != null) {
                                }
                                arrayList6.add(wb2Var2);
                                num = zu1Var.c9;
                                if (num == null) {
                                }
                                f16 = 0.0f;
                                nt1Var2 = this;
                                float f44222 = f15;
                                float f45222 = f14;
                                View view7222 = view2;
                                if (num != null) {
                                }
                                canvas3 = canvas;
                                z6 = z2;
                            } else {
                                view = childAt;
                                i5 = i10;
                                arrayList5 = arrayList;
                                wb2Var2 = wb2Var;
                                arrayList6 = arrayList4;
                                rq1Var = rq1Var2;
                                z = true;
                                f6 = 1.0f;
                            }
                        }
                        z2 = z6;
                        if (wb2Var2 != null) {
                            invalidate();
                        }
                        float left2 = zu1Var.A0.getLeft();
                        float right2 = zu1Var.A0.getRight();
                        float measuredHeight42 = (((getMeasuredHeight() - rq1Var.e()) - zu1Var.od) - zu1Var.u7(h1c.c)) - hl.L(f7);
                        fr1Var = zu1Var.X1;
                        if (fr1Var == null) {
                        }
                        nr1Var = zu1Var.a0;
                        if (nr1Var != null) {
                            f9 = Math.max(f9, !qx1Var.f ? 0.0f : Math.max(0.0f, qx1Var.getMeasuredHeight() - (qx1Var.c.getTranslationY() + qx1Var.e)));
                        }
                        float f392 = f33 + f8;
                        float f402 = measuredHeight42 - f9;
                        if (wb2Var2 != null) {
                        }
                        left2 = Math.max(left2, view.getX() + zu1Var.A0.getLeft());
                        f392 = Math.max(f392, view.getY() + zu1Var.A0.getY());
                        right2 = Math.min(right2, view.getX() + zu1Var.A0.getLeft() + view.getMeasuredWidth());
                        f402 = Math.min(f402, view.getY() + zu1Var.A0.getY() + view.getMeasuredHeight());
                        f10 = f402;
                        f11 = f392;
                        float f412 = right2;
                        float max22 = Math.max(left2, zu1Var.o7());
                        if (f11 >= f10) {
                        }
                        j47Var2 = j47Var;
                        if (j47Var2 != null) {
                        }
                        if (j47Var2 != null) {
                        }
                        arrayList3.add(wb2Var2);
                        if (j47Var2 != null) {
                        }
                        arrayList2.add(wb2Var2);
                        if (j47Var2 != null) {
                        }
                        arrayList5.add(wb2Var2);
                        if (j47Var2 != null) {
                        }
                        arrayList6.add(wb2Var2);
                        num = zu1Var.c9;
                        if (num == null) {
                        }
                        f16 = 0.0f;
                        nt1Var2 = this;
                        float f442222 = f15;
                        float f452222 = f14;
                        View view72222 = view2;
                        if (num != null) {
                        }
                        canvas3 = canvas;
                        z6 = z2;
                    } else {
                        f6 = 1.0f;
                        nt1Var2 = this;
                        m47Var2 = currentMessagesGroup;
                        i4 = childCount;
                        i5 = i10;
                        rq1Var = rq1Var2;
                        f16 = f4;
                    }
                    i10 = i5 + 1;
                    nt1Var3 = nt1Var2;
                    f22 = f32;
                    rq1Var2 = rq1Var;
                    f = f6;
                    f2 = f16;
                    y = f33;
                    currentMessagesGroup = m47Var2;
                    childCount = i4;
                }
                float f49 = y;
                nt1Var = nt1Var3;
                m47 m47Var3 = currentMessagesGroup;
                f5 = f;
                f3 = f4;
                int size3 = arrayList3.size();
                if (size3 > 0) {
                    for (int i17 = 0; i17 < size3; i17++) {
                        nt1Var.Y(canvas3, f49, (wb2) arrayList3.get(i17), 0);
                    }
                    i2 = 0;
                    arrayList3.clear();
                } else {
                    i2 = 0;
                }
                int size4 = arrayList2.size();
                if (size4 > 0) {
                    for (int i18 = i2; i18 < size4; i18++) {
                        nt1Var.Y(canvas3, f49, (wb2) arrayList2.get(i18), 1);
                    }
                    i3 = 1;
                    arrayList2.clear();
                } else {
                    i3 = 1;
                }
                int size5 = arrayList.size();
                if (size5 > 0) {
                    for (int i19 = i2; i19 < size5; i19++) {
                        wb2 wb2Var6 = (wb2) arrayList.get(i19);
                        if (wb2Var6.getCurrentPosition() != null || wb2Var6.getTransitionParams().x0) {
                            nt1Var.Y(canvas3, f49, wb2Var6, 2);
                        }
                    }
                    arrayList.clear();
                }
                int size6 = arrayList4.size();
                if (size6 > 0) {
                    for (int i20 = i2; i20 < size6; i20++) {
                        wb2 wb2Var7 = (wb2) arrayList4.get(i20);
                        if (wb2Var7.getCurrentPosition() != null || wb2Var7.getTransitionParams().x0) {
                            nt1Var.Y(canvas3, f49, wb2Var7, 3);
                        }
                    }
                }
                if (zu1Var.c9 != null && m47Var3 != null) {
                    if (zu1Var.T8 != null) {
                        zu1Var.U8.reset();
                        float measuredWidth5 = nt1Var.getMeasuredWidth() / zu1Var.R8.getWidth();
                        zu1Var.U8.postScale(measuredWidth5, measuredWidth5);
                        zu1Var.S8.setLocalMatrix(zu1Var.U8);
                        zu1Var.T8.setAlpha((int) (zu1Var.b9 * 255.0f));
                        canvas.drawRect(0.0f, 0.0f, nt1Var.getMeasuredWidth(), nt1Var.getMeasuredHeight(), zu1Var.T8);
                        canvas3 = canvas;
                    } else {
                        zu1Var.V8.setAlpha((int) (zu1Var.X8 * 255.0f * zu1Var.a9));
                        canvas.drawRect(0.0f, 0.0f, nt1Var.getMeasuredWidth(), nt1Var.getMeasuredHeight(), zu1Var.V8);
                        canvas3 = canvas;
                    }
                }
                int size7 = arrayList4.size();
                if (size7 > 0) {
                    for (int i21 = i2; i21 < size7; i21++) {
                        wb2 wb2Var8 = (wb2) arrayList4.get(i21);
                        if (wb2Var8.getCurrentPosition() != null || wb2Var8.getTransitionParams().x0) {
                            nt1Var.Y(canvas3, f49, wb2Var8, 4);
                        }
                    }
                    arrayList4.clear();
                }
            }
            if (zu1Var.c9 == null) {
                float f50 = zu1Var.a9;
                if (f50 < f5) {
                    if (zu1Var.T8 != null) {
                        zu1Var.U8.reset();
                        float measuredWidth6 = nt1Var.getMeasuredWidth() / zu1Var.R8.getWidth();
                        zu1Var.U8.postScale(measuredWidth6, measuredWidth6);
                        zu1Var.S8.setLocalMatrix(zu1Var.U8);
                        zu1Var.T8.setAlpha((int) (zu1Var.b9 * 255.0f));
                        canvas.drawRect(0.0f, 0.0f, nt1Var.getMeasuredWidth(), nt1Var.getMeasuredHeight(), zu1Var.T8);
                        canvas3 = canvas;
                    } else {
                        zu1Var.V8.setAlpha((int) ((f5 - f50) * zu1Var.X8 * 255.0f));
                        canvas.drawRect(0.0f, 0.0f, nt1Var.getMeasuredWidth(), nt1Var.getMeasuredHeight(), zu1Var.V8);
                        canvas3 = canvas;
                    }
                }
            }
        } else {
            canvas3 = canvas;
            nt1Var = nt1Var3;
            f3 = 0.0f;
            i2 = 0;
            i3 = 1;
        }
        if (zu1Var.Z8 != null || ((ArrayList) zu1Var.ja.c).size() > 0) {
            fr1 fr1Var4 = zu1Var.X1;
            if (fr1Var4 == null || fr1Var4.getVisibility() != 0) {
                super.drawChild(canvas3, zu1Var.y1, SystemClock.uptimeMillis());
            }
            er1 er1Var = zu1Var.m3;
            if (er1Var != null && er1Var.getTag() != null) {
                super.drawChild(canvas3, zu1Var.m3, SystemClock.uptimeMillis());
            }
            dr1 dr1Var = zu1Var.n3;
            if (dr1Var != null && dr1Var.getTag() != null) {
                super.drawChild(canvas3, zu1Var.n3, SystemClock.uptimeMillis());
            }
            tj4 tj4Var = zu1Var.J9;
            if (tj4Var != null) {
                super.drawChild(canvas3, tj4Var, SystemClock.uptimeMillis());
            }
            j19 j19Var = zu1Var.ua;
            if (j19Var != null) {
                super.drawChild(canvas3, j19Var, SystemClock.uptimeMillis());
            }
            kg5 kg5Var3 = zu1Var.t2;
            if (kg5Var3 != null) {
                super.drawChild(canvas3, kg5Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = zu1Var.N3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, zu1Var.N3, SystemClock.uptimeMillis());
            }
            ls1 ls1Var = zu1Var.O3;
            if (ls1Var != null && ls1Var.getVisibility() == 0) {
                super.drawChild(canvas3, zu1Var.O3, SystemClock.uptimeMillis());
            }
            kg5 kg5Var4 = zu1Var.M1;
            if (kg5Var4 != null && kg5Var4.getVisibility() == 0) {
                super.drawChild(canvas3, zu1Var.M1, SystemClock.uptimeMillis());
            }
            ys1 ys1Var = zu1Var.Q1;
            if (ys1Var != null && ys1Var.getVisibility() == 0) {
                super.drawChild(canvas3, zu1Var.Q1, SystemClock.uptimeMillis());
            }
            kg5 kg5Var5 = zu1Var.O1;
            if (kg5Var5 != null && kg5Var5.getVisibility() == 0) {
                super.drawChild(canvas3, zu1Var.O1, SystemClock.uptimeMillis());
            }
            nr1 nr1Var2 = zu1Var.a0;
            if (nr1Var2 != null && nr1Var2.M != null) {
                canvas3.save();
                canvas3.translate(zu1Var.a0.M.getX() + zu1Var.a0.getX(), zu1Var.a0.M.getY() + zu1Var.a0.getY());
                zu1Var.a0.M.draw(canvas3);
                canvas3.restore();
            }
        }
        if (zu1Var.Ma > 0 && nt1Var.f < hl.L(20.0f)) {
            int themedColor = zu1Var.getThemedColor(aob.d6);
            Paint paint = nt1Var.n0;
            if (paint == null) {
                paint = new Paint();
                nt1Var.n0 = paint;
            }
            if (nt1Var.o0 != themedColor) {
                nt1Var.o0 = themedColor;
                paint.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, nt1Var.getMeasuredHeight() - zu1Var.Ma, nt1Var.getMeasuredWidth(), nt1Var.getMeasuredHeight(), nt1Var.n0);
            canvas3 = canvas6;
        }
        ad2 ad2Var = zu1Var.ma;
        if (ad2Var != null) {
            if (((ad2Var.T <= f3 || ad2Var.S) ? i2 : i3) != 0) {
                int inputBubbleTop = (int) zu1Var.U.getInputBubbleTop();
                int inputBubbleBottom = (int) zu1Var.U.getInputBubbleBottom();
                zu1 zu1Var2 = zu1Var.qa;
                int i22 = inputBubbleTop - ((int) ((zu1Var2 == null ? f3 : zu1Var2.la) * zu1Var.ra));
                ad2 ad2Var2 = zu1Var.ma;
                nt1Var.getMeasuredWidth();
                ad2Var2.b(canvas3, i22, inputBubbleBottom);
            }
        }
        if (zu1Var.qa != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, nt1Var.getMeasuredWidth(), nt1Var.getMeasuredHeight(), (int) (zu1Var.ra * 255.0f), 31);
            canvas3 = canvas;
            zu1Var.qa.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        zu1Var.Ua.e(canvas3);
        if (i8 >= 0) {
            canvas3.restore();
        }
        if (zu1Var.Ha) {
            canvas3.save();
            aVar = ((e) zu1Var).actionBar;
            float x = aVar.getX();
            aVar2 = ((e) zu1Var).actionBar;
            canvas3.translate(x, aVar2.getY());
            aVar3 = ((e) zu1Var).actionBar;
            float width = aVar3.getWidth();
            aVar4 = ((e) zu1Var).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, aVar4.getHeight(), (int) (zu1Var.Ia * 255.0f), 31);
            aVar5 = ((e) zu1Var).actionBar;
            aVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        zu1 zu1Var = this.x0;
        if (zu1Var.c4 != null && motionEvent.getActionMasked() == 8) {
            zu1Var.c4.f();
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ks1 ks1Var;
        zu1 zu1Var = this.x0;
        sz1 sz1Var = zu1Var.c4;
        if (sz1Var != null) {
            sz1Var.f();
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (ks1Var = zu1Var.cb) == null || !ks1Var.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        ks1Var.a(true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r4 == r6.getBackButton()) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0242  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y;
        boolean z;
        wr1 wr1Var;
        wk5 wk5Var;
        wk5 wk5Var2;
        boolean z2;
        boolean z3;
        a aVar;
        zu1 zu1Var = this.x0;
        sz1 sz1Var = zu1Var.c4;
        if (sz1Var != null) {
            sz1Var.f();
        }
        if (hl.E || zu1Var.isInBubbleMode()) {
            o24 emojiView = zu1Var.a0.getEmojiView();
            nr1 nr1Var = zu1Var.a0;
            y = emojiView != null ? nr1Var.getEmojiView().getY() : nr1Var.getY();
        } else {
            y = zu1Var.a0.getY();
        }
        View view = zu1Var.Z8;
        if (view != null) {
            aVar = ((e) zu1Var).actionBar;
        }
        nr1 nr1Var2 = zu1Var.a0;
        if (nr1Var2 == null || !nr1Var2.o4 || motionEvent.getY() >= y) {
            zu1Var.G9 = motionEvent.getY();
            lmb m = zu1Var.u9.m(getContext());
            motionEvent.offsetLocation(-m.getX(), -m.getY());
            if (!zu1Var.u9.w() || !zu1Var.u9.m(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(m.getX(), m.getY());
                if (m.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                ir1 ir1Var = zu1Var.F1;
                if (ir1Var != null) {
                    if (zu1Var.J3 != null) {
                        z = ir1Var.C(motionEvent);
                        if (zu1Var.F1.I) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !zu1Var.u9.w() || (motionEvent.getY() >= zu1Var.A0.getTop() && motionEvent.getY() <= zu1Var.A0.getBottom())) {
                            wr1Var = zu1Var.Ta;
                            if (!wr1Var.n) {
                                return wr1Var.g(motionEvent);
                            }
                            vh4 vh4Var = vh4.f;
                            if (vh4Var == null || !vh4Var.a) {
                                if (zu1Var.isInPreviewMode() && zu1Var.ga) {
                                    if (motionEvent.getAction() == 0) {
                                        int i = 2;
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (zu1Var.y1 != null) {
                                            int i2 = 0;
                                            for (int i3 = 3; i2 < i3; i3 = 3) {
                                                rx6 rx6Var = zu1Var.y1.e[i2 == 0 ? 1 : i2 == 1 ? i : i3];
                                                if (rx6Var != null) {
                                                    ((cv1) rx6Var.b).getLocationInWindow(iArr2);
                                                    Rect rect = hl.Q;
                                                    int i4 = iArr2[0] - iArr[0];
                                                    rect.set(i4, iArr2[1] - iArr[1], hl.L(56.0f) + i4, hl.L(61.0f) + (iArr2[1] - iArr[1]));
                                                    if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                        z2 = true;
                                                        break;
                                                    }
                                                }
                                                i2++;
                                                i = 2;
                                            }
                                        }
                                        z2 = false;
                                        qq1 qq1Var = zu1Var.p1;
                                        if (qq1Var != null) {
                                            qq1Var.getLocationInWindow(iArr2);
                                            Rect rect2 = hl.Q;
                                            int i5 = iArr2[0] - iArr[0];
                                            rect2.set(i5, iArr2[1] - iArr[1], zu1Var.p1.getMeasuredWidth() + i5, zu1Var.p1.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z3 = true;
                                                if (z2) {
                                                    this.s0 = motionEvent.getX();
                                                    this.t0 = motionEvent.getY();
                                                    this.u0 = SystemClock.elapsedRealtime();
                                                    this.v0 = z3;
                                                    qq1 qq1Var2 = zu1Var.p1;
                                                    if (qq1Var2 != null) {
                                                        qq1Var2.i0.c(z3);
                                                    }
                                                    z = true;
                                                } else {
                                                    this.u0 = -1L;
                                                }
                                            }
                                        }
                                        z3 = false;
                                        if (z2) {
                                        }
                                    } else if (motionEvent.getAction() == 1) {
                                        qq1 qq1Var3 = zu1Var.p1;
                                        if (qq1Var3 != null) {
                                            qq1Var3.i0.c(false);
                                        }
                                        if (this.v0 || (dte.a(this.s0, this.t0, motionEvent.getX(), motionEvent.getY()) < hl.L(6.0f) && SystemClock.elapsedRealtime() - this.u0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.v0) {
                                                wk5Var2 = ((e) zu1Var).parentLayout;
                                                zu1Var.removeSelfFromStack(false);
                                                ((ActionBarLayout) wk5Var2).S(ProfileActivity.Q2(zu1Var.l6));
                                            } else {
                                                wk5Var = ((e) zu1Var).parentLayout;
                                                ((ActionBarLayout) wk5Var).p();
                                            }
                                            motionEvent.setAction(3);
                                        }
                                        this.u0 = -1L;
                                    } else if (motionEvent.getAction() == 3) {
                                        this.u0 = -1L;
                                    }
                                }
                                if (super.dispatchTouchEvent(motionEvent) || z) {
                                }
                            } else {
                                tb0 tb0Var = (tb0) vh4.r().d;
                                if (tb0Var != null) {
                                    tb0Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-m.getX(), -m.getY());
                            if (zu1Var.u9.m(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(m.getX(), m.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = ir1Var.e;
                        if (ir1Var.I) {
                            ir1Var.J = true;
                            ir1Var.I = false;
                            ir1Var.G(viewArr[0], 0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                ir1Var.G(view2, ir1Var.E ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            ir1Var.d = 0;
                            ir1Var.c = 1.0f;
                            lic licVar = ir1Var.N;
                            if (licVar != null) {
                                licVar.f(1.0f, 0, ir1Var.b);
                            }
                            ir1Var.y(false);
                        }
                    }
                }
                z = false;
                if (motionEvent.getAction() == 0) {
                }
                wr1Var = zu1Var.Ta;
                if (!wr1Var.n) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        zu1 zu1Var = this.x0;
        n0c n0cVar = zu1Var.n0;
        float progress = (view == n0cVar || view == this.M || view == zu1Var.Z || (view instanceof ula) || n0cVar == null) ? 0.0f : n0cVar.getProgress() * zu1Var.n0.getContentWidth();
        if (progress <= 0.0f) {
            return Z(canvas, view, j);
        }
        canvas.save();
        canvas.translate(-progress, 0.0f);
        boolean Z = Z(canvas, view, j);
        canvas.restore();
        return Z;
    }

    @Override // wma
    public float getBottomOffset() {
        return this.x0.A0.getBottom();
    }

    public zu1 getChatActivity() {
        return this.x0;
    }

    public Drawable getCompactBackground() {
        int themedColor = this.x0.getThemedColor(aob.ua);
        ColorDrawable colorDrawable = this.w0;
        if (colorDrawable == null || colorDrawable.getColor() != themedColor) {
            this.w0 = new ColorDrawable(themedColor);
        }
        return this.w0;
    }

    @Override // wma
    public int getKeyboardHeight() {
        if (this.x0.mb) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // wma
    public float getListTranslationY() {
        return this.x0.A0.getTranslationY();
    }

    @Override // wma
    public Drawable getNewDrawable() {
        zu1 zu1Var = this.x0;
        if (zu1Var.U7()) {
            return getCompactBackground();
        }
        Drawable l = zu1Var.Ba.l();
        return l != null ? l : super.getNewDrawable();
    }

    @Override // wma
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.x0.Ba.g;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // wma
    public int getScrollOffset() {
        return this.x0.A0.computeVerticalScrollOffset();
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        wk5 wk5Var;
        wk5 wk5Var2;
        wk5 wk5Var3;
        wq1 wq1Var;
        super.onAttachedToWindow();
        zu1 zu1Var = this.x0;
        if (zu1Var.mb) {
            this.I.b = zu1Var.m1;
        } else {
            wk5Var = ((e) zu1Var).parentLayout;
            if (wk5Var != null) {
                wk5Var2 = ((e) zu1Var).parentLayout;
                if (((ActionBarLayout) wk5Var2).b) {
                    hb hbVar = this.I;
                    wk5Var3 = ((e) zu1Var).parentLayout;
                    hbVar.b = (FrameLayout) wk5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.I.c();
        zu1Var.a0.setAdjustPanLayoutHelper(this.I);
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null && ((r47Var.g4() || r47.K4(r47Var.k)) && r47Var.T == 0 && r47.B0(r47Var.k) == zu1Var.l6)) {
            MediaController.z().s0(zu1Var.e6(false), zu1Var.L8, zu1Var.J8, true);
        }
        ad2 ad2Var = zu1Var.ma;
        if (ad2Var != null) {
            ad2Var.G.I();
            wl wlVar = ad2Var.l0;
            if (wlVar != null && (wq1Var = ad2Var.b0) != null) {
                wlVar.b(wq1Var);
            }
            jn7.f(ad2Var.f0).b(ad2Var, 2);
        }
        zu1Var.Ua.i();
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        wq1 wq1Var;
        super.onDetachedFromWindow();
        this.I.d();
        zu1 zu1Var = this.x0;
        ad2 ad2Var = zu1Var.ma;
        if (ad2Var != null) {
            jn7.f(ad2Var.f0).n(ad2Var, 2);
            ad2Var.G.K();
            wl wlVar = ad2Var.l0;
            if (wlVar != null && (wq1Var = ad2Var.b0) != null) {
                wlVar.o(wq1Var);
            }
            ad2Var.R = 0.0f;
            ad2Var.Q = 0L;
            zu1Var.ma = null;
        }
        zu1Var.Ua.j();
        hl.c3(new kc((byte) 17));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        zu1 zu1Var;
        a81 a81Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) != null || (a81Var = (zu1Var = this.x0).N2) == null || !a81Var.a() || zu1Var.N2.getTag() == null) {
                super.onDraw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bc, code lost:
    
        if (r8 != r3.yd) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int g;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        a aVar;
        a aVar2;
        int L;
        boolean z2;
        a aVar3;
        int i11;
        a aVar4;
        a aVar5;
        a aVar6;
        a aVar7;
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        zu1 zu1Var = this.x0;
        rq1 rq1Var = zu1Var.w;
        int i12 = (measuredWidth - zu1Var.Cb) - zu1Var.Db;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = layoutParams.gravity;
                if (i14 == -1) {
                    i14 = 51;
                }
                int i15 = i14 & jn7.w1;
                int i16 = i14 & 7;
                if (i16 == 1) {
                    g = ik8.g(i12, measuredWidth2, 2, zu1Var.Cb) + layoutParams.leftMargin;
                    i5 = layoutParams.rightMargin;
                } else if (i16 != 5) {
                    i6 = zu1Var.Cb + layoutParams.leftMargin;
                    if (i15 == 16) {
                        if (i15 == 48) {
                            i9 = layoutParams.topMargin + getPaddingTop();
                            aVar5 = ((e) zu1Var).actionBar;
                            if (childAt != aVar5) {
                                aVar6 = ((e) zu1Var).actionBar;
                                if (aVar6.getVisibility() == 0) {
                                    aVar7 = ((e) zu1Var).actionBar;
                                    i9 += aVar7.getMeasuredHeight();
                                }
                            }
                        } else if (i15 != 80) {
                            i9 = layoutParams.topMargin;
                        } else {
                            i7 = (i4 - i2) - measuredHeight;
                            i8 = layoutParams.bottomMargin;
                        }
                        if (a0(childAt)) {
                            i9 = 0;
                            i6 = 0;
                        } else {
                            if (childAt != zu1Var.ja && childAt != zu1Var.ua && childAt != zu1Var.U && !(childAt instanceof lg5) && childAt != zu1Var.n0) {
                                if (childAt instanceof lmb) {
                                    i10 = zu1Var.Xa;
                                } else if (childAt == zu1Var.f1) {
                                    aVar3 = ((e) zu1Var).actionBar;
                                    if (aVar3.getVisibility() == 0) {
                                        aVar4 = ((e) zu1Var).actionBar;
                                        i11 = aVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i11 = 0;
                                    }
                                    i9 += i11;
                                } else if (zu1Var.a0.V0(childAt)) {
                                    if (!hl.E) {
                                        z2 = ((e) zu1Var).inBubbleMode;
                                        if (!z2) {
                                            i9 = zu1Var.a0.getBottom();
                                        }
                                    }
                                    i9 = zu1Var.a0.getTop() - childAt.getMeasuredHeight();
                                    L = hl.L(1.0f);
                                    i9 += L;
                                } else {
                                    nr1 nr1Var = zu1Var.a0;
                                    if (nr1Var != null && (childAt == nr1Var.D2 || childAt == nr1Var.C2)) {
                                        i9 = ik8.B(7.0f, rq1Var.e(), i9);
                                        i6 -= hl.L(3.0f);
                                    } else if (childAt == zu1Var.L2) {
                                        i9 = ik8.B(7.0f, rq1Var.e(), i9);
                                    } else if (nr1Var != null && childAt == nr1Var.f1) {
                                        i9 = ik8.B(9.0f, rq1Var.e(), i9);
                                    } else if (childAt == zu1Var.A0 || childAt == zu1Var.y0 || childAt == zu1Var.m3 || childAt == zu1Var.n3 || childAt == zu1Var.o3) {
                                        i10 = zu1Var.Xa;
                                    } else if (childAt != zu1Var.R) {
                                        aVar = ((e) zu1Var).actionBar;
                                        if (childAt == aVar) {
                                            i9 -= getPaddingTop();
                                            if (zu1Var.isInPreviewMode()) {
                                                L = hl.L(1.0f);
                                                i9 += L;
                                            }
                                        } else if (childAt == zu1Var.J8) {
                                            aVar2 = ((e) zu1Var).actionBar;
                                            i9 = aVar2.getMeasuredHeight();
                                        } else if (childAt != zu1Var.q3 && childAt != zu1Var.r3 && childAt != zu1Var.x0) {
                                            if (childAt instanceof s57) {
                                                i9 = hl.m;
                                            } else if (childAt != zu1Var.V) {
                                                if (childAt != zu1Var.c4) {
                                                }
                                            }
                                        }
                                    } else if (nr1Var.a1()) {
                                        i9 -= hl.L(48.0f);
                                    }
                                }
                                i9 = -i10;
                            }
                            i9 = 0;
                        }
                        childAt.layout(i6, i9, measuredWidth2 + i6, measuredHeight + i9);
                    } else {
                        i7 = (((i4 - i2) - measuredHeight) / 2) + layoutParams.topMargin;
                        i8 = layoutParams.bottomMargin;
                    }
                    i9 = i7 - i8;
                    if (a0(childAt)) {
                    }
                    childAt.layout(i6, i9, measuredWidth2 + i6, measuredHeight + i9);
                } else {
                    g = (measuredWidth - zu1Var.Db) - measuredWidth2;
                    i5 = layoutParams.rightMargin;
                }
                i6 = g - i5;
                if (i15 == 16) {
                }
                i9 = i7 - i8;
                if (a0(childAt)) {
                }
                childAt.layout(i6, i9, measuredWidth2 + i6, measuredHeight + i9);
            }
        }
        dr1 dr1Var = zu1Var.n3;
        if (dr1Var != null) {
            dr1Var.setBackgroundHeight(getMeasuredHeight());
        }
        zu1Var.O7();
        zu1Var.Q7();
        zu1Var.vd(false, false);
        R();
        zu1Var.F5();
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04f2 A[EDGE_INSN: B:246:0x04f2->B:247:0x04f2 BREAK  A[LOOP:1: B:135:0x028c->B:149:0x04ed], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        a aVar;
        a aVar2;
        a aVar3;
        int i3;
        int childCount;
        boolean z;
        int i4;
        int i5;
        v21 v21Var;
        a aVar4;
        a aVar5;
        int i6;
        a aVar6;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        qq1 qq1Var;
        s7 s7Var;
        a aVar7;
        s7 s7Var2;
        r6 r6Var;
        a aVar8;
        s7 s7Var3;
        TLRPC.User user;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        zu1 zu1Var = this.x0;
        rq1 rq1Var = zu1Var.w;
        int i7 = (size - zu1Var.Cb) - zu1Var.Db;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30);
        mz4 mz4Var = zu1Var.N.a;
        if (mz4Var instanceof nz4) {
            ((nz4) mz4Var).b(i7, size2);
        }
        int i8 = 0;
        if (this.i0 != i7) {
            zu1Var.T4 = false;
            this.i0 = makeMeasureSpec;
            z4 = ((e) zu1Var).inPreviewMode;
            if (z4 || (user = zu1Var.f) == null || !user.self) {
                zu1Var.ha = false;
            } else {
                ema titleTextView = zu1Var.p1.getTitleTextView();
                if (i7 - hl.L(152.0f) > hl.L(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    z5 = !zu1Var.ia;
                    zu1Var.ha = z5;
                    if (!z5 || zu1Var.ia || lbc.x(zu1Var.f)) {
                        qq1Var = zu1Var.p1;
                        if (qq1Var != null && qq1Var.getLayoutParams() != null) {
                            ((ViewGroup.MarginLayoutParams) zu1Var.p1.getLayoutParams()).rightMargin = hl.L(zu1Var.g4 != 3 && ((s7Var = zu1Var.m0) == null || s7Var.getVisibility() != 0) ? 52.0f : 92.0f);
                        }
                    } else {
                        qq1 qq1Var2 = zu1Var.p1;
                        if (qq1Var2 != null && qq1Var2.getLayoutParams() != null) {
                            ((ViewGroup.MarginLayoutParams) zu1Var.p1.getLayoutParams()).rightMargin = hl.L(52.0f);
                        }
                    }
                    if (zu1Var.ha) {
                        s7 s7Var4 = zu1Var.j0;
                        if (s7Var4 != null) {
                            s7Var4.S(40);
                        }
                        s7 s7Var5 = zu1Var.p0;
                        if (s7Var5 != null) {
                            s7Var5.setVisibility(8);
                        }
                    } else {
                        aVar8 = ((e) zu1Var).actionBar;
                        if (!aVar8.o0 && (s7Var3 = zu1Var.p0) != null) {
                            s7Var3.setVisibility(0);
                        }
                        s7 s7Var6 = zu1Var.j0;
                        if (s7Var6 != null) {
                            s7Var6.u(40);
                        }
                    }
                    aVar7 = ((e) zu1Var).actionBar;
                    if (!aVar7.o0 && (r6Var = zu1Var.q0) != null) {
                        r6Var.e((zu1Var.ia || zu1Var.ha) ? 8 : 0);
                    }
                    s7Var2 = zu1Var.j0;
                    if (s7Var2 != null) {
                        TLRPC.UserFull userFull = zu1Var.s8;
                        if (zu1Var.ia) {
                            s7Var2.u(32);
                        } else if (userFull != null && userFull.phone_calls_available) {
                            s7Var2.S(32);
                        }
                    }
                    zu1Var.T4 = false;
                } else {
                    zu1Var.ha = false;
                }
            }
            z5 = false;
            if (z5) {
            }
            qq1Var = zu1Var.p1;
            if (qq1Var != null) {
                ((ViewGroup.MarginLayoutParams) zu1Var.p1.getLayoutParams()).rightMargin = hl.L(zu1Var.g4 != 3 && ((s7Var = zu1Var.m0) == null || s7Var.getVisibility() != 0) ? 52.0f : 92.0f);
            }
            if (zu1Var.ha) {
            }
            aVar7 = ((e) zu1Var).actionBar;
            if (!aVar7.o0) {
                r6Var.e((zu1Var.ia || zu1Var.ha) ? 8 : 0);
            }
            s7Var2 = zu1Var.j0;
            if (s7Var2 != null) {
            }
            zu1Var.T4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        aVar = ((e) zu1Var).actionBar;
        measureChildWithMargins(aVar, makeMeasureSpec, 0, i2, 0);
        aVar2 = ((e) zu1Var).actionBar;
        int measuredHeight = aVar2.getMeasuredHeight();
        aVar3 = ((e) zu1Var).actionBar;
        if (aVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z6 = this.f + zu1Var.La >= hl.L(20.0f);
        if (this.h0 != size2) {
            Q();
        }
        int keyboardHeight = getKeyboardHeight();
        if (zu1Var.Ma > 0 && keyboardHeight <= hl.L(20.0f)) {
            i3 = zu1Var.Ma;
            zu1Var.La = i3;
        } else if (keyboardHeight <= hl.L(20.0f)) {
            i3 = zu1Var.a0.U0() ? zu1Var.a0.getEmojiPadding() : 0;
            zu1Var.La = i3;
        } else {
            zu1Var.La = 0;
            i3 = 0;
        }
        setEmojiKeyboardHeight(i3);
        boolean z7 = this.f + zu1Var.La >= hl.L(20.0f);
        if (MediaController.z().v0 != null && MediaController.z().v0.g4() && z6 != z7) {
            for (int i9 = 0; i9 < zu1Var.A0.getChildCount(); i9++) {
                View childAt = zu1Var.A0.getChildAt(i9);
                if (childAt instanceof wb2) {
                    r47 messageObject = ((wb2) childAt).getMessageObject();
                    if (messageObject.g4() && MediaController.z().H(messageObject)) {
                        zu1Var.A0.getClass();
                        int S = RecyclerView.S(childAt);
                        if (S >= 0) {
                            zu1Var.C0.h1(S, (int) (((((zu1Var.A0.getMeasuredHeight() - zu1Var.P9) - zu1Var.Ya) + ((this.f + zu1Var.La) - r1)) - (z7 ? hl.u : hl.b3(zu1Var.f8(), zu1Var.U7()))) / 2.0f), false);
                            zu1Var.D0.g(S);
                            this.I.g = true;
                            childCount = getChildCount();
                            int i10 = paddingTop;
                            measureChildWithMargins(zu1Var.a0, makeMeasureSpec, 0, i2, 0);
                            z = ((e) zu1Var).inPreviewMode;
                            if (!z || zu1Var.mb) {
                                this.g0 = 0;
                            } else {
                                this.g0 = zu1Var.a0.getMeasuredHeight();
                            }
                            zu1Var.Xa = 0;
                            zu1Var.Ya = 0;
                            if (xea.f() && !zu1Var.mb && zu1Var.H != null && Build.VERSION.SDK_INT >= 31) {
                                int i11 = zu1Var.I;
                                zu1Var.Xa = i11;
                                zu1Var.Ya = i11;
                            }
                            i4 = 0;
                            while (true) {
                                int i12 = -1;
                                if (i4 < childCount) {
                                    break;
                                }
                                View childAt2 = getChildAt(i4);
                                if (childAt2 != null && childAt2.getVisibility() != 8 && childAt2 != zu1Var.a0) {
                                    aVar4 = ((e) zu1Var).actionBar;
                                    if (childAt2 != aVar4) {
                                        if (a0(childAt2)) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                        } else if (childAt2 == zu1Var.A0 || childAt2 == zu1Var.y0 || (childAt2 instanceof lmb)) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(hl.L(10.0f), zu1Var.Xa + size2 + zu1Var.Ya), TLObject.FLAG_30));
                                        } else if (childAt2 == zu1Var.R) {
                                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30);
                                            int L = hl.L(10.0f);
                                            int i13 = i10 - this.g0;
                                            z3 = ((e) zu1Var).inPreviewMode;
                                            childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(L, hl.L((zu1Var.a0.a1() ? 48 : i8) + 2) + (i13 - (z3 ? hl.m : i8))), TLObject.FLAG_30));
                                        } else if (childAt2 == zu1Var.q3) {
                                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30);
                                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                            zu1Var.q3.setInternalPadding(hl.L(12.0f) + rq1Var.e() + ((int) zu1Var.pd));
                                            childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                        } else if (childAt2 == zu1Var.r3) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - rq1Var.e()) - ((int) zu1Var.pd)) - hl.L(12.0f), TLObject.FLAG_30));
                                        } else if (childAt2 == zu1Var.f1) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                                        } else if (zu1Var.a0.V0(childAt2)) {
                                            jy1 jy1Var = zu1Var.a0.w2;
                                            if (childAt2 == jy1Var && jy1Var != null) {
                                                i12 = jy1Var.getKeyboardHeight();
                                            }
                                            z2 = ((e) zu1Var).inBubbleMode;
                                            if (z2) {
                                                int paddingTop2 = getPaddingTop() + (i10 - this.g0) + measuredHeight;
                                                if (i12 < 0) {
                                                    i12 = Math.max(Math.min(paddingTop2, hl.L(350.0f)), paddingTop2 / 2);
                                                }
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
                                            } else if (hl.E) {
                                                int paddingTop3 = getPaddingTop() + (((i10 - this.g0) + measuredHeight) - hl.m);
                                                if (i12 < 0) {
                                                    i12 = Math.max(Math.min(paddingTop3, hl.L(350.0f)), paddingTop3 / 2);
                                                }
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
                                            } else {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, TLObject.FLAG_30));
                                            }
                                        } else {
                                            fr1 fr1Var = zu1Var.X1;
                                            if (childAt2 == fr1Var) {
                                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fr1Var.getLayoutParams();
                                                r17 adapter = zu1Var.X1.getAdapter();
                                                if (adapter.x0 == null || adapter.i0) {
                                                    zu1Var.X1.setIgnoreLayout(true);
                                                    layoutParams.height = i10;
                                                    layoutParams.topMargin = 0;
                                                    zu1Var.X1.setIgnoreLayout(false);
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                } else {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
                                                }
                                            } else if (childAt2 == zu1Var.u9.m(getContext())) {
                                                int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30);
                                                int i14 = i10 + zu1Var.Xa;
                                                if (keyboardHeight <= hl.L(20.0f) || getLayoutParams().height >= 0 || zu1Var.mb) {
                                                    ot1 ot1Var = zu1Var.u9;
                                                    ot1Var.d0 = 0;
                                                    ot1Var.v();
                                                } else {
                                                    i14 += keyboardHeight;
                                                    ot1 ot1Var2 = zu1Var.u9;
                                                    ot1Var2.d0 = keyboardHeight;
                                                    ot1Var2.v();
                                                }
                                                childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
                                            } else if (childAt2 instanceof s57) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - hl.m) - hl.n, TLObject.FLAG_30));
                                            } else if (childAt2 == zu1Var.g2) {
                                                aVar5 = ((e) zu1Var).actionBar;
                                                if (aVar5.getVisibility() == 0) {
                                                    aVar6 = ((e) zu1Var).actionBar;
                                                    i6 = size2 - aVar6.getMeasuredHeight();
                                                } else {
                                                    i6 = size2;
                                                }
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i6, TLObject.FLAG_30));
                                            } else {
                                                measureChildWithMargins(childAt2, makeMeasureSpec, 0, i2, 0);
                                            }
                                        }
                                    }
                                }
                                i4++;
                                i8 = 0;
                            }
                            if (zu1Var.S4) {
                                zu1Var.T4 = true;
                                zu1Var.O7();
                                zu1Var.Q7();
                                zu1Var.S4 = false;
                                wq1 wq1Var = zu1Var.A0;
                                wq1Var.measure(View.MeasureSpec.makeMeasureSpec(wq1Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(zu1Var.A0.getMeasuredHeight(), TLObject.FLAG_30));
                                zu1Var.T4 = false;
                            }
                            i5 = zu1Var.N4;
                            if (i5 != -1) {
                                hl.c3(new zd((Object) this, i5, (byte) 20));
                                zu1Var.N4 = -1;
                            }
                            v21Var = v21.x;
                            if (v21Var != null && zu1Var.Sc != null) {
                                v21Var.l();
                            }
                            zu1Var.e5();
                            this.h0 = size2;
                        }
                    }
                }
            }
        }
        dx1 dx1Var = zu1Var.a0.M4;
        hl.r(dx1Var);
        dx1Var.run();
        childCount = getChildCount();
        int i102 = paddingTop;
        measureChildWithMargins(zu1Var.a0, makeMeasureSpec, 0, i2, 0);
        z = ((e) zu1Var).inPreviewMode;
        if (z) {
        }
        this.g0 = 0;
        zu1Var.Xa = 0;
        zu1Var.Ya = 0;
        if (xea.f()) {
            int i112 = zu1Var.I;
            zu1Var.Xa = i112;
            zu1Var.Ya = i112;
        }
        i4 = 0;
        while (true) {
            int i122 = -1;
            if (i4 < childCount) {
            }
            i4++;
            i8 = 0;
        }
        if (zu1Var.S4) {
        }
        i5 = zu1Var.N4;
        if (i5 != -1) {
        }
        v21Var = v21.x;
        if (v21Var != null) {
            v21Var.l();
        }
        zu1Var.e5();
        this.h0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        zu1 zu1Var = this.x0;
        uk0.c(zu1Var.P8, zu1Var.fragmentView);
        zu1Var.Q8.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.x0.T4) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        zu1 zu1Var = this.x0;
        zu1Var.S9 = i2;
        zu1Var.O7();
        zu1Var.Q7();
    }

    @Override // wma
    public final void K() {
    }

    @Override // wma
    public final void V() {
    }

    @Override // wma
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
    }
}
