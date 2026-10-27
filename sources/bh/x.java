package bh;

import a8.ee;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ds;
import org.telegram.ui.dk;
import org.telegram.ui.rj;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class x extends FrameLayout {
    public final wn a;
    public w b;
    public List c;
    public boolean d;
    public MessageObject e;
    public final int f;
    public final int h;
    public float n;
    public float r;
    public float s;
    public long v;
    public boolean w;
    public boolean x;
    public final int[] y;

    public x(wn wnVar, Context context) {
        super(context);
        this.c = Collections.EMPTY_LIST;
        this.f = 22;
        this.h = 24;
        this.y = new int[2];
        setVisibility(8);
        this.a = wnVar;
        setClipToPadding(false);
        setClipChildren(false);
        wnVar.x0.j(new ai.b(this, 2));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new v(this, 1));
            return;
        }
        this.x = false;
        int i10 = 2;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new ai.g0(this, i10));
        duration.addListener(new b(this, i10));
        duration.start();
    }

    public final MessageObject b() {
        MessageObject.GroupedMessages K8;
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (!this.d || this.c.isEmpty()) {
            return null;
        }
        int i10 = 0;
        MessageObject messageObject = (MessageObject) this.c.get(0);
        if (messageObject.getGroupId() != 0 && (K8 = this.a.K8(messageObject.getGroupId())) != null && (arrayList = K8.messages) != null) {
            int size = arrayList.size();
            while (i10 < size) {
                MessageObject messageObject2 = arrayList.get(i10);
                i10++;
                MessageObject messageObject3 = messageObject2;
                TLRPC.Message message = messageObject3.messageOwner;
                if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                    return messageObject3;
                }
            }
        }
        return messageObject;
    }

    public final void c(boolean z10) {
        int height;
        boolean z11;
        boolean z12;
        if (!this.d || this.e == null || this.b == null) {
            return;
        }
        long min = Math.min(16L, System.currentTimeMillis() - this.v);
        this.v = System.currentTimeMillis();
        float f7 = this.n;
        float f10 = this.r;
        if (f7 != f10) {
            float f11 = min / 220.0f;
            if (f10 > f7) {
                this.n = Math.min(f7 + f11, f10);
            } else if (f10 < f7) {
                this.n = Math.max(f7 - f11, f10);
            }
            AndroidUtilities.runOnUIThread(new v(this, 0));
        }
        wn wnVar = this.a;
        rj rjVar = wnVar.x0;
        int[] iArr = this.y;
        rjVar.getLocationInWindow(iArr);
        boolean z13 = true;
        float f12 = iArr[1];
        getLocationInWindow(iArr);
        float f13 = (f12 - iArr[1]) - wnVar.da;
        boolean z14 = false;
        for (int i10 = 0; i10 < rjVar.getChildCount(); i10++) {
            View childAt = rjVar.getChildAt(i10);
            if (childAt instanceof s1) {
                s1 s1Var = (s1) childAt;
                MessageObject messageObject = s1Var.getMessageObject();
                if (messageObject.getId() == this.e.getId()) {
                    boolean isOutOwner = messageObject.isOutOwner();
                    w wVar = this.b;
                    if (wVar != null) {
                        wVar.setMirrorX(isOutOwner);
                        w wVar2 = this.b;
                        int dp = AndroidUtilities.dp(4.0f);
                        boolean z15 = LocaleController.isRTL;
                        int i11 = this.h;
                        int i12 = dp + ((z15 || isOutOwner) ? 0 : i11);
                        float f14 = this.f;
                        int dp2 = AndroidUtilities.dp(f14);
                        int dp3 = AndroidUtilities.dp(4.0f);
                        if (!LocaleController.isRTL && !isOutOwner) {
                            i11 = 0;
                        }
                        wVar2.setPadding(i12, dp2, dp3 + i11, AndroidUtilities.dp(f14));
                    }
                    int height2 = getHeight() != 0 ? getHeight() : rjVar.getHeight();
                    if (s1Var.getCurrentMessagesGroup() != null) {
                        MessageObject.GroupedMessages.TransitionParams transitionParams = s1Var.getCurrentMessagesGroup().transitionParams;
                        height = transitionParams.bottom - transitionParams.top;
                    } else {
                        height = s1Var.getHeight();
                    }
                    float y3 = (s1Var.getY() + f13) - AndroidUtilities.dp(74.0f);
                    float dp4 = AndroidUtilities.dp(14.0f);
                    float dp5 = height2 - AndroidUtilities.dp(218.0f);
                    dk dkVar = wnVar.j2;
                    if (dkVar != null && dkVar.getVisibility() == 0) {
                        dp4 += dkVar.getHeight();
                    }
                    float f15 = height;
                    if (y3 <= dp4 - (f15 / 2.0f) || y3 >= dp5) {
                        if (y3 < (dp4 - f15) - AndroidUtilities.dp(92.0f) || y3 > dp5) {
                            z11 = false;
                        } else {
                            this.s = AndroidUtilities.dp(56.0f) + height;
                            this.r = 1.0f;
                            z11 = true;
                        }
                        z12 = z11;
                    } else {
                        this.r = 0.0f;
                        z11 = false;
                        z12 = true;
                    }
                    if (!z10) {
                        this.n = this.r;
                    }
                    float interpolation = (ds.f.getInterpolation(this.n) * this.s) + y3;
                    w wVar3 = this.b;
                    if (wVar3 == null) {
                        return;
                    }
                    if (z11 != wVar3.N) {
                        wVar3.setFlippedVertically(z11);
                        AndroidUtilities.runOnUIThread(new v(this, 0));
                    }
                    if (z12 != this.b.isEnabled()) {
                        this.b.setEnabled(z12);
                        this.b.invalidate();
                        if (z12) {
                            this.b.setVisibility(0);
                            if (!this.x) {
                                this.x = true;
                                this.b.p(this.e, wnVar.p8, true);
                            }
                        }
                    }
                    this.b.setTranslationY(ee.a(interpolation, dp4, dp5));
                    this.b.setTranslationX(s1Var.E2(true));
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
                    int c10 = org.telegram.messenger.t.c(32.0f, s1Var.getBackgroundDrawableLeft(), 0);
                    int c11 = org.telegram.messenger.t.c(32.0f, s1Var.getWidth() - s1Var.getBackgroundDrawableRight(), (int) s1Var.E2(true));
                    int dp6 = AndroidUtilities.dp(40.0f) * 8;
                    if ((getWidth() - c11) - c10 < dp6) {
                        if (isOutOwner) {
                            c10 = Math.min(c10, getWidth() - dp6);
                            c11 = 0;
                        } else {
                            c11 = Math.min(c11, getWidth() - dp6);
                            c10 = 0;
                        }
                    }
                    int i13 = isOutOwner ? 5 : 3;
                    if (i13 != layoutParams.gravity) {
                        layoutParams.gravity = i13;
                        z14 = true;
                    }
                    if (c10 != layoutParams.leftMargin) {
                        layoutParams.leftMargin = c10;
                        z14 = true;
                    }
                    if (c11 != layoutParams.rightMargin) {
                        layoutParams.rightMargin = c11;
                    } else {
                        z13 = z14;
                    }
                    if (z13) {
                        this.b.requestLayout();
                        return;
                    }
                    return;
                }
            }
        }
        w wVar4 = this.b;
        if (wVar4 == null || !wVar4.isEnabled()) {
            return;
        }
        this.b.setEnabled(false);
    }

    public final boolean d() {
        return this.d && !this.w;
    }

    public void setHiddenByScroll(boolean z10) {
        this.w = z10;
        if (z10) {
            a(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSelectedMessages(List<MessageObject> list) {
        TLRPC.ChatFull chatFull;
        TLRPC.Message message;
        this.c = list;
        wn wnVar = this.a;
        int i10 = wnVar.d4;
        boolean z10 = true;
        if (i10 != 1 && i10 != 5 && i10 != 6 && !wnVar.M9() && !wnVar.w() && (((chatFull = wnVar.p8) == null || !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) && !list.isEmpty())) {
            long j10 = 0;
            boolean z11 = false;
            for (MessageObject messageObject : list) {
                if ((messageObject != null && (message = messageObject.messageOwner) != null && message.rich_message != null) || (messageObject != null && !messageObject.needDrawBluredPreview() && ((MessageObject.isPhoto(messageObject.messageOwner) && MessageObject.getMedia(messageObject.messageOwner).webpage == null) || (messageObject.getDocument() != null && (MessageObject.isVideoDocument(messageObject.getDocument()) || MessageObject.isGifDocument(messageObject.getDocument())))))) {
                    if (!z11) {
                        j10 = messageObject.getGroupId();
                        z11 = true;
                    } else if (j10 == messageObject.getGroupId() && j10 != 0) {
                    }
                }
            }
            if (z10 == this.d) {
                this.d = z10;
                this.w = false;
                a(z10);
                return;
            } else {
                if (z10) {
                    this.e = b();
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (z10 == this.d) {
        }
    }
}
