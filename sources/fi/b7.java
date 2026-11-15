package fi;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.zi0;
import org.telegram.ui.zv0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class b7 implements e9 {
    public final uj0 a;
    public final zv0 b;
    public final int[] c;
    public final boolean d;
    public a7 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public b7(uj0 uj0Var, boolean z10) {
        this.c = new int[2];
        this.a = uj0Var;
        this.d = z10;
        this.b = null;
    }

    public static b7 a(uj0 uj0Var) {
        return new b7(uj0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(f9 f9Var) {
        View view = f9Var.g;
        if (view == 0) {
            return;
        }
        if (view instanceof z6) {
            ((z6) view).a(this.c);
            f9Var.h = r1[0];
            f9Var.i = r1[1] - this.s;
            return;
        }
        if (view instanceof t9) {
            f9Var.h = ((t9) view).f3;
            f9Var.i = (view.getMeasuredHeight() - f9Var.g.getPaddingBottom()) - this.s;
        } else {
            f9Var.h = view.getPaddingTop();
            f9Var.i = (f9Var.g.getMeasuredHeight() - f9Var.g.getPaddingBottom()) - this.s;
        }
    }

    @Override // fi.e9
    public final void c(boolean z10) {
        a7 a7Var = this.e;
        if (a7Var != null) {
            a7Var.c(z10);
        }
    }

    @Override // fi.e9
    public final void d(long j3, int i7, g3 g3Var) {
        ArrayList arrayList;
        uj0 uj0Var = this.a;
        if (uj0Var != null && (uj0Var.getParent() instanceof q)) {
            q qVar = (q) uj0Var.getParent();
            if (qVar.k(j3)) {
                qVar.c0.add(g3Var);
                return;
            } else {
                g3Var.run();
                return;
            }
        }
        int i10 = 0;
        if (uj0Var == null || !(uj0Var.getParent() instanceof c5)) {
            if (this.d) {
                s6 P1 = np.s1(m10.t0).P1();
                ArrayList arrayList2 = P1.h;
                P1.v(arrayList2);
                Collections.sort(arrayList2, P1.J);
                ns.f(P1.a).k(ns.v5, new Object[0]);
            }
            g3Var.run();
            return;
        }
        c5 c5Var = (c5) uj0Var.getParent();
        qy qyVar = c5Var.y;
        y4 y4Var = c5Var.x;
        if (y4Var != null && (arrayList = y4Var.c) != null && qyVar != null) {
            while (true) {
                if (i10 >= arrayList.size()) {
                    i10 = -1;
                    break;
                }
                t4 t4Var = (t4) arrayList.get(i10);
                if (t4Var != null) {
                    TL_stories.StoryReaction storyReaction = t4Var.c;
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
                int L0 = qyVar.L0();
                int N0 = qyVar.N0();
                if (i10 < L0 || i10 > N0) {
                    qyVar.h1(i10, org.telegram.messenger.g0.L(60.0f));
                    uj0Var.post(g3Var);
                    return;
                }
            }
        }
        g3Var.run();
    }

    @Override // fi.e9
    public final boolean l(long j3, int i7, int i10, int i11, f9 f9Var) {
        c9 c9Var = null;
        f9Var.a = null;
        f9Var.b = null;
        f9Var.c = null;
        f9Var.e = null;
        uj0 uj0Var = this.a;
        q qVar = (uj0Var == null || !(uj0Var.getParent() instanceof q)) ? null : (q) uj0Var.getParent();
        ViewGroup viewGroup = (qVar == null || qVar.g()) ? uj0Var : qVar.r;
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
                    if (pVar.F == j3) {
                        f9Var.a = childAt;
                        f9Var.b = pVar.r;
                        f9Var.m = pVar.P;
                        f9Var.d = pVar.S;
                        q qVar2 = (q) pVar.getParent().getParent();
                        f9Var.g = qVar2;
                        f9Var.i = 0.0f;
                        f9Var.h = 0.0f;
                        f9Var.k = 1.0f;
                        if (pVar.H && qVar2.g()) {
                            f9Var.f = new di.z6(new Path(), 8);
                            return true;
                        }
                        f9Var.f = c9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t2) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                    ImageReceiver imageReceiver = t2Var.Z1;
                    org.telegram.ui.Cells.m2 m2Var = t2Var.v0;
                    long dialogId = t2Var.getDialogId();
                    boolean z10 = this.d;
                    if ((dialogId == j3 && !z10) || (z10 && t2Var.X())) {
                        f9Var.a = childAt;
                        f9Var.m = m2Var;
                        f9Var.b = imageReceiver;
                        f9Var.g = (View) t2Var.getParent();
                        if (z10) {
                            f9Var.l = imageReceiver;
                            boolean z11 = m2Var.w;
                        }
                        f9Var.k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject().e1() == i7) {
                        f9Var.a = childAt;
                        if (i11 == 1 || i11 == 2) {
                            f9Var.c = q1Var.getPhotoImage();
                        } else {
                            f9Var.c = q1Var.T7;
                        }
                        f9Var.g = (View) q1Var.getParent();
                        f9Var.k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                    if (t0Var.getMessageObject().e1() == i7) {
                        f9Var.a = childAt;
                        if (t0Var.getMessageObject().k.media.storyItem.noforwards) {
                            f9Var.b = t0Var.getPhotoImage();
                        } else {
                            f9Var.c = t0Var.getPhotoImage();
                        }
                        f9Var.g = (View) t0Var.getParent();
                        f9Var.k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.n7) && uj0Var != null) {
                    org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) childAt;
                    gj messageObject = n7Var.getMessageObject();
                    if ((n7Var.getStyle() == 1 && i10 == 0) || (messageObject != null && messageObject.x4() && messageObject.e1() == i10 && messageObject.l.dialogId == j3)) {
                        zi0 fastScroll = uj0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        f9Var.a = childAt;
                        f9Var.c = n7Var.c;
                        f9Var.e = new a3.h(n7Var, fastScroll, iArr, 8);
                        f9Var.g = (View) n7Var.getParent();
                        f9Var.k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof pa) {
                    pa paVar = (pa) childAt;
                    if (paVar.getDialogId() == j3) {
                        v3 v3Var = paVar.a;
                        f9Var.a = v3Var;
                        f9Var.m = paVar.U;
                        f9Var.b = v3Var.getImageReceiver();
                        f9Var.g = (View) paVar.getParent();
                        f9Var.k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.l6) {
                    org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) childAt;
                    org.telegram.ui.Components.i9 i9Var = l6Var.h;
                    if (l6Var.E != j3) {
                        continue;
                    } else {
                        boolean z12 = (i9Var == null || i9Var.getImageReceiver() == null || i9Var.getImageReceiver().T == null) ? false : true;
                        if (l6Var.n == i10 && z12) {
                            f9Var.a = i9Var;
                            f9Var.c = i9Var.getImageReceiver();
                            f9Var.g = (View) l6Var.getParent();
                            float alphaInternal = l6Var.getAlphaInternal() * l6Var.getAlpha();
                            f9Var.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                f9Var.j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, l6Var.getResourcesProvider()));
                            }
                            b(f9Var);
                            return true;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.k6 k6Var = l6Var.c;
                            f9Var.a = k6Var;
                            f9Var.m = l6Var.F;
                            f9Var.b = k6Var.getImageReceiver();
                            f9Var.g = (View) l6Var.getParent();
                            float alphaInternal2 = l6Var.getAlphaInternal() * l6Var.getAlpha();
                            f9Var.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                f9Var.j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, l6Var.getResourcesProvider()));
                            }
                            b(f9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.f6) {
                    org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) childAt;
                    if (f6Var.getDialogId() == j3) {
                        f9Var.a = f6Var;
                        f9Var.m = f6Var.v0;
                        f9Var.b = f6Var.r;
                        f9Var.g = (View) f6Var.getParent();
                        f9Var.k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v7) {
                    org.telegram.ui.Cells.v7 v7Var = (org.telegram.ui.Cells.v7) childAt;
                    if (v7Var.getPostInfo().b() == i10) {
                        f9Var.a = v7Var.getImageView();
                        f9Var.m = v7Var.getStoryAvatarParams();
                        f9Var.c = v7Var.getImageView().getImageReceiver();
                        f9Var.g = (View) v7Var.getParent();
                        f9Var.k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j3 && a5Var.getStoryItem().messageId == i7) {
                        f9Var.a = a5Var.getAvatarImageView();
                        f9Var.m = a5Var.getStoryAvatarParams();
                        f9Var.b = a5Var.getAvatarImageView().getImageReceiver();
                        f9Var.g = (View) a5Var.getParent();
                        f9Var.k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i12++;
                c9Var = null;
            }
        }
        return false;
    }

    public b7(zv0 zv0Var) {
        this.c = new int[2];
        this.b = zv0Var;
        this.a = null;
    }
}
