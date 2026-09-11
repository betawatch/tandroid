package bi;

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
import org.telegram.messenger.vl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class s4 extends ea {
    public final /* synthetic */ pb x0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 y0;
    public final /* synthetic */ o5 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(o5 o5Var, Context context, b bVar, pb pbVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, bVar);
        this.z0 = o5Var;
        this.x0 = pbVar;
        this.y0 = f6Var;
    }

    @Override // bi.ea
    public final void F(org.telegram.ui.Components.z5 z5Var) {
        if (z5Var != null) {
            o5 o5Var = this.z0;
            if (o5Var.Q1 == null) {
                return;
            }
            TLRPC.Document document = z5Var.document;
            if (document == null) {
                document = org.telegram.ui.Components.q5.f(o5Var.C2, z5Var.documentId);
            }
            if (document == null) {
                return;
            }
            l4 l4Var = o5Var.c1;
            org.telegram.ui.ActionBar.f6 f6Var = this.y0;
            qc h = new yc(l4Var, f6Var).h(document, 2, new o4(this, this.x0, f6Var, 0));
            if (h == null) {
                return;
            }
            h.a = 1;
            h.k(true);
        }
    }

    @Override // bi.ea
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof o51;
        pb pbVar = this.x0;
        o5 o5Var = this.z0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(o5Var.C2).getUser(Utilities.parseLong(((o51) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(o5Var.C2).openChatOrProfileWith(user, null, pbVar.f, 0, false);
                return;
            }
            return;
        }
        if (!(characterStyle instanceof l51)) {
            if (characterStyle instanceof URLSpan) {
                M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof n51);
                return;
            }
            if (!(characterStyle instanceof k51)) {
                if (characterStyle instanceof ClickableSpan) {
                    ((ClickableSpan) characterStyle).onClick(view);
                    return;
                }
                return;
            } else {
                k51 k51Var = (k51) characterStyle;
                AndroidUtilities.addToClipboard(k51Var.a.subSequence(k51Var.b, k51Var.c).toString());
                vl.o(R.string.TextCopied, new yc(o5Var.c1, this.y0));
                return;
            }
        }
        String url = ((l51) characterStyle).getURL();
        if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
            if (url.contains("@")) {
                pbVar.H(new b40(url, null));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("hashtag", url);
            pbVar.H(new ca0(bundle, null));
            return;
        }
        String b10 = of.f.b(url);
        if (b10 == null) {
            M(0, url, characterStyle, false);
            return;
        }
        String lowerCase = b10.toLowerCase();
        if (url.startsWith("@")) {
            MessagesController.getInstance(o5Var.C2).openByUserName(lowerCase, pbVar.f, 0, null);
        } else {
            M(0, url, characterStyle, false);
        }
    }

    @Override // bi.ea
    public final void H(final URLSpan uRLSpan, final View view, a3.c cVar) {
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
        org.telegram.ui.ActionBar.f6 f6Var = this.y0;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, f6Var, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        f3Var.multipleLinesTitle = true;
        o5 o5Var = this.z0;
        m5 m5Var = o5Var.O1;
        CharSequence[] charSequenceArr = (m5Var == null || m5Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.f6 f6Var2 = this.y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: bi.q4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                s4 s4Var = s4.this;
                if (i10 == 0) {
                    s4Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new yc(s4Var.z0.c1, f6Var2).k(false).j();
                }
            }
        };
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = onClickListener;
        f3Var.setOnHideListener(new r4(cVar, 0));
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        ((gb) o5Var.Q1).h(f3Var);
    }

    @Override // bi.ea
    public final void I(z9 z9Var) {
        if (z9Var == null) {
            return;
        }
        final TLRPC.Document document = z9Var.g;
        o5 o5Var = this.z0;
        pb pbVar = this.x0;
        final org.telegram.ui.ActionBar.f6 f6Var = this.y0;
        if (document != null) {
            n70 F = n70.F(pbVar.v, f6Var, o5Var.K0);
            F.i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            final int i10 = 0;
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) { // from class: bi.m4
                public final /* synthetic */ s4 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            o5 o5Var2 = this.b.z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(o5Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(o5Var2.C2).getClientUserId();
                            m5 m5Var = o5Var2.O1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, m5Var != null ? m5Var.a : null, null, false));
                            new yc(o5Var2.c1, f6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new ah.j(26))).k(true);
                            break;
                        default:
                            o5 o5Var3 = this.b.z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(o5Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(o5Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new yc(o5Var3.c1, f6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            break;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            final int i11 = 1;
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) { // from class: bi.m4
                public final /* synthetic */ s4 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            o5 o5Var2 = this.b.z0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(o5Var2.C2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(o5Var2.C2).getClientUserId();
                            m5 m5Var = o5Var2.O1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, m5Var != null ? m5Var.a : null, null, false));
                            new yc(o5Var2.c1, f6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new ah.j(26))).k(true);
                            break;
                        default:
                            o5 o5Var3 = this.b.z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(o5Var3.C2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(o5Var3.C2).sendRequest(tL_account_saveMusic, null);
                            new yc(o5Var3.c1, f6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            break;
                    }
                }
            }, false);
            F.Z();
            return;
        }
        if (z9Var.e && z9Var.b != null && z9Var.d != null) {
            Bundle bundle = new Bundle();
            if (z9Var.b.longValue() >= 0) {
                bundle.putLong("user_id", z9Var.b.longValue());
            } else {
                bundle.putLong("chat_id", -z9Var.b.longValue());
            }
            bundle.putInt("message_id", z9Var.d.intValue());
            pbVar.H(new co(bundle));
            return;
        }
        if (z9Var.b != null && z9Var.c != null) {
            MessagesController.getInstance(o5Var.C2).getStoriesController().d0(z9Var.b.longValue(), z9Var.c.intValue(), new n4(this, z9Var, pbVar, f6Var, 0));
            return;
        }
        qc Q = new yc(o5Var.c1, f6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
        Q.a = 3;
        Q.k(true);
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        n01 n01Var;
        if (z10 || AndroidUtilities.shouldShowUrlInAlert(str)) {
            pb pbVar = this.x0;
            if (i10 == 0 || i10 == 2) {
                org.telegram.ui.Components.e5.r0(pbVar.f, str, true, true, true, (!(characterStyle instanceof n51) || (n01Var = ((n51) characterStyle).a) == null || (n01Var.a & 1024) == 0) ? false : true, null, null, this.y0);
                return;
            } else {
                if (i10 == 1) {
                    org.telegram.ui.Components.e5.r0(pbVar.f, str, true, true, false, false, null, null, this.y0);
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
