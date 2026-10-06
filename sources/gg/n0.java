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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ci0;
import org.telegram.ui.di0;
import org.telegram.ui.vi1;
import org.telegram.ui.zi1;
import w7.z5;
import yh.y3;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class n0 extends yl0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n0(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.yl0
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
                return ((s0) obj).e3.size();
            case 1:
                return 1;
            case 2:
                return ((ao0) obj).r.size();
            case 3:
                return ((di0) obj).c.size();
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
                ((r0) c1Var).v.setData((q0) ((s0) this.d).e3.get(i10));
                break;
            case 1:
                break;
            case 2:
                View view = c1Var.a;
                ao0 ao0Var = (ao0) this.d;
                ArrayList arrayList = ao0Var.r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    xn0 xn0Var = (xn0) arrayList.get(i10);
                    zn0 zn0Var = (zn0) view;
                    zg.m0 m0Var = zn0Var.d;
                    boolean z10 = m0Var == null || !m0Var.equals(xn0Var.a);
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = xn0Var.a.g();
                        tL_reactionCount.count = xn0Var.b;
                        ao0 ao0Var2 = zn0Var.s;
                        yn0 yn0Var = new yn0(zn0Var, ao0Var2.a, zn0Var, tL_reactionCount, ao0Var2.c);
                        zn0Var.a = yn0Var;
                        yn0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        yn0 yn0Var2 = zn0Var.a;
                        yn0Var2.q = true;
                        yn0Var2.S = true;
                    } else {
                        zn0Var.a.w = xn0Var.b;
                    }
                    zn0Var.d = xn0Var.a;
                    if (!z10) {
                        yn0 yn0Var3 = zn0Var.a;
                        yn0Var3.f = yn0Var3.A;
                    }
                    zn0Var.a.A = AndroidUtilities.dp(44.33f);
                    zn0Var.a.u = !TextUtils.isEmpty(xn0Var.c);
                    yn0 yn0Var4 = zn0Var.a;
                    boolean z11 = yn0Var4.u;
                    o6 o6Var = yn0Var4.G;
                    if (z11) {
                        o6Var.q(Emoji.replaceEmoji(xn0Var.c, o6Var.a.getFontMetricsInt(), false), !z10, true);
                    } else if (o6Var != null) {
                        o6Var.q("", !z10, true);
                    }
                    yn0 yn0Var5 = zn0Var.a;
                    Integer.toString(xn0Var.b);
                    yn0Var5.getClass();
                    zn0Var.a.F.c(xn0Var.b, !z10);
                    yn0 yn0Var6 = zn0Var.a;
                    if (yn0Var6.F != null && (yn0Var6.w > 0 || yn0Var6.u)) {
                        yn0Var6.A = (int) (AndroidUtilities.dp(zn0Var.a.u ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + zn0Var.a.G.d + yn0Var6.A);
                    }
                    if (z10) {
                        yn0 yn0Var7 = zn0Var.a;
                        yn0Var7.f = yn0Var7.A;
                    }
                    zn0Var.a.B = AndroidUtilities.dp(28.0f);
                    yn0 yn0Var8 = zn0Var.a;
                    yn0Var8.p = zn0Var.e;
                    if (zn0Var.r) {
                        yn0Var8.a();
                    }
                    if (!z10) {
                        zn0Var.requestLayout();
                    }
                    ((zn0) view).a(xn0Var.a.h == ao0Var.h, false);
                    break;
                }
                break;
            case 3:
                ci0 ci0Var = (ci0) c1Var.a;
                di0 di0Var = (di0) this.d;
                ci0Var.a((TLObject) di0Var.c.get(i10), false, ((Integer) di0Var.b.get(i10)).intValue());
                break;
            case 4:
                ((vi1) c1Var.a).a = WallpapersListActivity.k0[i10];
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
                ua uaVar = (ua) c1Var.a;
                int i11 = ((y3) this.d).P0[(r0.length - 1) - i10];
                if (uaVar.a != i11) {
                    uaVar.a = i11;
                    uaVar.requestLayout();
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
                return new il0(((va) this.d).X);
            case 2:
                ao0 ao0Var = (ao0) this.d;
                return new il0(new zn0(ao0Var, ao0Var.getContext()));
            case 3:
                ci0 ci0Var = new ci0(viewGroup.getContext());
                ci0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(50.0f)));
                return new il0(ci0Var);
            case 4:
                zi1 zi1Var = (zi1) this.d;
                return new il0(new vi1(zi1Var.E, zi1Var.c));
            case 5:
                rg.j jVar = (rg.j) this.d;
                d6 d6Var = jVar.a;
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
                    iVar.addView(imageView, z5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    iVar.a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    bi.m(i6.G6, d6Var, textView, 1, 14.0f);
                    iVar.addView(textView, z5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    iVar.b = textView2;
                    bi.m(i6.y6, d6Var, textView2, 1, 14.0f);
                    iVar.addView(textView2, z5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = iVar;
                }
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            default:
                ua uaVar = new ua(((y3) this.d).getContext());
                uaVar.a = 0;
                return new il0(uaVar);
        }
    }

    @Override // s4.h0
    public void y(s4.c1 c1Var) {
        switch (this.c) {
            case 2:
                ao0 ao0Var = (ao0) this.d;
                ArrayList arrayList = ao0Var.r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((zn0) c1Var.a).a(((xn0) arrayList.get(b10)).a.h == ao0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void E(s4.c1 c1Var, int i10) {
    }
}
