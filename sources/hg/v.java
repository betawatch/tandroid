package hg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bg.o2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.gr;
import org.telegram.ui.ij;
import org.telegram.ui.qn;
import org.telegram.ui.vj;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final qn a;
    public u b;
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

    public v(qn qnVar, Context context) {
        super(context);
        this.c = Collections.EMPTY_LIST;
        this.f = 22;
        this.h = 24;
        this.y = new int[2];
        setVisibility(8);
        this.a = qnVar;
        setClipToPadding(false);
        setClipChildren(false);
        qnVar.t0.j(new o2(this, 9));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new t(this, 1));
            return;
        }
        this.x = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new bg.b(this, 9));
        duration.addListener(new ag.e(this, 7));
        duration.start();
    }

    public final MessageObject b() {
        MessageObject.GroupedMessages y82;
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (!this.d || this.c.isEmpty()) {
            return null;
        }
        int i9 = 0;
        MessageObject messageObject = (MessageObject) this.c.get(0);
        if (messageObject.getGroupId() != 0 && (y82 = this.a.y8(messageObject.getGroupId())) != null && (arrayList = y82.messages) != null) {
            int size = arrayList.size();
            while (i9 < size) {
                MessageObject messageObject2 = arrayList.get(i9);
                i9++;
                MessageObject messageObject3 = messageObject2;
                TLRPC.Message message = messageObject3.messageOwner;
                if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                    return messageObject3;
                }
            }
        }
        return messageObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z10) {
        int height;
        boolean z11;
        boolean z12;
        u uVar;
        if (!this.d || this.e == null || this.b == null) {
            return;
        }
        long min = Math.min(16L, System.currentTimeMillis() - this.v);
        this.v = System.currentTimeMillis();
        float f10 = this.n;
        float f11 = this.r;
        if (f10 != f11) {
            float f12 = min / 220.0f;
            if (f11 > f10) {
                this.n = Math.min(f10 + f12, f11);
            } else if (f11 < f10) {
                this.n = Math.max(f10 - f12, f11);
            }
            AndroidUtilities.runOnUIThread(new t(this, 0));
        }
        qn qnVar = this.a;
        ij ijVar = qnVar.t0;
        int[] iArr = this.y;
        ijVar.getLocationInWindow(iArr);
        boolean z13 = true;
        float f13 = iArr[1];
        getLocationInWindow(iArr);
        float f14 = (f13 - iArr[1]) - qnVar.J9;
        boolean z14 = false;
        for (int i9 = 0; i9 < ijVar.getChildCount(); i9++) {
            View childAt = ijVar.getChildAt(i9);
            if (childAt instanceof t1) {
                t1 t1Var = (t1) childAt;
                MessageObject messageObject = t1Var.getMessageObject();
                if (messageObject.getId() == this.e.getId()) {
                    boolean isOutOwner = messageObject.isOutOwner();
                    u uVar2 = this.b;
                    if (uVar2 != null) {
                        uVar2.setMirrorX(isOutOwner);
                        u uVar3 = this.b;
                        int dp = AndroidUtilities.dp(4.0f);
                        boolean z15 = LocaleController.isRTL;
                        int i10 = this.h;
                        int i11 = dp + ((z15 || isOutOwner) ? 0 : i10);
                        float f15 = this.f;
                        int dp2 = AndroidUtilities.dp(f15);
                        int dp3 = AndroidUtilities.dp(4.0f);
                        if (!LocaleController.isRTL && !isOutOwner) {
                            i10 = 0;
                        }
                        uVar3.setPadding(i11, dp2, dp3 + i10, AndroidUtilities.dp(f15));
                    }
                    int height2 = getHeight() != 0 ? getHeight() : ijVar.getHeight();
                    if (t1Var.getCurrentMessagesGroup() != null) {
                        MessageObject.GroupedMessages.TransitionParams transitionParams = t1Var.getCurrentMessagesGroup().transitionParams;
                        height = transitionParams.bottom - transitionParams.top;
                    } else {
                        height = t1Var.getHeight();
                    }
                    float y10 = (t1Var.getY() + f14) - AndroidUtilities.dp(74.0f);
                    float dp4 = AndroidUtilities.dp(14.0f);
                    float dp5 = height2 - AndroidUtilities.dp(218.0f);
                    vj vjVar = qnVar.T1;
                    if (vjVar != null && vjVar.getVisibility() == 0) {
                        dp4 += vjVar.getHeight();
                    }
                    float f16 = height;
                    if (y10 > dp4 - (f16 / 2.0f) && y10 < dp5) {
                        this.r = 0.0f;
                        z11 = false;
                    } else {
                        if (y10 < (dp4 - f16) - AndroidUtilities.dp(92.0f) || y10 > dp5) {
                            z11 = false;
                            z12 = false;
                            if (!z10) {
                                this.n = this.r;
                            }
                            float interpolation = (gr.f.getInterpolation(this.n) * this.s) + y10;
                            uVar = this.b;
                            if (uVar != null) {
                                return;
                            }
                            if (z11 != uVar.J) {
                                uVar.setFlippedVertically(z11);
                                AndroidUtilities.runOnUIThread(new t(this, 0));
                            }
                            if (z12 != this.b.isEnabled()) {
                                this.b.setEnabled(z12);
                                this.b.invalidate();
                                if (z12) {
                                    this.b.setVisibility(0);
                                    if (!this.x) {
                                        this.x = true;
                                        this.b.p(this.e, qnVar.V7, true);
                                    }
                                }
                            }
                            this.b.setTranslationY(g7.n.a(interpolation, dp4, dp5));
                            this.b.setTranslationX(t1Var.E2(true));
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
                            int b10 = org.telegram.messenger.l0.b(32.0f, t1Var.getBackgroundDrawableLeft(), 0);
                            int b11 = org.telegram.messenger.l0.b(32.0f, t1Var.getWidth() - t1Var.getBackgroundDrawableRight(), (int) t1Var.E2(true));
                            int dp6 = AndroidUtilities.dp(40.0f) * 8;
                            if ((getWidth() - b11) - b10 < dp6) {
                                if (isOutOwner) {
                                    b10 = Math.min(b10, getWidth() - dp6);
                                    b11 = 0;
                                } else {
                                    b11 = Math.min(b11, getWidth() - dp6);
                                    b10 = 0;
                                }
                            }
                            int i12 = isOutOwner ? 5 : 3;
                            if (i12 != layoutParams.gravity) {
                                layoutParams.gravity = i12;
                                z14 = true;
                            }
                            if (b10 != layoutParams.leftMargin) {
                                layoutParams.leftMargin = b10;
                                z14 = true;
                            }
                            if (b11 != layoutParams.rightMargin) {
                                layoutParams.rightMargin = b11;
                            } else {
                                z13 = z14;
                            }
                            if (z13) {
                                this.b.requestLayout();
                                return;
                            }
                            return;
                        }
                        this.s = AndroidUtilities.dp(56.0f) + height;
                        this.r = 1.0f;
                        z11 = true;
                    }
                    z12 = true;
                    if (!z10) {
                    }
                    float interpolation2 = (gr.f.getInterpolation(this.n) * this.s) + y10;
                    uVar = this.b;
                    if (uVar != null) {
                    }
                }
            }
        }
        u uVar4 = this.b;
        if (uVar4 == null || !uVar4.isEnabled()) {
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
        qn qnVar = this.a;
        int i9 = qnVar.N3;
        boolean z10 = true;
        if (i9 != 1 && i9 != 5 && i9 != 6 && !qnVar.A9() && !qnVar.w() && (((chatFull = qnVar.V7) == null || !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) && !list.isEmpty())) {
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
