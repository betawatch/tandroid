package lh;

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
import c8.ma;
import c8.ra;
import ci.q;
import hi.l3;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.nr;
import org.telegram.ui.bn;
import org.telegram.ui.dh;
import org.telegram.ui.ee;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public class e extends FrameLayout implements te.b, b6 {
    public static final int[] I = {R.drawable.msg_search, R.drawable.input_gift_s, R.drawable.input_message, R.drawable.msg_help, R.drawable.msg_help};
    public static final int[] J = {0};
    public static final int[] K = {1, 2, 3, 4};
    public static final RectF L = new RectF();
    public float E;
    public float F;
    public final Paint G;
    public int H;
    public final n[] a;
    public final View.OnClickListener[] b;
    public final ee[] c;
    public d d;
    public final FrameLayout e;
    public final HashSet f;
    public final h6 h;
    public final dh.c n;
    public final gh.a r;
    public fh.g s;
    public final te.a w;
    public final te.a x;
    public float y;

    public e(Context context, dh.c cVar, gh.a aVar, h6 h6Var) {
        super(context);
        this.a = new n[5];
        this.b = new View.OnClickListener[5];
        this.c = new ee[5];
        this.f = new HashSet();
        nr nrVar = nr.h;
        this.w = new te.a(99, this, nrVar, 320L, false);
        this.x = new te.a(100, this, nrVar, 320L, false);
        this.G = new Paint(1);
        this.H = 0;
        this.n = cVar;
        this.r = aVar;
        this.h = h6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipToOutline(true);
        float L2 = g0.L(22.0f);
        q0 q0Var = u0.a;
        frameLayout.setOutlineProvider(new s0(0, L2));
        addView(frameLayout, ma.e(-1, 44, 16));
    }

    @Override // te.b
    public final void D(float f10, int i7) {
        n nVar;
        l3 l3Var;
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
            ee eeVar = this.c[i10];
            if (eeVar != null) {
                final kh.a aVar = (kh.a) nVar.c;
                boolean z10 = nVar.b;
                int i12 = eeVar.a;
                final bn bnVar = eeVar.b;
                switch (i12) {
                    case 28:
                        if (bnVar.Y0 == null && !z10 && (((l3Var = bnVar.a1) == null || !l3Var.W) && n30.h.c())) {
                            final int i13 = 1;
                            g0.h3(new Runnable() { // from class: org.telegram.ui.lf
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i14 = i13;
                                    kh.a aVar2 = aVar;
                                    bn bnVar2 = bnVar;
                                    switch (i14) {
                                        case 0:
                                            if (bnVar2.getParentActivity() != null) {
                                                float f11 = bnVar2.w.f(2).d / org.telegram.messenger.g0.p;
                                                float width = ((aVar2.getWidth() / 2.0f) + (bnVar2.m1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.p;
                                                hi.l3 l3Var2 = new hi.l3(bnVar2.getParentActivity(), 3);
                                                bnVar2.a1 = l3Var2;
                                                l3Var2.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                bnVar2.a1.l(bnVar2.L);
                                                bnVar2.a1.r(false);
                                                hi.l3 l3Var3 = bnVar2.a1;
                                                String N0 = org.telegram.messenger.gd.N0(2131744183, null);
                                                if (l3Var3.getMeasuredWidth() < 0) {
                                                    l3Var3.H = N0;
                                                } else {
                                                    l3Var3.I.t(N0, !org.telegram.messenger.gd.a0, true);
                                                }
                                                bnVar2.a1.o(1.0f, (-width) + 7.33f);
                                                bnVar2.m1.addView(bnVar2.a1, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                hi.l3 l3Var4 = bnVar2.a1;
                                                l3Var4.r0 = new vf(bnVar2, 14);
                                                l3Var4.x();
                                                org.telegram.ui.Components.n30.f.b();
                                                break;
                                            }
                                            break;
                                        default:
                                            if (bnVar2.getParentActivity() != null) {
                                                float f12 = bnVar2.w.f(2).d / org.telegram.messenger.g0.p;
                                                float width2 = ((aVar2.getWidth() / 2.0f) + (bnVar2.m1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.p;
                                                hi.l3 l3Var5 = new hi.l3(bnVar2.getParentActivity(), 3);
                                                bnVar2.Y0 = l3Var5;
                                                l3Var5.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                bnVar2.Y0.l(bnVar2.L);
                                                bnVar2.Y0.r(false);
                                                bnVar2.Y0.v(org.telegram.messenger.gd.N0(2131750234, null));
                                                bnVar2.Y0.o(1.0f, (-width2) + 7.33f);
                                                bnVar2.m1.addView(bnVar2.Y0, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                hi.l3 l3Var6 = bnVar2.Y0;
                                                l3Var6.r0 = new af(bnVar2, 17);
                                                l3Var6.x();
                                                org.telegram.ui.Components.n30.h.b();
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
                        if (bnVar.a1 == null && !z10 && n30.f.c()) {
                            final int i14 = 0;
                            g0.h3(new Runnable() { // from class: org.telegram.ui.lf
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i142 = i14;
                                    kh.a aVar2 = aVar;
                                    bn bnVar2 = bnVar;
                                    switch (i142) {
                                        case 0:
                                            if (bnVar2.getParentActivity() != null) {
                                                float f11 = bnVar2.w.f(2).d / org.telegram.messenger.g0.p;
                                                float width = ((aVar2.getWidth() / 2.0f) + (bnVar2.m1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.p;
                                                hi.l3 l3Var2 = new hi.l3(bnVar2.getParentActivity(), 3);
                                                bnVar2.a1 = l3Var2;
                                                l3Var2.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                bnVar2.a1.l(bnVar2.L);
                                                bnVar2.a1.r(false);
                                                hi.l3 l3Var3 = bnVar2.a1;
                                                String N0 = org.telegram.messenger.gd.N0(2131744183, null);
                                                if (l3Var3.getMeasuredWidth() < 0) {
                                                    l3Var3.H = N0;
                                                } else {
                                                    l3Var3.I.t(N0, !org.telegram.messenger.gd.a0, true);
                                                }
                                                bnVar2.a1.o(1.0f, (-width) + 7.33f);
                                                bnVar2.m1.addView(bnVar2.a1, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                hi.l3 l3Var4 = bnVar2.a1;
                                                l3Var4.r0 = new vf(bnVar2, 14);
                                                l3Var4.x();
                                                org.telegram.ui.Components.n30.f.b();
                                                break;
                                            }
                                            break;
                                        default:
                                            if (bnVar2.getParentActivity() != null) {
                                                float f12 = bnVar2.w.f(2).d / org.telegram.messenger.g0.p;
                                                float width2 = ((aVar2.getWidth() / 2.0f) + (bnVar2.m1.getWidth() - (aVar2.getX() + aVar2.getWidth()))) / org.telegram.messenger.g0.p;
                                                hi.l3 l3Var5 = new hi.l3(bnVar2.getParentActivity(), 3);
                                                bnVar2.Y0 = l3Var5;
                                                l3Var5.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                                                bnVar2.Y0.l(bnVar2.L);
                                                bnVar2.Y0.r(false);
                                                bnVar2.Y0.v(org.telegram.messenger.gd.N0(2131750234, null));
                                                bnVar2.Y0.o(1.0f, (-width2) + 7.33f);
                                                bnVar2.m1.addView(bnVar2.Y0, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f12 + 50.0f));
                                                hi.l3 l3Var6 = bnVar2.Y0;
                                                l3Var6.r0 = new af(bnVar2, 17);
                                                l3Var6.x();
                                                org.telegram.ui.Components.n30.h.b();
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
    public final void H(int i7, float f10, float f11, te.c cVar) {
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
        this.E = 0.0f;
        this.F = 0.0f;
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
        int[] iArr2 = J;
        n nVar2 = nVarArr[iArr2[0]];
        if (nVar2 != null) {
            float L2 = ((te.a) nVar2.d).e * g0.L(54.0f);
            ((kh.a) nVar2.c).setTranslationX(g0.L(1.0f) + this.E);
            this.E += L2;
        }
        int i7 = 0;
        while (true) {
            iArr = K;
            if (i7 >= 4) {
                break;
            }
            n nVar3 = nVarArr[iArr[i7]];
            if (nVar3 != null) {
                kh.a aVar2 = (kh.a) nVar3.c;
                float L3 = ((te.a) nVar3.d).e * g0.L(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - g0.L(1.0f)) - this.F);
                this.F += L3;
            }
            i7++;
        }
        if (this.y < 1.0f) {
            n nVar4 = nVarArr[iArr2[0]];
            if (nVar4 != null) {
                kh.a aVar3 = (kh.a) nVar4.c;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.y) * this.E));
            }
            for (int i10 = 0; i10 < 4; i10++) {
                n nVar5 = nVarArr[iArr[i10]];
                if (nVar5 != null) {
                    kh.a aVar4 = (kh.a) nVar5.c;
                    aVar4.setTranslationX(((1.0f - this.y) * this.F) + aVar4.getTranslationX());
                }
            }
            float f12 = this.E;
            float f13 = this.y;
            this.E = f12 * f13;
            this.F *= f13;
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
            this.E = g0.T1(this.E, measuredWidth - g0.L(3.33f), f14);
            this.F = g0.T1(this.F, (getMeasuredWidth() - f10) - g0.L(17.66f), f14);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f15 = this.E;
            float f16 = this.F;
            jh.f fVar = ((dh) dVar).a.U;
            fVar.F = f15;
            fVar.G = f16;
            fVar.invalidate();
        }
    }

    public final void b(boolean z10) {
        int L2 = g0.L(7.0f);
        int L3 = g0.L(7.0f);
        int i7 = J[0];
        n[] nVarArr = this.a;
        n nVar = nVarArr[i7];
        if (nVar != null) {
            L2 += ((te.a) nVar.d).f ? g0.L(54.0f) : 0;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            n nVar2 = nVarArr[K[i10]];
            if (nVar2 != null) {
                L3 += ((te.a) nVar2.d).f ? g0.L(54.0f) : 0;
            }
        }
        FrameLayout frameLayout = this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.leftMargin == L2 && marginLayoutParams.rightMargin == L3) {
            return;
        }
        marginLayoutParams.leftMargin = L2;
        marginLayoutParams.rightMargin = L3;
        if (z10) {
            frameLayout.requestLayout();
        }
    }

    public final void c(int i7, boolean z10, boolean z11) {
        n nVar;
        if (i7 >= 0) {
            n[] nVarArr = this.a;
            if (i7 < nVarArr.length && ((nVar = nVarArr[i7]) != null || z10)) {
                if (nVar == null) {
                    te.a aVar = new te.a((i7 << 16) | 1, this, nr.h, 300L, false);
                    kh.a d = kh.a.d(getContext(), this.n, this.r, this.h, I[i7], 48);
                    if (i7 == 1) {
                        d.setContentDescription(gd.N0(2131746541, null));
                    } else if (i7 == 2) {
                        d.setContentDescription(gd.N0(2131752325, null));
                    } else if (i7 == 0) {
                        d.setContentDescription(gd.N0(2131745640, null));
                    } else if (i7 == 3) {
                        d.setContentDescription(gd.N0(2131752868, null));
                    }
                    ra.b(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new q(this, i7, 5));
                    addView(d, ma.c(56.0f, 56));
                    nVarArr[i7] = new n(d, aVar);
                    a();
                }
                ((te.a) nVarArr[i7].d).a(z10, z11);
            }
        }
    }

    public final void d(boolean z10) {
        boolean z11 = false;
        z11 = false;
        if (getVisibility() == 0 && getContainer().getVisibility() == 0) {
            boolean z12 = false;
            for (int i7 = 0; i7 < getContainer().getChildCount(); i7++) {
                View childAt = getContainer().getChildAt(i7);
                if (this.f.contains(childAt) && childAt.getVisibility() == 0) {
                    z12 = true;
                }
            }
            z11 = z12;
        }
        this.x.a(z11, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i7 = (int) (this.y * 255.0f * this.w.e);
        if (i7 > 0) {
            float L2 = this.E + g0.L(10.0f);
            float L3 = g0.L(9.0f);
            float measuredWidth = (getMeasuredWidth() - g0.L(10.0f)) - this.F;
            float measuredHeight = getMeasuredHeight() - g0.L(9.0f);
            RectF rectF = L;
            rectF.set(L2, L3, measuredWidth, measuredHeight);
            int i10 = this.H;
            Paint paint = this.G;
            paint.setColor(i10);
            paint.setAlpha(i7);
            canvas.drawRoundRect(rectF, g0.L(19.0f), g0.L(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.e && this.s != null) {
            float L2 = this.E + g0.L(1.0f);
            float measuredWidth = (getMeasuredWidth() - g0.L(1.0f)) - this.F;
            float measuredHeight = getMeasuredHeight();
            RectF rectF = L;
            rectF.set(L2, 0.0f, measuredWidth, measuredHeight);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        b(false);
        super.onMeasure(i7, i10);
        a();
    }

    public void setAccentColor(int i7) {
        this.H = i7;
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        kh.a aVar;
        for (n nVar : this.a) {
            if (nVar != null && (aVar = (kh.a) nVar.c) != null) {
                aVar.updateColors();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
