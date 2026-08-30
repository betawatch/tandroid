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
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.xz0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class c7 implements e9 {
    public final sl0 a;
    public final xz0 b;
    public final int[] c;
    public final boolean d;
    public b7 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public c7(sl0 sl0Var, boolean z4) {
        this.c = new int[2];
        this.a = sl0Var;
        this.d = z4;
        this.b = null;
    }

    public static c7 a(sl0 sl0Var) {
        return new c7(sl0Var, false);
    }

    @Override // nh.e9
    public final void D0(long j10, int i10, k3 k3Var) {
        ArrayList arrayList;
        sl0 sl0Var = this.a;
        if (sl0Var != null && (sl0Var.getParent() instanceof q)) {
            q qVar = (q) sl0Var.getParent();
            if (qVar.k(j10)) {
                qVar.V.add(k3Var);
                return;
            } else {
                k3Var.run();
                return;
            }
        }
        int i11 = 0;
        if (sl0Var == null || !(sl0Var.getParent() instanceof d5)) {
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
        d5 d5Var = (d5) sl0Var.getParent();
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
                    sl0Var.post(k3Var);
                    return;
                }
            }
        }
        k3Var.run();
    }

    @Override // nh.e9
    public final boolean X0(long j10, int i10, int i11, int i12, f9 f9Var) {
        c9 c9Var = null;
        f9Var.a = null;
        f9Var.b = null;
        f9Var.c = null;
        f9Var.e = null;
        sl0 sl0Var = this.a;
        q qVar = (sl0Var == null || !(sl0Var.getParent() instanceof q)) ? null : (q) sl0Var.getParent();
        ViewGroup viewGroup = (qVar == null || qVar.g()) ? sl0Var : qVar.r;
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
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                    ImageReceiver imageReceiver = r2Var.V1;
                    org.telegram.ui.Cells.j2 j2Var = r2Var.r0;
                    long dialogId = r2Var.getDialogId();
                    boolean z4 = this.d;
                    if ((dialogId == j10 && !z4) || (z4 && r2Var.O())) {
                        f9Var.a = childAt;
                        f9Var.m = j2Var;
                        f9Var.b = imageReceiver;
                        f9Var.g = (View) r2Var.getParent();
                        if (z4) {
                            f9Var.l = imageReceiver;
                            boolean z10 = j2Var.w;
                        }
                        f9Var.k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject().getId() == i10) {
                        f9Var.a = childAt;
                        if (i12 == 1 || i12 == 2) {
                            f9Var.c = t1Var.getPhotoImage();
                        } else {
                            f9Var.c = t1Var.C9;
                        }
                        f9Var.g = (View) t1Var.getParent();
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
                } else if ((childAt instanceof org.telegram.ui.Cells.r7) && sl0Var != null) {
                    org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) childAt;
                    MessageObject messageObject = r7Var.getMessageObject();
                    if ((r7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        bl0 fastScroll = sl0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        f9Var.a = childAt;
                        f9Var.c = r7Var.c;
                        f9Var.e = new androidx.car.app.utils.a(r7Var, fastScroll, iArr, 10);
                        f9Var.g = (View) r7Var.getParent();
                        f9Var.k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof va) {
                    va vaVar = (va) childAt;
                    if (vaVar.getDialogId() == j10) {
                        y3 y3Var = vaVar.a;
                        f9Var.a = y3Var;
                        f9Var.m = vaVar.Q;
                        f9Var.b = y3Var.getImageReceiver();
                        f9Var.g = (View) vaVar.getParent();
                        f9Var.k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.n6) {
                    org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                    org.telegram.ui.Components.p9 p9Var = n6Var.h;
                    if (n6Var.x != j10) {
                        continue;
                    } else {
                        boolean z11 = (p9Var == null || p9Var.getImageReceiver() == null || p9Var.getImageReceiver().getImageDrawable() == null) ? false : true;
                        if (n6Var.n == i11 && z11) {
                            f9Var.a = p9Var;
                            f9Var.c = p9Var.getImageReceiver();
                            f9Var.g = (View) n6Var.getParent();
                            float alphaInternal = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            f9Var.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                f9Var.j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, n6Var.getResourcesProvider()));
                            }
                            c(f9Var);
                            return true;
                        }
                        if (!z11) {
                            org.telegram.ui.Cells.m6 m6Var = n6Var.c;
                            f9Var.a = m6Var;
                            f9Var.m = n6Var.y;
                            f9Var.b = m6Var.getImageReceiver();
                            f9Var.g = (View) n6Var.getParent();
                            float alphaInternal2 = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            f9Var.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                f9Var.j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, n6Var.getResourcesProvider()));
                            }
                            c(f9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                    if (h6Var.getDialogId() == j10) {
                        f9Var.a = h6Var;
                        f9Var.m = h6Var.r0;
                        f9Var.b = h6Var.r;
                        f9Var.g = (View) h6Var.getParent();
                        f9Var.k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a8) {
                    org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) childAt;
                    if (a8Var.getPostInfo().b() == i11) {
                        f9Var.a = a8Var.getImageView();
                        f9Var.m = a8Var.getStoryAvatarParams();
                        f9Var.c = a8Var.getImageView().getImageReceiver();
                        f9Var.g = (View) a8Var.getParent();
                        f9Var.k = 1.0f;
                        c(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) childAt;
                    if (b5Var.getStoryItem() != null && b5Var.getStoryItem().dialogId == j10 && b5Var.getStoryItem().messageId == i10) {
                        f9Var.a = b5Var.getAvatarImageView();
                        f9Var.m = b5Var.getStoryAvatarParams();
                        f9Var.b = b5Var.getAvatarImageView().getImageReceiver();
                        f9Var.g = (View) b5Var.getParent();
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

    public c7(xz0 xz0Var) {
        this.c = new int[2];
        this.b = xz0Var;
        this.a = null;
    }
}
