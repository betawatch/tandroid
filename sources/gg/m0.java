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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.gi0;
import org.telegram.ui.hi0;
import org.telegram.ui.hj1;
import org.telegram.ui.lj1;
import w7.x5;
import yh.s3;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class m0 extends pm0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m0(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        switch (this.c) {
        }
        return false;
    }

    public void F(int i10, int i11) {
        int[] iArr = ((s3) this.d).Q0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override // s4.i0
    public final int h() {
        int i10 = this.c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((r0) obj).V2.size();
            case 1:
                return 1;
            case 2:
                return ((no0) obj).r.size();
            case 3:
                return ((hi0) obj).c.size();
            case 4:
                int[][] iArr = WallpapersListActivity.k0;
                return 12;
            case 5:
                return ((rg.j) obj).d.size();
            default:
                return ((s3) obj).Q0.length;
        }
    }

    @Override // s4.i0
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

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        switch (this.c) {
            case 0:
                ((q0) d1Var).v.setData((p0) ((r0) this.d).V2.get(i10));
                break;
            case 1:
                break;
            case 2:
                View view = d1Var.a;
                no0 no0Var = (no0) this.d;
                ArrayList arrayList = no0Var.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    ko0 ko0Var = (ko0) arrayList.get(i10);
                    mo0 mo0Var = (mo0) view;
                    zg.n0 n0Var = mo0Var.d;
                    boolean z10 = n0Var == null || !n0Var.equals(ko0Var.a);
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = ko0Var.a.g();
                        tL_reactionCount.count = ko0Var.b;
                        no0 no0Var2 = mo0Var.s;
                        lo0 lo0Var = new lo0(mo0Var, no0Var2.a, mo0Var, tL_reactionCount, no0Var2.c);
                        mo0Var.a = lo0Var;
                        lo0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        lo0 lo0Var2 = mo0Var.a;
                        lo0Var2.q = true;
                        lo0Var2.S = true;
                    } else {
                        mo0Var.a.w = ko0Var.b;
                    }
                    mo0Var.d = ko0Var.a;
                    if (!z10) {
                        lo0 lo0Var3 = mo0Var.a;
                        lo0Var3.f = lo0Var3.A;
                    }
                    mo0Var.a.A = AndroidUtilities.dp(44.33f);
                    mo0Var.a.u = !TextUtils.isEmpty(ko0Var.c);
                    lo0 lo0Var4 = mo0Var.a;
                    boolean z11 = lo0Var4.u;
                    q6 q6Var = lo0Var4.G;
                    if (z11) {
                        q6Var.t(Emoji.replaceEmoji(ko0Var.c, q6Var.a.getFontMetricsInt(), false), !z10, true);
                    } else if (q6Var != null) {
                        q6Var.t("", !z10, true);
                    }
                    lo0 lo0Var5 = mo0Var.a;
                    Integer.toString(ko0Var.b);
                    lo0Var5.getClass();
                    mo0Var.a.F.c(ko0Var.b, !z10);
                    lo0 lo0Var6 = mo0Var.a;
                    if (lo0Var6.F != null && (lo0Var6.w > 0 || lo0Var6.u)) {
                        lo0Var6.A = (int) (AndroidUtilities.dp(mo0Var.a.u ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + mo0Var.a.G.d + lo0Var6.A);
                    }
                    if (z10) {
                        lo0 lo0Var7 = mo0Var.a;
                        lo0Var7.f = lo0Var7.A;
                    }
                    mo0Var.a.B = AndroidUtilities.dp(28.0f);
                    lo0 lo0Var8 = mo0Var.a;
                    lo0Var8.p = mo0Var.e;
                    if (mo0Var.r) {
                        lo0Var8.a();
                    }
                    if (!z10) {
                        mo0Var.requestLayout();
                    }
                    ((mo0) view).a(ko0Var.a.h == no0Var.h, false);
                    break;
                }
                break;
            case 3:
                gi0 gi0Var = (gi0) d1Var.a;
                hi0 hi0Var = (hi0) this.d;
                gi0Var.a((TLObject) hi0Var.c.get(i10), false, ((Integer) hi0Var.b.get(i10)).intValue());
                break;
            case 4:
                ((hj1) d1Var.a).a = WallpapersListActivity.m0[i10];
                break;
            case 5:
                rg.j jVar = (rg.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((rg.h) arrayList2.get(i10)).a == 1) {
                    rg.i iVar = (rg.i) d1Var.a;
                    iVar.c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.c.setImageDrawable(jVar.getContext().getDrawable(((rg.h) arrayList2.get(i10)).b));
                    iVar.a.setText(((rg.h) arrayList2.get(i10)).c);
                    iVar.b.setText(((rg.h) arrayList2.get(i10)).d);
                    break;
                }
                break;
            default:
                wa waVar = (wa) d1Var.a;
                int i11 = ((s3) this.d).Q0[(r0.length - 1) - i10];
                if (waVar.a != i11) {
                    waVar.a = i11;
                    waVar.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.c) {
            case 0:
                o0 o0Var = new o0(viewGroup.getContext(), ((r0) this.d).n2);
                q0 q0Var = new q0(o0Var);
                q0Var.v = o0Var;
                o0Var.setLayoutParams(new s4.q0(-2, AndroidUtilities.dp(30.0f)));
                return q0Var;
            case 1:
                return new am0(((xa) this.d).X);
            case 2:
                no0 no0Var = (no0) this.d;
                return new am0(new mo0(no0Var, no0Var.getContext()));
            case 3:
                gi0 gi0Var = new gi0(viewGroup.getContext());
                gi0Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(50.0f)));
                return new am0(gi0Var);
            case 4:
                lj1 lj1Var = (lj1) this.d;
                return new am0(new hj1(lj1Var.E, lj1Var.c));
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
                    iVar.addView(imageView, x5.a(28.0f, 25.0f, 12.0f, 16.0f, 0.0f, 28, 0));
                    TextView textView = new TextView(context);
                    iVar.a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    bi.o(i6.G6, e6Var, textView, 1, 14.0f);
                    iVar.addView(textView, x5.a(-2.0f, 68.0f, 8.0f, 16.0f, 0.0f, -1, 0));
                    TextView textView2 = new TextView(context);
                    iVar.b = textView2;
                    bi.o(i6.y6, e6Var, textView2, 1, 14.0f);
                    iVar.addView(textView2, x5.a(-2.0f, 68.0f, 28.0f, 16.0f, 8.0f, -1, 0));
                    view = iVar;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                wa waVar = new wa(((s3) this.d).getContext());
                waVar.a = 0;
                return new am0(waVar);
        }
    }

    @Override // s4.i0
    public void y(s4.d1 d1Var) {
        switch (this.c) {
            case 2:
                no0 no0Var = (no0) this.d;
                ArrayList arrayList = no0Var.r;
                int b10 = d1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((mo0) d1Var.a).a(((ko0) arrayList.get(b10)).a.h == no0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void E(s4.d1 d1Var, int i10) {
    }
}
