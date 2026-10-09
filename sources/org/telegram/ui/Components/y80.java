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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class y80 extends org.telegram.ui.ActionBar.f3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public w80 F;
    public Drawable b;
    public b10 c;
    public u80 d;
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

    public static /* synthetic */ void o(y80 y80Var, w80 w80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(y80Var.currentAccount).getInputPeer(MessageObject.getPeerId(y80Var.v));
        if (y80Var.s != 2) {
            y80Var.x = inputPeer;
        } else if (y80Var.v != y80Var.w) {
            w80Var.a(inputPeer, y80Var.h.size() > 1, false, false);
        }
        y80Var.dismiss();
    }

    public static /* synthetic */ void p(y80 y80Var) {
        y80Var.x = MessagesController.getInstance(y80Var.currentAccount).getInputPeer(MessageObject.getPeerId(y80Var.v));
        y80Var.y = true;
        y80Var.dismiss();
    }

    public static void q(y80 y80Var) {
        u80 u80Var = y80Var.d;
        if (y80Var.s == 0) {
            return;
        }
        if (u80Var.getChildCount() <= 0) {
            int paddingTop = u80Var.getPaddingTop();
            y80Var.r = paddingTop;
            u80Var.setTopGlowOffset(paddingTop);
            y80Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = u80Var.getChildAt(0);
        am0 am0Var = (am0) u80Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && am0Var != null && am0Var.b() == 0) {
            i10 = top;
        }
        if (y80Var.r != i10) {
            y80Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            y80Var.f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            y80Var.r = i10;
            u80Var.setTopGlowOffset(i10);
            y80Var.containerView.invalidate();
        }
    }

    public static void v(Activity activity, long j3, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 240000) {
            booleanCallback.run(G.size() == 1);
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
        b2Var.setOnCancelListener(new r80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new org.telegram.messenger.ma(b2Var, j3, accountInstance, booleanCallback, 4)), 1));
        try {
            b2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void w(Context context, long j3, AccountInstance accountInstance, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, w80 w80Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j3 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() != 1 || i10 == 0) {
                    x(context, j3, G, n2Var, i10, peer, w80Var);
                    return;
                } else {
                    w80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j3);
            b2Var.setOnCancelListener(new r80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new q80(b2Var, accountInstance, w80Var, j3, context, n2Var, i10, peer)), 0));
            try {
                b2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void x(Context context, long j3, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, w80 w80Var) {
        int i11;
        ViewGroup viewGroup;
        boolean z10;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog wrVar = new wr(n2Var, arrayList, j3, w80Var);
            if (n2Var.getParentActivity() != null) {
                n2Var.showDialog(wrVar);
                return;
            } else {
                wrVar.show();
                return;
            }
        }
        y80 y80Var = new y80(context, false);
        y80Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        y80Var.h = arrayList2;
        y80Var.F = w80Var;
        y80Var.s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        y80Var.b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) y80Var.h.get(i12);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        y80Var.w = peer2;
                        y80Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) y80Var.h.get(i13);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        y80Var.w = peer3;
                        y80Var.v = peer3;
                        break;
                    }
                    i13++;
                }
            } else {
                y80Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = y80Var.b;
            i11 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            y80Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = x02;
        }
        y80Var.fixNavigationBar(i11);
        if (y80Var.s == 0) {
            s80 s80Var = new s80(y80Var, context);
            s80Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(s80Var);
            y80Var.setCustomView(nestedScrollView);
            viewGroup = s80Var;
        } else {
            t80 t80Var = new t80(y80Var, context);
            y80Var.containerView = t80Var;
            t80Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = y80Var.containerView;
            int i14 = y80Var.backgroundPaddingLeft;
            viewGroup2.setPadding(i14, 0, i14, 0);
            viewGroup = t80Var;
        }
        TLRPC.Chat chat = MessagesController.getInstance(y80Var.currentAccount).getChat(Long.valueOf(-j3));
        u80 u80Var = new u80(y80Var, context);
        y80Var.d = u80Var;
        y80Var.getContext();
        u80Var.setLayoutManager(new s4.d0(y80Var.s == 0 ? 0 : 1, false));
        u80Var.setAdapter(new x80(y80Var, context));
        u80Var.setVerticalScrollBarEnabled(false);
        u80Var.setClipToPadding(false);
        u80Var.setEnabled(true);
        u80Var.setSelectorDrawableColor(0);
        u80Var.setGlowColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.A5, false));
        u80Var.setOnScrollListener(new v80(y80Var));
        u80Var.setOnItemClickListener(new ai.o6(11, y80Var, chat));
        if (i10 != 0) {
            viewGroup.addView(u80Var, w7.x5.a(-1.0f, 0.0f, 100.0f, 0.0f, 80.0f, -1, 51));
        } else {
            u80Var.setSelectorDrawableColor(0);
            u80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            fk0 fk0Var = new fk0(context);
            fk0Var.setAutoRepeat(true);
            fk0Var.f(R.raw.utyan_schedule, 120, 120, null);
            fk0Var.d();
            viewGroup.addView(fk0Var, w7.x5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        y80Var.e = textView;
        org.telegram.messenger.bi.k(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.j5, false));
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
            viewGroup.addView(textView, w7.x5.a(-2.0f, 23.0f, 8.0f, 23.0f, 0.0f, -2, 51));
        }
        TextView textView2 = new TextView(y80Var.getContext());
        y80Var.f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = y80Var.h.size();
        for (int i15 = 0; i15 < size3; i15++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) y80Var.h.get(i15));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(y80Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        y80Var.f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        y80Var.f.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.k5, false));
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (y80Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                y80Var.d.setVisibility(8);
            }
            y80Var.f.setText(sb2);
            y80Var.f.setGravity(49);
            viewGroup.addView(y80Var.f, w7.x5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                y80Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                y80Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            y80Var.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(y80Var.f, w7.x5.a(-2.0f, 23.0f, 0.0f, 23.0f, 5.0f, -2, 51));
        }
        if (i10 == 0) {
            viewGroup.addView(y80Var.d, w7.x5.t(y80Var.h.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        b10 b10Var = new b10(y80Var, context, false);
        y80Var.c = b10Var;
        ((View) b10Var.c).setOnClickListener(new ut(9, y80Var, w80Var));
        if (y80Var.s == 0) {
            viewGroup.addView(b10Var, w7.x5.t(-1, 50, 51, 0, 0, 0, 0));
            b10 b10Var2 = new b10(y80Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                b10Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                b10Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) b10Var2.c).setOnClickListener(new f0(y80Var, 28));
            viewGroup.addView(b10Var2, w7.x5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(b10Var, w7.x5.a(50.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
        }
        y80Var.y(chat, false);
        if (n2Var == null) {
            y80Var.show();
        } else if (n2Var.getParentActivity() != null) {
            n2Var.showDialog(y80Var);
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

    public final void y(TLRPC.Chat chat, boolean z10) {
        b10 b10Var = this.c;
        if (this.s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                b10Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                b10Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            b10Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            b10Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, chat2 != null ? chat2.title : ""), z10);
        }
    }
}
