package lh;

import ai.v;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.n;
import bg.q0;
import bg.s0;
import bg.u0;
import c8.ha;
import c8.ka;
import fi.m3;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.z20;
import org.telegram.ui.an;
import org.telegram.ui.fe;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class e extends FrameLayout implements te.b, a6 {
    public static final int[] H = {R.drawable.msg_search, R.drawable.input_gift_s, R.drawable.input_message, R.drawable.msg_help, R.drawable.msg_help};
    public static final int[] I = {0};
    public static final int[] J = {1, 2, 3, 4};
    public static final RectF K = new RectF();
    public float D;
    public float E;
    public final Paint F;
    public int G;
    public final n[] a;
    public final View.OnClickListener[] b;
    public final fe[] c;
    public d d;
    public final FrameLayout e;
    public final HashSet f;
    public final f6 h;
    public final dh.c n;
    public final gh.a r;
    public fh.g s;
    public final te.a w;
    public final te.a x;
    public float y;

    public e(Context context, dh.c cVar, gh.a aVar, f6 f6Var) {
        super(context);
        this.a = new n[5];
        this.b = new View.OnClickListener[5];
        this.c = new fe[5];
        this.f = new HashSet();
        xq xqVar = xq.h;
        this.w = new te.a(99, this, xqVar, 320L, false);
        this.x = new te.a(100, this, xqVar, 320L, false);
        this.F = new Paint(1);
        this.G = 0;
        this.n = cVar;
        this.r = aVar;
        this.h = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipToOutline(true);
        float L = g0.L(22.0f);
        q0 q0Var = u0.a;
        frameLayout.setOutlineProvider(new s0(0, L));
        addView(frameLayout, ha.e(-1, 44, 16));
    }

    @Override // te.b
    public final void F(float f10, int i7) {
        n nVar;
        m3 m3Var;
        if (i7 == 99 || i7 == 100) {
            invalidate();
        }
        int i10 = i7 >> 16;
        int i11 = i7 & 65535;
        if (i10 >= 0) {
            n[] nVarArr = this.a;
            if (i10 >= nVarArr.length || (nVar = nVarArr[i10]) == null || i11 != 1 || !((te.a) nVar.d).f) {
                return;
            }
            fe feVar = this.c[i10];
            if (feVar != null) {
                final kh.a aVar = (kh.a) nVar.c;
                boolean z9 = nVar.b;
                int i12 = feVar.a;
                final an anVar = feVar.b;
                switch (i12) {
                    case 27:
                        if (anVar.X0 == null && !z9 && (((m3Var = anVar.Z0) == null || !m3Var.V) && z20.h.c())) {
                            final int i13 = 1;
                            g0.i3(new Runnable() { // from class: org.telegram.ui.lf
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i14 = i13;
                                    kh.a aVar2 = aVar;
                                    an anVar2 = anVar;
                                    switch (i14) {
                                        case 0:
                                            if (anVar2.getParentActivity() != null) {
                                                float f11 = anVar2.w.f(2).d / org.telegram.messenger.g0.p;
                                                float width = ((aVar2.getWidth() / 2.0f) + (anVar2.l1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.p;
                                                fi.m3 m3Var2 = new fi.m3(anVar2.getParentActivity(), 3);
                                                anVar2.Z0 = m3Var2;
                                                m3Var2.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                anVar2.Z0.l(anVar2.K);
                                                anVar2.Z0.r(false);
                                                fi.m3 m3Var3 = anVar2.Z0;
                                                String M0 = org.telegram.messenger.hd.M0(2131744425, null);
                                                if (m3Var3.getMeasuredWidth() < 0) {
                                                    m3Var3.G = M0;
                                                } else {
                                                    m3Var3.H.t(M0, !org.telegram.messenger.hd.a0, true);
                                                }
                                                anVar2.Z0.o(1.0f, (-width) + 7.33f);
                                                anVar2.l1.addView(anVar2.Z0, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                fi.m3 m3Var4 = anVar2.Z0;
                                                m3Var4.q0 = new xf(anVar2, 14);
                                                m3Var4.w();
                                                org.telegram.ui.Components.z20.f.b();
                                                break;
                                            }
                                            break;
                                        default:
                                            if (anVar2.getParentActivity() != null) {
                                                float f12 = anVar2.w.f(2).d / org.telegram.messenger.g0.p;
                                                float width2 = ((aVar2.getWidth() / 2.0f) + (anVar2.l1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.p;
                                                fi.m3 m3Var5 = new fi.m3(anVar2.getParentActivity(), 3);
                                                anVar2.X0 = m3Var5;
                                                m3Var5.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                anVar2.X0.l(anVar2.K);
                                                anVar2.X0.r(false);
                                                anVar2.X0.u(org.telegram.messenger.hd.M0(2131750250, null));
                                                anVar2.X0.o(1.0f, (-width2) + 7.33f);
                                                anVar2.l1.addView(anVar2.X0, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                fi.m3 m3Var6 = anVar2.X0;
                                                m3Var6.q0 = new af(anVar2, 20);
                                                m3Var6.w();
                                                org.telegram.ui.Components.z20.h.b();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, 400L);
                            break;
                        }
                        break;
                    default:
                        if (anVar.Z0 == null && !z9 && z20.f.c()) {
                            final int i14 = 0;
                            g0.i3(new Runnable() { // from class: org.telegram.ui.lf
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i142 = i14;
                                    kh.a aVar2 = aVar;
                                    an anVar2 = anVar;
                                    switch (i142) {
                                        case 0:
                                            if (anVar2.getParentActivity() != null) {
                                                float f11 = anVar2.w.f(2).d / org.telegram.messenger.g0.p;
                                                float width = ((aVar2.getWidth() / 2.0f) + (anVar2.l1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.p;
                                                fi.m3 m3Var2 = new fi.m3(anVar2.getParentActivity(), 3);
                                                anVar2.Z0 = m3Var2;
                                                m3Var2.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                anVar2.Z0.l(anVar2.K);
                                                anVar2.Z0.r(false);
                                                fi.m3 m3Var3 = anVar2.Z0;
                                                String M0 = org.telegram.messenger.hd.M0(2131744425, null);
                                                if (m3Var3.getMeasuredWidth() < 0) {
                                                    m3Var3.G = M0;
                                                } else {
                                                    m3Var3.H.t(M0, !org.telegram.messenger.hd.a0, true);
                                                }
                                                anVar2.Z0.o(1.0f, (-width) + 7.33f);
                                                anVar2.l1.addView(anVar2.Z0, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                fi.m3 m3Var4 = anVar2.Z0;
                                                m3Var4.q0 = new xf(anVar2, 14);
                                                m3Var4.w();
                                                org.telegram.ui.Components.z20.f.b();
                                                break;
                                            }
                                            break;
                                        default:
                                            if (anVar2.getParentActivity() != null) {
                                                float f12 = anVar2.w.f(2).d / org.telegram.messenger.g0.p;
                                                float width2 = ((aVar2.getWidth() / 2.0f) + (anVar2.l1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.p;
                                                fi.m3 m3Var5 = new fi.m3(anVar2.getParentActivity(), 3);
                                                anVar2.X0 = m3Var5;
                                                m3Var5.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                anVar2.X0.l(anVar2.K);
                                                anVar2.X0.r(false);
                                                anVar2.X0.u(org.telegram.messenger.hd.M0(2131750250, null));
                                                anVar2.X0.o(1.0f, (-width2) + 7.33f);
                                                anVar2.l1.addView(anVar2.X0, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                fi.m3 m3Var6 = anVar2.X0;
                                                m3Var6.q0 = new af(anVar2, 20);
                                                m3Var6.w();
                                                org.telegram.ui.Components.z20.h.b();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, 400L);
                            break;
                        }
                        break;
                }
            }
            nVar.b = true;
        }
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 99) {
            invalidate();
            return;
        }
        if (i7 == 100) {
            a();
            invalidate();
        }
        int i10 = i7 >> 16;
        int i11 = i7 & 65535;
        if (i10 >= 0) {
            n[] nVarArr = this.a;
            if (i10 >= nVarArr.length || nVarArr[i10] == null || i11 != 1) {
                return;
            }
            b(true);
            a();
            invalidate();
        }
    }

    public final void a() {
        int[] iArr;
        float f10 = 0.0f;
        this.D = 0.0f;
        this.E = 0.0f;
        n[] nVarArr = this.a;
        for (n nVar : nVarArr) {
            if (nVar != null) {
                kh.a aVar = (kh.a) nVar.c;
                float f11 = ((te.a) nVar.d).e * this.y;
                aVar.setVisibility(f11 > 0.0f ? 0 : 8);
                aVar.setAlpha(f11);
                aVar.setScaleX(g0.T1(0.4f, 1.0f, f11));
                aVar.setScaleY(g0.T1(0.4f, 1.0f, f11));
            }
        }
        int[] iArr2 = I;
        n nVar2 = nVarArr[iArr2[0]];
        if (nVar2 != null) {
            float L = ((te.a) nVar2.d).e * g0.L(54.0f);
            ((kh.a) nVar2.c).setTranslationX(g0.L(1.0f) + this.D);
            this.D += L;
        }
        int i7 = 0;
        while (true) {
            iArr = J;
            if (i7 >= 4) {
                break;
            }
            n nVar3 = nVarArr[iArr[i7]];
            if (nVar3 != null) {
                kh.a aVar2 = (kh.a) nVar3.c;
                float L2 = ((te.a) nVar3.d).e * g0.L(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - g0.L(1.0f)) - this.E);
                this.E += L2;
            }
            i7++;
        }
        if (this.y < 1.0f) {
            n nVar4 = nVarArr[iArr2[0]];
            if (nVar4 != null) {
                kh.a aVar3 = (kh.a) nVar4.c;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.y) * this.D));
            }
            for (int i10 = 0; i10 < 4; i10++) {
                n nVar5 = nVarArr[iArr[i10]];
                if (nVar5 != null) {
                    kh.a aVar4 = (kh.a) nVar5.c;
                    aVar4.setTranslationX(((1.0f - this.y) * this.E) + aVar4.getTranslationX());
                }
            }
            float f12 = this.D;
            float f13 = this.y;
            this.D = f12 * f13;
            this.E *= f13;
        }
        float f14 = this.x.e;
        if (f14 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i11 = 0; i11 < getContainer().getChildCount(); i11++) {
                if (this.f.contains(getContainer().getChildAt(i11))) {
                    measuredWidth = Math.min(measuredWidth, r4.getLeft());
                    f10 = Math.max(f10, r4.getRight());
                }
            }
            if (measuredWidth > f10) {
                f10 = (measuredWidth + f10) / 2.0f;
                measuredWidth = f10;
            }
            this.D = g0.T1(this.D, measuredWidth - g0.L(3.33f), f14);
            this.E = g0.T1(this.E, (getMeasuredWidth() - f10) - g0.L(17.66f), f14);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f15 = this.D;
            float f16 = this.E;
            jh.f fVar = ((fe) dVar).b.T;
            fVar.y = f15;
            fVar.D = f16;
            fVar.invalidate();
        }
    }

    public final void b(boolean z9) {
        int L = g0.L(7.0f);
        int L2 = g0.L(7.0f);
        int i7 = I[0];
        n[] nVarArr = this.a;
        n nVar = nVarArr[i7];
        if (nVar != null) {
            L += ((te.a) nVar.d).f ? g0.L(54.0f) : 0;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            n nVar2 = nVarArr[J[i10]];
            if (nVar2 != null) {
                L2 += ((te.a) nVar2.d).f ? g0.L(54.0f) : 0;
            }
        }
        FrameLayout frameLayout = this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.leftMargin == L && marginLayoutParams.rightMargin == L2) {
            return;
        }
        marginLayoutParams.leftMargin = L;
        marginLayoutParams.rightMargin = L2;
        if (z9) {
            frameLayout.requestLayout();
        }
    }

    public final void c(int i7, boolean z9, boolean z10) {
        n nVar;
        if (i7 >= 0) {
            n[] nVarArr = this.a;
            if (i7 < nVarArr.length && ((nVar = nVarArr[i7]) != null || z9)) {
                if (nVar == null) {
                    te.a aVar = new te.a((i7 << 16) | 1, this, xq.h, 300L, false);
                    kh.a d = kh.a.d(getContext(), this.n, this.r, this.h, H[i7], 48);
                    if (i7 == 1) {
                        d.setContentDescription(hd.M0(2131746734, null));
                    } else if (i7 == 2) {
                        d.setContentDescription(hd.M0(2131752337, null));
                    } else if (i7 == 0) {
                        d.setContentDescription(hd.M0(2131745837, null));
                    } else if (i7 == 3) {
                        d.setContentDescription(hd.M0(2131752880, null));
                    }
                    ka.b(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new v(this, i7, 5));
                    addView(d, ha.c(56.0f, 56));
                    nVarArr[i7] = new n(d, aVar);
                    a();
                }
                ((te.a) nVarArr[i7].d).a(z9, z10);
            }
        }
    }

    public final void d(boolean z9) {
        boolean z10 = false;
        z10 = false;
        if (getVisibility() == 0 && getContainer().getVisibility() == 0) {
            boolean z11 = false;
            for (int i7 = 0; i7 < getContainer().getChildCount(); i7++) {
                View childAt = getContainer().getChildAt(i7);
                if (this.f.contains(childAt) && childAt.getVisibility() == 0) {
                    z11 = true;
                }
            }
            z10 = z11;
        }
        this.x.a(z10, z9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i7 = (int) (this.y * 255.0f * this.w.e);
        if (i7 > 0) {
            float L = this.D + g0.L(10.0f);
            float L2 = g0.L(9.0f);
            float measuredWidth = (getMeasuredWidth() - g0.L(10.0f)) - this.E;
            float measuredHeight = getMeasuredHeight() - g0.L(9.0f);
            RectF rectF = K;
            rectF.set(L, L2, measuredWidth, measuredHeight);
            int i10 = this.G;
            Paint paint = this.F;
            paint.setColor(i10);
            paint.setAlpha(i7);
            canvas.drawRoundRect(rectF, g0.L(19.0f), g0.L(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.e && this.s != null) {
            float L = this.D + g0.L(1.0f);
            float measuredWidth = (getMeasuredWidth() - g0.L(1.0f)) - this.E;
            float measuredHeight = getMeasuredHeight();
            RectF rectF = K;
            rectF.set(L, 0.0f, measuredWidth, measuredHeight);
            Rect rect = g0.Q;
            rectF.round(rect);
            this.s.setBounds(rect);
            this.s.draw(canvas);
        }
        return super.drawChild(canvas, view, j3);
    }

    public FrameLayout getContainer() {
        return this.e;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        b(false);
        super.onMeasure(i7, i10);
        a();
    }

    public void setAccentColor(int i7) {
        this.G = i7;
    }

    public void setOnButtonsTotalWidthChanged(d dVar) {
        this.d = dVar;
    }

    public void setTotalVisibilityFactor(float f10) {
        if (this.y != f10) {
            this.y = f10;
            a();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        d(false);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        kh.a aVar;
        for (n nVar : this.a) {
            if (nVar != null && (aVar = (kh.a) nVar.c) != null) {
                aVar.updateColors();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
