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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class y70 extends org.telegram.ui.ActionBar.g3 {
    public static ArrayList D;
    public static long E;
    public static long F;
    public static int G;
    public boolean B;
    public w70 C;
    public Drawable b;
    public k00 c;
    public u70 d;
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

    public static /* synthetic */ void m(y70 y70Var, w70 w70Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(y70Var.currentAccount).getInputPeer(MessageObject.getPeerId(y70Var.v));
        if (y70Var.s != 2) {
            y70Var.x = inputPeer;
        } else if (y70Var.v != y70Var.w) {
            w70Var.a(inputPeer, y70Var.h.size() > 1, false, false);
        }
        y70Var.dismiss();
    }

    public static /* synthetic */ void n(y70 y70Var) {
        y70Var.x = MessagesController.getInstance(y70Var.currentAccount).getInputPeer(MessageObject.getPeerId(y70Var.v));
        y70Var.y = true;
        y70Var.dismiss();
    }

    public static void o(y70 y70Var) {
        u70 u70Var = y70Var.d;
        if (y70Var.s == 0) {
            return;
        }
        if (u70Var.getChildCount() <= 0) {
            int paddingTop = u70Var.getPaddingTop();
            y70Var.r = paddingTop;
            u70Var.setTopGlowOffset(paddingTop);
            y70Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = u70Var.getChildAt(0);
        el0 el0Var = (el0) u70Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && el0Var != null && el0Var.b() == 0) {
            i10 = top;
        }
        if (y70Var.r != i10) {
            y70Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            y70Var.f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            y70Var.r = i10;
            u70Var.setTopGlowOffset(i10);
            y70Var.containerView.invalidate();
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
        d2Var.setOnCancelListener(new q70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new lh.v(d2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            d2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer, w70 w70Var) {
        if (context != null) {
            if (G == accountInstance.getCurrentAccount() && F == j10 && D != null && SystemClock.elapsedRealtime() - E < 300000) {
                if (D.size() != 1 || i10 == 0) {
                    v(context, j10, D, p2Var, i10, peer, w70Var);
                    return;
                } else {
                    w70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) D.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            d2Var.setOnCancelListener(new q70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new p70(d2Var, accountInstance, w70Var, j10, context, p2Var, i10, peer)), 0));
            try {
                d2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer, w70 w70Var) {
        int i11;
        ViewGroup viewGroup;
        boolean z4;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog erVar = new er(p2Var, arrayList, j10, w70Var);
            if (p2Var.getParentActivity() != null) {
                p2Var.showDialog(erVar);
                return;
            } else {
                erVar.show();
                return;
            }
        }
        y70 y70Var = new y70(context, false);
        y70Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        y70Var.h = arrayList2;
        y70Var.C = w70Var;
        y70Var.s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        y70Var.b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) y70Var.h.get(i12);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        y70Var.w = peer2;
                        y70Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) y70Var.h.get(i13);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        y70Var.w = peer3;
                        y70Var.v = peer3;
                        break;
                    }
                    i13++;
                }
            } else {
                y70Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = y70Var.b;
            i11 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            y70Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        y70Var.fixNavigationBar(i11);
        if (y70Var.s == 0) {
            s70 s70Var = new s70(y70Var, context);
            s70Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(s70Var);
            y70Var.setCustomView(nestedScrollView);
            viewGroup = s70Var;
        } else {
            t70 t70Var = new t70(y70Var, context);
            y70Var.containerView = t70Var;
            t70Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = y70Var.containerView;
            int i14 = y70Var.backgroundPaddingLeft;
            viewGroup2.setPadding(i14, 0, i14, 0);
            viewGroup = t70Var;
        }
        TLRPC.Chat chat = MessagesController.getInstance(y70Var.currentAccount).getChat(Long.valueOf(-j10));
        u70 u70Var = new u70(y70Var, context);
        y70Var.d = u70Var;
        y70Var.getContext();
        u70Var.setLayoutManager(new f2.i0(y70Var.s == 0 ? 0 : 1, false));
        u70Var.setAdapter(new x70(y70Var, context));
        u70Var.setVerticalScrollBarEnabled(false);
        u70Var.setClipToPadding(false);
        u70Var.setEnabled(true);
        u70Var.setSelectorDrawableColor(0);
        u70Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        u70Var.setOnScrollListener(new v70(y70Var));
        u70Var.setOnItemClickListener(new gg.v0(12, y70Var, chat));
        if (i10 != 0) {
            viewGroup.addView(u70Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            u70Var.setSelectorDrawableColor(0);
            u70Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            jj0 jj0Var = new jj0(context);
            jj0Var.setAutoRepeat(true);
            jj0Var.f(R.raw.utyan_schedule, 120, 120, null);
            jj0Var.d();
            viewGroup.addView(jj0Var, k7.b6.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        y70Var.e = textView;
        org.telegram.ui.b.g(20.0f, 1, textView);
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
            viewGroup.addView(textView, k7.b6.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            viewGroup.addView(textView, k7.b6.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(y70Var.getContext());
        y70Var.f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = y70Var.h.size();
        for (int i15 = 0; i15 < size3; i15++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) y70Var.h.get(i15));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(y70Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        y70Var.f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        y70Var.f.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k5, false));
        if (i10 == 0) {
            StringBuilder sb = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (y70Var.h.size() > 1) {
                sb.append("\n\n");
                sb.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                y70Var.d.setVisibility(8);
            }
            y70Var.f.setText(sb);
            y70Var.f.setGravity(49);
            viewGroup.addView(y70Var.f, k7.b6.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z4) {
                y70Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                y70Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            y70Var.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(y70Var.f, k7.b6.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            viewGroup.addView(y70Var.d, k7.b6.t(y70Var.h.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        k00 k00Var = new k00(y70Var, context, false);
        y70Var.c = k00Var;
        ((View) k00Var.c).setOnClickListener(new w2(24, y70Var, w70Var));
        if (y70Var.s == 0) {
            viewGroup.addView(k00Var, k7.b6.t(-1, 50, 51, 0, 0, 0, 0));
            k00 k00Var2 = new k00(y70Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                k00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                k00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) k00Var2.c).setOnClickListener(new g0(y70Var, 29));
            viewGroup.addView(k00Var2, k7.b6.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(k00Var, k7.b6.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        y70Var.w(chat, false);
        if (p2Var == null) {
            y70Var.show();
        } else if (p2Var.getParentActivity() != null) {
            p2Var.showDialog(y70Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        super.dismissInternal();
        TLRPC.InputPeer inputPeer = this.x;
        if (inputPeer != null) {
            this.C.a(inputPeer, this.h.size() > 1, this.y, false);
        }
    }

    public final void w(TLRPC.Chat chat, boolean z4) {
        k00 k00Var = this.c;
        if (this.s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                k00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z4);
                return;
            } else {
                k00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z4);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            k00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z4);
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            k00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, chat2 != null ? chat2.title : ""), z4);
        }
    }
}
