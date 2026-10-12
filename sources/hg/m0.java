package hg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ki0;
import org.telegram.ui.li0;
import org.telegram.ui.oj1;
import org.telegram.ui.sj1;
import w7.a6;
import zh.r3;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class m0 extends lm0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m0(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        switch (this.c) {
        }
        return false;
    }

    public void F(int i10, int i11) {
        int[] iArr = ((r3) this.d).Q0;
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
                return ((r0) obj).V2.size();
            case 1:
                return 1;
            case 2:
                return ((ko0) obj).r.size();
            case 3:
                return ((li0) obj).c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.k0;
                return 12;
            case 5:
                return ((sg.j) obj).d.size();
            default:
                return ((r3) obj).Q0.length;
        }
    }

    @Override // s4.g0
    public int j(int i10) {
        switch (this.c) {
            case 1:
                return i10;
            case 5:
                return ((sg.h) ((sg.j) this.d).d.get(i10)).a;
            default:
                return super.j(i10);
        }
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        switch (this.c) {
            case 0:
                ((q0) b1Var).v.setData((p0) ((r0) this.d).V2.get(i10));
                break;
            case 1:
                break;
            case 2:
                View view = b1Var.a;
                ko0 ko0Var = (ko0) this.d;
                ArrayList arrayList = ko0Var.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ho0 ho0Var = (ho0) arrayList.get(i10);
                    jo0 jo0Var = (jo0) view;
                    ah.i1 i1Var = jo0Var.d;
                    boolean z10 = i1Var == null || !i1Var.equals(ho0Var.a);
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = ho0Var.a.g();
                        tL_reactionCount.count = ho0Var.b;
                        ko0 ko0Var2 = jo0Var.s;
                        io0 io0Var = new io0(jo0Var, ko0Var2.a, jo0Var, tL_reactionCount, ko0Var2.c);
                        jo0Var.a = io0Var;
                        io0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        io0 io0Var2 = jo0Var.a;
                        io0Var2.q = true;
                        io0Var2.S = true;
                    } else {
                        jo0Var.a.w = ho0Var.b;
                    }
                    jo0Var.d = ho0Var.a;
                    if (!z10) {
                        io0 io0Var3 = jo0Var.a;
                        io0Var3.f = io0Var3.A;
                    }
                    jo0Var.a.A = AndroidUtilities.dp(44.33f);
                    jo0Var.a.u = !TextUtils.isEmpty(ho0Var.c);
                    io0 io0Var4 = jo0Var.a;
                    boolean z11 = io0Var4.u;
                    r6 r6Var = io0Var4.G;
                    if (z11) {
                        r6Var.t(Emoji.replaceEmoji(ho0Var.c, r6Var.a.getFontMetricsInt(), false), !z10, true);
                    } else if (r6Var != null) {
                        r6Var.t("", !z10, true);
                    }
                    io0 io0Var5 = jo0Var.a;
                    Integer.toString(ho0Var.b);
                    io0Var5.getClass();
                    jo0Var.a.F.c(ho0Var.b, !z10);
                    io0 io0Var6 = jo0Var.a;
                    if (io0Var6.F != null && (io0Var6.w > 0 || io0Var6.u)) {
                        io0Var6.A = (int) (AndroidUtilities.dp(jo0Var.a.u ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + jo0Var.a.G.d + io0Var6.A);
                    }
                    if (z10) {
                        io0 io0Var7 = jo0Var.a;
                        io0Var7.f = io0Var7.A;
                    }
                    jo0Var.a.B = AndroidUtilities.dp(28.0f);
                    io0 io0Var8 = jo0Var.a;
                    io0Var8.p = jo0Var.e;
                    if (jo0Var.r) {
                        io0Var8.a();
                    }
                    if (!z10) {
                        jo0Var.requestLayout();
                    }
                    ((jo0) view).a(ho0Var.a.h == ko0Var.h, false);
                    break;
                }
                break;
            case 3:
                ki0 ki0Var = (ki0) b1Var.a;
                li0 li0Var = (li0) this.d;
                ki0Var.a((TLObject) li0Var.c.get(i10), false, ((Integer) li0Var.b.get(i10)).intValue());
                break;
            case 4:
                ((oj1) b1Var.a).a = WallpapersListActivity.m0[i10];
                break;
            case 5:
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
            default:
                va vaVar = (va) b1Var.a;
                int i11 = ((r3) this.d).Q0[(r0.length - 1) - i10];
                if (vaVar.a != i11) {
                    vaVar.a = i11;
                    vaVar.requestLayout();
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
                o0 o0Var = new o0(viewGroup.getContext(), ((r0) this.d).n2);
                q0 q0Var = new q0(o0Var);
                q0Var.v = o0Var;
                o0Var.setLayoutParams(new s4.o0(-2, AndroidUtilities.dp(30.0f)));
                return q0Var;
            case 1:
                return new wl0(((wa) this.d).X);
            case 2:
                ko0 ko0Var = (ko0) this.d;
                return new wl0(new jo0(ko0Var, ko0Var.getContext()));
            case 3:
                ki0 ki0Var = new ki0(viewGroup.getContext());
                ki0Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(50.0f)));
                return new wl0(ki0Var);
            case 4:
                sj1 sj1Var = (sj1) this.d;
                return new wl0(new oj1(sj1Var.E, sj1Var.c));
            case 5:
                sg.j jVar = (sg.j) this.d;
                c6 c6Var = jVar.a;
                if (i10 == 0) {
                    view = new sg.g(jVar, jVar.getContext());
                } else if (i10 == 2) {
                    view = new t3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    sg.i iVar = new sg.i(context);
                    ImageView imageView = new ImageView(context);
                    iVar.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    iVar.addView(imageView, a6.a(28.0f, 25.0f, 12.0f, 16.0f, 0.0f, 28, 0));
                    TextView textView = new TextView(context);
                    iVar.a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    yh.n(g6.G6, c6Var, textView, 1, 14.0f);
                    iVar.addView(textView, a6.a(-2.0f, 68.0f, 8.0f, 16.0f, 0.0f, -1, 0));
                    TextView textView2 = new TextView(context);
                    iVar.b = textView2;
                    yh.n(g6.y6, c6Var, textView2, 1, 14.0f);
                    iVar.addView(textView2, a6.a(-2.0f, 68.0f, 28.0f, 16.0f, 8.0f, -1, 0));
                    view = iVar;
                }
                return k3.l(view, view, -1, -2);
            default:
                va vaVar = new va(((r3) this.d).getContext());
                vaVar.a = 0;
                return new wl0(vaVar);
        }
    }

    @Override // s4.g0
    public void y(s4.b1 b1Var) {
        switch (this.c) {
            case 2:
                ko0 ko0Var = (ko0) this.d;
                ArrayList arrayList = ko0Var.r;
                int b10 = b1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((jo0) b1Var.a).a(((ho0) arrayList.get(b10)).a.h == ko0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void E(s4.b1 b1Var, int i10) {
    }
}
