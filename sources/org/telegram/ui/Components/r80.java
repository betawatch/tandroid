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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class r80 extends org.telegram.ui.ActionBar.f3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public p80 F;
    public Drawable b;
    public t00 c;
    public n80 d;
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

    public static /* synthetic */ void n(r80 r80Var, p80 p80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(r80Var.currentAccount).getInputPeer(MessageObject.getPeerId(r80Var.v));
        if (r80Var.s != 2) {
            r80Var.x = inputPeer;
        } else if (r80Var.v != r80Var.w) {
            p80Var.a(inputPeer, r80Var.h.size() > 1, false, false);
        }
        r80Var.dismiss();
    }

    public static /* synthetic */ void o(r80 r80Var) {
        r80Var.x = MessagesController.getInstance(r80Var.currentAccount).getInputPeer(MessageObject.getPeerId(r80Var.v));
        r80Var.y = true;
        r80Var.dismiss();
    }

    public static void p(r80 r80Var) {
        n80 n80Var = r80Var.d;
        if (r80Var.s == 0) {
            return;
        }
        if (n80Var.getChildCount() <= 0) {
            int paddingTop = n80Var.getPaddingTop();
            r80Var.r = paddingTop;
            n80Var.setTopGlowOffset(paddingTop);
            r80Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = n80Var.getChildAt(0);
        sl0 sl0Var = (sl0) n80Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && sl0Var != null && sl0Var.b() == 0) {
            i10 = top;
        }
        if (r80Var.r != i10) {
            r80Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            r80Var.f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            r80Var.r = i10;
            n80Var.setTopGlowOffset(i10);
            r80Var.containerView.invalidate();
        }
    }

    public static void v(Activity activity, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        if (J == accountInstance.getCurrentAccount() && I == j10 && G != null && SystemClock.elapsedRealtime() - H < 240000) {
            booleanCallback.run(G.size() == 1);
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(activity, 3, null);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
        b2Var.setOnCancelListener(new k80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new ai.d0(b2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            b2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void w(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, p80 p80Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j10 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() != 1 || i10 == 0) {
                    x(context, j10, G, n2Var, i10, peer, p80Var);
                    return;
                } else {
                    p80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            b2Var.setOnCancelListener(new k80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new j80(b2Var, accountInstance, p80Var, j10, context, n2Var, i10, peer)), 0));
            try {
                b2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void x(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.Peer peer, p80 p80Var) {
        int i11;
        ViewGroup viewGroup;
        boolean z10;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog rrVar = new rr(n2Var, arrayList, j10, p80Var);
            if (n2Var.getParentActivity() != null) {
                n2Var.showDialog(rrVar);
                return;
            } else {
                rrVar.show();
                return;
            }
        }
        r80 r80Var = new r80(context, false);
        r80Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        r80Var.h = arrayList2;
        r80Var.F = p80Var;
        r80Var.s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        r80Var.b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) r80Var.h.get(i12);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        r80Var.w = peer2;
                        r80Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) r80Var.h.get(i13);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        r80Var.w = peer3;
                        r80Var.v = peer3;
                        break;
                    }
                    i13++;
                }
            } else {
                r80Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = r80Var.b;
            i11 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            r80Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = x02;
        }
        r80Var.fixNavigationBar(i11);
        if (r80Var.s == 0) {
            l80 l80Var = new l80(r80Var, context);
            l80Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(l80Var);
            r80Var.setCustomView(nestedScrollView);
            viewGroup = l80Var;
        } else {
            m80 m80Var = new m80(r80Var, context);
            r80Var.containerView = m80Var;
            m80Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = r80Var.containerView;
            int i14 = r80Var.backgroundPaddingLeft;
            viewGroup2.setPadding(i14, 0, i14, 0);
            viewGroup = m80Var;
        }
        TLRPC.Chat chat = MessagesController.getInstance(r80Var.currentAccount).getChat(Long.valueOf(-j10));
        n80 n80Var = new n80(r80Var, context);
        r80Var.d = n80Var;
        r80Var.getContext();
        n80Var.setLayoutManager(new s4.b0(r80Var.s == 0 ? 0 : 1, false));
        n80Var.setAdapter(new q80(r80Var, context));
        n80Var.setVerticalScrollBarEnabled(false);
        n80Var.setClipToPadding(false);
        n80Var.setEnabled(true);
        n80Var.setSelectorDrawableColor(0);
        n80Var.setGlowColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A5, false));
        n80Var.setOnScrollListener(new o80(r80Var));
        n80Var.setOnItemClickListener(new ci.y4(11, r80Var, chat));
        if (i10 != 0) {
            viewGroup.addView(n80Var, w7.z5.a(-1.0f, 0.0f, 100.0f, 0.0f, 80.0f, -1, 51));
        } else {
            n80Var.setSelectorDrawableColor(0);
            n80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            xj0 xj0Var = new xj0(context);
            xj0Var.setAutoRepeat(true);
            xj0Var.f(R.raw.utyan_schedule, 120, 120, null);
            xj0Var.d();
            viewGroup.addView(xj0Var, w7.z5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        r80Var.e = textView;
        org.telegram.messenger.kk.k(20.0f, 1, textView);
        if (i10 == 2) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.ng, false));
        } else {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.j5, false));
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
            viewGroup.addView(textView, w7.z5.a(-2.0f, 23.0f, 8.0f, 23.0f, 0.0f, -2, 51));
        }
        TextView textView2 = new TextView(r80Var.getContext());
        r80Var.f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = r80Var.h.size();
        for (int i15 = 0; i15 < size3; i15++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) r80Var.h.get(i15));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(r80Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        r80Var.f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        r80Var.f.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.k5, false));
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (r80Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                r80Var.d.setVisibility(8);
            }
            r80Var.f.setText(sb2);
            r80Var.f.setGravity(49);
            viewGroup.addView(r80Var.f, w7.z5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                r80Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                r80Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            r80Var.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(r80Var.f, w7.z5.a(-2.0f, 23.0f, 0.0f, 23.0f, 5.0f, -2, 51));
        }
        if (i10 == 0) {
            viewGroup.addView(r80Var.d, w7.z5.t(r80Var.h.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        t00 t00Var = new t00(r80Var, context, false);
        r80Var.c = t00Var;
        ((View) t00Var.c).setOnClickListener(new ca(19, r80Var, p80Var));
        if (r80Var.s == 0) {
            viewGroup.addView(t00Var, w7.z5.t(-1, 50, 51, 0, 0, 0, 0));
            t00 t00Var2 = new t00(r80Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                t00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                t00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) t00Var2.c).setOnClickListener(new f0(r80Var, 28));
            viewGroup.addView(t00Var2, w7.z5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(t00Var, w7.z5.a(50.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
        }
        r80Var.y(chat, false);
        if (n2Var == null) {
            r80Var.show();
        } else if (n2Var.getParentActivity() != null) {
            n2Var.showDialog(r80Var);
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
        t00 t00Var = this.c;
        if (this.s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                t00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z10);
                return;
            } else {
                t00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z10);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            t00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z10);
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            t00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, chat2 != null ? chat2.title : ""), z10);
        }
    }
}
