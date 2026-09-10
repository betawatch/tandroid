package fg;

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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.qn0;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.fi0;
import org.telegram.ui.gi0;
import org.telegram.ui.jj1;
import org.telegram.ui.nj1;
import w7.a6;
import xh.x3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class n0 extends ul0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n0(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.ul0
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
                return ((rn0) obj).r.size();
            case 3:
                return ((gi0) obj).c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.k0;
                return 12;
            case 5:
                return ((qg.j) obj).d.size();
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
                return ((qg.h) ((qg.j) this.d).d.get(i10)).a;
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
                rn0 rn0Var = (rn0) this.d;
                ArrayList arrayList = rn0Var.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    on0 on0Var = (on0) arrayList.get(i10);
                    qn0 qn0Var = (qn0) view;
                    yg.p0 p0Var = qn0Var.d;
                    boolean z10 = p0Var == null || !p0Var.equals(on0Var.a);
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = on0Var.a.g();
                        tL_reactionCount.count = on0Var.b;
                        rn0 rn0Var2 = qn0Var.s;
                        pn0 pn0Var = new pn0(qn0Var, rn0Var2.a, qn0Var, tL_reactionCount, rn0Var2.c);
                        qn0Var.a = pn0Var;
                        pn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        pn0 pn0Var2 = qn0Var.a;
                        pn0Var2.q = true;
                        pn0Var2.S = true;
                    } else {
                        qn0Var.a.w = on0Var.b;
                    }
                    qn0Var.d = on0Var.a;
                    if (!z10) {
                        pn0 pn0Var3 = qn0Var.a;
                        pn0Var3.f = pn0Var3.A;
                    }
                    qn0Var.a.A = AndroidUtilities.dp(44.33f);
                    qn0Var.a.u = !TextUtils.isEmpty(on0Var.c);
                    pn0 pn0Var4 = qn0Var.a;
                    boolean z11 = pn0Var4.u;
                    n6 n6Var = pn0Var4.G;
                    if (z11) {
                        n6Var.q(Emoji.replaceEmoji(on0Var.c, n6Var.a.getFontMetricsInt(), false), !z10, true);
                    } else if (n6Var != null) {
                        n6Var.q("", !z10, true);
                    }
                    pn0 pn0Var5 = qn0Var.a;
                    Integer.toString(on0Var.b);
                    pn0Var5.getClass();
                    qn0Var.a.F.c(on0Var.b, !z10);
                    pn0 pn0Var6 = qn0Var.a;
                    if (pn0Var6.F != null && (pn0Var6.w > 0 || pn0Var6.u)) {
                        pn0Var6.A = (int) (AndroidUtilities.dp(qn0Var.a.u ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + qn0Var.a.G.d + pn0Var6.A);
                    }
                    if (z10) {
                        pn0 pn0Var7 = qn0Var.a;
                        pn0Var7.f = pn0Var7.A;
                    }
                    qn0Var.a.B = AndroidUtilities.dp(28.0f);
                    pn0 pn0Var8 = qn0Var.a;
                    pn0Var8.p = qn0Var.e;
                    if (qn0Var.r) {
                        pn0Var8.a();
                    }
                    if (!z10) {
                        qn0Var.requestLayout();
                    }
                    ((qn0) view).a(on0Var.a.h == rn0Var.h, false);
                    break;
                }
                break;
            case 3:
                fi0 fi0Var = (fi0) c1Var.a;
                gi0 gi0Var = (gi0) this.d;
                fi0Var.a((TLObject) gi0Var.c.get(i10), false, ((Integer) gi0Var.b.get(i10)).intValue());
                break;
            case 4:
                ((jj1) c1Var.a).a = WallpapersListActivity.m0[i10];
                break;
            case 5:
                qg.j jVar = (qg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((qg.h) arrayList2.get(i10)).a == 1) {
                    qg.i iVar = (qg.i) c1Var.a;
                    iVar.c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.c.setImageDrawable(jVar.getContext().getDrawable(((qg.h) arrayList2.get(i10)).b));
                    iVar.a.setText(((qg.h) arrayList2.get(i10)).c);
                    iVar.b.setText(((qg.h) arrayList2.get(i10)).d);
                    break;
                }
                break;
            default:
                sa saVar = (sa) c1Var.a;
                int i11 = ((x3) this.d).P0[(r0.length - 1) - i10];
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
                return new fl0(((ta) this.d).X);
            case 2:
                rn0 rn0Var = (rn0) this.d;
                return new fl0(new qn0(rn0Var, rn0Var.getContext()));
            case 3:
                fi0 fi0Var = new fi0(viewGroup.getContext());
                fi0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
                return new fl0(fi0Var);
            case 4:
                nj1 nj1Var = (nj1) this.d;
                return new fl0(new jj1(nj1Var.E, nj1Var.c));
            case 5:
                qg.j jVar = (qg.j) this.d;
                f6 f6Var = jVar.a;
                if (i10 == 0) {
                    view = new qg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new s3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    qg.i iVar = new qg.i(context);
                    ImageView imageView = new ImageView(context);
                    iVar.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    iVar.addView(imageView, a6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    iVar.a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    em.n(j6.G6, f6Var, textView, 1, 14.0f);
                    iVar.addView(textView, a6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    iVar.b = textView2;
                    em.n(j6.y6, f6Var, textView2, 1, 14.0f);
                    iVar.addView(textView2, a6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = iVar;
                }
                return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
            default:
                sa saVar = new sa(((x3) this.d).getContext());
                saVar.a = 0;
                return new fl0(saVar);
        }
    }

    @Override // s4.h0
    public void y(s4.c1 c1Var) {
        switch (this.c) {
            case 2:
                rn0 rn0Var = (rn0) this.d;
                ArrayList arrayList = rn0Var.r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((qn0) c1Var.a).a(((on0) arrayList.get(b10)).a.h == rn0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void E(s4.c1 c1Var, int i10) {
    }
}
