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
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.j01;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class u9 implements fc {
    public final ml0 a;
    public final j01 b;
    public final int[] c;
    public final boolean d;
    public t9 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public u9(ml0 ml0Var, boolean z10) {
        this.c = new int[2];
        this.a = ml0Var;
        this.d = z10;
        this.b = null;
    }

    public static u9 a(ml0 ml0Var) {
        return new u9(ml0Var, false);
    }

    @Override // ai.fc
    public final void Z(long j3, int i10, d5 d5Var) {
        ArrayList arrayList;
        ml0 ml0Var = this.a;
        if (ml0Var != null && (ml0Var.getParent() instanceof b0)) {
            b0 b0Var = (b0) ml0Var.getParent();
            if (b0Var.k(j3)) {
                b0Var.b0.add(d5Var);
                return;
            } else {
                d5Var.run();
                return;
            }
        }
        int i11 = 0;
        if (ml0Var == null || !(ml0Var.getParent() instanceof k7)) {
            if (this.d) {
                l9 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
                ArrayList arrayList2 = storiesController.h;
                storiesController.v(arrayList2);
                Collections.sort(arrayList2, storiesController.J);
                NotificationCenter.getInstance(storiesController.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
            d5Var.run();
            return;
        }
        k7 k7Var = (k7) ml0Var.getParent();
        qz qzVar = k7Var.x;
        e7 e7Var = k7Var.w;
        if (e7Var != null && (arrayList = e7Var.c) != null && qzVar != null) {
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
                int L0 = qzVar.L0();
                int N0 = qzVar.N0();
                if (i11 < L0 || i11 > N0) {
                    qzVar.h1(i11, AndroidUtilities.dp(60.0f));
                    ml0Var.post(d5Var);
                    return;
                }
            }
        }
        d5Var.run();
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
        if (view instanceof org.telegram.ui.Components.ia) {
            gcVar.h = ((org.telegram.ui.Components.ia) view).X2;
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
        ml0 ml0Var = this.a;
        b0 b0Var = (ml0Var == null || !(ml0Var.getParent() instanceof b0)) ? null : (b0) ml0Var.getParent();
        ViewGroup viewGroup = (b0Var == null || b0Var.g()) ? ml0Var : b0Var.r;
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
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                    ImageReceiver imageReceiver = r2Var.Y1;
                    org.telegram.ui.Cells.j2 j2Var = r2Var.u0;
                    long dialogId = r2Var.getDialogId();
                    boolean z10 = this.d;
                    if ((dialogId == j3 && !z10) || (z10 && r2Var.O())) {
                        gcVar.a = childAt;
                        gcVar.m = j2Var;
                        gcVar.b = imageReceiver;
                        gcVar.g = (View) r2Var.getParent();
                        if (z10) {
                            gcVar.l = imageReceiver;
                            boolean z11 = j2Var.w;
                        }
                        gcVar.k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject().getId() == i10) {
                        gcVar.a = childAt;
                        if (i12 == 1 || i12 == 2) {
                            gcVar.c = t1Var.getPhotoImage();
                        } else {
                            gcVar.c = t1Var.F9;
                        }
                        gcVar.g = (View) t1Var.getParent();
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
                } else if ((childAt instanceof org.telegram.ui.Cells.t7) && ml0Var != null) {
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                    MessageObject messageObject = t7Var.getMessageObject();
                    if ((t7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j3)) {
                        tk0 fastScroll = ml0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        gcVar.a = childAt;
                        gcVar.c = t7Var.c;
                        gcVar.e = new q5(t7Var, fastScroll, iArr, 1);
                        gcVar.g = (View) t7Var.getParent();
                        gcVar.k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.bb) {
                    org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) childAt;
                    if (bbVar.getDialogId() == j3) {
                        y5 y5Var = bbVar.a;
                        gcVar.a = y5Var;
                        gcVar.m = bbVar.T;
                        gcVar.b = y5Var.getImageReceiver();
                        gcVar.g = (View) bbVar.getParent();
                        gcVar.k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.o6) {
                    org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) childAt;
                    org.telegram.ui.Components.w9 w9Var = o6Var.h;
                    if (o6Var.x != j3) {
                        continue;
                    } else {
                        boolean z12 = (w9Var == null || w9Var.getImageReceiver() == null || w9Var.getImageReceiver().getImageDrawable() == null) ? false : true;
                        if (o6Var.n == i11 && z12) {
                            gcVar.a = w9Var;
                            gcVar.c = w9Var.getImageReceiver();
                            gcVar.g = (View) o6Var.getParent();
                            float alphaInternal = o6Var.getAlphaInternal() * o6Var.getAlpha();
                            gcVar.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                gcVar.j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.h5, o6Var.getResourcesProvider()));
                            }
                            c(gcVar);
                            return true;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.n6 n6Var = o6Var.c;
                            gcVar.a = n6Var;
                            gcVar.m = o6Var.y;
                            gcVar.b = n6Var.getImageReceiver();
                            gcVar.g = (View) o6Var.getParent();
                            float alphaInternal2 = o6Var.getAlphaInternal() * o6Var.getAlpha();
                            gcVar.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                gcVar.j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.h5, o6Var.getResourcesProvider()));
                            }
                            c(gcVar);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                    org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                    if (i6Var.getDialogId() == j3) {
                        gcVar.a = i6Var;
                        gcVar.m = i6Var.u0;
                        gcVar.b = i6Var.r;
                        gcVar.g = (View) i6Var.getParent();
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
                } else if (childAt instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) childAt;
                    if (b5Var.getStoryItem() != null && b5Var.getStoryItem().dialogId == j3 && b5Var.getStoryItem().messageId == i10) {
                        gcVar.a = b5Var.getAvatarImageView();
                        gcVar.m = b5Var.getStoryAvatarParams();
                        gcVar.b = b5Var.getAvatarImageView().getImageReceiver();
                        gcVar.g = (View) b5Var.getParent();
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

    public u9(j01 j01Var) {
        this.c = new int[2];
        this.b = j01Var;
        this.a = null;
    }
}
