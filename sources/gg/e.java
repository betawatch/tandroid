package gg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.gs;
import org.telegram.messenger.h20;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.messenger.o5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.z70;
import org.telegram.ui.pb1;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class e {
    public static final /* synthetic */ int a = 0;

    static {
        new SparseArray();
    }

    public static void a(un unVar, gs gsVar) {
        TLRPC.TL_forumTopic f7;
        if (gsVar.b == 0 || (f7 = unVar.getMessagesController().r7.f(-gsVar.a, gsVar.b)) == null) {
            return;
        }
        if (gsVar.a > 0) {
            if (h20.u(unVar.getMessagesController().Z1(Long.valueOf(gsVar.a)))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new jj(unVar.getCurrentAccount(), f7.topicStartMessage, false, false));
                unVar.Hb(arrayList, null, f7.id, f7.read_inbox_max_id, f7.read_outbox_max_id, f7);
                unVar.getMessagesController().G4(-gsVar.a, gsVar.b);
                return;
            }
            return;
        }
        TLRPC.Chat L0 = unVar.getMessagesController().L0(Long.valueOf(-gsVar.a));
        if (L0 == null) {
            return;
        }
        if (!w3.p0(L0)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new jj(unVar.getCurrentAccount(), f7.topicStartMessage, false, false));
            unVar.Hb(arrayList2, L0, f7.id, f7.read_inbox_max_id, f7.read_outbox_max_id, f7);
        } else if (w3.A(d20.s0, L0, 24)) {
            int i10 = f7.read_inbox_max_id;
            int i11 = f7.read_outbox_max_id;
            unVar.y4 = i10;
            unVar.z4 = i11;
            unVar.A4 = Math.max(1, i10);
            unVar.r4 = o5.o(f7.from_id);
            unVar.Tc();
            unVar.ld(false);
            unVar.Bc(false);
        }
        unVar.getMessagesController().G4(-gsVar.a, gsVar.b);
    }

    public static void b(jj jjVar) {
        TLRPC.TL_forumTopic f7;
        TLRPC.Message message = jjVar.k;
        int i10 = jjVar.I1;
        if (jj.B0(message) <= 0 && (f7 = vp.r1(i10).r7.f(-jj.B0(jjVar.k), jj.c2(i10, jjVar.k, true, false))) != null) {
            Drawable drawable = jjVar.g2[0];
            if (drawable instanceof a) {
                ((a) drawable).b(f7.icon_color);
            }
        }
    }

    public static d c(Context context, float f7, int i10, boolean z10) {
        if (context == null) {
            return null;
        }
        d dVar = new d();
        dVar.a = context.getResources().getDrawable(z10 ? R.drawable.msg_filled_general_large : R.drawable.msg_filled_general).mutate();
        dVar.b = f7;
        dVar.a(i10);
        return dVar;
    }

    public static eq d(int i10, String str) {
        a aVar = new a(i10);
        z70 z70Var = new z70(1, null);
        String trim = str.trim();
        z70Var.a(trim.length() >= 1 ? trim.substring(0, 1).toUpperCase() : "");
        eq eqVar = new eq(aVar, z70Var, 0, 0);
        eqVar.x = true;
        return eqVar;
    }

    public static eq e(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return d(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static void f(ArrayList arrayList, long j10) {
        if (arrayList == null) {
            return;
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (j10 != jj.c2(((jj) arrayList.get(i10)).I1, ((jj) arrayList.get(i10)).k, true, false)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public static un g(k2 k2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic f7;
        if (k2Var == null || tL_forumTopic == null) {
            return null;
        }
        TLRPC.Chat L0 = k2Var.getMessagesController().L0(Long.valueOf(j10));
        bundle.putLong("chat_id", j10);
        if (i10 != 0) {
            bundle.putInt("message_id", i10);
        } else if (tL_forumTopic.read_inbox_max_id == 0) {
            bundle.putInt("message_id", tL_forumTopic.id);
        }
        bundle.putInt("unread_count", tL_forumTopic.unread_count);
        bundle.putBoolean("historyPreloaded", false);
        un unVar = new un(bundle);
        TLRPC.Message message = tL_forumTopic.topicStartMessage;
        if (message != null || (f7 = k2Var.getMessagesController().r7.f(j10, tL_forumTopic.id)) == null) {
            tL_forumTopic2 = tL_forumTopic;
        } else {
            message = f7.topicStartMessage;
            tL_forumTopic2 = f7;
        }
        if (message == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new jj(k2Var.getCurrentAccount(), message, false, false));
        unVar.Hb(arrayList, L0, tL_forumTopic2.id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i10 != 0) {
            unVar.b8 = i10;
        }
        return unVar;
    }

    public static String h(int i10, long j10) {
        return i(i10, vp.r1(i10).L0(Long.valueOf(-j10)), true);
    }

    public static String i(int i10, TLRPC.Chat chat, boolean z10) {
        if (w3.p0(chat)) {
            TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(chat.linked_monoforum_id));
            if (L0 != null) {
                String str = L0.title;
                return z10 ? str : cd.a0(null, null, 2131748361, str);
            }
        } else if (chat != null && chat.linked_monoforum_id != 0) {
            String str2 = chat.title;
            return z10 ? str2 : cd.a0(null, null, 2131748361, str2);
        }
        if (chat != null) {
            return chat.title;
        }
        return null;
    }

    public static CharSequence j(TLRPC.ForumTopic forumTopic, Paint paint, Drawable[] drawableArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!(forumTopic instanceof TLRPC.TL_forumTopic)) {
            return "DELETED";
        }
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) forumTopic;
        if (tL_forumTopic.id == 1) {
            try {
                d c10 = c(w0.b, 1.0f, paint == null ? t6.x0(null, t6.od, false) : paint.getColor(), false);
                c10.setBounds(0, 0, paint == null ? i0.L(14.0f) : (int) paint.getTextSize(), paint == null ? i0.L(14.0f) : (int) paint.getTextSize());
                spannableStringBuilder.append((CharSequence) " ");
                if (drawableArr != null) {
                    drawableArr[0] = c10;
                }
                spannableStringBuilder.setSpan(new ImageSpan(c10, 2), 0, 1, 33);
            } catch (Exception unused) {
            }
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) " ");
            org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(tL_forumTopic.icon_emoji_id, 0.95f, paint != null ? paint.getFontMetricsInt() : null);
            spannableStringBuilder.setSpan(o5Var, 0, 1, 33);
            o5Var.top = true;
            o5Var.cacheType = 13;
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            eq e = e(tL_forumTopic);
            if (drawableArr != null) {
                drawableArr[0] = e.a;
            }
            e.setBounds(0, 0, (int) (e.getIntrinsicWidth() * 0.65f), (int) (e.getIntrinsicHeight() * 0.65f));
            Drawable drawable = e.b;
            if (drawable instanceof z70) {
                ((z70) drawable).i = 0.7f;
            }
            if (paint != null) {
                dq dqVar = new dq(0, e);
                dqVar.c((int) (Math.abs(paint.getFontMetrics().ascent) + Math.abs(paint.getFontMetrics().descent)));
                spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
            } else {
                spannableStringBuilder.setSpan(new ImageSpan(e), 0, 1, 33);
            }
        }
        if (!TextUtils.isEmpty(tL_forumTopic.title)) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        return spannableStringBuilder;
    }

    public static boolean k(jj jjVar) {
        return jjVar != null && (jjVar.k.action instanceof TLRPC.TL_messageActionTopicCreate);
    }

    public static ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.savedDialog saveddialog = (TLRPC.savedDialog) obj;
            if (saveddialog instanceof TLRPC.TL_monoForumDialog) {
                TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) saveddialog;
                long o10 = o5.o(tL_monoForumDialog.peer);
                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                tL_forumTopic.id = (int) ((o10 >>> 32) ^ o10);
                tL_forumTopic.title = Long.toString(o10);
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

    public static void m(k2 k2Var, long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10) {
        un g10 = g(k2Var, j10, tL_forumTopic, i10, new Bundle());
        if (g10 != null) {
            k2Var.presentFragment(g10);
        }
    }

    public static void n(int i10, TLRPC.Chat chat, r8 r8Var, ImageReceiver imageReceiver) {
        TLRPC.Chat L0 = w3.p0(chat) ? vp.r1(i10).L0(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (L0 != null) {
            chat = L0;
        }
        r8Var.q(chat);
        imageReceiver.i0(L0, r8Var, null);
    }

    public static void o(int i10, TLRPC.Chat chat, r8 r8Var, g9 g9Var) {
        TLRPC.Chat L0 = w3.p0(chat) ? vp.r1(i10).L0(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (L0 != null) {
            chat = L0;
        }
        r8Var.q(chat);
        g9Var.e(L0, r8Var);
    }

    public static void p(g9 g9Var, TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11, p6 p6Var) {
        if (tL_forumTopic == null || g9Var == null) {
            return;
        }
        if (tL_forumTopic.id == 1) {
            g9Var.setAnimatedEmojiDrawable(null);
            Context context = g9Var.getContext();
            int i10 = t6.v8;
            d c10 = c(context, 0.75f, t6.w0(i10, p6Var), z11);
            g9Var.setImageDrawable(c10);
            if (c10 != null) {
                a7.y(g9Var, c10, i10, p6Var, PorterDuff.Mode.MULTIPLY);
                return;
            }
            return;
        }
        if (tL_forumTopic.icon_emoji_id == 0) {
            g9Var.setAnimatedEmojiDrawable(null);
            g9Var.setImageDrawable(e(tL_forumTopic));
            return;
        }
        g9Var.setImageDrawable(null);
        f5 f5Var = g9Var.e;
        if (f5Var == null || tL_forumTopic.icon_emoji_id != f5Var.h()) {
            f5 f5Var2 = new f5(z11 ? 11 : 10, d20.s0, tL_forumTopic.icon_emoji_id);
            f5Var2.setColorFilter(z10 ? new PorterDuffColorFilter(t6.x0(null, t6.A8, false), PorterDuff.Mode.SRC_IN) : t6.o0(p6Var));
            g9Var.setAnimatedEmojiDrawable(f5Var2);
        }
    }

    public static void q(long j10, ActionBarLayout actionBarLayout) {
        k2 lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof un) {
            un unVar = (un) lastFragment;
            if ((-unVar.a()) == j10 && unVar.getMessagesController().L0(Long.valueOf(j10)).forum && unVar.getParentLayout() != null) {
                if (((ActionBarLayout) unVar.getParentLayout()).i()) {
                    i0.h3(new b(unVar, 0), 500L);
                } else {
                    pb1.L0(unVar);
                }
            }
        }
        if (lastFragment instanceof pb1) {
            pb1 pb1Var = (pb1) lastFragment;
            long j11 = pb1Var.a;
            if ((-(-j11)) != j10 || pb1Var.getMessagesController().L0(Long.valueOf(j10)).forum) {
                return;
            }
            if (pb1Var.getParentLayout() != null && ((ActionBarLayout) pb1Var.getParentLayout()).i()) {
                i0.h3(new c(pb1Var, 0), 500L);
                return;
            }
            pb1Var.H = true;
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", j11);
            un unVar2 = new un(bundle);
            unVar2.Ca = true;
            pb1Var.presentFragment(unVar2);
        }
    }
}
