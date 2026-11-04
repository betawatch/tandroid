package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.URLSpan;
import android.util.Base64;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.net.URLEncoder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.p31;
import org.telegram.ui.Components.s31;
import org.telegram.ui.Components.t31;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Components.y31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hc1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class zi {
    public static Pattern k3;
    public static Pattern l3;
    public static Pattern m3;
    public static final String[] n3 = {" vs. ", " vs ", " versus ", " ft. ", " ft ", " featuring ", " feat. ", " feat ", " presents ", " pres. ", " pres ", " and ", " & ", " . "};
    public static Pattern o3;
    public static CharSequence[] p3;
    public static SpannableStringBuilder q3;
    public static SpannableStringBuilder r3;
    public CharSequence A;
    public boolean A0;
    public String A1;
    public boolean A2;
    public SpannableString B;
    public String B0;
    public TLRPC.MessageMedia B1;
    public boolean B2;
    public zi C;
    public boolean C0;
    public TLRPC.TL_document C1;
    public boolean C2;
    public int D;
    public StringBuilder D0;
    public ArrayList D1;
    public boolean D2;
    public long E;
    public boolean E0;
    public String E1;
    public boolean E2;
    public long F;
    public long F0;
    public final jz F1;
    public boolean F2;
    public String G;
    public boolean G0;
    public BitmapDrawable G1;
    public boolean G2;
    public boolean H;
    public long H0;
    public Bitmap H1;
    public boolean H2;
    public boolean I;
    public HashSet I0;
    public final int I1;
    public boolean I2;
    public boolean J;
    public boolean J0;
    public final TLRPC.TL_channelAdminLogEvent J1;
    public boolean J2;
    public boolean K;
    public boolean K0;
    public boolean K1;
    public boolean K2;
    public boolean L;
    public boolean L0;
    public vi L1;
    public boolean L2;
    public boolean M;
    public boolean M0;
    public boolean M1;
    public boolean M2;
    public boolean N;
    public boolean N0;
    public int N1;
    public boolean N2;
    public boolean O;
    public boolean O0;
    public int O1;
    public boolean O2;
    public boolean P;
    public byte[] P0;
    public int P1;
    public boolean P2;
    public boolean Q;
    public String Q0;
    public boolean Q1;
    public boolean Q2;
    public boolean R;
    public String R0;
    public int R1;
    public Boolean R2;
    public int S;
    public boolean S0;
    public float S1;
    public boolean S2;
    public long T;
    public TLRPC.Photo T0;
    public boolean T1;
    public Integer T2;
    public int U;
    public String U0;
    public float U1;
    public Boolean U2;
    public final int V;
    public String V0;
    public boolean V1;
    public byte V2;
    public final String W;
    public String W0;
    public boolean W1;
    public SpannableString W2;
    public final int X;
    public TLRPC.PeerColor X0;
    public StringBuilder X1;
    public SpannableString X2;
    public final String Y;
    public TLRPC.MessageMedia Y0;
    public ArrayList Y1;
    public Integer Y2;
    public boolean Z;
    public boolean Z0;
    public boolean Z1;
    public TLRPC.TL_webPage Z2;
    public int a;
    public boolean a0;
    public boolean a1;
    public CharSequence a2;
    public boolean a3;
    public final String b;
    public float b0;
    public boolean b1;
    public int b2;
    public Boolean b3;
    public String c;
    public float c0;
    public int c1;
    public ac c2;
    public ArrayList c3;
    public long d;
    public int d0;
    public long d1;
    public Object d2;
    public TLRPC.Document d3;
    public long e;
    public float e0;
    public TLRPC.TL_peerColorCollectible e1;
    public boolean e2;
    public l51 e3;
    public final boolean f;
    public float f0;
    public boolean f1;
    public TLRPC.Peer f2;
    public l51 f3;
    public final boolean g;
    public int g0;
    public boolean g1;
    public final Drawable[] g2;
    public l51 g3;
    public Boolean h;
    public int h0;
    public TLRPC.TL_forumTopic h1;
    public final boolean h2;
    public boolean h3;
    public final boolean i;
    public double i0;
    public boolean i1;
    public final boolean i2;
    public Integer i3;
    public ei.k6 j;
    public boolean j0;
    public boolean j1;
    public boolean j2;
    public Float j3;
    public TLRPC.Message k;
    public boolean k0;
    public int k1;
    public Drawable k2;
    public final TL_stories.StoryItem l;
    public TLObject l0;
    public boolean l1;
    public boolean l2;
    public ei.y6 m;
    public TLRPC.Photo m0;
    public boolean m1;
    public boolean m2;
    public TLRPC.Document n;
    public ArrayList n0;
    public boolean n1;
    public final int n2;
    public Long o;
    public ArrayList o0;
    public boolean o1;
    public e5.u o2;
    public boolean p;
    public b20 p0;
    public boolean p1;
    public byte[] p2;
    public boolean q;
    public ArrayList q0;
    public boolean q1;
    public boolean q2;
    public boolean r;
    public boolean r0;
    public boolean r1;
    public Boolean r2;
    public TLRPC.VideoSize s;
    public boolean s0;
    public boolean s1;
    public int s2;
    public boolean t;
    public boolean t0;
    public boolean t1;
    public int t2;
    public String u;
    public long u0;
    public boolean u1;
    public boolean u2;
    public CharSequence v;
    public int v0;
    public ArrayList v1;
    public float v2;
    public CharSequence w;
    public boolean w0;
    public CharSequence w1;
    public cv w2;
    public SpannableStringBuilder x;
    public boolean x0;
    public ArrayList x1;
    public TL_iv.RichMessage x2;
    public CharSequence y;
    public ye y0;
    public boolean y1;
    public boolean y2;
    public CharSequence z;
    public boolean z0;
    public ArrayList z1;
    public ArrayList z2;

    public zi(int i3, TL_stories.StoryItem storyItem) {
        this.D = 1000;
        this.c0 = -1.0f;
        this.H0 = -1L;
        this.c1 = -1;
        this.d1 = -1L;
        this.Z1 = true;
        this.g2 = new Drawable[1];
        this.I2 = false;
        this.J2 = false;
        this.K2 = false;
        this.I1 = i3;
        this.l = storyItem;
        if (storyItem != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            this.k = tL_message;
            tL_message.id = storyItem.messageId;
            tL_message.realId = storyItem.id;
            tL_message.date = storyItem.date;
            tL_message.dialog_id = storyItem.dialogId;
            tL_message.message = storyItem.caption;
            tL_message.entities = storyItem.entities;
            tL_message.media = storyItem.media;
            tL_message.attachPath = storyItem.attachPath;
        }
        this.n0 = new ArrayList();
        this.o0 = new ArrayList();
    }

    public static boolean A(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults == null || pollResults.results.isEmpty()) {
            return false;
        }
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        if (!poll.public_voters) {
            return false;
        }
        if (poll.closed || poll.creator) {
            return true;
        }
        return X4(tL_messageMediaPoll) && !tL_messageMediaPoll.poll.hide_results_until_close;
    }

    public static Spannable A5(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        return C5(charSequence, arrayList, fontMetricsInt, false);
    }

    public static long B0(TLRPC.Message message) {
        TLRPC.Peer peer;
        if (message.dialog_id == 0 && (peer = message.peer_id) != null) {
            long j10 = peer.chat_id;
            if (j10 != 0) {
                message.dialog_id = -j10;
            } else {
                long j11 = peer.channel_id;
                if (j11 != 0) {
                    message.dialog_id = -j11;
                } else {
                    TLRPC.Peer peer2 = message.from_id;
                    if (peer2 == null || message.out || message.guestchat_via_from != null) {
                        message.dialog_id = peer.user_id;
                    } else {
                        message.dialog_id = peer2.user_id;
                    }
                }
            }
        }
        return message.dialog_id;
    }

    public static long C1(TLRPC.Peer peer) {
        long j10;
        if (peer == null) {
            return 0L;
        }
        if (peer instanceof TLRPC.TL_peerChat) {
            j10 = peer.chat_id;
        } else {
            if (!(peer instanceof TLRPC.TL_peerChannel)) {
                return peer.user_id;
            }
            j10 = peer.channel_id;
        }
        return -j10;
    }

    public static boolean C4(zi ziVar) {
        if (ziVar == null) {
            return false;
        }
        TLRPC.Message message = ziVar.k;
        return (message instanceof TLRPC.TL_messageService) && (((TLRPC.TL_messageService) message).action instanceof TLRPC.TL_messageActionContactSignUp);
    }

    public static Spannable C5(CharSequence charSequence, ArrayList arrayList, Paint.FontMetricsInt fontMetricsInt, boolean z10) {
        return D5(charSequence, arrayList, fontMetricsInt, z10, 1.2f, 0);
    }

    public static boolean D(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !pollResults.results.isEmpty() && !tL_messageMediaPoll.poll.revoting_disabled) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (tL_messageMediaPoll.results.results.get(i3).chosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.Photo D1(TLRPC.Message message) {
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return W(richMessage.blocks, richMessage);
        }
        if (o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return o1(message).webpage.photo;
        }
        if (o1(message) != null) {
            return o1(message).photo;
        }
        return null;
    }

    public static boolean D4(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        j1(document);
        int size = document.attributes.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if ((inputStickerSet instanceof TLRPC.TL_inputStickerSetID) && inputStickerSet.id == 1269403972611866647L) {
                    return true;
                }
                return ((TLRPC.TL_documentAttributeCustomEmoji) documentAttribute).text_color;
            }
        }
        return false;
    }

    public static Spannable D5(CharSequence charSequence, ArrayList arrayList, Paint.FontMetricsInt fontMetricsInt, boolean z10, float f10, int i3) {
        f6 f6Var;
        f6 f6Var2;
        f6 f6Var3 = null;
        if (charSequence == null) {
            return null;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        if (arrayList != null) {
            int i10 = (az.o() >= 2 ? 100 : 50) - i3;
            f6[] f6VarArr = (f6[]) spannableString.getSpans(0, spannableString.length(), f6.class);
            int i11 = 0;
            while (i11 < arrayList.size() && i10 > 0) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i11);
                if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                    int i12 = 0;
                    while (i12 < f6VarArr.length) {
                        f6 f6Var4 = f6VarArr[i12];
                        if (f6Var4 != null) {
                            int spanStart = spannableString.getSpanStart(f6Var4);
                            int spanEnd = spannableString.getSpanEnd(f6Var4);
                            int i13 = tL_messageEntityCustomEmoji.offset;
                            f6Var2 = f6Var3;
                            if (g0.B1(i13, tL_messageEntityCustomEmoji.length + i13, spanStart, spanEnd)) {
                                spannableString.removeSpan(f6Var4);
                                f6VarArr[i12] = f6Var2;
                            }
                        } else {
                            f6Var2 = f6Var3;
                        }
                        i12++;
                        f6Var3 = f6Var2;
                    }
                    f6Var = f6Var3;
                    if (messageEntity.offset + messageEntity.length <= spannableString.length()) {
                        int i14 = messageEntity.offset;
                        org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spannableString.getSpans(i14, messageEntity.length + i14, org.telegram.ui.Components.p5.class);
                        if (p5VarArr != null && p5VarArr.length > 0) {
                            for (org.telegram.ui.Components.p5 p5Var : p5VarArr) {
                                spannableString.removeSpan(p5Var);
                            }
                        }
                        org.telegram.ui.Components.p5 p5Var2 = tL_messageEntityCustomEmoji.document != null ? new org.telegram.ui.Components.p5(tL_messageEntityCustomEmoji.document, f10, fontMetricsInt) : new org.telegram.ui.Components.p5(tL_messageEntityCustomEmoji.document_id, f10, fontMetricsInt);
                        p5Var2.top = z10;
                        int i15 = messageEntity.offset;
                        spannableString.setSpan(p5Var2, i15, messageEntity.length + i15, 33);
                        i10--;
                        i11++;
                        f6Var3 = f6Var;
                    }
                } else {
                    f6Var = f6Var3;
                }
                i11++;
                f6Var3 = f6Var;
            }
        }
        return spannableString;
    }

    public static CharSequence F() {
        if (r3 == null) {
            r3 = new SpannableStringBuilder("c");
            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.msg_folders_channels, 0);
            wpVar.I = 0.7f;
            wpVar.J = 0.7f;
            r3.setSpan(wpVar, 0, 1, 33);
        }
        return r3;
    }

    public static TLRPC.PollAnswerVoters F1(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, byte[] bArr) {
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults == null || pollResults.results.isEmpty()) {
            return null;
        }
        int size = tL_messageMediaPoll.results.results.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i3);
            if (Arrays.equals(pollAnswerVoters.option, bArr)) {
                return pollAnswerVoters;
            }
        }
        return null;
    }

    public static boolean F3(TLRPC.Document document) {
        if (document != null) {
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && documentAttribute.mask) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean F4(zi ziVar) {
        TLRPC.Message message;
        if (ziVar == null || (message = ziVar.k) == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        return (messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionTopicEdit);
    }

    public static CharSequence F5(CharSequence charSequence, String str, TLObject tLObject) {
        String str2;
        CharSequence charSequence2;
        String str3;
        TLObject tLObject2;
        int indexOf = TextUtils.indexOf(charSequence, str);
        if (indexOf < 0) {
            return charSequence;
        }
        TLObject tLObject3 = null;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            charSequence2 = l10.p(user).replace('\n', ' ');
            str2 = "" + user.id;
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            charSequence2 = chat.title.replace('\n', ' ');
            str2 = "" + (-chat.id);
        } else if (tLObject instanceof TLRPC.TL_game) {
            charSequence2 = ((TLRPC.TL_game) tLObject).title.replace('\n', ' ');
            str2 = "game";
        } else {
            if (tLObject instanceof TLRPC.TL_chatInviteExported) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
                charSequence2 = tL_chatInviteExported.link.replace('\n', ' ');
                str3 = "invite";
                tLObject2 = tL_chatInviteExported;
            } else if (tLObject instanceof TLRPC.ForumTopic) {
                charSequence2 = rg.c.j((TLRPC.ForumTopic) tLObject, null, null);
                str3 = "topic";
                tLObject2 = tLObject;
            } else {
                str2 = "0";
                charSequence2 = "";
            }
            String str4 = str3;
            tLObject3 = tLObject2;
            str2 = str4;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.replace(charSequence, new String[]{str}, new CharSequence[]{charSequence2}));
        w31 w31Var = new w31(t4.c.f("", str2));
        w31Var.c = tLObject3;
        spannableStringBuilder.setSpan(w31Var, indexOf, charSequence2.length() + indexOf, 33);
        return spannableStringBuilder;
    }

    public static TLRPC.Document G0(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return a0(richMessage.blocks, richMessage);
        }
        if (o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return o1(message).webpage.document;
        }
        if (o1(message) instanceof TLRPC.TL_messageMediaGame) {
            return o1(message).game.document;
        }
        if (o1(message) instanceof TLRPC.TL_messageMediaStory) {
            TL_stories.StoryItem storyItem = ((TLRPC.TL_messageMediaStory) o1(message)).storyItem;
            if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                return document;
            }
        } else if (o1(message) instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) o1(message);
            if (tL_messageMediaPaidMedia.extended_media.size() == 1 && (tL_messageMediaPaidMedia.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) {
                return ((TLRPC.TL_messageExtendedMedia) tL_messageMediaPaidMedia.extended_media.get(0)).media.document;
            }
        }
        if (o1(message) != null) {
            return o1(message).document;
        }
        return null;
    }

    public static TLRPC.VideoSize G1(TLRPC.Document document) {
        if (document != null && document.thumbs != null) {
            for (int i3 = 0; i3 < document.video_thumbs.size(); i3++) {
                if ("f".equals(document.video_thumbs.get(i3).type)) {
                    return document.video_thumbs.get(i3);
                }
            }
        }
        return null;
    }

    public static double H0(TLRPC.Document document) {
        if (document == null) {
            return 0.0d;
        }
        int size = document.attributes.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.duration;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                return documentAttribute.duration;
            }
        }
        return 0.0d;
    }

    public static boolean H3(TLRPC.Message message, boolean z10) {
        if (message == null || o1(message) == null || (o1(message) instanceof TLRPC.TL_messageMediaEmpty)) {
            return true;
        }
        return z10 && (o1(message) instanceof TLRPC.TL_messageMediaWebPage);
    }

    public static int I1(int i3, TLRPC.Message message) {
        lg.t1 d;
        if (message == null) {
            return 0;
        }
        if ((message.flags & TLObject.FLAG_30) != 0) {
            return message.quick_reply_shortcut_id;
        }
        TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message.quick_reply_shortcut;
        if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcutId) {
            return ((TLRPC.TL_inputQuickReplyShortcutId) inputQuickReplyShortcut).shortcut_id;
        }
        String K1 = K1(message);
        if (K1 == null || (d = lg.u1.f(i3).d(K1)) == null) {
            return 0;
        }
        return d.a;
    }

    public static boolean I2(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (document.attributes.get(i3) instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                return true;
            }
        }
        return false;
    }

    public static TLRPC.VideoSize J0(TLRPC.Document document) {
        if (document == null || document.video_thumbs.isEmpty()) {
            return null;
        }
        return document.video_thumbs.get(0);
    }

    public static int J1(TLRPC.Message message) {
        if (message == null) {
            return 0;
        }
        if ((message.flags & TLObject.FLAG_30) != 0) {
            return message.quick_reply_shortcut_id;
        }
        TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message.quick_reply_shortcut;
        if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcutId) {
            return ((TLRPC.TL_inputQuickReplyShortcutId) inputQuickReplyShortcut).shortcut_id;
        }
        return 0;
    }

    public static TLRPC.Document K0(TLRPC.WebPage webPage, long j10) {
        if (webPage.cached_page == null) {
            return null;
        }
        TLRPC.Document document = webPage.document;
        if (document != null && document.id == j10) {
            return document;
        }
        for (int i3 = 0; i3 < webPage.cached_page.documents.size(); i3++) {
            TLRPC.Document document2 = webPage.cached_page.documents.get(i3);
            if (document2.id == j10) {
                return document2;
            }
        }
        return null;
    }

    public static String K1(TLRPC.Message message) {
        if (message == null) {
            return null;
        }
        TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message.quick_reply_shortcut;
        if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcut) {
            return ((TLRPC.TL_inputQuickReplyShortcut) inputQuickReplyShortcut).shortcut;
        }
        return null;
    }

    public static boolean K3(TLRPC.Document document) {
        if (document != null) {
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                if (document.attributes.get(i3) instanceof TLRPC.TL_documentAttributeAudio) {
                    return !r2.voice;
                }
            }
            if (!TextUtils.isEmpty(document.mime_type)) {
                String lowerCase = document.mime_type.toLowerCase();
                if (lowerCase.equals("audio/flac") || lowerCase.equals("audio/ogg") || lowerCase.equals("audio/opus") || lowerCase.equals("audio/x-opus+ogg") || (lowerCase.equals("application/octet-stream") && w7.B(document).endsWith(".opus"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static SpannableStringBuilder L(boolean z10) {
        return U5(z10 ? R.drawable.iv_checkbox_on : R.drawable.iv_checkbox_off, z10 ? "✅" : "☑️");
    }

    public static boolean L2(TLRPC.Document document, boolean z10) {
        if (document != null && (("application/x-tgsticker".equals(document.mime_type) && !document.thumbs.isEmpty()) || "application/x-tgsdice".equals(document.mime_type))) {
            if (z10) {
                return true;
            }
            int size = document.attributes.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    return documentAttribute.stickerset instanceof TLRPC.TL_inputStickerSetShortName;
                }
                if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean L3(TLRPC.Message message) {
        return o1(message) instanceof TLRPC.TL_messageMediaWebPage ? K3(o1(message).webpage.document) : o1(message) != null && K3(o1(message).document);
    }

    public static boolean L4(TLRPC.Document document) {
        int lastIndexOf;
        if (document != null) {
            String str = null;
            int i3 = 0;
            boolean z10 = false;
            int i10 = 0;
            int i11 = 0;
            boolean z11 = false;
            while (true) {
                if (i3 >= document.attributes.size()) {
                    if (str != null && (lastIndexOf = str.lastIndexOf(".")) >= 0) {
                        String substring = str.substring(lastIndexOf + 1);
                        if (substring != null) {
                            switch (substring.toLowerCase().hashCode()) {
                                case -1535907675:
                                case -1422950858:
                                case -1253501876:
                                case -907685685:
                                case -788047292:
                                case -338481545:
                                case 3106:
                                case 3184:
                                case 3215:
                                case 3401:
                                case 3479:
                                case 3494:
                                case 3580:
                                case 3581:
                                case 3593:
                                case 3632:
                                case 3669:
                                case 3756:
                                case 3804:
                                case 96400:
                                case 96586:
                                case 96796:
                                case 96801:
                                case 96894:
                                case 97013:
                                case 97300:
                                case 97301:
                                case 97543:
                                case 98437:
                                case 98472:
                                case 98618:
                                case 98689:
                                case 98719:
                                case 98789:
                                case 98808:
                                case 98819:
                                case 99338:
                                case 99351:
                                case 99548:
                                case 99556:
                                case 99582:
                                case 99640:
                                case 99752:
                                case 100208:
                                case 100511:
                                case 100542:
                                case 100730:
                                case 100882:
                                case 100958:
                                case 101460:
                                case 101671:
                                case 101854:
                                case 102556:
                                case 102572:
                                case 103404:
                                case 103438:
                                case 103637:
                                case 103649:
                                case 104074:
                                case 104269:
                                case 104417:
                                case 104430:
                                case 104435:
                                case 104474:
                                case 104479:
                                case 104582:
                                case 104587:
                                case 104987:
                                case 105532:
                                case 105543:
                                case 105551:
                                case 106202:
                                case 106496:
                                case 107141:
                                case 107305:
                                case 107932:
                                case 107988:
                                case 107989:
                                case 108341:
                                case 108382:
                                case 108413:
                                case 108419:
                                case 108426:
                                case 108430:
                                case 108570:
                                case 109824:
                                case 109860:
                                case 110754:
                                case 110801:
                                case 110834:
                                case 110883:
                                case 110968:
                                case 110989:
                                case 111052:
                                case 111220:
                                case 111265:
                                case 111269:
                                case 111390:
                                case 111420:
                                case 111482:
                                case 111494:
                                case 112185:
                                case 112712:
                                case 112788:
                                case 112862:
                                case 113115:
                                case 113132:
                                case 113291:
                                case 113698:
                                case 113700:
                                case 113837:
                                case 113854:
                                case 114101:
                                case 114130:
                                case 114276:
                                case 114381:
                                case 114809:
                                case 114922:
                                case 114970:
                                case 115161:
                                case 115312:
                                case 115639:
                                case 116079:
                                case 116537:
                                case 116551:
                                case 116609:
                                case 117218:
                                case 117537:
                                case 117840:
                                case 117938:
                                case 118023:
                                case 118026:
                                case 118028:
                                case 118439:
                                case 118783:
                                case 118807:
                                case 118939:
                                case 120703:
                                case 3003834:
                                case 3016404:
                                case 3088960:
                                case 3213227:
                                case 3271912:
                                case 3358271:
                                case 3444044:
                                case 3446979:
                                case 3447940:
                                case 3524225:
                                case 3524692:
                                case 3526257:
                                case 3682393:
                                case 35379135:
                                case 114035747:
                                    break;
                            }
                        }
                    }
                    if (z10 && (i10 > 1280 || i11 > 1280)) {
                        z10 = false;
                    }
                    if (az.D0 && !z11 && "video/x-matroska".equals(document.mime_type)) {
                        z11 = true;
                    }
                    if (!z11 || z10) {
                        break;
                    }
                    return true;
                }
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    if (documentAttribute.round_message) {
                        break;
                    }
                    i10 = documentAttribute.w;
                    i11 = documentAttribute.h;
                    z11 = true;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                    z10 = true;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeFilename) {
                    str = documentAttribute.file_name;
                }
                i3++;
            }
        }
        return false;
    }

    public static boolean M(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() >= 2 && charSequence.length() <= 20480) {
            int length = charSequence.length();
            int i3 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            char c2 = 0;
            while (i3 < length) {
                char charAt = charSequence.charAt(i3);
                if (charAt >= '0' && charAt <= '9') {
                    i10++;
                    if (i10 >= 6) {
                        return true;
                    }
                    i11 = 0;
                    i12 = 0;
                } else if (charAt == ' ' || i10 <= 0) {
                    i10 = 0;
                }
                if ((charAt != '@' && charAt != '#' && charAt != '/' && charAt != '$') || i3 != 0) {
                    if (i3 != 0) {
                        int i13 = i3 - 1;
                        if (charSequence.charAt(i13) != ' ') {
                            if (charSequence.charAt(i13) == '\n') {
                            }
                        }
                    }
                    if (charAt == ':') {
                        if (i11 == 0) {
                            i11 = 1;
                        }
                        i11 = 0;
                    } else if (charAt != '/') {
                        if (charAt == '.') {
                            if (i12 == 0 && c2 != ' ') {
                                i12++;
                            }
                        } else if (charAt != ' ' && c2 == '.' && i12 == 1) {
                            return true;
                        }
                        i12 = 0;
                    } else {
                        if (i11 == 2) {
                            return true;
                        }
                        if (i11 == 1) {
                            i11++;
                        }
                        i11 = 0;
                    }
                    i3++;
                    c2 = charAt;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean M2(TLRPC.Message message) {
        boolean C = m5.C(message.dialog_id);
        if ((!C || message.stickerVerified == 1) && o1(message) != null) {
            if (L2(o1(message).document, !C || message.out)) {
                return true;
            }
        }
        return false;
    }

    public static boolean M4(TLRPC.Message message) {
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return L4(a0(richMessage.blocks, richMessage));
        }
        if (o1(message) == null || !O4(o1(message).document)) {
            return o1(message) instanceof TLRPC.TL_messageMediaWebPage ? L4(o1(message).webpage.document) : o1(message) != null && L4(o1(message).document);
        }
        return false;
    }

    public static boolean N3(TLRPC.Document document) {
        if (document != null && "video/mp4".equals(document.mime_type)) {
            boolean z10 = false;
            int i3 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                    z10 = true;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i3 = documentAttribute.w;
                    i10 = documentAttribute.h;
                }
            }
            if (z10 && i3 <= 1280 && i10 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static void N5(int i3, TLRPC.Message message) {
        message.unread = (i3 & 1) == 0;
        message.media_unread = (i3 & 2) == 0;
    }

    public static boolean O2(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                return true;
            }
        }
        return false;
    }

    public static boolean O4(TLRPC.Document document) {
        return document != null && P4(document);
    }

    public static boolean P2(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockTable) || (pageBlock instanceof TL_iv.pageBlockMath) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow);
    }

    public static boolean P3(TLRPC.Message message) {
        return message.out;
    }

    public static boolean P4(TLRPC.Document document) {
        if (document != null) {
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                    return "video/webm".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    public static void R(Spanned spanned, ArrayList arrayList) {
        String str;
        int i3;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        wg0[] wg0VarArr = (wg0[]) spanned.getSpans(0, spanned.length(), wg0.class);
        int i10 = 0;
        while (true) {
            if (i10 >= wg0VarArr.length) {
                break;
            }
            wg0 wg0Var = wg0VarArr[i10];
            wg0Var.a.b = false;
            int spanStart = spanned.getSpanStart(wg0Var);
            int spanEnd = spanned.getSpanEnd(wg0VarArr[i10]);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0) | (wg0VarArr[i10].a.e ? 16 : 1)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            i10++;
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (intValue >= 0 && intValue < spanned.length() && hashMap.containsKey(num)) {
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if ((intValue2 & 17) != 0 && (intValue2 & 2) != 0 && spanned.charAt(intValue) != '\n' && (intValue - 1 <= 0 || spanned.charAt(i3) != '\n')) {
                    it.remove();
                    hashMap.remove(num);
                }
            }
        }
        oi.h[] hVarArr = (oi.h[]) spanned.getSpans(0, spanned.length(), oi.h.class);
        for (int i11 = 0; i11 < hVarArr.length; i11++) {
            int spanStart2 = spanned.getSpanStart(hVarArr[i11]);
            int spanEnd2 = spanned.getSpanEnd(hVarArr[i11]);
            treeSet.add(Integer.valueOf(spanStart2));
            hashMap.put(Integer.valueOf(spanStart2), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanStart2)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart2))).intValue() : 0) | 4));
            treeSet.add(Integer.valueOf(spanEnd2));
            hashMap.put(Integer.valueOf(spanEnd2), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd2)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd2))).intValue() : 0) | 8));
        }
        Iterator it2 = treeSet.iterator();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        boolean z10 = false;
        int i15 = 0;
        while (it2.hasNext()) {
            Integer num2 = (Integer) it2.next();
            int intValue3 = num2.intValue();
            int intValue4 = ((Integer) hashMap.get(num2)).intValue();
            if (i14 != intValue3) {
                int i16 = intValue3 - 1;
                if (i16 >= 0 && i16 < spanned.length() && spanned.charAt(i16) == '\n') {
                    intValue3--;
                }
                int i17 = intValue3;
                if ((intValue4 & 8) == 0 || i13 >= hVarArr.length) {
                    str = null;
                } else {
                    str = hVarArr[i13].a;
                    i13++;
                }
                int i18 = i13;
                arrayList.add(new yi(i14, i17, i12 > 0, i15 > 0, z10, str));
                i14 = i17 + 1;
                if (i14 >= spanned.length() || spanned.charAt(i17) != '\n') {
                    i14 = i17;
                }
                i13 = i18;
            }
            if ((intValue4 & 2) != 0) {
                i12--;
            }
            if ((intValue4 & 1) != 0 || (intValue4 & 16) != 0) {
                i12++;
                z10 = (intValue4 & 16) != 0;
            }
            if ((intValue4 & 8) != 0) {
                i15--;
            }
            if ((intValue4 & 4) != 0) {
                i15++;
            }
        }
        if (i14 < spanned.length()) {
            arrayList.add(new yi(i14, spanned.length(), i12 > 0, i15 > 0, z10, null));
        }
    }

    public static long R1(long j10, TLRPC.Message message) {
        TLRPC.Peer peer;
        TLRPC.Peer peer2 = message.saved_peer_id;
        if (peer2 != null) {
            long j11 = peer2.chat_id;
            if (j11 != 0) {
                return -j11;
            }
            long j12 = peer2.channel_id;
            return j12 != 0 ? -j12 : peer2.user_id;
        }
        if (message.from_id.user_id != j10) {
            return 0L;
        }
        TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
        if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
            return m5.o(peer);
        }
        if ((messageFwdHeader == null || messageFwdHeader.from_id == null) && messageFwdHeader != null) {
            return 2666000L;
        }
        return j10;
    }

    public static boolean R2(int i3, zi ziVar) {
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        TLRPC.TodoList todoList;
        TLRPC.MessageMedia n12 = n1(ziVar);
        if ((n12 instanceof TLRPC.TL_messageMediaToDo) && (todoList = (tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) n12).todo) != null && todoList.list != null) {
            for (int i10 = 0; i10 < tL_messageMediaToDo.completions.size(); i10++) {
                if (tL_messageMediaToDo.completions.get(i10).id == i3) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean R4(TLRPC.Document document) {
        if (document != null) {
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    return documentAttribute.voice;
                }
            }
        }
        return false;
    }

    public static int S(int i3) {
        return g3(i3) ? i3 & (-1879048193) : i3;
    }

    public static boolean S4(TLRPC.Message message) {
        return o1(message) instanceof TLRPC.TL_messageMediaWebPage ? R4(o1(message).webpage.document) : o1(message) != null && R4(o1(message).document);
    }

    public static boolean S5(TLRPC.Message message) {
        int i3;
        if ((message == null || message.media == null || !((R4(G0(message)) || k4(message)) && message.media.ttl_seconds == Integer.MAX_VALUE)) && !(o1(message) instanceof TLRPC.TL_messageMediaPaidMedia)) {
            return message instanceof TLRPC.TL_message_secret ? ((o1(message) instanceof TLRPC.TL_messageMediaPhoto) || M4(message)) && (i3 = message.ttl) > 0 && i3 <= 60 : ((o1(message) instanceof TLRPC.TL_messageMediaPhoto) || (o1(message) instanceof TLRPC.TL_messageMediaDocument)) && o1(message).ttl_seconds != 0;
        }
        return true;
    }

    public static String T0(TLRPC.Message message) {
        TLRPC.PhotoSize w10;
        if (o1(message) instanceof TLRPC.TL_messageMediaDocument) {
            return w7.r(null, G0(message));
        }
        if (!(o1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
            return (!(o1(message) instanceof TLRPC.TL_messageMediaWebPage) || o1(message).webpage == null) ? "" : w7.r(null, o1(message).webpage.document);
        }
        ArrayList<TLRPC.PhotoSize> arrayList = o1(message).photo.sizes;
        return (arrayList.size() <= 0 || (w10 = w7.w(arrayList, g0.Z0(false), false, null, false)) == null) ? "" : w7.r(null, w10);
    }

    public static boolean T3(TLRPC.Message message) {
        TLRPC.Photo photo;
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return W(richMessage.blocks, richMessage) != null;
        }
        if (o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return (o1(message).webpage.photo instanceof TLRPC.TL_photo) && !(o1(message).webpage.document instanceof TLRPC.TL_document);
        }
        TLRPC.MessageAction messageAction = message.action;
        return (messageAction == null || (photo = messageAction.photo) == null) ? o1(message) instanceof TLRPC.TL_messageMediaPhoto : photo instanceof TLRPC.TL_photo;
    }

    public static String U(TLRPC.Document document) {
        return V(document, "😀", null);
    }

    public static String U0(TLRPC.MessageMedia messageMedia) {
        TLRPC.WebPage webPage;
        TLRPC.PhotoSize w10;
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            return w7.r(null, messageMedia.document);
        }
        if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
            return (!(messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (webPage = messageMedia.webpage) == null) ? "" : w7.r(null, webPage.document);
        }
        ArrayList<TLRPC.PhotoSize> arrayList = messageMedia.photo.sizes;
        return (arrayList.size() <= 0 || (w10 = w7.w(arrayList, g0.Z0(false), false, null, false)) == null) ? "" : w7.r(null, w10);
    }

    public static SpannableStringBuilder U5(int i3, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(i3, 0), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String V(TLRPC.Document document, String str, Integer num) {
        if (document != null) {
            int size = document.attributes.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                    if (num != null) {
                        TLRPC.TL_messages_stickerSet m0 = li.b0(num.intValue()).m0(documentAttribute.stickerset, true);
                        StringBuilder sb2 = new StringBuilder("");
                        if (m0 != null && m0.packs != null) {
                            for (int i10 = 0; i10 < m0.packs.size(); i10++) {
                                TLRPC.TL_stickerPack tL_stickerPack = m0.packs.get(i10);
                                if (tL_stickerPack.documents.contains(Long.valueOf(document.id))) {
                                    sb2.append(tL_stickerPack.emoticon);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(sb2)) {
                            return sb2.toString();
                        }
                    }
                    return documentAttribute.alt;
                }
            }
        }
        return str;
    }

    public static boolean V3(TLRPC.StickerSetCovered stickerSetCovered) {
        TLRPC.StickerSet stickerSet;
        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && !stickerSet.emojis) {
            return false;
        }
        ArrayList<TLRPC.Document> arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
        if (stickerSetCovered != null && arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (!n3(arrayList.get(i3))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean V4(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (tL_messageMediaPoll.results.results.get(i3).voters > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.Photo W(ArrayList arrayList, TL_iv.RichMessage richMessage) {
        if (arrayList != null && richMessage != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                    ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                    long j10 = ((TL_iv.pageBlockPhoto) pageBlock).photo_id;
                    Typeface typeface = g0.a;
                    if (arrayList2 != null) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            TLRPC.Photo photo = arrayList2.get(i10);
                            if (photo != null && photo.id == j10) {
                                return photo;
                            }
                        }
                    }
                    return null;
                }
                if (pageBlock instanceof TL_iv.pageBlockCollage) {
                    return W(((TL_iv.pageBlockCollage) pageBlock).items, richMessage);
                }
                if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                    return W(((TL_iv.pageBlockSlideshow) pageBlock).items, richMessage);
                }
            }
        }
        return null;
    }

    public static boolean W2(TLRPC.Document document) {
        if (document != null) {
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                if (document.attributes.get(i3) instanceof TLRPC.TL_documentAttributeHasStickers) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean W3(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        if ((tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) && tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
            for (int i3 = 0; i3 < tL_messages_stickerSet.documents.size(); i3++) {
                if (!n3(tL_messages_stickerSet.documents.get(i3))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.PollAnswer X(zi ziVar, byte[] bArr) {
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        TLRPC.Poll poll;
        TLRPC.MessageMedia n12 = n1(ziVar);
        if ((n12 instanceof TLRPC.TL_messageMediaPoll) && (poll = (tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n12).poll) != null && poll.answers != null) {
            for (int i3 = 0; i3 < tL_messageMediaPoll.poll.answers.size(); i3++) {
                TLRPC.PollAnswer pollAnswer = tL_messageMediaPoll.poll.answers.get(i3);
                if (Arrays.equals(pollAnswer.option, bArr)) {
                    return pollAnswer;
                }
            }
        }
        return null;
    }

    public static boolean X2(TLRPC.Document document) {
        if (document != null && !document.thumbs.isEmpty()) {
            int size = document.thumbs.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.PhotoSize photoSize = document.thumbs.get(i3);
                if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoSizeEmpty) && (!(photoSize.location instanceof TLRPC.TL_fileLocationUnavailable) || photoSize.bytes != null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean X4(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (tL_messageMediaPoll.results.results.get(i3).chosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int Y(int i3, String str, String str2) {
        if (str == null || str2 == null) {
            return -1;
        }
        if (i3 == -1) {
            return str.indexOf(str2);
        }
        if (str2.length() + i3 < str.length() && str.startsWith(str2, i3)) {
            return i3;
        }
        int indexOf = str.indexOf(str2, i3);
        int lastIndexOf = str.lastIndexOf(str2, i3);
        return (indexOf != -1 && (lastIndexOf == -1 || indexOf - i3 < i3 - lastIndexOf)) ? indexOf : lastIndexOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CharSequence Y1(TLRPC.ChatReactions chatReactions) {
        String str;
        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
            return bd.M0(2131754291, null);
        }
        if (!(chatReactions instanceof TLRPC.TL_chatReactionsSome)) {
            return bd.M0(2131748183, null);
        }
        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i3 = 0; i3 < tL_chatReactionsSome.reactions.size(); i3++) {
            if (i3 != 0) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i3);
            if (reaction instanceof TLRPC.TL_reactionEmoji) {
                str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d");
                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.p5(((TLRPC.TL_reactionCustomEmoji) reaction).document_id, (Paint.FontMetricsInt) null), 0, 1, 0);
                str = spannableStringBuilder2;
            } else {
                str = "";
            }
            spannableStringBuilder.append(i6.m(str, null, false, null, 0));
        }
        return spannableStringBuilder;
    }

    public static boolean Y3(TLRPC.Document document) {
        if (document != null && document.thumbs != null) {
            for (int i3 = 0; i3 < document.video_thumbs.size(); i3++) {
                if ("f".equals(document.video_thumbs.get(i3).type)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.TodoItem Z(int i3, zi ziVar) {
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        TLRPC.TodoList todoList;
        TLRPC.MessageMedia n12 = n1(ziVar);
        if ((n12 instanceof TLRPC.TL_messageMediaToDo) && (todoList = (tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) n12).todo) != null && todoList.list != null) {
            for (int i10 = 0; i10 < tL_messageMediaToDo.todo.list.size(); i10++) {
                TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i10);
                if (todoItem.id == i3) {
                    return todoItem;
                }
            }
        }
        return null;
    }

    public static void a(Spannable spannable, ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        b(spannable, arrayList, z10, false, z11, z12, 0);
    }

    public static TLRPC.Document a0(ArrayList arrayList, TL_iv.RichMessage richMessage) {
        if (arrayList != null && richMessage != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    return g0.Z(((TL_iv.pageBlockVideo) pageBlock).video_id, richMessage.documents);
                }
                if (pageBlock instanceof TL_iv.pageBlockCollage) {
                    return a0(((TL_iv.pageBlockCollage) pageBlock).items, richMessage);
                }
                if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                    return a0(((TL_iv.pageBlockSlideshow) pageBlock).items, richMessage);
                }
            }
        }
        return null;
    }

    public static long a1(TLRPC.Message message) {
        return C1(message.from_id);
    }

    public static long a2(int i3, TLRPC.Message message, int i10) {
        long c2 = c2(i3, message, x7.u.a(i10, 1), x7.u.a(i10, 4));
        if (c2 == 0 && x7.u.a(i10, 8)) {
            return -1L;
        }
        return c2;
    }

    public static void a6(int i3, long j10, TLRPC.TL_messageMediaToDo tL_messageMediaToDo, int i10, boolean z10, int i11) {
        int i12 = 0;
        while (i12 < tL_messageMediaToDo.completions.size()) {
            if (tL_messageMediaToDo.completions.get(i12).id == i10) {
                tL_messageMediaToDo.completions.remove(i12);
                if (tL_messageMediaToDo.completions.isEmpty()) {
                    tL_messageMediaToDo.flags &= -2;
                }
                i12--;
            }
            i12++;
        }
        if (z10) {
            TLRPC.TL_todoCompletion tL_todoCompletion = new TLRPC.TL_todoCompletion();
            tL_todoCompletion.id = i10;
            tL_todoCompletion.completed_by = hp.s1(i3).z1(j10);
            tL_todoCompletion.date = i11;
            tL_messageMediaToDo.flags |= 1;
            tL_messageMediaToDo.completions.add(tL_todoCompletion);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x01cf, code lost:
    
        if (r8.contains("domain=telegrampassport") == false) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(CharSequence charSequence, ArrayList arrayList, boolean z10, boolean z11, boolean z12, boolean z13, int i3) {
        int i10;
        CharSequence charSequence2;
        Spannable spannable;
        byte b10;
        int i11;
        String str;
        int i12;
        boolean z14;
        int i13;
        int i14;
        String str2;
        int size;
        int i15;
        int i16;
        if (!(charSequence instanceof Spannable)) {
            return false;
        }
        CharSequence a10 = org.telegram.ui.Components.vz.a(charSequence, false);
        Spannable spannable2 = (Spannable) a10;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable2.getSpans(0, a10.length(), URLSpan.class);
        boolean z15 = uRLSpanArr != null && uRLSpanArr.length > 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            byte b11 = z12 ? (byte) 2 : z10 ? (byte) 1 : (byte) 0;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList);
            Collections.sort(arrayList3, new o0.a(15));
            int size2 = arrayList3.size();
            int i17 = 0;
            while (i17 < size2) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList3.get(i17);
                if (messageEntity.length > 0 && (i14 = messageEntity.offset) >= 0 && i14 < a10.length()) {
                    if (messageEntity.offset + messageEntity.length > a10.length()) {
                        messageEntity.length = a10.length() - messageEntity.offset;
                    }
                    if ((!z13 || (messageEntity instanceof TLRPC.TL_messageEntityBold) || (messageEntity instanceof TLRPC.TL_messageEntityItalic) || (messageEntity instanceof TLRPC.TL_messageEntityStrike) || (messageEntity instanceof TLRPC.TL_messageEntityUnderline) || (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) || (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) || (messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre) || (messageEntity instanceof TLRPC.TL_messageEntityMentionName) || (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) || (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) || (messageEntity instanceof TLRPC.TL_messageEntityDiffInsert) || (messageEntity instanceof TLRPC.TL_messageEntityDiffReplace) || (messageEntity instanceof TLRPC.TL_messageEntityDiffDelete)) && uRLSpanArr != null && uRLSpanArr.length > 0) {
                        for (int i18 = 0; i18 < uRLSpanArr.length; i18++) {
                            URLSpan uRLSpan = uRLSpanArr[i18];
                            if (uRLSpan != null) {
                                int spanStart = spannable2.getSpanStart(uRLSpan);
                                int spanEnd = spannable2.getSpanEnd(uRLSpanArr[i18]);
                                int i19 = messageEntity.offset;
                                if ((i19 <= spanStart && messageEntity.length + i19 >= spanStart) || (i19 <= spanEnd && i19 + messageEntity.length >= spanEnd)) {
                                    spannable2.removeSpan(uRLSpanArr[i18]);
                                    uRLSpanArr[i18] = null;
                                }
                            }
                        }
                    }
                    if ((i3 != 1 || (messageEntity instanceof TLRPC.TL_messageEntityHashtag)) && !(messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) && !(messageEntity instanceof TLRPC.TL_messageEntityBlockquote) && !(messageEntity instanceof TLRPC.TL_messageEntityPre) && !(messageEntity instanceof TLRPC.TL_messageEntityDiffReplace)) {
                        ty0 ty0Var = new ty0();
                        int i20 = messageEntity.offset;
                        ty0Var.b = i20;
                        ty0Var.c = i20 + messageEntity.length;
                        if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                            ty0Var.a = 256;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                            ty0Var.a = 8;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityDiffDelete) {
                            ty0Var.a = TLObject.FLAG_13;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                            ty0Var.a = 16;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                            ty0Var.a = 1;
                        } else {
                            if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ty0Var.a = 2;
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                                ty0Var.a = 4;
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityDiffInsert) {
                                ty0Var.a = TLObject.FLAG_12;
                            } else {
                                if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                                    if (z11) {
                                        ty0Var.a = 64;
                                        ty0Var.d = messageEntity;
                                    }
                                } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                    if (z11) {
                                        ty0Var.a = 64;
                                        ty0Var.d = messageEntity;
                                    }
                                } else if (!z13 || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate)) {
                                    if (((messageEntity instanceof TLRPC.TL_messageEntityUrl) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl)) && (str2 = messageEntity.url) != null) {
                                        try {
                                            String lowerCase = str2.toLowerCase();
                                            if (!lowerCase.startsWith("tg:passport")) {
                                                if (!lowerCase.startsWith("tg://passport")) {
                                                    if (!lowerCase.startsWith("tg:secureid")) {
                                                        if (lowerCase.contains("resolve")) {
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    if (!(messageEntity instanceof TLRPC.TL_messageEntityMention) || z11) {
                                        ty0Var.a = 128;
                                        ty0Var.d = messageEntity;
                                        if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                            ty0Var.a = 1152;
                                        }
                                    }
                                }
                                i17++;
                                size2 = i13;
                            }
                            size = arrayList2.size();
                            i15 = 0;
                            while (i15 < size) {
                                ty0 ty0Var2 = (ty0) arrayList2.get(i15);
                                if ((ty0Var2.a & 256) == 0 || ty0Var.b < ty0Var2.b || ty0Var.c > ty0Var2.c) {
                                    int i21 = ty0Var.b;
                                    int i22 = ty0Var2.b;
                                    if (i21 > i22) {
                                        int i23 = ty0Var2.c;
                                        if (i21 < i23) {
                                            if (ty0Var.c < i23) {
                                                ty0 ty0Var3 = new ty0(ty0Var);
                                                ty0Var3.b(ty0Var2);
                                                arrayList2.add(i15 + 1, ty0Var3);
                                                ty0 ty0Var4 = new ty0(ty0Var2);
                                                ty0Var4.b = ty0Var.c;
                                                i15 += 2;
                                                size += 2;
                                                arrayList2.add(i15, ty0Var4);
                                            } else {
                                                ty0 ty0Var5 = new ty0(ty0Var);
                                                ty0Var5.b(ty0Var2);
                                                ty0Var5.c = ty0Var2.c;
                                                i15++;
                                                size++;
                                                arrayList2.add(i15, ty0Var5);
                                            }
                                            int i24 = ty0Var.b;
                                            ty0Var.b = ty0Var2.c;
                                            ty0Var2.c = i24;
                                        }
                                    } else {
                                        int i25 = ty0Var.c;
                                        if (i22 < i25) {
                                            i16 = size2;
                                            int i26 = ty0Var2.c;
                                            if (i25 == i26) {
                                                ty0Var2.b(ty0Var);
                                            } else if (i25 < i26) {
                                                ty0 ty0Var6 = new ty0(ty0Var2);
                                                ty0Var6.b(ty0Var);
                                                ty0Var6.c = ty0Var.c;
                                                i15++;
                                                size++;
                                                arrayList2.add(i15, ty0Var6);
                                                ty0Var2.b = ty0Var.c;
                                            } else {
                                                ty0 ty0Var7 = new ty0(ty0Var);
                                                ty0Var7.b = ty0Var2.c;
                                                i15++;
                                                size++;
                                                arrayList2.add(i15, ty0Var7);
                                                ty0Var2.b(ty0Var);
                                            }
                                            ty0Var.c = i22;
                                            i15++;
                                            size2 = i16;
                                        }
                                    }
                                }
                                i16 = size2;
                                i15++;
                                size2 = i16;
                            }
                            i13 = size2;
                            if (ty0Var.b >= ty0Var.c) {
                                arrayList2.add(ty0Var);
                            }
                            i17++;
                            size2 = i13;
                        }
                        size = arrayList2.size();
                        i15 = 0;
                        while (i15 < size) {
                        }
                        i13 = size2;
                        if (ty0Var.b >= ty0Var.c) {
                        }
                        i17++;
                        size2 = i13;
                    }
                }
                i13 = size2;
                i17++;
                size2 = i13;
            }
            int min = Math.min(1000, arrayList2.size());
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            while (i27 < min) {
                ty0 ty0Var8 = (ty0) arrayList2.get(i27);
                int i30 = ty0Var8.b;
                if (i30 >= 0 && i30 < (i11 = ty0Var8.c) && i11 <= a10.length() && (i3 != 1 || (ty0Var8.d instanceof TLRPC.TL_messageEntityHashtag))) {
                    TLRPC.MessageEntity messageEntity2 = ty0Var8.d;
                    if (messageEntity2 != null) {
                        int i31 = messageEntity2.offset;
                        str = TextUtils.substring(a10, i31, messageEntity2.length + i31);
                    } else {
                        str = null;
                    }
                    TLRPC.MessageEntity messageEntity3 = ty0Var8.d;
                    if (!(messageEntity3 instanceof TLRPC.TL_messageEntityBotCommand)) {
                        if ((messageEntity3 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity3 instanceof TLRPC.TL_messageEntityMention)) {
                            charSequence2 = a10;
                            spannable = spannable2;
                            b10 = b11;
                            i12 = hs.Z3;
                        } else if (messageEntity3 instanceof TLRPC.TL_messageEntityCashtag) {
                            charSequence2 = a10;
                            spannable = spannable2;
                            i12 = 250;
                            b10 = b11;
                        } else if (!(messageEntity3 instanceof TLRPC.TL_messageEntityEmail)) {
                            charSequence2 = a10;
                            if (messageEntity3 instanceof TLRPC.TL_messageEntityUrl) {
                                if (i28 < 250) {
                                    i28++;
                                    if (!str.toLowerCase().contains("://")) {
                                        boolean z16 = org.telegram.ui.web.w0.R0;
                                        str = (org.telegram.ui.web.w0.p(Uri.parse(str)) ? "tonsite://" : "http://").concat(str);
                                    }
                                    if (str != null) {
                                        str = str.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                                    }
                                    if (sf.c.k(str)) {
                                        spannable = spannable2;
                                        b10 = b11;
                                        z15 = true;
                                    } else {
                                        spannable2.setSpan(new t31(str, ty0Var8), ty0Var8.b, ty0Var8.c, 33);
                                        spannable = spannable2;
                                        b10 = b11;
                                        z14 = false;
                                        z15 = true;
                                        if (!z14) {
                                        }
                                    }
                                }
                                spannable = spannable2;
                                b10 = b11;
                            } else if (messageEntity3 instanceof TLRPC.TL_messageEntityFormattedDate) {
                                if (i28 < 250) {
                                    i28++;
                                    spannable2.setSpan(new org.telegram.ui.Components.vz(str, ty0Var8, (TLRPC.TL_messageEntityFormattedDate) ty0Var8.d), ty0Var8.b, ty0Var8.c, 33);
                                    spannable = spannable2;
                                    b10 = b11;
                                    z14 = false;
                                    if (!z14) {
                                    }
                                }
                                spannable = spannable2;
                                b10 = b11;
                            } else {
                                if (messageEntity3 instanceof TLRPC.TL_messageEntityTonAddress) {
                                    spannable2.setSpan(new v31(t4.c.f("tonaddress:", str), ty0Var8), ty0Var8.b, ty0Var8.c, 33);
                                } else if (messageEntity3 instanceof TLRPC.TL_messageEntityBankCard) {
                                    spannable2.setSpan(new v31(t4.c.f("card:", str), ty0Var8), ty0Var8.b, ty0Var8.c, 33);
                                } else if (messageEntity3 instanceof TLRPC.TL_messageEntityPhone) {
                                    String d = mf.b.d(str, false);
                                    if (str.startsWith("+")) {
                                        d = t4.c.f("+", d);
                                    }
                                    spannable2.setSpan(new v31(t4.c.f("tel:", d), ty0Var8), ty0Var8.b, ty0Var8.c, 33);
                                } else if (messageEntity3 instanceof TLRPC.TL_messageEntityTextUrl) {
                                    if (i28 < 250) {
                                        i28++;
                                        String str3 = messageEntity3.url;
                                        if (str3 != null) {
                                            str3 = str3.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                                        }
                                        if (!sf.c.k(str3)) {
                                            spannable2.setSpan(new x31(str3, ty0Var8), ty0Var8.b, ty0Var8.c, 33);
                                            spannable = spannable2;
                                            b10 = b11;
                                            z14 = false;
                                            if (!z14) {
                                            }
                                        }
                                    }
                                    spannable = spannable2;
                                    b10 = b11;
                                } else {
                                    if (messageEntity3 instanceof TLRPC.TL_messageEntityMentionName) {
                                        spannable2.setSpan(new y31("" + ((TLRPC.TL_messageEntityMentionName) ty0Var8.d).user_id, b11, ty0Var8), ty0Var8.b, ty0Var8.c, 33);
                                    } else if (messageEntity3 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                        spannable2.setSpan(new y31("" + ((TLRPC.TL_inputMessageEntityMentionName) ty0Var8.d).user_id.user_id, b11, ty0Var8), ty0Var8.b, ty0Var8.c, 33);
                                    } else if ((ty0Var8.a & 4) != 0) {
                                        Spannable spannable3 = spannable2;
                                        byte b12 = b11;
                                        spannable = spannable3;
                                        b10 = b12;
                                        spannable.setSpan(new u31(spannable3, ty0Var8.b, ty0Var8.c, b12, ty0Var8), ty0Var8.b, ty0Var8.c, 33);
                                        z14 = false;
                                        if (!z14) {
                                        }
                                    } else {
                                        spannable = spannable2;
                                        b10 = b11;
                                        spannable.setSpan(new uy0(ty0Var8, 0), ty0Var8.b, ty0Var8.c, 33);
                                        z14 = true;
                                        if (!z14) {
                                        }
                                    }
                                    spannable = spannable2;
                                    b10 = b11;
                                    z14 = false;
                                    if (!z14) {
                                    }
                                }
                                spannable = spannable2;
                                b10 = b11;
                                z14 = false;
                                z15 = true;
                                if (!z14) {
                                }
                            }
                        } else if (i28 < 250) {
                            i28++;
                            spannable2.setSpan(new x31(t4.c.f("mailto:", str), ty0Var8), ty0Var8.b, ty0Var8.c, 33);
                            charSequence2 = a10;
                            spannable = spannable2;
                            b10 = b11;
                            z14 = false;
                            if (!z14) {
                            }
                        }
                        if (i28 < i12) {
                            i28++;
                            spannable.setSpan(new v31(str, ty0Var8), ty0Var8.b, ty0Var8.c, 33);
                            z14 = false;
                            if (!z14) {
                            }
                        }
                    } else if (i28 < 250) {
                        i28++;
                        spannable2.setSpan(new s31(str, b11, ty0Var8), ty0Var8.b, ty0Var8.c, 33);
                        charSequence2 = a10;
                        spannable = spannable2;
                        b10 = b11;
                        z14 = false;
                        if (!z14) {
                            if ((ty0Var8.a & 256) != 0 && i29 < 100) {
                                i29++;
                                spannable.setSpan(new uy0(ty0Var8, 0), ty0Var8.b, ty0Var8.c, 33);
                            }
                        }
                    }
                    i27++;
                    spannable2 = spannable;
                    b11 = b10;
                    a10 = charSequence2;
                }
                charSequence2 = a10;
                spannable = spannable2;
                b10 = b11;
                i27++;
                spannable2 = spannable;
                b11 = b10;
                a10 = charSequence2;
            }
            CharSequence charSequence3 = a10;
            Spannable spannable4 = spannable2;
            int i32 = 0;
            int size3 = arrayList3.size();
            for (int i33 = 0; i33 < size3; i33++) {
                TLRPC.MessageEntity messageEntity4 = (TLRPC.MessageEntity) arrayList3.get(i33);
                if (messageEntity4.length > 0 && (i10 = messageEntity4.offset) >= 0 && i10 < charSequence3.length()) {
                    if (messageEntity4.offset + messageEntity4.length > charSequence3.length()) {
                        messageEntity4.length = charSequence3.length() - messageEntity4.offset;
                    }
                    if (messageEntity4 instanceof TLRPC.TL_messageEntityBlockquote) {
                        int i34 = messageEntity4.offset;
                        xg0.b(spannable4, i34, messageEntity4.length + i34, messageEntity4.collapsed);
                    } else {
                        if (messageEntity4 instanceof TLRPC.TL_messageEntityPre) {
                            if (i32 < 50) {
                                i32++;
                                int i35 = messageEntity4.offset;
                                int i36 = messageEntity4.length + i35;
                                spannable4.setSpan(new oi.h(messageEntity4.language, spannable4.subSequence(i35, i36).toString(), true), i35, i36, 33);
                            }
                        } else if (messageEntity4 instanceof TLRPC.TL_messageEntityDiffReplace) {
                            int i37 = messageEntity4.offset;
                            spannable4.setSpan(new du0(), i37, messageEntity4.length + i37, 33);
                        }
                    }
                }
            }
        }
        return z15;
    }

    public static void b0(ArrayList arrayList, long j10) {
        if (arrayList == null || arrayList.isEmpty() || j10 == 0) {
            return;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i3);
            if (message instanceof TLRPC.TL_messageEmpty) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                message.peer_id = tL_peerChannel;
                tL_peerChannel.channel_id = j10;
            }
        }
    }

    public static long b2(int i3, TLRPC.Message message, boolean z10) {
        return c2(i3, message, z10, false);
    }

    public static void c0(TL_iv.PageBlock pageBlock, int i3, SpannableStringBuilder spannableStringBuilder, TL_iv.RichMessage richMessage) {
        if ((pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockSubheader) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
            f0(pageBlock.text, i3, spannableStringBuilder, 1);
            return;
        }
        int i10 = 0;
        if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockKicker)) {
            f0(pageBlock.text, i3, spannableStringBuilder, 0);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            while (i10 < pageblockblockquoteblocks.blocks.size()) {
                if (i10 > 0) {
                    spannableStringBuilder.append("  ");
                }
                c0(pageblockblockquoteblocks.blocks.get(i10), i3, spannableStringBuilder, richMessage);
                if (spannableStringBuilder.length() >= i3) {
                    spannableStringBuilder.delete(i3, spannableStringBuilder.length());
                    spannableStringBuilder.append("…");
                    return;
                }
                i10++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            f0(((TL_iv.pageBlockDetails) pageBlock).title, i3, spannableStringBuilder, 0);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            f0(((TL_iv.pageBlockAuthorDate) pageBlock).author, i3, spannableStringBuilder, 0);
            return;
        }
        TLRPC.Document document = null;
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            spannableStringBuilder.append((CharSequence) U5(R.drawable.iv_formula, "fx")).append(" ").append((CharSequence) bd.M0(2131754864, null));
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            spannableStringBuilder.append((CharSequence) bd.M0(2131748698, null));
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption == null || (pageCaption.text instanceof TL_iv.textEmpty)) {
                return;
            }
            spannableStringBuilder.append("  ");
            f0(pageBlock.caption.text, i3, spannableStringBuilder, 0);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            f0(pageBlock.text, i3, spannableStringBuilder, 4);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            for (int i11 = 0; i11 < pageblocklist.items.size(); i11++) {
                if (i11 > 0) {
                    spannableStringBuilder.append("  ");
                }
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i11);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                    if (tL_pageListItemText.checkbox) {
                        spannableStringBuilder.append((CharSequence) L(tL_pageListItemText.checked)).append(" ");
                    } else {
                        spannableStringBuilder.append("• ");
                    }
                    f0(tL_pageListItemText.text, i3, spannableStringBuilder, 0);
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                    if (tL_pageListItemBlocks.checkbox) {
                        spannableStringBuilder.append((CharSequence) L(tL_pageListItemBlocks.checked)).append(" ");
                    } else {
                        spannableStringBuilder.append("• ");
                    }
                    for (int i12 = 0; i12 < tL_pageListItemBlocks.blocks.size(); i12++) {
                        if (i12 > 0) {
                            spannableStringBuilder.append("  ");
                        }
                        c0(tL_pageListItemBlocks.blocks.get(i12), i3, spannableStringBuilder, richMessage);
                        if (spannableStringBuilder.length() >= i3) {
                            spannableStringBuilder.delete(i3, spannableStringBuilder.length());
                            spannableStringBuilder.append("…");
                            return;
                        }
                    }
                }
                if (spannableStringBuilder.length() >= i3) {
                    spannableStringBuilder.delete(i3, spannableStringBuilder.length());
                    spannableStringBuilder.append("…");
                    return;
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            for (int i13 = 0; i13 < pageblockorderedlist.items.size(); i13++) {
                if (i13 > 0) {
                    spannableStringBuilder.append("  ");
                }
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i13);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem;
                    spannableStringBuilder.append((CharSequence) tL_pageListOrderedItemText.num);
                    spannableStringBuilder.append(". ");
                    if (tL_pageListOrderedItemText.checkbox) {
                        spannableStringBuilder.append((CharSequence) L(tL_pageListOrderedItemText.checked)).append(" ");
                    }
                    f0(tL_pageListOrderedItemText.text, i3, spannableStringBuilder, 0);
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem;
                    spannableStringBuilder.append((CharSequence) tL_pageListOrderedItemBlocks.num);
                    spannableStringBuilder.append(". ");
                    if (tL_pageListOrderedItemBlocks.checkbox) {
                        spannableStringBuilder.append((CharSequence) L(tL_pageListOrderedItemBlocks.checked)).append(" ");
                    }
                    for (int i14 = 0; i14 < tL_pageListOrderedItemBlocks.blocks.size(); i14++) {
                        if (i14 > 0) {
                            spannableStringBuilder.append("  ");
                        }
                        c0(tL_pageListOrderedItemBlocks.blocks.get(i14), i3, spannableStringBuilder, richMessage);
                        if (spannableStringBuilder.length() >= i3) {
                            spannableStringBuilder.delete(i3, spannableStringBuilder.length());
                            spannableStringBuilder.append("…");
                            return;
                        }
                    }
                }
                if (spannableStringBuilder.length() >= i3) {
                    spannableStringBuilder.delete(i3, spannableStringBuilder.length());
                    spannableStringBuilder.append("…");
                    return;
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            spannableStringBuilder.append((CharSequence) U5(R.drawable.iv_preview_table, "⊞")).append(" ");
            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
            if (richText == null || (richText instanceof TL_iv.textEmpty)) {
                spannableStringBuilder.append((CharSequence) bd.M0(2131754855, null));
                return;
            } else {
                f0(richText, i3, spannableStringBuilder, 0);
                return;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
            while (true) {
                if (i10 >= richMessage.documents.size()) {
                    break;
                }
                if (richMessage.documents.get(i10).id == pageblockaudio.audio_id) {
                    document = richMessage.documents.get(i10);
                    break;
                }
                i10++;
            }
            if (document != null) {
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) g0.V(TLRPC.TL_documentAttributeAudio.class, document.attributes);
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = (TLRPC.TL_documentAttributeFilename) g0.V(TLRPC.TL_documentAttributeFilename.class, document.attributes);
                if (tL_documentAttributeAudio == null) {
                    if (tL_documentAttributeFilename == null || tL_documentAttributeFilename.file_name == null) {
                        return;
                    }
                    spannableStringBuilder.append((CharSequence) U5(R.drawable.iv_audio_preview, "🎵")).append(" ").append((CharSequence) tL_documentAttributeFilename.file_name);
                    return;
                }
                if (!TextUtils.isEmpty(tL_documentAttributeAudio.title) && !TextUtils.isEmpty(tL_documentAttributeAudio.performer)) {
                    spannableStringBuilder.append((CharSequence) U5(R.drawable.iv_audio_preview, "🎵")).append(" ").append((CharSequence) tL_documentAttributeAudio.performer).append(" – ").append((CharSequence) tL_documentAttributeAudio.title);
                    return;
                }
                if (!TextUtils.isEmpty(tL_documentAttributeAudio.title)) {
                    spannableStringBuilder.append((CharSequence) U5(R.drawable.iv_audio_preview, "🎵")).append(" ").append((CharSequence) tL_documentAttributeAudio.title);
                    return;
                } else {
                    if (tL_documentAttributeFilename == null || tL_documentAttributeFilename.file_name == null) {
                        return;
                    }
                    spannableStringBuilder.append((CharSequence) U5(R.drawable.iv_audio_preview, "🎵")).append(" ").append((CharSequence) tL_documentAttributeFilename.file_name);
                    return;
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document Z = g0.Z(((TL_iv.pageBlockDocument) pageBlock).document_id, richMessage.documents);
            if (Z != null) {
                String B = w7.B(Z);
                SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) U5(R.drawable.msg_filled_data_files, "📎")).append(" ");
                if (TextUtils.isEmpty(B)) {
                    B = bd.M0(2131753975, null);
                }
                append.append((CharSequence) B);
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockCover) {
            c0(((TL_iv.pageBlockCover) pageBlock).cover, i3, spannableStringBuilder, richMessage);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            spannableStringBuilder.append((CharSequence) bd.M0(2131753948, null));
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            spannableStringBuilder.append((CharSequence) bd.M0(2131753933, null));
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            spannableStringBuilder.append((CharSequence) bd.M0(2131754895, null));
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            spannableStringBuilder.append((CharSequence) bd.M0(2131754856, null));
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockUnsupported) {
            spannableStringBuilder.append((CharSequence) bd.M0(2131743843, null));
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
            for (int i15 = 0; i15 < pageblockbuttonrow.buttons.size(); i15++) {
                if (i15 > 0) {
                    spannableStringBuilder.append("  ");
                }
                f0(pageblockbuttonrow.buttons.get(i15).text, i3, spannableStringBuilder, 0);
            }
        }
    }

    public static long c2(int i3, TLRPC.Message message, boolean z10, boolean z11) {
        int i10;
        long e10 = h10.i(i3).e();
        if (z11) {
            return v1(message);
        }
        if ((message.flags & TLObject.FLAG_30) != 0 && m5.o(message.peer_id) == e10) {
            i10 = message.quick_reply_shortcut_id;
        } else {
            if (!z10 && i3 >= 0 && m5.o(message.peer_id) == e10) {
                return R1(e10, message);
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionTopicCreate)) {
                TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                if (messageReplyHeader == null || !messageReplyHeader.forum_topic) {
                    return z10 ? 1L : 0L;
                }
                if (!(message instanceof TLRPC.TL_messageService) || (messageAction instanceof TLRPC.TL_messageActionPinMessage)) {
                    int i11 = messageReplyHeader.reply_to_top_id;
                    if (i11 == 0) {
                        i11 = messageReplyHeader.reply_to_msg_id;
                    }
                    return i11;
                }
                int i12 = messageReplyHeader.reply_to_msg_id;
                if (i12 == 0) {
                    i12 = messageReplyHeader.reply_to_top_id;
                }
                return i12;
            }
            i10 = message.id;
        }
        return i10;
    }

    public static boolean c4(TLRPC.Message message) {
        if (message != null) {
            return ((message.flags & TLObject.FLAG_30) == 0 && message.quick_reply_shortcut == null) ? false : true;
        }
        return false;
    }

    public static void d(CharSequence charSequence, boolean z10) {
        e(z10, charSequence, true, false, false);
    }

    public static SpannableStringBuilder d0(TL_iv.RichMessage richMessage) {
        return e0(richMessage, 1024);
    }

    public static int d2(TLRPC.Message message) {
        int i3 = !message.unread ? 1 : 0;
        return !message.media_unread ? i3 | 2 : i3;
    }

    public static boolean d3(TLRPC.Message message) {
        if (message != null) {
            return g3(message.id) || message.ephemeralReceiverBotId != 0;
        }
        return false;
    }

    public static void d6(ArrayList arrayList, List list) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i3);
            if (photoSize != null) {
                int size2 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size2) {
                        TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) list.get(i10);
                        if (!(photoSize2 instanceof TLRPC.TL_photoSizeEmpty) && !(photoSize2 instanceof TLRPC.TL_photoCachedSize) && photoSize2 != null && photoSize2.type.equals(photoSize.type)) {
                            photoSize.location = photoSize2.location;
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
    }

    public static void e(boolean z10, CharSequence charSequence, boolean z11, boolean z12, boolean z13) {
        if ((charSequence instanceof Spannable) && M(charSequence)) {
            try {
                g0.c((Spannable) charSequence, 1, z13, false);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            h(z10, charSequence, z11, 0, 0, z12);
        }
    }

    public static SpannableStringBuilder e0(TL_iv.RichMessage richMessage, int i3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (richMessage != null) {
            for (int i10 = 0; i10 < richMessage.blocks.size(); i10++) {
                TL_iv.PageBlock pageBlock = richMessage.blocks.get(i10);
                if (i10 > 0) {
                    spannableStringBuilder.append((CharSequence) "  ");
                }
                c0(pageBlock, i3, spannableStringBuilder, richMessage);
                if (spannableStringBuilder.length() >= i3) {
                    spannableStringBuilder.delete(i3, spannableStringBuilder.length());
                    spannableStringBuilder.append((CharSequence) "…");
                    return spannableStringBuilder;
                }
            }
        }
        return spannableStringBuilder;
    }

    public static boolean e5(TLRPC.Message message) {
        if (d3(message)) {
            return message.ephemeralReceiverBotId == -1 || message.ephemeralAnchorMsgId != 0;
        }
        return false;
    }

    public static void e6(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollResults pollResults) {
        TLRPC.Poll poll;
        ArrayList<TLRPC.PollAnswerVoters> arrayList;
        ArrayList arrayList2;
        byte[] bArr;
        ArrayList<TLRPC.PollAnswerVoters> arrayList3;
        if (tL_messageMediaPoll == null || pollResults == null) {
            return;
        }
        if ((pollResults.flags & 2) != 0) {
            if (!pollResults.min || (arrayList3 = tL_messageMediaPoll.results.results) == null) {
                arrayList2 = null;
                bArr = null;
            } else {
                int size = arrayList3.size();
                arrayList2 = null;
                bArr = null;
                for (int i3 = 0; i3 < size; i3++) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i3);
                    if (pollAnswerVoters.chosen) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(pollAnswerVoters.option);
                    }
                    if (pollAnswerVoters.correct) {
                        bArr = pollAnswerVoters.option;
                    }
                }
            }
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            ArrayList<TLRPC.PollAnswerVoters> arrayList4 = pollResults.results;
            pollResults2.results = arrayList4;
            if (arrayList2 != null || bArr != null) {
                int size2 = arrayList4.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    TLRPC.PollAnswerVoters pollAnswerVoters2 = tL_messageMediaPoll.results.results.get(i10);
                    if (arrayList2 != null) {
                        int size3 = arrayList2.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size3) {
                                break;
                            }
                            if (Arrays.equals(pollAnswerVoters2.option, (byte[]) arrayList2.get(i11))) {
                                pollAnswerVoters2.chosen = true;
                                arrayList2.remove(i11);
                                break;
                            }
                            i11++;
                        }
                        if (arrayList2.isEmpty()) {
                            arrayList2 = null;
                        }
                    }
                    if (bArr != null && Arrays.equals(pollAnswerVoters2.option, bArr)) {
                        pollAnswerVoters2.correct = true;
                        bArr = null;
                    }
                    if (arrayList2 == null && bArr == null) {
                        break;
                    }
                }
            }
            TLRPC.PollResults pollResults3 = tL_messageMediaPoll.results;
            pollResults3.flags = 2 | pollResults3.flags;
        } else if (!pollResults.min && (poll = tL_messageMediaPoll.poll) != null && poll.hide_results_until_close && ((arrayList = pollResults.results) == null || arrayList.isEmpty())) {
            tL_messageMediaPoll.results.results = new ArrayList<>();
            TLRPC.PollResults pollResults4 = tL_messageMediaPoll.results;
            pollResults4.flags = x7.u.b(pollResults4.flags, 2, false);
        }
        if ((pollResults.flags & 4) != 0) {
            TLRPC.PollResults pollResults5 = tL_messageMediaPoll.results;
            pollResults5.total_voters = pollResults.total_voters;
            pollResults5.flags |= 4;
        }
        if ((pollResults.flags & 8) != 0) {
            TLRPC.PollResults pollResults6 = tL_messageMediaPoll.results;
            pollResults6.recent_voters = pollResults.recent_voters;
            pollResults6.flags |= 8;
        }
        if ((pollResults.flags & 16) != 0) {
            TLRPC.PollResults pollResults7 = tL_messageMediaPoll.results;
            pollResults7.solution = pollResults.solution;
            pollResults7.solution_entities = pollResults.solution_entities;
            pollResults7.flags |= 16;
        }
        if (pollResults.min) {
            return;
        }
        TLRPC.PollResults pollResults8 = tL_messageMediaPoll.results;
        pollResults8.has_unread_votes = pollResults.has_unread_votes;
        pollResults8.can_view_stats = pollResults.can_view_stats;
    }

    public static void f0(TL_iv.RichText richText, int i3, SpannableStringBuilder spannableStringBuilder, int i10) {
        if (richText == null) {
            return;
        }
        int length = spannableStringBuilder.length();
        if (richText instanceof TL_iv.textPlain) {
            spannableStringBuilder.append((CharSequence) ((TL_iv.textPlain) richText).text);
        } else if (richText instanceof TL_iv.textButton) {
            f0(richText.text, i3, spannableStringBuilder, i10);
        } else if (richText instanceof TL_iv.textBold) {
            f0(richText.text, i3, spannableStringBuilder, i10 | 1);
        } else if (richText instanceof TL_iv.textItalic) {
            f0(richText.text, i3, spannableStringBuilder, i10 | 2);
        } else if (richText instanceof TL_iv.textUnderline) {
            f0(richText.text, i3, spannableStringBuilder, i10 | 16);
        } else if (richText instanceof TL_iv.textStrike) {
            f0(richText.text, i3, spannableStringBuilder, i10 | 8);
        } else if (richText instanceof TL_iv.textFixed) {
            f0(richText.text, i3, spannableStringBuilder, i10 | 4);
        } else if (richText instanceof TL_iv.textSpoiler) {
            f0(richText.text, i3, spannableStringBuilder, i10 | 256);
        } else if (richText instanceof TL_iv.textUrl) {
            f0(richText.text, i3, spannableStringBuilder, i10);
            if (spannableStringBuilder.length() > length) {
                ty0 ty0Var = new ty0();
                ty0Var.a = i10;
                spannableStringBuilder.setSpan(new t31(richText.url, ty0Var), length, spannableStringBuilder.length(), 33);
            }
        } else if (richText instanceof TL_iv.textEmail) {
            f0(richText.text, i3, spannableStringBuilder, i10);
            if (spannableStringBuilder.length() > length) {
                ty0 ty0Var2 = new ty0();
                ty0Var2.a = i10;
                spannableStringBuilder.setSpan(new x31("mailto:" + richText.email, ty0Var2), length, spannableStringBuilder.length(), 33);
            }
        } else if (richText instanceof TL_iv.textMath) {
            spannableStringBuilder.append((CharSequence) U5(R.drawable.iv_formula, "fx")).append(" ").append((CharSequence) bd.M0(2131754864, null));
        } else if (richText instanceof TL_iv.textPhone) {
            f0(richText.text, i3, spannableStringBuilder, i10);
            if (spannableStringBuilder.length() > length) {
                TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                String d = mf.b.d(textphone.phone, false);
                if (textphone.phone.startsWith("+")) {
                    d = t4.c.f("+", d);
                }
                ty0 ty0Var3 = new ty0();
                ty0Var3.a = i10;
                spannableStringBuilder.setSpan(new v31(t4.c.f("tel:", d), ty0Var3), length, spannableStringBuilder.length(), 33);
            }
        } else if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                TL_iv.RichText richText2 = arrayList.get(i11);
                i11++;
                f0(richText2, i3, spannableStringBuilder, i10);
                if (spannableStringBuilder.length() >= i3) {
                    spannableStringBuilder.delete(i3, spannableStringBuilder.length());
                    spannableStringBuilder.append("…");
                    return;
                }
            }
        }
        if (spannableStringBuilder.length() <= length || i10 == 0) {
            return;
        }
        ty0 ty0Var4 = new ty0();
        ty0Var4.a = i10;
        spannableStringBuilder.setSpan(new uy0(ty0Var4, 0), length, spannableStringBuilder.length(), 33);
    }

    public static String f2(TLObject tLObject, ArrayList arrayList, int i3) {
        String str;
        String K;
        long j10;
        String str2;
        long j11;
        String str3 = null;
        if (tLObject == null) {
            str2 = "";
            j11 = 0;
        } else {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                str = user.deleted ? bd.M0(2131749336, null) : g5.m(0, user.first_name, user.last_name);
                K = l10.n(user);
                j10 = user.id;
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                str = chat.title;
                K = t3.K(chat, false);
                j10 = -chat.id;
            }
            str2 = str;
            str3 = K;
            j11 = j10;
        }
        if (i3 >= 0) {
            TLRPC.TL_messageEntityMentionName tL_messageEntityMentionName = new TLRPC.TL_messageEntityMentionName();
            tL_messageEntityMentionName.user_id = j11;
            tL_messageEntityMentionName.offset = i3;
            tL_messageEntityMentionName.length = str2.length();
            arrayList.add(tL_messageEntityMentionName);
        }
        if (TextUtils.isEmpty(str3)) {
            return str2;
        }
        if (i3 >= 0) {
            TLRPC.TL_messageEntityMentionName tL_messageEntityMentionName2 = new TLRPC.TL_messageEntityMentionName();
            tL_messageEntityMentionName2.user_id = j11;
            tL_messageEntityMentionName2.offset = str2.length() + i3 + 2;
            tL_messageEntityMentionName2.length = str3.length() + 1;
            arrayList.add(tL_messageEntityMentionName2);
        }
        return String.format("%1$s (@%2$s)", str2, str3);
    }

    public static boolean f3(TLRPC.Message message) {
        return d3(message) && !e5(message);
    }

    public static void g(int i3, TLRPC.MessageReactions messageReactions, int i10, long j10, boolean z10) {
        TLRPC.MessageReactor messageReactor = null;
        TLRPC.ReactionCount reactionCount = null;
        for (int i11 = 0; i11 < messageReactions.results.size(); i11++) {
            if (messageReactions.results.get(i11).reaction instanceof TLRPC.TL_reactionPaid) {
                reactionCount = messageReactions.results.get(i11);
            }
        }
        int i12 = 0;
        while (true) {
            if (i12 >= messageReactions.top_reactors.size()) {
                break;
            }
            if (messageReactions.top_reactors.get(i12).my) {
                messageReactor = messageReactions.top_reactors.get(i12);
                break;
            }
            i12++;
        }
        if (reactionCount == null && i10 > 0) {
            reactionCount = new TLRPC.TL_reactionCount();
            reactionCount.reaction = new TLRPC.TL_reactionPaid();
            messageReactions.results.add(0, reactionCount);
        }
        if (reactionCount != null) {
            reactionCount.chosen = z10;
            int max = Math.max(0, reactionCount.count + i10);
            reactionCount.count = max;
            if (max <= 0) {
                messageReactions.results.remove(reactionCount);
            }
        }
        if (messageReactor == null && i10 > 0) {
            messageReactor = new TLRPC.TL_messageReactor();
            messageReactor.my = true;
            messageReactions.top_reactors.add(messageReactor);
        }
        if (messageReactor != null) {
            messageReactor.count = Math.max(0, messageReactor.count + i10);
            messageReactor.anonymous = j10 == 2666000;
            if (j10 == 0 || j10 == 2666000) {
                messageReactor.peer_id = hp.s1(i3).z1(h10.i(i3).e());
            } else {
                messageReactor.peer_id = hp.s1(i3).z1(j10);
            }
            if (messageReactor.count <= 0) {
                messageReactions.top_reactors.remove(messageReactor);
            }
        }
    }

    public static int g1(TLRPC.BotInlineResult botInlineResult) {
        int k22 = (int) k2(botInlineResult.content);
        return k22 == 0 ? (int) k2(botInlineResult.thumb) : k22;
    }

    public static String g2(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return bd.M0(2131743671, null).toLowerCase();
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            sb2.append("@");
            sb2.append((String) arrayList.get(i3));
            if (i3 < arrayList.size() - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    public static boolean g3(int i3) {
        return (i3 & 1879048192) == 1610612736;
    }

    public static void g6(TLRPC.Message message, TLRPC.TL_messageReactions tL_messageReactions) {
        if (message == null || tL_messageReactions == null) {
            return;
        }
        TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
        if (tL_messageReactions2 != null) {
            int size = tL_messageReactions2.results.size();
            boolean z10 = false;
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.ReactionCount reactionCount = message.reactions.results.get(i3);
                int size2 = tL_messageReactions.results.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    TLRPC.ReactionCount reactionCount2 = tL_messageReactions.results.get(i10);
                    if (dh.o0.g(reactionCount.reaction, reactionCount2.reaction)) {
                        if (!z10 && tL_messageReactions.min && reactionCount.chosen) {
                            reactionCount2.chosen = true;
                            z10 = true;
                        }
                        reactionCount2.lastDrawnPosition = reactionCount.lastDrawnPosition;
                    }
                }
                if (reactionCount.chosen) {
                    z10 = true;
                }
            }
        }
        message.reactions = tL_messageReactions;
        message.flags |= TLObject.FLAG_20;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f5 A[Catch: Exception -> 0x01c7, TryCatch #1 {Exception -> 0x01c7, blocks: (B:12:0x004f, B:17:0x0055, B:18:0x0059, B:22:0x0063, B:47:0x023c, B:49:0x0246, B:51:0x0249, B:52:0x024e, B:80:0x0179, B:83:0x01ba, B:87:0x01d1, B:90:0x01e0, B:92:0x01ea, B:95:0x01f0, B:97:0x01f5, B:102:0x0205, B:104:0x0236, B:105:0x021e, B:123:0x003d, B:126:0x0049), top: B:122:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(boolean z10, CharSequence charSequence, boolean z11, int i3, int i10, boolean z12) {
        boolean z13;
        Matcher matcher;
        int i11;
        int i12;
        String str;
        URLSpan[] uRLSpanArr;
        int i13;
        int i14;
        v31 v31Var;
        Object[] objArr;
        v31 s31Var;
        if (charSequence == null) {
            return;
        }
        int i15 = 3;
        int i16 = 1;
        try {
            if (i3 == 3 || i3 == 4) {
                try {
                    if (m3 == null) {
                        m3 = Pattern.compile("\\b(?:(\\d{1,2}):)?(\\d{1,3}):([0-5][0-9])\\b(?: - |)([^\\n]*)");
                    }
                    matcher = m3.matcher(charSequence);
                } catch (Exception e10) {
                    e = e10;
                    z13 = 1;
                    a8.g(e, z13);
                    return;
                }
            } else if (i3 == 1) {
                if (l3 == null) {
                    l3 = Pattern.compile("(^|\\s|\\()@[a-zA-Z\\d_.]{1,32}|(^|\\s|\\()#[\\w.]+");
                }
                matcher = l3.matcher(charSequence);
            } else {
                if (k3 == null) {
                    k3 = Pattern.compile("(^|\\s)/[a-zA-Z@\\d_]{1,255}|(^|\\s|\\()@[a-zA-Z\\d_]{1,32}|(^|\\s|\\()#[^0-9][\\w.]+(@[^0-9][\\w.]+)?|(^|\\s|\\()\\$[^0-9][\\w.]+(@[^0-9][\\w.]+)?|(^|\\s)\\$[A-Z]{3,8}([ ,.]|$)");
                }
                matcher = k3.matcher(charSequence);
            }
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                int i17 = 0;
                while (matcher.find() && i17 < 100) {
                    int start = matcher.start();
                    int end = matcher.end();
                    v31 v31Var2 = null;
                    if (i3 == i15 || i3 == 4) {
                        i11 = 0;
                        matcher.groupCount();
                        int start2 = matcher.start(i16);
                        int end2 = matcher.end(i16);
                        int start3 = matcher.start(2);
                        int end3 = matcher.end(2);
                        int start4 = matcher.start(i15);
                        int end4 = matcher.end(i15);
                        int start5 = matcher.start(4);
                        i12 = i17;
                        int end5 = matcher.end(4);
                        int intValue = Utilities.z(charSequence.subSequence(start3, end3)).intValue();
                        int intValue2 = Utilities.z(charSequence.subSequence(start4, end4)).intValue();
                        int intValue3 = (start2 < 0 || end2 < 0) ? -1 : Utilities.z(charSequence.subSequence(start2, end2)).intValue();
                        if (start5 >= 0 && end5 >= 0) {
                            str = charSequence.subSequence(start5, end5).toString();
                            if (start5 < 0 || end5 >= 0) {
                                end = end4;
                            }
                            uRLSpanArr = (URLSpan[]) spannable.getSpans(start, end, URLSpan.class);
                            if (uRLSpanArr != null || uRLSpanArr.length <= 0) {
                                i13 = (intValue * 60) + intValue2;
                                if (intValue3 > 0) {
                                    i13 += intValue3 * 3600;
                                }
                                if (i13 <= i10) {
                                    i14 = 3;
                                    if (i3 == 3) {
                                        v31Var = new v31("video?" + i13, (ty0) null);
                                    } else {
                                        v31Var = new v31("audio?" + i13, (ty0) null);
                                    }
                                    v31Var2 = v31Var;
                                    v31Var2.d = str;
                                    if (v31Var2 != null) {
                                        if (z12 && (objArr = (ClickableSpan[]) spannable.getSpans(start, end, ClickableSpan.class)) != null && objArr.length > 0) {
                                            spannable.removeSpan(objArr[i11]);
                                        }
                                        spannable.setSpan(v31Var2, start, end, i11);
                                        i17 = i12 + 1;
                                    } else {
                                        i17 = i12;
                                    }
                                    i15 = i14;
                                }
                            }
                            i17 = i12;
                            i15 = 3;
                        }
                        str = null;
                        if (start5 < 0) {
                        }
                        end = end4;
                        uRLSpanArr = (URLSpan[]) spannable.getSpans(start, end, URLSpan.class);
                        if (uRLSpanArr != null) {
                        }
                        i13 = (intValue * 60) + intValue2;
                        if (intValue3 > 0) {
                        }
                        if (i13 <= i10) {
                        }
                        i17 = i12;
                        i15 = 3;
                    } else {
                        char charAt = charSequence.charAt(start);
                        i11 = 0;
                        if (i3 != 0) {
                            if (charAt != '@' && charAt != '#') {
                                start++;
                            }
                            charAt = charSequence.charAt(start);
                            if (charAt != '@' && charAt != '#') {
                                i12 = i17;
                                i17 = i12;
                                i15 = 3;
                            }
                        } else if (charAt != '@' && charAt != '#' && charAt != '/' && charAt != '$') {
                            start++;
                        }
                        if (i3 == i16) {
                            if (charAt == '@') {
                                s31Var = new v31("https://instagram.com/" + charSequence.subSequence(start + 1, end).toString(), (ty0) null);
                            } else {
                                s31Var = new v31("https://www.instagram.com/explore/tags/" + charSequence.subSequence(start + 1, end).toString(), (ty0) null);
                            }
                        } else if (i3 == 2) {
                            if (charAt == '@') {
                                s31Var = new v31("https://twitter.com/" + charSequence.subSequence(start + 1, end).toString(), (ty0) null);
                            } else {
                                s31Var = new v31("https://twitter.com/hashtag/" + charSequence.subSequence(start + 1, end).toString(), (ty0) null);
                            }
                        } else if (charSequence.charAt(start) != '/') {
                            String charSequence2 = charSequence.subSequence(start, end).toString();
                            if (charSequence2 != null) {
                                charSequence2 = charSequence2.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                            }
                            i14 = i15;
                            i12 = i17;
                            v31Var2 = new v31(charSequence2, (ty0) null);
                            if (v31Var2 != null) {
                            }
                            i15 = i14;
                        } else if (z11) {
                            s31Var = new s31(charSequence.subSequence(start, end).toString(), z10 ? 1 : 0, null);
                            i14 = i15;
                            v31Var2 = s31Var;
                            i12 = i17;
                            if (v31Var2 != null) {
                            }
                            i15 = i14;
                        } else {
                            i14 = i15;
                            i12 = i17;
                            if (v31Var2 != null) {
                            }
                            i15 = i14;
                        }
                        i14 = i15;
                        v31Var2 = s31Var;
                        i12 = i17;
                        if (v31Var2 != null) {
                        }
                        i15 = i14;
                    }
                    i16 = 1;
                }
            }
        } catch (Exception e11) {
            e = e11;
            z13 = i16;
        }
    }

    public static CharSequence h0(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        org.telegram.ui.ActionBar.k6.P();
        TextPaint textPaint = org.telegram.ui.ActionBar.k6.s2;
        if (textPaint == null) {
            textPaint = new TextPaint(1);
            textPaint.setTypeface(g0.o());
            textPaint.setTextSize(g0.L(Math.max(16, az.W0) - 2));
        }
        return j0(tL_textWithEntities, z10, false, textPaint);
    }

    public static int[] h1(TLRPC.BotInlineResult botInlineResult) {
        int[] l22 = l2(botInlineResult.content);
        if (l22 != null) {
            return l22;
        }
        int[] l23 = l2(botInlineResult.thumb);
        return l23 == null ? new int[]{0, 0} : l23;
    }

    public static StaticLayout h5(CharSequence charSequence, TextPaint textPaint, int i3, float f10, float f11, boolean z10, Layout.Alignment alignment) {
        int i10 = i3 <= 0 ? 1 : i3;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 24) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, f10, f11, false);
        }
        StaticLayout.Builder alignment2 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setLineSpacing(f11, f10).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment);
        if (z10) {
            alignment2.setIncludePad(false);
        }
        if (i11 >= 28) {
            alignment2.setUseLineSpacingFromFallbacks(false);
        }
        StaticLayout build = alignment2.build();
        for (int i12 = 0; i12 < build.getLineCount(); i12++) {
            if (build.getLineRight(i12) > i10) {
                StaticLayout.Builder alignment3 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setLineSpacing(f11, f10).setBreakStrategy(0).setHyphenationFrequency(0).setAlignment(alignment);
                if (z10) {
                    alignment3.setIncludePad(false);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    alignment3.setUseLineSpacingFromFallbacks(false);
                }
                return alignment3.build();
            }
        }
        return build;
    }

    public static CharSequence i0(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, TextPaint textPaint) {
        return j0(tL_textWithEntities, z10, false, textPaint);
    }

    public static int i2(TLRPC.TL_document tL_document) {
        if (tL_document != null) {
            int size = tL_document.attributes.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.DocumentAttribute documentAttribute = tL_document.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    return documentAttribute.w;
                }
            }
        }
        return 0;
    }

    public static CharSequence i6() {
        if (p3 == null) {
            p3 = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = p3;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.mini_reply_user, 0);
            wpVar.H = 0.9f;
            float L = g0.L(1.0f);
            wpVar.r = 0.0f;
            wpVar.s = L;
            ((SpannableStringBuilder) p3[0]).setSpan(wpVar, 0, 1, 33);
        }
        return p3[0];
    }

    public static CharSequence j0(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, boolean z11, TextPaint textPaint) {
        if (tL_textWithEntities == null || tL_textWithEntities.text == null) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
        b(spannableStringBuilder, tL_textWithEntities.entities, z10, false, z11, false, 0);
        return C5(i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
    }

    public static TLRPC.InputStickerSet j1(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        int size = document.attributes.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) {
                    return null;
                }
                return inputStickerSet;
            }
        }
        return null;
    }

    public static boolean j4(TLRPC.Document document) {
        if (document != null && "video/mp4".equals(document.mime_type)) {
            boolean z10 = false;
            int i3 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i3 = documentAttribute.w;
                    i10 = documentAttribute.h;
                    z10 = documentAttribute.round_message;
                }
            }
            if (z10 && i3 <= 1280 && i10 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static TLRPC.InputStickerSet k1(TLRPC.Message message) {
        TLRPC.Document G0 = G0(message);
        if (G0 != null) {
            return j1(G0);
        }
        return null;
    }

    public static double k2(TLRPC.WebDocument webDocument) {
        if (webDocument == null) {
            return 0.0d;
        }
        int size = webDocument.attributes.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.DocumentAttribute documentAttribute = webDocument.attributes.get(i3);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.duration;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                return documentAttribute.duration;
            }
        }
        return 0.0d;
    }

    public static boolean k4(TLRPC.Message message) {
        return (!(o1(message) instanceof TLRPC.TL_messageMediaWebPage) || o1(message).webpage == null) ? o1(message) != null && j4(o1(message).document) : j4(o1(message).webpage.document);
    }

    public static int[] l2(TLRPC.WebDocument webDocument) {
        if (webDocument == null) {
            return null;
        }
        int size = webDocument.attributes.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.DocumentAttribute documentAttribute = webDocument.attributes.get(i3);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                return new int[]{documentAttribute.w, documentAttribute.h};
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return new int[]{documentAttribute.w, documentAttribute.h};
            }
        }
        return null;
    }

    public static boolean m3(TLRPC.Message message) {
        return ((message.flags & 4) == 0 || message.fwd_from == null) ? false : true;
    }

    public static TLRPC.MessageMedia n1(zi ziVar) {
        TLRPC.Message message;
        if (ziVar == null || (message = ziVar.k) == null) {
            return null;
        }
        TLRPC.MessageMedia messageMedia = ziVar.Y0;
        return messageMedia != null ? messageMedia : o1(message);
    }

    public static CharSequence n2() {
        if (q3 == null) {
            q3 = new SpannableStringBuilder("g");
            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.msg_folders_groups, 0);
            wpVar.I = 0.7f;
            wpVar.J = 0.7f;
            q3.setSpan(wpVar, 0, 1, 33);
        }
        return q3;
    }

    public static boolean n3(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                return ((TLRPC.TL_documentAttributeCustomEmoji) documentAttribute).free;
            }
        }
        return false;
    }

    public static boolean n4(TLRPC.Message message) {
        if (message instanceof TLRPC.TL_message_secret) {
            return ((o1(message) instanceof TLRPC.TL_messageMediaPhoto) || k4(message) || M4(message)) && o1(message).ttl_seconds != 0;
        }
        if (message instanceof TLRPC.TL_message) {
            return ((o1(message) instanceof TLRPC.TL_messageMediaPhoto) || (o1(message) instanceof TLRPC.TL_messageMediaDocument)) && o1(message).ttl_seconds != 0;
        }
        return false;
    }

    public static TLRPC.MessageMedia o1(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia = message.media;
        return (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(message.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) ? message.media : ((TLRPC.TL_messageExtendedMedia) message.media.extended_media.get(0)).media;
    }

    public static boolean p(TLRPC.Document document) {
        return (L2(document, true) || P4(document)) && lc.e(1);
    }

    public static long q1(TLRPC.MessageMedia messageMedia) {
        TLRPC.WebPage webPage;
        TLRPC.Document document = (!(messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (webPage = messageMedia.webpage) == null) ? messageMedia instanceof TLRPC.TL_messageMediaGame ? messageMedia.game.document : messageMedia != null ? messageMedia.document : null : webPage.document;
        if (document != null) {
            return document.size;
        }
        return 0L;
    }

    public static boolean r(int i3, boolean z10, TLRPC.Message message, TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.Peer peer;
        if (message == null) {
            return false;
        }
        if (t3.V(chat) && (message.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) {
            return false;
        }
        if (message.id >= 0) {
            if (chat == null && (peer = message.peer_id) != null && peer.channel_id != 0) {
                chat = hp.s1(i3).M0(Long.valueOf(message.peer_id.channel_id));
            }
            if (t3.T(chat)) {
                if (!z10 || chat.megagroup) {
                    boolean z11 = message.out;
                    if (z11 && (message instanceof TLRPC.TL_messageService)) {
                        if (message.id == 1 || !t3.y(13, chat)) {
                            return false;
                        }
                    } else if (!z10) {
                        if (message.id == 1) {
                            return false;
                        }
                        if (!chat.creator && (((tL_chatAdminRights = chat.admin_rights) == null || (!tL_chatAdminRights.delete_messages && (!z11 || (!chat.megagroup && !tL_chatAdminRights.post_messages)))) && (!chat.megagroup || !z11))) {
                            return false;
                        }
                    }
                } else if (!chat.creator) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = chat.admin_rights;
                    if (tL_chatAdminRights2 == null) {
                        return false;
                    }
                    if (!tL_chatAdminRights2.delete_messages && !message.out) {
                        return false;
                    }
                }
            } else if (!z10 && !message.out && t3.T(chat)) {
                return false;
            }
        }
        return true;
    }

    public static void r5(TLRPC.Message message) {
        TLRPC.Peer peer = message.from_id;
        if (peer == null) {
            message.flags &= -257;
        }
        if (peer == null) {
            message.flags &= -5;
        }
        if (message.reply_to == null) {
            message.flags &= -9;
        }
        if (message.media == null) {
            message.flags &= -513;
        }
        if (message.reply_markup == null) {
            message.flags &= -65;
        }
        if (message.replies == null) {
            message.flags &= -8388609;
        }
        if (message.reactions == null) {
            message.flags &= -1048577;
        }
    }

    public static boolean s3(e20 e20Var) {
        if (e20Var != null) {
            if (e20Var.e.equals("image/gif")) {
                return true;
            }
            if ("video/mp4".equals(e20Var.e)) {
                int i3 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < e20Var.c.size(); i11++) {
                    TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) e20Var.c.get(i11);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) && (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i3 = documentAttribute.w;
                        i10 = documentAttribute.h;
                    }
                }
                if (i3 <= 1280 && i10 <= 1280) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String t0(TLRPC.Document document, boolean z10) {
        if (document == null || "audio/ogg".equals(document.mime_type)) {
            return null;
        }
        int size = document.attributes.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                if (documentAttribute.voice) {
                    return null;
                }
                String str = documentAttribute.performer;
                String str2 = documentAttribute.title;
                if (!TextUtils.isEmpty(str)) {
                    for (int i10 = 0; i10 < 14; i10++) {
                        str = str.replace(n3[i10], " ");
                    }
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    return null;
                }
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("athumb://itunes.apple.com/search?term=");
                    sb2.append(URLEncoder.encode(str + " - " + str2, "UTF-8"));
                    sb2.append("&entity=song&limit=4");
                    sb2.append(z10 ? "&s=1" : "");
                    return sb2.toString();
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    public static boolean t3(TLRPC.Document document, boolean z10) {
        String str;
        if (document == null || (str = document.mime_type) == null) {
            return false;
        }
        return (str.equals("image/gif") && !z10) || N3(document);
    }

    public static CharSequence t5(int i3, long j10) {
        if (j10 >= 0) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
            return a22 != null ? g0.D2(l10.p(a22)) : "";
        }
        TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
        if (M0 != null) {
            return new SpannableStringBuilder(t3.V(M0) ? F() : n2()).append((CharSequence) " ").append((CharSequence) g0.D2(M0.title));
        }
        return "";
    }

    public static boolean u3(TLRPC.Message message) {
        if (o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return t3(o1(message).webpage.document, false);
        }
        if (o1(message) != null) {
            if (t3(o1(message).document, message.grouped_id != 0)) {
                return true;
            }
        }
        return false;
    }

    public static CharSequence u5(int i3, TLRPC.Peer peer, boolean z10) {
        TLRPC.Chat M0;
        if (peer instanceof TLRPC.TL_peerUser) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(peer.user_id));
            return a22 != null ? z10 ? new SpannableStringBuilder(i6()).append((CharSequence) " ").append((CharSequence) l10.p(a22)) : l10.p(a22) : "";
        }
        if (peer instanceof TLRPC.TL_peerChat) {
            TLRPC.Chat M02 = hp.s1(i3).M0(Long.valueOf(peer.chat_id));
            if (M02 == null) {
                return "";
            }
            if (z10) {
                return new SpannableStringBuilder(t3.V(M02) ? F() : n2()).append((CharSequence) " ").append((CharSequence) M02.title);
            }
            return M02.title;
        }
        if (!(peer instanceof TLRPC.TL_peerChannel) || (M0 = hp.s1(i3).M0(Long.valueOf(peer.channel_id))) == null) {
            return "";
        }
        if (z10) {
            return new SpannableStringBuilder(t3.V(M0) ? F() : n2()).append((CharSequence) " ").append((CharSequence) M0.title);
        }
        return M0.title;
    }

    public static long v0(TLRPC.Message message) {
        TLRPC.Peer peer = message.peer_id;
        if (peer != null) {
            return peer.channel_id;
        }
        return 0L;
    }

    public static long v1(TLRPC.Message message) {
        TLRPC.Peer peer;
        if (message == null || (peer = message.saved_peer_id) == null) {
            return 0L;
        }
        long j10 = peer.chat_id;
        if (j10 != 0) {
            return -j10;
        }
        long j11 = peer.channel_id;
        return j11 != 0 ? -j11 : peer.user_id;
    }

    public static boolean v4(TLRPC.Document document) {
        if (document != null) {
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                if (document.attributes.get(i3) instanceof TLRPC.TL_documentAttributeSticker) {
                    return "image/webp".equals(document.mime_type) || "video/webm".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    public static boolean v5(TLRPC.InputPeer inputPeer, TLRPC.InputPeer inputPeer2) {
        if (inputPeer == null && inputPeer2 == null) {
            return true;
        }
        if (inputPeer != null && inputPeer2 != null) {
            if ((inputPeer instanceof TLRPC.TL_inputPeerChat) && (inputPeer2 instanceof TLRPC.TL_inputPeerChat)) {
                return inputPeer.chat_id == inputPeer2.chat_id;
            }
            if ((inputPeer instanceof TLRPC.TL_inputPeerChannel) && (inputPeer2 instanceof TLRPC.TL_inputPeerChannel)) {
                return inputPeer.channel_id == inputPeer2.channel_id;
            }
            if ((inputPeer instanceof TLRPC.TL_inputPeerUser) && (inputPeer2 instanceof TLRPC.TL_inputPeerUser)) {
                return inputPeer.user_id == inputPeer2.user_id;
            }
            if ((inputPeer instanceof TLRPC.TL_inputPeerSelf) && (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) {
                return true;
            }
        }
        return false;
    }

    public static String w1(TLRPC.Document document) {
        if (document != null) {
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && !documentAttribute.voice) {
                    String str = documentAttribute.performer;
                    return TextUtils.isEmpty(str) ? bd.M0(2131753900, null) : str;
                }
            }
        }
        return bd.M0(2131753900, null);
    }

    public static boolean w4(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        if (document != null) {
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean w5(TLRPC.Peer peer, TLRPC.Peer peer2) {
        if (peer == null && peer2 == null) {
            return true;
        }
        if (peer != null && peer2 != null) {
            if ((peer instanceof TLRPC.TL_peerChat) && (peer2 instanceof TLRPC.TL_peerChat)) {
                return peer.chat_id == peer2.chat_id;
            }
            if ((peer instanceof TLRPC.TL_peerChannel) && (peer2 instanceof TLRPC.TL_peerChannel)) {
                return peer.channel_id == peer2.channel_id;
            }
            if ((peer instanceof TLRPC.TL_peerUser) && (peer2 instanceof TLRPC.TL_peerUser) && peer.user_id == peer2.user_id) {
                return true;
            }
        }
        return false;
    }

    public static boolean x4(TLRPC.Message message) {
        return o1(message) != null && v4(o1(message).document);
    }

    public static boolean y(TLRPC.Document document) {
        String str;
        if (document != null && (str = document.mime_type) != null) {
            if (!(X2(document) && (str.equalsIgnoreCase("image/png") || str.equalsIgnoreCase("image/jpg") || str.equalsIgnoreCase("image/jpeg"))) && (Build.VERSION.SDK_INT < 26 || !str.equalsIgnoreCase("image/heic"))) {
                boolean z10 = r2.a;
            } else {
                for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                        TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = (TLRPC.TL_documentAttributeImageSize) documentAttribute;
                        return tL_documentAttributeImageSize.w < 6000 && tL_documentAttributeImageSize.h < 6000;
                    }
                }
            }
        }
        return false;
    }

    public static String y1(TLRPC.Document document) {
        if (document == null) {
            return bd.M0(2131753899, null);
        }
        for (int i3 = 0; i3 < document.attributes.size(); i3++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                String str = documentAttribute.title;
                if (str != null && !str.isEmpty()) {
                    return str;
                }
                String B = w7.B(document);
                return TextUtils.isEmpty(B) ? bd.M0(2131753899, null) : B;
            }
        }
        String B2 = w7.B(document);
        return !TextUtils.isEmpty(B2) ? B2 : bd.M0(2131753899, null);
    }

    public static TLRPC.TL_textWithEntities y5(TLRPC.TL_textWithEntities tL_textWithEntities) {
        if (tL_textWithEntities == null) {
            return null;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
        tL_textWithEntities2.text = tL_textWithEntities.text;
        for (int i3 = 0; i3 < tL_textWithEntities.entities.size(); i3++) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities.entities.get(i3);
            if (!(messageEntity instanceof TLRPC.TL_messageEntityUrl) && !(messageEntity instanceof TLRPC.TL_messageEntityTextUrl)) {
                tL_textWithEntities2.entities.add(messageEntity);
            }
        }
        return tL_textWithEntities2;
    }

    public static int z0(TLRPC.TL_messageMediaToDo tL_messageMediaToDo) {
        TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
        if (todoList == null || todoList.list == null) {
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < tL_messageMediaToDo.completions.size(); i10++) {
            TLRPC.TodoCompletion todoCompletion = tL_messageMediaToDo.completions.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= tL_messageMediaToDo.todo.list.size()) {
                    break;
                }
                if (tL_messageMediaToDo.todo.list.get(i11).id == todoCompletion.id) {
                    i3++;
                    break;
                }
                i11++;
            }
        }
        return i3;
    }

    public static void z5(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                if (!(uRLSpan instanceof org.telegram.ui.Components.vz)) {
                    spannable.removeSpan(uRLSpan);
                }
            }
        }
    }

    public final long A0() {
        return B0(this.k);
    }

    public final Long A1() {
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        TLRPC.Message message = this.k;
        if (message == null || (tL_messageReactions = message.reactions) == null || (arrayList = tL_messageReactions.top_reactors) == null) {
            return null;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TLRPC.MessageReactor messageReactor = arrayList.get(i3);
            i3++;
            TLRPC.MessageReactor messageReactor2 = messageReactor;
            if (messageReactor2 != null && messageReactor2.my) {
                if (messageReactor2.anonymous) {
                    return 2666000L;
                }
                TLRPC.Peer peer = messageReactor2.peer_id;
                if (peer != null) {
                    return Long.valueOf(m5.o(peer));
                }
            }
        }
        return null;
    }

    public final boolean A2() {
        int i3;
        if (d1() == 0) {
            return false;
        }
        ArrayList arrayList = this.n0;
        return !(arrayList == null || arrayList.isEmpty()) || (i3 = this.D) == 3 || i3 == 1 || J3() || V2();
    }

    public final boolean A3() {
        return o1(this.k) instanceof TLRPC.TL_messageMediaInvoice;
    }

    public final boolean A4() {
        return this.D == 24 && !h3();
    }

    public final boolean B() {
        if (E2(true)) {
            return true;
        }
        TLRPC.Document F0 = F0();
        if (F0 != null && !(F0 instanceof TLRPC.TL_documentEncrypted)) {
            if (az.C0) {
                return true;
            }
            for (int i3 = 0; i3 < F0.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    return documentAttribute.supports_streaming;
                }
            }
            if (az.D0 && "video/x-matroska".equals(F0.mime_type)) {
                return true;
            }
        }
        return false;
    }

    public final int B1() {
        int i3;
        int L;
        int i10;
        if (this.r1 && (i10 = this.b2) > 0) {
            return i10;
        }
        if (!g0.Q1()) {
            Point point = g0.q;
            i3 = point.x;
            if (i3 <= point.y) {
                return i3;
            }
            L = g0.L(50.0f);
        } else {
            if (this.D != 36) {
                return g0.Q0();
            }
            Point point2 = g0.q;
            i3 = point2.x;
            if (g0.E) {
                return i3;
            }
            if (g0.P1() && i3 <= point2.y) {
                return i3;
            }
            L = g0.l1(i3, 0, 0);
        }
        return i3 - L;
    }

    public final boolean B2() {
        int i3;
        if (d1() == 0) {
            return false;
        }
        ArrayList arrayList = this.n0;
        return !(arrayList == null || arrayList.isEmpty()) || (i3 = this.D) == 3 || i3 == 1 || i3 == 14 || i3 == 9;
    }

    public final boolean B3() {
        TLRPC.WebPage webPage = (this.E0 || this.L2 || !(o1(this.k) instanceof TLRPC.TL_messageMediaWebPage) || !(o1(this.k).webpage instanceof TLRPC.TL_webPage)) ? null : o1(this.k).webpage;
        String str = webPage != null ? webPage.type : null;
        if (webPage != null && TextUtils.isEmpty(webPage.description) && TextUtils.isEmpty(webPage.title)) {
            return false;
        }
        return "app".equals(str) || "profile".equals(str) || "article".equals(str) || "telegram_bot".equals(str) || "telegram_user".equals(str) || "telegram_channel".equals(str) || "telegram_megagroup".equals(str) || "telegram_voicechat".equals(str) || "telegram_videochat".equals(str) || "telegram_livestream".equals(str) || "telegram_channel_boost".equals(str) || "telegram_group_boost".equals(str) || "telegram_chat".equals(str);
    }

    public final boolean B4() {
        if (this.g) {
            return true;
        }
        Boolean bool = this.h;
        if (bool != null) {
            return bool.booleanValue();
        }
        TLRPC.Peer peer = this.k.peer_id;
        if (peer != null) {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                TLRPC.Chat w02 = w0(null, null, j10);
                if (w02 == null) {
                    return false;
                }
                boolean z10 = w02.megagroup;
                this.h = Boolean.valueOf(z10);
                return z10;
            }
        }
        this.h = Boolean.FALSE;
        return false;
    }

    public final Spannable B5(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        return C5(charSequence, O0(), fontMetricsInt, false);
    }

    public final boolean C() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia o12 = o1(this.k);
        if (o12 instanceof TLRPC.TL_messageMediaPoll) {
            return D((TLRPC.TL_messageMediaPoll) o12);
        }
        return false;
    }

    public final String C0() {
        if (!U2()) {
            return null;
        }
        TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) o1(this.k);
        return TextUtils.isEmpty(tL_messageMediaDice.emoticon) ? "🎲" : tL_messageMediaDice.emoticon.replace("️", "");
    }

    public final boolean C2() {
        zi ziVar;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.Message message = this.k;
        if ((message == null || (messageReplyHeader = message.reply_to) == null || !messageReplyHeader.forum_topic || messageReplyHeader.reply_to_msg_id != messageReplyHeader.reply_to_top_id) && (ziVar = this.C) != null) {
            TLRPC.Message message2 = ziVar.k;
            if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
                TLRPC.MessageAction messageAction = message2.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear) && !(messageAction instanceof TLRPC.TL_messageActionTopicCreate)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean C3(long j10) {
        TLRPC.MessageReplies messageReplies = this.k.replies;
        if (messageReplies != null) {
            return j10 == 0 || messageReplies.channel_id == j10;
        }
        return false;
    }

    public final int D0() {
        if (o1(this.k) instanceof TLRPC.TL_messageMediaDice) {
            return ((TLRPC.TL_messageMediaDice) o1(this.k)).value;
        }
        return -1;
    }

    public final boolean D2() {
        return E2(true);
    }

    public final boolean D3() {
        return o1(this.k) instanceof TLRPC.TL_messageMediaGeoLive;
    }

    public final boolean E() {
        if (this.k.action == null) {
            if (y2()) {
                return true;
            }
            zi ziVar = this.C;
            if (ziVar != null && ziVar.k.replies != null) {
                return true;
            }
            TLRPC.MessageReplyHeader messageReplyHeader = this.k.reply_to;
            if ((messageReplyHeader != null ? messageReplyHeader.reply_to_top_id : 0) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (r7 > 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TL_iv.RichMessage E0() {
        TL_iv.RichMessage richMessage;
        TLRPC.Message message = this.k;
        if (message == null) {
            return null;
        }
        if (this.J2 && (richMessage = message.translatedRichMessage) != null) {
            return richMessage;
        }
        if (message.rich_message != null || !(o1(message) instanceof TLRPC.TL_messageMediaWidget)) {
            return this.k.rich_message;
        }
        if (this.x2 == null) {
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) o1(this.k);
            ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.a;
            String str = "tg-widget:" + this.I1 + "/" + B0(this.k) + "/" + this.k.id + "/" + Arrays.hashCode(tL_messageMediaWidget.payload);
            ConcurrentHashMap concurrentHashMap2 = org.telegram.utils.twidget.p.a;
            org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) concurrentHashMap2.get(str);
            if (mVar == null) {
                long B0 = B0(this.k);
                TLRPC.Message message2 = this.k;
                int i3 = message2.id;
                long j10 = message2.via_bot_id;
                if (j10 == 0) {
                    TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                    if (messageFwdHeader != null) {
                        TLRPC.Peer peer = messageFwdHeader.from_id;
                        if (peer instanceof TLRPC.TL_peerUser) {
                            j10 = peer.user_id;
                        }
                        j10 = 0;
                    } else {
                        j10 = Z0();
                    }
                }
                org.telegram.utils.twidget.m mVar2 = new org.telegram.utils.twidget.m(str, this.I1, B0, i3, j10, tL_messageMediaWidget, false);
                if (((org.telegram.utils.twidget.m) concurrentHashMap2.putIfAbsent(str, mVar2)) == null) {
                    qr a02 = qr.a0(mVar2.b);
                    a02.a.c(new hc1(15, a02, mVar2));
                }
            } else if (mVar.r != tL_messageMediaWidget) {
                g0.h3(new hc1(13, mVar, tL_messageMediaWidget));
            }
            TL_iv.pageBlockEmbed pageblockembed = new TL_iv.pageBlockEmbed();
            pageblockembed.url = str;
            pageblockembed.html = "";
            TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
            pageblockembed.caption = pageCaption;
            pageCaption.text = new TL_iv.textEmpty();
            pageblockembed.caption.credit = new TL_iv.textEmpty();
            TL_iv.RichMessage richMessage2 = new TL_iv.RichMessage();
            richMessage2.blocks.add(pageblockembed);
            this.x2 = richMessage2;
        }
        return this.x2;
    }

    public final long E1() {
        if (this.D != 17) {
            return 0L;
        }
        TLRPC.MessageMedia o12 = o1(this.k);
        if (o12 instanceof TLRPC.TL_messageMediaPoll) {
            return ((TLRPC.TL_messageMediaPoll) o12).poll.id;
        }
        return 0L;
    }

    public final boolean E2(boolean z10) {
        TLRPC.MessageMedia messageMedia;
        if (this.b3 == null) {
            try {
                TLRPC.Message message = this.k;
                if (message != null && (messageMedia = message.media) != null && messageMedia.document != null && !messageMedia.alt_documents.isEmpty()) {
                    int i3 = this.I1;
                    TLRPC.Message message2 = this.k;
                    TLRPC.MessageMedia messageMedia2 = message2 != null ? message2.media : null;
                    int i10 = m51.k0;
                    ArrayList arrayList = !(messageMedia2 instanceof TLRPC.TL_messageMediaDocument) ? new ArrayList() : m51.X(i3, messageMedia2.document, messageMedia2.alt_documents, 0, z10);
                    this.c3 = arrayList;
                    this.b3 = Boolean.valueOf(arrayList.size() > 1);
                    this.e3 = m51.a0(this.c3);
                    this.f3 = m51.b0(this.c3);
                    this.g3 = m51.M(this.c3);
                }
                this.b3 = Boolean.FALSE;
                return false;
            } catch (Exception e10) {
                a8.g(e10, true);
                this.b3 = Boolean.FALSE;
            }
        }
        return this.b3.booleanValue();
    }

    public final boolean E3() {
        TLRPC.MessageMedia n12 = n1(this);
        return n12 != null && n12.live_photo;
    }

    public final boolean E4() {
        return this.D == 17 && (o1(this.k) instanceof TLRPC.TL_messageMediaToDo);
    }

    public final void E5(Spannable spannable, int[] iArr) {
        boolean z10;
        CharSequence charSequence;
        if (com.google.android.recaptcha.internal.a.u(spannable)) {
            f6[] f6VarArr = (f6[]) spannable.getSpans(0, spannable.length(), f6.class);
            org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spannable.getSpans(0, spannable.length(), org.telegram.ui.Components.p5.class);
            if (f6VarArr != null) {
                if ((iArr[0] - f6VarArr.length) - (p5VarArr == null ? 0 : p5VarArr.length) > 0) {
                    return;
                }
                for (int i3 = 0; i3 < f6VarArr.length; i3++) {
                    String str = f6VarArr[i3].d;
                    if (i6.b(str)) {
                        z10 = true;
                        charSequence = str.subSequence(0, str.length() - 2);
                    } else {
                        z10 = false;
                        charSequence = str;
                    }
                    TLRPC.Document T = li.b0(this.I1).T(charSequence);
                    if (T != null) {
                        int spanStart = spannable.getSpanStart(f6VarArr[i3]);
                        int spanEnd = spannable.getSpanEnd(f6VarArr[i3]);
                        spannable.removeSpan(f6VarArr[i3]);
                        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(T, f6VarArr[i3].a);
                        p5Var.standard = true;
                        p5Var.invert = z10;
                        spannable.setSpan(p5Var, spanStart, spanEnd, 33);
                    }
                }
            }
        }
    }

    public final TLRPC.Document F0() {
        l51 l51Var;
        TLRPC.Document document = this.n;
        return document != null ? document : (!E2(true) || (l51Var = this.e3) == null) ? G0(this.k) : l51Var.g;
    }

    public final boolean F2() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia o12 = o1(this.k);
        if (o12 instanceof TLRPC.TL_messageMediaPoll) {
            return V4((TLRPC.TL_messageMediaPoll) o12);
        }
        return false;
    }

    public final void G() {
        org.telegram.ui.Components.p5[] p5VarArr;
        int i3;
        this.n = null;
        this.o = null;
        if (this.N1 == 1 && !(o1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && !(o1(this.k) instanceof TLRPC.TL_messageMediaInvoice) && ((o1(this.k) instanceof TLRPC.TL_messageMediaEmpty) || o1(this.k) == null)) {
            TLRPC.Message message = this.k;
            if (message.grouped_id == 0) {
                boolean isEmpty = message.entities.isEmpty();
                int i10 = this.I1;
                if (isEmpty) {
                    CharSequence charSequence = this.v;
                    int indexOf = TextUtils.indexOf(charSequence, "🏻");
                    if (indexOf >= 0) {
                        this.u = "_c1";
                        charSequence = charSequence.subSequence(0, indexOf);
                    } else {
                        indexOf = TextUtils.indexOf(charSequence, "🏼");
                        if (indexOf >= 0) {
                            this.u = "_c2";
                            charSequence = charSequence.subSequence(0, indexOf);
                        } else {
                            indexOf = TextUtils.indexOf(charSequence, "🏽");
                            if (indexOf >= 0) {
                                this.u = "_c3";
                                charSequence = charSequence.subSequence(0, indexOf);
                            } else {
                                indexOf = TextUtils.indexOf(charSequence, "🏾");
                                if (indexOf >= 0) {
                                    this.u = "_c4";
                                    charSequence = charSequence.subSequence(0, indexOf);
                                } else {
                                    indexOf = TextUtils.indexOf(charSequence, "🏿");
                                    if (indexOf >= 0) {
                                        this.u = "_c5";
                                        charSequence = charSequence.subSequence(0, indexOf);
                                    } else {
                                        this.u = "";
                                    }
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(this.u) && (i3 = indexOf + 2) < this.v.length()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(charSequence.toString());
                        CharSequence charSequence2 = this.v;
                        sb2.append(charSequence2.subSequence(i3, charSequence2.length()).toString());
                        charSequence = sb2.toString();
                    }
                    if (TextUtils.isEmpty(this.u) || j6.l.contains(charSequence.toString())) {
                        this.n = li.b0(i10).T(charSequence);
                    }
                } else if (this.k.entities.size() == 1 && (this.k.entities.get(0) instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    try {
                        Long valueOf = Long.valueOf(((TLRPC.TL_messageEntityCustomEmoji) this.k.entities.get(0)).document_id);
                        this.o = valueOf;
                        TLRPC.Document e10 = org.telegram.ui.Components.g5.e(i10, valueOf.longValue());
                        this.n = e10;
                        if (e10 == null) {
                            CharSequence charSequence3 = this.v;
                            if ((charSequence3 instanceof Spanned) && (p5VarArr = (org.telegram.ui.Components.p5[]) ((Spanned) charSequence3).getSpans(0, charSequence3.length(), org.telegram.ui.Components.p5.class)) != null && p5VarArr.length == 1) {
                                this.n = p5VarArr[0].document;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (this.n == null && this.o == null) {
            n0(null);
            return;
        }
        if (u4()) {
            this.D = 13;
        } else if (K2()) {
            this.D = 15;
        } else {
            this.D = 1000;
        }
    }

    public final boolean G2() {
        return H2() && I2(F0());
    }

    public final boolean G3() {
        return H3(this.k, true);
    }

    public final boolean G4() {
        TLRPC.Message message = this.k;
        return message != null && message.unread;
    }

    public final CharSequence G5(String str, ArrayList arrayList, AbstractMap abstractMap, a0.h hVar) {
        int i3;
        if (TextUtils.indexOf(str, "un2") < 0) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLRPC.User user = abstractMap != null ? (TLRPC.User) abstractMap.get(arrayList.get(i10)) : hVar != null ? (TLRPC.User) hVar.f(((Long) arrayList.get(i10)).longValue()) : null;
            if (user == null) {
                user = hp.s1(this.I1).a2((Long) arrayList.get(i10));
            }
            if (user != null) {
                String p10 = l10.p(user);
                int length = spannableStringBuilder.length();
                if (spannableStringBuilder.length() != 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                spannableStringBuilder.append((CharSequence) p10);
                StringBuilder sb2 = new StringBuilder("");
                i3 = i10;
                sb2.append(user.id);
                spannableStringBuilder.setSpan(new w31(sb2.toString()), length, p10.length() + length, 33);
            } else {
                i3 = i10;
            }
            i10 = i3 + 1;
        }
        return TextUtils.replace(str, new String[]{"un2"}, new CharSequence[]{spannableStringBuilder});
    }

    public final void H(int[] iArr) {
        TextPaint textPaint;
        Integer valueOf = iArr == null ? null : Integer.valueOf(iArr[0]);
        if (valueOf == null || valueOf.intValue() < 1 || this.k == null || v2()) {
            CharSequence charSequence = this.v;
            org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.p5.class);
            if (p5VarArr == null || p5VarArr.length <= 0) {
                this.P1 = 0;
                return;
            }
            this.P1 = p5VarArr.length;
            for (int i3 = 0; i3 < p5VarArr.length; i3++) {
                p5VarArr[i3].replaceFontMetrics(org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), (int) (org.telegram.ui.ActionBar.k6.o2.getTextSize() + g0.L(4.0f)), -1);
                p5VarArr[i3].full = false;
            }
            return;
        }
        CharSequence charSequence2 = this.v;
        f6[] f6VarArr = (f6[]) ((Spannable) charSequence2).getSpans(0, charSequence2.length(), f6.class);
        CharSequence charSequence3 = this.v;
        org.telegram.ui.Components.p5[] p5VarArr2 = (org.telegram.ui.Components.p5[]) ((Spannable) charSequence3).getSpans(0, charSequence3.length(), org.telegram.ui.Components.p5.class);
        this.N1 = Math.max(valueOf.intValue(), (f6VarArr == null ? 0 : f6VarArr.length) + (p5VarArr2 == null ? 0 : p5VarArr2.length));
        this.P1 = p5VarArr2 == null ? 0 : p5VarArr2.length;
        this.O1 = 0;
        if (p5VarArr2 != null) {
            for (org.telegram.ui.Components.p5 p5Var : p5VarArr2) {
                if (!p5Var.standard) {
                    this.O1++;
                }
            }
        }
        int i10 = this.N1;
        boolean z10 = (i10 - (f6VarArr == null ? 0 : f6VarArr.length)) - (p5VarArr2 == null ? 0 : p5VarArr2.length) > 0;
        this.M1 = z10;
        if (i10 == 0 || z10) {
            if (p5VarArr2 == null || p5VarArr2.length <= 0) {
                return;
            }
            for (int i11 = 0; i11 < p5VarArr2.length; i11++) {
                p5VarArr2[i11].replaceFontMetrics(org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), (int) (org.telegram.ui.ActionBar.k6.o2.getTextSize() + g0.L(4.0f)), -1);
                p5VarArr2[i11].full = false;
            }
            return;
        }
        int i12 = this.O1;
        boolean z11 = i10 == i12;
        int i13 = 2;
        switch (Math.max(i10, i12)) {
            case 0:
            case 1:
            case 2:
                TextPaint[] textPaintArr = org.telegram.ui.ActionBar.k6.y2;
                textPaint = z11 ? textPaintArr[0] : textPaintArr[2];
                i13 = 1;
                break;
            case 3:
                TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.k6.y2;
                textPaint = z11 ? textPaintArr2[1] : textPaintArr2[3];
                i13 = 1;
                break;
            case 4:
                TextPaint[] textPaintArr3 = org.telegram.ui.ActionBar.k6.y2;
                textPaint = z11 ? textPaintArr3[2] : textPaintArr3[4];
                i13 = 1;
                break;
            case 5:
                TextPaint[] textPaintArr4 = org.telegram.ui.ActionBar.k6.y2;
                if (z11) {
                    textPaint = textPaintArr4[3];
                    break;
                } else {
                    textPaint = textPaintArr4[5];
                    break;
                }
            case 6:
                TextPaint[] textPaintArr5 = org.telegram.ui.ActionBar.k6.y2;
                if (z11) {
                    textPaint = textPaintArr5[4];
                    break;
                } else {
                    textPaint = textPaintArr5[5];
                    break;
                }
            default:
                int i14 = this.N1 > 9 ? 0 : -1;
                textPaint = org.telegram.ui.ActionBar.k6.y2[5];
                i13 = i14;
                break;
        }
        int textSize = (int) (textPaint.getTextSize() + g0.L(4.0f));
        if (f6VarArr != null && f6VarArr.length > 0) {
            for (f6 f6Var : f6VarArr) {
                f6Var.a = textPaint.getFontMetricsInt();
                f6Var.c = textSize;
            }
        }
        if (p5VarArr2 == null || p5VarArr2.length <= 0) {
            return;
        }
        for (int i15 = 0; i15 < p5VarArr2.length; i15++) {
            p5VarArr2[i15].replaceFontMetrics(textPaint.getFontMetricsInt(), textSize, i13);
            p5VarArr2[i15].full = true;
        }
    }

    public float H1() {
        return 0.0f;
    }

    public final boolean H2() {
        return (this.n == null && this.o == null) ? false : true;
    }

    public final boolean H4() {
        return o1(this.k) instanceof TLRPC.TL_messageMediaUnsupported;
    }

    public final void H5() {
        this.b0 = 0.0f;
        this.g0 = 0;
        this.e0 = 0.0f;
    }

    public final boolean I() {
        CharSequence charSequence;
        int i3 = this.D;
        if ((i3 == 0 || i3 == 19 || i3 == 36) && this.k.peer_id != null && (charSequence = this.v) != null && (charSequence.length() != 0 || this.W1)) {
            if (this.Q1) {
                int B1 = (!g0.Q1() || this.T == 0) ? B1() : g0.L(530.0f);
                TextPaint textPaint = org.telegram.ui.ActionBar.k6.o2;
                float textSize = textPaint != null ? textPaint.getTextSize() : 0.0f;
                if (Math.abs(this.R1 - B1) > (this.D == 36 ? 0 : g0.L(52.0f)) || this.S1 != g0.p || this.U1 != textSize || this.T1 != Q2()) {
                    this.Q1 = false;
                }
            }
            if (!this.Q1) {
                this.Q1 = true;
                TLRPC.User a22 = q3() ? hp.s1(this.I1).a2(Long.valueOf(this.k.from_id.user_id)) : null;
                TextPaint textPaint2 = o1(this.k) instanceof TLRPC.TL_messageMediaGame ? org.telegram.ui.ActionBar.k6.x2 : org.telegram.ui.ActionBar.k6.o2;
                int[] iArr = i() ? new int[1] : null;
                CharSequence m10 = i6.m(this.v, textPaint2.getFontMetricsInt(), false, iArr, 0);
                this.v = m10;
                Spannable B5 = B5(m10, textPaint2.getFontMetricsInt());
                this.v = B5;
                if (iArr != null && iArr[0] > 1) {
                    E5(B5, iArr);
                }
                H(iArr);
                G();
                M5();
                n0(a22);
                if (this.z != null) {
                    this.z = null;
                    k0();
                }
                return true;
            }
        }
        return false;
    }

    public final String I0() {
        return w7.B(F0());
    }

    public final boolean I3() {
        TLRPC.Message message = this.k;
        return message == null || o1(message) == null || (o1(message) instanceof TLRPC.TL_messageMediaEmpty);
    }

    public final boolean I4() {
        return M4(this.k);
    }

    public final boolean I5(dh.n0 n0Var, boolean z10) {
        TLRPC.Peer tL_peerUser;
        TLRPC.Peer tL_peerUser2;
        int i3;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.Message message = this.k;
        TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
        int i10 = this.I1;
        if (tL_messageReactions2 == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.k;
            message2.reactions.reactions_as_tags = B0(message2) == h10.i(i10).e();
            this.k.reactions.can_see_list = p3() || q3();
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.ReactionCount reactionCount = null;
        int i11 = 0;
        for (int i12 = 0; i12 < this.k.reactions.results.size(); i12++) {
            TLRPC.ReactionCount reactionCount2 = this.k.reactions.results.get(i12);
            if (reactionCount2.chosen && !(reactionCount2.reaction instanceof TLRPC.TL_reactionPaid)) {
                arrayList.add(reactionCount2);
                int i13 = reactionCount2.chosen_order;
                if (i13 > i11) {
                    i11 = i13;
                }
            }
            TLRPC.Reaction reaction = this.k.reactions.results.get(i12).reaction;
            if (reaction instanceof TLRPC.TL_reactionEmoji) {
                String str = n0Var.f;
                if (str != null) {
                    if (((TLRPC.TL_reactionEmoji) reaction).emoticon.equals(str)) {
                        reactionCount = this.k.reactions.results.get(i12);
                    }
                }
            }
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j10 = n0Var.g;
                if (j10 != 0 && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == j10) {
                    reactionCount = this.k.reactions.results.get(i12);
                }
            }
        }
        if (!arrayList.isEmpty() && arrayList.contains(reactionCount) && z10) {
            return true;
        }
        hp s12 = hp.s1(i10);
        int i14 = s12.getUserConfig().q() ? s12.a5 : s12.Z4;
        if (!arrayList.isEmpty() && arrayList.contains(reactionCount)) {
            if (reactionCount != null) {
                reactionCount.chosen = false;
                int i15 = reactionCount.count - 1;
                reactionCount.count = i15;
                if (i15 <= 0) {
                    this.k.reactions.results.remove(reactionCount);
                }
            }
            if (this.k.reactions.can_see_list) {
                int i16 = 0;
                while (i16 < this.k.reactions.recent_reactions.size()) {
                    if (C1(this.k.reactions.recent_reactions.get(i16).peer_id) == h10.i(i10).e() && dh.p0.c(this.k.reactions.recent_reactions.get(i16).reaction, n0Var)) {
                        this.k.reactions.recent_reactions.remove(i16);
                        i16--;
                    }
                    i16++;
                }
            }
            this.H = true;
            return false;
        }
        while (!arrayList.isEmpty() && arrayList.size() >= i14) {
            int i17 = 0;
            for (int i18 = 1; i18 < arrayList.size(); i18++) {
                if (!(((TLRPC.ReactionCount) arrayList.get(i18)).reaction instanceof TLRPC.TL_reactionPaid) && ((TLRPC.ReactionCount) arrayList.get(i18)).chosen_order < ((TLRPC.ReactionCount) arrayList.get(i17)).chosen_order) {
                    i17 = i18;
                }
            }
            TLRPC.ReactionCount reactionCount3 = (TLRPC.ReactionCount) arrayList.get(i17);
            reactionCount3.chosen = false;
            int i19 = reactionCount3.count - 1;
            reactionCount3.count = i19;
            if (i19 <= 0) {
                this.k.reactions.results.remove(reactionCount3);
            }
            arrayList.remove(reactionCount3);
            if (this.k.reactions.can_see_list) {
                int i20 = 0;
                while (i20 < this.k.reactions.recent_reactions.size()) {
                    if (C1(this.k.reactions.recent_reactions.get(i20).peer_id) == h10.i(i10).e() && dh.p0.c(this.k.reactions.recent_reactions.get(i20).reaction, n0Var)) {
                        this.k.reactions.recent_reactions.remove(i20);
                        i20--;
                    }
                    i20++;
                }
            }
        }
        if (reactionCount == null) {
            int O0 = hp.s1(i10).O0(B0(this.k));
            TLRPC.Message message3 = this.k;
            if (message3 == null || (tL_messageReactions = message3.reactions) == null) {
                i3 = 0;
            } else {
                ArrayList<TLRPC.ReactionCount> arrayList2 = tL_messageReactions.results;
                int size = arrayList2.size();
                i3 = 0;
                int i21 = 0;
                while (i21 < size) {
                    TLRPC.ReactionCount reactionCount4 = arrayList2.get(i21);
                    i21++;
                    if (!(reactionCount4.reaction instanceof TLRPC.TL_reactionPaid)) {
                        i3++;
                    }
                }
            }
            if (i3 + 1 > O0) {
                return false;
            }
            reactionCount = new TLRPC.TL_reactionCount();
            reactionCount.reaction = n0Var.g();
            this.k.reactions.results.add(reactionCount);
        }
        reactionCount.chosen = true;
        reactionCount.count++;
        reactionCount.chosen_order = i11 + 1;
        TLRPC.Message message4 = this.k;
        if (message4.reactions.can_see_list || (message4.dialog_id > 0 && i14 > 1)) {
            TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
            TLRPC.Message message5 = this.k;
            if (!message5.isThreadMessage || message5.fwd_from == null) {
                hp s13 = hp.s1(i10);
                TLRPC.ChatFull N0 = s13.N0(-B0(this.k));
                if (N0 == null || (tL_peerUser = N0.default_send_as) == null) {
                    tL_peerUser = new TLRPC.TL_peerUser();
                    tL_peerUser.user_id = h10.i(s13.getAccountInstance().a).n;
                }
                tL_messagePeerReaction.peer_id = tL_peerUser;
            } else {
                hp s14 = hp.s1(i10);
                TLRPC.ChatFull N02 = s14.N0(-Z0());
                if (N02 == null || (tL_peerUser2 = N02.default_send_as) == null) {
                    tL_peerUser2 = new TLRPC.TL_peerUser();
                    tL_peerUser2.user_id = h10.i(s14.getAccountInstance().a).n;
                }
                tL_messagePeerReaction.peer_id = tL_peerUser2;
            }
            this.k.reactions.recent_reactions.add(0, tL_messagePeerReaction);
            if (n0Var.f != null) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_messagePeerReaction.reaction = tL_reactionEmoji;
                tL_reactionEmoji.emoticon = n0Var.f;
            } else {
                TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                tL_messagePeerReaction.reaction = tL_reactionCustomEmoji;
                tL_reactionCustomEmoji.document_id = n0Var.g;
            }
        }
        this.H = true;
        return true;
    }

    public final void J() {
        K(true);
    }

    public final boolean J2() {
        return this.D == 19;
    }

    public final boolean J3() {
        return (!L3(this.k) || M4(this.k) || i4()) ? false : true;
    }

    public final boolean J4() {
        TLRPC.Photo photo;
        TLRPC.MessageAction messageAction = this.k.action;
        return (messageAction == null || (photo = messageAction.photo) == null || photo.video_sizes.isEmpty()) ? false : true;
    }

    public final void J5() {
        this.k.unread = false;
    }

    public final void K(boolean z10) {
        int i3;
        this.w0 = false;
        this.x0 = false;
        int i10 = this.D;
        int i11 = this.I1;
        if (i10 == 20) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) this.k.media.extended_media.get(0);
            if (tL_messageExtendedMediaPreview.thumb != null) {
                w7.G(i11);
                File K = w7.K(tL_messageExtendedMediaPreview.thumb, null, z10, true);
                if (!this.x0) {
                    this.x0 = K.exists() || (tL_messageExtendedMediaPreview.thumb instanceof TLRPC.TL_photoStrippedSize);
                }
            }
        } else if (i10 == 1 && w7.w(this.n0, g0.Z0(true), false, null, false) != null) {
            w7.G(i11);
            File N = w7.N(this.k, false, z10);
            if (n5()) {
                this.x0 = new File(N.getAbsolutePath() + ".enc").exists();
            }
            if (!this.x0) {
                this.x0 = N.exists();
            }
        }
        if ((!this.x0 && this.D == 8) || (i3 = this.D) == 3 || i3 == 9 || i3 == 2 || i3 == 14 || i3 == 5) {
            String str = this.k.attachPath;
            if (str != null && str.length() > 0) {
                this.w0 = new File(this.k.attachPath).exists();
            }
            if (!this.w0) {
                w7.G(i11);
                File N2 = w7.N(this.k, false, z10);
                if ((this.D == 3 && n5()) || T4() || h4()) {
                    this.x0 = new File(N2.getAbsolutePath() + ".enc").exists();
                }
                if (!this.x0) {
                    this.x0 = N2.exists();
                }
            }
        }
        if (!this.x0) {
            TLRPC.Document F0 = F0();
            if (F0 == null) {
                int i12 = this.D;
                if (i12 == 0) {
                    TLRPC.PhotoSize w10 = w7.w(this.n0, g0.Z0(false), false, null, false);
                    if (w10 == null) {
                        return;
                    }
                    w7.G(i11);
                    this.x0 = w7.K(w10, null, true, z10).exists();
                } else if (i12 == 11) {
                    TLRPC.Photo photo = this.k.action.photo;
                    if (photo == null || photo.video_sizes.isEmpty()) {
                        return;
                    }
                    w7.G(i11);
                    this.x0 = w7.K(photo.video_sizes.get(0), null, true, z10).exists();
                }
            } else if ((o1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && o1(this.k).webpage != null && "telegram_background".equals(o1(this.k).webpage.type)) {
                w7.G(i11);
                this.x0 = w7.K(F0, null, true, z10).exists();
            } else {
                w7.G(i11);
                this.x0 = w7.K(F0, null, false, z10).exists();
            }
        }
        f6(z10);
    }

    public final boolean K2() {
        int i3 = this.D;
        if (i3 != 1000) {
            return i3 == 15;
        }
        boolean C = m5.C(B0(this.k));
        if (C && this.k.stickerVerified != 1) {
            return false;
        }
        if (this.o == null || this.n != null) {
            return L2(F0(), (this.n == null && C && !O3()) ? false : true);
        }
        return true;
    }

    public final boolean K4() {
        TLRPC.MessageAction messageAction = this.k.action;
        if ((messageAction instanceof TLRPC.TL_messageActionPhoneCall) && messageAction.video) {
            return true;
        }
        return (messageAction instanceof TLRPC.TL_messageActionConferenceCall) && messageAction.video;
    }

    public final void K5(long j10) {
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        TLRPC.Message message = this.k;
        if (message == null || (tL_messageReactions = message.reactions) == null || (arrayList = tL_messageReactions.top_reactors) == null) {
            return;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TLRPC.MessageReactor messageReactor = arrayList.get(i3);
            i3++;
            TLRPC.MessageReactor messageReactor2 = messageReactor;
            if (messageReactor2 != null && messageReactor2.my) {
                boolean z10 = j10 == 2666000;
                messageReactor2.anonymous = z10;
                if (z10) {
                    messageReactor2.flags &= -9;
                    messageReactor2.peer_id = null;
                } else {
                    messageReactor2.flags |= 8;
                    messageReactor2.peer_id = hp.s1(this.I1).z1(j10);
                }
            }
        }
    }

    public final double L0() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        double d = this.i0;
        if (d > 0.0d) {
            return d;
        }
        TLRPC.Document F0 = F0();
        if (F0 == null && this.D == 23 && (storyItem = o1(this.k).storyItem) != null && (messageMedia = storyItem.media) != null) {
            F0 = messageMedia.document;
        }
        if (F0 == null) {
            return 0.0d;
        }
        int i3 = this.h0;
        if (i3 > 0) {
            return i3;
        }
        for (int i10 = 0; i10 < F0.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                double d10 = documentAttribute.duration;
                this.i0 = d10;
                return d10;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                double d11 = documentAttribute.duration;
                this.i0 = d11;
                return d11;
            }
        }
        return this.h0;
    }

    public final TLRPC.MessagePeerReaction L1() {
        ArrayList<TLRPC.MessagePeerReaction> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions = this.k.reactions;
        if (tL_messageReactions == null || (arrayList = tL_messageReactions.recent_reactions) == null || arrayList.isEmpty()) {
            return null;
        }
        return this.k.reactions.recent_reactions.get(0);
    }

    public final void L5(String str, boolean z10) {
        String str2;
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            this.Y1 = null;
            this.a2 = null;
            this.Z1 = true;
            return;
        }
        ArrayList arrayList = new ArrayList();
        String lowerCase = str.trim().toLowerCase();
        String[] split = lowerCase.split("[^\\p{L}#$]+");
        ArrayList arrayList2 = new ArrayList();
        TLRPC.MessageReplyHeader messageReplyHeader = this.k.reply_to;
        if (messageReplyHeader != null && !TextUtils.isEmpty(messageReplyHeader.quote_text)) {
            String lowerCase2 = this.k.reply_to.quote_text.trim().toLowerCase();
            if (lowerCase2.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
                o2(arrayList, split, true, z10);
                return;
            }
            arrayList2.addAll(Arrays.asList(lowerCase2.split("[^\\p{L}#$]+")));
        }
        if (!TextUtils.isEmpty(this.k.message)) {
            String lowerCase3 = this.k.message.trim().toLowerCase();
            if (lowerCase3.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
                o2(arrayList, split, false, z10);
                return;
            }
            arrayList2.addAll(Arrays.asList(lowerCase3.split("[^\\p{L}#$]+")));
        }
        if (F0() != null) {
            String lowerCase4 = w7.B(F0()).toLowerCase();
            if (lowerCase4.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
            }
            arrayList2.addAll(Arrays.asList(lowerCase4.split("[^\\p{L}#$]+")));
        }
        if ((o1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && (o1(this.k).webpage instanceof TLRPC.TL_webPage)) {
            TLRPC.WebPage webPage = o1(this.k).webpage;
            String str3 = webPage.title;
            if (str3 == null) {
                str3 = webPage.site_name;
            }
            if (str3 != null) {
                String lowerCase5 = str3.toLowerCase();
                if (lowerCase5.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                    arrayList.add(lowerCase);
                }
                arrayList2.addAll(Arrays.asList(lowerCase5.split("[^\\p{L}#$]+")));
            }
        }
        String x12 = x1(true);
        if (x12 != null) {
            String lowerCase6 = x12.toLowerCase();
            if (lowerCase6.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
            }
            arrayList2.addAll(Arrays.asList(lowerCase6.split("[^\\p{L}#$]+")));
        }
        for (String str4 : split) {
            if (str4.length() >= 2) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (!arrayList.contains(arrayList2.get(i3)) && (indexOf = (str2 = (String) arrayList2.get(i3)).indexOf(str4.charAt(0))) >= 0) {
                        int max = Math.max(str4.length(), str2.length());
                        if (indexOf != 0) {
                            str2 = str2.substring(indexOf);
                        }
                        int min = Math.min(str4.length(), str2.length());
                        int i10 = 0;
                        for (int i11 = 0; i11 < min && str2.charAt(i11) == str4.charAt(i11); i11++) {
                            i10++;
                        }
                        if (i10 / max >= 0.5d) {
                            arrayList.add((String) arrayList2.get(i3));
                        }
                    }
                }
            }
        }
        o2(arrayList, split, false, z10);
    }

    public final TLRPC.TL_availableEffect M0() {
        TLRPC.Message message = this.k;
        if (message == null || (message.flags2 & 4) == 0) {
            return null;
        }
        return hp.s1(this.I1).Z0(this.k.effect);
    }

    public final int M1() {
        TLRPC.Message message = this.k;
        int i3 = message.realId;
        return i3 != 0 ? i3 : message.id;
    }

    public final boolean M3() {
        return o1(this.k) != null && N3(F0());
    }

    public final void M5() {
        int i3;
        int i10 = this.D;
        this.D = 1000;
        this.S = 0;
        boolean s42 = s4();
        int i11 = this.I1;
        if (s42) {
            this.D = 0;
        } else {
            if (this.f1) {
                this.U = 0;
                this.D = 27;
                this.g1 = hp.s1(i11).e7.getBoolean("c" + B0(this.k) + "_rec", true);
            } else {
                TLRPC.Message message = this.k;
                if (!(message instanceof TLRPC.TL_message) && !(message instanceof TLRPC.TL_messageForwarded_old2)) {
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = this.J1;
                    if (tL_channelAdminLogEvent != null) {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                            TLRPC.TL_channelAdminLogEventActionChangeWallpaper tL_channelAdminLogEventActionChangeWallpaper = (TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction;
                            this.U = 1;
                            TLRPC.WallPaper wallPaper = tL_channelAdminLogEventActionChangeWallpaper.new_value;
                            if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && wallPaper.id == 0 && wallPaper.settings == null) {
                                this.D = 10;
                            } else {
                                this.D = 22;
                                ArrayList arrayList = new ArrayList();
                                this.n0 = arrayList;
                                TLRPC.Document document = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                if (document != null) {
                                    arrayList.addAll(document.thumbs);
                                    this.l0 = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                }
                            }
                        }
                    }
                    if (message instanceof TLRPC.TL_messageService) {
                        TLRPC.MessageAction messageAction = message.action;
                        if ((messageAction instanceof TLRPC.TL_messageActionChangeCreator) || (messageAction instanceof TLRPC.TL_messageActionNewCreatorPending) || (messageAction instanceof TLRPC.TL_messageActionManagedBotCreated)) {
                            this.U = 1;
                            this.D = 10;
                        } else if (messageAction instanceof TLRPC.TL_messageActionSetSameChatWallPaper) {
                            this.U = 1;
                            this.D = 10;
                        } else if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                            this.U = 1;
                            this.D = 22;
                            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageAction;
                            ArrayList arrayList2 = new ArrayList();
                            this.n0 = arrayList2;
                            TLRPC.Document document2 = tL_messageActionSetChatWallPaper.wallpaper.document;
                            if (document2 != null) {
                                arrayList2.addAll(document2.thumbs);
                                this.l0 = tL_messageActionSetChatWallPaper.wallpaper.document;
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionSuggestProfilePhoto) {
                            this.U = 1;
                            this.D = 21;
                            ArrayList arrayList3 = new ArrayList();
                            this.n0 = arrayList3;
                            arrayList3.addAll(this.k.action.photo.sizes);
                            this.l0 = this.k.action.photo;
                        } else if (messageAction instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                            this.D = 0;
                        } else {
                            boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftCode;
                            if (z10 && ((TLRPC.TL_messageActionGiftCode) messageAction).boost_peer != null) {
                                this.U = 1;
                                this.D = 25;
                            } else if ((messageAction instanceof TLRPC.TL_messageActionGiftPremium) || z10) {
                                this.U = 1;
                                this.D = 18;
                            } else if ((messageAction instanceof TLRPC.TL_messageActionGiftStars) || (messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionPrizeStars) || (((messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction).refunded) || (messageAction instanceof TLRPC.TL_messageActionGiftTon))) {
                                this.U = 1;
                                this.D = 30;
                            } else if ((messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                this.U = 1;
                                this.D = 11;
                            } else if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
                                TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
                                if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                                    this.U = 1;
                                    this.D = 10;
                                } else {
                                    this.U = -1;
                                    this.D = -1;
                                }
                            } else if (messageAction instanceof TLRPC.TL_messageActionHistoryClear) {
                                this.U = -1;
                                this.D = -1;
                            } else if ((messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
                                this.D = 16;
                            } else if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && (((TLRPC.TL_messageActionSetChatTheme) messageAction).theme instanceof TLRPC.TL_chatThemeUniqueGift)) {
                                this.D = 31;
                                this.U = 1;
                            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                this.D = 33;
                                this.U = 1;
                            } else if ((messageAction instanceof TLRPC.TL_messageActionChangeCommunity) && ((TLRPC.TL_messageActionChangeCommunity) messageAction).community_id != 0) {
                                this.D = 37;
                                this.U = 1;
                            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOfferDeclined) {
                                this.D = 34;
                                this.U = 1;
                            } else if (messageAction instanceof TLRPC.TL_messageActionSuggestBirthday) {
                                this.D = 32;
                                this.U = 1;
                            } else if (messageAction instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                this.D = 35;
                                this.U = 1;
                            } else {
                                this.U = 1;
                                this.D = 10;
                            }
                        }
                    }
                } else if (o1(message) instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.U = 10;
                    this.D = 38;
                } else if (this.E0) {
                    this.D = 0;
                } else {
                    TLRPC.Message message2 = this.k;
                    if (message2.rich_message != null || (o1(message2) instanceof TLRPC.TL_messageMediaWidget)) {
                        this.D = 36;
                    } else if (this.n == null && this.o == null) {
                        TLRPC.Message message3 = this.k;
                        if (message3.media instanceof TLRPC.TL_messageMediaPaidMedia) {
                            this.D = 29;
                        } else if (H3(message3, false) && !U2() && !s4() && this.N1 >= 1 && !this.M1 && this.k != null && !v2()) {
                            this.D = 19;
                        } else if (G3()) {
                            this.D = 0;
                            if (TextUtils.isEmpty(this.v) && this.T == 0) {
                                this.v = "";
                            }
                        } else if (r2()) {
                            this.D = 20;
                        } else if (o1(this.k).ttl_seconds != 0 && ((o1(this.k).photo instanceof TLRPC.TL_photoEmpty) || (F0() instanceof TLRPC.TL_documentEmpty) || (((o1(this.k) instanceof TLRPC.TL_messageMediaDocument) && F0() == null) || this.G0))) {
                            this.U = 1;
                            this.D = 10;
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaGiveaway) {
                            this.D = 26;
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaGiveawayResults) {
                            this.D = 28;
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaDice) {
                            this.D = 15;
                            if (o1(this.k).document == null) {
                                o1(this.k).document = new TLRPC.TL_document();
                                o1(this.k).document.file_reference = new byte[0];
                                o1(this.k).document.mime_type = "application/x-tgsdice";
                                o1(this.k).document.dc_id = TLObject.FLAG_31;
                                o1(this.k).document.id = -2147483648L;
                                TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                tL_documentAttributeImageSize.w = 512;
                                tL_documentAttributeImageSize.h = 512;
                                o1(this.k).document.attributes.add(tL_documentAttributeImageSize);
                            }
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaPhoto) {
                            this.D = M4(this.k) ? 3 : 1;
                        } else if ((o1(this.k) instanceof TLRPC.TL_messageMediaGeo) || (o1(this.k) instanceof TLRPC.TL_messageMediaVenue) || (o1(this.k) instanceof TLRPC.TL_messageMediaGeoLive)) {
                            this.D = 4;
                        } else if (i4()) {
                            this.D = 5;
                        } else if (M4(this.k)) {
                            this.D = 3;
                        } else if (S4(this.k)) {
                            this.D = 2;
                        } else if (J3()) {
                            this.D = 14;
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaContact) {
                            this.D = 12;
                        } else if ((o1(this.k) instanceof TLRPC.TL_messageMediaPoll) || (o1(this.k) instanceof TLRPC.TL_messageMediaToDo)) {
                            this.D = 17;
                            this.v1 = new ArrayList();
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaUnsupported) {
                            this.D = 0;
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaDocument) {
                            TLRPC.Document F0 = F0();
                            if (F0 == null || F0.mime_type == null) {
                                this.D = 9;
                            } else if (t3(F0, A2())) {
                                this.D = 8;
                            } else if (u4()) {
                                this.D = 13;
                            } else if (K2()) {
                                this.D = 15;
                            } else {
                                this.D = 9;
                            }
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaGame) {
                            this.D = 0;
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaInvoice) {
                            this.D = 0;
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaStory) {
                            int i12 = o1(this.k).via_mention ? 24 : 23;
                            this.D = i12;
                            if (i12 == 24) {
                                this.U = 1;
                            }
                        }
                    } else if (u4()) {
                        this.D = 13;
                    } else {
                        this.D = 15;
                    }
                }
            }
        }
        if (i10 == 1000 || i10 == (i3 = this.D) || i3 == 19) {
            return;
        }
        c6(hp.s1(i11).d, hp.s1(i11).b, null, null);
        r0(false);
    }

    public final void N(zi ziVar) {
        ArrayList arrayList;
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.k1 = ziVar.k1;
        TLRPC.Message message = this.k;
        message.premiumEffectWasPlayed = ziVar.k.premiumEffectWasPlayed;
        this.R = ziVar.R;
        this.V1 = ziVar.V1;
        TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
        int i3 = 0;
        if (tL_messageReactions2 != null && (arrayList2 = tL_messageReactions2.results) != null && !arrayList2.isEmpty() && (tL_messageReactions = ziVar.k.reactions) != null && tL_messageReactions.results != null) {
            for (int i10 = 0; i10 < this.k.reactions.results.size(); i10++) {
                TLRPC.ReactionCount reactionCount = this.k.reactions.results.get(i10);
                for (int i11 = 0; i11 < ziVar.k.reactions.results.size(); i11++) {
                    TLRPC.ReactionCount reactionCount2 = ziVar.k.reactions.results.get(i11);
                    if (dh.o0.g(reactionCount.reaction, reactionCount2.reaction)) {
                        reactionCount.lastDrawnPosition = reactionCount2.lastDrawnPosition;
                    }
                }
            }
        }
        boolean z10 = ziVar.L0;
        this.L0 = z10;
        TLRPC.Message message2 = this.k;
        TLRPC.Message message3 = ziVar.k;
        message2.replyStory = message3.replyStory;
        TLRPC.MessageMedia messageMedia2 = message2.media;
        if (messageMedia2 != null && (messageMedia = message3.media) != null) {
            messageMedia2.storyItem = messageMedia.storyItem;
        }
        if (!z10 || (arrayList = this.z2) == null) {
            return;
        }
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((wi) obj).y.clear();
        }
    }

    public final long N0() {
        TLRPC.Message message = this.k;
        if (message == null || (message.flags2 & 4) == 0) {
            return 0L;
        }
        return message.effect;
    }

    public final int N1() {
        TLRPC.MessageReplies messageReplies = this.k.replies;
        if (messageReplies != null) {
            return messageReplies.replies;
        }
        return 0;
    }

    public final boolean N2() {
        int i3 = this.D;
        return i3 == 13 || i3 == 15 || i3 == 19;
    }

    public final boolean N4() {
        return F0() != null && P4(F0());
    }

    public final void O(int i3, TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent, ArrayList arrayList, HashMap hashMap, boolean z10) {
        String str = this.W;
        if (((ArrayList) hashMap.get(str)) == null) {
            hashMap.put(str, new ArrayList());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = bd.u(tL_channelAdminLogEvent.date, false);
            tL_message.id = 0;
            tL_message.date = tL_channelAdminLogEvent.date;
            zi ziVar = new zi(i3, tL_message, false, false);
            ziVar.D = 10;
            ziVar.U = 1;
            ziVar.j0 = true;
            if (z10) {
                arrayList.add(0, ziVar);
            } else {
                arrayList.add(ziVar);
            }
        }
    }

    public final ArrayList O0() {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message = this.k;
        if (message == null) {
            return null;
        }
        if (this.K2) {
            if (this.J2 && (tL_textWithEntities = message.translatedSummaryText) != null) {
                return tL_textWithEntities.entities;
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = message.summaryText;
            if (tL_textWithEntities2 != null) {
                return tL_textWithEntities2.entities;
            }
            return null;
        }
        if (!this.J2) {
            return message.entities;
        }
        if (message.voiceTranscriptionOpen) {
            TLRPC.TL_textWithEntities tL_textWithEntities3 = message.translatedVoiceTranscription;
            if (tL_textWithEntities3 != null) {
                return tL_textWithEntities3.entities;
            }
            return null;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities4 = message.translatedText;
        if (tL_textWithEntities4 != null) {
            return tL_textWithEntities4.entities;
        }
        return null;
    }

    public final int O1() {
        TLRPC.MessageReplyHeader messageReplyHeader = this.k.reply_to;
        if (messageReplyHeader != null) {
            return messageReplyHeader.reply_to_msg_id;
        }
        return 0;
    }

    public boolean O3() {
        return this.k.out;
    }

    public final boolean O5() {
        if (!this.V1) {
            return false;
        }
        if (this.D == 5 || S4(this.k)) {
            return true;
        }
        if (!N2() || this.L1 == null) {
            return (this.v == null || this.L1 == null) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (L4(r6.document) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) r6).flags & 4) != 0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(boolean z10) {
        boolean z11;
        String str;
        TLRPC.Message message;
        String str2;
        String str3;
        int i3;
        String str4;
        String str5;
        int parseInt;
        TLRPC.MessageMedia f10;
        b20 b20Var = this.p0;
        boolean z12 = b20Var != null && b20Var.P;
        TLRPC.Message message2 = this.k;
        if (message2.message == null) {
            return;
        }
        if ((message2.id >= 0 && !Z2()) || this.k.params == null) {
            return;
        }
        TLRPC.MessageMedia n12 = n1(this);
        if (!z10 && !M4(this.k) && !M3() && !i4() && !N4()) {
            if ((n12 instanceof TLRPC.TL_messageMediaPaidMedia) && n12.extended_media.size() == 1) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = n12.extended_media.get(0);
                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                    TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    }
                } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                }
                if (!z11 && (n12 instanceof TLRPC.TL_messageMediaPoll)) {
                    str5 = this.k.params.get("pollMediaIndex");
                    if (str5 != null) {
                        try {
                            parseInt = Integer.parseInt(str5);
                        } catch (Throwable unused) {
                        }
                        f10 = th.d.f((TLRPC.TL_messageMediaPoll) n12, parseInt);
                        if (f10 != null && L4(f10.document)) {
                            z11 = true;
                        }
                    }
                    parseInt = -1;
                    f10 = th.d.f((TLRPC.TL_messageMediaPoll) n12, parseInt);
                    if (f10 != null) {
                        z11 = true;
                    }
                }
                str = this.k.params.get("ve");
                if (str != null && z11) {
                    b20 b20Var2 = new b20();
                    this.p0 = b20Var2;
                    if (str.length() >= 6) {
                        try {
                            String[] split = str.split("_");
                            if (split.length >= 12) {
                                b20Var2.a = Long.parseLong(split[1]);
                                b20Var2.b = Long.parseLong(split[2]);
                                b20Var2.g = Integer.parseInt(split[3]);
                                b20Var2.h = Integer.parseInt(split[4]);
                                b20Var2.i = Integer.parseInt(split[5]);
                                b20Var2.m = Integer.parseInt(split[6]);
                                b20Var2.k = Integer.parseInt(split[7]);
                                b20Var2.l = Integer.parseInt(split[8]);
                                b20Var2.v = Long.parseLong(split[9]);
                                b20Var2.n = Integer.parseInt(split[10]);
                                b20Var2.p = Long.parseLong(split[11]);
                                b20Var2.t = b20Var2.m == -1;
                                if (split[12].startsWith("-")) {
                                    String substring = split[12].substring(1);
                                    if (substring.length() > 0) {
                                        SerializedData serializedData = new SerializedData(Utilities.v(substring));
                                        int readInt32 = serializedData.readInt32(false);
                                        if (readInt32 >= 3) {
                                            str3 = "_";
                                            b20Var2.c = serializedData.readInt64(false);
                                            b20Var2.j = serializedData.readInt32(false);
                                        } else {
                                            str3 = "_";
                                        }
                                        if (serializedData.readByte(false) != 0) {
                                            ze zeVar = new ze();
                                            b20Var2.A = zeVar;
                                            zeVar.a = serializedData.readFloat(false);
                                            if (readInt32 >= 5) {
                                                b20Var2.A.b = serializedData.readFloat(false);
                                            }
                                            b20Var2.A.c = serializedData.readFloat(false);
                                            b20Var2.A.d = serializedData.readFloat(false);
                                            b20Var2.A.e = serializedData.readFloat(false);
                                            b20Var2.A.f = serializedData.readFloat(false);
                                            b20Var2.A.g = serializedData.readFloat(false);
                                            b20Var2.A.h = serializedData.readInt32(false);
                                            b20Var2.A.i = serializedData.readInt32(false);
                                            b20Var2.A.j = serializedData.readFloat(false);
                                            b20Var2.A.k = serializedData.readFloat(false);
                                            b20Var2.A.l = serializedData.readFloat(false);
                                            b20Var2.A.m = serializedData.readFloat(false);
                                            b20Var2.A.n = serializedData.readInt32(false);
                                            b20Var2.A.o = serializedData.readFloat(false);
                                            b20Var2.A.q = serializedData.readFloat(false);
                                            b20Var2.A.r = new PointF(serializedData.readFloat(false), serializedData.readFloat(false));
                                            b20Var2.A.s = serializedData.readFloat(false);
                                            b20Var2.A.t = serializedData.readFloat(false);
                                            int i10 = 0;
                                            while (i10 < 4) {
                                                ld0 ld0Var = i10 == 0 ? (ld0) b20Var2.A.p.b : i10 == 1 ? (ld0) b20Var2.A.p.c : i10 == 2 ? (ld0) b20Var2.A.p.d : (ld0) b20Var2.A.p.e;
                                                ld0Var.a = serializedData.readFloat(false);
                                                ld0Var.b = serializedData.readFloat(false);
                                                ld0Var.c = serializedData.readFloat(false);
                                                ld0Var.d = serializedData.readFloat(false);
                                                ld0Var.e = serializedData.readFloat(false);
                                                i10++;
                                            }
                                        }
                                        if (serializedData.readByte(false) != 0) {
                                            b20Var2.B = new String(serializedData.readByteArray(false));
                                        }
                                        if (serializedData.readByte(false) != 0) {
                                            int readInt322 = serializedData.readInt32(false);
                                            b20Var2.G = new ArrayList(readInt322);
                                            for (int i11 = 0; i11 < readInt322; i11++) {
                                                b20Var2.G.add(new z10(serializedData, false, false));
                                            }
                                            b20Var2.I = serializedData.readByte(false) == 1;
                                        }
                                        if (readInt32 >= 2 && serializedData.readByte(false) != 0) {
                                            re reVar = new re();
                                            b20Var2.H = reVar;
                                            reVar.a = serializedData.readFloat(false);
                                            b20Var2.H.b = serializedData.readFloat(false);
                                            b20Var2.H.e = serializedData.readFloat(false);
                                            b20Var2.H.f = serializedData.readFloat(false);
                                            b20Var2.H.c = serializedData.readFloat(false);
                                            b20Var2.H.d = serializedData.readFloat(false);
                                            b20Var2.H.i = serializedData.readInt32(false);
                                            b20Var2.H.j = serializedData.readInt32(false);
                                            b20Var2.H.k = serializedData.readInt32(false);
                                            if (readInt32 >= 4) {
                                                b20Var2.H.l = serializedData.readBool(false);
                                            }
                                        }
                                        if (readInt32 >= 6) {
                                            serializedData.readInt32(false);
                                        }
                                        if (readInt32 >= 7) {
                                            b20Var2.J = serializedData.readBool(false);
                                            b20Var2.a0 = serializedData.readBool(false);
                                        }
                                        if (readInt32 >= 8 && serializedData.readByte(false) != 0) {
                                            b20Var2.C = new String(serializedData.readByteArray(false));
                                        }
                                        if (readInt32 >= 9) {
                                            b20Var2.u = serializedData.readFloat(false);
                                        }
                                        if (readInt32 >= 10) {
                                            b20Var2.N = serializedData.readBool(false);
                                        }
                                        if (readInt32 >= 11 && serializedData.readInt32(false) == -559038737) {
                                            b20Var2.L = new gi.t(serializedData.readString(false));
                                            b20Var2.M = new ArrayList();
                                            for (int i12 = 0; i12 < b20Var2.L.e.size(); i12++) {
                                                a20 a20Var = new a20();
                                                a20Var.r = (gi.s) b20Var2.L.e.get(i12);
                                                a20Var.readParams(serializedData, false);
                                                b20Var2.M.add(a20Var);
                                            }
                                        }
                                        serializedData.cleanup();
                                    } else {
                                        str3 = "_";
                                    }
                                    i3 = 13;
                                } else {
                                    str3 = "_";
                                    i3 = 12;
                                }
                                while (i3 < split.length) {
                                    if (b20Var2.o == null) {
                                        b20Var2.o = split[i3];
                                        str4 = str3;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(b20Var2.o);
                                        str4 = str3;
                                        sb2.append(str4);
                                        sb2.append(split[i3]);
                                        b20Var2.o = sb2.toString();
                                    }
                                    i3++;
                                    str3 = str4;
                                }
                            }
                            this.p0.s = i4();
                            this.p0.P = z12;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    this.p0 = null;
                }
                message = this.k;
                if (message.send_state != 3 || (str2 = message.params.get("prevMedia")) == null) {
                    return;
                }
                SerializedData serializedData2 = new SerializedData(Base64.decode(str2, 0));
                this.B1 = TLRPC.MessageMedia.TLdeserialize(serializedData2, serializedData2.readInt32(false), false);
                this.A1 = serializedData2.readString(false);
                this.E1 = serializedData2.readString(false);
                int readInt323 = serializedData2.readInt32(false);
                this.D1 = new ArrayList(readInt323);
                for (int i13 = 0; i13 < readInt323; i13++) {
                    this.D1.add(TLRPC.MessageEntity.TLdeserialize(serializedData2, serializedData2.readInt32(false), false));
                }
                serializedData2.cleanup();
                return;
            }
            z11 = false;
            if (!z11) {
                str5 = this.k.params.get("pollMediaIndex");
                if (str5 != null) {
                }
                parseInt = -1;
                f10 = th.d.f((TLRPC.TL_messageMediaPoll) n12, parseInt);
                if (f10 != null) {
                }
            }
            str = this.k.params.get("ve");
            if (str != null) {
                b20 b20Var22 = new b20();
                this.p0 = b20Var22;
                if (str.length() >= 6) {
                }
                this.p0 = null;
            }
            message = this.k;
            if (message.send_state != 3) {
                return;
            } else {
                return;
            }
        }
        z11 = true;
        if (!z11) {
        }
        str = this.k.params.get("ve");
        if (str != null) {
        }
        message = this.k;
        if (message.send_state != 3) {
        }
    }

    public final int P0() {
        if (d3(this.k)) {
            return S(this.k.id);
        }
        return 0;
    }

    public final CharSequence P1() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence u52;
        TLRPC.Message message = this.k;
        if (message == null) {
            return "";
        }
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        int i3 = this.I1;
        if (messageReplyHeader != null) {
            if (messageReplyHeader.reply_from != null) {
                TLRPC.Peer peer = messageReplyHeader.reply_to_peer_id;
                boolean z10 = peer == null || m5.o(peer) != B0(this.k);
                TLRPC.MessageFwdHeader messageFwdHeader = this.k.reply_to.reply_from;
                TLRPC.Peer peer2 = messageFwdHeader.from_id;
                if (peer2 == null) {
                    TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                    if (peer3 != null) {
                        if (peer3 instanceof TLRPC.TL_peerUser) {
                            charSequence = u5(i3, peer3, z10);
                        } else {
                            u52 = u5(i3, peer3, z10);
                            charSequence2 = u52;
                            charSequence = null;
                        }
                    } else if (!TextUtils.isEmpty(messageFwdHeader.from_name)) {
                        charSequence = z10 ? new SpannableStringBuilder(i6()).append((CharSequence) " ").append((CharSequence) this.k.reply_to.reply_from.from_name) : new SpannableStringBuilder(this.k.reply_to.reply_from.from_name);
                    }
                    charSequence2 = null;
                } else if (peer2 instanceof TLRPC.TL_peerUser) {
                    charSequence = u5(i3, peer2, z10);
                    charSequence2 = null;
                } else {
                    u52 = u5(i3, peer2, z10);
                    charSequence2 = u52;
                    charSequence = null;
                }
            }
            charSequence = null;
            charSequence2 = null;
        } else if (m5.z(B0(message))) {
            u52 = t5(i3, B0(this.k));
            charSequence2 = u52;
            charSequence = null;
        } else {
            charSequence = t5(i3, B0(this.k));
            charSequence2 = null;
        }
        TLRPC.Peer peer4 = this.k.reply_to.reply_to_peer_id;
        if (peer4 != null && m5.o(peer4) != B0(this.k)) {
            TLRPC.Peer peer5 = this.k.reply_to.reply_to_peer_id;
            boolean z11 = peer5 instanceof TLRPC.TL_peerUser;
            if (z11) {
                charSequence = u5(i3, peer5, true);
            } else {
                charSequence2 = u5(i3, peer5, !z11);
            }
        }
        zi ziVar = this.C;
        if (ziVar != null) {
            if (m5.z(ziVar.S1())) {
                if (charSequence2 == null) {
                    charSequence2 = t5(i3, this.C.S1());
                }
            } else if (charSequence == null) {
                charSequence = t5(i3, this.C.S1());
            }
        }
        return (charSequence2 == null || charSequence == null) ? charSequence2 != null ? charSequence2 : charSequence != null ? charSequence : bd.M0(2131748787, null) : new SpannableStringBuilder(charSequence).append((CharSequence) " ").append(charSequence2);
    }

    public final boolean P5() {
        return !this.h2;
    }

    public final void Q() {
        if (this.n0 != null) {
            if ((az.o() == 2 || r2()) && this.G1 == null) {
                try {
                    String str = i4() ? "br" : "b";
                    int size = this.n0.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.n0.get(i3);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            this.G1 = new BitmapDrawable(t0.b.getResources(), zb.F(str, photoSize.bytes));
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        }
    }

    public final String Q0() {
        String S0 = S0();
        int lastIndexOf = S0.lastIndexOf(46);
        String substring = lastIndexOf != -1 ? S0.substring(lastIndexOf + 1) : null;
        if (substring == null || substring.length() == 0) {
            substring = F0().mime_type;
        }
        if (substring == null) {
            substring = "";
        }
        return substring.toUpperCase();
    }

    public final long Q1() {
        return R1(h10.i(this.I1).e(), this.k);
    }

    public final boolean Q2() {
        TLRPC.Message message;
        if (!az.H0) {
            if (this.V2 == 0 && (message = this.k) != null) {
                long B0 = B0(message);
                if (B0 != 0) {
                    this.V2 = (az.H0 || (B0 > 0 && ((m0) hp.s1(this.I1).x7.n0.b).b.contains(Long.valueOf(B0)))) ? (byte) 2 : (byte) 1;
                }
            }
            if (this.V2 != 2) {
                return false;
            }
        }
        return true;
    }

    public boolean Q3() {
        boolean z10 = true;
        if (this.s1) {
            return true;
        }
        Boolean bool = this.U2;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (e5(this.k) && !c5()) {
            this.U2 = Boolean.FALSE;
            return false;
        }
        long e10 = h10.i(this.I1).e();
        if (this.l2 || B0(this.k) == e10) {
            TLRPC.MessageFwdHeader messageFwdHeader = this.k.fwd_from;
            if (messageFwdHeader == null) {
                this.U2 = Boolean.TRUE;
                return true;
            }
            TLRPC.Peer peer = messageFwdHeader.from_id;
            if ((peer == null || peer.user_id != e10) && !messageFwdHeader.saved_out) {
                z10 = false;
            }
            this.U2 = Boolean.valueOf(z10);
            return z10;
        }
        TLRPC.Peer peer2 = this.k.peer_id;
        TLRPC.Chat chat = null;
        if (peer2 != null) {
            long j10 = peer2.channel_id;
            if (j10 != 0) {
                chat = w0(null, null, j10);
            }
        }
        TLRPC.Message message = this.k;
        if (message.out) {
            TLRPC.Peer peer3 = message.from_id;
            if ((peer3 instanceof TLRPC.TL_peerUser) || ((peer3 instanceof TLRPC.TL_peerChannel) && !t3.V(chat))) {
                TLRPC.Message message2 = this.k;
                if (!message2.post) {
                    TLRPC.MessageFwdHeader messageFwdHeader2 = message2.fwd_from;
                    if (messageFwdHeader2 == null) {
                        this.U2 = Boolean.TRUE;
                        return true;
                    }
                    TLRPC.Peer peer4 = messageFwdHeader2.saved_from_peer;
                    if (peer4 != null && peer4.user_id != e10) {
                        z10 = false;
                    }
                    this.U2 = Boolean.valueOf(z10);
                    return z10;
                }
            }
        }
        this.U2 = Boolean.FALSE;
        return false;
    }

    public final boolean Q4() {
        return S4(this.k);
    }

    public final boolean Q5() {
        if (s4()) {
            return false;
        }
        int i3 = this.D;
        return i3 == 13 || i3 == 15 || i3 == 5 || i3 == 19 || h3();
    }

    public final TLRPC.TL_factCheck R0() {
        TLRPC.TL_factCheck tL_factCheck;
        x6 b10 = x6.b(this.I1);
        LongSparseArray longSparseArray = b10.c;
        LongSparseArray longSparseArray2 = b10.b;
        TLRPC.Message message = this.k;
        if (message == null || (tL_factCheck = message.factcheck) == null) {
            return null;
        }
        if (!tL_factCheck.need_check) {
            if (longSparseArray2.get(tL_factCheck.hash) == null) {
                TLRPC.TL_factCheck tL_factCheck2 = this.k.factcheck;
                longSparseArray2.put(tL_factCheck2.hash, tL_factCheck2);
                TLRPC.TL_factCheck tL_factCheck3 = this.k.factcheck;
                int i3 = b10.a;
                if (tL_factCheck3 != null) {
                    qr a02 = qr.a0(i3);
                    a02.a.c(new y4(4, a02, tL_factCheck3));
                    if (!b10.f) {
                        b10.f = true;
                        qr a03 = qr.a0(i3);
                        a03.a.c(new hq(a03, 6));
                    }
                }
            }
            return this.k.factcheck;
        }
        long B0 = B0(message);
        int f12 = f1();
        long j10 = this.k.factcheck.hash;
        w6 w6Var = new w6(B0, f12, j10);
        if (f12 < 0) {
            return null;
        }
        TLRPC.TL_factCheck tL_factCheck4 = (TLRPC.TL_factCheck) longSparseArray2.get(j10);
        if (tL_factCheck4 != null) {
            this.k.factcheck = tL_factCheck4;
            return tL_factCheck4;
        }
        if (b10.d.contains(w6Var)) {
            return this.k.factcheck;
        }
        HashMap hashMap = (HashMap) longSparseArray.get(B0);
        if (hashMap == null) {
            hashMap = new HashMap();
            longSparseArray.put(B0, hashMap);
        }
        if (!hashMap.containsKey(w6Var)) {
            hashMap.put(w6Var, new d3(b10, w6Var, this, 1));
            a aVar = b10.e;
            g0.r(aVar);
            g0.i3(aVar, 80L);
        }
        return this.k.factcheck;
    }

    public final boolean R3() {
        TLRPC.Message message = this.k;
        if (message == null) {
            return false;
        }
        if (!message.paid_suggested_post_stars && !message.paid_suggested_post_ton) {
            return false;
        }
        int i3 = this.I1;
        return ((long) (ConnectionsManager.getInstance(i3).getCurrentTime() - this.k.date)) < hp.s1(i3).x7.i.g2(TimeUnit.SECONDS);
    }

    public final boolean R5() {
        return S5(this.k);
    }

    public final String S0() {
        return F0() != null ? w7.r(null, F0()) : T0(this.k);
    }

    public final long S1() {
        TLRPC.Peer peer;
        TLRPC.Message message = this.k;
        TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
        if (messageFwdHeader == null || (peer = messageFwdHeader.saved_from_peer) == null) {
            TLRPC.Peer peer2 = message.from_id;
            if (peer2 instanceof TLRPC.TL_peerUser) {
                return peer2.user_id;
            }
            if (peer2 instanceof TLRPC.TL_peerChannel) {
                return -peer2.channel_id;
            }
            if (peer2 instanceof TLRPC.TL_peerChat) {
                return -peer2.chat_id;
            }
            if (message.post) {
                return message.peer_id.channel_id;
            }
        } else {
            long j10 = peer.user_id;
            if (j10 != 0) {
                TLRPC.Peer peer3 = messageFwdHeader.from_id;
                return peer3 instanceof TLRPC.TL_peerUser ? peer3.user_id : j10;
            }
            if (peer.channel_id != 0) {
                if (l4()) {
                    TLRPC.Peer peer4 = this.k.fwd_from.from_id;
                    if (peer4 instanceof TLRPC.TL_peerUser) {
                        return peer4.user_id;
                    }
                }
                TLRPC.MessageFwdHeader messageFwdHeader2 = this.k.fwd_from;
                TLRPC.Peer peer5 = messageFwdHeader2.from_id;
                return peer5 instanceof TLRPC.TL_peerChannel ? -peer5.channel_id : peer5 instanceof TLRPC.TL_peerChat ? -peer5.chat_id : -messageFwdHeader2.saved_from_peer.channel_id;
            }
            long j11 = peer.chat_id;
            if (j11 != 0) {
                TLRPC.Peer peer6 = messageFwdHeader.from_id;
                return peer6 instanceof TLRPC.TL_peerUser ? peer6.user_id : peer6 instanceof TLRPC.TL_peerChannel ? -peer6.channel_id : peer6 instanceof TLRPC.TL_peerChat ? -peer6.chat_id : -j11;
            }
        }
        return 0L;
    }

    public final boolean S2() {
        return this.k.media_unread;
    }

    public final boolean S3() {
        return T3(this.k);
    }

    public final boolean T(zi ziVar) {
        return ziVar != null && f1() == ziVar.f1() && B0(this.k) == B0(ziVar.k);
    }

    public final long T1() {
        l51 l51Var = this.e3;
        if (l51Var != null) {
            return l51Var.g.size;
        }
        l51 l51Var2 = this.f3;
        if (l51Var2 != null) {
            return l51Var2.g.size;
        }
        l51 l51Var3 = this.g3;
        return l51Var3 != null ? l51Var3.g.size : q1(o1(this.k));
    }

    public final boolean T2() {
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        TLRPC.UserFull b22;
        TLRPC.WallPaper wallPaper;
        return (!Y4() || (message = this.k) == null || (messageAction = message.action) == null || messageAction.wallpaper == null || (b22 = hp.s1(this.I1).b2(B0(this.k))) == null || (wallPaper = b22.wallpaper) == null || !b22.wallpaper_overridden || this.k.action.wallpaper.id != wallPaper.id) ? false : true;
    }

    public final boolean T4() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        return S4(this.k) && (message = this.k) != null && (messageMedia = message.media) != null && messageMedia.ttl_seconds == Integer.MAX_VALUE;
    }

    public final boolean T5() {
        TLRPC.Message message = this.k;
        return (message == null || message.peer_id == null || O3() || s4() || !hp.s1(this.I1).I2(B0(this.k))) ? false : true;
    }

    public final long U1() {
        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome;
        TLRPC.MessageMedia o12 = o1(this.k);
        if (!(o12 instanceof TLRPC.TL_messageMediaDice) || (tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) o12).game_outcome) == null) {
            return 0L;
        }
        long j10 = tL_messages_emojiGameOutcome.ton_amount;
        return j10 > 0 ? j10 : -tL_messages_emojiGameOutcome.stake_ton_amount;
    }

    public final boolean U2() {
        return o1(this.k) instanceof TLRPC.TL_messageMediaDice;
    }

    public final boolean U3() {
        return this.D == 17 && (o1(this.k) instanceof TLRPC.TL_messageMediaPoll);
    }

    public final boolean U4() {
        TLRPC.Message message = this.k;
        if (message == null) {
            return false;
        }
        if (!S4(message) && (!i4() || !m11.k(this))) {
            return false;
        }
        TLRPC.Message message2 = this.k;
        if (!message2.voiceTranscriptionOpen || message2.voiceTranscription == null) {
            return false;
        }
        return message2.voiceTranscriptionFinal || m11.j(this);
    }

    public final String V0() {
        TLRPC.Document document = this.n;
        if (document == null) {
            document = G0(this.k);
        }
        if (document == null) {
            return T0(this.k);
        }
        TLRPC.Document document2 = this.n;
        if (document2 == null) {
            document2 = G0(this.k);
        }
        return w7.r(null, document2);
    }

    public final String V1() {
        TLRPC.Document F0 = F0();
        if (F0 == null) {
            return null;
        }
        ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i3);
            i3++;
            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) {
                return documentAttribute2.alt;
            }
        }
        return null;
    }

    public final boolean V2() {
        return (F0() == null || M4(this.k) || J3() || S4(this.k) || N2()) ? false : true;
    }

    public final void V5() {
        TLRPC.Message message;
        if (this.I2 || this.v == null || (message = this.k) == null || message.entities == null) {
            return;
        }
        TLRPC.Peer peer = message.from_id;
        if (peer instanceof TLRPC.TL_peerUser) {
            long j10 = peer.user_id;
            if (j10 == 777000 || j10 == 489000) {
                if (o3 == null) {
                    o3 = Pattern.compile("[\\d\\-]{5,8}");
                }
                try {
                    Matcher matcher = o3.matcher(this.v);
                    if (matcher.find()) {
                        TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
                        tL_messageEntitySpoiler.offset = matcher.start();
                        tL_messageEntitySpoiler.length = matcher.end() - tL_messageEntitySpoiler.offset;
                        this.k.entities.add(tL_messageEntitySpoiler);
                    }
                } catch (Exception e10) {
                    a8.g(e10, false);
                }
                this.I2 = true;
            }
        }
    }

    public final Long W0() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message = this.k;
        if (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) {
            return null;
        }
        return Long.valueOf(m5.o(peer));
    }

    public final String W1() {
        TLRPC.Document F0 = F0();
        if (F0 == null) {
            return null;
        }
        for (int i3 = 0; i3 < F0.attributes.size(); i3++) {
            TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i3);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                String str = documentAttribute.alt;
                if (str != null && str.length() > 0) {
                    return documentAttribute.alt;
                }
                return null;
            }
        }
        return null;
    }

    public final boolean W4() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia o12 = o1(this.k);
        if (o12 instanceof TLRPC.TL_messageMediaPoll) {
            return X4((TLRPC.TL_messageMediaPoll) o12);
        }
        return false;
    }

    public final int W5() {
        cv cvVar = this.w2;
        if (cvVar != null) {
            return cvVar.t();
        }
        if (this.z2 == null) {
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < this.z2.size(); i10++) {
            int i11 = ((wi) this.z2.get(i10)).f;
            wi wiVar = (wi) this.z2.get(i10);
            i3 += ((wiVar.K && wiVar.f()) ? wiVar.G : wiVar.w) + i11 + ((wi) this.z2.get(i10)).h;
        }
        return i3;
    }

    public final TLObject X0() {
        Long W0 = W0();
        if (W0 == null) {
            return null;
        }
        return hp.s1(this.I1).e2(W0.longValue());
    }

    public final TLRPC.WebPage X1() {
        if (!A4()) {
            return null;
        }
        TLRPC.TL_webPage tL_webPage = this.Z2;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        TLRPC.TL_webPage tL_webPage2 = new TLRPC.TL_webPage();
        tL_webPage2.type = "telegram_story";
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = new TLRPC.TL_webPageAttributeStory();
        tL_webPageAttributeStory.id = this.k.media.id;
        tL_webPageAttributeStory.peer = hp.s1(this.I1).z1(this.k.media.user_id);
        TL_stories.StoryItem storyItem = this.k.media.storyItem;
        if (storyItem != null) {
            tL_webPageAttributeStory.flags |= 1;
            tL_webPageAttributeStory.storyItem = storyItem;
        }
        tL_webPage2.attributes.add(tL_webPageAttributeStory);
        this.Z2 = tL_webPage2;
        return tL_webPage2;
    }

    public final boolean X3() {
        if (o1(this.k) == null || !o1(this.k).nopremium) {
            return Y3(F0());
        }
        return false;
    }

    public final int X5(org.telegram.ui.Cells.x1 x1Var) {
        if (this.z2 == null) {
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < this.z2.size(); i10++) {
            i3 += ((wi) this.z2.get(i10)).j(x1Var) + ((wi) this.z2.get(i10)).f + ((wi) this.z2.get(i10)).h;
        }
        return i3;
    }

    public final String Y0() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.k.fwd_from;
        if (messageFwdHeader == null) {
            return null;
        }
        TLRPC.Peer peer = messageFwdHeader.from_id;
        boolean z10 = peer instanceof TLRPC.TL_peerChannel;
        int i3 = this.I1;
        if (z10) {
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(this.k.fwd_from.from_id.channel_id));
            if (M0 != null) {
                return M0.title;
            }
            return null;
        }
        if (peer instanceof TLRPC.TL_peerChat) {
            TLRPC.Chat M02 = hp.s1(i3).M0(Long.valueOf(this.k.fwd_from.from_id.chat_id));
            if (M02 != null) {
                return M02.title;
            }
            return null;
        }
        if (peer instanceof TLRPC.TL_peerUser) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(this.k.fwd_from.from_id.user_id));
            if (a22 != null) {
                return l10.p(a22);
            }
            return null;
        }
        String str = messageFwdHeader.from_name;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final boolean Y2() {
        TLRPC.Message message = this.k;
        return (message == null || (message.flags & 32768) == 0 || message.edit_date == 0 || message.edit_hide) ? false : true;
    }

    public final boolean Y4() {
        if (this.D == 22) {
            return true;
        }
        TLRPC.Message message = this.k;
        return message != null && (message.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper);
    }

    public final int Y5() {
        cv cvVar = this.w2;
        if (cvVar != null) {
            return cvVar.t();
        }
        Integer num = this.T2;
        if (num != null) {
            return num.intValue();
        }
        if (this.z2 == null) {
            this.T2 = 0;
            return 0;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < this.z2.size(); i10++) {
            int i11 = ((wi) this.z2.get(i10)).f;
            wi wiVar = (wi) this.z2.get(i10);
            i3 += i11 + (wiVar.K ? wiVar.G : wiVar.w) + ((wi) this.z2.get(i10)).h;
        }
        this.T2 = Integer.valueOf(i3);
        return i3;
    }

    public final long Z0() {
        return C1(this.k.from_id);
    }

    public final long Z1() {
        int i3 = this.I1;
        TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-B0(this.k)));
        return a2(i3, this.k, x7.u.b(x7.u.b(x7.u.b(0, 1, t3.c0(M0)), 4, t3.p0(M0)), 8, l10.u(hp.s1(i3).a2(Long.valueOf(B0(this.k))))));
    }

    public final boolean Z2() {
        TLRPC.Message message = this.k;
        return message.send_state == 3 && message.id > 0;
    }

    public final boolean Z3() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.k.fwd_from;
        return (messageFwdHeader == null || TextUtils.isEmpty(messageFwdHeader.from_name)) ? false : true;
    }

    public final boolean Z4() {
        TLRPC.Message message;
        if (!Y4() || (message = this.k) == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        return (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) && ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).for_both;
    }

    public final void Z5() {
        boolean z10 = !this.g1;
        SharedPreferences.Editor edit = hp.s1(this.I1).e7.edit();
        String str = "c" + B0(this.k) + "_rec";
        this.g1 = z10;
        edit.putBoolean(str, z10).apply();
    }

    public final boolean a3() {
        return o1(this.k) instanceof TLRPC.TL_messageMediaPhoto ? o1(this.k).photo.id == 0 : (o1(this.k) instanceof TLRPC.TL_messageMediaDocument) && o1(this.k).document.dc_id == 0;
    }

    public final boolean a4() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia o12 = o1(this.k);
        if (o12 instanceof TLRPC.TL_messageMediaPoll) {
            return ((TLRPC.TL_messageMediaPoll) o12).poll.public_voters;
        }
        return false;
    }

    public final boolean a5() {
        return o1(this.k) instanceof TLRPC.TL_messageMediaWebPage;
    }

    public final TLRPC.Peer b1() {
        TLRPC.Message message = this.k;
        if (message != null) {
            return message.from_id;
        }
        return null;
    }

    public final boolean b3() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.MessageMedia messageMedia2;
        Boolean bool = this.R2;
        boolean z10 = false;
        if (bool != null) {
            TLRPC.Message message = this.k;
            return (message == null || (messageMedia2 = message.media) == null || messageMedia2.webpage == null || !bool.booleanValue()) ? false : true;
        }
        TLRPC.Message message2 = this.k;
        if (message2 != null && (messageMedia = message2.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(d71.e(webPage.url))) {
            z10 = true;
        }
        this.R2 = Boolean.valueOf(z10);
        return z10;
    }

    public final boolean b4() {
        return c4(this.k);
    }

    public final boolean b5() {
        return (!(o1(this.k) instanceof TLRPC.TL_messageMediaWebPage) || o1(this.k).webpage.document == null || t3(o1(this.k).webpage.document, false)) ? false : true;
    }

    public final void b6() {
        int i3 = this.I1;
        c6(hp.s1(i3).d, hp.s1(i3).b, null, null);
    }

    public final boolean c(CharSequence charSequence, boolean z10, boolean z11) {
        if (charSequence == null) {
            return false;
        }
        if (!this.E0 && !(o1(this.k) instanceof TLRPC.TL_messageMediaUnsupported)) {
            return b(charSequence, O0(), Q3(), true, z10, z11, 0);
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityItalic tL_messageEntityItalic = new TLRPC.TL_messageEntityItalic();
        tL_messageEntityItalic.offset = 0;
        tL_messageEntityItalic.length = charSequence.length();
        arrayList.add(tL_messageEntityItalic);
        return b(charSequence, arrayList, Q3(), true, z10, z11, 0);
    }

    public final TLObject c1() {
        TLRPC.Message message = this.k;
        if (message == null) {
            return null;
        }
        TLRPC.Peer peer = message.from_id;
        boolean z10 = peer instanceof TLRPC.TL_peerChannel_layer131;
        int i3 = this.I1;
        if (z10 || (peer instanceof TLRPC.TL_peerChannel)) {
            return hp.s1(i3).M0(Long.valueOf(this.k.from_id.channel_id));
        }
        if ((peer instanceof TLRPC.TL_peerUser_layer131) || (peer instanceof TLRPC.TL_peerUser)) {
            return hp.s1(i3).a2(Long.valueOf(this.k.from_id.user_id));
        }
        if ((peer instanceof TLRPC.TL_peerChat_layer131) || (peer instanceof TLRPC.TL_peerChat)) {
            return hp.s1(i3).M0(Long.valueOf(this.k.from_id.chat_id));
        }
        return null;
    }

    public final boolean c3() {
        return d3(this.k);
    }

    public final boolean c5() {
        TLRPC.Message message = this.k;
        return d3(message) && message.ephemeralAnchorMsgId != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:1415:0x2549  */
    /* JADX WARN: Removed duplicated region for block: B:1433:0x25b3  */
    /* JADX WARN: Removed duplicated region for block: B:1435:0x25b7  */
    /* JADX WARN: Removed duplicated region for block: B:1492:0x275e A[LOOP:4: B:1482:0x2725->B:1492:0x275e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:1493:0x275c A[EDGE_INSN: B:1493:0x275c->B:1494:0x275c BREAK  A[LOOP:4: B:1482:0x2725->B:1492:0x275e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1618:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0982  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0a1e  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x2a0b  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x1141  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x115d  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x11ba  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x11cf  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x1217  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x1222  */
    /* JADX WARN: Removed duplicated region for block: B:802:0x1422  */
    /* JADX WARN: Removed duplicated region for block: B:822:0x14c2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c6(AbstractMap abstractMap, AbstractMap abstractMap2, a0.h hVar, a0.h hVar2) {
        TLRPC.User user;
        TLRPC.Chat w02;
        boolean z10;
        String str;
        char c2;
        String G;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        String str2;
        String n4;
        boolean V;
        String str3;
        TLRPC.Chat w03;
        TLRPC.TodoItem todoItem;
        String n10;
        String str4;
        TLRPC.Chat chat;
        String str5;
        TLRPC.Chat chat2;
        long j10;
        boolean z11;
        String str6;
        int i3;
        TLObject tLObject;
        TLRPC.Chat chat3;
        TLRPC.Chat chat4;
        TLRPC.Chat chat5;
        ArrayList<TLRPC.VideoSize> arrayList;
        int i10;
        TLObject tLObject2;
        TLObject tLObject3;
        TLObject tLObject4;
        TLRPC.Peer peer;
        TLRPC.Chat chat6;
        TLRPC.TL_messageActionGiveawayResults tL_messageActionGiveawayResults;
        TLRPC.Chat chat7;
        String str7;
        boolean z12;
        TLRPC.Chat chat8;
        dg.a aVar;
        dg.a aVar2;
        TLRPC.Chat w04;
        TLRPC.User w05;
        char c10;
        String G2;
        TLRPC.Peer peer2 = this.k.from_id;
        if (peer2 instanceof TLRPC.TL_peerUser) {
            user = e2(abstractMap, hVar, peer2.user_id);
        } else {
            if (peer2 instanceof TLRPC.TL_peerChannel) {
                w02 = w0(abstractMap2, hVar2, peer2.channel_id);
                user = null;
                TLObject tLObject5 = user == null ? user : w02;
                this.q2 = false;
                this.f1 = false;
                TLRPC.Message message = this.k;
                z10 = message instanceof TLRPC.TL_messageService;
                int i11 = this.I1;
                if (z10) {
                    str = "";
                    TLRPC.Chat chat9 = w02;
                    this.E0 = false;
                    String F1 = hp.s1(i11).F1(this.k.restriction_reason);
                    if (TextUtils.isEmpty(F1)) {
                        TL_iv.RichMessage richMessage = this.k.rich_message;
                        if (richMessage != null) {
                            Q3();
                            SpannableStringBuilder d02 = d0(richMessage);
                            this.v = d02;
                            this.v = g0.N2(d02);
                        } else if (G3() || s4()) {
                            String str8 = this.k.message;
                            if (str8 != null) {
                                try {
                                    if (str8.length() > 200) {
                                        this.v = g0.V.matcher(this.k.message).replaceAll("\u200c");
                                    } else {
                                        this.v = g0.U.matcher(this.k.message).replaceAll("\u200c");
                                    }
                                } catch (Throwable unused) {
                                    this.v = this.k.message;
                                }
                            } else {
                                this.v = str8;
                            }
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaGiveaway) {
                            TLRPC.MessageFwdHeader messageFwdHeader = this.k.fwd_from;
                            if (messageFwdHeader != null) {
                                TLRPC.Peer peer3 = messageFwdHeader.from_id;
                                if (peer3 instanceof TLRPC.TL_peerChannel) {
                                    V = t3.V(w0(abstractMap2, hVar2, peer3.channel_id));
                                    this.v = bd.L0(!V ? 2131753482 : 2131753476);
                                }
                            }
                            V = t3.V(chat9);
                            this.v = bd.L0(!V ? 2131753482 : 2131753476);
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaGiveawayResults) {
                            this.v = bd.L0(2131753392);
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaStory) {
                            if (o1(this.k).via_mention) {
                                TLRPC.User a22 = hp.s1(i11).a2(Long.valueOf(o1(this.k).user_id));
                                if (a22 == null || (n4 = l10.n(a22)) == null) {
                                    str2 = null;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    com.google.android.recaptcha.internal.a.s(sb2, hp.s1(i11).V2, "/", n4, "/s/");
                                    sb2.append(o1(this.k).id);
                                    str2 = sb2.toString();
                                }
                                if (str2 != null) {
                                    SpannableString spannableString = new SpannableString(str2);
                                    this.v = spannableString;
                                    spannableString.setSpan(new x31("https://".concat(str2), new ty0()), 0, this.v.length(), 33);
                                } else {
                                    this.v = str;
                                }
                            } else {
                                this.v = bd.L0(2131750544);
                            }
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaDice) {
                            this.v = C0();
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaPoll) {
                            if (((TLRPC.TL_messageMediaPoll) o1(this.k)).poll.quiz) {
                                this.v = bd.L0(2131746453);
                            } else {
                                this.v = bd.L0(2131747193);
                            }
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaToDo) {
                            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) o1(this.k);
                            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
                            if (todoList == null || (tL_textWithEntities = todoList.title) == null || tL_textWithEntities.text.isEmpty()) {
                                this.v = bd.L0(2131748477);
                            } else {
                                this.v = bd.U(2131748475, h0(tL_messageMediaToDo.todo.title, Q3()));
                            }
                        } else if (T4()) {
                            this.v = bd.L0(2131753951);
                        } else if (h4()) {
                            this.v = bd.L0(2131753950);
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaPaidMedia) {
                            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) o1(this.k);
                            int size = tL_messageMediaPaidMedia.extended_media.size();
                            boolean z13 = false;
                            for (int i12 = 0; i12 < size; i12++) {
                                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i12);
                                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                    TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                                    z13 = (messageMedia instanceof TLRPC.TL_messageMediaDocument) && L4(messageMedia.document);
                                } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                                    z13 = (((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).flags & 4) != 0;
                                    if (!z13) {
                                        break;
                                    }
                                }
                                if (!z13) {
                                }
                            }
                            if (size == 1) {
                                G = bd.L0(z13 ? 2131753933 : 2131753948);
                                c2 = 0;
                            } else {
                                c2 = 0;
                                G = bd.G(size, z13 ? "Media" : "Photos", new Object[0]);
                            }
                            this.v = G;
                            Object[] objArr = new Object[1];
                            objArr[c2] = G;
                            this.v = ci.wb.T0(bd.Z(2131753949, objArr));
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaPhoto) {
                            if (o1(this.k).ttl_seconds != 0 && !(this.k instanceof TLRPC.TL_message_secret)) {
                                this.v = bd.L0(2131753977);
                            } else if (d1() != 0) {
                                this.v = bd.L0(2131754305);
                            } else if (E3()) {
                                this.v = bd.L0(2131753962);
                            } else {
                                this.v = bd.L0(2131753948);
                            }
                        } else if (I4() || ((o1(this.k) instanceof TLRPC.TL_messageMediaDocument) && (((F0() instanceof TLRPC.TL_documentEmpty) || F0() == null) && o1(this.k).ttl_seconds != 0))) {
                            if (o1(this.k).ttl_seconds != 0) {
                                TLRPC.Message message2 = this.k;
                                if (!(message2 instanceof TLRPC.TL_message_secret)) {
                                    if (o1(message2).voice) {
                                        this.v = bd.L0(2131753929);
                                    } else if (o1(this.k).round) {
                                        this.v = bd.L0(2131753940);
                                    } else {
                                        this.v = bd.L0(2131753976);
                                    }
                                }
                            }
                            this.v = bd.L0(2131753933);
                        } else if (Q4()) {
                            this.v = bd.L0(2131753982);
                        } else if (i4()) {
                            this.v = bd.L0(2131753941);
                        } else if ((o1(this.k) instanceof TLRPC.TL_messageMediaGeo) || (o1(this.k) instanceof TLRPC.TL_messageMediaVenue)) {
                            this.v = bd.L0(2131753961);
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaGeoLive) {
                            this.v = bd.L0(2131753966);
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaContact) {
                            this.v = bd.L0(2131753979);
                            if (!TextUtils.isEmpty(o1(this.k).vcard)) {
                                this.X1 = k4.j.G(o1(this.k).vcard);
                            }
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaGame) {
                            this.v = this.k.message;
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaInvoice) {
                            this.v = o1(this.k).description;
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaUnsupported) {
                            this.v = bd.L0(2131743839);
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaWidget) {
                            this.v = TextUtils.isEmpty(this.k.message) ? bd.L0(2131753926) : this.k.message;
                        } else if (o1(this.k) instanceof TLRPC.TL_messageMediaDocument) {
                            if (u4() || L2(F0(), true)) {
                                String V1 = V1();
                                if (V1 == null || V1.length() <= 0) {
                                    this.v = bd.L0(2131753936);
                                } else {
                                    this.v = a1.g.C(V1, " ", bd.L0(2131753936));
                                }
                            } else if (J3()) {
                                this.v = bd.L0(2131753952);
                            } else if (r3()) {
                                this.v = bd.L0(2131753971);
                            } else {
                                String B = w7.B(F0());
                                if (TextUtils.isEmpty(B)) {
                                    this.v = bd.L0(2131753975);
                                } else {
                                    this.v = B;
                                }
                            }
                        }
                    } else {
                        this.v = F1;
                        this.E0 = true;
                    }
                } else {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction != null) {
                        if (messageAction instanceof TLRPC.TL_messageActionNewCreatorPending) {
                            TLRPC.User e22 = e2(abstractMap, hVar, ((TLRPC.TL_messageActionNewCreatorPending) messageAction).new_creator_id);
                            String L0 = bd.L0(2131754601);
                            this.v = L0;
                            CharSequence F5 = F5(L0, "un1", e22);
                            this.v = F5;
                            this.v = F5(F5, "un2", tLObject5);
                        } else if (messageAction instanceof TLRPC.TL_messageActionChangeCreator) {
                            TLRPC.User e23 = e2(abstractMap, hVar, ((TLRPC.TL_messageActionChangeCreator) messageAction).new_creator_id);
                            String L02 = bd.L0(2131754668);
                            this.v = L02;
                            CharSequence F52 = F5(L02, "un1", tLObject5);
                            this.v = F52;
                            this.v = F5(F52, "un2", e23);
                        } else if (messageAction instanceof TLRPC.TL_messageActionManagedBotCreated) {
                            TLRPC.User e24 = e2(abstractMap, hVar, ((TLRPC.TL_messageActionManagedBotCreated) messageAction).bot_id);
                            TLRPC.User e25 = e2(abstractMap, hVar, this.k.peer_id.user_id);
                            String L03 = bd.L0(2131754604);
                            this.v = L03;
                            CharSequence F53 = F5(L03, "un1", e24);
                            this.v = F53;
                            this.v = F5(F53, "un2", e25);
                        } else if (messageAction instanceof TLRPC.TL_messageActionSetSameChatWallPaper) {
                            TLRPC.Chat chat10 = w02;
                            this.U = 1;
                            this.D = 10;
                            TLRPC.TL_messageActionSetSameChatWallPaper tL_messageActionSetSameChatWallPaper = (TLRPC.TL_messageActionSetSameChatWallPaper) messageAction;
                            TLRPC.User e26 = e2(abstractMap, hVar, Q3() ? 0L : A0());
                            ArrayList arrayList2 = new ArrayList();
                            this.n0 = arrayList2;
                            TLRPC.Document document = tL_messageActionSetSameChatWallPaper.wallpaper.document;
                            if (document != null) {
                                arrayList2.addAll(document.thumbs);
                                this.l0 = tL_messageActionSetSameChatWallPaper.wallpaper.document;
                            }
                            if (e26 != null) {
                                if (e26.id == h10.i(i11).n) {
                                    this.v = bd.Z(2131754566, new Object[0]);
                                } else {
                                    this.v = bd.Z(2131754567, e26.first_name);
                                }
                            } else if (chat10 != null) {
                                this.v = bd.L0(t3.V(chat10) ? 2131754565 : 2131754560);
                            } else if (user != null) {
                                this.v = bd.Z(2131754559, l10.i(user));
                            }
                        } else {
                            TLRPC.Chat chat11 = w02;
                            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                                this.U = 1;
                                TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageAction;
                                this.D = 22;
                                ArrayList arrayList3 = new ArrayList();
                                this.n0 = arrayList3;
                                TLRPC.Document document2 = tL_messageActionSetChatWallPaper.wallpaper.document;
                                if (document2 != null) {
                                    arrayList3.addAll(document2.thumbs);
                                    this.l0 = tL_messageActionSetChatWallPaper.wallpaper.document;
                                }
                                TLRPC.User e27 = e2(abstractMap, hVar, Q3() ? 0L : A0());
                                TLRPC.User e28 = e2(abstractMap, hVar, A0());
                                if (e27 != null) {
                                    if (e27.id != h10.i(i11).n) {
                                        SpannableString spannableString2 = new SpannableString(l10.i(e27));
                                        spannableString2.setSpan(new o31(g0.o()), 0, spannableString2.length(), 33);
                                        if (tL_messageActionSetChatWallPaper.same) {
                                            this.D = 10;
                                            this.v = bd.L0(2131754567);
                                        } else if (tL_messageActionSetChatWallPaper.for_both) {
                                            this.v = bd.L0(2131754563);
                                        } else {
                                            this.v = bd.L0(2131754564);
                                        }
                                        this.v = g0.K2(this.v, spannableString2, "%s");
                                    } else if (tL_messageActionSetChatWallPaper.same) {
                                        this.D = 10;
                                        this.v = bd.Z(2131754566, new Object[0]);
                                    } else if (!tL_messageActionSetChatWallPaper.for_both || e28 == null) {
                                        this.v = bd.L0(2131754562);
                                    } else {
                                        this.v = bd.L0(2131754561);
                                        SpannableString spannableString3 = new SpannableString(l10.i(e28));
                                        spannableString3.setSpan(new o31(g0.o()), 0, spannableString3.length(), 33);
                                        this.v = g0.K2(this.v, spannableString3, "%s");
                                    }
                                } else if (chat11 != null) {
                                    this.v = bd.L0(t3.V(chat11) ? 2131754565 : 2131754560);
                                } else if (user != null) {
                                    this.v = bd.Z(2131754559, l10.i(user));
                                }
                            } else if (messageAction instanceof TLRPC.TL_messageActionGroupCallScheduled) {
                                TLRPC.TL_messageActionGroupCallScheduled tL_messageActionGroupCallScheduled = (TLRPC.TL_messageActionGroupCallScheduled) messageAction;
                                if ((message.peer_id instanceof TLRPC.TL_peerChat) || B4()) {
                                    this.v = bd.Z(2131754619, bd.W(3, tL_messageActionGroupCallScheduled.schedule_date, false));
                                } else {
                                    this.v = bd.Z(2131754662, bd.W(3, tL_messageActionGroupCallScheduled.schedule_date, false));
                                }
                            } else if (messageAction instanceof TLRPC.TL_messageActionGroupCall) {
                                int i13 = messageAction.duration;
                                if (i13 != 0) {
                                    int i14 = i13 / 86400;
                                    if (i14 > 0) {
                                        c10 = 0;
                                        G2 = bd.G(i14, "Days", new Object[0]);
                                    } else {
                                        c10 = 0;
                                        int i15 = i13 / 3600;
                                        if (i15 > 0) {
                                            G2 = bd.G(i15, "Hours", new Object[0]);
                                        } else {
                                            int i16 = i13 / 60;
                                            G2 = i16 > 0 ? bd.G(i16, "Minutes", new Object[0]) : bd.G(i13, "Seconds", new Object[0]);
                                        }
                                    }
                                    if (!(this.k.peer_id instanceof TLRPC.TL_peerChat) && !B4()) {
                                        Object[] objArr2 = new Object[1];
                                        objArr2[c10] = G2;
                                        this.v = bd.Z(2131754664, objArr2);
                                    } else if (O3()) {
                                        Object[] objArr3 = new Object[1];
                                        objArr3[c10] = G2;
                                        this.v = bd.Z(2131754622, objArr3);
                                    } else {
                                        Object[] objArr4 = new Object[1];
                                        objArr4[c10] = G2;
                                        this.v = F5(bd.Z(2131754623, objArr4), "un1", tLObject5);
                                    }
                                } else if (!(message.peer_id instanceof TLRPC.TL_peerChat) && !B4()) {
                                    this.v = bd.L0(2131754663);
                                } else if (O3()) {
                                    this.v = bd.L0(2131754617);
                                } else {
                                    this.v = F5(bd.L0(2131754618), "un1", tLObject5);
                                }
                            } else if (messageAction instanceof TLRPC.TL_messageActionInviteToGroupCall) {
                                long j11 = messageAction.user_id;
                                if (j11 == 0 && messageAction.users.size() == 1) {
                                    j11 = this.k.action.users.get(0).longValue();
                                }
                                if (j11 != 0) {
                                    TLRPC.User e29 = e2(abstractMap, hVar, j11);
                                    if (O3()) {
                                        this.v = F5(bd.L0(2131754616), "un2", e29);
                                    } else if (j11 == h10.i(i11).e()) {
                                        this.v = F5(bd.L0(2131754620), "un1", tLObject5);
                                    } else {
                                        CharSequence F54 = F5(bd.L0(2131754621), "un2", e29);
                                        this.v = F54;
                                        this.v = F5(F54, "un1", tLObject5);
                                    }
                                } else if (O3()) {
                                    this.v = G5(bd.L0(2131754616), this.k.action.users, abstractMap, hVar);
                                } else {
                                    CharSequence G5 = G5(bd.L0(2131754621), this.k.action.users, abstractMap, hVar);
                                    this.v = G5;
                                    this.v = F5(G5, "un1", tLObject5);
                                }
                            } else if (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) {
                                TLRPC.TL_messageActionGeoProximityReached tL_messageActionGeoProximityReached = (TLRPC.TL_messageActionGeoProximityReached) messageAction;
                                long C1 = C1(tL_messageActionGeoProximityReached.from_id);
                                if (C1 > 0) {
                                    w05 = e2(abstractMap, hVar, C1);
                                } else {
                                    tL_messageActionGeoProximityReached = tL_messageActionGeoProximityReached;
                                    w05 = w0(abstractMap2, hVar2, -C1);
                                }
                                long C12 = C1(tL_messageActionGeoProximityReached.to_id);
                                long e10 = h10.i(i11).e();
                                if (C12 == e10) {
                                    this.v = F5(bd.Z(2131754503, bd.y(tL_messageActionGeoProximityReached.distance, 2, null)), "un1", w05);
                                } else {
                                    TLObject e210 = C12 > 0 ? e2(abstractMap, hVar, C12) : w0(abstractMap2, hVar2, -C12);
                                    if (C1 == e10) {
                                        this.v = F5(bd.Z(2131754502, bd.y(tL_messageActionGeoProximityReached.distance, 2, null)), "un1", e210);
                                    } else {
                                        CharSequence F55 = F5(bd.Z(2131754504, bd.y(tL_messageActionGeoProximityReached.distance, 2, null)), "un2", e210);
                                        this.v = F55;
                                        this.v = F5(F55, "un1", w05);
                                    }
                                }
                            } else if (messageAction instanceof TLRPC.TL_messageActionCustomAction) {
                                this.v = messageAction.message;
                            } else if (messageAction instanceof TLRPC.TL_messageActionChatCreate) {
                                if (O3()) {
                                    this.v = bd.L0(2131754496);
                                } else {
                                    this.v = F5(bd.L0(2131754656), "un1", tLObject5);
                                }
                            } else if (messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) {
                                if (q3()) {
                                    TLRPC.Message message3 = this.k;
                                    if (message3.action.user_id == message3.from_id.user_id) {
                                        if (O3()) {
                                            this.v = bd.L0(2131754494);
                                        } else {
                                            this.v = F5(bd.L0(2131754605), "un1", tLObject5);
                                        }
                                    }
                                }
                                TLRPC.User e211 = e2(abstractMap, hVar, this.k.action.user_id);
                                if (O3()) {
                                    this.v = F5(bd.L0(2131754495), "un2", e211);
                                } else if (this.k.action.user_id == h10.i(i11).e()) {
                                    this.v = F5(bd.L0(2131754606), "un1", tLObject5);
                                } else {
                                    CharSequence F56 = F5(bd.L0(2131754607), "un2", e211);
                                    this.v = F56;
                                    this.v = F5(F56, "un1", tLObject5);
                                }
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentRefunded) {
                                TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded = (TLRPC.TL_messageActionPaymentRefunded) messageAction;
                                long o10 = m5.o(tL_messageActionPaymentRefunded.peer);
                                TLObject e212 = o10 >= 0 ? e2(abstractMap, hVar, o10) : w0(abstractMap2, hVar2, -o10);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(tL_messageActionPaymentRefunded.currency);
                                sb3.append(" ");
                                this.v = ci.wb.T0(F5(bd.Z(2131754580, k2.p1.l(tL_messageActionPaymentRefunded.total_amount, ',', sb3)), "un1", e212));
                            } else {
                                boolean g7 = dg.d.g(messageAction, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class);
                                dg.b bVar = dg.b.b;
                                if (g7) {
                                    String h = rg.c.h(i11, m5.o(this.k.peer_id));
                                    if (h == null) {
                                        TLRPC.Chat w06 = w0(abstractMap2, hVar2, -m5.o(this.k.peer_id));
                                        if (w06 != null) {
                                            long j12 = w06.linked_monoforum_id;
                                            if (j12 != 0 && (w04 = w0(abstractMap2, hVar2, j12)) != null) {
                                                w06 = w04;
                                            }
                                        }
                                        h = m5.H(null, null, w06);
                                    }
                                    String m10 = m5.m(e2(abstractMap, hVar, m5.o(this.k.saved_peer_id)));
                                    ej s52 = s5();
                                    TLRPC.MessageAction messageAction2 = this.k.action;
                                    if (messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostRefund) {
                                        boolean z14 = ((TLRPC.TL_messageActionSuggestedPostRefund) messageAction2).payer_initiated;
                                        if (s52 == null || (aVar2 = s52.a) == null) {
                                            this.v = bd.Z(z14 ? 2131744388 : 2131744390, m10, h);
                                        } else {
                                            this.v = ci.wb.V0(bd.Z(z14 ? 2131744389 : 2131744391, m10, h, aVar2.b()), aVar2.a == bVar);
                                        }
                                    } else if (messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostSuccess) {
                                        if (s52 == null || (aVar = s52.a) == null) {
                                            this.v = bd.Z(2131744393, h);
                                        } else {
                                            this.v = ci.wb.V0(bd.Z(2131744394, h, aVar.b()), aVar.a == bVar);
                                        }
                                    }
                                } else {
                                    TLRPC.Message message4 = this.k;
                                    TLRPC.MessageAction messageAction3 = message4.action;
                                    if (messageAction3 instanceof TLRPC.TL_messageActionChatAddUser) {
                                        long j13 = messageAction3.user_id;
                                        if (j13 == 0 && messageAction3.users.size() == 1) {
                                            j13 = this.k.action.users.get(0).longValue();
                                        }
                                        if (j13 != 0) {
                                            TLRPC.User e213 = e2(abstractMap, hVar, j13);
                                            long j14 = this.k.peer_id.channel_id;
                                            TLRPC.Chat w07 = j14 != 0 ? w0(abstractMap2, hVar2, j14) : null;
                                            TLRPC.Peer peer4 = this.k.from_id;
                                            if (peer4 == null || j13 != peer4.user_id) {
                                                if (O3()) {
                                                    this.v = F5(bd.L0(2131754500), "un2", e213);
                                                } else if (j13 != h10.i(i11).e()) {
                                                    CharSequence F57 = F5(bd.L0(2131754692), "un2", e213);
                                                    this.v = F57;
                                                    this.v = F5(F57, "un1", tLObject5);
                                                } else if (this.k.peer_id.channel_id == 0) {
                                                    this.v = F5(bd.L0(2131754688), "un1", tLObject5);
                                                } else if (w07 == null || !w07.megagroup) {
                                                    this.v = F5(bd.L0(2131752522), "un1", tLObject5);
                                                } else {
                                                    this.v = F5(bd.L0(2131748654), "un1", tLObject5);
                                                }
                                            } else if (t3.T(w07) && !w07.megagroup) {
                                                this.f1 = true;
                                                this.v = bd.L0(2131752391);
                                            } else if (this.k.peer_id.channel_id != 0) {
                                                if (j13 == h10.i(i11).e()) {
                                                    this.v = bd.L0(2131752380);
                                                } else {
                                                    this.v = F5(bd.L0(2131754690), "un1", tLObject5);
                                                }
                                            } else if (O3()) {
                                                this.v = bd.L0(2131754689);
                                            } else {
                                                this.v = F5(bd.L0(2131754691), "un1", tLObject5);
                                            }
                                        } else if (O3()) {
                                            this.v = G5(bd.L0(2131754500), this.k.action.users, abstractMap, hVar);
                                        } else {
                                            CharSequence G52 = G5(bd.L0(2131754692), this.k.action.users, abstractMap, hVar);
                                            this.v = G52;
                                            this.v = F5(G52, "un1", tLObject5);
                                        }
                                    } else if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedViaCommunity) {
                                        TLRPC.Chat w08 = w0(abstractMap2, hVar2, ((TLRPC.TL_messageActionChatJoinedViaCommunity) messageAction3).community_id);
                                        boolean V2 = t3.V(w0(abstractMap2, hVar2, -m5.o(this.k.peer_id)));
                                        if (O3()) {
                                            this.v = F5(bd.L0(V2 ? 2131754608 : 2131754609), "un1", w08);
                                        } else {
                                            CharSequence F58 = F5(bd.L0(2131754610), "un1", w08);
                                            this.v = F58;
                                            this.v = F5(F58, "un2", tLObject5);
                                        }
                                    } else if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedByLink) {
                                        if (O3()) {
                                            this.v = bd.L0(2131754611);
                                        } else {
                                            this.v = F5(bd.L0(2131754613), "un1", tLObject5);
                                        }
                                    } else if (messageAction3 instanceof TLRPC.TL_messageActionGiveawayLaunch) {
                                        TLRPC.TL_messageActionGiveawayLaunch tL_messageActionGiveawayLaunch = (TLRPC.TL_messageActionGiveawayLaunch) messageAction3;
                                        TLRPC.Peer peer5 = message4.peer_id;
                                        if (peer5 != null) {
                                            long j15 = peer5.channel_id;
                                            if (j15 != 0) {
                                                chat8 = w0(abstractMap2, hVar2, j15);
                                                boolean V3 = t3.V(chat8);
                                                if ((tL_messageActionGiveawayLaunch.flags & 1) == 0) {
                                                    this.v = bd.J((int) tL_messageActionGiveawayLaunch.stars, V3 ? "BoostingStarsGiveawayJustStarted" : "BoostingStarsGiveawayJustStartedGroup", chat8 != null ? chat8.title : "");
                                                } else {
                                                    this.v = bd.Z(V3 ? 2131753430 : 2131753429, chat8 != null ? chat8.title : "");
                                                }
                                            }
                                        }
                                        chat8 = null;
                                        boolean V32 = t3.V(chat8);
                                        if ((tL_messageActionGiveawayLaunch.flags & 1) == 0) {
                                        }
                                    } else if (messageAction3 instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                                        TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction3;
                                        if (TextUtils.isEmpty(tL_messageActionWalletTonConnectRequest.dapp_name)) {
                                            this.v = bd.L0(tL_messageActionWalletTonConnectRequest.declined ? 2131743007 : tL_messageActionWalletTonConnectRequest.accepted ? 2131743004 : tL_messageActionWalletTonConnectRequest.expires <= ConnectionsManager.getInstance(i11).getCurrentTime() ? 2131743006 : 2131743005);
                                        } else {
                                            this.v = bd.Z(tL_messageActionWalletTonConnectRequest.declined ? 2131743011 : tL_messageActionWalletTonConnectRequest.accepted ? 2131743008 : tL_messageActionWalletTonConnectRequest.expires <= ConnectionsManager.getInstance(i11).getCurrentTime() ? 2131743010 : 2131743009, tL_messageActionWalletTonConnectRequest.dapp_name);
                                        }
                                    } else if (messageAction3 instanceof TLRPC.TL_messageActionBoostApply) {
                                        TLRPC.Peer peer6 = message4.peer_id;
                                        if (peer6 != null) {
                                            long j16 = peer6.channel_id;
                                            if (j16 != 0) {
                                                chat7 = w0(abstractMap2, hVar2, j16);
                                                boolean V4 = t3.V(chat7);
                                                TLRPC.TL_messageActionBoostApply tL_messageActionBoostApply = (TLRPC.TL_messageActionBoostApply) this.k.action;
                                                if (tLObject5 instanceof TLRPC.User) {
                                                    str7 = tLObject5 instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject5).title : "";
                                                    z12 = false;
                                                } else {
                                                    TLRPC.User user2 = (TLRPC.User) tLObject5;
                                                    z12 = l10.B(user2);
                                                    str7 = l10.i(user2);
                                                }
                                                if (z12) {
                                                    int i17 = tL_messageActionBoostApply.boosts;
                                                    if (i17 <= 1) {
                                                        this.v = bd.Z(V4 ? 2131753580 : 2131753568, str7);
                                                    } else {
                                                        this.v = bd.G(i17, V4 ? "BoostingBoostsChannelByUserServiceMsgCount" : "BoostingBoostsGroupByUserServiceMsgCount", str7);
                                                    }
                                                } else {
                                                    int i18 = tL_messageActionBoostApply.boosts;
                                                    if (i18 <= 1) {
                                                        this.v = bd.L0(V4 ? 2131753577 : 2131753565);
                                                    } else {
                                                        this.v = bd.G(i18, V4 ? "BoostingBoostsChannelByYouServiceMsgCount" : "BoostingBoostsGroupByYouServiceMsgCount", new Object[0]);
                                                    }
                                                }
                                            }
                                        }
                                        chat7 = null;
                                        boolean V42 = t3.V(chat7);
                                        TLRPC.TL_messageActionBoostApply tL_messageActionBoostApply2 = (TLRPC.TL_messageActionBoostApply) this.k.action;
                                        if (tLObject5 instanceof TLRPC.User) {
                                        }
                                        if (z12) {
                                        }
                                    } else if (messageAction3 instanceof TLRPC.TL_messageActionGiveawayResults) {
                                        TLRPC.Peer peer7 = message4.peer_id;
                                        if (peer7 != null) {
                                            long j17 = peer7.channel_id;
                                            if (j17 != 0) {
                                                chat6 = w0(abstractMap2, hVar2, j17);
                                                boolean V5 = t3.V(chat6);
                                                tL_messageActionGiveawayResults = (TLRPC.TL_messageActionGiveawayResults) this.k.action;
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                if (tL_messageActionGiveawayResults.stars) {
                                                    spannableStringBuilder.append((CharSequence) bd.G(tL_messageActionGiveawayResults.winners_count, "BoostingGiveawayServiceWinnersSelected", new Object[0]));
                                                    if (tL_messageActionGiveawayResults.unclaimed_count > 0) {
                                                        spannableStringBuilder.append((CharSequence) "\n");
                                                        spannableStringBuilder.append((CharSequence) bd.G(tL_messageActionGiveawayResults.unclaimed_count, V5 ? "BoostingGiveawayServiceUndistributed" : "BoostingGiveawayServiceUndistributedGroup", new Object[0]));
                                                    }
                                                } else {
                                                    spannableStringBuilder.append((CharSequence) bd.I(tL_messageActionGiveawayResults.winners_count, "BoostingStarsGiveawayServiceWinnersSelected"));
                                                    if (tL_messageActionGiveawayResults.unclaimed_count > 0) {
                                                        spannableStringBuilder.append((CharSequence) "\n");
                                                        spannableStringBuilder.append((CharSequence) bd.G(tL_messageActionGiveawayResults.unclaimed_count, V5 ? "BoostingStarsGiveawayServiceUndistributed" : "BoostingStarsGiveawayServiceUndistributedGroup", new Object[0]));
                                                    }
                                                }
                                                this.v = spannableStringBuilder;
                                            }
                                        }
                                        chat6 = null;
                                        boolean V52 = t3.V(chat6);
                                        tL_messageActionGiveawayResults = (TLRPC.TL_messageActionGiveawayResults) this.k.action;
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                        if (tL_messageActionGiveawayResults.stars) {
                                        }
                                        this.v = spannableStringBuilder2;
                                    } else if (messageAction3 instanceof TLRPC.TL_messageActionPrizeStars) {
                                        TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) messageAction3;
                                        this.v = F5(g0.X2(bd.I((int) tL_messageActionPrizeStars.stars, "ActionStarGiveawayPrize")), "un1", w0(abstractMap2, hVar2, -m5.o(tL_messageActionPrizeStars.boost_peer)));
                                    } else {
                                        if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction3;
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i10 = (int) tL_messageActionStarGift.upgrade_stars;
                                                tLObject2 = tLObject5;
                                            } else {
                                                TL_stars.StarGift starGift = tL_messageActionStarGift.gift;
                                                i10 = starGift != null ? (int) starGift.stars : 0;
                                                tLObject2 = tLObject5;
                                                if (!tL_messageActionStarGift.upgrade_separate) {
                                                    i10 += (int) tL_messageActionStarGift.upgrade_stars;
                                                }
                                            }
                                            TLRPC.Peer peer8 = tL_messageActionStarGift.peer;
                                            boolean z15 = peer8 != null && m5.o(peer8) < 0;
                                            TLRPC.User e214 = e2(abstractMap, hVar, this.k.peer_id.user_id);
                                            if (tL_messageActionStarGift.prepaid_upgrade || (peer = tL_messageActionStarGift.from_id) == null) {
                                                str3 = "";
                                                tLObject3 = tLObject2;
                                            } else {
                                                str3 = "";
                                                long o11 = m5.o(peer);
                                                tLObject3 = o11 >= 0 ? e2(abstractMap, hVar, o11) : w0(abstractMap2, hVar2, -o11);
                                            }
                                            TLRPC.Peer peer9 = tL_messageActionStarGift.peer;
                                            if (peer9 != null) {
                                                long o12 = m5.o(peer9);
                                                tLObject4 = o12 >= 0 ? e2(abstractMap, hVar, o12) : w0(abstractMap2, hVar2, -o12);
                                            } else {
                                                tLObject4 = null;
                                            }
                                            if (!tL_messageActionStarGift.prepaid_upgrade) {
                                                if (l10.A(A0()) && tL_messageActionStarGift.from_id == null) {
                                                    this.v = g0.X2(bd.L0(tL_messageActionStarGift.auction_acquired ? 2131754647 : 2131754632));
                                                    this.w = bd.L0(2131754556);
                                                } else if (z15) {
                                                    SpannableStringBuilder X2 = g0.X2(bd.I(i10, "ActionGiftChannel"));
                                                    this.v = X2;
                                                    CharSequence F59 = F5(X2, "un1", tLObject3);
                                                    this.v = F59;
                                                    this.v = F5(F59, "un2", tLObject4);
                                                    this.w = bd.L0(2131754556);
                                                } else if (l10.B(e214)) {
                                                    this.v = g0.X2(bd.L0(tL_messageActionStarGift.auction_acquired ? 2131754647 : 2131754633));
                                                    this.w = bd.L0(2131754556);
                                                } else {
                                                    boolean z16 = tLObject3 instanceof TLRPC.User;
                                                    if (z16 && ((TLRPC.User) tLObject3).self && !tL_messageActionStarGift.forceIn) {
                                                        this.v = F5(g0.X2(bd.L0(2131754642)), "un1", e214);
                                                        TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageActionStarGift.message;
                                                        if (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                                            this.w = bd.L0(2131754556);
                                                        } else {
                                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                                            a(spannableStringBuilder3, tL_messageActionStarGift.message.entities, Q3(), false, false);
                                                            this.w = spannableStringBuilder3;
                                                        }
                                                    } else if (z16 && l10.A(((TLRPC.User) tLObject3).id)) {
                                                        this.v = TextUtils.replace(g0.X2(bd.L0(2131754643)), new String[]{"un1"}, new CharSequence[]{bd.L0(2131744935)});
                                                    } else {
                                                        this.v = F5(g0.X2(bd.L0(2131754643)), "un1", tLObject3);
                                                        TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageActionStarGift.message;
                                                        if (tL_textWithEntities3 == null || TextUtils.isEmpty(tL_textWithEntities3.text)) {
                                                            this.w = bd.L0(2131754556);
                                                        } else {
                                                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                                            a(spannableStringBuilder4, tL_messageActionStarGift.message.entities, Q3(), false, false);
                                                            this.w = spannableStringBuilder4;
                                                        }
                                                    }
                                                }
                                            } else if ((tLObject3 instanceof TLRPC.User) && ((TLRPC.User) tLObject3).self && !tL_messageActionStarGift.forceIn) {
                                                this.v = F5(g0.X2(bd.L0(2131754583)), "un1", e214);
                                            } else {
                                                this.v = F5(g0.X2(bd.L0(2131754584)), "un1", tLObject3);
                                            }
                                            int indexOf = this.v.toString().indexOf("un2");
                                            if (indexOf != -1) {
                                                this.v = SpannableStringBuilder.valueOf(this.v).replace(indexOf, indexOf + 3, (CharSequence) bd.I(i10, "Gift2StarsCount"));
                                            }
                                        } else {
                                            TLObject tLObject6 = tLObject5;
                                            str3 = "";
                                            if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                                                TLRPC.User e215 = e2(abstractMap, hVar, A0());
                                                TL_stars.StarsAmount starsAmount = tL_messageActionStarGiftUnique.resale_amount;
                                                if (starsAmount != null) {
                                                    dg.a m11 = dg.a.m(starsAmount);
                                                    long A0 = A0();
                                                    TLRPC.Peer peer10 = tL_messageActionStarGiftUnique.from_id;
                                                    if (peer10 != null) {
                                                        A0 = m5.o(peer10);
                                                    }
                                                    TLObject e216 = A0 >= 0 ? e2(abstractMap, hVar, A0) : w0(abstractMap2, hVar2, -A0);
                                                    if (tL_messageActionStarGiftUnique.craft) {
                                                        this.v = g0.X2(bd.L0(2131754533));
                                                    } else {
                                                        TLRPC.Peer peer11 = tL_messageActionStarGiftUnique.peer;
                                                        if (peer11 != null) {
                                                            long o13 = m5.o(peer11);
                                                            TLObject e217 = o13 >= 0 ? e2(abstractMap, hVar, o13) : w0(abstractMap2, hVar2, -o13);
                                                            if (m11.a == bVar) {
                                                                this.v = g0.X2(bd.Z(2131754523, m11.d()));
                                                            } else {
                                                                this.v = g0.X2(bd.I((int) m11.a(), "ActionUniqueGiftResaleService"));
                                                            }
                                                            CharSequence F510 = F5(this.v, "un1", e216);
                                                            this.v = F510;
                                                            this.v = F5(F510, "un2", e217);
                                                        } else {
                                                            if (tL_messageActionStarGiftUnique.from_offer) {
                                                                if (m11.a == bVar) {
                                                                    this.v = g0.X2(bd.Z(Q3() ? 2131754519 : 2131754527, m11.d()));
                                                                } else {
                                                                    this.v = g0.X2(bd.I((int) m11.a(), Q3() ? "ActionUniqueGiftResaleSoldOutbound" : "ActionUniqueGiftResaleOutbound"));
                                                                }
                                                            } else if (m11.a == bVar) {
                                                                this.v = F5(g0.X2(bd.Z(Q3() ? 2131754527 : 2131754531, m11.d())), "un1", e216);
                                                            } else {
                                                                this.v = F5(g0.X2(bd.I((int) m11.a(), Q3() ? "ActionUniqueGiftResaleOutbound" : "ActionUniqueGiftResaleInbound")), "un1", e216);
                                                            }
                                                        }
                                                    }
                                                } else if (tL_messageActionStarGiftUnique.upgrade) {
                                                    TLRPC.Peer peer12 = tL_messageActionStarGiftUnique.peer;
                                                    if (peer12 != null) {
                                                        long o14 = m5.o(peer12);
                                                        this.v = F5(g0.X2(bd.L0(2131754511)), "un1", o14 >= 0 ? e2(abstractMap, hVar, o14) : w0(abstractMap2, hVar2, -o14));
                                                    } else if (l10.B(e215)) {
                                                        this.v = g0.X2(bd.L0(2131754509));
                                                    } else {
                                                        this.v = F5(g0.X2(bd.L0(Q3() ? 2131754510 : 2131754512)), "un1", e215);
                                                    }
                                                } else {
                                                    long A02 = A0();
                                                    TLRPC.Peer peer13 = tL_messageActionStarGiftUnique.from_id;
                                                    if (peer13 != null) {
                                                        A02 = m5.o(peer13);
                                                    }
                                                    TLObject e218 = A02 >= 0 ? e2(abstractMap, hVar, A02) : w0(abstractMap2, hVar2, -A02);
                                                    if (tL_messageActionStarGiftUnique.craft) {
                                                        this.v = g0.X2(bd.L0(2131754533));
                                                    } else {
                                                        TLRPC.Peer peer14 = tL_messageActionStarGiftUnique.peer;
                                                        if (peer14 != null) {
                                                            long o15 = m5.o(peer14);
                                                            TLObject e219 = o15 >= 0 ? e2(abstractMap, hVar, o15) : w0(abstractMap2, hVar2, -o15);
                                                            SpannableStringBuilder X22 = g0.X2(bd.L0(2131754513));
                                                            this.v = X22;
                                                            CharSequence F511 = F5(X22, "un1", e218);
                                                            this.v = F511;
                                                            this.v = F5(F511, "un2", e219);
                                                        } else if (tL_messageActionStarGiftUnique.assigned) {
                                                            StringBuilder sb4 = new StringBuilder();
                                                            sb4.append(tL_messageActionStarGiftUnique.gift.title);
                                                            sb4.append(" #");
                                                            this.v = F5(g0.X2(bd.Z(2131754514, k2.p1.l(tL_messageActionStarGiftUnique.gift.num, ',', sb4))), "un1", e218);
                                                        } else {
                                                            this.v = F5(g0.X2(bd.L0(Q3() ? 2131754515 : 2131754516)), "un1", e218);
                                                        }
                                                    }
                                                }
                                            } else if (messageAction3 instanceof TLRPC.TL_messageActionGiftStars) {
                                                boolean z17 = tLObject6 instanceof TLRPC.User;
                                                if (z17 && ((TLRPC.User) tLObject6).self) {
                                                    this.v = F5(g0.X2(bd.L0(2131754642)), "un1", e2(abstractMap, hVar, message4.peer_id.user_id));
                                                } else if (z17 && l10.A(((TLRPC.User) tLObject6).id)) {
                                                    this.v = TextUtils.replace(g0.X2(bd.L0(2131754643)), new String[]{"un1"}, new CharSequence[]{bd.L0(2131744935)});
                                                } else {
                                                    this.v = F5(g0.X2(bd.L0(2131754643)), "un1", tLObject6);
                                                }
                                                int indexOf2 = this.v.toString().indexOf("un2");
                                                if (indexOf2 != -1) {
                                                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(this.v);
                                                    r1 i19 = r1.i();
                                                    TLRPC.MessageAction messageAction4 = this.k.action;
                                                    String f10 = i19.f(messageAction4.amount, messageAction4.currency);
                                                    if ((this.k.action.flags & 1) != 0) {
                                                        f10 = String.format("%.2f", Double.valueOf(Math.pow(10.0d, -9.0d) * this.k.action.cryptoAmount)) + " " + this.k.action.cryptoCurrency + " (~ " + ((Object) f10) + ")";
                                                    }
                                                    this.v = valueOf.replace(indexOf2, indexOf2 + 3, (CharSequence) f10);
                                                }
                                            } else {
                                                TLObject tLObject7 = tLObject6;
                                                if ((messageAction3 instanceof TLRPC.TL_messageActionGiftCode) && ((TLRPC.TL_messageActionGiftCode) messageAction3).boost_peer != null) {
                                                    this.v = bd.L0(2131753310);
                                                } else if (dg.d.g(messageAction3, TLRPC.TL_messageActionGiftPremium.class, TLRPC.TL_messageActionGiftCode.class, TLRPC.TL_messageActionGiftTon.class)) {
                                                    if ((tLObject7 instanceof TLRPC.User) && ((TLRPC.User) tLObject7).self) {
                                                        this.v = F5(g0.X2(bd.L0(2131754642)), "un1", e2(abstractMap, hVar, this.k.peer_id.user_id));
                                                    } else if (this.k.action instanceof TLRPC.TL_messageActionGiftTon) {
                                                        this.v = g0.X2(bd.L0(2131754625));
                                                    } else {
                                                        this.v = F5(g0.X2(bd.L0(2131754643)), "un1", tLObject7);
                                                    }
                                                    int indexOf3 = this.v.toString().indexOf("un2");
                                                    if (indexOf3 != -1) {
                                                        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(this.v);
                                                        r1 i20 = r1.i();
                                                        TLRPC.MessageAction messageAction5 = this.k.action;
                                                        String f11 = i20.f(messageAction5.amount, messageAction5.currency);
                                                        if ((this.k.action.flags & 1) != 0) {
                                                            f11 = String.format("%.2f", Double.valueOf(Math.pow(10.0d, -9.0d) * this.k.action.cryptoAmount)) + " " + this.k.action.cryptoCurrency + " (~ " + ((Object) f11) + ")";
                                                        }
                                                        this.v = valueOf2.replace(indexOf3, indexOf3 + 3, (CharSequence) f11);
                                                    }
                                                    this.v = ci.wb.T0(this.v);
                                                } else {
                                                    TLRPC.Message message5 = this.k;
                                                    TLRPC.MessageAction messageAction6 = message5.action;
                                                    if (messageAction6 instanceof TLRPC.TL_messageActionSuggestBirthday) {
                                                        if (Q3()) {
                                                            this.v = bd.L0(2131754490);
                                                        } else {
                                                            this.v = F5(g0.X2(bd.L0(2131754550)), "un1", tLObject7);
                                                        }
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionSuggestProfilePhoto) {
                                                        TLRPC.Photo photo = messageAction6.photo;
                                                        if (photo == null || (arrayList = photo.video_sizes) == null || arrayList.isEmpty()) {
                                                            this.v = bd.L0(2131754547);
                                                        } else {
                                                            this.v = bd.L0(2131754543);
                                                        }
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionChatEditPhoto) {
                                                        TLRPC.Peer peer15 = message5.peer_id;
                                                        if (peer15 != null) {
                                                            long j18 = peer15.channel_id;
                                                            if (j18 != 0) {
                                                                chat5 = w0(abstractMap2, hVar2, j18);
                                                                if (t3.T(chat5) || chat5.megagroup) {
                                                                    if (O3()) {
                                                                        if (J4()) {
                                                                            this.v = F5(bd.L0(2131754665), "un1", tLObject7);
                                                                        } else {
                                                                            this.v = F5(bd.L0(2131754667), "un1", tLObject7);
                                                                        }
                                                                    } else if (J4()) {
                                                                        this.v = bd.L0(2131754497);
                                                                    } else {
                                                                        this.v = bd.L0(2131754499);
                                                                    }
                                                                } else if (J4()) {
                                                                    this.v = bd.L0(2131754659);
                                                                } else {
                                                                    this.v = bd.L0(2131754661);
                                                                }
                                                            }
                                                        }
                                                        chat5 = null;
                                                        if (t3.T(chat5)) {
                                                        }
                                                        if (O3()) {
                                                        }
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionChatEditTitle) {
                                                        TLRPC.Peer peer16 = message5.peer_id;
                                                        if (peer16 != null) {
                                                            long j19 = peer16.channel_id;
                                                            if (j19 != 0) {
                                                                chat4 = w0(abstractMap2, hVar2, j19);
                                                                if (!t3.T(chat4) && !chat4.megagroup) {
                                                                    this.v = bd.L0(2131754660).replace("un2", this.k.action.title);
                                                                } else if (O3()) {
                                                                    this.v = F5(bd.L0(2131754666).replace("un2", this.k.action.title), "un1", tLObject7);
                                                                } else {
                                                                    this.v = bd.L0(2131754498).replace("un2", this.k.action.title);
                                                                }
                                                            }
                                                        }
                                                        chat4 = null;
                                                        if (!t3.T(chat4)) {
                                                        }
                                                        if (O3()) {
                                                        }
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionChatDeletePhoto) {
                                                        TLRPC.Peer peer17 = message5.peer_id;
                                                        if (peer17 != null) {
                                                            long j20 = peer17.channel_id;
                                                            if (j20 != 0) {
                                                                chat3 = w0(abstractMap2, hVar2, j20);
                                                                if (!t3.T(chat3) && !chat3.megagroup) {
                                                                    this.v = bd.L0(2131754658);
                                                                } else if (O3()) {
                                                                    this.v = F5(bd.L0(2131754579), "un1", tLObject7);
                                                                } else {
                                                                    this.v = bd.L0(2131754493);
                                                                }
                                                            }
                                                        }
                                                        chat3 = null;
                                                        if (!t3.T(chat3)) {
                                                        }
                                                        if (O3()) {
                                                        }
                                                    } else if (!(messageAction6 instanceof TLRPC.TL_messageActionTTLChange)) {
                                                        String str9 = ", ";
                                                        if (messageAction6 instanceof TLRPC.TL_messageActionRequestedPeer) {
                                                            ArrayList arrayList4 = new ArrayList();
                                                            ArrayList<TLRPC.Peer> arrayList5 = ((TLRPC.TL_messageActionRequestedPeer) this.k.action).peers;
                                                            int size2 = arrayList5.size();
                                                            int i21 = 0;
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            int i24 = 0;
                                                            while (i24 < size2) {
                                                                TLRPC.Peer peer18 = arrayList5.get(i24);
                                                                int i25 = i24 + 1;
                                                                TLRPC.Peer peer19 = peer18;
                                                                ArrayList<TLRPC.Peer> arrayList6 = arrayList5;
                                                                boolean z18 = peer19 instanceof TLRPC.TL_peerUser;
                                                                if (z18) {
                                                                    z11 = z18;
                                                                    str6 = str9;
                                                                    i3 = i25;
                                                                    tLObject = hp.s1(i11).a2(Long.valueOf(peer19.user_id));
                                                                    if (tLObject == null) {
                                                                        tLObject = e2(abstractMap, hVar, peer19.user_id);
                                                                    }
                                                                } else {
                                                                    z11 = z18;
                                                                    str6 = str9;
                                                                    i3 = i25;
                                                                    if (peer19 instanceof TLRPC.TL_peerChat) {
                                                                        tLObject = hp.s1(i11).M0(Long.valueOf(peer19.chat_id));
                                                                        if (tLObject == null) {
                                                                            tLObject = w0(abstractMap2, hVar2, peer19.chat_id);
                                                                        }
                                                                    } else if (peer19 instanceof TLRPC.TL_peerChannel) {
                                                                        tLObject = hp.s1(i11).M0(Long.valueOf(peer19.channel_id));
                                                                        if (tLObject == null) {
                                                                            tLObject = w0(abstractMap2, hVar2, peer19.channel_id);
                                                                        }
                                                                    } else {
                                                                        tLObject = null;
                                                                    }
                                                                }
                                                                if (z11) {
                                                                    i21++;
                                                                } else if (peer19 instanceof TLRPC.TL_peerChat) {
                                                                    i23++;
                                                                } else {
                                                                    i22++;
                                                                }
                                                                if (tLObject != null) {
                                                                    arrayList4.add(tLObject);
                                                                }
                                                                arrayList5 = arrayList6;
                                                                i24 = i3;
                                                                str9 = str6;
                                                            }
                                                            String str10 = str9;
                                                            if (i21 > 0 && i21 != arrayList4.size()) {
                                                                this.v = bd.K0(i21, "ActionRequestedPeerUserPlural");
                                                            } else if (i22 > 0 && i22 != arrayList4.size()) {
                                                                this.v = bd.K0(i22, "ActionRequestedPeerChannelPlural");
                                                            } else if (i23 <= 0 || i23 == arrayList4.size()) {
                                                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                                                int i26 = 0;
                                                                while (i26 < arrayList4.size()) {
                                                                    spannableStringBuilder5.append(F5("un1", "un1", (TLObject) arrayList4.get(i26)));
                                                                    String str11 = str10;
                                                                    if (i26 < arrayList4.size() - 1) {
                                                                        spannableStringBuilder5.append((CharSequence) str11);
                                                                    }
                                                                    i26++;
                                                                    str10 = str11;
                                                                }
                                                                this.v = g0.K2(bd.L0(2131754578), spannableStringBuilder5, "un1");
                                                            } else {
                                                                this.v = bd.K0(i23, "ActionRequestedPeerChatPlural");
                                                            }
                                                            TLRPC.User a23 = hp.s1(i11).a2(Long.valueOf(A0()));
                                                            if (a23 == null) {
                                                                a23 = e2(abstractMap, hVar, A0());
                                                            }
                                                            this.v = F5(this.v, "un2", a23);
                                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionSetMessagesTTL) {
                                                            TLRPC.TL_messageActionSetMessagesTTL tL_messageActionSetMessagesTTL = (TLRPC.TL_messageActionSetMessagesTTL) messageAction6;
                                                            TLRPC.Peer peer20 = message5.peer_id;
                                                            if (peer20 != null) {
                                                                long j21 = peer20.channel_id;
                                                                if (j21 != 0) {
                                                                    chat2 = w0(abstractMap2, hVar2, j21);
                                                                    if (chat2 != null || chat2.megagroup) {
                                                                        j10 = tL_messageActionSetMessagesTTL.auto_setting_from;
                                                                        if (j10 == 0) {
                                                                            this.q2 = true;
                                                                            if (j10 == h10.i(i11).n) {
                                                                                this.v = g0.X2(bd.Z(2131753859, bd.c0(tL_messageActionSetMessagesTTL.period)));
                                                                            } else {
                                                                                TLObject tLObject8 = hVar != null ? (TLObject) hVar.f(tL_messageActionSetMessagesTTL.auto_setting_from) : null;
                                                                                if (tLObject8 == null && abstractMap != null) {
                                                                                    tLObject8 = (TLObject) abstractMap.get(Long.valueOf(tL_messageActionSetMessagesTTL.auto_setting_from));
                                                                                }
                                                                                if (tLObject8 == null && abstractMap2 != null) {
                                                                                    tLObject8 = (TLObject) abstractMap2.get(Long.valueOf(tL_messageActionSetMessagesTTL.auto_setting_from));
                                                                                }
                                                                                if (tLObject8 == null) {
                                                                                    tLObject8 = tL_messageActionSetMessagesTTL.auto_setting_from > 0 ? hp.s1(i11).a2(Long.valueOf(tL_messageActionSetMessagesTTL.auto_setting_from)) : hp.s1(i11).M0(Long.valueOf(-tL_messageActionSetMessagesTTL.auto_setting_from));
                                                                                }
                                                                                if (tLObject8 != null) {
                                                                                    tLObject7 = tLObject8;
                                                                                }
                                                                                this.v = F5(g0.X2(bd.Z(2131753860, bd.c0(tL_messageActionSetMessagesTTL.period))), "un1", tLObject7);
                                                                            }
                                                                        } else if (tL_messageActionSetMessagesTTL.period != 0) {
                                                                            if (O3()) {
                                                                                this.v = bd.Z(2131754537, bd.c0(tL_messageActionSetMessagesTTL.period));
                                                                            } else {
                                                                                this.v = F5(bd.Z(2131754541, bd.c0(tL_messageActionSetMessagesTTL.period)), "un1", tLObject7);
                                                                            }
                                                                        } else if (O3()) {
                                                                            this.v = bd.L0(2131754536);
                                                                        } else {
                                                                            this.v = F5(bd.L0(2131754538), "un1", tLObject7);
                                                                        }
                                                                    } else {
                                                                        int i27 = tL_messageActionSetMessagesTTL.period;
                                                                        if (i27 != 0) {
                                                                            this.v = bd.Z(2131754540, bd.c0(i27));
                                                                        } else {
                                                                            this.v = bd.L0(2131754539);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            chat2 = null;
                                                            if (chat2 != null) {
                                                            }
                                                            j10 = tL_messageActionSetMessagesTTL.auto_setting_from;
                                                            if (j10 == 0) {
                                                            }
                                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                                                            long j22 = message5.date * 1000;
                                                            if (bd.E0().p0() == null || bd.E0().C0() == null) {
                                                                str = str3;
                                                                str5 = str + this.k.date;
                                                            } else {
                                                                str5 = bd.Z(2131742793, bd.E0().C0().format(j22), bd.E0().p0().format(j22));
                                                                str = str3;
                                                            }
                                                            TLRPC.User f12 = h10.i(i11).f();
                                                            if (f12 == null) {
                                                                f12 = e2(abstractMap, hVar, this.k.peer_id.user_id);
                                                            }
                                                            String i28 = f12 != null ? l10.i(f12) : str;
                                                            TLRPC.MessageAction messageAction7 = this.k.action;
                                                            this.v = bd.Z(2131747935, i28, str5, messageAction7.title, messageAction7.address);
                                                        } else {
                                                            str = str3;
                                                            if ((messageAction6 instanceof TLRPC.TL_messageActionUserJoined) || (messageAction6 instanceof TLRPC.TL_messageActionContactSignUp)) {
                                                                this.v = bd.Z(2131748054, l10.p(user));
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                                                                this.v = bd.Z(2131748053, l10.p(user));
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageEncryptedAction) {
                                                                TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction6.encryptedAction;
                                                                if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) {
                                                                    if (O3()) {
                                                                        this.v = bd.L0(2131754534);
                                                                    } else {
                                                                        this.v = F5(bd.L0(2131754535), "un1", tLObject7);
                                                                    }
                                                                } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) {
                                                                    TLRPC.TL_decryptedMessageActionSetMessageTTL tL_decryptedMessageActionSetMessageTTL = (TLRPC.TL_decryptedMessageActionSetMessageTTL) decryptedMessageAction;
                                                                    if (tL_decryptedMessageActionSetMessageTTL.ttl_seconds != 0) {
                                                                        if (O3()) {
                                                                            this.v = bd.Z(2131748593, bd.c0(tL_decryptedMessageActionSetMessageTTL.ttl_seconds));
                                                                        } else {
                                                                            this.v = bd.Z(2131748594, l10.i(user), bd.c0(tL_decryptedMessageActionSetMessageTTL.ttl_seconds));
                                                                        }
                                                                    } else if (O3()) {
                                                                        this.v = bd.L0(2131748591);
                                                                    } else {
                                                                        this.v = bd.Z(2131748592, l10.i(user));
                                                                    }
                                                                }
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionScreenshotTaken) {
                                                                if (O3()) {
                                                                    this.v = bd.L0(2131754534);
                                                                } else {
                                                                    this.v = F5(bd.L0(2131754535), "un1", tLObject7);
                                                                }
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionCreatedBroadcastList) {
                                                                this.v = bd.L0(2131742848);
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionChannelCreate) {
                                                                TLRPC.Peer peer21 = message5.peer_id;
                                                                if (peer21 != null) {
                                                                    long j23 = peer21.channel_id;
                                                                    if (j23 != 0) {
                                                                        chat = w0(abstractMap2, hVar2, j23);
                                                                        if (t3.T(chat) || !chat.megagroup) {
                                                                            this.v = bd.L0(2131754657);
                                                                        } else {
                                                                            this.v = bd.L0(2131754655);
                                                                        }
                                                                    }
                                                                }
                                                                chat = null;
                                                                if (t3.T(chat)) {
                                                                }
                                                                this.v = bd.L0(2131754657);
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionChatMigrateTo) {
                                                                this.v = bd.L0(2131754603);
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionChannelMigrateFrom) {
                                                                this.v = bd.L0(2131754603);
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionPinMessage) {
                                                                q0(user == null ? w0(abstractMap2, hVar2, message5.peer_id.channel_id) : null, user);
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionHistoryClear) {
                                                                this.v = bd.L0(2131749302);
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionTopicCreate) {
                                                                this.v = bd.L0(2131744031);
                                                                TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = (TLRPC.TL_messageActionTopicCreate) this.k.action;
                                                                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                                                                tL_forumTopic.icon_emoji_id = tL_messageActionTopicCreate.icon_emoji_id;
                                                                tL_forumTopic.title = tL_messageActionTopicCreate.title;
                                                                tL_forumTopic.icon_color = tL_messageActionTopicCreate.icon_color;
                                                                this.w = g0.K2(bd.L0(2131744009), rg.c.j(tL_forumTopic, null, null), "%s");
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionTopicEdit) {
                                                                TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction6;
                                                                if (user != null) {
                                                                    str4 = g5.n(user.first_name, user.last_name);
                                                                } else if (chat11 != null) {
                                                                    str4 = chat11.title;
                                                                    user = chat11;
                                                                } else {
                                                                    str4 = null;
                                                                    user = null;
                                                                }
                                                                String trim = str4 != null ? str4.trim() : "DELETED";
                                                                TLRPC.MessageAction messageAction8 = this.k.action;
                                                                int i29 = messageAction8.flags;
                                                                if ((i29 & 8) > 0) {
                                                                    if (((TLRPC.TL_messageActionTopicEdit) messageAction8).hidden) {
                                                                        this.v = F5(bd.L0(2131744027), "%s", user);
                                                                        this.w = bd.L0(2131744028);
                                                                    } else {
                                                                        this.v = F5(bd.L0(2131744013), "%s", user);
                                                                        this.w = bd.L0(2131744014);
                                                                    }
                                                                } else if ((i29 & 4) <= 0) {
                                                                    int i30 = i29 & 2;
                                                                    Drawable[] drawableArr = this.g2;
                                                                    if (i30 != 0 && (i29 & 1) != 0) {
                                                                        TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                                                                        tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                                                        tL_forumTopic2.title = tL_messageActionTopicEdit.title;
                                                                        tL_forumTopic2.icon_color = rg.a.k[0];
                                                                        CharSequence j24 = rg.c.j(tL_forumTopic2, null, drawableArr);
                                                                        this.v = g0.K2(g0.K2(bd.L0(2131744037), trim, "%1$s"), j24, "%2$s");
                                                                        this.w = bd.L0(2131744019);
                                                                        this.x = g0.K2(bd.L0(2131744036), j24, "%s");
                                                                    } else if (i30 != 0) {
                                                                        TLRPC.TL_forumTopic tL_forumTopic3 = new TLRPC.TL_forumTopic();
                                                                        tL_forumTopic3.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                                                        tL_forumTopic3.title = str;
                                                                        tL_forumTopic3.icon_color = rg.a.k[0];
                                                                        CharSequence j25 = rg.c.j(tL_forumTopic3, null, drawableArr);
                                                                        this.v = g0.K2(g0.K2(bd.L0(2131744025), trim, "%1$s"), j25, "%2$s");
                                                                        this.w = bd.L0(2131744026);
                                                                        this.x = g0.K2(bd.L0(2131744024), j25, "%s");
                                                                    } else if ((i29 & 1) != 0) {
                                                                        this.v = g0.K2(g0.K2(bd.L0(2131744018), trim, "%1$s"), tL_messageActionTopicEdit.title, "%2$s");
                                                                        this.w = bd.L0(2131744019);
                                                                        this.x = g0.K2(bd.L0(2131744017), tL_messageActionTopicEdit.title, "%s");
                                                                    }
                                                                } else if (((TLRPC.TL_messageActionTopicEdit) messageAction8).closed) {
                                                                    this.v = F5(bd.L0(2131744034), "%s", user);
                                                                    this.w = bd.L0(2131744035);
                                                                } else {
                                                                    this.v = F5(bd.L0(2131744015), "%s", user);
                                                                    this.w = bd.L0(2131744016);
                                                                }
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionGameScore) {
                                                                m0(user);
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionConferenceCall) {
                                                                TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction6;
                                                                if (Q3()) {
                                                                    this.v = bd.L0(2131751826);
                                                                } else if (tL_messageActionConferenceCall.missed) {
                                                                    this.v = bd.L0(2131751830);
                                                                } else {
                                                                    this.v = bd.L0(2131751831);
                                                                }
                                                                int i31 = tL_messageActionConferenceCall.duration;
                                                                if (i31 > 0) {
                                                                    String o16 = bd.o(i31);
                                                                    String Z = bd.Z(2131752607, this.v, o16);
                                                                    this.v = Z;
                                                                    String str12 = Z.toString();
                                                                    int indexOf4 = str12.indexOf(o16);
                                                                    if (indexOf4 != -1) {
                                                                        SpannableString spannableString4 = new SpannableString(this.v);
                                                                        int length = o16.length() + indexOf4;
                                                                        if (indexOf4 > 0 && str12.charAt(indexOf4 - 1) == '(') {
                                                                            indexOf4--;
                                                                        }
                                                                        if (length < str12.length() && str12.charAt(length) == ')') {
                                                                            length++;
                                                                        }
                                                                        spannableString4.setSpan(new o31(Typeface.DEFAULT), indexOf4, length, 0);
                                                                        this.v = spannableString4;
                                                                    }
                                                                }
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionPhoneCall) {
                                                                TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction6;
                                                                boolean z19 = tL_messageActionPhoneCall.reason instanceof TLRPC.TL_phoneCallDiscardReasonMissed;
                                                                if (q3() && this.k.from_id.user_id == h10.i(i11).e()) {
                                                                    if (z19) {
                                                                        if (tL_messageActionPhoneCall.video) {
                                                                            this.v = bd.L0(2131752608);
                                                                        } else {
                                                                            this.v = bd.L0(2131752615);
                                                                        }
                                                                    } else if (tL_messageActionPhoneCall.video) {
                                                                        this.v = bd.L0(2131752609);
                                                                    } else {
                                                                        this.v = bd.L0(2131752616);
                                                                    }
                                                                } else if (z19) {
                                                                    if (tL_messageActionPhoneCall.video) {
                                                                        this.v = bd.L0(2131752610);
                                                                    } else {
                                                                        this.v = bd.L0(2131752617);
                                                                    }
                                                                } else if (tL_messageActionPhoneCall.reason instanceof TLRPC.TL_phoneCallDiscardReasonBusy) {
                                                                    if (tL_messageActionPhoneCall.video) {
                                                                        this.v = bd.L0(2131752611);
                                                                    } else {
                                                                        this.v = bd.L0(2131752618);
                                                                    }
                                                                } else if (tL_messageActionPhoneCall.video) {
                                                                    this.v = bd.L0(2131752613);
                                                                } else {
                                                                    this.v = bd.L0(2131752620);
                                                                }
                                                                int i32 = tL_messageActionPhoneCall.duration;
                                                                if (i32 > 0) {
                                                                    String o17 = bd.o(i32);
                                                                    String Z2 = bd.Z(2131752607, this.v, o17);
                                                                    this.v = Z2;
                                                                    String str13 = Z2.toString();
                                                                    int indexOf5 = str13.indexOf(o17);
                                                                    if (indexOf5 != -1) {
                                                                        SpannableString spannableString5 = new SpannableString(this.v);
                                                                        int length2 = o17.length() + indexOf5;
                                                                        if (indexOf5 > 0 && str13.charAt(indexOf5 - 1) == '(') {
                                                                            indexOf5--;
                                                                        }
                                                                        if (length2 < str13.length() && str13.charAt(length2) == ')') {
                                                                            length2++;
                                                                        }
                                                                        spannableString5.setSpan(new o31(Typeface.DEFAULT), indexOf5, length2, 0);
                                                                        this.v = spannableString5;
                                                                    }
                                                                }
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionPaymentSent) {
                                                                p0(e2(abstractMap, hVar, A0()), false);
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionPaymentSentMe) {
                                                                p0(e2(abstractMap, hVar, A0()), true);
                                                            } else {
                                                                boolean z20 = messageAction6 instanceof TLRPC.TL_messageActionBotAllowed;
                                                                if (z20) {
                                                                    TLRPC.TL_messageActionBotAllowed tL_messageActionBotAllowed = (TLRPC.TL_messageActionBotAllowed) messageAction6;
                                                                    String str14 = tL_messageActionBotAllowed.domain;
                                                                    TLRPC.BotApp botApp = tL_messageActionBotAllowed.app;
                                                                    if (tL_messageActionBotAllowed.from_request) {
                                                                        this.v = bd.L0(2131754684);
                                                                    } else if (botApp != null) {
                                                                        String str15 = botApp.title;
                                                                        if (str15 == null) {
                                                                            str15 = str;
                                                                        }
                                                                        String L04 = bd.L0(2131754685);
                                                                        int indexOf6 = L04.indexOf("%1$s");
                                                                        SpannableString spannableString6 = new SpannableString(String.format(L04, str15));
                                                                        TLRPC.User e220 = e2(abstractMap, hVar, A0());
                                                                        if (indexOf6 >= 0 && e220 != null && (n10 = l10.n(e220)) != null) {
                                                                            StringBuilder sb5 = new StringBuilder("https://");
                                                                            com.google.android.recaptcha.internal.a.s(sb5, hp.s1(i11).V2, "/", n10, "/");
                                                                            sb5.append(botApp.short_name);
                                                                            spannableString6.setSpan(new w31(sb5.toString()), indexOf6, str15.length() + indexOf6, 33);
                                                                        }
                                                                        this.v = spannableString6;
                                                                    } else {
                                                                        if (str14 == null) {
                                                                            str14 = str;
                                                                        }
                                                                        String L05 = bd.L0(2131754686);
                                                                        int indexOf7 = L05.indexOf("%1$s");
                                                                        SpannableString spannableString7 = new SpannableString(String.format(L05, str14));
                                                                        if (indexOf7 >= 0 && !TextUtils.isEmpty(str14)) {
                                                                            spannableString7.setSpan(new w31("http://".concat(str14)), indexOf7, str14.length() + indexOf7, 33);
                                                                        }
                                                                        this.v = spannableString7;
                                                                    }
                                                                } else if ((messageAction6 instanceof TLRPC.TL_messageActionAttachMenuBotAllowed) || (z20 && ((TLRPC.TL_messageActionBotAllowed) messageAction6).attach_menu)) {
                                                                    this.v = bd.L0(2131754687);
                                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionSecureValuesSent) {
                                                                    TLRPC.TL_messageActionSecureValuesSent tL_messageActionSecureValuesSent = (TLRPC.TL_messageActionSecureValuesSent) messageAction6;
                                                                    StringBuilder sb6 = new StringBuilder();
                                                                    int size3 = tL_messageActionSecureValuesSent.types.size();
                                                                    for (int i33 = 0; i33 < size3; i33++) {
                                                                        TLRPC.SecureValueType secureValueType = tL_messageActionSecureValuesSent.types.get(i33);
                                                                        if (sb6.length() > 0) {
                                                                            sb6.append(", ");
                                                                        }
                                                                        if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
                                                                            sb6.append(bd.L0(2131754674));
                                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
                                                                            sb6.append(bd.L0(2131754680));
                                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                                                            sb6.append(bd.L0(2131754683));
                                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                                                            sb6.append(bd.L0(2131754679));
                                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                                                                            sb6.append(bd.L0(2131754676));
                                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                                                            sb6.append(bd.L0(2131754681));
                                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                                                            sb6.append(bd.L0(2131754678));
                                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                                                            sb6.append(bd.L0(2131754671));
                                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                                                            sb6.append(bd.L0(2131754682));
                                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                                                            sb6.append(bd.L0(2131754673));
                                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                                                            sb6.append(bd.L0(2131754677));
                                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                                                            sb6.append(bd.L0(2131754675));
                                                                        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                                                            sb6.append(bd.L0(2131754672));
                                                                        }
                                                                    }
                                                                    TLRPC.Peer peer22 = this.k.peer_id;
                                                                    this.v = bd.Z(2131754670, l10.i(peer22 != null ? e2(abstractMap, hVar, peer22.user_id) : null), sb6.toString());
                                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionWebViewDataSent) {
                                                                    this.v = bd.Z(2131754669, ((TLRPC.TL_messageActionWebViewDataSent) messageAction6).text);
                                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionSetChatTheme) {
                                                                    TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction6).theme;
                                                                    CharSequence f13 = dg.d.f(chatTheme);
                                                                    if (f13 != null && (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift)) {
                                                                        CharSequence spannableStringBuilder6 = new SpannableStringBuilder(f13);
                                                                        dg.d.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
                                                                        f13 = spannableStringBuilder6;
                                                                    }
                                                                    String i34 = l10.i(user);
                                                                    boolean z21 = user == null && chat11 != null;
                                                                    if (z21) {
                                                                        i34 = chat11.title;
                                                                    }
                                                                    boolean B2 = l10.B(user);
                                                                    if (TextUtils.isEmpty(f13)) {
                                                                        this.v = B2 ? bd.U(2131752201, new Object[0]) : bd.U(z21 ? 2131752286 : 2131752202, i34, f13);
                                                                    } else {
                                                                        this.v = B2 ? bd.U(2131752204, f13) : bd.U(z21 ? 2131752287 : 2131752205, i34, f13);
                                                                    }
                                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionChatJoinedByRequest) {
                                                                    if (l10.B(user)) {
                                                                        this.v = t3.U(i11, this.k.peer_id.channel_id) ? bd.L0(2131746183) : bd.L0(2131746179);
                                                                    } else {
                                                                        this.v = F5(bd.L0(2131743781), "un1", tLObject7);
                                                                    }
                                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionPaidMessagesPrice) {
                                                                    TLRPC.TL_messageActionPaidMessagesPrice tL_messageActionPaidMessagesPrice = (TLRPC.TL_messageActionPaidMessagesPrice) messageAction6;
                                                                    if (t3.T(chat11) && chat11 != null && chat11.broadcast) {
                                                                        if ((tL_messageActionPaidMessagesPrice.flags & 1) != 0) {
                                                                            long j26 = tL_messageActionPaidMessagesPrice.stars;
                                                                            if (j26 > 0) {
                                                                                this.v = F5(bd.I((int) j26, "PostSuggestionsPriceUpdated"), "un1", tLObject7);
                                                                            } else {
                                                                                this.v = F5(bd.L0(2131747098), "un1", tLObject7);
                                                                            }
                                                                        } else {
                                                                            this.v = F5(bd.L0(2131747099), "un1", tLObject7);
                                                                        }
                                                                    } else if (Q3()) {
                                                                        this.v = bd.I((int) tL_messageActionPaidMessagesPrice.stars, "PaidMessagesPriceUpdatedOut");
                                                                    } else {
                                                                        this.v = F5(bd.I((int) tL_messageActionPaidMessagesPrice.stars, "PaidMessagesPriceUpdated"), "un1", tLObject7);
                                                                    }
                                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionNoPaidMessagesTokenUsed) {
                                                                    if (Q3()) {
                                                                        TLRPC.Message message6 = this.k;
                                                                        TLRPC.Peer peer23 = message6.saved_peer_id;
                                                                        this.v = F5(bd.L0(2131748190), "un1", peer23 != null ? e2(abstractMap, hVar, m5.o(peer23)) : e2(abstractMap, hVar, m5.o(message6.peer_id)));
                                                                    } else {
                                                                        this.v = F5(bd.L0(2131748191), "un1", tLObject7);
                                                                    }
                                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionPaidMessagesRefunded) {
                                                                    TLRPC.TL_messageActionPaidMessagesRefunded tL_messageActionPaidMessagesRefunded = (TLRPC.TL_messageActionPaidMessagesRefunded) messageAction6;
                                                                    if (Q3()) {
                                                                        TLRPC.Message message7 = this.k;
                                                                        TLRPC.Peer peer24 = message7.saved_peer_id;
                                                                        this.v = F5(bd.I((int) tL_messageActionPaidMessagesRefunded.stars, "PaidMessagesRefundedOut"), "un1", peer24 != null ? e2(abstractMap, hVar, m5.o(peer24)) : e2(abstractMap, hVar, m5.o(message7.peer_id)));
                                                                    } else {
                                                                        this.v = F5(bd.I((int) tL_messageActionPaidMessagesRefunded.stars, "PaidMessagesRefunded"), "un1", tLObject7);
                                                                    }
                                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionTodoCompletions) {
                                                                    TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction6;
                                                                    boolean isEmpty = tL_messageActionTodoCompletions.completed.isEmpty();
                                                                    int intValue = !tL_messageActionTodoCompletions.completed.isEmpty() ? tL_messageActionTodoCompletions.completed.get(0).intValue() : !tL_messageActionTodoCompletions.incompleted.isEmpty() ? tL_messageActionTodoCompletions.incompleted.get(0).intValue() : 0;
                                                                    zi ziVar = this.C;
                                                                    if (ziVar != null && (o1(ziVar.k) instanceof TLRPC.TL_messageMediaToDo)) {
                                                                        TLRPC.TL_messageMediaToDo tL_messageMediaToDo2 = (TLRPC.TL_messageMediaToDo) o1(this.C.k);
                                                                        for (int i35 = 0; i35 < tL_messageMediaToDo2.todo.list.size(); i35++) {
                                                                            todoItem = tL_messageMediaToDo2.todo.list.get(i35);
                                                                            if (todoItem.id == intValue) {
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    todoItem = null;
                                                                    if (todoItem != null) {
                                                                        org.telegram.ui.ActionBar.k6.P();
                                                                        Spannable g02 = g0(todoItem);
                                                                        if (Q3()) {
                                                                            this.v = bd.U(!isEmpty ? 2131744072 : 2131744068, g02);
                                                                        } else {
                                                                            this.v = F5(bd.U(!isEmpty ? 2131744073 : 2131744069, g02), "un1", tLObject7);
                                                                        }
                                                                    } else if (Q3()) {
                                                                        this.v = bd.L0(!isEmpty ? 2131744071 : 2131744067);
                                                                    } else {
                                                                        this.v = F5(bd.L0(!isEmpty ? 2131744070 : 2131744066), "un1", tLObject7);
                                                                    }
                                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                                                                    TLRPC.TL_messageActionTodoAppendTasks tL_messageActionTodoAppendTasks = (TLRPC.TL_messageActionTodoAppendTasks) messageAction6;
                                                                    if (Q3()) {
                                                                        if (tL_messageActionTodoAppendTasks.list.size() == 1) {
                                                                            this.v = bd.U(2131744108, g0(tL_messageActionTodoAppendTasks.list.get(0)));
                                                                        } else if (tL_messageActionTodoAppendTasks.list.size() == 2) {
                                                                            this.v = bd.U(2131744104, g0(tL_messageActionTodoAppendTasks.list.get(0)), g0(tL_messageActionTodoAppendTasks.list.get(1)));
                                                                        } else if (tL_messageActionTodoAppendTasks.list.size() == 3) {
                                                                            this.v = bd.U(2131744106, g0(tL_messageActionTodoAppendTasks.list.get(0)), g0(tL_messageActionTodoAppendTasks.list.get(1)), g0(tL_messageActionTodoAppendTasks.list.get(2)));
                                                                        } else if (tL_messageActionTodoAppendTasks.list.size() >= 4) {
                                                                            this.v = bd.F("TodoAddedMoreTasksOut", tL_messageActionTodoAppendTasks.list.size() - 3, g0(tL_messageActionTodoAppendTasks.list.get(0)), g0(tL_messageActionTodoAppendTasks.list.get(1)), g0(tL_messageActionTodoAppendTasks.list.get(2)));
                                                                        }
                                                                    } else if (tL_messageActionTodoAppendTasks.list.size() == 1) {
                                                                        this.v = F5(bd.U(2131744109, g0(tL_messageActionTodoAppendTasks.list.get(0))), "un1", tLObject7);
                                                                    } else if (tL_messageActionTodoAppendTasks.list.size() == 2) {
                                                                        this.v = F5(bd.U(2131744105, g0(tL_messageActionTodoAppendTasks.list.get(0)), g0(tL_messageActionTodoAppendTasks.list.get(1))), "un1", tLObject7);
                                                                    } else if (tL_messageActionTodoAppendTasks.list.size() == 3) {
                                                                        this.v = F5(bd.U(2131744107, g0(tL_messageActionTodoAppendTasks.list.get(0)), g0(tL_messageActionTodoAppendTasks.list.get(1)), g0(tL_messageActionTodoAppendTasks.list.get(2))), "un1", tLObject7);
                                                                    } else if (tL_messageActionTodoAppendTasks.list.size() >= 4) {
                                                                        this.v = F5(bd.F("TodoAddedMoreTasks", tL_messageActionTodoAppendTasks.list.size() - 3, g0(tL_messageActionTodoAppendTasks.list.get(0)), g0(tL_messageActionTodoAppendTasks.list.get(1)), g0(tL_messageActionTodoAppendTasks.list.get(2))), "un1", tLObject7);
                                                                    }
                                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                                                                    String h7 = rg.c.h(i11, m5.o(message5.peer_id));
                                                                    if (h7 == null) {
                                                                        TLRPC.Chat w09 = w0(abstractMap2, hVar2, -m5.o(this.k.peer_id));
                                                                        if (w09 != null) {
                                                                            long j27 = w09.linked_monoforum_id;
                                                                            if (j27 != 0 && (w03 = w0(abstractMap2, hVar2, j27)) != null) {
                                                                                w09 = w03;
                                                                            }
                                                                        }
                                                                        h7 = m5.H(null, null, w09);
                                                                    }
                                                                    this.v = s0(h7, m5.m(e2(abstractMap, hVar, m5.o(this.k.saved_peer_id))));
                                                                } else {
                                                                    boolean z22 = messageAction6 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer;
                                                                    dg.b bVar2 = dg.b.a;
                                                                    if (z22) {
                                                                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction6;
                                                                        dg.a m12 = dg.a.m(tL_messageActionStarGiftPurchaseOffer.price);
                                                                        StringBuilder sb7 = new StringBuilder();
                                                                        sb7.append(tL_messageActionStarGiftPurchaseOffer.gift.title);
                                                                        sb7.append(" #");
                                                                        String l10 = k2.p1.l(tL_messageActionStarGiftPurchaseOffer.gift.num, ',', sb7);
                                                                        String u10 = m5.u(e2(abstractMap, hVar, m5.o(this.k.peer_id)));
                                                                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                                                                        spannableStringBuilder7.append((CharSequence) g0.X2(bd.Z(m12.a == bVar2 ? O3() ? 2131749729 : 2131749732 : O3() ? 2131749723 : 2131749726, u10, m12.d(), l10)));
                                                                        this.v = spannableStringBuilder7;
                                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionChangeCommunity) {
                                                                        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) messageAction6;
                                                                        long o18 = m5.o(message5.peer_id);
                                                                        long o19 = m5.o(this.k.from_id);
                                                                        boolean z23 = o18 < 0 && t3.V(w0(abstractMap2, hVar2, -o18));
                                                                        boolean z24 = o18 > 0;
                                                                        String u11 = m5.u(w0(abstractMap2, hVar2, tL_messageActionChangeCommunity.community_id));
                                                                        String u12 = o19 > 0 ? m5.u(e2(abstractMap, hVar, o19)) : m5.u(w0(abstractMap2, hVar2, -o19));
                                                                        SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                                                                        spannableStringBuilder8.append((CharSequence) ji.j0.a(this, u11, u12, z23, z24));
                                                                        this.v = spannableStringBuilder8;
                                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionStarGiftPurchaseOfferDeclined) {
                                                                        TLRPC.TL_messageActionStarGiftPurchaseOfferDeclined tL_messageActionStarGiftPurchaseOfferDeclined = (TLRPC.TL_messageActionStarGiftPurchaseOfferDeclined) messageAction6;
                                                                        dg.a m13 = dg.a.m(tL_messageActionStarGiftPurchaseOfferDeclined.price);
                                                                        StringBuilder sb8 = new StringBuilder();
                                                                        sb8.append(tL_messageActionStarGiftPurchaseOfferDeclined.gift.title);
                                                                        sb8.append(" #");
                                                                        this.v = g0.X2(bd.Z(tL_messageActionStarGiftPurchaseOfferDeclined.expired ? m13.a == bVar2 ? O3() ? 2131749730 : 2131749731 : O3() ? 2131749724 : 2131749725 : m13.a == bVar2 ? O3() ? 2131749727 : 2131749728 : O3() ? 2131749721 : 2131749722, m5.u(e2(abstractMap, hVar, m5.o(this.k.peer_id))), m13.d(), k2.p1.l(tL_messageActionStarGiftPurchaseOfferDeclined.gift.num, ',', sb8)));
                                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionPollAppendAnswer) {
                                                                        TLRPC.TL_messageActionPollAppendAnswer tL_messageActionPollAppendAnswer = (TLRPC.TL_messageActionPollAppendAnswer) messageAction6;
                                                                        if (O3()) {
                                                                            this.v = bd.U(2131747187, h0(tL_messageActionPollAppendAnswer.answer.text, Q3()));
                                                                        } else {
                                                                            this.v = bd.U(2131747188, m5.u(e2(abstractMap, hVar, m5.o(this.k.from_id))), h0(tL_messageActionPollAppendAnswer.answer.text, Q3()));
                                                                        }
                                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionPollDeleteAnswer) {
                                                                        TLRPC.TL_messageActionPollDeleteAnswer tL_messageActionPollDeleteAnswer = (TLRPC.TL_messageActionPollDeleteAnswer) messageAction6;
                                                                        if (O3()) {
                                                                            this.v = bd.U(2131747170, h0(tL_messageActionPollDeleteAnswer.answer.text, Q3()));
                                                                        } else {
                                                                            this.v = bd.U(2131747171, m5.u(e2(abstractMap, hVar, m5.o(this.k.from_id))), h0(tL_messageActionPollDeleteAnswer.answer.text, Q3()));
                                                                        }
                                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionNoForwardsToggle) {
                                                                        TLRPC.TL_messageActionNoForwardsToggle tL_messageActionNoForwardsToggle = (TLRPC.TL_messageActionNoForwardsToggle) messageAction6;
                                                                        boolean z25 = tL_messageActionNoForwardsToggle.new_value;
                                                                        if (z25 == tL_messageActionNoForwardsToggle.prev_value) {
                                                                            this.v = bd.L0(z25 ? 2131751427 : 2131751426);
                                                                        } else if (O3()) {
                                                                            this.v = bd.L0(tL_messageActionNoForwardsToggle.new_value ? 2131751425 : 2131751149);
                                                                        } else {
                                                                            this.v = bd.Z(tL_messageActionNoForwardsToggle.new_value ? 2131751428 : 2131751150, m5.u(e2(abstractMap, hVar, m5.o(this.k.peer_id))));
                                                                        }
                                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                                        String u13 = m5.u(e2(abstractMap, hVar, m5.o(message5.peer_id)));
                                                                        if (((TLRPC.TL_messageActionNoForwardsRequest) messageAction6).new_value) {
                                                                            this.v = O3() ? bd.L0(2131745391) : g0.X2(bd.Z(2131745392, u13));
                                                                        } else {
                                                                            this.v = O3() ? bd.L0(2131745380) : g0.X2(bd.Z(2131745381, u13));
                                                                        }
                                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionGramTransfer) {
                                                                        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction6;
                                                                        TLRPC.User e221 = e2(abstractMap, hVar, m5.o(message5.peer_id));
                                                                        if (O3()) {
                                                                            this.v = F5(g0.X2(bd.Z(2131743219, org.telegram.ui.Wallet.k0.r(tL_messageActionGramTransfer.amount))), "un1", e221);
                                                                        } else if (l10.A(m5.o(this.k.peer_id))) {
                                                                            this.v = g0.X2(bd.Z(2131743220, org.telegram.ui.Wallet.k0.r(tL_messageActionGramTransfer.amount)));
                                                                        } else {
                                                                            this.v = F5(g0.X2(bd.Z(2131743221, org.telegram.ui.Wallet.k0.r(tL_messageActionGramTransfer.amount))), "un1", tLObject7);
                                                                        }
                                                                        if (O3()) {
                                                                            this.w = g0.X2(bd.Z(2131743218, org.telegram.ui.Wallet.k0.r(tL_messageActionGramTransfer.amount)));
                                                                        } else if (l10.A(m5.o(this.k.peer_id))) {
                                                                            this.w = g0.X2(bd.Z(2131743220, org.telegram.ui.Wallet.k0.r(tL_messageActionGramTransfer.amount)));
                                                                        } else {
                                                                            this.w = g0.X2(bd.Z(2131743221, org.telegram.ui.Wallet.k0.r(tL_messageActionGramTransfer.amount)).replace("un1", str).trim());
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (messageAction6.ttl != 0) {
                                                        if (O3()) {
                                                            this.v = bd.Z(2131748593, bd.c0(this.k.action.ttl));
                                                        } else {
                                                            this.v = bd.Z(2131748594, l10.i(user), bd.c0(this.k.action.ttl));
                                                        }
                                                    } else if (O3()) {
                                                        this.v = bd.L0(2131748591);
                                                    } else {
                                                        this.v = bd.Z(2131748592, l10.i(user));
                                                    }
                                                }
                                            }
                                        }
                                        str = str3;
                                    }
                                }
                            }
                        }
                    }
                    str = "";
                }
                if (this.v == null) {
                    this.v = str;
                }
                this.R2 = null;
                this.i3 = null;
                this.j3 = null;
            }
            user = null;
        }
        w02 = null;
        if (user == null) {
        }
        this.q2 = false;
        this.f1 = false;
        TLRPC.Message message8 = this.k;
        z10 = message8 instanceof TLRPC.TL_messageService;
        int i112 = this.I1;
        if (z10) {
        }
        if (this.v == null) {
        }
        this.R2 = null;
        this.i3 = null;
        this.j3 = null;
    }

    public final long d1() {
        long j10 = this.d;
        return j10 != 0 ? j10 : e1();
    }

    public final boolean d4() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia o12 = o1(this.k);
        if (o12 instanceof TLRPC.TL_messageMediaPoll) {
            return ((TLRPC.TL_messageMediaPoll) o12).poll.quiz;
        }
        return false;
    }

    public final boolean d5() {
        return e5(this.k);
    }

    public final long e1() {
        long j10 = this.e;
        return j10 != 0 ? j10 : this.k.grouped_id;
    }

    public final TLRPC.User e2(AbstractMap abstractMap, a0.h hVar, long j10) {
        TLRPC.User user = abstractMap != null ? (TLRPC.User) abstractMap.get(Long.valueOf(j10)) : hVar != null ? (TLRPC.User) hVar.f(j10) : null;
        return user == null ? hp.s1(this.I1).a2(Long.valueOf(j10)) : user;
    }

    public final boolean e3() {
        return f3(this.k);
    }

    public final boolean e4() {
        return (Z2() || s4() || !r4() || d3(this.k) || h3() || !z()) ? false : true;
    }

    public final void f(int i3, long j10, boolean z10) {
        TLRPC.Message message = this.k;
        if (message.reactions == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.k;
            message2.reactions.reactions_as_tags = B0(message2) == h10.i(this.I1).e();
            this.k.reactions.can_see_list = p3() || q3();
        }
        g(this.I1, this.k.reactions, i3, j10, z10);
    }

    public final int f1() {
        TLRPC.Message message = this.k;
        int i3 = message.ephemeralAnchorMsgId;
        return i3 != 0 ? i3 : message.id;
    }

    public final boolean f4() {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        zi ziVar = this.C;
        if ((ziVar == null || !(ziVar.k instanceof TLRPC.TL_messageEmpty)) && (messageReplyHeader = (message = this.k).reply_to) != null) {
            return ((messageReplyHeader.reply_to_msg_id == 0 && messageReplyHeader.reply_to_random_id == 0) || (message.flags & 8) == 0) ? false : true;
        }
        return false;
    }

    public final boolean f5() {
        return (o1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && o1(this.k).webpage != null && !TextUtils.isEmpty(o1(this.k).webpage.embed_url) && "YouTube".equals(o1(this.k).webpage.site_name);
    }

    public final void f6(boolean z10) {
        ArrayList arrayList = this.c3;
        if (arrayList == null) {
            this.g3 = null;
            E2(z10);
            return;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ArrayList arrayList2 = ((j51) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                ((l51) obj2).e(z10);
            }
        }
        this.e3 = m51.a0(this.c3);
        this.f3 = m51.b0(this.c3);
        this.g3 = m51.M(this.c3);
    }

    public final Spannable g0(TLRPC.TodoItem todoItem) {
        CharSequence h02 = h0(todoItem.title, Q3());
        if (!(h02 instanceof Spannable)) {
            h02 = new SpannableStringBuilder(h02);
        }
        Spannable spannable = (Spannable) h02;
        spannable.setSpan(new v31("task?" + todoItem.id, 0), 0, h02.length(), 33);
        return spannable;
    }

    public final boolean g4() {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        zi ziVar = this.C;
        return ((ziVar != null && (ziVar.k instanceof TLRPC.TL_messageEmpty)) || (messageReplyHeader = (message = this.k).reply_to) == null || messageReplyHeader.story_id == 0 || (message.flags & 8) == 0) ? false : true;
    }

    public final void g5() {
        if (this.n != null || this.o == null || this.t) {
            return;
        }
        this.t = true;
        org.telegram.ui.Components.g5.g(this.I1).b(this.o.longValue(), new org.telegram.ui.Components.d5() { // from class: org.telegram.messenger.pi
            @Override // org.telegram.ui.Components.d5
            public final void a(TLRPC.Document document) {
                g0.h3(new yh(4, zi.this, document));
            }
        });
    }

    public final int h2() {
        String str;
        Integer num = this.i3;
        if (num != null) {
            return num.intValue();
        }
        if (!M4(this.k)) {
            this.i3 = -1;
            return -1;
        }
        TLRPC.MessageMedia n12 = n1(this);
        int i3 = n12.video_timestamp;
        if (i3 != 0) {
            return i3;
        }
        TLRPC.WebPage webPage = n12.webpage;
        if (webPage != null && (str = webPage.url) != null) {
            try {
                int V = LaunchActivity.V(Uri.parse(str));
                this.i3 = Integer.valueOf(V);
                return V;
            } catch (Exception unused) {
            }
        }
        this.i3 = -1;
        return -1;
    }

    public final boolean h3() {
        int i3 = this.D;
        return (i3 == 23 || i3 == 24) && (this.k.media.storyItem instanceof TL_stories.TL_storyItemDeleted);
    }

    public final boolean h4() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        return i4() && (message = this.k) != null && (messageMedia = message.media) != null && messageMedia.ttl_seconds == Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e9, code lost:
    
        if (r4.translatedRichMessage == null) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h6(boolean z10) {
        zi ziVar = this.C;
        boolean z11 = (ziVar == null || ziVar == this || !ziVar.h6(z10)) ? false : true;
        x00 x00Var = hp.s1(this.I1).s7;
        TLRPC.Message message = this.k;
        TLRPC.TL_textWithEntities tL_textWithEntities = message != null ? message.voiceTranscriptionOpen ? message.translatedVoiceTranscription : message.translatedText : null;
        TLRPC.TL_textWithEntities tL_textWithEntities2 = (message == null || !message.summarizedOpen) ? null : message.summaryText;
        TLRPC.TL_textWithEntities tL_textWithEntities3 = (message == null || !message.summarizedOpen) ? null : message.translatedSummaryText;
        if (tL_textWithEntities3 == null || message == null || !message.summarizedOpen || !x00.x(this) || !x00.y(this) || !x00Var.B(B0(this.k)) || x00Var.z(B0(this.k)) || !TextUtils.equals(x00Var.m(B0(this.k)), this.k.translatedSummaryLanguage)) {
            TLRPC.Message message2 = this.k;
            if (message2 == null || !message2.summarizedOpen || !x00.x(this) || tL_textWithEntities2 == null) {
                if (this.k != null && x00.y(this) && x00Var.B(B0(this.k)) && !x00Var.z(B0(this.k))) {
                    if (tL_textWithEntities == null) {
                        TLRPC.Message message3 = this.k;
                        if (message3.translatedPoll == null) {
                        }
                    }
                    if (TextUtils.equals(x00Var.m(B0(this.k)), this.k.translatedToLanguage)) {
                        if (!this.J2 || this.K2) {
                            this.J2 = true;
                            this.K2 = false;
                            if (this.D == 36) {
                                n0(null);
                                return true;
                            }
                            if (tL_textWithEntities != null) {
                                k(tL_textWithEntities.text);
                                k0();
                            }
                            return true;
                        }
                    }
                }
                TLRPC.Message message4 = this.k;
                if (message4 != null && (z10 || this.J2 || this.K2)) {
                    this.J2 = false;
                    this.K2 = false;
                    if (this.D == 36) {
                        n0(null);
                        return true;
                    }
                    k(message4.message);
                    k0();
                    return true;
                }
            } else if (!this.K2 || this.J2) {
                this.K2 = true;
                this.J2 = false;
                k(tL_textWithEntities2.text);
                k0();
                return true;
            }
        } else if (!this.K2 || !this.J2) {
            this.K2 = true;
            this.J2 = true;
            k(tL_textWithEntities3.text);
            k0();
            return true;
        }
        return z11;
    }

    public final boolean i() {
        TLRPC.Peer peer;
        if (!az.T0) {
            return false;
        }
        TLRPC.Message message = this.k;
        if (message != null && (peer = message.peer_id) != null && (peer.channel_id != 0 || peer.chat_id != 0)) {
            hp s12 = hp.s1(this.I1);
            TLRPC.Peer peer2 = this.k.peer_id;
            long j10 = peer2.channel_id;
            if (j10 == 0) {
                j10 = peer2.chat_id;
            }
            TLRPC.Chat M0 = s12.M0(Long.valueOf(j10));
            if ((M0 == null || !M0.gigagroup) && M0 != null && ((t3.C(M0.banned_rights, 8) || t3.C(M0.default_banned_rights, 8)) && !t3.N(M0))) {
                return false;
            }
        }
        return true;
    }

    public final TLRPC.InputStickerSet i1() {
        return k1(this.k);
    }

    public final boolean i3() {
        if (f1() < 0 || s4()) {
            return false;
        }
        int i3 = this.D;
        return i3 == 0 || i3 == 2 || i3 == 1 || i3 == 3 || i3 == 8 || i3 == 9;
    }

    public final boolean i4() {
        if (this.S == 0) {
            this.S = (this.D == 5 || k4(this.k)) ? 1 : 2;
        }
        return this.S == 1;
    }

    public final void i5() {
        TLRPC.TL_messageReactions tL_messageReactions = this.k.reactions;
        if (tL_messageReactions == null || tL_messageReactions.recent_reactions == null) {
            return;
        }
        boolean z10 = false;
        for (int i3 = 0; i3 < this.k.reactions.recent_reactions.size(); i3++) {
            if (this.k.reactions.recent_reactions.get(i3).unread) {
                this.k.reactions.recent_reactions.get(i3).unread = false;
                z10 = true;
            }
        }
        if (z10) {
            int i10 = this.I1;
            qr a02 = qr.a0(i10);
            TLRPC.Message message = this.k;
            a02.I(new qq(a02, message.dialog_id, c2(i10, message, false, false), this.k.id, 6));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r9.k.send_state == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r9.k.id >= 0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        boolean z10;
        boolean T5;
        o0();
        V5();
        if (!(this.k.send_state != 0 ? false : !O0().isEmpty())) {
            if (this.T == 0) {
                TLRPC.Message message = this.k;
                if (!(message instanceof TLRPC.TL_message_old)) {
                    if (!(message instanceof TLRPC.TL_message_old2)) {
                        if (!(message instanceof TLRPC.TL_message_old3)) {
                            if (!(message instanceof TLRPC.TL_message_old4)) {
                                if (!(message instanceof TLRPC.TL_messageForwarded_old)) {
                                    if (!(message instanceof TLRPC.TL_messageForwarded_old2)) {
                                        if (!(message instanceof TLRPC.TL_message_secret)) {
                                            if (!(o1(message) instanceof TLRPC.TL_messageMediaInvoice)) {
                                                if (O3()) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            z10 = true;
            if (z10) {
                e(Q3(), this.v, true, true, false);
            }
            if (f5()) {
                m();
            } else {
                h(Q3(), this.v, false, 3, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
            }
            if (!(this.v instanceof Spannable)) {
                this.v = new SpannableStringBuilder(this.v);
            }
            c(this.v, false, z10);
            T5 = T5();
            this.M2 = T5;
            if (T5) {
                return;
            }
            z5(this.v);
            return;
        }
        z10 = false;
        if (z10) {
        }
        if (f5()) {
        }
        if (!(this.v instanceof Spannable)) {
        }
        c(this.v, false, z10);
        T5 = T5();
        this.M2 = T5;
        if (T5) {
        }
    }

    public final CharSequence j2() {
        String str;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message = this.k;
        if (message == null || (str = message.voiceTranscription) == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            String str2 = (!this.J2 || (tL_textWithEntities = this.k.translatedVoiceTranscription) == null) ? this.k.voiceTranscription : tL_textWithEntities.text;
            return !TextUtils.isEmpty(str2) ? i6.m(str2, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), false, null, 0) : str2;
        }
        SpannableString spannableString = new SpannableString(bd.M0(2131748136, null));
        spannableString.setSpan(new gi.t9(1), 0, spannableString.length(), 33);
        return spannableString;
    }

    public final boolean j3() {
        return this.a != 0;
    }

    public final void j5() {
        int i3;
        TLRPC.TL_messageReactions tL_messageReactions;
        CharSequence m10;
        TLRPC.SuggestedPost suggestedPost;
        TLRPC.Message message;
        if (this.E0) {
            return;
        }
        this.v0 = 0;
        this.o2 = null;
        ArrayList arrayList = new ArrayList();
        boolean T5 = T5();
        this.L2 = T5;
        if (!T5 && (message = this.k) != null) {
            TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = (TLRPC.TL_replyInlineMarkup) replyMarkup;
                if (tL_replyInlineMarkup.rows != null) {
                    for (int i10 = 0; i10 < tL_replyInlineMarkup.rows.size(); i10++) {
                        ArrayList<TL_keyboard.KeyboardInlineButton> arrayList2 = tL_replyInlineMarkup.rows.get(i10).buttons;
                        n2[] n2VarArr = new n2[arrayList2.size()];
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            n2VarArr[i11] = new n2(arrayList2.get(i11));
                        }
                        arrayList.add(n2VarArr);
                    }
                }
            }
        }
        TLRPC.Message message2 = this.k;
        boolean z10 = (message2 == null || (suggestedPost = message2.suggested_post) == null || suggestedPost.rejected || suggestedPost.accepted || o4() || p4()) ? false : true;
        if (z10) {
            long e10 = h10.i(this.I1).e();
            long o10 = m5.o(this.k.saved_peer_id);
            long o11 = m5.o(this.k.from_id);
            boolean z11 = e10 == o10;
            boolean z12 = o10 == o11;
            if ((z11 && z12) || (!z11 && !z12)) {
                z10 = false;
            }
        }
        if (z10) {
            i3 = !arrayList.isEmpty() ? 1 << (arrayList.size() - 1) : 0;
            arrayList.add(new m2[]{new o2(1, 2131747096, R.drawable.filled_bot_decline_24), new o2(2, 2131747097, R.drawable.filled_bot_approve_24)});
            arrayList.add(new m2[]{new o2(3, 2131747095, R.drawable.filled_bot_suggest_24)});
        } else {
            i3 = 0;
        }
        if (!arrayList.isEmpty()) {
            this.o2 = new e5.u((m2[][]) arrayList.toArray(new m2[arrayList.size()][]), i3, 13);
        }
        e5.u uVar = this.o2;
        if ((uVar != null && !q2()) || ((tL_messageReactions = this.k.reactions) != null && !tL_messageReactions.results.isEmpty())) {
            org.telegram.ui.ActionBar.k6.Q();
            StringBuilder sb2 = this.D0;
            if (sb2 == null) {
                this.D0 = new StringBuilder();
            } else {
                sb2.setLength(0);
            }
        }
        if (uVar != null) {
            m2[][] m2VarArr = (m2[][]) uVar.c;
            if (q2()) {
                return;
            }
            for (int i12 = 0; i12 < m2VarArr.length; i12++) {
                int length = m2VarArr[i12].length;
                int i13 = 0;
                for (int i14 = 0; i14 < length; i14++) {
                    m2 m2Var = m2VarArr[i12][i14];
                    StringBuilder sb3 = this.D0;
                    sb3.append(i12);
                    sb3.append(i14);
                    if ((m2Var instanceof n2) && dg.c.c(((n2) m2Var).a, TL_keyboard.TL_inlineButtonTypeBuy.class) && (o1(this.k).flags & 4) != 0) {
                        m10 = bd.M0(2131747390, null);
                    } else {
                        String d = m2Var.d();
                        if (d == null) {
                            d = "";
                        }
                        m10 = i6.m(d, org.telegram.ui.ActionBar.k6.w2.getFontMetricsInt(), false, null, 0);
                    }
                    StaticLayout staticLayout = new StaticLayout(m10, org.telegram.ui.ActionBar.k6.w2, g0.L(2000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    if (staticLayout.getLineCount() > 0) {
                        float lineWidth = staticLayout.getLineWidth(0);
                        float lineLeft = staticLayout.getLineLeft(0);
                        if (lineLeft < lineWidth) {
                            lineWidth -= lineLeft;
                        }
                        if (m2Var.c() != 0) {
                            lineWidth += g0.L(36.0f);
                        }
                        if (m2Var.b() != 0) {
                            lineWidth += g0.L(36.0f);
                        }
                        i13 = k5.b(4.0f, (int) Math.ceil(lineWidth), i13);
                    }
                }
                this.v0 = Math.max(this.v0, ((length - 1) * g0.L(5.0f)) + ((g0.L(12.0f) + i13) * length));
            }
        }
    }

    public final void k(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        TLRPC.User a22 = q3() ? hp.s1(this.I1).a2(Long.valueOf(this.k.from_id.user_id)) : null;
        this.v = charSequence;
        ArrayList O0 = O0();
        TextPaint textPaint = o1(this.k) instanceof TLRPC.TL_messageMediaGame ? org.telegram.ui.ActionBar.k6.x2 : org.telegram.ui.ActionBar.k6.o2;
        int[] iArr = i() ? new int[1] : null;
        CharSequence m10 = i6.m(this.v, textPaint.getFontMetricsInt(), false, iArr, 0);
        this.v = m10;
        Spannable C5 = C5(m10, O0, textPaint.getFontMetricsInt(), false);
        this.v = C5;
        if (iArr != null && iArr[0] > 1) {
            E5(C5, iArr);
        }
        H(iArr);
        n0(a22);
        M5();
    }

    public final void k0() {
        boolean z10;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        TL_stories.StoryItem storyItem;
        boolean z11;
        if (i4()) {
            return;
        }
        boolean T5 = T5();
        if (this.z != null) {
            if (this.J2) {
                TLRPC.Message message = this.k;
                if (message.translatedText != null || (this.K2 && message.translatedSummaryText != null)) {
                    z11 = true;
                    if (z11 == this.N2 && this.K2 == this.P2 && T5 == this.O2) {
                        return;
                    }
                }
            }
            z11 = false;
            if (z11 == this.N2) {
                return;
            }
        }
        this.O2 = T5;
        TLRPC.Message message2 = this.k;
        String str = message2.message;
        ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
        if (this.D == 23) {
            TLRPC.MessageMedia messageMedia = message2.media;
            if (messageMedia != null && (storyItem = messageMedia.storyItem) != null) {
                str = storyItem.caption;
                arrayList = storyItem.entities;
                z10 = true;
                TLRPC.Message message3 = this.k;
                tL_textWithEntities = message3.translatedSummaryText;
                if (tL_textWithEntities == null && this.K2 && this.J2) {
                    this.P2 = true;
                    this.N2 = true;
                    str = tL_textWithEntities.text;
                    arrayList = tL_textWithEntities.entities;
                } else {
                    tL_textWithEntities2 = message3.summaryText;
                    if (tL_textWithEntities2 == null && this.K2) {
                        this.P2 = true;
                        this.N2 = false;
                        str = tL_textWithEntities2.text;
                        arrayList = tL_textWithEntities2.entities;
                    } else {
                        tL_textWithEntities3 = message3.translatedText;
                        if (tL_textWithEntities3 == null && this.J2) {
                            this.P2 = false;
                            this.N2 = true;
                            str = tL_textWithEntities3.text;
                            arrayList = tL_textWithEntities3.entities;
                        } else {
                            this.P2 = false;
                            this.N2 = false;
                        }
                    }
                }
                if (!G3() || (o1(this.k) instanceof TLRPC.TL_messageMediaGame) || TextUtils.isEmpty(str)) {
                    return;
                }
                CharSequence m10 = i6.m(str, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), false, null, 0);
                this.z = m10;
                this.z = C5(m10, arrayList, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), false);
                boolean z12 = z10 || (!(this.k.send_state != 0 ? false : arrayList.isEmpty() ^ true) && (this.T != 0 || (o1(this.k) instanceof TLRPC.TL_messageMediaPhoto_old) || (o1(this.k) instanceof TLRPC.TL_messageMediaPhoto_layer68) || (o1(this.k) instanceof TLRPC.TL_messageMediaPhoto_layer74) || (o1(this.k) instanceof TLRPC.TL_messageMediaDocument_old) || (o1(this.k) instanceof TLRPC.TL_messageMediaDocument_layer68) || (o1(this.k) instanceof TLRPC.TL_messageMediaDocument_layer74) || ((O3() && this.k.send_state != 0) || this.k.id < 0)));
                if (z12) {
                    if (M(this.z)) {
                        try {
                            g0.c((Spannable) this.z, 5, false, true);
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    h(Q3(), this.z, true, 0, 0, true);
                }
                c(this.z, false, z12);
                this.z = org.telegram.ui.Components.vz.a(this.z, true);
                if (M4(this.k)) {
                    h(Q3(), this.z, true, 3, (int) L0(), false);
                } else if (J3() || S4(this.k)) {
                    h(Q3(), this.z, true, 4, (int) L0(), false);
                }
                n(this.z);
                if (this.O2) {
                    z5(this.z);
                    return;
                }
                return;
            }
            arrayList = new ArrayList<>();
            str = "";
        } else if (q2()) {
            TLRPC.Message message4 = this.k;
            str = message4.media.description;
            message4.message = str;
        }
        z10 = false;
        TLRPC.Message message32 = this.k;
        tL_textWithEntities = message32.translatedSummaryText;
        if (tL_textWithEntities == null) {
        }
        tL_textWithEntities2 = message32.summaryText;
        if (tL_textWithEntities2 == null) {
        }
        tL_textWithEntities3 = message32.translatedText;
        if (tL_textWithEntities3 == null) {
        }
        this.P2 = false;
        this.N2 = false;
        if (G3()) {
        }
    }

    public final boolean k3() {
        return m3(this.k);
    }

    public final boolean k5() {
        l51 l51Var;
        return (!E2(true) || (l51Var = this.e3) == null) ? this.x0 : l51Var.b();
    }

    public final void l(int i3, String str) {
        TLRPC.Message message = this.k;
        if (message == null) {
            return;
        }
        if (i3 != 0) {
            message.flags |= TLObject.FLAG_30;
            message.quick_reply_shortcut_id = i3;
            TLRPC.TL_inputQuickReplyShortcutId tL_inputQuickReplyShortcutId = new TLRPC.TL_inputQuickReplyShortcutId();
            tL_inputQuickReplyShortcutId.shortcut_id = i3;
            this.k.quick_reply_shortcut = tL_inputQuickReplyShortcutId;
            return;
        }
        if (str != null) {
            TLRPC.TL_inputQuickReplyShortcut tL_inputQuickReplyShortcut = new TLRPC.TL_inputQuickReplyShortcut();
            tL_inputQuickReplyShortcut.shortcut = str;
            this.k.quick_reply_shortcut = tL_inputQuickReplyShortcut;
        } else {
            message.flags &= -1073741825;
            message.quick_reply_shortcut_id = 0;
            message.quick_reply_shortcut = null;
        }
    }

    public final void l0() {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.PollResults pollResults;
        if (this.D != 17) {
            return;
        }
        TLRPC.MessageMedia o12 = o1(this.k);
        if (!(o12 instanceof TLRPC.TL_messageMediaPoll) || (pollResults = ((TLRPC.TL_messageMediaPoll) o12).results) == null) {
            str = null;
            arrayList = null;
        } else {
            str = pollResults.solution;
            arrayList = pollResults.solution_entities;
        }
        if (str == null) {
            this.A = null;
            return;
        }
        CharSequence m10 = i6.m(str, org.telegram.ui.ActionBar.k6.b3.getFontMetricsInt(), false, null, 0);
        this.A = m10;
        Spannable C5 = C5(m10, arrayList, org.telegram.ui.ActionBar.k6.b3.getFontMetricsInt(), false);
        this.A = C5;
        b(C5, arrayList, Q3(), true, false, false, 0);
    }

    public final int l1() {
        cv cvVar = this.w2;
        if (cvVar == null) {
            return this.s2;
        }
        ArrayList arrayList = cvVar.h;
        ArrayList arrayList2 = cvVar.g;
        if (arrayList2.isEmpty() || cvVar.d || cvVar.I()) {
            return cvVar.C;
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (((tt) obj).b >= arrayList2.size() - 1) {
                    return cvVar.C;
                }
            }
        }
        xt xtVar = (xt) k2.p1.h(1, arrayList2);
        return xtVar.v() ? cvVar.C : xtVar.J();
    }

    public final boolean l3() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Message message = this.k;
        TLRPC.Peer peer = message.from_id;
        if (!(peer instanceof TLRPC.TL_peerChannel) || (messageFwdHeader = message.fwd_from) == null || messageFwdHeader.channel_post == 0) {
            return false;
        }
        TLRPC.Peer peer2 = messageFwdHeader.saved_from_peer;
        return (peer2 instanceof TLRPC.TL_peerChannel) && peer.channel_id == peer2.channel_id;
    }

    public final boolean l4() {
        TLRPC.Peer peer;
        TLRPC.MessageFwdHeader messageFwdHeader = this.k.fwd_from;
        if (messageFwdHeader == null || (peer = messageFwdHeader.saved_from_peer) == null || peer.channel_id == 0) {
            return false;
        }
        return t3.n0(hp.s1(this.I1).M0(Long.valueOf(this.k.fwd_from.saved_from_peer.channel_id)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r0.signature_profiles != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (B0(r9.k) == 489000) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean l5() {
        boolean z10;
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (this.D != 27) {
            if (!this.h2 && !this.l2 && !this.j2 && this.k2 == null && this.n2 == 0) {
                if (B0(this.k) < 0) {
                    TLRPC.Chat M0 = hp.s1(this.I1).M0(Long.valueOf(-B0(this.k)));
                    if (!d3(this.k) || !t3.V(M0)) {
                        if (M0 != null) {
                        }
                        z10 = false;
                    }
                }
                if (s4() || (!q3() && !p3() && !z10 && this.T == 0 && ((messageFwdHeader = this.k.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
                }
            }
            return true;
        }
        return false;
    }

    public final void m() {
        n(this.v);
    }

    public final void m0(TLRPC.User user) {
        int i3 = this.I1;
        if (user == null && q3()) {
            user = hp.s1(i3).a2(Long.valueOf(this.k.from_id.user_id));
        }
        zi ziVar = this.C;
        TLRPC.TL_game tL_game = (ziVar == null || n1(ziVar) == null || n1(this.C).game == null) ? null : n1(this.C).game;
        if (tL_game == null) {
            if (user == null || user.id != h10.i(i3).e()) {
                this.v = F5(bd.a0("ActionUserScored", null, 2131754506, bd.G(this.k.action.score, "Points", new Object[0])), "un1", user);
                return;
            } else {
                this.v = bd.a0("ActionYouScored", null, 2131754492, bd.G(this.k.action.score, "Points", new Object[0]));
                return;
            }
        }
        if (user == null || user.id != h10.i(i3).e()) {
            this.v = F5(bd.a0("ActionUserScoredInGame", null, 2131754505, bd.G(this.k.action.score, "Points", new Object[0])), "un1", user);
        } else {
            this.v = bd.a0("ActionYouScoredInGame", null, 2131754491, bd.G(this.k.action.score, "Points", new Object[0]));
        }
        this.v = F5(this.v, "un2", tL_game);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m1() {
        int L;
        Uri parse;
        String lastPathSegment;
        int L2;
        int L3;
        int L4;
        if (!g0.Q1() || this.T == 0) {
            this.R1 = B1();
        } else {
            this.R1 = g0.L(530.0f);
        }
        this.S1 = g0.p;
        TextPaint textPaint = org.telegram.ui.ActionBar.k6.o2;
        this.U1 = textPaint != null ? textPaint.getTextSize() : 0.0f;
        boolean Q2 = Q2();
        this.T1 = Q2;
        boolean z10 = Q2 && !Q3();
        int L5 = this.S2 ? g0.L(71.0f) : 0;
        if (this.A2 && !this.l2) {
            L = this.R1 - g0.L(60.0f);
            if (z10) {
                L = k5.z(32.0f, this.R1, L5);
            } else {
                if (this.S2) {
                    L4 = g0.L(64.0f);
                } else if (m5() && !Q3() && !this.k.isThreadMessage) {
                    L4 = g0.L(52.0f);
                }
                L -= L4;
            }
        } else if ((o1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && o1(this.k).webpage != null && "telegram_background".equals(o1(this.k).webpage.type)) {
            try {
                parse = Uri.parse(o1(this.k).webpage.url);
                lastPathSegment = parse.getLastPathSegment();
            } catch (Exception unused) {
            }
            if (parse.getQueryParameter("bg_color") != null) {
                L = g0.L(220.0f);
            } else {
                if (lastPathSegment.length() == 6 || (lastPathSegment.length() == 13 && lastPathSegment.charAt(6) == '-')) {
                    L = g0.L(200.0f);
                }
                L = 0;
            }
        } else {
            if (o1(this.k) != null && o1(this.k).webpage != null && !o1(this.k).webpage.attributes.isEmpty()) {
                int size = o1(this.k).webpage.attributes.size();
                loop0: for (int i3 = 0; i3 < size; i3++) {
                    TLRPC.WebPageAttribute webPageAttribute = o1(this.k).webpage.attributes.get(i3);
                    if (webPageAttribute instanceof TLRPC.TL_webPageAttributeTheme) {
                        TLRPC.TL_webPageAttributeTheme tL_webPageAttributeTheme = (TLRPC.TL_webPageAttributeTheme) webPageAttribute;
                        ArrayList<TLRPC.Document> arrayList = tL_webPageAttributeTheme.documents;
                        int size2 = arrayList.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size2) {
                                if ("application/x-tgtheme-android".equals(arrayList.get(i10).mime_type)) {
                                    break loop0;
                                }
                                i10++;
                            } else if (tL_webPageAttributeTheme.settings != null) {
                            }
                        }
                        L = g0.L(200.0f);
                        break;
                    }
                }
            }
            L = 0;
        }
        if (L == 0 && z10) {
            L = k5.z(32.0f, this.R1, L5);
            if (o1(this.k) instanceof TLRPC.TL_messageMediaGame) {
                L3 = g0.L(10.0f);
                L -= L3;
            }
        } else if (L == 0) {
            boolean m52 = m5();
            L = this.R1 - g0.L(this.D == 36 ? 40.0f : 80.0f);
            if (this.S2) {
                L2 = g0.L(this.D == 36 ? 75.0f : 64.0f);
            } else {
                if (m52 && !Q3() && !this.k.isThreadMessage) {
                    L2 = g0.L(52.0f);
                }
                if (p5() && (this.l2 || !Q3())) {
                    L -= g0.L((this.l2 || !Q3()) ? 14.0f : 40.0f);
                }
                if (o1(this.k) instanceof TLRPC.TL_messageMediaGame) {
                    L3 = g0.L(10.0f);
                    L -= L3;
                }
            }
            L -= L2;
            if (p5()) {
                L -= g0.L((this.l2 || !Q3()) ? 14.0f : 40.0f);
            }
            if (o1(this.k) instanceof TLRPC.TL_messageMediaGame) {
            }
        }
        int i11 = this.N1;
        if (i11 < 1) {
            return L;
        }
        int i12 = this.P1;
        if (i12 <= 100) {
            return i11 - i12 < (az.o() < 2 ? 50 : 100) ? (C2() || m3(this.k)) ? Math.min(L, (int) (this.R1 * 0.65f)) : L : L;
        }
        return L;
    }

    public final ArrayList m2() {
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        ArrayList arrayList = new ArrayList();
        if (o1(this.k) != null && o1(this.k).webpage != null && (page = (webPage = o1(this.k).webpage).cached_page) != null) {
            ArrayList<TL_iv.PageBlock> arrayList2 = page.blocks;
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                TL_iv.PageBlock pageBlock = arrayList2.get(i3);
                if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                    for (int i10 = 0; i10 < pageblockslideshow.items.size(); i10++) {
                        arrayList.add(s1(webPage, pageblockslideshow.items.get(i10)));
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                    TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                    for (int i11 = 0; i11 < pageblockcollage.items.size(); i11++) {
                        arrayList.add(s1(webPage, pageblockcollage.items.get(i11)));
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean m4() {
        int i3;
        TLRPC.Message message = this.k;
        return message instanceof TLRPC.TL_message_secret ? (((o1(message) instanceof TLRPC.TL_messageMediaPhoto) || u3(this.k)) && (i3 = this.k.ttl) > 0 && i3 <= 60) || S4(this.k) || i4() || M4(this.k) : (message instanceof TLRPC.TL_message) && o1(message) != null && o1(this.k).ttl_seconds != 0 && ((o1(this.k) instanceof TLRPC.TL_messageMediaPhoto) || (o1(this.k) instanceof TLRPC.TL_messageMediaDocument));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r0.signature_profiles != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        if (r6.megagroup != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        if (r2.chat_id != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b8, code lost:
    
        if (r6.megagroup != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00be, code lost:
    
        if (q3() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006a, code lost:
    
        if (B0(r10.k) == 489000) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5() {
        TLRPC.Message message;
        boolean z10;
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (!this.h2 && !this.l2 && !this.j2 && this.k2 == null && (((message = this.k) == null || message.guestchat_via_from == null) && this.n2 == 0)) {
            long B0 = B0(message);
            int i3 = this.I1;
            if (B0 < 0) {
                TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-B0(this.k)));
                if (!d3(this.k) || !t3.V(M0)) {
                    if (M0 != null) {
                    }
                    z10 = false;
                }
                return false;
            }
            if (!s4()) {
                if (B0(this.k) != h10.i(i3).n) {
                    TLRPC.Peer peer = this.k.peer_id;
                    TLRPC.Chat chat = null;
                    if (peer != null) {
                        long j10 = peer.channel_id;
                        if (j10 != 0) {
                            chat = w0(null, null, j10);
                        }
                    }
                    if (t3.T(chat)) {
                    }
                    TLRPC.Peer peer2 = this.k.peer_id;
                    if (peer2 != null) {
                    }
                    if (peer2 != null) {
                        if (peer2.channel_id != 0) {
                            if (chat != null) {
                            }
                        }
                    }
                    if (p3() || z10 || this.T != 0 || ((messageFwdHeader = this.k.fwd_from) != null && messageFwdHeader.saved_from_peer != null)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void n(CharSequence charSequence) {
        TLRPC.Message message;
        zi ziVar = this.C;
        if (ziVar == null) {
            return;
        }
        if (ziVar.f5()) {
            h(Q3(), charSequence, false, 3, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
            return;
        }
        if (M4(ziVar.k)) {
            h(Q3(), charSequence, false, 3, (int) ziVar.L0(), false);
            return;
        }
        if (ziVar.J3() || S4(ziVar.k)) {
            h(Q3(), charSequence, false, 4, (int) ziVar.L0(), false);
        }
        if (charSequence != this.v || (message = this.k) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction instanceof TLRPC.TL_messageActionTodoCompletions) || (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks)) {
            b6();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:289|(3:290|291|292)|293|(1:295)(12:326|(1:328)|297|298|299|(1:301)(1:323)|302|303|(2:305|(3:307|(5:310|311|(1:316)|313|314)|315))(1:322)|321|(1:320)(5:310|311|(0)|313|314)|315)|296|297|298|299|(0)(0)|302|303|(0)(0)|321|(0)(0)|315) */
    /* JADX WARN: Can't wrap try/catch for region: R(48:172|(1:174)|175|(1:177)(1:458)|178|(1:180)(1:457)|181|(1:183)|(1:185)|(1:456)(1:190)|191|(1:455)(1:198)|199|(2:201|(2:(1:427)|428)(1:204))(2:429|(1:(7:442|(1:444)(1:454)|445|(1:447)(1:453)|448|(1:450)(1:452)|451))(5:432|(1:434)(1:440)|435|(1:437)(1:439)|438))|205|(3:207|(1:209)(2:421|(1:423)(1:424))|210)(1:425)|211|(1:213)(2:417|(1:419)(29:420|215|(6:217|(1:393)(7:223|(1:225)(1:392)|226|(1:228)(1:391)|229|(1:231)(1:390)|232)|233|234|(2:236|(2:238|(2:240|(1:242))(1:243))(1:244))|245)(3:394|(2:396|397)(8:398|399|400|(1:411)(1:404)|405|406|(1:408)(1:410)|409)|356)|246|247|248|(1:252)|253|254|255|256|(1:258)(18:379|(1:381)|260|261|(1:263)|264|(1:266)|267|(3:269|(7:271|272|273|274|275|277|278)|284)|285|(6:287|(17:289|290|291|292|293|(1:295)(12:326|(1:328)|297|298|299|(1:301)(1:323)|302|303|(2:305|(3:307|(5:310|311|(1:316)|313|314)|315))(1:322)|321|(1:320)(5:310|311|(0)|313|314)|315)|296|297|298|299|(0)(0)|302|303|(0)(0)|321|(0)(0)|315)|331|332|(2:(1:335)|336)(1:(1:365))|337)(3:366|(5:368|(1:370)(1:377)|371|(1:373)(1:376)|374)(1:378)|375)|338|(1:340)(2:357|(3:359|(1:361)(1:363)|362))|341|(5:345|(1:347)(4:351|(1:353)|349|350)|348|349|350)|354|355|356)|259|260|261|(0)|264|(0)|267|(0)|285|(0)(0)|338|(0)(0)|341|(6:343|345|(0)(0)|348|349|350)|354|355|356))|214|215|(0)(0)|246|247|248|(2:250|252)|253|254|255|256|(0)(0)|259|260|261|(0)|264|(0)|267|(0)|285|(0)(0)|338|(0)(0)|341|(0)|354|355|356|170) */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x06d7, code lost:
    
        r9 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0637, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0638, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
        r0 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x061f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0623, code lost:
    
        if (r6 == 0) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0625, code lost:
    
        r34.v2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0629, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
        r10 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013c, code lost:
    
        if (r8.length > 0) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x072b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0737 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0737 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0377 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n0(TLRPC.User user) {
        int L;
        float f10;
        float f11;
        CharSequence charSequence;
        int i3;
        int L2;
        boolean z10;
        boolean z11;
        int ceil;
        ArrayList arrayList;
        StaticLayout staticLayout;
        boolean z12;
        int i10;
        int i11;
        int i12;
        boolean z13;
        TextPaint textPaint;
        int i13;
        int c2;
        int i14;
        boolean z14;
        CharSequence charSequence2;
        TextPaint textPaint2;
        boolean z15;
        int lineCount;
        int c10;
        int i15;
        int ceil2;
        int i16;
        int ceil3;
        int i17;
        int i18;
        int c11;
        float f12;
        int c12;
        int i19;
        boolean z16;
        TextPaint textPaint3;
        float f13;
        float f14;
        boolean z17;
        int i20;
        int i21;
        float lineLeft;
        CharSequence charSequence3;
        View view;
        int i22 = this.D;
        if (i22 == 36) {
            int m1 = m1();
            cv cvVar = this.w2;
            if (cvVar == null || (this.k != null && cvVar.L(E0(), m1))) {
                cv cvVar2 = this.w2;
                this.w2 = new cv(this, m1, cvVar2);
                if (cvVar2 == null || (view = cvVar2.Q) == null) {
                    return;
                }
                cvVar2.f(view);
                return;
            }
            return;
        }
        if ((i22 != 0 && i22 != 19 && i22 != 24) || this.k.peer_id == null) {
            return;
        }
        if (TextUtils.isEmpty(this.v) && !this.W1) {
            return;
        }
        j();
        TLRPC.Message message = this.k;
        boolean z18 = true;
        boolean z19 = message != null && message.noforwards;
        if (!z19) {
            z19 = hp.s1(this.I1).A2(B0(message));
        }
        this.z2 = new ArrayList();
        this.t2 = 0;
        CharSequence charSequence4 = this.v;
        this.A2 = (charSequence4 instanceof Spanned) && ((oi.h[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), oi.h.class)).length > 0;
        CharSequence charSequence5 = this.v;
        this.E2 = (charSequence5 instanceof Spanned) && ((wg0[]) ((Spanned) charSequence5).getSpans(0, charSequence5.length(), wg0.class)).length > 0;
        this.F2 = false;
        this.G2 = false;
        CharSequence a10 = org.telegram.ui.Components.vz.a(this.v, true);
        this.v = a10;
        if (a10 instanceof Spanned) {
            Spanned spanned = (Spanned) a10;
            xg0[] xg0VarArr = (xg0[]) spanned.getSpans(0, spanned.length(), xg0.class);
            for (xg0 xg0Var : xg0VarArr) {
                xg0Var.b = false;
            }
            this.F2 = xg0VarArr.length == 1 && spanned.getSpanStart(xg0VarArr[0]) == 0 && spanned.getSpanEnd(xg0VarArr[0]) == spanned.length();
            oi.h[] hVarArr = (oi.h[]) spanned.getSpans(0, spanned.length(), oi.h.class);
            this.G2 = hVarArr.length == 1 && spanned.getSpanStart(hVarArr[0]) == 0 && spanned.getSpanEnd(hVarArr[0]) == spanned.length();
        }
        if (this.W1) {
            CharSequence charSequence6 = this.v;
            if ((charSequence6 instanceof Spannable) && (r8 = (e2[]) ((Spannable) charSequence6).getSpans(0, charSequence6.length(), e2.class)) != null) {
                charSequence3 = charSequence6;
            }
            SpannableStringBuilder spannableStringBuilder = charSequence6 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence6 : new SpannableStringBuilder(charSequence6);
            p31 p31Var = new p31(true);
            p31Var.b(-1);
            p31Var.d();
            e2 e2Var = new e2(1, p31Var);
            e2Var.a(org.telegram.ui.ActionBar.k6.Sc);
            e2Var.n = -g0.L(10.0f);
            spannableStringBuilder.append((CharSequence) " _");
            spannableStringBuilder.setSpan(e2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            charSequence3 = spannableStringBuilder;
            this.v = charSequence3;
        }
        int m12 = m1();
        boolean z20 = Q2() && !Q3();
        try {
            if (!this.F2) {
                if (this.G2) {
                    L = g0.L(15.0f);
                }
                int i23 = m12;
                TextPaint textPaint4 = !(o1(this.k) instanceof TLRPC.TL_messageMediaGame) ? org.telegram.ui.ActionBar.k6.x2 : org.telegram.ui.ActionBar.k6.o2;
                CharSequence charSequence7 = this.v;
                StaticLayout h52 = h5(charSequence7, textPaint4, i23, 1.0f, this.P1 < 4 ? -1.0f : 0.0f, this.N1 <= 0, Layout.Alignment.ALIGN_NORMAL);
                if (this.h2) {
                    f10 = 32.0f;
                } else {
                    int i24 = this.D != 0 ? A2() ? 7 : 12 : 22;
                    if (a5()) {
                        i24 -= 8;
                    }
                    f10 = 32.0f;
                    if (h52.getLineCount() > i24) {
                        String M0 = bd.M0(2131746379, null);
                        f11 = 0.0f;
                        int ceil4 = (int) Math.ceil(textPaint4.measureText("… " + M0) + g0.L(1.0f));
                        int i25 = 0;
                        float f15 = 0.0f;
                        while (i25 < i24) {
                            f15 = Math.max(f15, h52.getLineRight(i25));
                            i25++;
                            z18 = z18;
                        }
                        boolean z21 = z18;
                        int i26 = i24 - 1;
                        int lineStart = h52.getLineStart(i26);
                        int lineEnd = h52.getLineEnd(i26) - 1;
                        while (lineEnd >= lineStart && h52.getPrimaryHorizontal(lineEnd) >= f15 - ceil4) {
                            lineEnd--;
                        }
                        while (lineEnd >= lineStart && !Character.isWhitespace(charSequence7.charAt(lineEnd))) {
                            lineEnd--;
                        }
                        SpannableStringBuilder append = new SpannableStringBuilder(charSequence7.subSequence(0, lineEnd)).append((CharSequence) "… ").append((CharSequence) M0);
                        append.setSpan(new qi(), append.length() - M0.length(), append.length(), 33);
                        try {
                            h52 = h5(append, textPaint4, i23, 1.0f, this.P1 >= 4 ? -1.0f : 0.0f, this.N1 > 0 ? z21 : false, Layout.Alignment.ALIGN_NORMAL);
                            charSequence = append;
                            if (this.F2) {
                                L2 = g0.L(f10);
                            } else {
                                if (!this.G2) {
                                    i3 = i23;
                                    int lineCount2 = h52.getLineCount();
                                    int i27 = this.P1;
                                    int i28 = i27 < 50 ? 5 : 10;
                                    z10 = Build.VERSION.SDK_INT < 24 && i27 < 50;
                                    if (z10) {
                                        z11 = z19;
                                        ceil = (int) Math.ceil(lineCount2 / i28);
                                    } else {
                                        z11 = z19;
                                        ceil = 1;
                                    }
                                    arrayList = new ArrayList();
                                    if (!(charSequence instanceof Spanned) && (this.E2 || this.A2)) {
                                        R((Spanned) charSequence, arrayList);
                                    } else {
                                        if (!z10 || ceil == 1) {
                                            staticLayout = h52;
                                            z12 = false;
                                            arrayList.add(new yi(0, staticLayout.getText().length()));
                                            int size = arrayList.size();
                                            this.C2 = z12;
                                            this.D2 = z12;
                                            this.H2 = z12;
                                            this.F2 = z12;
                                            this.G2 = z12;
                                            i12 = 0;
                                            CharSequence charSequence8 = charSequence;
                                            while (i12 < arrayList.size()) {
                                                wi wiVar = new wi();
                                                yi yiVar = (yi) arrayList.get(i12);
                                                boolean z22 = yiVar.d;
                                                int i29 = yiVar.a;
                                                int i30 = yiVar.b;
                                                String str = yiVar.f;
                                                wiVar.I = z22;
                                                wiVar.J = yiVar.c;
                                                boolean z23 = yiVar.e;
                                                wiVar.K = z23;
                                                if (z23) {
                                                    wiVar.F = this;
                                                }
                                                wiVar.c = i12;
                                                wiVar.a = i12 == 0;
                                                boolean z24 = i12 == arrayList.size() + (-1);
                                                wiVar.b = z24;
                                                boolean z25 = wiVar.a;
                                                boolean z26 = z24;
                                                if (z25) {
                                                    this.C2 = wiVar.I;
                                                }
                                                if (z26) {
                                                    this.H2 = wiVar.J;
                                                    this.D2 = wiVar.I;
                                                }
                                                this.F2 = z25 && z26 && wiVar.J;
                                                this.G2 = z25 && z26 && !wiVar.J && wiVar.I;
                                                if (!wiVar.J) {
                                                    boolean z27 = wiVar.I;
                                                    if (z27 && z20) {
                                                        wiVar.n(str, z11);
                                                        wiVar.f = wiVar.g() + (wiVar.a ? 0 : g0.L(8.0f));
                                                        wiVar.h = g0.L(12.0f) + (wiVar.b ? 0 : g0.L(8.0f));
                                                    } else if (z27) {
                                                        wiVar.m(i30 - i29, str, z11);
                                                        wiVar.f = g0.L(4.0f) + wiVar.N + (wiVar.a ? 0 : g0.L(5.0f));
                                                        wiVar.h = g0.L(4.0f) + (wiVar.b ? 0 : g0.L(7.0f)) + (wiVar.O ? g0.L(38.0f) : 0);
                                                    }
                                                } else if (z25 && z26) {
                                                    int L3 = g0.L(6.0f);
                                                    wiVar.h = L3;
                                                    wiVar.f = L3;
                                                } else {
                                                    wiVar.f = g0.L(z25 ? 8.0f : 6.0f);
                                                    wiVar.h = g0.L(7.0f);
                                                }
                                                if (wiVar.I) {
                                                    int i31 = i30 - i29;
                                                    textPaint = i31 > 220 ? org.telegram.ui.ActionBar.k6.r2 : i31 > 80 ? org.telegram.ui.ActionBar.k6.q2 : org.telegram.ui.ActionBar.k6.p2;
                                                } else {
                                                    textPaint = textPaint4;
                                                }
                                                CharSequence subSequence = charSequence8.subSequence(i29, i30);
                                                if (wiVar.J) {
                                                    c2 = g0.L(24.0f);
                                                } else if (wiVar.I) {
                                                    c2 = wiVar.c();
                                                } else {
                                                    i13 = i3;
                                                    ArrayList arrayList2 = arrayList;
                                                    if (size != 1) {
                                                        if (wiVar.I && !wiVar.J && (staticLayout.getText() instanceof Spannable)) {
                                                            SpannableString b10 = !TextUtils.isEmpty(str) ? oi.k.b(subSequence.toString(), str) : new SpannableString(subSequence.toString());
                                                            wiVar.s = i13;
                                                            staticLayout = h5(b10, textPaint, i13, 1.0f, this.P1 >= 4 ? -1.0f : f11, this.N1 > 0, Layout.Alignment.ALIGN_NORMAL);
                                                            i23 = i13;
                                                        } else {
                                                            wiVar.s = i23;
                                                        }
                                                        StaticLayout staticLayout2 = staticLayout;
                                                        wiVar.e = staticLayout2;
                                                        wiVar.n = 0;
                                                        wiVar.r = staticLayout2.getText().length();
                                                        wiVar.w = staticLayout2.getHeight();
                                                        wiVar.G = (int) Math.min(textPaint4.getTextSize() * 1.4f * 3.0f, wiVar.w);
                                                        int i32 = this.N1;
                                                        if (i32 != 0) {
                                                            if (i32 == 1) {
                                                                wiVar.f -= g0.L(5.3f);
                                                            } else if (i32 == 2) {
                                                                wiVar.f -= g0.L(4.5f);
                                                            } else if (i32 == 3) {
                                                                wiVar.f -= g0.L(4.2f);
                                                            }
                                                        }
                                                        staticLayout = staticLayout2;
                                                    } else {
                                                        if (i30 < i29) {
                                                            i14 = i3;
                                                            z14 = z20;
                                                            charSequence2 = charSequence8;
                                                            textPaint2 = textPaint4;
                                                            z15 = z11;
                                                        } else {
                                                            wiVar.n = i29;
                                                            wiVar.r = i30;
                                                            try {
                                                                SpannableString valueOf = (!wiVar.I || wiVar.J) ? SpannableString.valueOf(subSequence) : oi.k.b(subSequence.toString(), str);
                                                                wiVar.s = i13;
                                                                StaticLayout h53 = h5(valueOf, textPaint, i13, 1.0f, this.P1 >= 4 ? -1.0f : f11, false, Layout.Alignment.ALIGN_NORMAL);
                                                                wiVar.e = h53;
                                                                wiVar.w = h53.getHeight();
                                                                wiVar.G = (int) Math.min(textPaint4.getTextSize() * 1.4f * 3.0f, wiVar.w);
                                                            } catch (Exception e10) {
                                                                i14 = i3;
                                                                z14 = z20;
                                                                charSequence2 = charSequence8;
                                                                textPaint2 = textPaint4;
                                                                z15 = z11;
                                                                a8.g(e10, true);
                                                            }
                                                        }
                                                        i12++;
                                                        i3 = i14;
                                                        charSequence8 = charSequence2;
                                                        arrayList = arrayList2;
                                                        z20 = z14;
                                                        textPaint4 = textPaint2;
                                                        z11 = z15;
                                                    }
                                                    this.z2.add(wiVar);
                                                    lineCount = wiVar.e.getLineCount();
                                                    lineLeft = wiVar.e.getLineLeft(lineCount - 1);
                                                    if (i12 == 0 && lineLeft >= f11) {
                                                        this.v2 = lineLeft;
                                                    }
                                                    float f16 = lineLeft;
                                                    float f17 = wiVar.e.getLineWidth(lineCount - 1);
                                                    if (wiVar.J) {
                                                        if (wiVar.I) {
                                                            c10 = wiVar.c();
                                                        }
                                                        i15 = i3;
                                                        ceil2 = (int) Math.ceil(f17);
                                                        if (ceil2 > i15 + 80) {
                                                            ceil2 = i15;
                                                        }
                                                        i16 = size - 1;
                                                        if (i12 == i16) {
                                                            this.s2 = ceil2;
                                                        }
                                                        float f18 = ceil2;
                                                        int i33 = i15;
                                                        charSequence2 = charSequence8;
                                                        ceil3 = (int) Math.ceil(Math.max(0.0f, f16) + f18);
                                                        if (wiVar.J) {
                                                            wiVar.E = 0.0f;
                                                            int i34 = 0;
                                                            while (i34 < lineCount) {
                                                                try {
                                                                    i21 = ceil2;
                                                                } catch (Exception unused) {
                                                                    i21 = ceil2;
                                                                }
                                                                try {
                                                                    wiVar.E = Math.max(wiVar.E, wiVar.e.getLineRight(i34));
                                                                } catch (Exception unused2) {
                                                                    wiVar.E = this.t2;
                                                                    i34++;
                                                                    ceil2 = i21;
                                                                }
                                                                i34++;
                                                                ceil2 = i21;
                                                            }
                                                        }
                                                        int i35 = ceil2;
                                                        if (lineCount > 1) {
                                                            z14 = z20;
                                                            int i36 = i35;
                                                            float f19 = 0.0f;
                                                            float f20 = 0.0f;
                                                            int i37 = 0;
                                                            boolean z28 = false;
                                                            int i38 = ceil3;
                                                            while (i37 < lineCount) {
                                                                int i39 = lineCount;
                                                                try {
                                                                    f12 = wiVar.e.getLineWidth(i37);
                                                                } catch (Exception unused3) {
                                                                    f12 = 0.0f;
                                                                }
                                                                if (wiVar.J) {
                                                                    c12 = g0.L(f10);
                                                                } else {
                                                                    if (wiVar.I) {
                                                                        c12 = wiVar.c();
                                                                    }
                                                                    float f21 = wiVar.e.getLineLeft(i37);
                                                                    float f22 = f21;
                                                                    if (f12 <= i33 + 20) {
                                                                        i19 = i33;
                                                                        z16 = z28;
                                                                        f14 = i19;
                                                                        textPaint3 = textPaint4;
                                                                        f13 = 0.0f;
                                                                    } else {
                                                                        i19 = i33;
                                                                        z16 = z28;
                                                                        textPaint3 = textPaint4;
                                                                        f13 = f22;
                                                                        f14 = f12;
                                                                    }
                                                                    int i40 = i23;
                                                                    if (f13 > 0.0f) {
                                                                        z17 = z11;
                                                                        if (wiVar.e.getParagraphDirection(i37) != -1) {
                                                                            wiVar.x = (byte) (wiVar.x | 2);
                                                                            i20 = 1;
                                                                            if (z16 && f13 == 0.0f) {
                                                                                try {
                                                                                    if (wiVar.e.getParagraphDirection(i37) != i20) {
                                                                                    }
                                                                                } catch (Exception unused4) {
                                                                                }
                                                                                z16 = true;
                                                                            }
                                                                            f20 = Math.max(f20, f14);
                                                                            float f23 = f13 + f14;
                                                                            f19 = Math.max(f19, f23);
                                                                            i36 = Math.max(i36, (int) Math.ceil(f14));
                                                                            i38 = Math.max(i38, (int) Math.ceil(f23));
                                                                            i37++;
                                                                            z28 = z16;
                                                                            textPaint4 = textPaint3;
                                                                            i23 = i40;
                                                                            z11 = z17;
                                                                            i33 = i19;
                                                                            lineCount = i39;
                                                                        }
                                                                    } else {
                                                                        z17 = z11;
                                                                    }
                                                                    this.v2 = Math.min(this.v2, f13);
                                                                    i20 = 1;
                                                                    wiVar.x = (byte) (wiVar.x | 1);
                                                                    this.u2 = true;
                                                                    if (z16) {
                                                                        if (wiVar.e.getParagraphDirection(i37) != i20) {
                                                                        }
                                                                        z16 = true;
                                                                    }
                                                                    f20 = Math.max(f20, f14);
                                                                    float f232 = f13 + f14;
                                                                    f19 = Math.max(f19, f232);
                                                                    i36 = Math.max(i36, (int) Math.ceil(f14));
                                                                    i38 = Math.max(i38, (int) Math.ceil(f232));
                                                                    i37++;
                                                                    z28 = z16;
                                                                    textPaint4 = textPaint3;
                                                                    i23 = i40;
                                                                    z11 = z17;
                                                                    i33 = i19;
                                                                    lineCount = i39;
                                                                }
                                                                f12 += c12;
                                                                float f212 = wiVar.e.getLineLeft(i37);
                                                                float f222 = f212;
                                                                if (f12 <= i33 + 20) {
                                                                }
                                                                int i402 = i23;
                                                                if (f13 > 0.0f) {
                                                                }
                                                                this.v2 = Math.min(this.v2, f13);
                                                                i20 = 1;
                                                                wiVar.x = (byte) (wiVar.x | 1);
                                                                this.u2 = true;
                                                                if (z16) {
                                                                }
                                                                f20 = Math.max(f20, f14);
                                                                float f2322 = f13 + f14;
                                                                f19 = Math.max(f19, f2322);
                                                                i36 = Math.max(i36, (int) Math.ceil(f14));
                                                                i38 = Math.max(i38, (int) Math.ceil(f2322));
                                                                i37++;
                                                                z28 = z16;
                                                                textPaint4 = textPaint3;
                                                                i23 = i402;
                                                                z11 = z17;
                                                                i33 = i19;
                                                                lineCount = i39;
                                                            }
                                                            textPaint2 = textPaint4;
                                                            i17 = i23;
                                                            z15 = z11;
                                                            i14 = i33;
                                                            if (z28) {
                                                                if (i12 == i16) {
                                                                    this.s2 = ceil3;
                                                                }
                                                                f20 = f19;
                                                            } else if (i12 == i16) {
                                                                this.s2 = i36;
                                                            }
                                                            this.t2 = Math.max(this.t2, (int) Math.ceil(f20));
                                                            ceil3 = i38;
                                                            f11 = 0.0f;
                                                        } else {
                                                            z14 = z20;
                                                            textPaint2 = textPaint4;
                                                            i17 = i23;
                                                            z15 = z11;
                                                            i14 = i33;
                                                            f11 = 0.0f;
                                                            if (f16 > 0.0f) {
                                                                float min = Math.min(this.v2, f16);
                                                                this.v2 = min;
                                                                i18 = min == 0.0f ? (int) (f18 + f16) : i35;
                                                                this.u2 = size != 1;
                                                                wiVar.x = (byte) (wiVar.x | 1);
                                                            } else {
                                                                wiVar.x = (byte) (wiVar.x | 2);
                                                                i18 = i35;
                                                            }
                                                            this.t2 = Math.max(this.t2, Math.min(i14, i18));
                                                        }
                                                        if (wiVar.V) {
                                                            this.t2 = Math.max(this.t2, i14);
                                                        } else {
                                                            ly0 ly0Var = wiVar.M;
                                                            if (ly0Var != null) {
                                                                this.t2 = (int) Math.max(this.t2, Math.min(ly0Var.c + g0.L(15.0f), wiVar.e == null ? f11 : r3.getWidth()));
                                                            }
                                                        }
                                                        wiVar.y.clear();
                                                        if (!this.L0 && !this.I2) {
                                                            if (wiVar.J) {
                                                                if (wiVar.I) {
                                                                    c11 = wiVar.c();
                                                                }
                                                                yh.f.b(null, wiVar.e, -1, ceil3, null, wiVar.y);
                                                            } else {
                                                                c11 = g0.L(f10);
                                                            }
                                                            ceil3 -= c11;
                                                            yh.f.b(null, wiVar.e, -1, ceil3, null, wiVar.y);
                                                        }
                                                        i23 = i17;
                                                        i12++;
                                                        i3 = i14;
                                                        charSequence8 = charSequence2;
                                                        arrayList = arrayList2;
                                                        z20 = z14;
                                                        textPaint4 = textPaint2;
                                                        z11 = z15;
                                                    } else {
                                                        c10 = g0.L(f10);
                                                    }
                                                    f17 += c10;
                                                    i15 = i3;
                                                    ceil2 = (int) Math.ceil(f17);
                                                    if (ceil2 > i15 + 80) {
                                                    }
                                                    i16 = size - 1;
                                                    if (i12 == i16) {
                                                    }
                                                    float f182 = ceil2;
                                                    int i332 = i15;
                                                    charSequence2 = charSequence8;
                                                    ceil3 = (int) Math.ceil(Math.max(0.0f, f16) + f182);
                                                    if (wiVar.J) {
                                                    }
                                                    int i352 = ceil2;
                                                    if (lineCount > 1) {
                                                    }
                                                    if (wiVar.V) {
                                                    }
                                                    wiVar.y.clear();
                                                    if (!this.L0) {
                                                        if (wiVar.J) {
                                                        }
                                                        ceil3 -= c11;
                                                        yh.f.b(null, wiVar.e, -1, ceil3, null, wiVar.y);
                                                    }
                                                    i23 = i17;
                                                    i12++;
                                                    i3 = i14;
                                                    charSequence8 = charSequence2;
                                                    arrayList = arrayList2;
                                                    z20 = z14;
                                                    textPaint4 = textPaint2;
                                                    z11 = z15;
                                                }
                                                i13 = i3 - c2;
                                                ArrayList arrayList22 = arrayList;
                                                if (size != 1) {
                                                }
                                                this.z2.add(wiVar);
                                                lineCount = wiVar.e.getLineCount();
                                                lineLeft = wiVar.e.getLineLeft(lineCount - 1);
                                                if (i12 == 0) {
                                                    this.v2 = lineLeft;
                                                }
                                                float f162 = lineLeft;
                                                float f172 = wiVar.e.getLineWidth(lineCount - 1);
                                                if (wiVar.J) {
                                                }
                                                f172 += c10;
                                                i15 = i3;
                                                ceil2 = (int) Math.ceil(f172);
                                                if (ceil2 > i15 + 80) {
                                                }
                                                i16 = size - 1;
                                                if (i12 == i16) {
                                                }
                                                float f1822 = ceil2;
                                                int i3322 = i15;
                                                charSequence2 = charSequence8;
                                                ceil3 = (int) Math.ceil(Math.max(0.0f, f162) + f1822);
                                                if (wiVar.J) {
                                                }
                                                int i3522 = ceil2;
                                                if (lineCount > 1) {
                                                }
                                                if (wiVar.V) {
                                                }
                                                wiVar.y.clear();
                                                if (!this.L0) {
                                                }
                                                i23 = i17;
                                                i12++;
                                                i3 = i14;
                                                charSequence8 = charSequence2;
                                                arrayList = arrayList22;
                                                z20 = z14;
                                                textPaint4 = textPaint2;
                                                z11 = z15;
                                            }
                                            if (this.A2) {
                                                if (this.t2 > this.R1 - g0.L(80 + ((!m5() || Q3() || this.k.isThreadMessage) ? 0 : 52))) {
                                                    z13 = true;
                                                    this.B2 = z13;
                                                    return;
                                                }
                                            }
                                            z13 = false;
                                            this.B2 = z13;
                                            return;
                                        }
                                        int i41 = 0;
                                        int i42 = 0;
                                        while (i41 < ceil) {
                                            int min2 = z10 ? lineCount2 : Math.min(i28, lineCount2 - i42);
                                            boolean z29 = z10;
                                            int lineStart2 = h52.getLineStart(i42);
                                            int i43 = min2 + i42;
                                            int i44 = ceil;
                                            int lineEnd2 = h52.getLineEnd(i43 - 1);
                                            StaticLayout staticLayout3 = h52;
                                            int i45 = lineEnd2 - 1;
                                            if (i45 >= 0) {
                                                i10 = lineEnd2;
                                                if (i45 < staticLayout3.getText().length()) {
                                                    if (staticLayout3.getText().charAt(i45) == '\n') {
                                                        i11 = i10 - 1;
                                                        if (i11 >= lineStart2) {
                                                            arrayList.add(new yi(lineStart2, i11));
                                                            i42 = i43;
                                                        }
                                                        i41++;
                                                        z10 = z29;
                                                        ceil = i44;
                                                        h52 = staticLayout3;
                                                    }
                                                    i11 = i10;
                                                    if (i11 >= lineStart2) {
                                                    }
                                                    i41++;
                                                    z10 = z29;
                                                    ceil = i44;
                                                    h52 = staticLayout3;
                                                }
                                            } else {
                                                i10 = lineEnd2;
                                            }
                                            i11 = i10;
                                            if (i11 >= lineStart2) {
                                            }
                                            i41++;
                                            z10 = z29;
                                            ceil = i44;
                                            h52 = staticLayout3;
                                        }
                                    }
                                    staticLayout = h52;
                                    z12 = false;
                                    int size2 = arrayList.size();
                                    this.C2 = z12;
                                    this.D2 = z12;
                                    this.H2 = z12;
                                    this.F2 = z12;
                                    this.G2 = z12;
                                    i12 = 0;
                                    CharSequence charSequence82 = charSequence;
                                    while (i12 < arrayList.size()) {
                                    }
                                    if (this.A2) {
                                    }
                                    z13 = false;
                                    this.B2 = z13;
                                    return;
                                }
                                L2 = g0.L(15.0f);
                            }
                            i3 = L2 + i23;
                            int lineCount22 = h52.getLineCount();
                            int i272 = this.P1;
                            if (i272 < 50) {
                            }
                            if (Build.VERSION.SDK_INT < 24) {
                            }
                            if (z10) {
                            }
                            arrayList = new ArrayList();
                            if (!(charSequence instanceof Spanned)) {
                            }
                            if (z10) {
                            }
                            staticLayout = h52;
                            z12 = false;
                            arrayList.add(new yi(0, staticLayout.getText().length()));
                            int size22 = arrayList.size();
                            this.C2 = z12;
                            this.D2 = z12;
                            this.H2 = z12;
                            this.F2 = z12;
                            this.G2 = z12;
                            i12 = 0;
                            CharSequence charSequence822 = charSequence;
                            while (i12 < arrayList.size()) {
                            }
                            if (this.A2) {
                            }
                            z13 = false;
                            this.B2 = z13;
                            return;
                        } catch (Exception e11) {
                            a8.g(e11, z21);
                            return;
                        }
                    }
                }
                f11 = 0.0f;
                charSequence = charSequence7;
                if (this.F2) {
                }
                i3 = L2 + i23;
                int lineCount222 = h52.getLineCount();
                int i2722 = this.P1;
                if (i2722 < 50) {
                }
                if (Build.VERSION.SDK_INT < 24) {
                }
                if (z10) {
                }
                arrayList = new ArrayList();
                if (!(charSequence instanceof Spanned)) {
                }
                if (z10) {
                }
                staticLayout = h52;
                z12 = false;
                arrayList.add(new yi(0, staticLayout.getText().length()));
                int size222 = arrayList.size();
                this.C2 = z12;
                this.D2 = z12;
                this.H2 = z12;
                this.F2 = z12;
                this.G2 = z12;
                i12 = 0;
                CharSequence charSequence8222 = charSequence;
                while (i12 < arrayList.size()) {
                }
                if (this.A2) {
                }
                z13 = false;
                this.B2 = z13;
                return;
            }
            L = g0.L(32.0f);
            StaticLayout h522 = h5(charSequence7, textPaint4, i23, 1.0f, this.P1 < 4 ? -1.0f : 0.0f, this.N1 <= 0, Layout.Alignment.ALIGN_NORMAL);
            if (this.h2) {
            }
            f11 = 0.0f;
            charSequence = charSequence7;
            if (this.F2) {
            }
            i3 = L2 + i23;
            int lineCount2222 = h522.getLineCount();
            int i27222 = this.P1;
            if (i27222 < 50) {
            }
            if (Build.VERSION.SDK_INT < 24) {
            }
            if (z10) {
            }
            arrayList = new ArrayList();
            if (!(charSequence instanceof Spanned)) {
            }
            if (z10) {
            }
            staticLayout = h522;
            z12 = false;
            arrayList.add(new yi(0, staticLayout.getText().length()));
            int size2222 = arrayList.size();
            this.C2 = z12;
            this.D2 = z12;
            this.H2 = z12;
            this.F2 = z12;
            this.G2 = z12;
            i12 = 0;
            CharSequence charSequence82222 = charSequence;
            while (i12 < arrayList.size()) {
            }
            if (this.A2) {
            }
            z13 = false;
            this.B2 = z13;
            return;
        } catch (Exception e12) {
            a8.g(e12, true);
            return;
        }
        m12 -= L;
        int i232 = m12;
        TextPaint textPaint42 = !(o1(this.k) instanceof TLRPC.TL_messageMediaGame) ? org.telegram.ui.ActionBar.k6.x2 : org.telegram.ui.ActionBar.k6.o2;
        CharSequence charSequence72 = this.v;
    }

    public final boolean n5() {
        if (this.h2) {
            return false;
        }
        if (r2()) {
            return true;
        }
        TLRPC.Message message = this.k;
        if (message instanceof TLRPC.TL_message_secret) {
            int max = Math.max(message.ttl, o1(message).ttl_seconds);
            if (max > 0) {
                return (((o1(this.k) instanceof TLRPC.TL_messageMediaPhoto) || M4(this.k) || u3(this.k)) && max <= 60) || i4();
            }
            return false;
        }
        if (!(message instanceof TLRPC.TL_message) || o1(message) == null || o1(this.k).ttl_seconds == 0) {
            return false;
        }
        return (o1(this.k) instanceof TLRPC.TL_messageMediaPhoto) || (o1(this.k) instanceof TLRPC.TL_messageMediaDocument);
    }

    public final boolean o() {
        TLRPC.MessageMedia o12 = o1(this.k);
        if (!(o12 instanceof TLRPC.TL_messageMediaToDo) || m3(this.k)) {
            return false;
        }
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) o12;
        if (tL_messageMediaToDo.todo.list.size() >= hp.s1(this.I1).R6) {
            return false;
        }
        if (Q3()) {
            return true;
        }
        TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
        return todoList.others_can_complete && todoList.others_can_append;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0() {
        boolean z10;
        int i3;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        if (this.y != null) {
            return;
        }
        TLRPC.WebPage webPage = this.Z2;
        if (webPage == null) {
            webPage = o1(this.k) instanceof TLRPC.TL_messageMediaWebPage ? ((TLRPC.TL_messageMediaWebPage) o1(this.k)).webpage : null;
        }
        if (webPage != null) {
            for (int i10 = 0; i10 < webPage.attributes.size(); i10++) {
                TLRPC.WebPageAttribute webPageAttribute = webPage.attributes.get(i10);
                if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem) != null && storyItem.caption != null) {
                    this.y = new SpannableStringBuilder(tL_webPageAttributeStory.storyItem.caption);
                    this.z1 = tL_webPageAttributeStory.storyItem.entities;
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (this.y == null) {
            if ((o1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && (o1(this.k).webpage instanceof TLRPC.TL_webPage) && o1(this.k).webpage.description != null) {
                this.y = Spannable.Factory.getInstance().newSpannable(o1(this.k).webpage.description);
                String str = o1(this.k).webpage.site_name;
                if (str != null) {
                    str = str.toLowerCase();
                }
                i3 = "instagram".equals(str) ? 1 : "twitter".equals(str) ? 2 : 0;
                if (TextUtils.isEmpty(this.y)) {
                    if (M(this.y)) {
                        try {
                            g0.c((Spannable) this.y, 1, false, true);
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    CharSequence m10 = i6.m(this.y, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), false, null, 0);
                    this.y = m10;
                    ArrayList arrayList = this.z1;
                    if (arrayList != null) {
                        b(m10, arrayList, O3(), z10, false, !z10, 0);
                        C5(this.y, this.z1, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), false);
                    }
                    if (i3 != 0) {
                        if (!(this.y instanceof Spannable)) {
                            this.y = new SpannableStringBuilder(this.y);
                        }
                        h(Q3(), this.y, false, i3, 0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if ((o1(this.k) instanceof TLRPC.TL_messageMediaGame) && o1(this.k).game.description != null) {
                this.y = Spannable.Factory.getInstance().newSpannable(o1(this.k).game.description);
            } else if ((o1(this.k) instanceof TLRPC.TL_messageMediaInvoice) && o1(this.k).description != null) {
                this.y = Spannable.Factory.getInstance().newSpannable(o1(this.k).description);
            }
        }
        i3 = 0;
        if (TextUtils.isEmpty(this.y)) {
        }
    }

    public final void o2(ArrayList arrayList, String[] strArr, boolean z10, boolean z11) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        boolean z12;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z13 = false;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int i10 = 0;
            while (true) {
                if (i10 >= strArr.length) {
                    break;
                }
                if (((String) arrayList.get(i3)).contains(strArr[i10])) {
                    z13 = true;
                    break;
                }
                i10++;
            }
            if (z13) {
                break;
            }
        }
        if (z13) {
            int i11 = 0;
            while (i11 < arrayList.size()) {
                int i12 = 0;
                while (true) {
                    if (i12 >= strArr.length) {
                        z12 = false;
                        break;
                    } else {
                        if (((String) arrayList.get(i11)).contains(strArr[i12])) {
                            z12 = true;
                            break;
                        }
                        i12++;
                    }
                }
                if (!z12) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (arrayList.size() > 0) {
                Collections.sort(arrayList, new o0.a(16));
                String str = (String) arrayList.get(0);
                arrayList.clear();
                arrayList.add(str);
            }
        }
        this.Y1 = arrayList;
        if (this.k.message != null) {
            j();
            CharSequence M2 = g0.M2(!TextUtils.isEmpty(this.z) ? this.z : this.v, " ", "\n");
            if (z10 && (message = this.k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.quote_text != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.k.reply_to.quote_text);
                b(spannableStringBuilder, this.k.reply_to.quote_entities, Q3(), false, false, false, 0);
                SpannableString spannableString = new SpannableString("q ");
                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.mini_quote, 0);
                wpVar.y = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false);
                spannableString.setSpan(wpVar, 0, 1, 33);
                M2 = new SpannableStringBuilder(spannableString).append((CharSequence) spannableStringBuilder).append('\n').append(M2);
            }
            String charSequence = M2.toString();
            int length = charSequence.length();
            int indexOf = charSequence.toLowerCase().indexOf((String) arrayList.get(0));
            if (indexOf < 0) {
                indexOf = 0;
            }
            if (length > 120 && z11) {
                float f10 = 120;
                int max = Math.max(0, indexOf - ((int) (0.1f * f10)));
                M2 = M2.subSequence(max, Math.min(length, (indexOf - max) + indexOf + ((int) (f10 * 0.9f))));
            }
            this.a2 = M2;
            this.Z1 = z11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o3() {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        TLRPC.Peer peer2 = this.k.peer_id;
        TLRPC.Chat chat2 = null;
        if (peer2 != null) {
            long j10 = peer2.channel_id;
            if (j10 != 0) {
                chat = w0(null, null, j10);
                if (!(this.k.peer_id instanceof TLRPC.TL_peerChannel) && t3.V(chat)) {
                    return true;
                }
                peer = this.k.from_id;
                if (peer != null) {
                    long j11 = peer.channel_id;
                    if (j11 != 0) {
                        chat2 = w0(null, null, j11);
                    }
                }
                return (this.k.from_id instanceof TLRPC.TL_peerChannel) && t3.V(chat2);
            }
        }
        chat = null;
        if (!(this.k.peer_id instanceof TLRPC.TL_peerChannel)) {
        }
        peer = this.k.from_id;
        if (peer != null) {
        }
        if (this.k.from_id instanceof TLRPC.TL_peerChannel) {
            return false;
        }
    }

    public final boolean o4() {
        TLRPC.Message message = this.k;
        if (message.send_state == 2 && message.id < 0) {
            return true;
        }
        if (!this.p1 || message.id <= 0) {
            return false;
        }
        return message.date < ConnectionsManager.getInstance(this.I1).getCurrentTime() - (this.k.video_processing_pending ? hs.X4 : 60);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0099, code lost:
    
        if (r4.channel_id == r0.channel_id) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean o5() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (this.D == 23 && !h3()) {
            return true;
        }
        if (B0(this.k) == 489000) {
            return false;
        }
        boolean z10 = this.l2;
        int i3 = this.I1;
        if (!z10) {
            if (((this.k.flags & 4) != 0 || (n1(this) instanceof TLRPC.TL_messageMediaPaidMedia)) && (messageFwdHeader = this.k.fwd_from) != null && !messageFwdHeader.imported) {
                TLRPC.Peer peer = messageFwdHeader.saved_from_peer;
                if (peer != null) {
                    TLRPC.Peer peer2 = messageFwdHeader.from_id;
                    if (peer2 instanceof TLRPC.TL_peerChannel) {
                    }
                }
                if (h10.i(i3).e() != B0(this.k)) {
                    return true;
                }
            }
            return false;
        }
        TLRPC.Message message = this.k;
        if (message != null && message.fwd_from != null) {
            long e10 = h10.i(i3).e();
            long R1 = R1(e10, this.k);
            long o10 = m5.o(this.k.fwd_from.saved_from_peer);
            if (o10 >= 0) {
                o10 = m5.o(this.k.fwd_from.from_id);
            }
            if (o10 == 0) {
                return R1 >= 0 && R1 != 2666000;
            }
            if (R1 != o10 && o10 != e10) {
                return true;
            }
        }
        return false;
    }

    public final void p0(TLRPC.User user, boolean z10) {
        String str;
        if (user == null) {
            user = hp.s1(this.I1).a2(Long.valueOf(B0(this.k)));
        }
        String j10 = user != null ? l10.j(user, true) : "";
        try {
            if ("XTR".equals(this.k.action.currency)) {
                str = "XTR " + this.k.action.total_amount;
            } else {
                bd E0 = bd.E0();
                TLRPC.MessageAction messageAction = this.k.action;
                str = E0.p(messageAction.total_amount, messageAction.currency);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            str = "<error>";
        }
        zi ziVar = this.C;
        if (ziVar == null || !(n1(ziVar) instanceof TLRPC.TL_messageMediaInvoice)) {
            TLRPC.MessageAction messageAction2 = this.k.action;
            int i3 = messageAction2.subscription_until_date;
            if (i3 != 0) {
                if (z10) {
                    this.v = bd.a0(null, null, 2131747373, j10, str, bd.x(i3, false));
                } else {
                    this.v = bd.a0(null, null, 2131747367, str, j10, bd.x(i3, false));
                }
            } else if (!messageAction2.recurring_init || z10) {
                this.v = bd.a0(null, null, 2131747371, str, j10);
            } else {
                this.v = bd.a0(null, null, 2131747370, str, j10);
            }
        } else {
            TLRPC.MessageAction messageAction3 = this.k.action;
            if (messageAction3.subscription_until_date != 0) {
                if (z10) {
                    this.v = bd.a0(null, null, 2131747372, j10, str, n1(this.C).title, bd.x(this.k.action.subscription_until_date, false));
                } else {
                    this.v = bd.a0(null, null, 2131747368, str, j10, n1(this.C).title, bd.x(this.k.action.subscription_until_date, false));
                }
            } else if (!messageAction3.recurring_init || z10) {
                this.v = bd.a0(null, null, 2131747374, str, j10, n1(this.C).title);
            } else {
                this.v = bd.a0(null, null, 2131747369, str, j10, n1(this.C).title);
            }
        }
        this.v = ci.wb.T0(this.v);
    }

    public final int p1() {
        boolean z10 = this.w0;
        return this.x0 ? (z10 ? 1 : 0) | 2 : z10 ? 1 : 0;
    }

    public final boolean p2() {
        if (o1(this.k) instanceof TLRPC.TL_messageMediaPhoto) {
            return o1(this.k).photo != null && o1(this.k).photo.has_stickers;
        }
        if (o1(this.k) instanceof TLRPC.TL_messageMediaDocument) {
            return W2(o1(this.k).document);
        }
        return false;
    }

    public final boolean p3() {
        TLRPC.Message message = this.k;
        if (message == null) {
            return false;
        }
        TLRPC.Peer peer = message.peer_id;
        TLRPC.Chat chat = null;
        if (peer != null) {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                chat = w0(null, null, j10);
            }
        }
        return (this.k.from_id instanceof TLRPC.TL_peerChannel) && t3.T(chat) && chat.megagroup;
    }

    public final boolean p4() {
        TLRPC.Message message = this.k;
        return message.send_state == 1 && message.id < 0;
    }

    public boolean p5() {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (this.h2 || this.S2 || B0(this.k) == 489000) {
            return false;
        }
        boolean z10 = this.l2;
        int i3 = this.I1;
        if (z10) {
            long j10 = h10.i(i3).n;
            long R1 = R1(j10, this.k);
            if (R1 == j10 || R1 == 2666000 || (message = this.k) == null || (messageFwdHeader = message.fwd_from) == null) {
                return false;
            }
            return (messageFwdHeader.from_id == null && messageFwdHeader.saved_from_id == null) ? false : true;
        }
        if (this.D == 27 || s4() || this.A2 || this.r1 || this.p1 || this.T != 0) {
            return false;
        }
        if (this.n2 == 2) {
            return true;
        }
        TLRPC.Message message2 = this.k;
        if (message2.noforwards) {
            return false;
        }
        if (message2.fwd_from != null && !Q3()) {
            TLRPC.Message message3 = this.k;
            if (message3.fwd_from.saved_from_peer != null && B0(message3) == h10.i(i3).e()) {
                return true;
            }
        }
        int i10 = this.D;
        if (i10 == 13 || i10 == 15 || i10 == 19) {
            return false;
        }
        TLRPC.MessageFwdHeader messageFwdHeader2 = this.k.fwd_from;
        if (messageFwdHeader2 != null && (messageFwdHeader2.from_id instanceof TLRPC.TL_peerChannel) && !Q3()) {
            return true;
        }
        if (!q3()) {
            TLRPC.Message message4 = this.k;
            if (!(message4.from_id instanceof TLRPC.TL_peerChannel) && !message4.post) {
                return false;
            }
            if ((o1(message4) instanceof TLRPC.TL_messageMediaWebPage) && !Q3()) {
                return true;
            }
            if (B4()) {
                return false;
            }
            TLRPC.Message message5 = this.k;
            if (message5.peer_id.channel_id == 0) {
                return false;
            }
            if (message5.via_bot_id == 0 && message5.reply_to == null) {
                return true;
            }
            int i11 = this.D;
            return (i11 == 13 || i11 == 15) ? false : true;
        }
        TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(this.k.from_id.user_id));
        if (a22 != null && a22.bot && ("reviews_bot".equals(l10.n(a22)) || "ReviewInsightsBot".equals(l10.n(a22)))) {
            return true;
        }
        if ((o1(this.k) instanceof TLRPC.TL_messageMediaEmpty) || o1(this.k) == null) {
            return false;
        }
        if ((o1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && !(o1(this.k).webpage instanceof TLRPC.TL_webPage)) {
            return false;
        }
        if (a22 != null && a22.bot && !q2()) {
            return true;
        }
        if (O3()) {
            return false;
        }
        if (o1(this.k) instanceof TLRPC.TL_messageMediaGame) {
            return true;
        }
        if (((o1(this.k) instanceof TLRPC.TL_messageMediaInvoice) && !q2()) || (o1(this.k) instanceof TLRPC.TL_messageMediaWebPage)) {
            return true;
        }
        TLRPC.Peer peer = this.k.peer_id;
        TLRPC.Chat chat = null;
        if (peer != null) {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                chat = w0(null, null, j11);
            }
        }
        return t3.T(chat) && chat.megagroup && t3.t0(chat) && !(o1(this.k) instanceof TLRPC.TL_messageMediaContact) && !(o1(this.k) instanceof TLRPC.TL_messageMediaGeo);
    }

    public final boolean q() {
        TLRPC.MessageMedia o12 = o1(this.k);
        if ((o12 instanceof TLRPC.TL_messageMediaToDo) && !m3(this.k)) {
            return Q3() || ((TLRPC.TL_messageMediaToDo) o12).todo.others_can_complete;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r10v1, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    public final void q0(TLRPC.Chat chat, TLRPC.User user) {
        boolean z10;
        if (user == 0 && chat == null) {
            boolean q32 = q3();
            int i3 = this.I1;
            user = user;
            if (q32) {
                user = hp.s1(i3).a2(Long.valueOf(this.k.from_id.user_id));
            }
            if (user == 0) {
                TLRPC.Peer peer = this.k.peer_id;
                if (peer instanceof TLRPC.TL_peerChannel) {
                    chat = hp.s1(i3).M0(Long.valueOf(this.k.peer_id.channel_id));
                } else if (peer instanceof TLRPC.TL_peerChat) {
                    chat = hp.s1(i3).M0(Long.valueOf(this.k.peer_id.chat_id));
                }
            }
        }
        zi ziVar = this.C;
        if (ziVar != null) {
            TLRPC.Message message = ziVar.k;
            if (!(message instanceof TLRPC.TL_messageEmpty) && !(message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                if (ziVar.J3()) {
                    String M0 = bd.M0(2131754594, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = F5(M0, "un1", chat);
                    return;
                }
                if (M4(this.C.k)) {
                    String M02 = bd.M0(2131754586, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = F5(M02, "un1", chat);
                    return;
                }
                if (u3(this.C.k)) {
                    String M03 = bd.M0(2131754595, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = F5(M03, "un1", chat);
                    return;
                }
                if (S4(this.C.k)) {
                    String M04 = bd.M0(2131754585, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = F5(M04, "un1", chat);
                    return;
                }
                if (this.C.i4()) {
                    String M05 = bd.M0(2131754589, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = F5(M05, "un1", chat);
                    return;
                }
                if ((this.C.u4() || this.C.K2()) && !this.C.H2()) {
                    String M06 = bd.M0(2131754588, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = F5(M06, "un1", chat);
                    return;
                }
                if (n1(this.C) instanceof TLRPC.TL_messageMediaDocument) {
                    String M07 = bd.M0(2131754599, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = F5(M07, "un1", chat);
                    return;
                }
                if (n1(this.C) instanceof TLRPC.TL_messageMediaGeo) {
                    String M08 = bd.M0(2131754597, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = F5(M08, "un1", chat);
                    return;
                }
                if (n1(this.C) instanceof TLRPC.TL_messageMediaGeoLive) {
                    String M09 = bd.M0(2131754596, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = F5(M09, "un1", chat);
                    return;
                }
                if (n1(this.C) instanceof TLRPC.TL_messageMediaContact) {
                    String M010 = bd.M0(2131754600, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = F5(M010, "un1", chat);
                    return;
                }
                if (n1(this.C) instanceof TLRPC.TL_messageMediaPoll) {
                    if (((TLRPC.TL_messageMediaPoll) n1(this.C)).poll.quiz) {
                        String M011 = bd.M0(2131754590, null);
                        if (user != 0) {
                            chat = user;
                        }
                        this.v = F5(M011, "un1", chat);
                        return;
                    }
                    String M012 = bd.M0(2131754591, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = F5(M012, "un1", chat);
                    return;
                }
                if (n1(this.C) instanceof TLRPC.TL_messageMediaPhoto) {
                    String M013 = bd.M0(2131754592, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = F5(M013, "un1", chat);
                    return;
                }
                if (n1(this.C) instanceof TLRPC.TL_messageMediaPaidMedia) {
                    this.v = bd.G((int) ((TLRPC.TL_messageMediaPaidMedia) n1(this.C)).stars_amount, "NotificationPinnedPaidMedia", chat != null ? chat.title : l10.p(user));
                    return;
                }
                if (n1(this.C) instanceof TLRPC.TL_messageMediaGame) {
                    String a02 = bd.a0("ActionPinnedGame", null, 2131754598, "🎮 " + n1(this.C).game.title);
                    if (user != 0) {
                        chat = user;
                    }
                    CharSequence F5 = F5(a02, "un1", chat);
                    this.v = F5;
                    this.v = i6.m(F5, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), false, null, 0);
                    return;
                }
                CharSequence charSequence = this.C.v;
                if (charSequence == null || charSequence.length() <= 0) {
                    String M014 = bd.M0(2131754593, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = F5(M014, "un1", chat);
                    return;
                }
                CharSequence cloneSpans = org.telegram.ui.Components.p5.cloneSpans(this.C.v);
                if (cloneSpans.length() > 20) {
                    cloneSpans = cloneSpans.subSequence(0, 20);
                    z10 = true;
                } else {
                    z10 = false;
                }
                CharSequence m10 = i6.m(cloneSpans, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), true, null, 0);
                zi ziVar2 = this.C;
                if (ziVar2 != null && ziVar2.k != null) {
                    m10 = ziVar2.B5(m10, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt());
                }
                li.h(this.C, (Spannable) m10);
                if (z10) {
                    if (m10 instanceof SpannableStringBuilder) {
                        ((SpannableStringBuilder) m10).append((CharSequence) "...");
                    } else if (m10 != null) {
                        m10 = new SpannableStringBuilder(m10).append((CharSequence) "...");
                    }
                }
                SpannableStringBuilder m0 = g0.m0(bd.M0(2131754587, null), m10);
                if (user != 0) {
                    chat = user;
                }
                this.v = F5(m0, "un1", chat);
                return;
            }
        }
        String M015 = bd.M0(2131754593, null);
        if (user != 0) {
            chat = user;
        }
        this.v = F5(M015, "un1", chat);
    }

    public final boolean q2() {
        TLRPC.MessageMedia messageMedia = this.k.media;
        return (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty()) ? false : true;
    }

    public final boolean q3() {
        TLRPC.Message message = this.k;
        return (message.from_id instanceof TLRPC.TL_peerUser) && !message.post;
    }

    public final boolean q4() {
        int i3;
        TLRPC.Chat M0;
        Boolean bool = this.r2;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.k != null && (((i3 = this.D) == 1 || i3 == 3 || i3 == 9 || i3 == 8 || i3 == 5) && !this.z0 && !this.h2 && !Q3())) {
            TLRPC.Message message = this.k;
            if (message.send_state == 0) {
                if (!message.restriction_reason.isEmpty()) {
                    for (int i10 = 0; i10 < this.k.restriction_reason.size(); i10++) {
                        TLRPC.RestrictionReason restrictionReason = this.k.restriction_reason.get(i10);
                        if ("sensitive".equals(restrictionReason.reason)) {
                            if (!"all".equals(restrictionReason.platform)) {
                                if ("android".equals(restrictionReason.platform) || "android-ios".equals(restrictionReason.platform) || "ios-android".equals(restrictionReason.platform)) {
                                    t0.u();
                                    if (!r2.a()) {
                                    }
                                }
                                if ("android-all".equals(restrictionReason.platform)) {
                                }
                            }
                            this.r2 = Boolean.TRUE;
                            return true;
                        }
                    }
                }
                if (B0(this.k) < 0 && (M0 = hp.s1(this.I1).M0(Long.valueOf(-B0(this.k)))) != null && M0.restriction_reason != null) {
                    for (int i11 = 0; i11 < M0.restriction_reason.size(); i11++) {
                        TLRPC.RestrictionReason restrictionReason2 = M0.restriction_reason.get(i11);
                        if ("sensitive".equals(restrictionReason2.reason)) {
                            if (!"all".equals(restrictionReason2.platform)) {
                                if ("android".equals(restrictionReason2.platform) || "android-ios".equals(restrictionReason2.platform) || "ios-android".equals(restrictionReason2.platform)) {
                                    t0.u();
                                    if (!r2.a()) {
                                    }
                                }
                                if ("android-all".equals(restrictionReason2.platform)) {
                                }
                            }
                            this.r2 = Boolean.TRUE;
                            return true;
                        }
                    }
                }
                this.r2 = Boolean.FALSE;
            }
        }
        return false;
    }

    public final boolean q5() {
        long B0 = B0(this.k);
        int i3 = this.I1;
        return (!t3.o0(i3, B0) || Z0() == h10.i(i3).e() || Q3()) ? false : true;
    }

    public final void r0(boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TL_iv.RichMessage richMessage;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        if (r2()) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) this.k.media.extended_media.get(0);
            if (z10) {
                d6(this.n0, Collections.singletonList(tL_messageExtendedMediaPreview.thumb));
            } else {
                this.n0 = new ArrayList(Collections.singletonList(tL_messageExtendedMediaPreview.thumb));
            }
            this.l0 = this.k;
            if (this.G1 == null) {
                Q();
                return;
            }
            return;
        }
        TLRPC.Message message = this.k;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) {
                TLRPC.Photo photo = messageAction.photo;
                if (z10) {
                    ArrayList arrayList12 = this.n0;
                    if (arrayList12 != null && !arrayList12.isEmpty()) {
                        for (int i3 = 0; i3 < this.n0.size(); i3++) {
                            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.n0.get(i3);
                            int i10 = 0;
                            while (true) {
                                if (i10 < photo.sizes.size()) {
                                    TLRPC.PhotoSize photoSize2 = photo.sizes.get(i10);
                                    if (!(photoSize2 instanceof TLRPC.TL_photoSizeEmpty) && photoSize2.type.equals(photoSize.type)) {
                                        photoSize.location = photoSize2.location;
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        }
                    }
                } else {
                    this.n0 = new ArrayList(photo.sizes);
                }
                if (photo.dc_id != 0 && (arrayList11 = this.n0) != null) {
                    int size = arrayList11.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) this.n0.get(i11)).location;
                        if (fileLocation != null) {
                            fileLocation.dc_id = photo.dc_id;
                            fileLocation.file_reference = photo.file_reference;
                        }
                    }
                }
                this.l0 = this.k.action.photo;
                return;
            }
            return;
        }
        if (this.n != null || this.o != null) {
            if (TextUtils.isEmpty(this.u) && X2(this.n)) {
                if (!z10 || (arrayList = this.n0) == null) {
                    ArrayList arrayList13 = new ArrayList();
                    this.n0 = arrayList13;
                    arrayList13.addAll(this.n.thumbs);
                } else if (!arrayList.isEmpty()) {
                    d6(this.n0, this.n.thumbs);
                }
                this.l0 = this.n;
                return;
            }
            return;
        }
        if (o1(message) == null || (o1(this.k) instanceof TLRPC.TL_messageMediaEmpty)) {
            TLRPC.Message message2 = this.k;
            if (message2 != null && (richMessage = message2.rich_message) != null) {
                TLRPC.Document a02 = a0(richMessage.blocks, richMessage);
                TL_iv.RichMessage richMessage2 = this.k.rich_message;
                TLRPC.Photo W = richMessage2 != null ? W(richMessage2.blocks, richMessage2) : null;
                if (a02 != null) {
                    if (X2(a02)) {
                        if (z10) {
                            ArrayList arrayList14 = this.n0;
                            if (arrayList14 != null && !arrayList14.isEmpty()) {
                                d6(this.n0, a02.thumbs);
                            }
                        } else {
                            ArrayList arrayList15 = new ArrayList();
                            this.n0 = arrayList15;
                            arrayList15.addAll(a02.thumbs);
                        }
                        this.l0 = a02;
                        return;
                    }
                    return;
                }
                if (W != null) {
                    if (!z10 || (arrayList4 = this.n0) == null) {
                        this.n0 = new ArrayList(W.sizes);
                    } else if (!arrayList4.isEmpty()) {
                        d6(this.n0, W.sizes);
                    }
                    this.l0 = W;
                    if (this.G1 == null) {
                        Q();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.MessageMedia messageMedia = this.Y0;
            if (messageMedia == null) {
                if (this.T0 != null) {
                    if (!z10 || (arrayList2 = this.n0) == null) {
                        this.n0 = new ArrayList(this.T0.sizes);
                    } else if (!arrayList2.isEmpty()) {
                        d6(this.n0, this.T0.sizes);
                    }
                    this.l0 = this.T0;
                    if (this.G1 == null) {
                        Q();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.Photo photo2 = messageMedia.photo;
            TLRPC.Document document = messageMedia.document;
            if (photo2 != null) {
                if (!z10 || (arrayList3 = this.n0) == null) {
                    this.n0 = new ArrayList(photo2.sizes);
                } else if (!arrayList3.isEmpty()) {
                    d6(this.n0, photo2.sizes);
                }
                this.l0 = photo2;
                return;
            }
            if (document == null || !X2(document)) {
                return;
            }
            if (z10) {
                ArrayList arrayList16 = this.n0;
                if (arrayList16 != null && !arrayList16.isEmpty()) {
                    d6(this.n0, document.thumbs);
                }
            } else {
                ArrayList arrayList17 = new ArrayList();
                this.n0 = arrayList17;
                arrayList17.addAll(document.thumbs);
            }
            this.l0 = document;
            return;
        }
        if (o1(this.k) instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.Photo photo3 = o1(this.k).photo;
            if (z10 && ((arrayList10 = this.n0) == null || arrayList10.size() == photo3.sizes.size())) {
                ArrayList arrayList18 = this.n0;
                if (arrayList18 != null && !arrayList18.isEmpty()) {
                    for (int i12 = 0; i12 < this.n0.size(); i12++) {
                        TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.n0.get(i12);
                        if (photoSize3 != null) {
                            int i13 = 0;
                            while (true) {
                                if (i13 >= photo3.sizes.size()) {
                                    break;
                                }
                                TLRPC.PhotoSize photoSize4 = photo3.sizes.get(i13);
                                if (photoSize4 != null && !(photoSize4 instanceof TLRPC.TL_photoSizeEmpty)) {
                                    if (photoSize4.type.equals(photoSize3.type)) {
                                        photoSize3.location = photoSize4.location;
                                        break;
                                    } else if ("s".equals(photoSize3.type) && (photoSize4 instanceof TLRPC.TL_photoStrippedSize)) {
                                        this.n0.set(i12, photoSize4);
                                        break;
                                    }
                                }
                                i13++;
                            }
                        }
                    }
                }
            } else {
                this.n0 = new ArrayList(photo3.sizes);
            }
            this.l0 = o1(this.k).photo;
            return;
        }
        if (o1(this.k) instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Photo photo4 = ((TLRPC.TL_messageMediaDocument) o1(this.k)).video_cover;
            if (photo4 == null) {
                TLRPC.Document F0 = F0();
                if (X2(F0)) {
                    if (!z10 || (arrayList8 = this.n0) == null) {
                        ArrayList arrayList19 = new ArrayList();
                        this.n0 = arrayList19;
                        arrayList19.addAll(F0.thumbs);
                    } else if (!arrayList8.isEmpty()) {
                        d6(this.n0, F0.thumbs);
                    }
                    this.l0 = F0;
                    return;
                }
                return;
            }
            if (z10 && ((arrayList9 = this.n0) == null || arrayList9.size() == photo4.sizes.size())) {
                ArrayList arrayList20 = this.n0;
                if (arrayList20 != null && !arrayList20.isEmpty()) {
                    for (int i14 = 0; i14 < this.n0.size(); i14++) {
                        TLRPC.PhotoSize photoSize5 = (TLRPC.PhotoSize) this.n0.get(i14);
                        if (photoSize5 != null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= photo4.sizes.size()) {
                                    break;
                                }
                                TLRPC.PhotoSize photoSize6 = photo4.sizes.get(i15);
                                if (photoSize6 != null && !(photoSize6 instanceof TLRPC.TL_photoSizeEmpty)) {
                                    if (photoSize6.type.equals(photoSize5.type)) {
                                        photoSize5.location = photoSize6.location;
                                        break;
                                    } else if ("s".equals(photoSize5.type) && (photoSize6 instanceof TLRPC.TL_photoStrippedSize)) {
                                        this.n0.set(i14, photoSize6);
                                        break;
                                    }
                                }
                                i15++;
                            }
                        }
                    }
                }
            } else {
                this.n0 = new ArrayList(photo4.sizes);
            }
            this.l0 = photo4;
            return;
        }
        if (!(o1(this.k) instanceof TLRPC.TL_messageMediaGame)) {
            if (o1(this.k) instanceof TLRPC.TL_messageMediaWebPage) {
                TLRPC.Photo photo5 = o1(this.k).webpage.photo;
                TLRPC.Document document2 = o1(this.k).webpage.document;
                if (photo5 != null) {
                    if (!z10 || (arrayList5 = this.n0) == null) {
                        this.n0 = new ArrayList(photo5.sizes);
                    } else if (!arrayList5.isEmpty()) {
                        d6(this.n0, photo5.sizes);
                    }
                    this.l0 = photo5;
                    return;
                }
                if (document2 == null || !X2(document2)) {
                    return;
                }
                if (z10) {
                    ArrayList arrayList21 = this.n0;
                    if (arrayList21 != null && !arrayList21.isEmpty()) {
                        d6(this.n0, document2.thumbs);
                    }
                } else {
                    ArrayList arrayList22 = new ArrayList();
                    this.n0 = arrayList22;
                    arrayList22.addAll(document2.thumbs);
                }
                this.l0 = document2;
                return;
            }
            return;
        }
        TLRPC.Document document3 = o1(this.k).game.document;
        if (document3 != null && X2(document3)) {
            if (z10) {
                ArrayList arrayList23 = this.n0;
                if (arrayList23 != null && !arrayList23.isEmpty()) {
                    d6(this.n0, document3.thumbs);
                }
            } else {
                ArrayList arrayList24 = new ArrayList();
                this.n0 = arrayList24;
                arrayList24.addAll(document3.thumbs);
            }
            this.l0 = document3;
        }
        TLRPC.Photo photo6 = o1(this.k).game.photo;
        if (photo6 != null) {
            if (!z10 || (arrayList7 = this.o0) == null) {
                this.o0 = new ArrayList(photo6.sizes);
            } else if (!arrayList7.isEmpty()) {
                d6(this.o0, photo6.sizes);
            }
            this.m0 = photo6;
        }
        if (this.n0 != null || (arrayList6 = this.o0) == null) {
            return;
        }
        this.n0 = arrayList6;
        this.o0 = null;
        this.l0 = this.m0;
        this.m0 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ad, code lost:
    
        if (r0 != null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b1, code lost:
    
        if (r11.ttl_seconds == 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011e, code lost:
    
        if (L4(r7.document) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0120, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012e, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) r8).flags & 4) != 0) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence r1(TLRPC.MessageMedia messageMedia) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        String n4;
        String str = null;
        if (messageMedia instanceof TLRPC.TL_messageMediaGiveaway) {
            return bd.M0(2131753492, null);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
            return bd.M0(2131753392, null);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
            if (!messageMedia.via_mention) {
                return bd.M0(2131750544, null);
            }
            int i3 = this.I1;
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(messageMedia.user_id));
            if (a22 != null && (n4 = l10.n(a22)) != null) {
                StringBuilder sb2 = new StringBuilder();
                com.google.android.recaptcha.internal.a.s(sb2, hp.s1(i3).V2, "/", n4, "/s/");
                sb2.append(messageMedia.id);
                str = sb2.toString();
            }
            if (str == null) {
                return "";
            }
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new x31("https://".concat(str), new ty0()), 0, spannableString.length(), 33);
            return spannableString;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDice) {
            TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) messageMedia;
            return TextUtils.isEmpty(tL_messageMediaDice.emoticon) ? "🎲" : tL_messageMediaDice.emoticon.replace("️", "");
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
            return ((TLRPC.TL_messageMediaPoll) messageMedia).poll.quiz ? bd.M0(2131746453, null) : bd.M0(2131747193, null);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            return (todoList == null || (tL_textWithEntities = todoList.title) == null || tL_textWithEntities.text.isEmpty()) ? bd.M0(2131748477, null) : bd.V(null, null, 2131748475, h0(tL_messageMediaToDo.todo.title, Q3()));
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            int size = tL_messageMediaPaidMedia.extended_media.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i10);
                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                    TLRPC.MessageMedia messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                    }
                    z10 = false;
                } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                }
                if (z10) {
                    break;
                }
            }
            return ci.wb.T0(bd.a0(null, null, 2131753949, size == 1 ? bd.M0(z10 ? 2131753933 : 2131753948, null) : bd.G(size, z10 ? "Media" : "Photos", new Object[0])));
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            return (messageMedia.ttl_seconds == 0 || (this.k instanceof TLRPC.TL_message_secret)) ? d1() != 0 ? bd.M0(2131754305, null) : E3() ? bd.M0(2131753962, null) : bd.M0(2131753948, null) : bd.M0(2131753977, null);
        }
        if (messageMedia != null) {
            if (!L4(messageMedia.document)) {
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.Document document = messageMedia.document;
                    if (!(document instanceof TLRPC.TL_documentEmpty)) {
                    }
                }
            }
            return (messageMedia.ttl_seconds == 0 || (this.k instanceof TLRPC.TL_message_secret)) ? bd.M0(2131753933, null) : messageMedia.voice ? bd.M0(2131753929, null) : messageMedia.round ? bd.M0(2131753940, null) : bd.M0(2131753976, null);
        }
        if (messageMedia != null && R4(messageMedia.document)) {
            return bd.M0(2131753982, null);
        }
        if (messageMedia != null && j4(messageMedia.document)) {
            return bd.M0(2131753941, null);
        }
        if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
            return bd.M0(2131753961, null);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaGeoLive) {
            return bd.M0(2131753966, null);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaContact) {
            return bd.M0(2131753979, null);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
            return this.k.message;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
            return messageMedia.description;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            return bd.M0(2131743839, null);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaWidget) {
            return TextUtils.isEmpty(this.k.message) ? bd.M0(2131753926, null) : this.k.message;
        }
        if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
            return null;
        }
        if (v4(messageMedia.document) || L2(messageMedia.document, true)) {
            String V1 = V1();
            return (V1 == null || V1.length() <= 0) ? bd.M0(2131753936, null) : a1.g.C(V1, " ", bd.M0(2131753936, null));
        }
        if (J3()) {
            return bd.M0(2131753952, null);
        }
        if (u3(this.k)) {
            return bd.M0(2131753971, null);
        }
        String B = w7.B(messageMedia.document);
        return !TextUtils.isEmpty(B) ? B : bd.M0(2131753975, null);
    }

    public final boolean r2() {
        TLRPC.MessageMedia messageMedia = this.k.media;
        return (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(this.k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) ? false : true;
    }

    public final boolean r3() {
        return u3(this.k);
    }

    public final boolean r4() {
        TLRPC.Message message = this.k;
        return message.send_state == 0 || message.id > 0;
    }

    public boolean s(TLRPC.Chat chat, boolean z10) {
        TLRPC.Message message;
        boolean y42 = y4();
        int i3 = this.I1;
        if (y42 && (message = this.k) != null && message.dialog_id == h10.i(i3).e()) {
            return true;
        }
        return (this.T == 0 && this.P0 == null && r(i3, z10, this.k, chat)) || d3(this.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SpannableStringBuilder s0(String str, String str2) {
        TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval;
        boolean z10;
        boolean z11;
        TLRPC.Message message;
        TLRPC.Message message2 = this.k;
        if (message2 != null) {
            TLRPC.MessageAction messageAction = message2.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (tL_messageActionSuggestedPostApproval != null) {
                    return null;
                }
                dg.a l10 = dg.a.l(tL_messageActionSuggestedPostApproval.price);
                long o10 = m5.o(this.k.peer_id);
                int i3 = this.I1;
                boolean z12 = t3.z(i3, 24, o10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                boolean z13 = false;
                if (tL_messageActionSuggestedPostApproval.balance_too_low) {
                    k5.q(null, null, 2131744377, new Object[]{str2}, spannableStringBuilder);
                    return spannableStringBuilder;
                }
                int i10 = 2;
                if (tL_messageActionSuggestedPostApproval.rejected) {
                    zi ziVar = this.C;
                    if (ziVar == null || (message = ziVar.k) == null) {
                        z10 = false;
                        z11 = true;
                    } else {
                        long o11 = m5.o(message.from_id);
                        z11 = o11 == m5.o(this.C.k.saved_peer_id);
                        z10 = o11 == h10.i(i3).e();
                    }
                    k5.q(null, null, TextUtils.isEmpty(tL_messageActionSuggestedPostApproval.reject_comment) ? z10 ? 2131744379 : 2131744381 : z10 ? 2131744378 : 2131744380, new Object[]{z11 ? str : str2}, spannableStringBuilder);
                    if (!TextUtils.isEmpty(tL_messageActionSuggestedPostApproval.reject_comment)) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append('\"');
                        spannableStringBuilder.append((CharSequence) tL_messageActionSuggestedPostApproval.reject_comment);
                        spannableStringBuilder.append('\"');
                        spannableStringBuilder.setSpan(new t(hs.u3, i10, z13), length, spannableStringBuilder.length(), 33);
                        return spannableStringBuilder;
                    }
                } else {
                    int g22 = (int) hp.s1(i3).x7.i.g2(TimeUnit.HOURS);
                    int i11 = tL_messageActionSuggestedPostApproval.schedule_date;
                    if (i11 > 0) {
                        k5.q(null, null, tL_messageActionSuggestedPostApproval.schedule_date > ConnectionsManager.getInstance(i3).getCurrentTime() ? z12 ? 2131744375 : 2131744367 : z12 ? 2131744374 : 2131744366, new Object[]{str, bd.x(i11, true)}, spannableStringBuilder);
                    } else {
                        k5.q(null, null, z12 ? 2131744373 : 2131744365, new Object[]{str}, spannableStringBuilder);
                    }
                    if (l10 != null) {
                        dg.b bVar = l10.a;
                        if (!l10.k()) {
                            dg.b bVar2 = dg.b.b;
                            boolean z14 = bVar == bVar2;
                            String a02 = z12 ? bd.a0(null, null, 2131744372, str2, l10.b()) : bd.a0(null, null, 2131744364, l10.b());
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) ci.wb.V0(g0.X2(a02), bVar == bVar2));
                            int i12 = z14 ? z12 ? 2131744370 : 2131744362 : z12 ? 2131744371 : 2131744363;
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            k5.q(null, null, i12, new Object[]{str, Integer.valueOf(g22)}, spannableStringBuilder);
                            int i13 = z14 ? z12 ? 2131744368 : 2131744360 : z12 ? 2131744369 : 2131744361;
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            k5.q(null, null, i13, new Object[]{str, Integer.valueOf(g22)}, spannableStringBuilder);
                        }
                    }
                }
                return spannableStringBuilder;
            }
        }
        tL_messageActionSuggestedPostApproval = null;
        if (tL_messageActionSuggestedPostApproval != null) {
        }
    }

    public final zi s1(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
        TLRPC.TL_message tL_message = null;
        r2 = null;
        TLRPC.Photo photo = null;
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto)) {
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                if (K0(webPage, pageblockvideo.video_id) != webPage.document) {
                    tL_message = new TLRPC.TL_message();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.document = K0(webPage, pageblockvideo.video_id);
                }
                return this;
            }
            tL_message.message = "";
            tL_message.realId = f1();
            tL_message.id = Utilities.b.nextInt();
            TLRPC.Message message = this.k;
            tL_message.date = message.date;
            tL_message.peer_id = message.peer_id;
            tL_message.out = message.out;
            tL_message.from_id = message.from_id;
            return new zi(this.I1, tL_message, false, true);
        }
        long j10 = ((TL_iv.pageBlockPhoto) pageBlock).photo_id;
        if (webPage.cached_page != null) {
            TLRPC.Photo photo2 = webPage.photo;
            if (photo2 == null || photo2.id != j10) {
                int i3 = 0;
                while (true) {
                    if (i3 >= webPage.cached_page.photos.size()) {
                        break;
                    }
                    TLRPC.Photo photo3 = webPage.cached_page.photos.get(i3);
                    if (photo3.id == j10) {
                        photo = photo3;
                        break;
                    }
                    i3++;
                }
            } else {
                photo = photo2;
            }
        }
        if (photo != webPage.photo) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
            tL_message2.media = tL_messageMediaPhoto;
            tL_messageMediaPhoto.photo = photo;
            tL_message = tL_message2;
            tL_message.message = "";
            tL_message.realId = f1();
            tL_message.id = Utilities.b.nextInt();
            TLRPC.Message message2 = this.k;
            tL_message.date = message2.date;
            tL_message.peer_id = message2.peer_id;
            tL_message.out = message2.out;
            tL_message.from_id = message2.from_id;
            return new zi(this.I1, tL_message, false, true);
        }
        return this;
    }

    public final boolean s2() {
        ArrayList arrayList = this.Y1;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final boolean s4() {
        return this.P0 != null;
    }

    public final ej s5() {
        TLRPC.Message message;
        zi ziVar = this.C;
        if (ziVar != null && (message = ziVar.k) != null) {
            TLRPC.SuggestedPost suggestedPost = message.suggested_post;
            if (suggestedPost != null) {
                return ej.b(suggestedPost);
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                return new ej(dg.a.l(((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).price), r0.schedule_date);
            }
        }
        return null;
    }

    public final boolean t() {
        if (!m4() && !f3(this.k)) {
            if (o1(this.k) instanceof TLRPC.TL_messageMediaPhoto) {
                return true;
            }
            if (o1(this.k) instanceof TLRPC.TL_messageMediaDocument) {
                return (S4(this.k) || u4() || K2() || i4()) ? false : true;
            }
            if (G3()) {
                return true;
            }
        }
        return false;
    }

    public final CharSequence t1(ui uiVar, int[] iArr) {
        if (this.J2 || this.E0) {
            return null;
        }
        if (this.K2) {
            return this.v;
        }
        int i3 = this.D;
        if (i3 == 19 || i3 == 15 || i3 == 13) {
            return null;
        }
        CharSequence V8 = org.telegram.ui.wm.V8(this, uiVar, iArr);
        if (V8 == null && U3()) {
            try {
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) this.k.media).poll;
                StringBuilder sb2 = new StringBuilder(poll.question.text);
                sb2.append("\n");
                ArrayList<TLRPC.PollAnswer> arrayList = poll.answers;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    TLRPC.PollAnswer pollAnswer = arrayList.get(i10);
                    i10++;
                    sb2.append("\n🔘 ");
                    TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                    sb2.append(tL_textWithEntities == null ? "" : tL_textWithEntities.text);
                }
                V8 = sb2.toString();
            } catch (Exception unused) {
            }
        }
        if (V8 == null && H3(this.k, true)) {
            V8 = org.telegram.ui.wm.X8(0L, this, false);
        }
        if (V8 == null || !i6.d(V8)) {
            return V8;
        }
        return null;
    }

    public final boolean t2() {
        TLRPC.Message message;
        if (this.E0 || this.h2 || (message = this.k) == null) {
            return false;
        }
        if (!this.L2) {
            TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
            if ((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty()) {
                return true;
            }
        }
        return this.o2 != null;
    }

    public final boolean t4() {
        TLRPC.Message message = this.k;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        return (messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c3, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L186;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        if (f3(this.k)) {
            return false;
        }
        TLRPC.Message message = this.k;
        boolean z10 = this.p1;
        int i3 = this.I1;
        if (z10 && message.date < ConnectionsManager.getInstance(i3).getCurrentTime() - 60) {
            return false;
        }
        if ((chat != null && ((chat.left || chat.kicked) && (!chat.megagroup || !chat.has_link))) || message == null || message.peer_id == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction != null && !(messageAction instanceof TLRPC.TL_messageActionEmpty)) || m3(message) || message.via_bot_id != 0 || message.id < 0) {
            return false;
        }
        TLRPC.MessageMedia o12 = o1(message);
        if ((o12 != null && message.rich_message == null && (j4(o12.document) || v4(o12.document) || L2(o12.document, true) || (o1(message) instanceof TLRPC.TL_messageMediaGeo) || (o1(message) instanceof TLRPC.TL_messageMediaGeoLive) || (o1(message) instanceof TLRPC.TL_messageMediaVenue))) || message.paid_suggested_post_stars || message.paid_suggested_post_ton) {
            return false;
        }
        TLRPC.Peer peer = message.from_id;
        if (peer instanceof TLRPC.TL_peerUser) {
            long j10 = peer.user_id;
            if (j10 == message.peer_id.user_id) {
                if (j10 == h10.i(i3).e()) {
                    if (!(o1(message) instanceof TLRPC.TL_messageMediaGeoLive)) {
                    }
                }
            }
        }
        if (chat == null && message.peer_id.channel_id != 0 && (chat = hp.s1(i3).M0(Long.valueOf(message.peer_id.channel_id))) == null) {
            return false;
        }
        if (o12 != null && message.rich_message == null && !(o12 instanceof TLRPC.TL_messageMediaEmpty) && !(o12 instanceof TLRPC.TL_messageMediaPhoto) && !(o12 instanceof TLRPC.TL_messageMediaDocument) && !(o12 instanceof TLRPC.TL_messageMediaWebPage) && !(o12 instanceof TLRPC.TL_messageMediaPaidMedia) && !(o12 instanceof TLRPC.TL_messageMediaToDo)) {
            return false;
        }
        if ((!t3.T(chat) || chat.megagroup || (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.edit_messages))) && (!message.out || chat == null || !chat.megagroup || (!chat.creator && (((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.pin_messages) && ((tL_chatBannedRights = chat.default_banned_rights) == null || tL_chatBannedRights.pin_messages))))) {
            if (!z10 && Math.abs(message.date - ConnectionsManager.getInstance(i3).getCurrentTime()) > hp.s1(i3).Z2) {
                return false;
            }
            if (message.peer_id.channel_id == 0) {
                if (!message.out) {
                    TLRPC.Peer peer2 = message.from_id;
                    if (!(peer2 instanceof TLRPC.TL_peerUser) || peer2.user_id != h10.i(i3).e()) {
                        return false;
                    }
                }
                if (message.rich_message == null && !(o12 instanceof TLRPC.TL_messageMediaPhoto) && ((!(o12 instanceof TLRPC.TL_messageMediaDocument) || x4(message) || M2(message)) && !(o12 instanceof TLRPC.TL_messageMediaEmpty) && !(o12 instanceof TLRPC.TL_messageMediaWebPage) && !(o12 instanceof TLRPC.TL_messageMediaPaidMedia) && !(o12 instanceof TLRPC.TL_messageMediaToDo) && o12 != null)) {
                    return false;
                }
            } else {
                if (chat == null || !chat.megagroup || !message.out) {
                    if (chat == null || chat.megagroup) {
                        return false;
                    }
                    if (!chat.creator) {
                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = chat.admin_rights;
                        if (tL_chatAdminRights3 == null) {
                            return false;
                        }
                        if (!tL_chatAdminRights3.edit_messages && (!message.out || !tL_chatAdminRights3.post_messages)) {
                            return false;
                        }
                    }
                    if (!message.post) {
                        return false;
                    }
                }
                if (message.rich_message == null && !(o12 instanceof TLRPC.TL_messageMediaPhoto) && ((!(o12 instanceof TLRPC.TL_messageMediaDocument) || x4(message) || M2(message)) && !(o12 instanceof TLRPC.TL_messageMediaEmpty) && !(o12 instanceof TLRPC.TL_messageMediaWebPage) && !(o12 instanceof TLRPC.TL_messageMediaPaidMedia) && !(o12 instanceof TLRPC.TL_messageMediaToDo) && o12 != null)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String u0(boolean z10) {
        return t0(F0(), z10);
    }

    public final String u1() {
        TLRPC.Document F0 = F0();
        if (F0 != null) {
            return F0.mime_type;
        }
        if (!(o1(this.k) instanceof TLRPC.TL_messageMediaInvoice)) {
            return o1(this.k) instanceof TLRPC.TL_messageMediaPhoto ? "image/jpeg" : (!(o1(this.k) instanceof TLRPC.TL_messageMediaWebPage) || o1(this.k).webpage.photo == null) ? "" : "image/jpeg";
        }
        TLRPC.WebDocument webDocument = ((TLRPC.TL_messageMediaInvoice) o1(this.k)).webPhoto;
        return webDocument != null ? webDocument.mime_type : "";
    }

    public final boolean u2() {
        TLRPC.MessageMedia messageMedia;
        return (!this.h2 && (((messageMedia = this.k.media) != null && messageMedia.spoiler) || n5())) || y3();
    }

    public final boolean u4() {
        int i3 = this.D;
        return i3 != 1000 ? i3 == 13 : v4(F0()) || O4(F0());
    }

    public final boolean v(TLRPC.Chat chat) {
        TLRPC.Message message = this.k;
        if (message.video_processing_pending) {
            return false;
        }
        if (chat == null && message.peer_id.channel_id != 0 && (chat = hp.s1(this.I1).M0(Long.valueOf(message.peer_id.channel_id))) == null) {
            return false;
        }
        if (!t3.T(chat) || chat.megagroup || chat.creator) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
        if (tL_chatAdminRights != null) {
            return tL_chatAdminRights.edit_messages || message.out;
        }
        return false;
    }

    public final boolean v2() {
        TLRPC.Message message = this.k;
        if (message != null && message.entities != null) {
            for (int i3 = 0; i3 < this.k.entities.size(); i3++) {
                if (!(this.k.entities.get(i3) instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean v3() {
        return this.D == 26;
    }

    public final boolean w() {
        int i3;
        return (c4(this.k) || (i3 = this.D) == 30 || i3 == 31 || i3 == 32 || i3 == 33 || i3 == 35 || i3 == 37 || (this.k instanceof TLRPC.TL_message_secret) || n5() || D3() || this.D == 16 || s4() || this.k.noforwards) ? false : true;
    }

    public final TLRPC.Chat w0(AbstractMap abstractMap, a0.h hVar, long j10) {
        TLRPC.Chat chat = abstractMap != null ? (TLRPC.Chat) abstractMap.get(Long.valueOf(j10)) : hVar != null ? (TLRPC.Chat) hVar.f(j10) : null;
        return chat == null ? hp.s1(this.I1).M0(Long.valueOf(j10)) : chat;
    }

    public final boolean w2(dh.n0 n0Var) {
        if (x2() && n0Var != null) {
            for (int i3 = 0; i3 < this.k.reactions.results.size(); i3++) {
                if (n0Var.f(this.k.reactions.results.get(i3).reaction)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean w3() {
        return v3() || x3();
    }

    public final boolean x() {
        return y(F0());
    }

    public final long x0() {
        TLRPC.Peer peer = this.k.peer_id;
        if (peer instanceof TLRPC.TL_peerChat) {
            return peer.chat_id;
        }
        if (peer instanceof TLRPC.TL_peerChannel) {
            return peer.channel_id;
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x003d, code lost:
    
        if (r5.round_message != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0146 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String x1(boolean z10) {
        TLRPC.User a22;
        TLRPC.Chat M0;
        String str;
        TLRPC.Chat chat;
        TLRPC.Document F0 = F0();
        if (F0 != null) {
            boolean z11 = false;
            for (int i3 = 0; i3 < F0.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i3);
                if (!(documentAttribute instanceof TLRPC.TL_documentAttributeAudio)) {
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    }
                    if (z11) {
                        if (!z10) {
                            return null;
                        }
                        if (!Q3()) {
                            TLRPC.MessageFwdHeader messageFwdHeader = this.k.fwd_from;
                            int i10 = this.I1;
                            if (messageFwdHeader != null) {
                                TLRPC.Peer peer = messageFwdHeader.from_id;
                                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == h10.i(i10).e()) {
                                }
                            }
                            TLRPC.Message message = this.k;
                            TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                            if (messageFwdHeader2 != null && (messageFwdHeader2.from_id instanceof TLRPC.TL_peerChannel)) {
                                M0 = hp.s1(i10).M0(Long.valueOf(this.k.fwd_from.from_id.channel_id));
                            } else if (messageFwdHeader2 == null || !(messageFwdHeader2.from_id instanceof TLRPC.TL_peerChat)) {
                                if (messageFwdHeader2 != null && (messageFwdHeader2.from_id instanceof TLRPC.TL_peerUser)) {
                                    a22 = hp.s1(i10).a2(Long.valueOf(this.k.fwd_from.from_id.user_id));
                                } else {
                                    if (messageFwdHeader2 != null && (str = messageFwdHeader2.from_name) != null) {
                                        return str;
                                    }
                                    TLRPC.Peer peer2 = message.from_id;
                                    if (peer2 instanceof TLRPC.TL_peerChat) {
                                        M0 = hp.s1(i10).M0(Long.valueOf(this.k.from_id.chat_id));
                                    } else if (peer2 instanceof TLRPC.TL_peerChannel) {
                                        M0 = hp.s1(i10).M0(Long.valueOf(this.k.from_id.channel_id));
                                    } else if (peer2 != null || message.peer_id.channel_id == 0) {
                                        a22 = hp.s1(i10).a2(Long.valueOf(this.k.from_id.user_id));
                                    } else {
                                        M0 = hp.s1(i10).M0(Long.valueOf(this.k.peer_id.channel_id));
                                    }
                                }
                                chat = null;
                                if (a22 == null) {
                                    return l10.p(a22);
                                }
                                if (chat != null) {
                                    return chat.title;
                                }
                            } else {
                                M0 = hp.s1(i10).M0(Long.valueOf(this.k.fwd_from.from_id.chat_id));
                            }
                            chat = M0;
                            a22 = null;
                            if (a22 == null) {
                            }
                        }
                        return bd.M0(2131750511, null);
                    }
                } else if (!documentAttribute.voice) {
                    String str2 = documentAttribute.performer;
                    return (TextUtils.isEmpty(str2) && z10) ? bd.M0(2131753900, null) : str2;
                }
                z11 = true;
                if (z11) {
                }
            }
        }
        return bd.M0(2131753900, null);
    }

    public final boolean x2() {
        TLRPC.TL_messageReactions tL_messageReactions = this.k.reactions;
        return (tL_messageReactions == null || tL_messageReactions.results.isEmpty()) ? false : true;
    }

    public final boolean x3() {
        return this.D == 28;
    }

    public final boolean x5() {
        if (!T4() && F0() != null && zf.c.i.contains(F0().mime_type) && F0().size < hp.s1(this.I1).l4 * 2) {
            for (int i3 = 0; i3 < F0().attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = F0().attributes.get(i3);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration < 5.0d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final ArrayList y0() {
        ArrayList arrayList = new ArrayList();
        if (this.k.reactions != null) {
            for (int i3 = 0; i3 < this.k.reactions.results.size(); i3++) {
                if (this.k.reactions.results.get(i3).chosen) {
                    arrayList.add(dh.n0.d(this.k.reactions.results.get(i3).reaction));
                }
            }
        }
        return arrayList;
    }

    public final boolean y2() {
        TLRPC.MessageReplies messageReplies = this.k.replies;
        return messageReplies != null && messageReplies.replies > 0;
    }

    public final boolean y3() {
        return q4() && !hp.s1(this.I1).S4();
    }

    public final boolean y4() {
        return this.l != null;
    }

    public final boolean z() {
        if (d3(this.k)) {
            return false;
        }
        TLRPC.Message message = this.k;
        if (message instanceof TLRPC.TL_messageService) {
            return message.reactions_are_possible;
        }
        return true;
    }

    public final String z1(boolean z10) {
        TLRPC.Document F0 = F0();
        if (F0 != null) {
            for (int i3 = 0; i3 < F0.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    if (documentAttribute.voice) {
                        if (z10) {
                            return bd.s(this.k.date, true);
                        }
                        return null;
                    }
                    String str = documentAttribute.title;
                    if (str != null && str.length() != 0) {
                        return str;
                    }
                    String B = w7.B(F0);
                    return (TextUtils.isEmpty(B) && z10) ? bd.M0(2131753899, null) : B;
                }
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.round_message) {
                    if (!c4(this.k)) {
                        return bd.s(this.k.date, true);
                    }
                    StringBuilder sb2 = new StringBuilder("/");
                    String K1 = K1(this.k);
                    if (K1 == null) {
                        lg.t1 c2 = lg.u1.f(this.I1).c(J1(this.k));
                        K1 = c2 != null ? c2.b : "";
                    }
                    sb2.append(K1);
                    return bd.a0(null, null, 2131752726, sb2.toString());
                }
            }
            String B2 = w7.B(F0);
            if (!TextUtils.isEmpty(B2)) {
                return B2;
            }
        }
        return bd.M0(2131753899, null);
    }

    public final boolean z2() {
        TLRPC.MessageMedia messageMedia = this.k.media;
        return (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(this.k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) ? false : true;
    }

    public final boolean z3() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.k.fwd_from;
        return messageFwdHeader != null && messageFwdHeader.imported;
    }

    public final boolean z4() {
        TLRPC.Message message = this.k;
        return message != null && (message.media instanceof TLRPC.TL_messageMediaStory);
    }

    public zi(int i3, TLRPC.Message message, String str, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.D = 1000;
        this.c0 = -1.0f;
        this.H0 = -1L;
        this.c1 = -1;
        this.d1 = -1L;
        this.Z1 = true;
        this.g2 = new Drawable[1];
        this.I2 = false;
        this.J2 = false;
        this.K2 = false;
        this.a = z10 ? 2 : 1;
        this.I1 = i3;
        this.b = str2;
        this.c = str3;
        this.v = str;
        this.k = message;
        this.f = z11;
        this.g = z12;
        this.i = z13;
    }

    public zi(int i3, TLRPC.Message message, boolean z10, boolean z11) {
        this(i3, message, null, null, null, null, null, z10, z11, 0L);
    }

    public zi(int i3, TLRPC.Message message, zi ziVar, boolean z10, boolean z11) {
        this(i3, message, ziVar, null, null, null, null, z10, z11, 0L);
    }

    public zi(int i3, TLRPC.Message message, AbstractMap abstractMap, AbstractMap abstractMap2, boolean z10, boolean z11) {
        this(i3, message, abstractMap, abstractMap2, z10, z11, 0L);
    }

    public zi(int i3, TLRPC.Message message, AbstractMap abstractMap, AbstractMap abstractMap2, boolean z10, boolean z11, long j10) {
        this(i3, message, null, abstractMap, abstractMap2, null, null, z10, z11, j10);
    }

    public zi(int i3, TLRPC.Message message, a0.h hVar, a0.h hVar2, boolean z10, boolean z11) {
        this(i3, message, null, null, null, hVar, hVar2, z10, z11, 0L, false, false, false, 0);
    }

    public zi(int i3, TLRPC.Message message, zi ziVar, AbstractMap abstractMap, AbstractMap abstractMap2, a0.h hVar, a0.h hVar2, boolean z10, boolean z11, long j10) {
        this(i3, message, ziVar, abstractMap, abstractMap2, hVar, hVar2, z10, z11, j10, false, false, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public zi(int i3, TLRPC.Message message, zi ziVar, AbstractMap abstractMap, AbstractMap abstractMap2, a0.h hVar, a0.h hVar2, boolean z10, boolean z11, long j10, boolean z12, boolean z13, boolean z14, int i10) {
        AbstractMap abstractMap3;
        a0.h hVar3;
        ?? r15;
        TextPaint textPaint;
        this.D = 1000;
        this.c0 = -1.0f;
        this.H0 = -1L;
        this.c1 = -1;
        this.d1 = -1L;
        this.Z1 = true;
        this.g2 = new Drawable[1];
        this.I2 = false;
        this.J2 = false;
        this.K2 = false;
        org.telegram.ui.ActionBar.k6.Q();
        this.h2 = z12;
        this.i2 = z13;
        this.l2 = z14 || B0(message) == h10.i(i3).e();
        this.n2 = i10;
        this.I1 = i3;
        this.k = message;
        this.C = ziVar;
        this.T = j10;
        this.l1 = !message.out && message.unread;
        TLRPC.Message message2 = message.replyMessage;
        if (message2 != null) {
            hVar3 = hVar;
            r15 = 0;
            abstractMap3 = abstractMap;
            this.C = new zi(i3, message2, null, abstractMap3, abstractMap2, hVar3, hVar2, false, z11, j10);
        } else {
            abstractMap3 = abstractMap;
            hVar3 = hVar;
            r15 = 0;
        }
        TLRPC.Peer peer = message.from_id;
        if (peer instanceof TLRPC.TL_peerUser) {
            e2(abstractMap3, hVar3, peer.user_id);
        }
        c6(abstractMap3, abstractMap2, hVar3, hVar2);
        M5();
        if (z10) {
            h6(r15);
        }
        j5();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(this.k.date * 1000);
        int i11 = gregorianCalendar.get(6);
        int i12 = gregorianCalendar.get(1);
        int i13 = gregorianCalendar.get(2);
        Integer valueOf = Integer.valueOf(i12);
        Integer valueOf2 = Integer.valueOf(i13);
        Integer valueOf3 = Integer.valueOf(i11);
        Object[] objArr = new Object[3];
        objArr[r15] = valueOf;
        objArr[1] = valueOf2;
        objArr[2] = valueOf3;
        this.W = String.format("%d_%02d_%02d", objArr);
        this.X = (i11 * 1000000) + (i13 * 10000) + i12;
        Integer valueOf4 = Integer.valueOf(i12);
        Integer valueOf5 = Integer.valueOf(i13);
        Object[] objArr2 = new Object[2];
        objArr2[r15] = valueOf4;
        objArr2[1] = valueOf5;
        this.Y = String.format("%d_%02d", objArr2);
        P(r15);
        k0();
        if (z10) {
            if (o1(this.k) instanceof TLRPC.TL_messageMediaGame) {
                textPaint = org.telegram.ui.ActionBar.k6.x2;
            } else {
                textPaint = org.telegram.ui.ActionBar.k6.o2;
            }
            int[] iArr = i() ? new int[1] : null;
            CharSequence m10 = i6.m(this.v, textPaint.getFontMetricsInt(), r15, iArr, r15);
            this.v = m10;
            Spannable B5 = B5(m10, textPaint.getFontMetricsInt());
            this.v = B5;
            if (iArr != null && iArr[r15] > 1) {
                E5(B5, iArr);
            }
            H(iArr);
            G();
            M5();
            TLRPC.Document F0 = F0();
            if (F0 != null) {
                this.F1 = t5.f(F0, org.telegram.ui.ActionBar.k6.Zc, 1.0f, null);
            }
        }
        this.Q1 = z10;
        r0(r15);
        if (z11) {
            K(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0275, code lost:
    
        if ((r11.new_participant instanceof org.telegram.tgnet.TLRPC.TL_channelParticipant) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0478, code lost:
    
        if (r10.until_date != r15.until_date) goto L207;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x1ce1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x1d32  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x1d37  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04fc A[LOOP:0: B:263:0x04b7->B:278:0x04fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0518 A[EDGE_INSN: B:279:0x0518->B:280:0x0518 BREAK  A[LOOP:0: B:263:0x04b7->B:278:0x04fc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x1dd0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x1ddf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x1df1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x1dfd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x1e08  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x1e40  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0cf2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x1e0c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x1e00  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x1de4  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x1dc3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x1d34  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zi(int i3, TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent, ArrayList arrayList, HashMap hashMap, TLRPC.Chat chat, int[] iArr, boolean z10) {
        TLRPC.User user;
        String str;
        TLRPC.ChannelParticipant channelParticipant;
        TLRPC.ChannelParticipant channelParticipant2;
        TLRPC.User a22;
        String L0;
        TLRPC.Chat chat2;
        StringBuilder sb2;
        SpannableString spannableString;
        SpannableString spannableString2;
        SpannableString spannableString3;
        boolean z11;
        SpannableString spannableString4;
        int i10;
        String L02;
        TLRPC.Message message;
        char c2;
        String G;
        TLObject M0;
        TLObject M02;
        TLObject M03;
        char c10;
        String G2;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        TLRPC.WebPage webPage;
        TLRPC.Message message2;
        ArrayList<TLRPC.MessageEntity> arrayList3;
        int i11;
        boolean z12;
        boolean z13;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        TLRPC.Peer peer;
        String str2;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLObject M04;
        TLRPC.User user2;
        String L03;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        StringBuilder sb3;
        boolean z14;
        char c11;
        int i12;
        String G3;
        int i13;
        boolean z15;
        char c12;
        TLObject M05;
        TLRPC.Message message3;
        ArrayList arrayList4;
        String str3;
        int[] iArr2;
        TextPaint textPaint;
        int[] iArr3;
        Spannable B5;
        int i14;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
        this.D = 1000;
        this.c0 = -1.0f;
        this.H0 = -1L;
        this.c1 = -1;
        this.d1 = -1L;
        this.Z1 = true;
        this.g2 = new Drawable[1];
        this.I2 = false;
        this.J2 = false;
        this.K2 = false;
        this.J1 = tL_channelAdminLogEvent2;
        this.I1 = i3;
        TLRPC.User a23 = tL_channelAdminLogEvent2.user_id > 0 ? hp.s1(i3).a2(Long.valueOf(tL_channelAdminLogEvent2.user_id)) : null;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(tL_channelAdminLogEvent2.date * 1000);
        int i15 = gregorianCalendar.get(6);
        int i16 = gregorianCalendar.get(1);
        int i17 = gregorianCalendar.get(2);
        this.W = String.format("%d_%02d_%02d", Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i15));
        this.X = (i15 * 100000) + (i17 * 1000) + i16;
        this.Y = String.format("%d_%02d", Integer.valueOf(i16), Integer.valueOf(i17));
        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
        tL_peerChannel.channel_id = chat.id;
        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeTitle) {
            String str4 = ((TLRPC.TL_channelAdminLogEventActionChangeTitle) channelAdminLogEventAction).new_value;
            if (chat.megagroup) {
                this.v = F5(bd.Y(2131751019, "EventLogEditedGroupTitle", str4), "un1", a23);
            } else {
                this.v = F5(bd.Y(2131751024, "EventLogEditedChannelTitle", str4), "un1", a23);
            }
        } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangePhoto) {
            TLRPC.TL_channelAdminLogEventActionChangePhoto tL_channelAdminLogEventActionChangePhoto = (TLRPC.TL_channelAdminLogEventActionChangePhoto) channelAdminLogEventAction;
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            this.k = tL_messageService;
            if (tL_channelAdminLogEventActionChangePhoto.new_photo instanceof TLRPC.TL_photoEmpty) {
                tL_messageService.action = new TLRPC.TL_messageActionChatDeletePhoto();
                if (chat.megagroup) {
                    this.v = F5(bd.L0(2131750929), "un1", a23);
                } else {
                    this.v = F5(bd.L0(2131750936), "un1", a23);
                }
            } else {
                tL_messageService.action = new TLRPC.TL_messageActionChatEditPhoto();
                this.k.action.photo = tL_channelAdminLogEventActionChangePhoto.new_photo;
                if (chat.megagroup) {
                    if (J4()) {
                        this.v = F5(bd.L0(2131751018), "un1", a23);
                    } else {
                        this.v = F5(bd.L0(2131751021), "un1", a23);
                    }
                } else if (J4()) {
                    this.v = F5(bd.L0(2131751023), "un1", a23);
                } else {
                    this.v = F5(bd.L0(2131751026), "un1", a23);
                }
            }
        } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) {
            if (chat.megagroup) {
                this.v = F5(bd.L0(2131750979), "un1", a23);
            } else {
                this.v = F5(bd.L0(2131751047), "un1", a23);
            }
        } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantLeave) {
            TLRPC.TL_messageService tL_messageService2 = new TLRPC.TL_messageService();
            this.k = tL_messageService2;
            tL_messageService2.action = new TLRPC.TL_messageActionChatDeleteUser();
            this.k.action.user_id = tL_channelAdminLogEvent2.user_id;
            if (chat.megagroup) {
                this.v = F5(bd.L0(2131750974), "un1", a23);
            } else {
                this.v = F5(bd.L0(2131750975), "un1", a23);
            }
        } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantInvite) {
            TLRPC.TL_messageService tL_messageService3 = new TLRPC.TL_messageService();
            this.k = tL_messageService3;
            tL_messageService3.action = new TLRPC.TL_messageActionChatAddUser();
            long C1 = C1(((TLRPC.TL_channelAdminLogEventActionParticipantInvite) channelAdminLogEventAction).participant.peer);
            if (C1 > 0) {
                M05 = hp.s1(i3).a2(Long.valueOf(C1));
            } else {
                M05 = hp.s1(i3).M0(Long.valueOf(-C1));
            }
            TLRPC.Peer peer2 = this.k.from_id;
            if ((peer2 instanceof TLRPC.TL_peerUser) && C1 == peer2.user_id) {
                if (chat.megagroup) {
                    this.v = F5(bd.L0(2131750979), "un1", a23);
                } else {
                    this.v = F5(bd.L0(2131751047), "un1", a23);
                }
            } else {
                CharSequence F5 = F5(bd.L0(2131751078), "un2", M05);
                this.v = F5;
                this.v = F5(F5, "un1", a23);
            }
        } else {
            boolean z16 = channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin;
            if (!z16) {
                boolean z17 = channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleBan;
                if (z17) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleBan tL_channelAdminLogEventActionParticipantToggleBan = (TLRPC.TL_channelAdminLogEventActionParticipantToggleBan) channelAdminLogEventAction;
                    if (tL_channelAdminLogEventActionParticipantToggleBan.prev_participant instanceof TLRPC.TL_channelParticipantAdmin) {
                    }
                }
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDefaultBannedRights) {
                    TLRPC.TL_channelAdminLogEventActionDefaultBannedRights tL_channelAdminLogEventActionDefaultBannedRights = (TLRPC.TL_channelAdminLogEventActionDefaultBannedRights) channelAdminLogEventAction;
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    this.k = tL_message;
                    tL_message.realId = -1;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = tL_channelAdminLogEventActionDefaultBannedRights.prev_banned_rights;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = tL_channelAdminLogEventActionDefaultBannedRights.new_banned_rights;
                    StringBuilder sb4 = new StringBuilder(bd.L0(2131751041));
                    tL_chatBannedRights2 = tL_chatBannedRights2 == null ? new TLRPC.TL_chatBannedRights() : tL_chatBannedRights2;
                    tL_chatBannedRights3 = tL_chatBannedRights3 == null ? new TLRPC.TL_chatBannedRights() : tL_chatBannedRights3;
                    if (tL_chatBannedRights2.send_messages != tL_chatBannedRights3.send_messages) {
                        sb4.append("\n\n");
                        k5.s(sb4, !tL_chatBannedRights3.send_messages ? '+' : '-', ' ', 2131750918);
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (tL_chatBannedRights2.send_stickers == tL_chatBannedRights3.send_stickers && tL_chatBannedRights2.send_inline == tL_chatBannedRights3.send_inline && tL_chatBannedRights2.send_gifs == tL_chatBannedRights3.send_gifs && tL_chatBannedRights2.send_games == tL_chatBannedRights3.send_games) {
                        c12 = '\n';
                    } else {
                        c12 = '\n';
                        if (!z15) {
                            sb4.append('\n');
                            z15 = true;
                        }
                        sb4.append('\n');
                        k5.s(sb4, !tL_chatBannedRights3.send_stickers ? '+' : '-', ' ', 2131750915);
                    }
                    if (tL_chatBannedRights2.send_media != tL_chatBannedRights3.send_media) {
                        if (!z15) {
                            sb4.append(c12);
                            z15 = true;
                        }
                        sb4.append(c12);
                        k5.s(sb4, !tL_chatBannedRights3.send_media ? '+' : '-', ' ', 2131750919);
                    }
                    if (tL_chatBannedRights2.send_polls != tL_chatBannedRights3.send_polls) {
                        if (!z15) {
                            sb4.append('\n');
                            z15 = true;
                        }
                        sb4.append('\n');
                        k5.s(sb4, !tL_chatBannedRights3.send_polls ? '+' : '-', ' ', 2131750917);
                    }
                    if (tL_chatBannedRights2.embed_links != tL_chatBannedRights3.embed_links) {
                        if (!z15) {
                            sb4.append('\n');
                            z15 = true;
                        }
                        sb4.append('\n');
                        k5.s(sb4, !tL_chatBannedRights3.embed_links ? '+' : '-', ' ', 2131750920);
                    }
                    if (tL_chatBannedRights2.change_info != tL_chatBannedRights3.change_info) {
                        if (!z15) {
                            sb4.append('\n');
                            z15 = true;
                        }
                        sb4.append('\n');
                        k5.s(sb4, !tL_chatBannedRights3.change_info ? '+' : '-', ' ', 2131750925);
                    }
                    if (tL_chatBannedRights2.invite_users != tL_chatBannedRights3.invite_users) {
                        if (!z15) {
                            sb4.append('\n');
                            z15 = true;
                        }
                        sb4.append('\n');
                        k5.s(sb4, !tL_chatBannedRights3.invite_users ? '+' : '-', ' ', 2131750923);
                    }
                    if (tL_chatBannedRights2.pin_messages != tL_chatBannedRights3.pin_messages) {
                        if (!z15) {
                            sb4.append('\n');
                        }
                        sb4.append('\n');
                        k5.s(sb4, !tL_chatBannedRights3.pin_messages ? '+' : '-', ' ', 2131750922);
                    }
                    if (tL_chatBannedRights2.edit_rank != tL_chatBannedRights3.edit_rank) {
                        if (!z15) {
                            sb4.append('\n');
                        }
                        sb4.append('\n');
                        k5.s(sb4, !tL_chatBannedRights3.edit_rank ? '+' : '-', ' ', 2131750924);
                    }
                    if (tL_chatBannedRights2.send_reactions != tL_chatBannedRights3.send_reactions) {
                        if (!z15) {
                            sb4.append('\n');
                        }
                        sb4.append('\n');
                        k5.s(sb4, !tL_chatBannedRights3.send_reactions ? '+' : '-', ' ', 2131750916);
                    }
                    this.v = sb4.toString();
                } else {
                    if (z17) {
                        TLRPC.TL_channelAdminLogEventActionParticipantToggleBan tL_channelAdminLogEventActionParticipantToggleBan2 = (TLRPC.TL_channelAdminLogEventActionParticipantToggleBan) channelAdminLogEventAction;
                        TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                        this.k = tL_message2;
                        tL_message2.realId = -1;
                        long C12 = C1(tL_channelAdminLogEventActionParticipantToggleBan2.prev_participant.peer);
                        if (C12 > 0) {
                            M04 = hp.s1(i3).a2(Long.valueOf(C12));
                        } else {
                            M04 = hp.s1(i3).M0(Long.valueOf(-C12));
                        }
                        TLRPC.TL_chatBannedRights tL_chatBannedRights4 = tL_channelAdminLogEventActionParticipantToggleBan2.prev_participant.banned_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights5 = tL_channelAdminLogEventActionParticipantToggleBan2.new_participant.banned_rights;
                        if (chat.megagroup) {
                            if (tL_chatBannedRights5 != null && tL_chatBannedRights5.view_messages) {
                                if (tL_chatBannedRights4 != null) {
                                }
                            }
                            if (tL_chatBannedRights5 != null && !g0.D1(tL_chatBannedRights5)) {
                                sb3 = new StringBuilder();
                                int i18 = tL_chatBannedRights5.until_date - tL_channelAdminLogEvent2.date;
                                int i19 = ((i18 / 60) / 60) / 24;
                                int i20 = i18 - (i19 * 86400);
                                tL_chatBannedRights = tL_chatBannedRights4;
                                int i21 = (i20 / 60) / 60;
                                str = "";
                                int i22 = (i20 - (i21 * 3600)) / 60;
                                int i23 = 0;
                                int i24 = 0;
                                while (true) {
                                    if (i23 >= 3) {
                                        user2 = a23;
                                        break;
                                    }
                                    if (i23 == 0) {
                                        user2 = a23;
                                        if (i19 != 0) {
                                            G3 = bd.G(i19, "Days", new Object[0]);
                                            i12 = i24 + 1;
                                            i13 = i12;
                                            if (G3 != null) {
                                                if (sb3.length() > 0) {
                                                    sb3.append(", ");
                                                }
                                                sb3.append(G3);
                                            }
                                            if (i13 == 2) {
                                                break;
                                            }
                                            i23++;
                                            i24 = i13;
                                            a23 = user2;
                                        }
                                        i13 = i24;
                                        G3 = null;
                                        if (G3 != null) {
                                        }
                                        if (i13 == 2) {
                                        }
                                    } else {
                                        user2 = a23;
                                        if (i23 == 1) {
                                            if (i21 != 0) {
                                                G3 = bd.G(i21, "Hours", new Object[0]);
                                                i12 = i24 + 1;
                                                i13 = i12;
                                                if (G3 != null) {
                                                }
                                                if (i13 == 2) {
                                                }
                                            }
                                        } else if (i22 != 0) {
                                            i12 = i24 + 1;
                                            G3 = bd.G(i22, "Minutes", new Object[0]);
                                            i13 = i12;
                                            if (G3 != null) {
                                            }
                                            if (i13 == 2) {
                                            }
                                        }
                                        i13 = i24;
                                        G3 = null;
                                        if (G3 != null) {
                                        }
                                        if (i13 == 2) {
                                        }
                                    }
                                }
                            } else {
                                user2 = a23;
                                str = "";
                                tL_chatBannedRights = tL_chatBannedRights4;
                                sb3 = new StringBuilder(bd.L0(2131743694));
                            }
                            String L04 = bd.L0(2131750914);
                            StringBuilder sb5 = new StringBuilder(String.format(L04, f2(M04, this.k.entities, L04.indexOf("%1$s")), sb3.toString()));
                            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = tL_chatBannedRights == null ? new TLRPC.TL_chatBannedRights() : tL_chatBannedRights;
                            tL_chatBannedRights5 = tL_chatBannedRights5 == null ? new TLRPC.TL_chatBannedRights() : tL_chatBannedRights5;
                            if (tL_chatBannedRights6.view_messages != tL_chatBannedRights5.view_messages) {
                                sb5.append("\n\n");
                                k5.s(sb5, !tL_chatBannedRights5.view_messages ? '+' : '-', ' ', 2131750921);
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (tL_chatBannedRights6.send_messages != tL_chatBannedRights5.send_messages) {
                                if (!z14) {
                                    sb5.append('\n');
                                    z14 = true;
                                }
                                sb5.append('\n');
                                k5.s(sb5, !tL_chatBannedRights5.send_messages ? '+' : '-', ' ', 2131750918);
                            }
                            if (tL_chatBannedRights6.send_stickers == tL_chatBannedRights5.send_stickers && tL_chatBannedRights6.send_inline == tL_chatBannedRights5.send_inline && tL_chatBannedRights6.send_gifs == tL_chatBannedRights5.send_gifs && tL_chatBannedRights6.send_games == tL_chatBannedRights5.send_games) {
                                c11 = '\n';
                            } else {
                                c11 = '\n';
                                if (!z14) {
                                    sb5.append('\n');
                                    z14 = true;
                                }
                                sb5.append('\n');
                                k5.s(sb5, !tL_chatBannedRights5.send_stickers ? '+' : '-', ' ', 2131750915);
                            }
                            if (tL_chatBannedRights6.send_media != tL_chatBannedRights5.send_media) {
                                if (!z14) {
                                    sb5.append(c11);
                                    z14 = true;
                                }
                                sb5.append(c11);
                                k5.s(sb5, !tL_chatBannedRights5.send_media ? '+' : '-', ' ', 2131750919);
                            }
                            if (tL_chatBannedRights6.send_polls != tL_chatBannedRights5.send_polls) {
                                if (!z14) {
                                    sb5.append('\n');
                                    z14 = true;
                                }
                                sb5.append('\n');
                                k5.s(sb5, !tL_chatBannedRights5.send_polls ? '+' : '-', ' ', 2131750917);
                            }
                            if (tL_chatBannedRights6.embed_links != tL_chatBannedRights5.embed_links) {
                                if (!z14) {
                                    sb5.append('\n');
                                    z14 = true;
                                }
                                sb5.append('\n');
                                k5.s(sb5, !tL_chatBannedRights5.embed_links ? '+' : '-', ' ', 2131750920);
                            }
                            if (tL_chatBannedRights6.change_info != tL_chatBannedRights5.change_info) {
                                if (!z14) {
                                    sb5.append('\n');
                                    z14 = true;
                                }
                                sb5.append('\n');
                                k5.s(sb5, !tL_chatBannedRights5.change_info ? '+' : '-', ' ', 2131750925);
                            }
                            if (tL_chatBannedRights6.invite_users != tL_chatBannedRights5.invite_users) {
                                if (!z14) {
                                    sb5.append('\n');
                                    z14 = true;
                                }
                                sb5.append('\n');
                                k5.s(sb5, !tL_chatBannedRights5.invite_users ? '+' : '-', ' ', 2131750923);
                            }
                            if (tL_chatBannedRights6.pin_messages != tL_chatBannedRights5.pin_messages) {
                                if (!z14) {
                                    sb5.append('\n');
                                }
                                sb5.append('\n');
                                k5.s(sb5, !tL_chatBannedRights5.pin_messages ? '+' : '-', ' ', 2131750922);
                            }
                            if (tL_chatBannedRights6.edit_rank != tL_chatBannedRights5.edit_rank) {
                                if (!z14) {
                                    sb5.append('\n');
                                }
                                sb5.append('\n');
                                k5.s(sb5, !tL_chatBannedRights5.edit_rank ? '+' : '-', ' ', 2131750924);
                            }
                            if (tL_chatBannedRights6.send_reactions != tL_chatBannedRights5.send_reactions) {
                                if (!z14) {
                                    sb5.append('\n');
                                }
                                sb5.append('\n');
                                k5.s(sb5, !tL_chatBannedRights5.send_reactions ? '+' : '-', ' ', 2131750916);
                            }
                            this.v = sb5.toString();
                            tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                            chat2 = chat;
                            user = user2;
                        }
                        user2 = a23;
                        str = "";
                        if (tL_chatBannedRights5 != null && (tL_chatBannedRights4 == null || tL_chatBannedRights5.view_messages)) {
                            L03 = bd.L0(2131751046);
                        } else {
                            L03 = bd.L0(2131751045);
                        }
                        this.v = String.format(L03, f2(M04, this.k.entities, L03.indexOf("%1$s")));
                        tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                        chat2 = chat;
                        user = user2;
                    } else {
                        TLRPC.User user3 = a23;
                        str = "";
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionUpdatePinned) {
                            TLRPC.TL_channelAdminLogEventActionUpdatePinned tL_channelAdminLogEventActionUpdatePinned = (TLRPC.TL_channelAdminLogEventActionUpdatePinned) channelAdminLogEventAction;
                            message2 = tL_channelAdminLogEventActionUpdatePinned.message;
                            user = user3;
                            if (user3 != null && user.id == 136817688 && (messageFwdHeader = message2.fwd_from) != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel)) {
                                TLRPC.Chat M06 = hp.s1(i3).M0(Long.valueOf(tL_channelAdminLogEventActionUpdatePinned.message.fwd_from.from_id.channel_id));
                                TLRPC.Message message4 = tL_channelAdminLogEventActionUpdatePinned.message;
                                if (!(message4 instanceof TLRPC.TL_messageEmpty) && message4.pinned) {
                                    this.v = F5(bd.L0(2131750969), "un1", M06);
                                } else {
                                    this.v = F5(bd.L0(2131750891), "un1", M06);
                                }
                            } else if (!(message2 instanceof TLRPC.TL_messageEmpty) && message2.pinned) {
                                this.v = F5(bd.L0(2131750969), "un1", user);
                            } else {
                                this.v = F5(bd.L0(2131750891), "un1", user);
                            }
                        } else {
                            user = user3;
                            if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionStopPoll) {
                                message2 = ((TLRPC.TL_channelAdminLogEventActionStopPoll) channelAdminLogEventAction).message;
                                if ((o1(message2) instanceof TLRPC.TL_messageMediaPoll) && ((TLRPC.TL_messageMediaPoll) o1(message2)).poll.quiz) {
                                    this.v = F5(bd.L0(2131750908), "un1", user);
                                } else {
                                    this.v = F5(bd.L0(2131750909), "un1", user);
                                }
                            } else {
                                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleSignatures) {
                                    if (((TLRPC.TL_channelAdminLogEventActionToggleSignatures) channelAdminLogEventAction).new_value) {
                                        this.v = F5(bd.L0(2131750897), "un1", user);
                                    } else {
                                        this.v = F5(bd.L0(2131750898), "un1", user);
                                    }
                                } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantSubExtend) {
                                    this.v = F5(bd.L0(2131750907), "un1", user);
                                } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleSignatureProfiles) {
                                    if (((TLRPC.TL_channelAdminLogEventActionToggleSignatureProfiles) channelAdminLogEventAction).value) {
                                        this.v = F5(bd.L0(2131750895), "un1", user);
                                    } else {
                                        this.v = F5(bd.L0(2131750896), "un1", user);
                                    }
                                } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleInvites) {
                                    if (((TLRPC.TL_channelAdminLogEventActionToggleInvites) channelAdminLogEventAction).new_value) {
                                        this.v = F5(bd.L0(2131750899), "un1", user);
                                    } else {
                                        this.v = F5(bd.L0(2131750900), "un1", user);
                                    }
                                } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                    message2 = ((TLRPC.TL_channelAdminLogEventActionDeleteMessage) channelAdminLogEventAction).message;
                                    if (user != null && user.id == hp.s1(i3).e5) {
                                        this.v = bd.L0(2131751039).replace("un1", l10.p(user));
                                    } else {
                                        this.v = F5(bd.L0(2131751039), "un1", user);
                                    }
                                } else {
                                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeLinkedChat) {
                                        TLRPC.TL_channelAdminLogEventActionChangeLinkedChat tL_channelAdminLogEventActionChangeLinkedChat = (TLRPC.TL_channelAdminLogEventActionChangeLinkedChat) channelAdminLogEventAction;
                                        long j10 = tL_channelAdminLogEventActionChangeLinkedChat.new_value;
                                        long j11 = tL_channelAdminLogEventActionChangeLinkedChat.prev_value;
                                        chat2 = chat;
                                        if (chat2.megagroup) {
                                            if (j10 == 0) {
                                                TLRPC.Chat M07 = hp.s1(i3).M0(Long.valueOf(j11));
                                                CharSequence F52 = F5(bd.L0(2131750933), "un1", user);
                                                this.v = F52;
                                                this.v = F5(F52, "un2", M07);
                                            } else {
                                                TLRPC.Chat M08 = hp.s1(i3).M0(Long.valueOf(j10));
                                                CharSequence F53 = F5(bd.L0(2131751058), "un1", user);
                                                this.v = F53;
                                                this.v = F5(F53, "un2", M08);
                                            }
                                        } else if (j10 == 0) {
                                            TLRPC.Chat M09 = hp.s1(i3).M0(Long.valueOf(j11));
                                            CharSequence F54 = F5(bd.L0(2131750932), "un1", user);
                                            this.v = F54;
                                            this.v = F5(F54, "un2", M09);
                                        } else {
                                            TLRPC.Chat M010 = hp.s1(i3).M0(Long.valueOf(j10));
                                            CharSequence F55 = F5(bd.L0(2131751057), "un1", user);
                                            this.v = F55;
                                            this.v = F5(F55, "un2", M010);
                                        }
                                    } else {
                                        chat2 = chat;
                                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionTogglePreHistoryHidden) {
                                            if (((TLRPC.TL_channelAdminLogEventActionTogglePreHistoryHidden) channelAdminLogEventAction).new_value) {
                                                this.v = F5(bd.L0(2131750902), "un1", user);
                                            } else {
                                                this.v = F5(bd.L0(2131750901), "un1", user);
                                            }
                                        } else {
                                            if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeAbout) {
                                                this.v = F5(bd.L0(chat2.megagroup ? 2131751022 : 2131751027), "un1", user);
                                                message2 = new TLRPC.TL_message();
                                                message2.out = false;
                                                message2.unread = false;
                                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                                message2.from_id = tL_peerUser;
                                                tL_peerUser.user_id = tL_channelAdminLogEvent.user_id;
                                                message2.peer_id = tL_peerChannel;
                                                message2.date = tL_channelAdminLogEvent.date;
                                                TLRPC.TL_channelAdminLogEventActionChangeAbout tL_channelAdminLogEventActionChangeAbout = (TLRPC.TL_channelAdminLogEventActionChangeAbout) tL_channelAdminLogEvent.action;
                                                message2.message = tL_channelAdminLogEventActionChangeAbout.new_value;
                                                if (!TextUtils.isEmpty(tL_channelAdminLogEventActionChangeAbout.prev_value)) {
                                                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                                                    message2.media = tL_messageMediaWebPage;
                                                    tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
                                                    TLRPC.WebPage webPage2 = message2.media.webpage;
                                                    webPage2.flags = 10;
                                                    str2 = str;
                                                    webPage2.display_url = str2;
                                                    webPage2.url = str2;
                                                    webPage2.site_name = bd.L0(2131750968);
                                                    message2.media.webpage.description = ((TLRPC.TL_channelAdminLogEventActionChangeAbout) tL_channelAdminLogEvent.action).prev_value;
                                                } else {
                                                    str2 = str;
                                                    message2.media = new TLRPC.TL_messageMediaEmpty();
                                                }
                                                tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                str = str2;
                                            } else {
                                                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeTheme) {
                                                    this.v = F5(bd.L0(chat2.megagroup ? 2131751020 : 2131751025), "un1", user);
                                                    message = new TLRPC.TL_message();
                                                    message.out = false;
                                                    message.unread = false;
                                                    TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                                    message.from_id = tL_peerUser2;
                                                    tL_peerUser2.user_id = tL_channelAdminLogEvent.user_id;
                                                    message.peer_id = tL_peerChannel;
                                                    message.date = tL_channelAdminLogEvent.date;
                                                    TLRPC.TL_channelAdminLogEventActionChangeTheme tL_channelAdminLogEventActionChangeTheme = (TLRPC.TL_channelAdminLogEventActionChangeTheme) tL_channelAdminLogEvent.action;
                                                    message.message = tL_channelAdminLogEventActionChangeTheme.new_value;
                                                    if (!TextUtils.isEmpty(tL_channelAdminLogEventActionChangeTheme.prev_value)) {
                                                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage2 = new TLRPC.TL_messageMediaWebPage();
                                                        message.media = tL_messageMediaWebPage2;
                                                        tL_messageMediaWebPage2.webpage = new TLRPC.TL_webPage();
                                                        TLRPC.WebPage webPage3 = message.media.webpage;
                                                        webPage3.flags = 10;
                                                        webPage3.display_url = str;
                                                        webPage3.url = str;
                                                        webPage3.site_name = bd.L0(2131750967);
                                                        message.media.webpage.description = ((TLRPC.TL_channelAdminLogEventActionChangeTheme) tL_channelAdminLogEvent.action).prev_value;
                                                    } else {
                                                        message.media = new TLRPC.TL_messageMediaEmpty();
                                                    }
                                                } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeUsername) {
                                                    String str5 = ((TLRPC.TL_channelAdminLogEventActionChangeUsername) channelAdminLogEventAction).new_value;
                                                    if (TextUtils.isEmpty(str5)) {
                                                        this.v = F5(bd.L0(chat2.megagroup ? 2131750934 : 2131750937), "un1", user);
                                                    } else {
                                                        this.v = F5(bd.L0(chat2.megagroup ? 2131751059 : 2131751073), "un1", user);
                                                    }
                                                    TLRPC.Message tL_message3 = new TLRPC.TL_message();
                                                    tL_message3.out = false;
                                                    tL_message3.unread = false;
                                                    TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                                                    tL_message3.from_id = tL_peerUser3;
                                                    tL_peerUser3.user_id = tL_channelAdminLogEvent.user_id;
                                                    tL_message3.peer_id = tL_peerChannel;
                                                    tL_message3.date = tL_channelAdminLogEvent.date;
                                                    if (!TextUtils.isEmpty(str5)) {
                                                        tL_message3.message = org.telegram.ui.Cells.f1.r(hp.s1(i3).V2, "/", str5, new StringBuilder("https://"));
                                                    } else {
                                                        tL_message3.message = str;
                                                    }
                                                    TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                                                    tL_messageEntityUrl.offset = 0;
                                                    tL_messageEntityUrl.length = tL_message3.message.length();
                                                    tL_message3.entities.add(tL_messageEntityUrl);
                                                    if (!TextUtils.isEmpty(((TLRPC.TL_channelAdminLogEventActionChangeUsername) tL_channelAdminLogEvent.action).prev_value)) {
                                                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage3 = new TLRPC.TL_messageMediaWebPage();
                                                        tL_message3.media = tL_messageMediaWebPage3;
                                                        tL_messageMediaWebPage3.webpage = new TLRPC.TL_webPage();
                                                        TLRPC.WebPage webPage4 = tL_message3.media.webpage;
                                                        webPage4.flags = 10;
                                                        webPage4.display_url = str;
                                                        webPage4.url = str;
                                                        webPage4.site_name = bd.L0(2131750966);
                                                        tL_message3.media.webpage.description = "https://" + hp.s1(i3).V2 + "/" + ((TLRPC.TL_channelAdminLogEventActionChangeUsername) tL_channelAdminLogEvent.action).prev_value;
                                                    } else {
                                                        tL_message3.media = new TLRPC.TL_messageMediaEmpty();
                                                    }
                                                    str = str;
                                                    tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                    message2 = tL_message3;
                                                } else {
                                                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) {
                                                        TLRPC.Message tL_message4 = new TLRPC.TL_message();
                                                        tL_message4.out = false;
                                                        tL_message4.unread = false;
                                                        tL_message4.peer_id = tL_peerChannel;
                                                        tL_message4.date = tL_channelAdminLogEvent.date;
                                                        TLRPC.TL_channelAdminLogEventActionEditMessage tL_channelAdminLogEventActionEditMessage = (TLRPC.TL_channelAdminLogEventActionEditMessage) tL_channelAdminLogEvent.action;
                                                        TLRPC.Message message5 = tL_channelAdminLogEventActionEditMessage.new_message;
                                                        TLRPC.Message message6 = tL_channelAdminLogEventActionEditMessage.prev_message;
                                                        if (message6 != null) {
                                                            tL_message4.reply_to = message6.reply_to;
                                                            tL_message4.id = message6.id;
                                                        } else if (message5 != null) {
                                                            tL_message4.reply_to = message5.reply_to;
                                                            tL_message4.id = message5.id;
                                                        }
                                                        if (message5 != null && (peer = message5.from_id) != null) {
                                                            tL_message4.from_id = peer;
                                                        } else {
                                                            TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                                                            tL_message4.from_id = tL_peerUser4;
                                                            tL_peerUser4.user_id = tL_channelAdminLogEvent.user_id;
                                                        }
                                                        if (o1(message5) != null && !(o1(message5) instanceof TLRPC.TL_messageMediaEmpty) && !(o1(message5) instanceof TLRPC.TL_messageMediaWebPage)) {
                                                            boolean equals = TextUtils.equals(message5.message, message6.message);
                                                            TLRPC.MessageMedia o12 = o1(message5);
                                                            TLRPC.MessageMedia o13 = o1(message6);
                                                            if (o13 == null) {
                                                                i11 = 2131750972;
                                                                z12 = false;
                                                                z13 = true;
                                                            } else {
                                                                if (o12.getClass() == o13.getClass()) {
                                                                    TLRPC.Photo photo2 = o12.photo;
                                                                    if (photo2 == null || (photo = o13.photo) == null) {
                                                                        i11 = 2131750972;
                                                                        messageMedia = o12;
                                                                    } else {
                                                                        i11 = 2131750972;
                                                                        messageMedia = photo2.id == photo.id ? o12 : messageMedia;
                                                                    }
                                                                    if (messageMedia.document == null || o13.document == null || o1(message5).document.id == o13.document.id) {
                                                                        z12 = false;
                                                                        z13 = false;
                                                                    }
                                                                } else {
                                                                    i11 = 2131750972;
                                                                }
                                                                z12 = true;
                                                                z13 = false;
                                                            }
                                                            if (z13) {
                                                                this.v = F5(bd.L0(2131751077), "un1", user);
                                                            } else if (z12 && !equals) {
                                                                this.v = F5(bd.L0(2131751016), "un1", user);
                                                            } else if (!equals) {
                                                                this.v = F5(bd.L0(2131751028), "un1", user);
                                                            } else {
                                                                this.v = F5(bd.L0(2131751017), "un1", user);
                                                            }
                                                            TLRPC.MessageMedia o14 = o1(message5);
                                                            tL_message4.media = o14;
                                                            if (!equals) {
                                                                o14.webpage = new TLRPC.TL_webPage();
                                                                tL_message4.media.webpage.site_name = bd.L0(2131750973);
                                                                if (TextUtils.isEmpty(message6.message)) {
                                                                    tL_message4.media.webpage.description = bd.L0(i11);
                                                                } else {
                                                                    tL_message4.media.webpage.description = message6.message;
                                                                    arrayList2 = message6.entities;
                                                                    tL_message4.reply_markup = message5.reply_markup;
                                                                    webPage = tL_message4.media.webpage;
                                                                    if (webPage != null) {
                                                                    }
                                                                    str = str;
                                                                    message2 = tL_message4;
                                                                    tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                                    arrayList3 = arrayList2;
                                                                }
                                                            }
                                                            arrayList2 = null;
                                                            tL_message4.reply_markup = message5.reply_markup;
                                                            webPage = tL_message4.media.webpage;
                                                            if (webPage != null) {
                                                            }
                                                            str = str;
                                                            message2 = tL_message4;
                                                            tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                            arrayList3 = arrayList2;
                                                        } else {
                                                            this.v = F5(bd.L0(2131751015), "un1", user);
                                                            if (message5.action instanceof TLRPC.TL_messageActionGroupCall) {
                                                                message5.media = new TLRPC.TL_messageMediaEmpty();
                                                                tL_message4 = message5;
                                                            } else {
                                                                tL_message4.message = message5.message;
                                                                tL_message4.entities = message5.entities;
                                                                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage4 = new TLRPC.TL_messageMediaWebPage();
                                                                tL_message4.media = tL_messageMediaWebPage4;
                                                                tL_messageMediaWebPage4.webpage = new TLRPC.TL_webPage();
                                                                tL_message4.media.webpage.site_name = bd.L0(2131750971);
                                                                if (TextUtils.isEmpty(message6.message)) {
                                                                    tL_message4.media.webpage.description = bd.L0(2131750972);
                                                                } else {
                                                                    tL_message4.media.webpage.description = message6.message;
                                                                    arrayList2 = message6.entities;
                                                                    tL_message4.reply_markup = message5.reply_markup;
                                                                    webPage = tL_message4.media.webpage;
                                                                    if (webPage != null) {
                                                                        webPage.flags = 10;
                                                                        webPage.display_url = str;
                                                                        webPage.url = str;
                                                                    }
                                                                    str = str;
                                                                    message2 = tL_message4;
                                                                    tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                                    arrayList3 = arrayList2;
                                                                }
                                                            }
                                                            arrayList2 = null;
                                                            tL_message4.reply_markup = message5.reply_markup;
                                                            webPage = tL_message4.media.webpage;
                                                            if (webPage != null) {
                                                            }
                                                            str = str;
                                                            message2 = tL_message4;
                                                            tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                            arrayList3 = arrayList2;
                                                        }
                                                        if (this.k == null) {
                                                            this.k = new TLRPC.TL_messageService();
                                                        }
                                                        this.k.message = this.v.toString();
                                                        this.k.from_id = new TLRPC.TL_peerUser();
                                                        TLRPC.Message message7 = this.k;
                                                        message7.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                                                        message7.date = tL_channelAdminLogEvent2.date;
                                                        int i25 = iArr[0];
                                                        iArr[0] = i25 + 1;
                                                        message7.id = i25;
                                                        this.T = tL_channelAdminLogEvent2.id;
                                                        message7.out = false;
                                                        message7.peer_id = new TLRPC.TL_peerChannel();
                                                        TLRPC.Message message8 = this.k;
                                                        message8.peer_id.channel_id = chat2.id;
                                                        message8.unread = false;
                                                        MediaController B = MediaController.B();
                                                        this.U2 = null;
                                                        message3 = !(message2 instanceof TLRPC.TL_messageEmpty) ? null : message2;
                                                        if (message3 == null) {
                                                            message3.out = false;
                                                            message3.realId = message3.id;
                                                            int i26 = iArr[0];
                                                            iArr[0] = i26 + 1;
                                                            message3.id = i26;
                                                            message3.flags &= -32769;
                                                            message3.dialog_id = -chat2.id;
                                                            if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                                                i14 = message3.date;
                                                                message3.date = tL_channelAdminLogEvent2.date;
                                                            } else {
                                                                i14 = 0;
                                                            }
                                                            zi ziVar = new zi(this.I1, message3, (AbstractMap) null, (AbstractMap) null, true, true, this.T);
                                                            ziVar.V = i14;
                                                            ziVar.J1 = tL_channelAdminLogEvent2;
                                                            if (ziVar.U >= 0) {
                                                                if (B.I(ziVar)) {
                                                                    zi ziVar2 = B.v0;
                                                                    ziVar.b0 = ziVar2.b0;
                                                                    ziVar.g0 = ziVar2.g0;
                                                                }
                                                                arrayList4 = arrayList;
                                                                str3 = str;
                                                                O(this.I1, tL_channelAdminLogEvent2, arrayList4, hashMap, z10);
                                                                if (z10) {
                                                                    arrayList4.add(0, ziVar);
                                                                } else {
                                                                    arrayList4.add(arrayList4.size() - 1, ziVar);
                                                                }
                                                            } else {
                                                                arrayList4 = arrayList;
                                                                str3 = str;
                                                                this.U = -1;
                                                            }
                                                            if (arrayList3 != null) {
                                                                ziVar.z1 = arrayList3;
                                                                iArr2 = null;
                                                                ziVar.y = null;
                                                                ziVar.o0();
                                                                if (!(tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) && this.U >= 0) {
                                                                    O(this.I1, tL_channelAdminLogEvent2, arrayList4, hashMap, z10);
                                                                    if (!z10) {
                                                                        arrayList4.add(0, this);
                                                                    } else {
                                                                        arrayList4.add(arrayList4.size() - 1, this);
                                                                    }
                                                                    if (this.v == null) {
                                                                        this.v = str3;
                                                                    }
                                                                    if (!(o1(this.k) instanceof TLRPC.TL_messageMediaGame)) {
                                                                        textPaint = org.telegram.ui.ActionBar.k6.x2;
                                                                    } else {
                                                                        textPaint = org.telegram.ui.ActionBar.k6.o2;
                                                                    }
                                                                    iArr3 = !i() ? new int[1] : iArr2;
                                                                    CharSequence m10 = i6.m(this.v, textPaint.getFontMetricsInt(), false, iArr3, 0);
                                                                    this.v = m10;
                                                                    B5 = B5(m10, textPaint.getFontMetricsInt());
                                                                    this.v = B5;
                                                                    if (iArr3 != null && iArr3[0] > 1) {
                                                                        E5(B5, iArr3);
                                                                    }
                                                                    H(iArr3);
                                                                    M5();
                                                                    j5();
                                                                    k0();
                                                                    if (B.I(this)) {
                                                                        zi ziVar3 = B.v0;
                                                                        this.b0 = ziVar3.b0;
                                                                        this.g0 = ziVar3.g0;
                                                                    }
                                                                    n0(user);
                                                                    this.Q1 = true;
                                                                    r0(false);
                                                                    J();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                        } else {
                                                            arrayList4 = arrayList;
                                                            str3 = str;
                                                        }
                                                        iArr2 = null;
                                                        if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                                            return;
                                                        }
                                                        O(this.I1, tL_channelAdminLogEvent2, arrayList4, hashMap, z10);
                                                        if (!z10) {
                                                        }
                                                        if (this.v == null) {
                                                        }
                                                        if (!(o1(this.k) instanceof TLRPC.TL_messageMediaGame)) {
                                                        }
                                                        if (!i()) {
                                                        }
                                                        CharSequence m102 = i6.m(this.v, textPaint.getFontMetricsInt(), false, iArr3, 0);
                                                        this.v = m102;
                                                        B5 = B5(m102, textPaint.getFontMetricsInt());
                                                        this.v = B5;
                                                        if (iArr3 != null) {
                                                            E5(B5, iArr3);
                                                        }
                                                        H(iArr3);
                                                        M5();
                                                        j5();
                                                        k0();
                                                        if (B.I(this)) {
                                                        }
                                                        n0(user);
                                                        this.Q1 = true;
                                                        r0(false);
                                                        J();
                                                        return;
                                                    }
                                                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet) {
                                                        TLRPC.InputStickerSet inputStickerSet = ((TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet) channelAdminLogEventAction).new_stickerset;
                                                        if (inputStickerSet != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                                                            this.v = F5(bd.L0(2131751068), "un1", user);
                                                        } else {
                                                            this.v = F5(bd.L0(2131750935), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                                                        TLRPC.InputStickerSet inputStickerSet2 = ((TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction).new_stickerset;
                                                        if (inputStickerSet2 != null && !(inputStickerSet2 instanceof TLRPC.TL_inputStickerSetEmpty)) {
                                                            this.v = F5(bd.L0(2131751050), "un1", user);
                                                        } else {
                                                            this.v = F5(bd.L0(2131750930), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeLocation) {
                                                        TLRPC.ChannelLocation channelLocation = ((TLRPC.TL_channelAdminLogEventActionChangeLocation) channelAdminLogEventAction).new_value;
                                                        if (channelLocation instanceof TLRPC.TL_channelLocationEmpty) {
                                                            this.v = F5(bd.L0(2131750931), "un1", user);
                                                        } else {
                                                            this.v = F5(bd.Y(2131751056, "EventLogChangedLocation", ((TLRPC.TL_channelLocation) channelLocation).address), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleSlowMode) {
                                                        int i27 = ((TLRPC.TL_channelAdminLogEventActionToggleSlowMode) channelAdminLogEventAction).new_value;
                                                        if (i27 == 0) {
                                                            this.v = F5(bd.L0(2131750894), "un1", user);
                                                        } else {
                                                            if (i27 < 60) {
                                                                c10 = 0;
                                                                G2 = bd.G(i27, "Seconds", new Object[0]);
                                                            } else {
                                                                c10 = 0;
                                                                if (i27 < 3600) {
                                                                    G2 = bd.G(i27 / 60, "Minutes", new Object[0]);
                                                                } else {
                                                                    G2 = bd.G((i27 / 60) / 60, "Hours", new Object[0]);
                                                                }
                                                            }
                                                            Object[] objArr = new Object[1];
                                                            objArr[c10] = G2;
                                                            this.v = F5(bd.Z(2131750893, objArr), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleAutotranslation) {
                                                        this.v = F5(bd.L0(((TLRPC.TL_channelAdminLogEventActionToggleAutotranslation) channelAdminLogEventAction).new_value ? 2131750903 : 2131750904), "un1", user);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionStartGroupCall) {
                                                        if (t3.T(chat2) && (!chat2.megagroup || chat2.gigagroup)) {
                                                            this.v = F5(bd.L0(2131750911), "un1", user);
                                                        } else {
                                                            this.v = F5(bd.L0(2131750910), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDiscardGroupCall) {
                                                        if (t3.T(chat2) && (!chat2.megagroup || chat2.gigagroup)) {
                                                            this.v = F5(bd.L0(2131751010), "un1", user);
                                                        } else {
                                                            this.v = F5(bd.L0(2131751009), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantMute) {
                                                        long C13 = C1(((TLRPC.TL_channelAdminLogEventActionParticipantMute) channelAdminLogEventAction).participant.peer);
                                                        if (C13 > 0) {
                                                            M03 = hp.s1(i3).a2(Long.valueOf(C13));
                                                        } else {
                                                            M03 = hp.s1(i3).M0(Long.valueOf(-C13));
                                                        }
                                                        CharSequence F56 = F5(bd.L0(2131750889), "un1", user);
                                                        this.v = F56;
                                                        this.v = F5(F56, "un2", M03);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantUnmute) {
                                                        long C14 = C1(((TLRPC.TL_channelAdminLogEventActionParticipantUnmute) channelAdminLogEventAction).participant.peer);
                                                        if (C14 > 0) {
                                                            M02 = hp.s1(i3).a2(Long.valueOf(C14));
                                                        } else {
                                                            M02 = hp.s1(i3).M0(Long.valueOf(-C14));
                                                        }
                                                        CharSequence F57 = F5(bd.L0(2131750887), "un1", user);
                                                        this.v = F57;
                                                        this.v = F5(F57, "un2", M02);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleGroupCallSetting) {
                                                        if (((TLRPC.TL_channelAdminLogEventActionToggleGroupCallSetting) channelAdminLogEventAction).join_muted) {
                                                            this.v = F5(bd.L0(2131750888), "un1", user);
                                                        } else {
                                                            this.v = F5(bd.L0(2131750890), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                                                        TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction;
                                                        if (tL_channelAdminLogEventActionParticipantJoinByInvite.via_chatlist) {
                                                            this.v = F5(bd.L0(t3.V(chat2) ? 2131754614 : 2131754612), "un1", user);
                                                        } else {
                                                            this.v = F5(bd.L0(t3.V(chat2) ? 2131754615 : 2131754613), "un1", user);
                                                        }
                                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = tL_channelAdminLogEventActionParticipantJoinByInvite.invite;
                                                        if (tL_chatInviteExported != null && !TextUtils.isEmpty(tL_chatInviteExported.link)) {
                                                            this.v = TextUtils.concat(this.v, " ", tL_channelAdminLogEventActionParticipantJoinByInvite.invite.link);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleNoForwards) {
                                                        TLRPC.TL_channelAdminLogEventActionToggleNoForwards tL_channelAdminLogEventActionToggleNoForwards = (TLRPC.TL_channelAdminLogEventActionToggleNoForwards) channelAdminLogEventAction;
                                                        boolean z18 = t3.T(chat2) && !chat2.megagroup;
                                                        if (tL_channelAdminLogEventActionToggleNoForwards.new_value) {
                                                            if (z18) {
                                                                this.v = F5(bd.L0(2131754649), "un1", user);
                                                            } else {
                                                                this.v = F5(bd.L0(2131754648), "un1", user);
                                                            }
                                                        } else if (z18) {
                                                            this.v = F5(bd.L0(2131754651), "un1", user);
                                                        } else {
                                                            this.v = F5(bd.L0(2131754650), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionExportedInviteDelete) {
                                                        CharSequence F58 = F5(bd.Z(2131754654, new Object[0]), "un1", user);
                                                        this.v = F58;
                                                        this.v = F5(F58, "un2", ((TLRPC.TL_channelAdminLogEventActionExportedInviteDelete) channelAdminLogEventAction).invite);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke) {
                                                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = (TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke) channelAdminLogEventAction;
                                                        CharSequence F59 = F5(bd.Z(2131754568, tL_channelAdminLogEventActionExportedInviteRevoke.invite.link), "un1", user);
                                                        this.v = F59;
                                                        this.v = F5(F59, "un2", tL_channelAdminLogEventActionExportedInviteRevoke.invite);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionExportedInviteEdit) {
                                                        TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = (TLRPC.TL_channelAdminLogEventActionExportedInviteEdit) channelAdminLogEventAction;
                                                        String str6 = tL_channelAdminLogEventActionExportedInviteEdit.prev_invite.link;
                                                        if (str6 != null && str6.equals(tL_channelAdminLogEventActionExportedInviteEdit.new_invite.link)) {
                                                            this.v = F5(bd.Z(2131754652, new Object[0]), "un1", user);
                                                        } else {
                                                            this.v = F5(bd.Z(2131754653, new Object[0]), "un1", user);
                                                        }
                                                        CharSequence F510 = F5(this.v, "un2", tL_channelAdminLogEventActionExportedInviteEdit.prev_invite);
                                                        this.v = F510;
                                                        this.v = F5(F510, "un3", tL_channelAdminLogEventActionExportedInviteEdit.new_invite);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantVolume) {
                                                        long C15 = C1(((TLRPC.TL_channelAdminLogEventActionParticipantVolume) channelAdminLogEventAction).participant.peer);
                                                        if (C15 > 0) {
                                                            M0 = hp.s1(i3).a2(Long.valueOf(C15));
                                                        } else {
                                                            M0 = hp.s1(i3).M0(Long.valueOf(-C15));
                                                        }
                                                        double H = t3.H(r10.participant) / 100.0d;
                                                        CharSequence F511 = F5(bd.Y(2131754501, "ActionVolumeChanged", Integer.valueOf((int) (H > 0.0d ? Math.max(H, 1.0d) : 0.0d))), "un1", user);
                                                        this.v = F511;
                                                        this.v = F5(F511, "un2", M0);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) {
                                                        TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL tL_channelAdminLogEventActionChangeHistoryTTL = (TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) channelAdminLogEventAction;
                                                        if (!chat2.megagroup) {
                                                            int i28 = tL_channelAdminLogEventActionChangeHistoryTTL.new_value;
                                                            if (i28 != 0) {
                                                                this.v = bd.Y(2131754540, "ActionTTLChannelChanged", bd.c0(i28));
                                                            } else {
                                                                this.v = bd.L0(2131754539);
                                                            }
                                                        } else {
                                                            int i29 = tL_channelAdminLogEventActionChangeHistoryTTL.new_value;
                                                            if (i29 == 0) {
                                                                this.v = F5(bd.L0(2131754538), "un1", user);
                                                            } else {
                                                                if (i29 > 86400) {
                                                                    c2 = 0;
                                                                    G = bd.G(i29 / 86400, "Days", new Object[0]);
                                                                } else {
                                                                    c2 = 0;
                                                                    if (i29 >= 3600) {
                                                                        G = bd.G(i29 / 3600, "Hours", new Object[0]);
                                                                    } else if (i29 >= 60) {
                                                                        G = bd.G(i29 / 60, "Minutes", new Object[0]);
                                                                    } else {
                                                                        G = bd.G(i29, "Seconds", new Object[0]);
                                                                    }
                                                                }
                                                                Object[] objArr2 = new Object[1];
                                                                objArr2[c2] = G;
                                                                this.v = F5(bd.Z(2131754541, objArr2), "un1", user);
                                                            }
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest) {
                                                        TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest tL_channelAdminLogEventActionParticipantJoinByRequest = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest) channelAdminLogEventAction;
                                                        TLRPC.ExportedChatInvite exportedChatInvite = tL_channelAdminLogEventActionParticipantJoinByRequest.invite;
                                                        if (((exportedChatInvite instanceof TLRPC.TL_chatInviteExported) && "https://t.me/+PublicChat".equals(((TLRPC.TL_chatInviteExported) exportedChatInvite).link)) || (tL_channelAdminLogEventActionParticipantJoinByRequest.invite instanceof TLRPC.TL_chatInvitePublicJoinRequests)) {
                                                            CharSequence F512 = F5(bd.L0(2131749075), "un1", user);
                                                            this.v = F512;
                                                            this.v = F5(F512, "un2", hp.s1(i3).a2(Long.valueOf(tL_channelAdminLogEventActionParticipantJoinByRequest.approved_by)));
                                                        } else {
                                                            CharSequence F513 = F5(bd.L0(2131749076), "un1", user);
                                                            this.v = F513;
                                                            CharSequence F514 = F5(F513, "un2", tL_channelAdminLogEventActionParticipantJoinByRequest.invite);
                                                            this.v = F514;
                                                            this.v = F5(F514, "un3", hp.s1(i3).a2(Long.valueOf(tL_channelAdminLogEventActionParticipantJoinByRequest.approved_by)));
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionSendMessage) {
                                                        message = ((TLRPC.TL_channelAdminLogEventActionSendMessage) channelAdminLogEventAction).message;
                                                        this.v = F5(bd.L0(2131750912), "un1", user);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantEditRank) {
                                                        TLRPC.TL_channelAdminLogEventActionParticipantEditRank tL_channelAdminLogEventActionParticipantEditRank = (TLRPC.TL_channelAdminLogEventActionParticipantEditRank) channelAdminLogEventAction;
                                                        if (tL_channelAdminLogEventActionParticipantEditRank.user_id == tL_channelAdminLogEvent.user_id) {
                                                            if (!TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.prev_rank) && !TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.new_rank)) {
                                                                String Z = bd.Z(2131750939, tL_channelAdminLogEventActionParticipantEditRank.prev_rank, tL_channelAdminLogEventActionParticipantEditRank.new_rank);
                                                                this.v = Z;
                                                                this.v = F5(Z, "un1", user);
                                                            } else if (TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.prev_rank) && !TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.new_rank)) {
                                                                String Z2 = bd.Z(2131750940, tL_channelAdminLogEventActionParticipantEditRank.new_rank);
                                                                this.v = Z2;
                                                                this.v = F5(Z2, "un1", user);
                                                            } else {
                                                                String Z3 = bd.Z(2131750938, tL_channelAdminLogEventActionParticipantEditRank.prev_rank);
                                                                this.v = Z3;
                                                                this.v = F5(Z3, "un1", user);
                                                            }
                                                        } else {
                                                            TLRPC.User a24 = hp.s1(i3).a2(Long.valueOf(tL_channelAdminLogEventActionParticipantEditRank.user_id));
                                                            if (!TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.prev_rank) && !TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.new_rank)) {
                                                                String Z4 = bd.Z(2131750942, tL_channelAdminLogEventActionParticipantEditRank.prev_rank, tL_channelAdminLogEventActionParticipantEditRank.new_rank);
                                                                this.v = Z4;
                                                                CharSequence F515 = F5(Z4, "un1", user);
                                                                this.v = F515;
                                                                this.v = F5(F515, "un2", a24);
                                                            } else if (TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.prev_rank) && !TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.new_rank)) {
                                                                String Z5 = bd.Z(2131750943, tL_channelAdminLogEventActionParticipantEditRank.new_rank);
                                                                this.v = Z5;
                                                                CharSequence F516 = F5(Z5, "un1", user);
                                                                this.v = F516;
                                                                this.v = F5(F516, "un2", a24);
                                                            } else {
                                                                String Z6 = bd.Z(2131750941, tL_channelAdminLogEventActionParticipantEditRank.prev_rank);
                                                                this.v = Z6;
                                                                CharSequence F517 = F5(Z6, "un1", user);
                                                                this.v = F517;
                                                                this.v = F5(F517, "un2", a24);
                                                            }
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeAvailableReactions) {
                                                        TLRPC.TL_channelAdminLogEventActionChangeAvailableReactions tL_channelAdminLogEventActionChangeAvailableReactions = (TLRPC.TL_channelAdminLogEventActionChangeAvailableReactions) channelAdminLogEventAction;
                                                        boolean z19 = (tL_channelAdminLogEventActionChangeAvailableReactions.prev_value instanceof TLRPC.TL_chatReactionsSome) && (tL_channelAdminLogEventActionChangeAvailableReactions.new_value instanceof TLRPC.TL_chatReactionsSome);
                                                        CharSequence Y1 = Y1(tL_channelAdminLogEventActionChangeAvailableReactions.new_value);
                                                        if (z19) {
                                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(F5(bd.Z(2131754581, "**new**"), "un1", user));
                                                            int indexOf = spannableStringBuilder.toString().indexOf("**new**");
                                                            if (indexOf > 0) {
                                                                spannableStringBuilder.replace(indexOf, indexOf + 7, Y1);
                                                            }
                                                            this.v = spannableStringBuilder;
                                                        } else {
                                                            CharSequence Y12 = Y1(tL_channelAdminLogEventActionChangeAvailableReactions.prev_value);
                                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(F5(bd.Z(2131754582, "**old**", "**new**"), "un1", user));
                                                            int indexOf2 = spannableStringBuilder2.toString().indexOf("**old**");
                                                            if (indexOf2 > 0) {
                                                                spannableStringBuilder2.replace(indexOf2, indexOf2 + 7, Y12);
                                                            }
                                                            int indexOf3 = spannableStringBuilder2.toString().indexOf("**new**");
                                                            if (indexOf3 > 0) {
                                                                spannableStringBuilder2.replace(indexOf3, indexOf3 + 7, Y1);
                                                            }
                                                            this.v = spannableStringBuilder2;
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeUsernames) {
                                                        TLRPC.TL_channelAdminLogEventActionChangeUsernames tL_channelAdminLogEventActionChangeUsernames = (TLRPC.TL_channelAdminLogEventActionChangeUsernames) channelAdminLogEventAction;
                                                        ArrayList<String> arrayList5 = tL_channelAdminLogEventActionChangeUsernames.prev_value;
                                                        ArrayList<String> arrayList6 = tL_channelAdminLogEventActionChangeUsernames.new_value;
                                                        this.v = null;
                                                        if (arrayList5 != null && arrayList6 != null) {
                                                            if (arrayList6.size() + 1 == arrayList5.size()) {
                                                                int i30 = 0;
                                                                String str7 = null;
                                                                while (true) {
                                                                    if (i30 >= arrayList5.size()) {
                                                                        break;
                                                                    }
                                                                    String str8 = arrayList5.get(i30);
                                                                    if (!arrayList6.contains(str8)) {
                                                                        if (str7 != null) {
                                                                            str7 = null;
                                                                            break;
                                                                        }
                                                                        str7 = str8;
                                                                    }
                                                                    i30++;
                                                                }
                                                                if (str7 != null) {
                                                                    this.v = F5(bd.Y(2131751042, "EventLogDeactivatedUsername", "@".concat(str7)), "un1", user);
                                                                }
                                                            } else if (arrayList5.size() + 1 == arrayList6.size()) {
                                                                int i31 = 0;
                                                                String str9 = null;
                                                                while (true) {
                                                                    if (i31 >= arrayList6.size()) {
                                                                        break;
                                                                    }
                                                                    String str10 = arrayList6.get(i31);
                                                                    if (!arrayList5.contains(str10)) {
                                                                        if (str9 != null) {
                                                                            str9 = null;
                                                                            break;
                                                                        }
                                                                        str9 = str10;
                                                                    }
                                                                    i31++;
                                                                }
                                                                if (str9 != null) {
                                                                    this.v = F5(bd.Y(2131751079, "EventLogActivatedUsername", "@".concat(str9)), "un1", user);
                                                                }
                                                            }
                                                        }
                                                        if (this.v == null) {
                                                            this.v = F5(bd.Y(2131751074, "EventLogChangeUsernames", g2(arrayList5), g2(arrayList6)), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleForum) {
                                                        if (((TLRPC.TL_channelAdminLogEventActionToggleForum) channelAdminLogEventAction).new_value) {
                                                            this.v = F5(bd.Y(2131750906, "EventLogSwitchToForum", new Object[0]), "un1", user);
                                                        } else {
                                                            this.v = F5(bd.Y(2131750905, "EventLogSwitchToGroup", new Object[0]), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionCreateTopic) {
                                                        CharSequence F518 = F5(bd.Y(2131751043, "EventLogCreateTopic", new Object[0]), "un1", user);
                                                        this.v = F518;
                                                        this.v = F5(F518, "un2", ((TLRPC.TL_channelAdminLogEventActionCreateTopic) channelAdminLogEventAction).topic);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditTopic) {
                                                        TLRPC.TL_channelAdminLogEventActionEditTopic tL_channelAdminLogEventActionEditTopic = (TLRPC.TL_channelAdminLogEventActionEditTopic) channelAdminLogEventAction;
                                                        TLRPC.ForumTopic forumTopic = tL_channelAdminLogEventActionEditTopic.prev_topic;
                                                        boolean z20 = forumTopic instanceof TLRPC.TL_forumTopic;
                                                        if (z20) {
                                                            TLRPC.ForumTopic forumTopic2 = tL_channelAdminLogEventActionEditTopic.new_topic;
                                                            if (forumTopic2 instanceof TLRPC.TL_forumTopic) {
                                                                boolean z21 = ((TLRPC.TL_forumTopic) forumTopic).hidden;
                                                                boolean z22 = ((TLRPC.TL_forumTopic) forumTopic2).hidden;
                                                                if (z21 != z22) {
                                                                    this.v = F5(bd.L0(z22 ? 2131744027 : 2131744013), "%s", user);
                                                                }
                                                            }
                                                        }
                                                        if (z20) {
                                                            TLRPC.ForumTopic forumTopic3 = tL_channelAdminLogEventActionEditTopic.new_topic;
                                                            if (forumTopic3 instanceof TLRPC.TL_forumTopic) {
                                                                boolean z23 = ((TLRPC.TL_forumTopic) forumTopic).closed;
                                                                boolean z24 = ((TLRPC.TL_forumTopic) forumTopic3).closed;
                                                                if (z23 != z24) {
                                                                    if (z24) {
                                                                        this.v = F5(bd.L0(2131751044), "%s", user);
                                                                    } else {
                                                                        this.v = F5(bd.L0(2131750926), "%s", user);
                                                                    }
                                                                    this.v = F5(this.v, "un2", tL_channelAdminLogEventActionEditTopic.new_topic);
                                                                }
                                                            }
                                                        }
                                                        CharSequence F519 = F5(bd.L0(2131751029), "un1", user);
                                                        this.v = F519;
                                                        CharSequence F520 = F5(F519, "un2", tL_channelAdminLogEventActionEditTopic.prev_topic);
                                                        this.v = F520;
                                                        this.v = F5(F520, "un3", tL_channelAdminLogEventActionEditTopic.new_topic);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteTopic) {
                                                        CharSequence F521 = F5(bd.L0(2131751040), "un1", user);
                                                        this.v = F521;
                                                        this.v = F5(F521, "un2", ((TLRPC.TL_channelAdminLogEventActionDeleteTopic) channelAdminLogEventAction).topic);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionPinTopic) {
                                                        TLRPC.TL_channelAdminLogEventActionPinTopic tL_channelAdminLogEventActionPinTopic = (TLRPC.TL_channelAdminLogEventActionPinTopic) channelAdminLogEventAction;
                                                        TLRPC.ForumTopic forumTopic4 = tL_channelAdminLogEventActionPinTopic.new_topic;
                                                        if ((forumTopic4 instanceof TLRPC.TL_forumTopic) && ((TLRPC.TL_forumTopic) forumTopic4).pinned) {
                                                            CharSequence F522 = F5(bd.Y(2131750970, "EventLogPinTopic", new Object[0]), "un1", user);
                                                            this.v = F522;
                                                            this.v = F5(F522, "un2", tL_channelAdminLogEventActionPinTopic.new_topic);
                                                        } else {
                                                            CharSequence F523 = F5(bd.Y(2131750892, "EventLogUnpinTopic", new Object[0]), "un1", user);
                                                            this.v = F523;
                                                            this.v = F5(F523, "un2", tL_channelAdminLogEventActionPinTopic.new_topic);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleAntiSpam) {
                                                        if (((TLRPC.TL_channelAdminLogEventActionToggleAntiSpam) channelAdminLogEventAction).new_value) {
                                                            L02 = bd.L0(2131751011);
                                                        } else {
                                                            L02 = bd.L0(2131751030);
                                                        }
                                                        this.v = F5(L02, "un1", user);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeColor) {
                                                        boolean V = t3.V(chat2);
                                                        TLRPC.TL_channelAdminLogEventActionChangeColor tL_channelAdminLogEventActionChangeColor = (TLRPC.TL_channelAdminLogEventActionChangeColor) tL_channelAdminLogEvent.action;
                                                        int i32 = V ? 2131751072 : 2131751071;
                                                        int i33 = tL_channelAdminLogEventActionChangeColor.prev_value;
                                                        int[][] iArr4 = org.telegram.ui.Components.u8.L;
                                                        this.v = F5(bd.Z(i32, bd.M0(new int[]{2131752012, 2131752017, 2131752008, 2131752018, 2131752019, 2131752020, 2131752013}[i33 % 7], null).toLowerCase(), bd.M0(new int[]{2131752012, 2131752017, 2131752008, 2131752018, 2131752019, 2131752020, 2131752013}[tL_channelAdminLogEventActionChangeColor.new_value % 7], null).toLowerCase()), "un1", user);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangePeerColor) {
                                                        boolean V2 = t3.V(chat2);
                                                        TLRPC.TL_channelAdminLogEventActionChangePeerColor tL_channelAdminLogEventActionChangePeerColor = (TLRPC.TL_channelAdminLogEventActionChangePeerColor) tL_channelAdminLogEvent.action;
                                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(bd.L0(V2 ? 2131751054 : 2131751053));
                                                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                                        if ((tL_channelAdminLogEventActionChangePeerColor.prev_value.flags & 1) != 0) {
                                                            spannableStringBuilder4.append((CharSequence) "c");
                                                            str = str;
                                                            i10 = i3;
                                                            cy0 cy0Var = new cy0(false, i10, tL_channelAdminLogEventActionChangePeerColor.prev_value.color);
                                                            cy0Var.a(g0.L(18.0f));
                                                            spannableStringBuilder4.setSpan(cy0Var, spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                                                        } else {
                                                            str = str;
                                                            i10 = i3;
                                                        }
                                                        if ((tL_channelAdminLogEventActionChangePeerColor.prev_value.flags & 2) != 0) {
                                                            if (spannableStringBuilder4.length() > 0) {
                                                                spannableStringBuilder4.append((CharSequence) ", ");
                                                            }
                                                            spannableStringBuilder4.append((CharSequence) "e");
                                                            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.p5(tL_channelAdminLogEventActionChangePeerColor.prev_value.background_emoji_id, org.telegram.ui.ActionBar.k6.s2.getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                                                        }
                                                        if (spannableStringBuilder4.length() == 0) {
                                                            spannableStringBuilder4.append((CharSequence) bd.L0(2131751014));
                                                        }
                                                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                                        if ((tL_channelAdminLogEventActionChangePeerColor.new_value.flags & 1) != 0) {
                                                            spannableStringBuilder5.append((CharSequence) "c");
                                                            cy0 cy0Var2 = new cy0(false, i10, tL_channelAdminLogEventActionChangePeerColor.new_value.color);
                                                            cy0Var2.a(g0.L(18.0f));
                                                            spannableStringBuilder5.setSpan(cy0Var2, spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                                                        }
                                                        if ((tL_channelAdminLogEventActionChangePeerColor.new_value.flags & 2) != 0) {
                                                            if (spannableStringBuilder5.length() > 0) {
                                                                spannableStringBuilder5.append((CharSequence) ", ");
                                                            }
                                                            spannableStringBuilder5.append((CharSequence) "e");
                                                            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.p5(tL_channelAdminLogEventActionChangePeerColor.new_value.background_emoji_id, org.telegram.ui.ActionBar.k6.s2.getFontMetricsInt()), spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                                                        }
                                                        if (spannableStringBuilder5.length() == 0) {
                                                            spannableStringBuilder5.append((CharSequence) bd.L0(2131751014));
                                                        }
                                                        this.v = F5(g0.K2(g0.K2(spannableStringBuilder3, spannableStringBuilder4, "%1$s"), spannableStringBuilder5, "%2$s"), "un1", user);
                                                    } else {
                                                        str = str;
                                                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeProfilePeerColor) {
                                                            boolean V3 = t3.V(chat);
                                                            TLRPC.TL_channelAdminLogEventActionChangeProfilePeerColor tL_channelAdminLogEventActionChangeProfilePeerColor = (TLRPC.TL_channelAdminLogEventActionChangeProfilePeerColor) tL_channelAdminLogEvent.action;
                                                            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(bd.L0(V3 ? 2131751052 : 2131751051));
                                                            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                                                            if ((tL_channelAdminLogEventActionChangeProfilePeerColor.prev_value.flags & 1) != 0) {
                                                                spannableStringBuilder7.append((CharSequence) "c");
                                                                cy0 cy0Var3 = new cy0(true, i3, tL_channelAdminLogEventActionChangeProfilePeerColor.prev_value.color);
                                                                cy0Var3.a(g0.L(18.0f));
                                                                spannableStringBuilder7.setSpan(cy0Var3, spannableStringBuilder7.length() - 1, spannableStringBuilder7.length(), 33);
                                                            }
                                                            if ((tL_channelAdminLogEventActionChangeProfilePeerColor.prev_value.flags & 2) != 0) {
                                                                if (spannableStringBuilder7.length() > 0) {
                                                                    spannableStringBuilder7.append((CharSequence) ", ");
                                                                }
                                                                spannableStringBuilder7.append((CharSequence) "e");
                                                                spannableStringBuilder7.setSpan(new org.telegram.ui.Components.p5(tL_channelAdminLogEventActionChangeProfilePeerColor.prev_value.background_emoji_id, org.telegram.ui.ActionBar.k6.s2.getFontMetricsInt()), spannableStringBuilder7.length() - 1, spannableStringBuilder7.length(), 33);
                                                            }
                                                            if (spannableStringBuilder7.length() == 0) {
                                                                spannableStringBuilder7.append((CharSequence) bd.L0(2131751014));
                                                            }
                                                            SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                                                            if ((tL_channelAdminLogEventActionChangeProfilePeerColor.new_value.flags & 1) != 0) {
                                                                spannableStringBuilder8.append((CharSequence) "c");
                                                                cy0 cy0Var4 = new cy0(true, i3, tL_channelAdminLogEventActionChangeProfilePeerColor.new_value.color);
                                                                cy0Var4.a(g0.L(18.0f));
                                                                spannableStringBuilder8.setSpan(cy0Var4, spannableStringBuilder8.length() - 1, spannableStringBuilder8.length(), 33);
                                                            }
                                                            if ((tL_channelAdminLogEventActionChangeProfilePeerColor.new_value.flags & 2) != 0) {
                                                                if (spannableStringBuilder8.length() > 0) {
                                                                    spannableStringBuilder8.append((CharSequence) ", ");
                                                                }
                                                                spannableStringBuilder8.append((CharSequence) "e");
                                                                spannableStringBuilder8.setSpan(new org.telegram.ui.Components.p5(tL_channelAdminLogEventActionChangeProfilePeerColor.new_value.background_emoji_id, org.telegram.ui.ActionBar.k6.s2.getFontMetricsInt()), spannableStringBuilder8.length() - 1, spannableStringBuilder8.length(), 33);
                                                            }
                                                            if (spannableStringBuilder8.length() == 0) {
                                                                spannableStringBuilder8.append((CharSequence) bd.L0(2131751014));
                                                            }
                                                            this.v = F5(g0.K2(g0.K2(spannableStringBuilder6, spannableStringBuilder7, "%1$s"), spannableStringBuilder8, "%2$s"), "un1", user);
                                                        } else {
                                                            if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStatus) {
                                                                boolean V4 = t3.V(chat);
                                                                tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                                TLRPC.TL_channelAdminLogEventActionChangeEmojiStatus tL_channelAdminLogEventActionChangeEmojiStatus = (TLRPC.TL_channelAdminLogEventActionChangeEmojiStatus) tL_channelAdminLogEvent2.action;
                                                                if (tL_channelAdminLogEventActionChangeEmojiStatus.prev_value instanceof TLRPC.TL_emojiStatusEmpty) {
                                                                    spannableString3 = new SpannableString(bd.L0(2131751014));
                                                                    z11 = true;
                                                                } else {
                                                                    spannableString3 = new SpannableString("e");
                                                                    spannableString3.setSpan(new org.telegram.ui.Components.p5(m5.f(tL_channelAdminLogEventActionChangeEmojiStatus.prev_value), org.telegram.ui.ActionBar.k6.s2.getFontMetricsInt()), 0, 1, 33);
                                                                    z11 = false;
                                                                }
                                                                int g7 = m5.g(tL_channelAdminLogEventActionChangeEmojiStatus.new_value);
                                                                if (tL_channelAdminLogEventActionChangeEmojiStatus.new_value instanceof TLRPC.TL_emojiStatusEmpty) {
                                                                    spannableString4 = new SpannableString(bd.L0(2131751014));
                                                                } else {
                                                                    SpannableString spannableString5 = new SpannableString("e");
                                                                    spannableString5.setSpan(new org.telegram.ui.Components.p5(m5.f(tL_channelAdminLogEventActionChangeEmojiStatus.new_value), org.telegram.ui.ActionBar.k6.s2.getFontMetricsInt()), 0, 1, 33);
                                                                    spannableString4 = spannableString5;
                                                                }
                                                                SpannableStringBuilder K2 = g0.K2(g0.K2(new SpannableStringBuilder(bd.L0(z11 ? g7 != 0 ? V4 ? 2131751066 : 2131751065 : V4 ? 2131751067 : 2131751060 : g7 != 0 ? V4 ? 2131751063 : 2131751062 : V4 ? 2131751064 : 2131751061)), spannableString3, "%1$s"), spannableString4, "%2$s");
                                                                this.v = F5(g7 != 0 ? g0.K2(K2, bd.c0((int) ((g7 - tL_channelAdminLogEvent2.date) * 1.05f)), "%3$s") : K2, "un1", user);
                                                            } else {
                                                                tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                                                                    TLRPC.TL_channelAdminLogEventActionChangeWallpaper tL_channelAdminLogEventActionChangeWallpaper = (TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction;
                                                                    boolean V5 = t3.V(chat);
                                                                    TLRPC.WallPaper wallPaper = tL_channelAdminLogEventActionChangeWallpaper.new_value;
                                                                    if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && wallPaper.id == 0 && wallPaper.settings == null) {
                                                                        this.v = F5(bd.L0(V5 ? 2131750928 : 2131750927), "un1", user);
                                                                    } else {
                                                                        ArrayList arrayList7 = new ArrayList();
                                                                        this.n0 = arrayList7;
                                                                        TLRPC.Document document = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                                                        if (document != null) {
                                                                            arrayList7.addAll(document.thumbs);
                                                                            this.l0 = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                                                        }
                                                                        this.v = F5(bd.L0(V5 ? 2131751049 : 2131751048), "un1", user);
                                                                    }
                                                                } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeBackgroundEmoji) {
                                                                    boolean V6 = t3.V(chat);
                                                                    TLRPC.TL_channelAdminLogEventActionChangeBackgroundEmoji tL_channelAdminLogEventActionChangeBackgroundEmoji = (TLRPC.TL_channelAdminLogEventActionChangeBackgroundEmoji) tL_channelAdminLogEvent2.action;
                                                                    this.v = F5(bd.L0(V6 ? 2131751070 : 2131751069), "un1", user);
                                                                    if (tL_channelAdminLogEventActionChangeBackgroundEmoji.prev_value == 0) {
                                                                        spannableString = new SpannableString(bd.L0(2131751014));
                                                                    } else {
                                                                        spannableString = new SpannableString("e");
                                                                        spannableString.setSpan(new org.telegram.ui.Components.p5(tL_channelAdminLogEventActionChangeBackgroundEmoji.prev_value, org.telegram.ui.ActionBar.k6.s2.getFontMetricsInt()), 0, 1, 33);
                                                                    }
                                                                    this.v = g0.K2(this.v, spannableString, "%1$s");
                                                                    if (tL_channelAdminLogEventActionChangeBackgroundEmoji.new_value == 0) {
                                                                        spannableString2 = new SpannableString(bd.L0(2131751014));
                                                                    } else {
                                                                        spannableString2 = new SpannableString("e");
                                                                        spannableString2.setSpan(new org.telegram.ui.Components.p5(tL_channelAdminLogEventActionChangeBackgroundEmoji.new_value, org.telegram.ui.ActionBar.k6.s2.getFontMetricsInt()), 0, 1, 33);
                                                                    }
                                                                    this.v = g0.K2(this.v, spannableString2, "%2$s");
                                                                } else {
                                                                    this.v = "unsupported " + tL_channelAdminLogEvent2.action;
                                                                }
                                                            }
                                                            chat2 = chat;
                                                        }
                                                    }
                                                    str = str;
                                                    tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                }
                                                str = str;
                                                message2 = message;
                                                tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                            }
                                            arrayList3 = null;
                                            if (this.k == null) {
                                            }
                                            this.k.message = this.v.toString();
                                            this.k.from_id = new TLRPC.TL_peerUser();
                                            TLRPC.Message message72 = this.k;
                                            message72.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                                            message72.date = tL_channelAdminLogEvent2.date;
                                            int i252 = iArr[0];
                                            iArr[0] = i252 + 1;
                                            message72.id = i252;
                                            this.T = tL_channelAdminLogEvent2.id;
                                            message72.out = false;
                                            message72.peer_id = new TLRPC.TL_peerChannel();
                                            TLRPC.Message message82 = this.k;
                                            message82.peer_id.channel_id = chat2.id;
                                            message82.unread = false;
                                            MediaController B2 = MediaController.B();
                                            this.U2 = null;
                                            if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
                                            }
                                            if (message3 == null) {
                                            }
                                            iArr2 = null;
                                            if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                            }
                                        }
                                    }
                                    tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                }
                                tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                chat2 = chat;
                            }
                        }
                        tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                        chat2 = chat;
                        arrayList3 = null;
                        if (this.k == null) {
                        }
                        this.k.message = this.v.toString();
                        this.k.from_id = new TLRPC.TL_peerUser();
                        TLRPC.Message message722 = this.k;
                        message722.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                        message722.date = tL_channelAdminLogEvent2.date;
                        int i2522 = iArr[0];
                        iArr[0] = i2522 + 1;
                        message722.id = i2522;
                        this.T = tL_channelAdminLogEvent2.id;
                        message722.out = false;
                        message722.peer_id = new TLRPC.TL_peerChannel();
                        TLRPC.Message message822 = this.k;
                        message822.peer_id.channel_id = chat2.id;
                        message822.unread = false;
                        MediaController B22 = MediaController.B();
                        this.U2 = null;
                        if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
                        }
                        if (message3 == null) {
                        }
                        iArr2 = null;
                        if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                        }
                    }
                    message2 = null;
                    arrayList3 = null;
                    if (this.k == null) {
                    }
                    this.k.message = this.v.toString();
                    this.k.from_id = new TLRPC.TL_peerUser();
                    TLRPC.Message message7222 = this.k;
                    message7222.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                    message7222.date = tL_channelAdminLogEvent2.date;
                    int i25222 = iArr[0];
                    iArr[0] = i25222 + 1;
                    message7222.id = i25222;
                    this.T = tL_channelAdminLogEvent2.id;
                    message7222.out = false;
                    message7222.peer_id = new TLRPC.TL_peerChannel();
                    TLRPC.Message message8222 = this.k;
                    message8222.peer_id.channel_id = chat2.id;
                    message8222.unread = false;
                    MediaController B222 = MediaController.B();
                    this.U2 = null;
                    if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
                    }
                    if (message3 == null) {
                    }
                    iArr2 = null;
                    if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                    }
                }
            }
            user = a23;
            str = "";
            if (z16) {
                TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                channelParticipant = tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant;
                channelParticipant2 = tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant;
            } else {
                TLRPC.TL_channelAdminLogEventActionParticipantToggleBan tL_channelAdminLogEventActionParticipantToggleBan3 = (TLRPC.TL_channelAdminLogEventActionParticipantToggleBan) channelAdminLogEventAction;
                channelParticipant = tL_channelAdminLogEventActionParticipantToggleBan3.prev_participant;
                channelParticipant2 = tL_channelAdminLogEventActionParticipantToggleBan3.new_participant;
            }
            TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
            this.k = tL_message5;
            tL_message5.realId = -1;
            long C16 = C1(channelParticipant.peer);
            if (C16 > 0) {
                a22 = hp.s1(i3).a2(Long.valueOf(C16));
            } else {
                a22 = hp.s1(i3).a2(Long.valueOf(-C16));
            }
            if (!(channelParticipant instanceof TLRPC.TL_channelParticipantCreator) && (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) {
                String L05 = bd.L0(2131751055);
                sb2 = new StringBuilder(String.format(L05, f2(a22, this.k.entities, L05.indexOf("%1$s"))));
                chat2 = chat;
            } else {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = channelParticipant.admin_rights;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                tL_chatAdminRights = tL_chatAdminRights == null ? new TLRPC.TL_chatAdminRights() : tL_chatAdminRights;
                tL_chatAdminRights2 = tL_chatAdminRights2 == null ? new TLRPC.TL_chatAdminRights() : tL_chatAdminRights2;
                if (tL_chatAdminRights2.other) {
                    L0 = bd.L0(2131750950);
                } else {
                    L0 = bd.L0(2131750965);
                }
                StringBuilder sb6 = new StringBuilder(String.format(L0, f2(a22, this.k.entities, L0.indexOf("%1$s"))));
                sb6.append("\n");
                if (!TextUtils.equals(channelParticipant.rank, channelParticipant2.rank)) {
                    if (TextUtils.isEmpty(channelParticipant2.rank)) {
                        sb6.append("\n- ");
                        sb6.append(bd.L0(2131750946));
                    } else {
                        sb6.append("\n+ ");
                        sb6.append(bd.Y(2131750944, "EventLogPromotedTitle", channelParticipant2.rank));
                    }
                }
                if (tL_chatAdminRights.change_info != tL_chatAdminRights2.change_info) {
                    sb6.append('\n');
                    sb6.append(tL_chatAdminRights2.change_info ? '+' : '-');
                    sb6.append(' ');
                    chat2 = chat;
                    sb6.append(bd.L0(chat2.megagroup ? 2131750960 : 2131750961));
                } else {
                    chat2 = chat;
                }
                if (!chat2.megagroup) {
                    if (tL_chatAdminRights.post_messages != tL_chatAdminRights2.post_messages) {
                        sb6.append('\n');
                        k5.s(sb6, tL_chatAdminRights2.post_messages ? '+' : '-', ' ', 2131750948);
                    }
                    if (tL_chatAdminRights.edit_messages != tL_chatAdminRights2.edit_messages) {
                        sb6.append('\n');
                        k5.s(sb6, tL_chatAdminRights2.edit_messages ? '+' : '-', ' ', 2131750957);
                    }
                }
                if (tL_chatAdminRights.post_stories != tL_chatAdminRights2.post_stories) {
                    sb6.append('\n');
                    k5.s(sb6, tL_chatAdminRights2.post_stories ? '+' : '-', ' ', 2131750947);
                }
                if (tL_chatAdminRights.edit_stories != tL_chatAdminRights2.edit_stories) {
                    sb6.append('\n');
                    k5.s(sb6, tL_chatAdminRights2.edit_stories ? '+' : '-', ' ', 2131750955);
                }
                if (tL_chatAdminRights.delete_stories != tL_chatAdminRights2.delete_stories) {
                    sb6.append('\n');
                    k5.s(sb6, tL_chatAdminRights2.delete_stories ? '+' : '-', ' ', 2131750958);
                }
                if (tL_chatAdminRights.delete_messages != tL_chatAdminRights2.delete_messages) {
                    sb6.append('\n');
                    k5.s(sb6, tL_chatAdminRights2.delete_messages ? '+' : '-', ' ', 2131750959);
                }
                if (tL_chatAdminRights.add_admins != tL_chatAdminRights2.add_admins) {
                    sb6.append('\n');
                    k5.s(sb6, tL_chatAdminRights2.add_admins ? '+' : '-', ' ', 2131750964);
                }
                if (tL_chatAdminRights.anonymous != tL_chatAdminRights2.anonymous) {
                    sb6.append('\n');
                    k5.s(sb6, tL_chatAdminRights2.anonymous ? '+' : '-', ' ', 2131750945);
                }
                if (chat2.megagroup) {
                    if (tL_chatAdminRights.ban_users != tL_chatAdminRights2.ban_users) {
                        sb6.append('\n');
                        k5.s(sb6, tL_chatAdminRights2.ban_users ? '+' : '-', ' ', 2131750962);
                    }
                    if (tL_chatAdminRights.manage_call != tL_chatAdminRights2.manage_call) {
                        sb6.append('\n');
                        k5.s(sb6, tL_chatAdminRights2.manage_call ? '+' : '-', ' ', 2131750954);
                    }
                }
                if (tL_chatAdminRights.invite_users != tL_chatAdminRights2.invite_users) {
                    sb6.append('\n');
                    k5.s(sb6, tL_chatAdminRights2.invite_users ? '+' : '-', ' ', 2131750963);
                }
                if (chat2.megagroup) {
                    if (tL_chatAdminRights.pin_messages != tL_chatAdminRights2.pin_messages) {
                        sb6.append('\n');
                        k5.s(sb6, tL_chatAdminRights2.pin_messages ? '+' : '-', ' ', 2131750949);
                    }
                    if (tL_chatAdminRights.manage_ranks != tL_chatAdminRights2.manage_ranks) {
                        sb6.append('\n');
                        k5.s(sb6, tL_chatAdminRights2.manage_ranks ? '+' : '-', ' ', 2131750956);
                    }
                    if (tL_chatAdminRights.manage_topics != tL_chatAdminRights2.manage_topics) {
                        sb6.append('\n');
                        k5.s(sb6, tL_chatAdminRights2.manage_topics ? '+' : '-', ' ', 2131750952);
                    }
                }
                if (tL_chatAdminRights.manage_direct_messages != tL_chatAdminRights2.manage_direct_messages) {
                    sb6.append('\n');
                    k5.s(sb6, tL_chatAdminRights2.manage_direct_messages ? '+' : '-', ' ', 2131750953);
                }
                if (tL_chatAdminRights.manage_welcome_messages != tL_chatAdminRights2.manage_welcome_messages) {
                    sb6.append('\n');
                    k5.s(sb6, tL_chatAdminRights2.manage_welcome_messages ? '+' : '-', ' ', 2131750951);
                }
                sb2 = sb6;
            }
            this.v = sb2.toString();
            message2 = null;
            arrayList3 = null;
            if (this.k == null) {
            }
            this.k.message = this.v.toString();
            this.k.from_id = new TLRPC.TL_peerUser();
            TLRPC.Message message72222 = this.k;
            message72222.from_id.user_id = tL_channelAdminLogEvent2.user_id;
            message72222.date = tL_channelAdminLogEvent2.date;
            int i252222 = iArr[0];
            iArr[0] = i252222 + 1;
            message72222.id = i252222;
            this.T = tL_channelAdminLogEvent2.id;
            message72222.out = false;
            message72222.peer_id = new TLRPC.TL_peerChannel();
            TLRPC.Message message82222 = this.k;
            message82222.peer_id.channel_id = chat2.id;
            message82222.unread = false;
            MediaController B2222 = MediaController.B();
            this.U2 = null;
            if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
            }
            if (message3 == null) {
            }
            iArr2 = null;
            if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
            }
        }
        user = a23;
        str = "";
        chat2 = chat;
        message2 = null;
        arrayList3 = null;
        if (this.k == null) {
        }
        this.k.message = this.v.toString();
        this.k.from_id = new TLRPC.TL_peerUser();
        TLRPC.Message message722222 = this.k;
        message722222.from_id.user_id = tL_channelAdminLogEvent2.user_id;
        message722222.date = tL_channelAdminLogEvent2.date;
        int i2522222 = iArr[0];
        iArr[0] = i2522222 + 1;
        message722222.id = i2522222;
        this.T = tL_channelAdminLogEvent2.id;
        message722222.out = false;
        message722222.peer_id = new TLRPC.TL_peerChannel();
        TLRPC.Message message822222 = this.k;
        message822222.peer_id.channel_id = chat2.id;
        message822222.unread = false;
        MediaController B22222 = MediaController.B();
        this.U2 = null;
        if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
        }
        if (message3 == null) {
        }
        iArr2 = null;
        if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
        }
    }
}
