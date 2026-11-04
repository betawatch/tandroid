package mi;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.f60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t4 b;

    public /* synthetic */ q4(t4 t4Var, int i3) {
        this.a = i3;
        this.b = t4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        int i3 = this.a;
        final int i10 = 1;
        final t4 t4Var = this.b;
        final int i11 = 0;
        switch (i3) {
            case 0:
                ArrayList arrayList = t4Var.F;
                int indexOf = arrayList.indexOf(view);
                if (t4Var.O != null && t4Var.a != null) {
                    List n4 = t4Var.n();
                    if (indexOf >= 0 && indexOf < n4.size() && indexOf < arrayList.size()) {
                        final s sVar = (s) n4.get(indexOf);
                        f60 D1 = t4Var.O.a.p3.D1((View) arrayList.get(indexOf));
                        boolean z10 = sVar.n;
                        D1.c(z10 ? R.drawable.msg_spoiler_off : R.drawable.msg_spoiler, bd.M0(z10 ? 2131751431 : 2131751155, null), new Runnable() { // from class: mi.r4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i11) {
                                    case 0:
                                        t4 t4Var2 = t4Var;
                                        m3 m3Var = t4Var2.O;
                                        if (m3Var != null && (aVar3 = t4Var2.a) != null) {
                                            t3 t3Var = m3Var.a;
                                            t3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                g2 g2Var = t3Var.R3;
                                                if (g2Var != null) {
                                                    g2Var.d();
                                                }
                                                sVar2.n = !sVar2.n;
                                                TL_iv.PageBlock Q3 = t3.Q3(aVar3, sVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = sVar2.n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = sVar2.n;
                                                }
                                                t3Var.q4(aVar3);
                                                g2 g2Var2 = t3Var.R3;
                                                if (g2Var2 != null) {
                                                    g2Var2.h();
                                                }
                                                t3Var.p3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        t4 t4Var3 = t4Var;
                                        m3 m3Var2 = t4Var3.O;
                                        if (m3Var2 != null && (aVar4 = t4Var3.a) != null) {
                                            t3.R1(aVar4, sVar, m3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        D1.c(R.drawable.msg_delete, bd.M0(2131751599, null), new Runnable() { // from class: mi.r4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i10) {
                                    case 0:
                                        t4 t4Var2 = t4Var;
                                        m3 m3Var = t4Var2.O;
                                        if (m3Var != null && (aVar3 = t4Var2.a) != null) {
                                            t3 t3Var = m3Var.a;
                                            t3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                g2 g2Var = t3Var.R3;
                                                if (g2Var != null) {
                                                    g2Var.d();
                                                }
                                                sVar2.n = !sVar2.n;
                                                TL_iv.PageBlock Q3 = t3.Q3(aVar3, sVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = sVar2.n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = sVar2.n;
                                                }
                                                t3Var.q4(aVar3);
                                                g2 g2Var2 = t3Var.R3;
                                                if (g2Var2 != null) {
                                                    g2Var2.h();
                                                }
                                                t3Var.p3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        t4 t4Var3 = t4Var;
                                        m3 m3Var2 = t4Var3.O;
                                        if (m3Var2 != null && (aVar4 = t4Var3.a) != null) {
                                            t3.R1(aVar4, sVar, m3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        D1.a0(0.0f, -org.telegram.messenger.g0.L(38.0f));
                        if (t4Var.I) {
                            D1.u = false;
                            D1.v = true;
                            D1.s = 0;
                        }
                        D1.Z();
                        break;
                    }
                }
                break;
            case 1:
                m3 m3Var = t4Var.O;
                if (m3Var != null && (aVar = t4Var.a) != null) {
                    t3 t3Var = m3Var.a;
                    t3Var.j4 = aVar;
                    t3Var.p3.O(0);
                    break;
                }
                break;
            default:
                m3 m3Var2 = t4Var.O;
                if (m3Var2 != null && (aVar2 = t4Var.a) != null) {
                    t3 t3Var2 = m3Var2.a;
                    t3Var2.getClass();
                    if (t3.E3(aVar2.b)) {
                        g2 g2Var = t3Var2.R3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> j32 = t3.j3(aVar2.b);
                        TL_iv.PageBlock pageBlock = aVar2.b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (j32 == null) {
                                j32 = new ArrayList<>();
                            }
                            pageblockcollage.items = j32;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (j32 == null) {
                                j32 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = j32;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        aVar2.b = pageblockslideshow;
                        g2 g2Var2 = t3Var2.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        View C1 = t3Var2.C1(aVar2);
                        if (C1 instanceof t4) {
                            t4 t4Var2 = (t4) C1;
                            ValueAnimator valueAnimator = t4Var2.j0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                t4Var2.j0 = null;
                            }
                            if (t4Var2.getParent() != null) {
                                t4Var2.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = t4Var2.i0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                t4Var2.i0 = null;
                            }
                            t4Var2.a0 = 0;
                            t4Var2.b0 = 0.0f;
                            t4Var2.q(true);
                            t4Var2.requestLayout();
                            t4Var2.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
