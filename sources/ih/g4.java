package ih;

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
import org.telegram.ui.Components.z21;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class g4 {
    public TL_stories.StoryItem a = null;
    public u6 b = null;
    public TL_stories.StoryItem c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public CharSequence h;
    public z7 i;
    public z7 j;
    public final /* synthetic */ i4 k;

    public g4(i4 i4Var) {
        this.k = i4Var;
    }

    public static String c(g4 g4Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = g4Var.a;
        if (storyItem == null || (messageMedia = storyItem.media) == null) {
            if (g4Var.b == null) {
                return "unknown";
            }
            return "uploading from " + g4Var.b.e;
        }
        if (messageMedia.photo != null) {
            StringBuilder sb2 = new StringBuilder("photo#");
            sb2.append(g4Var.a.media.photo.id);
            sb2.append("at");
            return aa.d.l(g4Var.a.media.photo.dc_id, "dc", sb2);
        }
        if (messageMedia.document == null) {
            return "unknown";
        }
        StringBuilder sb3 = new StringBuilder("doc#");
        sb3.append(g4Var.a.media.document.id);
        sb3.append("at");
        return aa.d.l(g4Var.a.media.document.dc_id, "dc", sb3);
    }

    public final boolean d() {
        u6 u6Var = this.b;
        if (u6Var != null) {
            return u6Var.c.H0;
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
        TLRPC.Chat chat = MessagesController.getInstance(this.k.y2).getChat(Long.valueOf(-storyItem.dialogId));
        return chat == null || !chat.noforwards;
    }

    public final String e() {
        i4 i4Var = this.k;
        if (i4Var.K1.a == null) {
            return null;
        }
        if (i4Var.x1 > 0) {
            TLRPC.User user = MessagesController.getInstance(i4Var.y2).getUser(Long.valueOf(i4Var.x1));
            if (UserObject.getPublicUsername(user) == null) {
                return null;
            }
            return i4Var.K1.f ? String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(i4Var.K1.a.id));
        }
        TLRPC.Chat chat = MessagesController.getInstance(i4Var.y2).getChat(Long.valueOf(-i4Var.x1));
        if (ChatObject.getPublicUsername(chat) == null) {
            return null;
        }
        return i4Var.K1.f ? String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(i4Var.K1.a.id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final z7 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.i == null && (storyItem = this.a) != null) {
            TLRPC.Document document = storyItem.music;
            z7 z7Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    z7Var = new z7();
                    z7Var.f = true;
                    z7Var.g = document;
                    if (TextUtils.isEmpty(str)) {
                        z7Var.k = new SpannableStringBuilder(z7.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        z7Var.k = new SpannableStringBuilder(z7.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(z7.d()).append((CharSequence) " ").append((CharSequence) str2);
                        z7Var.k = append;
                        int length = append.length();
                        z7Var.k.append((CharSequence) " ・ ");
                        z7Var.k.setSpan(new y7(), length, z7Var.k.length(), 33);
                        z7Var.k.append((CharSequence) str);
                    }
                }
            }
            this.i = z7Var;
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
        i4 i4Var = this.k;
        if (messageMedia != null && messageMedia.getDocument() != null) {
            return FileLoader.getInstance(i4Var.y2).getPathToAttach(this.a.media.getDocument());
        }
        TLRPC.MessageMedia messageMedia2 = this.a.media;
        if (messageMedia2 == null || (photo = messageMedia2.photo) == null) {
            return null;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID);
        File pathToAttach = FileLoader.getInstance(i4Var.y2).getPathToAttach(closestPhotoSizeWithSize, true);
        return !pathToAttach.exists() ? FileLoader.getInstance(i4Var.y2).getPathToAttach(closestPhotoSizeWithSize, false) : pathToAttach;
    }

    public final z7 i() {
        ArrayList arrayList;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        if (this.j == null) {
            TL_stories.StoryItem storyItem = this.a;
            z7 z7Var = null;
            if (storyItem != null) {
                int i9 = this.k.y2;
                if (storyItem.fwd_from != null) {
                    z7Var = new z7();
                    z7Var.a = i9;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        z7Var.b = Long.valueOf(peerDialogId);
                        if (peerDialogId >= 0) {
                            z7Var.k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i9).getUser(Long.valueOf(peerDialogId))));
                        } else {
                            TLRPC.Chat chat3 = MessagesController.getInstance(i9).getChat(Long.valueOf(-peerDialogId));
                            z7Var.k = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat3) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) (chat3 != null ? chat3.title : ""));
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        z7Var.k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    z7Var.f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        z7Var.c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    z7Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (r1 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(r1) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(r1);
                        }
                        r1++;
                    }
                    if (tL_mediaAreaChannelPost != null && (chat2 = MessagesController.getInstance(i9).getChat(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        z7Var = new z7();
                        z7Var.b = Long.valueOf(-chat2.id);
                        z7Var.e = true;
                        z7Var.a = i9;
                        z7Var.f = true;
                        z7Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        z7Var.k = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat2) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) chat2.title);
                    }
                }
                this.j = z7Var;
            } else {
                u6 u6Var = this.b;
                if (u6Var != null) {
                    kh.a8 a8Var = u6Var.c;
                    if (a8Var != null) {
                        if (a8Var.n) {
                            z7Var = new z7();
                            z7Var.k = a8Var.p;
                            String str = a8Var.s;
                            z7Var.l = str;
                            z7Var.f = TextUtils.isEmpty(str);
                        } else if (a8Var.u && (arrayList = a8Var.v) != null && arrayList.size() > 0) {
                            MessageObject messageObject = (MessageObject) a8Var.v.get(0);
                            long p6 = kh.a8.p(messageObject);
                            if (p6 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-p6))) != null) {
                                z7Var = new z7();
                                z7Var.b = Long.valueOf(p6);
                                z7Var.e = true;
                                z7Var.a = messageObject.currentAccount;
                                z7Var.f = true;
                                Boolean D = kh.a8.D(messageObject);
                                z7Var.d = Integer.valueOf(D != null ? D.booleanValue() ? messageObject.messageOwner.fwd_from.channel_post : messageObject.getId() : 0);
                                z7Var.k = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) chat.title);
                            }
                        }
                    }
                    this.j = z7Var;
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
        for (int i9 = 0; i9 < document.attributes.size(); i9++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i9);
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
        u6 u6Var = this.b;
        if (u6Var != null) {
            return u6Var.s;
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
        int i9;
        this.g = false;
        i4 i4Var = this.k;
        p3 p3Var = i4Var.G0;
        g4 g4Var = i4Var.K1;
        u6 u6Var = g4Var.b;
        if (u6Var != null) {
            CharSequence charSequence = u6Var.c.C0;
            this.h = charSequence;
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, p3Var.U.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji;
            SpannableStringBuilder spannableStringBuilder = replaceEmoji == null ? new SpannableStringBuilder() : SpannableStringBuilder.valueOf(replaceEmoji);
            TLRPC.User user = MessagesController.getInstance(i4Var.y2).getUser(Long.valueOf(i4Var.x1));
            if (i4Var.x1 < 0 || MessagesController.getInstance(i4Var.y2).storyEntitiesAllowed(user)) {
                MessageObject.addLinks(true, spannableStringBuilder);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = g4Var.a;
        if (storyItem != null) {
            if (!storyItem.translated || storyItem.translatedText == null || !TextUtils.equals(storyItem.translatedLng, z21.A())) {
                String str = g4Var.a.caption;
                this.h = str;
                CharSequence replaceEmoji2 = Emoji.replaceEmoji(str, p3Var.U.getPaint().getFontMetricsInt(), false);
                this.h = replaceEmoji2;
                if (replaceEmoji2 == null || g4Var.a.entities == null) {
                    return;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(g4Var.a.caption), g4Var.a.entities, p3Var.U.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf, p3Var.U.getPaint().getFontMetricsInt(), false));
                i9 = (i4Var.x1 < 0 || MessagesController.getInstance(i4Var.y2).storyEntitiesAllowed(MessagesController.getInstance(i4Var.y2).getUser(Long.valueOf(i4Var.x1)))) ? 1 : 0;
                if (i9 != 0) {
                    MessageObject.addLinks(true, valueOf);
                }
                MessageObject.addEntitiesToText(valueOf, g4Var.a.entities, false, true, true, false, i9 ^ 1);
                this.h = valueOf;
                return;
            }
            this.g = true;
            TLRPC.TL_textWithEntities tL_textWithEntities = g4Var.a.translatedText;
            String str2 = tL_textWithEntities.text;
            this.h = str2;
            CharSequence replaceEmoji3 = Emoji.replaceEmoji(str2, p3Var.U.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji3;
            if (replaceEmoji3 == null || tL_textWithEntities.entities == null) {
                return;
            }
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, p3Var.U.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf2, p3Var.U.getPaint().getFontMetricsInt(), false));
            i9 = (i4Var.x1 < 0 || MessagesController.getInstance(i4Var.y2).storyEntitiesAllowed(MessagesController.getInstance(i4Var.y2).getUser(Long.valueOf(i4Var.x1)))) ? 1 : 0;
            if (i9 != 0) {
                MessageObject.addLinks(true, valueOf2);
            }
            MessageObject.addEntitiesToText(valueOf2, tL_textWithEntities.entities, false, true, true, false, i9 ^ 1);
            this.h = valueOf2;
        }
    }
}
