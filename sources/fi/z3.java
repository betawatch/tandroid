package fi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.p21;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z3 {
    public TL_stories.StoryItem a = null;
    public r6 b = null;
    public TL_stories.StoryItem c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public CharSequence h;
    public v7 i;
    public v7 j;
    public final /* synthetic */ b4 k;

    public z3(b4 b4Var) {
        this.k = b4Var;
    }

    public static String c(z3 z3Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = z3Var.a;
        if (storyItem == null || (messageMedia = storyItem.media) == null) {
            if (z3Var.b == null) {
                return "unknown";
            }
            return "uploading from " + z3Var.b.e;
        }
        if (messageMedia.photo != null) {
            StringBuilder sb2 = new StringBuilder("photo#");
            sb2.append(z3Var.a.media.photo.id);
            sb2.append("at");
            return a8.p0.n(z3Var.a.media.photo.dc_id, "dc", sb2);
        }
        if (messageMedia.document == null) {
            return "unknown";
        }
        StringBuilder sb3 = new StringBuilder("doc#");
        sb3.append(z3Var.a.media.document.id);
        sb3.append("at");
        return a8.p0.n(z3Var.a.media.document.dc_id, "dc", sb3);
    }

    public final boolean d() {
        r6 r6Var = this.b;
        if (r6Var != null) {
            return r6Var.c.H0;
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
        TLRPC.Chat M0 = np.s1(this.k.m2).M0(Long.valueOf(-storyItem.dialogId));
        return M0 == null || !M0.noforwards;
    }

    public final String e() {
        b4 b4Var = this.k;
        if (b4Var.y1.a == null) {
            return null;
        }
        if (b4Var.l1 > 0) {
            TLRPC.User a22 = np.s1(b4Var.m2).a2(Long.valueOf(b4Var.l1));
            if (q10.n(a22) == null) {
                return null;
            }
            return b4Var.y1.f ? String.format(Locale.US, "https://t.me/%1$s/s/live", q10.n(a22)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", q10.n(a22), Integer.valueOf(b4Var.y1.a.id));
        }
        TLRPC.Chat M0 = np.s1(b4Var.m2).M0(Long.valueOf(-b4Var.l1));
        if (org.telegram.messenger.t3.K(M0, false) == null) {
            return null;
        }
        return b4Var.y1.f ? String.format(Locale.US, "https://t.me/%1$s/s/live", org.telegram.messenger.t3.K(M0, false)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", org.telegram.messenger.t3.K(M0, false), Integer.valueOf(b4Var.y1.a.id));
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
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) org.telegram.messenger.g0.V(TLRPC.TL_documentAttributeAudio.class, document.attributes)) != null) {
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
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            int i7 = 0;
            b4 b4Var = this.k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                org.telegram.messenger.w7.G(b4Var.m2);
                File I = org.telegram.messenger.w7.I(s6.C(b4Var.m2, this.a));
                if (I.exists()) {
                    return I;
                }
                TLRPC.Document document = this.a.media.document;
                if (document != null) {
                    File I2 = org.telegram.messenger.w7.I(document);
                    if (I2.exists()) {
                        return I2;
                    }
                }
                ArrayList<TLRPC.Document> arrayList = this.a.media.alt_documents;
                int size = arrayList.size();
                while (i7 < size) {
                    TLRPC.Document document2 = arrayList.get(i7);
                    i7++;
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        File I3 = org.telegram.messenger.w7.I(document3);
                        if (I3.exists()) {
                            return I3;
                        }
                    }
                }
                return org.telegram.messenger.w7.I(this.a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false);
                org.telegram.messenger.w7.G(b4Var.m2);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                if (J.exists()) {
                    return J;
                }
                org.telegram.messenger.w7.G(b4Var.m2);
                return org.telegram.messenger.w7.J(w10, null, false, true);
            }
        }
        return null;
    }

    public final v7 i() {
        ArrayList arrayList;
        TLRPC.Chat M0;
        TLRPC.Chat M02;
        if (this.j == null) {
            TL_stories.StoryItem storyItem = this.a;
            v7 v7Var = null;
            if (storyItem != null) {
                int i7 = this.k.m2;
                if (storyItem.fwd_from != null) {
                    v7Var = new v7();
                    v7Var.a = i7;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long o4 = org.telegram.messenger.m5.o(peer);
                        v7Var.b = Long.valueOf(o4);
                        if (o4 >= 0) {
                            v7Var.k = new SpannableStringBuilder(gj.h6()).append((CharSequence) " ").append((CharSequence) q10.p(np.s1(i7).a2(Long.valueOf(o4))));
                        } else {
                            TLRPC.Chat M03 = np.s1(i7).M0(Long.valueOf(-o4));
                            v7Var.k = new SpannableStringBuilder(org.telegram.messenger.t3.V(M03) ? gj.F() : gj.m2()).append((CharSequence) " ").append((CharSequence) (M03 != null ? M03.title : ""));
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        v7Var.k = new SpannableStringBuilder(gj.h6()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
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
                    if (tL_mediaAreaChannelPost != null && (M02 = np.s1(i7).M0(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        v7Var = new v7();
                        v7Var.b = Long.valueOf(-M02.id);
                        v7Var.e = true;
                        v7Var.a = i7;
                        v7Var.f = true;
                        v7Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        v7Var.k = new SpannableStringBuilder(org.telegram.messenger.t3.V(M02) ? gj.F() : gj.m2()).append((CharSequence) " ").append((CharSequence) M02.title);
                    }
                }
                this.j = v7Var;
            } else {
                r6 r6Var = this.b;
                if (r6Var != null) {
                    hi.d7 d7Var = r6Var.c;
                    if (d7Var != null) {
                        if (d7Var.n) {
                            v7Var = new v7();
                            v7Var.k = d7Var.p;
                            String str = d7Var.s;
                            v7Var.l = str;
                            v7Var.f = TextUtils.isEmpty(str);
                        } else if (d7Var.u && (arrayList = d7Var.v) != null && arrayList.size() > 0) {
                            gj gjVar = (gj) d7Var.v.get(0);
                            long p10 = hi.d7.p(gjVar);
                            if (p10 < 0 && (M0 = np.s1(gjVar.K1).M0(Long.valueOf(-p10))) != null) {
                                v7Var = new v7();
                                v7Var.b = Long.valueOf(p10);
                                v7Var.e = true;
                                v7Var.a = gjVar.K1;
                                v7Var.f = true;
                                Boolean D = hi.d7.D(gjVar);
                                v7Var.d = Integer.valueOf(D != null ? D.booleanValue() ? gjVar.k.fwd_from.channel_post : gjVar.e1() : 0);
                                v7Var.k = new SpannableStringBuilder(org.telegram.messenger.t3.V(M0) ? gj.F() : gj.m2()).append((CharSequence) " ").append((CharSequence) M0.title);
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
        r6 r6Var = this.b;
        if (r6Var != null) {
            return r6Var.s;
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.a.media.getDocument();
            return gj.K4(document) || "video/mp4".equals(document.mime_type);
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
        b4 b4Var = this.k;
        i3 i3Var = b4Var.u0;
        z3 z3Var = b4Var.y1;
        r6 r6Var = z3Var.b;
        if (r6Var != null) {
            CharSequence charSequence = r6Var.c.C0;
            this.h = charSequence;
            CharSequence m10 = org.telegram.messenger.j6.m(charSequence, i3Var.c0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m10;
            SpannableStringBuilder spannableStringBuilder = m10 == null ? new SpannableStringBuilder() : SpannableStringBuilder.valueOf(m10);
            TLRPC.User a22 = np.s1(b4Var.m2).a2(Long.valueOf(b4Var.l1));
            if (b4Var.l1 < 0 || np.s1(b4Var.m2).Z4(a22)) {
                gj.d(spannableStringBuilder, true);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = z3Var.a;
        if (storyItem != null) {
            if (!storyItem.translated || storyItem.translatedText == null || !TextUtils.equals(storyItem.translatedLng, p21.M0())) {
                String str = z3Var.a.caption;
                this.h = str;
                CharSequence m11 = org.telegram.messenger.j6.m(str, i3Var.c0.getPaint().getFontMetricsInt(), false, null, 0);
                this.h = m11;
                if (m11 == null || z3Var.a.entities == null) {
                    return;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(gj.B5(new SpannableStringBuilder(z3Var.a.caption), z3Var.a.entities, i3Var.c0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(org.telegram.messenger.j6.m(valueOf, i3Var.c0.getPaint().getFontMetricsInt(), false, null, 0));
                i7 = (b4Var.l1 < 0 || np.s1(b4Var.m2).Z4(np.s1(b4Var.m2).a2(Long.valueOf(b4Var.l1)))) ? 1 : 0;
                if (i7 != 0) {
                    gj.d(valueOf, true);
                }
                gj.b(valueOf, z3Var.a.entities, false, true, true, false, i7 ^ 1);
                this.h = valueOf;
                return;
            }
            this.g = true;
            TLRPC.TL_textWithEntities tL_textWithEntities = z3Var.a.translatedText;
            String str2 = tL_textWithEntities.text;
            this.h = str2;
            CharSequence m12 = org.telegram.messenger.j6.m(str2, i3Var.c0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m12;
            if (m12 == null || tL_textWithEntities.entities == null) {
                return;
            }
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(gj.B5(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, i3Var.c0.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder.valueOf(org.telegram.messenger.j6.m(valueOf2, i3Var.c0.getPaint().getFontMetricsInt(), false, null, 0));
            i7 = (b4Var.l1 < 0 || np.s1(b4Var.m2).Z4(np.s1(b4Var.m2).a2(Long.valueOf(b4Var.l1)))) ? 1 : 0;
            if (i7 != 0) {
                gj.d(valueOf2, true);
            }
            gj.b(valueOf2, tL_textWithEntities.entities, false, true, true, false, i7 ^ 1);
            this.h = valueOf2;
        }
    }
}
