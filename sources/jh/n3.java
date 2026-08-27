package jh;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import hh.y9;
import java.net.URLDecoder;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class n3 extends a8 {
    public final /* synthetic */ i9 t0;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 u0;
    public final /* synthetic */ e4 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(e4 e4Var, Context context, b bVar, i9 i9Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, bVar);
        this.v0 = e4Var;
        this.t0 = i9Var;
        this.u0 = c6Var;
    }

    @Override // jh.a8
    public final void F(org.telegram.ui.Components.t5 t5Var) {
        if (t5Var != null) {
            e4 e4Var = this.v0;
            if (e4Var.M1 == null) {
                return;
            }
            TLRPC.Document document = t5Var.document;
            if (document == null) {
                document = org.telegram.ui.Components.k5.f(e4Var.y2, t5Var.documentId);
            }
            if (document == null) {
                return;
            }
            j3 j3Var = e4Var.Y0;
            org.telegram.ui.ActionBar.c6 c6Var = this.u0;
            ec h = new mc(j3Var, c6Var).h(document, 2, new gh.i(this, this.t0, c6Var, 4));
            if (h == null) {
                return;
            }
            h.a = 1;
            h.k(true);
        }
    }

    @Override // jh.a8
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof u41;
        i9 i9Var = this.t0;
        e4 e4Var = this.v0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(e4Var.y2).getUser(Utilities.parseLong(((u41) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(e4Var.y2).openChatOrProfileWith(user, null, i9Var.f, 0, false);
                return;
            }
            return;
        }
        if (!(characterStyle instanceof r41)) {
            if (characterStyle instanceof URLSpan) {
                M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof t41);
                return;
            }
            if (!(characterStyle instanceof q41)) {
                if (characterStyle instanceof ClickableSpan) {
                    ((ClickableSpan) characterStyle).onClick(view);
                    return;
                }
                return;
            } else {
                q41 q41Var = (q41) characterStyle;
                AndroidUtilities.addToClipboard(q41Var.a.subSequence(q41Var.b, q41Var.c).toString());
                rl.m(R.string.TextCopied, new mc(e4Var.Y0, this.u0));
                return;
            }
        }
        String url = ((r41) characterStyle).getURL();
        if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
            if (url.contains("@")) {
                i9Var.H(new q30(url, null));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("hashtag", url);
            i9Var.H(new o90(bundle, null));
            return;
        }
        String b10 = we.e.b(url);
        if (b10 == null) {
            M(0, url, characterStyle, false);
            return;
        }
        String lowerCase = b10.toLowerCase();
        if (url.startsWith("@")) {
            MessagesController.getInstance(e4Var.y2).openByUserName(lowerCase, i9Var.f, 0, null);
        } else {
            M(0, url, characterStyle, false);
        }
    }

    @Override // jh.a8
    public final void H(final URLSpan uRLSpan, final View view, y9 y9Var) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = we.e.v(parse, null, null, we.e.a(parse.getHost()), null);
            } catch (Exception e9) {
                FileLog.e((Throwable) e9, false);
            }
            str = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e10) {
            FileLog.e(e10);
            str = url2;
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.u0;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, c6Var, false, false);
        e3Var.fixNavigationBar();
        e3Var.title = str;
        e3Var.bigTitle = false;
        e3Var.multipleLinesTitle = true;
        e4 e4Var = this.v0;
        c4 c4Var = e4Var.K1;
        CharSequence[] charSequenceArr = (c4Var == null || c4Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.c6 c6Var2 = this.u0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: jh.m3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                n3 n3Var = n3.this;
                if (i10 == 0) {
                    n3Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new mc(n3Var.v0.Y0, c6Var2).k(false).j();
                }
            }
        };
        e3Var.items = charSequenceArr;
        e3Var.onClickListener = onClickListener;
        e3Var.setOnHideListener(new ag.j0(y9Var, 6));
        e3Var.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        ((z8) e4Var.M1).h(e3Var);
    }

    @Override // jh.a8
    public final void I(v7 v7Var) {
        if (v7Var == null) {
            return;
        }
        final TLRPC.Document document = v7Var.g;
        e4 e4Var = this.v0;
        i9 i9Var = this.t0;
        final org.telegram.ui.ActionBar.c6 c6Var = this.u0;
        if (document != null) {
            b70 F = b70.F(i9Var.v, c6Var, e4Var.G0);
            F.i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            final int i10 = 0;
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) { // from class: jh.k3
                public final /* synthetic */ n3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            e4 e4Var2 = this.b.v0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(e4Var2.y2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(e4Var2.y2).getClientUserId();
                            c4 c4Var = e4Var2.K1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, c4Var != null ? c4Var.a : null, null, false));
                            new mc(e4Var2.Y0, c6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new ag.l3(29))).k(true);
                            break;
                        default:
                            e4 e4Var3 = this.b.v0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(e4Var3.y2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(e4Var3.y2).sendRequest(tL_account_saveMusic, null);
                            new mc(e4Var3.Y0, c6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            break;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            final int i11 = 1;
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) { // from class: jh.k3
                public final /* synthetic */ n3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            e4 e4Var2 = this.b.v0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(e4Var2.y2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(e4Var2.y2).getClientUserId();
                            c4 c4Var = e4Var2.K1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, c4Var != null ? c4Var.a : null, null, false));
                            new mc(e4Var2.Y0, c6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new ag.l3(29))).k(true);
                            break;
                        default:
                            e4 e4Var3 = this.b.v0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(e4Var3.y2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(e4Var3.y2).sendRequest(tL_account_saveMusic, null);
                            new mc(e4Var3.Y0, c6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            break;
                    }
                }
            }, false);
            F.Z();
            return;
        }
        if (v7Var.e && v7Var.b != null && v7Var.d != null) {
            Bundle bundle = new Bundle();
            if (v7Var.b.longValue() >= 0) {
                bundle.putLong("user_id", v7Var.b.longValue());
            } else {
                bundle.putLong("chat_id", -v7Var.b.longValue());
            }
            bundle.putInt("message_id", v7Var.d.intValue());
            i9Var.H(new rn(bundle));
            return;
        }
        if (v7Var.b != null && v7Var.c != null) {
            MessagesController.getInstance(e4Var.y2).getStoriesController().d0(v7Var.b.longValue(), v7Var.c.intValue(), new cg.p1(this, v7Var, i9Var, c6Var, 1));
            return;
        }
        ec Q = new mc(e4Var.Y0, c6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
        Q.a = 3;
        Q.k(true);
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        xz0 xz0Var;
        if (z10 || AndroidUtilities.shouldShowUrlInAlert(str)) {
            i9 i9Var = this.t0;
            if (i10 == 0 || i10 == 2) {
                org.telegram.ui.Components.y4.r0(i9Var.f, str, true, true, true, (!(characterStyle instanceof t41) || (xz0Var = ((t41) characterStyle).a) == null || (xz0Var.a & 1024) == 0) ? false : true, null, null, this.u0);
                return;
            } else {
                if (i10 == 1) {
                    org.telegram.ui.Components.y4.r0(i9Var.f, str, true, true, false, false, null, null, this.u0);
                    return;
                }
                return;
            }
        }
        if (i10 == 0) {
            we.e.q(getContext(), Uri.parse(str), true, true, null);
        } else if (i10 == 1) {
            we.e.q(getContext(), Uri.parse(str), false, false, null);
        } else if (i10 == 2) {
            we.e.q(getContext(), Uri.parse(str), false, true, null);
        }
    }
}
