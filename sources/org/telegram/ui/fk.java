package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class fk extends org.telegram.ui.Components.oa0 {
    public boolean V;
    public final /* synthetic */ co W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(co coVar, Context context, long j3, long j10, co coVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, j3, j10, coVar2, f6Var);
        this.W = coVar;
        this.V = true;
    }

    @Override // org.telegram.ui.Components.oa0
    public final boolean a() {
        co coVar = this.W;
        return coVar.R.getVisibility() != 0 || coVar.n3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.oa0
    public final void j() {
        this.W.sc();
    }

    @Override // org.telegram.ui.Components.oa0
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        co coVar = this.W;
        if (coVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            coVar.xa(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
        bm bmVar = coVar.Ia;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.tu.J(coVar, null, bmVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, coVar.x9());
    }

    @Override // org.telegram.ui.Components.oa0
    public final void l(boolean z10) {
        String string;
        co coVar = this.W;
        mk mkVar = coVar.Y;
        if (mkVar != null) {
            hg.k1 adapter = getAdapter();
            TLRPC.User user = adapter.w0;
            if (user != null) {
                string = user.bot_inline_placeholder;
            } else {
                String str = adapter.q0;
                string = (str == null || !str.equals("gif")) ? null : LocaleController.getString(R.string.SearchGifsTitle);
            }
            mkVar.setCaption(string);
            org.telegram.ui.Components.xe xeVar = coVar.Y.O1;
            if (xeVar == null) {
                return;
            }
            if (!z10) {
                xeVar.e = false;
                return;
            }
            xeVar.e = true;
            xeVar.b = System.currentTimeMillis();
            xeVar.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.Components.oa0
    public final void m() {
        co coVar = this.W;
        if (coVar.Z4 && ((getAdapter().R == null || coVar.a5 || coVar.b5) && coVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(coVar.getParentActivity(), 0, coVar.ea);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                coVar.showDialog(alertDialog$Builder.a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        coVar.sc();
    }

    @Override // org.telegram.ui.Components.oa0
    public final void n(boolean z10) {
        if (this.V != z10) {
            co coVar = this.W;
            AndroidUtilities.updateViewShow(coVar.d1, !coVar.isInPreviewMode() && z10, false, true);
            this.V = z10;
        }
    }
}
