package di;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.k21;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h4 {
    public TL_stories.StoryItem a = null;
    public y6 b = null;
    public TL_stories.StoryItem c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public CharSequence h;
    public c8 i;
    public c8 j;
    public final /* synthetic */ j4 k;

    public h4(j4 j4Var) {
        this.k = j4Var;
    }

    public static String c(h4 h4Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = h4Var.a;
        if (storyItem == null || (messageMedia = storyItem.media) == null) {
            if (h4Var.b == null) {
                return "unknown";
            }
            return "uploading from " + h4Var.b.e;
        }
        if (messageMedia.photo != null) {
            StringBuilder sb2 = new StringBuilder("photo#");
            sb2.append(h4Var.a.media.photo.id);
            sb2.append("at");
            return a8.p0.n(h4Var.a.media.photo.dc_id, "dc", sb2);
        }
        if (messageMedia.document == null) {
            return "unknown";
        }
        StringBuilder sb3 = new StringBuilder("doc#");
        sb3.append(h4Var.a.media.document.id);
        sb3.append("at");
        return a8.p0.n(h4Var.a.media.document.dc_id, "dc", sb3);
    }

    public final boolean d() {
        y6 y6Var = this.b;
        if (y6Var != null) {
            return y6Var.c.H0;
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
        TLRPC.Chat M0 = qp.s1(this.k.l2).M0(Long.valueOf(-storyItem.dialogId));
        return M0 == null || !M0.noforwards;
    }

    public final String e() {
        j4 j4Var = this.k;
        if (j4Var.x1.a == null) {
            return null;
        }
        if (j4Var.k1 > 0) {
            TLRPC.User a22 = qp.s1(j4Var.l2).a2(Long.valueOf(j4Var.k1));
            if (t10.n(a22) == null) {
                return null;
            }
            return j4Var.x1.f ? String.format(Locale.US, "https://t.me/%1$s/s/live", t10.n(a22)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", t10.n(a22), Integer.valueOf(j4Var.x1.a.id));
        }
        TLRPC.Chat M0 = qp.s1(j4Var.l2).M0(Long.valueOf(-j4Var.k1));
        if (org.telegram.messenger.t3.K(M0, false) == null) {
            return null;
        }
        return j4Var.x1.f ? String.format(Locale.US, "https://t.me/%1$s/s/live", org.telegram.messenger.t3.K(M0, false)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", org.telegram.messenger.t3.K(M0, false), Integer.valueOf(j4Var.x1.a.id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final c8 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.i == null && (storyItem = this.a) != null) {
            TLRPC.Document document = storyItem.music;
            c8 c8Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) org.telegram.messenger.g0.V(TLRPC.TL_documentAttributeAudio.class, document.attributes)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    c8Var = new c8();
                    c8Var.f = true;
                    c8Var.g = document;
                    if (TextUtils.isEmpty(str)) {
                        c8Var.k = new SpannableStringBuilder(c8.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        c8Var.k = new SpannableStringBuilder(c8.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(c8.d()).append((CharSequence) " ").append((CharSequence) str2);
                        c8Var.k = append;
                        int length = append.length();
                        c8Var.k.append((CharSequence) " ・ ");
                        c8Var.k.setSpan(new b8(), length, c8Var.k.length(), 33);
                        c8Var.k.append((CharSequence) str);
                    }
                }
            }
            this.i = c8Var;
        }
        return this.i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            j4 j4Var = this.k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                org.telegram.messenger.w7.G(j4Var.l2);
                return org.telegram.messenger.w7.I(this.a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false);
                org.telegram.messenger.w7.G(j4Var.l2);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                if (J.exists()) {
                    return J;
                }
                org.telegram.messenger.w7.G(j4Var.l2);
                return org.telegram.messenger.w7.J(w10, null, false, true);
            }
        }
        return null;
    }

    public final c8 i() {
        ArrayList arrayList;
        TLRPC.Chat M0;
        TLRPC.Chat M02;
        if (this.j == null) {
            TL_stories.StoryItem storyItem = this.a;
            c8 c8Var = null;
            if (storyItem != null) {
                int i7 = this.k.l2;
                if (storyItem.fwd_from != null) {
                    c8Var = new c8();
                    c8Var.a = i7;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long o4 = org.telegram.messenger.m5.o(peer);
                        c8Var.b = Long.valueOf(o4);
                        if (o4 >= 0) {
                            c8Var.k = new SpannableStringBuilder(ij.h6()).append((CharSequence) " ").append((CharSequence) t10.p(qp.s1(i7).a2(Long.valueOf(o4))));
                        } else {
                            TLRPC.Chat M03 = qp.s1(i7).M0(Long.valueOf(-o4));
                            c8Var.k = new SpannableStringBuilder(org.telegram.messenger.t3.V(M03) ? ij.F() : ij.m2()).append((CharSequence) " ").append((CharSequence) (M03 != null ? M03.title : ""));
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        c8Var.k = new SpannableStringBuilder(ij.h6()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    c8Var.f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        c8Var.c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    c8Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (r1 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(r1) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(r1);
                        }
                        r1++;
                    }
                    if (tL_mediaAreaChannelPost != null && (M02 = qp.s1(i7).M0(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        c8Var = new c8();
                        c8Var.b = Long.valueOf(-M02.id);
                        c8Var.e = true;
                        c8Var.a = i7;
                        c8Var.f = true;
                        c8Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        c8Var.k = new SpannableStringBuilder(org.telegram.messenger.t3.V(M02) ? ij.F() : ij.m2()).append((CharSequence) " ").append((CharSequence) M02.title);
                    }
                }
                this.j = c8Var;
            } else {
                y6 y6Var = this.b;
                if (y6Var != null) {
                    fi.e7 e7Var = y6Var.c;
                    if (e7Var != null) {
                        if (e7Var.n) {
                            c8Var = new c8();
                            c8Var.k = e7Var.p;
                            String str = e7Var.s;
                            c8Var.l = str;
                            c8Var.f = TextUtils.isEmpty(str);
                        } else if (e7Var.u && (arrayList = e7Var.v) != null && arrayList.size() > 0) {
                            ij ijVar = (ij) e7Var.v.get(0);
                            long p10 = fi.e7.p(ijVar);
                            if (p10 < 0 && (M0 = qp.s1(ijVar.I1).M0(Long.valueOf(-p10))) != null) {
                                c8Var = new c8();
                                c8Var.b = Long.valueOf(p10);
                                c8Var.e = true;
                                c8Var.a = ijVar.I1;
                                c8Var.f = true;
                                Boolean D = fi.e7.D(ijVar);
                                c8Var.d = Integer.valueOf(D != null ? D.booleanValue() ? ijVar.k.fwd_from.channel_post : ijVar.e1() : 0);
                                c8Var.k = new SpannableStringBuilder(org.telegram.messenger.t3.V(M0) ? ij.F() : ij.m2()).append((CharSequence) " ").append((CharSequence) M0.title);
                            }
                        }
                    }
                    this.j = c8Var;
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
        for (int i7 = 0; i7 < document.attributes.size(); i7++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
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
        y6 y6Var = this.b;
        if (y6Var != null) {
            return y6Var.s;
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.a.media.getDocument();
            return ij.K4(document) || "video/mp4".equals(document.mime_type);
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
        int i7;
        this.g = false;
        j4 j4Var = this.k;
        n3 n3Var = j4Var.t0;
        h4 h4Var = j4Var.x1;
        y6 y6Var = h4Var.b;
        if (y6Var != null) {
            CharSequence charSequence = y6Var.c.C0;
            this.h = charSequence;
            CharSequence m10 = org.telegram.messenger.i6.m(charSequence, n3Var.b0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m10;
            SpannableStringBuilder spannableStringBuilder = m10 == null ? new SpannableStringBuilder() : SpannableStringBuilder.valueOf(m10);
            TLRPC.User a22 = qp.s1(j4Var.l2).a2(Long.valueOf(j4Var.k1));
            if (j4Var.k1 < 0 || qp.s1(j4Var.l2).Y4(a22)) {
                ij.d(spannableStringBuilder, true);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = h4Var.a;
        if (storyItem != null) {
            if (!storyItem.translated || storyItem.translatedText == null || !TextUtils.equals(storyItem.translatedLng, k21.M0())) {
                String str = h4Var.a.caption;
                this.h = str;
                CharSequence m11 = org.telegram.messenger.i6.m(str, n3Var.b0.getPaint().getFontMetricsInt(), false, null, 0);
                this.h = m11;
                if (m11 == null || h4Var.a.entities == null) {
                    return;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(ij.B5(new SpannableStringBuilder(h4Var.a.caption), h4Var.a.entities, n3Var.b0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(org.telegram.messenger.i6.m(valueOf, n3Var.b0.getPaint().getFontMetricsInt(), false, null, 0));
                i7 = (j4Var.k1 < 0 || qp.s1(j4Var.l2).Y4(qp.s1(j4Var.l2).a2(Long.valueOf(j4Var.k1)))) ? 1 : 0;
                if (i7 != 0) {
                    ij.d(valueOf, true);
                }
                ij.b(valueOf, h4Var.a.entities, false, true, true, false, i7 ^ 1);
                this.h = valueOf;
                return;
            }
            this.g = true;
            TLRPC.TL_textWithEntities tL_textWithEntities = h4Var.a.translatedText;
            String str2 = tL_textWithEntities.text;
            this.h = str2;
            CharSequence m12 = org.telegram.messenger.i6.m(str2, n3Var.b0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m12;
            if (m12 == null || tL_textWithEntities.entities == null) {
                return;
            }
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(ij.B5(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, n3Var.b0.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder.valueOf(org.telegram.messenger.i6.m(valueOf2, n3Var.b0.getPaint().getFontMetricsInt(), false, null, 0));
            i7 = (j4Var.k1 < 0 || qp.s1(j4Var.l2).Y4(qp.s1(j4Var.l2).a2(Long.valueOf(j4Var.k1)))) ? 1 : 0;
            if (i7 != 0) {
                ij.d(valueOf2, true);
            }
            ij.b(valueOf2, tL_textWithEntities.entities, false, true, true, false, i7 ^ 1);
            this.h = valueOf2;
        }
    }
}
