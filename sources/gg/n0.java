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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ej1;
import org.telegram.ui.gi0;
import org.telegram.ui.hi0;
import org.telegram.ui.ij1;
import w7.x5;
import yh.a4;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class n0 extends ll0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n0(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        switch (this.c) {
        }
        return false;
    }

    public void F(int i10, int i11) {
        int[] iArr = ((a4) this.d).P0;
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
                return ((jn0) obj).r.size();
            case 3:
                return ((hi0) obj).c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.i0;
                return 12;
            case 5:
                return ((rg.j) obj).d.size();
            default:
                return ((a4) obj).P0.length;
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
                jn0 jn0Var = (jn0) this.d;
                ArrayList arrayList = jn0Var.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    gn0 gn0Var = (gn0) arrayList.get(i10);
                    in0 in0Var = (in0) view;
                    zg.p0 p0Var = in0Var.d;
                    boolean z10 = p0Var == null || !p0Var.equals(gn0Var.a);
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = gn0Var.a.g();
                        tL_reactionCount.count = gn0Var.b;
                        jn0 jn0Var2 = in0Var.s;
                        hn0 hn0Var = new hn0(in0Var, jn0Var2.a, in0Var, tL_reactionCount, jn0Var2.c);
                        in0Var.a = hn0Var;
                        hn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        hn0 hn0Var2 = in0Var.a;
                        hn0Var2.q = true;
                        hn0Var2.S = true;
                    } else {
                        in0Var.a.w = gn0Var.b;
                    }
                    in0Var.d = gn0Var.a;
                    if (!z10) {
                        hn0 hn0Var3 = in0Var.a;
                        hn0Var3.f = hn0Var3.A;
                    }
                    in0Var.a.A = AndroidUtilities.dp(44.33f);
                    in0Var.a.u = !TextUtils.isEmpty(gn0Var.c);
                    hn0 hn0Var4 = in0Var.a;
                    boolean z11 = hn0Var4.u;
                    m6 m6Var = hn0Var4.G;
                    if (z11) {
                        m6Var.q(Emoji.replaceEmoji(gn0Var.c, m6Var.a.getFontMetricsInt(), false), !z10, true);
                    } else if (m6Var != null) {
                        m6Var.q("", !z10, true);
                    }
                    hn0 hn0Var5 = in0Var.a;
                    Integer.toString(gn0Var.b);
                    hn0Var5.getClass();
                    in0Var.a.F.c(gn0Var.b, !z10);
                    hn0 hn0Var6 = in0Var.a;
                    if (hn0Var6.F != null && (hn0Var6.w > 0 || hn0Var6.u)) {
                        hn0Var6.A = (int) (AndroidUtilities.dp(in0Var.a.u ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + in0Var.a.G.d + hn0Var6.A);
                    }
                    if (z10) {
                        hn0 hn0Var7 = in0Var.a;
                        hn0Var7.f = hn0Var7.A;
                    }
                    in0Var.a.B = AndroidUtilities.dp(28.0f);
                    hn0 hn0Var8 = in0Var.a;
                    hn0Var8.p = in0Var.e;
                    if (in0Var.r) {
                        hn0Var8.a();
                    }
                    if (!z10) {
                        in0Var.requestLayout();
                    }
                    ((in0) view).a(gn0Var.a.h == jn0Var.h, false);
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
                ra raVar = (ra) c1Var.a;
                int i11 = ((a4) this.d).P0[(r0.length - 1) - i10];
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
                return new wk0(((sa) this.d).X);
            case 2:
                jn0 jn0Var = (jn0) this.d;
                return new wk0(new in0(jn0Var, jn0Var.getContext()));
            case 3:
                gi0 gi0Var = new gi0(viewGroup.getContext());
                gi0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
                return new wk0(gi0Var);
            case 4:
                ij1 ij1Var = (ij1) this.d;
                return new wk0(new ej1(ij1Var.E, ij1Var.c));
            case 5:
                rg.j jVar = (rg.j) this.d;
                f6 f6Var = jVar.a;
                if (i10 == 0) {
                    view = new rg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new s3(jVar.getContext(), 16);
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
                    wl.n(j6.G6, f6Var, textView, 1, 14.0f);
                    iVar.addView(textView, x5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    iVar.b = textView2;
                    wl.n(j6.y6, f6Var, textView2, 1, 14.0f);
                    iVar.addView(textView2, x5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = iVar;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                ra raVar = new ra(((a4) this.d).getContext());
                raVar.a = 0;
                return new wk0(raVar);
        }
    }

    @Override // s4.h0
    public void y(s4.c1 c1Var) {
        switch (this.c) {
            case 2:
                jn0 jn0Var = (jn0) this.d;
                ArrayList arrayList = jn0Var.r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((in0) c1Var.a).a(((gn0) arrayList.get(b10)).a.h == jn0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void E(s4.c1 c1Var, int i10) {
    }
}
