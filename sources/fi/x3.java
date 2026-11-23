package fi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b31;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class x3 {
    public TL_stories.StoryItem a = null;
    public o6 b = null;
    public TL_stories.StoryItem c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public CharSequence h;
    public s7 i;
    public s7 j;
    public final /* synthetic */ z3 k;

    public x3(z3 z3Var) {
        this.k = z3Var;
    }

    public static String c(x3 x3Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = x3Var.a;
        if (storyItem == null || (messageMedia = storyItem.media) == null) {
            if (x3Var.b == null) {
                return "unknown";
            }
            return "uploading from " + x3Var.b.e;
        }
        if (messageMedia.photo != null) {
            StringBuilder sb2 = new StringBuilder("photo#");
            sb2.append(x3Var.a.media.photo.id);
            sb2.append("at");
            return a8.p0.n(x3Var.a.media.photo.dc_id, "dc", sb2);
        }
        if (messageMedia.document == null) {
            return "unknown";
        }
        StringBuilder sb3 = new StringBuilder("doc#");
        sb3.append(x3Var.a.media.document.id);
        sb3.append("at");
        return a8.p0.n(x3Var.a.media.document.dc_id, "dc", sb3);
    }

    public final boolean d() {
        o6 o6Var = this.b;
        if (o6Var != null) {
            return o6Var.c.H0;
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
        TLRPC.Chat O0 = np.u1(this.k.m2).O0(Long.valueOf(-storyItem.dialogId));
        return O0 == null || !O0.noforwards;
    }

    public final String e() {
        z3 z3Var = this.k;
        if (z3Var.y1.a == null) {
            return null;
        }
        if (z3Var.l1 > 0) {
            TLRPC.User c22 = np.u1(z3Var.m2).c2(Long.valueOf(z3Var.l1));
            if (p10.o(c22) == null) {
                return null;
            }
            return z3Var.y1.f ? String.format(Locale.US, "https://t.me/%1$s/s/live", p10.o(c22)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", p10.o(c22), Integer.valueOf(z3Var.y1.a.id));
        }
        TLRPC.Chat O0 = np.u1(z3Var.m2).O0(Long.valueOf(-z3Var.l1));
        if (org.telegram.messenger.v3.K(O0, false) == null) {
            return null;
        }
        return z3Var.y1.f ? String.format(Locale.US, "https://t.me/%1$s/s/live", org.telegram.messenger.v3.K(O0, false)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", org.telegram.messenger.v3.K(O0, false), Integer.valueOf(z3Var.y1.a.id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final s7 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.i == null && (storyItem = this.a) != null) {
            TLRPC.Document document = storyItem.music;
            s7 s7Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) org.telegram.messenger.g0.V(TLRPC.TL_documentAttributeAudio.class, document.attributes)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    s7Var = new s7();
                    s7Var.f = true;
                    s7Var.g = document;
                    if (TextUtils.isEmpty(str)) {
                        s7Var.k = new SpannableStringBuilder(s7.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        s7Var.k = new SpannableStringBuilder(s7.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(s7.d()).append((CharSequence) " ").append((CharSequence) str2);
                        s7Var.k = append;
                        int length = append.length();
                        s7Var.k.append((CharSequence) " ・ ");
                        s7Var.k.setSpan(new r7(), length, s7Var.k.length(), 33);
                        s7Var.k.append((CharSequence) str);
                    }
                }
            }
            this.i = s7Var;
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
            z3 z3Var = this.k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                org.telegram.messenger.w7.G(z3Var.m2);
                File I = org.telegram.messenger.w7.I(p6.C(z3Var.m2, this.a));
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
                org.telegram.messenger.w7.G(z3Var.m2);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                if (J.exists()) {
                    return J;
                }
                org.telegram.messenger.w7.G(z3Var.m2);
                return org.telegram.messenger.w7.J(w10, null, false, true);
            }
        }
        return null;
    }

    public final s7 i() {
        ArrayList arrayList;
        TLRPC.Chat O0;
        TLRPC.Chat O02;
        if (this.j == null) {
            TL_stories.StoryItem storyItem = this.a;
            s7 s7Var = null;
            if (storyItem != null) {
                int i7 = this.k.m2;
                if (storyItem.fwd_from != null) {
                    s7Var = new s7();
                    s7Var.a = i7;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long o4 = org.telegram.messenger.n5.o(peer);
                        s7Var.b = Long.valueOf(o4);
                        if (o4 >= 0) {
                            s7Var.k = new SpannableStringBuilder(gj.h6()).append((CharSequence) " ").append((CharSequence) p10.q(np.u1(i7).c2(Long.valueOf(o4))));
                        } else {
                            TLRPC.Chat O03 = np.u1(i7).O0(Long.valueOf(-o4));
                            s7Var.k = new SpannableStringBuilder(org.telegram.messenger.v3.V(O03) ? gj.F() : gj.m2()).append((CharSequence) " ").append((CharSequence) (O03 != null ? O03.title : ""));
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        s7Var.k = new SpannableStringBuilder(gj.h6()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    s7Var.f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        s7Var.c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    s7Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (r1 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(r1) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(r1);
                        }
                        r1++;
                    }
                    if (tL_mediaAreaChannelPost != null && (O02 = np.u1(i7).O0(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        s7Var = new s7();
                        s7Var.b = Long.valueOf(-O02.id);
                        s7Var.e = true;
                        s7Var.a = i7;
                        s7Var.f = true;
                        s7Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        s7Var.k = new SpannableStringBuilder(org.telegram.messenger.v3.V(O02) ? gj.F() : gj.m2()).append((CharSequence) " ").append((CharSequence) O02.title);
                    }
                }
                this.j = s7Var;
            } else {
                o6 o6Var = this.b;
                if (o6Var != null) {
                    hi.c7 c7Var = o6Var.c;
                    if (c7Var != null) {
                        if (c7Var.n) {
                            s7Var = new s7();
                            s7Var.k = c7Var.p;
                            String str = c7Var.s;
                            s7Var.l = str;
                            s7Var.f = TextUtils.isEmpty(str);
                        } else if (c7Var.u && (arrayList = c7Var.v) != null && arrayList.size() > 0) {
                            gj gjVar = (gj) c7Var.v.get(0);
                            long p10 = hi.c7.p(gjVar);
                            if (p10 < 0 && (O0 = np.u1(gjVar.K1).O0(Long.valueOf(-p10))) != null) {
                                s7Var = new s7();
                                s7Var.b = Long.valueOf(p10);
                                s7Var.e = true;
                                s7Var.a = gjVar.K1;
                                s7Var.f = true;
                                Boolean D = hi.c7.D(gjVar);
                                s7Var.d = Integer.valueOf(D != null ? D.booleanValue() ? gjVar.k.fwd_from.channel_post : gjVar.e1() : 0);
                                s7Var.k = new SpannableStringBuilder(org.telegram.messenger.v3.V(O0) ? gj.F() : gj.m2()).append((CharSequence) " ").append((CharSequence) O0.title);
                            }
                        }
                    }
                    this.j = s7Var;
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
        o6 o6Var = this.b;
        if (o6Var != null) {
            return o6Var.s;
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
        z3 z3Var = this.k;
        g3 g3Var = z3Var.u0;
        x3 x3Var = z3Var.y1;
        o6 o6Var = x3Var.b;
        if (o6Var != null) {
            CharSequence charSequence = o6Var.c.C0;
            this.h = charSequence;
            CharSequence m10 = org.telegram.messenger.j6.m(charSequence, g3Var.c0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m10;
            SpannableStringBuilder spannableStringBuilder = m10 == null ? new SpannableStringBuilder() : SpannableStringBuilder.valueOf(m10);
            TLRPC.User c22 = np.u1(z3Var.m2).c2(Long.valueOf(z3Var.l1));
            if (z3Var.l1 < 0 || np.u1(z3Var.m2).k5(c22)) {
                gj.d(spannableStringBuilder, true);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = x3Var.a;
        if (storyItem != null) {
            if (!storyItem.translated || storyItem.translatedText == null || !TextUtils.equals(storyItem.translatedLng, b31.N0())) {
                String str = x3Var.a.caption;
                this.h = str;
                CharSequence m11 = org.telegram.messenger.j6.m(str, g3Var.c0.getPaint().getFontMetricsInt(), false, null, 0);
                this.h = m11;
                if (m11 == null || x3Var.a.entities == null) {
                    return;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(gj.B5(new SpannableStringBuilder(x3Var.a.caption), x3Var.a.entities, g3Var.c0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(org.telegram.messenger.j6.m(valueOf, g3Var.c0.getPaint().getFontMetricsInt(), false, null, 0));
                i7 = (z3Var.l1 < 0 || np.u1(z3Var.m2).k5(np.u1(z3Var.m2).c2(Long.valueOf(z3Var.l1)))) ? 1 : 0;
                if (i7 != 0) {
                    gj.d(valueOf, true);
                }
                gj.b(valueOf, x3Var.a.entities, false, true, true, false, i7 ^ 1);
                this.h = valueOf;
                return;
            }
            this.g = true;
            TLRPC.TL_textWithEntities tL_textWithEntities = x3Var.a.translatedText;
            String str2 = tL_textWithEntities.text;
            this.h = str2;
            CharSequence m12 = org.telegram.messenger.j6.m(str2, g3Var.c0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m12;
            if (m12 == null || tL_textWithEntities.entities == null) {
                return;
            }
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(gj.B5(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, g3Var.c0.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder.valueOf(org.telegram.messenger.j6.m(valueOf2, g3Var.c0.getPaint().getFontMetricsInt(), false, null, 0));
            i7 = (z3Var.l1 < 0 || np.u1(z3Var.m2).k5(np.u1(z3Var.m2).c2(Long.valueOf(z3Var.l1)))) ? 1 : 0;
            if (i7 != 0) {
                gj.d(valueOf2, true);
            }
            gj.b(valueOf2, tL_textWithEntities.entities, false, true, true, false, i7 ^ 1);
            this.h = valueOf2;
        }
    }
}
