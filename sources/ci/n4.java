package ci;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.r41;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class n4 {
    public TL_stories.StoryItem a = null;
    public g7 b = null;
    public TL_stories.StoryItem c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public CharSequence h;
    public m8 i;
    public m8 j;
    public final /* synthetic */ p4 k;

    public n4(p4 p4Var) {
        this.k = p4Var;
    }

    public static String c(n4 n4Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = n4Var.a;
        if (storyItem == null || (messageMedia = storyItem.media) == null) {
            if (n4Var.b == null) {
                return "unknown";
            }
            return "uploading from " + n4Var.b.e;
        }
        if (messageMedia.photo != null) {
            StringBuilder sb2 = new StringBuilder("photo#");
            sb2.append(n4Var.a.media.photo.id);
            sb2.append("at");
            return a1.g.n(n4Var.a.media.photo.dc_id, "dc", sb2);
        }
        if (messageMedia.document == null) {
            return "unknown";
        }
        StringBuilder sb3 = new StringBuilder("doc#");
        sb3.append(n4Var.a.media.document.id);
        sb3.append("at");
        return a1.g.n(n4Var.a.media.document.dc_id, "dc", sb3);
    }

    public final boolean d() {
        g7 g7Var = this.b;
        if (g7Var != null) {
            return g7Var.c.H0;
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem == null) {
            return true;
        }
        if (storyItem.noforwards) {
            return false;
        }
        if (!storyItem.pinned) {
            return true;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.k.C2).getChat(Long.valueOf(-storyItem.dialogId));
        return chat == null || !chat.noforwards;
    }

    public final String e() {
        p4 p4Var = this.k;
        if (p4Var.O1.a == null) {
            return null;
        }
        if (p4Var.B1 > 0) {
            TLRPC.User user = MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(p4Var.B1));
            if (UserObject.getPublicUsername(user) == null) {
                return null;
            }
            return p4Var.O1.f ? String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(p4Var.O1.a.id));
        }
        TLRPC.Chat chat = MessagesController.getInstance(p4Var.C2).getChat(Long.valueOf(-p4Var.B1));
        if (ChatObject.getPublicUsername(chat) == null) {
            return null;
        }
        return p4Var.O1.f ? String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(p4Var.O1.a.id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final m8 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.i == null && (storyItem = this.a) != null) {
            TLRPC.Document document = storyItem.music;
            m8 m8Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    m8Var = new m8();
                    m8Var.f = true;
                    m8Var.g = document;
                    if (TextUtils.isEmpty(str)) {
                        m8Var.k = new SpannableStringBuilder(m8.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        m8Var.k = new SpannableStringBuilder(m8.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(m8.d()).append((CharSequence) " ").append((CharSequence) str2);
                        m8Var.k = append;
                        int length = append.length();
                        m8Var.k.append((CharSequence) " ・ ");
                        m8Var.k.setSpan(new l8(), length, m8Var.k.length(), 33);
                        m8Var.k.append((CharSequence) str);
                    }
                }
            }
            this.i = m8Var;
        }
        return this.i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem == null) {
            return null;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        p4 p4Var = this.k;
        if (messageMedia != null && messageMedia.getDocument() != null) {
            return FileLoader.getInstance(p4Var.C2).getPathToAttach(this.a.media.getDocument());
        }
        TLRPC.MessageMedia messageMedia2 = this.a.media;
        if (messageMedia2 == null || (photo = messageMedia2.photo) == null) {
            return null;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID);
        File pathToAttach = FileLoader.getInstance(p4Var.C2).getPathToAttach(closestPhotoSizeWithSize, true);
        return !pathToAttach.exists() ? FileLoader.getInstance(p4Var.C2).getPathToAttach(closestPhotoSizeWithSize, false) : pathToAttach;
    }

    public final m8 i() {
        ArrayList arrayList;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        if (this.j == null) {
            TL_stories.StoryItem storyItem = this.a;
            m8 m8Var = null;
            if (storyItem != null) {
                int i10 = this.k.C2;
                if (storyItem.fwd_from != null) {
                    m8Var = new m8();
                    m8Var.a = i10;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        m8Var.b = Long.valueOf(peerDialogId);
                        if (peerDialogId >= 0) {
                            m8Var.k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId))));
                        } else {
                            TLRPC.Chat chat3 = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
                            m8Var.k = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat3) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) (chat3 != null ? chat3.title : ""));
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        m8Var.k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    m8Var.f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        m8Var.c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    m8Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (r1 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(r1) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(r1);
                        }
                        r1++;
                    }
                    if (tL_mediaAreaChannelPost != null && (chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        m8Var = new m8();
                        m8Var.b = Long.valueOf(-chat2.id);
                        m8Var.e = true;
                        m8Var.a = i10;
                        m8Var.f = true;
                        m8Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        m8Var.k = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat2) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) chat2.title);
                    }
                }
                this.j = m8Var;
            } else {
                g7 g7Var = this.b;
                if (g7Var != null) {
                    ei.a8 a8Var = g7Var.c;
                    if (a8Var != null) {
                        if (a8Var.n) {
                            m8Var = new m8();
                            m8Var.k = a8Var.p;
                            String str = a8Var.s;
                            m8Var.l = str;
                            m8Var.f = TextUtils.isEmpty(str);
                        } else if (a8Var.u && (arrayList = a8Var.v) != null && arrayList.size() > 0) {
                            MessageObject messageObject = (MessageObject) a8Var.v.get(0);
                            long p5 = ei.a8.p(messageObject);
                            if (p5 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-p5))) != null) {
                                m8Var = new m8();
                                m8Var.b = Long.valueOf(p5);
                                m8Var.e = true;
                                m8Var.a = messageObject.currentAccount;
                                m8Var.f = true;
                                Boolean D = ei.a8.D(messageObject);
                                m8Var.d = Integer.valueOf(D != null ? D.booleanValue() ? messageObject.messageOwner.fwd_from.channel_post : messageObject.getId() : 0);
                                m8Var.k = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) chat.title);
                            }
                        }
                    }
                    this.j = m8Var;
                }
            }
        }
        return this.j;
    }

    public final boolean j() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem == null || (messageMedia = storyItem.media) == null || (document = messageMedia.getDocument()) == null) {
            if (this.b != null) {
                return !r0.c.Y;
            }
            return true;
        }
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(long j10) {
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem == null) {
            return false;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        return (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j10 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.id;
    }

    public final boolean l() {
        return this.e;
    }

    public final boolean m() {
        String str;
        TLRPC.MessageMedia messageMedia;
        g7 g7Var = this.b;
        if (g7Var != null) {
            return g7Var.s;
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.a.media.getDocument();
            return MessageObject.isVideoDocument(document) || "video/mp4".equals(document.mime_type);
        }
        TL_stories.StoryItem storyItem2 = this.a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        TLRPC.MessageMedia messageMedia;
        this.a = storyItem;
        this.j = null;
        this.i = null;
        this.b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.e = m();
        TL_stories.StoryItem storyItem2 = this.a;
        this.f = (storyItem2 == null || (messageMedia = storyItem2.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
    }

    public final void o() {
        int i10;
        this.g = false;
        p4 p4Var = this.k;
        u3 u3Var = p4Var.K0;
        n4 n4Var = p4Var.O1;
        g7 g7Var = n4Var.b;
        if (g7Var != null) {
            CharSequence charSequence = g7Var.c.C0;
            this.h = charSequence;
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, u3Var.b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji;
            SpannableStringBuilder spannableStringBuilder = replaceEmoji == null ? new SpannableStringBuilder() : SpannableStringBuilder.valueOf(replaceEmoji);
            TLRPC.User user = MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(p4Var.B1));
            if (p4Var.B1 < 0 || MessagesController.getInstance(p4Var.C2).storyEntitiesAllowed(user)) {
                MessageObject.addLinks(true, spannableStringBuilder);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = n4Var.a;
        if (storyItem != null) {
            if (!storyItem.translated || storyItem.translatedText == null || !TextUtils.equals(storyItem.translatedLng, r41.C())) {
                String str = n4Var.a.caption;
                this.h = str;
                CharSequence replaceEmoji2 = Emoji.replaceEmoji(str, u3Var.b0.getPaint().getFontMetricsInt(), false);
                this.h = replaceEmoji2;
                if (replaceEmoji2 == null || n4Var.a.entities == null) {
                    return;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(n4Var.a.caption), n4Var.a.entities, u3Var.b0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf, u3Var.b0.getPaint().getFontMetricsInt(), false));
                i10 = (p4Var.B1 < 0 || MessagesController.getInstance(p4Var.C2).storyEntitiesAllowed(MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(p4Var.B1)))) ? 1 : 0;
                if (i10 != 0) {
                    MessageObject.addLinks(true, valueOf);
                }
                MessageObject.addEntitiesToText(valueOf, n4Var.a.entities, false, true, true, false, i10 ^ 1);
                this.h = valueOf;
                return;
            }
            this.g = true;
            TLRPC.TL_textWithEntities tL_textWithEntities = n4Var.a.translatedText;
            String str2 = tL_textWithEntities.text;
            this.h = str2;
            CharSequence replaceEmoji3 = Emoji.replaceEmoji(str2, u3Var.b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji3;
            if (replaceEmoji3 == null || tL_textWithEntities.entities == null) {
                return;
            }
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, u3Var.b0.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf2, u3Var.b0.getPaint().getFontMetricsInt(), false));
            i10 = (p4Var.B1 < 0 || MessagesController.getInstance(p4Var.C2).storyEntitiesAllowed(MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(p4Var.B1)))) ? 1 : 0;
            if (i10 != 0) {
                MessageObject.addLinks(true, valueOf2);
            }
            MessageObject.addEntitiesToText(valueOf2, tL_textWithEntities.entities, false, true, true, false, i10 ^ 1);
            this.h = valueOf2;
        }
    }
}
