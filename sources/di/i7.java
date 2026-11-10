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
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.dw0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i7 implements m9 {
    public final pj0 a;
    public final dw0 b;
    public final int[] c;
    public final boolean d;
    public h7 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public i7(pj0 pj0Var, boolean z9) {
        this.c = new int[2];
        this.a = pj0Var;
        this.d = z9;
        this.b = null;
    }

    public static i7 a(pj0 pj0Var) {
        return new i7(pj0Var, false);
    }

    @Override // di.m9
    public final void b(boolean z9) {
        h7 h7Var = this.e;
        if (h7Var != null) {
            h7Var.b(z9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(n9 n9Var) {
        View view = n9Var.g;
        if (view == 0) {
            return;
        }
        if (view instanceof g7) {
            ((g7) view).a(this.c);
            n9Var.h = r1[0];
            n9Var.i = r1[1] - this.s;
            return;
        }
        if (view instanceof org.telegram.ui.Components.w9) {
            n9Var.h = ((org.telegram.ui.Components.w9) view).e3;
            n9Var.i = (view.getMeasuredHeight() - n9Var.g.getPaddingBottom()) - this.s;
        } else {
            n9Var.h = view.getPaddingTop();
            n9Var.i = (n9Var.g.getMeasuredHeight() - n9Var.g.getPaddingBottom()) - this.s;
        }
    }

    @Override // di.m9
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
        if (pj0Var == null || !(pj0Var.getParent() instanceof l5)) {
            if (this.d) {
                z6 P1 = qp.s1(p10.s0).P1();
                ArrayList arrayList2 = P1.h;
                P1.v(arrayList2);
                Collections.sort(arrayList2, P1.J);
                qs.f(P1.a).k(qs.v5, new Object[0]);
            }
            l3Var.run();
            return;
        }
        l5 l5Var = (l5) pj0Var.getParent();
        ly lyVar = l5Var.y;
        h5 h5Var = l5Var.x;
        if (h5Var != null && (arrayList = h5Var.c) != null && lyVar != null) {
            while (true) {
                if (i10 >= arrayList.size()) {
                    i10 = -1;
                    break;
                }
                c5 c5Var = (c5) arrayList.get(i10);
                if (c5Var != null) {
                    TL_stories.StoryReaction storyReaction = c5Var.c;
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
                int L0 = lyVar.L0();
                int N0 = lyVar.N0();
                if (i10 < L0 || i10 > N0) {
                    lyVar.h1(i10, org.telegram.messenger.g0.L(60.0f));
                    pj0Var.post(l3Var);
                    return;
                }
            }
        }
        l3Var.run();
    }

    @Override // di.m9
    public final boolean o(long j3, int i7, int i10, int i11, n9 n9Var) {
        k9 k9Var = null;
        n9Var.a = null;
        n9Var.b = null;
        n9Var.c = null;
        n9Var.e = null;
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
                        n9Var.a = childAt;
                        n9Var.b = pVar.r;
                        n9Var.m = pVar.O;
                        n9Var.d = pVar.R;
                        q qVar2 = (q) pVar.getParent().getParent();
                        n9Var.g = qVar2;
                        n9Var.i = 0.0f;
                        n9Var.h = 0.0f;
                        n9Var.k = 1.0f;
                        if (pVar.G && qVar2.g()) {
                            n9Var.f = new r4(new Path(), 1);
                            return true;
                        }
                        n9Var.f = k9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t2) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                    ImageReceiver imageReceiver = t2Var.Y1;
                    org.telegram.ui.Cells.m2 m2Var = t2Var.u0;
                    long dialogId = t2Var.getDialogId();
                    boolean z9 = this.d;
                    if ((dialogId == j3 && !z9) || (z9 && t2Var.U())) {
                        n9Var.a = childAt;
                        n9Var.m = m2Var;
                        n9Var.b = imageReceiver;
                        n9Var.g = (View) t2Var.getParent();
                        if (z9) {
                            n9Var.l = imageReceiver;
                            boolean z10 = m2Var.w;
                        }
                        n9Var.k = 1.0f;
                        c(n9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject().e1() == i7) {
                        n9Var.a = childAt;
                        if (i11 == 1 || i11 == 2) {
                            n9Var.c = q1Var.getPhotoImage();
                        } else {
                            n9Var.c = q1Var.S7;
                        }
                        n9Var.g = (View) q1Var.getParent();
                        n9Var.k = 1.0f;
                        c(n9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                    if (t0Var.getMessageObject().e1() == i7) {
                        n9Var.a = childAt;
                        if (t0Var.getMessageObject().k.media.storyItem.noforwards) {
                            n9Var.b = t0Var.getPhotoImage();
                        } else {
                            n9Var.c = t0Var.getPhotoImage();
                        }
                        n9Var.g = (View) t0Var.getParent();
                        n9Var.k = 1.0f;
                        c(n9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.o7) && pj0Var != null) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                    ij messageObject = o7Var.getMessageObject();
                    if ((o7Var.getStyle() == 1 && i10 == 0) || (messageObject != null && messageObject.x4() && messageObject.e1() == i10 && messageObject.l.dialogId == j3)) {
                        ui0 fastScroll = pj0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        n9Var.a = childAt;
                        n9Var.c = o7Var.c;
                        n9Var.e = new a3.h(o7Var, fastScroll, iArr, 7);
                        n9Var.g = (View) o7Var.getParent();
                        n9Var.k = 1.0f;
                        c(n9Var);
                        return true;
                    }
                } else if (childAt instanceof pa) {
                    pa paVar = (pa) childAt;
                    if (paVar.getDialogId() == j3) {
                        d4 d4Var = paVar.a;
                        n9Var.a = d4Var;
                        n9Var.m = paVar.T;
                        n9Var.b = d4Var.getImageReceiver();
                        n9Var.g = (View) paVar.getParent();
                        n9Var.k = 1.0f;
                        c(n9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.m6) {
                    org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                    org.telegram.ui.Components.k9 k9Var2 = m6Var.h;
                    if (m6Var.D != j3) {
                        continue;
                    } else {
                        boolean z11 = (k9Var2 == null || k9Var2.getImageReceiver() == null || k9Var2.getImageReceiver().S == null) ? false : true;
                        if (m6Var.n == i10 && z11) {
                            n9Var.a = k9Var2;
                            n9Var.c = k9Var2.getImageReceiver();
                            n9Var.g = (View) m6Var.getParent();
                            float alphaInternal = m6Var.getAlphaInternal() * m6Var.getAlpha();
                            n9Var.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                n9Var.j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, m6Var.getResourcesProvider()));
                            }
                            c(n9Var);
                            return true;
                        }
                        if (!z11) {
                            org.telegram.ui.Cells.l6 l6Var = m6Var.c;
                            n9Var.a = l6Var;
                            n9Var.m = m6Var.E;
                            n9Var.b = l6Var.getImageReceiver();
                            n9Var.g = (View) m6Var.getParent();
                            float alphaInternal2 = m6Var.getAlphaInternal() * m6Var.getAlpha();
                            n9Var.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                n9Var.j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, m6Var.getResourcesProvider()));
                            }
                            c(n9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g6) {
                    org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) childAt;
                    if (g6Var.getDialogId() == j3) {
                        n9Var.a = g6Var;
                        n9Var.m = g6Var.u0;
                        n9Var.b = g6Var.r;
                        n9Var.g = (View) g6Var.getParent();
                        n9Var.k = 1.0f;
                        c(n9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w7) {
                    org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) childAt;
                    if (w7Var.getPostInfo().b() == i10) {
                        n9Var.a = w7Var.getImageView();
                        n9Var.m = w7Var.getStoryAvatarParams();
                        n9Var.c = w7Var.getImageView().getImageReceiver();
                        n9Var.g = (View) w7Var.getParent();
                        n9Var.k = 1.0f;
                        c(n9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j3 && a5Var.getStoryItem().messageId == i7) {
                        n9Var.a = a5Var.getAvatarImageView();
                        n9Var.m = a5Var.getStoryAvatarParams();
                        n9Var.b = a5Var.getAvatarImageView().getImageReceiver();
                        n9Var.g = (View) a5Var.getParent();
                        n9Var.k = 1.0f;
                        c(n9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i12++;
                k9Var = null;
            }
        }
        return false;
    }

    public i7(dw0 dw0Var) {
        this.c = new int[2];
        this.b = dw0Var;
        this.a = null;
    }
}
