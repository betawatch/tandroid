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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class w80 extends org.telegram.ui.ActionBar.e3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public u80 F;
    public Drawable b;
    public x00 c;
    public s80 d;
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

    public static /* synthetic */ void n(w80 w80Var, u80 u80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(w80Var.currentAccount).getInputPeer(MessageObject.getPeerId(w80Var.v));
        if (w80Var.s != 2) {
            w80Var.x = inputPeer;
        } else if (w80Var.v != w80Var.w) {
            u80Var.a(inputPeer, w80Var.h.size() > 1, false, false);
        }
        w80Var.dismiss();
    }

    public static /* synthetic */ void o(w80 w80Var) {
        w80Var.x = MessagesController.getInstance(w80Var.currentAccount).getInputPeer(MessageObject.getPeerId(w80Var.v));
        w80Var.y = true;
        w80Var.dismiss();
    }

    public static void q(w80 w80Var) {
        s80 s80Var = w80Var.d;
        if (w80Var.s == 0) {
            return;
        }
        if (s80Var.getChildCount() <= 0) {
            int paddingTop = s80Var.getPaddingTop();
            w80Var.r = paddingTop;
            s80Var.setTopGlowOffset(paddingTop);
            w80Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = s80Var.getChildAt(0);
        wl0 wl0Var = (wl0) s80Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && wl0Var != null && wl0Var.b() == 0) {
            i10 = top;
        }
        if (w80Var.r != i10) {
            w80Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            w80Var.f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            w80Var.r = i10;
            s80Var.setTopGlowOffset(i10);
            w80Var.containerView.invalidate();
        }
    }

    public static void v(Activity activity, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (J == accountInstance.getCurrentAccount() && I == j10 && G != null && SystemClock.elapsedRealtime() - H < 240000) {
            booleanCallback.run(G.size() == 1);
            return;
        }
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
        a2Var.setOnCancelListener(new o80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new p80(a2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            a2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void w(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer, u80 u80Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j10 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() != 1 || i10 == 0) {
                    x(context, j10, G, m2Var, i10, peer, u80Var);
                    return;
                } else {
                    u80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            a2Var.setOnCancelListener(new o80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new n80(a2Var, accountInstance, u80Var, j10, context, m2Var, i10, peer)), 0));
            try {
                a2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void x(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer, u80 u80Var) {
        int i11;
        ViewGroup viewGroup;
        boolean z10;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog urVar = new ur(m2Var, arrayList, j10, u80Var);
            if (m2Var.getParentActivity() != null) {
                m2Var.showDialog(urVar);
                return;
            } else {
                urVar.show();
                return;
            }
        }
        w80 w80Var = new w80(context, false);
        w80Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        w80Var.h = arrayList2;
        w80Var.F = u80Var;
        w80Var.s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        w80Var.b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) w80Var.h.get(i12);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        w80Var.w = peer2;
                        w80Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) w80Var.h.get(i13);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        w80Var.w = peer3;
                        w80Var.v = peer3;
                        break;
                    }
                    i13++;
                }
            } else {
                w80Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = w80Var.b;
            i11 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            w80Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = x02;
        }
        w80Var.fixNavigationBar(i11);
        if (w80Var.s == 0) {
            q80 q80Var = new q80(w80Var, context);
            q80Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(q80Var);
            w80Var.setCustomView(nestedScrollView);
            viewGroup = q80Var;
        } else {
            r80 r80Var = new r80(w80Var, context);
            w80Var.containerView = r80Var;
            r80Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = w80Var.containerView;
            int i14 = w80Var.backgroundPaddingLeft;
            viewGroup2.setPadding(i14, 0, i14, 0);
            viewGroup = r80Var;
        }
        TLRPC.Chat chat = MessagesController.getInstance(w80Var.currentAccount).getChat(Long.valueOf(-j10));
        s80 s80Var = new s80(w80Var, context);
        w80Var.d = s80Var;
        w80Var.getContext();
        s80Var.setLayoutManager(new s4.b0(w80Var.s == 0 ? 0 : 1, false));
        s80Var.setAdapter(new v80(w80Var, context));
        s80Var.setVerticalScrollBarEnabled(false);
        s80Var.setClipToPadding(false);
        s80Var.setEnabled(true);
        s80Var.setSelectorDrawableColor(0);
        s80Var.setGlowColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.A5, false));
        s80Var.setOnScrollListener(new t80(w80Var));
        s80Var.setOnItemClickListener(new bi.z5(11, w80Var, chat));
        if (i10 != 0) {
            viewGroup.addView(s80Var, w7.a6.a(-1.0f, 0.0f, 100.0f, 0.0f, 80.0f, -1, 51));
        } else {
            s80Var.setSelectorDrawableColor(0);
            s80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            bk0 bk0Var = new bk0(context);
            bk0Var.setAutoRepeat(true);
            bk0Var.f(R.raw.utyan_schedule, 120, 120, null);
            bk0Var.d();
            viewGroup.addView(bk0Var, w7.a6.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        w80Var.e = textView;
        org.telegram.messenger.yh.k(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            viewGroup.addView(textView, w7.a6.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            viewGroup.addView(textView, w7.a6.a(-2.0f, 23.0f, 8.0f, 23.0f, 0.0f, -2, 51));
        }
        TextView textView2 = new TextView(w80Var.getContext());
        w80Var.f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = w80Var.h.size();
        for (int i15 = 0; i15 < size3; i15++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) w80Var.h.get(i15));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(w80Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        w80Var.f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        w80Var.f.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.k5, false));
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (w80Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                w80Var.d.setVisibility(8);
            }
            w80Var.f.setText(sb2);
            w80Var.f.setGravity(49);
            viewGroup.addView(w80Var.f, w7.a6.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                w80Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                w80Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            w80Var.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(w80Var.f, w7.a6.a(-2.0f, 23.0f, 0.0f, 23.0f, 5.0f, -2, 51));
        }
        if (i10 == 0) {
            viewGroup.addView(w80Var.d, w7.a6.t(w80Var.h.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        x00 x00Var = new x00(w80Var, context, false);
        w80Var.c = x00Var;
        ((View) x00Var.c).setOnClickListener(new rt(9, w80Var, u80Var));
        if (w80Var.s == 0) {
            viewGroup.addView(x00Var, w7.a6.t(-1, 50, 51, 0, 0, 0, 0));
            x00 x00Var2 = new x00(w80Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                x00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                x00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) x00Var2.c).setOnClickListener(new f0(w80Var, 28));
            viewGroup.addView(x00Var2, w7.a6.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(x00Var, w7.a6.a(50.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
        }
        w80Var.y(chat, false);
        if (m2Var == null) {
            w80Var.show();
        } else if (m2Var.getParentActivity() != null) {
            m2Var.showDialog(w80Var);
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

    public final void y(TLRPC.Chat chat, boolean z10) {
        x00 x00Var = this.c;
        if (this.s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                x00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                x00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            x00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            x00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, chat2 != null ? chat2.title : ""), z10);
        }
    }
}
