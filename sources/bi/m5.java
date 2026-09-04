package bi;

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
import org.telegram.ui.Components.u31;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class m5 {
    public TL_stories.StoryItem a = null;
    public t8 b = null;
    public TL_stories.StoryItem c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public CharSequence h;
    public z9 i;
    public z9 j;
    public final /* synthetic */ o5 k;

    public m5(o5 o5Var) {
        this.k = o5Var;
    }

    public static String c(m5 m5Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = m5Var.a;
        if (storyItem == null || (messageMedia = storyItem.media) == null) {
            if (m5Var.b == null) {
                return "unknown";
            }
            return "uploading from " + m5Var.b.e;
        }
        if (messageMedia.photo != null) {
            StringBuilder sb2 = new StringBuilder("photo#");
            sb2.append(m5Var.a.media.photo.id);
            sb2.append("at");
            return a4.a.n(m5Var.a.media.photo.dc_id, "dc", sb2);
        }
        if (messageMedia.document == null) {
            return "unknown";
        }
        StringBuilder sb3 = new StringBuilder("doc#");
        sb3.append(m5Var.a.media.document.id);
        sb3.append("at");
        return a4.a.n(m5Var.a.media.document.dc_id, "dc", sb3);
    }

    public final boolean d() {
        t8 t8Var = this.b;
        if (t8Var != null) {
            return t8Var.c.H0;
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
        o5 o5Var = this.k;
        if (o5Var.O1.a == null) {
            return null;
        }
        if (o5Var.B1 > 0) {
            TLRPC.User user = MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(o5Var.B1));
            if (UserObject.getPublicUsername(user) == null) {
                return null;
            }
            return o5Var.O1.f ? String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(o5Var.O1.a.id));
        }
        TLRPC.Chat chat = MessagesController.getInstance(o5Var.C2).getChat(Long.valueOf(-o5Var.B1));
        if (ChatObject.getPublicUsername(chat) == null) {
            return null;
        }
        return o5Var.O1.f ? String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(o5Var.O1.a.id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final z9 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.i == null && (storyItem = this.a) != null) {
            TLRPC.Document document = storyItem.music;
            z9 z9Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    z9Var = new z9();
                    z9Var.f = true;
                    z9Var.g = document;
                    if (TextUtils.isEmpty(str)) {
                        z9Var.k = new SpannableStringBuilder(z9.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        z9Var.k = new SpannableStringBuilder(z9.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(z9.d()).append((CharSequence) " ").append((CharSequence) str2);
                        z9Var.k = append;
                        int length = append.length();
                        z9Var.k.append((CharSequence) " ・ ");
                        z9Var.k.setSpan(new y9(), length, z9Var.k.length(), 33);
                        z9Var.k.append((CharSequence) str);
                    }
                }
            }
            this.i = z9Var;
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
        o5 o5Var = this.k;
        if (messageMedia != null && messageMedia.getDocument() != null) {
            return FileLoader.getInstance(o5Var.C2).getPathToAttach(this.a.media.getDocument());
        }
        TLRPC.MessageMedia messageMedia2 = this.a.media;
        if (messageMedia2 == null || (photo = messageMedia2.photo) == null) {
            return null;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID);
        File pathToAttach = FileLoader.getInstance(o5Var.C2).getPathToAttach(closestPhotoSizeWithSize, true);
        return !pathToAttach.exists() ? FileLoader.getInstance(o5Var.C2).getPathToAttach(closestPhotoSizeWithSize, false) : pathToAttach;
    }

    public final z9 i() {
        ArrayList arrayList;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        if (this.j == null) {
            TL_stories.StoryItem storyItem = this.a;
            z9 z9Var = null;
            if (storyItem != null) {
                int i10 = this.k.C2;
                if (storyItem.fwd_from != null) {
                    z9Var = new z9();
                    z9Var.a = i10;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(peer);
                        z9Var.b = Long.valueOf(peerDialogId);
                        if (peerDialogId >= 0) {
                            z9Var.k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId))));
                        } else {
                            TLRPC.Chat chat3 = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
                            z9Var.k = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat3) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) (chat3 != null ? chat3.title : ""));
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        z9Var.k = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    z9Var.f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        z9Var.c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    z9Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (r1 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(r1) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(r1);
                        }
                        r1++;
                    }
                    if (tL_mediaAreaChannelPost != null && (chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        z9Var = new z9();
                        z9Var.b = Long.valueOf(-chat2.id);
                        z9Var.e = true;
                        z9Var.a = i10;
                        z9Var.f = true;
                        z9Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        z9Var.k = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat2) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) chat2.title);
                    }
                }
                this.j = z9Var;
            } else {
                t8 t8Var = this.b;
                if (t8Var != null) {
                    di.o8 o8Var = t8Var.c;
                    if (o8Var != null) {
                        if (o8Var.n) {
                            z9Var = new z9();
                            z9Var.k = o8Var.p;
                            String str = o8Var.s;
                            z9Var.l = str;
                            z9Var.f = TextUtils.isEmpty(str);
                        } else if (o8Var.u && (arrayList = o8Var.v) != null && arrayList.size() > 0) {
                            MessageObject messageObject = (MessageObject) o8Var.v.get(0);
                            long p5 = di.o8.p(messageObject);
                            if (p5 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-p5))) != null) {
                                z9Var = new z9();
                                z9Var.b = Long.valueOf(p5);
                                z9Var.e = true;
                                z9Var.a = messageObject.currentAccount;
                                z9Var.f = true;
                                Boolean D = di.o8.D(messageObject);
                                z9Var.d = Integer.valueOf(D != null ? D.booleanValue() ? messageObject.messageOwner.fwd_from.channel_post : messageObject.getId() : 0);
                                z9Var.k = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) chat.title);
                            }
                        }
                    }
                    this.j = z9Var;
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

    public final boolean k(long j3) {
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem == null) {
            return false;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        return (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j3 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.id;
    }

    public final boolean l() {
        return this.e;
    }

    public final boolean m() {
        String str;
        TLRPC.MessageMedia messageMedia;
        t8 t8Var = this.b;
        if (t8Var != null) {
            return t8Var.s;
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
        o5 o5Var = this.k;
        s4 s4Var = o5Var.K0;
        m5 m5Var = o5Var.O1;
        t8 t8Var = m5Var.b;
        if (t8Var != null) {
            CharSequence charSequence = t8Var.c.C0;
            this.h = charSequence;
            CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, s4Var.b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji;
            SpannableStringBuilder spannableStringBuilder = replaceEmoji == null ? new SpannableStringBuilder() : SpannableStringBuilder.valueOf(replaceEmoji);
            TLRPC.User user = MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(o5Var.B1));
            if (o5Var.B1 < 0 || MessagesController.getInstance(o5Var.C2).storyEntitiesAllowed(user)) {
                MessageObject.addLinks(true, spannableStringBuilder);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = m5Var.a;
        if (storyItem != null) {
            if (!storyItem.translated || storyItem.translatedText == null || !TextUtils.equals(storyItem.translatedLng, u31.B())) {
                String str = m5Var.a.caption;
                this.h = str;
                CharSequence replaceEmoji2 = Emoji.replaceEmoji(str, s4Var.b0.getPaint().getFontMetricsInt(), false);
                this.h = replaceEmoji2;
                if (replaceEmoji2 == null || m5Var.a.entities == null) {
                    return;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(m5Var.a.caption), m5Var.a.entities, s4Var.b0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf, s4Var.b0.getPaint().getFontMetricsInt(), false));
                i10 = (o5Var.B1 < 0 || MessagesController.getInstance(o5Var.C2).storyEntitiesAllowed(MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(o5Var.B1)))) ? 1 : 0;
                if (i10 != 0) {
                    MessageObject.addLinks(true, valueOf);
                }
                MessageObject.addEntitiesToText(valueOf, m5Var.a.entities, false, true, true, false, i10 ^ 1);
                this.h = valueOf;
                return;
            }
            this.g = true;
            TLRPC.TL_textWithEntities tL_textWithEntities = m5Var.a.translatedText;
            String str2 = tL_textWithEntities.text;
            this.h = str2;
            CharSequence replaceEmoji3 = Emoji.replaceEmoji(str2, s4Var.b0.getPaint().getFontMetricsInt(), false);
            this.h = replaceEmoji3;
            if (replaceEmoji3 == null || tL_textWithEntities.entities == null) {
                return;
            }
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, s4Var.b0.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder.valueOf(Emoji.replaceEmoji(valueOf2, s4Var.b0.getPaint().getFontMetricsInt(), false));
            i10 = (o5Var.B1 < 0 || MessagesController.getInstance(o5Var.C2).storyEntitiesAllowed(MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(o5Var.B1)))) ? 1 : 0;
            if (i10 != 0) {
                MessageObject.addLinks(true, valueOf2);
            }
            MessageObject.addEntitiesToText(valueOf2, tL_textWithEntities.entities, false, true, true, false, i10 ^ 1);
            this.h = valueOf2;
        }
    }
}
