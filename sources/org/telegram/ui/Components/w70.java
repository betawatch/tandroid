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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class w70 extends org.telegram.ui.ActionBar.f3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public u70 F;
    public Drawable b;
    public l00 c;
    public s70 d;
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

    public static /* synthetic */ void m(w70 w70Var, u70 u70Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(w70Var.currentAccount).getInputPeer(MessageObject.getPeerId(w70Var.v));
        if (w70Var.s != 2) {
            w70Var.x = inputPeer;
        } else if (w70Var.v != w70Var.w) {
            u70Var.a(inputPeer, w70Var.h.size() > 1, false, false);
        }
        w70Var.dismiss();
    }

    public static /* synthetic */ void n(w70 w70Var) {
        w70Var.x = MessagesController.getInstance(w70Var.currentAccount).getInputPeer(MessageObject.getPeerId(w70Var.v));
        w70Var.y = true;
        w70Var.dismiss();
    }

    public static void o(w70 w70Var) {
        s70 s70Var = w70Var.d;
        if (w70Var.s == 0) {
            return;
        }
        if (s70Var.getChildCount() <= 0) {
            int paddingTop = s70Var.getPaddingTop();
            w70Var.r = paddingTop;
            s70Var.setTopGlowOffset(paddingTop);
            w70Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = s70Var.getChildAt(0);
        vk0 vk0Var = (vk0) s70Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && vk0Var != null && vk0Var.b() == 0) {
            i10 = top;
        }
        if (w70Var.r != i10) {
            w70Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            w70Var.f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            w70Var.r = i10;
            s70Var.setTopGlowOffset(i10);
            w70Var.containerView.invalidate();
        }
    }

    public static void t(Activity activity, long j3, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 240000) {
            booleanCallback.run(G.size() == 1);
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
        b2Var.setOnCancelListener(new p70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new org.telegram.messenger.ja(b2Var, j3, accountInstance, booleanCallback, 4)), 1));
        try {
            b2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j3, AccountInstance accountInstance, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, u70 u70Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() != 1 || i10 == 0) {
                    v(context, j3, G, n2Var, i10, peer, u70Var);
                    return;
                } else {
                    u70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
            b2Var.setOnCancelListener(new p70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new o70(b2Var, accountInstance, u70Var, j3, context, n2Var, i10, peer)), 0));
            try {
                b2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, u70 u70Var) {
        int i11;
        ViewGroup viewGroup;
        boolean z10;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog frVar = new fr(n2Var, arrayList, j3, u70Var);
            if (n2Var.getParentActivity() != null) {
                n2Var.showDialog(frVar);
                return;
            } else {
                frVar.show();
                return;
            }
        }
        w70 w70Var = new w70(context, false);
        w70Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        w70Var.h = arrayList2;
        w70Var.F = u70Var;
        w70Var.s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        w70Var.b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) w70Var.h.get(i12);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        w70Var.w = peer2;
                        w70Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) w70Var.h.get(i13);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        w70Var.w = peer3;
                        w70Var.v = peer3;
                        break;
                    }
                    i13++;
                }
            } else {
                w70Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = w70Var.b;
            i11 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            w70Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        w70Var.fixNavigationBar(i11);
        if (w70Var.s == 0) {
            q70 q70Var = new q70(w70Var, context);
            q70Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(q70Var);
            w70Var.setCustomView(nestedScrollView);
            viewGroup = q70Var;
        } else {
            r70 r70Var = new r70(w70Var, context);
            w70Var.containerView = r70Var;
            r70Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = w70Var.containerView;
            int i14 = w70Var.backgroundPaddingLeft;
            viewGroup2.setPadding(i14, 0, i14, 0);
            viewGroup = r70Var;
        }
        TLRPC.Chat chat = MessagesController.getInstance(w70Var.currentAccount).getChat(Long.valueOf(-j3));
        s70 s70Var = new s70(w70Var, context);
        w70Var.d = s70Var;
        w70Var.getContext();
        s70Var.setLayoutManager(new s4.c0(w70Var.s == 0 ? 0 : 1, false));
        s70Var.setAdapter(new v70(w70Var, context));
        s70Var.setVerticalScrollBarEnabled(false);
        s70Var.setClipToPadding(false);
        s70Var.setEnabled(true);
        s70Var.setSelectorDrawableColor(0);
        s70Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        s70Var.setOnScrollListener(new t70(w70Var));
        s70Var.setOnItemClickListener(new bi.x5(11, w70Var, chat));
        if (i10 != 0) {
            viewGroup.addView(s70Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            s70Var.setSelectorDrawableColor(0);
            s70Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            aj0 aj0Var = new aj0(context);
            aj0Var.setAutoRepeat(true);
            aj0Var.f(R.raw.utyan_schedule, 120, 120, null);
            aj0Var.d();
            viewGroup.addView(aj0Var, w7.x5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        w70Var.e = textView;
        org.telegram.messenger.wl.j(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            viewGroup.addView(textView, w7.x5.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            viewGroup.addView(textView, w7.x5.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(w70Var.getContext());
        w70Var.f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = w70Var.h.size();
        for (int i15 = 0; i15 < size3; i15++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) w70Var.h.get(i15));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(w70Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        w70Var.f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        w70Var.f.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k5, false));
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (w70Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                w70Var.d.setVisibility(8);
            }
            w70Var.f.setText(sb2);
            w70Var.f.setGravity(49);
            viewGroup.addView(w70Var.f, w7.x5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                w70Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                w70Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            w70Var.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(w70Var.f, w7.x5.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            viewGroup.addView(w70Var.d, w7.x5.t(w70Var.h.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        l00 l00Var = new l00(w70Var, context, false);
        w70Var.c = l00Var;
        ((View) l00Var.c).setOnClickListener(new ct(9, w70Var, u70Var));
        if (w70Var.s == 0) {
            viewGroup.addView(l00Var, w7.x5.t(-1, 50, 51, 0, 0, 0, 0));
            l00 l00Var2 = new l00(w70Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                l00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                l00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) l00Var2.c).setOnClickListener(new g0(w70Var, 29));
            viewGroup.addView(l00Var2, w7.x5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(l00Var, w7.x5.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        w70Var.w(chat, false);
        if (n2Var == null) {
            w70Var.show();
        } else if (n2Var.getParentActivity() != null) {
            n2Var.showDialog(w70Var);
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
            this.F.a(inputPeer, this.h.size() > 1, this.y, false);
        }
    }

    public final void w(TLRPC.Chat chat, boolean z10) {
        l00 l00Var = this.c;
        if (this.s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                l00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                l00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            l00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            l00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, chat2 != null ? chat2.title : ""), z10);
        }
    }
}
