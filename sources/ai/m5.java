package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ph0;
import org.telegram.ui.qh0;
import org.telegram.ui.rh1;
import org.telegram.ui.vh1;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class m5 extends hm0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m5(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        switch (this.c) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            default:
                return false;
        }
    }

    public void F(int i10, int i11) {
        int[] iArr = ((l7) this.d).S0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override // s4.g0
    public final int h() {
        int i10 = this.c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((l7) obj).S0.length;
            case 1:
                return ((hg.q0) obj).V2.size();
            case 2:
                return 1;
            case 3:
                return ((fo0) obj).r.size();
            case 4:
                return ((qh0) obj).c.size();
            case 5:
                int[][] iArr = WallpapersListActivity.k0;
                return 12;
            default:
                return ((sg.j) obj).d.size();
        }
    }

    @Override // s4.g0
    public int j(int i10) {
        switch (this.c) {
            case 2:
                return i10;
            case 6:
                return ((sg.h) ((sg.j) this.d).d.get(i10)).a;
            default:
                return super.j(i10);
        }
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        switch (this.c) {
            case 0:
                org.telegram.ui.Components.ta taVar = (org.telegram.ui.Components.ta) b1Var.a;
                int i11 = ((l7) this.d).S0[(r0.length - 1) - i10];
                if (taVar.a != i11) {
                    taVar.a = i11;
                    taVar.requestLayout();
                    break;
                }
                break;
            case 1:
                ((hg.p0) b1Var).v.setData((hg.o0) ((hg.q0) this.d).V2.get(i10));
                break;
            case 2:
                break;
            case 3:
                View view = b1Var.a;
                fo0 fo0Var = (fo0) this.d;
                ArrayList arrayList = fo0Var.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    co0 co0Var = (co0) arrayList.get(i10);
                    eo0 eo0Var = (eo0) view;
                    ah.i1 i1Var = eo0Var.d;
                    boolean z10 = i1Var == null || !i1Var.equals(co0Var.a);
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = co0Var.a.g();
                        tL_reactionCount.count = co0Var.b;
                        fo0 fo0Var2 = eo0Var.s;
                        do0 do0Var = new do0(eo0Var, fo0Var2.a, eo0Var, tL_reactionCount, fo0Var2.c);
                        eo0Var.a = do0Var;
                        do0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        do0 do0Var2 = eo0Var.a;
                        do0Var2.q = true;
                        do0Var2.S = true;
                    } else {
                        eo0Var.a.w = co0Var.b;
                    }
                    eo0Var.d = co0Var.a;
                    if (!z10) {
                        do0 do0Var3 = eo0Var.a;
                        do0Var3.f = do0Var3.A;
                    }
                    eo0Var.a.A = AndroidUtilities.dp(44.33f);
                    eo0Var.a.u = !TextUtils.isEmpty(co0Var.c);
                    do0 do0Var4 = eo0Var.a;
                    boolean z11 = do0Var4.u;
                    org.telegram.ui.Components.p6 p6Var = do0Var4.G;
                    if (z11) {
                        p6Var.t(Emoji.replaceEmoji(co0Var.c, p6Var.a.getFontMetricsInt(), false), !z10, true);
                    } else if (p6Var != null) {
                        p6Var.t("", !z10, true);
                    }
                    do0 do0Var5 = eo0Var.a;
                    Integer.toString(co0Var.b);
                    do0Var5.getClass();
                    eo0Var.a.F.c(co0Var.b, !z10);
                    do0 do0Var6 = eo0Var.a;
                    if (do0Var6.F != null && (do0Var6.w > 0 || do0Var6.u)) {
                        do0Var6.A = (int) (AndroidUtilities.dp(eo0Var.a.u ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + eo0Var.a.G.d + do0Var6.A);
                    }
                    if (z10) {
                        do0 do0Var7 = eo0Var.a;
                        do0Var7.f = do0Var7.A;
                    }
                    eo0Var.a.B = AndroidUtilities.dp(28.0f);
                    do0 do0Var8 = eo0Var.a;
                    do0Var8.p = eo0Var.e;
                    if (eo0Var.r) {
                        do0Var8.a();
                    }
                    if (!z10) {
                        eo0Var.requestLayout();
                    }
                    ((eo0) view).a(co0Var.a.h == fo0Var.h, false);
                    break;
                }
                break;
            case 4:
                ph0 ph0Var = (ph0) b1Var.a;
                qh0 qh0Var = (qh0) this.d;
                ph0Var.a((TLObject) qh0Var.c.get(i10), false, ((Integer) qh0Var.b.get(i10)).intValue());
                break;
            case 5:
                ((rh1) b1Var.a).a = WallpapersListActivity.m0[i10];
                break;
            default:
                sg.j jVar = (sg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((sg.h) arrayList2.get(i10)).a == 1) {
                    sg.i iVar = (sg.i) b1Var.a;
                    iVar.c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.c.setImageDrawable(jVar.getContext().getDrawable(((sg.h) arrayList2.get(i10)).b));
                    iVar.a.setText(((sg.h) arrayList2.get(i10)).c);
                    iVar.b.setText(((sg.h) arrayList2.get(i10)).d);
                    break;
                }
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.c) {
            case 0:
                org.telegram.ui.Components.ta taVar = new org.telegram.ui.Components.ta(((l7) this.d).getContext());
                taVar.a = 0;
                return new sl0(taVar);
            case 1:
                hg.n0 n0Var = new hg.n0(viewGroup.getContext(), ((hg.q0) this.d).n2);
                hg.p0 p0Var = new hg.p0(n0Var);
                p0Var.v = n0Var;
                n0Var.setLayoutParams(new s4.o0(-2, AndroidUtilities.dp(30.0f)));
                return p0Var;
            case 2:
                return new sl0(((org.telegram.ui.Components.ua) this.d).X);
            case 3:
                fo0 fo0Var = (fo0) this.d;
                return new sl0(new eo0(fo0Var, fo0Var.getContext()));
            case 4:
                ph0 ph0Var = new ph0(viewGroup.getContext());
                ph0Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(50.0f)));
                return new sl0(ph0Var);
            case 5:
                vh1 vh1Var = (vh1) this.d;
                return new sl0(new rh1(vh1Var.E, vh1Var.c));
            default:
                sg.j jVar = (sg.j) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = jVar.a;
                if (i10 == 0) {
                    view = new sg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.s3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    sg.i iVar = new sg.i(context);
                    ImageView imageView = new ImageView(context);
                    iVar.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    iVar.addView(imageView, w7.z5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    iVar.a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    kk.o(org.telegram.ui.ActionBar.h6.G6, d6Var, textView, 1, 14.0f);
                    iVar.addView(textView, w7.z5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    iVar.b = textView2;
                    kk.o(org.telegram.ui.ActionBar.h6.y6, d6Var, textView2, 1, 14.0f);
                    iVar.addView(textView2, w7.z5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = iVar;
                }
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
        }
    }

    @Override // s4.g0
    public void y(s4.b1 b1Var) {
        switch (this.c) {
            case 3:
                fo0 fo0Var = (fo0) this.d;
                ArrayList arrayList = fo0Var.r;
                int b10 = b1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((eo0) b1Var.a).a(((co0) arrayList.get(b10)).a.h == fo0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void E(s4.b1 b1Var, int i10) {
    }
}
