package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.lx;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x8 extends s8 {
    public final ch.o0 I;
    public final w8 J;
    public final ch.f0 K;
    public final ImageReceiver L;
    public final org.telegram.ui.Components.v5 M;
    public final org.telegram.ui.Components.h6 N;
    public boolean O;

    public x8(Context context, u8 u8Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, lx lxVar) {
        super(context, u8Var, tL_mediaAreaSuggestedReaction);
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList arrayList;
        w8 w8Var = new w8(this);
        this.J = w8Var;
        ch.f0 f0Var = new ch.f0(this);
        this.K = f0Var;
        this.L = new ImageReceiver(this);
        this.M = new org.telegram.ui.Components.v5(this);
        this.N = new org.telegram.ui.Components.h6(false, false, false);
        ch.o0 d = ch.o0.d(tL_mediaAreaSuggestedReaction.reaction);
        this.I = d;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            w8Var.b(true, false);
        }
        w8Var.c(getScaleX());
        f0Var.e(d);
        lxVar.getClass();
        String str = d.f;
        str = str == null ? ij.U(org.telegram.ui.Components.h5.e(lxVar.b, d.g)) : str;
        if (str != null && (arrayList = (ArrayList) lxVar.e.get(str)) != null && !arrayList.isEmpty()) {
            int min = Math.min(1, arrayList.size());
            for (int i7 = 0; i7 < min; i7++) {
                lxVar.l((TLRPC.Document) arrayList.get(i7));
            }
        }
        if (this.I.f != null && (tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(p10.s0).r.get(this.I.f)) != null) {
            this.L.q0(hc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        org.telegram.ui.Components.h6 h6Var = this.N;
        h6Var.b = 17;
        h6Var.x(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        this.N.w(org.telegram.messenger.g0.L(18.0f));
        this.N.M = org.telegram.messenger.g0.q.x;
        if (tL_mediaAreaSuggestedReaction.dark) {
            this.J.a();
            this.N.u(-1);
        }
    }

    @Override // di.s8
    public final void a(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        w8 w8Var = this.J;
        w8Var.setBounds(0, 0, measuredWidth, measuredHeight);
        w8Var.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float centerX = w8Var.getBounds().centerX() - measuredWidth2;
        float centerY = w8Var.getBounds().centerY() - measuredWidth2;
        float centerX2 = w8Var.getBounds().centerX() + measuredWidth2;
        float centerY2 = w8Var.getBounds().centerY() + measuredWidth2;
        float height = (w8Var.getBounds().height() * 0.427f) + w8Var.getBounds().top;
        float f10 = height - measuredWidth2;
        float f11 = height + measuredWidth2;
        float e10 = this.M.e(false, this.O ? 1.0f : 0.0f);
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set((int) centerX, (int) org.telegram.messenger.g0.T1(centerY, f10, e10), (int) centerX2, (int) org.telegram.messenger.g0.T1(centerY2, f11, e10));
        int i7 = w8Var.a == 1 ? -1 : -16777216;
        ch.f0 f0Var = this.K;
        f0Var.d(i7);
        f0Var.c(rect);
        f0Var.a(canvas);
        float height2 = (w8Var.getBounds().height() * 0.839f) + w8Var.getBounds().top;
        org.telegram.ui.Components.h6 h6Var = this.N;
        h6Var.setBounds(w8Var.getBounds().left, (int) (height2 - org.telegram.messenger.g0.L(10.0f)), w8Var.getBounds().right, (int) (org.telegram.messenger.g0.L(10.0f) + height2));
        canvas.save();
        canvas.scale(e10, e10, w8Var.getBounds().centerX(), height2);
        h6Var.draw(canvas);
        canvas.restore();
    }

    public final void c(TL_stories.StoryViews storyViews, boolean z9) {
        org.telegram.ui.Components.v5 v5Var = this.M;
        if (storyViews != null) {
            for (int i7 = 0; i7 < storyViews.reactions.size(); i7++) {
                if (ch.q0.c(storyViews.reactions.get(i7).reaction, this.I)) {
                    boolean z10 = z9 && this.O;
                    this.O = storyViews.reactions.get(i7).count > 0;
                    this.N.t(org.telegram.messenger.g0.o0(storyViews.reactions.get(i7).count, 0), z10, true);
                    if (z9) {
                        return;
                    }
                    v5Var.e(true, this.O ? 1.0f : 0.0f);
                    return;
                }
            }
        }
        this.O = false;
        invalidate();
        if (z9) {
            return;
        }
        v5Var.e(true, this.O ? 1.0f : 0.0f);
    }

    public org.telegram.ui.Components.h5 getAnimatedEmojiDrawable() {
        return this.K.b;
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
        this.K.b(true);
        this.L.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K.b(false);
        this.L.R();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.N.w(Math.min(org.telegram.messenger.g0.L(18.0f), getMeasuredHeight() * 0.156f));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            this.J.c(f10);
            super.setScaleX(f10);
        }
    }
}
