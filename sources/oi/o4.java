package oi;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.y60;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class o4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r4 b;

    public /* synthetic */ o4(r4 r4Var, int i7) {
        this.a = i7;
        this.b = r4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        int i7 = this.a;
        final int i10 = 1;
        final r4 r4Var = this.b;
        final int i11 = 0;
        switch (i7) {
            case 0:
                ArrayList arrayList = r4Var.F;
                int indexOf = arrayList.indexOf(view);
                if (r4Var.O != null && r4Var.a != null) {
                    List n10 = r4Var.n();
                    if (indexOf >= 0 && indexOf < n10.size() && indexOf < arrayList.size()) {
                        final r rVar = (r) n10.get(indexOf);
                        y60 G0 = r4Var.O.a.p3.G0((View) arrayList.get(indexOf));
                        boolean z10 = rVar.n;
                        G0.c(z10 ? R.drawable.msg_spoiler_off : R.drawable.msg_spoiler, gd.M0(z10 ? 2131751419 : 2131751143, null), new Runnable() { // from class: oi.p4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i11) {
                                    case 0:
                                        r4 r4Var2 = r4Var;
                                        l3 l3Var = r4Var2.O;
                                        if (l3Var != null && (aVar3 = r4Var2.a) != null) {
                                            s3 s3Var = l3Var.a;
                                            s3Var.getClass();
                                            r rVar2 = rVar;
                                            if (rVar2 != null) {
                                                e2 e2Var = s3Var.R3;
                                                if (e2Var != null) {
                                                    e2Var.d();
                                                }
                                                rVar2.n = !rVar2.n;
                                                TL_iv.PageBlock Q3 = s3.Q3(aVar3, rVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = rVar2.n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = rVar2.n;
                                                }
                                                s3Var.q4(aVar3);
                                                e2 e2Var2 = s3Var.R3;
                                                if (e2Var2 != null) {
                                                    e2Var2.h();
                                                }
                                                s3Var.p3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        r4 r4Var3 = r4Var;
                                        l3 l3Var2 = r4Var3.O;
                                        if (l3Var2 != null && (aVar4 = r4Var3.a) != null) {
                                            s3.R1(aVar4, rVar, l3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        G0.c(R.drawable.msg_delete, gd.M0(2131751587, null), new Runnable() { // from class: oi.p4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i10) {
                                    case 0:
                                        r4 r4Var2 = r4Var;
                                        l3 l3Var = r4Var2.O;
                                        if (l3Var != null && (aVar3 = r4Var2.a) != null) {
                                            s3 s3Var = l3Var.a;
                                            s3Var.getClass();
                                            r rVar2 = rVar;
                                            if (rVar2 != null) {
                                                e2 e2Var = s3Var.R3;
                                                if (e2Var != null) {
                                                    e2Var.d();
                                                }
                                                rVar2.n = !rVar2.n;
                                                TL_iv.PageBlock Q3 = s3.Q3(aVar3, rVar2);
                                                if (Q3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) Q3).spoiler = rVar2.n;
                                                } else if (Q3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) Q3).spoiler = rVar2.n;
                                                }
                                                s3Var.q4(aVar3);
                                                e2 e2Var2 = s3Var.R3;
                                                if (e2Var2 != null) {
                                                    e2Var2.h();
                                                }
                                                s3Var.p3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        r4 r4Var3 = r4Var;
                                        l3 l3Var2 = r4Var3.O;
                                        if (l3Var2 != null && (aVar4 = r4Var3.a) != null) {
                                            s3.R1(aVar4, rVar, l3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        G0.b0(0.0f, -org.telegram.messenger.g0.L(38.0f));
                        if (r4Var.I) {
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
                l3 l3Var = r4Var.O;
                if (l3Var != null && (aVar = r4Var.a) != null) {
                    s3 s3Var = l3Var.a;
                    s3Var.j4 = aVar;
                    s3Var.p3.D(0);
                    break;
                }
                break;
            default:
                l3 l3Var2 = r4Var.O;
                if (l3Var2 != null && (aVar2 = r4Var.a) != null) {
                    s3 s3Var2 = l3Var2.a;
                    s3Var2.getClass();
                    if (s3.E3(aVar2.b)) {
                        e2 e2Var = s3Var2.R3;
                        if (e2Var != null) {
                            e2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> j3 = s3.j3(aVar2.b);
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
                        e2 e2Var2 = s3Var2.R3;
                        if (e2Var2 != null) {
                            e2Var2.h();
                        }
                        View C1 = s3Var2.C1(aVar2);
                        if (C1 instanceof r4) {
                            r4 r4Var2 = (r4) C1;
                            ValueAnimator valueAnimator = r4Var2.j0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                r4Var2.j0 = null;
                            }
                            if (r4Var2.getParent() != null) {
                                r4Var2.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = r4Var2.i0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                r4Var2.i0 = null;
                            }
                            r4Var2.a0 = 0;
                            r4Var2.b0 = 0.0f;
                            r4Var2.q(true);
                            r4Var2.requestLayout();
                            r4Var2.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
