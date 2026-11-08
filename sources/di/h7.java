package di;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.aw0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h7 implements l9 {
    public final pj0 a;
    public final aw0 b;
    public final int[] c;
    public final boolean d;
    public g7 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public h7(pj0 pj0Var, boolean z9) {
        this.c = new int[2];
        this.a = pj0Var;
        this.d = z9;
        this.b = null;
    }

    public static h7 a(pj0 pj0Var) {
        return new h7(pj0Var, false);
    }

    @Override // di.l9
    public final void b(boolean z9) {
        g7 g7Var = this.e;
        if (g7Var != null) {
            g7Var.b(z9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(m9 m9Var) {
        View view = m9Var.g;
        if (view == 0) {
            return;
        }
        if (view instanceof f7) {
            ((f7) view).a(this.c);
            m9Var.h = r1[0];
            m9Var.i = r1[1] - this.s;
            return;
        }
        if (view instanceof org.telegram.ui.Components.x9) {
            m9Var.h = ((org.telegram.ui.Components.x9) view).e3;
            m9Var.i = (view.getMeasuredHeight() - m9Var.g.getPaddingBottom()) - this.s;
        } else {
            m9Var.h = view.getPaddingTop();
            m9Var.i = (m9Var.g.getMeasuredHeight() - m9Var.g.getPaddingBottom()) - this.s;
        }
    }

    @Override // di.l9
    public final void e(long j3, int i7, l3 l3Var) {
        ArrayList arrayList;
        pj0 pj0Var = this.a;
        if (pj0Var != null && (pj0Var.getParent() instanceof q)) {
            q qVar = (q) pj0Var.getParent();
            if (qVar.k(j3)) {
                qVar.b0.add(l3Var);
                return;
            } else {
                l3Var.run();
                return;
            }
        }
        int i10 = 0;
        if (pj0Var == null || !(pj0Var.getParent() instanceof k5)) {
            if (this.d) {
                y6 P1 = qp.s1(p10.s0).P1();
                ArrayList arrayList2 = P1.h;
                P1.v(arrayList2);
                Collections.sort(arrayList2, P1.J);
                qs.f(P1.a).k(qs.v5, new Object[0]);
            }
            l3Var.run();
            return;
        }
        k5 k5Var = (k5) pj0Var.getParent();
        my myVar = k5Var.y;
        g5 g5Var = k5Var.x;
        if (g5Var != null && (arrayList = g5Var.c) != null && myVar != null) {
            while (true) {
                if (i10 >= arrayList.size()) {
                    i10 = -1;
                    break;
                }
                b5 b5Var = (b5) arrayList.get(i10);
                if (b5Var != null) {
                    TL_stories.StoryReaction storyReaction = b5Var.c;
                    if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                        if (tL_storyReactionPublicRepost.story != null && org.telegram.messenger.m5.o(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.id == i7) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i10++;
            }
            if (i10 >= 0) {
                int L0 = myVar.L0();
                int N0 = myVar.N0();
                if (i10 < L0 || i10 > N0) {
                    myVar.h1(i10, org.telegram.messenger.g0.L(60.0f));
                    pj0Var.post(l3Var);
                    return;
                }
            }
        }
        l3Var.run();
    }

    @Override // di.l9
    public final boolean o(long j3, int i7, int i10, int i11, m9 m9Var) {
        j9 j9Var = null;
        m9Var.a = null;
        m9Var.b = null;
        m9Var.c = null;
        m9Var.e = null;
        pj0 pj0Var = this.a;
        q qVar = (pj0Var == null || !(pj0Var.getParent() instanceof q)) ? null : (q) pj0Var.getParent();
        ViewGroup viewGroup = (qVar == null || qVar.g()) ? pj0Var : qVar.r;
        ViewGroup viewGroup2 = this.b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i12 = 0;
            while (i12 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i12);
                if (childAt instanceof p) {
                    p pVar = (p) childAt;
                    if (pVar.E == j3) {
                        m9Var.a = childAt;
                        m9Var.b = pVar.r;
                        m9Var.m = pVar.O;
                        m9Var.d = pVar.R;
                        q qVar2 = (q) pVar.getParent().getParent();
                        m9Var.g = qVar2;
                        m9Var.i = 0.0f;
                        m9Var.h = 0.0f;
                        m9Var.k = 1.0f;
                        if (pVar.G && qVar2.g()) {
                            m9Var.f = new q4(new Path(), 1);
                            return true;
                        }
                        m9Var.f = j9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t2) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                    ImageReceiver imageReceiver = t2Var.Y1;
                    org.telegram.ui.Cells.m2 m2Var = t2Var.u0;
                    long dialogId = t2Var.getDialogId();
                    boolean z9 = this.d;
                    if ((dialogId == j3 && !z9) || (z9 && t2Var.U())) {
                        m9Var.a = childAt;
                        m9Var.m = m2Var;
                        m9Var.b = imageReceiver;
                        m9Var.g = (View) t2Var.getParent();
                        if (z9) {
                            m9Var.l = imageReceiver;
                            boolean z10 = m2Var.w;
                        }
                        m9Var.k = 1.0f;
                        c(m9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject().f1() == i7) {
                        m9Var.a = childAt;
                        if (i11 == 1 || i11 == 2) {
                            m9Var.c = q1Var.getPhotoImage();
                        } else {
                            m9Var.c = q1Var.S7;
                        }
                        m9Var.g = (View) q1Var.getParent();
                        m9Var.k = 1.0f;
                        c(m9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                    if (t0Var.getMessageObject().f1() == i7) {
                        m9Var.a = childAt;
                        if (t0Var.getMessageObject().k.media.storyItem.noforwards) {
                            m9Var.b = t0Var.getPhotoImage();
                        } else {
                            m9Var.c = t0Var.getPhotoImage();
                        }
                        m9Var.g = (View) t0Var.getParent();
                        m9Var.k = 1.0f;
                        c(m9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.o7) && pj0Var != null) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                    ij messageObject = o7Var.getMessageObject();
                    if ((o7Var.getStyle() == 1 && i10 == 0) || (messageObject != null && messageObject.y4() && messageObject.f1() == i10 && messageObject.l.dialogId == j3)) {
                        ui0 fastScroll = pj0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        m9Var.a = childAt;
                        m9Var.c = o7Var.c;
                        m9Var.e = new a3.h(o7Var, fastScroll, iArr, 7);
                        m9Var.g = (View) o7Var.getParent();
                        m9Var.k = 1.0f;
                        c(m9Var);
                        return true;
                    }
                } else if (childAt instanceof pa) {
                    pa paVar = (pa) childAt;
                    if (paVar.getDialogId() == j3) {
                        c4 c4Var = paVar.a;
                        m9Var.a = c4Var;
                        m9Var.m = paVar.T;
                        m9Var.b = c4Var.getImageReceiver();
                        m9Var.g = (View) paVar.getParent();
                        m9Var.k = 1.0f;
                        c(m9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.m6) {
                    org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                    org.telegram.ui.Components.l9 l9Var = m6Var.h;
                    if (m6Var.D != j3) {
                        continue;
                    } else {
                        boolean z11 = (l9Var == null || l9Var.getImageReceiver() == null || l9Var.getImageReceiver().S == null) ? false : true;
                        if (m6Var.n == i10 && z11) {
                            m9Var.a = l9Var;
                            m9Var.c = l9Var.getImageReceiver();
                            m9Var.g = (View) m6Var.getParent();
                            float alphaInternal = m6Var.getAlphaInternal() * m6Var.getAlpha();
                            m9Var.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                m9Var.j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, m6Var.getResourcesProvider()));
                            }
                            c(m9Var);
                            return true;
                        }
                        if (!z11) {
                            org.telegram.ui.Cells.l6 l6Var = m6Var.c;
                            m9Var.a = l6Var;
                            m9Var.m = m6Var.E;
                            m9Var.b = l6Var.getImageReceiver();
                            m9Var.g = (View) m6Var.getParent();
                            float alphaInternal2 = m6Var.getAlphaInternal() * m6Var.getAlpha();
                            m9Var.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                m9Var.j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, m6Var.getResourcesProvider()));
                            }
                            c(m9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g6) {
                    org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) childAt;
                    if (g6Var.getDialogId() == j3) {
                        m9Var.a = g6Var;
                        m9Var.m = g6Var.u0;
                        m9Var.b = g6Var.r;
                        m9Var.g = (View) g6Var.getParent();
                        m9Var.k = 1.0f;
                        c(m9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w7) {
                    org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) childAt;
                    if (w7Var.getPostInfo().b() == i10) {
                        m9Var.a = w7Var.getImageView();
                        m9Var.m = w7Var.getStoryAvatarParams();
                        m9Var.c = w7Var.getImageView().getImageReceiver();
                        m9Var.g = (View) w7Var.getParent();
                        m9Var.k = 1.0f;
                        c(m9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j3 && a5Var.getStoryItem().messageId == i7) {
                        m9Var.a = a5Var.getAvatarImageView();
                        m9Var.m = a5Var.getStoryAvatarParams();
                        m9Var.b = a5Var.getAvatarImageView().getImageReceiver();
                        m9Var.g = (View) a5Var.getParent();
                        m9Var.k = 1.0f;
                        c(m9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i12++;
                j9Var = null;
            }
        }
        return false;
    }

    public h7(aw0 aw0Var) {
        this.c = new int[2];
        this.b = aw0Var;
        this.a = null;
    }
}
