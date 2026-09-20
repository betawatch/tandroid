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
import org.telegram.messenger.rk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z51;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class h5 extends xa {
    public final /* synthetic */ jc x0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 y0;
    public final /* synthetic */ f6 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(f6 f6Var, Context context, d dVar, jc jcVar, org.telegram.ui.ActionBar.f6 f6Var2) {
        super(context, dVar);
        this.z0 = f6Var;
        this.x0 = jcVar;
        this.y0 = f6Var2;
    }

    @Override // ai.xa
    public final void F(org.telegram.ui.Components.y5 y5Var) {
        if (y5Var != null) {
            f6 f6Var = this.z0;
            if (f6Var.Q1 == null) {
                return;
            }
            TLRPC.Document document = y5Var.document;
            if (document == null) {
                document = org.telegram.ui.Components.p5.f(f6Var.C2, y5Var.documentId);
            }
            if (document == null) {
                return;
            }
            a5 a5Var = f6Var.c1;
            org.telegram.ui.ActionBar.f6 f6Var2 = this.y0;
            org.telegram.ui.Components.pc h = new xc(a5Var, f6Var2).h(document, 2, new d5(this, this.x0, f6Var2, 0));
            if (h == null) {
                return;
            }
            h.a = 1;
            h.k(true);
        }
    }

    @Override // ai.xa
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof d61;
        jc jcVar = this.x0;
        f6 f6Var = this.z0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(f6Var.C2).getUser(Utilities.parseLong(((d61) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(f6Var.C2).openChatOrProfileWith(user, null, jcVar.f, 0, false);
                return;
            }
            return;
        }
        if (!(characterStyle instanceof a61)) {
            if (characterStyle instanceof URLSpan) {
                M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof c61);
                return;
            }
            if (!(characterStyle instanceof z51)) {
                if (characterStyle instanceof ClickableSpan) {
                    ((ClickableSpan) characterStyle).onClick(view);
                    return;
                }
                return;
            } else {
                z51 z51Var = (z51) characterStyle;
                AndroidUtilities.addToClipboard(z51Var.a.subSequence(z51Var.b, z51Var.c).toString());
                rk.o(R.string.TextCopied, new xc(f6Var.c1, this.y0));
                return;
            }
        }
        String url = ((a61) characterStyle).getURL();
        if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
            if (url.contains("@")) {
                jcVar.H(new b40(url, null));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("hashtag", url);
            jcVar.H(new ja0(bundle, null));
            return;
        }
        String b10 = nf.f.b(url);
        if (b10 == null) {
            M(0, url, characterStyle, false);
            return;
        }
        String lowerCase = b10.toLowerCase();
        if (url.startsWith("@")) {
            MessagesController.getInstance(f6Var.C2).openByUserName(lowerCase, jcVar.f, 0, null);
        } else {
            M(0, url, characterStyle, false);
        }
    }

    @Override // ai.xa
    public final void H(final URLSpan uRLSpan, final View view, a3.d dVar) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = nf.f.v(parse, null, null, nf.f.a(parse.getHost()), null);
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
            str = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e7) {
            FileLog.e(e7);
            str = url2;
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.y0;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, f6Var, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        f3Var.multipleLinesTitle = true;
        f6 f6Var2 = this.z0;
        d6 d6Var = f6Var2.O1;
        CharSequence[] charSequenceArr = (d6Var == null || d6Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.f6 f6Var3 = this.y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ai.f5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                h5 h5Var = h5.this;
                if (i10 == 0) {
                    h5Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new xc(h5Var.z0.c1, f6Var3).k(false).j();
                }
            }
        };
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = onClickListener;
        f3Var.setOnHideListener(new g5(dVar, 0));
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        ((ac) f6Var2.Q1).h(f3Var);
    }

    @Override // ai.xa
    public final void I(sa saVar) {
        if (saVar == null) {
            return;
        }
        final TLRPC.Document document = saVar.g;
        f6 f6Var = this.z0;
        jc jcVar = this.x0;
        final org.telegram.ui.ActionBar.f6 f6Var2 = this.y0;
        if (document != null) {
            v70 F = v70.F(jcVar.v, f6Var2, f6Var.K0);
            F.i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            final int i10 = 0;
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) { // from class: ai.b5
                public final /* synthetic */ h5 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            f6 f6Var3 = this.b.z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(f6Var3.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(f6Var3.C2).getClientUserId();
                            d6 d6Var = f6Var3.O1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, d6Var != null ? d6Var.a : null, null, false));
                            new xc(f6Var3.c1, f6Var2).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new f(25))).k(true);
                            break;
                        default:
                            f6 f6Var4 = this.b.z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(f6Var4.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(f6Var4.C2).sendRequest(tL_account_saveMusic, null);
                            new xc(f6Var4.c1, f6Var2).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            break;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            final int i11 = 1;
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) { // from class: ai.b5
                public final /* synthetic */ h5 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            f6 f6Var3 = this.b.z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(f6Var3.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(f6Var3.C2).getClientUserId();
                            d6 d6Var = f6Var3.O1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, d6Var != null ? d6Var.a : null, null, false));
                            new xc(f6Var3.c1, f6Var2).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new f(25))).k(true);
                            break;
                        default:
                            f6 f6Var4 = this.b.z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(f6Var4.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(f6Var4.C2).sendRequest(tL_account_saveMusic, null);
                            new xc(f6Var4.c1, f6Var2).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            break;
                    }
                }
            }, false);
            F.Z();
            return;
        }
        if (saVar.e && saVar.b != null && saVar.d != null) {
            Bundle bundle = new Bundle();
            if (saVar.b.longValue() >= 0) {
                bundle.putLong("user_id", saVar.b.longValue());
            } else {
                bundle.putLong("chat_id", -saVar.b.longValue());
            }
            bundle.putInt("message_id", saVar.d.intValue());
            jcVar.H(new zn(bundle));
            return;
        }
        if (saVar.b != null && saVar.c != null) {
            MessagesController.getInstance(f6Var.C2).getStoriesController().d0(saVar.b.longValue(), saVar.c.intValue(), new c5(this, saVar, jcVar, f6Var2, 0));
            return;
        }
        org.telegram.ui.Components.pc Q = new xc(f6Var.c1, f6Var2).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
        Q.a = 3;
        Q.k(true);
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        c11 c11Var;
        if (z10 || AndroidUtilities.shouldShowUrlInAlert(str)) {
            jc jcVar = this.x0;
            if (i10 == 0 || i10 == 2) {
                org.telegram.ui.Components.d5.r0(jcVar.f, str, true, true, true, (!(characterStyle instanceof c61) || (c11Var = ((c61) characterStyle).a) == null || (c11Var.a & 1024) == 0) ? false : true, null, null, this.y0);
                return;
            } else {
                if (i10 == 1) {
                    org.telegram.ui.Components.d5.r0(jcVar.f, str, true, true, false, false, null, null, this.y0);
                    return;
                }
                return;
            }
        }
        if (i10 == 0) {
            nf.f.q(getContext(), Uri.parse(str), true, true, null);
        } else if (i10 == 1) {
            nf.f.q(getContext(), Uri.parse(str), false, false, null);
        } else if (i10 == 2) {
            nf.f.q(getContext(), Uri.parse(str), false, true, null);
        }
    }
}
