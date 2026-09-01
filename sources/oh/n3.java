package oh;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f40;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t01;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class n3 extends a8 {
    public final /* synthetic */ i9 u0;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 v0;
    public final /* synthetic */ f4 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(f4 f4Var, Context context, b bVar, i9 i9Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, bVar);
        this.w0 = f4Var;
        this.u0 = i9Var;
        this.v0 = g6Var;
    }

    @Override // oh.a8
    public final void F(org.telegram.ui.Components.u5 u5Var) {
        if (u5Var != null) {
            f4 f4Var = this.w0;
            if (f4Var.N1 == null) {
                return;
            }
            TLRPC.Document document = u5Var.document;
            if (document == null) {
                document = org.telegram.ui.Components.l5.f(f4Var.z2, u5Var.documentId);
            }
            if (document == null) {
                return;
            }
            j3 j3Var = f4Var.Z0;
            org.telegram.ui.ActionBar.g6 g6Var = this.v0;
            ic h = new qc(j3Var, g6Var).h(document, 2, new lh.h(this, this.u0, g6Var, 4));
            if (h == null) {
                return;
            }
            h.a = 1;
            h.k(true);
        }
    }

    @Override // oh.a8
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z4 = characterStyle instanceof q51;
        i9 i9Var = this.u0;
        f4 f4Var = this.w0;
        if (z4) {
            TLRPC.User user = MessagesController.getInstance(f4Var.z2).getUser(Utilities.parseLong(((q51) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(f4Var.z2).openChatOrProfileWith(user, null, i9Var.f, 0, false);
                return;
            }
            return;
        }
        if (!(characterStyle instanceof n51)) {
            if (characterStyle instanceof URLSpan) {
                M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof p51);
                return;
            }
            if (!(characterStyle instanceof m51)) {
                if (characterStyle instanceof ClickableSpan) {
                    ((ClickableSpan) characterStyle).onClick(view);
                    return;
                }
                return;
            } else {
                m51 m51Var = (m51) characterStyle;
                AndroidUtilities.addToClipboard(m51Var.a.subSequence(m51Var.b, m51Var.c).toString());
                org.telegram.ui.b.m(R.string.TextCopied, new qc(f4Var.Z0, this.v0));
                return;
            }
        }
        String url = ((n51) characterStyle).getURL();
        if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
            if (url.contains("@")) {
                i9Var.H(new f40(url, null));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("hashtag", url);
            i9Var.H(new fa0(bundle, null));
            return;
        }
        String b10 = af.g.b(url);
        if (b10 == null) {
            M(0, url, characterStyle, false);
            return;
        }
        String lowerCase = b10.toLowerCase();
        if (url.startsWith("@")) {
            MessagesController.getInstance(f4Var.z2).openByUserName(lowerCase, i9Var.f, 0, null);
        } else {
            M(0, url, characterStyle, false);
        }
    }

    @Override // oh.a8
    public final void H(final URLSpan uRLSpan, final View view, t3 t3Var) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = af.g.v(parse, null, null, af.g.a(parse.getHost()), null);
            } catch (Exception e6) {
                FileLog.e((Throwable) e6, false);
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
        org.telegram.ui.ActionBar.g6 g6Var = this.v0;
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(context, g6Var, false, false);
        h3Var.fixNavigationBar();
        h3Var.title = str;
        h3Var.bigTitle = false;
        h3Var.multipleLinesTitle = true;
        f4 f4Var = this.w0;
        d4 d4Var = f4Var.L1;
        CharSequence[] charSequenceArr = (d4Var == null || d4Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.g6 g6Var2 = this.v0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: oh.m3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                n3 n3Var = n3.this;
                if (i10 == 0) {
                    n3Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new qc(n3Var.w0.Z0, g6Var2).k(false).j();
                }
            }
        };
        h3Var.items = charSequenceArr;
        h3Var.onClickListener = onClickListener;
        h3Var.setOnHideListener(new fg.d0(t3Var, 6));
        h3Var.fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, g6Var));
        ((z8) f4Var.N1).h(h3Var);
    }

    @Override // oh.a8
    public final void I(v7 v7Var) {
        if (v7Var == null) {
            return;
        }
        final TLRPC.Document document = v7Var.g;
        f4 f4Var = this.w0;
        i9 i9Var = this.u0;
        final org.telegram.ui.ActionBar.g6 g6Var = this.v0;
        if (document != null) {
            q70 F = q70.F(i9Var.v, g6Var, f4Var.H0);
            F.i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            final int i10 = 0;
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) { // from class: oh.k3
                public final /* synthetic */ n3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            f4 f4Var2 = this.b.w0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(f4Var2.z2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(f4Var2.z2).getClientUserId();
                            d4 d4Var = f4Var2.L1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, d4Var != null ? d4Var.a : null, null, false));
                            new qc(f4Var2.Z0, g6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new jc(0))).k(true);
                            break;
                        default:
                            f4 f4Var3 = this.b.w0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(f4Var3.z2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(f4Var3.z2).sendRequest(tL_account_saveMusic, null);
                            new qc(f4Var3.Z0, g6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            break;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            final int i11 = 1;
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) { // from class: oh.k3
                public final /* synthetic */ n3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            f4 f4Var2 = this.b.w0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(f4Var2.z2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(f4Var2.z2).getClientUserId();
                            d4 d4Var = f4Var2.L1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, d4Var != null ? d4Var.a : null, null, false));
                            new qc(f4Var2.Z0, g6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new jc(0))).k(true);
                            break;
                        default:
                            f4 f4Var3 = this.b.w0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(f4Var3.z2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(f4Var3.z2).sendRequest(tL_account_saveMusic, null);
                            new qc(f4Var3.Z0, g6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
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
            i9Var.H(new xn(bundle));
            return;
        }
        if (v7Var.b != null && v7Var.c != null) {
            MessagesController.getInstance(f4Var.z2).getStoriesController().d0(v7Var.b.longValue(), v7Var.c.intValue(), new hg.n1(this, v7Var, i9Var, g6Var, 1));
            return;
        }
        ic Q = new qc(f4Var.Z0, g6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
        Q.a = 3;
        Q.k(true);
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z4) {
        t01 t01Var;
        if (z4 || AndroidUtilities.shouldShowUrlInAlert(str)) {
            i9 i9Var = this.u0;
            if (i10 == 0 || i10 == 2) {
                org.telegram.ui.Components.z4.r0(i9Var.f, str, true, true, true, (!(characterStyle instanceof p51) || (t01Var = ((p51) characterStyle).a) == null || (t01Var.a & 1024) == 0) ? false : true, null, null, this.v0);
                return;
            } else {
                if (i10 == 1) {
                    org.telegram.ui.Components.z4.r0(i9Var.f, str, true, true, false, false, null, null, this.v0);
                    return;
                }
                return;
            }
        }
        if (i10 == 0) {
            af.g.q(getContext(), Uri.parse(str), true, true, null);
        } else if (i10 == 1) {
            af.g.q(getContext(), Uri.parse(str), false, false, null);
        } else if (i10 == 2) {
            af.g.q(getContext(), Uri.parse(str), false, true, null);
        }
    }
}
