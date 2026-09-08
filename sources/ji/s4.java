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
import org.telegram.ui.Components.n70;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class s4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w4 b;

    public /* synthetic */ s4(w4 w4Var, int i10) {
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
                        n70 t10 = w4Var.N.a.h3.t((View) arrayList.get(indexOf));
                        boolean z10 = uVar.n;
                        final int i10 = 0;
                        t10.c(z10 ? R.drawable.msg_spoiler_off : R.drawable.msg_spoiler, LocaleController.getString(z10 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler), new Runnable() { // from class: ji.t4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i10) {
                                    case 0:
                                        w4 w4Var2 = w4Var;
                                        o3 o3Var = w4Var2.N;
                                        if (o3Var != null && (aVar3 = w4Var2.a) != null) {
                                            v3 v3Var = o3Var.a;
                                            v3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                g2 g2Var = v3Var.J3;
                                                if (g2Var != null) {
                                                    g2Var.d();
                                                }
                                                uVar2.n = !uVar2.n;
                                                TL_iv.PageBlock M3 = v3.M3(aVar3, uVar2);
                                                if (M3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) M3).spoiler = uVar2.n;
                                                } else if (M3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) M3).spoiler = uVar2.n;
                                                }
                                                v3Var.m4(aVar3);
                                                g2 g2Var2 = v3Var.J3;
                                                if (g2Var2 != null) {
                                                    g2Var2.h();
                                                }
                                                v3Var.h3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        w4 w4Var3 = w4Var;
                                        o3 o3Var2 = w4Var3.N;
                                        if (o3Var2 != null && (aVar4 = w4Var3.a) != null) {
                                            v3.M1(aVar4, uVar, o3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        final int i11 = 1;
                        t10.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: ji.t4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i11) {
                                    case 0:
                                        w4 w4Var2 = w4Var;
                                        o3 o3Var = w4Var2.N;
                                        if (o3Var != null && (aVar3 = w4Var2.a) != null) {
                                            v3 v3Var = o3Var.a;
                                            v3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                g2 g2Var = v3Var.J3;
                                                if (g2Var != null) {
                                                    g2Var.d();
                                                }
                                                uVar2.n = !uVar2.n;
                                                TL_iv.PageBlock M3 = v3.M3(aVar3, uVar2);
                                                if (M3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) M3).spoiler = uVar2.n;
                                                } else if (M3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) M3).spoiler = uVar2.n;
                                                }
                                                v3Var.m4(aVar3);
                                                g2 g2Var2 = v3Var.J3;
                                                if (g2Var2 != null) {
                                                    g2Var2.h();
                                                }
                                                v3Var.h3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        w4 w4Var3 = w4Var;
                                        o3 o3Var2 = w4Var3.N;
                                        if (o3Var2 != null && (aVar4 = w4Var3.a) != null) {
                                            v3.M1(aVar4, uVar, o3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        t10.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (w4Var.H) {
                            t10.u = false;
                            t10.v = true;
                            t10.s = 0;
                        }
                        t10.Z();
                        break;
                    }
                }
                break;
            case 1:
                w4 w4Var2 = this.b;
                o3 o3Var = w4Var2.N;
                if (o3Var != null && (aVar = w4Var2.a) != null) {
                    v3 v3Var = o3Var.a;
                    v3Var.b4 = aVar;
                    v3Var.h3.e(0);
                    break;
                }
                break;
            default:
                w4 w4Var3 = this.b;
                o3 o3Var2 = w4Var3.N;
                if (o3Var2 != null && (aVar2 = w4Var3.a) != null) {
                    v3 v3Var2 = o3Var2.a;
                    v3Var2.getClass();
                    if (v3.A3(aVar2.b)) {
                        g2 g2Var = v3Var2.J3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> f32 = v3.f3(aVar2.b);
                        TL_iv.PageBlock pageBlock = aVar2.b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (f32 == null) {
                                f32 = new ArrayList<>();
                            }
                            pageblockcollage.items = f32;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (f32 == null) {
                                f32 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = f32;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        aVar2.b = pageblockslideshow;
                        g2 g2Var2 = v3Var2.J3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        View y12 = v3Var2.y1(aVar2);
                        if (y12 instanceof w4) {
                            w4 w4Var4 = (w4) y12;
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
