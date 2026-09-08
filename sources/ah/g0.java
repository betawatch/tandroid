package ah;

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
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.pr;
import org.telegram.ui.co;
import org.telegram.ui.hk;
import org.telegram.ui.uj;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class g0 extends FrameLayout {
    public final co a;
    public f0 b;
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

    public g0(co coVar, Context context) {
        super(context);
        this.c = Collections.EMPTY_LIST;
        this.f = 22;
        this.h = 24;
        this.y = new int[2];
        setVisibility(8);
        this.a = coVar;
        setClipToPadding(false);
        setClipChildren(false);
        coVar.x0.j(new e0(this, 0));
    }

    public final void a(boolean z10) {
        int i10 = 1;
        int i11 = 0;
        if (z10) {
            setVisibility(0);
            post(new c0(this, i10));
            return;
        }
        this.x = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new d0(this, i11));
        duration.addListener(new b(this, i10));
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
        int i10 = 0;
        MessageObject messageObject = (MessageObject) this.c.get(0);
        if (messageObject.getGroupId() != 0 && (y82 = this.a.y8(messageObject.getGroupId())) != null && (arrayList = y82.messages) != null) {
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
        f0 f0Var;
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
            AndroidUtilities.runOnUIThread(new c0(this, 0));
        }
        co coVar = this.a;
        uj ujVar = coVar.x0;
        int[] iArr = this.y;
        ujVar.getLocationInWindow(iArr);
        boolean z13 = true;
        float f12 = iArr[1];
        getLocationInWindow(iArr);
        float f13 = (f12 - iArr[1]) - coVar.N9;
        boolean z14 = false;
        for (int i10 = 0; i10 < ujVar.getChildCount(); i10++) {
            View childAt = ujVar.getChildAt(i10);
            if (childAt instanceof t1) {
                t1 t1Var = (t1) childAt;
                MessageObject messageObject = t1Var.getMessageObject();
                if (messageObject.getId() == this.e.getId()) {
                    boolean isOutOwner = messageObject.isOutOwner();
                    f0 f0Var2 = this.b;
                    if (f0Var2 != null) {
                        f0Var2.setMirrorX(isOutOwner);
                        f0 f0Var3 = this.b;
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
                        f0Var3.setPadding(i12, dp2, dp3 + i11, AndroidUtilities.dp(f14));
                    }
                    int height2 = getHeight() != 0 ? getHeight() : ujVar.getHeight();
                    if (t1Var.getCurrentMessagesGroup() != null) {
                        MessageObject.GroupedMessages.TransitionParams transitionParams = t1Var.getCurrentMessagesGroup().transitionParams;
                        height = transitionParams.bottom - transitionParams.top;
                    } else {
                        height = t1Var.getHeight();
                    }
                    float y3 = (t1Var.getY() + f13) - AndroidUtilities.dp(74.0f);
                    float dp4 = AndroidUtilities.dp(14.0f);
                    float dp5 = height2 - AndroidUtilities.dp(218.0f);
                    hk hkVar = coVar.X1;
                    if (hkVar != null && hkVar.getVisibility() == 0) {
                        dp4 += hkVar.getHeight();
                    }
                    float f15 = height;
                    if (y3 > dp4 - (f15 / 2.0f) && y3 < dp5) {
                        this.r = 0.0f;
                        z11 = false;
                    } else {
                        if (y3 < (dp4 - f15) - AndroidUtilities.dp(92.0f) || y3 > dp5) {
                            z11 = false;
                            z12 = false;
                            if (!z10) {
                                this.n = this.r;
                            }
                            float interpolation = (pr.f.getInterpolation(this.n) * this.s) + y3;
                            f0Var = this.b;
                            if (f0Var != null) {
                                return;
                            }
                            if (z11 != f0Var.N) {
                                f0Var.setFlippedVertically(z11);
                                AndroidUtilities.runOnUIThread(new c0(this, 0));
                            }
                            if (z12 != this.b.isEnabled()) {
                                this.b.setEnabled(z12);
                                this.b.invalidate();
                                if (z12) {
                                    this.b.setVisibility(0);
                                    if (!this.x) {
                                        this.x = true;
                                        this.b.p(this.e, coVar.Z7, true);
                                    }
                                }
                            }
                            this.b.setTranslationY(w7.p.a(interpolation, dp4, dp5));
                            this.b.setTranslationX(t1Var.E2(true));
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
                            int f16 = i2.g.f(32.0f, t1Var.getBackgroundDrawableLeft(), 0);
                            int f17 = i2.g.f(32.0f, t1Var.getWidth() - t1Var.getBackgroundDrawableRight(), (int) t1Var.E2(true));
                            int dp6 = AndroidUtilities.dp(40.0f) * 8;
                            if ((getWidth() - f17) - f16 < dp6) {
                                if (isOutOwner) {
                                    f16 = Math.min(f16, getWidth() - dp6);
                                    f17 = 0;
                                } else {
                                    f17 = Math.min(f17, getWidth() - dp6);
                                    f16 = 0;
                                }
                            }
                            int i13 = isOutOwner ? 5 : 3;
                            if (i13 != layoutParams.gravity) {
                                layoutParams.gravity = i13;
                                z14 = true;
                            }
                            if (f16 != layoutParams.leftMargin) {
                                layoutParams.leftMargin = f16;
                                z14 = true;
                            }
                            if (f17 != layoutParams.rightMargin) {
                                layoutParams.rightMargin = f17;
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
                    float interpolation2 = (pr.f.getInterpolation(this.n) * this.s) + y3;
                    f0Var = this.b;
                    if (f0Var != null) {
                    }
                }
            }
        }
        f0 f0Var4 = this.b;
        if (f0Var4 == null || !f0Var4.isEnabled()) {
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
        co coVar = this.a;
        int i10 = coVar.R3;
        boolean z10 = true;
        if (i10 != 1 && i10 != 5 && i10 != 6 && !coVar.A9() && !coVar.v() && (((chatFull = coVar.Z7) == null || !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) && !list.isEmpty())) {
            long j3 = 0;
            boolean z11 = false;
            for (MessageObject messageObject : list) {
                if ((messageObject != null && (message = messageObject.messageOwner) != null && message.rich_message != null) || (messageObject != null && !messageObject.needDrawBluredPreview() && ((MessageObject.isPhoto(messageObject.messageOwner) && MessageObject.getMedia(messageObject.messageOwner).webpage == null) || (messageObject.getDocument() != null && (MessageObject.isVideoDocument(messageObject.getDocument()) || MessageObject.isGifDocument(messageObject.getDocument())))))) {
                    if (!z11) {
                        j3 = messageObject.getGroupId();
                        z11 = true;
                    } else if (j3 == messageObject.getGroupId() && j3 != 0) {
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
