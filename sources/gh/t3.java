package gh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bi1;
import org.telegram.ui.oh0;
import org.telegram.ui.ph0;
import org.telegram.ui.wh1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t3 extends vk0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t3(Object obj, int i9) {
        this.c = i9;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
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

    public void F(int i9, int i10) {
        int[] iArr = ((k5) this.d).L0;
        if (iArr[0] == i9 && iArr[1] == i10) {
            return;
        }
        iArr[0] = i9;
        iArr[1] = i10;
        l();
    }

    @Override // f2.r0
    public final int h() {
        int i9 = this.c;
        Object obj = this.d;
        switch (i9) {
            case 0:
                return ((k5) obj).L0.length;
            case 1:
                return ((of.o0) obj).T2.size();
            case 2:
                return 1;
            case 3:
                return ((sm0) obj).r.size();
            case 4:
                return ((ph0) obj).c.size();
            case 5:
                int[][] iArr = WallpapersListActivity.g0;
                return 12;
            default:
                return ((zf.j) obj).d.size();
        }
    }

    @Override // f2.r0
    public int j(int i9) {
        switch (this.c) {
            case 2:
                return i9;
            case 6:
                return ((zf.h) ((zf.j) this.d).d.get(i9)).a;
            default:
                return super.j(i9);
        }
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        switch (this.c) {
            case 0:
                org.telegram.ui.Components.la laVar = (org.telegram.ui.Components.la) q1Var.a;
                int i10 = ((k5) this.d).L0[(r0.length - 1) - i9];
                if (laVar.a != i10) {
                    laVar.a = i10;
                    laVar.requestLayout();
                    break;
                }
                break;
            case 1:
                ((of.n0) q1Var).v.setData((of.m0) ((of.o0) this.d).T2.get(i9));
                break;
            case 2:
                break;
            case 3:
                View view = q1Var.a;
                sm0 sm0Var = (sm0) this.d;
                ArrayList arrayList = sm0Var.r;
                if (i9 >= 0 && i9 < arrayList.size()) {
                    pm0 pm0Var = (pm0) arrayList.get(i9);
                    rm0 rm0Var = (rm0) view;
                    hg.r0 r0Var = rm0Var.d;
                    boolean z10 = r0Var == null || !r0Var.equals(pm0Var.a);
                    if (z10) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = pm0Var.a.g();
                        tL_reactionCount.count = pm0Var.b;
                        sm0 sm0Var2 = rm0Var.s;
                        qm0 qm0Var = new qm0(rm0Var, sm0Var2.a, rm0Var, tL_reactionCount, sm0Var2.c);
                        rm0Var.a = qm0Var;
                        qm0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        qm0 qm0Var2 = rm0Var.a;
                        qm0Var2.q = true;
                        qm0Var2.S = true;
                    } else {
                        rm0Var.a.w = pm0Var.b;
                    }
                    rm0Var.d = pm0Var.a;
                    if (!z10) {
                        qm0 qm0Var3 = rm0Var.a;
                        qm0Var3.f = qm0Var3.A;
                    }
                    rm0Var.a.A = AndroidUtilities.dp(44.33f);
                    rm0Var.a.u = !TextUtils.isEmpty(pm0Var.c);
                    qm0 qm0Var4 = rm0Var.a;
                    boolean z11 = qm0Var4.u;
                    org.telegram.ui.Components.i6 i6Var = qm0Var4.G;
                    if (z11) {
                        i6Var.q(Emoji.replaceEmoji(pm0Var.c, i6Var.a.getFontMetricsInt(), false), !z10, true);
                    } else if (i6Var != null) {
                        i6Var.q("", !z10, true);
                    }
                    qm0 qm0Var5 = rm0Var.a;
                    Integer.toString(pm0Var.b);
                    qm0Var5.getClass();
                    rm0Var.a.F.c(pm0Var.b, !z10);
                    qm0 qm0Var6 = rm0Var.a;
                    if (qm0Var6.F != null && (qm0Var6.w > 0 || qm0Var6.u)) {
                        qm0Var6.A = (int) (AndroidUtilities.dp(rm0Var.a.u ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + rm0Var.a.G.d + qm0Var6.A);
                    }
                    if (z10) {
                        qm0 qm0Var7 = rm0Var.a;
                        qm0Var7.f = qm0Var7.A;
                    }
                    rm0Var.a.B = AndroidUtilities.dp(28.0f);
                    qm0 qm0Var8 = rm0Var.a;
                    qm0Var8.p = rm0Var.e;
                    if (rm0Var.r) {
                        qm0Var8.a();
                    }
                    if (!z10) {
                        rm0Var.requestLayout();
                    }
                    ((rm0) view).a(pm0Var.a.h == sm0Var.h, false);
                    break;
                }
                break;
            case 4:
                oh0 oh0Var = (oh0) q1Var.a;
                ph0 ph0Var = (ph0) this.d;
                oh0Var.a((TLObject) ph0Var.c.get(i9), false, ((Integer) ph0Var.b.get(i9)).intValue());
                break;
            case 5:
                ((wh1) q1Var.a).a = WallpapersListActivity.i0[i9];
                break;
            default:
                zf.j jVar = (zf.j) this.d;
                ArrayList arrayList2 = jVar.d;
                if (((zf.h) arrayList2.get(i9)).a == 1) {
                    zf.i iVar = (zf.i) q1Var.a;
                    iVar.c.setColorFilter(new PorterDuffColorFilter(jVar.e.getPixel(i9, 0), PorterDuff.Mode.MULTIPLY));
                    iVar.c.setImageDrawable(jVar.getContext().getDrawable(((zf.h) arrayList2.get(i9)).b));
                    iVar.a.setText(((zf.h) arrayList2.get(i9)).c);
                    iVar.b.setText(((zf.h) arrayList2.get(i9)).d);
                    break;
                }
                break;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        switch (this.c) {
            case 0:
                org.telegram.ui.Components.la laVar = new org.telegram.ui.Components.la(((k5) this.d).getContext());
                laVar.a = 0;
                return new ik0(laVar);
            case 1:
                of.l0 l0Var = new of.l0(viewGroup.getContext(), ((of.o0) this.d).l2);
                of.n0 n0Var = new of.n0(l0Var);
                n0Var.v = l0Var;
                l0Var.setLayoutParams(new f2.a1(-2, AndroidUtilities.dp(30.0f)));
                return n0Var;
            case 2:
                return new ik0(((org.telegram.ui.Components.ma) this.d).T);
            case 3:
                sm0 sm0Var = (sm0) this.d;
                return new ik0(new rm0(sm0Var, sm0Var.getContext()));
            case 4:
                oh0 oh0Var = new oh0(viewGroup.getContext());
                oh0Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(50.0f)));
                return new ik0(oh0Var);
            case 5:
                bi1 bi1Var = (bi1) this.d;
                return new ik0(new wh1(bi1Var.A, bi1Var.c));
            default:
                zf.j jVar = (zf.j) this.d;
                org.telegram.ui.ActionBar.b6 b6Var = jVar.a;
                if (i9 == 0) {
                    view = new zf.g(jVar, jVar.getContext());
                } else if (i9 == 2) {
                    view = new org.telegram.ui.Cells.t3(jVar.getContext(), 16);
                } else {
                    Context context = jVar.getContext();
                    zf.i iVar = new zf.i(context);
                    ImageView imageView = new ImageView(context);
                    iVar.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    iVar.addView(imageView, g7.e6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    iVar.a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    ll.n(org.telegram.ui.ActionBar.f6.G6, b6Var, textView, 1, 14.0f);
                    iVar.addView(textView, g7.e6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    iVar.b = textView2;
                    ll.n(org.telegram.ui.ActionBar.f6.y6, b6Var, textView2, 1, 14.0f);
                    iVar.addView(textView2, g7.e6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = iVar;
                }
                return j3.r0.s(view, view, -1, -2);
        }
    }

    @Override // f2.r0
    public void y(f2.q1 q1Var) {
        switch (this.c) {
            case 3:
                sm0 sm0Var = (sm0) this.d;
                ArrayList arrayList = sm0Var.r;
                int b10 = q1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((rm0) q1Var.a).a(((pm0) arrayList.get(b10)).a.h == sm0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void E(f2.q1 q1Var, int i9) {
    }
}
