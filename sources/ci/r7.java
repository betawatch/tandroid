package ci;

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
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.sz0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class r7 implements w9 {
    public final im0 a;
    public final sz0 b;
    public final int[] c;
    public final boolean d;
    public q7 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public r7(im0 im0Var, boolean z10) {
        this.c = new int[2];
        this.a = im0Var;
        this.d = z10;
        this.b = null;
    }

    public static r7 a(im0 im0Var) {
        return new r7(im0Var, false);
    }

    @Override // ci.w9
    public final boolean Q0(long j10, int i10, int i11, int i12, x9 x9Var) {
        u9 u9Var = null;
        x9Var.a = null;
        x9Var.b = null;
        x9Var.c = null;
        x9Var.e = null;
        im0 im0Var = this.a;
        r rVar = (im0Var == null || !(im0Var.getParent() instanceof r)) ? null : (r) im0Var.getParent();
        ViewGroup viewGroup = (rVar == null || rVar.g()) ? im0Var : rVar.r;
        ViewGroup viewGroup2 = this.b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof q) {
                    q qVar = (q) childAt;
                    if (qVar.E == j10) {
                        x9Var.a = childAt;
                        x9Var.b = qVar.r;
                        x9Var.m = qVar.O;
                        x9Var.d = qVar.R;
                        r rVar2 = (r) qVar.getParent().getParent();
                        x9Var.g = rVar2;
                        x9Var.i = 0.0f;
                        x9Var.h = 0.0f;
                        x9Var.k = 1.0f;
                        if (qVar.G && rVar2.g()) {
                            x9Var.f = new a1.c(new Path(), 18);
                            return true;
                        }
                        x9Var.f = u9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                    ImageReceiver imageReceiver = r2Var.Y1;
                    org.telegram.ui.Cells.k2 k2Var = r2Var.u0;
                    long dialogId = r2Var.getDialogId();
                    boolean z10 = this.d;
                    if ((dialogId == j10 && !z10) || (z10 && r2Var.O())) {
                        x9Var.a = childAt;
                        x9Var.m = k2Var;
                        x9Var.b = imageReceiver;
                        x9Var.g = (View) r2Var.getParent();
                        if (z10) {
                            x9Var.l = imageReceiver;
                            boolean z11 = k2Var.w;
                        }
                        x9Var.k = 1.0f;
                        c(x9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject().getId() == i10) {
                        x9Var.a = childAt;
                        if (i12 == 1 || i12 == 2) {
                            x9Var.c = u1Var.getPhotoImage();
                        } else {
                            x9Var.c = u1Var.F9;
                        }
                        x9Var.g = (View) u1Var.getParent();
                        x9Var.k = 1.0f;
                        c(x9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.getMessageObject().getId() == i10) {
                        x9Var.a = childAt;
                        if (w0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            x9Var.b = w0Var.getPhotoImage();
                        } else {
                            x9Var.c = w0Var.getPhotoImage();
                        }
                        x9Var.g = (View) w0Var.getParent();
                        x9Var.k = 1.0f;
                        c(x9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.s7) && im0Var != null) {
                    org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                    MessageObject messageObject = s7Var.getMessageObject();
                    if ((s7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        pl0 fastScroll = im0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        x9Var.a = childAt;
                        x9Var.c = s7Var.c;
                        x9Var.e = new ai.u2(s7Var, fastScroll, iArr, 4);
                        x9Var.g = (View) s7Var.getParent();
                        x9Var.k = 1.0f;
                        c(x9Var);
                        return true;
                    }
                } else if (childAt instanceof va) {
                    va vaVar = (va) childAt;
                    if (vaVar.getDialogId() == j10) {
                        k4 k4Var = vaVar.a;
                        x9Var.a = k4Var;
                        x9Var.m = vaVar.T;
                        x9Var.b = k4Var.getImageReceiver();
                        x9Var.g = (View) vaVar.getParent();
                        x9Var.k = 1.0f;
                        c(x9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.n6) {
                    org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                    org.telegram.ui.Components.w9 w9Var = n6Var.h;
                    if (n6Var.y != j10) {
                        continue;
                    } else {
                        boolean z12 = (w9Var == null || w9Var.getImageReceiver() == null || w9Var.getImageReceiver().getImageDrawable() == null) ? false : true;
                        if (n6Var.n == i11 && z12) {
                            x9Var.a = w9Var;
                            x9Var.c = w9Var.getImageReceiver();
                            x9Var.g = (View) n6Var.getParent();
                            float alphaInternal = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            x9Var.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                x9Var.j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, n6Var.getResourcesProvider()));
                            }
                            c(x9Var);
                            return true;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.m6 m6Var = n6Var.c;
                            x9Var.a = m6Var;
                            x9Var.m = n6Var.E;
                            x9Var.b = m6Var.getImageReceiver();
                            x9Var.g = (View) n6Var.getParent();
                            float alphaInternal2 = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            x9Var.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                x9Var.j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, n6Var.getResourcesProvider()));
                            }
                            c(x9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                    if (h6Var.getDialogId() == j10) {
                        x9Var.a = h6Var;
                        x9Var.m = h6Var.u0;
                        x9Var.b = h6Var.r;
                        x9Var.g = (View) h6Var.getParent();
                        x9Var.k = 1.0f;
                        c(x9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b8) {
                    org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) childAt;
                    if (b8Var.getPostInfo().b() == i11) {
                        x9Var.a = b8Var.getImageView();
                        x9Var.m = b8Var.getStoryAvatarParams();
                        x9Var.c = b8Var.getImageView().getImageReceiver();
                        x9Var.g = (View) b8Var.getParent();
                        x9Var.k = 1.0f;
                        c(x9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j10 && a5Var.getStoryItem().messageId == i10) {
                        x9Var.a = a5Var.getAvatarImageView();
                        x9Var.m = a5Var.getStoryAvatarParams();
                        x9Var.b = a5Var.getAvatarImageView().getImageReceiver();
                        x9Var.g = (View) a5Var.getParent();
                        x9Var.k = 1.0f;
                        c(x9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                u9Var = null;
            }
        }
        return false;
    }

    @Override // ci.w9
    public final void X0(long j10, int i10, t3 t3Var) {
        ArrayList arrayList;
        im0 im0Var = this.a;
        if (im0Var != null && (im0Var.getParent() instanceof r)) {
            r rVar = (r) im0Var.getParent();
            if (rVar.k(j10)) {
                rVar.b0.add(t3Var);
                return;
            } else {
                t3Var.run();
                return;
            }
        }
        int i11 = 0;
        if (im0Var == null || !(im0Var.getParent() instanceof u5)) {
            if (this.d) {
                i7 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
                ArrayList arrayList2 = storiesController.h;
                storiesController.v(arrayList2);
                Collections.sort(arrayList2, storiesController.J);
                NotificationCenter.getInstance(storiesController.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
            t3Var.run();
            return;
        }
        u5 u5Var = (u5) im0Var.getParent();
        yz yzVar = u5Var.x;
        p5 p5Var = u5Var.w;
        if (p5Var != null && (arrayList = p5Var.c) != null && yzVar != null) {
            while (true) {
                if (i11 >= arrayList.size()) {
                    i11 = -1;
                    break;
                }
                k5 k5Var = (k5) arrayList.get(i11);
                if (k5Var != null) {
                    TL_stories.StoryReaction storyReaction = k5Var.c;
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
                int L0 = yzVar.L0();
                int N0 = yzVar.N0();
                if (i11 < L0 || i11 > N0) {
                    yzVar.h1(i11, AndroidUtilities.dp(60.0f));
                    im0Var.post(t3Var);
                    return;
                }
            }
        }
        t3Var.run();
    }

    @Override // ci.w9
    public final void b(boolean z10) {
        q7 q7Var = this.e;
        if (q7Var != null) {
            q7Var.b(z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(x9 x9Var) {
        View view = x9Var.g;
        if (view == 0) {
            return;
        }
        if (view instanceof p7) {
            ((p7) view).a(this.c);
            x9Var.h = r1[0];
            x9Var.i = r1[1] - this.s;
            return;
        }
        if (view instanceof org.telegram.ui.Components.ia) {
            x9Var.h = ((org.telegram.ui.Components.ia) view).V2;
            x9Var.i = (view.getMeasuredHeight() - x9Var.g.getPaddingBottom()) - this.s;
        } else {
            x9Var.h = view.getPaddingTop();
            x9Var.i = (x9Var.g.getMeasuredHeight() - x9Var.g.getPaddingBottom()) - this.s;
        }
    }

    public r7(sz0 sz0Var) {
        this.c = new int[2];
        this.b = sz0Var;
        this.a = null;
    }
}
