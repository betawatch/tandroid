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
import org.telegram.ui.Components.y70;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4 b;

    public /* synthetic */ s4(v4 v4Var, int i10) {
        this.a = i10;
        this.b = v4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.a) {
            case 0:
                final v4 v4Var = this.b;
                ArrayList arrayList = v4Var.E;
                int indexOf = arrayList.indexOf(view);
                if (v4Var.N != null && v4Var.a != null) {
                    List m10 = v4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final u uVar = (u) m10.get(indexOf);
                        y70 F = v4Var.N.a.h3.F((View) arrayList.get(indexOf));
                        boolean z10 = uVar.n;
                        final int i10 = 0;
                        F.c(z10 ? R.drawable.msg_spoiler_off : R.drawable.msg_spoiler, LocaleController.getString(z10 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler), new Runnable() { // from class: ii.t4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i10) {
                                    case 0:
                                        v4 v4Var2 = v4Var;
                                        q3 q3Var = v4Var2.N;
                                        if (q3Var != null && (aVar3 = v4Var2.a) != null) {
                                            x3 x3Var = q3Var.a;
                                            x3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                i2 i2Var = x3Var.J3;
                                                if (i2Var != null) {
                                                    i2Var.d();
                                                }
                                                uVar2.n = !uVar2.n;
                                                TL_iv.PageBlock N3 = x3.N3(aVar3, uVar2);
                                                if (N3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) N3).spoiler = uVar2.n;
                                                } else if (N3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) N3).spoiler = uVar2.n;
                                                }
                                                x3Var.n4(aVar3);
                                                i2 i2Var2 = x3Var.J3;
                                                if (i2Var2 != null) {
                                                    i2Var2.h();
                                                }
                                                x3Var.h3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        v4 v4Var3 = v4Var;
                                        q3 q3Var2 = v4Var3.N;
                                        if (q3Var2 != null && (aVar4 = v4Var3.a) != null) {
                                            x3.N1(aVar4, uVar, q3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        final int i11 = 1;
                        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: ii.t4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i11) {
                                    case 0:
                                        v4 v4Var2 = v4Var;
                                        q3 q3Var = v4Var2.N;
                                        if (q3Var != null && (aVar3 = v4Var2.a) != null) {
                                            x3 x3Var = q3Var.a;
                                            x3Var.getClass();
                                            u uVar2 = uVar;
                                            if (uVar2 != null) {
                                                i2 i2Var = x3Var.J3;
                                                if (i2Var != null) {
                                                    i2Var.d();
                                                }
                                                uVar2.n = !uVar2.n;
                                                TL_iv.PageBlock N3 = x3.N3(aVar3, uVar2);
                                                if (N3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) N3).spoiler = uVar2.n;
                                                } else if (N3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) N3).spoiler = uVar2.n;
                                                }
                                                x3Var.n4(aVar3);
                                                i2 i2Var2 = x3Var.J3;
                                                if (i2Var2 != null) {
                                                    i2Var2.h();
                                                }
                                                x3Var.h3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        v4 v4Var3 = v4Var;
                                        q3 q3Var2 = v4Var3.N;
                                        if (q3Var2 != null && (aVar4 = v4Var3.a) != null) {
                                            x3.N1(aVar4, uVar, q3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        F.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (v4Var.H) {
                            F.u = false;
                            F.v = true;
                            F.s = 0;
                        }
                        F.Z();
                        break;
                    }
                }
                break;
            case 1:
                v4 v4Var2 = this.b;
                q3 q3Var = v4Var2.N;
                if (q3Var != null && (aVar = v4Var2.a) != null) {
                    x3 x3Var = q3Var.a;
                    x3Var.b4 = aVar;
                    x3Var.h3.i(0);
                    break;
                }
                break;
            default:
                v4 v4Var3 = this.b;
                q3 q3Var2 = v4Var3.N;
                if (q3Var2 != null && (aVar2 = v4Var3.a) != null) {
                    x3 x3Var2 = q3Var2.a;
                    x3Var2.getClass();
                    if (x3.B3(aVar2.b)) {
                        i2 i2Var = x3Var2.J3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> g32 = x3.g3(aVar2.b);
                        TL_iv.PageBlock pageBlock = aVar2.b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (g32 == null) {
                                g32 = new ArrayList<>();
                            }
                            pageblockcollage.items = g32;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (g32 == null) {
                                g32 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = g32;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        aVar2.b = pageblockslideshow;
                        i2 i2Var2 = x3Var2.J3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        View z12 = x3Var2.z1(aVar2);
                        if (z12 instanceof v4) {
                            v4 v4Var4 = (v4) z12;
                            ValueAnimator valueAnimator = v4Var4.i0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                v4Var4.i0 = null;
                            }
                            if (v4Var4.getParent() != null) {
                                v4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = v4Var4.h0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                v4Var4.h0 = null;
                            }
                            v4Var4.W = 0;
                            v4Var4.a0 = 0.0f;
                            v4Var4.o(true);
                            v4Var4.requestLayout();
                            v4Var4.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
