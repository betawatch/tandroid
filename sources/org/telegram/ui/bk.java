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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bk extends org.telegram.ui.Components.hb0 {
    public boolean V;
    public final /* synthetic */ wn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(wn wnVar, Context context, long j10, long j11, wn wnVar2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, j10, j11, wnVar2, u6Var);
        this.W = wnVar;
        this.V = true;
    }

    @Override // org.telegram.ui.Components.hb0
    public final boolean a() {
        wn wnVar = this.W;
        return wnVar.R.getVisibility() != 0 || wnVar.z3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.hb0
    public final void j() {
        this.W.Jc();
    }

    @Override // org.telegram.ui.Components.hb0
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        wn wnVar = this.W;
        if (wnVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            wnVar.Ja(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
        fi fiVar = wnVar.Za;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.dv.I(wnVar, null, fiVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, wnVar.I9());
    }

    @Override // org.telegram.ui.Components.hb0
    public final void l(boolean z10) {
        String string;
        wn wnVar = this.W;
        jk jkVar = wnVar.Y;
        if (jkVar != null) {
            ig.j1 adapter = getAdapter();
            TLRPC.User user = adapter.w0;
            if (user != null) {
                string = user.bot_inline_placeholder;
            } else {
                String str = adapter.q0;
                string = (str == null || !str.equals("gif")) ? null : LocaleController.getString(R.string.SearchGifsTitle);
            }
            jkVar.setCaption(string);
            org.telegram.ui.Components.we weVar = wnVar.Y.P1;
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

    @Override // org.telegram.ui.Components.hb0
    public final void m() {
        wn wnVar = this.W;
        if (wnVar.p5 && ((getAdapter().R == null || wnVar.q5 || wnVar.r5) && wnVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.ua);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                wnVar.showDialog(alertDialog$Builder.a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        wnVar.Jc();
    }

    @Override // org.telegram.ui.Components.hb0
    public final void n(boolean z10) {
        if (this.V != z10) {
            wn wnVar = this.W;
            AndroidUtilities.updateViewShow(wnVar.p1, !wnVar.isInPreviewMode() && z10, false, true);
            this.V = z10;
        }
    }
}
