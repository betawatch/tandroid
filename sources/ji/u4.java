package ji;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.m80;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class u4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y4 b;

    public /* synthetic */ u4(y4 y4Var, int i10) {
        this.a = i10;
        this.b = y4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.a) {
            case 0:
                final y4 y4Var = this.b;
                ArrayList arrayList = y4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (y4Var.N != null && y4Var.a != null) {
                    List m10 = y4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final u uVar = (u) m10.get(indexOf);
                        m80 Y = y4Var.N.a.f3.Y((View) arrayList.get(indexOf));
                        boolean z10 = uVar.n;
                        final int i10 = 0;
                        Y.c(z10 ? R.drawable.msg_spoiler_off : R.drawable.msg_spoiler, LocaleController.getString(z10 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler), new Runnable() { // from class: ji.v4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i10) {
                                    case 0:
                                        y4 y4Var2 = y4Var;
                                        q3 q3Var = y4Var2.N;
                                        if (q3Var != null && (aVar3 = y4Var2.a) != null) {
                                            x3 x3Var = q3Var.a;
                                            x3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                h2 h2Var = x3Var.H3;
                                                if (h2Var != null) {
                                                    h2Var.d();
                                                }
                                                uVar2.n = !uVar2.n;
                                                TL_iv.PageBlock O3 = x3.O3(aVar3, uVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = uVar2.n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = uVar2.n;
                                                }
                                                x3Var.o4(aVar3);
                                                h2 h2Var2 = x3Var.H3;
                                                if (h2Var2 != null) {
                                                    h2Var2.h();
                                                }
                                                x3Var.f3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        y4 y4Var3 = y4Var;
                                        q3 q3Var2 = y4Var3.N;
                                        if (q3Var2 != null && (aVar4 = y4Var3.a) != null) {
                                            x3.O1(aVar4, uVar, q3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        final int i11 = 1;
                        Y.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: ji.v4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i11) {
                                    case 0:
                                        y4 y4Var2 = y4Var;
                                        q3 q3Var = y4Var2.N;
                                        if (q3Var != null && (aVar3 = y4Var2.a) != null) {
                                            x3 x3Var = q3Var.a;
                                            x3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                h2 h2Var = x3Var.H3;
                                                if (h2Var != null) {
                                                    h2Var.d();
                                                }
                                                uVar2.n = !uVar2.n;
                                                TL_iv.PageBlock O3 = x3.O3(aVar3, uVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = uVar2.n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = uVar2.n;
                                                }
                                                x3Var.o4(aVar3);
                                                h2 h2Var2 = x3Var.H3;
                                                if (h2Var2 != null) {
                                                    h2Var2.h();
                                                }
                                                x3Var.f3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        y4 y4Var3 = y4Var;
                                        q3 q3Var2 = y4Var3.N;
                                        if (q3Var2 != null && (aVar4 = y4Var3.a) != null) {
                                            x3.O1(aVar4, uVar, q3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        Y.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (y4Var.H) {
                            Y.u = false;
                            Y.v = true;
                            Y.s = 0;
                        }
                        Y.Z();
                        break;
                    }
                }
                break;
            case 1:
                y4 y4Var2 = this.b;
                q3 q3Var = y4Var2.N;
                if (q3Var != null && (aVar = y4Var2.a) != null) {
                    x3 x3Var = q3Var.a;
                    x3Var.Z3 = aVar;
                    x3Var.f3.m(0);
                    break;
                }
                break;
            default:
                y4 y4Var3 = this.b;
                q3 q3Var2 = y4Var3.N;
                if (q3Var2 != null && (aVar2 = y4Var3.a) != null) {
                    x3 x3Var2 = q3Var2.a;
                    x3Var2.getClass();
                    if (x3.C3(aVar2.b)) {
                        h2 h2Var = x3Var2.H3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> h32 = x3.h3(aVar2.b);
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
                        h2 h2Var2 = x3Var2.H3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        View A1 = x3Var2.A1(aVar2);
                        if (A1 instanceof y4) {
                            y4 y4Var4 = (y4) A1;
                            ValueAnimator valueAnimator = y4Var4.i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                y4Var4.i0 = null;
                            }
                            if (y4Var4.getParent() != null) {
                                y4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = y4Var4.h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                y4Var4.h0 = null;
                            }
                            y4Var4.W = 0;
                            y4Var4.a0 = 0.0f;
                            y4Var4.o(true);
                            y4Var4.requestLayout();
                            y4Var4.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
