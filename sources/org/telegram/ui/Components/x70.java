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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class x70 extends org.telegram.ui.ActionBar.f3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public v70 F;
    public Drawable b;
    public m00 c;
    public t70 d;
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

    public static /* synthetic */ void m(x70 x70Var, v70 v70Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(x70Var.currentAccount).getInputPeer(MessageObject.getPeerId(x70Var.v));
        if (x70Var.s != 2) {
            x70Var.x = inputPeer;
        } else if (x70Var.v != x70Var.w) {
            v70Var.a(inputPeer, x70Var.h.size() > 1, false, false);
        }
        x70Var.dismiss();
    }

    public static /* synthetic */ void n(x70 x70Var) {
        x70Var.x = MessagesController.getInstance(x70Var.currentAccount).getInputPeer(MessageObject.getPeerId(x70Var.v));
        x70Var.y = true;
        x70Var.dismiss();
    }

    public static void o(x70 x70Var) {
        t70 t70Var = x70Var.d;
        if (x70Var.s == 0) {
            return;
        }
        if (t70Var.getChildCount() <= 0) {
            int paddingTop = t70Var.getPaddingTop();
            x70Var.r = paddingTop;
            t70Var.setTopGlowOffset(paddingTop);
            x70Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = t70Var.getChildAt(0);
        wk0 wk0Var = (wk0) t70Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && wk0Var != null && wk0Var.b() == 0) {
            i10 = top;
        }
        if (x70Var.r != i10) {
            x70Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            x70Var.f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            x70Var.r = i10;
            t70Var.setTopGlowOffset(i10);
            x70Var.containerView.invalidate();
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
        b2Var.setOnCancelListener(new q70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new org.telegram.messenger.ja(b2Var, j3, accountInstance, booleanCallback, 4)), 1));
        try {
            b2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j3, AccountInstance accountInstance, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, v70 v70Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() != 1 || i10 == 0) {
                    v(context, j3, G, n2Var, i10, peer, v70Var);
                    return;
                } else {
                    v70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
            b2Var.setOnCancelListener(new q70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new p70(b2Var, accountInstance, v70Var, j3, context, n2Var, i10, peer)), 0));
            try {
                b2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, v70 v70Var) {
        int i11;
        ViewGroup viewGroup;
        boolean z10;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog hrVar = new hr(n2Var, arrayList, j3, v70Var);
            if (n2Var.getParentActivity() != null) {
                n2Var.showDialog(hrVar);
                return;
            } else {
                hrVar.show();
                return;
            }
        }
        x70 x70Var = new x70(context, false);
        x70Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        x70Var.h = arrayList2;
        x70Var.F = v70Var;
        x70Var.s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        x70Var.b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) x70Var.h.get(i12);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        x70Var.w = peer2;
                        x70Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) x70Var.h.get(i13);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        x70Var.w = peer3;
                        x70Var.v = peer3;
                        break;
                    }
                    i13++;
                }
            } else {
                x70Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = x70Var.b;
            i11 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            x70Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        x70Var.fixNavigationBar(i11);
        if (x70Var.s == 0) {
            r70 r70Var = new r70(x70Var, context);
            r70Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(r70Var);
            x70Var.setCustomView(nestedScrollView);
            viewGroup = r70Var;
        } else {
            s70 s70Var = new s70(x70Var, context);
            x70Var.containerView = s70Var;
            s70Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = x70Var.containerView;
            int i14 = x70Var.backgroundPaddingLeft;
            viewGroup2.setPadding(i14, 0, i14, 0);
            viewGroup = s70Var;
        }
        TLRPC.Chat chat = MessagesController.getInstance(x70Var.currentAccount).getChat(Long.valueOf(-j3));
        t70 t70Var = new t70(x70Var, context);
        x70Var.d = t70Var;
        x70Var.getContext();
        t70Var.setLayoutManager(new s4.c0(x70Var.s == 0 ? 0 : 1, false));
        t70Var.setAdapter(new w70(x70Var, context));
        t70Var.setVerticalScrollBarEnabled(false);
        t70Var.setClipToPadding(false);
        t70Var.setEnabled(true);
        t70Var.setSelectorDrawableColor(0);
        t70Var.setGlowColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.A5, false));
        t70Var.setOnScrollListener(new u70(x70Var));
        t70Var.setOnItemClickListener(new ai.n6(11, x70Var, chat));
        if (i10 != 0) {
            viewGroup.addView(t70Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            t70Var.setSelectorDrawableColor(0);
            t70Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            bj0 bj0Var = new bj0(context);
            bj0Var.setAutoRepeat(true);
            bj0Var.f(R.raw.utyan_schedule, 120, 120, null);
            bj0Var.d();
            viewGroup.addView(bj0Var, w7.x5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        x70Var.e = textView;
        org.telegram.messenger.ul.k(20.0f, 1, textView);
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
        TextView textView2 = new TextView(x70Var.getContext());
        x70Var.f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = x70Var.h.size();
        for (int i15 = 0; i15 < size3; i15++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) x70Var.h.get(i15));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(x70Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        x70Var.f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        x70Var.f.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.k5, false));
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (x70Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                x70Var.d.setVisibility(8);
            }
            x70Var.f.setText(sb2);
            x70Var.f.setGravity(49);
            viewGroup.addView(x70Var.f, w7.x5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                x70Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                x70Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            x70Var.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(x70Var.f, w7.x5.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            viewGroup.addView(x70Var.d, w7.x5.t(x70Var.h.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        m00 m00Var = new m00(x70Var, context, false);
        x70Var.c = m00Var;
        ((View) m00Var.c).setOnClickListener(new et(9, x70Var, v70Var));
        if (x70Var.s == 0) {
            viewGroup.addView(m00Var, w7.x5.t(-1, 50, 51, 0, 0, 0, 0));
            m00 m00Var2 = new m00(x70Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                m00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                m00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) m00Var2.c).setOnClickListener(new f0(x70Var, 29));
            viewGroup.addView(m00Var2, w7.x5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(m00Var, w7.x5.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        x70Var.w(chat, false);
        if (n2Var == null) {
            x70Var.show();
        } else if (n2Var.getParentActivity() != null) {
            n2Var.showDialog(x70Var);
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
        m00 m00Var = this.c;
        if (this.s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                m00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                m00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            m00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            m00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, chat2 != null ? chat2.title : ""), z10);
        }
    }
}
