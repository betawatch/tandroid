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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ck extends org.telegram.ui.Components.oa0 {
    public boolean V;
    public final /* synthetic */ xn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(xn xnVar, Context context, long j3, long j10, xn xnVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, j3, j10, xnVar2, d6Var);
        this.W = xnVar;
        this.V = true;
    }

    @Override // org.telegram.ui.Components.oa0
    public final boolean a() {
        xn xnVar = this.W;
        return xnVar.R.getVisibility() != 0 || xnVar.n3;
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
        xn xnVar = this.W;
        if (xnVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            xnVar.xa(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
        yl ylVar = xnVar.Ia;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.wu.J(xnVar, null, ylVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, xnVar.x9());
    }

    @Override // org.telegram.ui.Components.oa0
    public final void l(boolean z10) {
        String string;
        xn xnVar = this.W;
        jk jkVar = xnVar.Y;
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
            org.telegram.ui.Components.we weVar = xnVar.Y.O1;
            if (weVar == null) {
                return;
            }
            if (!z10) {
                weVar.e = false;
                return;
            }
            weVar.e = true;
            weVar.b = System.currentTimeMillis();
            weVar.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.Components.oa0
    public final void m() {
        xn xnVar = this.W;
        if (xnVar.Z4 && ((getAdapter().R == null || xnVar.a5 || xnVar.b5) && xnVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.ea);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                xnVar.showDialog(alertDialog$Builder.a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        xnVar.sc();
    }

    @Override // org.telegram.ui.Components.oa0
    public final void n(boolean z10) {
        if (this.V != z10) {
            xn xnVar = this.W;
            AndroidUtilities.updateViewShow(xnVar.d1, !xnVar.isInPreviewMode() && z10, false, true);
            this.V = z10;
        }
    }
}
