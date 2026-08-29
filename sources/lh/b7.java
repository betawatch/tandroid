package lh;

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
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.t9;
import org.telegram.ui.mz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class b7 implements e9 {
    public final jl0 a;
    public final mz0 b;
    public final int[] c;
    public final boolean d;
    public a7 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public b7(jl0 jl0Var, boolean z10) {
        this.c = new int[2];
        this.a = jl0Var;
        this.d = z10;
        this.b = null;
    }

    public static b7 a(jl0 jl0Var) {
        return new b7(jl0Var, false);
    }

    @Override // lh.e9
    public final boolean K0(long j10, int i10, int i11, int i12, f9 f9Var) {
        c9 c9Var = null;
        f9Var.a = null;
        f9Var.b = null;
        f9Var.c = null;
        f9Var.e = null;
        jl0 jl0Var = this.a;
        p pVar = (jl0Var == null || !(jl0Var.getParent() instanceof p)) ? null : (p) jl0Var.getParent();
        ViewGroup viewGroup = (pVar == null || pVar.g()) ? jl0Var : pVar.r;
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
                            f9Var.f = new l4.s0(new Path(), 6);
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
                } else if ((childAt instanceof org.telegram.ui.Cells.p7) && jl0Var != null) {
                    org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                    MessageObject messageObject = p7Var.getMessageObject();
                    if ((p7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        sk0 fastScroll = jl0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        f9Var.a = childAt;
                        f9Var.c = p7Var.c;
                        f9Var.e = new androidx.car.app.utils.a(p7Var, fastScroll, iArr, 10);
                        f9Var.g = (View) p7Var.getParent();
                        f9Var.k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof sa) {
                    sa saVar = (sa) childAt;
                    if (saVar.getDialogId() == j10) {
                        y3 y3Var = saVar.a;
                        f9Var.a = y3Var;
                        f9Var.m = saVar.P;
                        f9Var.b = y3Var.getImageReceiver();
                        f9Var.g = (View) saVar.getParent();
                        f9Var.k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.l6) {
                    org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) childAt;
                    t9 t9Var = l6Var.h;
                    if (l6Var.x != j10) {
                        continue;
                    } else {
                        boolean z12 = (t9Var == null || t9Var.getImageReceiver() == null || t9Var.getImageReceiver().getImageDrawable() == null) ? false : true;
                        if (l6Var.n == i11 && z12) {
                            f9Var.a = t9Var;
                            f9Var.c = t9Var.getImageReceiver();
                            f9Var.g = (View) l6Var.getParent();
                            float alphaInternal = l6Var.getAlphaInternal() * l6Var.getAlpha();
                            f9Var.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                f9Var.j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, l6Var.getResourcesProvider()));
                            }
                            b(f9Var);
                            return true;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.k6 k6Var = l6Var.c;
                            f9Var.a = k6Var;
                            f9Var.m = l6Var.y;
                            f9Var.b = k6Var.getImageReceiver();
                            f9Var.g = (View) l6Var.getParent();
                            float alphaInternal2 = l6Var.getAlphaInternal() * l6Var.getAlpha();
                            f9Var.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                f9Var.j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, l6Var.getResourcesProvider()));
                            }
                            b(f9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.f6) {
                    org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) childAt;
                    if (f6Var.getDialogId() == j10) {
                        f9Var.a = f6Var;
                        f9Var.m = f6Var.q0;
                        f9Var.b = f6Var.r;
                        f9Var.g = (View) f6Var.getParent();
                        f9Var.k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.y7) {
                    org.telegram.ui.Cells.y7 y7Var = (org.telegram.ui.Cells.y7) childAt;
                    if (y7Var.getPostInfo().b() == i11) {
                        f9Var.a = y7Var.getImageView();
                        f9Var.m = y7Var.getStoryAvatarParams();
                        f9Var.c = y7Var.getImageView().getImageReceiver();
                        f9Var.g = (View) y7Var.getParent();
                        f9Var.k = 1.0f;
                        b(f9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.z4) {
                    org.telegram.ui.Cells.z4 z4Var = (org.telegram.ui.Cells.z4) childAt;
                    if (z4Var.getStoryItem() != null && z4Var.getStoryItem().dialogId == j10 && z4Var.getStoryItem().messageId == i10) {
                        f9Var.a = z4Var.getAvatarImageView();
                        f9Var.m = z4Var.getStoryAvatarParams();
                        f9Var.b = z4Var.getAvatarImageView().getImageReceiver();
                        f9Var.g = (View) z4Var.getParent();
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
        if (view instanceof fa) {
            f9Var.h = ((fa) view).T2;
            f9Var.i = (view.getMeasuredHeight() - f9Var.g.getPaddingBottom()) - this.s;
        } else {
            f9Var.h = view.getPaddingTop();
            f9Var.i = (f9Var.g.getMeasuredHeight() - f9Var.g.getPaddingBottom()) - this.s;
        }
    }

    @Override // lh.e9
    public final void d(boolean z10) {
        a7 a7Var = this.e;
        if (a7Var != null) {
            a7Var.d(z10);
        }
    }

    @Override // lh.e9
    public final void l1(long j10, int i10, j3 j3Var) {
        ArrayList arrayList;
        jl0 jl0Var = this.a;
        if (jl0Var != null && (jl0Var.getParent() instanceof p)) {
            p pVar = (p) jl0Var.getParent();
            if (pVar.k(j10)) {
                pVar.U.add(j3Var);
                return;
            } else {
                j3Var.run();
                return;
            }
        }
        int i11 = 0;
        if (jl0Var == null || !(jl0Var.getParent() instanceof c5)) {
            if (this.d) {
                s6 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
                ArrayList arrayList2 = storiesController.h;
                storiesController.v(arrayList2);
                Collections.sort(arrayList2, storiesController.J);
                NotificationCenter.getInstance(storiesController.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
            j3Var.run();
            return;
        }
        c5 c5Var = (c5) jl0Var.getParent();
        kz kzVar = c5Var.x;
        y4 y4Var = c5Var.w;
        if (y4Var != null && (arrayList = y4Var.c) != null && kzVar != null) {
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
                int L0 = kzVar.L0();
                int N0 = kzVar.N0();
                if (i11 < L0 || i11 > N0) {
                    kzVar.h1(i11, AndroidUtilities.dp(60.0f));
                    jl0Var.post(j3Var);
                    return;
                }
            }
        }
        j3Var.run();
    }

    public b7(mz0 mz0Var) {
        this.c = new int[2];
        this.b = mz0Var;
        this.a = null;
    }
}
