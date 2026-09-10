package bi;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class j implements TextWatcher {
    public int a;
    public boolean b;
    public final /* synthetic */ o c;

    public j(o oVar) {
        this.c = oVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        o oVar = this.c;
        e eVar = oVar.c0;
        org.telegram.ui.Components.o6 o6Var = oVar.v;
        oVar.w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = oVar.getCaptionLimit();
        if (oVar.w + 25 > captionLimit) {
            str = "" + (captionLimit - oVar.w);
        } else {
            str = null;
        }
        o6Var.a();
        o6Var.setText(str);
        o6Var.setTextColor(oVar.w >= captionLimit ? -1280137 : -1);
        if (oVar.w > captionLimit && !UserConfig.getInstance(oVar.U).isPremium() && oVar.w < oVar.getCaptionPremiumLimit() && oVar.w > this.a && (oVar.e() || MessagesController.getInstance(oVar.U).premiumFeaturesBlocked())) {
            int i10 = -oVar.N;
            oVar.N = i10;
            AndroidUtilities.shakeViewSpring(o6Var, i10);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i11 = oVar.w;
        this.a = i11;
        boolean z10 = i11 > captionLimit;
        if (z10 != this.b) {
            oVar.q(z10);
        }
        this.b = z10;
        if (!oVar.V) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        oVar.V = false;
        AndroidUtilities.runOnUIThread(new a3.d(this, 11));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        o oVar = this.c;
        ObjectAnimator objectAnimator = oVar.g0;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            oVar.a0 = oVar.f.getEditText().getScrollY();
            oVar.W = true;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        o oVar = this.c;
        i iVar = oVar.f;
        if (iVar.getEditText().suppressOnTextChanged) {
            return;
        }
        if (oVar.M == null) {
            k kVar = new k(oVar, oVar.getContext(), oVar.x, LaunchActivity.R(), new zh.b(), 0);
            oVar.M = kVar;
            oVar.T = new org.telegram.ui.Components.ma(oVar.O, kVar, 0, false);
            oVar.M.p(new a6.i(oVar, 7));
            zg.a aVar = oVar.h0;
            if (aVar != null) {
                k kVar2 = oVar.M;
                bh.d c10 = aVar.c(kVar2, null, false);
                c10.n(dh.c.i(oVar.a));
                kVar2.setBackgroundDrawable(c10);
            }
            oVar.b.addView(oVar.M, w7.a6.e(-1, -1, 83));
            oVar.w();
        }
        if (oVar.M.getAdapter() != null) {
            fg.l1 adapter = oVar.M.getAdapter();
            MessagesController.getInstance(oVar.U).getUser(Long.valueOf(oVar.x));
            TLRPC.Chat chat = MessagesController.getInstance(oVar.U).getChat(Long.valueOf(-oVar.x));
            adapter.getClass();
            adapter.l0 = chat;
            oVar.M.getAdapter().U(charSequence, iVar.getEditText().getSelectionStart(), null, false, false);
        }
    }
}
