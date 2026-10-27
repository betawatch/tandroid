package di;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import bi.cb;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.z11;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class u3 extends p8 {
    public final /* synthetic */ y9 x0;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 y0;
    public final /* synthetic */ q4 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(q4 q4Var, Context context, b bVar, y9 y9Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, bVar);
        this.z0 = q4Var;
        this.x0 = y9Var;
        this.y0 = u6Var;
    }

    @Override // di.p8
    public final void F(org.telegram.ui.Components.c6 c6Var) {
        if (c6Var != null) {
            q4 q4Var = this.z0;
            if (q4Var.F1 == null) {
                return;
            }
            TLRPC.Document document = c6Var.document;
            if (document == null) {
                document = org.telegram.ui.Components.t5.f(q4Var.r2, c6Var.documentId);
            }
            if (document == null) {
                return;
            }
            q3 q3Var = q4Var.R0;
            org.telegram.ui.ActionBar.u6 u6Var = this.y0;
            qc h = new wc(q3Var, u6Var).h(document, 2, new bi.v3(this, this.x0, u6Var, 1));
            if (h == null) {
                return;
            }
            h.a = 1;
            h.k(true);
        }
    }

    @Override // di.p8
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof b71;
        y9 y9Var = this.x0;
        q4 q4Var = this.z0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(q4Var.r2).getUser(Utilities.parseLong(((b71) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(q4Var.r2).openChatOrProfileWith(user, null, y9Var.f, 0, false);
                return;
            }
            return;
        }
        if (!(characterStyle instanceof y61)) {
            if (characterStyle instanceof URLSpan) {
                M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof a71);
                return;
            }
            if (!(characterStyle instanceof x61)) {
                if (characterStyle instanceof ClickableSpan) {
                    ((ClickableSpan) characterStyle).onClick(view);
                    return;
                }
                return;
            } else {
                x61 x61Var = (x61) characterStyle;
                AndroidUtilities.addToClipboard(x61Var.a.subSequence(x61Var.b, x61Var.c).toString());
                wh.m(R.string.TextCopied, new wc(q4Var.R0, this.y0));
                return;
            }
        }
        String url = ((y61) characterStyle).getURL();
        if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
            if (url.contains("@")) {
                y9Var.I(new m40(url, null));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("hashtag", url);
            y9Var.I(new ua0(bundle, null));
            return;
        }
        String b10 = qf.d.b(url);
        if (b10 == null) {
            M(0, url, characterStyle, false);
            return;
        }
        String lowerCase = b10.toLowerCase();
        if (url.startsWith("@")) {
            MessagesController.getInstance(q4Var.r2).openByUserName(lowerCase, y9Var.f, 0, null);
        } else {
            M(0, url, characterStyle, false);
        }
    }

    @Override // di.p8
    public final void H(final URLSpan uRLSpan, final View view, bi.u6 u6Var) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = qf.d.u(parse, null, null, qf.d.a(parse.getHost()), null);
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
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
        org.telegram.ui.ActionBar.u6 u6Var2 = this.y0;
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, context, u6Var2, false);
        k3Var.fixNavigationBar();
        k3Var.title = str;
        k3Var.bigTitle = false;
        k3Var.multipleLinesTitle = true;
        q4 q4Var = this.z0;
        o4 o4Var = q4Var.D1;
        CharSequence[] charSequenceArr = (o4Var == null || o4Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.u6 u6Var3 = this.y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: di.t3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                u3 u3Var = u3.this;
                if (i10 == 0) {
                    u3Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new wc(u3Var.z0.R0, u6Var3).k(false).j();
                }
            }
        };
        k3Var.items = charSequenceArr;
        k3Var.onClickListener = onClickListener;
        k3Var.setOnHideListener(new cb(u6Var, 3));
        k3Var.fixNavigationBar(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h5, u6Var2));
        ((p9) q4Var.F1).h(k3Var);
    }

    @Override // di.p8
    public final void I(k8 k8Var) {
        if (k8Var == null) {
            return;
        }
        final TLRPC.Document document = k8Var.g;
        q4 q4Var = this.z0;
        y9 y9Var = this.x0;
        final org.telegram.ui.ActionBar.u6 u6Var = this.y0;
        if (document != null) {
            l80 F = l80.F(y9Var.v, u6Var, q4Var.z0);
            F.i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            final int i10 = 0;
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) { // from class: di.r3
                public final /* synthetic */ u3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            q4 q4Var2 = this.b.z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(q4Var2.r2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(q4Var2.r2).getClientUserId();
                            o4 o4Var = q4Var2.D1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, o4Var != null ? o4Var.a : null, null, false));
                            new wc(q4Var2.R0, u6Var).R(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new org.telegram.ui.Components.k5(2))).k(true);
                            break;
                        default:
                            q4 q4Var3 = this.b.z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(q4Var3.r2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(q4Var3.r2).sendRequest(tL_account_saveMusic, null);
                            new wc(q4Var3.R0, u6Var).R(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            break;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            final int i11 = 1;
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) { // from class: di.r3
                public final /* synthetic */ u3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            q4 q4Var2 = this.b.z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(q4Var2.r2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(q4Var2.r2).getClientUserId();
                            o4 o4Var = q4Var2.D1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, o4Var != null ? o4Var.a : null, null, false));
                            new wc(q4Var2.R0, u6Var).R(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new org.telegram.ui.Components.k5(2))).k(true);
                            break;
                        default:
                            q4 q4Var3 = this.b.z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(q4Var3.r2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(q4Var3.r2).sendRequest(tL_account_saveMusic, null);
                            new wc(q4Var3.R0, u6Var).R(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            break;
                    }
                }
            }, false);
            F.Z();
            return;
        }
        if (k8Var.e && k8Var.b != null && k8Var.d != null) {
            Bundle bundle = new Bundle();
            if (k8Var.b.longValue() >= 0) {
                bundle.putLong("user_id", k8Var.b.longValue());
            } else {
                bundle.putLong("chat_id", -k8Var.b.longValue());
            }
            bundle.putInt("message_id", k8Var.d.intValue());
            y9Var.I(new wn(bundle));
            return;
        }
        if (k8Var.b != null && k8Var.c != null) {
            MessagesController.getInstance(q4Var.r2).getStoriesController().g0(k8Var.b.longValue(), k8Var.c.intValue(), new y2(this, k8Var, y9Var, u6Var, 1));
            return;
        }
        qc R = new wc(q4Var.R0, u6Var).R(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
        R.a = 3;
        R.k(true);
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        z11 z11Var;
        if (z10 || AndroidUtilities.shouldShowUrlInAlert(str)) {
            y9 y9Var = this.x0;
            if (i10 == 0 || i10 == 2) {
                org.telegram.ui.Components.g5.q0(y9Var.f, str, true, true, true, (!(characterStyle instanceof a71) || (z11Var = ((a71) characterStyle).a) == null || (z11Var.a & 1024) == 0) ? false : true, null, null, this.y0);
                return;
            } else {
                if (i10 == 1) {
                    org.telegram.ui.Components.g5.q0(y9Var.f, str, true, true, false, false, null, null, this.y0);
                    return;
                }
                return;
            }
        }
        if (i10 == 0) {
            qf.d.p(getContext(), Uri.parse(str), true, true, null);
        } else if (i10 == 1) {
            qf.d.p(getContext(), Uri.parse(str), false, false, null);
        } else if (i10 == 2) {
            qf.d.p(getContext(), Uri.parse(str), false, true, null);
        }
    }
}
