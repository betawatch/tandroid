package nh;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.e01;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class c7 implements e9 {
    public final rl0 a;
    public final e01 b;
    public final int[] c;
    public final boolean d;
    public b7 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public c7(rl0 rl0Var, boolean z4) {
        this.c = new int[2];
        this.a = rl0Var;
        this.d = z4;
        this.b = null;
    }

    public static c7 a(rl0 rl0Var) {
        return new c7(rl0Var, false);
    }

    @Override // nh.e9
    public final boolean V0(long j10, int i10, int i11, int i12, f9 f9Var) {
        c9 c9Var = null;
        f9Var.a = null;
        f9Var.b = null;
        f9Var.c = null;
        f9Var.e = null;
        rl0 rl0Var = this.a;
        q qVar = (rl0Var == null || !(rl0Var.getParent() instanceof q)) ? null : (q) rl0Var.getParent();
        ViewGroup viewGroup = (qVar == null || qVar.g()) ? rl0Var : qVar.r;
        ViewGroup viewGroup2 = this.b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof p) {
                    p pVar = (p) childAt;
                    if (pVar.B == j10) {
                        f9Var.a = childAt;
                        f9Var.b = pVar.r;
                        f9Var.m = pVar.L;
                        f9Var.d = pVar.O;
                        q qVar2 = (q) pVar.getParent().getParent();
                        f9Var.g = qVar2;
                        f9Var.i = 0.0f;
                        f9Var.h = 0.0f;
                        f9Var.k = 1.0f;
                        if (pVar.D && qVar2.g()) {
                            f9Var.f = new lh.m5(new Path(), 10);
                            return true;
                        }
                        f9Var.f = c9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.q2) {
                    org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) childAt;
                    ImageReceiver imageReceiver = q2Var.V1;
                    org.telegram.ui.Cells.i2 i2Var = q2Var.r0;
                    long dialogId = q2Var.getDialogId();
                    boolean z4 = this.d;
                    if ((dialogId == j10 && !z4) || (z4 && q2Var.O())) {
                        f9Var.a = childAt;
                        f9Var.m = i2Var;
                        f9Var.b = imageReceiver;
                        f9Var.g = (View) q2Var.getParent();
                        if (z4) {
                            f9Var.l = imageReceiver;
                            boolean z10 = i2Var.w;
                        }
                        f9Var.k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject().getId() == i10) {
                        f9Var.a = childAt;
                        if (i12 == 1 || i12 == 2) {
                            f9Var.c = s1Var.getPhotoImage();
                        } else {
                            f9Var.c = s1Var.C9;
                        }
                        f9Var.g = (View) s1Var.getParent();
                        f9Var.k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (v0Var.getMessageObject().getId() == i10) {
                        f9Var.a = childAt;
                        if (v0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            f9Var.b = v0Var.getPhotoImage();
                        } else {
                            f9Var.c = v0Var.getPhotoImage();
                        }
                        f9Var.g = (View) v0Var.getParent();
                        f9Var.k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.q7) && rl0Var != null) {
                    org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) childAt;
                    MessageObject messageObject = q7Var.getMessageObject();
                    if ((q7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        al0 fastScroll = rl0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        f9Var.a = childAt;
                        f9Var.c = q7Var.c;
                        f9Var.e = new androidx.car.app.utils.a(q7Var, fastScroll, iArr, 10);
                        f9Var.g = (View) q7Var.getParent();
                        f9Var.k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof ua) {
                    ua uaVar = (ua) childAt;
                    if (uaVar.getDialogId() == j10) {
                        y3 y3Var = uaVar.a;
                        f9Var.a = y3Var;
                        f9Var.m = uaVar.Q;
                        f9Var.b = y3Var.getImageReceiver();
                        f9Var.g = (View) uaVar.getParent();
                        f9Var.k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.m6) {
                    org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                    org.telegram.ui.Components.p9 p9Var = m6Var.h;
                    if (m6Var.x != j10) {
                        continue;
                    } else {
                        boolean z11 = (p9Var == null || p9Var.getImageReceiver() == null || p9Var.getImageReceiver().getImageDrawable() == null) ? false : true;
                        if (m6Var.n == i11 && z11) {
                            f9Var.a = p9Var;
                            f9Var.c = p9Var.getImageReceiver();
                            f9Var.g = (View) m6Var.getParent();
                            float alphaInternal = m6Var.getAlphaInternal() * m6Var.getAlpha();
                            f9Var.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                f9Var.j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, m6Var.getResourcesProvider()));
                            }
                            c(f9Var);
                            return true;
                        }
                        if (!z11) {
                            org.telegram.ui.Cells.l6 l6Var = m6Var.c;
                            f9Var.a = l6Var;
                            f9Var.m = m6Var.y;
                            f9Var.b = l6Var.getImageReceiver();
                            f9Var.g = (View) m6Var.getParent();
                            float alphaInternal2 = m6Var.getAlphaInternal() * m6Var.getAlpha();
                            f9Var.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                f9Var.j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, m6Var.getResourcesProvider()));
                            }
                            c(f9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g6) {
                    org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) childAt;
                    if (g6Var.getDialogId() == j10) {
                        f9Var.a = g6Var;
                        f9Var.m = g6Var.r0;
                        f9Var.b = g6Var.r;
                        f9Var.g = (View) g6Var.getParent();
                        f9Var.k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.z7) {
                    org.telegram.ui.Cells.z7 z7Var = (org.telegram.ui.Cells.z7) childAt;
                    if (z7Var.getPostInfo().b() == i11) {
                        f9Var.a = z7Var.getImageView();
                        f9Var.m = z7Var.getStoryAvatarParams();
                        f9Var.c = z7Var.getImageView().getImageReceiver();
                        f9Var.g = (View) z7Var.getParent();
                        f9Var.k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j10 && a5Var.getStoryItem().messageId == i10) {
                        f9Var.a = a5Var.getAvatarImageView();
                        f9Var.m = a5Var.getStoryAvatarParams();
                        f9Var.b = a5Var.getAvatarImageView().getImageReceiver();
                        f9Var.g = (View) a5Var.getParent();
                        f9Var.k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                c9Var = null;
            }
        }
        return false;
    }

    @Override // nh.e9
    public final void b(boolean z4) {
        b7 b7Var = this.e;
        if (b7Var != null) {
            b7Var.b(z4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(f9 f9Var) {
        View view = f9Var.g;
        if (view == 0) {
            return;
        }
        if (view instanceof a7) {
            ((a7) view).a(this.c);
            f9Var.h = r1[0];
            f9Var.i = r1[1] - this.s;
            return;
        }
        if (view instanceof aa) {
            f9Var.h = ((aa) view).U2;
            f9Var.i = (view.getMeasuredHeight() - f9Var.g.getPaddingBottom()) - this.s;
        } else {
            f9Var.h = view.getPaddingTop();
            f9Var.i = (f9Var.g.getMeasuredHeight() - f9Var.g.getPaddingBottom()) - this.s;
        }
    }

    @Override // nh.e9
    public final void z0(long j10, int i10, k3 k3Var) {
        ArrayList arrayList;
        rl0 rl0Var = this.a;
        if (rl0Var != null && (rl0Var.getParent() instanceof q)) {
            q qVar = (q) rl0Var.getParent();
            if (qVar.k(j10)) {
                qVar.V.add(k3Var);
                return;
            } else {
                k3Var.run();
                return;
            }
        }
        int i11 = 0;
        if (rl0Var == null || !(rl0Var.getParent() instanceof d5)) {
            if (this.d) {
                t6 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
                ArrayList arrayList2 = storiesController.h;
                storiesController.v(arrayList2);
                Collections.sort(arrayList2, storiesController.J);
                NotificationCenter.getInstance(storiesController.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
            k3Var.run();
            return;
        }
        d5 d5Var = (d5) rl0Var.getParent();
        pz pzVar = d5Var.x;
        z4 z4Var = d5Var.w;
        if (z4Var != null && (arrayList = z4Var.c) != null && pzVar != null) {
            while (true) {
                if (i11 >= arrayList.size()) {
                    i11 = -1;
                    break;
                }
                u4 u4Var = (u4) arrayList.get(i11);
                if (u4Var != null) {
                    TL_stories.StoryReaction storyReaction = u4Var.c;
                    if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                        if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j10 && tL_storyReactionPublicRepost.story.id == i10) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i11++;
            }
            if (i11 >= 0) {
                int L0 = pzVar.L0();
                int N0 = pzVar.N0();
                if (i11 < L0 || i11 > N0) {
                    pzVar.h1(i11, AndroidUtilities.dp(60.0f));
                    rl0Var.post(k3Var);
                    return;
                }
            }
        }
        k3Var.run();
    }

    public c7(e01 e01Var) {
        this.c = new int[2];
        this.b = e01Var;
        this.a = null;
    }
}
