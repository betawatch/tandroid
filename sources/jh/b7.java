package jh;

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
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.mz0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class b7 implements e9 {
    public final zk0 a;
    public final mz0 b;
    public final int[] c;
    public final boolean d;
    public a7 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public b7(zk0 zk0Var, boolean z10) {
        this.c = new int[2];
        this.a = zk0Var;
        this.d = z10;
        this.b = null;
    }

    public static b7 a(zk0 zk0Var) {
        return new b7(zk0Var, false);
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
        if (view instanceof y9) {
            f9Var.h = ((y9) view).T2;
            f9Var.i = (view.getMeasuredHeight() - f9Var.g.getPaddingBottom()) - this.s;
        } else {
            f9Var.h = view.getPaddingTop();
            f9Var.i = (f9Var.g.getMeasuredHeight() - f9Var.g.getPaddingBottom()) - this.s;
        }
    }

    @Override // jh.e9
    public final void e(boolean z10) {
        a7 a7Var = this.e;
        if (a7Var != null) {
            a7Var.e(z10);
        }
    }

    @Override // jh.e9
    public final void g1(long j10, int i10, l3 l3Var) {
        ArrayList arrayList;
        zk0 zk0Var = this.a;
        if (zk0Var != null && (zk0Var.getParent() instanceof p)) {
            p pVar = (p) zk0Var.getParent();
            if (pVar.k(j10)) {
                pVar.U.add(l3Var);
                return;
            } else {
                l3Var.run();
                return;
            }
        }
        int i11 = 0;
        if (zk0Var == null || !(zk0Var.getParent() instanceof c5)) {
            if (this.d) {
                s6 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
                ArrayList arrayList2 = storiesController.h;
                storiesController.v(arrayList2);
                Collections.sort(arrayList2, storiesController.J);
                NotificationCenter.getInstance(storiesController.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
            l3Var.run();
            return;
        }
        c5 c5Var = (c5) zk0Var.getParent();
        dz dzVar = c5Var.x;
        y4 y4Var = c5Var.w;
        if (y4Var != null && (arrayList = y4Var.c) != null && dzVar != null) {
            while (true) {
                if (i11 >= arrayList.size()) {
                    i11 = -1;
                    break;
                }
                t4 t4Var = (t4) arrayList.get(i11);
                if (t4Var != null) {
                    TL_stories.StoryReaction storyReaction = t4Var.c;
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
                int L0 = dzVar.L0();
                int N0 = dzVar.N0();
                if (i11 < L0 || i11 > N0) {
                    dzVar.h1(i11, AndroidUtilities.dp(60.0f));
                    zk0Var.post(l3Var);
                    return;
                }
            }
        }
        l3Var.run();
    }

    @Override // jh.e9
    public final boolean y0(long j10, int i10, int i11, int i12, f9 f9Var) {
        c9 c9Var = null;
        f9Var.a = null;
        f9Var.b = null;
        f9Var.c = null;
        f9Var.e = null;
        zk0 zk0Var = this.a;
        p pVar = (zk0Var == null || !(zk0Var.getParent() instanceof p)) ? null : (p) zk0Var.getParent();
        ViewGroup viewGroup = (pVar == null || pVar.g()) ? zk0Var : pVar.r;
        ViewGroup viewGroup2 = this.b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof o) {
                    o oVar = (o) childAt;
                    if (oVar.A == j10) {
                        f9Var.a = childAt;
                        f9Var.b = oVar.r;
                        f9Var.m = oVar.K;
                        f9Var.d = oVar.N;
                        p pVar2 = (p) oVar.getParent().getParent();
                        f9Var.g = pVar2;
                        f9Var.i = 0.0f;
                        f9Var.h = 0.0f;
                        f9Var.k = 1.0f;
                        if (oVar.C && pVar2.g()) {
                            f9Var.f = new h3.x(new Path(), 24);
                            return true;
                        }
                        f9Var.f = c9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.p2) {
                    org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt;
                    ImageReceiver imageReceiver = p2Var.U1;
                    org.telegram.ui.Cells.i2 i2Var = p2Var.q0;
                    long dialogId = p2Var.getDialogId();
                    boolean z10 = this.d;
                    if ((dialogId == j10 && !z10) || (z10 && p2Var.O())) {
                        f9Var.a = childAt;
                        f9Var.m = i2Var;
                        f9Var.b = imageReceiver;
                        f9Var.g = (View) p2Var.getParent();
                        if (z10) {
                            f9Var.l = imageReceiver;
                            boolean z11 = i2Var.w;
                        }
                        f9Var.k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject().getId() == i10) {
                        f9Var.a = childAt;
                        if (i12 == 1 || i12 == 2) {
                            f9Var.c = s1Var.getPhotoImage();
                        } else {
                            f9Var.c = s1Var.B9;
                        }
                        f9Var.g = (View) s1Var.getParent();
                        f9Var.k = 1.0f;
                        b(f9Var);
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
                        b(f9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.o7) && zk0Var != null) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                    MessageObject messageObject = o7Var.getMessageObject();
                    if ((o7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        ik0 fastScroll = zk0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        f9Var.a = childAt;
                        f9Var.c = o7Var.c;
                        f9Var.e = new ag.l0(o7Var, fastScroll, iArr, 10);
                        f9Var.g = (View) o7Var.getParent();
                        f9Var.k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof sa) {
                    sa saVar = (sa) childAt;
                    if (saVar.getDialogId() == j10) {
                        z3 z3Var = saVar.a;
                        f9Var.a = z3Var;
                        f9Var.m = saVar.P;
                        f9Var.b = z3Var.getImageReceiver();
                        f9Var.g = (View) saVar.getParent();
                        f9Var.k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.k6) {
                    org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) childAt;
                    org.telegram.ui.Components.n9 n9Var = k6Var.h;
                    if (k6Var.x != j10) {
                        continue;
                    } else {
                        boolean z12 = (n9Var == null || n9Var.getImageReceiver() == null || n9Var.getImageReceiver().getImageDrawable() == null) ? false : true;
                        if (k6Var.n == i11 && z12) {
                            f9Var.a = n9Var;
                            f9Var.c = n9Var.getImageReceiver();
                            f9Var.g = (View) k6Var.getParent();
                            float alphaInternal = k6Var.getAlphaInternal() * k6Var.getAlpha();
                            f9Var.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                f9Var.j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, k6Var.getResourcesProvider()));
                            }
                            b(f9Var);
                            return true;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.j6 j6Var = k6Var.c;
                            f9Var.a = j6Var;
                            f9Var.m = k6Var.y;
                            f9Var.b = j6Var.getImageReceiver();
                            f9Var.g = (View) k6Var.getParent();
                            float alphaInternal2 = k6Var.getAlphaInternal() * k6Var.getAlpha();
                            f9Var.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                f9Var.j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, k6Var.getResourcesProvider()));
                            }
                            b(f9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.e6) {
                    org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) childAt;
                    if (e6Var.getDialogId() == j10) {
                        f9Var.a = e6Var;
                        f9Var.m = e6Var.q0;
                        f9Var.b = e6Var.r;
                        f9Var.g = (View) e6Var.getParent();
                        f9Var.k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.x7) {
                    org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) childAt;
                    if (x7Var.getPostInfo().b() == i11) {
                        f9Var.a = x7Var.getImageView();
                        f9Var.m = x7Var.getStoryAvatarParams();
                        f9Var.c = x7Var.getImageView().getImageReceiver();
                        f9Var.g = (View) x7Var.getParent();
                        f9Var.k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.y4) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) childAt;
                    if (y4Var.getStoryItem() != null && y4Var.getStoryItem().dialogId == j10 && y4Var.getStoryItem().messageId == i10) {
                        f9Var.a = y4Var.getAvatarImageView();
                        f9Var.m = y4Var.getStoryAvatarParams();
                        f9Var.b = y4Var.getAvatarImageView().getImageReceiver();
                        f9Var.g = (View) y4Var.getParent();
                        f9Var.k = 1.0f;
                        b(f9Var);
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

    public b7(mz0 mz0Var) {
        this.c = new int[2];
        this.b = mz0Var;
        this.a = null;
    }
}
