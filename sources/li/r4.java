package li;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.l80;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                    List l4 = u4Var.l();
                    if (indexOf >= 0 && indexOf < l4.size() && indexOf < arrayList.size()) {
                        final t tVar = (t) l4.get(indexOf);
                        l80 P = u4Var.N.a.p3.P((View) arrayList.get(indexOf));
                        boolean z10 = tVar.n;
                        final int i10 = 0;
                        P.c(z10 ? R.drawable.msg_spoiler_off : R.drawable.msg_spoiler, LocaleController.getString(z10 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler), new Runnable() { // from class: li.s4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i10) {
                                    case 0:
                                        u4 u4Var2 = u4Var;
                                        o3 o3Var = u4Var2.N;
                                        if (o3Var != null && (aVar3 = u4Var2.a) != null) {
                                            v3 v3Var = o3Var.a;
                                            v3Var.getClass();
                                            t tVar2 = tVar;
                                            if (tVar2 != null) {
                                                f2 f2Var = v3Var.R3;
                                                if (f2Var != null) {
                                                    f2Var.d();
                                                }
                                                tVar2.n = !tVar2.n;
                                                TL_iv.PageBlock T3 = v3.T3(aVar3, tVar2);
                                                if (T3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) T3).spoiler = tVar2.n;
                                                } else if (T3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) T3).spoiler = tVar2.n;
                                                }
                                                v3Var.t4(aVar3);
                                                f2 f2Var2 = v3Var.R3;
                                                if (f2Var2 != null) {
                                                    f2Var2.h();
                                                }
                                                v3Var.p3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        u4 u4Var3 = u4Var;
                                        o3 o3Var2 = u4Var3.N;
                                        if (o3Var2 != null && (aVar4 = u4Var3.a) != null) {
                                            v3.T1(aVar4, tVar, o3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        final int i11 = 1;
                        P.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: li.s4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i11) {
                                    case 0:
                                        u4 u4Var2 = u4Var;
                                        o3 o3Var = u4Var2.N;
                                        if (o3Var != null && (aVar3 = u4Var2.a) != null) {
                                            v3 v3Var = o3Var.a;
                                            v3Var.getClass();
                                            t tVar2 = tVar;
                                            if (tVar2 != null) {
                                                f2 f2Var = v3Var.R3;
                                                if (f2Var != null) {
                                                    f2Var.d();
                                                }
                                                tVar2.n = !tVar2.n;
                                                TL_iv.PageBlock T3 = v3.T3(aVar3, tVar2);
                                                if (T3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) T3).spoiler = tVar2.n;
                                                } else if (T3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) T3).spoiler = tVar2.n;
                                                }
                                                v3Var.t4(aVar3);
                                                f2 f2Var2 = v3Var.R3;
                                                if (f2Var2 != null) {
                                                    f2Var2.h();
                                                }
                                                v3Var.p3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        u4 u4Var3 = u4Var;
                                        o3 o3Var2 = u4Var3.N;
                                        if (o3Var2 != null && (aVar4 = u4Var3.a) != null) {
                                            v3.T1(aVar4, tVar, o3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        P.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (u4Var.H) {
                            P.u = false;
                            P.v = true;
                            P.s = 0;
                        }
                        P.Z();
                        break;
                    }
                }
                break;
            case 1:
                u4 u4Var2 = this.b;
                o3 o3Var = u4Var2.N;
                if (o3Var != null && (aVar = u4Var2.a) != null) {
                    v3 v3Var = o3Var.a;
                    v3Var.j4 = aVar;
                    v3Var.p3.m(0);
                    break;
                }
                break;
            default:
                u4 u4Var3 = this.b;
                o3 o3Var2 = u4Var3.N;
                if (o3Var2 != null && (aVar2 = u4Var3.a) != null) {
                    v3 v3Var2 = o3Var2.a;
                    v3Var2.getClass();
                    if (v3.H3(aVar2.b)) {
                        f2 f2Var = v3Var2.R3;
                        if (f2Var != null) {
                            f2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> m32 = v3.m3(aVar2.b);
                        TL_iv.PageBlock pageBlock = aVar2.b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (m32 == null) {
                                m32 = new ArrayList<>();
                            }
                            pageblockcollage.items = m32;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (m32 == null) {
                                m32 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = m32;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        aVar2.b = pageblockslideshow;
                        f2 f2Var2 = v3Var2.R3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                        }
                        View F1 = v3Var2.F1(aVar2);
                        if (F1 instanceof u4) {
                            u4 u4Var4 = (u4) F1;
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
                            u4Var4.n(true);
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
