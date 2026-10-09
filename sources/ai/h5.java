package ai;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
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
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class h5 extends ya {
    public final /* synthetic */ kc x0;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 y0;
    public final /* synthetic */ f6 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(f6 f6Var, Context context, d dVar, kc kcVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, dVar);
        this.z0 = f6Var;
        this.x0 = kcVar;
        this.y0 = e6Var;
    }

    @Override // ai.ya
    public final void F(org.telegram.ui.Components.b6 b6Var) {
        if (b6Var != null) {
            f6 f6Var = this.z0;
            if (f6Var.Q1 == null) {
                return;
            }
            TLRPC.Document document = b6Var.document;
            if (document == null) {
                document = org.telegram.ui.Components.s5.f(f6Var.C2, b6Var.documentId);
            }
            if (document == null) {
                return;
            }
            b5 b5Var = f6Var.c1;
            org.telegram.ui.ActionBar.e6 e6Var = this.y0;
            org.telegram.ui.Components.tc h = new ad(b5Var, e6Var).h(document, 2, new d5(this, this.x0, e6Var, 0));
            if (h == null) {
                return;
            }
            h.a = 1;
            h.k(true);
        }
    }

    @Override // ai.ya
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof w61;
        kc kcVar = this.x0;
        f6 f6Var = this.z0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(f6Var.C2).getUser(Utilities.parseLong(((w61) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(f6Var.C2).openChatOrProfileWith(user, null, kcVar.f, 0, false);
                return;
            }
            return;
        }
        if (!(characterStyle instanceof t61)) {
            if (characterStyle instanceof URLSpan) {
                M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof v61);
                return;
            }
            if (!(characterStyle instanceof s61)) {
                if (characterStyle instanceof ClickableSpan) {
                    ((ClickableSpan) characterStyle).onClick(view);
                    return;
                }
                return;
            } else {
                s61 s61Var = (s61) characterStyle;
                AndroidUtilities.addToClipboard(s61Var.a.subSequence(s61Var.b, s61Var.c).toString());
                bi.p(R.string.TextCopied, new ad(f6Var.c1, this.y0));
                return;
            }
        }
        String url = ((t61) characterStyle).getURL();
        if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
            if (url.contains("@")) {
                kcVar.H(new s40(url, null));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("hashtag", url);
            kcVar.H(new db0(bundle, null));
            return;
        }
        String b10 = of.f.b(url);
        if (b10 == null) {
            M(0, url, characterStyle, false);
            return;
        }
        String lowerCase = b10.toLowerCase();
        if (url.startsWith("@")) {
            MessagesController.getInstance(f6Var.C2).openByUserName(lowerCase, kcVar.f, 0, null);
        } else {
            M(0, url, characterStyle, false);
        }
    }

    @Override // ai.ya
    public final void H(final URLSpan uRLSpan, final View view, a3.d dVar) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = of.f.v(parse, null, null, of.f.a(parse.getHost()), null);
            } catch (Exception e7) {
                FileLog.e((Throwable) e7, false);
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
        org.telegram.ui.ActionBar.e6 e6Var = this.y0;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, e6Var, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        f3Var.multipleLinesTitle = true;
        f6 f6Var = this.z0;
        d6 d6Var = f6Var.O1;
        CharSequence[] charSequenceArr = (d6Var == null || d6Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.e6 e6Var2 = this.y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ai.f5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                h5 h5Var = h5.this;
                if (i10 == 0) {
                    h5Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new ad(h5Var.z0.c1, e6Var2).k(false).j();
                }
            }
        };
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = onClickListener;
        f3Var.setOnHideListener(new g5(dVar, 0));
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.h5, e6Var));
        ((bc) f6Var.Q1).h(f3Var);
    }

    @Override // ai.ya
    public final void I(ta taVar) {
        if (taVar == null) {
            return;
        }
        final TLRPC.Document document = taVar.g;
        f6 f6Var = this.z0;
        kc kcVar = this.x0;
        final org.telegram.ui.ActionBar.e6 e6Var = this.y0;
        if (document != null) {
            p80 F = p80.F(kcVar.v, e6Var, f6Var.K0);
            F.i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            final int i10 = 0;
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) { // from class: ai.c5
                public final /* synthetic */ h5 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            f6 f6Var2 = this.b.z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(f6Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(f6Var2.C2).getClientUserId();
                            d6 d6Var = f6Var2.O1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, d6Var != null ? d6Var.a : null, null, false));
                            new ad(f6Var2.c1, e6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new f(25))).k(true);
                            break;
                        default:
                            f6 f6Var3 = this.b.z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(f6Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(f6Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new ad(f6Var3.c1, e6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            break;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            final int i11 = 1;
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) { // from class: ai.c5
                public final /* synthetic */ h5 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            f6 f6Var2 = this.b.z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(f6Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(f6Var2.C2).getClientUserId();
                            d6 d6Var = f6Var2.O1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, d6Var != null ? d6Var.a : null, null, false));
                            new ad(f6Var2.c1, e6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new f(25))).k(true);
                            break;
                        default:
                            f6 f6Var3 = this.b.z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(f6Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(f6Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new ad(f6Var3.c1, e6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            break;
                    }
                }
            }, false);
            F.Z();
            return;
        }
        if (taVar.e && taVar.b != null && taVar.d != null) {
            Bundle bundle = new Bundle();
            if (taVar.b.longValue() >= 0) {
                bundle.putLong("user_id", taVar.b.longValue());
            } else {
                bundle.putLong("chat_id", -taVar.b.longValue());
            }
            bundle.putInt("message_id", taVar.d.intValue());
            kcVar.H(new zn(bundle));
            return;
        }
        if (taVar.b != null && taVar.c != null) {
            MessagesController.getInstance(f6Var.C2).getStoriesController().d0(taVar.b.longValue(), taVar.c.intValue(), new f4(this, taVar, kcVar, e6Var, 1));
            return;
        }
        org.telegram.ui.Components.tc Q = new ad(f6Var.c1, e6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
        Q.a = 3;
        Q.k(true);
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        t11 t11Var;
        if (z10 || AndroidUtilities.shouldShowUrlInAlert(str)) {
            kc kcVar = this.x0;
            if (i10 == 0 || i10 == 2) {
                org.telegram.ui.Components.g5.q0(kcVar.f, str, true, true, true, (!(characterStyle instanceof v61) || (t11Var = ((v61) characterStyle).a) == null || (t11Var.a & 1024) == 0) ? false : true, null, null, this.y0);
                return;
            } else {
                if (i10 == 1) {
                    org.telegram.ui.Components.g5.q0(kcVar.f, str, true, true, false, false, null, null, this.y0);
                    return;
                }
                return;
            }
        }
        if (i10 == 0) {
            of.f.q(getContext(), Uri.parse(str), true, true, null);
        } else if (i10 == 1) {
            of.f.q(getContext(), Uri.parse(str), false, false, null);
        } else if (i10 == 2) {
            of.f.q(getContext(), Uri.parse(str), false, true, null);
        }
    }
}
