package ai;

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
import org.telegram.ui.dz;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class pb extends kb {
    public final zg.p0 I;
    public final ob J;
    public final zg.g0 K;
    public final ImageReceiver L;
    public final org.telegram.ui.Components.e6 M;
    public final org.telegram.ui.Components.o6 N;
    public boolean O;

    public pb(Context context, mb mbVar, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, dz dzVar) {
        super(context, mbVar, tL_mediaAreaSuggestedReaction);
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList arrayList;
        ob obVar = new ob(this);
        this.J = obVar;
        zg.g0 g0Var = new zg.g0(this);
        this.K = g0Var;
        this.L = new ImageReceiver(this);
        this.M = new org.telegram.ui.Components.e6(this);
        this.N = new org.telegram.ui.Components.o6(false, false, false, false);
        zg.p0 d = zg.p0.d(tL_mediaAreaSuggestedReaction.reaction);
        this.I = d;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            obVar.b(true, false);
        }
        obVar.c(getScaleX());
        g0Var.e(d);
        dzVar.getClass();
        String str = d.f;
        str = str == null ? MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.q5.f(dzVar.b, d.g)) : str;
        if (str != null && (arrayList = (ArrayList) dzVar.e.get(str)) != null && !arrayList.isEmpty()) {
            int min = Math.min(1, arrayList.size());
            for (int i10 = 0; i10 < min; i10++) {
                dzVar.m((TLRPC.Document) arrayList.get(i10));
            }
        }
        if (this.I.f != null && (tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(this.I.f)) != null) {
            this.L.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        org.telegram.ui.Components.o6 o6Var = this.N;
        o6Var.b = 17;
        o6Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        this.N.t(AndroidUtilities.dp(18.0f));
        this.N.G = AndroidUtilities.displaySize.x;
        if (tL_mediaAreaSuggestedReaction.dark) {
            this.J.a();
            this.N.r(-1);
        }
    }

    @Override // ai.kb
    public final void a(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ob obVar = this.J;
        obVar.setBounds(0, 0, measuredWidth, measuredHeight);
        obVar.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float centerX = obVar.getBounds().centerX() - measuredWidth2;
        float centerY = obVar.getBounds().centerY() - measuredWidth2;
        float centerX2 = obVar.getBounds().centerX() + measuredWidth2;
        float centerY2 = obVar.getBounds().centerY() + measuredWidth2;
        float height = (obVar.getBounds().height() * 0.427f) + obVar.getBounds().top;
        float f7 = height - measuredWidth2;
        float f10 = height + measuredWidth2;
        float d = this.M.d(this.O ? 1.0f : 0.0f, false);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) centerX, (int) AndroidUtilities.lerp(centerY, f7, d), (int) centerX2, (int) AndroidUtilities.lerp(centerY2, f10, d));
        int i10 = obVar.a == 1 ? -1 : -16777216;
        zg.g0 g0Var = this.K;
        g0Var.d(i10);
        g0Var.c(rect);
        g0Var.a(canvas);
        float height2 = (obVar.getBounds().height() * 0.839f) + obVar.getBounds().top;
        org.telegram.ui.Components.o6 o6Var = this.N;
        o6Var.setBounds(obVar.getBounds().left, (int) (height2 - AndroidUtilities.dp(10.0f)), obVar.getBounds().right, (int) (AndroidUtilities.dp(10.0f) + height2));
        canvas.save();
        canvas.scale(d, d, obVar.getBounds().centerX(), height2);
        o6Var.draw(canvas);
        canvas.restore();
    }

    public final void c(TL_stories.StoryViews storyViews, boolean z10) {
        org.telegram.ui.Components.e6 e6Var = this.M;
        if (storyViews != null) {
            for (int i10 = 0; i10 < storyViews.reactions.size(); i10++) {
                if (zg.r0.d(storyViews.reactions.get(i10).reaction, this.I)) {
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
