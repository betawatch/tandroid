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
import org.telegram.ui.uz0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class q7 implements v9 {
    public final im0 a;
    public final uz0 b;
    public final int[] c;
    public final boolean d;
    public p7 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public q7(im0 im0Var, boolean z10) {
        this.c = new int[2];
        this.a = im0Var;
        this.d = z10;
        this.b = null;
    }

    public static q7 a(im0 im0Var) {
        return new q7(im0Var, false);
    }

    @Override // ci.v9
    public final boolean Q0(long j10, int i10, int i11, int i12, w9 w9Var) {
        t9 t9Var = null;
        w9Var.a = null;
        w9Var.b = null;
        w9Var.c = null;
        w9Var.e = null;
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
                        w9Var.a = childAt;
                        w9Var.b = qVar.r;
                        w9Var.m = qVar.O;
                        w9Var.d = qVar.R;
                        r rVar2 = (r) qVar.getParent().getParent();
                        w9Var.g = rVar2;
                        w9Var.i = 0.0f;
                        w9Var.h = 0.0f;
                        w9Var.k = 1.0f;
                        if (qVar.G && rVar2.g()) {
                            w9Var.f = new a1.c(new Path(), 18);
                            return true;
                        }
                        w9Var.f = t9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                    ImageReceiver imageReceiver = r2Var.Y1;
                    org.telegram.ui.Cells.k2 k2Var = r2Var.u0;
                    long dialogId = r2Var.getDialogId();
                    boolean z10 = this.d;
                    if ((dialogId == j10 && !z10) || (z10 && r2Var.O())) {
                        w9Var.a = childAt;
                        w9Var.m = k2Var;
                        w9Var.b = imageReceiver;
                        w9Var.g = (View) r2Var.getParent();
                        if (z10) {
                            w9Var.l = imageReceiver;
                            boolean z11 = k2Var.w;
                        }
                        w9Var.k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject().getId() == i10) {
                        w9Var.a = childAt;
                        if (i12 == 1 || i12 == 2) {
                            w9Var.c = u1Var.getPhotoImage();
                        } else {
                            w9Var.c = u1Var.F9;
                        }
                        w9Var.g = (View) u1Var.getParent();
                        w9Var.k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.getMessageObject().getId() == i10) {
                        w9Var.a = childAt;
                        if (w0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            w9Var.b = w0Var.getPhotoImage();
                        } else {
                            w9Var.c = w0Var.getPhotoImage();
                        }
                        w9Var.g = (View) w0Var.getParent();
                        w9Var.k = 1.0f;
                        c(w9Var);
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
                        w9Var.a = childAt;
                        w9Var.c = s7Var.c;
                        w9Var.e = new ai.r2(s7Var, fastScroll, iArr, 4);
                        w9Var.g = (View) s7Var.getParent();
                        w9Var.k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if (childAt instanceof va) {
                    va vaVar = (va) childAt;
                    if (vaVar.getDialogId() == j10) {
                        j4 j4Var = vaVar.a;
                        w9Var.a = j4Var;
                        w9Var.m = vaVar.T;
                        w9Var.b = j4Var.getImageReceiver();
                        w9Var.g = (View) vaVar.getParent();
                        w9Var.k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.n6) {
                    org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                    org.telegram.ui.Components.w9 w9Var2 = n6Var.h;
                    if (n6Var.y != j10) {
                        continue;
                    } else {
                        boolean z12 = (w9Var2 == null || w9Var2.getImageReceiver() == null || w9Var2.getImageReceiver().getImageDrawable() == null) ? false : true;
                        if (n6Var.n == i11 && z12) {
                            w9Var.a = w9Var2;
                            w9Var.c = w9Var2.getImageReceiver();
                            w9Var.g = (View) n6Var.getParent();
                            float alphaInternal = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            w9Var.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                w9Var.j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, n6Var.getResourcesProvider()));
                            }
                            c(w9Var);
                            return true;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.m6 m6Var = n6Var.c;
                            w9Var.a = m6Var;
                            w9Var.m = n6Var.E;
                            w9Var.b = m6Var.getImageReceiver();
                            w9Var.g = (View) n6Var.getParent();
                            float alphaInternal2 = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            w9Var.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                w9Var.j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, n6Var.getResourcesProvider()));
                            }
                            c(w9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                    if (h6Var.getDialogId() == j10) {
                        w9Var.a = h6Var;
                        w9Var.m = h6Var.u0;
                        w9Var.b = h6Var.r;
                        w9Var.g = (View) h6Var.getParent();
                        w9Var.k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b8) {
                    org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) childAt;
                    if (b8Var.getPostInfo().b() == i11) {
                        w9Var.a = b8Var.getImageView();
                        w9Var.m = b8Var.getStoryAvatarParams();
                        w9Var.c = b8Var.getImageView().getImageReceiver();
                        w9Var.g = (View) b8Var.getParent();
                        w9Var.k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j10 && a5Var.getStoryItem().messageId == i10) {
                        w9Var.a = a5Var.getAvatarImageView();
                        w9Var.m = a5Var.getStoryAvatarParams();
                        w9Var.b = a5Var.getAvatarImageView().getImageReceiver();
                        w9Var.g = (View) a5Var.getParent();
                        w9Var.k = 1.0f;
                        c(w9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                t9Var = null;
            }
        }
        return false;
    }

    @Override // ci.v9
    public final void X0(long j10, int i10, s3 s3Var) {
        ArrayList arrayList;
        im0 im0Var = this.a;
        if (im0Var != null && (im0Var.getParent() instanceof r)) {
            r rVar = (r) im0Var.getParent();
            if (rVar.k(j10)) {
                rVar.b0.add(s3Var);
                return;
            } else {
                s3Var.run();
                return;
            }
        }
        int i11 = 0;
        if (im0Var == null || !(im0Var.getParent() instanceof t5)) {
            if (this.d) {
                h7 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
                ArrayList arrayList2 = storiesController.h;
                storiesController.v(arrayList2);
                Collections.sort(arrayList2, storiesController.J);
                NotificationCenter.getInstance(storiesController.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
            s3Var.run();
            return;
        }
        t5 t5Var = (t5) im0Var.getParent();
        yz yzVar = t5Var.x;
        o5 o5Var = t5Var.w;
        if (o5Var != null && (arrayList = o5Var.c) != null && yzVar != null) {
            while (true) {
                if (i11 >= arrayList.size()) {
                    i11 = -1;
                    break;
                }
                j5 j5Var = (j5) arrayList.get(i11);
                if (j5Var != null) {
                    TL_stories.StoryReaction storyReaction = j5Var.c;
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
                    im0Var.post(s3Var);
                    return;
                }
            }
        }
        s3Var.run();
    }

    @Override // ci.v9
    public final void b(boolean z10) {
        p7 p7Var = this.e;
        if (p7Var != null) {
            p7Var.b(z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(w9 w9Var) {
        View view = w9Var.g;
        if (view == 0) {
            return;
        }
        if (view instanceof o7) {
            ((o7) view).a(this.c);
            w9Var.h = r1[0];
            w9Var.i = r1[1] - this.s;
            return;
        }
        if (view instanceof org.telegram.ui.Components.ia) {
            w9Var.h = ((org.telegram.ui.Components.ia) view).V2;
            w9Var.i = (view.getMeasuredHeight() - w9Var.g.getPaddingBottom()) - this.s;
        } else {
            w9Var.h = view.getPaddingTop();
            w9Var.i = (w9Var.g.getMeasuredHeight() - w9Var.g.getPaddingBottom()) - this.s;
        }
    }

    public q7(uz0 uz0Var) {
        this.c = new int[2];
        this.b = uz0Var;
        this.a = null;
    }
}
