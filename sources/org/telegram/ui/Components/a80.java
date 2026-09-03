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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a80 extends org.telegram.ui.ActionBar.h3 {
    public static ArrayList D;
    public static long E;
    public static long F;
    public static int G;
    public boolean B;
    public y70 C;
    public Drawable b;
    public m00 c;
    public w70 d;
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

    public static /* synthetic */ void m(a80 a80Var, y70 y70Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(a80Var.currentAccount).getInputPeer(MessageObject.getPeerId(a80Var.v));
        if (a80Var.s != 2) {
            a80Var.x = inputPeer;
        } else if (a80Var.v != a80Var.w) {
            y70Var.a(inputPeer, a80Var.h.size() > 1, false, false);
        }
        a80Var.dismiss();
    }

    public static /* synthetic */ void n(a80 a80Var) {
        a80Var.x = MessagesController.getInstance(a80Var.currentAccount).getInputPeer(MessageObject.getPeerId(a80Var.v));
        a80Var.y = true;
        a80Var.dismiss();
    }

    public static void o(a80 a80Var) {
        w70 w70Var = a80Var.d;
        if (a80Var.s == 0) {
            return;
        }
        if (w70Var.getChildCount() <= 0) {
            int paddingTop = w70Var.getPaddingTop();
            a80Var.r = paddingTop;
            w70Var.setTopGlowOffset(paddingTop);
            a80Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = w70Var.getChildAt(0);
        el0 el0Var = (el0) w70Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && el0Var != null && el0Var.b() == 0) {
            i10 = top;
        }
        if (a80Var.r != i10) {
            a80Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            a80Var.f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            a80Var.r = i10;
            w70Var.setTopGlowOffset(i10);
            a80Var.containerView.invalidate();
        }
    }

    public static void t(Activity activity, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (G == accountInstance.getCurrentAccount() && F == j10 && D != null && SystemClock.elapsedRealtime() - E < 240000) {
            booleanCallback.run(D.size() == 1);
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
        d2Var.setOnCancelListener(new s70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new mh.u(d2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            d2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer, y70 y70Var) {
        if (context != null) {
            if (G == accountInstance.getCurrentAccount() && F == j10 && D != null && SystemClock.elapsedRealtime() - E < 300000) {
                if (D.size() != 1 || i10 == 0) {
                    v(context, j10, D, p2Var, i10, peer, y70Var);
                    return;
                } else {
                    y70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) D.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            d2Var.setOnCancelListener(new s70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new r70(d2Var, accountInstance, y70Var, j10, context, p2Var, i10, peer)), 0));
            try {
                d2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer, y70 y70Var) {
        int i11;
        ViewGroup viewGroup;
        boolean z4;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog grVar = new gr(p2Var, arrayList, j10, y70Var);
            if (p2Var.getParentActivity() != null) {
                p2Var.showDialog(grVar);
                return;
            } else {
                grVar.show();
                return;
            }
        }
        a80 a80Var = new a80(context, false);
        a80Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        a80Var.h = arrayList2;
        a80Var.C = y70Var;
        a80Var.s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        a80Var.b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) a80Var.h.get(i12);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        a80Var.w = peer2;
                        a80Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) a80Var.h.get(i13);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        a80Var.w = peer3;
                        a80Var.v = peer3;
                        break;
                    }
                    i13++;
                }
            } else {
                a80Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = a80Var.b;
            i11 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            a80Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        a80Var.fixNavigationBar(i11);
        if (a80Var.s == 0) {
            u70 u70Var = new u70(a80Var, context);
            u70Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(u70Var);
            a80Var.setCustomView(nestedScrollView);
            viewGroup = u70Var;
        } else {
            v70 v70Var = new v70(a80Var, context);
            a80Var.containerView = v70Var;
            v70Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = a80Var.containerView;
            int i14 = a80Var.backgroundPaddingLeft;
            viewGroup2.setPadding(i14, 0, i14, 0);
            viewGroup = v70Var;
        }
        TLRPC.Chat chat = MessagesController.getInstance(a80Var.currentAccount).getChat(Long.valueOf(-j10));
        w70 w70Var = new w70(a80Var, context);
        a80Var.d = w70Var;
        a80Var.getContext();
        w70Var.setLayoutManager(new f2.j0(a80Var.s == 0 ? 0 : 1, false));
        w70Var.setAdapter(new z70(a80Var, context));
        w70Var.setVerticalScrollBarEnabled(false);
        w70Var.setClipToPadding(false);
        w70Var.setEnabled(true);
        w70Var.setSelectorDrawableColor(0);
        w70Var.setGlowColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.A5, false));
        w70Var.setOnScrollListener(new x70(a80Var));
        w70Var.setOnItemClickListener(new hg.v0(11, a80Var, chat));
        if (i10 != 0) {
            viewGroup.addView(w70Var, k7.c6.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            w70Var.setSelectorDrawableColor(0);
            w70Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            kj0 kj0Var = new kj0(context);
            kj0Var.setAutoRepeat(true);
            kj0Var.f(R.raw.utyan_schedule, 120, 120, null);
            kj0Var.d();
            viewGroup.addView(kj0Var, k7.c6.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        a80Var.e = textView;
        org.telegram.ui.b.g(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            viewGroup.addView(textView, k7.c6.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            viewGroup.addView(textView, k7.c6.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(a80Var.getContext());
        a80Var.f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = a80Var.h.size();
        for (int i15 = 0; i15 < size3; i15++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) a80Var.h.get(i15));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(a80Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        a80Var.f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        a80Var.f.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.k5, false));
        if (i10 == 0) {
            StringBuilder sb = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (a80Var.h.size() > 1) {
                sb.append("\n\n");
                sb.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                a80Var.d.setVisibility(8);
            }
            a80Var.f.setText(sb);
            a80Var.f.setGravity(49);
            viewGroup.addView(a80Var.f, k7.c6.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z4) {
                a80Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                a80Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            a80Var.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(a80Var.f, k7.c6.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            viewGroup.addView(a80Var.d, k7.c6.t(a80Var.h.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        m00 m00Var = new m00(a80Var, context, false);
        a80Var.c = m00Var;
        ((View) m00Var.c).setOnClickListener(new w2(24, a80Var, y70Var));
        if (a80Var.s == 0) {
            viewGroup.addView(m00Var, k7.c6.t(-1, 50, 51, 0, 0, 0, 0));
            m00 m00Var2 = new m00(a80Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                m00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                m00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) m00Var2.c).setOnClickListener(new g0(a80Var, 29));
            viewGroup.addView(m00Var2, k7.c6.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(m00Var, k7.c6.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        a80Var.w(chat, false);
        if (p2Var == null) {
            a80Var.show();
        } else if (p2Var.getParentActivity() != null) {
            p2Var.showDialog(a80Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.x;
        if (inputPeer != null) {
            this.C.a(inputPeer, this.h.size() > 1, this.y, false);
        }
    }

    public final void w(TLRPC.Chat chat, boolean z4) {
        m00 m00Var = this.c;
        if (this.s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                m00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z4);
                return;
            } else {
                m00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z4);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            m00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z4);
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            m00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, chat2 != null ? chat2.title : ""), z4);
        }
    }
}
