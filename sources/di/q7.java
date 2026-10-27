package di;

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
import org.telegram.ui.Cells.ab;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.c01;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class q7 implements u9 {
    public final nm0 a;
    public final c01 b;
    public final int[] c;
    public final boolean d;
    public p7 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public q7(nm0 nm0Var, boolean z10) {
        this.c = new int[2];
        this.a = nm0Var;
        this.d = z10;
        this.b = null;
    }

    public static q7 a(nm0 nm0Var) {
        return new q7(nm0Var, false);
    }

    @Override // di.u9
    public final void G0(long j10, int i10, s3 s3Var) {
        ArrayList arrayList;
        nm0 nm0Var = this.a;
        if (nm0Var != null && (nm0Var.getParent() instanceof r)) {
            r rVar = (r) nm0Var.getParent();
            if (rVar.k(j10)) {
                rVar.b0.add(s3Var);
                return;
            } else {
                s3Var.run();
                return;
            }
        }
        int i11 = 0;
        if (nm0Var == null || !(nm0Var.getParent() instanceof t5)) {
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
        t5 t5Var = (t5) nm0Var.getParent();
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
                    nm0Var.post(s3Var);
                    return;
                }
            }
        }
        s3Var.run();
    }

    @Override // di.u9
    public final void b(boolean z10) {
        p7 p7Var = this.e;
        if (p7Var != null) {
            p7Var.b(z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(v9 v9Var) {
        View view = v9Var.g;
        if (view == 0) {
            return;
        }
        if (view instanceof o7) {
            ((o7) view).a(this.c);
            v9Var.h = r1[0];
            v9Var.i = r1[1] - this.s;
            return;
        }
        if (view instanceof ka) {
            v9Var.h = ((ka) view).f3;
            v9Var.i = (view.getMeasuredHeight() - v9Var.g.getPaddingBottom()) - this.s;
        } else {
            v9Var.h = view.getPaddingTop();
            v9Var.i = (v9Var.g.getMeasuredHeight() - v9Var.g.getPaddingBottom()) - this.s;
        }
    }

    @Override // di.u9
    public final boolean i1(long j10, int i10, int i11, int i12, v9 v9Var) {
        s9 s9Var = null;
        v9Var.a = null;
        v9Var.b = null;
        v9Var.c = null;
        v9Var.e = null;
        nm0 nm0Var = this.a;
        r rVar = (nm0Var == null || !(nm0Var.getParent() instanceof r)) ? null : (r) nm0Var.getParent();
        ViewGroup viewGroup = (rVar == null || rVar.g()) ? nm0Var : rVar.r;
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
                        v9Var.a = childAt;
                        v9Var.b = qVar.r;
                        v9Var.m = qVar.O;
                        v9Var.d = qVar.R;
                        r rVar2 = (r) qVar.getParent().getParent();
                        v9Var.g = rVar2;
                        v9Var.i = 0.0f;
                        v9Var.h = 0.0f;
                        v9Var.k = 1.0f;
                        if (qVar.G && rVar2.g()) {
                            v9Var.f = new a1.c(new Path(), 26);
                            return true;
                        }
                        v9Var.f = s9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.p2) {
                    org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt;
                    ImageReceiver imageReceiver = p2Var.Y1;
                    org.telegram.ui.Cells.i2 i2Var = p2Var.u0;
                    long dialogId = p2Var.getDialogId();
                    boolean z10 = this.d;
                    if ((dialogId == j10 && !z10) || (z10 && p2Var.N())) {
                        v9Var.a = childAt;
                        v9Var.m = i2Var;
                        v9Var.b = imageReceiver;
                        v9Var.g = (View) p2Var.getParent();
                        if (z10) {
                            v9Var.l = imageReceiver;
                            boolean z11 = i2Var.w;
                        }
                        v9Var.k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject().getId() == i10) {
                        v9Var.a = childAt;
                        if (i12 == 1 || i12 == 2) {
                            v9Var.c = s1Var.getPhotoImage();
                        } else {
                            v9Var.c = s1Var.F9;
                        }
                        v9Var.g = (View) s1Var.getParent();
                        v9Var.k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (v0Var.getMessageObject().getId() == i10) {
                        v9Var.a = childAt;
                        if (v0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            v9Var.b = v0Var.getPhotoImage();
                        } else {
                            v9Var.c = v0Var.getPhotoImage();
                        }
                        v9Var.g = (View) v0Var.getParent();
                        v9Var.k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.w7) && nm0Var != null) {
                    org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) childAt;
                    MessageObject messageObject = w7Var.getMessageObject();
                    if ((w7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        tl0 fastScroll = nm0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        v9Var.a = childAt;
                        v9Var.c = w7Var.c;
                        v9Var.e = new androidx.car.app.utils.a(w7Var, fastScroll, iArr, 5);
                        v9Var.g = (View) w7Var.getParent();
                        v9Var.k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if (childAt instanceof ab) {
                    ab abVar = (ab) childAt;
                    if (abVar.getDialogId() == j10) {
                        k4 k4Var = abVar.a;
                        v9Var.a = k4Var;
                        v9Var.m = abVar.T;
                        v9Var.b = k4Var.getImageReceiver();
                        v9Var.g = (View) abVar.getParent();
                        v9Var.k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s6) {
                    org.telegram.ui.Cells.s6 s6Var = (org.telegram.ui.Cells.s6) childAt;
                    org.telegram.ui.Components.y9 y9Var = s6Var.h;
                    if (s6Var.y != j10) {
                        continue;
                    } else {
                        boolean z12 = (y9Var == null || y9Var.getImageReceiver() == null || y9Var.getImageReceiver().getImageDrawable() == null) ? false : true;
                        if (s6Var.n == i11 && z12) {
                            v9Var.a = y9Var;
                            v9Var.c = y9Var.getImageReceiver();
                            v9Var.g = (View) s6Var.getParent();
                            float alphaInternal = s6Var.getAlphaInternal() * s6Var.getAlpha();
                            v9Var.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                v9Var.j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h5, s6Var.getResourcesProvider()));
                            }
                            c(v9Var);
                            return true;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.r6 r6Var = s6Var.c;
                            v9Var.a = r6Var;
                            v9Var.m = s6Var.E;
                            v9Var.b = r6Var.getImageReceiver();
                            v9Var.g = (View) s6Var.getParent();
                            float alphaInternal2 = s6Var.getAlphaInternal() * s6Var.getAlpha();
                            v9Var.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                v9Var.j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h5, s6Var.getResourcesProvider()));
                            }
                            c(v9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.m6) {
                    org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                    if (m6Var.getDialogId() == j10) {
                        v9Var.a = m6Var;
                        v9Var.m = m6Var.u0;
                        v9Var.b = m6Var.r;
                        v9Var.g = (View) m6Var.getParent();
                        v9Var.k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.f8) {
                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) childAt;
                    if (f8Var.getPostInfo().b() == i11) {
                        v9Var.a = f8Var.getImageView();
                        v9Var.m = f8Var.getStoryAvatarParams();
                        v9Var.c = f8Var.getImageView().getImageReceiver();
                        v9Var.g = (View) f8Var.getParent();
                        v9Var.k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.f5) {
                    org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) childAt;
                    if (f5Var.getStoryItem() != null && f5Var.getStoryItem().dialogId == j10 && f5Var.getStoryItem().messageId == i10) {
                        v9Var.a = f5Var.getAvatarImageView();
                        v9Var.m = f5Var.getStoryAvatarParams();
                        v9Var.b = f5Var.getAvatarImageView().getImageReceiver();
                        v9Var.g = (View) f5Var.getParent();
                        v9Var.k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                s9Var = null;
            }
        }
        return false;
    }

    public q7(c01 c01Var) {
        this.c = new int[2];
        this.b = c01Var;
        this.a = null;
    }
}
