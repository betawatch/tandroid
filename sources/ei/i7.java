package ei;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.sv0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i7 implements n9 {
    public final tj0 a;
    public final sv0 b;
    public final int[] c;
    public final boolean d;
    public h7 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public i7(tj0 tj0Var, boolean z10) {
        this.c = new int[2];
        this.a = tj0Var;
        this.d = z10;
        this.b = null;
    }

    public static i7 a(tj0 tj0Var) {
        return new i7(tj0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(o9 o9Var) {
        View view = o9Var.g;
        if (view == 0) {
            return;
        }
        if (view instanceof g7) {
            ((g7) view).a(this.c);
            o9Var.h = r1[0];
            o9Var.i = r1[1] - this.s;
            return;
        }
        if (view instanceof org.telegram.ui.Components.w9) {
            o9Var.h = ((org.telegram.ui.Components.w9) view).f3;
            o9Var.i = (view.getMeasuredHeight() - o9Var.g.getPaddingBottom()) - this.s;
        } else {
            o9Var.h = view.getPaddingTop();
            o9Var.i = (o9Var.g.getMeasuredHeight() - o9Var.g.getPaddingBottom()) - this.s;
        }
    }

    @Override // ei.n9
    public final void c(boolean z10) {
        h7 h7Var = this.e;
        if (h7Var != null) {
            h7Var.c(z10);
        }
    }

    @Override // ei.n9
    public final boolean j(long j10, int i3, int i10, int i11, o9 o9Var) {
        l9 l9Var = null;
        o9Var.a = null;
        o9Var.b = null;
        o9Var.c = null;
        o9Var.e = null;
        tj0 tj0Var = this.a;
        r rVar = (tj0Var == null || !(tj0Var.getParent() instanceof r)) ? null : (r) tj0Var.getParent();
        ViewGroup viewGroup = (rVar == null || rVar.g()) ? tj0Var : rVar.r;
        ViewGroup viewGroup2 = this.b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i12 = 0;
            while (i12 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i12);
                if (childAt instanceof q) {
                    q qVar = (q) childAt;
                    if (qVar.F == j10) {
                        o9Var.a = childAt;
                        o9Var.b = qVar.r;
                        o9Var.m = qVar.P;
                        o9Var.d = qVar.S;
                        r rVar2 = (r) qVar.getParent().getParent();
                        o9Var.g = rVar2;
                        o9Var.i = 0.0f;
                        o9Var.h = 0.0f;
                        o9Var.k = 1.0f;
                        if (qVar.H && rVar2.g()) {
                            o9Var.f = new a1.c(new Path(), 27);
                            return true;
                        }
                        o9Var.f = l9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t2) {
                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) childAt;
                    ImageReceiver imageReceiver = t2Var.Z1;
                    org.telegram.ui.Cells.m2 m2Var = t2Var.v0;
                    long dialogId = t2Var.getDialogId();
                    boolean z10 = this.d;
                    if ((dialogId == j10 && !z10) || (z10 && t2Var.U())) {
                        o9Var.a = childAt;
                        o9Var.m = m2Var;
                        o9Var.b = imageReceiver;
                        o9Var.g = (View) t2Var.getParent();
                        if (z10) {
                            o9Var.l = imageReceiver;
                            boolean z11 = m2Var.w;
                        }
                        o9Var.k = 1.0f;
                        b(o9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject().f1() == i3) {
                        o9Var.a = childAt;
                        if (i11 == 1 || i11 == 2) {
                            o9Var.c = q1Var.getPhotoImage();
                        } else {
                            o9Var.c = q1Var.S7;
                        }
                        o9Var.g = (View) q1Var.getParent();
                        o9Var.k = 1.0f;
                        b(o9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                    if (t0Var.getMessageObject().f1() == i3) {
                        o9Var.a = childAt;
                        if (t0Var.getMessageObject().k.media.storyItem.noforwards) {
                            o9Var.b = t0Var.getPhotoImage();
                        } else {
                            o9Var.c = t0Var.getPhotoImage();
                        }
                        o9Var.g = (View) t0Var.getParent();
                        o9Var.k = 1.0f;
                        b(o9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.n7) && tj0Var != null) {
                    org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) childAt;
                    zi messageObject = n7Var.getMessageObject();
                    if ((n7Var.getStyle() == 1 && i10 == 0) || (messageObject != null && messageObject.y4() && messageObject.f1() == i10 && messageObject.l.dialogId == j10)) {
                        yi0 fastScroll = tj0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        o9Var.a = childAt;
                        o9Var.c = n7Var.c;
                        o9Var.e = new aa.a(n7Var, fastScroll, iArr, 5);
                        o9Var.g = (View) n7Var.getParent();
                        o9Var.k = 1.0f;
                        b(o9Var);
                        return true;
                    }
                } else if (childAt instanceof pa) {
                    pa paVar = (pa) childAt;
                    if (paVar.getDialogId() == j10) {
                        d4 d4Var = paVar.a;
                        o9Var.a = d4Var;
                        o9Var.m = paVar.U;
                        o9Var.b = d4Var.getImageReceiver();
                        o9Var.g = (View) paVar.getParent();
                        o9Var.k = 1.0f;
                        b(o9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.l6) {
                    org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) childAt;
                    org.telegram.ui.Components.k9 k9Var = l6Var.h;
                    if (l6Var.E != j10) {
                        continue;
                    } else {
                        boolean z12 = (k9Var == null || k9Var.getImageReceiver() == null || k9Var.getImageReceiver().T == null) ? false : true;
                        if (l6Var.n == i10 && z12) {
                            o9Var.a = k9Var;
                            o9Var.c = k9Var.getImageReceiver();
                            o9Var.g = (View) l6Var.getParent();
                            float alphaInternal = l6Var.getAlphaInternal() * l6Var.getAlpha();
                            o9Var.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                o9Var.j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, l6Var.getResourcesProvider()));
                            }
                            b(o9Var);
                            return true;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.k6 k6Var = l6Var.c;
                            o9Var.a = k6Var;
                            o9Var.m = l6Var.F;
                            o9Var.b = k6Var.getImageReceiver();
                            o9Var.g = (View) l6Var.getParent();
                            float alphaInternal2 = l6Var.getAlphaInternal() * l6Var.getAlpha();
                            o9Var.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                o9Var.j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, l6Var.getResourcesProvider()));
                            }
                            b(o9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.f6) {
                    org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) childAt;
                    if (f6Var.getDialogId() == j10) {
                        o9Var.a = f6Var;
                        o9Var.m = f6Var.v0;
                        o9Var.b = f6Var.r;
                        o9Var.g = (View) f6Var.getParent();
                        o9Var.k = 1.0f;
                        b(o9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v7) {
                    org.telegram.ui.Cells.v7 v7Var = (org.telegram.ui.Cells.v7) childAt;
                    if (v7Var.getPostInfo().b() == i10) {
                        o9Var.a = v7Var.getImageView();
                        o9Var.m = v7Var.getStoryAvatarParams();
                        o9Var.c = v7Var.getImageView().getImageReceiver();
                        o9Var.g = (View) v7Var.getParent();
                        o9Var.k = 1.0f;
                        b(o9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j10 && a5Var.getStoryItem().messageId == i3) {
                        o9Var.a = a5Var.getAvatarImageView();
                        o9Var.m = a5Var.getStoryAvatarParams();
                        o9Var.b = a5Var.getAvatarImageView().getImageReceiver();
                        o9Var.g = (View) a5Var.getParent();
                        o9Var.k = 1.0f;
                        b(o9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i12++;
                l9Var = null;
            }
        }
        return false;
    }

    @Override // ei.n9
    public final void r(long j10, int i3, o3 o3Var) {
        ArrayList arrayList;
        tj0 tj0Var = this.a;
        if (tj0Var != null && (tj0Var.getParent() instanceof r)) {
            r rVar = (r) tj0Var.getParent();
            if (rVar.k(j10)) {
                rVar.c0.add(o3Var);
                return;
            } else {
                o3Var.run();
                return;
            }
        }
        int i10 = 0;
        if (tj0Var == null || !(tj0Var.getParent() instanceof k5)) {
            if (this.d) {
                z6 P1 = hp.s1(h10.t0).P1();
                ArrayList arrayList2 = P1.h;
                P1.v(arrayList2);
                Collections.sort(arrayList2, P1.J);
                hs.f(P1.a).k(hs.v5, new Object[0]);
            }
            o3Var.run();
            return;
        }
        k5 k5Var = (k5) tj0Var.getParent();
        jy jyVar = k5Var.y;
        g5 g5Var = k5Var.x;
        if (g5Var != null && (arrayList = g5Var.c) != null && jyVar != null) {
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
                        if (tL_storyReactionPublicRepost.story != null && org.telegram.messenger.m5.o(tL_storyReactionPublicRepost.peer_id) == j10 && tL_storyReactionPublicRepost.story.id == i3) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i10++;
            }
            if (i10 >= 0) {
                int L0 = jyVar.L0();
                int N0 = jyVar.N0();
                if (i10 < L0 || i10 > N0) {
                    jyVar.h1(i10, org.telegram.messenger.g0.L(60.0f));
                    tj0Var.post(o3Var);
                    return;
                }
            }
        }
        o3Var.run();
    }

    public i7(sv0 sv0Var) {
        this.c = new int[2];
        this.b = sv0Var;
        this.a = null;
    }
}
