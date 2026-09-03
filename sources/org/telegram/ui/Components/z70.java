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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class z70 extends org.telegram.ui.ActionBar.g3 {
    public static ArrayList D;
    public static long E;
    public static long F;
    public static int G;
    public boolean B;
    public x70 C;
    public Drawable b;
    public l00 c;
    public v70 d;
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

    public static /* synthetic */ void m(z70 z70Var, x70 x70Var) {
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(z70Var.currentAccount).getInputPeer(MessageObject.getPeerId(z70Var.v));
        if (z70Var.s != 2) {
            z70Var.x = inputPeer;
        } else if (z70Var.v != z70Var.w) {
            x70Var.a(inputPeer, z70Var.h.size() > 1, false, false);
        }
        z70Var.dismiss();
    }

    public static /* synthetic */ void n(z70 z70Var) {
        z70Var.x = MessagesController.getInstance(z70Var.currentAccount).getInputPeer(MessageObject.getPeerId(z70Var.v));
        z70Var.y = true;
        z70Var.dismiss();
    }

    public static void o(z70 z70Var) {
        v70 v70Var = z70Var.d;
        if (z70Var.s == 0) {
            return;
        }
        if (v70Var.getChildCount() <= 0) {
            int paddingTop = v70Var.getPaddingTop();
            z70Var.r = paddingTop;
            v70Var.setTopGlowOffset(paddingTop);
            z70Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = v70Var.getChildAt(0);
        dl0 dl0Var = (dl0) v70Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(9.0f);
        if (top > 0 && dl0Var != null && dl0Var.b() == 0) {
            i10 = top;
        }
        if (z70Var.r != i10) {
            z70Var.e.setTranslationY(AndroidUtilities.dp(19.0f) + top);
            z70Var.f.setTranslationY(AndroidUtilities.dp(56.0f) + top);
            z70Var.r = i10;
            v70Var.setTopGlowOffset(i10);
            z70Var.containerView.invalidate();
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
        d2Var.setOnCancelListener(new r70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new lh.v(d2Var, j10, accountInstance, booleanCallback)), 1));
        try {
            d2Var.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void u(Context context, long j10, AccountInstance accountInstance, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer, x70 x70Var) {
        if (context != null) {
            if (G == accountInstance.getCurrentAccount() && F == j10 && D != null && SystemClock.elapsedRealtime() - E < 300000) {
                if (D.size() != 1 || i10 == 0) {
                    v(context, j10, D, p2Var, i10, peer, x70Var);
                    return;
                } else {
                    x70Var.a(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId((TLRPC.Peer) D.get(0))), false, false, false);
                    return;
                }
            }
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = accountInstance.getMessagesController().getInputPeer(j10);
            d2Var.setOnCancelListener(new r70(accountInstance, accountInstance.getConnectionsManager().sendRequest(getgroupcalljoinas, new q70(d2Var, accountInstance, x70Var, j10, context, p2Var, i10, peer)), 0));
            try {
                d2Var.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(Context context, long j10, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.Peer peer, x70 x70Var) {
        int i11;
        ViewGroup viewGroup;
        boolean z4;
        if (i10 == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            Dialog drVar = new dr(p2Var, arrayList, j10, x70Var);
            if (p2Var.getParentActivity() != null) {
                p2Var.showDialog(drVar);
                return;
            } else {
                drVar.show();
                return;
            }
        }
        z70 z70Var = new z70(context, false);
        z70Var.setApplyBottomPadding(false);
        ArrayList arrayList2 = new ArrayList(arrayList);
        z70Var.h = arrayList2;
        z70Var.C = x70Var;
        z70Var.s = i10;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        z70Var.b = mutate;
        if (i10 == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) z70Var.h.get(i12);
                    if (MessageObject.getPeerId(peer2) == selfId) {
                        z70Var.w = peer2;
                        z70Var.v = peer2;
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
                    TLRPC.Peer peer3 = (TLRPC.Peer) z70Var.h.get(i13);
                    if (MessageObject.getPeerId(peer3) == peerId) {
                        z70Var.w = peer3;
                        z70Var.v = peer3;
                        break;
                    }
                    i13++;
                }
            } else {
                z70Var.v = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = z70Var.b;
            i11 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.fg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        } else {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false);
            mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            z70Var.v = (TLRPC.Peer) arrayList2.get(0);
            i11 = w02;
        }
        z70Var.fixNavigationBar(i11);
        if (z70Var.s == 0) {
            t70 t70Var = new t70(z70Var, context);
            t70Var.setOrientation(1);
            NestedScrollView nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(t70Var);
            z70Var.setCustomView(nestedScrollView);
            viewGroup = t70Var;
        } else {
            u70 u70Var = new u70(z70Var, context);
            z70Var.containerView = u70Var;
            u70Var.setWillNotDraw(false);
            ViewGroup viewGroup2 = z70Var.containerView;
            int i14 = z70Var.backgroundPaddingLeft;
            viewGroup2.setPadding(i14, 0, i14, 0);
            viewGroup = u70Var;
        }
        TLRPC.Chat chat = MessagesController.getInstance(z70Var.currentAccount).getChat(Long.valueOf(-j10));
        v70 v70Var = new v70(z70Var, context);
        z70Var.d = v70Var;
        z70Var.getContext();
        v70Var.setLayoutManager(new f2.i0(z70Var.s == 0 ? 0 : 1, false));
        v70Var.setAdapter(new y70(z70Var, context));
        v70Var.setVerticalScrollBarEnabled(false);
        v70Var.setClipToPadding(false);
        v70Var.setEnabled(true);
        v70Var.setSelectorDrawableColor(0);
        v70Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        v70Var.setOnScrollListener(new w70(z70Var));
        v70Var.setOnItemClickListener(new gg.v0(12, z70Var, chat));
        if (i10 != 0) {
            viewGroup.addView(v70Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            v70Var.setSelectorDrawableColor(0);
            v70Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        }
        if (i10 == 0) {
            jj0 jj0Var = new jj0(context);
            jj0Var.setAutoRepeat(true);
            jj0Var.f(R.raw.utyan_schedule, 120, 120, null);
            jj0Var.d();
            viewGroup.addView(jj0Var, k7.b6.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        z70Var.e = textView;
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
        TextView textView2 = new TextView(z70Var.getContext());
        z70Var.f = textView2;
        if (i10 == 2) {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.og, false));
        } else {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.r5, false));
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = z70Var.h.size();
        for (int i15 = 0; i15 < size3; i15++) {
            long peerId2 = MessageObject.getPeerId((TLRPC.Peer) z70Var.h.get(i15));
            if (peerId2 < 0) {
                TLRPC.Chat chat2 = MessagesController.getInstance(z70Var.currentAccount).getChat(Long.valueOf(-peerId2));
                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        z70Var.f.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        z70Var.f.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k5, false));
        if (i10 == 0) {
            StringBuilder sb = new StringBuilder();
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                sb.append(LocaleController.getString(R.string.VoipGroupStart2));
            } else {
                sb.append(LocaleController.getString(R.string.VoipChannelStart2));
            }
            if (z70Var.h.size() > 1) {
                sb.append("\n\n");
                sb.append(LocaleController.getString(R.string.VoipChatDisplayedAs));
            } else {
                z70Var.d.setVisibility(8);
            }
            z70Var.f.setText(sb);
            z70Var.f.setGravity(49);
            viewGroup.addView(z70Var.f, k7.b6.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            if (z4) {
                z70Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfoGroup));
            } else {
                z70Var.f.setText(LocaleController.getString(R.string.VoipGroupStartAsInfo));
            }
            z70Var.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            viewGroup.addView(z70Var.f, k7.b6.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i10 == 0) {
            viewGroup.addView(z70Var.d, k7.b6.t(z70Var.h.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        l00 l00Var = new l00(z70Var, context, false);
        z70Var.c = l00Var;
        ((View) l00Var.c).setOnClickListener(new w2(24, z70Var, x70Var));
        if (z70Var.s == 0) {
            viewGroup.addView(l00Var, k7.b6.t(-1, 50, 51, 0, 0, 0, 0));
            l00 l00Var2 = new l00(z70Var, context, true);
            if (ChatObject.isChannelOrGiga(chat)) {
                l00Var2.a(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), false);
            } else {
                l00Var2.a(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), false);
            }
            ((View) l00Var2.c).setOnClickListener(new g0(z70Var, 29));
            viewGroup.addView(l00Var2, k7.b6.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            viewGroup.addView(l00Var, k7.b6.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        z70Var.w(chat, false);
        if (p2Var == null) {
            z70Var.show();
        } else if (p2Var.getParentActivity() != null) {
            p2Var.showDialog(z70Var);
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
        l00 l00Var = this.c;
        if (this.s == 0) {
            if (ChatObject.isChannelOrGiga(chat)) {
                l00Var.a(LocaleController.formatString("VoipChannelStartVoiceChat", R.string.VoipChannelStartVoiceChat, new Object[0]), z4);
                return;
            } else {
                l00Var.a(LocaleController.formatString("VoipGroupStartVoiceChat", R.string.VoipGroupStartVoiceChat, new Object[0]), z4);
                return;
            }
        }
        long peerId = MessageObject.getPeerId(this.v);
        if (DialogObject.isUserDialog(peerId)) {
            l00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, UserObject.getFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)))), z4);
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerId));
            l00Var.a(LocaleController.formatString("VoipGroupContinueAs", R.string.VoipGroupContinueAs, chat2 != null ? chat2.title : ""), z4);
        }
    }
}
