package oi;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.m60;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p4 b;

    public /* synthetic */ m4(p4 p4Var, int i7) {
        this.a = i7;
        this.b = p4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        int i7 = this.a;
        final int i10 = 1;
        final p4 p4Var = this.b;
        final int i11 = 0;
        switch (i7) {
            case 0:
                ArrayList arrayList = p4Var.F;
                int indexOf = arrayList.indexOf(view);
                if (p4Var.O != null && p4Var.a != null) {
                    List n10 = p4Var.n();
                    if (indexOf >= 0 && indexOf < n10.size() && indexOf < arrayList.size()) {
                        final r rVar = (r) n10.get(indexOf);
                        m60 g02 = p4Var.O.a.p3.g0((View) arrayList.get(indexOf));
                        boolean z10 = rVar.n;
                        g02.c(z10 ? R.drawable.msg_spoiler_off : R.drawable.msg_spoiler, hd.M0(z10 ? 2131751430 : 2131751154, null), new Runnable() { // from class: oi.n4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i11) {
                                    case 0:
                                        p4 p4Var2 = p4Var;
                                        j3 j3Var = p4Var2.O;
                                        if (j3Var != null && (aVar3 = p4Var2.a) != null) {
                                            q3 q3Var = j3Var.a;
                                            q3Var.getClass();
                                            r rVar2 = rVar;
                                            if (rVar2 != null) {
                                                d2 d2Var = q3Var.R3;
                                                if (d2Var != null) {
                                                    d2Var.d();
                                                }
                                                rVar2.n = !rVar2.n;
                                                TL_iv.PageBlock Q3 = q3.Q3(aVar3, rVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = rVar2.n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = rVar2.n;
                                                }
                                                q3Var.q4(aVar3);
                                                d2 d2Var2 = q3Var.R3;
                                                if (d2Var2 != null) {
                                                    d2Var2.h();
                                                }
                                                q3Var.p3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        p4 p4Var3 = p4Var;
                                        j3 j3Var2 = p4Var3.O;
                                        if (j3Var2 != null && (aVar4 = p4Var3.a) != null) {
                                            q3.R1(aVar4, rVar, j3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        g02.c(R.drawable.msg_delete, hd.M0(2131751598, null), new Runnable() { // from class: oi.n4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i10) {
                                    case 0:
                                        p4 p4Var2 = p4Var;
                                        j3 j3Var = p4Var2.O;
                                        if (j3Var != null && (aVar3 = p4Var2.a) != null) {
                                            q3 q3Var = j3Var.a;
                                            q3Var.getClass();
                                            r rVar2 = rVar;
                                            if (rVar2 != null) {
                                                d2 d2Var = q3Var.R3;
                                                if (d2Var != null) {
                                                    d2Var.d();
                                                }
                                                rVar2.n = !rVar2.n;
                                                TL_iv.PageBlock Q3 = q3.Q3(aVar3, rVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = rVar2.n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = rVar2.n;
                                                }
                                                q3Var.q4(aVar3);
                                                d2 d2Var2 = q3Var.R3;
                                                if (d2Var2 != null) {
                                                    d2Var2.h();
                                                }
                                                q3Var.p3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        p4 p4Var3 = p4Var;
                                        j3 j3Var2 = p4Var3.O;
                                        if (j3Var2 != null && (aVar4 = p4Var3.a) != null) {
                                            q3.R1(aVar4, rVar, j3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        g02.a0(0.0f, -org.telegram.messenger.g0.L(38.0f));
                        if (p4Var.I) {
                            g02.u = false;
                            g02.v = true;
                            g02.s = 0;
                        }
                        g02.Z();
                        break;
                    }
                }
                break;
            case 1:
                j3 j3Var = p4Var.O;
                if (j3Var != null && (aVar = p4Var.a) != null) {
                    q3 q3Var = j3Var.a;
                    q3Var.j4 = aVar;
                    q3Var.p3.s(0);
                    break;
                }
                break;
            default:
                j3 j3Var2 = p4Var.O;
                if (j3Var2 != null && (aVar2 = p4Var.a) != null) {
                    q3 q3Var2 = j3Var2.a;
                    q3Var2.getClass();
                    if (q3.E3(aVar2.b)) {
                        d2 d2Var = q3Var2.R3;
                        if (d2Var != null) {
                            d2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> j3 = q3.j3(aVar2.b);
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
                        d2 d2Var2 = q3Var2.R3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                        }
                        View C1 = q3Var2.C1(aVar2);
                        if (C1 instanceof p4) {
                            p4 p4Var2 = (p4) C1;
                            ValueAnimator valueAnimator = p4Var2.j0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                p4Var2.j0 = null;
                            }
                            if (p4Var2.getParent() != null) {
                                p4Var2.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = p4Var2.i0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                p4Var2.i0 = null;
                            }
                            p4Var2.a0 = 0;
                            p4Var2.b0 = 0.0f;
                            p4Var2.q(true);
                            p4Var2.requestLayout();
                            p4Var2.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
