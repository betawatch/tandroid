// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class no4 {
    public static final /* synthetic */ int a = 0;

    public static void a(yv1 yv1Var, bf7 bf7Var) {
        TLRPC.TL_forumTopic f;
        if (bf7Var.b == 0 || (f = yv1Var.getMessagesController().g4.f(-bf7Var.a, bf7Var.b)) == null) {
            return;
        }
        if (bf7Var.a > 0) {
            if (m9c.w(yv1Var.getMessagesController().W1(Long.valueOf(bf7Var.a)))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new k47(yv1Var.getCurrentAccount(), f.topicStartMessage, false, false));
                yv1Var.Nb(arrayList, null, f.id, f.read_inbox_max_id, f.read_outbox_max_id, f);
                yv1Var.getMessagesController().R4(-bf7Var.a, bf7Var.b);
                return;
            }
            return;
        }
        TLRPC.Chat L0 = yv1Var.getMessagesController().L0(Long.valueOf(-bf7Var.a));
        if (L0 == null) {
            return;
        }
        if (!sd2.p0(L0)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new k47(yv1Var.getCurrentAccount(), f.topicStartMessage, false, false));
            yv1Var.Nb(arrayList2, L0, f.id, f.read_inbox_max_id, f.read_outbox_max_id, f);
        } else if (sd2.A(z8c.t0, L0, 24)) {
            int i = f.read_inbox_max_id;
            int i2 = f.read_outbox_max_id;
            yv1Var.A4 = i;
            yv1Var.B4 = i2;
            yv1Var.C4 = Math.max(1, i);
            yv1Var.s4 = pg3.n(f.from_id);
            yv1Var.hd();
            yv1Var.zd(false);
            yv1Var.Pc(false);
        }
        yv1Var.getMessagesController().R4(-bf7Var.a, bf7Var.b);
    }

    public static void b(k47 k47Var) {
        TLRPC.TL_forumTopic f;
        TLRPC.Message message = k47Var.k;
        int i = k47Var.K1;
        if (k47.B0(message) > 0 || (f = oc7.r1(i).g4.f(-k47.B0(k47Var.k), k47.b2(i, k47Var.k, true, false))) == null) {
            return;
        }
        Drawable drawable = k47Var.i2[0];
        if (drawable instanceof ko4) {
            ((ko4) drawable).b(f.icon_color);
        }
    }

    public static SpannableStringBuilder c(TLRPC.TL_forumTopic tL_forumTopic, k47 k47Var) {
        TLRPC.Chat L0;
        TLRPC.User user;
        if (tL_forumTopic != null) {
            TLRPC.MessageAction messageAction = k47Var.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
                return gm.G2(jb6.M0(2131743688, null), k(tL_forumTopic, null, null), "%s");
            }
            if (messageAction instanceof TLRPC.TL_messageActionTopicEdit) {
                TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction;
                long Z0 = k47Var.Z0();
                boolean D = pg3.D(Z0);
                int i = k47Var.K1;
                if (D) {
                    user = oc7.r1(i).W1(Long.valueOf(Z0));
                    L0 = null;
                } else {
                    L0 = oc7.r1(i).L0(Long.valueOf(-Z0));
                    user = null;
                }
                String m = user != null ? bw2.m(0, user.first_name, user.last_name) : L0 != null ? L0.title : null;
                int i2 = tL_messageActionTopicEdit.flags;
                if ((i2 & 8) != 0) {
                    return gm.G2(jb6.M0(tL_messageActionTopicEdit.hidden ? 2131743706 : 2131743692, null), m, "%s");
                }
                if ((i2 & 4) != 0) {
                    return gm.G2(gm.G2(jb6.M0(tL_messageActionTopicEdit.closed ? 2131743689 : 2131743684, null), k(tL_forumTopic, null, null), "%2$s"), m, "%1$s");
                }
                int i3 = i2 & 1;
                int i4 = i2 & 2;
                if (i3 != 0) {
                    if (i4 == 0) {
                        return gm.G2(gm.G2(jb6.M0(2131743686, null), tL_messageActionTopicEdit.title, "%2$s"), m, "%1$s");
                    }
                    TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                    tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                    tL_forumTopic2.title = tL_messageActionTopicEdit.title;
                    return gm.G2(gm.G2(jb6.M0(2131743685, null), k(tL_forumTopic2, null, null), "%2$s"), m, "%1$s");
                }
                if (i4 != 0) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = new TLRPC.TL_forumTopic();
                    tL_forumTopic3.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                    tL_forumTopic3.title = "";
                    return gm.G2(gm.G2(jb6.M0(2131743687, null), k(tL_forumTopic3, null, null), "%2$s"), m, "%1$s");
                }
            }
        }
        return null;
    }

    public static mo4 d(Context context, float f, int i, boolean z) {
        if (context == null) {
            return null;
        }
        mo4 mo4Var = new mo4();
        mo4Var.a = context.getResources().getDrawable(z ? R.drawable.msg_filled_general_large : R.drawable.msg_filled_general).mutate();
        mo4Var.b = f;
        mo4Var.a(i);
        return mo4Var;
    }

    public static sn2 e(int i, String str) {
        ko4 ko4Var = new ko4(i);
        o26 o26Var = new o26(1, null);
        String trim = str.trim();
        o26Var.a(trim.length() >= 1 ? trim.substring(0, 1).toUpperCase() : "");
        sn2 sn2Var = new sn2(ko4Var, o26Var, 0, 0);
        sn2Var.x = true;
        return sn2Var;
    }

    public static sn2 f(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return e(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static void g(ArrayList arrayList, long j) {
        if (arrayList != null) {
            int i = 0;
            while (i < arrayList.size()) {
                if (j != k47.b2(((k47) arrayList.get(i)).K1, ((k47) arrayList.get(i)).k, true, false)) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            }
        }
    }

    public static yv1 h(d dVar, long j, TLRPC.TL_forumTopic tL_forumTopic, int i, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic f;
        if (dVar == null || tL_forumTopic == null) {
            return null;
        }
        TLRPC.Chat L0 = dVar.getMessagesController().L0(Long.valueOf(j));
        bundle.putLong("chat_id", j);
        if (i != 0) {
            bundle.putInt("message_id", i);
        } else if (tL_forumTopic.read_inbox_max_id == 0) {
            bundle.putInt("message_id", tL_forumTopic.id);
        }
        bundle.putInt("unread_count", tL_forumTopic.unread_count);
        bundle.putBoolean("historyPreloaded", false);
        yv1 yv1Var = new yv1(bundle);
        TLRPC.Message message = tL_forumTopic.topicStartMessage;
        if (message != null || (f = dVar.getMessagesController().g4.f(j, tL_forumTopic.id)) == null) {
            tL_forumTopic2 = tL_forumTopic;
        } else {
            message = f.topicStartMessage;
            tL_forumTopic2 = f;
        }
        if (message == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k47(dVar.getCurrentAccount(), message, false, false));
        yv1Var.Nb(arrayList, L0, tL_forumTopic2.id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i != 0) {
            yv1Var.d8 = i;
        }
        return yv1Var;
    }

    public static String i(int i, long j) {
        return j(i, oc7.r1(i).L0(Long.valueOf(-j)), true);
    }

    public static String j(int i, TLRPC.Chat chat, boolean z) {
        if (sd2.p0(chat)) {
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(chat.linked_monoforum_id));
            if (L0 != null) {
                String str = L0.title;
                return z ? str : jb6.a0(null, null, 2131748103, str);
            }
        } else if (chat != null && chat.linked_monoforum_id != 0) {
            String str2 = chat.title;
            return z ? str2 : jb6.a0(null, null, 2131748103, str2);
        }
        if (chat != null) {
            return chat.title;
        }
        return null;
    }

    public static CharSequence k(TLRPC.ForumTopic forumTopic, TextPaint textPaint, Drawable[] drawableArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!(forumTopic instanceof TLRPC.TL_forumTopic)) {
            return "DELETED";
        }
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) forumTopic;
        if (tL_forumTopic.id == 1) {
            try {
                mo4 d = d(a.b, 1.0f, textPaint == null ? cmb.w0(null, cmb.qd, false) : textPaint.getColor(), false);
                d.setBounds(0, 0, textPaint == null ? gm.L(14.0f) : (int) textPaint.getTextSize(), textPaint == null ? gm.L(14.0f) : (int) textPaint.getTextSize());
                spannableStringBuilder.append((CharSequence) " ");
                if (drawableArr != null) {
                    drawableArr[0] = d;
                }
                spannableStringBuilder.setSpan(new ImageSpan(d, 2), 0, 1, 33);
            } catch (Exception unused) {
            }
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) " ");
            gn gnVar = new gn(tL_forumTopic.icon_emoji_id, 0.95f, textPaint != null ? textPaint.getFontMetricsInt() : null);
            spannableStringBuilder.setSpan(gnVar, 0, 1, 33);
            gnVar.top = true;
            gnVar.cacheType = 13;
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            sn2 f = f(tL_forumTopic);
            if (drawableArr != null) {
                drawableArr[0] = f.a;
            }
            f.setBounds(0, 0, (int) (f.getIntrinsicWidth() * 0.65f), (int) (f.getIntrinsicHeight() * 0.65f));
            Drawable drawable = f.b;
            if (drawable instanceof o26) {
                ((o26) drawable).i = 0.7f;
            }
            if (textPaint != null) {
                pn2 pn2Var = new pn2(0, f);
                pn2Var.c((int) (Math.abs(textPaint.getFontMetrics().ascent) + Math.abs(textPaint.getFontMetrics().descent)));
                spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
            } else {
                spannableStringBuilder.setSpan(new ImageSpan(f), 0, 1, 33);
            }
        }
        if (!TextUtils.isEmpty(tL_forumTopic.title)) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        return spannableStringBuilder;
    }

    public static boolean l(k47 k47Var) {
        return k47Var != null && (k47Var.k.action instanceof TLRPC.TL_messageActionTopicCreate);
    }

    public static ArrayList m(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TLRPC.savedDialog saveddialog = (TLRPC.savedDialog) obj;
            if (saveddialog instanceof TLRPC.TL_monoForumDialog) {
                TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) saveddialog;
                long n = pg3.n(tL_monoForumDialog.peer);
                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                tL_forumTopic.id = (int) ((n >>> 32) ^ n);
                tL_forumTopic.title = Long.toString(n);
                tL_forumTopic.top_message = tL_monoForumDialog.top_message;
                tL_forumTopic.read_inbox_max_id = tL_monoForumDialog.read_inbox_max_id;
                tL_forumTopic.read_outbox_max_id = tL_monoForumDialog.read_outbox_max_id;
                tL_forumTopic.unread_reactions_count = tL_monoForumDialog.unread_reactions_count;
                tL_forumTopic.unread_count = tL_monoForumDialog.unread_count;
                tL_forumTopic.draft = tL_monoForumDialog.draft;
                tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                tL_forumTopic.from_id = tL_monoForumDialog.peer;
                tL_forumTopic.nopaid_messages_exception = tL_monoForumDialog.nopaid_messages_exception;
                arrayList2.add(tL_forumTopic);
            }
        }
        return arrayList2;
    }

    public static void n(d dVar, long j, TLRPC.TL_forumTopic tL_forumTopic, int i) {
        yv1 h = h(dVar, j, tL_forumTopic, i, new Bundle());
        if (h != null) {
            dVar.presentFragment(h);
        }
    }

    public static void o(int i, TLRPC.Chat chat, pc0 pc0Var, bf0 bf0Var) {
        TLRPC.Chat L0 = sd2.p0(chat) ? oc7.r1(i).L0(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (L0 != null) {
            chat = L0;
        }
        pc0Var.p(chat);
        bf0Var.f(L0, pc0Var);
    }

    public static void p(int i, TLRPC.Chat chat, pc0 pc0Var, ImageReceiver imageReceiver) {
        TLRPC.Chat L0 = sd2.p0(chat) ? oc7.r1(i).L0(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (L0 != null) {
            chat = L0;
        }
        pc0Var.p(chat);
        imageReceiver.U(L0, pc0Var, null);
    }

    public static void q(bf0 bf0Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z, boolean z2, ylb ylbVar) {
        if (tL_forumTopic == null || bf0Var == null) {
            return;
        }
        if (tL_forumTopic.id == 1) {
            bf0Var.setAnimatedEmojiDrawable(null);
            Context context = bf0Var.getContext();
            int i = cmb.u8;
            mo4 d = d(context, 0.75f, cmb.v0(i, ylbVar), z2);
            bf0Var.setImageDrawable(d);
            if (d != null) {
                anb.x(bf0Var, d, i, ylbVar, PorterDuff.Mode.MULTIPLY);
                return;
            }
            return;
        }
        if (tL_forumTopic.icon_emoji_id == 0) {
            bf0Var.setAnimatedEmojiDrawable(null);
            bf0Var.setImageDrawable(f(tL_forumTopic));
            return;
        }
        bf0Var.setImageDrawable(null);
        vm vmVar = bf0Var.e;
        if (vmVar == null || tL_forumTopic.icon_emoji_id != vmVar.h()) {
            vm vmVar2 = new vm(z2 ? 11 : 10, z8c.t0, tL_forumTopic.icon_emoji_id);
            vmVar2.setColorFilter(z ? new PorterDuffColorFilter(cmb.w0(null, cmb.z8, false), PorterDuff.Mode.SRC_IN) : cmb.n0(ylbVar));
            bf0Var.setAnimatedEmojiDrawable(vmVar2);
        }
    }

    public static void r(long j, ActionBarLayout actionBarLayout) {
        d lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof yv1) {
            yv1 yv1Var = (yv1) lastFragment;
            if ((-yv1Var.a()) == j && yv1Var.getMessagesController().L0(Long.valueOf(j)).forum && yv1Var.getParentLayout() != null) {
                if (((ActionBarLayout) yv1Var.getParentLayout()).h()) {
                    gm.d3(new pp1(yv1Var, (byte) 17), 500L);
                } else {
                    sxb.M0(yv1Var);
                }
            }
        }
        if (lastFragment instanceof sxb) {
            sxb sxbVar = (sxb) lastFragment;
            long j2 = sxbVar.a;
            if ((-(-j2)) != j || sxbVar.getMessagesController().L0(Long.valueOf(j)).forum) {
                return;
            }
            if (sxbVar.getParentLayout() != null && ((ActionBarLayout) sxbVar.getParentLayout()).h()) {
                gm.d3(new lo4(sxbVar, (byte) 0), 500L);
                return;
            }
            sxbVar.I = true;
            yv1 yv1Var2 = new yv1(kt6.k(j2, "chat_id"));
            yv1Var2.Ga = true;
            sxbVar.presentFragment(yv1Var2);
        }
    }
}
