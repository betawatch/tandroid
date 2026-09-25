package gg;

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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.sn0;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bj1;
import org.telegram.ui.xi1;
import org.telegram.ui.yh0;
import org.telegram.ui.zh0;
import w7.y5;
import yh.x3;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class n0 extends vl0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n0(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        switch (this.c) {
        }
        return false;
    }

    public void F(int i10, int i11) {
        int[] iArr = ((x3) this.d).P0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override // s4.h0
    public final int h() {
        int i10 = this.c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((s0) obj).X2.size();
            case 1:
                return 1;
            case 2:
                return ((un0) obj).r.size();
            case 3:
                return ((zh0) obj).c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.k0;
                return 12;
            case 5:
                return ((rg.j) obj).d.size();
            default:
                return ((x3) obj).P0.length;
        }
    }

    @Override // s4.h0
    public int j(int i10) {
        switch (this.c) {
            case 1:
                return i10;
            case 5:
                return ((rg.h) ((rg.j) this.d).d.get(i10)).a;
            default:
                return super.j(i10);
        }
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        switch (this.c) {
            case 0:
                ((r0) c1Var).v.setData((q0) ((s0) this.d).X2.get(i10));
                break;
            case 1:
                break;
            case 2:
                View view = c1Var.a;
                un0 un0Var = (un0) this.d;
                ArrayList arrayList = un0Var.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    rn0 rn0Var = (rn0) arrayList.get(i10);
                    tn0 tn0Var = (tn0) view;
                    zg.o0 o0Var = tn0Var.d;
                    boolean z10 = o0Var == null || !o0Var.equals(rn0Var.a);
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = rn0Var.a.g();
                        tL_reactionCount.count = rn0Var.b;
                        un0 un0Var2 = tn0Var.s;
                        sn0 sn0Var = new sn0(tn0Var, un0Var2.a, tn0Var, tL_reactionCount, un0Var2.c);
                        tn0Var.a = sn0Var;
                        sn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        sn0 sn0Var2 = tn0Var.a;
                        sn0Var2.q = true;
                        sn0Var2.S = true;
                    } else {
                        tn0Var.a.w = rn0Var.b;
                    }
                    tn0Var.d = rn0Var.a;
                    if (!z10) {
                        sn0 sn0Var3 = tn0Var.a;
                        sn0Var3.f = sn0Var3.A;
                    }
                    tn0Var.a.A = AndroidUtilities.dp(44.33f);
                    tn0Var.a.u = !TextUtils.isEmpty(rn0Var.c);
                    sn0 sn0Var4 = tn0Var.a;
                    boolean z11 = sn0Var4.u;
                    o6 o6Var = sn0Var4.G;
                    if (z11) {
                        o6Var.q(Emoji.replaceEmoji(rn0Var.c, o6Var.a.getFontMetricsInt(), false), !z10, true);
                    } else if (o6Var != null) {
                        o6Var.q("", !z10, true);
                    }
                    sn0 sn0Var5 = tn0Var.a;
                    Integer.toString(rn0Var.b);
                    sn0Var5.getClass();
                    tn0Var.a.F.c(rn0Var.b, !z10);
                    sn0 sn0Var6 = tn0Var.a;
                    if (sn0Var6.F != null && (sn0Var6.w > 0 || sn0Var6.u)) {
                        sn0Var6.A = (int) (AndroidUtilities.dp(tn0Var.a.u ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + tn0Var.a.G.d + sn0Var6.A);
                    }
                    if (z10) {
                        sn0 sn0Var7 = tn0Var.a;
                        sn0Var7.f = sn0Var7.A;
                    }
                    tn0Var.a.B = AndroidUtilities.dp(28.0f);
                    sn0 sn0Var8 = tn0Var.a;
                    sn0Var8.p = tn0Var.e;
                    if (tn0Var.r) {
                        sn0Var8.a();
                    }
                    if (!z10) {
                        tn0Var.requestLayout();
                    }
                    ((tn0) view).a(rn0Var.a.h == un0Var.h, false);
                    break;
                }
                break;
            case 3:
                yh0 yh0Var = (yh0) c1Var.a;
                zh0 zh0Var = (zh0) this.d;
                yh0Var.a((TLObject) zh0Var.c.get(i10), false, ((Integer) zh0Var.b.get(i10)).intValue());
                break;
            case 4:
                ((xi1) c1Var.a).a = WallpapersListActivity.m0[i10];
                break;
            case 5:
                rg.j jVar = (rg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((rg.h) arrayList2.get(i10)).a == 1) {
                    rg.i iVar = (rg.i) c1Var.a;
                    iVar.c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.c.setImageDrawable(jVar.getContext().getDrawable(((rg.h) arrayList2.get(i10)).b));
                    iVar.a.setText(((rg.h) arrayList2.get(i10)).c);
                    iVar.b.setText(((rg.h) arrayList2.get(i10)).d);
                    break;
                }
                break;
            default:
                ta taVar = (ta) c1Var.a;
                int i11 = ((x3) this.d).P0[(r0.length - 1) - i10];
                if (taVar.a != i11) {
                    taVar.a = i11;
                    taVar.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.c) {
            case 0:
                p0 p0Var = new p0(viewGroup.getContext(), ((s0) this.d).p2);
                r0 r0Var = new r0(p0Var);
                r0Var.v = p0Var;
                p0Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(30.0f)));
                return r0Var;
            case 1:
                return new gl0(((ua) this.d).X);
            case 2:
                un0 un0Var = (un0) this.d;
                return new gl0(new tn0(un0Var, un0Var.getContext()));
            case 3:
                yh0 yh0Var = new yh0(viewGroup.getContext());
                yh0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
                return new gl0(yh0Var);
            case 4:
                bj1 bj1Var = (bj1) this.d;
                return new gl0(new xi1(bj1Var.E, bj1Var.c));
            case 5:
                rg.j jVar = (rg.j) this.d;
                d6 d6Var = jVar.a;
                if (i10 == 0) {
                    view = new rg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new t3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    rg.i iVar = new rg.i(context);
                    ImageView imageView = new ImageView(context);
                    iVar.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    iVar.addView(imageView, y5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    iVar.a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    ok.n(h6.G6, d6Var, textView, 1, 14.0f);
                    iVar.addView(textView, y5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    iVar.b = textView2;
                    ok.n(h6.y6, d6Var, textView2, 1, 14.0f);
                    iVar.addView(textView2, y5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = iVar;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                ta taVar = new ta(((x3) this.d).getContext());
                taVar.a = 0;
                return new gl0(taVar);
        }
    }

    @Override // s4.h0
    public void y(s4.c1 c1Var) {
        switch (this.c) {
            case 2:
                un0 un0Var = (un0) this.d;
                ArrayList arrayList = un0Var.r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((tn0) c1Var.a).a(((rn0) arrayList.get(b10)).a.h == un0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void E(s4.c1 c1Var, int i10) {
    }
}
