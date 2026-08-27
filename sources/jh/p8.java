package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.sy;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class p8 extends k8 {
    public final ig.q0 E;
    public final o8 F;
    public final ig.h0 G;
    public final ImageReceiver H;
    public final org.telegram.ui.Components.y5 I;
    public final org.telegram.ui.Components.i6 J;
    public boolean K;

    public p8(Context context, m8 m8Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, sy syVar) {
        super(context, m8Var, tL_mediaAreaSuggestedReaction);
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList arrayList;
        o8 o8Var = new o8(this);
        this.F = o8Var;
        ig.h0 h0Var = new ig.h0(this);
        this.G = h0Var;
        this.H = new ImageReceiver(this);
        this.I = new org.telegram.ui.Components.y5(this);
        this.J = new org.telegram.ui.Components.i6(false, false, false, false);
        ig.q0 d = ig.q0.d(tL_mediaAreaSuggestedReaction.reaction);
        this.E = d;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            o8Var.b(true, false);
        }
        o8Var.c(getScaleX());
        h0Var.e(d);
        syVar.getClass();
        String str = d.f;
        str = str == null ? MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.k5.f(syVar.b, d.g)) : str;
        if (str != null && (arrayList = (ArrayList) syVar.e.get(str)) != null && !arrayList.isEmpty()) {
            int min = Math.min(1, arrayList.size());
            for (int i10 = 0; i10 < min; i10++) {
                syVar.m((TLRPC.Document) arrayList.get(i10));
            }
        }
        if (this.E.f != null && (tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(this.E.f)) != null) {
            this.H.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        org.telegram.ui.Components.i6 i6Var = this.J;
        i6Var.b = 17;
        i6Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        this.J.t(AndroidUtilities.dp(18.0f));
        this.J.G = AndroidUtilities.displaySize.x;
        if (tL_mediaAreaSuggestedReaction.dark) {
            this.F.a();
            this.J.r(-1);
        }
    }

    @Override // jh.k8
    public final void a(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        o8 o8Var = this.F;
        o8Var.setBounds(0, 0, measuredWidth, measuredHeight);
        o8Var.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float centerX = o8Var.getBounds().centerX() - measuredWidth2;
        float centerY = o8Var.getBounds().centerY() - measuredWidth2;
        float centerX2 = o8Var.getBounds().centerX() + measuredWidth2;
        float centerY2 = o8Var.getBounds().centerY() + measuredWidth2;
        float height = (o8Var.getBounds().height() * 0.427f) + o8Var.getBounds().top;
        float f10 = height - measuredWidth2;
        float f11 = height + measuredWidth2;
        float d = this.I.d(this.K ? 1.0f : 0.0f, false);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) centerX, (int) AndroidUtilities.lerp(centerY, f10, d), (int) centerX2, (int) AndroidUtilities.lerp(centerY2, f11, d));
        int i10 = o8Var.a == 1 ? -1 : -16777216;
        ig.h0 h0Var = this.G;
        h0Var.d(i10);
        h0Var.c(rect);
        h0Var.a(canvas);
        float height2 = (o8Var.getBounds().height() * 0.839f) + o8Var.getBounds().top;
        org.telegram.ui.Components.i6 i6Var = this.J;
        i6Var.setBounds(o8Var.getBounds().left, (int) (height2 - AndroidUtilities.dp(10.0f)), o8Var.getBounds().right, (int) (AndroidUtilities.dp(10.0f) + height2));
        canvas.save();
        canvas.scale(d, d, o8Var.getBounds().centerX(), height2);
        i6Var.draw(canvas);
        canvas.restore();
    }

    public final void c(TL_stories.StoryViews storyViews, boolean z10) {
        org.telegram.ui.Components.y5 y5Var = this.I;
        if (storyViews != null) {
            for (int i10 = 0; i10 < storyViews.reactions.size(); i10++) {
                if (ig.s0.c(storyViews.reactions.get(i10).reaction, this.E)) {
                    boolean z11 = z10 && this.K;
                    this.K = storyViews.reactions.get(i10).count > 0;
                    this.J.q(AndroidUtilities.formatWholeNumber(storyViews.reactions.get(i10).count, 0), z11, true);
                    if (z10) {
                        return;
                    }
                    y5Var.d(this.K ? 1.0f : 0.0f, true);
                    return;
                }
            }
        }
        this.K = false;
        invalidate();
        if (z10) {
            return;
        }
        y5Var.d(this.K ? 1.0f : 0.0f, true);
    }

    public org.telegram.ui.Components.k5 getAnimatedEmojiDrawable() {
        return this.G.b;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G.b(true);
        this.H.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G.b(false);
        this.H.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.J.t(Math.min(AndroidUtilities.dp(18.0f), getMeasuredHeight() * 0.156f));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            this.F.c(f10);
            super.setScaleX(f10);
        }
    }
}
