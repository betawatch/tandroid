package nh;

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
import org.telegram.ui.Components.v31;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class b4 {
    public TL_stories.StoryItem a = null;
    public s6 b = null;
    public TL_stories.StoryItem c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public CharSequence h;
    public v7 i;
    public v7 j;
    public final /* synthetic */ d4 k;

    public b4(d4 d4Var) {
        this.k = d4Var;
    }

    public static String c(b4 b4Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = b4Var.a;
        if (storyItem == null || (messageMedia = storyItem.media) == null) {
            if (b4Var.b == null) {
                return "unknown";
            }
            return "uploading from " + b4Var.b.e;
        }
        if (messageMedia.photo != null) {
            StringBuilder sb = new StringBuilder("photo#");
            sb.append(b4Var.a.media.photo.id);
            sb.append("at");
            return android.support.v4.media.a.m(b4Var.a.media.photo.dc_id, "dc", sb);
        }
        if (messageMedia.document == null) {
            return "unknown";
        }
        StringBuilder sb2 = new StringBuilder("doc#");
        sb2.append(b4Var.a.media.document.id);
        sb2.append("at");
        return android.support.v4.media.a.m(b4Var.a.media.document.dc_id, "dc", sb2);
    }

    public final boolean d() {
        s6 s6Var = this.b;
        if (s6Var != null) {
            return s6Var.c.H0;
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
        TLRPC.Chat chat = MessagesController.getInstance(this.k.z2).getChat(Long.valueOf(-storyItem.dialogId));
        return chat == null || !chat.noforwards;
    }

    public final String e() {
        d4 d4Var = this.k;
        if (d4Var.L1.a == null) {
            return null;
        }
        if (d4Var.y1 > 0) {
            TLRPC.User user = MessagesController.getInstance(d4Var.z2).getUser(Long.valueOf(d4Var.y1));
            if (UserObject.getPublicUsername(user) == null) {
                return null;
            }
            return d4Var.L1.f ? String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(d4Var.L1.a.id));
        }
        TLRPC.Chat chat = MessagesController.getInstance(d4Var.z2).getChat(Long.valueOf(-d4Var.y1));
        if (ChatObject.getPublicUsername(chat) == null) {
            return null;
        }
        return d4Var.L1.f ? String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(d4Var.L1.a.id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final v7 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.i == null && (storyItem = this.a) != null) {
            TLRPC.Document document = storyItem.music;
            v7 v7Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    v7Var = new v7();
                    v7Var.f = true;
                    v7Var.g = document;
                    if (TextUtils.isEmpty(str)) {
                        v7Var.k = new SpannableStringBuilder(v7.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        v7Var.k = new SpannableStringBuilder(v7.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(v7.d()).append((CharSequence) " ").append((CharSequence) str2);
                        v7Var.k = append;
                        int length = append.length();
                        v7Var.k.append((CharSequence) " ・ ");
                        v7Var.k.setSpan(new u7(), length, v7Var.k.length(), 33);
                        v7Var.k.append((CharSequence) str);
                    }
                }
            }
            this.i = v7Var;
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
        d4 d4Var = this.k;
        if (messageMedia != null && messageMedia.getDocument() != null) {
            return FileLoader.getInstance(d4Var.z2).getPathToAttach(this.a.media.getDocument());
        }
        TLRPC.MessageMedia messageMedia2 = this.a.media;
        if (messageMedia2 == null || (photo = messageMedia2.photo) == null) {
            return null;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID);
        File pathToAttach = FileLoader.getInstance(d4Var.z2).getPathToAttach(closestPhotoSizeWithSize, true);
        return !pathToAttach.exists() ? FileLoader.getInstance(d4Var.z2).getPathToAttach(closestPhotoSizeWithSize, false) : pathToAttach;
    }

    public final v7 i() {
        ArrayList arrayList;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        if (this.j == null) {
            TL_stories.StoryItem storyItem = this.a;
            v7 v7Var = null;
            if (storyItem != null) {
                int i10 = this.k.z2;
                if (storyItem.fwd_from != null) {
                    v7Var = new v7();
                    v7Var.a = i10;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        v7Var.b = Long.valueOf(peerDialogId);
                        if (peerDialogId >= 0) {
                            v7Var.k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId))));
                        } else {
                            TLRPC.Chat chat3 = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
                            v7Var.k = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat3) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) (chat3 != null ? chat3.title : ""));
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        v7Var.k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    v7Var.f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        v7Var.c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    v7Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (r1 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(r1) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(r1);
                        }
                        r1++;
                    }
                    if (tL_mediaAreaChannelPost != null && (chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        v7Var = new v7();
                        v7Var.b = Long.valueOf(-chat2.id);
                        v7Var.e = true;
                        v7Var.a = i10;
                        v7Var.f = true;
                        v7Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        v7Var.k = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat2) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) chat2.title);
                    }
                }
                this.j = v7Var;
            } else {
                s6 s6Var = this.b;
                if (s6Var != null) {
                    ph.u6 u6Var = s6Var.c;
                    if (u6Var != null) {
                        if (u6Var.n) {
                            v7Var = new v7();
                            v7Var.k = u6Var.p;
                            String str = u6Var.s;
                            v7Var.l = str;
                            v7Var.f = TextUtils.isEmpty(str);
                        } else if (u6Var.u && (arrayList = u6Var.v) != null && arrayList.size() > 0) {
                            MessageObject messageObject = (MessageObject) u6Var.v.get(0);
                            long p10 = ph.u6.p(messageObject);
                            if (p10 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-p10))) != null) {
                                v7Var = new v7();
                                v7Var.b = Long.valueOf(p10);
                                v7Var.e = true;
                                v7Var.a = messageObject.currentAccount;
                                v7Var.f = true;
                                Boolean D = ph.u6.D(messageObject);
                                v7Var.d = Integer.valueOf(D != null ? D.booleanValue() ? messageObject.messageOwner.fwd_from.channel_post : messageObject.getId() : 0);
                                v7Var.k = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) chat.title);
                            }
                        }
                    }
                    this.j = v7Var;
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
        s6 s6Var = this.b;
        if (s6Var != null) {
            return s6Var.s;
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
        d4 d4Var = this.k;
        m3 m3Var = d4Var.H0;
        b4 b4Var = d4Var.L1;
        s6 s6Var = b4Var.b;
        if (s6Var != null) {
            CharSequence charSequence = s6Var.c.C0;
            this.h = charSequence;
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, m3Var.V.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji;
            SpannableStringBuilder spannableStringBuilder = replaceEmoji == null ? new SpannableStringBuilder() : SpannableStringBuilder.valueOf(replaceEmoji);
            TLRPC.User user = MessagesController.getInstance(d4Var.z2).getUser(Long.valueOf(d4Var.y1));
            if (d4Var.y1 < 0 || MessagesController.getInstance(d4Var.z2).storyEntitiesAllowed(user)) {
                MessageObject.addLinks(true, spannableStringBuilder);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = b4Var.a;
        if (storyItem != null) {
            if (!storyItem.translated || storyItem.translatedText == null || !TextUtils.equals(storyItem.translatedLng, v31.B())) {
                String str = b4Var.a.caption;
                this.h = str;
                CharSequence replaceEmoji2 = Emoji.replaceEmoji(str, m3Var.V.getPaint().getFontMetricsInt(), false);
                this.h = replaceEmoji2;
                if (replaceEmoji2 == null || b4Var.a.entities == null) {
                    return;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(b4Var.a.caption), b4Var.a.entities, m3Var.V.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf, m3Var.V.getPaint().getFontMetricsInt(), false));
                i10 = (d4Var.y1 < 0 || MessagesController.getInstance(d4Var.z2).storyEntitiesAllowed(MessagesController.getInstance(d4Var.z2).getUser(Long.valueOf(d4Var.y1)))) ? 1 : 0;
                if (i10 != 0) {
                    MessageObject.addLinks(true, valueOf);
                }
                MessageObject.addEntitiesToText(valueOf, b4Var.a.entities, false, true, true, false, i10 ^ 1);
                this.h = valueOf;
                return;
            }
            this.g = true;
            TLRPC.TL_textWithEntities tL_textWithEntities = b4Var.a.translatedText;
            String str2 = tL_textWithEntities.text;
            this.h = str2;
            CharSequence replaceEmoji3 = Emoji.replaceEmoji(str2, m3Var.V.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji3;
            if (replaceEmoji3 == null || tL_textWithEntities.entities == null) {
                return;
            }
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, m3Var.V.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf2, m3Var.V.getPaint().getFontMetricsInt(), false));
            i10 = (d4Var.y1 < 0 || MessagesController.getInstance(d4Var.z2).storyEntitiesAllowed(MessagesController.getInstance(d4Var.z2).getUser(Long.valueOf(d4Var.y1)))) ? 1 : 0;
            if (i10 != 0) {
                MessageObject.addLinks(true, valueOf2);
            }
            MessageObject.addEntitiesToText(valueOf2, tL_textWithEntities.entities, false, true, true, false, i10 ^ 1);
            this.h = valueOf2;
        }
    }
}
