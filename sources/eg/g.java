package eg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import k7.b6;
import lh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ai;
import org.telegram.ui.ti1;
import org.telegram.ui.xh0;
import org.telegram.ui.xi1;
import org.telegram.ui.yh0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class g extends ql0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        switch (this.c) {
        }
        return true;
    }

    public void F(int i10, int i11) {
        int[] iArr = ((g5) this.d).M0;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        l();
    }

    @Override // f2.o0
    public final int h() {
        int i10 = this.c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                return ((m) obj).d.size();
            case 1:
                return ((g5) obj).M0.length;
            case 2:
                return 1;
            case 3:
                return ((nn0) obj).r.size();
            case 4:
                return ((yh0) obj).c.size();
            case 5:
                int[][] iArr = WallpapersListActivity.h0;
                return 12;
            default:
                return ((tf.g0) obj).U2.size();
        }
    }

    @Override // f2.o0
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

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        switch (this.c) {
            case 0:
                m mVar = (m) this.d;
                ArrayList arrayList = mVar.d;
                if (((k) arrayList.get(i10)).a == 1) {
                    l lVar = (l) l1Var.a;
                    lVar.c.setColorFilter(new PorterDuffColorFilter(mVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    lVar.c.setImageDrawable(mVar.getContext().getDrawable(((k) arrayList.get(i10)).b));
                    lVar.a.setText(((k) arrayList.get(i10)).c);
                    lVar.b.setText(((k) arrayList.get(i10)).d);
                    break;
                }
                break;
            case 1:
                la laVar = (la) l1Var.a;
                int i11 = ((g5) this.d).M0[(r0.length - 1) - i10];
                if (laVar.a != i11) {
                    laVar.a = i11;
                    laVar.requestLayout();
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                View view = l1Var.a;
                nn0 nn0Var = (nn0) this.d;
                ArrayList arrayList2 = nn0Var.r;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    kn0 kn0Var = (kn0) arrayList2.get(i10);
                    mn0 mn0Var = (mn0) view;
                    mg.q0 q0Var = mn0Var.d;
                    boolean z4 = q0Var == null || !q0Var.equals(kn0Var.a);
                    if (z4) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = kn0Var.a.g();
                        tL_reactionCount.count = kn0Var.b;
                        nn0 nn0Var2 = mn0Var.s;
                        ln0 ln0Var = new ln0(mn0Var, nn0Var2.a, mn0Var, tL_reactionCount, nn0Var2.c);
                        mn0Var.a = ln0Var;
                        ln0Var.F.d(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                        ln0 ln0Var2 = mn0Var.a;
                        ln0Var2.q = true;
                        ln0Var2.S = true;
                    } else {
                        mn0Var.a.w = kn0Var.b;
                    }
                    mn0Var.d = kn0Var.a;
                    if (!z4) {
                        ln0 ln0Var3 = mn0Var.a;
                        ln0Var3.f = ln0Var3.A;
                    }
                    mn0Var.a.A = AndroidUtilities.dp(44.33f);
                    mn0Var.a.u = !TextUtils.isEmpty(kn0Var.c);
                    ln0 ln0Var4 = mn0Var.a;
                    boolean z10 = ln0Var4.u;
                    j6 j6Var = ln0Var4.G;
                    if (z10) {
                        j6Var.q(Emoji.replaceEmoji(kn0Var.c, j6Var.a.getFontMetricsInt(), false), !z4, true);
                    } else if (j6Var != null) {
                        j6Var.q("", !z4, true);
                    }
                    ln0 ln0Var5 = mn0Var.a;
                    Integer.toString(kn0Var.b);
                    ln0Var5.getClass();
                    mn0Var.a.F.c(kn0Var.b, !z4);
                    ln0 ln0Var6 = mn0Var.a;
                    if (ln0Var6.F != null && (ln0Var6.w > 0 || ln0Var6.u)) {
                        ln0Var6.A = (int) (AndroidUtilities.dp(mn0Var.a.u ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + mn0Var.a.G.d + ln0Var6.A);
                    }
                    if (z4) {
                        ln0 ln0Var7 = mn0Var.a;
                        ln0Var7.f = ln0Var7.A;
                    }
                    mn0Var.a.B = AndroidUtilities.dp(28.0f);
                    ln0 ln0Var8 = mn0Var.a;
                    ln0Var8.p = mn0Var.e;
                    if (mn0Var.r) {
                        ln0Var8.a();
                    }
                    if (!z4) {
                        mn0Var.requestLayout();
                    }
                    ((mn0) view).a(kn0Var.a.h == nn0Var.h, false);
                    break;
                }
                break;
            case 4:
                xh0 xh0Var = (xh0) l1Var.a;
                yh0 yh0Var = (yh0) this.d;
                xh0Var.a((TLObject) yh0Var.c.get(i10), false, ((Integer) yh0Var.b.get(i10)).intValue());
                break;
            case 5:
                ((ti1) l1Var.a).a = WallpapersListActivity.j0[i10];
                break;
            default:
                ((tf.f0) l1Var).v.setData((tf.e0) ((tf.g0) this.d).U2.get(i10));
                break;
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        switch (this.c) {
            case 0:
                m mVar = (m) this.d;
                f6 f6Var = mVar.a;
                if (i10 == 0) {
                    view = new j(mVar, mVar.getContext());
                } else if (i10 == 2) {
                    view = new r3(mVar.getContext(), 16);
                } else {
                    Context context = mVar.getContext();
                    l lVar = new l(context);
                    ImageView imageView = new ImageView(context);
                    lVar.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    lVar.addView(imageView, b6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    lVar.a = textView;
                    textView.setTypeface(AndroidUtilities.bold());
                    org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 14.0f);
                    lVar.addView(textView, b6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    lVar.b = textView2;
                    org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.y6, f6Var, textView2, 1, 14.0f);
                    lVar.addView(textView2, b6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = lVar;
                }
                return ai.n(view, view, -1, -2);
            case 1:
                la laVar = new la(((g5) this.d).getContext());
                laVar.a = 0;
                return new dl0(laVar);
            case 2:
                return new dl0(((ma) this.d).U);
            case 3:
                nn0 nn0Var = (nn0) this.d;
                return new dl0(new mn0(nn0Var, nn0Var.getContext()));
            case 4:
                xh0 xh0Var = new xh0(viewGroup.getContext());
                xh0Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(50.0f)));
                return new dl0(xh0Var);
            case 5:
                xi1 xi1Var = (xi1) this.d;
                return new dl0(new ti1(xi1Var.B, xi1Var.c));
            default:
                tf.d0 d0Var = new tf.d0(viewGroup.getContext(), ((tf.g0) this.d).m2);
                tf.f0 f0Var = new tf.f0(d0Var);
                f0Var.v = d0Var;
                d0Var.setLayoutParams(new f2.w0(-2, AndroidUtilities.dp(30.0f)));
                return f0Var;
        }
    }

    @Override // f2.o0
    public void y(f2.l1 l1Var) {
        switch (this.c) {
            case 3:
                nn0 nn0Var = (nn0) this.d;
                ArrayList arrayList = nn0Var.r;
                int b10 = l1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((mn0) l1Var.a).a(((kn0) arrayList.get(b10)).a.h == nn0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void E(f2.l1 l1Var, int i10) {
    }
}
