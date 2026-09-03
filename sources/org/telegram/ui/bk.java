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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class bk extends org.telegram.ui.Components.ra0 {
    public boolean S;
    public final /* synthetic */ xn T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(xn xnVar, Context context, long j10, long j11, xn xnVar2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, j10, j11, xnVar2, g6Var);
        this.T = xnVar;
        this.S = true;
    }

    @Override // org.telegram.ui.Components.ra0
    public final boolean a() {
        xn xnVar = this.T;
        return xnVar.O.getVisibility() != 0 || xnVar.k3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ra0
    public final void j() {
        this.T.sc();
    }

    @Override // org.telegram.ui.Components.ra0
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        xn xnVar = this.T;
        if (xnVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            xnVar.xa(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
        yl ylVar = xnVar.Fa;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.ru.I(xnVar, null, ylVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, xnVar.x9());
    }

    @Override // org.telegram.ui.Components.ra0
    public final void l(boolean z4) {
        String string;
        xn xnVar = this.T;
        jk jkVar = xnVar.V;
        if (jkVar != null) {
            uf.u0 adapter = getAdapter();
            TLRPC.User user = adapter.t0;
            if (user != null) {
                string = user.bot_inline_placeholder;
            } else {
                String str = adapter.n0;
                string = (str == null || !str.equals("gif")) ? null : LocaleController.getString(R.string.SearchGifsTitle);
            }
            jkVar.setCaption(string);
            org.telegram.ui.Components.ne neVar = xnVar.V.L1;
            if (neVar == null) {
                return;
            }
            if (!z4) {
                neVar.e = false;
                return;
            }
            neVar.e = true;
            neVar.b = System.currentTimeMillis();
            neVar.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.Components.ra0
    public final void m() {
        xn xnVar = this.T;
        if (xnVar.W4 && ((getAdapter().O == null || xnVar.X4 || xnVar.Y4) && xnVar.h != null && getAdapter().O != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.ba);
                alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                xnVar.showDialog(alertDialog$Builder.a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        xnVar.sc();
    }

    @Override // org.telegram.ui.Components.ra0
    public final void n(boolean z4) {
        if (this.S != z4) {
            xn xnVar = this.T;
            AndroidUtilities.updateViewShow(xnVar.a1, !xnVar.isInPreviewMode() && z4, false, true);
            this.S = z4;
        }
    }
}
