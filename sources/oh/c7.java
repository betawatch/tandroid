package oh;

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
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.zz0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class c7 implements e9 {
    public final tl0 a;
    public final zz0 b;
    public final int[] c;
    public final boolean d;
    public b7 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public c7(tl0 tl0Var, boolean z4) {
        this.c = new int[2];
        this.a = tl0Var;
        this.d = z4;
        this.b = null;
    }

    public static c7 a(tl0 tl0Var) {
        return new c7(tl0Var, false);
    }

    @Override // oh.e9
    public final void b(boolean z4) {
        b7 b7Var = this.e;
        if (b7Var != null) {
            b7Var.b(z4);
        }
    }

    @Override // oh.e9
    public final void b0(long j10, int i10, l3 l3Var) {
        ArrayList arrayList;
        tl0 tl0Var = this.a;
        if (tl0Var != null && (tl0Var.getParent() instanceof p)) {
            p pVar = (p) tl0Var.getParent();
            if (pVar.k(j10)) {
                pVar.V.add(l3Var);
                return;
            } else {
                l3Var.run();
                return;
            }
        }
        int i11 = 0;
        if (tl0Var == null || !(tl0Var.getParent() instanceof e5)) {
            if (this.d) {
                t6 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
                ArrayList arrayList2 = storiesController.h;
                storiesController.v(arrayList2);
                Collections.sort(arrayList2, storiesController.J);
                NotificationCenter.getInstance(storiesController.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
            l3Var.run();
            return;
        }
        e5 e5Var = (e5) tl0Var.getParent();
        rz rzVar = e5Var.x;
        a5 a5Var = e5Var.w;
        if (a5Var != null && (arrayList = a5Var.c) != null && rzVar != null) {
            while (true) {
                if (i11 >= arrayList.size()) {
                    i11 = -1;
                    break;
                }
                v4 v4Var = (v4) arrayList.get(i11);
                if (v4Var != null) {
                    TL_stories.StoryReaction storyReaction = v4Var.c;
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
                int L0 = rzVar.L0();
                int N0 = rzVar.N0();
                if (i11 < L0 || i11 > N0) {
                    rzVar.h1(i11, AndroidUtilities.dp(60.0f));
                    tl0Var.post(l3Var);
                    return;
                }
            }
        }
        l3Var.run();
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

    @Override // oh.e9
    public final boolean k1(long j10, int i10, int i11, int i12, f9 f9Var) {
        c9 c9Var = null;
        f9Var.a = null;
        f9Var.b = null;
        f9Var.c = null;
        f9Var.e = null;
        tl0 tl0Var = this.a;
        p pVar = (tl0Var == null || !(tl0Var.getParent() instanceof p)) ? null : (p) tl0Var.getParent();
        ViewGroup viewGroup = (pVar == null || pVar.g()) ? tl0Var : pVar.r;
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
                    if (oVar.B == j10) {
                        f9Var.a = childAt;
                        f9Var.b = oVar.r;
                        f9Var.m = oVar.L;
                        f9Var.d = oVar.O;
                        p pVar2 = (p) oVar.getParent().getParent();
                        f9Var.g = pVar2;
                        f9Var.i = 0.0f;
                        f9Var.h = 0.0f;
                        f9Var.k = 1.0f;
                        if (oVar.D && pVar2.g()) {
                            f9Var.f = new mh.m5(new Path(), 11);
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
                } else if ((childAt instanceof org.telegram.ui.Cells.r7) && tl0Var != null) {
                    org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) childAt;
                    MessageObject messageObject = r7Var.getMessageObject();
                    if ((r7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        cl0 fastScroll = tl0Var.getFastScroll();
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
                        a4 a4Var = vaVar.a;
                        f9Var.a = a4Var;
                        f9Var.m = vaVar.Q;
                        f9Var.b = a4Var.getImageReceiver();
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
                                paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, n6Var.getResourcesProvider()));
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
                                paint2.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, n6Var.getResourcesProvider()));
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

    public c7(zz0 zz0Var) {
        this.c = new int[2];
        this.b = zz0Var;
        this.a = null;
    }
}
