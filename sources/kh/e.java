package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.o;
import ci.n1;
import ei.x3;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.s40;
import org.telegram.ui.pe;
import org.telegram.ui.sn;
import w7.z5;
import zf.i0;
import zf.j0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public class e extends FrameLayout implements ne.d, b6 {
    public static final int[] H;
    public static final int[] I;
    public static final int[] J;
    public static final RectF K;
    public float E;
    public final Paint F;
    public int G;
    public final o[] a;
    public final View.OnClickListener[] b;
    public final pe[] c;
    public d d;
    public final FrameLayout e;
    public final HashSet f;
    public final g6 h;
    public final bh.b n;
    public final eh.a r;
    public dh.d s;
    public final ne.b v;
    public final ne.b w;
    public float x;
    public float y;

    static {
        int i10 = R.drawable.msg_search;
        int i11 = R.drawable.input_gift_s;
        int i12 = R.drawable.input_message;
        int i13 = R.drawable.msg_help;
        H = new int[]{i10, i11, i12, i13, i13};
        I = new int[]{0};
        J = new int[]{1, 2, 3, 4};
        K = new RectF();
    }

    public e(Context context, bh.b bVar, eh.a aVar, g6 g6Var) {
        super(context);
        this.a = new o[5];
        this.b = new View.OnClickListener[5];
        this.c = new pe[5];
        this.f = new HashSet();
        bs bsVar = bs.h;
        this.v = new ne.b(99, this, bsVar, 320L, false);
        this.w = new ne.b(100, this, bsVar, 320L, false);
        this.F = new Paint(1);
        this.G = 0;
        this.n = bVar;
        this.r = aVar;
        this.h = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipToOutline(true);
        float dp = AndroidUtilities.dp(22.0f);
        n1 n1Var = j0.a;
        frameLayout.setOutlineProvider(new i0(0, dp));
        addView(frameLayout, z5.e(-1, 44, 16));
    }

    @Override // ne.d
    public final void H(float f7, int i10) {
        o oVar;
        x3 x3Var;
        if (i10 == 99 || i10 == 100) {
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            o[] oVarArr = this.a;
            if (i11 >= oVarArr.length || (oVar = oVarArr[i11]) == null || i12 != 1 || !((ne.b) oVar.c).f) {
                return;
            }
            pe peVar = this.c[i11];
            if (peVar != null) {
                final jh.a aVar = (jh.a) oVar.b;
                boolean z10 = oVar.a;
                int i13 = peVar.a;
                final sn snVar = peVar.b;
                switch (i13) {
                    case 26:
                        if (snVar.V0 == null && !z10 && (((x3Var = snVar.X0) == null || !x3Var.V) && s40.h.c())) {
                            final int i14 = 0;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ye
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            sn snVar2 = snVar;
                                            if (snVar2.getParentActivity() != null) {
                                                float f10 = snVar2.v.f(2).d / AndroidUtilities.density;
                                                float width = ((r3.getWidth() / 2.0f) + (snVar2.j1.getWidth() - (aVar.getX() + r3.getWidth()))) / AndroidUtilities.density;
                                                ei.x3 x3Var2 = new ei.x3(snVar2.getParentActivity(), 3);
                                                snVar2.V0 = x3Var2;
                                                x3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                snVar2.V0.p(false);
                                                snVar2.V0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                snVar2.V0.l(1.0f, (-width) + 7.33f);
                                                snVar2.j1.addView(snVar2.V0, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f10 + 50.0f));
                                                ei.x3 x3Var3 = snVar2.V0;
                                                x3Var3.l0 = new kg(snVar2, 3);
                                                x3Var3.u();
                                                org.telegram.ui.Components.s40.h.b();
                                                break;
                                            }
                                            break;
                                        default:
                                            sn snVar3 = snVar;
                                            if (snVar3.getParentActivity() != null) {
                                                float f11 = snVar3.v.f(2).d / AndroidUtilities.density;
                                                float width2 = ((r3.getWidth() / 2.0f) + (snVar3.j1.getWidth() - (aVar.getX() + r3.getWidth()))) / AndroidUtilities.density;
                                                ei.x3 x3Var4 = new ei.x3(snVar3.getParentActivity(), 3);
                                                snVar3.X0 = x3Var4;
                                                x3Var4.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                snVar3.X0.p(false);
                                                ei.x3 x3Var5 = snVar3.X0;
                                                String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                if (x3Var5.getMeasuredWidth() < 0) {
                                                    x3Var5.G = string;
                                                } else {
                                                    x3Var5.H.t(string, !LocaleController.isRTL, true);
                                                }
                                                snVar3.X0.l(1.0f, (-width2) + 7.33f);
                                                snVar3.j1.addView(snVar3.X0, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                ei.x3 x3Var6 = snVar3.X0;
                                                x3Var6.l0 = new kg(snVar3, 12);
                                                x3Var6.u();
                                                org.telegram.ui.Components.s40.f.b();
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
                        if (snVar.X0 == null && !z10 && s40.f.c()) {
                            final int i15 = 1;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ye
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i15) {
                                        case 0:
                                            sn snVar2 = snVar;
                                            if (snVar2.getParentActivity() != null) {
                                                float f10 = snVar2.v.f(2).d / AndroidUtilities.density;
                                                float width = ((r3.getWidth() / 2.0f) + (snVar2.j1.getWidth() - (aVar.getX() + r3.getWidth()))) / AndroidUtilities.density;
                                                ei.x3 x3Var2 = new ei.x3(snVar2.getParentActivity(), 3);
                                                snVar2.V0 = x3Var2;
                                                x3Var2.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                snVar2.V0.p(false);
                                                snVar2.V0.s(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                snVar2.V0.l(1.0f, (-width) + 7.33f);
                                                snVar2.j1.addView(snVar2.V0, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f10 + 50.0f));
                                                ei.x3 x3Var3 = snVar2.V0;
                                                x3Var3.l0 = new kg(snVar2, 3);
                                                x3Var3.u();
                                                org.telegram.ui.Components.s40.h.b();
                                                break;
                                            }
                                            break;
                                        default:
                                            sn snVar3 = snVar;
                                            if (snVar3.getParentActivity() != null) {
                                                float f11 = snVar3.v.f(2).d / AndroidUtilities.density;
                                                float width2 = ((r3.getWidth() / 2.0f) + (snVar3.j1.getWidth() - (aVar.getX() + r3.getWidth()))) / AndroidUtilities.density;
                                                ei.x3 x3Var4 = new ei.x3(snVar3.getParentActivity(), 3);
                                                snVar3.X0 = x3Var4;
                                                x3Var4.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                snVar3.X0.p(false);
                                                ei.x3 x3Var5 = snVar3.X0;
                                                String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                if (x3Var5.getMeasuredWidth() < 0) {
                                                    x3Var5.G = string;
                                                } else {
                                                    x3Var5.H.t(string, !LocaleController.isRTL, true);
                                                }
                                                snVar3.X0.l(1.0f, (-width2) + 7.33f);
                                                snVar3.j1.addView(snVar3.X0, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f11 + 50.0f));
                                                ei.x3 x3Var6 = snVar3.X0;
                                                x3Var6.l0 = new kg(snVar3, 12);
                                                x3Var6.u();
                                                org.telegram.ui.Components.s40.f.b();
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
            oVar.a = true;
        }
    }

    public final void a() {
        int[] iArr;
        float f7 = 0.0f;
        this.y = 0.0f;
        this.E = 0.0f;
        o[] oVarArr = this.a;
        for (o oVar : oVarArr) {
            if (oVar != null) {
                jh.a aVar = (jh.a) oVar.b;
                float f10 = ((ne.b) oVar.c).e * this.x;
                aVar.setVisibility(f10 > 0.0f ? 0 : 8);
                aVar.setAlpha(f10);
                aVar.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
                aVar.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
            }
        }
        int[] iArr2 = I;
        o oVar2 = oVarArr[iArr2[0]];
        if (oVar2 != null) {
            float dp = ((ne.b) oVar2.c).e * AndroidUtilities.dp(54.0f);
            ((jh.a) oVar2.b).setTranslationX(AndroidUtilities.dp(1.0f) + this.y);
            this.y += dp;
        }
        int i10 = 0;
        while (true) {
            iArr = J;
            if (i10 >= 4) {
                break;
            }
            o oVar3 = oVarArr[iArr[i10]];
            if (oVar3 != null) {
                jh.a aVar2 = (jh.a) oVar3.b;
                float dp2 = ((ne.b) oVar3.c).e * AndroidUtilities.dp(54.0f);
                aVar2.setTranslationX(((getMeasuredWidth() - aVar2.getMeasuredWidth()) - AndroidUtilities.dp(1.0f)) - this.E);
                this.E += dp2;
            }
            i10++;
        }
        if (this.x < 1.0f) {
            o oVar4 = oVarArr[iArr2[0]];
            if (oVar4 != null) {
                jh.a aVar3 = (jh.a) oVar4.b;
                aVar3.setTranslationX(aVar3.getTranslationX() - ((1.0f - this.x) * this.y));
            }
            for (int i11 = 0; i11 < 4; i11++) {
                o oVar5 = oVarArr[iArr[i11]];
                if (oVar5 != null) {
                    jh.a aVar4 = (jh.a) oVar5.b;
                    aVar4.setTranslationX(((1.0f - this.x) * this.E) + aVar4.getTranslationX());
                }
            }
            float f11 = this.y;
            float f12 = this.x;
            this.y = f11 * f12;
            this.E *= f12;
        }
        float f13 = this.w.e;
        if (f13 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth = getMeasuredWidth();
            for (int i12 = 0; i12 < getContainer().getChildCount(); i12++) {
                if (this.f.contains(getContainer().getChildAt(i12))) {
                    measuredWidth = Math.min(measuredWidth, r4.getLeft());
                    f7 = Math.max(f7, r4.getRight());
                }
            }
            if (measuredWidth > f7) {
                f7 = (measuredWidth + f7) / 2.0f;
                measuredWidth = f7;
            }
            this.y = AndroidUtilities.lerp(this.y, measuredWidth - AndroidUtilities.dp(3.33f), f13);
            this.E = AndroidUtilities.lerp(this.E, (getMeasuredWidth() - f7) - AndroidUtilities.dp(17.66f), f13);
        }
        d dVar = this.d;
        if (dVar != null) {
            float f14 = this.y;
            float f15 = this.E;
            ih.f fVar = ((pe) dVar).b.S;
            fVar.x = f14;
            fVar.y = f15;
            fVar.invalidate();
        }
    }

    public final void b(boolean z10) {
        int dp = AndroidUtilities.dp(7.0f);
        int dp2 = AndroidUtilities.dp(7.0f);
        int i10 = I[0];
        o[] oVarArr = this.a;
        o oVar = oVarArr[i10];
        if (oVar != null) {
            dp += ((ne.b) oVar.c).f ? AndroidUtilities.dp(54.0f) : 0;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            o oVar2 = oVarArr[J[i11]];
            if (oVar2 != null) {
                dp2 += ((ne.b) oVar2.c).f ? AndroidUtilities.dp(54.0f) : 0;
            }
        }
        FrameLayout frameLayout = this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.leftMargin == dp && marginLayoutParams.rightMargin == dp2) {
            return;
        }
        marginLayoutParams.leftMargin = dp;
        marginLayoutParams.rightMargin = dp2;
        if (z10) {
            frameLayout.requestLayout();
        }
    }

    public final void c(int i10, boolean z10, boolean z11) {
        o oVar;
        if (i10 >= 0) {
            o[] oVarArr = this.a;
            if (i10 < oVarArr.length && ((oVar = oVarArr[i10]) != null || z10)) {
                if (oVar == null) {
                    ne.b bVar = new ne.b((i10 << 16) | 1, this, bs.h, 300L, false);
                    jh.a d = jh.a.d(getContext(), this.n, this.r, this.h, H[i10], 48);
                    if (i10 == 1) {
                        d.setContentDescription(LocaleController.getString(R.string.ProfileActionsGift));
                    } else if (i10 == 2) {
                        d.setContentDescription(LocaleController.getString(R.string.ChannelOpenDirect));
                    } else if (i10 == 0) {
                        d.setContentDescription(LocaleController.getString(R.string.Search));
                    } else if (i10 == 3) {
                        d.setContentDescription(LocaleController.getString(R.string.BroadcastGroupInfo));
                    }
                    w7.b6.b(d, 0.13f, 2.0f);
                    d.setVisibility(8);
                    d.setOnClickListener(new ai.n1(this, i10, 4));
                    addView(d, z5.c(56.0f, 56));
                    o oVar2 = new o();
                    oVar2.b = d;
                    oVar2.c = bVar;
                    oVarArr[i10] = oVar2;
                    a();
                }
                ((ne.b) oVarArr[i10].c).a(z10, z11);
            }
        }
    }

    public final void d(boolean z10) {
        boolean z11 = false;
        z11 = false;
        if (getVisibility() == 0 && getContainer().getVisibility() == 0) {
            boolean z12 = false;
            for (int i10 = 0; i10 < getContainer().getChildCount(); i10++) {
                View childAt = getContainer().getChildAt(i10);
                if (this.f.contains(childAt) && childAt.getVisibility() == 0) {
                    z12 = true;
                }
            }
            z11 = z12;
        }
        this.w.a(z11, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10 = (int) (this.x * 255.0f * this.v.e);
        if (i10 > 0) {
            float dp = this.y + AndroidUtilities.dp(10.0f);
            float dp2 = AndroidUtilities.dp(9.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - this.E;
            float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(9.0f);
            RectF rectF = K;
            rectF.set(dp, dp2, measuredWidth, measuredHeight);
            int i11 = this.G;
            Paint paint = this.F;
            paint.setColor(i11);
            paint.setAlpha(i10);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.e && this.s != null) {
            float dp = this.y + AndroidUtilities.dp(1.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(1.0f)) - this.E;
            float measuredHeight = getMeasuredHeight();
            RectF rectF = K;
            rectF.set(dp, 0.0f, measuredWidth, measuredHeight);
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.s.setBounds(rect);
            this.s.draw(canvas);
        }
        return super.drawChild(canvas, view, j10);
    }

    public FrameLayout getContainer() {
        return this.e;
    }

    @Override // ne.d
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 99) {
            invalidate();
            return;
        }
        if (i10 == 100) {
            a();
            invalidate();
        }
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            o[] oVarArr = this.a;
            if (i11 >= oVarArr.length || oVarArr[i11] == null || i12 != 1) {
                return;
            }
            b(true);
            a();
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        b(false);
        super.onMeasure(i10, i11);
        a();
    }

    public void setAccentColor(int i10) {
        this.G = i10;
    }

    public void setOnButtonsTotalWidthChanged(d dVar) {
        this.d = dVar;
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.x != f7) {
            this.x = f7;
            a();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d(false);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        jh.a aVar;
        for (o oVar : this.a) {
            if (oVar != null && (aVar = (jh.a) oVar.b) != null) {
                aVar.updateColors();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
