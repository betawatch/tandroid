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
import org.telegram.messenger.mk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ph0;
import org.telegram.ui.qh0;
import org.telegram.ui.rh1;
import org.telegram.ui.vh1;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class m5 extends im0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m5(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.im0
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
                return ((hg.q0) obj).V2.size();
            case 2:
                return 1;
            case 3:
                return ((go0) obj).r.size();
            case 4:
                return ((qh0) obj).c.size();
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
                ((hg.p0) b1Var).v.setData((hg.o0) ((hg.q0) this.d).V2.get(i10));
                break;
            case 2:
                break;
            case 3:
                View view = b1Var.a;
                go0 go0Var = (go0) this.d;
                ArrayList arrayList = go0Var.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    do0 do0Var = (do0) arrayList.get(i10);
                    fo0 fo0Var = (fo0) view;
                    ah.i1 i1Var = fo0Var.d;
                    boolean z10 = i1Var == null || !i1Var.equals(do0Var.a);
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = do0Var.a.g();
                        tL_reactionCount.count = do0Var.b;
                        go0 go0Var2 = fo0Var.s;
                        eo0 eo0Var = new eo0(fo0Var, go0Var2.a, fo0Var, tL_reactionCount, go0Var2.c);
                        fo0Var.a = eo0Var;
                        eo0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        eo0 eo0Var2 = fo0Var.a;
                        eo0Var2.q = true;
                        eo0Var2.S = true;
                    } else {
                        fo0Var.a.w = do0Var.b;
                    }
                    fo0Var.d = do0Var.a;
                    if (!z10) {
                        eo0 eo0Var3 = fo0Var.a;
                        eo0Var3.f = eo0Var3.A;
                    }
                    fo0Var.a.A = AndroidUtilities.dp(44.33f);
                    fo0Var.a.u = !TextUtils.isEmpty(do0Var.c);
                    eo0 eo0Var4 = fo0Var.a;
                    boolean z11 = eo0Var4.u;
                    org.telegram.ui.Components.p6 p6Var = eo0Var4.G;
                    if (z11) {
                        p6Var.t(Emoji.replaceEmoji(do0Var.c, p6Var.a.getFontMetricsInt(), false), !z10, true);
                    } else if (p6Var != null) {
                        p6Var.t("", !z10, true);
                    }
                    eo0 eo0Var5 = fo0Var.a;
                    Integer.toString(do0Var.b);
                    eo0Var5.getClass();
                    fo0Var.a.F.c(do0Var.b, !z10);
                    eo0 eo0Var6 = fo0Var.a;
                    if (eo0Var6.F != null && (eo0Var6.w > 0 || eo0Var6.u)) {
                        eo0Var6.A = (int) (AndroidUtilities.dp(fo0Var.a.u ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + fo0Var.a.G.d + eo0Var6.A);
                    }
                    if (z10) {
                        eo0 eo0Var7 = fo0Var.a;
                        eo0Var7.f = eo0Var7.A;
                    }
                    fo0Var.a.B = AndroidUtilities.dp(28.0f);
                    eo0 eo0Var8 = fo0Var.a;
                    eo0Var8.p = fo0Var.e;
                    if (fo0Var.r) {
                        eo0Var8.a();
                    }
                    if (!z10) {
                        fo0Var.requestLayout();
                    }
                    ((fo0) view).a(do0Var.a.h == go0Var.h, false);
                    break;
                }
                break;
            case 4:
                ph0 ph0Var = (ph0) b1Var.a;
                qh0 qh0Var = (qh0) this.d;
                ph0Var.a((TLObject) qh0Var.c.get(i10), false, ((Integer) qh0Var.b.get(i10)).intValue());
                break;
            case 5:
                ((rh1) b1Var.a).a = WallpapersListActivity.m0[i10];
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
                return new tl0(taVar);
            case 1:
                hg.n0 n0Var = new hg.n0(viewGroup.getContext(), ((hg.q0) this.d).n2);
                hg.p0 p0Var = new hg.p0(n0Var);
                p0Var.v = n0Var;
                n0Var.setLayoutParams(new s4.o0(-2, AndroidUtilities.dp(30.0f)));
                return p0Var;
            case 2:
                return new tl0(((org.telegram.ui.Components.ua) this.d).X);
            case 3:
                go0 go0Var = (go0) this.d;
                return new tl0(new fo0(go0Var, go0Var.getContext()));
            case 4:
                ph0 ph0Var = new ph0(viewGroup.getContext());
                ph0Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(50.0f)));
                return new tl0(ph0Var);
            case 5:
                vh1 vh1Var = (vh1) this.d;
                return new tl0(new rh1(vh1Var.E, vh1Var.c));
            default:
                sg.j jVar = (sg.j) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = jVar.a;
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
                    mk.o(org.telegram.ui.ActionBar.h6.G6, d6Var, textView, 1, 14.0f);
                    iVar.addView(textView, w7.z5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    iVar.b = textView2;
                    mk.o(org.telegram.ui.ActionBar.h6.y6, d6Var, textView2, 1, 14.0f);
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
                go0 go0Var = (go0) this.d;
                ArrayList arrayList = go0Var.r;
                int b10 = b1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((fo0) b1Var.a).a(((do0) arrayList.get(b10)).a.h == go0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void E(s4.b1 b1Var, int i10) {
    }
}
