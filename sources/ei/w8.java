package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.h10;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.fx;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w8 extends r8 {
    public final dh.n0 J;
    public final v8 K;
    public final dh.e0 L;
    public final ImageReceiver M;
    public final org.telegram.ui.Components.u5 N;
    public final org.telegram.ui.Components.g6 O;
    public boolean P;

    public w8(Context context, t8 t8Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, fx fxVar) {
        super(context, t8Var, tL_mediaAreaSuggestedReaction);
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList arrayList;
        v8 v8Var = new v8(this);
        this.K = v8Var;
        dh.e0 e0Var = new dh.e0(this);
        this.L = e0Var;
        this.M = new ImageReceiver(this);
        this.N = new org.telegram.ui.Components.u5(this);
        this.O = new org.telegram.ui.Components.g6(false, false, false);
        dh.n0 d = dh.n0.d(tL_mediaAreaSuggestedReaction.reaction);
        this.J = d;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            v8Var.b(true, false);
        }
        v8Var.c(getScaleX());
        e0Var.e(d);
        fxVar.getClass();
        String str = d.f;
        str = str == null ? zi.U(org.telegram.ui.Components.g5.e(fxVar.b, d.g)) : str;
        if (str != null && (arrayList = (ArrayList) fxVar.e.get(str)) != null && !arrayList.isEmpty()) {
            int min = Math.min(1, arrayList.size());
            for (int i3 = 0; i3 < min; i3++) {
                fxVar.l((TLRPC.Document) arrayList.get(i3));
            }
        }
        if (this.J.f != null && (tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(h10.t0).r.get(this.J.f)) != null) {
            this.M.q0(ac.b(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        org.telegram.ui.Components.g6 g6Var = this.O;
        g6Var.b = 17;
        g6Var.x(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        this.O.w(org.telegram.messenger.g0.L(18.0f));
        this.O.M = org.telegram.messenger.g0.q.x;
        if (tL_mediaAreaSuggestedReaction.dark) {
            this.K.a();
            this.O.u(-1);
        }
    }

    @Override // ei.r8
    public final void a(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        v8 v8Var = this.K;
        v8Var.setBounds(0, 0, measuredWidth, measuredHeight);
        v8Var.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float centerX = v8Var.getBounds().centerX() - measuredWidth2;
        float centerY = v8Var.getBounds().centerY() - measuredWidth2;
        float centerX2 = v8Var.getBounds().centerX() + measuredWidth2;
        float centerY2 = v8Var.getBounds().centerY() + measuredWidth2;
        float height = (v8Var.getBounds().height() * 0.427f) + v8Var.getBounds().top;
        float f10 = height - measuredWidth2;
        float f11 = height + measuredWidth2;
        float e10 = this.N.e(false, this.P ? 1.0f : 0.0f);
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set((int) centerX, (int) org.telegram.messenger.g0.T1(centerY, f10, e10), (int) centerX2, (int) org.telegram.messenger.g0.T1(centerY2, f11, e10));
        int i3 = v8Var.a == 1 ? -1 : -16777216;
        dh.e0 e0Var = this.L;
        e0Var.d(i3);
        e0Var.c(rect);
        e0Var.a(canvas);
        float height2 = (v8Var.getBounds().height() * 0.839f) + v8Var.getBounds().top;
        org.telegram.ui.Components.g6 g6Var = this.O;
        g6Var.setBounds(v8Var.getBounds().left, (int) (height2 - org.telegram.messenger.g0.L(10.0f)), v8Var.getBounds().right, (int) (org.telegram.messenger.g0.L(10.0f) + height2));
        canvas.save();
        canvas.scale(e10, e10, v8Var.getBounds().centerX(), height2);
        g6Var.draw(canvas);
        canvas.restore();
    }

    public final void c(TL_stories.StoryViews storyViews, boolean z10) {
        org.telegram.ui.Components.u5 u5Var = this.N;
        if (storyViews != null) {
            for (int i3 = 0; i3 < storyViews.reactions.size(); i3++) {
                if (dh.p0.c(storyViews.reactions.get(i3).reaction, this.J)) {
                    boolean z11 = z10 && this.P;
                    this.P = storyViews.reactions.get(i3).count > 0;
                    this.O.t(org.telegram.messenger.g0.o0(storyViews.reactions.get(i3).count, 0), z11, true);
                    if (z10) {
                        return;
                    }
                    u5Var.e(true, this.P ? 1.0f : 0.0f);
                    return;
                }
            }
        }
        this.P = false;
        invalidate();
        if (z10) {
            return;
        }
        u5Var.e(true, this.P ? 1.0f : 0.0f);
    }

    public org.telegram.ui.Components.g5 getAnimatedEmojiDrawable() {
        return this.L.b;
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
        this.L.b(true);
        this.M.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L.b(false);
        this.M.R();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.O.w(Math.min(org.telegram.messenger.g0.L(18.0f), getMeasuredHeight() * 0.156f));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            this.K.c(f10);
            super.setScaleX(f10);
        }
    }
}
