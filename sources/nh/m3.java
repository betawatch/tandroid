package nh;

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
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s01;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class m3 extends a8 {
    public final /* synthetic */ i9 u0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 v0;
    public final /* synthetic */ d4 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(d4 d4Var, Context context, b bVar, i9 i9Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, bVar);
        this.w0 = d4Var;
        this.u0 = i9Var;
        this.v0 = f6Var;
    }

    @Override // nh.a8
    public final void F(org.telegram.ui.Components.u5 u5Var) {
        if (u5Var != null) {
            d4 d4Var = this.w0;
            if (d4Var.N1 == null) {
                return;
            }
            TLRPC.Document document = u5Var.document;
            if (document == null) {
                document = org.telegram.ui.Components.l5.f(d4Var.z2, u5Var.documentId);
            }
            if (document == null) {
                return;
            }
            i3 i3Var = d4Var.Z0;
            org.telegram.ui.ActionBar.f6 f6Var = this.v0;
            ic h = new qc(i3Var, f6Var).h(document, 2, new kh.h(this, this.u0, f6Var, 4));
            if (h == null) {
                return;
            }
            h.a = 1;
            h.k(true);
        }
    }

    @Override // nh.a8
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z4 = characterStyle instanceof p51;
        i9 i9Var = this.u0;
        d4 d4Var = this.w0;
        if (z4) {
            TLRPC.User user = MessagesController.getInstance(d4Var.z2).getUser(Utilities.parseLong(((p51) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(d4Var.z2).openChatOrProfileWith(user, null, i9Var.f, 0, false);
                return;
            }
            return;
        }
        if (!(characterStyle instanceof m51)) {
            if (characterStyle instanceof URLSpan) {
                M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof o51);
                return;
            }
            if (!(characterStyle instanceof l51)) {
                if (characterStyle instanceof ClickableSpan) {
                    ((ClickableSpan) characterStyle).onClick(view);
                    return;
                }
                return;
            } else {
                l51 l51Var = (l51) characterStyle;
                AndroidUtilities.addToClipboard(l51Var.a.subSequence(l51Var.b, l51Var.c).toString());
                org.telegram.ui.b.m(R.string.TextCopied, new qc(d4Var.Z0, this.v0));
                return;
            }
        }
        String url = ((m51) characterStyle).getURL();
        if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
            if (url.contains("@")) {
                i9Var.H(new e40(url, null));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("hashtag", url);
            i9Var.H(new ea0(bundle, null));
            return;
        }
        String b10 = ze.d.b(url);
        if (b10 == null) {
            M(0, url, characterStyle, false);
            return;
        }
        String lowerCase = b10.toLowerCase();
        if (url.startsWith("@")) {
            MessagesController.getInstance(d4Var.z2).openByUserName(lowerCase, i9Var.f, 0, null);
        } else {
            M(0, url, characterStyle, false);
        }
    }

    @Override // nh.a8
    public final void H(final URLSpan uRLSpan, final View view, n5 n5Var) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = ze.d.v(parse, null, null, ze.d.a(parse.getHost()), null);
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
            str = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e6) {
            FileLog.e(e6);
            str = url2;
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.v0;
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(context, f6Var, false, false);
        g3Var.fixNavigationBar();
        g3Var.title = str;
        g3Var.bigTitle = false;
        g3Var.multipleLinesTitle = true;
        d4 d4Var = this.w0;
        b4 b4Var = d4Var.L1;
        CharSequence[] charSequenceArr = (b4Var == null || b4Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.f6 f6Var2 = this.v0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: nh.l3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                m3 m3Var = m3.this;
                if (i10 == 0) {
                    m3Var.G(uRLSpan, view);
                } else if (i10 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new qc(m3Var.w0.Z0, f6Var2).k(false).j();
                }
            }
        };
        g3Var.items = charSequenceArr;
        g3Var.onClickListener = onClickListener;
        g3Var.setOnHideListener(new eg.d0(n5Var, 6));
        g3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        ((z8) d4Var.N1).h(g3Var);
    }

    @Override // nh.a8
    public final void I(v7 v7Var) {
        if (v7Var == null) {
            return;
        }
        final TLRPC.Document document = v7Var.g;
        d4 d4Var = this.w0;
        i9 i9Var = this.u0;
        final org.telegram.ui.ActionBar.f6 f6Var = this.v0;
        if (document != null) {
            p70 F = p70.F(i9Var.v, f6Var, d4Var.H0);
            F.i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            final int i10 = 0;
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) { // from class: nh.j3
                public final /* synthetic */ m3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            d4 d4Var2 = this.b.w0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(d4Var2.z2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(d4Var2.z2).getClientUserId();
                            b4 b4Var = d4Var2.L1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, b4Var != null ? b4Var.a : null, null, false));
                            new qc(d4Var2.Z0, f6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new cg.n0(28))).k(true);
                            break;
                        default:
                            d4 d4Var3 = this.b.w0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(d4Var3.z2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(d4Var3.z2).sendRequest(tL_account_saveMusic, null);
                            new qc(d4Var3.Z0, f6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            break;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            final int i11 = 1;
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) { // from class: nh.j3
                public final /* synthetic */ m3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            d4 d4Var2 = this.b.w0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(d4Var2.z2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(d4Var2.z2).getClientUserId();
                            b4 b4Var = d4Var2.L1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, b4Var != null ? b4Var.a : null, null, false));
                            new qc(d4Var2.Z0, f6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new cg.n0(28))).k(true);
                            break;
                        default:
                            d4 d4Var3 = this.b.w0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(d4Var3.z2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(d4Var3.z2).sendRequest(tL_account_saveMusic, null);
                            new qc(d4Var3.Z0, f6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
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
            i9Var.H(new zn(bundle));
            return;
        }
        if (v7Var.b != null && v7Var.c != null) {
            MessagesController.getInstance(d4Var.z2).getStoriesController().d0(v7Var.b.longValue(), v7Var.c.intValue(), new gg.n1(this, v7Var, i9Var, f6Var, 1));
            return;
        }
        ic Q = new qc(d4Var.Z0, f6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
        Q.a = 3;
        Q.k(true);
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z4) {
        s01 s01Var;
        if (z4 || AndroidUtilities.shouldShowUrlInAlert(str)) {
            i9 i9Var = this.u0;
            if (i10 == 0 || i10 == 2) {
                org.telegram.ui.Components.z4.r0(i9Var.f, str, true, true, true, (!(characterStyle instanceof o51) || (s01Var = ((o51) characterStyle).a) == null || (s01Var.a & 1024) == 0) ? false : true, null, null, this.v0);
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
            ze.d.q(getContext(), Uri.parse(str), true, true, null);
        } else if (i10 == 1) {
            ze.d.q(getContext(), Uri.parse(str), false, false, null);
        } else if (i10 == 2) {
            ze.d.q(getContext(), Uri.parse(str), false, true, null);
        }
    }
}
