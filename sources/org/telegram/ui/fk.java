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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class fk extends org.telegram.ui.Components.na0 {
    public boolean V;
    public final /* synthetic */ bo W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(bo boVar, Context context, long j3, long j10, bo boVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, j3, j10, boVar2, e6Var);
        this.W = boVar;
        this.V = true;
    }

    @Override // org.telegram.ui.Components.na0
    public final boolean a() {
        bo boVar = this.W;
        return boVar.R.getVisibility() != 0 || boVar.n3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.na0
    public final void j() {
        this.W.sc();
    }

    @Override // org.telegram.ui.Components.na0
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        bo boVar = this.W;
        if (boVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !botInlineResult.type.equals("web_player_video")) {
            boVar.xa(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
        bm bmVar = boVar.Ia;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.vu.J(boVar, null, bmVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, boVar.x9());
    }

    @Override // org.telegram.ui.Components.na0
    public final void l(boolean z10) {
        String string;
        bo boVar = this.W;
        mk mkVar = boVar.Y;
        if (mkVar != null) {
            gg.k1 adapter = getAdapter();
            TLRPC.User user = adapter.w0;
            if (user != null) {
                string = user.bot_inline_placeholder;
            } else {
                String str = adapter.q0;
                string = (str == null || !str.equals("gif")) ? null : LocaleController.getString(R.string.SearchGifsTitle);
            }
            mkVar.setCaption(string);
            org.telegram.ui.Components.ue ueVar = boVar.Y.O1;
            if (ueVar == null) {
                return;
            }
            if (!z10) {
                ueVar.e = false;
                return;
            }
            ueVar.e = true;
            ueVar.b = System.currentTimeMillis();
            ueVar.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.Components.na0
    public final void m() {
        bo boVar = this.W;
        if (boVar.Z4 && ((getAdapter().R == null || boVar.a5 || boVar.b5) && boVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(boVar.getParentActivity(), 0, boVar.ea);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                boVar.showDialog(alertDialog$Builder.a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        boVar.sc();
    }

    @Override // org.telegram.ui.Components.na0
    public final void n(boolean z10) {
        if (this.V != z10) {
            bo boVar = this.W;
            AndroidUtilities.updateViewShow(boVar.d1, !boVar.isInPreviewMode() && z10, false, true);
            this.V = z10;
        }
    }
}
