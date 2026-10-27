package bi;

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ci1;
import org.telegram.ui.gi1;
import org.telegram.ui.sh0;
import org.telegram.ui.th0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h5 extends mm0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h5(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
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
        int[] iArr = ((h7) this.d).S0;
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
                return ((h7) obj).S0.length;
            case 1:
                return ((ig.r0) obj).f3.size();
            case 2:
                return 1;
            case 3:
                return ((po0) obj).r.size();
            case 4:
                return ((th0) obj).c.size();
            case 5:
                int[][] iArr = WallpapersListActivity.g0;
                return 12;
            default:
                return ((tg.j) obj).d.size();
        }
    }

    @Override // s4.h0
    public int j(int i10) {
        switch (this.c) {
            case 2:
                return i10;
            case 6:
                return ((tg.h) ((tg.j) this.d).d.get(i10)).a;
            default:
                return super.j(i10);
        }
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        switch (this.c) {
            case 0:
                org.telegram.ui.Components.ta taVar = (org.telegram.ui.Components.ta) e1Var.a;
                int i11 = ((h7) this.d).S0[(r0.length - 1) - i10];
                if (taVar.a != i11) {
                    taVar.a = i11;
                    taVar.requestLayout();
                    break;
                }
                break;
            case 1:
                ((ig.q0) e1Var).v.setData((ig.p0) ((ig.r0) this.d).f3.get(i10));
                break;
            case 2:
                break;
            case 3:
                View view = e1Var.a;
                po0 po0Var = (po0) this.d;
                ArrayList arrayList = po0Var.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    mo0 mo0Var = (mo0) arrayList.get(i10);
                    oo0 oo0Var = (oo0) view;
                    bh.x0 x0Var = oo0Var.d;
                    boolean z10 = x0Var == null || !x0Var.equals(mo0Var.a);
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = mo0Var.a.g();
                        tL_reactionCount.count = mo0Var.b;
                        po0 po0Var2 = oo0Var.s;
                        no0 no0Var = new no0(oo0Var, po0Var2.a, oo0Var, tL_reactionCount, po0Var2.c);
                        oo0Var.a = no0Var;
                        no0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        no0 no0Var2 = oo0Var.a;
                        no0Var2.q = true;
                        no0Var2.S = true;
                    } else {
                        oo0Var.a.w = mo0Var.b;
                    }
                    oo0Var.d = mo0Var.a;
                    if (!z10) {
                        no0 no0Var3 = oo0Var.a;
                        no0Var3.f = no0Var3.A;
                    }
                    oo0Var.a.A = AndroidUtilities.dp(44.33f);
                    oo0Var.a.u = !TextUtils.isEmpty(mo0Var.c);
                    no0 no0Var4 = oo0Var.a;
                    boolean z11 = no0Var4.u;
                    org.telegram.ui.Components.r6 r6Var = no0Var4.G;
                    if (z11) {
                        r6Var.t(Emoji.replaceEmoji(mo0Var.c, r6Var.a.getFontMetricsInt(), false), !z10, true);
                    } else if (r6Var != null) {
                        r6Var.t("", !z10, true);
                    }
                    no0 no0Var5 = oo0Var.a;
                    Integer.toString(mo0Var.b);
                    no0Var5.getClass();
                    oo0Var.a.F.c(mo0Var.b, !z10);
                    no0 no0Var6 = oo0Var.a;
                    if (no0Var6.F != null && (no0Var6.w > 0 || no0Var6.u)) {
                        no0Var6.A = (int) (AndroidUtilities.dp(oo0Var.a.u ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + oo0Var.a.G.d + no0Var6.A);
                    }
                    if (z10) {
                        no0 no0Var7 = oo0Var.a;
                        no0Var7.f = no0Var7.A;
                    }
                    oo0Var.a.B = AndroidUtilities.dp(28.0f);
                    no0 no0Var8 = oo0Var.a;
                    no0Var8.p = oo0Var.e;
                    if (oo0Var.r) {
                        no0Var8.a();
                    }
                    if (!z10) {
                        oo0Var.requestLayout();
                    }
                    ((oo0) view).a(mo0Var.a.h == po0Var.h, false);
                    break;
                }
                break;
            case 4:
                sh0 sh0Var = (sh0) e1Var.a;
                th0 th0Var = (th0) this.d;
                sh0Var.a((TLObject) th0Var.c.get(i10), false, ((Integer) th0Var.b.get(i10)).intValue());
                break;
            case 5:
                ((ci1) e1Var.a).a = WallpapersListActivity.i0[i10];
                break;
            default:
                tg.j jVar = (tg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((tg.h) arrayList2.get(i10)).a == 1) {
                    tg.i iVar = (tg.i) e1Var.a;
                    iVar.c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.c.setImageDrawable(jVar.getContext().getDrawable(((tg.h) arrayList2.get(i10)).b));
                    iVar.a.setText(((tg.h) arrayList2.get(i10)).c);
                    iVar.b.setText(((tg.h) arrayList2.get(i10)).d);
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.c) {
            case 0:
                org.telegram.ui.Components.ta taVar = new org.telegram.ui.Components.ta(((h7) this.d).getContext());
                taVar.a = 0;
                return new wl0(taVar);
            case 1:
                ig.o0 o0Var = new ig.o0(viewGroup.getContext(), ((ig.r0) this.d).n2);
                ig.q0 q0Var = new ig.q0(o0Var);
                q0Var.v = o0Var;
                o0Var.setLayoutParams(new s4.q0(-2, AndroidUtilities.dp(30.0f)));
                return q0Var;
            case 2:
                return new wl0(((org.telegram.ui.Components.ua) this.d).X);
            case 3:
                po0 po0Var = (po0) this.d;
                return new wl0(new oo0(po0Var, po0Var.getContext()));
            case 4:
                sh0 sh0Var = new sh0(viewGroup.getContext());
                sh0Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(50.0f)));
                return new wl0(sh0Var);
            case 5:
                gi1 gi1Var = (gi1) this.d;
                return new wl0(new ci1(gi1Var.E, gi1Var.c));
            default:
                tg.j jVar = (tg.j) this.d;
                org.telegram.ui.ActionBar.u6 u6Var = jVar.a;
                if (i10 == 0) {
                    view = new tg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new org.telegram.ui.Cells.x3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    tg.i iVar = new tg.i(context);
                    ImageView imageView = new ImageView(context);
                    iVar.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    iVar.addView(imageView, kb1.h(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    iVar.a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
                    textView.setTextSize(1, 14.0f);
                    iVar.addView(textView, kb1.h(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    iVar.b = textView2;
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.y6, u6Var);
                    textView2.setTextSize(1, 14.0f);
                    iVar.addView(textView2, kb1.h(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = iVar;
                }
                return ic.a.n(view, view, -1, -2);
        }
    }

    @Override // s4.h0
    public void y(s4.e1 e1Var) {
        switch (this.c) {
            case 3:
                po0 po0Var = (po0) this.d;
                ArrayList arrayList = po0Var.r;
                int b10 = e1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((oo0) e1Var.a).a(((mo0) arrayList.get(b10)).a.h == po0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void E(s4.e1 e1Var, int i10) {
    }
}
