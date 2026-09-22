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
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ei0;
import org.telegram.ui.fi0;
import org.telegram.ui.fj1;
import org.telegram.ui.jj1;
import w7.x5;
import yh.z3;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class n0 extends kl0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n0(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        switch (this.c) {
        }
        return false;
    }

    public void F(int i10, int i11) {
        int[] iArr = ((z3) this.d).P0;
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
                return ((hn0) obj).r.size();
            case 3:
                return ((fi0) obj).c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.k0;
                return 12;
            case 5:
                return ((rg.j) obj).d.size();
            default:
                return ((z3) obj).P0.length;
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
                hn0 hn0Var = (hn0) this.d;
                ArrayList arrayList = hn0Var.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    en0 en0Var = (en0) arrayList.get(i10);
                    gn0 gn0Var = (gn0) view;
                    zg.p0 p0Var = gn0Var.d;
                    boolean z10 = p0Var == null || !p0Var.equals(en0Var.a);
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = en0Var.a.g();
                        tL_reactionCount.count = en0Var.b;
                        hn0 hn0Var2 = gn0Var.s;
                        fn0 fn0Var = new fn0(gn0Var, hn0Var2.a, gn0Var, tL_reactionCount, hn0Var2.c);
                        gn0Var.a = fn0Var;
                        fn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        fn0 fn0Var2 = gn0Var.a;
                        fn0Var2.q = true;
                        fn0Var2.S = true;
                    } else {
                        gn0Var.a.w = en0Var.b;
                    }
                    gn0Var.d = en0Var.a;
                    if (!z10) {
                        fn0 fn0Var3 = gn0Var.a;
                        fn0Var3.f = fn0Var3.A;
                    }
                    gn0Var.a.A = AndroidUtilities.dp(44.33f);
                    gn0Var.a.u = !TextUtils.isEmpty(en0Var.c);
                    fn0 fn0Var4 = gn0Var.a;
                    boolean z11 = fn0Var4.u;
                    m6 m6Var = fn0Var4.G;
                    if (z11) {
                        m6Var.q(Emoji.replaceEmoji(en0Var.c, m6Var.a.getFontMetricsInt(), false), !z10, true);
                    } else if (m6Var != null) {
                        m6Var.q("", !z10, true);
                    }
                    fn0 fn0Var5 = gn0Var.a;
                    Integer.toString(en0Var.b);
                    fn0Var5.getClass();
                    gn0Var.a.F.c(en0Var.b, !z10);
                    fn0 fn0Var6 = gn0Var.a;
                    if (fn0Var6.F != null && (fn0Var6.w > 0 || fn0Var6.u)) {
                        fn0Var6.A = (int) (AndroidUtilities.dp(gn0Var.a.u ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + gn0Var.a.G.d + fn0Var6.A);
                    }
                    if (z10) {
                        fn0 fn0Var7 = gn0Var.a;
                        fn0Var7.f = fn0Var7.A;
                    }
                    gn0Var.a.B = AndroidUtilities.dp(28.0f);
                    fn0 fn0Var8 = gn0Var.a;
                    fn0Var8.p = gn0Var.e;
                    if (gn0Var.r) {
                        fn0Var8.a();
                    }
                    if (!z10) {
                        gn0Var.requestLayout();
                    }
                    ((gn0) view).a(en0Var.a.h == hn0Var.h, false);
                    break;
                }
                break;
            case 3:
                ei0 ei0Var = (ei0) c1Var.a;
                fi0 fi0Var = (fi0) this.d;
                ei0Var.a((TLObject) fi0Var.c.get(i10), false, ((Integer) fi0Var.b.get(i10)).intValue());
                break;
            case 4:
                ((fj1) c1Var.a).a = WallpapersListActivity.m0[i10];
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
                ra raVar = (ra) c1Var.a;
                int i11 = ((z3) this.d).P0[(r0.length - 1) - i10];
                if (raVar.a != i11) {
                    raVar.a = i11;
                    raVar.requestLayout();
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
                return new vk0(((sa) this.d).X);
            case 2:
                hn0 hn0Var = (hn0) this.d;
                return new vk0(new gn0(hn0Var, hn0Var.getContext()));
            case 3:
                ei0 ei0Var = new ei0(viewGroup.getContext());
                ei0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
                return new vk0(ei0Var);
            case 4:
                jj1 jj1Var = (jj1) this.d;
                return new vk0(new fj1(jj1Var.E, jj1Var.c));
            case 5:
                rg.j jVar = (rg.j) this.d;
                e6 e6Var = jVar.a;
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
                    iVar.addView(imageView, x5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    iVar.a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    vl.o(i6.G6, e6Var, textView, 1, 14.0f);
                    iVar.addView(textView, x5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    iVar.b = textView2;
                    vl.o(i6.y6, e6Var, textView2, 1, 14.0f);
                    iVar.addView(textView2, x5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = iVar;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                ra raVar = new ra(((z3) this.d).getContext());
                raVar.a = 0;
                return new vk0(raVar);
        }
    }

    @Override // s4.h0
    public void y(s4.c1 c1Var) {
        switch (this.c) {
            case 2:
                hn0 hn0Var = (hn0) this.d;
                ArrayList arrayList = hn0Var.r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((gn0) c1Var.a).a(((en0) arrayList.get(b10)).a.h == hn0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void E(s4.c1 c1Var, int i10) {
    }
}
