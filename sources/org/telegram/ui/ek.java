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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ek extends org.telegram.ui.Components.va0 {
    public boolean V;
    public final /* synthetic */ zn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(zn znVar, Context context, long j3, long j10, zn znVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, j3, j10, znVar2, f6Var);
        this.W = znVar;
        this.V = true;
    }

    @Override // org.telegram.ui.Components.va0
    public final boolean a() {
        zn znVar = this.W;
        return znVar.R.getVisibility() != 0 || znVar.n3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.va0
    public final void j() {
        this.W.sc();
    }

    @Override // org.telegram.ui.Components.va0
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        zn znVar = this.W;
        if (znVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            znVar.xa(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
        zl zlVar = znVar.Ia;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.vu.J(znVar, null, zlVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, znVar.x9());
    }

    @Override // org.telegram.ui.Components.va0
    public final void l(boolean z10) {
        String string;
        zn znVar = this.W;
        lk lkVar = znVar.Y;
        if (lkVar != null) {
            gg.k1 adapter = getAdapter();
            TLRPC.User user = adapter.w0;
            if (user != null) {
                string = user.bot_inline_placeholder;
            } else {
                String str = adapter.q0;
                string = (str == null || !str.equals("gif")) ? null : LocaleController.getString(R.string.SearchGifsTitle);
            }
            lkVar.setCaption(string);
            org.telegram.ui.Components.we weVar = znVar.Y.O1;
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

    @Override // org.telegram.ui.Components.va0
    public final void m() {
        zn znVar = this.W;
        if (znVar.Z4 && ((getAdapter().R == null || znVar.a5 || znVar.b5) && znVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.ea);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                znVar.showDialog(alertDialog$Builder.a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        znVar.sc();
    }

    @Override // org.telegram.ui.Components.va0
    public final void n(boolean z10) {
        if (this.V != z10) {
            zn znVar = this.W;
            AndroidUtilities.updateViewShow(znVar.d1, !znVar.isInPreviewMode() && z10, false, true);
            this.V = z10;
        }
    }
}
