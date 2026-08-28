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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g70 extends org.telegram.ui.ActionBar.f3 {
    public static ArrayList C;
    public static long D;
    public static long E;
    public static int F;
    public boolean A;
    public e70 B;
    public Drawable b;
    public wz c;
    public c70 d;
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

    public static /* synthetic */ void m(g70 g70Var, e70 e70Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(g70Var.currentAccount).getInputPeer(MessageObject.getPeerId(g70Var.v));
        if (g70Var.s != 2) {
            g70Var.x = inputPeer;
        } else if (g70Var.v != g70Var.w) {
            e70Var.a(inputPeer, g70Var.h.size() > 1, false, false);
        }
        g70Var.dismiss();
    }

    public static /* synthetic */ void n(g70 g70Var) {
        g70Var.x = MessagesController.getInstance(g70Var.currentAccount).getInputPeer(MessageObject.getPeerId(g70Var.v));
        g70Var.y = true;
        g70Var.dismiss();
    }

    public static void o(g70 g70Var) {
        c70 c70Var = g70Var.d;
        if (g70Var.s == 0) {
            return;
        }
        if (c70Var.getChildCount() <= 0) {
            int paddingTop = c70Var.getPaddingTop();
            g70Var.r = paddingTop;
            c70Var.setTopGlowOffset(paddingTop);
            g70Var.containerView.invalidate();
            return;
        }
        int i9 = 0;
        View childAt = c70Var.getChildAt(0);
        ik0 ik0Var = (ik0) c70Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && ik0Var != null && ik0Var.b() == 0) {
            i9 = top;
        }
        if (g70Var.r != i9) {
            g70Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            g70Var.f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            g70Var.r = i9;
            c70Var.setTopGlowOffset(i9);
            g70Var.containerView.invalidate();
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
        c2Var.setOnCancelListener(new z60(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new gh.w(c2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            c2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.o2 o2Var, int i9, TLRPC.Peer peer, e70 e70Var) {
        if (context != null) {
            if (F == accountInstance.getCurrentAccount() && E == j10 && C != null && SystemClock.elapsedRealtime() - D < 300000) {
                if (C.size() != 1 || i9 == 0) {
                    v(context, j10, C, o2Var, i9, peer, e70Var);
                    return;
                } else {
                    e70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) C.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            c2Var.setOnCancelListener(new z60(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new y60(c2Var, accountInstance, e70Var, j10, context, o2Var, i9, peer)), 0));
            try {
                c2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, int i9, TLRPC.Peer peer, e70 e70Var) {
        int i10;
        ViewGroup viewGroup;
        boolean z10;
        if (i9 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog wqVar = new wq(o2Var, arrayList, j10, e70Var);
            if (o2Var.getParentActivity() != null) {
                o2Var.showDialog(wqVar);
                return;
            } else {
                wqVar.show();
                return;
            }
        }
        g70 g70Var = new g70(context, false);
        g70Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        g70Var.h = arrayList2;
        g70Var.B = e70Var;
        g70Var.s = i9;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        g70Var.b = mutate;
        if (i9 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) g70Var.h.get(i11);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        g70Var.w = peer2;
                        g70Var.v = peer2;
                        break;
                    }
                    i11++;
                }
            } else if (peer != null) {
                long peerId = MessageObject.getPeerId(peer);
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) g70Var.h.get(i12);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        g70Var.w = peer3;
                        g70Var.v = peer3;
                        break;
                    }
                    i12++;
                }
            } else {
                g70Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = g70Var.b;
            i10 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            g70Var.v = (TLRPC.Peer) arrayList2.get(0);
            i10 = w02;
        }
        g70Var.fixNavigationBar(i10);
        if (g70Var.s == 0) {
            a70 a70Var = new a70(g70Var, context);
            a70Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(a70Var);
            g70Var.setCustomView(nestedScrollView);
            viewGroup = a70Var;
        } else {
            b70 b70Var = new b70(g70Var, context);
            g70Var.containerView = b70Var;
            b70Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = g70Var.containerView;
            int i13 = g70Var.backgroundPaddingLeft;
            viewGroup2.setPadding(i13, 0, i13, 0);
            viewGroup = b70Var;
        }
        TLRPC.Chat chat = MessagesController.getInstance(g70Var.currentAccount).getChat(Long.valueOf(-j10));
        c70 c70Var = new c70(g70Var, context);
        g70Var.d = c70Var;
        g70Var.getContext();
        c70Var.setLayoutManager(new f2.m0(g70Var.s == 0 ? 0 : 1, false));
        c70Var.setAdapter(new f70(g70Var, context));
        c70Var.setVerticalScrollBarEnabled(false);
        c70Var.setClipToPadding(false);
        c70Var.setEnabled(true);
        c70Var.setSelectorDrawableColor(0);
        c70Var.setGlowColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A5, false));
        c70Var.setOnScrollListener(new d70(g70Var));
        c70Var.setOnItemClickListener(new bg.b1(13, g70Var, chat));
        if (i9 != 0) {
            viewGroup.addView(c70Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            c70Var.setSelectorDrawableColor(0);
            c70Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i9 == 0) {
            pi0 pi0Var = new pi0(context);
            pi0Var.setAutoRepeat(true);
            pi0Var.f(R.raw.utyan_schedule, 120, 120, null);
            pi0Var.d();
            viewGroup.addView(pi0Var, g7.e6.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        g70Var.e = textView;
        org.telegram.messenger.ll.k(20.0f, 1, textView);
        if (i9 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i9 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            viewGroup.addView(textView, g7.e6.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i9 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            viewGroup.addView(textView, g7.e6.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(g70Var.getContext());
        g70Var.f = textView2;
        if (i9 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = g70Var.h.size();
        for (int i14 = 0; i14 < size3; i14++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) g70Var.h.get(i14));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(g70Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        g70Var.f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        g70Var.f.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.k5, false));
        if (i9 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (g70Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                g70Var.d.setVisibility(8);
            }
            g70Var.f.setText(sb2);
            g70Var.f.setGravity(49);
            viewGroup.addView(g70Var.f, g7.e6.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                g70Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                g70Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            g70Var.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(g70Var.f, g7.e6.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i9 == 0) {
            viewGroup.addView(g70Var.d, g7.e6.t(g70Var.h.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        wz wzVar = new wz(g70Var, context, false);
        g70Var.c = wzVar;
        ((View) wzVar.c).setOnClickListener(new s2(26, g70Var, e70Var));
        if (g70Var.s == 0) {
            viewGroup.addView(wzVar, g7.e6.t(-1, 50, 51, 0, 0, 0, 0));
            wz wzVar2 = new wz(g70Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                wzVar2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                wzVar2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) wzVar2.c).setOnClickListener(new f0(g70Var, 29));
            viewGroup.addView(wzVar2, g7.e6.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(wzVar, g7.e6.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        g70Var.w(chat, false);
        if (o2Var == null) {
            g70Var.show();
        } else if (o2Var.getParentActivity() != null) {
            o2Var.showDialog(g70Var);
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
        wz wzVar = this.c;
        if (this.s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                wzVar.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                wzVar.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            wzVar.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            wzVar.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, chat2 != null ? chat2.title : ""), z10);
        }
    }
}
