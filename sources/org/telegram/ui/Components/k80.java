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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class k80 extends org.telegram.ui.ActionBar.f3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public i80 F;
    public Drawable b;
    public o00 c;
    public g80 d;
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

    public static /* synthetic */ void m(k80 k80Var, i80 i80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(k80Var.currentAccount).getInputPeer(MessageObject.getPeerId(k80Var.v));
        if (k80Var.s != 2) {
            k80Var.x = inputPeer;
        } else if (k80Var.v != k80Var.w) {
            i80Var.a(inputPeer, k80Var.h.size() > 1, false, false);
        }
        k80Var.dismiss();
    }

    public static /* synthetic */ void n(k80 k80Var) {
        k80Var.x = MessagesController.getInstance(k80Var.currentAccount).getInputPeer(MessageObject.getPeerId(k80Var.v));
        k80Var.y = true;
        k80Var.dismiss();
    }

    public static void o(k80 k80Var) {
        g80 g80Var = k80Var.d;
        if (k80Var.s == 0) {
            return;
        }
        if (g80Var.getChildCount() <= 0) {
            int paddingTop = g80Var.getPaddingTop();
            k80Var.r = paddingTop;
            g80Var.setTopGlowOffset(paddingTop);
            k80Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = g80Var.getChildAt(0);
        il0 il0Var = (il0) g80Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && il0Var != null && il0Var.b() == 0) {
            i10 = top;
        }
        if (k80Var.r != i10) {
            k80Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            k80Var.f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            k80Var.r = i10;
            g80Var.setTopGlowOffset(i10);
            k80Var.containerView.invalidate();
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
        b2Var.setOnCancelListener(new d80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new org.telegram.messenger.ja(b2Var, j3, accountInstance, booleanCallback, 4)), 1));
        try {
            b2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j3, AccountInstance accountInstance, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, i80 i80Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() != 1 || i10 == 0) {
                    v(context, j3, G, n2Var, i10, peer, i80Var);
                    return;
                } else {
                    i80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
            b2Var.setOnCancelListener(new d80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new c80(b2Var, accountInstance, i80Var, j3, context, n2Var, i10, peer)), 0));
            try {
                b2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, i80 i80Var) {
        int i11;
        ViewGroup viewGroup;
        boolean z10;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog jrVar = new jr(n2Var, arrayList, j3, i80Var);
            if (n2Var.getParentActivity() != null) {
                n2Var.showDialog(jrVar);
                return;
            } else {
                jrVar.show();
                return;
            }
        }
        k80 k80Var = new k80(context, false);
        k80Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        k80Var.h = arrayList2;
        k80Var.F = i80Var;
        k80Var.s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        k80Var.b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) k80Var.h.get(i12);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        k80Var.w = peer2;
                        k80Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) k80Var.h.get(i13);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        k80Var.w = peer3;
                        k80Var.v = peer3;
                        break;
                    }
                    i13++;
                }
            } else {
                k80Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = k80Var.b;
            i11 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            k80Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        k80Var.fixNavigationBar(i11);
        if (k80Var.s == 0) {
            e80 e80Var = new e80(k80Var, context);
            e80Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(e80Var);
            k80Var.setCustomView(nestedScrollView);
            viewGroup = e80Var;
        } else {
            f80 f80Var = new f80(k80Var, context);
            k80Var.containerView = f80Var;
            f80Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = k80Var.containerView;
            int i14 = k80Var.backgroundPaddingLeft;
            viewGroup2.setPadding(i14, 0, i14, 0);
            viewGroup = f80Var;
        }
        TLRPC.Chat chat = MessagesController.getInstance(k80Var.currentAccount).getChat(Long.valueOf(-j3));
        g80 g80Var = new g80(k80Var, context);
        k80Var.d = g80Var;
        k80Var.getContext();
        g80Var.setLayoutManager(new s4.c0(k80Var.s == 0 ? 0 : 1, false));
        g80Var.setAdapter(new j80(k80Var, context));
        g80Var.setVerticalScrollBarEnabled(false);
        g80Var.setClipToPadding(false);
        g80Var.setEnabled(true);
        g80Var.setSelectorDrawableColor(0);
        g80Var.setGlowColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.A5, false));
        g80Var.setOnScrollListener(new h80(k80Var));
        g80Var.setOnItemClickListener(new ai.n6(11, k80Var, chat));
        if (i10 != 0) {
            viewGroup.addView(g80Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            g80Var.setSelectorDrawableColor(0);
            g80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            nj0 nj0Var = new nj0(context);
            nj0Var.setAutoRepeat(true);
            nj0Var.f(R.raw.utyan_schedule, 120, 120, null);
            nj0Var.d();
            viewGroup.addView(nj0Var, w7.z5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        k80Var.e = textView;
        org.telegram.messenger.bi.j(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.j5, false));
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.StartVoipChannelTitle));
            } else {
                textView.setText(LocaleController.getString(R.string.StartVoipChatTitle));
            }
            viewGroup.addView(textView, w7.z5.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i10 == 2) {
                textView.setText(LocaleController.getString(R.string.VoipGroupDisplayAs));
            } else if (ChatObject.isChannelOrGiga(chat)) {
                textView.setText(LocaleController.getString(R.string.VoipChannelJoinAs));
            } else {
                textView.setText(LocaleController.getString(R.string.VoipGroupJoinAs));
            }
            viewGroup.addView(textView, w7.z5.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(k80Var.getContext());
        k80Var.f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = k80Var.h.size();
        for (int i15 = 0; i15 < size3; i15++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) k80Var.h.get(i15));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(k80Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        k80Var.f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        k80Var.f.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.k5, false));
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (k80Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                k80Var.d.setVisibility(8);
            }
            k80Var.f.setText(sb2);
            k80Var.f.setGravity(49);
            viewGroup.addView(k80Var.f, w7.z5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                k80Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                k80Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            k80Var.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(k80Var.f, w7.z5.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            viewGroup.addView(k80Var.d, w7.z5.t(k80Var.h.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        o00 o00Var = new o00(k80Var, context, false);
        k80Var.c = o00Var;
        ((View) o00Var.c).setOnClickListener(new gt(9, k80Var, i80Var));
        if (k80Var.s == 0) {
            viewGroup.addView(o00Var, w7.z5.t(-1, 50, 51, 0, 0, 0, 0));
            o00 o00Var2 = new o00(k80Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                o00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                o00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) o00Var2.c).setOnClickListener(new f0(k80Var, 29));
            viewGroup.addView(o00Var2, w7.z5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(o00Var, w7.z5.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        k80Var.w(chat, false);
        if (n2Var == null) {
            k80Var.show();
        } else if (n2Var.getParentActivity() != null) {
            n2Var.showDialog(k80Var);
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
        o00 o00Var = this.c;
        if (this.s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                o00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                o00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            o00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            o00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, chat2 != null ? chat2.title : ""), z10);
        }
    }
}
