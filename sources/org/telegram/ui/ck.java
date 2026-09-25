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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ck extends org.telegram.ui.Components.za0 {
    public boolean V;
    public final /* synthetic */ wn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(wn wnVar, Context context, long j3, long j10, wn wnVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, j3, j10, wnVar2, d6Var);
        this.W = wnVar;
        this.V = true;
    }

    @Override // org.telegram.ui.Components.za0
    public final boolean a() {
        wn wnVar = this.W;
        return wnVar.R.getVisibility() != 0 || wnVar.n3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.za0
    public final void j() {
        this.W.sc();
    }

    @Override // org.telegram.ui.Components.za0
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        wn wnVar = this.W;
        if (wnVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            wnVar.xa(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
        xl xlVar = wnVar.Ia;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.wu.J(wnVar, null, xlVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, wnVar.x9());
    }

    @Override // org.telegram.ui.Components.za0
    public final void l(boolean z10) {
        String string;
        wn wnVar = this.W;
        jk jkVar = wnVar.Y;
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
            org.telegram.ui.Components.xe xeVar = wnVar.Y.P1;
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

    @Override // org.telegram.ui.Components.za0
    public final void m() {
        wn wnVar = this.W;
        if (wnVar.Z4 && ((getAdapter().R == null || wnVar.a5 || wnVar.b5) && wnVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.ea);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                wnVar.showDialog(alertDialog$Builder.a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        wnVar.sc();
    }

    @Override // org.telegram.ui.Components.za0
    public final void n(boolean z10) {
        if (this.V != z10) {
            wn wnVar = this.W;
            AndroidUtilities.updateViewShow(wnVar.d1, !wnVar.isInPreviewMode() && z10, false, true);
            this.V = z10;
        }
    }
}
