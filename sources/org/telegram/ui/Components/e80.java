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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class e80 extends org.telegram.ui.ActionBar.f3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public c80 F;
    public Drawable b;
    public l00 c;
    public a80 d;
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

    public static /* synthetic */ void m(e80 e80Var, c80 c80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(e80Var.currentAccount).getInputPeer(MessageObject.getPeerId(e80Var.v));
        if (e80Var.s != 2) {
            e80Var.x = inputPeer;
        } else if (e80Var.v != e80Var.w) {
            c80Var.a(inputPeer, e80Var.h.size() > 1, false, false);
        }
        e80Var.dismiss();
    }

    public static /* synthetic */ void n(e80 e80Var) {
        e80Var.x = MessagesController.getInstance(e80Var.currentAccount).getInputPeer(MessageObject.getPeerId(e80Var.v));
        e80Var.y = true;
        e80Var.dismiss();
    }

    public static void o(e80 e80Var) {
        a80 a80Var = e80Var.d;
        if (e80Var.s == 0) {
            return;
        }
        if (a80Var.getChildCount() <= 0) {
            int paddingTop = a80Var.getPaddingTop();
            e80Var.r = paddingTop;
            a80Var.setTopGlowOffset(paddingTop);
            e80Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = a80Var.getChildAt(0);
        fl0 fl0Var = (fl0) a80Var.H(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && fl0Var != null && fl0Var.b() == 0) {
            i10 = top;
        }
        if (e80Var.r != i10) {
            e80Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            e80Var.f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            e80Var.r = i10;
            a80Var.setTopGlowOffset(i10);
            e80Var.containerView.invalidate();
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
        b2Var.setOnCancelListener(new x70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new org.telegram.messenger.ja(b2Var, j3, accountInstance, booleanCallback, 4)), 1));
        try {
            b2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j3, AccountInstance accountInstance, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, c80 c80Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() != 1 || i10 == 0) {
                    v(context, j3, G, n2Var, i10, peer, c80Var);
                    return;
                } else {
                    c80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
            b2Var.setOnCancelListener(new x70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new w70(b2Var, accountInstance, c80Var, j3, context, n2Var, i10, peer)), 0));
            try {
                b2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, c80 c80Var) {
        int i11;
        ViewGroup viewGroup;
        boolean z10;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog grVar = new gr(n2Var, arrayList, j3, c80Var);
            if (n2Var.getParentActivity() != null) {
                n2Var.showDialog(grVar);
                return;
            } else {
                grVar.show();
                return;
            }
        }
        e80 e80Var = new e80(context, false);
        e80Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        e80Var.h = arrayList2;
        e80Var.F = c80Var;
        e80Var.s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        e80Var.b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) e80Var.h.get(i12);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        e80Var.w = peer2;
                        e80Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) e80Var.h.get(i13);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        e80Var.w = peer3;
                        e80Var.v = peer3;
                        break;
                    }
                    i13++;
                }
            } else {
                e80Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = e80Var.b;
            i11 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            e80Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        e80Var.fixNavigationBar(i11);
        if (e80Var.s == 0) {
            y70 y70Var = new y70(e80Var, context);
            y70Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(y70Var);
            e80Var.setCustomView(nestedScrollView);
            viewGroup = y70Var;
        } else {
            z70 z70Var = new z70(e80Var, context);
            e80Var.containerView = z70Var;
            z70Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = e80Var.containerView;
            int i14 = e80Var.backgroundPaddingLeft;
            viewGroup2.setPadding(i14, 0, i14, 0);
            viewGroup = z70Var;
        }
        TLRPC.Chat chat = MessagesController.getInstance(e80Var.currentAccount).getChat(Long.valueOf(-j3));
        a80 a80Var = new a80(e80Var, context);
        e80Var.d = a80Var;
        e80Var.getContext();
        a80Var.setLayoutManager(new s4.c0(e80Var.s == 0 ? 0 : 1, false));
        a80Var.setAdapter(new d80(e80Var, context));
        a80Var.setVerticalScrollBarEnabled(false);
        a80Var.setClipToPadding(false);
        a80Var.setEnabled(true);
        a80Var.setSelectorDrawableColor(0);
        a80Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        a80Var.setOnScrollListener(new b80(e80Var));
        a80Var.setOnItemClickListener(new ai.o6(11, e80Var, chat));
        if (i10 != 0) {
            viewGroup.addView(a80Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            a80Var.setSelectorDrawableColor(0);
            a80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            kj0 kj0Var = new kj0(context);
            kj0Var.setAutoRepeat(true);
            kj0Var.f(R.raw.utyan_schedule, 120, 120, null);
            kj0Var.d();
            viewGroup.addView(kj0Var, w7.y5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        e80Var.e = textView;
        org.telegram.messenger.rk.k(20.0f, 1, textView);
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
        TextView textView2 = new TextView(e80Var.getContext());
        e80Var.f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = e80Var.h.size();
        for (int i15 = 0; i15 < size3; i15++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) e80Var.h.get(i15));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(e80Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        e80Var.f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        e80Var.f.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k5, false));
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (e80Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                e80Var.d.setVisibility(8);
            }
            e80Var.f.setText(sb2);
            e80Var.f.setGravity(49);
            viewGroup.addView(e80Var.f, w7.y5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                e80Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                e80Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            e80Var.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(e80Var.f, w7.y5.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            viewGroup.addView(e80Var.d, w7.y5.t(e80Var.h.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        l00 l00Var = new l00(e80Var, context, false);
        e80Var.c = l00Var;
        ((View) l00Var.c).setOnClickListener(new dt(9, e80Var, c80Var));
        if (e80Var.s == 0) {
            viewGroup.addView(l00Var, w7.y5.t(-1, 50, 51, 0, 0, 0, 0));
            l00 l00Var2 = new l00(e80Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                l00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                l00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) l00Var2.c).setOnClickListener(new f0(e80Var, 29));
            viewGroup.addView(l00Var2, w7.y5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(l00Var, w7.y5.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        e80Var.w(chat, false);
        if (n2Var == null) {
            e80Var.show();
        } else if (n2Var.getParentActivity() != null) {
            n2Var.showDialog(e80Var);
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
