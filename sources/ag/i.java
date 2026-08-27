package ag;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import h7.z5;
import hh.i5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ai1;
import org.telegram.ui.qh0;
import org.telegram.ui.rh0;
import org.telegram.ui.vh1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i extends yk0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        switch (this.c) {
        }
        return true;
    }

    public void F(int i10, int i11) {
        int[] iArr = ((i5) this.d).L0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override // f2.q0
    public final int h() {
        int i10 = this.c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((o) obj).d.size();
            case 1:
                return ((i5) obj).L0.length;
            case 2:
                return 1;
            case 3:
                return ((um0) obj).r.size();
            case 4:
                return ((rh0) obj).c.size();
            case 5:
                int[][] iArr = WallpapersListActivity.g0;
                return 12;
            default:
                return ((pf.g0) obj).T2.size();
        }
    }

    @Override // f2.q0
    public int j(int i10) {
        switch (this.c) {
            case 0:
                return ((m) ((o) this.d).d.get(i10)).a;
            case 1:
            default:
                return super.j(i10);
            case 2:
                return i10;
        }
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        switch (this.c) {
            case 0:
                o oVar = (o) this.d;
                ArrayList arrayList = oVar.d;
                if (((m) arrayList.get(i10)).a == 1) {
                    n nVar = (n) o1Var.a;
                    nVar.c.setColorFilter(new PorterDuffColorFilter(oVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    nVar.c.setImageDrawable(oVar.getContext().getDrawable(((m) arrayList.get(i10)).b));
                    nVar.a.setText(((m) arrayList.get(i10)).c);
                    nVar.b.setText(((m) arrayList.get(i10)).d);
                    break;
                }
                break;
            case 1:
                ja jaVar = (ja) o1Var.a;
                int i11 = ((i5) this.d).L0[(r0.length - 1) - i10];
                if (jaVar.a != i11) {
                    jaVar.a = i11;
                    jaVar.requestLayout();
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                View view = o1Var.a;
                um0 um0Var = (um0) this.d;
                ArrayList arrayList2 = um0Var.r;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    rm0 rm0Var = (rm0) arrayList2.get(i10);
                    tm0 tm0Var = (tm0) view;
                    ig.q0 q0Var = tm0Var.d;
                    boolean z10 = q0Var == null || !q0Var.equals(rm0Var.a);
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = rm0Var.a.g();
                        tL_reactionCount.count = rm0Var.b;
                        um0 um0Var2 = tm0Var.s;
                        sm0 sm0Var = new sm0(tm0Var, um0Var2.a, tm0Var, tL_reactionCount, um0Var2.c);
                        tm0Var.a = sm0Var;
                        sm0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        sm0 sm0Var2 = tm0Var.a;
                        sm0Var2.q = true;
                        sm0Var2.S = true;
                    } else {
                        tm0Var.a.w = rm0Var.b;
                    }
                    tm0Var.d = rm0Var.a;
                    if (!z10) {
                        sm0 sm0Var3 = tm0Var.a;
                        sm0Var3.f = sm0Var3.A;
                    }
                    tm0Var.a.A = AndroidUtilities.dp(44.33f);
                    tm0Var.a.u = !TextUtils.isEmpty(rm0Var.c);
                    sm0 sm0Var4 = tm0Var.a;
                    boolean z11 = sm0Var4.u;
                    i6 i6Var = sm0Var4.G;
                    if (z11) {
                        i6Var.q(Emoji.replaceEmoji(rm0Var.c, i6Var.a.getFontMetricsInt(), false), !z10, true);
                    } else if (i6Var != null) {
                        i6Var.q("", !z10, true);
                    }
                    sm0 sm0Var5 = tm0Var.a;
                    Integer.toString(rm0Var.b);
                    sm0Var5.getClass();
                    tm0Var.a.F.c(rm0Var.b, !z10);
                    sm0 sm0Var6 = tm0Var.a;
                    if (sm0Var6.F != null && (sm0Var6.w > 0 || sm0Var6.u)) {
                        sm0Var6.A = (int) (AndroidUtilities.dp(tm0Var.a.u ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + tm0Var.a.G.d + sm0Var6.A);
                    }
                    if (z10) {
                        sm0 sm0Var7 = tm0Var.a;
                        sm0Var7.f = sm0Var7.A;
                    }
                    tm0Var.a.B = AndroidUtilities.dp(28.0f);
                    sm0 sm0Var8 = tm0Var.a;
                    sm0Var8.p = tm0Var.e;
                    if (tm0Var.r) {
                        sm0Var8.a();
                    }
                    if (!z10) {
                        tm0Var.requestLayout();
                    }
                    ((tm0) view).a(rm0Var.a.h == um0Var.h, false);
                    break;
                }
                break;
            case 4:
                qh0 qh0Var = (qh0) o1Var.a;
                rh0 rh0Var = (rh0) this.d;
                qh0Var.a((TLObject) rh0Var.c.get(i10), false, ((Integer) rh0Var.b.get(i10)).intValue());
                break;
            case 5:
                ((vh1) o1Var.a).a = WallpapersListActivity.i0[i10];
                break;
            default:
                ((pf.f0) o1Var).v.setData((pf.e0) ((pf.g0) this.d).T2.get(i10));
                break;
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.c) {
            case 0:
                o oVar = (o) this.d;
                c6 c6Var = oVar.a;
                if (i10 == 0) {
                    view = new l(oVar, oVar.getContext());
                } else if (i10 == 2) {
                    view = new q3(oVar.getContext(), 16);
                } else {
                    Context context = oVar.getContext();
                    n nVar = new n(context);
                    ImageView imageView = new ImageView(context);
                    nVar.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    nVar.addView(imageView, z5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    nVar.a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    rl.l(g6.G6, c6Var, textView, 1, 14.0f);
                    nVar.addView(textView, z5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    nVar.b = textView2;
                    rl.l(g6.y6, c6Var, textView2, 1, 14.0f);
                    nVar.addView(textView2, z5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = nVar;
                }
                return pa.l(view, view, -1, -2);
            case 1:
                ja jaVar = new ja(((i5) this.d).getContext());
                jaVar.a = 0;
                return new lk0(jaVar);
            case 2:
                return new lk0(((ka) this.d).T);
            case 3:
                um0 um0Var = (um0) this.d;
                return new lk0(new tm0(um0Var, um0Var.getContext()));
            case 4:
                qh0 qh0Var = new qh0(viewGroup.getContext());
                qh0Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(50.0f)));
                return new lk0(qh0Var);
            case 5:
                ai1 ai1Var = (ai1) this.d;
                return new lk0(new vh1(ai1Var.A, ai1Var.c));
            default:
                pf.d0 d0Var = new pf.d0(viewGroup.getContext(), ((pf.g0) this.d).l2);
                pf.f0 f0Var = new pf.f0(d0Var);
                f0Var.v = d0Var;
                d0Var.setLayoutParams(new f2.y0(-2, AndroidUtilities.dp(30.0f)));
                return f0Var;
        }
    }

    @Override // f2.q0
    public void y(f2.o1 o1Var) {
        switch (this.c) {
            case 3:
                um0 um0Var = (um0) this.d;
                ArrayList arrayList = um0Var.r;
                int b10 = o1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((tm0) o1Var.a).a(((rm0) arrayList.get(b10)).a.h == um0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void E(f2.o1 o1Var, int i10) {
    }
}
