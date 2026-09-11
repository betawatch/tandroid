package bi;

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
import org.telegram.ui.gz;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class wa extends ra {
    public final ah.j1 I;
    public final va J;
    public final ah.z0 K;
    public final ImageReceiver L;
    public final org.telegram.ui.Components.e6 M;
    public final org.telegram.ui.Components.p6 N;
    public boolean O;

    public wa(Context context, ta taVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, gz gzVar) {
        super(context, taVar, tL_mediaAreaSuggestedReaction);
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList arrayList;
        va vaVar = new va(this);
        this.J = vaVar;
        ah.z0 z0Var = new ah.z0(this);
        this.K = z0Var;
        this.L = new ImageReceiver(this);
        this.M = new org.telegram.ui.Components.e6(this);
        this.N = new org.telegram.ui.Components.p6(false, false, false, false);
        ah.j1 d = ah.j1.d(tL_mediaAreaSuggestedReaction.reaction);
        this.I = d;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            vaVar.b(true, false);
        }
        vaVar.c(getScaleX());
        z0Var.e(d);
        gzVar.getClass();
        String str = d.f;
        str = str == null ? MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.q5.f(gzVar.b, d.g)) : str;
        if (str != null && (arrayList = (ArrayList) gzVar.e.get(str)) != null && !arrayList.isEmpty()) {
            int min = Math.min(1, arrayList.size());
            for (int i10 = 0; i10 < min; i10++) {
                gzVar.m((TLRPC.Document) arrayList.get(i10));
            }
        }
        if (this.I.f != null && (tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(this.I.f)) != null) {
            this.L.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        org.telegram.ui.Components.p6 p6Var = this.N;
        p6Var.b = 17;
        p6Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        this.N.t(AndroidUtilities.dp(18.0f));
        this.N.G = AndroidUtilities.displaySize.x;
        if (tL_mediaAreaSuggestedReaction.dark) {
            this.J.a();
            this.N.r(-1);
        }
    }

    @Override // bi.ra
    public final void a(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        va vaVar = this.J;
        vaVar.setBounds(0, 0, measuredWidth, measuredHeight);
        vaVar.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float centerX = vaVar.getBounds().centerX() - measuredWidth2;
        float centerY = vaVar.getBounds().centerY() - measuredWidth2;
        float centerX2 = vaVar.getBounds().centerX() + measuredWidth2;
        float centerY2 = vaVar.getBounds().centerY() + measuredWidth2;
        float height = (vaVar.getBounds().height() * 0.427f) + vaVar.getBounds().top;
        float f7 = height - measuredWidth2;
        float f10 = height + measuredWidth2;
        float d = this.M.d(this.O ? 1.0f : 0.0f, false);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) centerX, (int) AndroidUtilities.lerp(centerY, f7, d), (int) centerX2, (int) AndroidUtilities.lerp(centerY2, f10, d));
        int i10 = vaVar.a == 1 ? -1 : -16777216;
        ah.z0 z0Var = this.K;
        z0Var.d(i10);
        z0Var.c(rect);
        z0Var.a(canvas);
        float height2 = (vaVar.getBounds().height() * 0.839f) + vaVar.getBounds().top;
        org.telegram.ui.Components.p6 p6Var = this.N;
        p6Var.setBounds(vaVar.getBounds().left, (int) (height2 - AndroidUtilities.dp(10.0f)), vaVar.getBounds().right, (int) (AndroidUtilities.dp(10.0f) + height2));
        canvas.save();
        canvas.scale(d, d, vaVar.getBounds().centerX(), height2);
        p6Var.draw(canvas);
        canvas.restore();
    }

    public final void c(TL_stories.StoryViews storyViews, boolean z10) {
        org.telegram.ui.Components.e6 e6Var = this.M;
        if (storyViews != null) {
            for (int i10 = 0; i10 < storyViews.reactions.size(); i10++) {
                if (ah.m1.c(storyViews.reactions.get(i10).reaction, this.I)) {
                    boolean z11 = z10 && this.O;
                    this.O = storyViews.reactions.get(i10).count > 0;
                    this.N.q(AndroidUtilities.formatWholeNumber(storyViews.reactions.get(i10).count, 0), z11, true);
                    if (z10) {
                        return;
                    }
                    e6Var.d(this.O ? 1.0f : 0.0f, true);
                    return;
                }
            }
        }
        this.O = false;
        invalidate();
        if (z10) {
            return;
        }
        e6Var.d(this.O ? 1.0f : 0.0f, true);
    }

    public org.telegram.ui.Components.q5 getAnimatedEmojiDrawable() {
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
        this.L.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K.b(false);
        this.L.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.N.t(Math.min(AndroidUtilities.dp(18.0f), getMeasuredHeight() * 0.156f));
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            this.J.c(f7);
            super.setScaleX(f7);
        }
    }
}
