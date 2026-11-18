package fi;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.qa;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.wy;
import org.telegram.ui.bw0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class y6 implements b9 {
    public final ck0 a;
    public final bw0 b;
    public final int[] c;
    public final boolean d;
    public x6 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public y6(ck0 ck0Var, boolean z10) {
        this.c = new int[2];
        this.a = ck0Var;
        this.d = z10;
        this.b = null;
    }

    public static y6 a(ck0 ck0Var) {
        return new y6(ck0Var, false);
    }

    @Override // fi.b9
    public final void b(boolean z10) {
        x6 x6Var = this.e;
        if (x6Var != null) {
            x6Var.b(z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(c9 c9Var) {
        View view = c9Var.g;
        if (view == 0) {
            return;
        }
        if (view instanceof w6) {
            ((w6) view).a(this.c);
            c9Var.h = r1[0];
            c9Var.i = r1[1] - this.s;
            return;
        }
        if (view instanceof ba) {
            c9Var.h = ((ba) view).f3;
            c9Var.i = (view.getMeasuredHeight() - c9Var.g.getPaddingBottom()) - this.s;
        } else {
            c9Var.h = view.getPaddingTop();
            c9Var.i = (c9Var.g.getMeasuredHeight() - c9Var.g.getPaddingBottom()) - this.s;
        }
    }

    @Override // fi.b9
    public final void e(long j3, int i7, e3 e3Var) {
        ArrayList arrayList;
        ck0 ck0Var = this.a;
        if (ck0Var != null && (ck0Var.getParent() instanceof q)) {
            q qVar = (q) ck0Var.getParent();
            if (qVar.k(j3)) {
                qVar.c0.add(e3Var);
                return;
            } else {
                e3Var.run();
                return;
            }
        }
        int i10 = 0;
        if (ck0Var == null || !(ck0Var.getParent() instanceof a5)) {
            if (this.d) {
                p6 R1 = mp.u1(j10.t0).R1();
                ArrayList arrayList2 = R1.h;
                R1.v(arrayList2);
                Collections.sort(arrayList2, R1.J);
                ks.f(R1.a).k(ks.x5, new Object[0]);
            }
            e3Var.run();
            return;
        }
        a5 a5Var = (a5) ck0Var.getParent();
        wy wyVar = a5Var.y;
        w4 w4Var = a5Var.x;
        if (w4Var != null && (arrayList = w4Var.c) != null && wyVar != null) {
            while (true) {
                if (i10 >= arrayList.size()) {
                    i10 = -1;
                    break;
                }
                r4 r4Var = (r4) arrayList.get(i10);
                if (r4Var != null) {
                    TL_stories.StoryReaction storyReaction = r4Var.c;
                    if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                        if (tL_storyReactionPublicRepost.story != null && org.telegram.messenger.n5.o(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.id == i7) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i10++;
            }
            if (i10 >= 0) {
                int L0 = wyVar.L0();
                int N0 = wyVar.N0();
                if (i10 < L0 || i10 > N0) {
                    wyVar.h1(i10, org.telegram.messenger.g0.L(60.0f));
                    ck0Var.post(e3Var);
                    return;
                }
            }
        }
        e3Var.run();
    }

    @Override // fi.b9
    public final boolean k(long j3, int i7, int i10, int i11, c9 c9Var) {
        z8 z8Var = null;
        c9Var.a = null;
        c9Var.b = null;
        c9Var.c = null;
        c9Var.e = null;
        ck0 ck0Var = this.a;
        q qVar = (ck0Var == null || !(ck0Var.getParent() instanceof q)) ? null : (q) ck0Var.getParent();
        ViewGroup viewGroup = (qVar == null || qVar.g()) ? ck0Var : qVar.r;
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
                        c9Var.a = childAt;
                        c9Var.b = pVar.r;
                        c9Var.m = pVar.P;
                        c9Var.d = pVar.S;
                        q qVar2 = (q) pVar.getParent().getParent();
                        c9Var.g = qVar2;
                        c9Var.i = 0.0f;
                        c9Var.h = 0.0f;
                        c9Var.k = 1.0f;
                        if (pVar.H && qVar2.g()) {
                            c9Var.f = new di.c7(new Path(), 8);
                            return true;
                        }
                        c9Var.f = z8Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t2) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                    ImageReceiver imageReceiver = t2Var.Z1;
                    org.telegram.ui.Cells.m2 m2Var = t2Var.v0;
                    long dialogId = t2Var.getDialogId();
                    boolean z10 = this.d;
                    if ((dialogId == j3 && !z10) || (z10 && t2Var.U())) {
                        c9Var.a = childAt;
                        c9Var.m = m2Var;
                        c9Var.b = imageReceiver;
                        c9Var.g = (View) t2Var.getParent();
                        if (z10) {
                            c9Var.l = imageReceiver;
                            boolean z11 = m2Var.w;
                        }
                        c9Var.k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject().e1() == i7) {
                        c9Var.a = childAt;
                        if (i11 == 1 || i11 == 2) {
                            c9Var.c = q1Var.getPhotoImage();
                        } else {
                            c9Var.c = q1Var.T7;
                        }
                        c9Var.g = (View) q1Var.getParent();
                        c9Var.k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.u0) {
                    org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) childAt;
                    if (u0Var.getMessageObject().e1() == i7) {
                        c9Var.a = childAt;
                        if (u0Var.getMessageObject().k.media.storyItem.noforwards) {
                            c9Var.b = u0Var.getPhotoImage();
                        } else {
                            c9Var.c = u0Var.getPhotoImage();
                        }
                        c9Var.g = (View) u0Var.getParent();
                        c9Var.k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.o7) && ck0Var != null) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                    fj messageObject = o7Var.getMessageObject();
                    if ((o7Var.getStyle() == 1 && i10 == 0) || (messageObject != null && messageObject.x4() && messageObject.e1() == i10 && messageObject.l.dialogId == j3)) {
                        hj0 fastScroll = ck0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        c9Var.a = childAt;
                        c9Var.c = o7Var.c;
                        c9Var.e = new a3.h(o7Var, fastScroll, iArr, 8);
                        c9Var.g = (View) o7Var.getParent();
                        c9Var.k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if (childAt instanceof qa) {
                    qa qaVar = (qa) childAt;
                    if (qaVar.getDialogId() == j3) {
                        t3 t3Var = qaVar.a;
                        c9Var.a = t3Var;
                        c9Var.m = qaVar.U;
                        c9Var.b = t3Var.getImageReceiver();
                        c9Var.g = (View) qaVar.getParent();
                        c9Var.k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.m6) {
                    org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                    q9 q9Var = m6Var.h;
                    if (m6Var.E != j3) {
                        continue;
                    } else {
                        boolean z12 = (q9Var == null || q9Var.getImageReceiver() == null || q9Var.getImageReceiver().T == null) ? false : true;
                        if (m6Var.n == i10 && z12) {
                            c9Var.a = q9Var;
                            c9Var.c = q9Var.getImageReceiver();
                            c9Var.g = (View) m6Var.getParent();
                            float alphaInternal = m6Var.getAlphaInternal() * m6Var.getAlpha();
                            c9Var.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                c9Var.j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, m6Var.getResourcesProvider()));
                            }
                            c(c9Var);
                            return true;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.l6 l6Var = m6Var.c;
                            c9Var.a = l6Var;
                            c9Var.m = m6Var.F;
                            c9Var.b = l6Var.getImageReceiver();
                            c9Var.g = (View) m6Var.getParent();
                            float alphaInternal2 = m6Var.getAlphaInternal() * m6Var.getAlpha();
                            c9Var.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                c9Var.j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, m6Var.getResourcesProvider()));
                            }
                            c(c9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g6) {
                    org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) childAt;
                    if (g6Var.getDialogId() == j3) {
                        c9Var.a = g6Var;
                        c9Var.m = g6Var.v0;
                        c9Var.b = g6Var.r;
                        c9Var.g = (View) g6Var.getParent();
                        c9Var.k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w7) {
                    org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) childAt;
                    if (w7Var.getPostInfo().b() == i10) {
                        c9Var.a = w7Var.getImageView();
                        c9Var.m = w7Var.getStoryAvatarParams();
                        c9Var.c = w7Var.getImageView().getImageReceiver();
                        c9Var.g = (View) w7Var.getParent();
                        c9Var.k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j3 && a5Var.getStoryItem().messageId == i7) {
                        c9Var.a = a5Var.getAvatarImageView();
                        c9Var.m = a5Var.getStoryAvatarParams();
                        c9Var.b = a5Var.getAvatarImageView().getImageReceiver();
                        c9Var.g = (View) a5Var.getParent();
                        c9Var.k = 1.0f;
                        c(c9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i12++;
                z8Var = null;
            }
        }
        return false;
    }

    public y6(bw0 bw0Var) {
        this.c = new int[2];
        this.b = bw0Var;
        this.a = null;
    }
}
