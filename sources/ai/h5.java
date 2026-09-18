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
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
    public final void F(org.telegram.ui.Components.x5 x5Var) {
        if (x5Var != null) {
            f6 f6Var = this.z0;
            if (f6Var.Q1 == null) {
                return;
            }
            TLRPC.Document document = x5Var.document;
            if (document == null) {
                document = org.telegram.ui.Components.o5.f(f6Var.C2, x5Var.documentId);
            }
            if (document == null) {
                return;
            }
            a5 a5Var = f6Var.c1;
            org.telegram.ui.ActionBar.f6 f6Var2 = this.y0;
            org.telegram.ui.Components.oc h = new vc(a5Var, f6Var2).h(document, 2, new d5(this, this.x0, f6Var2, 0));
            if (h == null) {
                return;
            }
            h.a = 1;
            h.k(true);
        }
    }

    @Override // ai.xa
    public final void G(CharacterStyle characterStyle, View view) {
        boolean z10 = characterStyle instanceof q51;
        jc jcVar = this.x0;
        f6 f6Var = this.z0;
        if (z10) {
            TLRPC.User user = MessagesController.getInstance(f6Var.C2).getUser(Utilities.parseLong(((q51) characterStyle).getURL()));
            if (user != null) {
                MessagesController.getInstance(f6Var.C2).openChatOrProfileWith(user, null, jcVar.f, 0, false);
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
                wl.o(R.string.TextCopied, new vc(f6Var.c1, this.y0));
                return;
            }
        }
        String url = ((n51) characterStyle).getURL();
        if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
            if (url.contains("@")) {
                jcVar.H(new b40(url, null));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("hashtag", url);
            jcVar.H(new ba0(bundle, null));
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
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(1, context, f6Var, false);
        g3Var.fixNavigationBar();
        g3Var.title = str;
        g3Var.bigTitle = false;
        g3Var.multipleLinesTitle = true;
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
                    new vc(h5Var.z0.c1, f6Var3).k(false).j();
                }
            }
        };
        g3Var.items = charSequenceArr;
        g3Var.onClickListener = onClickListener;
        g3Var.setOnHideListener(new g5(dVar, 0));
        g3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        ((ac) f6Var2.Q1).h(g3Var);
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
            n70 F = n70.F(jcVar.v, f6Var2, f6Var.K0);
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
                            new vc(f6Var3.c1, f6Var2).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new f(25))).k(true);
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
                            new vc(f6Var4.c1, f6Var2).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
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
                            new vc(f6Var3.c1, f6Var2).Q(R.raw.saved_messages, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new f(25))).k(true);
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
                            new vc(f6Var4.c1, f6Var2).Q(R.raw.ic_save_to_music, 36, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).k(true);
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
            jcVar.H(new bo(bundle));
            return;
        }
        if (saVar.b != null && saVar.c != null) {
            MessagesController.getInstance(f6Var.C2).getStoriesController().d0(saVar.b.longValue(), saVar.c.intValue(), new c5(this, saVar, jcVar, f6Var2, 0));
            return;
        }
        org.telegram.ui.Components.oc Q = new vc(f6Var.c1, f6Var2).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
        Q.a = 3;
        Q.k(true);
    }

    public final void M(int i10, String str, CharacterStyle characterStyle, boolean z10) {
        p01 p01Var;
        if (z10 || AndroidUtilities.shouldShowUrlInAlert(str)) {
            jc jcVar = this.x0;
            if (i10 == 0 || i10 == 2) {
                org.telegram.ui.Components.c5.r0(jcVar.f, str, true, true, true, (!(characterStyle instanceof p51) || (p01Var = ((p51) characterStyle).a) == null || (p01Var.a & 1024) == 0) ? false : true, null, null, this.y0);
                return;
            } else {
                if (i10 == 1) {
                    org.telegram.ui.Components.c5.r0(jcVar.f, str, true, true, false, false, null, null, this.y0);
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
