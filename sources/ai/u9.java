package ai;

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
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.q01;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class u9 implements fc {
    public final vl0 a;
    public final q01 b;
    public final int[] c;
    public final boolean d;
    public t9 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public u9(vl0 vl0Var, boolean z10) {
        this.c = new int[2];
        this.a = vl0Var;
        this.d = z10;
        this.b = null;
    }

    public static u9 a(vl0 vl0Var) {
        return new u9(vl0Var, false);
    }

    @Override // ai.fc
    public final void Z(long j3, int i10, e5 e5Var) {
        ArrayList arrayList;
        vl0 vl0Var = this.a;
        if (vl0Var != null && (vl0Var.getParent() instanceof b0)) {
            b0 b0Var = (b0) vl0Var.getParent();
            if (b0Var.k(j3)) {
                b0Var.b0.add(e5Var);
                return;
            } else {
                e5Var.run();
                return;
            }
        }
        int i11 = 0;
        if (vl0Var == null || !(vl0Var.getParent() instanceof j7)) {
            if (this.d) {
                l9 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
                ArrayList arrayList2 = storiesController.h;
                storiesController.v(arrayList2);
                Collections.sort(arrayList2, storiesController.J);
                NotificationCenter.getInstance(storiesController.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
            e5Var.run();
            return;
        }
        j7 j7Var = (j7) vl0Var.getParent();
        pz pzVar = j7Var.x;
        e7 e7Var = j7Var.w;
        if (e7Var != null && (arrayList = e7Var.c) != null && pzVar != null) {
            while (true) {
                if (i11 >= arrayList.size()) {
                    i11 = -1;
                    break;
                }
                z6 z6Var = (z6) arrayList.get(i11);
                if (z6Var != null) {
                    TL_stories.StoryReaction storyReaction = z6Var.c;
                    if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                        if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.id == i10) {
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
                    vl0Var.post(e5Var);
                    return;
                }
            }
        }
        e5Var.run();
    }

    @Override // ai.fc
    public final void b(boolean z10) {
        t9 t9Var = this.e;
        if (t9Var != null) {
            t9Var.b(z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(gc gcVar) {
        View view = gcVar.g;
        if (view == 0) {
            return;
        }
        if (view instanceof s9) {
            ((s9) view).a(this.c);
            gcVar.h = r1[0];
            gcVar.i = r1[1] - this.s;
            return;
        }
        if (view instanceof org.telegram.ui.Components.ha) {
            gcVar.h = ((org.telegram.ui.Components.ha) view).X2;
            gcVar.i = (view.getMeasuredHeight() - gcVar.g.getPaddingBottom()) - this.s;
        } else {
            gcVar.h = view.getPaddingTop();
            gcVar.i = (gcVar.g.getMeasuredHeight() - gcVar.g.getPaddingBottom()) - this.s;
        }
    }

    @Override // ai.fc
    public final boolean f1(long j3, int i10, int i11, int i12, gc gcVar) {
        dc dcVar = null;
        gcVar.a = null;
        gcVar.b = null;
        gcVar.c = null;
        gcVar.e = null;
        vl0 vl0Var = this.a;
        b0 b0Var = (vl0Var == null || !(vl0Var.getParent() instanceof b0)) ? null : (b0) vl0Var.getParent();
        ViewGroup viewGroup = (b0Var == null || b0Var.g()) ? vl0Var : b0Var.r;
        ViewGroup viewGroup2 = this.b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof a0) {
                    a0 a0Var = (a0) childAt;
                    if (a0Var.E == j3) {
                        gcVar.a = childAt;
                        gcVar.b = a0Var.r;
                        gcVar.m = a0Var.O;
                        gcVar.d = a0Var.R;
                        b0 b0Var2 = (b0) a0Var.getParent().getParent();
                        gcVar.g = b0Var2;
                        gcVar.i = 0.0f;
                        gcVar.h = 0.0f;
                        gcVar.k = 1.0f;
                        if (a0Var.G && b0Var2.g()) {
                            gcVar.f = new a1.c(new Path(), 7);
                            return true;
                        }
                        gcVar.f = dcVar;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s2) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                    ImageReceiver imageReceiver = s2Var.Y1;
                    org.telegram.ui.Cells.k2 k2Var = s2Var.u0;
                    long dialogId = s2Var.getDialogId();
                    boolean z10 = this.d;
                    if ((dialogId == j3 && !z10) || (z10 && s2Var.O())) {
                        gcVar.a = childAt;
                        gcVar.m = k2Var;
                        gcVar.b = imageReceiver;
                        gcVar.g = (View) s2Var.getParent();
                        if (z10) {
                            gcVar.l = imageReceiver;
                            boolean z11 = k2Var.w;
                        }
                        gcVar.k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject().getId() == i10) {
                        gcVar.a = childAt;
                        if (i12 == 1 || i12 == 2) {
                            gcVar.c = u1Var.getPhotoImage();
                        } else {
                            gcVar.c = u1Var.F9;
                        }
                        gcVar.g = (View) u1Var.getParent();
                        gcVar.k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.getMessageObject().getId() == i10) {
                        gcVar.a = childAt;
                        if (w0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            gcVar.b = w0Var.getPhotoImage();
                        } else {
                            gcVar.c = w0Var.getPhotoImage();
                        }
                        gcVar.g = (View) w0Var.getParent();
                        gcVar.k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.u7) && vl0Var != null) {
                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                    MessageObject messageObject = u7Var.getMessageObject();
                    if ((u7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j3)) {
                        cl0 fastScroll = vl0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        gcVar.a = childAt;
                        gcVar.c = u7Var.c;
                        gcVar.e = new r5(u7Var, fastScroll, iArr, 1);
                        gcVar.g = (View) u7Var.getParent();
                        gcVar.k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.ab) {
                    org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) childAt;
                    if (abVar.getDialogId() == j3) {
                        z5 z5Var = abVar.a;
                        gcVar.a = z5Var;
                        gcVar.m = abVar.T;
                        gcVar.b = z5Var.getImageReceiver();
                        gcVar.g = (View) abVar.getParent();
                        gcVar.k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.p6) {
                    org.telegram.ui.Cells.p6 p6Var = (org.telegram.ui.Cells.p6) childAt;
                    org.telegram.ui.Components.v9 v9Var = p6Var.h;
                    if (p6Var.x != j3) {
                        continue;
                    } else {
                        boolean z12 = (v9Var == null || v9Var.getImageReceiver() == null || v9Var.getImageReceiver().getImageDrawable() == null) ? false : true;
                        if (p6Var.n == i11 && z12) {
                            gcVar.a = v9Var;
                            gcVar.c = v9Var.getImageReceiver();
                            gcVar.g = (View) p6Var.getParent();
                            float alphaInternal = p6Var.getAlphaInternal() * p6Var.getAlpha();
                            gcVar.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                gcVar.j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, p6Var.getResourcesProvider()));
                            }
                            c(gcVar);
                            return true;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.o6 o6Var = p6Var.c;
                            gcVar.a = o6Var;
                            gcVar.m = p6Var.y;
                            gcVar.b = o6Var.getImageReceiver();
                            gcVar.g = (View) p6Var.getParent();
                            float alphaInternal2 = p6Var.getAlphaInternal() * p6Var.getAlpha();
                            gcVar.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                gcVar.j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, p6Var.getResourcesProvider()));
                            }
                            c(gcVar);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.j6) {
                    org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) childAt;
                    if (j6Var.getDialogId() == j3) {
                        gcVar.a = j6Var;
                        gcVar.m = j6Var.u0;
                        gcVar.b = j6Var.r;
                        gcVar.g = (View) j6Var.getParent();
                        gcVar.k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.d8) {
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) childAt;
                    if (d8Var.getPostInfo().b() == i11) {
                        gcVar.a = d8Var.getImageView();
                        gcVar.m = d8Var.getStoryAvatarParams();
                        gcVar.c = d8Var.getImageView().getImageReceiver();
                        gcVar.g = (View) d8Var.getParent();
                        gcVar.k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.c5) {
                    org.telegram.ui.Cells.c5 c5Var = (org.telegram.ui.Cells.c5) childAt;
                    if (c5Var.getStoryItem() != null && c5Var.getStoryItem().dialogId == j3 && c5Var.getStoryItem().messageId == i10) {
                        gcVar.a = c5Var.getAvatarImageView();
                        gcVar.m = c5Var.getStoryAvatarParams();
                        gcVar.b = c5Var.getAvatarImageView().getImageReceiver();
                        gcVar.g = (View) c5Var.getParent();
                        gcVar.k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                dcVar = null;
            }
        }
        return false;
    }

    public u9(q01 q01Var) {
        this.c = new int[2];
        this.b = q01Var;
        this.a = null;
    }
}
