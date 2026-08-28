package ih;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.vz0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class p3 extends e8 {
    public final /* synthetic */ m9 t0;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 u0;
    public final /* synthetic */ i4 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(i4 i4Var, Context context, b bVar, m9 m9Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, bVar);
        this.v0 = i4Var;
        this.t0 = m9Var;
        this.u0 = b6Var;
    }

    @Override // ih.e8
    public final void F(org.telegram.ui.Components.t5 t5Var) {
        if (t5Var != null) {
            i4 i4Var = this.v0;
            if (i4Var.M1 == null) {
                return;
            }
            TLRPC.Document document = t5Var.document;
            if (document == null) {
                document = org.telegram.ui.Components.k5.f(i4Var.y2, t5Var.documentId);
            }
            if (document == null) {
                return;
            }
            l3 l3Var = i4Var.Y0;
            org.telegram.ui.ActionBar.b6 b6Var = this.u0;
            gc h = new oc(l3Var, b6Var).h(document, 2, new fh.i(this, this.t0, b6Var, 4));
            if (h == null) {
                return;
            }
            h.a = 1;
            h.k(true);
        }
    }

    @Override // ih.e8
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof s41;
        m9 m9Var = this.t0;
        i4 i4Var = this.v0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(i4Var.y2).getUser(Utilities.parseLong(((s41) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(i4Var.y2).openChatOrProfileWith(user, null, m9Var.f, 0, false);
                return;
            }
            return;
        }
        if (!(characterStyle instanceof p41)) {
            if (characterStyle instanceof URLSpan) {
                M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof r41);
                return;
            }
            if (!(characterStyle instanceof o41)) {
                if (characterStyle instanceof ClickableSpan) {
                    ((ClickableSpan) characterStyle).onClick(view);
                    return;
                }
                return;
            } else {
                o41 o41Var = (o41) characterStyle;
                AndroidUtilities.addToClipboard(o41Var.a.subSequence(o41Var.b, o41Var.c).toString());
                ll.o(R.string.TextCopied, new oc(i4Var.Y0, this.u0));
                return;
            }
        }
        String url = ((p41) characterStyle).getURL();
        if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
            if (url.contains("@")) {
                m9Var.H(new l30(url, null));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("hashtag", url);
            m9Var.H(new k90(bundle, null));
            return;
        }
        String b10 = ve.e.b(url);
        if (b10 == null) {
            M(0, url, characterStyle, false);
            return;
        }
        String lowerCase = b10.toLowerCase();
        if (url.startsWith("@")) {
            MessagesController.getInstance(i4Var.y2).openByUserName(lowerCase, m9Var.f, 0, null);
        } else {
            M(0, url, characterStyle, false);
        }
    }

    @Override // ih.e8
    public final void H(final URLSpan uRLSpan, final View view, g gVar) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = ve.e.v(parse, null, null, ve.e.a(parse.getHost()), null);
            } catch (Exception e10) {
                FileLog.e((Throwable) e10, false);
            }
            str = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e11) {
            FileLog.e(e11);
            str = url2;
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.b6 b6Var = this.u0;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, b6Var, false, false);
        f3Var.fixNavigationBar();
        f3Var.title = str;
        f3Var.bigTitle = false;
        f3Var.multipleLinesTitle = true;
        i4 i4Var = this.v0;
        g4 g4Var = i4Var.K1;
        CharSequence[] charSequenceArr = (g4Var == null || g4Var.d()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
        final org.telegram.ui.ActionBar.b6 b6Var2 = this.u0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ih.o3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                p3 p3Var = p3.this;
                if (i9 == 0) {
                    p3Var.G(uRLSpan, view);
                } else if (i9 == 1) {
                    AndroidUtilities.addToClipboard(url);
                    new oc(p3Var.v0.Y0, b6Var2).k(false).j();
                }
            }
        };
        f3Var.items = charSequenceArr;
        f3Var.onClickListener = onClickListener;
        f3Var.setOnHideListener(new eh.l(gVar, 4));
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var));
        ((d9) i4Var.M1).h(f3Var);
    }

    @Override // ih.e8
    public final void I(z7 z7Var) {
        if (z7Var == null) {
            return;
        }
        final TLRPC.Document document = z7Var.g;
        i4 i4Var = this.v0;
        m9 m9Var = this.t0;
        final org.telegram.ui.ActionBar.b6 b6Var = this.u0;
        if (document != null) {
            x60 F = x60.F(m9Var.v, b6Var, i4Var.G0);
            F.i = 3;
            F.a0(-AndroidUtilities.dp(8.0f), 0.0f);
            final int i9 = 0;
            F.l(R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) { // from class: ih.m3
                public final /* synthetic */ p3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i9) {
                        case 0:
                            i4 i4Var2 = this.b.v0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i4Var2.y2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(i4Var2.y2).getClientUserId();
                            g4 g4Var = i4Var2.K1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, g4Var != null ? g4Var.a : null, null, false));
                            new oc(i4Var2.Y0, b6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new hc(0))).k(true);
                            break;
                        default:
                            i4 i4Var3 = this.b.v0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(i4Var3.y2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(i4Var3.y2).sendRequest(tL_account_saveMusic, null);
                            new oc(i4Var3.Y0, b6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            break;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            final int i10 = 1;
            F.c(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) { // from class: ih.m3
                public final /* synthetic */ p3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            i4 i4Var2 = this.b.v0;
                            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(i4Var2.y2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                            long clientUserId = UserConfig.getInstance(i4Var2.y2).getClientUserId();
                            g4 g4Var = i4Var2.K1;
                            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, g4Var != null ? g4Var.a : null, null, false));
                            new oc(i4Var2.Y0, b6Var).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new hc(0))).k(true);
                            break;
                        default:
                            i4 i4Var3 = this.b.v0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            TLRPC.Document document2 = document;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(i4Var3.y2).getClientUserId()) {
                                MediaController.getInstance().currentSavedMusicList.add(document2);
                            }
                            ConnectionsManager.getInstance(i4Var3.y2).sendRequest(tL_account_saveMusic, null);
                            new oc(i4Var3.Y0, b6Var).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
                            break;
                    }
                }
            }, false);
            F.Z();
            return;
        }
        if (z7Var.e && z7Var.b != null && z7Var.d != null) {
            Bundle bundle = new Bundle();
            if (z7Var.b.longValue() >= 0) {
                bundle.putLong("user_id", z7Var.b.longValue());
            } else {
                bundle.putLong("chat_id", -z7Var.b.longValue());
            }
            bundle.putInt("message_id", z7Var.d.intValue());
            m9Var.H(new qn(bundle));
            return;
        }
        if (z7Var.b != null && z7Var.c != null) {
            MessagesController.getInstance(i4Var.y2).getStoriesController().d0(z7Var.b.longValue(), z7Var.c.intValue(), new bg.v1(this, z7Var, m9Var, b6Var, 1));
            return;
        }
        gc Q = new oc(i4Var.Y0, b6Var).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
        Q.a = 3;
        Q.k(true);
    }

    public final void M(int i9, String str, CharacterStyle characterStyle, boolean z10) {
        vz0 vz0Var;
        if (z10 || AndroidUtilities.shouldShowUrlInAlert(str)) {
            m9 m9Var = this.t0;
            if (i9 == 0 || i9 == 2) {
                org.telegram.ui.Components.y4.r0(m9Var.f, str, true, true, true, (!(characterStyle instanceof r41) || (vz0Var = ((r41) characterStyle).a) == null || (vz0Var.a & 1024) == 0) ? false : true, null, null, this.u0);
                return;
            } else {
                if (i9 == 1) {
                    org.telegram.ui.Components.y4.r0(m9Var.f, str, true, true, false, false, null, null, this.u0);
                    return;
                }
                return;
            }
        }
        if (i9 == 0) {
            ve.e.q(getContext(), Uri.parse(str), true, true, null);
        } else if (i9 == 1) {
            ve.e.q(getContext(), Uri.parse(str), false, false, null);
        } else if (i9 == 2) {
            ve.e.q(getContext(), Uri.parse(str), false, true, null);
        }
    }
}
