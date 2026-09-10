package hi;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class u4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x4 b;

    public /* synthetic */ u4(x4 x4Var, int i10) {
        this.a = i10;
        this.b = x4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.a) {
            case 0:
                final x4 x4Var = this.b;
                ArrayList arrayList = x4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (x4Var.N != null && x4Var.a != null) {
                    List m10 = x4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final v vVar = (v) m10.get(indexOf);
                        w70 a02 = x4Var.N.a.h3.a0((View) arrayList.get(indexOf));
                        boolean z10 = vVar.n;
                        final int i10 = 0;
                        a02.c(z10 ? R.drawable.msg_spoiler_off : R.drawable.msg_spoiler, LocaleController.getString(z10 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler), new Runnable() { // from class: hi.v4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i10) {
                                    case 0:
                                        x4 x4Var2 = x4Var;
                                        s3 s3Var = x4Var2.N;
                                        if (s3Var != null && (aVar3 = x4Var2.a) != null) {
                                            z3 z3Var = s3Var.a;
                                            z3Var.getClass();
                                            v vVar2 = vVar;
                                            if (vVar2 != null) {
                                                k2 k2Var = z3Var.J3;
                                                if (k2Var != null) {
                                                    k2Var.d();
                                                }
                                                vVar2.n = !vVar2.n;
                                                TL_iv.PageBlock M3 = z3.M3(aVar3, vVar2);
                                                if (M3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) M3).spoiler = vVar2.n;
                                                } else if (M3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) M3).spoiler = vVar2.n;
                                                }
                                                z3Var.m4(aVar3);
                                                k2 k2Var2 = z3Var.J3;
                                                if (k2Var2 != null) {
                                                    k2Var2.h();
                                                }
                                                z3Var.h3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        x4 x4Var3 = x4Var;
                                        s3 s3Var2 = x4Var3.N;
                                        if (s3Var2 != null && (aVar4 = x4Var3.a) != null) {
                                            z3.M1(aVar4, vVar, s3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        final int i11 = 1;
                        a02.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: hi.v4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i11) {
                                    case 0:
                                        x4 x4Var2 = x4Var;
                                        s3 s3Var = x4Var2.N;
                                        if (s3Var != null && (aVar3 = x4Var2.a) != null) {
                                            z3 z3Var = s3Var.a;
                                            z3Var.getClass();
                                            v vVar2 = vVar;
                                            if (vVar2 != null) {
                                                k2 k2Var = z3Var.J3;
                                                if (k2Var != null) {
                                                    k2Var.d();
                                                }
                                                vVar2.n = !vVar2.n;
                                                TL_iv.PageBlock M3 = z3.M3(aVar3, vVar2);
                                                if (M3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) M3).spoiler = vVar2.n;
                                                } else if (M3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) M3).spoiler = vVar2.n;
                                                }
                                                z3Var.m4(aVar3);
                                                k2 k2Var2 = z3Var.J3;
                                                if (k2Var2 != null) {
                                                    k2Var2.h();
                                                }
                                                z3Var.h3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        x4 x4Var3 = x4Var;
                                        s3 s3Var2 = x4Var3.N;
                                        if (s3Var2 != null && (aVar4 = x4Var3.a) != null) {
                                            z3.M1(aVar4, vVar, s3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        a02.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (x4Var.H) {
                            a02.u = false;
                            a02.v = true;
                            a02.s = 0;
                        }
                        a02.Z();
                        break;
                    }
                }
                break;
            case 1:
                x4 x4Var2 = this.b;
                s3 s3Var = x4Var2.N;
                if (s3Var != null && (aVar = x4Var2.a) != null) {
                    z3 z3Var = s3Var.a;
                    z3Var.b4 = aVar;
                    z3Var.h3.q(0);
                    break;
                }
                break;
            default:
                x4 x4Var3 = this.b;
                s3 s3Var2 = x4Var3.N;
                if (s3Var2 != null && (aVar2 = x4Var3.a) != null) {
                    z3 z3Var2 = s3Var2.a;
                    z3Var2.getClass();
                    if (z3.A3(aVar2.b)) {
                        k2 k2Var = z3Var2.J3;
                        if (k2Var != null) {
                            k2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> f32 = z3.f3(aVar2.b);
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
                        k2 k2Var2 = z3Var2.J3;
                        if (k2Var2 != null) {
                            k2Var2.h();
                        }
                        View y12 = z3Var2.y1(aVar2);
                        if (y12 instanceof x4) {
                            x4 x4Var4 = (x4) y12;
                            ValueAnimator valueAnimator = x4Var4.i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                x4Var4.i0 = null;
                            }
                            if (x4Var4.getParent() != null) {
                                x4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = x4Var4.h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                x4Var4.h0 = null;
                            }
                            x4Var4.W = 0;
                            x4Var4.a0 = 0.0f;
                            x4Var4.o(true);
                            x4Var4.requestLayout();
                            x4Var4.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
