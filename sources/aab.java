// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class aab extends t8b {
    public final w49 J;
    public final z9b K;
    public final p39 L;
    public final ImageReceiver M;
    public final mm N;
    public final hn O;
    public boolean P;

    public aab(Context context, v8b v8bVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, tv3 tv3Var) {
        super(context, v8bVar, tL_mediaAreaSuggestedReaction);
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList arrayList;
        z9b z9bVar = new z9b(this);
        this.K = z9bVar;
        p39 p39Var = new p39(this);
        this.L = p39Var;
        this.M = new ImageReceiver(this);
        this.N = new mm(this);
        this.O = new hn(false, false, false);
        w49 d = w49.d(tL_mediaAreaSuggestedReaction.reaction);
        this.J = d;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            z9bVar.b(true, false);
        }
        z9bVar.c(getScaleX());
        p39Var.e(d);
        tv3Var.getClass();
        String str = d.f;
        str = str == null ? r47.U(wl.e(tv3Var.b, d.g)) : str;
        if (str != null && (arrayList = (ArrayList) tv3Var.e.get(str)) != null && !arrayList.isEmpty()) {
            int min = Math.min(1, arrayList.size());
            for (int i = 0; i < min; i++) {
                tv3Var.m((TLRPC.Document) arrayList.get(i));
            }
        }
        if (this.J.f != null && (tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(yac.t0).r.get(this.J.f)) != null) {
            this.M.d0(jn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        hn hnVar = this.O;
        hnVar.b = 17;
        hnVar.x(hl.n1("fonts/rcondensedbold.ttf"));
        this.O.w(hl.L(18.0f));
        this.O.N = hl.q.x;
        if (tL_mediaAreaSuggestedReaction.dark) {
            this.K.a();
            this.O.u(-1);
        }
    }

    @Override // t8b
    public final void a(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        z9b z9bVar = this.K;
        z9bVar.setBounds(0, 0, measuredWidth, measuredHeight);
        z9bVar.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float centerX = z9bVar.getBounds().centerX() - measuredWidth2;
        float centerY = z9bVar.getBounds().centerY() - measuredWidth2;
        float centerX2 = z9bVar.getBounds().centerX() + measuredWidth2;
        float centerY2 = z9bVar.getBounds().centerY() + measuredWidth2;
        float height = (z9bVar.getBounds().height() * 0.427f) + z9bVar.getBounds().top;
        float f = height - measuredWidth2;
        float f2 = height + measuredWidth2;
        float e = this.N.e(false, this.P ? 1.0f : 0.0f);
        Rect rect = hl.Q;
        rect.set((int) centerX, (int) hl.R1(centerY, f, e), (int) centerX2, (int) hl.R1(centerY2, f2, e));
        int i = z9bVar.a == 1 ? -1 : -16777216;
        p39 p39Var = this.L;
        p39Var.d(i);
        p39Var.c(rect);
        p39Var.a(canvas);
        float height2 = (z9bVar.getBounds().height() * 0.839f) + z9bVar.getBounds().top;
        hn hnVar = this.O;
        hnVar.setBounds(z9bVar.getBounds().left, (int) (height2 - hl.L(10.0f)), z9bVar.getBounds().right, (int) (hl.L(10.0f) + height2));
        canvas.save();
        canvas.scale(e, e, z9bVar.getBounds().centerX(), height2);
        hnVar.draw(canvas);
        canvas.restore();
    }

    public final void c(TL_stories.StoryViews storyViews, boolean z) {
        mm mmVar = this.N;
        if (storyViews != null) {
            for (int i = 0; i < storyViews.reactions.size(); i++) {
                if (z49.c(storyViews.reactions.get(i).reaction, this.J)) {
                    boolean z2 = z && this.P;
                    this.P = storyViews.reactions.get(i).count > 0;
                    this.O.t(hl.o0(storyViews.reactions.get(i).count, 0), z2, true);
                    if (z) {
                        return;
                    }
                    mmVar.e(true, this.P ? 1.0f : 0.0f);
                    return;
                }
            }
        }
        this.P = false;
        invalidate();
        if (z) {
            return;
        }
        mmVar.e(true, this.P ? 1.0f : 0.0f);
    }

    public wl getAnimatedEmojiDrawable() {
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
        this.M.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L.b(false);
        this.M.K();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.O.w(Math.min(hl.L(18.0f), getMeasuredHeight() * 0.156f));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (getScaleX() != f) {
            this.K.c(f);
            super.setScaleX(f);
        }
    }
}
