package di;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        e eVar = mVar.c0;
        org.telegram.ui.Components.q6 q6Var = mVar.v;
        mVar.w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.w + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.w);
        } else {
            str = null;
        }
        q6Var.a();
        q6Var.setText(str);
        q6Var.setTextColor(mVar.w >= captionLimit ? -1280137 : -1);
        if (mVar.w > captionLimit && !UserConfig.getInstance(mVar.U).isPremium() && mVar.w < mVar.getCaptionPremiumLimit() && mVar.w > this.a && (mVar.e() || MessagesController.getInstance(mVar.U).premiumFeaturesBlocked())) {
            int i10 = -mVar.N;
            mVar.N = i10;
            AndroidUtilities.shakeViewSpring(q6Var, i10);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i11 = mVar.w;
        this.a = i11;
        boolean z10 = i11 > captionLimit;
        if (z10 != this.b) {
            mVar.q(z10);
        }
        this.b = z10;
        if (!mVar.V) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        mVar.V = false;
        AndroidUtilities.runOnUIThread(new bi.oa(this, 11));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.c;
        ObjectAnimator objectAnimator = mVar.g0;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            mVar.a0 = mVar.f.getEditText().getScrollY();
            mVar.W = true;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.c;
        g gVar = mVar.f;
        if (gVar.getEditText().suppressOnTextChanged) {
            return;
        }
        if (mVar.M == null) {
            i iVar = new i(mVar, mVar.getContext(), mVar.x, LaunchActivity.R(), new bi.b(), 0);
            mVar.M = iVar;
            mVar.T = new org.telegram.ui.Components.na(mVar.O, iVar, 0, false);
            mVar.M.p(new a6.i(mVar, 15));
            bh.b bVar = mVar.h0;
            if (bVar != null) {
                i iVar2 = mVar.M;
                dh.d c10 = bVar.c(iVar2, null, false);
                c10.n(fh.b.i(mVar.a));
                iVar2.setBackgroundDrawable(c10);
            }
            mVar.b.addView(mVar.M, w7.x5.e(-1, -1, 83));
            mVar.w();
        }
        if (mVar.M.getAdapter() != null) {
            hg.k1 adapter = mVar.M.getAdapter();
            MessagesController.getInstance(mVar.U).getUser(Long.valueOf(mVar.x));
            TLRPC.Chat chat = MessagesController.getInstance(mVar.U).getChat(Long.valueOf(-mVar.x));
            adapter.getClass();
            adapter.l0 = chat;
            mVar.M.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
        }
    }
}
