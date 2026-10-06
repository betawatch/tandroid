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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ck extends org.telegram.ui.Components.bb0 {
    public boolean V;
    public final /* synthetic */ yn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(yn ynVar, Context context, long j3, long j10, yn ynVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, j3, j10, ynVar2, d6Var);
        this.W = ynVar;
        this.V = true;
    }

    @Override // org.telegram.ui.Components.bb0
    public final boolean a() {
        yn ynVar = this.W;
        return ynVar.P.getVisibility() != 0 || ynVar.l3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.bb0
    public final void j() {
        this.W.rc();
    }

    @Override // org.telegram.ui.Components.bb0
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        yn ynVar = this.W;
        if (ynVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            ynVar.wa(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
        xl xlVar = ynVar.Ga;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.zu.H(ynVar, null, xlVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, ynVar.w9());
    }

    @Override // org.telegram.ui.Components.bb0
    public final void l(boolean z10) {
        String string;
        yn ynVar = this.W;
        jk jkVar = ynVar.W;
        if (jkVar != null) {
            gg.k1 adapter = getAdapter();
            TLRPC.User user = adapter.w0;
            if (user != null) {
                string = user.bot_inline_placeholder;
            } else {
                String str = adapter.q0;
                string = (str == null || !str.equals("gif")) ? null : LocaleController.getString(R.string.SearchGifsTitle);
            }
            jkVar.setCaption(string);
            org.telegram.ui.Components.ye yeVar = ynVar.W.P1;
            if (yeVar == null) {
                return;
            }
            if (!z10) {
                yeVar.e = false;
                return;
            }
            yeVar.e = true;
            yeVar.b = System.currentTimeMillis();
            yeVar.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.Components.bb0
    public final void m() {
        yn ynVar = this.W;
        if (ynVar.X4 && ((getAdapter().R == null || ynVar.Y4 || ynVar.Z4) && ynVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity(), 0, ynVar.ca);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                ynVar.showDialog(alertDialog$Builder.a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        ynVar.rc();
    }

    @Override // org.telegram.ui.Components.bb0
    public final void n(boolean z10) {
        if (this.V != z10) {
            yn ynVar = this.W;
            AndroidUtilities.updateViewShow(ynVar.b1, !ynVar.isInPreviewMode() && z10, false, true);
            this.V = z10;
        }
    }
}
