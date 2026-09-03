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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class dk extends org.telegram.ui.Components.qa0 {
    public boolean S;
    public final /* synthetic */ zn T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(zn znVar, Context context, long j10, long j11, zn znVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, j10, j11, znVar2, f6Var);
        this.T = znVar;
        this.S = true;
    }

    @Override // org.telegram.ui.Components.qa0
    public final boolean a() {
        zn znVar = this.T;
        return znVar.O.getVisibility() != 0 || znVar.k3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.qa0
    public final void j() {
        this.T.sc();
    }

    @Override // org.telegram.ui.Components.qa0
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        zn znVar = this.T;
        if (znVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            znVar.xa(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
        am amVar = znVar.Fa;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.ou.I(znVar, null, amVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, znVar.x9());
    }

    @Override // org.telegram.ui.Components.qa0
    public final void l(boolean z4) {
        String string;
        zn znVar = this.T;
        lk lkVar = znVar.V;
        if (lkVar != null) {
            tf.u0 adapter = getAdapter();
            TLRPC.User user = adapter.t0;
            if (user != null) {
                string = user.bot_inline_placeholder;
            } else {
                String str = adapter.n0;
                string = (str == null || !str.equals("gif")) ? null : LocaleController.getString(R.string.SearchGifsTitle);
            }
            lkVar.setCaption(string);
            org.telegram.ui.Components.ne neVar = znVar.V.L1;
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

    @Override // org.telegram.ui.Components.qa0
    public final void m() {
        zn znVar = this.T;
        if (znVar.W4 && ((getAdapter().O == null || znVar.X4 || znVar.Y4) && znVar.h != null && getAdapter().O != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.ba);
                alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                znVar.showDialog(alertDialog$Builder.a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        znVar.sc();
    }

    @Override // org.telegram.ui.Components.qa0
    public final void n(boolean z4) {
        if (this.S != z4) {
            zn znVar = this.T;
            AndroidUtilities.updateViewShow(znVar.a1, !znVar.isInPreviewMode() && z4, false, true);
            this.S = z4;
        }
    }
}
