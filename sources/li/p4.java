package li;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.k60;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4 b;

    public /* synthetic */ p4(s4 s4Var, int i7) {
        this.a = i7;
        this.b = s4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        int i7 = this.a;
        final int i10 = 1;
        final s4 s4Var = this.b;
        final int i11 = 0;
        switch (i7) {
            case 0:
                ArrayList arrayList = s4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (s4Var.N != null && s4Var.a != null) {
                    List n10 = s4Var.n();
                    if (indexOf >= 0 && indexOf < n10.size() && indexOf < arrayList.size()) {
                        final s sVar = (s) n10.get(indexOf);
                        k60 J = s4Var.N.a.o3.J((View) arrayList.get(indexOf));
                        boolean z9 = sVar.n;
                        J.c(z9 ? R.drawable.msg_spoiler_off : R.drawable.msg_spoiler, hd.M0(z9 ? 2131751431 : 2131751155, null), new Runnable() { // from class: li.q4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i11) {
                                    case 0:
                                        s4 s4Var2 = s4Var;
                                        m3 m3Var = s4Var2.N;
                                        if (m3Var != null && (aVar3 = s4Var2.a) != null) {
                                            t3 t3Var = m3Var.a;
                                            t3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                f2 f2Var = t3Var.Q3;
                                                if (f2Var != null) {
                                                    f2Var.d();
                                                }
                                                sVar2.n = !sVar2.n;
                                                TL_iv.PageBlock Q3 = t3.Q3(aVar3, sVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = sVar2.n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = sVar2.n;
                                                }
                                                t3Var.q4(aVar3);
                                                f2 f2Var2 = t3Var.Q3;
                                                if (f2Var2 != null) {
                                                    f2Var2.h();
                                                }
                                                t3Var.o3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        s4 s4Var3 = s4Var;
                                        m3 m3Var2 = s4Var3.N;
                                        if (m3Var2 != null && (aVar4 = s4Var3.a) != null) {
                                            t3.R1(aVar4, sVar, m3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        J.c(R.drawable.msg_delete, hd.M0(2131751599, null), new Runnable() { // from class: li.q4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i10) {
                                    case 0:
                                        s4 s4Var2 = s4Var;
                                        m3 m3Var = s4Var2.N;
                                        if (m3Var != null && (aVar3 = s4Var2.a) != null) {
                                            t3 t3Var = m3Var.a;
                                            t3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                f2 f2Var = t3Var.Q3;
                                                if (f2Var != null) {
                                                    f2Var.d();
                                                }
                                                sVar2.n = !sVar2.n;
                                                TL_iv.PageBlock Q3 = t3.Q3(aVar3, sVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = sVar2.n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = sVar2.n;
                                                }
                                                t3Var.q4(aVar3);
                                                f2 f2Var2 = t3Var.Q3;
                                                if (f2Var2 != null) {
                                                    f2Var2.h();
                                                }
                                                t3Var.o3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        s4 s4Var3 = s4Var;
                                        m3 m3Var2 = s4Var3.N;
                                        if (m3Var2 != null && (aVar4 = s4Var3.a) != null) {
                                            t3.R1(aVar4, sVar, m3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        J.a0(0.0f, -org.telegram.messenger.g0.L(38.0f));
                        if (s4Var.H) {
                            J.u = false;
                            J.v = true;
                            J.s = 0;
                        }
                        J.Z();
                        break;
                    }
                }
                break;
            case 1:
                m3 m3Var = s4Var.N;
                if (m3Var != null && (aVar = s4Var.a) != null) {
                    t3 t3Var = m3Var.a;
                    t3Var.i4 = aVar;
                    t3Var.o3.g(0);
                    break;
                }
                break;
            default:
                m3 m3Var2 = s4Var.N;
                if (m3Var2 != null && (aVar2 = s4Var.a) != null) {
                    t3 t3Var2 = m3Var2.a;
                    t3Var2.getClass();
                    if (t3.E3(aVar2.b)) {
                        f2 f2Var = t3Var2.Q3;
                        if (f2Var != null) {
                            f2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> j3 = t3.j3(aVar2.b);
                        TL_iv.PageBlock pageBlock = aVar2.b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (j3 == null) {
                                j3 = new ArrayList<>();
                            }
                            pageblockcollage.items = j3;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (j3 == null) {
                                j3 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = j3;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        aVar2.b = pageblockslideshow;
                        f2 f2Var2 = t3Var2.Q3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                        }
                        View C1 = t3Var2.C1(aVar2);
                        if (C1 instanceof s4) {
                            s4 s4Var2 = (s4) C1;
                            ValueAnimator valueAnimator = s4Var2.i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                s4Var2.i0 = null;
                            }
                            if (s4Var2.getParent() != null) {
                                s4Var2.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = s4Var2.h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                s4Var2.h0 = null;
                            }
                            s4Var2.W = 0;
                            s4Var2.a0 = 0.0f;
                            s4Var2.q(true);
                            s4Var2.requestLayout();
                            s4Var2.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
