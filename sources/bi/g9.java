package bi;

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
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.w01;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class g9 implements ob {
    public final mm0 a;
    public final w01 b;
    public final int[] c;
    public final boolean d;
    public f9 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public g9(mm0 mm0Var, boolean z10) {
        this.c = new int[2];
        this.a = mm0Var;
        this.d = z10;
        this.b = null;
    }

    public static g9 a(mm0 mm0Var) {
        return new g9(mm0Var, false);
    }

    @Override // bi.ob
    public final boolean H0(long j10, int i10, int i11, int i12, pb pbVar) {
        mb mbVar = null;
        pbVar.a = null;
        pbVar.b = null;
        pbVar.c = null;
        pbVar.e = null;
        mm0 mm0Var = this.a;
        v vVar = (mm0Var == null || !(mm0Var.getParent() instanceof v)) ? null : (v) mm0Var.getParent();
        ViewGroup viewGroup = (vVar == null || vVar.g()) ? mm0Var : vVar.r;
        ViewGroup viewGroup2 = this.b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof u) {
                    u uVar = (u) childAt;
                    if (uVar.E == j10) {
                        pbVar.a = childAt;
                        pbVar.b = uVar.r;
                        pbVar.m = uVar.O;
                        pbVar.d = uVar.R;
                        v vVar2 = (v) uVar.getParent().getParent();
                        pbVar.g = vVar2;
                        pbVar.i = 0.0f;
                        pbVar.h = 0.0f;
                        pbVar.k = 1.0f;
                        if (uVar.G && vVar2.g()) {
                            pbVar.f = new a1.c(new Path(), 8);
                            return true;
                        }
                        pbVar.f = mbVar;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s2) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                    ImageReceiver imageReceiver = s2Var.Y1;
                    org.telegram.ui.Cells.k2 k2Var = s2Var.u0;
                    long dialogId = s2Var.getDialogId();
                    boolean z10 = this.d;
                    if ((dialogId == j10 && !z10) || (z10 && s2Var.O())) {
                        pbVar.a = childAt;
                        pbVar.m = k2Var;
                        pbVar.b = imageReceiver;
                        pbVar.g = (View) s2Var.getParent();
                        if (z10) {
                            pbVar.l = imageReceiver;
                            boolean z11 = k2Var.w;
                        }
                        pbVar.k = 1.0f;
                        c(pbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject().getId() == i10) {
                        pbVar.a = childAt;
                        if (i12 == 1 || i12 == 2) {
                            pbVar.c = u1Var.getPhotoImage();
                        } else {
                            pbVar.c = u1Var.F9;
                        }
                        pbVar.g = (View) u1Var.getParent();
                        pbVar.k = 1.0f;
                        c(pbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.x0) {
                    org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) childAt;
                    if (x0Var.getMessageObject().getId() == i10) {
                        pbVar.a = childAt;
                        if (x0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            pbVar.b = x0Var.getPhotoImage();
                        } else {
                            pbVar.c = x0Var.getPhotoImage();
                        }
                        pbVar.g = (View) x0Var.getParent();
                        pbVar.k = 1.0f;
                        c(pbVar);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.t7) && mm0Var != null) {
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                    MessageObject messageObject = t7Var.getMessageObject();
                    if ((t7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        tl0 fastScroll = mm0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        pbVar.a = childAt;
                        pbVar.c = t7Var.c;
                        pbVar.e = new androidx.car.app.utils.a(t7Var, fastScroll, iArr, 3);
                        pbVar.g = (View) t7Var.getParent();
                        pbVar.k = 1.0f;
                        c(pbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.xa) {
                    org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) childAt;
                    if (xaVar.getDialogId() == j10) {
                        k5 k5Var = xaVar.a;
                        pbVar.a = k5Var;
                        pbVar.m = xaVar.T;
                        pbVar.b = k5Var.getImageReceiver();
                        pbVar.g = (View) xaVar.getParent();
                        pbVar.k = 1.0f;
                        c(pbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.o6) {
                    org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) childAt;
                    org.telegram.ui.Components.z9 z9Var = o6Var.h;
                    if (o6Var.y != j10) {
                        continue;
                    } else {
                        boolean z12 = (z9Var == null || z9Var.getImageReceiver() == null || z9Var.getImageReceiver().getImageDrawable() == null) ? false : true;
                        if (o6Var.n == i11 && z12) {
                            pbVar.a = z9Var;
                            pbVar.c = z9Var.getImageReceiver();
                            pbVar.g = (View) o6Var.getParent();
                            float alphaInternal = o6Var.getAlphaInternal() * o6Var.getAlpha();
                            pbVar.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                pbVar.j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, o6Var.getResourcesProvider()));
                            }
                            c(pbVar);
                            return true;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.n6 n6Var = o6Var.c;
                            pbVar.a = n6Var;
                            pbVar.m = o6Var.E;
                            pbVar.b = n6Var.getImageReceiver();
                            pbVar.g = (View) o6Var.getParent();
                            float alphaInternal2 = o6Var.getAlphaInternal() * o6Var.getAlpha();
                            pbVar.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                pbVar.j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, o6Var.getResourcesProvider()));
                            }
                            c(pbVar);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                    org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                    if (i6Var.getDialogId() == j10) {
                        pbVar.a = i6Var;
                        pbVar.m = i6Var.u0;
                        pbVar.b = i6Var.r;
                        pbVar.g = (View) i6Var.getParent();
                        pbVar.k = 1.0f;
                        c(pbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.c8) {
                    org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) childAt;
                    if (c8Var.getPostInfo().b() == i11) {
                        pbVar.a = c8Var.getImageView();
                        pbVar.m = c8Var.getStoryAvatarParams();
                        pbVar.c = c8Var.getImageView().getImageReceiver();
                        pbVar.g = (View) c8Var.getParent();
                        pbVar.k = 1.0f;
                        c(pbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) childAt;
                    if (b5Var.getStoryItem() != null && b5Var.getStoryItem().dialogId == j10 && b5Var.getStoryItem().messageId == i10) {
                        pbVar.a = b5Var.getAvatarImageView();
                        pbVar.m = b5Var.getStoryAvatarParams();
                        pbVar.b = b5Var.getAvatarImageView().getImageReceiver();
                        pbVar.g = (View) b5Var.getParent();
                        pbVar.k = 1.0f;
                        c(pbVar);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                mbVar = null;
            }
        }
        return false;
    }

    @Override // bi.ob
    public final void b(boolean z10) {
        f9 f9Var = this.e;
        if (f9Var != null) {
            f9Var.b(z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(pb pbVar) {
        View view = pbVar.g;
        if (view == 0) {
            return;
        }
        if (view instanceof e9) {
            ((e9) view).a(this.c);
            pbVar.h = r1[0];
            pbVar.i = r1[1] - this.s;
            return;
        }
        if (view instanceof org.telegram.ui.Components.ka) {
            pbVar.h = ((org.telegram.ui.Components.ka) view).V2;
            pbVar.i = (view.getMeasuredHeight() - pbVar.g.getPaddingBottom()) - this.s;
        } else {
            pbVar.h = view.getPaddingTop();
            pbVar.i = (pbVar.g.getMeasuredHeight() - pbVar.g.getPaddingBottom()) - this.s;
        }
    }

    @Override // bi.ob
    public final void p(long j10, int i10, r4 r4Var) {
        ArrayList arrayList;
        mm0 mm0Var = this.a;
        if (mm0Var != null && (mm0Var.getParent() instanceof v)) {
            v vVar = (v) mm0Var.getParent();
            if (vVar.k(j10)) {
                vVar.b0.add(r4Var);
                return;
            } else {
                r4Var.run();
                return;
            }
        }
        int i11 = 0;
        if (mm0Var == null || !(mm0Var.getParent() instanceof w6)) {
            if (this.d) {
                x8 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
                ArrayList arrayList2 = storiesController.h;
                storiesController.v(arrayList2);
                Collections.sort(arrayList2, storiesController.J);
                NotificationCenter.getInstance(storiesController.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
            r4Var.run();
            return;
        }
        w6 w6Var = (w6) mm0Var.getParent();
        b00 b00Var = w6Var.x;
        q6 q6Var = w6Var.w;
        if (q6Var != null && (arrayList = q6Var.c) != null && b00Var != null) {
            while (true) {
                if (i11 >= arrayList.size()) {
                    i11 = -1;
                    break;
                }
                l6 l6Var = (l6) arrayList.get(i11);
                if (l6Var != null) {
                    TL_stories.StoryReaction storyReaction = l6Var.c;
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
                int L0 = b00Var.L0();
                int N0 = b00Var.N0();
                if (i11 < L0 || i11 > N0) {
                    b00Var.h1(i11, AndroidUtilities.dp(60.0f));
                    mm0Var.post(r4Var);
                    return;
                }
            }
        }
        r4Var.run();
    }

    public g9(w01 w01Var) {
        this.c = new int[2];
        this.b = w01Var;
        this.a = null;
    }
}
