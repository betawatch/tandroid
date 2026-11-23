package oi;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a70;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                ArrayList arrayList = s4Var.F;
                int indexOf = arrayList.indexOf(view);
                if (s4Var.O != null && s4Var.a != null) {
                    List n10 = s4Var.n();
                    if (indexOf >= 0 && indexOf < n10.size() && indexOf < arrayList.size()) {
                        final r rVar = (r) n10.get(indexOf);
                        a70 G0 = s4Var.O.a.p3.G0((View) arrayList.get(indexOf));
                        boolean z10 = rVar.n;
                        G0.c(z10 ? R.drawable.msg_spoiler_off : R.drawable.msg_spoiler, hd.N0(z10 ? 2131751418 : 2131751142, null), new Runnable() { // from class: oi.q4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i11) {
                                    case 0:
                                        s4 s4Var2 = s4Var;
                                        m3 m3Var = s4Var2.O;
                                        if (m3Var != null && (aVar3 = s4Var2.a) != null) {
                                            t3 t3Var = m3Var.a;
                                            t3Var.getClass();
                                            r rVar2 = rVar;
                                            if (rVar2 != null) {
                                                g2 g2Var = t3Var.R3;
                                                if (g2Var != null) {
                                                    g2Var.d();
                                                }
                                                rVar2.n = !rVar2.n;
                                                TL_iv.PageBlock Q3 = t3.Q3(aVar3, rVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = rVar2.n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = rVar2.n;
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
                                        s4 s4Var3 = s4Var;
                                        m3 m3Var2 = s4Var3.O;
                                        if (m3Var2 != null && (aVar4 = s4Var3.a) != null) {
                                            t3.R1(aVar4, rVar, m3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        G0.c(R.drawable.msg_delete, hd.N0(2131751586, null), new Runnable() { // from class: oi.q4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i10) {
                                    case 0:
                                        s4 s4Var2 = s4Var;
                                        m3 m3Var = s4Var2.O;
                                        if (m3Var != null && (aVar3 = s4Var2.a) != null) {
                                            t3 t3Var = m3Var.a;
                                            t3Var.getClass();
                                            r rVar2 = rVar;
                                            if (rVar2 != null) {
                                                g2 g2Var = t3Var.R3;
                                                if (g2Var != null) {
                                                    g2Var.d();
                                                }
                                                rVar2.n = !rVar2.n;
                                                TL_iv.PageBlock Q3 = t3.Q3(aVar3, rVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = rVar2.n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = rVar2.n;
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
                                        s4 s4Var3 = s4Var;
                                        m3 m3Var2 = s4Var3.O;
                                        if (m3Var2 != null && (aVar4 = s4Var3.a) != null) {
                                            t3.R1(aVar4, rVar, m3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        G0.b0(0.0f, -org.telegram.messenger.g0.L(38.0f));
                        if (s4Var.I) {
                            G0.u = false;
                            G0.v = true;
                            G0.s = 0;
                        }
                        G0.a0();
                        break;
                    }
                }
                break;
            case 1:
                m3 m3Var = s4Var.O;
                if (m3Var != null && (aVar = s4Var.a) != null) {
                    t3 t3Var = m3Var.a;
                    t3Var.j4 = aVar;
                    t3Var.p3.D(0);
                    break;
                }
                break;
            default:
                m3 m3Var2 = s4Var.O;
                if (m3Var2 != null && (aVar2 = s4Var.a) != null) {
                    t3 t3Var2 = m3Var2.a;
                    t3Var2.getClass();
                    if (t3.E3(aVar2.b)) {
                        g2 g2Var = t3Var2.R3;
                        if (g2Var != null) {
                            g2Var.d();
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
                        g2 g2Var2 = t3Var2.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        View C1 = t3Var2.C1(aVar2);
                        if (C1 instanceof s4) {
                            s4 s4Var2 = (s4) C1;
                            ValueAnimator valueAnimator = s4Var2.j0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                s4Var2.j0 = null;
                            }
                            if (s4Var2.getParent() != null) {
                                s4Var2.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = s4Var2.i0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                s4Var2.i0 = null;
                            }
                            s4Var2.a0 = 0;
                            s4Var2.b0 = 0.0f;
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
