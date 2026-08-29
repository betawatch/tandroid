package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t70 extends org.telegram.ui.ActionBar.f3 {
    public static ArrayList C;
    public static long D;
    public static long E;
    public static int F;
    public boolean A;
    public r70 B;
    public Drawable b;
    public g00 c;
    public p70 d;
    public TextView e;
    public TextView f;
    public ArrayList h;
    public boolean n;
    public int r;
    public int s;
    public TLRPC.Peer v;
    public TLRPC.Peer w;
    public TLRPC.InputPeer x;
    public boolean y;

    public static /* synthetic */ void m(t70 t70Var, r70 r70Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(t70Var.currentAccount).getInputPeer(MessageObject.getPeerId(t70Var.v));
        if (t70Var.s != 2) {
            t70Var.x = inputPeer;
        } else if (t70Var.v != t70Var.w) {
            r70Var.a(inputPeer, t70Var.h.size() > 1, false, false);
        }
        t70Var.dismiss();
    }

    public static /* synthetic */ void n(t70 t70Var) {
        t70Var.x = MessagesController.getInstance(t70Var.currentAccount).getInputPeer(MessageObject.getPeerId(t70Var.v));
        t70Var.y = true;
        t70Var.dismiss();
    }

    public static void o(t70 t70Var) {
        p70 p70Var = t70Var.d;
        if (t70Var.s == 0) {
            return;
        }
        if (p70Var.getChildCount() <= 0) {
            int paddingTop = p70Var.getPaddingTop();
            t70Var.r = paddingTop;
            p70Var.setTopGlowOffset(paddingTop);
            t70Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = p70Var.getChildAt(0);
        vk0 vk0Var = (vk0) p70Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && vk0Var != null && vk0Var.b() == 0) {
            i10 = top;
        }
        if (t70Var.r != i10) {
            t70Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            t70Var.f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            t70Var.r = i10;
            p70Var.setTopGlowOffset(i10);
            t70Var.containerView.invalidate();
        }
    }

    public static void t(Activity activity, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (F == accountInstance.getCurrentAccount() && E == j10 && C != null && SystemClock.elapsedRealtime() - D < 240000) {
            booleanCallback.run(C.size() == 1);
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
        c2Var.setOnCancelListener(new l70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new jh.v(c2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            c2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer, r70 r70Var) {
        if (context != null) {
            if (F == accountInstance.getCurrentAccount() && E == j10 && C != null && SystemClock.elapsedRealtime() - D < 300000) {
                if (C.size() != 1 || i10 == 0) {
                    v(context, j10, C, o2Var, i10, peer, r70Var);
                    return;
                } else {
                    r70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) C.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            c2Var.setOnCancelListener(new l70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new k70(c2Var, accountInstance, r70Var, j10, context, o2Var, i10, peer)), 0));
            try {
                c2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.Peer peer, r70 r70Var) {
        int i11;
        ViewGroup viewGroup;
        boolean z10;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog arVar = new ar(o2Var, arrayList, j10, r70Var);
            if (o2Var.getParentActivity() != null) {
                o2Var.showDialog(arVar);
                return;
            } else {
                arVar.show();
                return;
            }
        }
        t70 t70Var = new t70(context, false);
        t70Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        t70Var.h = arrayList2;
        t70Var.B = r70Var;
        t70Var.s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        t70Var.b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) t70Var.h.get(i12);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        t70Var.w = peer2;
                        t70Var.v = peer2;
                        break;
                    }
                    i12++;
                }
            } else if (peer != null) {
                long peerId = MessageObject.getPeerId(peer);
                int size2 = arrayList2.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) t70Var.h.get(i13);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        t70Var.w = peer3;
                        t70Var.v = peer3;
                        break;
                    }
                    i13++;
                }
            } else {
                t70Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = t70Var.b;
            i11 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            t70Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        t70Var.fixNavigationBar(i11);
        if (t70Var.s == 0) {
            n70 n70Var = new n70(t70Var, context);
            n70Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(n70Var);
            t70Var.setCustomView(nestedScrollView);
            viewGroup = n70Var;
        } else {
            o70 o70Var = new o70(t70Var, context);
            t70Var.containerView = o70Var;
            o70Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = t70Var.containerView;
            int i14 = t70Var.backgroundPaddingLeft;
            viewGroup2.setPadding(i14, 0, i14, 0);
            viewGroup = o70Var;
        }
        TLRPC.Chat chat = MessagesController.getInstance(t70Var.currentAccount).getChat(Long.valueOf(-j10));
        p70 p70Var = new p70(t70Var, context);
        t70Var.d = p70Var;
        t70Var.getContext();
        p70Var.setLayoutManager(new f2.j0(t70Var.s == 0 ? 0 : 1, false));
        p70Var.setAdapter(new s70(t70Var, context));
        p70Var.setVerticalScrollBarEnabled(false);
        p70Var.setClipToPadding(false);
        p70Var.setEnabled(true);
        p70Var.setSelectorDrawableColor(0);
        p70Var.setGlowColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A5, false));
        p70Var.setOnScrollListener(new q70(t70Var));
        p70Var.setOnItemClickListener(new eg.w0(12, t70Var, chat));
        if (i10 != 0) {
            viewGroup.addView(p70Var, i7.f6.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            p70Var.setSelectorDrawableColor(0);
            p70Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            aj0 aj0Var = new aj0(context);
            aj0Var.setAutoRepeat(true);
            aj0Var.f(R.raw.utyan_schedule, 120, 120, null);
            aj0Var.d();
            viewGroup.addView(aj0Var, i7.f6.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        t70Var.e = textView;
        org.telegram.ui.b.g(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            viewGroup.addView(textView, i7.f6.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            viewGroup.addView(textView, i7.f6.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(t70Var.getContext());
        t70Var.f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = t70Var.h.size();
        for (int i15 = 0; i15 < size3; i15++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) t70Var.h.get(i15));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(t70Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        t70Var.f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        t70Var.f.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.k5, false));
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (t70Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                t70Var.d.setVisibility(8);
            }
            t70Var.f.setText(sb2);
            t70Var.f.setGravity(49);
            viewGroup.addView(t70Var.f, i7.f6.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                t70Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                t70Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            t70Var.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(t70Var.f, i7.f6.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            viewGroup.addView(t70Var.d, i7.f6.t(t70Var.h.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        g00 g00Var = new g00(t70Var, context, false);
        t70Var.c = g00Var;
        ((View) g00Var.c).setOnClickListener(new t2(27, t70Var, r70Var));
        if (t70Var.s == 0) {
            viewGroup.addView(g00Var, i7.f6.t(-1, 50, 51, 0, 0, 0, 0));
            g00 g00Var2 = new g00(t70Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                g00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                g00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) g00Var2.c).setOnClickListener(new h0(t70Var, 29));
            viewGroup.addView(g00Var2, i7.f6.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(g00Var, i7.f6.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        t70Var.w(chat, false);
        if (o2Var == null) {
            t70Var.show();
        } else if (o2Var.getParentActivity() != null) {
            o2Var.showDialog(t70Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.x;
        if (inputPeer != null) {
            this.B.a(inputPeer, this.h.size() > 1, this.y, false);
        }
    }

    public final void w(TLRPC.Chat chat, boolean z10) {
        g00 g00Var = this.c;
        if (this.s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                g00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                g00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            g00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            g00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, chat2 != null ? chat2.title : ""), z10);
        }
    }
}
