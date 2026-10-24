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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ci1;
import org.telegram.ui.th0;
import org.telegram.ui.uh0;
import org.telegram.ui.yh1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class m5 extends lm0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m5(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.lm0
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
                return ((hg.q0) obj).Y2.size();
            case 2:
                return 1;
            case 3:
                return ((jo0) obj).r.size();
            case 4:
                return ((uh0) obj).c.size();
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
                ((hg.p0) b1Var).v.setData((hg.o0) ((hg.q0) this.d).Y2.get(i10));
                break;
            case 2:
                break;
            case 3:
                View view = b1Var.a;
                jo0 jo0Var = (jo0) this.d;
                ArrayList arrayList = jo0Var.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    go0 go0Var = (go0) arrayList.get(i10);
                    io0 io0Var = (io0) view;
                    ah.i1 i1Var = io0Var.d;
                    boolean z10 = i1Var == null || !i1Var.equals(go0Var.a);
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = go0Var.a.g();
                        tL_reactionCount.count = go0Var.b;
                        jo0 jo0Var2 = io0Var.s;
                        ho0 ho0Var = new ho0(io0Var, jo0Var2.a, io0Var, tL_reactionCount, jo0Var2.c);
                        io0Var.a = ho0Var;
                        ho0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        ho0 ho0Var2 = io0Var.a;
                        ho0Var2.q = true;
                        ho0Var2.S = true;
                    } else {
                        io0Var.a.w = go0Var.b;
                    }
                    io0Var.d = go0Var.a;
                    if (!z10) {
                        ho0 ho0Var3 = io0Var.a;
                        ho0Var3.f = ho0Var3.A;
                    }
                    io0Var.a.A = AndroidUtilities.dp(44.33f);
                    io0Var.a.u = !TextUtils.isEmpty(go0Var.c);
                    ho0 ho0Var4 = io0Var.a;
                    boolean z11 = ho0Var4.u;
                    org.telegram.ui.Components.p6 p6Var = ho0Var4.G;
                    if (z11) {
                        p6Var.t(Emoji.replaceEmoji(go0Var.c, p6Var.a.getFontMetricsInt(), false), !z10, true);
                    } else if (p6Var != null) {
                        p6Var.t("", !z10, true);
                    }
                    ho0 ho0Var5 = io0Var.a;
                    Integer.toString(go0Var.b);
                    ho0Var5.getClass();
                    io0Var.a.F.c(go0Var.b, !z10);
                    ho0 ho0Var6 = io0Var.a;
                    if (ho0Var6.F != null && (ho0Var6.w > 0 || ho0Var6.u)) {
                        ho0Var6.A = (int) (AndroidUtilities.dp(io0Var.a.u ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + io0Var.a.G.d + ho0Var6.A);
                    }
                    if (z10) {
                        ho0 ho0Var7 = io0Var.a;
                        ho0Var7.f = ho0Var7.A;
                    }
                    io0Var.a.B = AndroidUtilities.dp(28.0f);
                    ho0 ho0Var8 = io0Var.a;
                    ho0Var8.p = io0Var.e;
                    if (io0Var.r) {
                        ho0Var8.a();
                    }
                    if (!z10) {
                        io0Var.requestLayout();
                    }
                    ((io0) view).a(go0Var.a.h == jo0Var.h, false);
                    break;
                }
                break;
            case 4:
                th0 th0Var = (th0) b1Var.a;
                uh0 uh0Var = (uh0) this.d;
                th0Var.a((TLObject) uh0Var.c.get(i10), false, ((Integer) uh0Var.b.get(i10)).intValue());
                break;
            case 5:
                ((yh1) b1Var.a).a = WallpapersListActivity.m0[i10];
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
                return new wl0(taVar);
            case 1:
                hg.n0 n0Var = new hg.n0(viewGroup.getContext(), ((hg.q0) this.d).n2);
                hg.p0 p0Var = new hg.p0(n0Var);
                p0Var.v = n0Var;
                n0Var.setLayoutParams(new s4.o0(-2, AndroidUtilities.dp(30.0f)));
                return p0Var;
            case 2:
                return new wl0(((org.telegram.ui.Components.ua) this.d).X);
            case 3:
                jo0 jo0Var = (jo0) this.d;
                return new wl0(new io0(jo0Var, jo0Var.getContext()));
            case 4:
                th0 th0Var = new th0(viewGroup.getContext());
                th0Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(50.0f)));
                return new wl0(th0Var);
            case 5:
                ci1 ci1Var = (ci1) this.d;
                return new wl0(new yh1(ci1Var.E, ci1Var.c));
            default:
                sg.j jVar = (sg.j) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = jVar.a;
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
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, g6Var);
                    textView.setTextSize(1, 14.0f);
                    iVar.addView(textView, w7.z5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    iVar.b = textView2;
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.y6, g6Var);
                    textView2.setTextSize(1, 14.0f);
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
                jo0 jo0Var = (jo0) this.d;
                ArrayList arrayList = jo0Var.r;
                int b10 = b1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((io0) b1Var.a).a(((go0) arrayList.get(b10)).a.h == jo0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void E(s4.b1 b1Var, int i10) {
    }
}
