package cg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import jh.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ci1;
import org.telegram.ui.nh0;
import org.telegram.ui.oh0;
import org.telegram.ui.th;
import org.telegram.ui.yh1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g extends il0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        switch (this.c) {
        }
        return true;
    }

    public void F(int i10, int i11) {
        int[] iArr = ((h5) this.d).L0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override // f2.p0
    public final int h() {
        int i10 = this.c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((m) obj).d.size();
            case 1:
                return ((h5) obj).L0.length;
            case 2:
                return 1;
            case 3:
                return ((en0) obj).r.size();
            case 4:
                return ((oh0) obj).c.size();
            case 5:
                int[][] iArr = WallpapersListActivity.g0;
                return 12;
            default:
                return ((rf.h0) obj).T2.size();
        }
    }

    @Override // f2.p0
    public int j(int i10) {
        switch (this.c) {
            case 0:
                return ((k) ((m) this.d).d.get(i10)).a;
            case 1:
            default:
                return super.j(i10);
            case 2:
                return i10;
        }
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        switch (this.c) {
            case 0:
                m mVar = (m) this.d;
                ArrayList arrayList = mVar.d;
                if (((k) arrayList.get(i10)).a == 1) {
                    l lVar = (l) n1Var.a;
                    lVar.c.setColorFilter(new PorterDuffColorFilter(mVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    lVar.c.setImageDrawable(mVar.getContext().getDrawable(((k) arrayList.get(i10)).b));
                    lVar.a.setText(((k) arrayList.get(i10)).c);
                    lVar.b.setText(((k) arrayList.get(i10)).d);
                    break;
                }
                break;
            case 1:
                qa qaVar = (qa) n1Var.a;
                int i11 = ((h5) this.d).L0[(r0.length - 1) - i10];
                if (qaVar.a != i11) {
                    qaVar.a = i11;
                    qaVar.requestLayout();
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                View view = n1Var.a;
                en0 en0Var = (en0) this.d;
                ArrayList arrayList2 = en0Var.r;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    bn0 bn0Var = (bn0) arrayList2.get(i10);
                    dn0 dn0Var = (dn0) view;
                    kg.q0 q0Var = dn0Var.d;
                    boolean z10 = q0Var == null || !q0Var.equals(bn0Var.a);
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = bn0Var.a.g();
                        tL_reactionCount.count = bn0Var.b;
                        en0 en0Var2 = dn0Var.s;
                        cn0 cn0Var = new cn0(dn0Var, en0Var2.a, dn0Var, tL_reactionCount, en0Var2.c);
                        dn0Var.a = cn0Var;
                        cn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        cn0 cn0Var2 = dn0Var.a;
                        cn0Var2.q = true;
                        cn0Var2.S = true;
                    } else {
                        dn0Var.a.w = bn0Var.b;
                    }
                    dn0Var.d = bn0Var.a;
                    if (!z10) {
                        cn0 cn0Var3 = dn0Var.a;
                        cn0Var3.f = cn0Var3.A;
                    }
                    dn0Var.a.A = AndroidUtilities.dp(44.33f);
                    dn0Var.a.u = !TextUtils.isEmpty(bn0Var.c);
                    cn0 cn0Var4 = dn0Var.a;
                    boolean z11 = cn0Var4.u;
                    n6 n6Var = cn0Var4.G;
                    if (z11) {
                        n6Var.q(Emoji.replaceEmoji(bn0Var.c, n6Var.a.getFontMetricsInt(), false), !z10, true);
                    } else if (n6Var != null) {
                        n6Var.q("", !z10, true);
                    }
                    cn0 cn0Var5 = dn0Var.a;
                    Integer.toString(bn0Var.b);
                    cn0Var5.getClass();
                    dn0Var.a.F.c(bn0Var.b, !z10);
                    cn0 cn0Var6 = dn0Var.a;
                    if (cn0Var6.F != null && (cn0Var6.w > 0 || cn0Var6.u)) {
                        cn0Var6.A = (int) (AndroidUtilities.dp(dn0Var.a.u ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + dn0Var.a.G.d + cn0Var6.A);
                    }
                    if (z10) {
                        cn0 cn0Var7 = dn0Var.a;
                        cn0Var7.f = cn0Var7.A;
                    }
                    dn0Var.a.B = AndroidUtilities.dp(28.0f);
                    cn0 cn0Var8 = dn0Var.a;
                    cn0Var8.p = dn0Var.e;
                    if (dn0Var.r) {
                        cn0Var8.a();
                    }
                    if (!z10) {
                        dn0Var.requestLayout();
                    }
                    ((dn0) view).a(bn0Var.a.h == en0Var.h, false);
                    break;
                }
                break;
            case 4:
                nh0 nh0Var = (nh0) n1Var.a;
                oh0 oh0Var = (oh0) this.d;
                nh0Var.a((TLObject) oh0Var.c.get(i10), false, ((Integer) oh0Var.b.get(i10)).intValue());
                break;
            case 5:
                ((yh1) n1Var.a).a = WallpapersListActivity.i0[i10];
                break;
            default:
                ((rf.g0) n1Var).v.setData((rf.f0) ((rf.h0) this.d).T2.get(i10));
                break;
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.c) {
            case 0:
                m mVar = (m) this.d;
                c6 c6Var = mVar.a;
                if (i10 == 0) {
                    view = new j(mVar, mVar.getContext());
                } else if (i10 == 2) {
                    view = new q3(mVar.getContext(), 16);
                } else {
                    Context context = mVar.getContext();
                    l lVar = new l(context);
                    ImageView imageView = new ImageView(context);
                    lVar.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    lVar.addView(imageView, f6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    lVar.a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    org.telegram.ui.b.m(g6.G6, c6Var, textView, 1, 14.0f);
                    lVar.addView(textView, f6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    lVar.b = textView2;
                    org.telegram.ui.b.m(g6.y6, c6Var, textView2, 1, 14.0f);
                    lVar.addView(textView2, f6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = lVar;
                }
                return th.m(view, view, -1, -2);
            case 1:
                qa qaVar = new qa(((h5) this.d).getContext());
                qaVar.a = 0;
                return new vk0(qaVar);
            case 2:
                return new vk0(((ra) this.d).T);
            case 3:
                en0 en0Var = (en0) this.d;
                return new vk0(new dn0(en0Var, en0Var.getContext()));
            case 4:
                nh0 nh0Var = new nh0(viewGroup.getContext());
                nh0Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(50.0f)));
                return new vk0(nh0Var);
            case 5:
                ci1 ci1Var = (ci1) this.d;
                return new vk0(new yh1(ci1Var.A, ci1Var.c));
            default:
                rf.e0 e0Var = new rf.e0(viewGroup.getContext(), ((rf.h0) this.d).l2);
                rf.g0 g0Var = new rf.g0(e0Var);
                g0Var.v = e0Var;
                e0Var.setLayoutParams(new f2.x0(-2, AndroidUtilities.dp(30.0f)));
                return g0Var;
        }
    }

    @Override // f2.p0
    public void y(f2.n1 n1Var) {
        switch (this.c) {
            case 3:
                en0 en0Var = (en0) this.d;
                ArrayList arrayList = en0Var.r;
                int b10 = n1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((dn0) n1Var.a).a(((bn0) arrayList.get(b10)).a.h == en0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void E(f2.n1 n1Var, int i10) {
    }
}
