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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class hk extends org.telegram.ui.Components.xa0 {
    public boolean V;
    public final /* synthetic */ eo W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(eo eoVar, Context context, long j3, long j10, eo eoVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, j3, j10, eoVar2, f6Var);
        this.W = eoVar;
        this.V = true;
    }

    @Override // org.telegram.ui.Components.xa0
    public final boolean a() {
        eo eoVar = this.W;
        return eoVar.R.getVisibility() != 0 || eoVar.n3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.xa0
    public final void j() {
        this.W.sc();
    }

    @Override // org.telegram.ui.Components.xa0
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        eo eoVar = this.W;
        if (eoVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            eoVar.xa(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
        dm dmVar = eoVar.Ia;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.zu.J(eoVar, null, dmVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, eoVar.x9());
    }

    @Override // org.telegram.ui.Components.xa0
    public final void l(boolean z10) {
        String string;
        eo eoVar = this.W;
        ok okVar = eoVar.Y;
        if (okVar != null) {
            fg.l1 adapter = getAdapter();
            TLRPC.User user = adapter.w0;
            if (user != null) {
                string = user.bot_inline_placeholder;
            } else {
                String str = adapter.q0;
                string = (str == null || !str.equals("gif")) ? null : LocaleController.getString(R.string.SearchGifsTitle);
            }
            okVar.setCaption(string);
            org.telegram.ui.Components.xe xeVar = eoVar.Y.O1;
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

    @Override // org.telegram.ui.Components.xa0
    public final void m() {
        eo eoVar = this.W;
        if (eoVar.Z4 && ((getAdapter().R == null || eoVar.a5 || eoVar.b5) && eoVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.ea);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                eoVar.showDialog(alertDialog$Builder.a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        eoVar.sc();
    }

    @Override // org.telegram.ui.Components.xa0
    public final void n(boolean z10) {
        if (this.V != z10) {
            eo eoVar = this.W;
            AndroidUtilities.updateViewShow(eoVar.d1, !eoVar.isInPreviewMode() && z10, false, true);
            this.V = z10;
        }
    }
}
