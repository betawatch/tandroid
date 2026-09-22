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
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ej1;
import org.telegram.ui.gi0;
import org.telegram.ui.hi0;
import org.telegram.ui.ij1;
import w7.y5;
import yh.y3;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class n0 extends xl0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n0(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        switch (this.c) {
        }
        return false;
    }

    public void F(int i10, int i11) {
        int[] iArr = ((y3) this.d).P0;
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
                return ((wn0) obj).r.size();
            case 3:
                return ((hi0) obj).c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.i0;
                return 12;
            case 5:
                return ((rg.j) obj).d.size();
            default:
                return ((y3) obj).P0.length;
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
                wn0 wn0Var = (wn0) this.d;
                ArrayList arrayList = wn0Var.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    tn0 tn0Var = (tn0) arrayList.get(i10);
                    vn0 vn0Var = (vn0) view;
                    zg.p0 p0Var = vn0Var.d;
                    boolean z10 = p0Var == null || !p0Var.equals(tn0Var.a);
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = tn0Var.a.g();
                        tL_reactionCount.count = tn0Var.b;
                        wn0 wn0Var2 = vn0Var.s;
                        un0 un0Var = new un0(vn0Var, wn0Var2.a, vn0Var, tL_reactionCount, wn0Var2.c);
                        vn0Var.a = un0Var;
                        un0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        un0 un0Var2 = vn0Var.a;
                        un0Var2.q = true;
                        un0Var2.S = true;
                    } else {
                        vn0Var.a.w = tn0Var.b;
                    }
                    vn0Var.d = tn0Var.a;
                    if (!z10) {
                        un0 un0Var3 = vn0Var.a;
                        un0Var3.f = un0Var3.A;
                    }
                    vn0Var.a.A = AndroidUtilities.dp(44.33f);
                    vn0Var.a.u = !TextUtils.isEmpty(tn0Var.c);
                    un0 un0Var4 = vn0Var.a;
                    boolean z11 = un0Var4.u;
                    n6 n6Var = un0Var4.G;
                    if (z11) {
                        n6Var.q(Emoji.replaceEmoji(tn0Var.c, n6Var.a.getFontMetricsInt(), false), !z10, true);
                    } else if (n6Var != null) {
                        n6Var.q("", !z10, true);
                    }
                    un0 un0Var5 = vn0Var.a;
                    Integer.toString(tn0Var.b);
                    un0Var5.getClass();
                    vn0Var.a.F.c(tn0Var.b, !z10);
                    un0 un0Var6 = vn0Var.a;
                    if (un0Var6.F != null && (un0Var6.w > 0 || un0Var6.u)) {
                        un0Var6.A = (int) (AndroidUtilities.dp(vn0Var.a.u ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + vn0Var.a.G.d + un0Var6.A);
                    }
                    if (z10) {
                        un0 un0Var7 = vn0Var.a;
                        un0Var7.f = un0Var7.A;
                    }
                    vn0Var.a.B = AndroidUtilities.dp(28.0f);
                    un0 un0Var8 = vn0Var.a;
                    un0Var8.p = vn0Var.e;
                    if (vn0Var.r) {
                        un0Var8.a();
                    }
                    if (!z10) {
                        vn0Var.requestLayout();
                    }
                    ((vn0) view).a(tn0Var.a.h == wn0Var.h, false);
                    break;
                }
                break;
            case 3:
                gi0 gi0Var = (gi0) c1Var.a;
                hi0 hi0Var = (hi0) this.d;
                gi0Var.a((TLObject) hi0Var.c.get(i10), false, ((Integer) hi0Var.b.get(i10)).intValue());
                break;
            case 4:
                ((ej1) c1Var.a).a = WallpapersListActivity.k0[i10];
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
                sa saVar = (sa) c1Var.a;
                int i11 = ((y3) this.d).P0[(r0.length - 1) - i10];
                if (saVar.a != i11) {
                    saVar.a = i11;
                    saVar.requestLayout();
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
                return new il0(((ta) this.d).X);
            case 2:
                wn0 wn0Var = (wn0) this.d;
                return new il0(new vn0(wn0Var, wn0Var.getContext()));
            case 3:
                gi0 gi0Var = new gi0(viewGroup.getContext());
                gi0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
                return new il0(gi0Var);
            case 4:
                ij1 ij1Var = (ij1) this.d;
                return new il0(new ej1(ij1Var.E, ij1Var.c));
            case 5:
                rg.j jVar = (rg.j) this.d;
                f6 f6Var = jVar.a;
                if (i10 == 0) {
                    view = new rg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new u3(jVar.getContext(), 16);
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
                    rk.n(j6.G6, f6Var, textView, 1, 14.0f);
                    iVar.addView(textView, y5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    iVar.b = textView2;
                    rk.n(j6.y6, f6Var, textView2, 1, 14.0f);
                    iVar.addView(textView2, y5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = iVar;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                sa saVar = new sa(((y3) this.d).getContext());
                saVar.a = 0;
                return new il0(saVar);
        }
    }

    @Override // s4.h0
    public void y(s4.c1 c1Var) {
        switch (this.c) {
            case 2:
                wn0 wn0Var = (wn0) this.d;
                ArrayList arrayList = wn0Var.r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((vn0) c1Var.a).a(((tn0) arrayList.get(b10)).a.h == wn0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void E(s4.c1 c1Var, int i10) {
    }
}
