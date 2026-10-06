package ii;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b80;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w4 b;

    public /* synthetic */ t4(w4 w4Var, int i10) {
        this.a = i10;
        this.b = w4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.a) {
            case 0:
                final w4 w4Var = this.b;
                ArrayList arrayList = w4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (w4Var.N != null && w4Var.a != null) {
                    List m10 = w4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final u uVar = (u) m10.get(indexOf);
                        b80 f02 = w4Var.N.a.o3.f0((View) arrayList.get(indexOf));
                        boolean z10 = uVar.n;
                        final int i10 = 0;
                        f02.c(z10 ? R.drawable.msg_spoiler_off : R.drawable.msg_spoiler, LocaleController.getString(z10 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler), new Runnable() { // from class: ii.u4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i10) {
                                    case 0:
                                        w4 w4Var2 = w4Var;
                                        q3 q3Var = w4Var2.N;
                                        if (q3Var != null && (aVar3 = w4Var2.a) != null) {
                                            x3 x3Var = q3Var.a;
                                            x3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                i2 i2Var = x3Var.Q3;
                                                if (i2Var != null) {
                                                    i2Var.d();
                                                }
                                                uVar2.n = !uVar2.n;
                                                TL_iv.PageBlock O3 = x3.O3(aVar3, uVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = uVar2.n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = uVar2.n;
                                                }
                                                x3Var.o4(aVar3);
                                                i2 i2Var2 = x3Var.Q3;
                                                if (i2Var2 != null) {
                                                    i2Var2.h();
                                                }
                                                x3Var.o3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        w4 w4Var3 = w4Var;
                                        q3 q3Var2 = w4Var3.N;
                                        if (q3Var2 != null && (aVar4 = w4Var3.a) != null) {
                                            x3.O1(aVar4, uVar, q3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        final int i11 = 1;
                        f02.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: ii.u4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i11) {
                                    case 0:
                                        w4 w4Var2 = w4Var;
                                        q3 q3Var = w4Var2.N;
                                        if (q3Var != null && (aVar3 = w4Var2.a) != null) {
                                            x3 x3Var = q3Var.a;
                                            x3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                i2 i2Var = x3Var.Q3;
                                                if (i2Var != null) {
                                                    i2Var.d();
                                                }
                                                uVar2.n = !uVar2.n;
                                                TL_iv.PageBlock O3 = x3.O3(aVar3, uVar2);
                                                if (O3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) O3).spoiler = uVar2.n;
                                                } else if (O3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) O3).spoiler = uVar2.n;
                                                }
                                                x3Var.o4(aVar3);
                                                i2 i2Var2 = x3Var.Q3;
                                                if (i2Var2 != null) {
                                                    i2Var2.h();
                                                }
                                                x3Var.o3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        w4 w4Var3 = w4Var;
                                        q3 q3Var2 = w4Var3.N;
                                        if (q3Var2 != null && (aVar4 = w4Var3.a) != null) {
                                            x3.O1(aVar4, uVar, q3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        f02.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (w4Var.H) {
                            f02.u = false;
                            f02.v = true;
                            f02.s = 0;
                        }
                        f02.Z();
                        break;
                    }
                }
                break;
            case 1:
                w4 w4Var2 = this.b;
                q3 q3Var = w4Var2.N;
                if (q3Var != null && (aVar = w4Var2.a) != null) {
                    x3 x3Var = q3Var.a;
                    x3Var.i4 = aVar;
                    x3Var.o3.r(0);
                    break;
                }
                break;
            default:
                w4 w4Var3 = this.b;
                q3 q3Var2 = w4Var3.N;
                if (q3Var2 != null && (aVar2 = w4Var3.a) != null) {
                    x3 x3Var2 = q3Var2.a;
                    x3Var2.getClass();
                    if (x3.C3(aVar2.b)) {
                        i2 i2Var = x3Var2.Q3;
                        if (i2Var != null) {
                            i2Var.d();
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
                        i2 i2Var2 = x3Var2.Q3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        View A1 = x3Var2.A1(aVar2);
                        if (A1 instanceof w4) {
                            w4 w4Var4 = (w4) A1;
                            ValueAnimator valueAnimator = w4Var4.i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                w4Var4.i0 = null;
                            }
                            if (w4Var4.getParent() != null) {
                                w4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = w4Var4.h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                w4Var4.h0 = null;
                            }
                            w4Var4.W = 0;
                            w4Var4.a0 = 0.0f;
                            w4Var4.o(true);
                            w4Var4.requestLayout();
                            w4Var4.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
