package nh;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class h implements TextWatcher {
    public int a;
    public boolean b;
    public final /* synthetic */ m c;

    public h(m mVar) {
        this.c = mVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        m mVar = this.c;
        e eVar = mVar.V;
        org.telegram.ui.Components.o6 o6Var = mVar.v;
        mVar.w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.w + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.w);
        } else {
            str = null;
        }
        o6Var.a();
        o6Var.setText(str);
        o6Var.setTextColor(mVar.w >= captionLimit ? -1280137 : -1);
        if (mVar.w > captionLimit && !UserConfig.getInstance(mVar.Q).isPremium() && mVar.w < mVar.getCaptionPremiumLimit() && mVar.w > this.a && (mVar.e() || MessagesController.getInstance(mVar.Q).premiumFeaturesBlocked())) {
            int i10 = -mVar.J;
            mVar.J = i10;
            AndroidUtilities.shakeViewSpring(o6Var, i10);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i11 = mVar.w;
        this.a = i11;
        boolean z10 = i11 > captionLimit;
        if (z10 != this.b) {
            mVar.q(z10);
        }
        this.b = z10;
        if (!mVar.R) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        mVar.R = false;
        AndroidUtilities.runOnUIThread(new lh.m5(this, 16));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.c;
        ObjectAnimator objectAnimator = mVar.c0;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            mVar.T = mVar.f.getEditText().getScrollY();
            mVar.S = true;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.c;
        g gVar = mVar.f;
        if (gVar.getEditText().suppressOnTextChanged) {
            return;
        }
        if (mVar.I == null) {
            i iVar = new i(mVar, mVar.getContext(), mVar.x, LaunchActivity.R(), new lh.b(), 0);
            mVar.I = iVar;
            mVar.P = new org.telegram.ui.Components.ka(mVar.K, iVar, 0, false);
            mVar.I.p(new za.c(mVar, 29));
            lg.a aVar = mVar.d0;
            if (aVar != null) {
                i iVar2 = mVar.I;
                ng.d c3 = aVar.c(iVar2, null, false);
                c3.n(pg.a.i(mVar.a));
                iVar2.setBackgroundDrawable(c3);
            }
            mVar.b.addView(mVar.I, i7.f6.e(-1, -1, 83));
            mVar.w();
        }
        if (mVar.I.getAdapter() != null) {
            rf.v0 adapter = mVar.I.getAdapter();
            MessagesController.getInstance(mVar.Q).getUser(Long.valueOf(mVar.x));
            TLRPC.Chat chat = MessagesController.getInstance(mVar.Q).getChat(Long.valueOf(-mVar.x));
            adapter.getClass();
            adapter.h0 = chat;
            mVar.I.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
        }
    }
}
