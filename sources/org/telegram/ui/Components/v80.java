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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class v80 extends org.telegram.ui.ActionBar.e3 {
    public static ArrayList G;
    public static long H;
    public static long I;
    public static int J;
    public boolean E;
    public t80 F;
    public Drawable b;
    public x00 c;
    public r80 d;
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

    public static /* synthetic */ void n(v80 v80Var, t80 t80Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(v80Var.currentAccount).getInputPeer(MessageObject.getPeerId(v80Var.v));
        if (v80Var.s != 2) {
            v80Var.x = inputPeer;
        } else if (v80Var.v != v80Var.w) {
            t80Var.a(inputPeer, v80Var.h.size() > 1, false, false);
        }
        v80Var.dismiss();
    }

    public static /* synthetic */ void o(v80 v80Var) {
        v80Var.x = MessagesController.getInstance(v80Var.currentAccount).getInputPeer(MessageObject.getPeerId(v80Var.v));
        v80Var.y = true;
        v80Var.dismiss();
    }

    public static void q(v80 v80Var) {
        r80 r80Var = v80Var.d;
        if (v80Var.s == 0) {
            return;
        }
        if (r80Var.getChildCount() <= 0) {
            int paddingTop = r80Var.getPaddingTop();
            v80Var.r = paddingTop;
            r80Var.setTopGlowOffset(paddingTop);
            v80Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = r80Var.getChildAt(0);
        wl0 wl0Var = (wl0) r80Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && wl0Var != null && wl0Var.b() == 0) {
            i10 = top;
        }
        if (v80Var.r != i10) {
            v80Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            v80Var.f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            v80Var.r = i10;
            r80Var.setTopGlowOffset(i10);
            v80Var.containerView.invalidate();
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
        a2Var.setOnCancelListener(new n80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new o80(a2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            a2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void w(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer, t80 t80Var) {
        if (context != null) {
            if (J == accountInstance.getCurrentAccount() && I == j10 && G != null && SystemClock.elapsedRealtime() - H < 300000) {
                if (G.size() != 1 || i10 == 0) {
                    x(context, j10, G, m2Var, i10, peer, t80Var);
                    return;
                } else {
                    t80Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) G.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            a2Var.setOnCancelListener(new n80(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new m80(a2Var, accountInstance, t80Var, j10, context, m2Var, i10, peer)), 0));
            try {
                a2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void x(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.Peer peer, t80 t80Var) {
        int i11;
        ViewGroup viewGroup;
        boolean z10;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog urVar = new ur(m2Var, arrayList, j10, t80Var);
            if (m2Var.getParentActivity() != null) {
                m2Var.showDialog(urVar);
                return;
            } else {
                urVar.show();
                return;
            }
        }
        v80 v80Var = new v80(context, false);
        v80Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        v80Var.h = arrayList2;
        v80Var.F = t80Var;
        v80Var.s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        v80Var.b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) v80Var.h.get(i12);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        v80Var.w = peer2;
                        v80Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) v80Var.h.get(i13);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        v80Var.w = peer3;
                        v80Var.v = peer3;
                        break;
                    }
                    i13++;
                }
            } else {
                v80Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = v80Var.b;
            i11 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            v80Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = x02;
        }
        v80Var.fixNavigationBar(i11);
        if (v80Var.s == 0) {
            p80 p80Var = new p80(v80Var, context);
            p80Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(p80Var);
            v80Var.setCustomView(nestedScrollView);
            viewGroup = p80Var;
        } else {
            q80 q80Var = new q80(v80Var, context);
            v80Var.containerView = q80Var;
            q80Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = v80Var.containerView;
            int i14 = v80Var.backgroundPaddingLeft;
            viewGroup2.setPadding(i14, 0, i14, 0);
            viewGroup = q80Var;
        }
        TLRPC.Chat chat = MessagesController.getInstance(v80Var.currentAccount).getChat(Long.valueOf(-j10));
        r80 r80Var = new r80(v80Var, context);
        v80Var.d = r80Var;
        v80Var.getContext();
        r80Var.setLayoutManager(new s4.b0(v80Var.s == 0 ? 0 : 1, false));
        r80Var.setAdapter(new u80(v80Var, context));
        r80Var.setVerticalScrollBarEnabled(false);
        r80Var.setClipToPadding(false);
        r80Var.setEnabled(true);
        r80Var.setSelectorDrawableColor(0);
        r80Var.setGlowColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.A5, false));
        r80Var.setOnScrollListener(new s80(v80Var));
        r80Var.setOnItemClickListener(new bi.z5(11, v80Var, chat));
        if (i10 != 0) {
            viewGroup.addView(r80Var, w7.z5.a(-1.0f, 0.0f, 100.0f, 0.0f, 80.0f, -1, 51));
        } else {
            r80Var.setSelectorDrawableColor(0);
            r80Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            bk0 bk0Var = new bk0(context);
            bk0Var.setAutoRepeat(true);
            bk0Var.f(R.raw.utyan_schedule, 120, 120, null);
            bk0Var.d();
            viewGroup.addView(bk0Var, w7.z5.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        v80Var.e = textView;
        org.telegram.messenger.sk.k(20.0f, 1, textView);
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
        TextView textView2 = new TextView(v80Var.getContext());
        v80Var.f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = v80Var.h.size();
        for (int i15 = 0; i15 < size3; i15++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) v80Var.h.get(i15));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(v80Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        v80Var.f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        v80Var.f.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.k5, false));
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb2.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb2.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (v80Var.h.size() > 1) {
                sb2.append("\n\n");
                sb2.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                v80Var.d.setVisibility(8);
            }
            v80Var.f.setText(sb2);
            v80Var.f.setGravity(49);
            viewGroup.addView(v80Var.f, w7.z5.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z10) {
                v80Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                v80Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            v80Var.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(v80Var.f, w7.z5.a(-2.0f, 23.0f, 0.0f, 23.0f, 5.0f, -2, 51));
        }
        if (i10 == 0) {
            viewGroup.addView(v80Var.d, w7.z5.t(v80Var.h.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        x00 x00Var = new x00(v80Var, context, false);
        v80Var.c = x00Var;
        ((View) x00Var.c).setOnClickListener(new rt(9, v80Var, t80Var));
        if (v80Var.s == 0) {
            viewGroup.addView(x00Var, w7.z5.t(-1, 50, 51, 0, 0, 0, 0));
            x00 x00Var2 = new x00(v80Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                x00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                x00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) x00Var2.c).setOnClickListener(new f0(v80Var, 28));
            viewGroup.addView(x00Var2, w7.z5.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(x00Var, w7.z5.a(50.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
        }
        v80Var.y(chat, false);
        if (m2Var == null) {
            v80Var.show();
        } else if (m2Var.getParentActivity() != null) {
            m2Var.showDialog(v80Var);
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
