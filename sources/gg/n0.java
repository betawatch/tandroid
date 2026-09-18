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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.sn0;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.dj1;
import org.telegram.ui.fi0;
import org.telegram.ui.gi0;
import org.telegram.ui.hj1;
import w7.y5;
import yh.y3;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
                return ((vn0) obj).r.size();
            case 3:
                return ((gi0) obj).c.size();
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
                vn0 vn0Var = (vn0) this.d;
                ArrayList arrayList = vn0Var.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    sn0 sn0Var = (sn0) arrayList.get(i10);
                    un0 un0Var = (un0) view;
                    zg.o0 o0Var = un0Var.d;
                    boolean z10 = o0Var == null || !o0Var.equals(sn0Var.a);
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = sn0Var.a.g();
                        tL_reactionCount.count = sn0Var.b;
                        vn0 vn0Var2 = un0Var.s;
                        tn0 tn0Var = new tn0(un0Var, vn0Var2.a, un0Var, tL_reactionCount, vn0Var2.c);
                        un0Var.a = tn0Var;
                        tn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        tn0 tn0Var2 = un0Var.a;
                        tn0Var2.q = true;
                        tn0Var2.S = true;
                    } else {
                        un0Var.a.w = sn0Var.b;
                    }
                    un0Var.d = sn0Var.a;
                    if (!z10) {
                        tn0 tn0Var3 = un0Var.a;
                        tn0Var3.f = tn0Var3.A;
                    }
                    un0Var.a.A = AndroidUtilities.dp(44.33f);
                    un0Var.a.u = !TextUtils.isEmpty(sn0Var.c);
                    tn0 tn0Var4 = un0Var.a;
                    boolean z11 = tn0Var4.u;
                    o6 o6Var = tn0Var4.G;
                    if (z11) {
                        o6Var.q(Emoji.replaceEmoji(sn0Var.c, o6Var.a.getFontMetricsInt(), false), !z10, true);
                    } else if (o6Var != null) {
                        o6Var.q("", !z10, true);
                    }
                    tn0 tn0Var5 = un0Var.a;
                    Integer.toString(sn0Var.b);
                    tn0Var5.getClass();
                    un0Var.a.F.c(sn0Var.b, !z10);
                    tn0 tn0Var6 = un0Var.a;
                    if (tn0Var6.F != null && (tn0Var6.w > 0 || tn0Var6.u)) {
                        tn0Var6.A = (int) (AndroidUtilities.dp(un0Var.a.u ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + un0Var.a.G.d + tn0Var6.A);
                    }
                    if (z10) {
                        tn0 tn0Var7 = un0Var.a;
                        tn0Var7.f = tn0Var7.A;
                    }
                    un0Var.a.B = AndroidUtilities.dp(28.0f);
                    tn0 tn0Var8 = un0Var.a;
                    tn0Var8.p = un0Var.e;
                    if (un0Var.r) {
                        tn0Var8.a();
                    }
                    if (!z10) {
                        un0Var.requestLayout();
                    }
                    ((un0) view).a(sn0Var.a.h == vn0Var.h, false);
                    break;
                }
                break;
            case 3:
                fi0 fi0Var = (fi0) c1Var.a;
                gi0 gi0Var = (gi0) this.d;
                fi0Var.a((TLObject) gi0Var.c.get(i10), false, ((Integer) gi0Var.b.get(i10)).intValue());
                break;
            case 4:
                ((dj1) c1Var.a).a = WallpapersListActivity.k0[i10];
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
                int i11 = ((y3) this.d).P0[(r0.length - 1) - i10];
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
                vn0 vn0Var = (vn0) this.d;
                return new gl0(new un0(vn0Var, vn0Var.getContext()));
            case 3:
                fi0 fi0Var = new fi0(viewGroup.getContext());
                fi0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
                return new gl0(fi0Var);
            case 4:
                hj1 hj1Var = (hj1) this.d;
                return new gl0(new dj1(hj1Var.E, hj1Var.c));
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
                    iVar.addView(imageView, y5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    iVar.a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    wh.m(j6.G6, e6Var, textView, 1, 14.0f);
                    iVar.addView(textView, y5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    iVar.b = textView2;
                    wh.m(j6.y6, e6Var, textView2, 1, 14.0f);
                    iVar.addView(textView2, y5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = iVar;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                ta taVar = new ta(((y3) this.d).getContext());
                taVar.a = 0;
                return new gl0(taVar);
        }
    }

    @Override // s4.h0
    public void y(s4.c1 c1Var) {
        switch (this.c) {
            case 2:
                vn0 vn0Var = (vn0) this.d;
                ArrayList arrayList = vn0Var.r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((un0) c1Var.a).a(((sn0) arrayList.get(b10)).a.h == vn0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void E(s4.c1 c1Var, int i10) {
    }
}
