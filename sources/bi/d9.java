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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.r01;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class d9 implements lb {
    public final ll0 a;
    public final r01 b;
    public final int[] c;
    public final boolean d;
    public c9 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public d9(ll0 ll0Var, boolean z10) {
        this.c = new int[2];
        this.a = ll0Var;
        this.d = z10;
        this.b = null;
    }

    public static d9 a(ll0 ll0Var) {
        return new d9(ll0Var, false);
    }

    @Override // bi.lb
    public final boolean H0(long j3, int i10, int i11, int i12, mb mbVar) {
        jb jbVar = null;
        mbVar.a = null;
        mbVar.b = null;
        mbVar.c = null;
        mbVar.e = null;
        ll0 ll0Var = this.a;
        v vVar = (ll0Var == null || !(ll0Var.getParent() instanceof v)) ? null : (v) ll0Var.getParent();
        ViewGroup viewGroup = (vVar == null || vVar.g()) ? ll0Var : vVar.r;
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
                    if (uVar.E == j3) {
                        mbVar.a = childAt;
                        mbVar.b = uVar.r;
                        mbVar.m = uVar.O;
                        mbVar.d = uVar.R;
                        v vVar2 = (v) uVar.getParent().getParent();
                        mbVar.g = vVar2;
                        mbVar.i = 0.0f;
                        mbVar.h = 0.0f;
                        mbVar.k = 1.0f;
                        if (uVar.G && vVar2.g()) {
                            mbVar.f = new a1.c(new Path(), 7);
                            return true;
                        }
                        mbVar.f = jbVar;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                    ImageReceiver imageReceiver = r2Var.Y1;
                    org.telegram.ui.Cells.j2 j2Var = r2Var.u0;
                    long dialogId = r2Var.getDialogId();
                    boolean z10 = this.d;
                    if ((dialogId == j3 && !z10) || (z10 && r2Var.O())) {
                        mbVar.a = childAt;
                        mbVar.m = j2Var;
                        mbVar.b = imageReceiver;
                        mbVar.g = (View) r2Var.getParent();
                        if (z10) {
                            mbVar.l = imageReceiver;
                            boolean z11 = j2Var.w;
                        }
                        mbVar.k = 1.0f;
                        b(mbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject().getId() == i10) {
                        mbVar.a = childAt;
                        if (i12 == 1 || i12 == 2) {
                            mbVar.c = t1Var.getPhotoImage();
                        } else {
                            mbVar.c = t1Var.F9;
                        }
                        mbVar.g = (View) t1Var.getParent();
                        mbVar.k = 1.0f;
                        b(mbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.getMessageObject().getId() == i10) {
                        mbVar.a = childAt;
                        if (w0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            mbVar.b = w0Var.getPhotoImage();
                        } else {
                            mbVar.c = w0Var.getPhotoImage();
                        }
                        mbVar.g = (View) w0Var.getParent();
                        mbVar.k = 1.0f;
                        b(mbVar);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.t7) && ll0Var != null) {
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                    MessageObject messageObject = t7Var.getMessageObject();
                    if ((t7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j3)) {
                        sk0 fastScroll = ll0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        mbVar.a = childAt;
                        mbVar.c = t7Var.c;
                        mbVar.e = new androidx.car.app.utils.a(t7Var, fastScroll, iArr, 3);
                        mbVar.g = (View) t7Var.getParent();
                        mbVar.k = 1.0f;
                        b(mbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.za) {
                    org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) childAt;
                    if (zaVar.getDialogId() == j3) {
                        i5 i5Var = zaVar.a;
                        mbVar.a = i5Var;
                        mbVar.m = zaVar.T;
                        mbVar.b = i5Var.getImageReceiver();
                        mbVar.g = (View) zaVar.getParent();
                        mbVar.k = 1.0f;
                        b(mbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.n6) {
                    org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) childAt;
                    org.telegram.ui.Components.x9 x9Var = n6Var.h;
                    if (n6Var.x != j3) {
                        continue;
                    } else {
                        boolean z12 = (x9Var == null || x9Var.getImageReceiver() == null || x9Var.getImageReceiver().getImageDrawable() == null) ? false : true;
                        if (n6Var.n == i11 && z12) {
                            mbVar.a = x9Var;
                            mbVar.c = x9Var.getImageReceiver();
                            mbVar.g = (View) n6Var.getParent();
                            float alphaInternal = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            mbVar.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                mbVar.j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, n6Var.getResourcesProvider()));
                            }
                            b(mbVar);
                            return true;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.m6 m6Var = n6Var.c;
                            mbVar.a = m6Var;
                            mbVar.m = n6Var.y;
                            mbVar.b = m6Var.getImageReceiver();
                            mbVar.g = (View) n6Var.getParent();
                            float alphaInternal2 = n6Var.getAlphaInternal() * n6Var.getAlpha();
                            mbVar.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                mbVar.j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, n6Var.getResourcesProvider()));
                            }
                            b(mbVar);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h6) {
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                    if (h6Var.getDialogId() == j3) {
                        mbVar.a = h6Var;
                        mbVar.m = h6Var.u0;
                        mbVar.b = h6Var.r;
                        mbVar.g = (View) h6Var.getParent();
                        mbVar.k = 1.0f;
                        b(mbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.c8) {
                    org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) childAt;
                    if (c8Var.getPostInfo().b() == i11) {
                        mbVar.a = c8Var.getImageView();
                        mbVar.m = c8Var.getStoryAvatarParams();
                        mbVar.c = c8Var.getImageView().getImageReceiver();
                        mbVar.g = (View) c8Var.getParent();
                        mbVar.k = 1.0f;
                        b(mbVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.a5) {
                    org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                    if (a5Var.getStoryItem() != null && a5Var.getStoryItem().dialogId == j3 && a5Var.getStoryItem().messageId == i10) {
                        mbVar.a = a5Var.getAvatarImageView();
                        mbVar.m = a5Var.getStoryAvatarParams();
                        mbVar.b = a5Var.getAvatarImageView().getImageReceiver();
                        mbVar.g = (View) a5Var.getParent();
                        mbVar.k = 1.0f;
                        b(mbVar);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                jbVar = null;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(mb mbVar) {
        View view = mbVar.g;
        if (view == 0) {
            return;
        }
        if (view instanceof b9) {
            ((b9) view).a(this.c);
            mbVar.h = r1[0];
            mbVar.i = r1[1] - this.s;
            return;
        }
        if (view instanceof org.telegram.ui.Components.ia) {
            mbVar.h = ((org.telegram.ui.Components.ia) view).X2;
            mbVar.i = (view.getMeasuredHeight() - mbVar.g.getPaddingBottom()) - this.s;
        } else {
            mbVar.h = view.getPaddingTop();
            mbVar.i = (mbVar.g.getMeasuredHeight() - mbVar.g.getPaddingBottom()) - this.s;
        }
    }

    @Override // bi.lb
    public final void e(boolean z10) {
        c9 c9Var = this.e;
        if (c9Var != null) {
            c9Var.e(z10);
        }
    }

    @Override // bi.lb
    public final void p(long j3, int i10, p4 p4Var) {
        ArrayList arrayList;
        ll0 ll0Var = this.a;
        if (ll0Var != null && (ll0Var.getParent() instanceof v)) {
            v vVar = (v) ll0Var.getParent();
            if (vVar.k(j3)) {
                vVar.b0.add(p4Var);
                return;
            } else {
                p4Var.run();
                return;
            }
        }
        int i11 = 0;
        if (ll0Var == null || !(ll0Var.getParent() instanceof s6)) {
            if (this.d) {
                u8 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
                ArrayList arrayList2 = storiesController.h;
                storiesController.v(arrayList2);
                Collections.sort(arrayList2, storiesController.J);
                NotificationCenter.getInstance(storiesController.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
            p4Var.run();
            return;
        }
        s6 s6Var = (s6) ll0Var.getParent();
        pz pzVar = s6Var.x;
        n6 n6Var = s6Var.w;
        if (n6Var != null && (arrayList = n6Var.c) != null && pzVar != null) {
            while (true) {
                if (i11 >= arrayList.size()) {
                    i11 = -1;
                    break;
                }
                i6 i6Var = (i6) arrayList.get(i11);
                if (i6Var != null) {
                    TL_stories.StoryReaction storyReaction = i6Var.c;
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
                    ll0Var.post(p4Var);
                    return;
                }
            }
        }
        p4Var.run();
    }

    public d9(r01 r01Var) {
        this.c = new int[2];
        this.b = r01Var;
        this.a = null;
    }
}
