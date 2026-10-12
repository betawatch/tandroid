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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class kk extends org.telegram.ui.Components.ob0 {
    public boolean V;
    public final /* synthetic */ fo W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(fo foVar, Context context, long j10, long j11, fo foVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, j10, j11, foVar2, c6Var);
        this.W = foVar;
        this.V = true;
    }

    @Override // org.telegram.ui.Components.ob0
    public final boolean a() {
        fo foVar = this.W;
        return foVar.R.getVisibility() != 0 || foVar.n3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ob0
    public final void j() {
        this.W.wc();
    }

    @Override // org.telegram.ui.Components.ob0
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        fo foVar = this.W;
        if (foVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            foVar.Ba(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
        oi oiVar = foVar.Ja;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.hv.J(foVar, null, oiVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, foVar.C9());
    }

    @Override // org.telegram.ui.Components.ob0
    public final void l(boolean z10) {
        String string;
        fo foVar = this.W;
        sk skVar = foVar.Y;
        if (skVar != null) {
            hg.j1 adapter = getAdapter();
            TLRPC.User user = adapter.w0;
            if (user != null) {
                string = user.bot_inline_placeholder;
            } else {
                String str = adapter.q0;
                string = (str == null || !str.equals("gif")) ? null : LocaleController.getString(R.string.SearchGifsTitle);
            }
            skVar.setCaption(string);
            org.telegram.ui.Components.ye yeVar = foVar.Y.P1;
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

    @Override // org.telegram.ui.Components.ob0
    public final void m() {
        fo foVar = this.W;
        if (foVar.Z4 && ((getAdapter().R == null || foVar.a5 || foVar.b5) && foVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar.getParentActivity(), 0, foVar.ea);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                foVar.showDialog(alertDialog$Builder.a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        foVar.wc();
    }

    @Override // org.telegram.ui.Components.ob0
    public final void n(boolean z10) {
        if (this.V != z10) {
            fo foVar = this.W;
            AndroidUtilities.updateViewShow(foVar.d1, !foVar.isInPreviewMode() && z10, false, true);
            this.V = z10;
        }
    }
}
