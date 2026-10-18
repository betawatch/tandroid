package ki;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.i80;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u4 b;

    public /* synthetic */ r4(u4 u4Var, int i10) {
        this.a = i10;
        this.b = u4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.a) {
            case 0:
                final u4 u4Var = this.b;
                ArrayList arrayList = u4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (u4Var.N != null && u4Var.a != null) {
                    List m10 = u4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final t tVar = (t) m10.get(indexOf);
                        i80 C = u4Var.N.a.f3.C((View) arrayList.get(indexOf));
                        boolean z10 = tVar.n;
                        final int i10 = 0;
                        C.c(z10 ? R.drawable.msg_spoiler_off : R.drawable.msg_spoiler, LocaleController.getString(z10 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler), new Runnable() { // from class: ki.s4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i10) {
                                    case 0:
                                        u4 u4Var2 = u4Var;
                                        p3 p3Var = u4Var2.N;
                                        if (p3Var != null && (aVar3 = u4Var2.a) != null) {
                                            w3 w3Var = p3Var.a;
                                            w3Var.getClass();
                                            t tVar2 = tVar;
                                            if (tVar2 != null) {
                                                h2 h2Var = w3Var.H3;
                                                if (h2Var != null) {
                                                    h2Var.d();
                                                }
                                                tVar2.n = !tVar2.n;
                                                TL_iv.PageBlock O3 = w3.O3(aVar3, tVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = tVar2.n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = tVar2.n;
                                                }
                                                w3Var.o4(aVar3);
                                                h2 h2Var2 = w3Var.H3;
                                                if (h2Var2 != null) {
                                                    h2Var2.h();
                                                }
                                                w3Var.f3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        u4 u4Var3 = u4Var;
                                        p3 p3Var2 = u4Var3.N;
                                        if (p3Var2 != null && (aVar4 = u4Var3.a) != null) {
                                            w3.O1(aVar4, tVar, p3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        final int i11 = 1;
                        C.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: ki.s4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i11) {
                                    case 0:
                                        u4 u4Var2 = u4Var;
                                        p3 p3Var = u4Var2.N;
                                        if (p3Var != null && (aVar3 = u4Var2.a) != null) {
                                            w3 w3Var = p3Var.a;
                                            w3Var.getClass();
                                            t tVar2 = tVar;
                                            if (tVar2 != null) {
                                                h2 h2Var = w3Var.H3;
                                                if (h2Var != null) {
                                                    h2Var.d();
                                                }
                                                tVar2.n = !tVar2.n;
                                                TL_iv.PageBlock O3 = w3.O3(aVar3, tVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = tVar2.n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = tVar2.n;
                                                }
                                                w3Var.o4(aVar3);
                                                h2 h2Var2 = w3Var.H3;
                                                if (h2Var2 != null) {
                                                    h2Var2.h();
                                                }
                                                w3Var.f3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        u4 u4Var3 = u4Var;
                                        p3 p3Var2 = u4Var3.N;
                                        if (p3Var2 != null && (aVar4 = u4Var3.a) != null) {
                                            w3.O1(aVar4, tVar, p3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        C.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (u4Var.H) {
                            C.u = false;
                            C.v = true;
                            C.s = 0;
                        }
                        C.Z();
                        break;
                    }
                }
                break;
            case 1:
                u4 u4Var2 = this.b;
                p3 p3Var = u4Var2.N;
                if (p3Var != null && (aVar = u4Var2.a) != null) {
                    w3 w3Var = p3Var.a;
                    w3Var.Z3 = aVar;
                    w3Var.f3.l(0);
                    break;
                }
                break;
            default:
                u4 u4Var3 = this.b;
                p3 p3Var2 = u4Var3.N;
                if (p3Var2 != null && (aVar2 = u4Var3.a) != null) {
                    w3 w3Var2 = p3Var2.a;
                    w3Var2.getClass();
                    if (w3.C3(aVar2.b)) {
                        h2 h2Var = w3Var2.H3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> h32 = w3.h3(aVar2.b);
                        TL_iv.PageBlock pageBlock = aVar2.b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (h32 == null) {
                                h32 = new ArrayList<>();
                            }
                            pageblockcollage.items = h32;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (h32 == null) {
                                h32 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = h32;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        aVar2.b = pageblockslideshow;
                        h2 h2Var2 = w3Var2.H3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        View A1 = w3Var2.A1(aVar2);
                        if (A1 instanceof u4) {
                            u4 u4Var4 = (u4) A1;
                            ValueAnimator valueAnimator = u4Var4.i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                u4Var4.i0 = null;
                            }
                            if (u4Var4.getParent() != null) {
                                u4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = u4Var4.h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                u4Var4.h0 = null;
                            }
                            u4Var4.W = 0;
                            u4Var4.a0 = 0.0f;
                            u4Var4.o(true);
                            u4Var4.requestLayout();
                            u4Var4.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
