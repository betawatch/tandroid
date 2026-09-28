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

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class j80 extends org.telegram.ui.ActionBar.e3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public h80 F;
    public Drawable b;
    public n00 c;
    public f80 d;
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

    public static /* synthetic */ void m(j80 j80Var, h80 h80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(j80Var.currentAccount).getInputPeer(MessageObject.getPeerId(j80Var.v));
        if (j80Var.s != 2) {
            j80Var.x = inputPeer;
        } else if (j80Var.v != j80Var.w) {
            h80Var.a(inputPeer, j80Var.h.size() > 1, false, false);
        }
        j80Var.dismiss();
    }

    public static /* synthetic */ void n(j80 j80Var) {
        j80Var.x = MessagesController.getInstance(j80Var.currentAccount).getInputPeer(MessageObject.getPeerId(j80Var.v));
        j80Var.y = true;
        j80Var.dismiss();
    }

    public static void o(j80 j80Var) {
        f80 f80Var = j80Var.d;
        if (j80Var.s == 0) {
            return;
        }
        if (f80Var.getChildCount() <= 0) {
            int paddingTop = f80Var.getPaddingTop();
            j80Var.r = paddingTop;
            f80Var.setTopGlowOffset(paddingTop);
            j80Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = f80Var.getChildAt(0);
        il0 il0Var = (il0) f80Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && il0Var != null && il0Var.b() == 0) {
            i10 = top;
        }
        if (j80Var.r != i10) {
            j80Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            j80Var.f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            j80Var.r = i10;
            f80Var.setTopGlowOffset(i10);
            j80Var.containerView.invalidate();
        }
    }

    public static void t(Activity activity, long j3, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 240000) {
            booleanCallback.run(G.size() == 1);
            return;
        }
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
        a2Var.setOnCancelListener(new c80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new org.telegram.messenger.ja(a2Var, j3, accountInstance, booleanCallback, 4)), 1));
        try {
            a2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j3, AccountInstance accountInstance, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer, h80 h80Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() != 1 || i10 == 0) {
                    v(context, j3, G, m2Var, i10, peer, h80Var);
                    return;
                } else {
                    h80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
            a2Var.setOnCancelListener(new c80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new b80(a2Var, accountInstance, h80Var, j3, context, m2Var, i10, peer)), 0));
            try {
                a2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer, h80 h80Var) {
        int i11;
        ViewGroup viewGroup;
        boolean z10;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog irVar = new ir(m2Var, arrayList, j3, h80Var);
            if (m2Var.getParentActivity() != null) {
                m2Var.showDialog(irVar);
                return;
            } else {
                irVar.show();
                return;
            }
        }
        j80 j80Var = new j80(context, false);
        j80Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        j80Var.h = arrayList2;
        j80Var.F = h80Var;
        j80Var.s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        j80Var.b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) j80Var.h.get(i12);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        j80Var.w = peer2;
                        j80Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) j80Var.h.get(i13);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        j80Var.w = peer3;
                        j80Var.v = peer3;
                        break;
                    }
                    i13++;
                }
            } else {
                j80Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = j80Var.b;
            i11 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            j80Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        j80Var.fixNavigationBar(i11);
        if (j80Var.s == 0) {
            d80 d80Var = new d80(j80Var, context);
            d80Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(d80Var);
            j80Var.setCustomView(nestedScrollView);
            viewGroup = d80Var;
        } else {
            e80 e80Var = new e80(j80Var, context);
            j80Var.containerView = e80Var;
            e80Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = j80Var.containerView;
            int i14 = j80Var.backgroundPaddingLeft;
            viewGroup2.setPadding(i14, 0, i14, 0);
            viewGroup = e80Var;
        }
        TLRPC.Chat chat = MessagesController.getInstance(j80Var.currentAccount).getChat(Long.valueOf(-j3));
        f80 f80Var = new f80(j80Var, context);
        j80Var.d = f80Var;
        j80Var.getContext();
        f80Var.setLayoutManager(new s4.c0(j80Var.s == 0 ? 0 : 1, false));
        f80Var.setAdapter(new i80(j80Var, context));
        f80Var.setVerticalScrollBarEnabled(false);
        f80Var.setClipToPadding(false);
        f80Var.setEnabled(true);
        f80Var.setSelectorDrawableColor(0);
        f80Var.setGlowColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.A5, false));
        f80Var.setOnScrollListener(new g80(j80Var));
        f80Var.setOnItemClickListener(new ai.n6(11, j80Var, chat));
        if (i10 != 0) {
            viewGroup.addView(f80Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            f80Var.setSelectorDrawableColor(0);
            f80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            nj0 nj0Var = new nj0(context);
            nj0Var.setAutoRepeat(true);
            nj0Var.f(R.raw.utyan_schedule, 120, 120, null);
            nj0Var.d();
            viewGroup.addView(nj0Var, w7.y5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        j80Var.e = textView;
        org.telegram.messenger.ok.k(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            viewGroup.addView(textView, w7.y5.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            viewGroup.addView(textView, w7.y5.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(j80Var.getContext());
        j80Var.f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = j80Var.h.size();
        for (int i15 = 0; i15 < size3; i15++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) j80Var.h.get(i15));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(j80Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        j80Var.f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        j80Var.f.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.k5, false));
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (j80Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                j80Var.d.setVisibility(8);
            }
            j80Var.f.setText(sb2);
            j80Var.f.setGravity(49);
            viewGroup.addView(j80Var.f, w7.y5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                j80Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                j80Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            j80Var.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(j80Var.f, w7.y5.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            viewGroup.addView(j80Var.d, w7.y5.t(j80Var.h.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        n00 n00Var = new n00(j80Var, context, false);
        j80Var.c = n00Var;
        ((View) n00Var.c).setOnClickListener(new ft(9, j80Var, h80Var));
        if (j80Var.s == 0) {
            viewGroup.addView(n00Var, w7.y5.t(-1, 50, 51, 0, 0, 0, 0));
            n00 n00Var2 = new n00(j80Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                n00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                n00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) n00Var2.c).setOnClickListener(new f0(j80Var, 29));
            viewGroup.addView(n00Var2, w7.y5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(n00Var, w7.y5.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        j80Var.w(chat, false);
        if (m2Var == null) {
            j80Var.show();
        } else if (m2Var.getParentActivity() != null) {
            m2Var.showDialog(j80Var);
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
            this.F.a(inputPeer, this.h.size() > 1, this.y, false);
        }
    }

    public final void w(TLRPC.Chat chat, boolean z10) {
        n00 n00Var = this.c;
        if (this.s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                n00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                n00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            n00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            n00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, chat2 != null ? chat2.title : ""), z10);
        }
    }
}
