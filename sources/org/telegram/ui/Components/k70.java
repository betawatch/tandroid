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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class k70 extends org.telegram.ui.ActionBar.e3 {
    public static ArrayList C;
    public static long D;
    public static long E;
    public static int F;
    public boolean A;
    public i70 B;
    public Drawable b;
    public zz c;
    public g70 d;
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

    public static /* synthetic */ void m(k70 k70Var, i70 i70Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(k70Var.currentAccount).getInputPeer(MessageObject.getPeerId(k70Var.v));
        if (k70Var.s != 2) {
            k70Var.x = inputPeer;
        } else if (k70Var.v != k70Var.w) {
            i70Var.a(inputPeer, k70Var.h.size() > 1, false, false);
        }
        k70Var.dismiss();
    }

    public static /* synthetic */ void n(k70 k70Var) {
        k70Var.x = MessagesController.getInstance(k70Var.currentAccount).getInputPeer(MessageObject.getPeerId(k70Var.v));
        k70Var.y = true;
        k70Var.dismiss();
    }

    public static void p(k70 k70Var) {
        g70 g70Var = k70Var.d;
        if (k70Var.s == 0) {
            return;
        }
        if (g70Var.getChildCount() <= 0) {
            int paddingTop = g70Var.getPaddingTop();
            k70Var.r = paddingTop;
            g70Var.setTopGlowOffset(paddingTop);
            k70Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = g70Var.getChildAt(0);
        lk0 lk0Var = (lk0) g70Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && lk0Var != null && lk0Var.b() == 0) {
            i10 = top;
        }
        if (k70Var.r != i10) {
            k70Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            k70Var.f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            k70Var.r = i10;
            g70Var.setTopGlowOffset(i10);
            k70Var.containerView.invalidate();
        }
    }

    public static void u(Activity activity, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (F == accountInstance.getCurrentAccount() && E == j10 && C != null && SystemClock.elapsedRealtime() - D < 240000) {
            booleanCallback.run(C.size() == 1);
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
        b2Var.setOnCancelListener(new d70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new hh.w(b2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            b2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void v(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, i70 i70Var) {
        if (context != null) {
            if (F == accountInstance.getCurrentAccount() && E == j10 && C != null && SystemClock.elapsedRealtime() - D < 300000) {
                if (C.size() != 1 || i10 == 0) {
                    w(context, j10, C, n2Var, i10, peer, i70Var);
                    return;
                } else {
                    i70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) C.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            b2Var.setOnCancelListener(new d70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new c70(b2Var, accountInstance, i70Var, j10, context, n2Var, i10, peer)), 0));
            try {
                b2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void w(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, i70 i70Var) {
        int i11;
        ViewGroup viewGroup;
        boolean z10;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog uqVar = new uq(n2Var, arrayList, j10, i70Var);
            if (n2Var.getParentActivity() != null) {
                n2Var.showDialog(uqVar);
                return;
            } else {
                uqVar.show();
                return;
            }
        }
        k70 k70Var = new k70(context, false);
        k70Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        k70Var.h = arrayList2;
        k70Var.B = i70Var;
        k70Var.s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        k70Var.b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) k70Var.h.get(i12);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        k70Var.w = peer2;
                        k70Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) k70Var.h.get(i13);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        k70Var.w = peer3;
                        k70Var.v = peer3;
                        break;
                    }
                    i13++;
                }
            } else {
                k70Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = k70Var.b;
            i11 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            k70Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        k70Var.fixNavigationBar(i11);
        if (k70Var.s == 0) {
            e70 e70Var = new e70(k70Var, context);
            e70Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context, null);
            nestedScrollView.addView(e70Var);
            k70Var.setCustomView(nestedScrollView);
            viewGroup = e70Var;
        } else {
            f70 f70Var = new f70(k70Var, context);
            k70Var.containerView = f70Var;
            f70Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = k70Var.containerView;
            int i14 = k70Var.backgroundPaddingLeft;
            viewGroup2.setPadding(i14, 0, i14, 0);
            viewGroup = f70Var;
        }
        TLRPC.Chat chat = MessagesController.getInstance(k70Var.currentAccount).getChat(Long.valueOf(-j10));
        g70 g70Var = new g70(k70Var, context);
        k70Var.d = g70Var;
        k70Var.getContext();
        g70Var.setLayoutManager(new f2.k0(k70Var.s == 0 ? 0 : 1, false));
        g70Var.setAdapter(new j70(k70Var, context));
        g70Var.setVerticalScrollBarEnabled(false);
        g70Var.setClipToPadding(false);
        g70Var.setEnabled(true);
        g70Var.setSelectorDrawableColor(0);
        g70Var.setGlowColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A5, false));
        g70Var.setOnScrollListener(new h70(k70Var));
        g70Var.setOnItemClickListener(new cg.x0(13, k70Var, chat));
        if (i10 != 0) {
            viewGroup.addView(g70Var, h7.z5.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            g70Var.setSelectorDrawableColor(0);
            g70Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            ri0 ri0Var = new ri0(context);
            ri0Var.setAutoRepeat(true);
            ri0Var.f(R.raw.utyan_schedule, 120, 120, null);
            ri0Var.d();
            viewGroup.addView(ri0Var, h7.z5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        k70Var.e = textView;
        org.telegram.messenger.rl.h(20.0f, 1, textView);
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
            viewGroup.addView(textView, h7.z5.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            viewGroup.addView(textView, h7.z5.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(k70Var.getContext());
        k70Var.f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = k70Var.h.size();
        for (int i15 = 0; i15 < size3; i15++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) k70Var.h.get(i15));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(k70Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        k70Var.f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        k70Var.f.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.k5, false));
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (k70Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                k70Var.d.setVisibility(8);
            }
            k70Var.f.setText(sb2);
            k70Var.f.setGravity(49);
            viewGroup.addView(k70Var.f, h7.z5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                k70Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                k70Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            k70Var.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(k70Var.f, h7.z5.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            viewGroup.addView(k70Var.d, h7.z5.t(k70Var.h.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        zz zzVar = new zz(k70Var, context, false);
        k70Var.c = zzVar;
        ((View) zzVar.c).setOnClickListener(new q2(27, k70Var, i70Var));
        if (k70Var.s == 0) {
            viewGroup.addView(zzVar, h7.z5.t(-1, 50, 51, 0, 0, 0, 0));
            zz zzVar2 = new zz(k70Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                zzVar2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                zzVar2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) zzVar2.c).setOnClickListener(new f0(k70Var, 29));
            viewGroup.addView(zzVar2, h7.z5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(zzVar, h7.z5.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        k70Var.x(chat, false);
        if (n2Var == null) {
            k70Var.show();
        } else if (n2Var.getParentActivity() != null) {
            n2Var.showDialog(k70Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.x;
        if (inputPeer != null) {
            this.B.a(inputPeer, this.h.size() > 1, this.y, false);
        }
    }

    public final void x(TLRPC.Chat chat, boolean z10) {
        zz zzVar = this.c;
        if (this.s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                zzVar.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                zzVar.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            zzVar.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            zzVar.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, chat2 != null ? chat2.title : ""), z10);
        }
    }
}
