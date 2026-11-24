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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mu1 extends ela {
    public long A0;
    public boolean B0;
    public ColorDrawable C0;
    public final /* synthetic */ yv1 D0;
    public int m0;
    public int n0;
    public int o0;
    public final ArrayList p0;
    public final ArrayList q0;
    public final ArrayList r0;
    public final ArrayList s0;
    public Paint t0;
    public int u0;
    public final ku1 v0;
    public final ku1 w0;
    public final RectF x0;
    public float y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v2, types: [ku1] */
    /* JADX WARN: Type inference failed for: r2v5, types: [ku1] */
    public mu1(yv1 yv1Var, Context context, tk5 tk5Var) {
        super(context, tk5Var);
        this.D0 = yv1Var;
        final byte b = 0;
        this.m0 = 0;
        this.p0 = new ArrayList();
        this.q0 = new ArrayList();
        this.r0 = new ArrayList();
        this.s0 = new ArrayList();
        this.v0 = new vi5(this) { // from class: ku1
            public final /* synthetic */ mu1 b;

            {
                this.b = this;
            }

            @Override // vi5
            public final void a(ucb ucbVar, RectF rectF) {
                byte b2 = b;
                ucbVar.b = true;
            }

            @Override // vi5
            public final void g(Canvas canvas, RectF rectF) {
                switch (b) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        yv1 yv1Var2 = this.b.D0;
                        if (yv1Var2.A0.Z0() && yv1Var2.A0.getOverScrollMode() != 2) {
                            yv1Var2.A0.g(canvas, rectF);
                            break;
                        } else {
                            yv1Var2.A0.z1(canvas, rectF);
                            int i = 0;
                            while (true) {
                                int childCount = yv1Var2.A0.getChildCount();
                                vr1 vr1Var = yv1Var2.A0;
                                if (i >= childCount) {
                                    vr1Var.A1(canvas, rectF);
                                    break;
                                } else {
                                    View childAt = vr1Var.getChildAt(i);
                                    if (!yv1Var2.Xa(childAt, rectF)) {
                                        if (childAt instanceof rc2) {
                                            canvas.save();
                                            canvas.translate(childAt.getX(), childAt.getY());
                                            rc2 rc2Var = (rc2) childAt;
                                            if (rc2Var.L0()) {
                                                canvas.save();
                                                canvas.translate(0.0f, rc2Var.W);
                                                rc2Var.M0(canvas, true, false);
                                                canvas.restore();
                                            }
                                            canvas.restore();
                                            yv1Var2.A0.drawChild(canvas, childAt, uptimeMillis);
                                            if (rc2Var.l2()) {
                                                canvas.save();
                                                canvas.translate(rc2Var.getX(), rc2Var.getY());
                                                rc2Var.i1(canvas);
                                                canvas.restore();
                                            }
                                        } else {
                                            boolean z = childAt instanceof cm1;
                                            vr1 vr1Var2 = yv1Var2.A0;
                                            if (z) {
                                                vr1Var2.drawChild(canvas, childAt, uptimeMillis);
                                                canvas.save();
                                                canvas.translate(childAt.getX(), childAt.getY());
                                                ((cm1) childAt).H(canvas);
                                                canvas.restore();
                                            } else {
                                                vr1Var2.drawChild(canvas, childAt, uptimeMillis);
                                            }
                                        }
                                    }
                                    i++;
                                }
                            }
                        }
                        break;
                    default:
                        mu1 mu1Var = this.b;
                        yv1 yv1Var3 = mu1Var.D0;
                        RectF rectF2 = mu1Var.x0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, mu1Var.getWidth(), mu1Var.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f = yv1Var3.rd.e;
                            int i2 = (int) ((1.0f - f) * 255.0f);
                            int i3 = (int) (255.0f * f);
                            if (f > 0.0f) {
                                canvas.drawRect(rectF2, cmb.l0(cmb.p1(f * 0.85f, yv1Var3.getThemedColor(cmb.c6))));
                            }
                            tl0.b(mu1Var.v0, canvas, rectF, yv1Var3.A0, mu1Var, i2);
                            fv fvVar = yv1Var3.a4;
                            if (fvVar != null) {
                                tl0.b(fvVar, canvas, rectF, fvVar, mu1Var, i3);
                            }
                            hs1 hs1Var = yv1Var3.F1;
                            if (hs1Var != null && hs1Var.getVisibility() == 0) {
                                int childCount2 = yv1Var3.F1.getChildCount();
                                for (int i4 = 0; i4 < childCount2; i4++) {
                                    View childAt2 = yv1Var3.F1.getChildAt(i4);
                                    if ((childAt2 instanceof gw1) && childAt2.getVisibility() == 0) {
                                        mu1 mu1Var2 = ((gw1) childAt2).a.m1;
                                        tl0.a(mu1Var2.w0, canvas, rectF, mu1Var2, mu1Var);
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
        this.w0 = new vi5(this) { // from class: ku1
            public final /* synthetic */ mu1 b;

            {
                this.b = this;
            }

            @Override // vi5
            public final void a(ucb ucbVar, RectF rectF) {
                byte b22 = b2;
                ucbVar.b = true;
            }

            @Override // vi5
            public final void g(Canvas canvas, RectF rectF) {
                switch (b2) {
                    case 0:
                        long uptimeMillis = SystemClock.uptimeMillis();
                        yv1 yv1Var2 = this.b.D0;
                        if (yv1Var2.A0.Z0() && yv1Var2.A0.getOverScrollMode() != 2) {
                            yv1Var2.A0.g(canvas, rectF);
                            break;
                        } else {
                            yv1Var2.A0.z1(canvas, rectF);
                            int i = 0;
                            while (true) {
                                int childCount = yv1Var2.A0.getChildCount();
                                vr1 vr1Var = yv1Var2.A0;
                                if (i >= childCount) {
                                    vr1Var.A1(canvas, rectF);
                                    break;
                                } else {
                                    View childAt = vr1Var.getChildAt(i);
                                    if (!yv1Var2.Xa(childAt, rectF)) {
                                        if (childAt instanceof rc2) {
                                            canvas.save();
                                            canvas.translate(childAt.getX(), childAt.getY());
                                            rc2 rc2Var = (rc2) childAt;
                                            if (rc2Var.L0()) {
                                                canvas.save();
                                                canvas.translate(0.0f, rc2Var.W);
                                                rc2Var.M0(canvas, true, false);
                                                canvas.restore();
                                            }
                                            canvas.restore();
                                            yv1Var2.A0.drawChild(canvas, childAt, uptimeMillis);
                                            if (rc2Var.l2()) {
                                                canvas.save();
                                                canvas.translate(rc2Var.getX(), rc2Var.getY());
                                                rc2Var.i1(canvas);
                                                canvas.restore();
                                            }
                                        } else {
                                            boolean z = childAt instanceof cm1;
                                            vr1 vr1Var2 = yv1Var2.A0;
                                            if (z) {
                                                vr1Var2.drawChild(canvas, childAt, uptimeMillis);
                                                canvas.save();
                                                canvas.translate(childAt.getX(), childAt.getY());
                                                ((cm1) childAt).H(canvas);
                                                canvas.restore();
                                            } else {
                                                vr1Var2.drawChild(canvas, childAt, uptimeMillis);
                                            }
                                        }
                                    }
                                    i++;
                                }
                            }
                        }
                        break;
                    default:
                        mu1 mu1Var = this.b;
                        yv1 yv1Var3 = mu1Var.D0;
                        RectF rectF2 = mu1Var.x0;
                        rectF2.set(rectF);
                        rectF2.intersect(0.0f, 0.0f, mu1Var.getWidth(), mu1Var.getHeight());
                        if (!rectF2.isEmpty()) {
                            float f = yv1Var3.rd.e;
                            int i2 = (int) ((1.0f - f) * 255.0f);
                            int i3 = (int) (255.0f * f);
                            if (f > 0.0f) {
                                canvas.drawRect(rectF2, cmb.l0(cmb.p1(f * 0.85f, yv1Var3.getThemedColor(cmb.c6))));
                            }
                            tl0.b(mu1Var.v0, canvas, rectF, yv1Var3.A0, mu1Var, i2);
                            fv fvVar = yv1Var3.a4;
                            if (fvVar != null) {
                                tl0.b(fvVar, canvas, rectF, fvVar, mu1Var, i3);
                            }
                            hs1 hs1Var = yv1Var3.F1;
                            if (hs1Var != null && hs1Var.getVisibility() == 0) {
                                int childCount2 = yv1Var3.F1.getChildCount();
                                for (int i4 = 0; i4 < childCount2; i4++) {
                                    View childAt2 = yv1Var3.F1.getChildAt(i4);
                                    if ((childAt2 instanceof gw1) && childAt2.getVisibility() == 0) {
                                        mu1 mu1Var2 = ((gw1) childAt2).a.m1;
                                        tl0.a(mu1Var2.w0, canvas, rectF, mu1Var2, mu1Var);
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
        this.I = new lu1(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonNoveTranslation(float f) {
        a aVar;
        yv1 yv1Var = this.D0;
        yv1Var.m1.setTranslationY(f);
        aVar = ((d) yv1Var).actionBar;
        aVar.setTranslationY(0.0f);
        ft1 ft1Var = yv1Var.Jb;
        if (ft1Var != null) {
            ft1Var.setTranslationY(yv1Var.D1 != null ? r2.getCurrentHeight() : 0);
        }
        hg5 hg5Var = yv1Var.L1;
        if (hg5Var != null) {
            hg5Var.setTranslationY(0.0f);
        }
        hg5 hg5Var2 = yv1Var.K1;
        if (hg5Var2 != null) {
            hg5Var2.setTranslationY(0.0f);
        }
        yv1Var.f1.setTranslationY(0.0f);
        yv1Var.R.setTranslationY(0.0f);
        yv1Var.T9 = 0.0f;
        yv1Var.U9 = 0.0f;
        yv1Var.m1.setBackgroundTranslation(0);
        q qVar = yv1Var.q3;
        if (qVar != null) {
            qVar.y0 = 0.0f;
            qVar.w.setTranslationY(qVar.z0 + 0.0f);
        }
        a91 a91Var = yv1Var.N2;
        if (a91Var != null) {
            vl0 vl0Var = (vl0) a91Var.b;
            vl0Var.u = 0.0f;
            vl0Var.d.invalidate();
        }
        yv1Var.setFragmentPanTranslationOffset(0);
        yv1Var.O7();
    }

    @Override // ela
    public final boolean O() {
        return false;
    }

    @Override // ela
    public final boolean P() {
        return false;
    }

    @Override // ela
    public final int Q() {
        e51 e51Var = this.D0.Y1;
        if (e51Var == null || !e51Var.isShowing()) {
            return super.Q();
        }
        this.f = 0;
        return 0;
    }

    @Override // ela
    public final void T(Drawable drawable) {
        yv1 yv1Var = this.D0;
        psc pscVar = yv1Var.Y;
        if (drawable instanceof ah7) {
            ((ah7) drawable).o();
        }
        iz4 c = pscVar.c(drawable);
        float B = gm.B(pscVar.b(c));
        float B2 = gm.B(pscVar.a(c));
        yv1Var.rc = B <= 0.721f;
        yv1Var.sc = B2 <= 0.9f;
        yv1Var.N.a = c;
        nz4 nz4Var = yv1Var.J;
        if (nz4Var != null) {
            Iterator it = nz4Var.w.iterator();
            while (it.hasNext()) {
                gm0 gm0Var = ((im0) it.next()).h0;
                if (gm0Var != null) {
                    gm0Var.h = true;
                }
            }
        }
        nz4 nz4Var2 = yv1Var.K;
        if (nz4Var2 != null) {
            Iterator it2 = nz4Var2.w.iterator();
            while (it2.hasNext()) {
                gm0 gm0Var2 = ((im0) it2.next()).h0;
                if (gm0Var2 != null) {
                    gm0Var2.h = true;
                }
            }
        }
        e02 e02Var = yv1Var.Z;
        if (e02Var != null) {
            e02Var.setOverlayColor(yv1Var.U7() ? yv1Var.getThemedColor(cmb.ua) : 0);
            yv1Var.Z.invalidate();
        }
        va2 va2Var = yv1Var.U;
        if (va2Var != null) {
            va2Var.invalidate();
        }
        yv1Var.m1.invalidate();
        Iterator it3 = yv1Var.F.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        yv1Var.checkSystemBarColors();
    }

    public final void Y(Canvas canvas, float f, rc2 rc2Var, int i) {
        int save = canvas.save();
        yv1 yv1Var = this.D0;
        float x = rc2Var.getX() + yv1Var.A0.getLeft();
        float y = rc2Var.getY() + yv1Var.A0.getY() + rc2Var.getPaddingTop();
        float alpha = rc2Var.a() ? rc2Var.getAlpha() : 1.0f;
        canvas.clipRect(yv1Var.A0.getLeft(), f, yv1Var.A0.getRight(), ((((yv1Var.A0.getY() + yv1Var.A0.getMeasuredHeight()) - yv1Var.Ya) - yv1Var.w.e()) - yv1Var.ld) - gm.L(9.0f));
        canvas.translate(x, y);
        rc2Var.setInvalidatesParent(true);
        if (i == 0) {
            rc2Var.A1(alpha, canvas, true);
        } else if (i == 1) {
            rc2Var.h1(canvas, alpha);
        } else if (i == 2) {
            rc2Var.Q0(alpha, canvas, rc2Var.getCurrentPosition() != null && (rc2Var.getCurrentPosition().l & 1) == 0);
        } else if (i == 3) {
            boolean z = rc2Var.getCurrentPosition() != null && (rc2Var.getCurrentPosition().l & 1) == 0;
            rc2Var.V0(canvas, alpha);
            if (!z) {
                rc2Var.q1(canvas, alpha, null);
            }
        } else if (i == 4 && ((rc2Var.getCurrentPosition() == null || (rc2Var.getCurrentPosition().l & 1) != 0) && yv1Var.c9 != null)) {
            float f2 = (yv1Var.X8 * yv1Var.a9) / 0.2f;
            canvas.save();
            rc2Var.u1(canvas, yv1Var.c9, f2, yv1Var.Y8);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(x, y);
            rc2Var.v1(this, canvas, yv1Var.d9, yv1Var.c9, f2);
            canvas.restore();
        }
        rc2Var.setInvalidatesParent(false);
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
        a91 a91Var;
        a aVar;
        k47 k47Var;
        boolean z;
        boolean z2;
        ps1 ps1Var;
        k47 k47Var2;
        q qVar;
        a aVar2;
        a aVar3;
        yv1 yv1Var = this.D0;
        boolean z3 = false;
        if ((yv1Var.Z8 == null && ((ArrayList) yv1Var.ja.c).size() <= 0) || (view != yv1Var.y1 && view != yv1Var.m3 && view != yv1Var.n3 && view != yv1Var.J9 && view != yv1Var.ua && view != yv1Var.t2 && view != null && view != yv1Var.N3 && view != yv1Var.O3)) {
            if ((view != yv1Var.N3 || !PhotoViewer.r0().V0()) && (!yv1Var.pa || view != yv1Var.A0)) {
                if (yv1Var.Ha) {
                    aVar3 = ((d) yv1Var).actionBar;
                }
                if (view != yv1Var.q3) {
                    if (getTag(67108867) == null) {
                        if (getTag(67108867) == null && (a91Var = yv1Var.N2) != null && a91Var.a() && yv1Var.N2.getTag() != null) {
                            aVar = ((d) yv1Var).actionBar;
                            if (view != aVar) {
                            }
                        }
                        k47Var = MediaController.w().v0;
                        if (k47Var == null) {
                        }
                        z = false;
                        z2 = false;
                        if (view == yv1Var.J8) {
                        }
                    } else if (((Integer) getTag(67108867)).intValue() == 0) {
                        aVar2 = ((d) yv1Var).actionBar;
                    } else {
                        if (view != yv1Var.A0) {
                            if (view != yv1Var.U) {
                            }
                        }
                        k47Var = MediaController.w().v0;
                        if (k47Var == null && k47Var.T == 0) {
                            z = k47Var.g4();
                            if (z || k47.K4(k47Var.k)) {
                                z2 = true;
                                if (view == yv1Var.J8) {
                                    canvas.save();
                                    canvas.translate(0.0f, (-yv1Var.ka) - (yv1Var.ra != 0.0f ? (yv1Var.A0.getMeasuredHeight() - yv1Var.ka) * yv1Var.ra : 0.0f));
                                    if (k47Var != null && k47Var.D == 5) {
                                        if (cmb.j3 != null && yv1Var.L8.d) {
                                            int x = ((int) view.getX()) - gm.L(3.0f);
                                            int y = ((int) view.getY()) - gm.L(2.0f);
                                            canvas.save();
                                            canvas.scale(yv1Var.J8.getScaleX(), yv1Var.J8.getScaleY(), view.getX(), view.getY());
                                            cmb.j3.setAlpha(nm7.d4);
                                            cmb.j3.setBounds(x, y, gm.L(6.0f) + gm.b3(yv1Var.f8(), yv1Var.U7()) + x, gm.L(6.0f) + gm.b3(yv1Var.f8(), yv1Var.U7()) + y);
                                            cmb.j3.draw(canvas);
                                            canvas.restore();
                                        }
                                        z3 = super.drawChild(canvas, view, j);
                                    } else if (view.getTag() == null) {
                                        float translationY = view.getTranslationY();
                                        view.setTranslationY(-gm.L(1000.0f));
                                        z3 = super.drawChild(canvas, view, j);
                                        view.setTranslationY(translationY);
                                    }
                                    canvas.restore();
                                    return z3;
                                }
                                if (view == yv1Var.U && (qVar = yv1Var.q3) != null && qVar.getVisibility() == 0) {
                                    super.drawChild(canvas, yv1Var.q3, j);
                                }
                                z3 = super.drawChild(canvas, view, j);
                                if (z2 && view == yv1Var.A0 && k47Var.D != 5 && (ps1Var = yv1Var.J8) != null && ps1Var.getTag() != null) {
                                    canvas.save();
                                    canvas.translate(0.0f, ((-yv1Var.ka) - (yv1Var.ra != 0.0f ? (yv1Var.A0.getMeasuredHeight() - yv1Var.ka) * yv1Var.ra : 0.0f)) + yv1Var.la);
                                    super.drawChild(canvas, yv1Var.J8, j);
                                    if (yv1Var.K8 != null) {
                                        canvas.save();
                                        canvas.translate(yv1Var.K8.getX(), yv1Var.A0.getY() + yv1Var.K8.getTop());
                                        rc2 rc2Var = yv1Var.K8;
                                        if (z) {
                                            rc2Var.t1(canvas);
                                            invalidate();
                                            yv1Var.K8.invalidate();
                                        } else {
                                            rc2Var.j1(canvas);
                                            rc2 rc2Var2 = yv1Var.K8;
                                            if (!rc2Var2.S9 && ((k47Var2 = rc2Var2.Q5) == null || k47Var2.D != 27)) {
                                                rc2Var2.A1(rc2Var2.getAlpha(), canvas, true);
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
                        if (view == yv1Var.J8) {
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
        yv1 yv1Var = this.D0;
        return view == yv1Var.N2 || view == yv1Var.F1 || view == yv1Var.J9 || view == yv1Var.Z || view == yv1Var.Z3 || view == yv1Var.n0 || (view instanceof bka);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        l lVar;
        yv1 yv1Var = this.D0;
        ms1 ms1Var = yv1Var.a0;
        if (ms1Var == null || view != ms1Var.n0) {
            super.addView(view, i, layoutParams);
        } else {
            e02 e02Var = yv1Var.Z;
            int indexOfChild = e02Var != null ? indexOfChild(e02Var) : -1;
            if (indexOfChild >= 0) {
                i = indexOfChild;
            }
            super.addView(view, i, layoutParams);
        }
        ms1 ms1Var2 = yv1Var.a0;
        if (ms1Var2 != null && view == ms1Var2.n0) {
            aq0 aq0Var = (aq0) view;
            aq0Var.setBackgroundDrawable(yv1Var.L.c(aq0Var.c, yv1Var.E, false));
        }
        ms1 ms1Var3 = yv1Var.a0;
        if (ms1Var3 == null || view != (lVar = ms1Var3.E2)) {
            return;
        }
        lVar.setBlurredBackgroundFactory(yv1Var.L);
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
    @Override // ela, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        float f;
        float f2;
        Canvas canvas3;
        mu1 mu1Var;
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
        cm1 cm1Var;
        f47 f47Var;
        rc2 rc2Var;
        c47 c47Var;
        f47 f47Var2;
        int i4;
        View view;
        int i5;
        ArrayList arrayList5;
        rc2 rc2Var2;
        ArrayList arrayList6;
        qr1 qr1Var;
        boolean z;
        float f6;
        float f7;
        boolean z2;
        es1 es1Var;
        float f8;
        float f9;
        ms1 ms1Var;
        float f10;
        float f11;
        Canvas canvas4;
        float f12;
        float f13;
        float f14;
        float f15;
        View view2;
        c47 c47Var2;
        Integer num;
        float f16;
        mu1 mu1Var2;
        l39 l39Var;
        cm1 cm1Var2;
        float f17;
        ylb ylbVar;
        float f18;
        cm1 cm1Var3;
        float f19;
        float f20;
        View view3;
        Canvas canvas5;
        py1 py1Var;
        rc2 rc2Var3;
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
        xr1 xr1Var;
        mu1 mu1Var3 = this;
        yv1 yv1Var = mu1Var3.D0;
        qr1 qr1Var2 = yv1Var.w;
        ArrayList arrayList7 = yv1Var.F6;
        yv1Var.a0.M2();
        yv1Var.Rc();
        if (yv1Var.Oa || ((xr1Var = yv1Var.B0) != null && xr1Var.k())) {
            yv1Var.Oa = false;
            yv1Var.cd();
        }
        yv1Var.vd(false, false);
        yv1Var.ed();
        hg5 hg5Var = yv1Var.v2;
        if (hg5Var != null && hg5Var.W) {
            hg5Var.y();
        }
        hg5 hg5Var2 = yv1Var.x2;
        if (hg5Var2 != null && hg5Var2.W) {
            hg5Var2.y();
        }
        float f22 = 0.2f;
        float f23 = 2.0f;
        if (yv1Var.Ha) {
            aVar10 = ((d) yv1Var).actionBar;
            canvas2 = canvas;
            i = canvas2.saveLayerAlpha(0.0f, aVar10.getBottom(), mu1Var3.getMeasuredWidth(), mu1Var3.getMeasuredHeight(), (int) (yv1Var.Ia * 255.0f), 31);
            float f24 = (yv1Var.Ia * 0.2f) + 0.8f;
            canvas2.scale(f24, f24, mu1Var3.getMeasuredWidth() / 2.0f, mu1Var3.getMeasuredHeight() / 2.0f);
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
            rc2 rc2Var4 = (rc2) arrayList7.get(i9);
            g47 g47Var = rc2Var4.getMessageObject().N1;
            if (g47Var != null) {
                canvas2.save();
                aVar7 = ((d) yv1Var).actionBar;
                if (aVar7.getVisibility() == 0) {
                    aVar8 = ((d) yv1Var).actionBar;
                    int translationY = (int) aVar8.getTranslationY();
                    aVar9 = ((d) yv1Var).actionBar;
                    int measuredHeight = aVar9.getMeasuredHeight() + translationY;
                    ys1 ys1Var = yv1Var.D1;
                    int currentHeight = measuredHeight + (ys1Var != null ? ys1Var.getCurrentHeight() : 0);
                    js1 js1Var = yv1Var.E1;
                    int currentHeight2 = currentHeight + (js1Var != null ? js1Var.getCurrentHeight() : 0);
                    z4 = ((d) yv1Var).inPreviewMode;
                    i7 = currentHeight2 + (z4 ? gm.m : 0);
                } else {
                    i7 = 0;
                }
                f21 = f23;
                canvas2.clipRect(0.0f, i7 + yv1Var.Q9, mu1Var3.getWidth(), mu1Var3.getHeight());
                ImageReceiver photoImage = rc2Var4.getPhotoImage();
                rc2Var4.getLocationInWindow(gm.R);
                int topViewEnterProgress = (int) ((yv1Var.a0.getTopViewEnterProgress() * gm.L(48.0f)) + ((int) kt6.B(1.0f, g47Var.g, rc2Var4.getTranslationY(), r8[1])));
                boolean z5 = g47Var.h;
                float f25 = g47Var.e;
                float f26 = g47Var.b;
                float f27 = topViewEnterProgress;
                if (z5) {
                    canvas2.translate(f25, gm.R1(f26, f27, g47Var.g));
                } else {
                    canvas2.translate(f25, gm.R1(f26, photoImage.s() + f27, g47Var.g));
                }
                float f28 = g47Var.d;
                canvas2.scale(f28, f28);
                if (!g47Var.h) {
                    canvas2.translate(-photoImage.r(), -photoImage.s());
                }
                rc2Var4.setTimeAlpha(g47Var.f);
                rc2Var4.draw(canvas2);
                canvas2.restore();
            } else {
                f21 = f23;
            }
            i9++;
            f23 = f21;
        }
        float f29 = f23;
        if (yv1Var.c9 == null || yv1Var.Z8 == null) {
            if (yv1Var.T8 != null) {
                yv1Var.U8.reset();
                float measuredWidth = mu1Var3.getMeasuredWidth() / yv1Var.R8.getWidth();
                yv1Var.U8.postScale(measuredWidth, measuredWidth);
                yv1Var.S8.setLocalMatrix(yv1Var.U8);
                yv1Var.T8.setAlpha((int) (yv1Var.b9 * 255.0f));
                if (yv1Var.T8.getAlpha() > 0) {
                    canvas2.drawRect(0.0f, 0.0f, mu1Var3.getMeasuredWidth(), mu1Var3.getMeasuredHeight(), yv1Var.T8);
                }
            } else {
                yv1Var.V8.setAlpha((int) (yv1Var.X8 * 255.0f * (yv1Var.Z8 != null ? yv1Var.a9 : 1.0f)));
                if (yv1Var.V8.getAlpha() > 0) {
                    canvas.drawRect(0.0f, 0.0f, mu1Var3.getMeasuredWidth(), mu1Var3.getMeasuredHeight(), yv1Var.V8);
                }
            }
        }
        if (yv1Var.c9 != null && yv1Var.e9) {
            mu1Var3.invalidate();
        }
        View view4 = yv1Var.Z8;
        if (view4 != null) {
            if (view4 == yv1Var.y1) {
                float f30 = yv1Var.a9;
                if (f30 < 1.0f) {
                    yv1Var.V8.setAlpha((int) ((1.0f - f30) * yv1Var.X8 * 255.0f));
                    canvas3 = canvas;
                    canvas3.drawRect(0.0f, 0.0f, mu1Var3.getMeasuredWidth(), mu1Var3.getMeasuredHeight(), yv1Var.V8);
                } else {
                    canvas3 = canvas;
                }
                mu1Var = mu1Var3;
                f5 = 1.0f;
                f3 = 0.0f;
                i2 = 0;
                i3 = 1;
            } else if (view4 instanceof ImageView) {
                int save = canvas.save();
                if (yv1Var.a9 < 1.0f) {
                    canvas3 = canvas;
                    i6 = 1;
                    canvas3.saveLayerAlpha(yv1Var.Z8.getLeft(), yv1Var.Z8.getTop(), yv1Var.Z8.getRight(), yv1Var.Z8.getBottom(), (int) (yv1Var.a9 * 255.0f), 31);
                } else {
                    canvas3 = canvas;
                    i6 = 1;
                }
                canvas3.translate(yv1Var.Z8.getLeft(), yv1Var.Z8.getTop());
                View view5 = yv1Var.Z8;
                aVar6 = ((d) yv1Var).actionBar;
                if (view5 == aVar6.getBackButton()) {
                    canvas3.translate(yv1Var.Z8.getX() - yv1Var.Z8.getLeft(), 0.0f);
                    float measuredWidth2 = yv1Var.Z8.getMeasuredWidth() / f29;
                    float measuredHeight2 = yv1Var.Z8.getMeasuredHeight() / f29;
                    canvas3.drawCircle(measuredWidth2, measuredHeight2, Math.max(measuredWidth2, measuredHeight2) * 0.7f, yv1Var.W8);
                }
                yv1Var.Z8.draw(canvas3);
                canvas3.restoreToCount(save);
                float f31 = yv1Var.a9;
                if (f31 < 1.0f) {
                    yv1Var.V8.setAlpha((int) ((1.0f - f31) * yv1Var.X8 * 255.0f));
                    canvas3.drawRect(0.0f, 0.0f, mu1Var3.getMeasuredWidth(), mu1Var3.getMeasuredHeight(), yv1Var.V8);
                }
                mu1Var = mu1Var3;
                i3 = i6;
                f5 = 1.0f;
                f3 = 0.0f;
                i2 = 0;
            } else {
                canvas3 = canvas;
                float y = ((yv1Var.A0.getY() + yv1Var.P9) - yv1Var.R9) - gm.L(4.0f);
                View view6 = yv1Var.Z8;
                f47 currentMessagesGroup = view6 instanceof rc2 ? ((rc2) view6).getCurrentMessagesGroup() : null;
                int childCount = yv1Var.A0.getChildCount();
                int i10 = 0;
                boolean z6 = false;
                while (true) {
                    arrayList = mu1Var3.r0;
                    float f32 = f22;
                    arrayList2 = mu1Var3.q0;
                    arrayList3 = mu1Var3.p0;
                    f4 = f2;
                    arrayList4 = mu1Var3.s0;
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = yv1Var.A0.getChildAt(i10);
                    if (childAt instanceof rc2) {
                        rc2Var = (rc2) childAt;
                        f47Var = rc2Var.getCurrentMessagesGroup();
                        c47Var = rc2Var.getCurrentPosition();
                        cm1Var = null;
                    } else {
                        cm1Var = childAt instanceof cm1 ? (cm1) childAt : null;
                        f47Var = null;
                        rc2Var = null;
                        c47Var = null;
                    }
                    float f33 = y;
                    if ((childAt == yv1Var.Z8 || (currentMessagesGroup != null && currentMessagesGroup == f47Var)) && childAt.getAlpha() != f4) {
                        if (z6 || rc2Var == null || currentMessagesGroup == null) {
                            f47Var2 = currentMessagesGroup;
                            i4 = childCount;
                            view = childAt;
                            i5 = i10;
                            arrayList5 = arrayList;
                            rc2Var2 = rc2Var;
                            arrayList6 = arrayList4;
                            qr1Var = qr1Var2;
                            z = true;
                            f6 = 1.0f;
                            f7 = 9.0f;
                        } else {
                            ArrayList arrayList8 = currentMessagesGroup.d;
                            f7 = 9.0f;
                            e47 e47Var = currentMessagesGroup.m;
                            f47Var2 = currentMessagesGroup;
                            rc2 rc2Var5 = e47Var.m;
                            i4 = childCount;
                            if (rc2Var5 != null) {
                                float U1 = rc2Var5.U1(true);
                                float f34 = e47Var.a + U1 + e47Var.e;
                                float f35 = e47Var.b + e47Var.f;
                                float f36 = e47Var.c + U1 + e47Var.g;
                                float f37 = f35;
                                float f38 = e47Var.d + e47Var.h;
                                if (!e47Var.j) {
                                    f37 = e47Var.m.getTranslationY() + f37;
                                    f38 = e47Var.m.getTranslationY() + f38;
                                }
                                float L = f37 < (yv1Var.P9 - ((float) yv1Var.R9)) - ((float) gm.L(20.0f)) ? (yv1Var.P9 - yv1Var.R9) - gm.L(20.0f) : f37;
                                view = childAt;
                                float L2 = f38 > ((float) (gm.L(20.0f) + yv1Var.A0.getMeasuredHeight())) ? gm.L(20.0f) + yv1Var.A0.getMeasuredHeight() : f38;
                                i5 = i10;
                                int size2 = arrayList8.size();
                                arrayList5 = arrayList;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= size2) {
                                        rc2Var3 = rc2Var;
                                        z3 = true;
                                        break;
                                    }
                                    int i12 = size2;
                                    k47 k47Var = (k47) arrayList8.get(i11);
                                    int i13 = i11;
                                    if (yv1Var.o6[k47.B0(k47Var.k) == yv1Var.l6 ? (char) 0 : (char) 1].indexOfKey(k47Var.e1()) < 0) {
                                        rc2Var3 = rc2Var;
                                        z3 = false;
                                        break;
                                    } else {
                                        i11 = i13 + 1;
                                        size2 = i12;
                                    }
                                }
                                canvas3.save();
                                float measuredHeight3 = ((getMeasuredHeight() - qr1Var2.e()) - yv1Var.ld) - gm.L(9.0f);
                                es1 es1Var2 = yv1Var.X1;
                                float d = measuredHeight3 - (es1Var2 != null ? es1Var2.d() : f4);
                                es1 es1Var3 = yv1Var.X1;
                                canvas3.clipRect(f4, f33 + (es1Var3 != null ? es1Var3.e() : f4), getMeasuredWidth(), d);
                                canvas3.translate(f4, yv1Var.A0.getY());
                                boolean z7 = e47Var.k;
                                boolean z8 = e47Var.l;
                                arrayList6 = arrayList4;
                                qr1Var = qr1Var2;
                                rc2Var2 = rc2Var3;
                                z = true;
                                f6 = 1.0f;
                                e47Var.m.K0(canvas, (int) f34, (int) L, (int) f36, (int) L2, z7, z8, z3, 0);
                                canvas.restore();
                                z2 = true;
                                if (rc2Var2 != null && rc2Var2.getPhotoImage().F()) {
                                    invalidate();
                                }
                                float left = yv1Var.A0.getLeft();
                                float right = yv1Var.A0.getRight();
                                float measuredHeight4 = (((getMeasuredHeight() - qr1Var.e()) - yv1Var.ld) - yv1Var.u7(izb.c)) - gm.L(f7);
                                es1Var = yv1Var.X1;
                                if (es1Var == null) {
                                    float max = Math.max(0.0f, es1Var.e());
                                    f9 = Math.max(0.0f, yv1Var.X1.d());
                                    f8 = max;
                                } else {
                                    f8 = 0.0f;
                                    f9 = 0.0f;
                                }
                                ms1Var = yv1Var.a0;
                                if (ms1Var != null && (py1Var = ms1Var.n0) != null) {
                                    f9 = Math.max(f9, !py1Var.f ? 0.0f : Math.max(0.0f, py1Var.getMeasuredHeight() - (py1Var.c.getTranslationY() + py1Var.e)));
                                }
                                float f39 = f33 + f8;
                                float f40 = measuredHeight4 - f9;
                                if (rc2Var2 != null || !rc2Var2.getTransitionParams().x0) {
                                    left = Math.max(left, view.getX() + yv1Var.A0.getLeft());
                                    f39 = Math.max(f39, view.getY() + yv1Var.A0.getY());
                                    right = Math.min(right, view.getX() + yv1Var.A0.getLeft() + view.getMeasuredWidth());
                                    f40 = Math.min(f40, view.getY() + yv1Var.A0.getY() + view.getMeasuredHeight());
                                }
                                f10 = f40;
                                f11 = f39;
                                float f41 = right;
                                float max2 = Math.max(left, yv1Var.o7());
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
                                    if (rc2Var2 != null) {
                                        rc2Var2.setInvalidatesParent(z);
                                        rc2Var2.setScrimReaction(yv1Var.c9);
                                    } else if (cm1Var != null) {
                                        cm1Var.setInvalidatesParent(z);
                                        cm1Var.setScrimReaction(yv1Var.c9);
                                    }
                                    canvas4.clipRect(f14, f12, f15, f13);
                                    canvas4.translate(view.getX() + yv1Var.A0.getLeft(), view.getY() + yv1Var.A0.getY());
                                    if (rc2Var2 != null && f47Var2 == null && rc2Var2.L0()) {
                                        canvas4.save();
                                        canvas4.translate(0.0f, rc2Var2.getPaddingTop());
                                        rc2Var2.M0(canvas4, z, false);
                                        canvas4.restore();
                                    }
                                    if (rc2Var2 != null && f47Var2 == null) {
                                        rc2Var2.b1(canvas4, yv1Var.b9);
                                    }
                                    view2 = view;
                                    view2.draw(canvas4);
                                    if (rc2Var2 != null && rc2Var2.l2()) {
                                        canvas4.save();
                                        canvas4.translate(0.0f, rc2Var2.getPaddingTop());
                                        rc2Var2.i1(canvas4);
                                        canvas4.restore();
                                    }
                                    if (cm1Var != null) {
                                        cm1Var.H(canvas4);
                                    }
                                    canvas4.restore();
                                    if (rc2Var2 != null) {
                                        rc2Var2.setInvalidatesParent(false);
                                        rc2Var2.setScrimReaction(null);
                                    } else if (cm1Var != null) {
                                        cm1Var.setInvalidatesParent(false);
                                        cm1Var.setScrimReaction(null);
                                    }
                                } else {
                                    canvas4 = canvas;
                                    f12 = f11;
                                    f13 = f10;
                                    f14 = max2;
                                    f15 = f41;
                                    view2 = view;
                                }
                                c47Var2 = c47Var;
                                if (c47Var2 != null) {
                                    if (rc2Var2 != null) {
                                    }
                                    num = yv1Var.c9;
                                    if (num == null && rc2Var2 != null && f47Var2 == null) {
                                        if (yv1Var.T8 != null) {
                                            yv1Var.U8.reset();
                                            float measuredWidth3 = getMeasuredWidth() / yv1Var.R8.getWidth();
                                            yv1Var.U8.postScale(measuredWidth3, measuredWidth3);
                                            yv1Var.S8.setLocalMatrix(yv1Var.U8);
                                            yv1Var.T8.setAlpha((int) (yv1Var.b9 * 255.0f));
                                            f19 = f15;
                                            f20 = f14;
                                            view3 = view2;
                                            f16 = 0.0f;
                                            canvas4.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), yv1Var.T8);
                                        } else {
                                            f19 = f15;
                                            f20 = f14;
                                            view3 = view2;
                                            f16 = 0.0f;
                                            yv1Var.V8.setAlpha((int) (yv1Var.X8 * 255.0f * yv1Var.a9));
                                            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), yv1Var.V8);
                                        }
                                        if (f11 < f10) {
                                            float f42 = (yv1Var.X8 * yv1Var.a9) / f32;
                                            float alpha = view3.getAlpha() * yv1Var.a9;
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
                                            canvas5.translate(view3.getX() + yv1Var.A0.getLeft(), view3.getY() + yv1Var.A0.getY() + view3.getPaddingTop());
                                            rc2Var2.u1(canvas5, yv1Var.c9, f42, yv1Var.Y8);
                                            canvas5.restore();
                                            canvas5.save();
                                            canvas5.translate(view3.getX() + yv1Var.A0.getLeft(), view3.getY() + yv1Var.A0.getY() + view3.getPaddingTop());
                                            rc2Var2.v1(this, canvas5, yv1Var.d9, yv1Var.c9, f42);
                                            mu1Var2 = this;
                                            canvas.restore();
                                        } else {
                                            mu1Var2 = this;
                                        }
                                    } else {
                                        f16 = 0.0f;
                                        mu1Var2 = this;
                                        float f44 = f15;
                                        float f45 = f14;
                                        View view7 = view2;
                                        if (num != null && cm1Var != null) {
                                            ylb ylbVar2 = cm1Var.h1;
                                            l39 l39Var2 = cm1Var.F0;
                                            if (yv1Var.T8 == null) {
                                                yv1Var.U8.reset();
                                                float measuredWidth4 = mu1Var2.getMeasuredWidth() / yv1Var.R8.getWidth();
                                                yv1Var.U8.postScale(measuredWidth4, measuredWidth4);
                                                yv1Var.S8.setLocalMatrix(yv1Var.U8);
                                                yv1Var.T8.setAlpha((int) (yv1Var.b9 * 255.0f));
                                                cm1Var2 = cm1Var;
                                                l39Var = l39Var2;
                                                canvas.drawRect(0.0f, 0.0f, mu1Var2.getMeasuredWidth(), mu1Var2.getMeasuredHeight(), yv1Var.T8);
                                            } else {
                                                l39Var = l39Var2;
                                                cm1Var2 = cm1Var;
                                                yv1Var.V8.setAlpha((int) (yv1Var.X8 * 255.0f * yv1Var.a9));
                                                canvas.drawRect(0.0f, 0.0f, mu1Var2.getMeasuredWidth(), mu1Var2.getMeasuredHeight(), yv1Var.V8);
                                            }
                                            if (f11 < f10) {
                                                float f46 = (yv1Var.X8 * yv1Var.a9) / f32;
                                                float alpha2 = view7.getAlpha() * yv1Var.a9;
                                                if (alpha2 < f6) {
                                                    float f47 = f12;
                                                    float f48 = f13;
                                                    ylbVar = ylbVar2;
                                                    canvas.saveLayerAlpha(f45, f47, f44, f48, (int) (alpha2 * 255.0f), 31);
                                                    f18 = f48;
                                                    f17 = f47;
                                                    canvas3 = canvas;
                                                } else {
                                                    canvas3 = canvas;
                                                    f17 = f12;
                                                    ylbVar = ylbVar2;
                                                    f18 = f13;
                                                    canvas3.save();
                                                }
                                                canvas3.clipRect(f45, f17, f44, f18);
                                                canvas3.translate(view7.getX() + yv1Var.A0.getLeft(), view7.getY() + yv1Var.A0.getY() + view7.getPaddingTop());
                                                Integer num2 = yv1Var.c9;
                                                boolean z9 = yv1Var.Y8;
                                                l39Var.getClass();
                                                if (ylbVar != null) {
                                                    cm1Var3 = cm1Var2;
                                                    ylbVar.b(cm1Var3.v0, cm1Var3.u0 + gm.L(4.0f), cm1Var2.getMeasuredWidth(), cm1Var3.w0);
                                                } else {
                                                    cm1Var3 = cm1Var2;
                                                    cmb.q(cm1Var3.v0, cm1Var3.u0 + gm.L(4.0f), cm1Var3.getMeasuredWidth(), cm1Var3.w0);
                                                }
                                                l39 l39Var3 = l39Var;
                                                l39Var3.A = f46;
                                                l39Var3.B = z9;
                                                l39Var3.d(canvas3, cm1Var3.x2.c, num2);
                                                canvas3.restore();
                                                canvas3.save();
                                                canvas3.translate(view7.getX() + yv1Var.A0.getLeft(), view7.getY() + yv1Var.A0.getY() + view7.getPaddingTop());
                                                int i15 = yv1Var.d9;
                                                Integer num3 = yv1Var.c9;
                                                l39Var3.getClass();
                                                if (ylbVar != null) {
                                                    ylbVar.b(cm1Var3.v0, cm1Var3.u0 + gm.L(4.0f), cm1Var3.getMeasuredWidth(), cm1Var3.w0);
                                                } else {
                                                    cmb.q(cm1Var3.v0, cm1Var3.u0 + gm.L(4.0f), cm1Var3.getMeasuredWidth(), cm1Var3.w0);
                                                }
                                                l39Var3.A = f46;
                                                l39Var3.f(mu1Var2, canvas3, i15, num3);
                                                canvas3.restore();
                                                z6 = z2;
                                            }
                                        }
                                    }
                                    canvas3 = canvas;
                                    z6 = z2;
                                } else if (!c47Var2.h) {
                                    if (c47Var2.a == 0) {
                                    }
                                    if (c47Var2 != null || (c47Var2.l & rc2Var2.C()) != 0) {
                                        arrayList5.add(rc2Var2);
                                    }
                                    if (c47Var2 != null) {
                                        int i16 = c47Var2.l;
                                        if ((i16 & 8) != 0) {
                                        }
                                        num = yv1Var.c9;
                                        if (num == null) {
                                        }
                                        f16 = 0.0f;
                                        mu1Var2 = this;
                                        float f442 = f15;
                                        float f452 = f14;
                                        View view72 = view2;
                                        if (num != null) {
                                            ylb ylbVar22 = cm1Var.h1;
                                            l39 l39Var22 = cm1Var.F0;
                                            if (yv1Var.T8 == null) {
                                            }
                                            if (f11 < f10) {
                                            }
                                        }
                                        canvas3 = canvas;
                                        z6 = z2;
                                    }
                                    arrayList6.add(rc2Var2);
                                    num = yv1Var.c9;
                                    if (num == null) {
                                    }
                                    f16 = 0.0f;
                                    mu1Var2 = this;
                                    float f4422 = f15;
                                    float f4522 = f14;
                                    View view722 = view2;
                                    if (num != null) {
                                    }
                                    canvas3 = canvas;
                                    z6 = z2;
                                }
                                if (c47Var2 != null || c47Var2.h) {
                                    arrayList3.add(rc2Var2);
                                }
                                if (c47Var2 != null || (c47Var2.a == 0 && c47Var2.c == 0 && rc2Var2.k2())) {
                                    arrayList2.add(rc2Var2);
                                }
                                if (c47Var2 != null) {
                                }
                                arrayList5.add(rc2Var2);
                                if (c47Var2 != null) {
                                }
                                arrayList6.add(rc2Var2);
                                num = yv1Var.c9;
                                if (num == null) {
                                }
                                f16 = 0.0f;
                                mu1Var2 = this;
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
                                rc2Var2 = rc2Var;
                                arrayList6 = arrayList4;
                                qr1Var = qr1Var2;
                                z = true;
                                f6 = 1.0f;
                            }
                        }
                        z2 = z6;
                        if (rc2Var2 != null) {
                            invalidate();
                        }
                        float left2 = yv1Var.A0.getLeft();
                        float right2 = yv1Var.A0.getRight();
                        float measuredHeight42 = (((getMeasuredHeight() - qr1Var.e()) - yv1Var.ld) - yv1Var.u7(izb.c)) - gm.L(f7);
                        es1Var = yv1Var.X1;
                        if (es1Var == null) {
                        }
                        ms1Var = yv1Var.a0;
                        if (ms1Var != null) {
                            f9 = Math.max(f9, !py1Var.f ? 0.0f : Math.max(0.0f, py1Var.getMeasuredHeight() - (py1Var.c.getTranslationY() + py1Var.e)));
                        }
                        float f392 = f33 + f8;
                        float f402 = measuredHeight42 - f9;
                        if (rc2Var2 != null) {
                        }
                        left2 = Math.max(left2, view.getX() + yv1Var.A0.getLeft());
                        f392 = Math.max(f392, view.getY() + yv1Var.A0.getY());
                        right2 = Math.min(right2, view.getX() + yv1Var.A0.getLeft() + view.getMeasuredWidth());
                        f402 = Math.min(f402, view.getY() + yv1Var.A0.getY() + view.getMeasuredHeight());
                        f10 = f402;
                        f11 = f392;
                        float f412 = right2;
                        float max22 = Math.max(left2, yv1Var.o7());
                        if (f11 >= f10) {
                        }
                        c47Var2 = c47Var;
                        if (c47Var2 != null) {
                        }
                        if (c47Var2 != null) {
                        }
                        arrayList3.add(rc2Var2);
                        if (c47Var2 != null) {
                        }
                        arrayList2.add(rc2Var2);
                        if (c47Var2 != null) {
                        }
                        arrayList5.add(rc2Var2);
                        if (c47Var2 != null) {
                        }
                        arrayList6.add(rc2Var2);
                        num = yv1Var.c9;
                        if (num == null) {
                        }
                        f16 = 0.0f;
                        mu1Var2 = this;
                        float f442222 = f15;
                        float f452222 = f14;
                        View view72222 = view2;
                        if (num != null) {
                        }
                        canvas3 = canvas;
                        z6 = z2;
                    } else {
                        f6 = 1.0f;
                        mu1Var2 = this;
                        f47Var2 = currentMessagesGroup;
                        i4 = childCount;
                        i5 = i10;
                        qr1Var = qr1Var2;
                        f16 = f4;
                    }
                    i10 = i5 + 1;
                    mu1Var3 = mu1Var2;
                    f22 = f32;
                    qr1Var2 = qr1Var;
                    f = f6;
                    f2 = f16;
                    y = f33;
                    currentMessagesGroup = f47Var2;
                    childCount = i4;
                }
                float f49 = y;
                mu1Var = mu1Var3;
                f47 f47Var3 = currentMessagesGroup;
                f5 = f;
                f3 = f4;
                int size3 = arrayList3.size();
                if (size3 > 0) {
                    for (int i17 = 0; i17 < size3; i17++) {
                        mu1Var.Y(canvas3, f49, (rc2) arrayList3.get(i17), 0);
                    }
                    i2 = 0;
                    arrayList3.clear();
                } else {
                    i2 = 0;
                }
                int size4 = arrayList2.size();
                if (size4 > 0) {
                    for (int i18 = i2; i18 < size4; i18++) {
                        mu1Var.Y(canvas3, f49, (rc2) arrayList2.get(i18), 1);
                    }
                    i3 = 1;
                    arrayList2.clear();
                } else {
                    i3 = 1;
                }
                int size5 = arrayList.size();
                if (size5 > 0) {
                    for (int i19 = i2; i19 < size5; i19++) {
                        rc2 rc2Var6 = (rc2) arrayList.get(i19);
                        if (rc2Var6.getCurrentPosition() != null || rc2Var6.getTransitionParams().x0) {
                            mu1Var.Y(canvas3, f49, rc2Var6, 2);
                        }
                    }
                    arrayList.clear();
                }
                int size6 = arrayList4.size();
                if (size6 > 0) {
                    for (int i20 = i2; i20 < size6; i20++) {
                        rc2 rc2Var7 = (rc2) arrayList4.get(i20);
                        if (rc2Var7.getCurrentPosition() != null || rc2Var7.getTransitionParams().x0) {
                            mu1Var.Y(canvas3, f49, rc2Var7, 3);
                        }
                    }
                }
                if (yv1Var.c9 != null && f47Var3 != null) {
                    if (yv1Var.T8 != null) {
                        yv1Var.U8.reset();
                        float measuredWidth5 = mu1Var.getMeasuredWidth() / yv1Var.R8.getWidth();
                        yv1Var.U8.postScale(measuredWidth5, measuredWidth5);
                        yv1Var.S8.setLocalMatrix(yv1Var.U8);
                        yv1Var.T8.setAlpha((int) (yv1Var.b9 * 255.0f));
                        canvas.drawRect(0.0f, 0.0f, mu1Var.getMeasuredWidth(), mu1Var.getMeasuredHeight(), yv1Var.T8);
                        canvas3 = canvas;
                    } else {
                        yv1Var.V8.setAlpha((int) (yv1Var.X8 * 255.0f * yv1Var.a9));
                        canvas.drawRect(0.0f, 0.0f, mu1Var.getMeasuredWidth(), mu1Var.getMeasuredHeight(), yv1Var.V8);
                        canvas3 = canvas;
                    }
                }
                int size7 = arrayList4.size();
                if (size7 > 0) {
                    for (int i21 = i2; i21 < size7; i21++) {
                        rc2 rc2Var8 = (rc2) arrayList4.get(i21);
                        if (rc2Var8.getCurrentPosition() != null || rc2Var8.getTransitionParams().x0) {
                            mu1Var.Y(canvas3, f49, rc2Var8, 4);
                        }
                    }
                    arrayList4.clear();
                }
            }
            if (yv1Var.c9 == null) {
                float f50 = yv1Var.a9;
                if (f50 < f5) {
                    if (yv1Var.T8 != null) {
                        yv1Var.U8.reset();
                        float measuredWidth6 = mu1Var.getMeasuredWidth() / yv1Var.R8.getWidth();
                        yv1Var.U8.postScale(measuredWidth6, measuredWidth6);
                        yv1Var.S8.setLocalMatrix(yv1Var.U8);
                        yv1Var.T8.setAlpha((int) (yv1Var.b9 * 255.0f));
                        canvas.drawRect(0.0f, 0.0f, mu1Var.getMeasuredWidth(), mu1Var.getMeasuredHeight(), yv1Var.T8);
                        canvas3 = canvas;
                    } else {
                        yv1Var.V8.setAlpha((int) ((f5 - f50) * yv1Var.X8 * 255.0f));
                        canvas.drawRect(0.0f, 0.0f, mu1Var.getMeasuredWidth(), mu1Var.getMeasuredHeight(), yv1Var.V8);
                        canvas3 = canvas;
                    }
                }
            }
        } else {
            canvas3 = canvas;
            mu1Var = mu1Var3;
            f3 = 0.0f;
            i2 = 0;
            i3 = 1;
        }
        if (yv1Var.Z8 != null || ((ArrayList) yv1Var.ja.c).size() > 0) {
            es1 es1Var4 = yv1Var.X1;
            if (es1Var4 == null || es1Var4.getVisibility() != 0) {
                super.drawChild(canvas3, yv1Var.y1, SystemClock.uptimeMillis());
            }
            ds1 ds1Var = yv1Var.m3;
            if (ds1Var != null && ds1Var.getTag() != null) {
                super.drawChild(canvas3, yv1Var.m3, SystemClock.uptimeMillis());
            }
            cs1 cs1Var = yv1Var.n3;
            if (cs1Var != null && cs1Var.getTag() != null) {
                super.drawChild(canvas3, yv1Var.n3, SystemClock.uptimeMillis());
            }
            uj4 uj4Var = yv1Var.J9;
            if (uj4Var != null) {
                super.drawChild(canvas3, uj4Var, SystemClock.uptimeMillis());
            }
            xz8 xz8Var = yv1Var.ua;
            if (xz8Var != null) {
                super.drawChild(canvas3, xz8Var, SystemClock.uptimeMillis());
            }
            hg5 hg5Var3 = yv1Var.t2;
            if (hg5Var3 != null) {
                super.drawChild(canvas3, hg5Var3, SystemClock.uptimeMillis());
            }
            UndoView undoView = yv1Var.N3;
            if (undoView != null && undoView.getVisibility() == 0) {
                super.drawChild(canvas3, yv1Var.N3, SystemClock.uptimeMillis());
            }
            kt1 kt1Var = yv1Var.O3;
            if (kt1Var != null && kt1Var.getVisibility() == 0) {
                super.drawChild(canvas3, yv1Var.O3, SystemClock.uptimeMillis());
            }
            hg5 hg5Var4 = yv1Var.M1;
            if (hg5Var4 != null && hg5Var4.getVisibility() == 0) {
                super.drawChild(canvas3, yv1Var.M1, SystemClock.uptimeMillis());
            }
            xt1 xt1Var = yv1Var.Q1;
            if (xt1Var != null && xt1Var.getVisibility() == 0) {
                super.drawChild(canvas3, yv1Var.Q1, SystemClock.uptimeMillis());
            }
            hg5 hg5Var5 = yv1Var.O1;
            if (hg5Var5 != null && hg5Var5.getVisibility() == 0) {
                super.drawChild(canvas3, yv1Var.O1, SystemClock.uptimeMillis());
            }
            ms1 ms1Var2 = yv1Var.a0;
            if (ms1Var2 != null && ms1Var2.M != null) {
                canvas3.save();
                canvas3.translate(yv1Var.a0.M.getX() + yv1Var.a0.getX(), yv1Var.a0.M.getY() + yv1Var.a0.getY());
                yv1Var.a0.M.draw(canvas3);
                canvas3.restore();
            }
        }
        if (yv1Var.Ma > 0 && mu1Var.f < gm.L(20.0f)) {
            int themedColor = yv1Var.getThemedColor(cmb.c6);
            Paint paint = mu1Var.t0;
            if (paint == null) {
                paint = new Paint();
                mu1Var.t0 = paint;
            }
            if (mu1Var.u0 != themedColor) {
                mu1Var.u0 = themedColor;
                paint.setColor(themedColor);
            }
            Canvas canvas6 = canvas3;
            canvas6.drawRect(0.0f, mu1Var.getMeasuredHeight() - yv1Var.Ma, mu1Var.getMeasuredWidth(), mu1Var.getMeasuredHeight(), mu1Var.t0);
            canvas3 = canvas6;
        }
        vd2 vd2Var = yv1Var.ma;
        if (vd2Var != null) {
            if (((vd2Var.T <= f3 || vd2Var.S) ? i2 : i3) != 0) {
                int inputBubbleTop = (int) yv1Var.U.getInputBubbleTop();
                int inputBubbleBottom = (int) yv1Var.U.getInputBubbleBottom();
                yv1 yv1Var2 = yv1Var.qa;
                int i22 = inputBubbleTop - ((int) ((yv1Var2 == null ? f3 : yv1Var2.la) * yv1Var.ra));
                vd2 vd2Var2 = yv1Var.ma;
                mu1Var.getMeasuredWidth();
                vd2Var2.b(canvas3, i22, inputBubbleBottom);
            }
        }
        if (yv1Var.qa != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, mu1Var.getMeasuredWidth(), mu1Var.getMeasuredHeight(), (int) (yv1Var.ra * 255.0f), 31);
            canvas3 = canvas;
            yv1Var.qa.fragmentView.draw(canvas3);
            canvas3.restore();
        }
        yv1Var.Ua.e(canvas3);
        if (i8 >= 0) {
            canvas3.restore();
        }
        if (yv1Var.Ha) {
            canvas3.save();
            aVar = ((d) yv1Var).actionBar;
            float x = aVar.getX();
            aVar2 = ((d) yv1Var).actionBar;
            canvas3.translate(x, aVar2.getY());
            aVar3 = ((d) yv1Var).actionBar;
            float width = aVar3.getWidth();
            aVar4 = ((d) yv1Var).actionBar;
            canvas.saveLayerAlpha(0.0f, 0.0f, width, aVar4.getHeight(), (int) (yv1Var.Ia * 255.0f), 31);
            aVar5 = ((d) yv1Var).actionBar;
            aVar5.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        yv1 yv1Var = this.D0;
        if (yv1Var.c4 != null && motionEvent.getActionMasked() == 8) {
            yv1Var.c4.f();
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        jt1 jt1Var;
        yv1 yv1Var = this.D0;
        n02 n02Var = yv1Var.c4;
        if (n02Var != null) {
            n02Var.f();
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (jt1Var = yv1Var.cb) == null || !jt1Var.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        jt1Var.a(true);
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
        vs1 vs1Var;
        tk5 tk5Var;
        tk5 tk5Var2;
        boolean z2;
        boolean z3;
        a aVar;
        yv1 yv1Var = this.D0;
        n02 n02Var = yv1Var.c4;
        if (n02Var != null) {
            n02Var.f();
        }
        if (gm.E || yv1Var.isInBubbleMode()) {
            e34 emojiView = yv1Var.a0.getEmojiView();
            ms1 ms1Var = yv1Var.a0;
            y = emojiView != null ? ms1Var.getEmojiView().getY() : ms1Var.getY();
        } else {
            y = yv1Var.a0.getY();
        }
        View view = yv1Var.Z8;
        if (view != null) {
            aVar = ((d) yv1Var).actionBar;
        }
        ms1 ms1Var2 = yv1Var.a0;
        if (ms1Var2 == null || !ms1Var2.p4 || motionEvent.getY() >= y) {
            yv1Var.G9 = motionEvent.getY();
            rkb m = yv1Var.u9.m(getContext());
            motionEvent.offsetLocation(-m.getX(), -m.getY());
            if (!yv1Var.u9.w() || !yv1Var.u9.m(getContext()).onTouchEvent(motionEvent)) {
                motionEvent.offsetLocation(m.getX(), m.getY());
                if (m.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                hs1 hs1Var = yv1Var.F1;
                if (hs1Var != null) {
                    if (yv1Var.J3 != null) {
                        z = hs1Var.B(motionEvent);
                        if (yv1Var.F1.I) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 || !yv1Var.u9.w() || (motionEvent.getY() >= yv1Var.A0.getTop() && motionEvent.getY() <= yv1Var.A0.getBottom())) {
                            vs1Var = yv1Var.Ta;
                            if (!vs1Var.n) {
                                return vs1Var.g(motionEvent);
                            }
                            yh4 yh4Var = yh4.f;
                            if (yh4Var == null || !yh4Var.a) {
                                if (yv1Var.isInPreviewMode() && yv1Var.ga) {
                                    if (motionEvent.getAction() == 0) {
                                        int i = 2;
                                        int[] iArr = new int[2];
                                        getLocationInWindow(iArr);
                                        int[] iArr2 = new int[2];
                                        if (yv1Var.y1 != null) {
                                            int i2 = 0;
                                            for (int i3 = 3; i2 < i3; i3 = 3) {
                                                mx6 mx6Var = yv1Var.y1.e[i2 == 0 ? 1 : i2 == 1 ? i : i3];
                                                if (mx6Var != null) {
                                                    ((bw1) mx6Var.b).getLocationInWindow(iArr2);
                                                    Rect rect = gm.Q;
                                                    int i4 = iArr2[0] - iArr[0];
                                                    rect.set(i4, iArr2[1] - iArr[1], gm.L(56.0f) + i4, gm.L(61.0f) + (iArr2[1] - iArr[1]));
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
                                        pr1 pr1Var = yv1Var.p1;
                                        if (pr1Var != null) {
                                            pr1Var.getLocationInWindow(iArr2);
                                            Rect rect2 = gm.Q;
                                            int i5 = iArr2[0] - iArr[0];
                                            rect2.set(i5, iArr2[1] - iArr[1], yv1Var.p1.getMeasuredWidth() + i5, yv1Var.p1.getMeasuredHeight() + (iArr2[1] - iArr[1]));
                                            if (rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                                z3 = true;
                                                if (z2) {
                                                    this.y0 = motionEvent.getX();
                                                    this.z0 = motionEvent.getY();
                                                    this.A0 = SystemClock.elapsedRealtime();
                                                    this.B0 = z3;
                                                    pr1 pr1Var2 = yv1Var.p1;
                                                    if (pr1Var2 != null) {
                                                        pr1Var2.i0.c(z3);
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
                                        pr1 pr1Var3 = yv1Var.p1;
                                        if (pr1Var3 != null) {
                                            pr1Var3.i0.c(false);
                                        }
                                        if (this.B0 || (oqe.a(this.y0, this.z0, motionEvent.getX(), motionEvent.getY()) < gm.L(6.0f) && SystemClock.elapsedRealtime() - this.A0 <= ViewConfiguration.getTapTimeout())) {
                                            if (this.B0) {
                                                tk5Var2 = ((d) yv1Var).parentLayout;
                                                yv1Var.removeSelfFromStack(false);
                                                ((ActionBarLayout) tk5Var2).S(ProfileActivity.S2(yv1Var.l6));
                                            } else {
                                                tk5Var = ((d) yv1Var).parentLayout;
                                                ((ActionBarLayout) tk5Var).p();
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
                                rc0 rc0Var = (rc0) yh4.t().d;
                                if (rc0Var != null) {
                                    rc0Var.onTouchEvent(motionEvent);
                                    return true;
                                }
                            }
                        } else {
                            motionEvent.offsetLocation(-m.getX(), -m.getY());
                            if (yv1Var.u9.m(getContext()).onTouchEvent(motionEvent)) {
                                motionEvent.offsetLocation(m.getX(), m.getY());
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                    } else {
                        View[] viewArr = hs1Var.e;
                        if (hs1Var.I) {
                            hs1Var.J = true;
                            hs1Var.I = false;
                            hs1Var.F(viewArr[0], 0.0f);
                            View view2 = viewArr[1];
                            if (view2 != null) {
                                hs1Var.F(view2, hs1Var.E ? viewArr[0].getMeasuredWidth() : -viewArr[0].getMeasuredWidth());
                            }
                            hs1Var.d = 0;
                            hs1Var.c = 1.0f;
                            mgc mgcVar = hs1Var.N;
                            if (mgcVar != null) {
                                mgcVar.f(1.0f, 0, hs1Var.b);
                            }
                            hs1Var.x(false);
                        }
                    }
                }
                z = false;
                if (motionEvent.getAction() == 0) {
                }
                vs1Var = yv1Var.Ta;
                if (!vs1Var.n) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        yv1 yv1Var = this.D0;
        oyb oybVar = yv1Var.n0;
        float progress = (view == oybVar || view == this.M || view == yv1Var.Z || (view instanceof bka) || oybVar == null) ? 0.0f : oybVar.getProgress() * yv1Var.n0.getContentWidth();
        if (progress <= 0.0f) {
            return Z(canvas, view, j);
        }
        canvas.save();
        canvas.translate(-progress, 0.0f);
        boolean Z = Z(canvas, view, j);
        canvas.restore();
        return Z;
    }

    @Override // ela
    public float getBottomOffset() {
        return this.D0.A0.getBottom();
    }

    public yv1 getChatActivity() {
        return this.D0;
    }

    public Drawable getCompactBackground() {
        int themedColor = this.D0.getThemedColor(cmb.ta);
        ColorDrawable colorDrawable = this.C0;
        if (colorDrawable == null || colorDrawable.getColor() != themedColor) {
            this.C0 = new ColorDrawable(themedColor);
        }
        return this.C0;
    }

    @Override // ela
    public int getKeyboardHeight() {
        if (this.D0.mb) {
            return 0;
        }
        return super.getKeyboardHeight();
    }

    @Override // ela
    public float getListTranslationY() {
        return this.D0.A0.getTranslationY();
    }

    @Override // ela
    public Drawable getNewDrawable() {
        yv1 yv1Var = this.D0;
        if (yv1Var.U7()) {
            return getCompactBackground();
        }
        Drawable l = yv1Var.Ba.l();
        return l != null ? l : super.getNewDrawable();
    }

    @Override // ela
    public boolean getNewDrawableMotion() {
        TLRPC.WallPaper wallPaper = this.D0.Ba.g;
        if (wallPaper == null) {
            return super.getNewDrawableMotion();
        }
        TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
        return wallPaperSettings != null && wallPaperSettings.motion;
    }

    @Override // ela
    public int getScrollOffset() {
        return this.D0.A0.computeVerticalScrollOffset();
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        tk5 tk5Var;
        tk5 tk5Var2;
        tk5 tk5Var3;
        vr1 vr1Var;
        super.onAttachedToWindow();
        yv1 yv1Var = this.D0;
        if (yv1Var.mb) {
            this.I.b = yv1Var.m1;
        } else {
            tk5Var = ((d) yv1Var).parentLayout;
            if (tk5Var != null) {
                tk5Var2 = ((d) yv1Var).parentLayout;
                if (((ActionBarLayout) tk5Var2).b) {
                    gb gbVar = this.I;
                    tk5Var3 = ((d) yv1Var).parentLayout;
                    gbVar.b = (FrameLayout) tk5Var3.getView().getParent().getParent().getParent().getParent();
                }
            }
        }
        this.I.c();
        yv1Var.a0.setAdjustPanLayoutHelper(this.I);
        k47 k47Var = MediaController.w().v0;
        if (k47Var != null && ((k47Var.g4() || k47.K4(k47Var.k)) && k47Var.T == 0 && k47.B0(k47Var.k) == yv1Var.l6)) {
            MediaController.w().o0(yv1Var.e6(false), yv1Var.L8, yv1Var.J8, true);
        }
        vd2 vd2Var = yv1Var.ma;
        if (vd2Var != null) {
            vd2Var.G.I();
            vm vmVar = vd2Var.l0;
            if (vmVar != null && (vr1Var = vd2Var.b0) != null) {
                vmVar.b(vr1Var);
            }
            nm7.f(vd2Var.f0).b(vd2Var, 2);
        }
        yv1Var.Ua.i();
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        vr1 vr1Var;
        super.onDetachedFromWindow();
        this.I.d();
        yv1 yv1Var = this.D0;
        vd2 vd2Var = yv1Var.ma;
        if (vd2Var != null) {
            nm7.f(vd2Var.f0).n(vd2Var, 2);
            vd2Var.G.K();
            vm vmVar = vd2Var.l0;
            if (vmVar != null && (vr1Var = vd2Var.b0) != null) {
                vmVar.o(vr1Var);
            }
            vd2Var.R = 0.0f;
            vd2Var.Q = 0L;
            yv1Var.ma = null;
        }
        yv1Var.Ua.j();
        gm.c3(new jd((byte) 17));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        yv1 yv1Var;
        a91 a91Var;
        if (getTag(67108867) == null) {
            if (getTag(67108867) != null || (a91Var = (yv1Var = this.D0).N2) == null || !a91Var.a() || yv1Var.N2.getTag() == null) {
                super.onDraw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bc, code lost:
    
        if (r8 != r3.vd) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        yv1 yv1Var = this.D0;
        qr1 qr1Var = yv1Var.w;
        int i12 = (measuredWidth - yv1Var.zb) - yv1Var.Ab;
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
                int i15 = i14 & nm7.w1;
                int i16 = i14 & 7;
                if (i16 == 1) {
                    g = wi8.g(i12, measuredWidth2, 2, yv1Var.zb) + layoutParams.leftMargin;
                    i5 = layoutParams.rightMargin;
                } else if (i16 != 5) {
                    i6 = yv1Var.zb + layoutParams.leftMargin;
                    if (i15 == 16) {
                        if (i15 == 48) {
                            i9 = layoutParams.topMargin + getPaddingTop();
                            aVar5 = ((d) yv1Var).actionBar;
                            if (childAt != aVar5) {
                                aVar6 = ((d) yv1Var).actionBar;
                                if (aVar6.getVisibility() == 0) {
                                    aVar7 = ((d) yv1Var).actionBar;
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
                            if (childAt != yv1Var.ja && childAt != yv1Var.ua && childAt != yv1Var.U && !(childAt instanceof ig5) && childAt != yv1Var.n0) {
                                if (childAt instanceof rkb) {
                                    i10 = yv1Var.Xa;
                                } else if (childAt == yv1Var.f1) {
                                    aVar3 = ((d) yv1Var).actionBar;
                                    if (aVar3.getVisibility() == 0) {
                                        aVar4 = ((d) yv1Var).actionBar;
                                        i11 = aVar4.getMeasuredHeight() / 2;
                                    } else {
                                        i11 = 0;
                                    }
                                    i9 += i11;
                                } else if (yv1Var.a0.S0(childAt)) {
                                    if (!gm.E) {
                                        z2 = ((d) yv1Var).inBubbleMode;
                                        if (!z2) {
                                            i9 = yv1Var.a0.getBottom();
                                        }
                                    }
                                    i9 = yv1Var.a0.getTop() - childAt.getMeasuredHeight();
                                    L = gm.L(1.0f);
                                    i9 += L;
                                } else {
                                    ms1 ms1Var = yv1Var.a0;
                                    if (ms1Var != null && (childAt == ms1Var.E2 || childAt == ms1Var.D2)) {
                                        i9 = wi8.B(7.0f, qr1Var.e(), i9);
                                        i6 -= gm.L(3.0f);
                                    } else if (childAt == yv1Var.L2) {
                                        i9 = wi8.B(7.0f, qr1Var.e(), i9);
                                    } else if (ms1Var != null && childAt == ms1Var.f1) {
                                        i9 = wi8.B(9.0f, qr1Var.e(), i9);
                                    } else if (childAt == yv1Var.A0 || childAt == yv1Var.y0 || childAt == yv1Var.m3 || childAt == yv1Var.n3 || childAt == yv1Var.o3) {
                                        i10 = yv1Var.Xa;
                                    } else if (childAt != yv1Var.R) {
                                        aVar = ((d) yv1Var).actionBar;
                                        if (childAt == aVar) {
                                            i9 -= getPaddingTop();
                                            if (yv1Var.isInPreviewMode()) {
                                                L = gm.L(1.0f);
                                                i9 += L;
                                            }
                                        } else if (childAt == yv1Var.J8) {
                                            aVar2 = ((d) yv1Var).actionBar;
                                            i9 = aVar2.getMeasuredHeight();
                                        } else if (childAt != yv1Var.q3 && childAt != yv1Var.r3 && childAt != yv1Var.x0) {
                                            if (childAt instanceof l57) {
                                                i9 = gm.m;
                                            } else if (childAt != yv1Var.V) {
                                                if (childAt != yv1Var.c4) {
                                                }
                                            }
                                        }
                                    } else if (ms1Var.Y0()) {
                                        i9 -= gm.L(48.0f);
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
                    g = (measuredWidth - yv1Var.Ab) - measuredWidth2;
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
        cs1 cs1Var = yv1Var.n3;
        if (cs1Var != null) {
            cs1Var.setBackgroundHeight(getMeasuredHeight());
        }
        yv1Var.O7();
        yv1Var.Q7();
        yv1Var.vd(false, false);
        R();
        yv1Var.G5();
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
        u31 u31Var;
        a aVar4;
        a aVar5;
        int i6;
        a aVar6;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        pr1 pr1Var;
        r7 r7Var;
        a aVar7;
        r7 r7Var2;
        q6 q6Var;
        a aVar8;
        r7 r7Var3;
        TLRPC.User user;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        yv1 yv1Var = this.D0;
        qr1 qr1Var = yv1Var.w;
        int i7 = (size - yv1Var.zb) - yv1Var.Ab;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30);
        iz4 iz4Var = yv1Var.N.a;
        if (iz4Var instanceof jz4) {
            ((jz4) iz4Var).b(i7, size2);
        }
        int i8 = 0;
        if (this.o0 != i7) {
            yv1Var.T4 = false;
            this.o0 = makeMeasureSpec;
            z4 = ((d) yv1Var).inPreviewMode;
            if (z4 || (user = yv1Var.f) == null || !user.self) {
                yv1Var.ha = false;
            } else {
                lka titleTextView = yv1Var.p1.getTitleTextView();
                if (i7 - gm.L(152.0f) > gm.L(10.0f) + ((int) titleTextView.getPaint().measureText(titleTextView.getText(), 0, titleTextView.getText().length()))) {
                    z5 = !yv1Var.ia;
                    yv1Var.ha = z5;
                    if (!z5 || yv1Var.ia || m9c.x(yv1Var.f)) {
                        pr1Var = yv1Var.p1;
                        if (pr1Var != null && pr1Var.getLayoutParams() != null) {
                            ((ViewGroup.MarginLayoutParams) yv1Var.p1.getLayoutParams()).rightMargin = gm.L(yv1Var.g4 != 3 && ((r7Var = yv1Var.m0) == null || r7Var.getVisibility() != 0) ? 52.0f : 92.0f);
                        }
                    } else {
                        pr1 pr1Var2 = yv1Var.p1;
                        if (pr1Var2 != null && pr1Var2.getLayoutParams() != null) {
                            ((ViewGroup.MarginLayoutParams) yv1Var.p1.getLayoutParams()).rightMargin = gm.L(52.0f);
                        }
                    }
                    if (yv1Var.ha) {
                        r7 r7Var4 = yv1Var.j0;
                        if (r7Var4 != null) {
                            r7Var4.S(40);
                        }
                        r7 r7Var5 = yv1Var.p0;
                        if (r7Var5 != null) {
                            r7Var5.setVisibility(8);
                        }
                    } else {
                        aVar8 = ((d) yv1Var).actionBar;
                        if (!aVar8.o0 && (r7Var3 = yv1Var.p0) != null) {
                            r7Var3.setVisibility(0);
                        }
                        r7 r7Var6 = yv1Var.j0;
                        if (r7Var6 != null) {
                            r7Var6.u(40);
                        }
                    }
                    aVar7 = ((d) yv1Var).actionBar;
                    if (!aVar7.o0 && (q6Var = yv1Var.q0) != null) {
                        q6Var.e((yv1Var.ia || yv1Var.ha) ? 8 : 0);
                    }
                    r7Var2 = yv1Var.j0;
                    if (r7Var2 != null) {
                        TLRPC.UserFull userFull = yv1Var.s8;
                        if (yv1Var.ia) {
                            r7Var2.u(32);
                        } else if (userFull != null && userFull.phone_calls_available) {
                            r7Var2.S(32);
                        }
                    }
                    yv1Var.T4 = false;
                } else {
                    yv1Var.ha = false;
                }
            }
            z5 = false;
            if (z5) {
            }
            pr1Var = yv1Var.p1;
            if (pr1Var != null) {
                ((ViewGroup.MarginLayoutParams) yv1Var.p1.getLayoutParams()).rightMargin = gm.L(yv1Var.g4 != 3 && ((r7Var = yv1Var.m0) == null || r7Var.getVisibility() != 0) ? 52.0f : 92.0f);
            }
            if (yv1Var.ha) {
            }
            aVar7 = ((d) yv1Var).actionBar;
            if (!aVar7.o0) {
                q6Var.e((yv1Var.ia || yv1Var.ha) ? 8 : 0);
            }
            r7Var2 = yv1Var.j0;
            if (r7Var2 != null) {
            }
            yv1Var.T4 = false;
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        aVar = ((d) yv1Var).actionBar;
        measureChildWithMargins(aVar, makeMeasureSpec, 0, i2, 0);
        aVar2 = ((d) yv1Var).actionBar;
        int measuredHeight = aVar2.getMeasuredHeight();
        aVar3 = ((d) yv1Var).actionBar;
        if (aVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        boolean z6 = this.f + yv1Var.La >= gm.L(20.0f);
        if (this.n0 != size2) {
            Q();
        }
        int keyboardHeight = getKeyboardHeight();
        if (yv1Var.Ma > 0 && keyboardHeight <= gm.L(20.0f)) {
            i3 = yv1Var.Ma;
            yv1Var.La = i3;
        } else if (keyboardHeight <= gm.L(20.0f)) {
            i3 = yv1Var.a0.R0() ? yv1Var.a0.getEmojiPadding() : 0;
            yv1Var.La = i3;
        } else {
            yv1Var.La = 0;
            i3 = 0;
        }
        setEmojiKeyboardHeight(i3);
        boolean z7 = this.f + yv1Var.La >= gm.L(20.0f);
        if (MediaController.w().v0 != null && MediaController.w().v0.g4() && z6 != z7) {
            for (int i9 = 0; i9 < yv1Var.A0.getChildCount(); i9++) {
                View childAt = yv1Var.A0.getChildAt(i9);
                if (childAt instanceof rc2) {
                    k47 messageObject = ((rc2) childAt).getMessageObject();
                    if (messageObject.g4() && MediaController.w().D(messageObject)) {
                        yv1Var.A0.getClass();
                        int R = RecyclerView.R(childAt);
                        if (R >= 0) {
                            yv1Var.C0.h1(R, (int) (((((yv1Var.A0.getMeasuredHeight() - yv1Var.P9) - yv1Var.Ya) + ((this.f + yv1Var.La) - r1)) - (z7 ? gm.u : gm.b3(yv1Var.f8(), yv1Var.U7()))) / 2.0f), false);
                            yv1Var.D0.g(R);
                            this.I.g = true;
                            childCount = getChildCount();
                            int i10 = paddingTop;
                            measureChildWithMargins(yv1Var.a0, makeMeasureSpec, 0, i2, 0);
                            z = ((d) yv1Var).inPreviewMode;
                            if (!z || yv1Var.mb) {
                                this.m0 = 0;
                            } else {
                                this.m0 = yv1Var.a0.getMeasuredHeight();
                            }
                            yv1Var.Xa = 0;
                            yv1Var.Ya = 0;
                            if (gda.f() && !yv1Var.mb && yv1Var.H != null && Build.VERSION.SDK_INT >= 31) {
                                int i11 = yv1Var.I;
                                yv1Var.Xa = i11;
                                yv1Var.Ya = i11;
                            }
                            i4 = 0;
                            while (true) {
                                int i12 = -1;
                                if (i4 < childCount) {
                                    break;
                                }
                                View childAt2 = getChildAt(i4);
                                if (childAt2 != null && childAt2.getVisibility() != 8 && childAt2 != yv1Var.a0) {
                                    aVar4 = ((d) yv1Var).actionBar;
                                    if (childAt2 != aVar4) {
                                        if (a0(childAt2)) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                                        } else if (childAt2 == yv1Var.A0 || childAt2 == yv1Var.y0 || (childAt2 instanceof rkb)) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(gm.L(10.0f), yv1Var.Xa + size2 + yv1Var.Ya), TLObject.FLAG_30));
                                        } else if (childAt2 == yv1Var.R) {
                                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30);
                                            int L = gm.L(10.0f);
                                            int i13 = i10 - this.m0;
                                            z3 = ((d) yv1Var).inPreviewMode;
                                            childAt2.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(L, gm.L((yv1Var.a0.Y0() ? 48 : i8) + 2) + (i13 - (z3 ? gm.m : i8))), TLObject.FLAG_30));
                                        } else if (childAt2 == yv1Var.q3) {
                                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30);
                                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                                            yv1Var.q3.setInternalPadding(gm.L(12.0f) + qr1Var.e() + ((int) yv1Var.md));
                                            childAt2.measure(makeMeasureSpec3, makeMeasureSpec4);
                                        } else if (childAt2 == yv1Var.r3) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(((size2 - qr1Var.e()) - ((int) yv1Var.md)) - gm.L(12.0f), TLObject.FLAG_30));
                                        } else if (childAt2 == yv1Var.f1) {
                                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30));
                                        } else if (yv1Var.a0.S0(childAt2)) {
                                            gz1 gz1Var = yv1Var.a0.x2;
                                            if (childAt2 == gz1Var && gz1Var != null) {
                                                i12 = gz1Var.getKeyboardHeight();
                                            }
                                            z2 = ((d) yv1Var).inBubbleMode;
                                            if (z2) {
                                                int paddingTop2 = getPaddingTop() + (i10 - this.m0) + measuredHeight;
                                                if (i12 < 0) {
                                                    i12 = Math.max(Math.min(paddingTop2, gm.L(350.0f)), paddingTop2 / 2);
                                                }
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
                                            } else if (gm.E) {
                                                int paddingTop3 = getPaddingTop() + (((i10 - this.m0) + measuredHeight) - gm.m);
                                                if (i12 < 0) {
                                                    i12 = Math.max(Math.min(paddingTop3, gm.L(350.0f)), paddingTop3 / 2);
                                                }
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30));
                                            } else {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, TLObject.FLAG_30));
                                            }
                                        } else {
                                            es1 es1Var = yv1Var.X1;
                                            if (childAt2 == es1Var) {
                                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) es1Var.getLayoutParams();
                                                k17 adapter = yv1Var.X1.getAdapter();
                                                if (adapter.x0 == null || adapter.i0) {
                                                    yv1Var.X1.setIgnoreLayout(true);
                                                    layoutParams.height = i10;
                                                    layoutParams.topMargin = 0;
                                                    yv1Var.X1.setIgnoreLayout(false);
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(layoutParams.height, TLObject.FLAG_30));
                                                } else {
                                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
                                                }
                                            } else if (childAt2 == yv1Var.u9.m(getContext())) {
                                                int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30);
                                                int i14 = i10 + yv1Var.Xa;
                                                if (keyboardHeight <= gm.L(20.0f) || getLayoutParams().height >= 0 || yv1Var.mb) {
                                                    nu1 nu1Var = yv1Var.u9;
                                                    nu1Var.d0 = 0;
                                                    nu1Var.v();
                                                } else {
                                                    i14 += keyboardHeight;
                                                    nu1 nu1Var2 = yv1Var.u9;
                                                    nu1Var2.d0 = keyboardHeight;
                                                    nu1Var2.v();
                                                }
                                                childAt2.measure(makeMeasureSpec5, View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
                                            } else if (childAt2 instanceof l57) {
                                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((size2 - gm.m) - gm.n, TLObject.FLAG_30));
                                            } else if (childAt2 == yv1Var.g2) {
                                                aVar5 = ((d) yv1Var).actionBar;
                                                if (aVar5.getVisibility() == 0) {
                                                    aVar6 = ((d) yv1Var).actionBar;
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
                            if (yv1Var.S4) {
                                yv1Var.T4 = true;
                                yv1Var.O7();
                                yv1Var.Q7();
                                yv1Var.S4 = false;
                                vr1 vr1Var = yv1Var.A0;
                                vr1Var.measure(View.MeasureSpec.makeMeasureSpec(vr1Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(yv1Var.A0.getMeasuredHeight(), TLObject.FLAG_30));
                                yv1Var.T4 = false;
                            }
                            i5 = yv1Var.N4;
                            if (i5 != -1) {
                                gm.c3(new eh((Object) this, i5, (byte) 20));
                                yv1Var.N4 = -1;
                            }
                            u31Var = u31.x;
                            if (u31Var != null && yv1Var.Pc != null) {
                                u31Var.l();
                            }
                            yv1Var.f5();
                            this.n0 = size2;
                        }
                    }
                }
            }
        }
        dy1 dy1Var = yv1Var.a0.N4;
        gm.r(dy1Var);
        dy1Var.run();
        childCount = getChildCount();
        int i102 = paddingTop;
        measureChildWithMargins(yv1Var.a0, makeMeasureSpec, 0, i2, 0);
        z = ((d) yv1Var).inPreviewMode;
        if (z) {
        }
        this.m0 = 0;
        yv1Var.Xa = 0;
        yv1Var.Ya = 0;
        if (gda.f()) {
            int i112 = yv1Var.I;
            yv1Var.Xa = i112;
            yv1Var.Ya = i112;
        }
        i4 = 0;
        while (true) {
            int i122 = -1;
            if (i4 < childCount) {
            }
            i4++;
            i8 = 0;
        }
        if (yv1Var.S4) {
        }
        i5 = yv1Var.N4;
        if (i5 != -1) {
        }
        u31Var = u31.x;
        if (u31Var != null) {
            u31Var.l();
        }
        yv1Var.f5();
        this.n0 = size2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        yv1 yv1Var = this.D0;
        tl0.c(yv1Var.P8, yv1Var.fragmentView);
        yv1Var.Q8.d();
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
        yv1 yv1Var = this.D0;
        yv1Var.S9 = i2;
        yv1Var.O7();
        yv1Var.Q7();
    }

    @Override // ela
    public final void K() {
    }

    @Override // ela
    public final void V() {
    }

    @Override // ela
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
    }
}
