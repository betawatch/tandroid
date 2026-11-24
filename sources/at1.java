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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.l;
import org.telegram.ui.Components.q;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class at1 extends cja {
    public long A0;
    public boolean B0;
    public ColorDrawable C0;
    public final /* synthetic */ mu1 D0;
    public int m0;
    public int n0;
    public int o0;
    public final ArrayList p0;
    public final ArrayList q0;
    public final ArrayList r0;
    public final ArrayList s0;
    public Paint t0;
    public int u0;
    public final ys1 v0;
    public final ys1 w0;
    public final RectF x0;
    public float y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v2, types: [ys1] */
    /* JADX WARN: Type inference failed for: r2v5, types: [ys1] */
    public at1(mu1 mu1Var, Context context, ui5 ui5Var) {
        super(context, ui5Var);
        this.D0 = mu1Var;
        final byte b = 0;
        this.m0 = 0;
        this.p0 = new ArrayList();
        this.q0 = new ArrayList();
        this.r0 = new ArrayList();
        this.s0 = new ArrayList();
        this.v0 = new wg5(this) { // from class: ys1
            public final /* synthetic */ at1 b;

            {
                this.b = this;
            }

            @Override // wg5
            public final void a(tab tabVar, RectF rectF) {
                byte b2 = b;
                tabVar.b = true;
            }

            @Override // wg5
            public final void d(Canvas canvas, RectF rectF) {
                switch (b) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        mu1 mu1Var2 = this.b.D0;
                        if (mu1Var2.A0.Z0() && mu1Var2.A0.getOverScrollMode() != 2) {
                            mu1Var2.A0.d(canvas, rectF);
                            break;
                        } else {
                            mu1Var2.A0.z1(canvas, rectF);
                            int i = 0;
                            while (true) {
                                int childCount = mu1Var2.A0.getChildCount();
                                jq1 jq1Var = mu1Var2.A0;
                                if (i >= childCount) {
                                    jq1Var.A1(canvas, rectF);
                                    break;
                                } else {
                                    View childAt = jq1Var.getChildAt(i);
                                    if (!mu1Var2.Na(childAt, rectF)) {
                                        if (childAt instanceof gb2) {
                                            canvas.save();
                                            canvas.translate(childAt.getX(), childAt.getY());
                                            gb2 gb2Var = (gb2) childAt;
                                            if (gb2Var.L0()) {
                                                canvas.save();
                                                canvas.translate(0.0f, gb2Var.W);
                                                gb2Var.M0(canvas, true, false);
                                                canvas.restore();
                                            }
                                            canvas.restore();
                                            mu1Var2.A0.drawChild(canvas, childAt, uptimeMillis);
                                            if (gb2Var.l2()) {
                                                canvas.save();
                                                canvas.translate(gb2Var.getX(), gb2Var.getY());
                                                gb2Var.i1(canvas);
                                                canvas.restore();
                                            }
                                        } else {
                                            boolean z = childAt instanceof uk1;
                                            jq1 jq1Var2 = mu1Var2.A0;
                                            if (z) {
                                                jq1Var2.drawChild(canvas, childAt, uptimeMillis);
                                                canvas.save();
                                                canvas.translate(childAt.getX(), childAt.getY());
                                                ((uk1) childAt).L(canvas);
                                                canvas.restore();
                                            } else {
                                                jq1Var2.drawChild(canvas, childAt, uptimeMillis);
                                            }
                                        }
                                    }
                                    i++;
                                }
                            }
                        }
                        break;
                    default:
                        at1 at1Var = this.b;
                        mu1 mu1Var3 = at1Var.D0;
                        RectF rectF2 = at1Var.x0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, at1Var.getWidth(), at1Var.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f = mu1Var3.hd.e;
                            int i2 = (int) ((1.0f - f) * 255.0f);
                            int i3 = (int) (255.0f * f);
                            if (f > 0.0f) {
                                canvas.drawRect(rectF2, bkb.l0(bkb.p1(f * 0.85f, mu1Var3.getThemedColor(bkb.c6))));
                            }
                            tk0.b(at1Var.v0, canvas, rectF, mu1Var3.A0, at1Var, i2);
                            fu fuVar = mu1Var3.a4;
                            if (fuVar != null) {
                                tk0.b(fuVar, canvas, rectF, fuVar, at1Var, i3);
                            }
                            vq1 vq1Var = mu1Var3.F1;
                            if (vq1Var != null && vq1Var.getVisibility() == 0) {
                                int childCount2 = mu1Var3.F1.getChildCount();
                                for (int i4 = 0; i4 < childCount2; i4++) {
                                    View childAt2 = mu1Var3.F1.getChildAt(i4);
                                    if ((childAt2 instanceof uu1) && childAt2.getVisibility() == 0) {
                                        at1 at1Var2 = ((uu1) childAt2).a.m1;
                                        tk0.a(at1Var2.w0, canvas, rectF, at1Var2, at1Var);
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
        this.w0 = new wg5(this) { // from class: ys1
            public final /* synthetic */ at1 b;

            {
                this.b = this;
            }

            @Override // wg5
            public final void a(tab tabVar, RectF rectF) {
                byte b22 = b2;
                tabVar.b = true;
            }

            @Override // wg5
            public final void d(Canvas canvas, RectF rectF) {
                switch (b2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        mu1 mu1Var2 = this.b.D0;
                        if (mu1Var2.A0.Z0() && mu1Var2.A0.getOverScrollMode() != 2) {
                            mu1Var2.A0.d(canvas, rectF);
                            break;
                        } else {
                            mu1Var2.A0.z1(canvas, rectF);
                            int i = 0;
                            while (true) {
                                int childCount = mu1Var2.A0.getChildCount();
                                jq1 jq1Var = mu1Var2.A0;
                                if (i >= childCount) {
                                    jq1Var.A1(canvas, rectF);
                                    break;
                                } else {
                                    View childAt = jq1Var.getChildAt(i);
                                    if (!mu1Var2.Na(childAt, rectF)) {
                                        if (childAt instanceof gb2) {
                                            canvas.save();
                                            canvas.translate(childAt.getX(), childAt.getY());
                                            gb2 gb2Var = (gb2) childAt;
                                            if (gb2Var.L0()) {
                                                canvas.save();
                                                canvas.translate(0.0f, gb2Var.W);
                                                gb2Var.M0(canvas, true, false);
                                                canvas.restore();
                                            }
                                            canvas.restore();
                                            mu1Var2.A0.drawChild(canvas, childAt, uptimeMillis);
                                            if (gb2Var.l2()) {
                                                canvas.save();
                                                canvas.translate(gb2Var.getX(), gb2Var.getY());
                                                gb2Var.i1(canvas);
                                                canvas.restore();
                                            }
                                        } else {
                                            boolean z = childAt instanceof uk1;
                                            jq1 jq1Var2 = mu1Var2.A0;
                                            if (z) {
                                                jq1Var2.drawChild(canvas, childAt, uptimeMillis);
                                                canvas.save();
                                                canvas.translate(childAt.getX(), childAt.getY());
                                                ((uk1) childAt).L(canvas);
                                                canvas.restore();
                                            } else {
                                                jq1Var2.drawChild(canvas, childAt, uptimeMillis);
                                            }
                                        }
                                    }
                                    i++;
                                }
                            }
                        }
                        break;
                    default:
                        at1 at1Var = this.b;
                        mu1 mu1Var3 = at1Var.D0;
                        RectF rectF2 = at1Var.x0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, at1Var.getWidth(), at1Var.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f = mu1Var3.hd.e;
                            int i2 = (int) ((1.0f - f) * 255.0f);
                            int i3 = (int) (255.0f * f);
                            if (f > 0.0f) {
                                canvas.drawRect(rectF2, bkb.l0(bkb.p1(f * 0.85f, mu1Var3.getThemedColor(bkb.c6))));
                            }
                            tk0.b(at1Var.v0, canvas, rectF, mu1Var3.A0, at1Var, i2);
                            fu fuVar = mu1Var3.a4;
                            if (fuVar != null) {
                                tk0.b(fuVar, canvas, rectF, fuVar, at1Var, i3);
                            }
                            vq1 vq1Var = mu1Var3.F1;
                            if (vq1Var != null && vq1Var.getVisibility() == 0) {
                                int childCount2 = mu1Var3.F1.getChildCount();
                                for (int i4 = 0; i4 < childCount2; i4++) {
                                    View childAt2 = mu1Var3.F1.getChildAt(i4);
                                    if ((childAt2 instanceof uu1) && childAt2.getVisibility() == 0) {
                                        at1 at1Var2 = ((uu1) childAt2).a.m1;
                                        tk0.a(at1Var2.w0, canvas, rectF, at1Var2, at1Var);
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.x0 = new RectF();
        this.I = new zs1(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f) {
        a aVar;
        mu1 mu1Var = this.D0;
        mu1Var.m1.setTranslationY(f);
        aVar = ((d) mu1Var).actionBar;
        aVar.setTranslationY(0.0f);
        sr1 sr1Var = mu1Var.Bb;
        if (sr1Var != null) {
            sr1Var.setTranslationY(mu1Var.D1 != null ? r2.getCurrentHeight() : 0);
        }
        je5 je5Var = mu1Var.L1;
        if (je5Var != null) {
            je5Var.setTranslationY(0.0f);
        }
        je5 je5Var2 = mu1Var.K1;
        if (je5Var2 != null) {
            je5Var2.setTranslationY(0.0f);
        }
        mu1Var.f1.setTranslationY(0.0f);
        mu1Var.R.setTranslationY(0.0f);
        mu1Var.T9 = 0.0f;
        mu1Var.U9 = 0.0f;
        mu1Var.m1.setBackgroundTranslation(0);
        q qVar = mu1Var.q3;
        if (qVar != null) {
            qVar.y0 = 0.0f;
            qVar.w.setTranslationY(qVar.z0 + 0.0f);
        }
        s71 s71Var = mu1Var.N2;
        if (s71Var != null) {
            vk0 vk0Var = (vk0) s71Var.b;
            vk0Var.u = 0.0f;
            vk0Var.d.invalidate();
        }
        mu1Var.setFragmentPanTranslationOffset(0);
        mu1Var.G7();
    }

    @Override // cja
    public final boolean O() {
        return false;
    }

    @Override // cja
    public final boolean P() {
        return false;
    }

    @Override // cja
    public final int Q() {
        x31 x31Var = this.D0.Y1;
        if (x31Var == null || !x31Var.isShowing()) {
            return super.Q();
        }
        this.f = 0;
        return 0;
    }

    @Override // cja
    public final void T(Drawable drawable) {
        mu1 mu1Var = this.D0;
        nqc nqcVar = mu1Var.Y;
        if (drawable instanceof ye7) {
            ((ye7) drawable).o();
        }
        gx4 c = nqcVar.c(drawable);
        float B = gl.B(nqcVar.b(c));
        float B2 = gl.B(nqcVar.a(c));
        mu1Var.hc = B <= 0.721f;
        mu1Var.ic = B2 <= 0.9f;
        mu1Var.N.a = c;
        lx4 lx4Var = mu1Var.J;
        if (lx4Var != null) {
            Iterator it = lx4Var.w.iterator();
            while (it.hasNext()) {
                gl0 gl0Var = ((il0) it.next()).h0;
                if (gl0Var != null) {
                    gl0Var.h = true;
                }
            }
        }
        lx4 lx4Var2 = mu1Var.K;
        if (lx4Var2 != null) {
            Iterator it2 = lx4Var2.w.iterator();
            while (it2.hasNext()) {
                gl0 gl0Var2 = ((il0) it2.next()).h0;
                if (gl0Var2 != null) {
                    gl0Var2.h = true;
                }
            }
        }
        ry1 ry1Var = mu1Var.Z;
        if (ry1Var != null) {
            ry1Var.setOverlayColor(mu1Var.M7() ? mu1Var.getThemedColor(bkb.ua) : 0);
            mu1Var.Z.invalidate();
        }
        j92 j92Var = mu1Var.U;
        if (j92Var != null) {
            j92Var.invalidate();
        }
        mu1Var.m1.invalidate();
        Iterator it3 = mu1Var.F.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        mu1Var.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f, gb2 gb2Var, int i) {
        int save = canvas.save();
        mu1 mu1Var = this.D0;
        float x = gb2Var.getX() + mu1Var.A0.getLeft();
        float y = gb2Var.getY() + mu1Var.A0.getY() + gb2Var.getPaddingTop();
        float alpha = gb2Var.a() ? gb2Var.getAlpha() : 1.0f;
        canvas.clipRect(mu1Var.A0.getLeft(), f, mu1Var.A0.getRight(), ((((mu1Var.A0.getY() + mu1Var.A0.getMeasuredHeight()) - mu1Var.Ya) - mu1Var.w.e()) - mu1Var.bd) - gl.L(9.0f));
        canvas.translate(x, y);
        gb2Var.setInvalidatesParent(true);
        if (i == 0) {
            gb2Var.A1(alpha, canvas, true);
        } else if (i == 1) {
            gb2Var.h1(canvas, alpha);
        } else if (i == 2) {
            gb2Var.Q0(alpha, canvas, gb2Var.getCurrentPosition() != null && (gb2Var.getCurrentPosition().l & 1) == 0);
        } else if (i == 3) {
            boolean z = gb2Var.getCurrentPosition() != null && (gb2Var.getCurrentPosition().l & 1) == 0;
            gb2Var.V0(canvas, alpha);
            if (!z) {
                gb2Var.q1(canvas, alpha, null);
            }
        } else if (i == 4 && ((gb2Var.getCurrentPosition() == null || (gb2Var.getCurrentPosition().l & 1) != 0) && mu1Var.c9 != null)) {
            float f2 = (mu1Var.X8 * mu1Var.a9) / 0.2f;
            canvas.save();
            gb2Var.u1(canvas, mu1Var.c9, f2, mu1Var.Y8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x, y);
            gb2Var.v1(this, canvas, mu1Var.d9, mu1Var.c9, f2);
            canvas.restore();
        }
        gb2Var.setInvalidatesParent(false);
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
        s71 s71Var;
        a aVar;
        k27 k27Var;
        boolean z;
        boolean z2;
        dr1 dr1Var;
        k27 k27Var2;
        q qVar;
        a aVar2;
        a aVar3;
        mu1 mu1Var = this.D0;
        boolean z3 = false;
        if ((mu1Var.Z8 == null && ((ArrayList) mu1Var.ja.c).size() <= 0) || (view != mu1Var.y1 && view != mu1Var.m3 && view != mu1Var.n3 && view != mu1Var.J9 && view != mu1Var.ua && view != mu1Var.t2 && view != null && view != mu1Var.N3 && view != mu1Var.O3)) {
            if ((view != mu1Var.N3 || !PhotoViewer.r0().V0()) && (!mu1Var.pa || view != mu1Var.A0)) {
                if (mu1Var.Ha) {
                    aVar3 = ((d) mu1Var).actionBar;
                }
                if (view != mu1Var.q3) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (s71Var = mu1Var.N2) != null && s71Var.a() && mu1Var.N2.getTag() != null) {
                            aVar = ((d) mu1Var).actionBar;
                            if (view != aVar) {
                            }
                        }
                        k27Var = MediaController.w().v0;
                        if (k27Var == null) {
                        }
                        z = false;
                        z2 = false;
                        if (view == mu1Var.J8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        aVar2 = ((d) mu1Var).actionBar;
                    } else {
                        if (view != mu1Var.A0) {
                            if (view != mu1Var.U) {
                            }
                        }
                        k27Var = MediaController.w().v0;
                        if (k27Var == null && k27Var.T == 0) {
                            z = k27Var.g4();
                            if (z || k27.K4(k27Var.k)) {
                                z2 = true;
                                if (view == mu1Var.J8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-mu1Var.ka) - (mu1Var.ra != 0.0f ? (mu1Var.A0.getMeasuredHeight() - mu1Var.ka) * mu1Var.ra : 0.0f));
                                    if (k27Var != null && k27Var.D == 5) {
                                        if (bkb.j3 != null && mu1Var.L8.d) {
                                            int x = ((int) view.getX()) - gl.L(3.0f);
                                            int y = ((int) view.getY()) - gl.L(2.0f);
                                            canvas.save();
                                            canvas.scale(mu1Var.J8.getScaleX(), mu1Var.J8.getScaleY(), view.getX(), view.getY());
                                            bkb.j3.setAlpha(kk7.d4);
                                            bkb.j3.setBounds(x, y, gl.L(6.0f) + gl.b3(mu1Var.W7(), mu1Var.M7()) + x, gl.L(6.0f) + gl.b3(mu1Var.W7(), mu1Var.M7()) + y);
                                            bkb.j3.draw(canvas);
                                            canvas.restore();
                                        }
                                        z3 = super.drawChild(canvas, view, j);
                                    } else if (view.getTag() == null) {
                                        float translationY = view.getTranslationY();
                                        view.setTranslationY(-gl.L(1000.0f));
                                        z3 = super.drawChild(canvas, view, j);
                                        view.setTranslationY(translationY);
                                    }
                                    canvas.restore();
                                    return z3;
                                }
                                if (view == mu1Var.U && (qVar = mu1Var.q3) != null && qVar.getVisibility() == 0) {
                                    super.drawChild(canvas, mu1Var.q3, j);
                                }
                                z3 = super.drawChild(canvas, view, j);
                                if (z2 && view == mu1Var.A0 && k27Var.D != 5 && (dr1Var = mu1Var.J8) != null && dr1Var.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-mu1Var.ka) - (mu1Var.ra != 0.0f ? (mu1Var.A0.getMeasuredHeight() - mu1Var.ka) * mu1Var.ra : 0.0f)) + mu1Var.la);
                                    super.drawChild(canvas, mu1Var.J8, j);
                                    if (mu1Var.K8 != null) {
                                        canvas.save();
                                        canvas.translate(mu1Var.K8.getX(), mu1Var.A0.getY() + mu1Var.K8.getTop());
                                        gb2 gb2Var = mu1Var.K8;
                                        if (z) {
                                            gb2Var.t1(canvas);
                                            invalidate();
                                            mu1Var.K8.invalidate();
                                        } else {
                                            gb2Var.j1(canvas);
                                            gb2 gb2Var2 = mu1Var.K8;
                                            if (!gb2Var2.S9 && ((k27Var2 = gb2Var2.Q5) == null || k27Var2.D != 27)) {
                                                gb2Var2.A1(gb2Var2.getAlpha(), canvas, true);
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
                        if (view == mu1Var.J8) {
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
        mu1 mu1Var = this.D0;
        return view == mu1Var.N2 || view == mu1Var.F1 || view == mu1Var.J9 || view == mu1Var.Z || view == mu1Var.Z3 || view == mu1Var.n0 || (view instanceof zha);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        l lVar;
        mu1 mu1Var = this.D0;
        ar1 ar1Var = mu1Var.a0;
        if (ar1Var == null || view != ar1Var.n0) {
            super.addView(view, i, layoutParams);
        } else {
            ry1 ry1Var = mu1Var.Z;
            int indexOfChild = ry1Var != null ? indexOfChild(ry1Var) : -1;
            if (indexOfChild >= 0) {
                i = indexOfChild;
            }
            super.addView(view, i, layoutParams);
        }
        ar1 ar1Var2 = mu1Var.a0;
        if (ar1Var2 != null && view == ar1Var2.n0) {
            ap0 ap0Var = (ap0) view;
            ap0Var.setBackgroundDrawable(mu1Var.L.c(ap0Var.c, mu1Var.E, false));
        }
        ar1 ar1Var3 = mu1Var.a0;
        if (ar1Var3 == null || view != (lVar = ar1Var3.E2)) {
            return;
        }
        lVar.setBlurredBackgroundFactory(mu1Var.L);
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
    @Override // cja, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        float f;
        float f2;
        Canvas canvas3;
        at1 at1Var;
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
        uk1 uk1Var;
        f27 f27Var;
        gb2 gb2Var;
        c27 c27Var;
        f27 f27Var2;
        int i4;
        View view;
        int i5;
        ArrayList arrayList5;
        gb2 gb2Var2;
        ArrayList arrayList6;
        dq1 dq1Var;
        boolean z;
        float f6;
        float f7;
        boolean z2;
        sq1 sq1Var;
        float f8;
        float f9;
        ar1 ar1Var;
        float f10;
        float f11;
        Canvas canvas4;
        float f12;
        float f13;
        float f14;
        float f15;
        View view2;
        c27 c27Var2;
        Integer num;
        float f16;
        at1 at1Var2;
        i19 i19Var;
        uk1 uk1Var2;
        float f17;
        wjb wjbVar;
        float f18;
        uk1 uk1Var3;
        float f19;
        float f20;
        View view3;
        Canvas canvas5;
        cx1 cx1Var;
        gb2 gb2Var3;
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
        lq1 lq1Var;
        at1 at1Var3 = this;
        mu1 mu1Var = at1Var3.D0;
        dq1 dq1Var2 = mu1Var.w;
        ArrayList arrayList7 = mu1Var.F6;
        mu1Var.a0.H2();
        mu1Var.Fc();
        if (mu1Var.Oa || ((lq1Var = mu1Var.B0) != null && lq1Var.k())) {
            mu1Var.Oa = false;
            mu1Var.Qc();
        }
        mu1Var.jd(false, false);
        mu1Var.Sc();
        je5 je5Var = mu1Var.v2;
        if (je5Var != null && je5Var.W) {
            je5Var.y();
        }
        je5 je5Var2 = mu1Var.x2;
        if (je5Var2 != null && je5Var2.W) {
            je5Var2.y();
        }
        float f22 = 0.2f;
        float f23 = 2.0f;
        if (mu1Var.Ha) {
            aVar10 = ((d) mu1Var).actionBar;
            canvas2 = canvas;
            i = canvas2.saveLayerAlpha(0.0f, aVar10.getBottom(), at1Var3.getMeasuredWidth(), at1Var3.getMeasuredHeight(), (int) (mu1Var.Ia * 255.0f), 31);
            float f24 = (mu1Var.Ia * 0.2f) + 0.8f;
            canvas2.scale(f24, f24, at1Var3.getMeasuredWidth() / 2.0f, at1Var3.getMeasuredHeight() / 2.0f);
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
            gb2 gb2Var4 = (gb2) arrayList7.get(i9);
            g27 g27Var = gb2Var4.getMessageObject().N1;
            if (g27Var != null) {
                canvas2.save();
                aVar7 = ((d) mu1Var).actionBar;
                if (aVar7.getVisibility() == 0) {
                    aVar8 = ((d) mu1Var).actionBar;
                    int translationY = (int) aVar8.getTranslationY();
                    aVar9 = ((d) mu1Var).actionBar;
                    int measuredHeight = aVar9.getMeasuredHeight() + translationY;
                    lr1 lr1Var = mu1Var.D1;
                    int currentHeight = measuredHeight + (lr1Var != null ? lr1Var.getCurrentHeight() : 0);
                    xq1 xq1Var = mu1Var.E1;
                    int currentHeight2 = currentHeight + (xq1Var != null ? xq1Var.getCurrentHeight() : 0);
                    z4 = ((d) mu1Var).inPreviewMode;
                    i7 = currentHeight2 + (z4 ? gl.m : 0);
                } else {
                    i7 = 0;
                }
                f21 = f23;
                canvas2.clipRect(0.0f, i7 + mu1Var.Q9, at1Var3.getWidth(), at1Var3.getHeight());
                ImageReceiver photoImage = gb2Var4.getPhotoImage();
                gb2Var4.getLocationInWindow(gl.R);
                int topViewEnterProgress = (int) ((mu1Var.a0.getTopViewEnterProgress() * gl.L(48.0f)) + ((int) ls6.B(1.0f, g27Var.g, gb2Var4.getTranslationY(), r8[1])));
                boolean z5 = g27Var.h;
                float f25 = g27Var.e;
                float f26 = g27Var.b;
                float f27 = topViewEnterProgress;
                if (z5) {
                    canvas2.translate(f25, gl.R1(f26, f27, g27Var.g));
                } else {
                    canvas2.translate(f25, gl.R1(f26, photoImage.s() + f27, g27Var.g));
                }
                float f28 = g27Var.d;
                canvas2.scale(f28, f28);
                if (!g27Var.h) {
                    canvas2.translate(-photoImage.r(), -photoImage.s());
                }
                gb2Var4.setTimeAlpha(g27Var.f);
                gb2Var4.draw(canvas2);
                canvas2.restore();
            } else {
                f21 = f23;
            }
            i9++;
            f23 = f21;
        }
        float f29 = f23;
        if (mu1Var.c9 == null || mu1Var.Z8 == null) {
            if (mu1Var.T8 != null) {
                mu1Var.U8.reset();
                float measuredWidth = at1Var3.getMeasuredWidth() / mu1Var.R8.getWidth();
                mu1Var.U8.postScale(measuredWidth, measuredWidth);
                mu1Var.S8.setLocalMatrix(mu1Var.U8);
                mu1Var.T8.setAlpha((int) (mu1Var.b9 * 255.0f));
                if (mu1Var.T8.getAlpha() > 0) {
                    canvas2.drawRect(0.0f, 0.0f, at1Var3.getMeasuredWidth(), at1Var3.getMeasuredHeight(), mu1Var.T8);
                }
            } else {
                mu1Var.V8.setAlpha((int) (mu1Var.X8 * 255.0f * (mu1Var.Z8 != null ? mu1Var.a9 : 1.0f)));
                if (mu1Var.V8.getAlpha() > 0) {
                    canvas.drawRect(0.0f, 0.0f, at1Var3.getMeasuredWidth(), at1Var3.getMeasuredHeight(), mu1Var.V8);
                }
            }
        }
        if (mu1Var.c9 != null && mu1Var.e9) {
            at1Var3.invalidate();
        }
        View view4 = mu1Var.Z8;
        if (view4 != null) {
            if (view4 == mu1Var.y1) {
                float f30 = mu1Var.a9;
                if (f30 < 1.0f) {
                    mu1Var.V8.setAlpha((int) ((1.0f - f30) * mu1Var.X8 * 255.0f));
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, at1Var3.getMeasuredWidth(), at1Var3.getMeasuredHeight(), mu1Var.V8);
                } else {
                    canvas3 = canvas;
                }
                at1Var = at1Var3;
                f5 = 1.0f;
                f3 = 0.0f;
                i2 = 0;
                i3 = 1;
            } else if (view4 instanceof ImageView) {
                int save = canvas.save();
                if (mu1Var.a9 < 1.0f) {
                    canvas3 = canvas;
                    i6 = 1;
                    canvas3.saveLayerAlpha(mu1Var.Z8.getLeft(), mu1Var.Z8.getTop(), mu1Var.Z8.getRight(), mu1Var.Z8.getBottom(), (int) (mu1Var.a9 * 255.0f), 31);
                } else {
                    canvas3 = canvas;
                    i6 = 1;
                }
                canvas3.translate(mu1Var.Z8.getLeft(), mu1Var.Z8.getTop());
                View view5 = mu1Var.Z8;
                aVar6 = ((d) mu1Var).actionBar;
                if (view5 == aVar6.getBackButton()) {
                    canvas3.translate(mu1Var.Z8.getX() - mu1Var.Z8.getLeft(), 0.0f);
                    float measuredWidth2 = mu1Var.Z8.getMeasuredWidth() / f29;
                    float measuredHeight2 = mu1Var.Z8.getMeasuredHeight() / f29;
                    canvas3.drawCircle(measuredWidth2, measuredHeight2, Math.max(measuredWidth2, measuredHeight2) * 0.7f, mu1Var.W8);
                }
                mu1Var.Z8.draw(canvas3);
                canvas3.restoreToCount(save);
                float f31 = mu1Var.a9;
                if (f31 < 1.0f) {
                    mu1Var.V8.setAlpha((int) ((1.0f - f31) * mu1Var.X8 * 255.0f));
                    canvas3.drawRect(0.0f, 0.0f, at1Var3.getMeasuredWidth(), at1Var3.getMeasuredHeight(), mu1Var.V8);
                }
                at1Var = at1Var3;
                i3 = i6;
                f5 = 1.0f;
                f3 = 0.0f;
                i2 = 0;
            } else {
                canvas3 = canvas;
                float y = ((mu1Var.A0.getY() + mu1Var.P9) - mu1Var.R9) - gl.L(4.0f);
                View view6 = mu1Var.Z8;
                f27 currentMessagesGroup = view6 instanceof gb2 ? ((gb2) view6).getCurrentMessagesGroup() : null;
                int childCount = mu1Var.A0.getChildCount();
                int i10 = 0;
                boolean z6 = false;
                while (true) {
                    arrayList = at1Var3.r0;
                    float f32 = f22;
                    arrayList2 = at1Var3.q0;
                    arrayList3 = at1Var3.p0;
                    f4 = f2;
                    arrayList4 = at1Var3.s0;
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = mu1Var.A0.getChildAt(i10);
                    if (childAt instanceof gb2) {
                        gb2Var = (gb2) childAt;
                        f27Var = gb2Var.getCurrentMessagesGroup();
                        c27Var = gb2Var.getCurrentPosition();
                        uk1Var = null;
                    } else {
                        uk1Var = childAt instanceof uk1 ? (uk1) childAt : null;
                        f27Var = null;
                        gb2Var = null;
                        c27Var = null;
                    }
                    float f33 = y;
                    if ((childAt == mu1Var.Z8 || (currentMessagesGroup != null && currentMessagesGroup == f27Var)) && childAt.getAlpha() != f4) {
                        if (z6 || gb2Var == null || currentMessagesGroup == null) {
                            f27Var2 = currentMessagesGroup;
                            i4 = childCount;
                            view = childAt;
                            i5 = i10;
                            arrayList5 = arrayList;
                            gb2Var2 = gb2Var;
                            arrayList6 = arrayList4;
                            dq1Var = dq1Var2;
                            z = true;
                            f6 = 1.0f;
                            f7 = 9.0f;
                        } else {
                            ArrayList arrayList8 = currentMessagesGroup.d;
                            f7 = 9.0f;
                            e27 e27Var = currentMessagesGroup.m;
                            f27Var2 = currentMessagesGroup;
                            gb2 gb2Var5 = e27Var.m;
                            i4 = childCount;
                            if (gb2Var5 != null) {
                                float U1 = gb2Var5.U1(true);
                                float f34 = e27Var.a + U1 + e27Var.e;
                                float f35 = e27Var.b + e27Var.f;
                                float f36 = e27Var.c + U1 + e27Var.g;
                                float f37 = f35;
                                float f38 = e27Var.d + e27Var.h;
                                if (!e27Var.j) {
                                    f37 = e27Var.m.getTranslationY() + f37;
                                    f38 = e27Var.m.getTranslationY() + f38;
                                }
                                float L = f37 < (mu1Var.P9 - ((float) mu1Var.R9)) - ((float) gl.L(20.0f)) ? (mu1Var.P9 - mu1Var.R9) - gl.L(20.0f) : f37;
                                view = childAt;
                                float L2 = f38 > ((float) (gl.L(20.0f) + mu1Var.A0.getMeasuredHeight())) ? gl.L(20.0f) + mu1Var.A0.getMeasuredHeight() : f38;
                                i5 = i10;
                                int size2 = arrayList8.size();
                                arrayList5 = arrayList;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= size2) {
                                        gb2Var3 = gb2Var;
                                        z3 = true;
                                        break;
                                    }
                                    int i12 = size2;
                                    k27 k27Var = (k27) arrayList8.get(i11);
                                    int i13 = i11;
                                    if (mu1Var.o6[k27.B0(k27Var.k) == mu1Var.l6 ? (char) 0 : (char) 1].indexOfKey(k27Var.e1()) < 0) {
                                        gb2Var3 = gb2Var;
                                        z3 = false;
                                        break;
                                    } else {
                                        i11 = i13 + 1;
                                        size2 = i12;
                                    }
                                }
                                canvas3.save();
                                float measuredHeight3 = ((getMeasuredHeight() - dq1Var2.e()) - mu1Var.bd) - gl.L(9.0f);
                                sq1 sq1Var2 = mu1Var.X1;
                                float d = measuredHeight3 - (sq1Var2 != null ? sq1Var2.d() : f4);
                                sq1 sq1Var3 = mu1Var.X1;
                                canvas3.clipRect(f4, f33 + (sq1Var3 != null ? sq1Var3.e() : f4), getMeasuredWidth(), d);
                                canvas3.translate(f4, mu1Var.A0.getY());
                                boolean z7 = e27Var.k;
                                boolean z8 = e27Var.l;
                                arrayList6 = arrayList4;
                                dq1Var = dq1Var2;
                                gb2Var2 = gb2Var3;
                                z = true;
                                f6 = 1.0f;
                                e27Var.m.K0(canvas, (int) f34, (int) L, (int) f36, (int) L2, z7, z8, z3, 0);
                                canvas.restore();
                                z2 = true;
                                if (gb2Var2 != null && gb2Var2.getPhotoImage().F()) {
                                    invalidate();
                                }
                                float left = mu1Var.A0.getLeft();
                                float right = mu1Var.A0.getRight();
                                float measuredHeight4 = (((getMeasuredHeight() - dq1Var.e()) - mu1Var.bd) - mu1Var.m7(gxb.c)) - gl.L(f7);
                                sq1Var = mu1Var.X1;
                                if (sq1Var == null) {
                                    float max = Math.max(0.0f, sq1Var.e());
                                    f9 = Math.max(0.0f, mu1Var.X1.d());
                                    f8 = max;
                                } else {
                                    f8 = 0.0f;
                                    f9 = 0.0f;
                                }
                                ar1Var = mu1Var.a0;
                                if (ar1Var != null && (cx1Var = ar1Var.n0) != null) {
                                    f9 = Math.max(f9, !cx1Var.f ? 0.0f : Math.max(0.0f, cx1Var.getMeasuredHeight() - (cx1Var.c.getTranslationY() + cx1Var.e)));
                                }
                                float f39 = f33 + f8;
                                float f40 = measuredHeight4 - f9;
                                if (gb2Var2 != null || !gb2Var2.getTransitionParams().x0) {
                                    left = Math.max(left, view.getX() + mu1Var.A0.getLeft());
                                    f39 = Math.max(f39, view.getY() + mu1Var.A0.getY());
                                    right = Math.min(right, view.getX() + mu1Var.A0.getLeft() + view.getMeasuredWidth());
                                    f40 = Math.min(f40, view.getY() + mu1Var.A0.getY() + view.getMeasuredHeight());
                                }
                                f10 = f40;
                                f11 = f39;
                                float f41 = right;
                                float max2 = Math.max(left, mu1Var.g7());
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
                                    if (gb2Var2 != null) {
                                        gb2Var2.setInvalidatesParent(z);
                                        gb2Var2.setScrimReaction(mu1Var.c9);
                                    } else if (uk1Var != null) {
                                        uk1Var.setInvalidatesParent(z);
                                        uk1Var.setScrimReaction(mu1Var.c9);
                                    }
                                    canvas4.clipRect(f14, f12, f15, f13);
                                    canvas4.translate(view.getX() + mu1Var.A0.getLeft(), view.getY() + mu1Var.A0.getY());
                                    if (gb2Var2 != null && f27Var2 == null && gb2Var2.L0()) {
                                        canvas4.save();
                                        canvas4.translate(0.0f, gb2Var2.getPaddingTop());
                                        gb2Var2.M0(canvas4, z, false);
                                        canvas4.restore();
                                    }
                                    if (gb2Var2 != null && f27Var2 == null) {
                                        gb2Var2.b1(canvas4, mu1Var.b9);
                                    }
                                    view2 = view;
                                    view2.draw(canvas4);
                                    if (gb2Var2 != null && gb2Var2.l2()) {
                                        canvas4.save();
                                        canvas4.translate(0.0f, gb2Var2.getPaddingTop());
                                        gb2Var2.i1(canvas4);
                                        canvas4.restore();
                                    }
                                    if (uk1Var != null) {
                                        uk1Var.L(canvas4);
                                    }
                                    canvas4.restore();
                                    if (gb2Var2 != null) {
                                        gb2Var2.setInvalidatesParent(false);
                                        gb2Var2.setScrimReaction(null);
                                    } else if (uk1Var != null) {
                                        uk1Var.setInvalidatesParent(false);
                                        uk1Var.setScrimReaction(null);
                                    }
                                } else {
                                    canvas4 = canvas;
                                    f12 = f11;
                                    f13 = f10;
                                    f14 = max2;
                                    f15 = f41;
                                    view2 = view;
                                }
                                c27Var2 = c27Var;
                                if (c27Var2 != null) {
                                    if (gb2Var2 != null) {
                                    }
                                    num = mu1Var.c9;
                                    if (num == null && gb2Var2 != null && f27Var2 == null) {
                                        if (mu1Var.T8 != null) {
                                            mu1Var.U8.reset();
                                            float measuredWidth3 = getMeasuredWidth() / mu1Var.R8.getWidth();
                                            mu1Var.U8.postScale(measuredWidth3, measuredWidth3);
                                            mu1Var.S8.setLocalMatrix(mu1Var.U8);
                                            mu1Var.T8.setAlpha((int) (mu1Var.b9 * 255.0f));
                                            f19 = f15;
                                            f20 = f14;
                                            view3 = view2;
                                            f16 = 0.0f;
                                            canvas4.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), mu1Var.T8);
                                        } else {
                                            f19 = f15;
                                            f20 = f14;
                                            view3 = view2;
                                            f16 = 0.0f;
                                            mu1Var.V8.setAlpha((int) (mu1Var.X8 * 255.0f * mu1Var.a9));
                                            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), mu1Var.V8);
                                        }
                                        if (f11 < f10) {
                                            float f42 = (mu1Var.X8 * mu1Var.a9) / f32;
                                            float alpha = view3.getAlpha() * mu1Var.a9;
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
                                            canvas5.translate(view3.getX() + mu1Var.A0.getLeft(), view3.getY() + mu1Var.A0.getY() + view3.getPaddingTop());
                                            gb2Var2.u1(canvas5, mu1Var.c9, f42, mu1Var.Y8);
                                            canvas5.restore();
                                            canvas5.save();
                                            canvas5.translate(view3.getX() + mu1Var.A0.getLeft(), view3.getY() + mu1Var.A0.getY() + view3.getPaddingTop());
                                            gb2Var2.v1(this, canvas5, mu1Var.d9, mu1Var.c9, f42);
                                            at1Var2 = this;
                                            canvas.restore();
                                        } else {
                                            at1Var2 = this;
                                        }
                                    } else {
                                        f16 = 0.0f;
                                        at1Var2 = this;
                                        float f44 = f15;
                                        float f45 = f14;
                                        View view7 = view2;
                                        if (num != null && uk1Var != null) {
                                            wjb wjbVar2 = uk1Var.h1;
                                            i19 i19Var2 = uk1Var.F0;
                                            if (mu1Var.T8 == null) {
                                                mu1Var.U8.reset();
                                                float measuredWidth4 = at1Var2.getMeasuredWidth() / mu1Var.R8.getWidth();
                                                mu1Var.U8.postScale(measuredWidth4, measuredWidth4);
                                                mu1Var.S8.setLocalMatrix(mu1Var.U8);
                                                mu1Var.T8.setAlpha((int) (mu1Var.b9 * 255.0f));
                                                uk1Var2 = uk1Var;
                                                i19Var = i19Var2;
                                                canvas.drawRect(0.0f, 0.0f, at1Var2.getMeasuredWidth(), at1Var2.getMeasuredHeight(), mu1Var.T8);
                                            } else {
                                                i19Var = i19Var2;
                                                uk1Var2 = uk1Var;
                                                mu1Var.V8.setAlpha((int) (mu1Var.X8 * 255.0f * mu1Var.a9));
                                                canvas.drawRect(0.0f, 0.0f, at1Var2.getMeasuredWidth(), at1Var2.getMeasuredHeight(), mu1Var.V8);
                                            }
                                            if (f11 < f10) {
                                                float f46 = (mu1Var.X8 * mu1Var.a9) / f32;
                                                float alpha2 = view7.getAlpha() * mu1Var.a9;
                                                if (alpha2 < f6) {
                                                    float f47 = f12;
                                                    float f48 = f13;
                                                    wjbVar = wjbVar2;
                                                    canvas.saveLayerAlpha(f45, f47, f44, f48, (int) (alpha2 * 255.0f), 31);
                                                    f18 = f48;
                                                    f17 = f47;
                                                    canvas3 = canvas;
                                                } else {
                                                    canvas3 = canvas;
                                                    f17 = f12;
                                                    wjbVar = wjbVar2;
                                                    f18 = f13;
                                                    canvas3.save();
                                                }
                                                canvas3.clipRect(f45, f17, f44, f18);
                                                canvas3.translate(view7.getX() + mu1Var.A0.getLeft(), view7.getY() + mu1Var.A0.getY() + view7.getPaddingTop());
                                                Integer num2 = mu1Var.c9;
                                                boolean z9 = mu1Var.Y8;
                                                i19Var.getClass();
                                                if (wjbVar != null) {
                                                    uk1Var3 = uk1Var2;
                                                    wjbVar.b(uk1Var3.v0, uk1Var3.u0 + gl.L(4.0f), uk1Var2.getMeasuredWidth(), uk1Var3.w0);
                                                } else {
                                                    uk1Var3 = uk1Var2;
                                                    bkb.q(uk1Var3.v0, uk1Var3.u0 + gl.L(4.0f), uk1Var3.getMeasuredWidth(), uk1Var3.w0);
                                                }
                                                i19 i19Var3 = i19Var;
                                                i19Var3.A = f46;
                                                i19Var3.B = z9;
                                                i19Var3.d(canvas3, uk1Var3.x2.c, num2);
                                                canvas3.restore();
                                                canvas3.save();
                                                canvas3.translate(view7.getX() + mu1Var.A0.getLeft(), view7.getY() + mu1Var.A0.getY() + view7.getPaddingTop());
                                                int i15 = mu1Var.d9;
                                                Integer num3 = mu1Var.c9;
                                                i19Var3.getClass();
                                                if (wjbVar != null) {
                                                    wjbVar.b(uk1Var3.v0, uk1Var3.u0 + gl.L(4.0f), uk1Var3.getMeasuredWidth(), uk1Var3.w0);
                                                } else {
                                                    bkb.q(uk1Var3.v0, uk1Var3.u0 + gl.L(4.0f), uk1Var3.getMeasuredWidth(), uk1Var3.w0);
                                                }
                                                i19Var3.A = f46;
                                                i19Var3.f(at1Var2, canvas3, i15, num3);
                                                canvas3.restore();
                                                z6 = z2;
                                            }
                                        }
                                    }
                                    canvas3 = canvas;
                                    z6 = z2;
                                } else if (!c27Var2.h) {
                                    if (c27Var2.a == 0) {
                                    }
                                    if (c27Var2 != null || (c27Var2.l & gb2Var2.H()) != 0) {
                                        arrayList5.add(gb2Var2);
                                    }
                                    if (c27Var2 != null) {
                                        int i16 = c27Var2.l;
                                        if ((i16 & 8) != 0) {
                                        }
                                        num = mu1Var.c9;
                                        if (num == null) {
                                        }
                                        f16 = 0.0f;
                                        at1Var2 = this;
                                        float f442 = f15;
                                        float f452 = f14;
                                        View view72 = view2;
                                        if (num != null) {
                                            wjb wjbVar22 = uk1Var.h1;
                                            i19 i19Var22 = uk1Var.F0;
                                            if (mu1Var.T8 == null) {
                                            }
                                            if (f11 < f10) {
                                            }
                                        }
                                        canvas3 = canvas;
                                        z6 = z2;
                                    }
                                    arrayList6.add(gb2Var2);
                                    num = mu1Var.c9;
                                    if (num == null) {
                                    }
                                    f16 = 0.0f;
                                    at1Var2 = this;
                                    float f4422 = f15;
                                    float f4522 = f14;
                                    View view722 = view2;
                                    if (num != null) {
                                    }
                                    canvas3 = canvas;
                                    z6 = z2;
                                }
                                if (c27Var2 != null || c27Var2.h) {
                                    arrayList3.add(gb2Var2);
                                }
                                if (c27Var2 != null || (c27Var2.a == 0 && c27Var2.c == 0 && gb2Var2.k2())) {
                                    arrayList2.add(gb2Var2);
                                }
                                if (c27Var2 != null) {
                                }
                                arrayList5.add(gb2Var2);
                                if (c27Var2 != null) {
                                }
                                arrayList6.add(gb2Var2);
                                num = mu1Var.c9;
                                if (num == null) {
                                }
                                f16 = 0.0f;
                                at1Var2 = this;
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
                                gb2Var2 = gb2Var;
                                arrayList6 = arrayList4;
                                dq1Var = dq1Var2;
                                z = true;
                                f6 = 1.0f;
                            }
                        }
                        z2 = z6;
                        if (gb2Var2 != null) {
                            invalidate();
                        }
                        float left2 = mu1Var.A0.getLeft();
                        float right2 = mu1Var.A0.getRight();
                        float measuredHeight42 = (((getMeasuredHeight() - dq1Var.e()) - mu1Var.bd) - mu1Var.m7(gxb.c)) - gl.L(f7);
                        sq1Var = mu1Var.X1;
                        if (sq1Var == null) {
                        }
                        ar1Var = mu1Var.a0;
                        if (ar1Var != null) {
                            f9 = Math.max(f9, !cx1Var.f ? 0.0f : Math.max(0.0f, cx1Var.getMeasuredHeight() - (cx1Var.c.getTranslationY() + cx1Var.e)));
                        }
                        float f392 = f33 + f8;
                        float f402 = measuredHeight42 - f9;
                        if (gb2Var2 != null) {
                        }
                        left2 = Math.max(left2, view.getX() + mu1Var.A0.getLeft());
                        f392 = Math.max(f392, view.getY() + mu1Var.A0.getY());
                        right2 = Math.min(right2, view.getX() + mu1Var.A0.getLeft() + view.getMeasuredWidth());
                        f402 = Math.min(f402, view.getY() + mu1Var.A0.getY() + view.getMeasuredHeight());
                        f10 = f402;
                        f11 = f392;
                        float f412 = right2;
                        float max22 = Math.max(left2, mu1Var.g7());
                        if (f11 >= f10) {
                        }
                        c27Var2 = c27Var;
                        if (c27Var2 != null) {
                        }
                        if (c27Var2 != null) {
                        }
                        arrayList3.add(gb2Var2);
                        if (c27Var2 != null) {
                        }
                        arrayList2.add(gb2Var2);
                        if (c27Var2 != null) {
                        }
                        arrayList5.add(gb2Var2);
                        if (c27Var2 != null) {
                        }
                        arrayList6.add(gb2Var2);
                        num = mu1Var.c9;
                        if (num == null) {
                        }
                        f16 = 0.0f;
                        at1Var2 = this;
                        float f442222 = f15;
                        float f452222 = f14;
                        View view72222 = view2;
                        if (num != null) {
                        }
                        canvas3 = canvas;
                        z6 = z2;
                    } else {
                        f6 = 1.0f;
                        at1Var2 = this;
                        f27Var2 = currentMessagesGroup;
                        i4 = childCount;
                        i5 = i10;
                        dq1Var = dq1Var2;
                        f16 = f4;
                    }
                    i10 = i5 + 1;
                    at1Var3 = at1Var2;
                    f22 = f32;
                    dq1Var2 = dq1Var;
                    f = f6;
                    f2 = f16;
                    y = f33;
                    currentMessagesGroup = f27Var2;
                    childCount = i4;
                }
                float f49 = y;
                at1Var = at1Var3;
                f27 f27Var3 = currentMessagesGroup;
                f5 = f;
                f3 = f4;
                int size3 = arrayList3.size();
                if (size3 > 0) {
                    for (int i17 = 0; i17 < size3; i17++) {
                        at1Var.Y(canvas3, f49, (gb2) arrayList3.get(i17), 0);
                    }
                    i2 = 0;
                    arrayList3.clear();
                } else {
                    i2 = 0;
                }
                int size4 = arrayList2.size();
                if (size4 > 0) {
                    for (int i18 = i2; i18 < size4; i18++) {
                        at1Var.Y(canvas3, f49, (gb2) arrayList2.get(i18), 1);
                    }
                    i3 = 1;
                    arrayList2.clear();
                } else {
                    i3 = 1;
                }
                int size5 = arrayList.size();
                if (size5 > 0) {
                    for (int i19 = i2; i19 < size5; i19++) {
                        gb2 gb2Var6 = (gb2) arrayList.get(i19);
                        if (gb2Var6.getCurrentPosition() != null || gb2Var6.getTransitionParams().x0) {
                            at1Var.Y(canvas3, f49, gb2Var6, 2);
                        }
                    }
                    arrayList.clear();
                }
                int size6 = arrayList4.size();
                if (size6 > 0) {
                    for (int i20 = i2; i20 < size6; i20++) {
                        gb2 gb2Var7 = (gb2) arrayList4.get(i20);
                        if (gb2Var7.getCurrentPosition() != null || gb2Var7.getTransitionParams().x0) {
                            at1Var.Y(canvas3, f49, gb2Var7, 3);
                        }
                    }
                }
                if (mu1Var.c9 != null && f27Var3 != null) {
                    if (mu1Var.T8 != null) {
                        mu1Var.U8.reset();
                        float measuredWidth5 = at1Var.getMeasuredWidth() / mu1Var.R8.getWidth();
                        mu1Var.U8.postScale(measuredWidth5, measuredWidth5);
                        mu1Var.S8.setLocalMatrix(mu1Var.U8);
                        mu1Var.T8.setAlpha((int) (mu1Var.b9 * 255.0f));
                        canvas.drawRect(0.0f, 0.0f, at1Var.getMeasuredWidth(), at1Var.getMeasuredHeight(), mu1Var.T8);
                        canvas3 = canvas;
                    } else {
                        mu1Var.V8.setAlpha((int) (mu1Var.X8 * 255.0f * mu1Var.a9));
                        canvas.drawRect(0.0f, 0.0f, at1Var.getMeasuredWidth(), at1Var.getMeasuredHeight(), mu1Var.V8);
                        canvas3 = canvas;
                    }
                }
                int size7 = arrayList4.size();
                if (size7 > 0) {
                    for (int i21 = i2; i21 < size7; i21++) {
                        gb2 gb2Var8 = (gb2) arrayList4.get(i21);
                        if (gb2Var8.getCurrentPosition() != null || gb2Var8.getTransitionParams().x0) {
                            at1Var.Y(canvas3, f49, gb2Var8, 4);
                        }
                    }
                    arrayList4.clear();
                }
            }
            if (mu1Var.c9 == null) {
                float f50 = mu1Var.a9;
                if (f50 < f5) {
                    if (mu1Var.T8 != null) {
                        mu1Var.U8.reset();
                        float measuredWidth6 = at1Var.getMeasuredWidth() / mu1Var.R8.getWidth();
                        mu1Var.U8.postScale(measuredWidth6, measuredWidth6);
                        mu1Var.S8.setLocalMatrix(mu1Var.U8);
                        mu1Var.T8.setAlpha((int) (mu1Var.b9 * 255.0f));
                        canvas.drawRect(0.0f, 0.0f, at1Var.getMeasuredWidth(), at1Var.getMeasuredHeight(), mu1Var.T8);
                        canvas3 = canvas;
                    } else {
                        mu1Var.V8.setAlpha((int) ((f5 - f50) * mu1Var.X8 * 255.0f));
                        canvas.drawRect(0.0f, 0.0f, at1Var.getMeasuredWidth(), at1Var.getMeasuredHeight(), mu1Var.V8);
                        canvas3 = canvas;
                    }
                }
            }
        } else {
            canvas3 = canvas;
            at1Var = at1Var3;
            f3 = 0.0f;
            i2 = 0;
            i3 = 1;
        }
        if (mu1Var.Z8 != null || ((ArrayList) mu1Var.ja.c).size() > 0) {
            sq1 sq1Var4 = mu1Var.X1;
            if (sq1Var4 == null || sq1Var4.getVisibility() != 0) {
                super.drawChild(canvas3, mu1Var.y1, SystemClock.uptimeMillis());
            }
            rq1 rq1Var = mu1Var.m3;
            if (rq1Var != null && rq1Var.getTag() != null) {
                super.drawChild(canvas3, mu1Var.m3, SystemClock.uptimeMillis());
            }
            qq1 qq1Var = mu1Var.n3;
            if (qq1Var != null && qq1Var.getTag() != null) {
                super.drawChild(canvas3, mu1Var.n3, SystemClock.uptimeMillis());
            }
            qh4 qh4Var = mu1Var.J9;
            if (qh4Var != null) {
                super.drawChild(canvas3, qh4Var, SystemClock.uptimeMillis());
            }
            wx8 wx8Var = mu1Var.ua;
            if (wx8Var != null) {
                super.drawChild(canvas3, wx8Var, SystemClock.uptimeMillis());
            }
            je5 je5Var3 = mu1Var.t2;
            if (je5Var3 != null) {
                super.drawChild(canvas3, je5Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = mu1Var.N3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, mu1Var.N3, SystemClock.uptimeMillis());
            }
            xr1 xr1Var = mu1Var.O3;
            if (xr1Var != null && xr1Var.getVisibility() == 0) {
                super.drawChild(canvas3, mu1Var.O3, SystemClock.uptimeMillis());
            }
            je5 je5Var4 = mu1Var.M1;
            if (je5Var4 != null && je5Var4.getVisibility() == 0) {
                super.drawChild(canvas3, mu1Var.M1, SystemClock.uptimeMillis());
            }
            ks1 ks1Var = mu1Var.Q1;
            if (ks1Var != null && ks1Var.getVisibility() == 0) {
                super.drawChild(canvas3, mu1Var.Q1, SystemClock.uptimeMillis());
            }
            je5 je5Var5 = mu1Var.O1;
            if (je5Var5 != null && je5Var5.getVisibility() == 0) {
                super.drawChild(canvas3, mu1Var.O1, SystemClock.uptimeMillis());
            }
            ar1 ar1Var2 = mu1Var.a0;
            if (ar1Var2 != null && ar1Var2.M != null) {
                canvas3.save();
                canvas3.translate(mu1Var.a0.M.getX() + mu1Var.a0.getX(), mu1Var.a0.M.getY() + mu1Var.a0.getY());
                mu1Var.a0.M.draw(canvas3);
                canvas3.restore();
            }
        }
        if (mu1Var.Ma > 0 && at1Var.f < gl.L(20.0f)) {
            int themedColor = mu1Var.getThemedColor(bkb.c6);
            Paint paint = at1Var.t0;
            if (paint == null) {
                paint = new Paint();
                at1Var.t0 = paint;
            }
            if (at1Var.u0 != themedColor) {
                at1Var.u0 = themedColor;
                paint.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, at1Var.getMeasuredHeight() - mu1Var.Ma, at1Var.getMeasuredWidth(), at1Var.getMeasuredHeight(), at1Var.t0);
            canvas3 = canvas6;
        }
        kc2 kc2Var = mu1Var.ma;
        if (kc2Var != null) {
            if (((kc2Var.T <= f3 || kc2Var.S) ? i2 : i3) != 0) {
                int inputBubbleTop = (int) mu1Var.U.getInputBubbleTop();
                int inputBubbleBottom = (int) mu1Var.U.getInputBubbleBottom();
                mu1 mu1Var2 = mu1Var.qa;
                int i22 = inputBubbleTop - ((int) ((mu1Var2 == null ? f3 : mu1Var2.la) * mu1Var.ra));
                kc2 kc2Var2 = mu1Var.ma;
                at1Var.getMeasuredWidth();
                kc2Var2.b(canvas3, i22, inputBubbleBottom);
            }
        }
        if (mu1Var.qa != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, at1Var.getMeasuredWidth(), at1Var.getMeasuredHeight(), (int) (mu1Var.ra * 255.0f), 31);
            canvas3 = canvas;
            mu1Var.qa.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        mu1Var.Ua.e(canvas3);
        if (i8 >= 0) {
            canvas3.restore();
        }
        if (mu1Var.Ha) {
            canvas3.save();
            aVar = ((d) mu1Var).actionBar;
            float x = aVar.getX();
            aVar2 = ((d) mu1Var).actionBar;
            canvas3.translate(x, aVar2.getY());
            aVar3 = ((d) mu1Var).actionBar;
            float width = aVar3.getWidth();
            aVar4 = ((d) mu1Var).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, aVar4.getHeight(), (int) (mu1Var.Ia * 255.0f), 31);
            aVar5 = ((d) mu1Var).actionBar;
            aVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        wr1 wr1Var;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (wr1Var = this.D0.cb) == null || !wr1Var.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        wr1Var.a(true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r4 == r6.getBackButton()) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0245  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y;
        boolean z;
        jr1 jr1Var;
        ui5 ui5Var;
        ui5 ui5Var2;
        boolean z2;
        boolean z3;
        a aVar;
        mu1 mu1Var = this.D0;
        az1 az1Var = mu1Var.c4;
        if (az1Var != null) {
            az1Var.n = SystemClock.uptimeMillis();
        }
        if (gl.E || mu1Var.isInBubbleMode()) {
            t14 emojiView = mu1Var.a0.getEmojiView();
            ar1 ar1Var = mu1Var.a0;
            y = emojiView != null ? ar1Var.getEmojiView().getY() : ar1Var.getY();
        } else {
            y = mu1Var.a0.getY();
        }
        View view = mu1Var.Z8;
        if (view != null) {
            aVar = ((d) mu1Var).actionBar;
        }
        ar1 ar1Var2 = mu1Var.a0;
        if (ar1Var2 == null || !ar1Var2.p4 || motionEvent.getY() >= y) {
            mu1Var.G9 = motionEvent.getY();
            qib m = mu1Var.u9.m(getContext());
            motionEvent.offsetLocation(-m.getX(), -m.getY());
            if (!mu1Var.u9.w() || !mu1Var.u9.m(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(m.getX(), m.getY());
                if (m.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                vq1 vq1Var = mu1Var.F1;
                if (vq1Var != null) {
                    if (mu1Var.J3 != null) {
                        z = vq1Var.B(motionEvent);
                        if (mu1Var.F1.I) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !mu1Var.u9.w() || (motionEvent.getY() >= mu1Var.A0.getTop() && motionEvent.getY() <= mu1Var.A0.getBottom())) {
                            jr1Var = mu1Var.Ta;
                            if (!jr1Var.n) {
                                return jr1Var.g(motionEvent);
                            }
                            xf4 xf4Var = xf4.f;
                            if (xf4Var == null || !xf4Var.a) {
                                if (mu1Var.isInPreviewMode() && mu1Var.ga) {
                                    if (motionEvent.getAction() == 0) {
                                        int i = 2;
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (mu1Var.y1 != null) {
                                            int i2 = 0;
                                            for (int i3 = 3; i2 < i3; i3 = 3) {
                                                mv6 mv6Var = mu1Var.y1.e[i2 == 0 ? 1 : i2 == 1 ? i : i3];
                                                if (mv6Var != null) {
                                                    ((pu1) mv6Var.b).getLocationInWindow(iArr2);
                                                    Rect rect = gl.Q;
                                                    int i4 = iArr2[0] - iArr[0];
                                                    rect.set(i4, iArr2[1] - iArr[1], gl.L(56.0f) + i4, gl.L(61.0f) + (iArr2[1] - iArr[1]));
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
                                        cq1 cq1Var = mu1Var.p1;
                                        if (cq1Var != null) {
                                            cq1Var.getLocationInWindow(iArr2);
                                            Rect rect2 = gl.Q;
                                            int i5 = iArr2[0] - iArr[0];
                                            rect2.set(i5, iArr2[1] - iArr[1], mu1Var.p1.getMeasuredWidth() + i5, mu1Var.p1.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z3 = true;
                                                if (z2) {
                                                    this.y0 = motionEvent.getX();
                                                    this.z0 = motionEvent.getY();
                                                    this.A0 = SystemClock.elapsedRealtime();
                                                    this.B0 = z3;
                                                    cq1 cq1Var2 = mu1Var.p1;
                                                    if (cq1Var2 != null) {
                                                        cq1Var2.i0.c(z3);
                                                    }
                                                    z = true;
                                                } else {
                                                    this.A0 = -1L;
                                                }
                                            }
                                        }
                                        z3 = false;
                                        if (z2) {
                                        }
                                    } else if (motionEvent.getAction() == 1) {
                                        cq1 cq1Var3 = mu1Var.p1;
                                        if (cq1Var3 != null) {
                                            cq1Var3.i0.c(false);
                                        }
                                        if (this.B0 || (loe.a(this.y0, this.z0, motionEvent.getX(), motionEvent.getY()) < gl.L(6.0f) && SystemClock.elapsedRealtime() - this.A0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.B0) {
                                                ui5Var2 = ((d) mu1Var).parentLayout;
                                                mu1Var.removeSelfFromStack(false);
                                                ((ActionBarLayout) ui5Var2).S(ProfileActivity.P2(mu1Var.l6));
                                            } else {
                                                ui5Var = ((d) mu1Var).parentLayout;
                                                ((ActionBarLayout) ui5Var).p();
                                            }
                                            motionEvent.setAction(3);
                                        }
                                        this.A0 = -1L;
                                    } else if (motionEvent.getAction() == 3) {
                                        this.A0 = -1L;
                                    }
                                }
                                if (super.dispatchTouchEvent(motionEvent) || z) {
                                }
                            } else {
                                rb0 rb0Var = (rb0) xf4.t().d;
                                if (rb0Var != null) {
                                    rb0Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-m.getX(), -m.getY());
                            if (mu1Var.u9.m(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(m.getX(), m.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = vq1Var.e;
                        if (vq1Var.I) {
                            vq1Var.J = true;
                            vq1Var.I = false;
                            vq1Var.F(viewArr[0], 0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                vq1Var.F(view2, vq1Var.E ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            vq1Var.d = 0;
                            vq1Var.c = 1.0f;
                            mec mecVar = vq1Var.N;
                            if (mecVar != null) {
                                mecVar.f(1.0f, 0, vq1Var.b);
                            }
                            vq1Var.x(false);
                        }
                    }
                }
                z = false;
                if (motionEvent.getAction() == 0) {
                }
                jr1Var = mu1Var.Ta;
                if (!jr1Var.n) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        mu1 mu1Var = this.D0;
        lwb lwbVar = mu1Var.n0;
        float progress = (view == lwbVar || view == this.M || view == mu1Var.Z || (view instanceof zha) || lwbVar == null) ? 0.0f : lwbVar.getProgress() * mu1Var.n0.getContentWidth();
        if (progress <= 0.0f) {
            return Z(canvas, view, j);
        }
        canvas.save();
        canvas.translate(-progress, 0.0f);
        boolean Z = Z(canvas, view, j);
        canvas.restore();
        return Z;
    }

    @Override // cja
    public float getBottomOffset() {
        return this.D0.A0.getBottom();
    }

    public mu1 getChatActivity() {
        return this.D0;
    }

    public Drawable getCompactBackground() {
        int themedColor = this.D0.getThemedColor(bkb.ta);
        ColorDrawable colorDrawable = this.C0;
        if (colorDrawable == null || colorDrawable.getColor() != themedColor) {
            this.C0 = new ColorDrawable(themedColor);
        }
        return this.C0;
    }

    @Override // cja
    public int getKeyboardHeight() {
        if (this.D0.mb) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // cja
    public float getListTranslationY() {
        return this.D0.A0.getTranslationY();
    }

    @Override // cja
    public Drawable getNewDrawable() {
        mu1 mu1Var = this.D0;
        if (mu1Var.M7()) {
            return getCompactBackground();
        }
        Drawable l = mu1Var.Ba.l();
        return l != null ? l : super.getNewDrawable();
    }

    @Override // cja
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.D0.Ba.g;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // cja
    public int getScrollOffset() {
        return this.D0.A0.computeVerticalScrollOffset();
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ui5 ui5Var;
        ui5 ui5Var2;
        ui5 ui5Var3;
        jq1 jq1Var;
        super.onAttachedToWindow();
        mu1 mu1Var = this.D0;
        if (mu1Var.mb) {
            this.I.b = mu1Var.m1;
        } else {
            ui5Var = ((d) mu1Var).parentLayout;
            if (ui5Var != null) {
                ui5Var2 = ((d) mu1Var).parentLayout;
                if (((ActionBarLayout) ui5Var2).b) {
                    gb gbVar = this.I;
                    ui5Var3 = ((d) mu1Var).parentLayout;
                    gbVar.b = (FrameLayout) ui5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.I.c();
        mu1Var.a0.setAdjustPanLayoutHelper(this.I);
        k27 k27Var = MediaController.w().v0;
        if (k27Var != null && ((k27Var.g4() || k27.K4(k27Var.k)) && k27Var.T == 0 && k27.B0(k27Var.k) == mu1Var.l6)) {
            MediaController.w().o0(mu1Var.X5(false), mu1Var.L8, mu1Var.J8, true);
        }
        kc2 kc2Var = mu1Var.ma;
        if (kc2Var != null) {
            kc2Var.G.I();
            vl vlVar = kc2Var.l0;
            if (vlVar != null && (jq1Var = kc2Var.b0) != null) {
                vlVar.b(jq1Var);
            }
            kk7.f(kc2Var.f0).b(kc2Var, 2);
        }
        mu1Var.Ua.i();
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        jq1 jq1Var;
        super.onDetachedFromWindow();
        this.I.d();
        mu1 mu1Var = this.D0;
        kc2 kc2Var = mu1Var.ma;
        if (kc2Var != null) {
            kk7.f(kc2Var.f0).n(kc2Var, 2);
            kc2Var.G.K();
            vl vlVar = kc2Var.l0;
            if (vlVar != null && (jq1Var = kc2Var.b0) != null) {
                vlVar.o(jq1Var);
            }
            kc2Var.R = 0.0f;
            kc2Var.Q = 0L;
            mu1Var.ma = null;
        }
        mu1Var.Ua.j();
        gl.c3(new jc((byte) 17));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        mu1 mu1Var;
        s71 s71Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) != null || (s71Var = (mu1Var = this.D0).N2) == null || !s71Var.a() || mu1Var.N2.getTag() == null) {
                super.onDraw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bc, code lost:
    
        if (r8 != r3.ld) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    @Override // cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        mu1 mu1Var = this.D0;
        dq1 dq1Var = mu1Var.w;
        int i12 = (measuredWidth - mu1Var.rb) - mu1Var.sb;
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
                int i15 = i14 & kk7.w1;
                int i16 = i14 & 7;
                if (i16 == 1) {
                    g = ug8.g(i12, measuredWidth2, 2, mu1Var.rb) + layoutParams.leftMargin;
                    i5 = layoutParams.rightMargin;
                } else if (i16 != 5) {
                    i6 = mu1Var.rb + layoutParams.leftMargin;
                    if (i15 == 16) {
                        if (i15 == 48) {
                            i9 = layoutParams.topMargin + getPaddingTop();
                            aVar5 = ((d) mu1Var).actionBar;
                            if (childAt != aVar5) {
                                aVar6 = ((d) mu1Var).actionBar;
                                if (aVar6.getVisibility() == 0) {
                                    aVar7 = ((d) mu1Var).actionBar;
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
                            if (childAt != mu1Var.ja && childAt != mu1Var.ua && childAt != mu1Var.U && !(childAt instanceof ke5) && childAt != mu1Var.n0) {
                                if (childAt instanceof qib) {
                                    i10 = mu1Var.Xa;
                                } else if (childAt == mu1Var.f1) {
                                    aVar3 = ((d) mu1Var).actionBar;
                                    if (aVar3.getVisibility() == 0) {
                                        aVar4 = ((d) mu1Var).actionBar;
                                        i11 = aVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i11 = 0;
                                    }
                                    i9 += i11;
                                } else if (mu1Var.a0.R0(childAt)) {
                                    if (!gl.E) {
                                        z2 = ((d) mu1Var).inBubbleMode;
                                        if (!z2) {
                                            i9 = mu1Var.a0.getBottom();
                                        }
                                    }
                                    i9 = mu1Var.a0.getTop() - childAt.getMeasuredHeight();
                                    L = gl.L(1.0f);
                                    i9 += L;
                                } else {
                                    ar1 ar1Var = mu1Var.a0;
                                    if (ar1Var != null && (childAt == ar1Var.E2 || childAt == ar1Var.D2)) {
                                        i9 = ug8.B(7.0f, dq1Var.e(), i9);
                                        i6 -= gl.L(3.0f);
                                    } else if (childAt == mu1Var.L2) {
                                        i9 = ug8.B(7.0f, dq1Var.e(), i9);
                                    } else if (ar1Var != null && childAt == ar1Var.f1) {
                                        i9 = ug8.B(9.0f, dq1Var.e(), i9);
                                    } else if (childAt == mu1Var.A0 || childAt == mu1Var.y0 || childAt == mu1Var.m3 || childAt == mu1Var.n3 || childAt == mu1Var.o3) {
                                        i10 = mu1Var.Xa;
                                    } else if (childAt != mu1Var.R) {
                                        aVar = ((d) mu1Var).actionBar;
                                        if (childAt == aVar) {
                                            i9 -= getPaddingTop();
                                            if (mu1Var.isInPreviewMode()) {
                                                L = gl.L(1.0f);
                                                i9 += L;
                                            }
                                        } else if (childAt == mu1Var.J8) {
                                            aVar2 = ((d) mu1Var).actionBar;
                                            i9 = aVar2.getMeasuredHeight();
                                        } else if (childAt != mu1Var.q3 && childAt != mu1Var.r3 && childAt != mu1Var.x0) {
                                            if (childAt instanceof l37) {
                                                i9 = gl.m;
                                            } else if (childAt != mu1Var.V) {
                                                if (childAt != mu1Var.c4) {
                                                }
                                            }
                                        }
                                    } else if (ar1Var.W0()) {
                                        i9 -= gl.L(48.0f);
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
                    g = (measuredWidth - mu1Var.sb) - measuredWidth2;
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
        qq1 qq1Var = mu1Var.n3;
        if (qq1Var != null) {
            qq1Var.setBackgroundHeight(getMeasuredHeight());
        }
        mu1Var.G7();
        mu1Var.I7();
        mu1Var.jd(false, false);
        R();
        mu1Var.z5();
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
        m21 m21Var;
        a aVar4;
        a aVar5;
        int i6;
        a aVar6;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        cq1 cq1Var;
        r7 r7Var;
        a aVar7;
        r7 r7Var2;
        q6 q6Var;
        a aVar8;
        r7 r7Var3;
        TLRPC.User user;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        mu1 mu1Var = this.D0;
        dq1 dq1Var = mu1Var.w;
        int i7 = (size - mu1Var.rb) - mu1Var.sb;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30);
        gx4 gx4Var = mu1Var.N.a;
        if (gx4Var instanceof hx4) {
            ((hx4) gx4Var).b(i7, size2);
        }
        int i8 = 0;
        if (this.o0 != i7) {
            mu1Var.T4 = false;
            this.o0 = makeMeasureSpec;
            z4 = ((d) mu1Var).inPreviewMode;
            if (z4 || (user = mu1Var.f) == null || !user.self) {
                mu1Var.ha = false;
            } else {
                jia titleTextView = mu1Var.p1.getTitleTextView();
                if (i7 - gl.L(152.0f) > gl.L(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    z5 = !mu1Var.ia;
                    mu1Var.ha = z5;
                    if (!z5 || mu1Var.ia || l7c.x(mu1Var.f)) {
                        cq1Var = mu1Var.p1;
                        if (cq1Var != null && cq1Var.getLayoutParams() != null) {
                            ((ViewGroup.MarginLayoutParams) mu1Var.p1.getLayoutParams()).rightMargin = gl.L(mu1Var.g4 != 3 && ((r7Var = mu1Var.m0) == null || r7Var.getVisibility() != 0) ? 52.0f : 92.0f);
                        }
                    } else {
                        cq1 cq1Var2 = mu1Var.p1;
                        if (cq1Var2 != null && cq1Var2.getLayoutParams() != null) {
                            ((ViewGroup.MarginLayoutParams) mu1Var.p1.getLayoutParams()).rightMargin = gl.L(52.0f);
                        }
                    }
                    if (mu1Var.ha) {
                        r7 r7Var4 = mu1Var.j0;
                        if (r7Var4 != null) {
                            r7Var4.S(40);
                        }
                        r7 r7Var5 = mu1Var.p0;
                        if (r7Var5 != null) {
                            r7Var5.setVisibility(8);
                        }
                    } else {
                        aVar8 = ((d) mu1Var).actionBar;
                        if (!aVar8.o0 && (r7Var3 = mu1Var.p0) != null) {
                            r7Var3.setVisibility(0);
                        }
                        r7 r7Var6 = mu1Var.j0;
                        if (r7Var6 != null) {
                            r7Var6.u(40);
                        }
                    }
                    aVar7 = ((d) mu1Var).actionBar;
                    if (!aVar7.o0 && (q6Var = mu1Var.q0) != null) {
                        q6Var.e((mu1Var.ia || mu1Var.ha) ? 8 : 0);
                    }
                    r7Var2 = mu1Var.j0;
                    if (r7Var2 != null) {
                        TLRPC.UserFull userFull = mu1Var.s8;
                        if (mu1Var.ia) {
                            r7Var2.u(32);
                        } else if (userFull != null && userFull.phone_calls_available) {
                            r7Var2.S(32);
                        }
                    }
                    mu1Var.T4 = false;
                } else {
                    mu1Var.ha = false;
                }
            }
            z5 = false;
            if (z5) {
            }
            cq1Var = mu1Var.p1;
            if (cq1Var != null) {
                ((ViewGroup.MarginLayoutParams) mu1Var.p1.getLayoutParams()).rightMargin = gl.L(mu1Var.g4 != 3 && ((r7Var = mu1Var.m0) == null || r7Var.getVisibility() != 0) ? 52.0f : 92.0f);
            }
            if (mu1Var.ha) {
            }
            aVar7 = ((d) mu1Var).actionBar;
            if (!aVar7.o0) {
                q6Var.e((mu1Var.ia || mu1Var.ha) ? 8 : 0);
            }
            r7Var2 = mu1Var.j0;
            if (r7Var2 != null) {
            }
            mu1Var.T4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        aVar = ((d) mu1Var).actionBar;
        measureChildWithMargins(aVar, makeMeasureSpec, 0, i2, 0);
        aVar2 = ((d) mu1Var).actionBar;
        int measuredHeight = aVar2.getMeasuredHeight();
        aVar3 = ((d) mu1Var).actionBar;
        if (aVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z6 = this.f + mu1Var.La >= gl.L(20.0f);
        if (this.n0 != size2) {
            Q();
        }
        int keyboardHeight = getKeyboardHeight();
        if (mu1Var.Ma > 0 && keyboardHeight <= gl.L(20.0f)) {
            i3 = mu1Var.Ma;
            mu1Var.La = i3;
        } else if (keyboardHeight <= gl.L(20.0f)) {
            i3 = mu1Var.a0.Q0() ? mu1Var.a0.getEmojiPadding() : 0;
            mu1Var.La = i3;
        } else {
            mu1Var.La = 0;
            i3 = 0;
        }
        setEmojiKeyboardHeight(i3);
        boolean z7 = this.f + mu1Var.La >= gl.L(20.0f);
        if (MediaController.w().v0 != null && MediaController.w().v0.g4() && z6 != z7) {
            for (int i9 = 0; i9 < mu1Var.A0.getChildCount(); i9++) {
                View childAt = mu1Var.A0.getChildAt(i9);
                if (childAt instanceof gb2) {
                    k27 messageObject = ((gb2) childAt).getMessageObject();
                    if (messageObject.g4() && MediaController.w().D(messageObject)) {
                        mu1Var.A0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            mu1Var.C0.h1(R, (int) (((((mu1Var.A0.getMeasuredHeight() - mu1Var.P9) - mu1Var.Ya) + ((this.f + mu1Var.La) - r1)) - (z7 ? gl.u : gl.b3(mu1Var.W7(), mu1Var.M7()))) / 2.0f), false);
                            mu1Var.D0.g(R);
                            this.I.g = true;
                            childCount = getChildCount();
                            int i10 = paddingTop;
                            measureChildWithMargins(mu1Var.a0, makeMeasureSpec, 0, i2, 0);
                            z = ((d) mu1Var).inPreviewMode;
                            if (!z || mu1Var.mb) {
                                this.m0 = 0;
                            } else {
                                this.m0 = mu1Var.a0.getMeasuredHeight();
                            }
                            mu1Var.Xa = 0;
                            mu1Var.Ya = 0;
                            if (gba.f() && !mu1Var.mb && mu1Var.H != null && Build.VERSION.SDK_INT >= 31) {
                                int i11 = mu1Var.I;
                                mu1Var.Xa = i11;
                                mu1Var.Ya = i11;
                            }
                            i4 = 0;
                            while (true) {
                                int i12 = -1;
                                if (i4 < childCount) {
                                    break;
                                }
                                View childAt2 = getChildAt(i4);
                                if (childAt2 != null && childAt2.getVisibility() != 8 && childAt2 != mu1Var.a0) {
                                    aVar4 = ((d) mu1Var).actionBar;
                                    if (childAt2 != aVar4) {
                                        if (a0(childAt2)) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                        } else if (childAt2 == mu1Var.A0 || childAt2 == mu1Var.y0 || (childAt2 instanceof qib)) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(gl.L(10.0f), mu1Var.Xa + size2 + mu1Var.Ya), TLObject.FLAG_30));
                                        } else if (childAt2 == mu1Var.R) {
                                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30);
                                            int L = gl.L(10.0f);
                                            int i13 = i10 - this.m0;
                                            z3 = ((d) mu1Var).inPreviewMode;
                                            childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(L, gl.L((mu1Var.a0.W0() ? 48 : i8) + 2) + (i13 - (z3 ? gl.m : i8))), TLObject.FLAG_30));
                                        } else if (childAt2 == mu1Var.q3) {
                                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30);
                                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                            mu1Var.q3.setInternalPadding(gl.L(12.0f) + dq1Var.e() + ((int) mu1Var.cd));
                                            childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                        } else if (childAt2 == mu1Var.r3) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - dq1Var.e()) - ((int) mu1Var.cd)) - gl.L(12.0f), TLObject.FLAG_30));
                                        } else if (childAt2 == mu1Var.f1) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                                        } else if (mu1Var.a0.R0(childAt2)) {
                                            tx1 tx1Var = mu1Var.a0.x2;
                                            if (childAt2 == tx1Var && tx1Var != null) {
                                                i12 = tx1Var.getKeyboardHeight();
                                            }
                                            z2 = ((d) mu1Var).inBubbleMode;
                                            if (z2) {
                                                int paddingTop2 = getPaddingTop() + (i10 - this.m0) + measuredHeight;
                                                if (i12 < 0) {
                                                    i12 = Math.max(Math.min(paddingTop2, gl.L(350.0f)), paddingTop2 / 2);
                                                }
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
                                            } else if (gl.E) {
                                                int paddingTop3 = getPaddingTop() + (((i10 - this.m0) + measuredHeight) - gl.m);
                                                if (i12 < 0) {
                                                    i12 = Math.max(Math.min(paddingTop3, gl.L(350.0f)), paddingTop3 / 2);
                                                }
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
                                            } else {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, TLObject.FLAG_30));
                                            }
                                        } else {
                                            sq1 sq1Var = mu1Var.X1;
                                            if (childAt2 == sq1Var) {
                                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sq1Var.getLayoutParams();
                                                kz6 adapter = mu1Var.X1.getAdapter();
                                                if (adapter.x0 == null || adapter.i0) {
                                                    mu1Var.X1.setIgnoreLayout(true);
                                                    layoutParams.height = i10;
                                                    layoutParams.topMargin = 0;
                                                    mu1Var.X1.setIgnoreLayout(false);
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                } else {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
                                                }
                                            } else if (childAt2 == mu1Var.u9.m(getContext())) {
                                                int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30);
                                                int i14 = i10 + mu1Var.Xa;
                                                if (keyboardHeight <= gl.L(20.0f) || getLayoutParams().height >= 0 || mu1Var.mb) {
                                                    bt1 bt1Var = mu1Var.u9;
                                                    bt1Var.d0 = 0;
                                                    bt1Var.v();
                                                } else {
                                                    i14 += keyboardHeight;
                                                    bt1 bt1Var2 = mu1Var.u9;
                                                    bt1Var2.d0 = keyboardHeight;
                                                    bt1Var2.v();
                                                }
                                                childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
                                            } else if (childAt2 instanceof l37) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - gl.m) - gl.n, TLObject.FLAG_30));
                                            } else if (childAt2 == mu1Var.g2) {
                                                aVar5 = ((d) mu1Var).actionBar;
                                                if (aVar5.getVisibility() == 0) {
                                                    aVar6 = ((d) mu1Var).actionBar;
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
                            if (mu1Var.S4) {
                                mu1Var.T4 = true;
                                mu1Var.G7();
                                mu1Var.I7();
                                mu1Var.S4 = false;
                                jq1 jq1Var = mu1Var.A0;
                                jq1Var.measure(View.MeasureSpec.makeMeasureSpec(jq1Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(mu1Var.A0.getMeasuredHeight(), TLObject.FLAG_30));
                                mu1Var.T4 = false;
                            }
                            i5 = mu1Var.N4;
                            if (i5 != -1) {
                                gl.c3(new eg((Object) this, i5, (byte) 20));
                                mu1Var.N4 = -1;
                            }
                            m21Var = m21.w;
                            if (m21Var != null && mu1Var.Fc != null) {
                                m21Var.l();
                            }
                            mu1Var.Y4();
                            this.n0 = size2;
                        }
                    }
                }
            }
        }
        qw1 qw1Var = mu1Var.a0.N4;
        gl.r(qw1Var);
        qw1Var.run();
        childCount = getChildCount();
        int i102 = paddingTop;
        measureChildWithMargins(mu1Var.a0, makeMeasureSpec, 0, i2, 0);
        z = ((d) mu1Var).inPreviewMode;
        if (z) {
        }
        this.m0 = 0;
        mu1Var.Xa = 0;
        mu1Var.Ya = 0;
        if (gba.f()) {
            int i112 = mu1Var.I;
            mu1Var.Xa = i112;
            mu1Var.Ya = i112;
        }
        i4 = 0;
        while (true) {
            int i122 = -1;
            if (i4 < childCount) {
            }
            i4++;
            i8 = 0;
        }
        if (mu1Var.S4) {
        }
        i5 = mu1Var.N4;
        if (i5 != -1) {
        }
        m21Var = m21.w;
        if (m21Var != null) {
            m21Var.l();
        }
        mu1Var.Y4();
        this.n0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mu1 mu1Var = this.D0;
        tk0.c(mu1Var.P8, mu1Var.fragmentView);
        mu1Var.Q8.d();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.D0.T4) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        mu1 mu1Var = this.D0;
        mu1Var.S9 = i2;
        mu1Var.G7();
        mu1Var.I7();
    }

    @Override // cja
    public final void K() {
    }

    @Override // cja
    public final void V() {
    }

    @Override // cja
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
    }
}
